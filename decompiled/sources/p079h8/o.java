package p079h8;

import java.io.Serializable;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements Serializable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Object f21860q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Object f21861r;

    public o(Object obj, Object obj2) {
        this.f21860q = obj;
        this.f21861r = obj2;
    }

    public final Object a() {
        return this.f21860q;
    }

    public final Object b() {
        return this.f21861r;
    }

    public final Object c() {
        return this.f21860q;
    }

    public final Object d() {
        return this.f21861r;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return n.d(this.f21860q, oVar.f21860q) && n.d(this.f21861r, oVar.f21861r);
    }

    public int hashCode() {
        Object obj = this.f21860q;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f21861r;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f21860q + ", " + this.f21861r + ')';
    }
}
