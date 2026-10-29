package Q;

import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f6571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f6572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f6573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f6574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f6575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f6576f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f6577g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f6578h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f6579i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f6580j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f6581k;

    public /* synthetic */ w(long j9, long j10, long j11, long j12, boolean z9, float f10, int i10, boolean z10, List list, long j13, long j14, AbstractC1457h abstractC1457h) {
        this(j9, j10, j11, j12, z9, f10, i10, z10, list, j13, j14);
    }

    public final boolean a() {
        return this.f6578h;
    }

    public final boolean b() {
        return this.f6575e;
    }

    public final List c() {
        return this.f6579i;
    }

    public final long d() {
        return this.f6571a;
    }

    public final long e() {
        return this.f6581k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return s.b(this.f6571a, wVar.f6571a) && this.f6572b == wVar.f6572b && H.g.i(this.f6573c, wVar.f6573c) && H.g.i(this.f6574d, wVar.f6574d) && this.f6575e == wVar.f6575e && Float.compare(this.f6576f, wVar.f6576f) == 0 && A.g(this.f6577g, wVar.f6577g) && this.f6578h == wVar.f6578h && kotlin.jvm.internal.n.d(this.f6579i, wVar.f6579i) && H.g.i(this.f6580j, wVar.f6580j) && H.g.i(this.f6581k, wVar.f6581k);
    }

    public final long f() {
        return this.f6574d;
    }

    public final long g() {
        return this.f6573c;
    }

    public final float h() {
        return this.f6576f;
    }

    public int hashCode() {
        return (((((((((((((((((((s.c(this.f6571a) * 31) + Long.hashCode(this.f6572b)) * 31) + H.g.m(this.f6573c)) * 31) + H.g.m(this.f6574d)) * 31) + Boolean.hashCode(this.f6575e)) * 31) + Float.hashCode(this.f6576f)) * 31) + A.h(this.f6577g)) * 31) + Boolean.hashCode(this.f6578h)) * 31) + this.f6579i.hashCode()) * 31) + H.g.m(this.f6580j)) * 31) + H.g.m(this.f6581k);
    }

    public final long i() {
        return this.f6580j;
    }

    public final int j() {
        return this.f6577g;
    }

    public final long k() {
        return this.f6572b;
    }

    public String toString() {
        return "PointerInputEventData(id=" + ((Object) s.d(this.f6571a)) + ", uptime=" + this.f6572b + ", positionOnScreen=" + ((Object) H.g.q(this.f6573c)) + ", position=" + ((Object) H.g.q(this.f6574d)) + ", down=" + this.f6575e + ", pressure=" + this.f6576f + ", type=" + ((Object) A.i(this.f6577g)) + ", activeHover=" + this.f6578h + ", historical=" + this.f6579i + ", scrollDelta=" + ((Object) H.g.q(this.f6580j)) + ", originalEventPosition=" + ((Object) H.g.q(this.f6581k)) + ')';
    }

    private w(long j9, long j10, long j11, long j12, boolean z9, float f10, int i10, boolean z10, List list, long j13, long j14) {
        this.f6571a = j9;
        this.f6572b = j10;
        this.f6573c = j11;
        this.f6574d = j12;
        this.f6575e = z9;
        this.f6576f = f10;
        this.f6577g = i10;
        this.f6578h = z10;
        this.f6579i = list;
        this.f6580j = j13;
        this.f6581k = j14;
    }
}
