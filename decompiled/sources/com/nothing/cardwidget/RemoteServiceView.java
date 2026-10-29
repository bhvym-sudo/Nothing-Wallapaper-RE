package com.nothing.cardwidget;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.FrameLayout;
import com.nothing.cardwidget.utils.AsyncServiceBinder;
import com.nothing.commBase.deferred.DeferringController;
import com.nothing.commBase.deferred.IDeferring;
import com.nothing.commBase.deferred.IDeferringObserver;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.q;
import p079h8.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class RemoteServiceView extends FrameLayout implements IDeferringObserver, AsyncServiceBinder.IServiceBindListener {
    public static final Companion Companion = new Companion(null);
    private static final long RELEASE_SERVICE_DELAY = 100;
    public static final String TAG = "RemoteServiceView";
    private final DeferringController deferringController;
    private Map<Bundle, B0.a> pendingCallTasks;
    private final Runnable releaseAction;
    private IRemoteService remoteService;
    private final AsyncServiceBinder serviceBindHelper;
    private Intent serviceIntent;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1457h abstractC1457h) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RemoteServiceView(Context context) {
        this(context, null, 0, 0, 14, null);
        n.h(context, "context");
    }

    private final void bindService() {
        Intent intent = this.serviceIntent;
        if (intent != null) {
            this.serviceBindHelper.configService(intent);
        }
        Log.i(TAG, "RemoteServiceView start to bind service: " + this.serviceIntent);
    }

    public static /* synthetic */ void forceCallRemoteService$default(RemoteServiceView remoteServiceView, Bundle bundle, B0.a aVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forceCallRemoteService");
        }
        if ((i10 & 2) != 0) {
            aVar = null;
        }
        remoteServiceView.forceCallRemoteService(bundle, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void releaseAction$lambda$0(RemoteServiceView this$0) {
        n.h(this$0, "this$0");
        this$0.serviceBindHelper.releaseService();
        Log.i(TAG, "Release service because the card has detached to the window.");
    }

    private final void runPendingCallTasks() {
        Iterator<Map.Entry<Bundle, B0.a>> it = this.pendingCallTasks.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Bundle, B0.a> next = it.next();
            Bundle key = next.getKey();
            B0.a value = next.getValue();
            Bundle bundleCallRemoteService = callRemoteService(key);
            if (value != null) {
                value.accept(bundleCallRemoteService);
            }
            it.remove();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRemoteServiceIntent$lambda$2(RemoteServiceView this$0) {
        n.h(this$0, "this$0");
        this$0.bindService();
    }

    @Override // com.nothing.cardwidget.utils.AsyncServiceBinder.IServiceBindListener, android.os.IInterface
    public IBinder asBinder() {
        return AsyncServiceBinder.IServiceBindListener.DefaultImpls.asBinder(this);
    }

    public final Bundle callRemoteService(Bundle bundle) {
        Object objB;
        n.h(bundle, "bundle");
        this.serviceBindHelper.makeSureAlive();
        try {
            q.a aVar = q.f21862r;
            IRemoteService iRemoteService = this.remoteService;
            objB = q.b(iRemoteService != null ? iRemoteService.callRemoteService(bundle) : null);
        } catch (Throwable th) {
            q.a aVar2 = q.f21862r;
            objB = q.b(r.a(th));
        }
        return (Bundle) (q.f(objB) ? null : objB);
    }

    public final void forceCallRemoteService(Bundle bundle, B0.a aVar) {
        Object objB;
        n.h(bundle, "bundle");
        this.serviceBindHelper.makeSureAlive();
        IRemoteService iRemoteService = this.remoteService;
        Object obj = null;
        if (iRemoteService == null) {
            Map<Bundle, B0.a> map = this.pendingCallTasks;
            boolean z9 = true;
            if (!map.isEmpty()) {
                Iterator<Map.Entry<Bundle, B0.a>> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    if (n.d(it.next().getKey(), bundle)) {
                        z9 = false;
                        break;
                    }
                }
            }
            if ((z9 ? Boolean.valueOf(z9) : null) != null) {
                this.pendingCallTasks.put(bundle, aVar);
                return;
            }
            return;
        }
        try {
            q.a aVar2 = q.f21862r;
            Bundle bundleCallRemoteService = iRemoteService.callRemoteService(bundle);
            if (aVar != null) {
                aVar.accept(bundleCallRemoteService);
                obj = A.f21846a;
            }
            objB = q.b(obj);
        } catch (Throwable th) {
            q.a aVar3 = q.f21862r;
            objB = q.b(r.a(th));
        }
        Throwable thD = q.d(objB);
        if (thD != null) {
            Log.e(TAG, "remoteService is dead: " + thD);
        }
        q.a(objB);
    }

    @Override // com.nothing.commBase.deferred.IDeferringObserver
    public IDeferring getDeferringController() {
        return this.deferringController;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks(this.releaseAction);
        this.serviceBindHelper.makeSureAlive();
    }

    @Override // com.nothing.commBase.deferred.IDeferringObserver
    public void onCardRemoved(int i10) {
        IDeferringObserver.DefaultImpls.onCardRemoved(this, i10);
        this.serviceBindHelper.releaseService();
    }

    @Override // com.nothing.commBase.deferred.IDeferringObserver
    public void onCardVisibilityChanged(boolean z9) {
    }

    @Override // com.nothing.cardwidget.IRemoteServiceCallback
    public void onChanged(Bundle data) {
        n.h(data, "data");
        onDataChanged(data);
    }

    public abstract void onDataChanged(Bundle bundle);

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        postDelayed(this.releaseAction, RELEASE_SERVICE_DELAY);
    }

    @Override // com.nothing.cardwidget.utils.AsyncServiceBinder.IServiceBindListener
    public void onServiceBind(IRemoteService service) {
        n.h(service, "service");
        this.remoteService = service;
        runPendingCallTasks();
    }

    @Override // com.nothing.cardwidget.utils.AsyncServiceBinder.IServiceBindListener
    public void onServiceUnbind() {
        this.remoteService = null;
    }

    public final void setRemoteServiceBindPolicy(AsyncServiceBinder.IBindPolicy bindPolicy) {
        n.h(bindPolicy, "bindPolicy");
        this.serviceBindHelper.setBindPolicy(bindPolicy);
    }

    public final void setRemoteServiceIntent(Intent intent) {
        n.h(intent, "intent");
        this.serviceIntent = intent;
        post(new Runnable() { // from class: com.nothing.cardwidget.d
            @Override // java.lang.Runnable
            public final void run() {
                RemoteServiceView.setRemoteServiceIntent$lambda$2(this.f18038q);
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RemoteServiceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        n.h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RemoteServiceView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0, 8, null);
        n.h(context, "context");
    }

    public /* synthetic */ RemoteServiceView(Context context, AttributeSet attributeSet, int i10, int i11, int i12, AbstractC1457h abstractC1457h) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteServiceView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        n.h(context, "context");
        Map<Bundle, B0.a> mapSynchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        n.g(mapSynchronizedMap, "synchronizedMap(...)");
        this.pendingCallTasks = mapSynchronizedMap;
        Context applicationContext = context.getApplicationContext();
        n.g(applicationContext, "getApplicationContext(...)");
        this.serviceBindHelper = new AsyncServiceBinder(applicationContext, this);
        this.releaseAction = new Runnable() { // from class: com.nothing.cardwidget.e
            @Override // java.lang.Runnable
            public final void run() {
                RemoteServiceView.releaseAction$lambda$0(this.f18039q);
            }
        };
        this.deferringController = new DeferringController();
    }
}
