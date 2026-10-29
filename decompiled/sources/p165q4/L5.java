package p165q4;

/* JADX INFO: loaded from: classes.dex */
final class L5 extends I2 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final N5 f24284s;

    L5(N5 n9, int i10) {
        super(n9.size(), i10);
        this.f24284s = n9;
    }

    @Override // p165q4.I2
    protected final Object a(int i10) {
        return this.f24284s.get(i10);
    }
}
