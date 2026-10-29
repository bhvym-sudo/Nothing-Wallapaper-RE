package M8;

import F8.AbstractC0829o0;
import F8.I;
import K8.E;
import K8.G;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends AbstractC0829o0 implements Executor {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b f5152t = new b();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final I f5153u = I.k1(k.f5170s, G.e("kotlinx.coroutines.io.parallelism", B8.h.f(64, E.a()), 0, 0, 12, null), null, 2, null);

    private b() {
    }

    @Override // F8.AbstractC0829o0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        g1(p129m8.j.f23252q, runnable);
    }

    @Override // F8.I
    public void g1(p129m8.i iVar, Runnable runnable) {
        f5153u.g1(iVar, runnable);
    }

    @Override // F8.I
    public void h1(p129m8.i iVar, Runnable runnable) {
        f5153u.h1(iVar, runnable);
    }

    @Override // F8.I
    public I j1(int i10, String str) {
        return k.f5170s.j1(i10, str);
    }

    @Override // F8.I
    public String toString() {
        return "Dispatchers.IO";
    }
}
