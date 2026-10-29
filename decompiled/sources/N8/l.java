package N8;

import F8.InterfaceC0822l;
import K8.D;
import p079h8.A;
import p219v8.q;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final q f5428a = a.f5434q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final D f5429b = new D("STATE_REG");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final D f5430c = new D("STATE_COMPLETED");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final D f5431d = new D("STATE_CANCELLED");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final D f5432e = new D("NO_RESULT");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final D f5433f = new D("PARAM_CLAUSE_0");

    static final class a implements q {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final a f5434q = new a();

        a() {
        }

        @Override // p219v8.q
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void e(Object obj, Object obj2, Object obj3) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m a(int i10) {
        if (i10 == 0) {
            return m.SUCCESSFUL;
        }
        if (i10 == 1) {
            return m.REREGISTER;
        }
        if (i10 == 2) {
            return m.CANCELLED;
        }
        if (i10 == 3) {
            return m.ALREADY_SELECTED;
        }
        throw new IllegalStateException(("Unexpected internal result: " + i10).toString());
    }

    public static final D i() {
        return f5433f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(InterfaceC0822l interfaceC0822l, q qVar) {
        Object objR = interfaceC0822l.r(A.f21846a, null, qVar);
        if (objR == null) {
            return false;
        }
        interfaceC0822l.t(objR);
        return true;
    }
}
