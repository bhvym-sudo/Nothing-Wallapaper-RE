package Q2;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f6820a = new z();

    private z() {
    }

    public final void a(O2.f fVar, H2.a def, Float f10) {
        kotlin.jvm.internal.n.h(fVar, "<this>");
        kotlin.jvm.internal.n.h(def, "def");
        fVar.g(def.e(), f10 != null ? f10.floatValue() : def.b());
    }

    public final O2.n b(H2.a aVar, O2.c type, Float f10, String name, String description) {
        kotlin.jvm.internal.n.h(aVar, "<this>");
        kotlin.jvm.internal.n.h(type, "type");
        kotlin.jvm.internal.n.h(name, "name");
        kotlin.jvm.internal.n.h(description, "description");
        return new O2.n(aVar.e(), type, aVar.c(), aVar.d(), f10 != null ? f10.floatValue() : aVar.b(), name, description);
    }
}
