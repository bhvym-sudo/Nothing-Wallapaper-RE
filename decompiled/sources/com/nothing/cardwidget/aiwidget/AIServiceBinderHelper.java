package com.nothing.cardwidget.aiwidget;

import F8.AbstractC0816i;
import F8.InterfaceC0846x0;
import O5.g;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Supplier;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.q;
import p079h8.r;

/* JADX INFO: loaded from: classes.dex */
public final class AIServiceBinderHelper {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "AiServiceBinderHelper";
    private volatile IAIWidgetService aiService;
    private final AiWidgetCallback aiWidgetCallback;
    private IBindPolicy bindPolicy;
    private CancelAbleBindTask bindServiceTask;
    private final Context context;
    private final C8.e deathRecipient;
    private final AtomicBoolean isBound;
    private final Handler mainHandler;
    private final O8.a mutex;
    private CancelAbleBindTask releaseAndBindTask;
    private Intent remoteServiceIntent;
    private final RetryConnectTask retryTask;
    private final AIServiceBinderHelper$serviceConnection$1 serviceConnection;
    private IServiceBindListener serviceListener;
    private final AtomicLong taskTimeMark;
    private CancelAbleBindTask unBindServiceTask;

    /* JADX INFO: Access modifiers changed from: private */
    static final class AiWidgetCallback extends IAIWidgetCallBack.Stub {
        private final WeakReference<IServiceBindListener> weakReference;

        public AiWidgetCallback(IServiceBindListener iServiceBindListener) {
            this.weakReference = new WeakReference<>(iServiceBindListener);
        }

        @Override // com.nothing.cardwidget.aiwidget.IAIWidgetCallBack
        public Bundle getLauncherActivityOptions(int i10) {
            IServiceBindListener iServiceBindListener = this.weakReference.get();
            if (iServiceBindListener != null) {
                return iServiceBindListener.getLauncherActivityOptions(i10);
            }
            return null;
        }

        @Override // com.nothing.cardwidget.aiwidget.IAIWidgetCallBack
        public void onMoveGestureEnabled(int i10, boolean z9) {
            IServiceBindListener iServiceBindListener = this.weakReference.get();
            if (iServiceBindListener != null) {
                iServiceBindListener.onMoveGestureEnabled(i10, z9);
            }
        }

        @Override // com.nothing.cardwidget.aiwidget.IAIWidgetCallBack
        public void onReactLoadResult(int i10, String bundleId, int i11) {
            n.h(bundleId, "bundleId");
            Log.i(AIServiceBinderHelper.TAG, "AIServiceBinderHelper onReactLoadResult: binderListener = " + this.weakReference.get());
            IServiceBindListener iServiceBindListener = this.weakReference.get();
            if (iServiceBindListener != null) {
                iServiceBindListener.onReactLoadResult(i10, bundleId, i11);
            }
        }

