package p170r;

/* JADX INFO: renamed from: r.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1674d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f25435a;

    public C1674d(int i10) {
        this.f25435a = i10;
    }

    public final int a() {
        return this.f25435a;
    }

    public final boolean b() {
        return this.f25435a != Integer.MIN_VALUE;
    }

    public final void c(int i10) {
        this.f25435a = i10;
    }

    public final int d(L0 l9) {
        return l9.b(this);
    }

    public final int e(O0 o9) {
        return o9.E(this);
    }

    public String toString() {
        return super.toString() + "{ location = " + this.f25435a + " }";
    }
}
