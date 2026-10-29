package O2;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f5829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f5830b;

    public y(boolean z9, Integer num) {
        this.f5829a = z9;
        this.f5830b = num;
    }

    public static /* synthetic */ y b(y yVar, boolean z9, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = yVar.f5829a;
        }
        if ((i10 & 2) != 0) {
            num = yVar.f5830b;
        }
        return yVar.a(z9, num);
    }

    public final y a(boolean z9, Integer num) {
        return new y(z9, num);
    }

    public final boolean c() {
        return this.f5829a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f5829a == yVar.f5829a && kotlin.jvm.internal.n.d(this.f5830b, yVar.f5830b);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.f5829a) * 31;
        Integer num = this.f5830b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "ThemeConfig(isDarkTheme=" + this.f5829a + ", seedColor=" + this.f5830b + ")";
    }
}
