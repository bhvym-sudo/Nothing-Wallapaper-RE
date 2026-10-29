package p165q4;

/* JADX INFO: loaded from: classes.dex */
final class S5 extends N5 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final N5 f24365u = new S5(new Object[0], 0);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final transient Object[] f24366s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final transient int f24367t;

    S5(Object[] objArr, int i10) {
        this.f24366s = objArr;
        this.f24367t = i10;
    }

    @Override // p165q4.N5, p165q4.M4
    final int a(Object[] objArr, int i10) {
        System.arraycopy(this.f24366s, 0, objArr, 0, this.f24367t);
        return this.f24367t;
    }

    @Override // p165q4.M4
    final int b() {
        return this.f24367t;
    }

    @Override // p165q4.M4
    final int e() {
        return 0;
    }

    @Override // p165q4.M4
    final Object[] f() {
        return this.f24366s;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        G1.a(i10, this.f24367t, "index");
        Object obj = this.f24366s[i10];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f24367t;
    }
}
