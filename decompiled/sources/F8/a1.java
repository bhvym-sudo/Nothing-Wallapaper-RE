package F8;

/* JADX INFO: loaded from: classes2.dex */
public final class a1 extends K8.z {
    private volatile boolean threadLocalIsSet;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final ThreadLocal f1852u;

    /* JADX WARN: Illegal instructions before constructor call */
    public a1(p129m8.i iVar, p129m8.e eVar) {
        b1 b1Var = b1.f1856q;
        super(iVar.b(b1Var) == null ? iVar.z(b1Var) : iVar, eVar);
        this.f1852u = new ThreadLocal();
        if (eVar.getContext().b(p129m8.f.f23250l) instanceof I) {
            return;
        }
        Object objI = K8.K.i(iVar, null);
        K8.K.f(iVar, objI);
        b1(iVar, objI);
    }

    private final void a1() {
        if (this.threadLocalIsSet) {
            p079h8.o oVar = (p079h8.o) this.f1852u.get();
            if (oVar != null) {
                K8.K.f((p129m8.i) oVar.a(), oVar.b());
            }
            this.f1852u.remove();
        }
    }

    @Override // K8.z, F8.AbstractC0800a
    protected void S0(Object obj) {
        a1();
        Object objA = C.a(obj, this.f4198t);
        p129m8.e eVar = this.f4198t;
        p129m8.i context = eVar.getContext();
        Object objI = K8.K.i(context, null);
        a1 a1VarM = objI != K8.K.f4146a ? G.m(eVar, context, objI) : null;
        try {
            this.f4198t.resumeWith(objA);
            p079h8.A a10 = p079h8.A.f21846a;
        } finally {
            if (a1VarM == null || a1VarM.Z0()) {
                K8.K.f(context, objI);
            }
        }
    }

    @Override // K8.z
    public void Y0() {
        a1();
    }

    public final boolean Z0() {
        boolean z9 = this.threadLocalIsSet && this.f1852u.get() == null;
        this.f1852u.remove();
        return !z9;
    }

    public final void b1(p129m8.i iVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f1852u.set(p079h8.v.a(iVar, obj));
    }
}
