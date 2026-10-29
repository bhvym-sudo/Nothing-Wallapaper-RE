package p175r4;

import U4.c;
import U4.d;
import U4.e;

/* JADX INFO: loaded from: classes.dex */
final class T1 implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final T1 f26230a = new T1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f26231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c f26232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final c f26233d;

    static {
        c.b bVarA = c.a("logEventKey");
        C1731b0 c1731b0 = new C1731b0();
        c1731b0.a(1);
        f26231b = bVarA.b(c1731b0.b()).a();
        c.b bVarA2 = c.a("eventCount");
        C1731b0 c1731b1 = new C1731b0();
        c1731b1.a(2);
        f26232c = bVarA2.b(c1731b1.b()).a();
        c.b bVarA3 = c.a("inferenceDurationStats");
        C1731b0 c1731b2 = new C1731b0();
        c1731b2.a(3);
        f26233d = bVarA3.b(c1731b2.b()).a();
    }

    private T1() {
    }

    @Override // U4.d
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        C1743c1 c1743c1 = (C1743c1) obj;
        e eVar = (e) obj2;
        eVar.b(f26231b, c1743c1.a());
        eVar.b(f26232c, c1743c1.c());
        eVar.b(f26233d, c1743c1.b());
    }
}
