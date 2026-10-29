package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class u implements InterfaceC1454e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Class f22802q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final String f22803r;

    public u(Class jClass, String moduleName) {
        n.h(jClass, "jClass");
        n.h(moduleName, "moduleName");
        this.f22802q = jClass;
        this.f22803r = moduleName;
    }

    @Override // kotlin.jvm.internal.InterfaceC1454e
    public Class e() {
        return this.f22802q;
    }

    public boolean equals(Object obj) {
        return (obj instanceof u) && n.d(e(), ((u) obj).e());
    }

    public int hashCode() {
        return e().hashCode();
    }

    public String toString() {
        return e() + " (Kotlin reflection is not available)";
    }
}
