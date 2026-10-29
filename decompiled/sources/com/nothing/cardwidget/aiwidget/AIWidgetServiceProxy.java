package com.nothing.cardwidget.aiwidget;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.h;
import p079h8.i;

/* JADX INFO: loaded from: classes.dex */
public final class AIWidgetServiceProxy implements AIServiceBinderHelper.IServiceBindListener {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "AIWidgetServiceProxy";
    private static volatile AIWidgetServiceProxy instance;
    private final h binderHelper$delegate;
    private final Context context;
    private volatile IAIWidgetService remoteService;
    private final WeakHashMap<IWidgetClient, Integer> widgetClientIdMap;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1457h abstractC1457h) {
            this();
        }

        public final AIWidgetServiceProxy getInstance(Context context) {
            AIWidgetServiceProxy aIWidgetServiceProxy;
            n.h(context, "context");
            AIWidgetServiceProxy aIWidgetServiceProxy2 = AIWidgetServiceProxy.instance;
            if (aIWidgetServiceProxy2 != null) {
                return aIWidgetServiceProxy2;
            }
            synchronized (AIWidgetServiceProxy.Companion) {
                aIWidgetServiceProxy = AIWidgetServiceProxy.instance;
                if (aIWidgetServiceProxy == null) {
                    Context applicationContext = context.getApplicationContext();
                    n.g(applicationContext, "getApplicationContext(...)");
                    aIWidgetServiceProxy = new AIWidgetServiceProxy(applicationContext, null);
                    AIWidgetServiceProxy.instance = aIWidgetServiceProxy;
                }
            }
            return aIWidgetServiceProxy;
        }

        private Companion() {
        }
    }

    public interface IWidgetClient {
        Bundle getLauncherActivityOptions(int i10);

        void onMoveGestureEnabled(boolean z9);

        void onReactLoadResult(String str, int i10);

        void onServiceConnected(IAIWidgetService iAIWidgetService);

        void onServiceDisconnected();

        void onSurfaceTouchDownEvent(long j9);
    }

    public /* synthetic */ AIWidgetServiceProxy(Context context, AbstractC1457h abstractC1457h) {
        this(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AIServiceBinderHelper binderHelper_delegate$lambda$0(AIWidgetServiceProxy this$0) {
        n.h(this$0, "this$0");
        return new AIServiceBinderHelper(this$0.context, this$0);
    }

    private final AIServiceBinderHelper getBinderHelper() {
        return (AIServiceBinderHelper) this.binderHelper$delegate.getValue();
    }

    private final synchronized void registerClient(int i10, IWidgetClient iWidgetClient) {
        this.widgetClientIdMap.put(iWidgetClient, Integer.valueOf(i10));
    }

    private final synchronized void unregisterClient(IWidgetClient iWidgetClient) {
        Log.d(TAG, "unregisterClient client: " + iWidgetClient);
        this.widgetClientIdMap.remove(iWidgetClient);
    }

    @Override // com.nothing.cardwidget.aiwidget.AIServiceBinderHelper.IServiceBindListener, android.os.IInterface
    public IBinder asBinder() {
        return AIServiceBinderHelper.IServiceBindListener.DefaultImpls.asBinder(this);
    }

    public final void bindService(int i10, IWidgetClient client, Intent serviceIntent) {
        n.h(client, "client");
        n.h(serviceIntent, "serviceIntent");
        Log.i(TAG, "bindService client: " + client.hashCode());
        registerClient(i10, client);
        if (this.remoteService == null) {
            getBinderHelper().configService(serviceIntent);
            return;
        }
        IAIWidgetService iAIWidgetService = this.remoteService;
        n.e(iAIWidgetService);
        client.onServiceConnected(iAIWidgetService);
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // com.nothing.cardwidget.aiwidget.IAIWidgetCallBack
    public synchronized Bundle getLauncherActivityOptions(int i10) {
        WeakHashMap<IWidgetClient, Integer> weakHashMap = this.widgetClientIdMap;
        ArrayList arrayList = new ArrayList(weakHashMap.size());
        for (Map.Entry<IWidgetClient, Integer> entry : weakHashMap.entrySet()) {
            Integer value = entry.getValue();
            if (value != null && value.intValue() == i10) {
                return entry.getKey().getLauncherActivityOptions(i10);
            }
            arrayList.add(A.f21846a);
        }
        return null;
    }

    public final boolean makeServiceAlive() {
        return getBinderHelper().makeSureAlive();
    }

    @Override // com.nothing.cardwidget.aiwidget.IAIWidgetCallBack
    public synchronized void onMoveGestureEnabled(int i10, boolean z9) {
        try {
            WeakHashMap<IWidgetClient, Integer> weakHashMap = this.widgetClientIdMap;
            ArrayList arrayList = new ArrayList(weakHashMap.size());
            for (Map.Entry<IWidgetClient, Integer> entry : weakHashMap.entrySet()) {
                Integer value = entry.getValue();
                if (value != null && value.intValue() == i10) {
                    entry.getKey().onMoveGestureEnabled(z9);
                }
                arrayList.add(A.f21846a);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.nothing.cardwidget.aiwidget.IAIWidgetCallBack
    public synchronized void onReactLoadResult(int i10, String bundleId, int i11) {
        try {
            n.h(bundleId, "bundleId");
            WeakHashMap<IWidgetClient, Integer> weakHashMap = this.widgetClientIdMap;
            ArrayList arrayList = new ArrayList(weakHashMap.size());
            for (Map.Entry<IWidgetClient, Integer> entry : weakHashMap.entrySet()) {
                Integer value = entry.getValue();
                if (value != null && value.intValue() == i10) {
                    entry.getKey().onReactLoadResult(bundleId, i11);
                }
                arrayList.add(A.f21846a);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.nothing.cardwidget.aiwidget.AIServiceBinderHelper.IServiceBindListener
    public synchronized void onServiceBind(IAIWidgetService service) {
        n.h(service, "service");
        Log.i(TAG, "onServiceBind");
        this.remoteService = service;
        Iterator<Map.Entry<IWidgetClient, Integer>> it = this.widgetClientIdMap.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getKey().onServiceConnected(service);
        }
    }

    @Override // com.nothing.cardwidget.aiwidget.AIServiceBinderHelper.IServiceBindListener
    public synchronized void onServiceUnbind() {
        Log.i(TAG, "onServiceUnbind");
        this.remoteService = null;
        Iterator<Map.Entry<IWidgetClient, Integer>> it = this.widgetClientIdMap.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getKey().onServiceDisconnected();
        }
    }

    @Override // com.nothing.cardwidget.aiwidget.IAIWidgetCallBack
    public synchronized void onSurfaceTouchDownEvent(int i10, long j9) {
        try {
            WeakHashMap<IWidgetClient, Integer> weakHashMap = this.widgetClientIdMap;
            ArrayList arrayList = new ArrayList(weakHashMap.size());
            for (Map.Entry<IWidgetClient, Integer> entry : weakHashMap.entrySet()) {
                Integer value = entry.getValue();
                if (value != null && value.intValue() == i10) {
                    entry.getKey().onSurfaceTouchDownEvent(j9);
                }
                arrayList.add(A.f21846a);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void unbindService(IWidgetClient client) {
        n.h(client, "client");
        Log.i(TAG, "unbindService client: " + client.hashCode());
        unregisterClient(client);
        if (this.widgetClientIdMap.isEmpty()) {
            getBinderHelper().releaseService();
            this.remoteService = null;
        }
    }

    private AIWidgetServiceProxy(Context context) {
        this.context = context;
        this.widgetClientIdMap = new WeakHashMap<>();
        this.binderHelper$delegate = i.b(new p219v8.a() { // from class: com.nothing.cardwidget.aiwidget.e
            @Override // p219v8.a
            public final Object invoke() {
                return AIWidgetServiceProxy.binderHelper_delegate$lambda$0(this.f18020q);
            }
        });
    }
}
