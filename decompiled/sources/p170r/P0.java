package p170r;

import A.k;
import A.p;
import A.q;
import A.v;
import A.w;
import kotlin.jvm.internal.n;
import p079h8.A;

/* JADX INFO: loaded from: classes.dex */
public abstract class P0 extends v implements InterfaceC1679f0, q {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private a f25377r;

    private static final class a extends w {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f25378c;

        public a(float f10) {
            this.f25378c = f10;
        }

        @Override // A.w
        public void c(w wVar) {
            n.f(wVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
            this.f25378c = ((a) wVar).f25378c;
        }

        @Override // A.w
        public w d() {
            return new a(this.f25378c);
        }

        public final float i() {
            return this.f25378c;
        }

        public final void j(float f10) {
            this.f25378c = f10;
        }
    }

    public P0(float f10) {
        a aVar = new a(f10);
        if (k.f25e.e()) {
            a aVar2 = new a(f10);
            aVar2.h(1);
            aVar.g(aVar2);
        }
        this.f25377r = aVar;
    }

    @Override // A.q
    public R0 a() {
        return S0.g();
    }

    @Override // A.u
    public w b() {
        return this.f25377r;
    }

    @Override // p170r.InterfaceC1679f0
    public void d(float f10) {
        k kVarC;
        a aVar = (a) p.F(this.f25377r);
        if (aVar.i() == f10) {
            return;
        }
        a aVar2 = this.f25377r;
        p.J();
        synchronized (p.I()) {
            kVarC = k.f25e.c();
            ((a) p.S(aVar2, this, kVarC, aVar)).j(f10);
            A a10 = A.f21846a;
        }
        p.Q(kVarC, this);
    }

    @Override // p170r.InterfaceC1679f0
    public float e() {
        return ((a) p.X(this.f25377r, this)).i();
    }

    @Override // A.u
    public w f(w wVar, w wVar2, w wVar3) {
        n.f(wVar2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        n.f(wVar3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        if (((a) wVar2).i() == ((a) wVar3).i()) {
            return wVar2;
        }
        return null;
    }

    @Override // A.u
    public void k(w wVar) {
        n.f(wVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f25377r = (a) wVar;
    }

    public String toString() {
        return "MutableFloatState(value=" + ((a) p.F(this.f25377r)).i() + ")@" + hashCode();
    }
}
