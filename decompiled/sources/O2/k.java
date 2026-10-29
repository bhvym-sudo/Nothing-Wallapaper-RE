package O2;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f5783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f5784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f5785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f5786d;

    public k(w tickRate, boolean z9, boolean z10, boolean z11) {
        kotlin.jvm.internal.n.h(tickRate, "tickRate");
        this.f5783a = tickRate;
        this.f5784b = z9;
        this.f5785c = z10;
        this.f5786d = z11;
    }

    public final w a() {
        return this.f5783a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f5783a == kVar.f5783a && this.f5784b == kVar.f5784b && this.f5785c == kVar.f5785c && this.f5786d == kVar.f5786d;
    }

    public int hashCode() {
        return (((((this.f5783a.hashCode() * 31) + Boolean.hashCode(this.f5784b)) * 31) + Boolean.hashCode(this.f5785c)) * 31) + Boolean.hashCode(this.f5786d);
    }

    public String toString() {
        return "ClockFaceConfig(tickRate=" + this.f5783a + ", hasCustomWeatherDataDisplay=" + this.f5784b + ", hasCustomPositionUpdatedAnimation=" + this.f5785c + ", useCustomClockScene=" + this.f5786d + ")";
    }

    public /* synthetic */ k(w wVar, boolean z9, boolean z10, boolean z11, int i10, AbstractC1457h abstractC1457h) {
        this((i10 & 1) != 0 ? w.PER_MINUTE : wVar, (i10 & 2) != 0 ? false : z9, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? false : z11);
    }
}
