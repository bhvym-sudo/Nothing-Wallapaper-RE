package p165q4;

import U4.c;
import U4.d;
import androidx.appcompat.app.o;

/* JADX INFO: loaded from: classes.dex */
final class C1 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final C1 f23924a = new C1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f23925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c f23926c;

    static {
        c.b bVarA = c.a("deviceInfos");
        C1519f c1519f = new C1519f();
        c1519f.a(1);
        f23925b = bVarA.b(c1519f.b()).a();
        c.b bVarA2 = c.a("errorInfo");
        C1519f c1519f2 = new C1519f();
        c1519f2.a(2);
        f23926c = bVarA2.b(c1519f2.b()).a();
    }

    private C1() {
    }

    @Override // U4.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        o.a(obj);
        throw null;
    }
}
