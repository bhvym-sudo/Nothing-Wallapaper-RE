package A;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f101a = p.H().f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private w f102b;

    public abstract void c(w wVar);

    public abstract w d();

    public final w e() {
        return this.f102b;
    }

    public final int f() {
        return this.f101a;
    }

    public final void g(w wVar) {
        this.f102b = wVar;
    }

    public final void h(int i10) {
        this.f101a = i10;
    }
}
