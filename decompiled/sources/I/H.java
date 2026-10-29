package I;

/* JADX INFO: loaded from: classes.dex */
public interface H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f2648a = a.f2649a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f2649a = new a();

        private a() {
        }
    }

    public enum b {
        CounterClockwise,
        Clockwise
    }

    static /* synthetic */ void c(H h10, H.i iVar, b bVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRect");
        }
        if ((i10 & 2) != 0) {
            bVar = b.CounterClockwise;
        }
        h10.h(iVar, bVar);
    }

    static /* synthetic */ void e(H h10, H.k kVar, b bVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRoundRect");
        }
        if ((i10 & 2) != 0) {
            bVar = b.CounterClockwise;
        }
        h10.i(kVar, bVar);
    }

    void b();

    H.i d();

    boolean f(H h10, H h11, int i10);

    void g();

    void h(H.i iVar, b bVar);

    void i(H.k kVar, b bVar);

    boolean isEmpty();
}
