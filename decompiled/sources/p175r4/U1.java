package p175r4;

import U4.c;
import U4.d;
import U4.e;

/* JADX INFO: loaded from: classes.dex */
final class U1 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final U1 f26254a = new U1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f26255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c f26256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final c f26257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final c f26258e;

    static {
        c.b bVarA = c.a("errorCode");
        C1731b0 c1731b0 = new C1731b0();
        c1731b0.a(1);
        f26255b = bVarA.b(c1731b0.b()).a();
        c.b bVarA2 = c.a("isColdCall");
        C1731b0 c1731b1 = new C1731b0();
        c1731b1.a(2);
        f26256c = bVarA2.b(c1731b1.b()).a();
        c.b bVarA3 = c.a("imageInfo");
        C1731b0 c1731b2 = new C1731b0();
        c1731b2.a(3);
        f26257d = bVarA3.b(c1731b2.b()).a();
        c.b bVarA4 = c.a("subjectSegmenterOptions");
        C1731b0 c1731b3 = new C1731b0();
        c1731b3.a(4);
        f26258e = bVarA4.b(c1731b3.b()).a();
    }

    private U1() {
    }

    @Override // U4.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        C1721a1 c1721a1 = (C1721a1) obj;
        e eVar = (e) obj2;
        eVar.b(f26255b, c1721a1.a());
        eVar.b(f26256c, c1721a1.c());
        eVar.b(f26257d, null);
        eVar.b(f26258e, c1721a1.b());
    }
}
