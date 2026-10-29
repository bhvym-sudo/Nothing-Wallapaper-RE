package p123m2;

import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f23214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f23215b;

    public b(String slotId, String affordanceId) {
        n.h(slotId, "slotId");
        n.h(affordanceId, "affordanceId");
        this.f23214a = slotId;
        this.f23215b = affordanceId;
    }

    public final String a() {
        return this.f23215b;
    }

    public final String b() {
        return this.f23214a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return n.d(this.f23214a, bVar.f23214a) && n.d(this.f23215b, bVar.f23215b);
    }

    public int hashCode() {
        return (this.f23214a.hashCode() * 31) + this.f23215b.hashCode();
    }

    public String toString() {
        return "KeyguardQuickAffordancePickerSelectionModel(slotId=" + this.f23214a + ", affordanceId=" + this.f23215b + ")";
    }
}