        @Override // com.nothing.cardwidget.aiwidget.IAIWidgetCallBack
        public void onSurfaceTouchDownEvent(int i10, long j9) {
            IServiceBindListener iServiceBindListener = this.weakReference.get();
            if (iServiceBindListener != null) {
                iServiceBindListener.onSurfaceTouchDownEvent(i10, j9);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class CancelAbleBindTask {
        private final long markTime;
        private InterfaceC0846x0 taskJob;

        public CancelAbleBindTask(long j9) {
            this.markTime = j9;
        }

        public final void begin(Supplier<A> task) {
            n.h(task, "task");
            this.taskJob = AbstractC0816i.d(g.j(), null, null, new AIServiceBinderHelper$CancelAbleBindTask$begin$1(AIServiceBinderHelper.this, this, task, null), 3, null);
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
            private static final int RETRY_LIMIT_COUNT = 5;

            private Companion() {
            }
        }

        public static final class DefaultImpls {
            public static int getBindFlags(IBindPolicy iBindPolicy) {
                return 1;
            }

            public static int getReBindLimitCount(IBindPolicy iBindPolicy) {
                return 5;
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

    public interface IServiceBindListener extends IAIWidgetCallBack {

        public static final class DefaultImpls {
            public static IBinder asBinder(IServiceBindListener iServiceBindListener) {
                return null;
            }
        }

        @Override // android.os.IInterface
        IBinder asBinder();

        void onServiceBind(IAIWidgetService iAIWidgetService);

        void onServiceUnbind();
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class RetryConnectTask implements Runnable {
        private final Handler callbackHandler;
        private int retryCount;
        private final WeakReference<AIServiceBinderHelper> weakReference;

        public RetryConnectTask(AIServiceBinderHelper serviceBinder, Handler callbackHandler) {
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
        }

        public final synchronized void resetRetryCount() {
            this.retryCount = 0;
        }

        @Override // java.lang.Runnable
        public void run() {
            Log.d(AIServiceBinderHelper.TAG, "RetryConnectTask");
            AIServiceBinderHelper aIServiceBinderHelper = this.weakReference.get();
            if (aIServiceBinderHelper != null) {
                int i10 = this.retryCount + 1;
                this.retryCount = i10;
                if (i10 > aIServiceBinderHelper.bindPolicy.getReBindLimitCount()) {
                    Log.e(AIServiceBinderHelper.TAG, "Always connect service fail, Retry count = " + this.retryCount + ", Check current bindClass.");
                    return;
                }
                if (aIServiceBinderHelper.aiService != null) {
                    Log.i(AIServiceBinderHelper.TAG, "Service connected, quit retry, retryCount = " + this.retryCount);
                    return;
                }
                this.callbackHandler.postDelayed(this, aIServiceBinderHelper.bindPolicy.getRebindInterval());
                aIServiceBinderHelper.releaseAndRebindService();
                Log.i(AIServiceBinderHelper.TAG, "Waiting service connected timeout, begin connect service again. Retry count = " + this.retryCount);
            }
        }

        public final synchronized void stopRetry() {
            this.callbackHandler.removeCallbacks(this);
        }
    }

    public AIServiceBinderHelper(Context context, IServiceBindListener iServiceBindListener) {
        n.h(context, "context");
        this.context = context;
        this.serviceListener = iServiceBindListener;
        this.deathRecipient = new AIServiceBinderHelper$deathRecipient$1(this);
        Handler handler = new Handler(Looper.getMainLooper());
        this.mainHandler = handler;
        this.retryTask = new RetryConnectTask(this, handler);
        this.aiWidgetCallback = new AiWidgetCallback(this.serviceListener);
        this.isBound = new AtomicBoolean(false);
        this.taskTimeMark = new AtomicLong(0L);
        this.bindPolicy = new IBindPolicy() { // from class: com.nothing.cardwidget.aiwidget.AIServiceBinderHelper$bindPolicy$1
            @Override // com.nothing.cardwidget.aiwidget.AIServiceBinderHelper.IBindPolicy
            public int getBindFlags() {
                return AIServiceBinderHelper.IBindPolicy.DefaultImpls.getBindFlags(this);
            }

            @Override // com.nothing.cardwidget.aiwidget.AIServiceBinderHelper.IBindPolicy
            public int getReBindLimitCount() {
                return AIServiceBinderHelper.IBindPolicy.DefaultImpls.getReBindLimitCount(this);
            }

            @Override // com.nothing.cardwidget.aiwidget.AIServiceBinderHelper.IBindPolicy
            public long getRebindInterval() {
                return AIServiceBinderHelper.IBindPolicy.DefaultImpls.getRebindInterval(this);
            }

            @Override // com.nothing.cardwidget.aiwidget.AIServiceBinderHelper.IBindPolicy
            public boolean isAutoReBind() {
                return AIServiceBinderHelper.IBindPolicy.DefaultImpls.isAutoReBind(this);
            }
        };
        this.mutex = O8.g.b(false, 1, null);
        this.serviceConnection = new AIServiceBinderHelper$serviceConnection$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean bindService() {
        boolean z9 = false;
        if (this.isBound.get()) {
            return false;
        }
        Log.d(TAG, "bindService");
        kotlin.jvm.internal.A a10 = new kotlin.jvm.internal.A();
        try {
            q.a aVar = q.f21862r;
            Intent intent = this.remoteServiceIntent;
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
        if (!this.isBound.get()) {
            bindService();
        }
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
    public static final /* synthetic */ A configService$lambda$0$bindServiceWithRetry__proxy(AIServiceBinderHelper aIServiceBinderHelper) {
        aIServiceBinderHelper.bindServiceWithRetry();
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void innerUnbindService() {
        Object objB;
        Boolean boolValueOf;
        IBinder iBinderAsBinder;
        Log.i(TAG, "innerUnbindService");
        if (this.aiService != null) {
            try {
                q.a aVar = q.f21862r;
                IAIWidgetService iAIWidgetService = this.aiService;
                q.b(iAIWidgetService != null ? Boolean.valueOf(iAIWidgetService.stopListening(this.aiWidgetCallback)) : null);
            } catch (Throwable th) {
                q.a aVar2 = q.f21862r;
                q.b(r.a(th));
            }
            try {
                IAIWidgetService iAIWidgetService2 = this.aiService;
                if (iAIWidgetService2 == null || (iBinderAsBinder = iAIWidgetService2.asBinder()) == null) {
                    boolValueOf = null;
                } else {
                    final C8.e eVar = this.deathRecipient;
                    boolValueOf = Boolean.valueOf(iBinderAsBinder.unlinkToDeath(new IBinder.DeathRecipient() { // from class: com.nothing.cardwidget.aiwidget.c
                        @Override // android.os.IBinder.DeathRecipient
                        public final void binderDied() {
                            AIServiceBinderHelper.innerUnbindService$lambda$5$lambda$4(eVar);
                        }
                    }, 0));
                }
                objB = q.b(boolValueOf);
            } catch (Throwable th2) {
                q.a aVar3 = q.f21862r;
                objB = q.b(r.a(th2));
            }
            Throwable thD = q.d(objB);
            if (thD != null) {
                Log.e(TAG, "unlinkToDeath error: " + thD);
            }
        }
        if (this.isBound.get()) {
            this.context.unbindService(this.serviceConnection);
            this.isBound.set(false);
            this.aiService = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void innerUnbindService$lambda$5$lambda$4(C8.e tmp0) {
        n.h(tmp0, "$tmp0");
        ((p219v8.a) tmp0).invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onServiceLose() {
        this.isBound.set(false);
        this.aiService = null;
        IServiceBindListener iServiceBindListener = this.serviceListener;
        if (iServiceBindListener != null) {
            iServiceBindListener.onServiceUnbind();
        }
        retryConnectService();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void releaseAndRebindService() {
        cancelAllBindTasks();
        this.taskTimeMark.set(System.nanoTime());
        CancelAbleBindTask cancelAbleBindTask = new CancelAbleBindTask(this.taskTimeMark.get());
        cancelAbleBindTask.begin(new Supplier<A>() { // from class: com.nothing.cardwidget.aiwidget.AIServiceBinderHelper$releaseAndRebindService$1$1
            @Override // java.util.function.Supplier
            public /* bridge */ /* synthetic */ A get() {
                get2();
                return A.f21846a;
            }

            @Override // java.util.function.Supplier
            /* JADX INFO: renamed from: get, reason: avoid collision after fix types in other method */
            public void get2() {
                Log.i("AiServiceBinderHelper", "releaseAndRebindService begin.");
                this.this$0.innerUnbindService();
                this.this$0.bindService();
                Log.i("AiServiceBinderHelper", "releaseAndRebindService end.");
            }
        });
        this.releaseAndBindTask = cancelAbleBindTask;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ A releaseService$lambda$1$innerUnbindService__proxy(AIServiceBinderHelper aIServiceBinderHelper) {
        aIServiceBinderHelper.innerUnbindService();
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void retryConnectService() {
        if (this.bindPolicy.isAutoReBind()) {
            Log.i(TAG, "retryConnectService");
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
        cancelAllBindTasks();
        this.taskTimeMark.set(System.nanoTime());
        CancelAbleBindTask cancelAbleBindTask = new CancelAbleBindTask(this.taskTimeMark.get());
        cancelAbleBindTask.begin(new Supplier() { // from class: com.nothing.cardwidget.aiwidget.b
            @Override // java.util.function.Supplier
            public final Object get() {
                return AIServiceBinderHelper.configService$lambda$0$bindServiceWithRetry__proxy(this.f18017a);
            }
        });
        this.bindServiceTask = cancelAbleBindTask;
        Log.i(TAG, "configService with intent == " + intent.getAction() + " this = " + hashCode());
    }

    public final Context getContext() {
        return this.context;
    }

    public final IServiceBindListener getServiceListener() {
        return this.serviceListener;
    }

    public final boolean isServiceAlive() {
        IBinder iBinderAsBinder;
        IAIWidgetService iAIWidgetService = this.aiService;
        return (iAIWidgetService == null || (iBinderAsBinder = iAIWidgetService.asBinder()) == null || !iBinderAsBinder.isBinderAlive()) ? false : true;
    }

    public final boolean makeSureAlive() {
        boolean z9 = (this.remoteServiceIntent == null || isServiceAlive()) ? false : true;
        if (z9) {
            Log.i(TAG, "isServiceAlive = false, releaseAndRebindService.");
            releaseAndRebindService();
        }
        return z9;
    }

    public final void releaseService() {
        cancelAllBindTasks();
        this.retryTask.release();
        if (this.isBound.get() || this.aiService != null) {
            this.taskTimeMark.set(System.nanoTime());
            CancelAbleBindTask cancelAbleBindTask = new CancelAbleBindTask(this.taskTimeMark.get());
            cancelAbleBindTask.begin(new Supplier() { // from class: com.nothing.cardwidget.aiwidget.a
                @Override // java.util.function.Supplier
                public final Object get() {
                    return AIServiceBinderHelper.releaseService$lambda$1$innerUnbindService__proxy(this.f18016a);
                }
            });
            this.unBindServiceTask = cancelAbleBindTask;
        }
        Intent intent = this.remoteServiceIntent;
        String action = intent != null ? intent.getAction() : null;
        Log.i(TAG, "releaseService action = " + action + " this = " + hashCode());
    }

    public final void setBindPolicy(IBindPolicy bindPolicy) {
        n.h(bindPolicy, "bindPolicy");
        this.bindPolicy = bindPolicy;
    }

    public final void setServiceListener(IServiceBindListener iServiceBindListener) {
        this.serviceListener = iServiceBindListener;
    }
}
