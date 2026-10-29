package p155p4;

/* JADX INFO: renamed from: p4.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1480w extends AbstractC1471m {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final transient Object[] f23756t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final transient int f23757u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final transient int f23758v;

    C1480w(Object[] objArr, int i10, int i11) {
        this.f23756t = objArr;
        this.f23757u = i10;
        this.f23758v = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC1461c.a(i10, this.f23758v, "index");
        Object obj = this.f23756t[i10 + i10 + this.f23757u];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23758v;
    }
}
