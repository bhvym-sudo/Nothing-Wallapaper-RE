package p170r;

import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class d1 implements g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f25436a;

    public d1(Object obj) {
        this.f25436a = obj;
    }

    @Override // p170r.g1
    public Object a(InterfaceC1699p0 interfaceC1699p0) {
        return this.f25436a;
    }

    public final Object b() {
        return this.f25436a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d1) && n.d(this.f25436a, ((d1) obj).f25436a);
    }

    public int hashCode() {
        Object obj = this.f25436a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "StaticValueHolder(value=" + this.f25436a + ')';
    }
}
