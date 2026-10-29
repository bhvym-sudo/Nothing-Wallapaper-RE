package Y5;

import androidx.constraintlayout.core.widgets.Optimizer;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f9349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f9350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f9351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f9352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f9353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f9354f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f9355g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f9356h;

    public a(long j9, String str, int i10, int i11, int i12, int i13, String str2, int i14) {
        this.f9349a = j9;
        this.f9350b = str;
        this.f9351c = i10;
        this.f9352d = i11;
        this.f9353e = i12;
        this.f9354f = i13;
        this.f9355g = str2;
        this.f9356h = i14;
    }

    public final int a() {
        return this.f9351c;
    }

    public final String b() {
        return this.f9350b;
    }

    public final int c() {
        return this.f9354f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f9349a == aVar.f9349a && n.d(this.f9350b, aVar.f9350b) && this.f9351c == aVar.f9351c && this.f9352d == aVar.f9352d && this.f9353e == aVar.f9353e && this.f9354f == aVar.f9354f && n.d(this.f9355g, aVar.f9355g) && this.f9356h == aVar.f9356h;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.f9349a) * 31;
        String str = this.f9350b;
        int iHashCode2 = (((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.f9351c)) * 31) + Integer.hashCode(this.f9352d)) * 31) + Integer.hashCode(this.f9353e)) * 31) + Integer.hashCode(this.f9354f)) * 31;
        String str2 = this.f9355g;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.f9356h);
    }

    public String toString() {
        return "WeatherData(lastUpdateTime=" + this.f9349a + ", phrase=" + this.f9350b + ", iconType=" + this.f9351c + ", lowTemp=" + this.f9352d + ", highTemp=" + this.f9353e + ", temp=" + this.f9354f + ", locationKey=" + this.f9355g + ", locationType=" + this.f9356h + ')';
    }

    public /* synthetic */ a(long j9, String str, int i10, int i11, int i12, int i13, String str2, int i14, int i15, AbstractC1457h abstractC1457h) {
        this((i15 & 1) != 0 ? 0L : j9, (i15 & 2) != 0 ? null : str, (i15 & 4) != 0 ? 0 : i10, (i15 & 8) != 0 ? 0 : i11, (i15 & 16) != 0 ? 0 : i12, (i15 & 32) != 0 ? Integer.MIN_VALUE : i13, (i15 & 64) != 0 ? null : str2, (i15 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? 0 : i14);
    }
}
