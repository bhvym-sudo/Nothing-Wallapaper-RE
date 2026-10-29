package p175r4;

import U4.c;
import U4.d;
import U4.e;

/* JADX INFO: loaded from: classes.dex */
final class C4 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final C4 f25859a = new C4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f25860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c f25861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final c f25862d;

    static {
        c.b bVarA = c.a("errorCode");
        C1731b0 c1731b0 = new C1731b0();
        c1731b0.a(1);
        f25860b = bVarA.b(c1731b0.b()).a();
        c.b bVarA2 = c.a("durationMs");
        C1731b0 c1731b1 = new C1731b0();
        c1731b1.a(2);
        f25861c = bVarA2.b(c1731b1.b()).a();
        c.b bVarA3 = c.a("subjectSegmenterOptions");
        C1731b0 c1731b2 = new C1731b0();
        c1731b2.a(3);
        f25862d = bVarA3.b(c1731b2.b()).a();
    }

    private C4() {
    }

    @Override // U4.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        X7 x9 = (X7) obj;
        e eVar = (e) obj2;
        eVar.b(f25860b, x9.a());
        eVar.b(f25861c, x9.c());
        eVar.b(f25862d, x9.b());
    }
}
