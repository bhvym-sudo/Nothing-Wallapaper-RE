package F8;

/* JADX INFO: loaded from: classes2.dex */
public final class Z0 extends I {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Z0 f1850s = new Z0();

    private Z0() {
    }

    @Override // F8.I
    public void g1(p129m8.i iVar, Runnable runnable) {
        d1 d1Var = (d1) iVar.b(d1.f1859s);
        if (d1Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        d1Var.f1860r = true;
    }

    @Override // F8.I
    public boolean i1(p129m8.i iVar) {
        return false;
    }

    @Override // F8.I
    public I j1(int i10, String str) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // F8.I
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
