package S4;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class e implements Y4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7304a;

    private e(String str) {
        this.f7304a = str;
    }

    public static Y4.b a(String str) {
        return new e(str);
    }

    @Override // Y4.b
    public Object get() {
        return f.c(this.f7304a);
    }
}
