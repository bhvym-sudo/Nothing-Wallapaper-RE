package p175r4;

import U4.c;
import U4.d;
import U4.e;

/* JADX INFO: loaded from: classes.dex */
final class A4 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final A4 f25817a = new A4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f25818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c f25819c;

    static {
        c.b bVarA = c.a("errorCode");
        C1731b0 c1731b0 = new C1731b0();
        c1731b0.a(1);
        f25818b = bVarA.b(c1731b0.b()).a();
        c.b bVarA2 = c.a("subjectSegmenterOptions");
        C1731b0 c1731b1 = new C1731b0();
        c1731b1.a(2);
        f25819c = bVarA2.b(c1731b1.b()).a();
    }

    private A4() {
    }

    @Override // U4.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        Q7 q9 = (Q7) obj;
        e eVar = (e) obj2;
        eVar.b(f25818b, q9.a());
        eVar.b(f25819c, q9.b());
    }
}
