package p011b0;

import kotlin.jvm.internal.n;
import p079h8.e;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f14551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f14552b;

    public a(String str, e eVar) {
        this.f14551a = str;
        this.f14552b = eVar;
    }

    public final e a() {
        return this.f14552b;
    }

    public final String b() {
        return this.f14551a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return n.d(this.f14551a, aVar.f14551a) && n.d(this.f14552b, aVar.f14552b);
    }

    public int hashCode() {
        String str = this.f14551a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        e eVar = this.f14552b;
        return iHashCode + (eVar != null ? eVar.hashCode() : 0);
    }

    public String toString() {
        return "AccessibilityAction(label=" + this.f14551a + ", action=" + this.f14552b + ')';
    }
}
