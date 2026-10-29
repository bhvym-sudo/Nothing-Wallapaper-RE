package p165q4;

import U4.c;
import U4.d;
import U4.e;

/* JADX INFO: loaded from: classes.dex */
final class C2 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final C2 f23927a = new C2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f23928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c f23929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final c f23930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final c f23931e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final c f23932f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final c f23933g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final c f23934h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final c f23935i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final c f23936j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final c f23937k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final c f23938l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final c f23939m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final c f23940n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final c f23941o;

    static {
        c.b bVarA = c.a("appId");
        C1519f c1519f = new C1519f();
        c1519f.a(1);
        f23928b = bVarA.b(c1519f.b()).a();
        c.b bVarA2 = c.a("appVersion");
        C1519f c1519f2 = new C1519f();
        c1519f2.a(2);
        f23929c = bVarA2.b(c1519f2.b()).a();
        c.b bVarA3 = c.a("firebaseProjectId");
        C1519f c1519f3 = new C1519f();
        c1519f3.a(3);
        f23930d = bVarA3.b(c1519f3.b()).a();
        c.b bVarA4 = c.a("mlSdkVersion");
        C1519f c1519f4 = new C1519f();
        c1519f4.a(4);
        f23931e = bVarA4.b(c1519f4.b()).a();
        c.b bVarA5 = c.a("tfliteSchemaVersion");
        C1519f c1519f5 = new C1519f();
        c1519f5.a(5);
        f23932f = bVarA5.b(c1519f5.b()).a();
        c.b bVarA6 = c.a("gcmSenderId");
        C1519f c1519f6 = new C1519f();
        c1519f6.a(6);
        f23933g = bVarA6.b(c1519f6.b()).a();
        c.b bVarA7 = c.a("apiKey");
        C1519f c1519f7 = new C1519f();
        c1519f7.a(7);
        f23934h = bVarA7.b(c1519f7.b()).a();
        c.b bVarA8 = c.a("languages");
        C1519f c1519f8 = new C1519f();
        c1519f8.a(8);
        f23935i = bVarA8.b(c1519f8.b()).a();
        c.b bVarA9 = c.a("mlSdkInstanceId");
        C1519f c1519f9 = new C1519f();
        c1519f9.a(9);
        f23936j = bVarA9.b(c1519f9.b()).a();
        c.b bVarA10 = c.a("isClearcutClient");
        C1519f c1519f10 = new C1519f();
        c1519f10.a(10);
        f23937k = bVarA10.b(c1519f10.b()).a();
        c.b bVarA11 = c.a("isStandaloneMlkit");
        C1519f c1519f11 = new C1519f();
        c1519f11.a(11);
        f23938l = bVarA11.b(c1519f11.b()).a();
        c.b bVarA12 = c.a("isJsonLogging");
        C1519f c1519f12 = new C1519f();
        c1519f12.a(12);
        f23939m = bVarA12.b(c1519f12.b()).a();
        c.b bVarA13 = c.a("buildLevel");
        C1519f c1519f13 = new C1519f();
        c1519f13.a(13);
        f23940n = bVarA13.b(c1519f13.b()).a();
        c.b bVarA14 = c.a("optionalModuleVersion");
        C1519f c1519f14 = new C1519f();
        c1519f14.a(14);
        f23941o = bVarA14.b(c1519f14.b()).a();
    }

    private C2() {
    }

    @Override // U4.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        N4 n9 = (N4) obj;
        e eVar = (e) obj2;
        eVar.b(f23928b, n9.g());
        eVar.b(f23929c, n9.h());
        eVar.b(f23930d, null);
        eVar.b(f23931e, n9.j());
        eVar.b(f23932f, n9.k());
        eVar.b(f23933g, null);
        eVar.b(f23934h, null);
        eVar.b(f23935i, n9.a());
        eVar.b(f23936j, n9.i());
        eVar.b(f23937k, n9.b());
        eVar.b(f23938l, n9.d());
        eVar.b(f23939m, n9.c());
        eVar.b(f23940n, n9.e());
        eVar.b(f23941o, n9.f());
    }
}
