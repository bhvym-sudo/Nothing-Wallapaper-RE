package com.nothing.cardwidget.aiwidget;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.q;
import p079h8.r;

/* JADX INFO: loaded from: classes.dex */
public final class AIServiceBinderHelper$serviceConnection$1 implements ServiceConnection {
    final /* synthetic */ AIServiceBinderHelper this$0;

    AIServiceBinderHelper$serviceConnection$1(AIServiceBinderHelper aIServiceBinderHelper) {
        this.this$0 = aIServiceBinderHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onServiceConnected$lambda$1$lambda$0(C8.e tmp0) {
        n.h(tmp0, "$tmp0");
        ((p219v8.a) tmp0).invoke();
    }

    @Override // android.content.ServiceConnection
    public void onBindingDied(ComponentName componentName) {
        Log.i("AiServiceBinderHelper", "onBindingDied.");
        this.this$0.onServiceLose();
    }

    @Override // android.content.ServiceConnection
    public void onNullBinding(ComponentName componentName) {
        Log.i("AiServiceBinderHelper", "onNullBinding");
        this.this$0.onServiceLose();
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName name, IBinder service) {
        Object objB;
        A a10;
        n.h(name, "name");
        n.h(service, "service");
        this.this$0.retryTask.stopRetry();
        if (this.this$0.aiService != null) {
            return;
        }
        this.this$0.aiService = IAIWidgetService.Stub.asInterface(service);
        AIServiceBinderHelper aIServiceBinderHelper = this.this$0;
        try {
            q.a aVar = q.f21862r;
            final C8.e eVar = aIServiceBinderHelper.deathRecipient;
            service.linkToDeath(new IBinder.DeathRecipient() { // from class: com.nothing.cardwidget.aiwidget.d
                @Override // android.os.IBinder.DeathRecipient
                public final void binderDied() {
                    AIServiceBinderHelper$serviceConnection$1.onServiceConnected$lambda$1$lambda$0(eVar);
                }
            }, 0);
            objB = q.b(A.f21846a);
        } catch (Throwable th) {
            q.a aVar2 = q.f21862r;
            objB = q.b(r.a(th));
        }
        AIServiceBinderHelper aIServiceBinderHelper2 = this.this$0;
        Throwable thD = q.d(objB);
        if (thD != null) {
            Log.e("AiServiceBinderHelper", "linkToDeath error.", thD);
            aIServiceBinderHelper2.retryConnectService();
            return;
        }
        Log.i("AiServiceBinderHelper", "onServiceConnected, aiService = " + this.this$0.aiService);
        IAIWidgetService iAIWidgetService = this.this$0.aiService;
        if (iAIWidgetService != null) {
            AIServiceBinderHelper aIServiceBinderHelper3 = this.this$0;
            iAIWidgetService.startListening(aIServiceBinderHelper3.aiWidgetCallback);
            AIServiceBinderHelper.IServiceBindListener serviceListener = aIServiceBinderHelper3.getServiceListener();
            if (serviceListener != null) {
                serviceListener.onServiceBind(iAIWidgetService);
                a10 = A.f21846a;
            } else {
                a10 = null;
            }
            if (a10 != null) {
                return;
            }
        }
        this.this$0.retryConnectService();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        Log.i("AiServiceBinderHelper", "onServiceDisconnected.");
        this.this$0.onServiceLose();
    }
}
