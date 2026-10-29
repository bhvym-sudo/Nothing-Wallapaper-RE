package J;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f3434g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f3435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f3436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f3437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f3438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f3439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float[] f3440f;

    public static final class a {

        /* JADX INFO: renamed from: J.h$a$a, reason: collision with other inner class name */
        public static final class C0118a extends h {
            C0118a(c cVar, int i10) {
                super(cVar, cVar, i10, null);
            }

            @Override // J.h
            public long a(long j9) {
                return j9;
            }
        }

        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] b(c cVar, c cVar2, int i10) {
            if (!n.e(i10, n.f3462a.a())) {
                return null;
            }
            long jE = cVar.e();
            J.b.a aVar = J.b.f3401a;
            boolean zE = J.b.e(jE, aVar.b());
            boolean zE2 = J.b.e(cVar2.e(), aVar.b());
            if (zE && zE2) {
                return null;
            }
            if (!zE && !zE2) {
                return null;
            }
            if (!zE) {
                cVar = cVar2;
            }
            kotlin.jvm.internal.n.f(cVar, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            x xVar = (x) cVar;
            float[] fArrC = zE ? xVar.J().c() : k.f3445a.c();
            float[] fArrC2 = zE2 ? xVar.J().c() : k.f3445a.c();
            return new float[]{fArrC[0] / fArrC2[0], fArrC[1] / fArrC2[1], fArrC[2] / fArrC2[2]};
        }

        public final h c(c cVar) {
            return new C0118a(cVar, n.f3462a.c());
        }

        private a() {
        }
    }

    public static final class b extends h {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final x f3441h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final x f3442i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final float[] f3443j;

        public /* synthetic */ b(x xVar, x xVar2, int i10, AbstractC1457h abstractC1457h) {
            this(xVar, xVar2, i10);
        }

        private final float[] b(x xVar, x xVar2, int i10) {
            if (d.f(xVar.J(), xVar2.J())) {
                return d.l(xVar2.F(), xVar.I());
            }
            float[] fArrI = xVar.I();
            float[] fArrF = xVar2.F();
            float[] fArrC = xVar.J().c();
            float[] fArrC2 = xVar2.J().c();
            z zVarJ = xVar.J();
            k kVar = k.f3445a;
            if (!d.f(zVarJ, kVar.b())) {
                float[] fArrB = AbstractC0894a.f3396b.a().b();
                float[] fArrC3 = kVar.c();
                float[] fArrCopyOf = Arrays.copyOf(fArrC3, fArrC3.length);
                kotlin.jvm.internal.n.g(fArrCopyOf, "copyOf(this, size)");
                fArrI = d.l(d.e(fArrB, fArrC, fArrCopyOf), xVar.I());
            }
            if (!d.f(xVar2.J(), kVar.b())) {
                float[] fArrB2 = AbstractC0894a.f3396b.a().b();
                float[] fArrC4 = kVar.c();
                float[] fArrCopyOf2 = Arrays.copyOf(fArrC4, fArrC4.length);
                kotlin.jvm.internal.n.g(fArrCopyOf2, "copyOf(this, size)");
                fArrF = d.k(d.l(d.e(fArrB2, fArrC2, fArrCopyOf2), xVar2.I()));
            }
            if (n.e(i10, n.f3462a.a())) {
                fArrI = d.m(new float[]{fArrC[0] / fArrC2[0], fArrC[1] / fArrC2[1], fArrC[2] / fArrC2[2]}, fArrI);
            }
            return d.l(fArrF, fArrI);
        }

        @Override // J.h
        public long a(long j9) {
            float fQ = I.r.q(j9);
            float fP = I.r.p(j9);
            float fN = I.r.n(j9);
            float fM = I.r.m(j9);
            float fA = (float) this.f3441h.D().a(fQ);
            float fA2 = (float) this.f3441h.D().a(fP);
            float fA3 = (float) this.f3441h.D().a(fN);
            float[] fArr = this.f3443j;
            return I.t.a((float) this.f3442i.G().a((fArr[0] * fA) + (fArr[3] * fA2) + (fArr[6] * fA3)), (float) this.f3442i.G().a((fArr[1] * fA) + (fArr[4] * fA2) + (fArr[7] * fA3)), (float) this.f3442i.G().a((fArr[2] * fA) + (fArr[5] * fA2) + (fArr[8] * fA3)), fM, this.f3442i);
        }

        private b(x xVar, x xVar2, int i10) {
            super(xVar, xVar2, xVar, xVar2, i10, null, null);
            this.f3441h = xVar;
            this.f3442i = xVar2;
            this.f3443j = b(xVar, xVar2, i10);
        }
    }

    public /* synthetic */ h(c cVar, c cVar2, int i10, AbstractC1457h abstractC1457h) {
        this(cVar, cVar2, i10);
    }

    public long a(long j9) {
        float fQ = I.r.q(j9);
        float fP = I.r.p(j9);
        float fN = I.r.n(j9);
        float fM = I.r.m(j9);
        long jH = this.f3437c.h(fQ, fP, fN);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jH >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jH & 4294967295L));
        float fI = this.f3437c.i(fQ, fP, fN);
        float[] fArr = this.f3440f;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fI *= fArr[2];
        }
        float f10 = fIntBitsToFloat;
        return this.f3438d.j(f10, fIntBitsToFloat2, fI, fM, this.f3436b);
    }

    public /* synthetic */ h(c cVar, c cVar2, c cVar3, c cVar4, int i10, float[] fArr, AbstractC1457h abstractC1457h) {
        this(cVar, cVar2, cVar3, cVar4, i10, fArr);
    }

    private h(c cVar, c cVar2, c cVar3, c cVar4, int i10, float[] fArr) {
        this.f3435a = cVar;
        this.f3436b = cVar2;
        this.f3437c = cVar3;
        this.f3438d = cVar4;
        this.f3439e = i10;
        this.f3440f = fArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private h(c cVar, c cVar2, int i10) {
        long jE = cVar.e();
        J.b.a aVar = J.b.f3401a;
        this(cVar, cVar2, J.b.e(jE, aVar.b()) ? d.d(cVar, k.f3445a.b(), null, 2, null) : cVar, J.b.e(cVar2.e(), aVar.b()) ? d.d(cVar2, k.f3445a.b(), null, 2, null) : cVar2, i10, f3434g.b(cVar, cVar2, i10), null);
    }
}
