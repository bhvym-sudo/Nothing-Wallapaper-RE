package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
final class l implements ComponentCallbacks2C1224a.InterfaceC0455a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1225b f16284a;

    l(C1225b c1225b) {
        this.f16284a = c1225b;
    }

    @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C1224a.InterfaceC0455a
    public final void a(boolean z9) {
        C1225b c1225b = this.f16284a;
        c1225b.f16249p.sendMessage(c1225b.f16249p.obtainMessage(1, Boolean.valueOf(z9)));
    }
}
