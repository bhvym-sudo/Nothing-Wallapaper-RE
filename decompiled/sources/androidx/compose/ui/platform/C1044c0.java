package androidx.compose.ui.platform;

import I.AbstractC0866j;
import I.C0865i;
import I.InterfaceC0869m;
import android.graphics.Outline;

/* JADX INFO: renamed from: androidx.compose.ui.platform.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1044c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f11856a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Outline f11857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private I.E f11858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private I.H f11859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private I.H f11860e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f11861f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f11862g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private I.H f11863h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private H.k f11864i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f11865j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f11866k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f11867l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f11868m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private I.H f11869n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private I.H f11870o;

    public C1044c0() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f11857b = outline;
        this.f11866k = H.g.f2287b.c();
        this.f11867l = H.m.f2308a.b();
    }

    private final boolean g(H.k kVar, long j9, long j10, float f10) {
        return kVar != null && H.l.d(kVar) && kVar.e() == H.g.k(j9) && kVar.g() == H.g.l(j9) && kVar.f() == H.g.k(j9) + H.m.f(j10) && kVar.a() == H.g.l(j9) + H.m.e(j10) && H.a.d(kVar.h()) == f10;
    }

    private final void i() {
        if (this.f11861f) {
            this.f11866k = H.g.f2287b.c();
            this.f11865j = 0.0f;
            this.f11860e = null;
            this.f11861f = false;
            this.f11862g = false;
            I.E e10 = this.f11858c;
            if (e10 == null || !this.f11868m || H.m.f(this.f11867l) <= 0.0f || H.m.e(this.f11867l) <= 0.0f) {
                this.f11857b.setEmpty();
                return;
            }
            this.f11856a = true;
            if (e10 instanceof I.E.b) {
                k(((I.E.b) e10).b());
            } else if (e10 instanceof I.E.c) {
                l(((I.E.c) e10).b());
            } else if (e10 instanceof I.E.a) {
                j(((I.E.a) e10).b());
            }
        }
    }

    private final void j(I.H h10) {
        Outline outline = this.f11857b;
        if (!(h10 instanceof C0865i)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline.setConvexPath(((C0865i) h10).a());
        this.f11862g = !this.f11857b.canClip();
        this.f11860e = h10;
    }

    private final void k(H.i iVar) {
        this.f11866k = H.h.a(iVar.f(), iVar.i());
        this.f11867l = H.n.a(iVar.j(), iVar.e());
        this.f11857b.setRect(Math.round(iVar.f()), Math.round(iVar.i()), Math.round(iVar.g()), Math.round(iVar.c()));
    }

    private final void l(H.k kVar) {
        float fD = H.a.d(kVar.h());
        this.f11866k = H.h.a(kVar.e(), kVar.g());
        this.f11867l = H.n.a(kVar.j(), kVar.d());
        if (H.l.d(kVar)) {
            this.f11857b.setRoundRect(Math.round(kVar.e()), Math.round(kVar.g()), Math.round(kVar.f()), Math.round(kVar.a()), fD);
            this.f11865j = fD;
            return;
        }
        I.H hA = this.f11859d;
        if (hA == null) {
            hA = AbstractC0866j.a();
            this.f11859d = hA;
        }
        hA.b();
        I.H.e(hA, kVar, null, 2, null);
        j(hA);
    }

    public final void a(InterfaceC0869m interfaceC0869m) {
        I.H hD = d();
        if (hD != null) {
            InterfaceC0869m.d(interfaceC0869m, hD, 0, 2, null);
            return;
        }
        float f10 = this.f11865j;
        if (f10 <= 0.0f) {
            InterfaceC0869m.b(interfaceC0869m, H.g.k(this.f11866k), H.g.l(this.f11866k), H.g.k(this.f11866k) + H.m.f(this.f11867l), H.g.l(this.f11866k) + H.m.e(this.f11867l), 0, 16, null);
            return;
        }
        I.H hA = this.f11863h;
        H.k kVar = this.f11864i;
        if (hA == null || !g(kVar, this.f11866k, this.f11867l, f10)) {
            H.k kVarB = H.l.b(H.g.k(this.f11866k), H.g.l(this.f11866k), H.g.k(this.f11866k) + H.m.f(this.f11867l), H.g.l(this.f11866k) + H.m.e(this.f11867l), H.b.b(this.f11865j, 0.0f, 2, null));
            if (hA == null) {
                hA = AbstractC0866j.a();
            } else {
                hA.b();
            }
            I.H.e(hA, kVarB, null, 2, null);
            this.f11864i = kVarB;
            this.f11863h = hA;
        }
        InterfaceC0869m.d(interfaceC0869m, hA, 0, 2, null);
    }

    public final Outline b() {
        i();
        if (this.f11868m && this.f11856a) {
            return this.f11857b;
        }
        return null;
    }

    public final boolean c() {
        return this.f11861f;
    }

    public final I.H d() {
        i();
        return this.f11860e;
    }

    public final boolean e() {
        return !this.f11862g;
    }

    public final boolean f(long j9) {
        I.E e10;
        if (this.f11868m && (e10 = this.f11858c) != null) {
            return k0.b(e10, H.g.k(j9), H.g.l(j9), this.f11869n, this.f11870o);
        }
        return true;
    }

    public final boolean h(I.E e10, float f10, boolean z9, float f11, long j9) {
        this.f11857b.setAlpha(f10);
        boolean zD = kotlin.jvm.internal.n.d(this.f11858c, e10);
        boolean z10 = !zD;
        if (!zD) {
            this.f11858c = e10;
            this.f11861f = true;
        }
        this.f11867l = j9;
        boolean z11 = e10 != null && (z9 || f11 > 0.0f);
        if (this.f11868m != z11) {
            this.f11868m = z11;
            this.f11861f = true;
        }
        return z10;
    }
}
