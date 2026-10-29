package J;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f3494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f3495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f3496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f3497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final double f3498e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final double f3499f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final double f3500g;

    public y(double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.f3494a = d10;
        this.f3495b = d11;
        this.f3496c = d12;
        this.f3497d = d13;
        this.f3498e = d14;
        this.f3499f = d15;
        this.f3500g = d16;
        if (Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(d13) || Double.isNaN(d14) || Double.isNaN(d15) || Double.isNaN(d16) || Double.isNaN(d10)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d14 < 0.0d || d14 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d14);
        }
        if (d14 == 0.0d && (d11 == 0.0d || d10 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d14 >= 1.0d && d13 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d11 == 0.0d || d10 == 0.0d) && d13 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d13 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d11 < 0.0d || d10 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    public final double a() {
        return this.f3495b;
    }

    public final double b() {
        return this.f3496c;
    }

    public final double c() {
        return this.f3497d;
    }

    public final double d() {
        return this.f3498e;
    }

    public final double e() {
        return this.f3499f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Double.compare(this.f3494a, yVar.f3494a) == 0 && Double.compare(this.f3495b, yVar.f3495b) == 0 && Double.compare(this.f3496c, yVar.f3496c) == 0 && Double.compare(this.f3497d, yVar.f3497d) == 0 && Double.compare(this.f3498e, yVar.f3498e) == 0 && Double.compare(this.f3499f, yVar.f3499f) == 0 && Double.compare(this.f3500g, yVar.f3500g) == 0;
    }

    public final double f() {
        return this.f3500g;
    }

    public final double g() {
        return this.f3494a;
    }

    public int hashCode() {
        return (((((((((((Double.hashCode(this.f3494a) * 31) + Double.hashCode(this.f3495b)) * 31) + Double.hashCode(this.f3496c)) * 31) + Double.hashCode(this.f3497d)) * 31) + Double.hashCode(this.f3498e)) * 31) + Double.hashCode(this.f3499f)) * 31) + Double.hashCode(this.f3500g);
    }

    public String toString() {
        return "TransferParameters(gamma=" + this.f3494a + ", a=" + this.f3495b + ", b=" + this.f3496c + ", c=" + this.f3497d + ", d=" + this.f3498e + ", e=" + this.f3499f + ", f=" + this.f3500g + ')';
    }

    public /* synthetic */ y(double d10, double d11, double d12, double d13, double d14, double d15, double d16, int i10, AbstractC1457h abstractC1457h) {
        this(d10, d11, d12, d13, d14, (i10 & 32) != 0 ? 0.0d : d15, (i10 & 64) != 0 ? 0.0d : d16);
    }
}
