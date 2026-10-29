package p002a1;

import F8.B0;
import F8.L;
import kotlin.jvm.internal.n;
import p129m8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements AutoCloseable, L {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final i f9594q;

    public a(i coroutineContext) {
        n.h(coroutineContext, "coroutineContext");
        this.f9594q = coroutineContext;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        B0.f(w0(), null, 1, null);
    }

    @Override // F8.L
    public i w0() {
        return this.f9594q;
    }
}
