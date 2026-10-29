package M5;

import androidx.constraintlayout.core.widgets.Optimizer;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f5004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f5005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f5006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f5007e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f5008f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f5009g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f5010h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f5011i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f5012j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f5013k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List f5014l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List f5015m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f5016n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final List f5017o;

    public a(String address, String deviceType, String deviceName, int i10, String batteryStatus, String caseBatteryStatus, int i11, int i12, int i13, boolean z9, long j9, List list, List list2, List list3, List list4) {
        n.h(address, "address");
        n.h(deviceType, "deviceType");
        n.h(deviceName, "deviceName");
        n.h(batteryStatus, "batteryStatus");
        n.h(caseBatteryStatus, "caseBatteryStatus");
        this.f5003a = address;
        this.f5004b = deviceType;
        this.f5005c = deviceName;
        this.f5006d = i10;
        this.f5007e = batteryStatus;
        this.f5008f = caseBatteryStatus;
        this.f5009g = i11;
        this.f5010h = i12;
        this.f5011i = i13;
        this.f5012j = z9;
        this.f5013k = j9;
        this.f5014l = list;
        this.f5015m = list2;
        this.f5016n = list3;
        this.f5017o = list4;
    }

    public final String a() {
        return this.f5003a;
    }

    public final String b() {
        return this.f5007e;
    }

    public final int c() {
        return this.f5009g;
    }

    public final String d() {
        return this.f5008f;
    }

    public final List e() {
        return this.f5016n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return n.d(this.f5003a, aVar.f5003a) && n.d(this.f5004b, aVar.f5004b) && n.d(this.f5005c, aVar.f5005c) && this.f5006d == aVar.f5006d && n.d(this.f5007e, aVar.f5007e) && n.d(this.f5008f, aVar.f5008f) && this.f5009g == aVar.f5009g && this.f5010h == aVar.f5010h && this.f5011i == aVar.f5011i && this.f5012j == aVar.f5012j && this.f5013k == aVar.f5013k && n.d(this.f5014l, aVar.f5014l) && n.d(this.f5015m, aVar.f5015m) && n.d(this.f5016n, aVar.f5016n) && n.d(this.f5017o, aVar.f5017o);
    }

    public final long f() {
        return this.f5013k;
    }

    public final String g() {
        return this.f5005c;
    }

    public final String h() {
        return this.f5004b;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((this.f5003a.hashCode() * 31) + this.f5004b.hashCode()) * 31) + this.f5005c.hashCode()) * 31) + Integer.hashCode(this.f5006d)) * 31) + this.f5007e.hashCode()) * 31) + this.f5008f.hashCode()) * 31) + Integer.hashCode(this.f5009g)) * 31) + Integer.hashCode(this.f5010h)) * 31) + Integer.hashCode(this.f5011i)) * 31) + Boolean.hashCode(this.f5012j)) * 31) + Long.hashCode(this.f5013k)) * 31;
        List list = this.f5014l;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f5015m;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f5016n;
        int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.f5017o;
        return iHashCode4 + (list4 != null ? list4.hashCode() : 0);
    }

    public final List i() {
        return this.f5017o;
    }

    public final int j() {
        return this.f5010h;
    }

    public final List k() {
        return this.f5014l;
    }

    public final int l() {
        return this.f5006d;
    }

    public final int m() {
        return this.f5011i;
    }

    public final List n() {
        return this.f5015m;
    }

    public final boolean o() {
        return this.f5012j;
    }

    public String toString() {
        return "CustomBattery(address=" + this.f5003a + ", deviceType=" + this.f5004b + ", deviceName=" + this.f5005c + ", mainBattery=" + this.f5006d + ", batteryStatus=" + this.f5007e + ", caseBatteryStatus=" + this.f5008f + ", caseBattery=" + this.f5009g + ", leftBattery=" + this.f5010h + ", rightBattery=" + this.f5011i + ", isActive=" + this.f5012j + ", connectedTime=" + this.f5013k + ", leftImage=" + this.f5014l + ", rightImage=" + this.f5015m + ", caseImage=" + this.f5016n + ", globalImage=" + this.f5017o + ")";
    }

    public /* synthetic */ a(String str, String str2, String str3, int i10, String str4, String str5, int i11, int i12, int i13, boolean z9, long j9, List list, List list2, List list3, List list4, int i14, AbstractC1457h abstractC1457h) {
        this(str, str2, str3, i10, str4, str5, i11, i12, i13, z9, (i14 & Optimizer.OPTIMIZATION_GROUPING) != 0 ? 0L : j9, (i14 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? null : list, (i14 & 4096) != 0 ? null : list2, (i14 & 8192) != 0 ? null : list3, (i14 & 16384) != 0 ? null : list4);
    }
}
