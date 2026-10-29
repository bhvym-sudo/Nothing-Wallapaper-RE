package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class S implements InterfaceC1160u {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final V f13341q;

    public S(V provider) {
        kotlin.jvm.internal.n.h(provider, "provider");
        this.f13341q = provider;
    }

    @Override // androidx.lifecycle.InterfaceC1160u
    public void onStateChanged(InterfaceC1163x source, AbstractC1157q.a event) {
        kotlin.jvm.internal.n.h(source, "source");
        kotlin.jvm.internal.n.h(event, "event");
        if (event == AbstractC1157q.a.ON_CREATE) {
            source.getLifecycle().d(this);
            this.f13341q.c();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
        }
    }
}
