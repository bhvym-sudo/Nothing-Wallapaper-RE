package p170r;

import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f25394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f25395b;

    public U(Object obj, Object obj2) {
        this.f25394a = obj;
        this.f25395b = obj2;
    }

    private final int a(Object obj) {
        if (obj instanceof Enum) {
            return ((Enum) obj).ordinal();
        }
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U)) {
            return false;
        }
        U u9 = (U) obj;
        return n.d(this.f25394a, u9.f25394a) && n.d(this.f25395b, u9.f25395b);
    }

    public int hashCode() {
        return (a(this.f25394a) * 31) + a(this.f25395b);
    }

    public String toString() {
        return "JoinedKey(left=" + this.f25394a + ", right=" + this.f25395b + ')';
    }
}
