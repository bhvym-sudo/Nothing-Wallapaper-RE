package p165q4;

import U4.c;
import U4.d;
import androidx.appcompat.app.o;

/* JADX INFO: renamed from: q4.y1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1653y1 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final C1653y1 f24981a = new C1653y1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f24982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c f24983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final c f24984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final c f24985e;

    static {
        c.b bVarA = c.a("isChargingRequired");
        C1519f c1519f = new C1519f();
        c1519f.a(1);
        f24982b = bVarA.b(c1519f.b()).a();
        c.b bVarA2 = c.a("isWifiRequired");
        C1519f c1519f2 = new C1519f();
        c1519f2.a(2);
        f24983c = bVarA2.b(c1519f2.b()).a();
        c.b bVarA3 = c.a("isDeviceIdleRequired");
        C1519f c1519f3 = new C1519f();
        c1519f3.a(3);
        f24984d = bVarA3.b(c1519f3.b()).a();
        c.b bVarA4 = c.a("canDownloadInBackground");
        C1519f c1519f4 = new C1519f();
        c1519f4.a(4);
        f24985e = bVarA4.b(c1519f4.b()).a();
    }

    private C1653y1() {
    }

    @Override // U4.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        o.a(obj);
        throw null;
    }
}
