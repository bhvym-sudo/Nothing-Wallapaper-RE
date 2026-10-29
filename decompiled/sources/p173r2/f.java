package p173r2;

import kotlin.jvm.internal.n;
import p164q3.a;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f25762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p144o3.a f25763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p144o3.a f25764c;

    public f(a description, p144o3.a aVar, p144o3.a aVar2) {
        n.h(description, "description");
        this.f25762a = description;
        this.f25763b = aVar;
        this.f25764c = aVar2;
    }

    public final a a() {
        return this.f25762a;
    }

    public final p144o3.a b() {
        return this.f25763b;
    }

    public final p144o3.a c() {
        return this.f25764c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return n.d(this.f25762a, fVar.f25762a) && n.d(this.f25763b, fVar.f25763b) && n.d(this.f25764c, fVar.f25764c);
    }

    public int hashCode() {
        int iHashCode = this.f25762a.hashCode() * 31;
        p144o3.a aVar = this.f25763b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        p144o3.a aVar2 = this.f25764c;
        return iHashCode2 + (aVar2 != null ? aVar2.hashCode() : 0);
    }

    public String toString() {
        return "KeyguardQuickAffordanceSummaryViewModel(description=" + this.f25762a + ", icon1=" + this.f25763b + ", icon2=" + this.f25764c + ")";
    }
}
