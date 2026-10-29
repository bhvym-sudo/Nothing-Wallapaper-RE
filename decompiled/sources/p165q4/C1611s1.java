package p165q4;

import U4.c;
import U4.d;
import androidx.appcompat.app.o;

/* JADX INFO: renamed from: q4.s1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1611s1 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final C1611s1 f24756a = new C1611s1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f24757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c f24758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final c f24759d;

    static {
        c.b bVarA = c.a("identifyLanguageConfidenceThreshold");
        C1519f c1519f = new C1519f();
        c1519f.a(1);
        f24757b = bVarA.b(c1519f.b()).a();
        c.b bVarA2 = c.a("identifyAllLanguagesConfidenceThreshold");
        C1519f c1519f2 = new C1519f();
        c1519f2.a(2);
        f24758c = bVarA2.b(c1519f2.b()).a();
        c.b bVarA3 = c.a("confidenceThreshold");
        C1519f c1519f3 = new C1519f();
        c1519f3.a(3);
        f24759d = bVarA3.b(c1519f3.b()).a();
    }

    private C1611s1() {
    }

    @Override // U4.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        o.a(obj);
        throw null;
    }
}
