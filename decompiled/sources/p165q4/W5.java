package p165q4;

/* JADX INFO: loaded from: classes.dex */
final class W5 extends N5 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final transient Object[] f24419s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final transient int f24420t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final transient int f24421u;

    W5(Object[] objArr, int i10, int i11) {
        this.f24419s = objArr;
        this.f24420t = i10;
        this.f24421u = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        G1.a(i10, this.f24421u, "index");
        Object obj = this.f24419s[i10 + i10 + this.f24420t];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24421u;
    }
}
