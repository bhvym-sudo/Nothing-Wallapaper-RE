package S3;

import T3.InterfaceC0949c;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class h implements U3.b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0949c f7254a;

    private h(InterfaceC0949c interfaceC0949c) {
        this.f7254a = interfaceC0949c;
    }

    public static U3.b.a b(InterfaceC0949c interfaceC0949c) {
        return new h(interfaceC0949c);
    }

    @Override // U3.b.a
    public Object a() {
        return Integer.valueOf(this.f7254a.c());
    }
}
