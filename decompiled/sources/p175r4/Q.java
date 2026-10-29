package p175r4;

/* JADX INFO: loaded from: classes.dex */
final class Q extends AbstractC1948w {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final transient Object[] f26151t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final transient int f26152u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final transient int f26153v;

    Q(Object[] objArr, int i10, int i11) {
        this.f26151t = objArr;
        this.f26152u = i10;
        this.f26153v = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC1811i3.a(i10, this.f26153v, "index");
        Object obj = this.f26151t[i10 + i10 + this.f26152u];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26153v;
    }
}
