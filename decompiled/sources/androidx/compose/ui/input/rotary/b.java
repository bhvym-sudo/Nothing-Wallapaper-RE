package androidx.compose.ui.input.rotary;

import C.c;
import p219v8.l;

/* JADX INFO: loaded from: classes.dex */
final class b extends c.AbstractC0022c implements S.a {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private l f11478D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private l f11479E;

    public b(l lVar, l lVar2) {
        this.f11478D = lVar;
        this.f11479E = lVar2;
    }

    @Override // S.a
    public boolean D(S.b bVar) {
        l lVar = this.f11478D;
        if (lVar != null) {
            return ((Boolean) lVar.f(bVar)).booleanValue();
        }
        return false;
    }

    @Override // S.a
    public boolean h(S.b bVar) {
        l lVar = this.f11479E;
        if (lVar != null) {
            return ((Boolean) lVar.f(bVar)).booleanValue();
        }
        return false;
    }

    public final void h0(l lVar) {
        this.f11478D = lVar;
    }

    public final void i0(l lVar) {
        this.f11479E = lVar;
    }
}
