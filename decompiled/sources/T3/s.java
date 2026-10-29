package T3;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class s implements B.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H f7672a;

    private s(H h10) {
        this.f7672a = h10;
    }

    public static B.d b(H h10) {
        return new s(h10);
    }

    @Override // T3.B.d
    public Object a() {
        return this.f7672a.getWritableDatabase();
    }
}
