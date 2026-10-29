package L0;

/* JADX INFO: renamed from: L0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0929f extends D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f4305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f4306c;

    public C0929f(Object obj, int i10, int i11) {
        super(i11, null);
        this.f4305b = obj;
        this.f4306c = i10;
    }

    public final void b() {
        Object obj = this.f4305b;
        if ((obj != null ? obj.hashCode() : 0) != this.f4306c) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
    }

    public final Object c() {
        return this.f4305b;
    }
}
