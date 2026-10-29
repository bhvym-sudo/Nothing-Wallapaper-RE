package W;

/* JADX INFO: loaded from: classes.dex */
public final class O {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f8454c = p190t.b.f27838t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p190t.b f8455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p219v8.a f8456b;

    public O(p190t.b bVar, p219v8.a aVar) {
        this.f8455a = bVar;
        this.f8456b = aVar;
    }

    public final void a(int i10, Object obj) {
        this.f8455a.a(i10, obj);
        this.f8456b.invoke();
    }

    public final void b() {
        this.f8455a.j();
        this.f8456b.invoke();
    }

    public final Object c(int i10) {
        return this.f8455a.o()[i10];
    }

    public final int d() {
        return this.f8455a.p();
    }

    public final p190t.b e() {
        return this.f8455a;
    }

    public final Object f(int i10) {
        Object objW = this.f8455a.w(i10);
        this.f8456b.invoke();
        return objW;
    }
}
