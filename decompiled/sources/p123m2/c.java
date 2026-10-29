package p123m2;

import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f23216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f23217b;

    public c(String id, int i10) {
        n.h(id, "id");
        this.f23216a = id;
        this.f23217b = i10;
    }

    public final String a() {
        return this.f23216a;
    }

    public final int b() {
        return this.f23217b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return n.d(this.f23216a, cVar.f23216a) && this.f23217b == cVar.f23217b;
    }

    public int hashCode() {
        return (this.f23216a.hashCode() * 31) + Integer.hashCode(this.f23217b);
    }

    public String toString() {
        return "KeyguardQuickAffordancePickerSlotModel(id=" + this.f23216a + ", maxSelectedQuickAffordances=" + this.f23217b + ")";
    }
}
