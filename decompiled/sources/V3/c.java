package V3;

/* JADX INFO: loaded from: classes.dex */
public final class c implements O3.b {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final c f8191a = new c();
    }

    public static c a() {
        return a.f8191a;
    }

    public static V3.a b() {
        return (V3.a) O3.d.c(b.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p069g8.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public V3.a get() {
        return b();
    }
}
