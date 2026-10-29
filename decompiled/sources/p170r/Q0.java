package p170r;

import A.k;
import A.p;
import A.q;
import A.v;
import A.w;
import kotlin.jvm.internal.n;
import p079h8.A;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q0 extends v implements q {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final R0 f25381r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private a f25382s;

    private static final class a extends w {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f25383c;

        public a(Object obj) {
            this.f25383c = obj;
        }

        @Override // A.w
        public void c(w wVar) {
            n.f(wVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
            this.f25383c = ((a) wVar).f25383c;
        }

        @Override // A.w
        public w d() {
            return new a(this.f25383c);
        }

        public final Object i() {
            return this.f25383c;
        }

        public final void j(Object obj) {
            this.f25383c = obj;
        }
    }

    public Q0(Object obj, R0 r9) {
        this.f25381r = r9;
        a aVar = new a(obj);
        if (k.f25e.e()) {
            a aVar2 = new a(obj);
            aVar2.h(1);
            aVar.g(aVar2);
        }
        this.f25382s = aVar;
    }

    @Override // A.q
    public R0 a() {
        return this.f25381r;
    }

    @Override // A.u
    public w b() {
        return this.f25382s;
    }

    @Override // A.u
    public w f(w wVar, w wVar2, w wVar3) {
        n.f(wVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        a aVar = (a) wVar;
        n.f(wVar2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        a aVar2 = (a) wVar2;
        n.f(wVar3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        a aVar3 = (a) wVar3;
        if (a().a(aVar2.i(), aVar3.i())) {
            return wVar2;
        }
        Object objB = a().b(aVar.i(), aVar2.i(), aVar3.i());
        if (objB == null) {
            return null;
        }
        w wVarD = aVar3.d();
        n.f(wVarD, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.mergeRecords$lambda$4>");
        ((a) wVarD).j(objB);
        return wVarD;
    }

    @Override // p170r.InterfaceC1683h0, p170r.b1
    public Object getValue() {
        return ((a) p.X(this.f25382s, this)).i();
    }

    @Override // A.u
    public void k(w wVar) {
        n.f(wVar, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.f25382s = (a) wVar;
    }

    @Override // p170r.InterfaceC1683h0
    public void setValue(Object obj) {
        k kVarC;
        a aVar = (a) p.F(this.f25382s);
        if (a().a(aVar.i(), obj)) {
            return;
        }
        a aVar2 = this.f25382s;
        p.J();
        synchronized (p.I()) {
            kVarC = k.f25e.c();
            ((a) p.S(aVar2, this, kVarC, aVar)).j(obj);
            A a10 = A.f21846a;
        }
        p.Q(kVarC, this);
    }

    public String toString() {
        return "MutableState(value=" + ((a) p.F(this.f25382s)).i() + ")@" + hashCode();
    }
}
