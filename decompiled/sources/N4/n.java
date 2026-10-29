package N4;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f5335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f5336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f5337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f5338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f5339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f5340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f5341g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f5342h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f5343i;

    class a extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f5344c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Matrix f5345d;

        a(List list, Matrix matrix) {
            this.f5344c = list;
            this.f5345d = matrix;
        }

        @Override // N4.n.g
        public void b(Matrix matrix, M4.a aVar, int i10, Canvas canvas) {
            Iterator it = this.f5344c.iterator();
            while (it.hasNext()) {
                ((g) it.next()).b(this.f5345d, aVar, i10, canvas);
            }
        }
    }

    static class b extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final d f5347c;

        public b(d dVar) {
            this.f5347c = dVar;
        }

        @Override // N4.n.g
        public void b(Matrix matrix, M4.a aVar, int i10, Canvas canvas) {
            aVar.a(canvas, matrix, new RectF(this.f5347c.k(), this.f5347c.o(), this.f5347c.l(), this.f5347c.j()), i10, this.f5347c.m(), this.f5347c.n());
        }
    }

    static class c extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e f5348c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f5349d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f5350e;

        public c(e eVar, float f10, float f11) {
            this.f5348c = eVar;
            this.f5349d = f10;
            this.f5350e = f11;
        }

        @Override // N4.n.g
        public void b(Matrix matrix, M4.a aVar, int i10, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f5348c.f5359c - this.f5350e, this.f5348c.f5358b - this.f5349d), 0.0f);
            this.f5362a.set(matrix);
            this.f5362a.preTranslate(this.f5349d, this.f5350e);
            this.f5362a.preRotate(c());
            aVar.b(canvas, this.f5362a, rectF, i10);
        }

        float c() {
            return (float) Math.toDegrees(Math.atan((this.f5348c.f5359c - this.f5350e) / (this.f5348c.f5358b - this.f5349d)));
        }
    }

    public static class d extends f {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final RectF f5351h = new RectF();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f5352b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f5353c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f5354d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f5355e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f5356f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f5357g;

        public d(float f10, float f11, float f12, float f13) {
            q(f10);
            u(f11);
            r(f12);
            p(f13);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float j() {
            return this.f5355e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float k() {
            return this.f5352b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float l() {
            return this.f5354d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float m() {
            return this.f5356f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float n() {
            return this.f5357g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float o() {
            return this.f5353c;
        }

        private void p(float f10) {
            this.f5355e = f10;
        }

        private void q(float f10) {
            this.f5352b = f10;
        }

        private void r(float f10) {
            this.f5354d = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(float f10) {
            this.f5356f = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t(float f10) {
            this.f5357g = f10;
        }

        private void u(float f10) {
            this.f5353c = f10;
        }

        @Override // N4.n.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f5360a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f5351h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }
    }

    public static class e extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f5358b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f5359c;

        @Override // N4.n.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f5360a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f5358b, this.f5359c);
            path.transform(matrix);
        }
    }

    public static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final Matrix f5360a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    static abstract class g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final Matrix f5361b = new Matrix();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Matrix f5362a = new Matrix();

        g() {
        }

        public final void a(M4.a aVar, int i10, Canvas canvas) {
            b(f5361b, aVar, i10, canvas);
        }

        public abstract void b(Matrix matrix, M4.a aVar, int i10, Canvas canvas);
    }

    public n() {
        n(0.0f, 0.0f);
    }

    private void b(float f10) {
        if (g() == f10) {
            return;
        }
        float fG = ((f10 - g()) + 360.0f) % 360.0f;
        if (fG > 180.0f) {
            return;
        }
        d dVar = new d(i(), j(), i(), j());
        dVar.s(g());
        dVar.t(fG);
        this.f5342h.add(new b(dVar));
        p(f10);
    }

    private void c(g gVar, float f10, float f11) {
        b(f10);
        this.f5342h.add(gVar);
        p(f11);
    }

    private float g() {
        return this.f5339e;
    }

    private float h() {
        return this.f5340f;
    }

    private void p(float f10) {
        this.f5339e = f10;
    }

    private void q(float f10) {
        this.f5340f = f10;
    }

    private void r(float f10) {
        this.f5337c = f10;
    }

    private void s(float f10) {
        this.f5338d = f10;
    }

    private void t(float f10) {
        this.f5335a = f10;
    }

    private void u(float f10) {
        this.f5336b = f10;
    }

    public void a(float f10, float f11, float f12, float f13, float f14, float f15) {
        d dVar = new d(f10, f11, f12, f13);
        dVar.s(f14);
        dVar.t(f15);
        this.f5341g.add(dVar);
        b bVar = new b(dVar);
        float f16 = f14 + f15;
        boolean z9 = f15 < 0.0f;
        if (z9) {
            f14 = (f14 + 180.0f) % 360.0f;
        }
        c(bVar, f14, z9 ? (180.0f + f16) % 360.0f : f16);
        double d10 = f16;
        r(((f10 + f12) * 0.5f) + (((f12 - f10) / 2.0f) * ((float) Math.cos(Math.toRadians(d10)))));
        s(((f11 + f13) * 0.5f) + (((f13 - f11) / 2.0f) * ((float) Math.sin(Math.toRadians(d10)))));
    }

    public void d(Matrix matrix, Path path) {
        int size = this.f5341g.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((f) this.f5341g.get(i10)).a(matrix, path);
        }
    }

    boolean e() {
        return this.f5343i;
    }

    g f(Matrix matrix) {
        b(h());
        return new a(new ArrayList(this.f5342h), new Matrix(matrix));
    }

    float i() {
        return this.f5337c;
    }

    float j() {
        return this.f5338d;
    }

    float k() {
        return this.f5335a;
    }

    float l() {
        return this.f5336b;
    }

    public void m(float f10, float f11) {
        e eVar = new e();
        eVar.f5358b = f10;
        eVar.f5359c = f11;
        this.f5341g.add(eVar);
        c cVar = new c(eVar, i(), j());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        r(f10);
        s(f11);
    }

    public void n(float f10, float f11) {
        o(f10, f11, 270.0f, 0.0f);
    }

    public void o(float f10, float f11, float f12, float f13) {
        t(f10);
        u(f11);
        r(f10);
        s(f11);
        p(f12);
        q((f12 + f13) % 360.0f);
        this.f5341g.clear();
        this.f5342h.clear();
        this.f5343i = false;
    }
}
