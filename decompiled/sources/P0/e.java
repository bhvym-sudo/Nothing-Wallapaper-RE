package P0;

/* JADX INFO: loaded from: classes.dex */
public final class e extends b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private f f6011A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private float f6012B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f6013C;

    public e(d dVar) {
        super(dVar);
        this.f6011A = null;
        this.f6012B = Float.MAX_VALUE;
        this.f6013C = false;
    }

    private void t() {
        f fVar = this.f6011A;
        if (fVar == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double dA = fVar.a();
        if (dA > this.f5999g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (dA < this.f6000h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
    }

    @Override // P0.b
    void n(float f10) {
    }

    @Override // P0.b
    public void o() {
        t();
        this.f6011A.g(e());
        super.o();
    }

    @Override // P0.b
    boolean q(long j9) {
        if (this.f6013C) {
            float f10 = this.f6012B;
            if (f10 != Float.MAX_VALUE) {
                this.f6011A.e(f10);
                this.f6012B = Float.MAX_VALUE;
            }
            this.f5994b = this.f6011A.a();
            this.f5993a = 0.0f;
            this.f6013C = false;
            return true;
        }
        if (this.f6012B != Float.MAX_VALUE) {
            this.f6011A.a();
            long j10 = j9 / 2;
            b.p pVarH = this.f6011A.h(this.f5994b, this.f5993a, j10);
            this.f6011A.e(this.f6012B);
            this.f6012B = Float.MAX_VALUE;
            b.p pVarH2 = this.f6011A.h(pVarH.f6007a, pVarH.f6008b, j10);
            this.f5994b = pVarH2.f6007a;
            this.f5993a = pVarH2.f6008b;
        } else {
            b.p pVarH3 = this.f6011A.h(this.f5994b, this.f5993a, j9);
            this.f5994b = pVarH3.f6007a;
            this.f5993a = pVarH3.f6008b;
        }
        float fMax = Math.max(this.f5994b, this.f6000h);
        this.f5994b = fMax;
        float fMin = Math.min(fMax, this.f5999g);
        this.f5994b = fMin;
        if (!s(fMin, this.f5993a)) {
            return false;
        }
        this.f5994b = this.f6011A.a();
        this.f5993a = 0.0f;
        return true;
    }

    public void r(float f10) {
        if (f()) {
            this.f6012B = f10;
            return;
        }
        if (this.f6011A == null) {
            this.f6011A = new f(f10);
        }
        this.f6011A.e(f10);
        o();
    }

    boolean s(float f10, float f11) {
        return this.f6011A.c(f10, f11);
    }

    public e u(f fVar) {
        this.f6011A = fVar;
        return this;
    }
}
