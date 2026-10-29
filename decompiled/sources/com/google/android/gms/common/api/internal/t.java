package com.google.android.gms.common.api.internal;

import android.util.Log;
import java.util.Set;
import p015b4.C1182b;
import p025c4.AbstractC1189c;
import p025c4.InterfaceC1196j;

/* JADX INFO: loaded from: classes.dex */
final class t implements AbstractC1189c.InterfaceC0435c, p015b4.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a4.a.f f16307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1182b f16308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC1196j f16309c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Set f16310d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f16311e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ C1225b f16312f;

    public t(C1225b c1225b, a4.a.f fVar, C1182b c1182b) {
        this.f16312f = c1225b;
        this.f16307a = fVar;
        this.f16308b = c1182b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        InterfaceC1196j interfaceC1196j;
        if (!this.f16311e || (interfaceC1196j = this.f16309c) == null) {
            return;
        }
        this.f16307a.i(interfaceC1196j, this.f16310d);
    }

    @Override // p015b4.z
    public final void a(InterfaceC1196j interfaceC1196j, Set set) {
        if (interfaceC1196j == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            b(new Z3.a(4));
        } else {
            this.f16309c = interfaceC1196j;
            this.f16310d = set;
            h();
        }
    }

    @Override // p015b4.z
    public final void b(Z3.a aVar) {
        q qVar = (q) this.f16312f.f16245l.get(this.f16308b);
        if (qVar != null) {
            qVar.H(aVar);
        }
    }

    @Override // p025c4.AbstractC1189c.InterfaceC0435c
    public final void c(Z3.a aVar) {
        this.f16312f.f16249p.post(new s(this, aVar));
    }
}
