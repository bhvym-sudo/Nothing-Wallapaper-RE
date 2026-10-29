package P0;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    double f6014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    double f6015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f6016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f6017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f6018e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f6019f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double f6020g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private double f6021h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private double f6022i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final b.p f6023j;

    public f() {
        this.f6014a = Math.sqrt(1500.0d);
        this.f6015b = 0.5d;
        this.f6016c = false;
        this.f6022i = Double.MAX_VALUE;
        this.f6023j = new b.p();
    }

    private void b() {
        if (this.f6016c) {
            return;
        }
        if (this.f6022i == Double.MAX_VALUE) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double d10 = this.f6015b;
        if (d10 > 1.0d) {
            double d11 = this.f6014a;
            this.f6019f = ((-d10) * d11) + (d11 * Math.sqrt((d10 * d10) - 1.0d));
            double d12 = this.f6015b;
            double d13 = this.f6014a;
            this.f6020g = ((-d12) * d13) - (d13 * Math.sqrt((d12 * d12) - 1.0d));
        } else if (d10 >= 0.0d && d10 < 1.0d) {
            this.f6021h = this.f6014a * Math.sqrt(1.0d - (d10 * d10));
        }
        this.f6016c = true;
    }

    public float a() {
        return (float) this.f6022i;
    }

    public boolean c(float f10, float f11) {
        return ((double) Math.abs(f11)) < this.f6018e && ((double) Math.abs(f10 - a())) < this.f6017d;
    }

    public f d(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f6015b = f10;
        this.f6016c = false;
        return this;
    }

    public f e(float f10) {
        this.f6022i = f10;
        return this;
    }

    public f f(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f6014a = Math.sqrt(f10);
        this.f6016c = false;
        return this;
    }

    void g(double d10) {
        double dAbs = Math.abs(d10);
        this.f6017d = dAbs;
        this.f6018e = dAbs * 62.5d;
    }

    b.p h(double d10, double d11, long j9) {
        double dPow;
        double dCos;
        b();
        double d12 = j9 / 1000.0d;
        double d13 = d10 - this.f6022i;
        double d14 = this.f6015b;
        if (d14 > 1.0d) {
            double d15 = this.f6020g;
            double d16 = this.f6019f;
            double d17 = d13 - (((d15 * d13) - d11) / (d15 - d16));
            double d18 = ((d13 * d15) - d11) / (d15 - d16);
            dPow = (Math.pow(2.718281828459045d, d15 * d12) * d17) + (Math.pow(2.718281828459045d, this.f6019f * d12) * d18);
            double d19 = this.f6020g;
            double dPow2 = d17 * d19 * Math.pow(2.718281828459045d, d19 * d12);
            double d20 = this.f6019f;
            dCos = dPow2 + (d18 * d20 * Math.pow(2.718281828459045d, d20 * d12));
        } else if (d14 == 1.0d) {
            double d21 = this.f6014a;
            double d22 = d11 + (d21 * d13);
            double d23 = d13 + (d22 * d12);
            dPow = Math.pow(2.718281828459045d, (-d21) * d12) * d23;
            double dPow3 = d23 * Math.pow(2.718281828459045d, (-this.f6014a) * d12);
            double d24 = this.f6014a;
            dCos = (d22 * Math.pow(2.718281828459045d, (-d24) * d12)) + (dPow3 * (-d24));
        } else {
            double d25 = 1.0d / this.f6021h;
            double d26 = this.f6014a;
            double d27 = d25 * ((d14 * d26 * d13) + d11);
            dPow = Math.pow(2.718281828459045d, (-d14) * d26 * d12) * ((Math.cos(this.f6021h * d12) * d13) + (Math.sin(this.f6021h * d12) * d27));
            double d28 = this.f6014a;
            double d29 = this.f6015b;
            double dPow4 = Math.pow(2.718281828459045d, (-d29) * d28 * d12);
            double d30 = this.f6021h;
            double dSin = (-d30) * d13 * Math.sin(d30 * d12);
            double d31 = this.f6021h;
            dCos = ((-d28) * dPow * d29) + (dPow4 * (dSin + (d27 * d31 * Math.cos(d31 * d12))));
        }
        b.p pVar = this.f6023j;
        pVar.f6007a = (float) (dPow + this.f6022i);
        pVar.f6008b = (float) dCos;
        return pVar;
    }

    public f(float f10) {
        this.f6014a = Math.sqrt(1500.0d);
        this.f6015b = 0.5d;
        this.f6016c = false;
        this.f6022i = Double.MAX_VALUE;
        this.f6023j = new b.p();
        this.f6022i = f10;
    }
}
