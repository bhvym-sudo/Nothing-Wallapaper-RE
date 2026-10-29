package com.nothing.cardwidget.utils;

import F8.AbstractC0816i;
import F8.InterfaceC0846x0;
import O5.g;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import com.nothing.cardwidget.IRemoteService;
import com.nothing.cardwidget.IRemoteServiceCallback;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Supplier;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.q;
import p079h8.r;

/* JADX INFO: loaded from: classes2.dex */
public final class AsyncServiceBinder {
    private static final String TAG = "AsyncServiceBinder";
    private IBindPolicy bindPolicy;
    private CancelAbleBindTask bindServiceTask;
    private final Context context;
    private final AsyncServiceBinder$deathRecipient$1 deathRecipient;
    private final AtomicBoolean isBound;
    private final Handler mainHandler;
    private CancelAbleBindTask releaseAndBindTask;
    private final RemoteServiceCallback remoteCallback;
    private volatile IRemoteService remoteService;
    private Intent remoteServiceIntent;
    private final RetryConnectTask retryTask;
    private final AsyncServiceBinder$serviceConnection$1 serviceConnection;
    private IServiceBindListener serviceListener;
    private final AtomicLong taskTimeMark;
    private CancelAbleBindTask unBindServiceTask;
    public static final Companion Companion = new Companion(null);
    private static final Object TASK_LOCK = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    final class CancelAbleBindTask {
        private final long markTime;
        private InterfaceC0846x0 taskJob;

        public CancelAbleBindTask(long j9) {
            this.markTime = j9;
        }

        public final void begin(Supplier<A> task) {
            n.h(task, "task");
            this.taskJob = AbstractC0816i.d(g.j(), null, null, new AsyncServiceBinder$CancelAbleBindTask$begin$1(this, AsyncServiceBinder.this, task, null), 3, null);
        }

        public final void cancel() {
            InterfaceC0846x0 interfaceC0846x0 = this.taskJob;
            if (interfaceC0846x0 != null) {
                InterfaceC0846x0.a.a(interfaceC0846x0, null, 1, null);
            }
        }

        public final long getMarkTime() {
            return this.markTime;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1457h abstractC1457h) {
            this();
        }

        private Companion() {
        }
    }

    public interface IBindPolicy {
        public static final Companion Companion = Companion.$$INSTANCE;

        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            private static final long RETRY_INTERVAL = 2000;
            private static final int RETRY_LIMIT_COUNT = 3;

            private Companion() {
            }
        }

        public static final class DefaultImpls {
            public static int getBindFlags(IBindPolicy iBindPolicy) {
                return 1;
            }

            public static int getReBindLimitCount(IBindPolicy iBindPolicy) {
                return 3;
            }

            public static long getRebindInterval(IBindPolicy iBindPolicy) {
                return 2000L;
            }

            public static boolean isAutoReBind(IBindPolicy iBindPolicy) {
                return true;
            }
        }

        int getBindFlags();

        int getReBindLimitCount();

        long getRebindInterval();

