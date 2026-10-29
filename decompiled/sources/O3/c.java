package O3;

/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f5878b = new c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f5879a;

    private c(Object obj) {
        this.f5879a = obj;
    }

    public static b a(Object obj) {
        return new c(d.c(obj, "instance cannot be null"));
    }

    @Override // p069g8.a
    public Object get() {
        return this.f5879a;
    }
}
