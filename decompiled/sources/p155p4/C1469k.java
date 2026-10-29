package p155p4;

/* JADX INFO: renamed from: p4.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1469k extends AbstractC1463e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final AbstractC1471m f23731s;

    C1469k(AbstractC1471m abstractC1471m, int i10) {
        super(abstractC1471m.size(), i10);
        this.f23731s = abstractC1471m;
    }

    @Override // p155p4.AbstractC1463e
    protected final Object a(int i10) {
        return this.f23731s.get(i10);
    }
}
