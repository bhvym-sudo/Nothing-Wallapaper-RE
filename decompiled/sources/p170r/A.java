package p170r;

import kotlin.jvm.internal.n;
import p219v8.l;

/* JADX INFO: loaded from: classes.dex */
public final class A implements g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f25194a;

    public A(l lVar) {
        this.f25194a = lVar;
    }

    @Override // p170r.g1
    public Object a(InterfaceC1699p0 interfaceC1699p0) {
        return this.f25194a.f(interfaceC1699p0);
    }

    public final l b() {
        return this.f25194a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof A) && n.d(this.f25194a, ((A) obj).f25194a);
    }

    public int hashCode() {
        return this.f25194a.hashCode();
    }

    public String toString() {
        return "ComputedValueHolder(compute=" + this.f25194a + ')';
    }
}