        boolean isAutoReBind();
    }

    public interface IServiceBindListener extends IRemoteServiceCallback {

        public static final class DefaultImpls {
            public static IBinder asBinder(IServiceBindListener iServiceBindListener) {
                return null;
            }
        }

        @Override // android.os.IInterface
        IBinder asBinder();

        void onServiceBind(IRemoteService iRemoteService);

        void onServiceUnbind();
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class RemoteServiceCallback extends IRemoteServiceCallback.Stub {
        private final WeakReference<AsyncServiceBinder> weakReference;

        public RemoteServiceCallback(AsyncServiceBinder serviceBinder) {
            n.h(serviceBinder, "serviceBinder");
            this.weakReference = new WeakReference<>(serviceBinder);
        }

        @Override // com.nothing.cardwidget.IRemoteServiceCallback
        public void onChanged(Bundle bundle) {
            AsyncServiceBinder asyncServiceBinder = this.weakReference.get();
            if (asyncServiceBinder != null) {
                asyncServiceBinder.receiveRemoteData(bundle);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class RetryConnectTask implements Runnable {
        private final Handler callbackHandler;
        private int retryCount;
        private final WeakReference<AsyncServiceBinder> weakReference;

        public RetryConnectTask(AsyncServiceBinder serviceBinder, Handler callbackHandler) {
            n.h(serviceBinder, "serviceBinder");
            n.h(callbackHandler, "callbackHandler");
            this.callbackHandler = callbackHandler;
            this.weakReference = new WeakReference<>(serviceBinder);
        }

        public final synchronized void beginRetry() {
            this.callbackHandler.removeCallbacks(this);
            this.callbackHandler.post(this);
        }

        public final Handler getCallbackHandler() {
            return this.callbackHandler;
        }

        public final void release() {
            stopRetry();
            this.weakReference.clear();
        }

        public final synchronized void resetRetryCount() {
            this.retryCount = 0;
        }

        @Override // java.lang.Runnable
        public void run() {
            AsyncServiceBinder asyncServiceBinder = this.weakReference.get();
            if (asyncServiceBinder != null) {
                int i10 = this.retryCount + 1;
                this.retryCount = i10;
                if (i10 > asyncServiceBinder.bindPolicy.getReBindLimitCount()) {
                    Log.e(AsyncServiceBinder.TAG, "Always connect service fail, Retry count = " + this.retryCount + ", Check current bindClass.");
                    return;
                }
                if (asyncServiceBinder.remoteService != null) {
                    Log.i(AsyncServiceBinder.TAG, "Service connected, quit retry, retryCount = " + this.retryCount);
                    return;
                }
                this.callbackHandler.postDelayed(this, asyncServiceBinder.bindPolicy.getRebindInterval());
                asyncServiceBinder.releaseAndRebindService();
                Log.i(AsyncServiceBinder.TAG, "Waiting service connected timeout, begin connect service again. Retry count = " + this.retryCount);
            }
        }

        public final synchronized void stopRetry() {
            this.callbackHandler.removeCallbacks(this);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.nothing.cardwidget.utils.AsyncServiceBinder$deathRecipient$1] */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.nothing.cardwidget.utils.AsyncServiceBinder$serviceConnection$1] */
    public AsyncServiceBinder(Context context, IServiceBindListener iServiceBindListener) {
        n.h(context, "context");
        this.context = context;
        this.serviceListener = iServiceBindListener;
        this.deathRecipient = new IBinder.DeathRecipient(this) { // from class: com.nothing.cardwidget.utils.AsyncServiceBinder$deathRecipient$1
            private final WeakReference<AsyncServiceBinder> weakSelf;

            {
                this.weakSelf = new WeakReference<>(this);
            }

            @Override // android.os.IBinder.DeathRecipient
            public void binderDied() {
                AsyncServiceBinder asyncServiceBinder = this.weakSelf.get();
                if (asyncServiceBinder != null) {
                    asyncServiceBinder.retryConnectService();
                }
            }
        };
        Handler handler = new Handler(Looper.getMainLooper());
        this.mainHandler = handler;
        this.retryTask = new RetryConnectTask(this, handler);
        this.remoteCallback = new RemoteServiceCallback(this);
        this.isBound = new AtomicBoolean(false);
        this.taskTimeMark = new AtomicLong();
        this.bindPolicy = new IBindPolicy() { // from class: com.nothing.cardwidget.utils.AsyncServiceBinder$bindPolicy$1
            @Override // com.nothing.cardwidget.utils.AsyncServiceBinder.IBindPolicy
            public int getBindFlags() {
                return AsyncServiceBinder.IBindPolicy.DefaultImpls.getBindFlags(this);
            }

            @Override // com.nothing.cardwidget.utils.AsyncServiceBinder.IBindPolicy
            public int getReBindLimitCount() {
                return AsyncServiceBinder.IBindPolicy.DefaultImpls.getReBindLimitCount(this);
            }

            @Override // com.nothing.cardwidget.utils.AsyncServiceBinder.IBindPolicy
            public long getRebindInterval() {
                return AsyncServiceBinder.IBindPolicy.DefaultImpls.getRebindInterval(this);
            }

            @Override // com.nothing.cardwidget.utils.AsyncServiceBinder.IBindPolicy
            public boolean isAutoReBind() {
                return AsyncServiceBinder.IBindPolicy.DefaultImpls.isAutoReBind(this);
            }
        };
        this.serviceConnection = new ServiceConnection() { // from class: com.nothing.cardwidget.utils.AsyncServiceBinder$serviceConnection$1
            @Override // android.content.ServiceConnection
            public void onBindingDied(ComponentName componentName) {
                this.this$0.onServiceLose();
                Log.i("AsyncServiceBinder", "on remote service view bind failure because of binding died.");
            }

            @Override // android.content.ServiceConnection
            public void onNullBinding(ComponentName componentName) {
                this.this$0.onServiceLose();
                Log.i("AsyncServiceBinder", "on remote service view bind failure because of null binding.");
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName name, IBinder service) {
                Object objB;
                n.h(name, "name");
                n.h(service, "service");
                this.this$0.retryTask.stopRetry();
                AsyncServiceBinder asyncServiceBinder = this.this$0;
                try {
                    q.a aVar = q.f21862r;
                    service.linkToDeath(asyncServiceBinder.deathRecipient, 0);
                    objB = q.b(A.f21846a);
                } catch (Throwable th) {
                    q.a aVar2 = q.f21862r;
                    objB = q.b(r.a(th));
                }
                AsyncServiceBinder asyncServiceBinder2 = this.this$0;
                Throwable thD = q.d(objB);
                if (thD != null) {
                    asyncServiceBinder2.retryConnectService();
                    Log.e("AsyncServiceBinder", "Lint to remote service to death error.", thD);
                    return;
                }
                this.this$0.remoteService = IRemoteService.Stub.asInterface(service);
                IRemoteService iRemoteService = this.this$0.remoteService;
                if (iRemoteService != null) {
                    AsyncServiceBinder asyncServiceBinder3 = this.this$0;
                    AsyncServiceBinder.IServiceBindListener serviceListener = asyncServiceBinder3.getServiceListener();
                    if (serviceListener != null) {
                        serviceListener.onServiceBind(iRemoteService);
                    }
                    iRemoteService.startListening(asyncServiceBinder3.remoteCallback);
                } else {
                    this.this$0.retryConnectService();
                }
                Log.i("AsyncServiceBinder", "on remote service view connected, remoteService = " + this.this$0.remoteService);
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                this.this$0.onServiceLose();
                Log.i("AsyncServiceBinder", "on remote service view disconnected.");
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean bindService() {
        kotlin.jvm.internal.A a10 = new kotlin.jvm.internal.A();
        try {
            q.a aVar = q.f21862r;
            Intent intent = this.remoteServiceIntent;
            boolean z9 = false;
            if (intent != null && this.context.bindService(intent, this.serviceConnection, this.bindPolicy.getBindFlags())) {
                z9 = true;
            }
            a10.f22775q = z9;
            q.b(A.f21846a);
        } catch (Throwable th) {
            q.a aVar2 = q.f21862r;
            q.b(r.a(th));
        }
        this.isBound.set(a10.f22775q);
        return a10.f22775q;
    }

    private final void bindServiceWithRetry() {
        bindService();
        if (this.isBound.get()) {
            return;
        }
        this.retryTask.beginRetry();
    }

    private final void cancelAllBindTasks() {
        CancelAbleBindTask cancelAbleBindTask = this.bindServiceTask;
        if (cancelAbleBindTask != null) {
            cancelAbleBindTask.cancel();
        }
        CancelAbleBindTask cancelAbleBindTask2 = this.unBindServiceTask;
        if (cancelAbleBindTask2 != null) {
            cancelAbleBindTask2.cancel();
        }
        CancelAbleBindTask cancelAbleBindTask3 = this.releaseAndBindTask;
        if (cancelAbleBindTask3 != null) {
            cancelAbleBindTask3.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ A configService$lambda$0$bindServiceWithRetry__proxy(AsyncServiceBinder asyncServiceBinder) {
        asyncServiceBinder.bindServiceWithRetry();
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void innerUnbindService() {
        Object objB;
        IBinder iBinderAsBinder;
        if (this.remoteService != null) {
            try {
                q.a aVar = q.f21862r;
                IRemoteService iRemoteService = this.remoteService;
                q.b(iRemoteService != null ? Boolean.valueOf(iRemoteService.stopListening(this.remoteCallback)) : null);
            } catch (Throwable th) {
                q.a aVar2 = q.f21862r;
                q.b(r.a(th));
            }
            try {
                IRemoteService iRemoteService2 = this.remoteService;
                objB = q.b((iRemoteService2 == null || (iBinderAsBinder = iRemoteService2.asBinder()) == null) ? null : Boolean.valueOf(iBinderAsBinder.unlinkToDeath(this.deathRecipient, 0)));
            } catch (Throwable th2) {
                q.a aVar3 = q.f21862r;
                objB = q.b(r.a(th2));
            }
            Throwable thD = q.d(objB);
            if (thD != null) {
                Log.e(TAG, "unlinkToDeath error: " + thD);
            }
            this.remoteService = null;
        }
        if (this.isBound.get()) {
            this.context.unbindService(this.serviceConnection);
            this.isBound.set(false);
        }
        Log.i(TAG, "innerUnbindService called this = " + hashCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onServiceLose() {
        this.isBound.set(false);
        this.remoteService = null;
        IServiceBindListener iServiceBindListener = this.serviceListener;
        if (iServiceBindListener != null) {
            iServiceBindListener.onServiceUnbind();
        }
        retryConnectService();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void receiveRemoteData(final Bundle bundle) {
        this.mainHandler.post(new Runnable() { // from class: com.nothing.cardwidget.utils.a
            @Override // java.lang.Runnable
            public final void run() {
                AsyncServiceBinder.receiveRemoteData$lambda$8(this.f18093q, bundle);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void receiveRemoteData$lambda$8(AsyncServiceBinder this$0, Bundle bundle) {
        n.h(this$0, "this$0");
        IServiceBindListener iServiceBindListener = this$0.serviceListener;
        if (iServiceBindListener != null) {
            iServiceBindListener.onChanged(bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void releaseAndRebindService() {
        this.taskTimeMark.set(System.currentTimeMillis());
        cancelAllBindTasks();
        CancelAbleBindTask cancelAbleBindTask = new CancelAbleBindTask(this.taskTimeMark.get());
        cancelAbleBindTask.begin(new Supplier<A>() { // from class: com.nothing.cardwidget.utils.AsyncServiceBinder$releaseAndRebindService$1$1
            @Override // java.util.function.Supplier
            public /* bridge */ /* synthetic */ A get() {
                get2();
                return A.f21846a;
            }

            @Override // java.util.function.Supplier
            /* JADX INFO: renamed from: get, reason: avoid collision after fix types in other method */
            public void get2() {
                Log.i("AsyncServiceBinder", "releaseAndRebindService begin.");
                this.this$0.innerUnbindService();
                this.this$0.bindService();
            }
        });
        this.releaseAndBindTask = cancelAbleBindTask;
        Intent intent = this.remoteServiceIntent;
        Log.i(TAG, "Release and bind service for = " + (intent != null ? intent.getAction() : null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ A releaseService$lambda$1$innerUnbindService__proxy(AsyncServiceBinder asyncServiceBinder) {
        asyncServiceBinder.innerUnbindService();
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void retryConnectService() {
        if (this.bindPolicy.isAutoReBind()) {
            this.retryTask.beginRetry();
            this.retryTask.resetRetryCount();
        }
    }

    public final void configService(Intent intent) {
        n.h(intent, "intent");
        if (this.isBound.get()) {
            return;
        }
        this.remoteServiceIntent = intent;
        this.taskTimeMark.set(System.currentTimeMillis());
        cancelAllBindTasks();
        CancelAbleBindTask cancelAbleBindTask = new CancelAbleBindTask(this.taskTimeMark.get());
        cancelAbleBindTask.begin(new Supplier() { // from class: com.nothing.cardwidget.utils.c
            @Override // java.util.function.Supplier
            public final Object get() {
                return AsyncServiceBinder.configService$lambda$0$bindServiceWithRetry__proxy(this.f18096a);
            }
        });
        this.bindServiceTask = cancelAbleBindTask;
        Log.i(TAG, "Config remote service with intent = " + intent.getAction() + " this = " + hashCode());
    }

    public final Context getContext() {
        return this.context;
    }

    public final IServiceBindListener getServiceListener() {
        return this.serviceListener;
    }

    public final boolean isServiceAlive() {
        IBinder iBinderAsBinder;
        IRemoteService iRemoteService = this.remoteService;
        return (iRemoteService == null || (iBinderAsBinder = iRemoteService.asBinder()) == null || !iBinderAsBinder.isBinderAlive()) ? false : true;
    }

    public final boolean makeSureAlive() {
        boolean z9 = (this.remoteServiceIntent == null || isServiceAlive()) ? false : true;
        if (z9) {
            releaseAndRebindService();
        }
        return z9;
    }

    public final void releaseService() {
        this.retryTask.release();
        cancelAllBindTasks();
        if (this.isBound.get() || this.remoteService != null) {
            this.taskTimeMark.set(System.currentTimeMillis());
            CancelAbleBindTask cancelAbleBindTask = new CancelAbleBindTask(this.taskTimeMark.get());
            cancelAbleBindTask.begin(new Supplier() { // from class: com.nothing.cardwidget.utils.b
                @Override // java.util.function.Supplier
                public final Object get() {
                    return AsyncServiceBinder.releaseService$lambda$1$innerUnbindService__proxy(this.f18095a);
                }
            });
            this.unBindServiceTask = cancelAbleBindTask;
        }
        Intent intent = this.remoteServiceIntent;
        String action = intent != null ? intent.getAction() : null;
        Log.i(TAG, "Release remote service for = " + action + " this = " + hashCode());
    }

    public final void setBindPolicy(IBindPolicy bindPolicy) {
        n.h(bindPolicy, "bindPolicy");
        this.bindPolicy = bindPolicy;
    }

    public final void setServiceListener(IServiceBindListener iServiceBindListener) {
        this.serviceListener = iServiceBindListener;
    }
}
