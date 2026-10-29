package N4;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n[] f5317a = new n[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Matrix[] f5318b = new Matrix[4];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Matrix[] f5319c = new Matrix[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PointF f5320d = new PointF();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Path f5321e = new Path();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Path f5322f = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final n f5323g = new n();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float[] f5324h = new float[2];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float[] f5325i = new float[2];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Path f5326j = new Path();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Path f5327k = new Path();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f5328l = true;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final m f5329a = new m();
    }

    public interface b {
        void a(n nVar, Matrix matrix, int i10);

        void b(n nVar, Matrix matrix, int i10);
    }

    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f5330a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Path f5331b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final RectF f5332c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b f5333d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f5334e;

        c(l lVar, float f10, RectF rectF, b bVar, Path path) {
            this.f5333d = bVar;
            this.f5330a = lVar;
            this.f5334e = f10;
            this.f5332c = rectF;
            this.f5331b = path;
        }
    }

    public m() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f5317a[i10] = new n();
            this.f5318b[i10] = new Matrix();
            this.f5319c[i10] = new Matrix();
        }
    }

    private float a(int i10) {
        return ((i10 + 1) % 4) * 90;
    }

    private void b(c cVar, int i10) {
        this.f5324h[0] = this.f5317a[i10].k();
        this.f5324h[1] = this.f5317a[i10].l();
        this.f5318b[i10].mapPoints(this.f5324h);
        if (i10 == 0) {
            Path path = cVar.f5331b;
            float[] fArr = this.f5324h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.f5331b;
            float[] fArr2 = this.f5324h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f5317a[i10].d(this.f5318b[i10], cVar.f5331b);
        b bVar = cVar.f5333d;
        if (bVar != null) {
            bVar.a(this.f5317a[i10], this.f5318b[i10], i10);
        }
    }

    private void c(c cVar, int i10) {
        int i11 = (i10 + 1) % 4;
        this.f5324h[0] = this.f5317a[i10].i();
        this.f5324h[1] = this.f5317a[i10].j();
        this.f5318b[i10].mapPoints(this.f5324h);
        this.f5325i[0] = this.f5317a[i11].k();
        this.f5325i[1] = this.f5317a[i11].l();
        this.f5318b[i11].mapPoints(this.f5325i);
        float[] fArr = this.f5324h;
        float f10 = fArr[0];
        float[] fArr2 = this.f5325i;
        float fMax = Math.max(((float) Math.hypot(f10 - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
        float fI = i(cVar.f5332c, i10);
        this.f5323g.n(0.0f, 0.0f);
        g gVarJ = j(i10, cVar.f5330a);
        gVarJ.b(fMax, fI, cVar.f5334e, this.f5323g);
        this.f5326j.reset();
        this.f5323g.d(this.f5319c[i10], this.f5326j);
        if (this.f5328l && (gVarJ.a() || l(this.f5326j, i10) || l(this.f5326j, i11))) {
            Path path = this.f5326j;
            path.op(path, this.f5322f, Path.Op.DIFFERENCE);
            this.f5324h[0] = this.f5323g.k();
            this.f5324h[1] = this.f5323g.l();
            this.f5319c[i10].mapPoints(this.f5324h);
            Path path2 = this.f5321e;
            float[] fArr3 = this.f5324h;
            path2.moveTo(fArr3[0], fArr3[1]);
            this.f5323g.d(this.f5319c[i10], this.f5321e);
        } else {
            this.f5323g.d(this.f5319c[i10], cVar.f5331b);
        }
        b bVar = cVar.f5333d;
        if (bVar != null) {
            bVar.b(this.f5323g, this.f5319c[i10], i10);
        }
    }

    private void f(int i10, RectF rectF, PointF pointF) {
        if (i10 == 1) {
            pointF.set(rectF.right, rectF.bottom);
            return;
        }
        if (i10 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i10 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    private d g(int i10, l lVar) {
        if (i10 == 1) {
            return lVar.l();
        }
        if (i10 != 2) {
            return i10 != 3 ? lVar.t() : lVar.r();
        }
        return lVar.j();
    }

    private e h(int i10, l lVar) {
        if (i10 == 1) {
            return lVar.k();
        }
        if (i10 != 2) {
            return i10 != 3 ? lVar.s() : lVar.q();
        }
        return lVar.i();
    }

    private float i(RectF rectF, int i10) {
        float[] fArr = this.f5324h;
        n nVar = this.f5317a[i10];
        fArr[0] = nVar.f5337c;
        fArr[1] = nVar.f5338d;
        this.f5318b[i10].mapPoints(fArr);
        return (i10 == 1 || i10 == 3) ? Math.abs(rectF.centerX() - this.f5324h[0]) : Math.abs(rectF.centerY() - this.f5324h[1]);
    }

    private g j(int i10, l lVar) {
        if (i10 == 1) {
            return lVar.h();
        }
        if (i10 != 2) {
            return i10 != 3 ? lVar.o() : lVar.p();
        }
        return lVar.n();
    }

    public static m k() {
        return a.f5329a;
    }

    private boolean l(Path path, int i10) {
        this.f5327k.reset();
        this.f5317a[i10].d(this.f5318b[i10], this.f5327k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f5327k.computeBounds(rectF, true);
        path.op(this.f5327k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    private void m(c cVar, int i10) {
        h(i10, cVar.f5330a).b(this.f5317a[i10], 90.0f, cVar.f5334e, cVar.f5332c, g(i10, cVar.f5330a));
        float fA = a(i10);
        this.f5318b[i10].reset();
        f(i10, cVar.f5332c, this.f5320d);
        Matrix matrix = this.f5318b[i10];
        PointF pointF = this.f5320d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f5318b[i10].preRotate(fA);
    }

    private void n(int i10) {
        this.f5324h[0] = this.f5317a[i10].i();
        this.f5324h[1] = this.f5317a[i10].j();
        this.f5318b[i10].mapPoints(this.f5324h);
        float fA = a(i10);
        this.f5319c[i10].reset();
        Matrix matrix = this.f5319c[i10];
        float[] fArr = this.f5324h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f5319c[i10].preRotate(fA);
    }

    public void d(l lVar, float f10, RectF rectF, b bVar, Path path) {
        path.rewind();
        this.f5321e.rewind();
        this.f5322f.rewind();
        this.f5322f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(lVar, f10, rectF, bVar, path);
        for (int i10 = 0; i10 < 4; i10++) {
            m(cVar, i10);
            n(i10);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            b(cVar, i11);
            c(cVar, i11);
        }
        path.close();
        this.f5321e.close();
        if (this.f5321e.isEmpty()) {
            return;
        }
        path.op(this.f5321e, Path.Op.UNION);
    }

    public void e(l lVar, float f10, RectF rectF, Path path) {
        d(lVar, f10, rectF, null, path);
    }
}
