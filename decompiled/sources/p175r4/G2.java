package p175r4;

import U4.c;
import U4.d;
import U4.e;

/* JADX INFO: loaded from: classes.dex */
final class G2 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final G2 f25944a = new G2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f25945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c f25946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final c f25947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final c f25948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final c f25949f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final c f25950g;

    static {
        c.b bVarA = c.a("maxMs");
        C1731b0 c1731b0 = new C1731b0();
        c1731b0.a(1);
        f25945b = bVarA.b(c1731b0.b()).a();
        c.b bVarA2 = c.a("minMs");
        C1731b0 c1731b1 = new C1731b0();
        c1731b1.a(2);
        f25946c = bVarA2.b(c1731b1.b()).a();
        c.b bVarA3 = c.a("avgMs");
        C1731b0 c1731b2 = new C1731b0();
        c1731b2.a(3);
        f25947d = bVarA3.b(c1731b2.b()).a();
        c.b bVarA4 = c.a("firstQuartileMs");
        C1731b0 c1731b3 = new C1731b0();
        c1731b3.a(4);
        f25948e = bVarA4.b(c1731b3.b()).a();
        c.b bVarA5 = c.a("medianMs");
        C1731b0 c1731b4 = new C1731b0();
        c1731b4.a(5);
        f25949f = bVarA5.b(c1731b4.b()).a();
        c.b bVarA6 = c.a("thirdQuartileMs");
        C1731b0 c1731b5 = new C1731b0();
        c1731b5.a(6);
        f25950g = bVarA6.b(c1731b5.b()).a();
    }

    private G2() {
    }

    @Override // U4.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        Q5 q9 = (Q5) obj;
        e eVar = (e) obj2;
        eVar.b(f25945b, q9.c());
        eVar.b(f25946c, q9.e());
        eVar.b(f25947d, q9.a());
        eVar.b(f25948e, q9.b());
        eVar.b(f25949f, q9.d());
        eVar.b(f25950g, q9.f());
    }
}
