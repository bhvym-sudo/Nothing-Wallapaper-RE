package androidx.lifecycle;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p002a1.f f13364a;

    public a0() {
        this.f13364a = new p002a1.f();
    }

    public final void a(String key, AutoCloseable closeable) {
        kotlin.jvm.internal.n.h(key, "key");
        kotlin.jvm.internal.n.h(closeable, "closeable");
        p002a1.f fVar = this.f13364a;
        if (fVar != null) {
            fVar.d(key, closeable);
        }
    }

    public final void b() {
        p002a1.f fVar = this.f13364a;
        if (fVar != null) {
            fVar.e();
        }
        d();
    }

    public final AutoCloseable c(String key) {
        kotlin.jvm.internal.n.h(key, "key");
        p002a1.f fVar = this.f13364a;
        if (fVar != null) {
            return fVar.g(key);
        }
        return null;
    }

    protected void d() {
    }

    public a0(AutoCloseable... closeables) {
        kotlin.jvm.internal.n.h(closeables, "closeables");
        this.f13364a = new p002a1.f((AutoCloseable[]) Arrays.copyOf(closeables, closeables.length));
    }
}
