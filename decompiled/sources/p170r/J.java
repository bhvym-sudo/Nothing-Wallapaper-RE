package p170r;

import p219v8.a;

/* JADX INFO: loaded from: classes.dex */
public final class J extends AbstractC1708u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final R0 f25306b;

    public J(R0 r9, a aVar) {
        super(aVar);
        this.f25306b = r9;
    }

    @Override // p170r.AbstractC1708u0
    public C1710v0 c(Object obj) {
        return new C1710v0(this, obj, obj == null, this.f25306b, null, null, true);
    }
}
