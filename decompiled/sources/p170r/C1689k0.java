package p170r;

import kotlin.jvm.internal.n;

/* JADX INFO: renamed from: r.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1689k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25467a;

    public C1689k0(String str) {
        this.f25467a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1689k0) && n.d(this.f25467a, ((C1689k0) obj).f25467a);
    }

    public int hashCode() {
        return this.f25467a.hashCode();
    }

    public String toString() {
        return "OpaqueKey(key=" + this.f25467a + ')';
    }
}
