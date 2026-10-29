package T3;

/* JADX INFO: renamed from: T3.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0952f implements O3.b {

    /* JADX INFO: renamed from: T3.f$a */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final C0952f f7656a = new C0952f();
    }

    public static C0952f a() {
        return a.f7656a;
    }

    public static String b() {
        return (String) O3.d.c(AbstractC0951e.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p069g8.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String get() {
        return b();
    }
}
