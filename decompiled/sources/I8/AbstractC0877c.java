package I8;

/* JADX INFO: renamed from: I8.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC0877c extends J8.e {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final p219v8.p f3217t;

    public AbstractC0877c(p219v8.p pVar, p129m8.i iVar, int i10, H8.a aVar) {
        super(iVar, i10, aVar);
        this.f3217t = pVar;
    }

    static /* synthetic */ Object q(AbstractC0877c abstractC0877c, H8.t tVar, p129m8.e eVar) {
        Object objInvoke = abstractC0877c.f3217t.invoke(tVar, eVar);
        return objInvoke == p139n8.b.e() ? objInvoke : p079h8.A.f21846a;
    }

    @Override // J8.e
    protected Object j(H8.t tVar, p129m8.e eVar) {
        return q(this, tVar, eVar);
    }

    @Override // J8.e
    public String toString() {
        return "block[" + this.f3217t + "] -> " + super.toString();
    }
}
