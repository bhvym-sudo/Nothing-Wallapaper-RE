package p175r4;

import U4.c;
import U4.d;
import U4.e;

/* JADX INFO: loaded from: classes.dex */
final class X4 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final X4 f26337a = new X4();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f26338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c f26339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final c f26340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final c f26341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final c f26342f;

    static {
        c.b bVarA = c.a("isForegroundConfidenceMaskEnabled");
        C1731b0 c1731b0 = new C1731b0();
        c1731b0.a(1);
        f26338b = bVarA.b(c1731b0.b()).a();
        c.b bVarA2 = c.a("isForegroundBitmapEnabled");
        C1731b0 c1731b1 = new C1731b0();
        c1731b1.a(2);
        f26339c = bVarA2.b(c1731b1.b()).a();
        c.b bVarA3 = c.a("isMultipleSubjectsEnabled");
        C1731b0 c1731b2 = new C1731b0();
        c1731b2.a(3);
        f26340d = bVarA3.b(c1731b2.b()).a();
        c.b bVarA4 = c.a("isSubjectConfidenceMaskEnabled");
        C1731b0 c1731b3 = new C1731b0();
        c1731b3.a(4);
        f26341e = bVarA4.b(c1731b3.b()).a();
        c.b bVarA5 = c.a("isSubjectBitmapEnabled");
        C1731b0 c1731b4 = new C1731b0();
        c1731b4.a(5);
        f26342f = bVarA5.b(c1731b4.b()).a();
    }

    private X4() {
    }

    @Override // U4.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        C1907r8 c1907r8 = (C1907r8) obj;
        e eVar = (e) obj2;
        eVar.b(f26338b, c1907r8.b());
        eVar.b(f26339c, c1907r8.a());
        eVar.b(f26340d, c1907r8.c());
        eVar.b(f26341e, c1907r8.e());
        eVar.b(f26342f, c1907r8.d());
    }
}
