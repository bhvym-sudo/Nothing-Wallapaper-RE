package androidx.lifecycle;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class T implements InterfaceC1160u, Closeable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f13342q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Q f13343r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f13344s;

    public T(String key, Q handle) {
        kotlin.jvm.internal.n.h(key, "key");
        kotlin.jvm.internal.n.h(handle, "handle");
        this.f13342q = key;
        this.f13343r = handle;
    }

    public final void a(p082i1.d registry, AbstractC1157q lifecycle) {
        kotlin.jvm.internal.n.h(registry, "registry");
        kotlin.jvm.internal.n.h(lifecycle, "lifecycle");
        if (this.f13344s) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f13344s = true;
        lifecycle.a(this);
        registry.h(this.f13342q, this.f13343r.g());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final Q f() {
        return this.f13343r;
    }

    @Override // androidx.lifecycle.InterfaceC1160u
    public void onStateChanged(InterfaceC1163x source, AbstractC1157q.a event) {
        kotlin.jvm.internal.n.h(source, "source");
        kotlin.jvm.internal.n.h(event, "event");
        if (event == AbstractC1157q.a.ON_DESTROY) {
            this.f13344s = false;
            source.getLifecycle().d(this);
        }
    }

    public final boolean u() {
        return this.f13344s;
    }
}
