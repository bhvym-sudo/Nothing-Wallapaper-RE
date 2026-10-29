package O1;

import A7.g;
import O2.f;
import androidx.constraintlayout.core.widgets.Optimizer;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f5760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final N1.a f5761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f5762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f5763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Integer f5764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final f f5765f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final A7.a f5766g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final g f5767h;

    public b(String str, N1.a aVar, String str2, Integer num, Integer num2, f fVar, A7.a aVar2, g gVar) {
        this.f5760a = str;
        this.f5761b = aVar;
        this.f5762c = str2;
        this.f5763d = num;
        this.f5764e = num2;
        this.f5765f = fVar;
        this.f5766g = aVar2;
        this.f5767h = gVar;
    }

    public static /* synthetic */ b b(b bVar, String str, N1.a aVar, String str2, Integer num, Integer num2, f fVar, A7.a aVar2, g gVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bVar.f5760a;
        }
        if ((i10 & 2) != 0) {
            aVar = bVar.f5761b;
        }
        if ((i10 & 4) != 0) {
            str2 = bVar.f5762c;
        }
        if ((i10 & 8) != 0) {
            num = bVar.f5763d;
        }
        if ((i10 & 16) != 0) {
            num2 = bVar.f5764e;
        }
        if ((i10 & 32) != 0) {
            fVar = bVar.f5765f;
        }
        if ((i10 & 64) != 0) {
            aVar2 = bVar.f5766g;
        }
        if ((i10 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0) {
            gVar = bVar.f5767h;
        }
        A7.a aVar3 = aVar2;
        g gVar2 = gVar;
        Integer num3 = num2;
        f fVar2 = fVar;
        return bVar.a(str, aVar, str2, num, num3, fVar2, aVar3, gVar2);
    }

    public final b a(String str, N1.a aVar, String str2, Integer num, Integer num2, f fVar, A7.a aVar2, g gVar) {
        return new b(str, aVar, str2, num, num2, fVar, aVar2, gVar);
    }

    public final f c() {
        return this.f5765f;
    }

    public final A7.a d() {
        return this.f5766g;
    }

    public final String e() {
        return this.f5760a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return n.d(this.f5760a, bVar.f5760a) && this.f5761b == bVar.f5761b && n.d(this.f5762c, bVar.f5762c) && n.d(this.f5763d, bVar.f5763d) && n.d(this.f5764e, bVar.f5764e) && n.d(this.f5765f, bVar.f5765f) && this.f5766g == bVar.f5766g && this.f5767h == bVar.f5767h;
    }

    public final N1.a f() {
        return this.f5761b;
    }

    public final Integer g() {
        return this.f5763d;
    }

    public final g h() {
        return this.f5767h;
    }

    public int hashCode() {
        String str = this.f5760a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        N1.a aVar = this.f5761b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str2 = this.f5762c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f5763d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f5764e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        f fVar = this.f5765f;
        int iHashCode6 = (iHashCode5 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        A7.a aVar2 = this.f5766g;
        int iHashCode7 = (iHashCode6 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        g gVar = this.f5767h;
        return iHashCode7 + (gVar != null ? gVar.hashCode() : 0);
    }

    public final Integer i() {
        return this.f5764e;
    }

    public final String j() {
        return this.f5762c;
    }

    public String toString() {
        return "ClockSnapshotModel(clockId=" + this.f5760a + ", clockSize=" + this.f5761b + ", selectedColorId=" + this.f5762c + ", colorToneProgress=" + this.f5763d + ", seedColor=" + this.f5764e + ", axisSettings=" + this.f5765f + ", clockAlign=" + this.f5766g + ", dynamicFont=" + this.f5767h + ")";
    }

    public /* synthetic */ b(String str, N1.a aVar, String str2, Integer num, Integer num2, f fVar, A7.a aVar2, g gVar, int i10, AbstractC1457h abstractC1457h) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : aVar, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : num, (i10 & 16) != 0 ? null : num2, (i10 & 32) != 0 ? null : fVar, (i10 & 64) != 0 ? null : aVar2, (i10 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? null : gVar);
    }
}
