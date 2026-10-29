package com.nothing.launcher.card;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends com.android.launcher3.m {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final j f18136G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final int f18137H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public com.nothing.cardhost.g f18138I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private Bundle f18139J;

    public m(j cardWidgetMetaInfo) {
        kotlin.jvm.internal.n.h(cardWidgetMetaInfo, "cardWidgetMetaInfo");
        this.f18136G = cardWidgetMetaInfo;
        this.f18137H = cardWidgetMetaInfo.y0();
        this.f594r = 0;
        this.f591C = cardWidgetMetaInfo.D0();
        this.f15629F = cardWidgetMetaInfo.v0();
        this.f597u = cardWidgetMetaInfo.B0();
        this.f598v = cardWidgetMetaInfo.C0();
        this.f599w = cardWidgetMetaInfo.z0();
        this.f600x = cardWidgetMetaInfo.A0();
    }

    public final Bundle m() {
        return this.f18139J;
    }

    public final j n() {
        return this.f18136G;
    }

    public final Bundle o(Context context) {
        kotlin.jvm.internal.n.h(context, "context");
        return V5.a.b(context, this.f597u, this.f598v);
    }

    public final a p() {
        return new a(this.f18136G);
    }

    public final void q(Bundle bundle) {
        this.f18139J = bundle;
    }
}
