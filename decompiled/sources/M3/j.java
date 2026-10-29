package M3;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class j implements O3.b {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final j f4969a = new j();
    }

    public static j a() {
        return a.f4969a;
    }

    public static Executor b() {
        return (Executor) O3.d.c(i.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p069g8.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return b();
    }
}
