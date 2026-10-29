package p175r4;

import U4.c;
import U4.d;
import U4.e;

/* JADX INFO: loaded from: classes.dex */
final class V4 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final V4 f26289a = new V4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f26290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c f26291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final c f26292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final c f26293e;

    static {
        c.b bVarA = c.a("width");
        C1731b0 c1731b0 = new C1731b0();
        c1731b0.a(1);
        f26290b = bVarA.b(c1731b0.b()).a();
        c.b bVarA2 = c.a("height");
        C1731b0 c1731b1 = new C1731b0();
        c1731b1.a(2);
        f26291c = bVarA2.b(c1731b1.b()).a();
        c.b bVarA3 = c.a("startX");
        C1731b0 c1731b2 = new C1731b0();
        c1731b2.a(3);
        f26292d = bVarA3.b(c1731b2.b()).a();
        c.b bVarA4 = c.a("startY");
        C1731b0 c1731b3 = new C1731b0();
        c1731b3.a(4);
        f26293e = bVarA4.b(c1731b3.b()).a();
    }

    private V4() {
    }

    @Override // U4.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        C1868n8 c1868n8 = (C1868n8) obj;
        e eVar = (e) obj2;
        eVar.b(f26290b, c1868n8.d());
        eVar.b(f26291c, c1868n8.a());
        eVar.b(f26292d, c1868n8.b());
        eVar.b(f26293e, c1868n8.c());
    }
}
