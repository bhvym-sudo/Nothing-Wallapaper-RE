package p175r4;

/* JADX INFO: renamed from: r4.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1928u extends AbstractC1834k4 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final AbstractC1948w f27395s;

    C1928u(AbstractC1948w abstractC1948w, int i10) {
        super(abstractC1948w.size(), i10);
        this.f27395s = abstractC1948w;
    }

    @Override // p175r4.AbstractC1834k4
    protected final Object a(int i10) {
        return this.f27395s.get(i10);
    }
}
