package p170r;

import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class K implements g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1683h0 f25310a;

    public K(InterfaceC1683h0 interfaceC1683h0) {
        this.f25310a = interfaceC1683h0;
    }

    @Override // p170r.g1
    public Object a(InterfaceC1699p0 interfaceC1699p0) {
        return this.f25310a.getValue();
    }

    public final InterfaceC1683h0 b() {
        return this.f25310a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof K) && n.d(this.f25310a, ((K) obj).f25310a);
    }

    public int hashCode() {
        return this.f25310a.hashCode();
    }

    public String toString() {
        return "DynamicValueHolder(state=" + this.f25310a + ')';
    }
}
