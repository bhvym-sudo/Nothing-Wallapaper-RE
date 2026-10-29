package V3;

/* JADX INFO: loaded from: classes.dex */
public final class d implements O3.b {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final d f8192a = new d();
    }

    public static d a() {
        return a.f8192a;
    }

    public static V3.a c() {
        return (V3.a) O3.d.c(b.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p069g8.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public V3.a get() {
        return c();
    }
}
