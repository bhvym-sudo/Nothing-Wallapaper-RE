package p175r4;

import U4.c;
import U4.d;
import U4.e;

/* JADX INFO: loaded from: classes.dex */
final class B4 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final B4 f25830a = new B4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f25831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c f25832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final c f25833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final c f25834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final c f25835f;

    static {
        c.b bVarA = c.a("inferenceCommonLogEvent");
        C1731b0 c1731b0 = new C1731b0();
        c1731b0.a(1);
        f25831b = bVarA.b(c1731b0.b()).a();
        c.b bVarA2 = c.a("imageInfo");
        C1731b0 c1731b1 = new C1731b0();
        c1731b1.a(2);
        f25832c = bVarA2.b(c1731b1.b()).a();
        c.b bVarA3 = c.a("subjectSegmenterOptions");
        C1731b0 c1731b2 = new C1731b0();
        c1731b2.a(3);
        f25833d = bVarA3.b(c1731b2.b()).a();
        c.b bVarA4 = c.a("subjectInfos");
        C1731b0 c1731b3 = new C1731b0();
        c1731b3.a(4);
        f25834e = bVarA4.b(c1731b3.b()).a();
        c.b bVarA5 = c.a("qualityScores");
        C1731b0 c1731b4 = new C1731b0();
        c1731b4.a(5);
        f25835f = bVarA5.b(c1731b4.b()).a();
    }

    private B4() {
    }

    @Override // U4.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        U7 u9 = (U7) obj;
        e eVar = (e) obj2;
        eVar.b(f25831b, u9.d());
        eVar.b(f25832c, u9.c());
        eVar.b(f25833d, u9.e());
        eVar.b(f25834e, u9.b());
        eVar.b(f25835f, u9.a());
    }
}
