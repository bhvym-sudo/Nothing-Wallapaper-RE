package W;

import I.AbstractC0874s;
import I.InterfaceC0869m;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public final class D implements K.f, K.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final K.a f8313q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private InterfaceC0972n f8314r;

    public D(K.a aVar) {
        this.f8313q = aVar;
    }

    @Override // p111l0.k
    public float A() {
        return this.f8313q.A();
    }

    @Override // p111l0.d
    public float D(float f10) {
        return this.f8313q.D(f10);
    }

    @Override // K.f
    public K.d E() {
        return this.f8313q.E();
    }

    @Override // p111l0.d
    public long J(long j9) {
        return this.f8313q.J(j9);
    }

    @Override // p111l0.d
    public float L(long j9) {
        return this.f8313q.L(j9);
    }

    @Override // K.f
    public void O(long j9, long j10, long j11, float f10, K.g gVar, AbstractC0874s abstractC0874s, int i10) {
        this.f8313q.O(j9, j10, j11, f10, gVar, abstractC0874s, i10);
    }

    public final void a(InterfaceC0869m interfaceC0869m, long j9, U u9, C.c.AbstractC0022c abstractC0022c, L.c cVar) {
        D d10;
        InterfaceC0869m interfaceC0869m2;
        long j10;
        U u10;
        L.c cVar2;
        W.a(4);
        while (abstractC0022c != null) {
            if (abstractC0022c instanceof InterfaceC0972n) {
                d10 = this;
                interfaceC0869m2 = interfaceC0869m;
                j10 = j9;
                u10 = u9;
                cVar2 = cVar;
                d10.c(interfaceC0869m2, j10, u10, (InterfaceC0972n) abstractC0022c, cVar2);
            } else {
                d10 = this;
                interfaceC0869m2 = interfaceC0869m;
                j10 = j9;
                u10 = u9;
                cVar2 = cVar;
                abstractC0022c.L();
            }
            abstractC0022c = AbstractC0967i.f(null);
            this = d10;
            interfaceC0869m = interfaceC0869m2;
            j9 = j10;
            u9 = u10;
            cVar = cVar2;
        }
    }

    @Override // K.f
    public long b() {
        return this.f8313q.b();
    }

    public final void c(InterfaceC0869m interfaceC0869m, long j9, U u9, InterfaceC0972n interfaceC0972n, L.c cVar) {
        InterfaceC0972n interfaceC0972n2 = this.f8314r;
        this.f8314r = interfaceC0972n;
        K.a aVar = this.f8313q;
        p111l0.s layoutDirection = u9.getLayoutDirection();
        p111l0.d density = aVar.E().getDensity();
        p111l0.s layoutDirection2 = aVar.E().getLayoutDirection();
        InterfaceC0869m interfaceC0869mI = aVar.E().i();
        long jB = aVar.E().b();
        L.c cVarF = aVar.E().f();
        K.d dVarE = aVar.E();
        dVarE.g(u9);
        dVarE.h(layoutDirection);
        dVarE.j(interfaceC0869m);
        dVarE.e(j9);
        dVarE.d(cVar);
        interfaceC0869m.e();
        try {
            interfaceC0972n.l(this);
            interfaceC0869m.m();
            K.d dVarE2 = aVar.E();
            dVarE2.g(density);
            dVarE2.h(layoutDirection2);
            dVarE2.j(interfaceC0869mI);
            dVarE2.e(jB);
            dVarE2.d(cVarF);
            this.f8314r = interfaceC0972n2;
        } catch (Throwable th) {
            interfaceC0869m.m();
            K.d dVarE3 = aVar.E();
            dVarE3.g(density);
            dVarE3.h(layoutDirection2);
            dVarE3.j(interfaceC0869mI);
            dVarE3.e(jB);
            dVarE3.d(cVarF);
            throw th;
        }
    }

    @Override // p111l0.d
    public float getDensity() {
        return this.f8313q.getDensity();
    }

    @Override // p111l0.k
    public float l(long j9) {
        return this.f8313q.l(j9);
    }

    public /* synthetic */ D(K.a aVar, int i10, AbstractC1457h abstractC1457h) {
        this((i10 & 1) != 0 ? new K.a() : aVar);
    }
}
