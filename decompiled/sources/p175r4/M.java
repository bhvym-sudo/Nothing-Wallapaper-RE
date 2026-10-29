package p175r4;

/* JADX INFO: loaded from: classes.dex */
final class M extends AbstractC1948w {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final AbstractC1948w f26064v = new M(new Object[0], 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final transient Object[] f26065t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final transient int f26066u;

    M(Object[] objArr, int i10) {
        this.f26065t = objArr;
        this.f26066u = i10;
    }

    @Override // p175r4.AbstractC1948w, p175r4.r
    final int a(Object[] objArr, int i10) {
        System.arraycopy(this.f26065t, 0, objArr, 0, this.f26066u);
        return this.f26066u;
    }

    @Override // p175r4.r
    final int b() {
        return this.f26066u;
    }

    @Override // p175r4.r
    final int e() {
        return 0;
    }

    @Override // p175r4.r
    final Object[] f() {
        return this.f26065t;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC1811i3.a(i10, this.f26066u, "index");
        Object obj = this.f26065t[i10];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26066u;
    }
}
