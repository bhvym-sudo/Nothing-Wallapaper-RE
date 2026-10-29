package p062g1;

import kotlin.jvm.internal.n;
import p142o1.h;

/* JADX INFO: loaded from: classes.dex */
public final class e implements h.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h.c f21033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f21034b;

    public e(h.c delegate, c autoCloser) {
        n.h(delegate, "delegate");
        n.h(autoCloser, "autoCloser");
        this.f21033a = delegate;
        this.f21034b = autoCloser;
    }

    @Override // o1.h.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d a(h.b configuration) {
        n.h(configuration, "configuration");
        return new d(this.f21033a.a(configuration), this.f21034b);
    }
}
