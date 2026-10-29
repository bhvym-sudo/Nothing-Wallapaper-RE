package F8;

/* JADX INFO: renamed from: F8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0800a extends D0 implements InterfaceC0846x0, p129m8.e, L {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final p129m8.i f1851s;

    public AbstractC0800a(p129m8.i iVar, boolean z9, boolean z10) {
        super(z10);
        if (z9) {
            h0((InterfaceC0846x0) iVar.b(InterfaceC0846x0.f1901e));
        }
        this.f1851s = iVar.z(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // F8.D0
    public String L() {
        return P.a(this) + " was cancelled";
    }

    protected void S0(Object obj) {
        y(obj);
    }

    protected void T0(Throwable th, boolean z9) {
    }

    protected void V0(Object obj) {
    }

    public final void W0(N n9, Object obj, p219v8.p pVar) {
        n9.e(pVar, obj, this);
    }

    @Override // F8.D0, F8.InterfaceC0846x0
    public boolean a() {
        return super.a();
    }

    @Override // F8.D0
    public final void g0(Throwable th) {
        K.a(this.f1851s, th);
    }

    @Override // p129m8.e
    public final p129m8.i getContext() {
        return this.f1851s;
    }

    @Override // F8.D0
    public String p0() {
        String strG = G.g(this.f1851s);
        if (strG == null) {
            return super.p0();
        }
        return '\"' + strG + "\":" + super.p0();
    }

    @Override // p129m8.e
    public final void resumeWith(Object obj) {
        Object objO0 = o0(C.b(obj));
        if (objO0 == E0.f1808b) {
            return;
        }
        S0(objO0);
    }

    @Override // F8.L
    public p129m8.i w0() {
        return this.f1851s;
    }

    @Override // F8.D0
    protected final void x0(Object obj) {
        if (!(obj instanceof A)) {
            V0(obj);
        } else {
            A a10 = (A) obj;
            T0(a10.f1787a, a10.a());
        }
    }
}
