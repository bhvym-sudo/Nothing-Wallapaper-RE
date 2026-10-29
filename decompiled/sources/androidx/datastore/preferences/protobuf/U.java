package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class U implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final P f12434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m0 f12435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f12436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AbstractC1106p f12437d;

    private U(m0 m0Var, AbstractC1106p abstractC1106p, P p9) {
        this.f12435b = m0Var;
        this.f12436c = abstractC1106p.e(p9);
        this.f12437d = abstractC1106p;
        this.f12434a = p9;
    }

    private int j(m0 m0Var, Object obj) {
        return m0Var.i(m0Var.g(obj));
    }

    private void k(m0 m0Var, AbstractC1106p abstractC1106p, Object obj, e0 e0Var, C1105o c1105o) throws Throwable {
        m0 m0Var2;
        Object objF = m0Var.f(obj);
        C1108s c1108sD = abstractC1106p.d(obj);
        while (e0Var.y() != Integer.MAX_VALUE) {
            try {
                U u9 = this;
                m0Var2 = m0Var;
                AbstractC1106p abstractC1106p2 = abstractC1106p;
                e0 e0Var2 = e0Var;
                C1105o c1105o2 = c1105o;
                try {
                    if (!u9.m(e0Var2, c1105o2, abstractC1106p2, c1108sD, m0Var2, objF)) {
                        m0Var2.o(obj, objF);
                        return;
                    }
                    this = u9;
                    e0Var = e0Var2;
                    c1105o = c1105o2;
                    abstractC1106p = abstractC1106p2;
                    m0Var = m0Var2;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    m0Var2.o(obj, objF);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                m0Var2 = m0Var;
            }
        }
        m0Var.o(obj, objF);
    }

    static U l(m0 m0Var, AbstractC1106p abstractC1106p, P p9) {
        return new U(m0Var, abstractC1106p, p9);
    }

    private boolean m(e0 e0Var, C1105o c1105o, AbstractC1106p abstractC1106p, C1108s c1108s, m0 m0Var, Object obj) throws C1115z {
        int tag = e0Var.getTag();
        int iK = 0;
        if (tag != r0.f12572a) {
            if (r0.b(tag) != 2) {
                return e0Var.F();
            }
            Object objB = abstractC1106p.b(c1105o, this.f12434a, r0.a(tag));
            if (objB == null) {
                return m0Var.m(obj, e0Var, 0);
            }
            abstractC1106p.h(e0Var, objB, c1105o, c1108s);
            return true;
        }
        Object objB2 = null;
        AbstractC1097g abstractC1097gB = null;
        while (e0Var.y() != Integer.MAX_VALUE) {
            int tag2 = e0Var.getTag();
            if (tag2 == r0.f12574c) {
                iK = e0Var.k();
                objB2 = abstractC1106p.b(c1105o, this.f12434a, iK);
            } else if (tag2 == r0.f12575d) {
                if (objB2 != null) {
                    abstractC1106p.h(e0Var, objB2, c1105o, c1108s);
                } else {
                    abstractC1097gB = e0Var.B();
                }
            } else if (!e0Var.F()) {
                break;
            }
        }
        if (e0Var.getTag() != r0.f12573b) {
            throw C1115z.b();
        }
        if (abstractC1097gB != null) {
            if (objB2 != null) {
                abstractC1106p.i(abstractC1097gB, objB2, c1105o, c1108s);
            } else {
                m0Var.d(obj, iK, abstractC1097gB);
            }
        }
        return true;
    }

    private void n(m0 m0Var, Object obj, s0 s0Var) {
        m0Var.s(m0Var.g(obj), s0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public void a(Object obj, Object obj2) {
        h0.F(this.f12435b, obj, obj2);
        if (this.f12436c) {
            h0.D(this.f12437d, obj, obj2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public void b(Object obj, e0 e0Var, C1105o c1105o) throws Throwable {
        k(this.f12435b, this.f12437d, obj, e0Var, c1105o);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public void c(Object obj) {
        this.f12435b.j(obj);
        this.f12437d.f(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final boolean d(Object obj) {
        return this.f12437d.c(obj).k();
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public void e(Object obj, s0 s0Var) {
        Iterator itN = this.f12437d.c(obj).n();
        if (itN.hasNext()) {
            androidx.appcompat.app.o.a(((Map.Entry) itN.next()).getKey());
            throw null;
        }
        n(this.f12435b, obj, s0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public boolean f(Object obj, Object obj2) {
        if (!this.f12435b.g(obj).equals(this.f12435b.g(obj2))) {
            return false;
        }
        if (this.f12436c) {
            return this.f12437d.c(obj).equals(this.f12437d.c(obj2));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public int g(Object obj) {
        int iJ = j(this.f12435b, obj);
        return this.f12436c ? iJ + this.f12437d.c(obj).f() : iJ;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public Object h() {
        P p9 = this.f12434a;
        return p9 instanceof AbstractC1112w ? ((AbstractC1112w) p9).I() : p9.h().z();
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public int i(Object obj) {
        int iHashCode = this.f12435b.g(obj).hashCode();
        return this.f12436c ? (iHashCode * 53) + this.f12437d.c(obj).hashCode() : iHashCode;
    }
}
