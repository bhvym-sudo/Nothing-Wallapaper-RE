package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final G f22780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C8.c[] f22781b;

    static {
        G g10 = null;
        try {
            g10 = (G) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (g10 == null) {
            g10 = new G();
        }
        f22780a = g10;
        f22781b = new C8.c[0];
    }

    public static C8.e a(k kVar) {
        return f22780a.a(kVar);
    }

    public static C8.c b(Class cls) {
        return f22780a.b(cls);
    }

    public static C8.d c(Class cls) {
        return f22780a.c(cls, "");
    }

    public static C8.f d(p pVar) {
        return f22780a.d(pVar);
    }

    public static C8.g e(r rVar) {
        return f22780a.e(rVar);
    }

    public static C8.h f(v vVar) {
        return f22780a.f(vVar);
    }

    public static C8.j g(x xVar) {
        return f22780a.g(xVar);
    }

    public static String h(j jVar) {
        return f22780a.h(jVar);
    }

    public static String i(o oVar) {
        return f22780a.i(oVar);
    }
}
