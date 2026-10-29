package com.nothing.cardwidget.aiwidget;

import kotlin.jvm.internal.l;
import p079h8.A;

/* JADX INFO: loaded from: classes.dex */
/* synthetic */ class AIServiceBinderHelper$deathRecipient$1 extends l implements p219v8.a {
    AIServiceBinderHelper$deathRecipient$1(Object obj) {
        super(0, obj, AIServiceBinderHelper.class, "retryConnectService", "retryConnectService()V", 0);
    }

    @Override // p219v8.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m19invoke();
        return A.f21846a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m19invoke() {
        ((AIServiceBinderHelper) this.receiver).retryConnectService();
    }
}
