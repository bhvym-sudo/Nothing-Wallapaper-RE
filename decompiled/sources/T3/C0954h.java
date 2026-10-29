package T3;

/* JADX INFO: renamed from: T3.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0954h implements O3.b {

    /* JADX INFO: renamed from: T3.h$a */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final C0954h f7658a = new C0954h();
    }

    public static C0954h a() {
        return a.f7658a;
    }

    public static AbstractC0950d c() {
        return (AbstractC0950d) O3.d.c(AbstractC0951e.c(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p069g8.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC0950d get() {
        return c();
    }
}
