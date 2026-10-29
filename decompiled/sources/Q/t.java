package Q;

import androidx.constraintlayout.core.widgets.Optimizer;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f6550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f6551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f6552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f6553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f6554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f6555f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f6556g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f6557h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f6558i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f6559j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List f6560k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f6561l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private C0943b f6562m;

    public /* synthetic */ t(long j9, long j10, long j11, boolean z9, float f10, long j12, long j13, boolean z10, boolean z11, int i10, long j14, AbstractC1457h abstractC1457h) {
        this(j9, j10, j11, z9, f10, j12, j13, z10, z11, i10, j14);
    }

    public static /* synthetic */ t b(t tVar, long j9, long j10, long j11, boolean z9, long j12, long j13, boolean z10, int i10, List list, long j14, int i11, Object obj) {
        long j15;
        long j16 = (i11 & 1) != 0 ? tVar.f6550a : j9;
        long j17 = (i11 & 2) != 0 ? tVar.f6551b : j10;
        long j18 = (i11 & 4) != 0 ? tVar.f6552c : j11;
        boolean z11 = (i11 & 8) != 0 ? tVar.f6553d : z9;
        long j19 = (i11 & 16) != 0 ? tVar.f6555f : j12;
        long j20 = (i11 & 32) != 0 ? tVar.f6556g : j13;
        boolean z12 = (i11 & 64) != 0 ? tVar.f6557h : z10;
        int i12 = (i11 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? tVar.f6558i : i10;
        if ((i11 & Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING) != 0) {
            j15 = tVar.f6559j;
            j16 = j16;
        } else {
            j15 = j14;
        }
        return tVar.a(j16, j17, j18, z11, j19, j20, z12, i12, list, j15);
    }

    public final t a(long j9, long j10, long j11, boolean z9, long j12, long j13, boolean z10, int i10, List list, long j14) {
        return c(j9, j10, j11, z9, this.f6554e, j12, j13, z10, i10, list, j14);
    }

    public final t c(long j9, long j10, long j11, boolean z9, float f10, long j12, long j13, boolean z10, int i10, List list, long j14) {
        t tVar = new t(j9, j10, j11, z9, f10, j12, j13, z10, false, i10, list, j14, this.f6561l, null);
        tVar.f6562m = this.f6562m;
        return tVar;
    }

    public final List d() {
        List list = this.f6560k;
        return list == null ? AbstractC1444s.l() : list;
    }

    public final long e() {
        return this.f6550a;
    }

    public final long f() {
        return this.f6552c;
    }

    public final boolean g() {
        return this.f6553d;
    }

    public final long h() {
        return this.f6556g;
    }

    public final boolean i() {
        return this.f6557h;
    }

    public final int j() {
        return this.f6558i;
    }

    public final boolean k() {
        return this.f6562m.a() || this.f6562m.b();
    }

    public String toString() {
        return "PointerInputChange(id=" + ((Object) s.d(this.f6550a)) + ", uptimeMillis=" + this.f6551b + ", position=" + ((Object) H.g.q(this.f6552c)) + ", pressed=" + this.f6553d + ", pressure=" + this.f6554e + ", previousUptimeMillis=" + this.f6555f + ", previousPosition=" + ((Object) H.g.q(this.f6556g)) + ", previousPressed=" + this.f6557h + ", isConsumed=" + k() + ", type=" + ((Object) A.i(this.f6558i)) + ", historical=" + d() + ",scrollDelta=" + ((Object) H.g.q(this.f6559j)) + ')';
    }

    public /* synthetic */ t(long j9, long j10, long j11, boolean z9, float f10, long j12, long j13, boolean z10, boolean z11, int i10, List list, long j14, long j15, AbstractC1457h abstractC1457h) {
        this(j9, j10, j11, z9, f10, j12, j13, z10, z11, i10, list, j14, j15);
    }

    private t(long j9, long j10, long j11, boolean z9, float f10, long j12, long j13, boolean z10, boolean z11, int i10, long j14) {
        this.f6550a = j9;
        this.f6551b = j10;
        this.f6552c = j11;
        this.f6553d = z9;
        this.f6554e = f10;
        this.f6555f = j12;
        this.f6556g = j13;
        this.f6557h = z10;
        this.f6558i = i10;
        this.f6559j = j14;
        this.f6561l = H.g.f2287b.c();
        this.f6562m = new C0943b(z11, z11);
    }

    private t(long j9, long j10, long j11, boolean z9, float f10, long j12, long j13, boolean z10, boolean z11, int i10, List list, long j14, long j15) {
        this(j9, j10, j11, z9, f10, j12, j13, z10, z11, i10, j14, null);
        this.f6560k = list;
        this.f6561l = j15;
    }
}
