package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1145e implements InterfaceC1160u {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final InterfaceC1154n[] f13403q;

    public C1145e(InterfaceC1154n[] generatedAdapters) {
        kotlin.jvm.internal.n.h(generatedAdapters, "generatedAdapters");
        this.f13403q = generatedAdapters;
    }

    @Override // androidx.lifecycle.InterfaceC1160u
    public void onStateChanged(InterfaceC1163x source, AbstractC1157q.a event) {
        kotlin.jvm.internal.n.h(source, "source");
        kotlin.jvm.internal.n.h(event, "event");
        new G();
        InterfaceC1154n[] interfaceC1154nArr = this.f13403q;
        if (interfaceC1154nArr.length > 0) {
            InterfaceC1154n interfaceC1154n = interfaceC1154nArr[0];
            throw null;
        }
        if (interfaceC1154nArr.length <= 0) {
            return;
        }
        InterfaceC1154n interfaceC1154n2 = interfaceC1154nArr[0];
        throw null;
    }
}
