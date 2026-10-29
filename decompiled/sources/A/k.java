package A;

import androidx.collection.F;
import kotlin.jvm.internal.AbstractC1457h;
import p079h8.A;
import p089i8.AbstractC1444s;
import p170r.AbstractC1672c;
import p170r.AbstractC1701q0;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f25e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f26f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n f27a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f28b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f29c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f30d;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void j(p219v8.p pVar) {
            synchronized (p.I()) {
                p.f57h = AbstractC1444s.f0(p.f57h, pVar);
                A a10 = A.f21846a;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l(p219v8.l lVar) {
            synchronized (p.I()) {
                p.f58i = AbstractC1444s.f0(p.f58i, lVar);
                A a10 = A.f21846a;
            }
            p.B();
        }

        public final k c() {
            return p.H();
        }

        public final k d() {
            return (k) p.f51b.a();
        }

        public final boolean e() {
            return p.f51b.a() != null;
        }

        public final k f(k kVar) {
            if (kVar instanceof x) {
                x xVar = (x) kVar;
                if (xVar.U() == AbstractC1672c.a()) {
                    xVar.X(null);
                    return kVar;
                }
            }
            if (kVar instanceof y) {
                y yVar = (y) kVar;
                if (yVar.C() == AbstractC1672c.a()) {
                    yVar.F(null);
                    return kVar;
                }
            }
            k kVarE = p.E(kVar, null, false, 6, null);
            kVarE.l();
            return kVarE;
        }

        public final void g() {
            p.H().o();
        }

        public final Object h(p219v8.l lVar, p219v8.l lVar2, p219v8.a aVar) {
            k xVar;
            if (lVar == null && lVar2 == null) {
                return aVar.invoke();
            }
            k kVar = (k) p.f51b.a();
            if (kVar instanceof x) {
                x xVar2 = (x) kVar;
                if (xVar2.U() == AbstractC1672c.a()) {
                    p219v8.l lVarH = xVar2.h();
                    p219v8.l lVarK = xVar2.k();
                    try {
                        ((x) kVar).X(p.L(lVar, lVarH, false, 4, null));
                        ((x) kVar).Y(p.M(lVar2, lVarK));
                        return aVar.invoke();
                    } finally {
                        xVar2.X(lVarH);
                        xVar2.Y(lVarK);
                    }
                }
            }
            if (kVar == null || (kVar instanceof c)) {
                xVar = new x(kVar instanceof c ? (c) kVar : null, lVar, lVar2, true, false);
            } else {
                if (lVar == null) {
                    return aVar.invoke();
                }
                xVar = kVar.x(lVar);
            }
            try {
                k kVarL = xVar.l();
                try {
                    Object objInvoke = aVar.invoke();
                    xVar.s(kVarL);
                    xVar.d();
                    return objInvoke;
                } catch (Throwable th) {
                    xVar.s(kVarL);
                    throw th;
                }
            } catch (Throwable th2) {
                xVar.d();
                throw th2;
            }
        }

        public final f i(final p219v8.p pVar) {
            p.A(p.f50a);
            synchronized (p.I()) {
                p.f57h = AbstractC1444s.h0(p.f57h, pVar);
                A a10 = A.f21846a;
            }
            return new f() { // from class: A.j
                @Override // A.f
                public final void dispose() {
                    k.a.j(pVar);
                }
            };
        }

        public final f k(final p219v8.l lVar) {
            synchronized (p.I()) {
                p.f58i = AbstractC1444s.h0(p.f58i, lVar);
                A a10 = A.f21846a;
            }
            p.B();
            return new f() { // from class: A.i
                @Override // A.f
                public final void dispose() {
                    k.a.l(lVar);
                }
            };
        }

        public final void m(k kVar, k kVar2, p219v8.l lVar) {
            if (kVar != kVar2) {
                kVar2.s(kVar);
                kVar2.d();
            } else if (kVar instanceof x) {
                ((x) kVar).X(lVar);
            } else {
                if (kVar instanceof y) {
                    ((y) kVar).F(lVar);
                    return;
                }
                throw new IllegalStateException(("Non-transparent snapshot was reused: " + kVar).toString());
            }
        }

        public final void n() {
            boolean z9;
            synchronized (p.I()) {
                F fE = ((A.a) p.f59j.get()).E();
                z9 = false;
                if (fE != null && fE.e()) {
                    z9 = true;
                }
            }
            if (z9) {
                p.B();
            }
        }

        public final c o(p219v8.l lVar, p219v8.l lVar2) {
            c cVarQ;
            k kVarH = p.H();
            c cVar = kVarH instanceof c ? (c) kVarH : null;
            if (cVar == null || (cVarQ = cVar.Q(lVar, lVar2)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            return cVarQ;
        }

        private a() {
        }
    }

    public /* synthetic */ k(int i10, n nVar, AbstractC1457h abstractC1457h) {
        this(i10, nVar);
    }

    public final void b() {
        synchronized (p.I()) {
            c();
            r();
            A a10 = A.f21846a;
        }
    }

    public void c() {
        p.f53d = p.f53d.o(f());
    }

    public void d() {
        this.f29c = true;
        synchronized (p.I()) {
            q();
            A a10 = A.f21846a;
        }
    }

    public final boolean e() {
        return this.f29c;
    }

    public int f() {
        return this.f28b;
    }

    public n g() {
        return this.f27a;
    }

    public abstract p219v8.l h();

    public abstract boolean i();

    public int j() {
        return 0;
    }

    public abstract p219v8.l k();

    public k l() {
        k kVar = (k) p.f51b.a();
        p.f51b.b(this);
        return kVar;
    }

    public abstract void m(k kVar);

    public abstract void n(k kVar);

    public abstract void o();

    public abstract void p(u uVar);

    public final void q() {
        int i10 = this.f30d;
        if (i10 >= 0) {
            p.Y(i10);
            this.f30d = -1;
        }
    }

    public void r() {
        q();
    }

    public void s(k kVar) {
        p.f51b.b(kVar);
    }

    public final void t(boolean z9) {
        this.f29c = z9;
    }

    public void u(int i10) {
        this.f28b = i10;
    }

    public void v(n nVar) {
        this.f27a = nVar;
    }

    public void w(int i10) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract k x(p219v8.l lVar);

    public final int y() {
        int i10 = this.f30d;
        this.f30d = -1;
        return i10;
    }

    public final void z() {
        if (this.f29c) {
            AbstractC1701q0.a("Cannot use a disposed snapshot");
        }
    }

    private k(int i10, n nVar) {
        this.f27a = nVar;
        this.f28b = i10;
        this.f30d = i10 != 0 ? p.c0(i10, g()) : -1;
    }
}
