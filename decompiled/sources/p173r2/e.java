package p173r2;

import java.util.List;
import kotlin.jvm.internal.n;
import p219v8.a;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f25758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f25759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f25760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f25761e;

    public e(String name, boolean z9, List selectedQuickAffordances, int i10, a aVar) {
        n.h(name, "name");
        n.h(selectedQuickAffordances, "selectedQuickAffordances");
        this.f25757a = name;
        this.f25758b = z9;
        this.f25759c = selectedQuickAffordances;
        this.f25760d = i10;
        this.f25761e = aVar;
    }

    public final String a() {
        return this.f25757a;
    }

    public final a b() {
        return this.f25761e;
    }

    public final List c() {
        return this.f25759c;
    }

    public final boolean d() {
        return this.f25758b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return n.d(this.f25757a, eVar.f25757a) && this.f25758b == eVar.f25758b && n.d(this.f25759c, eVar.f25759c) && this.f25760d == eVar.f25760d && n.d(this.f25761e, eVar.f25761e);
    }

    public int hashCode() {
        int iHashCode = ((((((this.f25757a.hashCode() * 31) + Boolean.hashCode(this.f25758b)) * 31) + this.f25759c.hashCode()) * 31) + Integer.hashCode(this.f25760d)) * 31;
        a aVar = this.f25761e;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "KeyguardQuickAffordanceSlotViewModel(name=" + this.f25757a + ", isSelected=" + this.f25758b + ", selectedQuickAffordances=" + this.f25759c + ", maxSelectedQuickAffordances=" + this.f25760d + ", onClicked=" + this.f25761e + ")";
    }
}
