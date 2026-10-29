package C7;

import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f681b;

    public c(String id, int i10) {
        n.h(id, "id");
        this.f680a = id;
        this.f681b = i10;
    }

    public final String a() {
        return this.f680a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return n.d(this.f680a, cVar.f680a) && this.f681b == cVar.f681b;
    }

    public int hashCode() {
        return (this.f680a.hashCode() * 31) + Integer.hashCode(this.f681b);
    }

    public String toString() {
        return "SlotInfo(id=" + this.f680a + ", maxSelectedQuickAffordances=" + this.f681b + ")";
    }
}
