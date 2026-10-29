package U;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g f7751a = new g(a.f7753q);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final g f7752b = new g(C0284b.f7754q);

    /* synthetic */ class a extends kotlin.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final a f7753q = new a();

        a() {
            super(2, p239x8.a.class, "min", "min(II)I", 1);
        }

        public final Integer g(int i10, int i11) {
            return Integer.valueOf(Math.min(i10, i11));
        }

        @Override // p219v8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return g(((Number) obj).intValue(), ((Number) obj2).intValue());
        }
    }

    /* JADX INFO: renamed from: U.b$b, reason: collision with other inner class name */
    /* synthetic */ class C0284b extends kotlin.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final C0284b f7754q = new C0284b();

        C0284b() {
            super(2, p239x8.a.class, "max", "max(II)I", 1);
        }

        public final Integer g(int i10, int i11) {
            return Integer.valueOf(Math.max(i10, i11));
        }

        @Override // p219v8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return g(((Number) obj).intValue(), ((Number) obj2).intValue());
        }
    }

    public static final int a(U.a aVar, int i10, int i11) {
        return ((Number) aVar.a().invoke(Integer.valueOf(i10), Integer.valueOf(i11))).intValue();
    }
}
