package p079h8;

import java.io.Serializable;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class u implements Serializable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Object f21873q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Object f21874r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Object f21875s;

    public u(Object obj, Object obj2, Object obj3) {
        this.f21873q = obj;
        this.f21874r = obj2;
        this.f21875s = obj3;
    }

    public final Object a() {
        return this.f21873q;
    }

    public final Object b() {
        return this.f21874r;
    }

    public final Object c() {
        return this.f21875s;
    }

    public final Object d() {
        return this.f21873q;
    }

    public final Object e() {
        return this.f21874r;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return n.d(this.f21873q, uVar.f21873q) && n.d(this.f21874r, uVar.f21874r) && n.d(this.f21875s, uVar.f21875s);
    }

    public final Object f() {
        return this.f21875s;
    }

    public int hashCode() {
        Object obj = this.f21873q;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f21874r;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f21875s;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f21873q + ", " + this.f21874r + ", " + this.f21875s + ')';
    }
}
