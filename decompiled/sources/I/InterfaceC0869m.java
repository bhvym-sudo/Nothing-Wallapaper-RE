package I;

/* JADX INFO: renamed from: I.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0869m {
    static /* synthetic */ void b(InterfaceC0869m interfaceC0869m, float f10, float f11, float f12, float f13, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
        }
        if ((i11 & 16) != 0) {
            i10 = AbstractC0873q.f2737a.b();
        }
        interfaceC0869m.k(f10, f11, f12, f13, i10);
    }

    static /* synthetic */ void d(InterfaceC0869m interfaceC0869m, H h10, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i11 & 2) != 0) {
            i10 = AbstractC0873q.f2737a.b();
        }
        interfaceC0869m.a(h10, i10);
    }

    static /* synthetic */ void h(InterfaceC0869m interfaceC0869m, H.i iVar, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-mtrdD-E");
        }
        if ((i11 & 2) != 0) {
            i10 = AbstractC0873q.f2737a.b();
        }
        interfaceC0869m.i(iVar, i10);
    }

    void a(H h10, int i10);

    void c(float f10, float f11, float f12, float f13, F f14);

    void e();

    void f();

    void g(float[] fArr);

    default void i(H.i iVar, int i10) {
        k(iVar.f(), iVar.i(), iVar.g(), iVar.c(), i10);
    }

    default void j(H.i iVar, F f10) {
        c(iVar.f(), iVar.i(), iVar.g(), iVar.c(), f10);
    }

    void k(float f10, float f11, float f12, float f13, int i10);

    void l(float f10, float f11);

    void m();

    void n();
}
