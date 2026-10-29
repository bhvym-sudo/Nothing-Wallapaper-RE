package p165q4;

import U4.c;
import U4.d;
import U4.e;

/* JADX INFO: renamed from: q4.p1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1591p1 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final C1591p1 f24718a = new C1591p1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f24719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c f24720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final c f24721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final c f24722e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final c f24723f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final c f24724g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final c f24725h;

    static {
        c.b bVarA = c.a("durationMs");
        C1519f c1519f = new C1519f();
        c1519f.a(1);
        f24719b = bVarA.b(c1519f.b()).a();
        c.b bVarA2 = c.a("imageSource");
        C1519f c1519f2 = new C1519f();
        c1519f2.a(2);
        f24720c = bVarA2.b(c1519f2.b()).a();
        c.b bVarA3 = c.a("imageFormat");
        C1519f c1519f3 = new C1519f();
        c1519f3.a(3);
        f24721d = bVarA3.b(c1519f3.b()).a();
        c.b bVarA4 = c.a("imageByteSize");
        C1519f c1519f4 = new C1519f();
        c1519f4.a(4);
        f24722e = bVarA4.b(c1519f4.b()).a();
        c.b bVarA5 = c.a("imageWidth");
        C1519f c1519f5 = new C1519f();
        c1519f5.a(5);
        f24723f = bVarA5.b(c1519f5.b()).a();
        c.b bVarA6 = c.a("imageHeight");
        C1519f c1519f6 = new C1519f();
        c1519f6.a(6);
        f24724g = bVarA6.b(c1519f6.b()).a();
        c.b bVarA7 = c.a("rotationDegrees");
        C1519f c1519f7 = new C1519f();
        c1519f7.a(7);
        f24725h = bVarA7.b(c1519f7.b()).a();
    }

    private C1591p1() {
    }

    @Override // U4.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        A3 a10 = (A3) obj;
        e eVar = (e) obj2;
        eVar.b(f24719b, a10.g());
        eVar.b(f24720c, a10.b());
        eVar.b(f24721d, a10.a());
        eVar.b(f24722e, a10.c());
        eVar.b(f24723f, a10.e());
        eVar.b(f24724g, a10.d());
        eVar.b(f24725h, a10.f());
    }
}
