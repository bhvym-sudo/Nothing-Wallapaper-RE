package p155p4;

/* JADX INFO: renamed from: p4.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1476s extends AbstractC1471m {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final AbstractC1471m f23747v = new C1476s(new Object[0], 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final transient Object[] f23748t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final transient int f23749u;

    C1476s(Object[] objArr, int i10) {
        this.f23748t = objArr;
        this.f23749u = i10;
    }

    @Override // p155p4.AbstractC1471m, p155p4.AbstractC1468j
    final int a(Object[] objArr, int i10) {
        System.arraycopy(this.f23748t, 0, objArr, 0, this.f23749u);
        return this.f23749u;
    }

    @Override // p155p4.AbstractC1468j
    final int b() {
        return this.f23749u;
    }

    @Override // p155p4.AbstractC1468j
    final int e() {
        return 0;
    }

    @Override // p155p4.AbstractC1468j
    final Object[] f() {
        return this.f23748t;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC1461c.a(i10, this.f23749u, "index");
        Object obj = this.f23748t[i10];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23749u;
    }
}
