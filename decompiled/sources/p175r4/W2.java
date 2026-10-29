package p175r4;

import U4.c;
import U4.d;
import androidx.appcompat.app.o;

/* JADX INFO: loaded from: classes.dex */
final class W2 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final W2 f26315a = new W2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f26316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c f26317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final c f26318d;

    static {
        c.b bVarA = c.a("identifyLanguageConfidenceThreshold");
        C1731b0 c1731b0 = new C1731b0();
        c1731b0.a(1);
        f26316b = bVarA.b(c1731b0.b()).a();
        c.b bVarA2 = c.a("identifyAllLanguagesConfidenceThreshold");
        C1731b0 c1731b1 = new C1731b0();
        c1731b1.a(2);
        f26317c = bVarA2.b(c1731b1.b()).a();
        c.b bVarA3 = c.a("confidenceThreshold");
        C1731b0 c1731b2 = new C1731b0();
        c1731b2.a(3);
        f26318d = bVarA3.b(c1731b2.b()).a();
    }

    private W2() {
    }

    @Override // U4.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        o.a(obj);
        throw null;
    }
}
