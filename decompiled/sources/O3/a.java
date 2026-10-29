package O3;

/* JADX INFO: loaded from: classes.dex */
public final class a implements p069g8.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f5875c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile p069g8.a f5876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f5877b = f5875c;

    private a(p069g8.a aVar) {
        this.f5876a = aVar;
    }

    public static p069g8.a a(p069g8.a aVar) {
        d.b(aVar);
        return aVar instanceof a ? aVar : new a(aVar);
    }

    public static Object b(Object obj, Object obj2) {
        if (obj == f5875c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // p069g8.a
    public Object get() {
        Object obj;
        Object obj2 = this.f5877b;
        Object obj3 = f5875c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f5877b;
                if (obj == obj3) {
                    obj = this.f5876a.get();
                    this.f5877b = b(this.f5877b, obj);
                    this.f5876a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
