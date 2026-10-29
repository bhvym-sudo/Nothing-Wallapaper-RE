package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
abstract class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile int f12532a = 100;

    m0() {
    }

    private final void l(Object obj, e0 e0Var, int i10) {
        while (e0Var.y() != Integer.MAX_VALUE && m(obj, e0Var, i10)) {
        }
    }

    abstract void a(Object obj, int i10, int i11);

    abstract void b(Object obj, int i10, long j9);

    abstract void c(Object obj, int i10, Object obj2);

    abstract void d(Object obj, int i10, AbstractC1097g abstractC1097g);

    abstract void e(Object obj, int i10, long j9);

    abstract Object f(Object obj);

    abstract Object g(Object obj);

    abstract int h(Object obj);

    abstract int i(Object obj);

    abstract void j(Object obj);

    abstract Object k(Object obj, Object obj2);

    final boolean m(Object obj, e0 e0Var, int i10) throws C1115z {
        int tag = e0Var.getTag();
        int iA = r0.a(tag);
        int iB = r0.b(tag);
        if (iB == 0) {
            e(obj, iA, e0Var.K());
            return true;
        }
        if (iB == 1) {
            b(obj, iA, e0Var.c());
            return true;
        }
        if (iB == 2) {
            d(obj, iA, e0Var.B());
            return true;
        }
        if (iB != 3) {
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw C1115z.e();
            }
            a(obj, iA, e0Var.g());
            return true;
        }
        Object objN = n();
        int iC = r0.c(iA, 4);
        int i11 = i10 + 1;
        if (i11 >= f12532a) {
            throw C1115z.i();
        }
        l(objN, e0Var, i11);
        if (iC != e0Var.getTag()) {
            throw C1115z.b();
        }
        c(obj, iA, r(objN));
        return true;
    }

    abstract Object n();

    abstract void o(Object obj, Object obj2);

    abstract void p(Object obj, Object obj2);

    abstract boolean q(e0 e0Var);

    abstract Object r(Object obj);

    abstract void s(Object obj, s0 s0Var);

    abstract void t(Object obj, s0 s0Var);
}
