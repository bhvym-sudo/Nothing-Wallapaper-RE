package p175r4;

import U4.c;
import U4.d;
import U4.e;

/* JADX INFO: loaded from: classes.dex */
final class N2 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final N2 f26087a = new N2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f26088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c f26089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final c f26090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final c f26091e;

    static {
        c.b bVarA = c.a("imageFormat");
        C1731b0 c1731b0 = new C1731b0();
        c1731b0.a(1);
        f26088b = bVarA.b(c1731b0.b()).a();
        c.b bVarA2 = c.a("originalImageSize");
        C1731b0 c1731b1 = new C1731b0();
        c1731b1.a(2);
        f26089c = bVarA2.b(c1731b1.b()).a();
        c.b bVarA3 = c.a("compressedImageSize");
        C1731b0 c1731b2 = new C1731b0();
        c1731b2.a(3);
        f26090d = bVarA3.b(c1731b2.b()).a();
        c.b bVarA4 = c.a("isOdmlImage");
        C1731b0 c1731b3 = new C1731b0();
        c1731b3.a(4);
        f26091e = bVarA4.b(c1731b3.b()).a();
    }

    private N2() {
    }

    @Override // U4.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        X5 x9 = (X5) obj;
        e eVar = (e) obj2;
        eVar.b(f26088b, x9.a());
        eVar.b(f26089c, x9.b());
        eVar.b(f26090d, null);
        eVar.b(f26091e, null);
    }
}
