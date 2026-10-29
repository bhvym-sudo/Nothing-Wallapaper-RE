package N4;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;

/* JADX INFO: loaded from: classes.dex */
public class h extends Drawable implements o {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final String f5240N = "h";

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Paint f5241O;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final Region f5242A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final Region f5243B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private l f5244C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final Paint f5245D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final Paint f5246E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final M4.a f5247F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final m.b f5248G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final m f5249H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private PorterDuffColorFilter f5250I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private PorterDuffColorFilter f5251J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f5252K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final RectF f5253L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private boolean f5254M;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private c f5255q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final n.g[] f5256r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final n.g[] f5257s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final BitSet f5258t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f5259u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Matrix f5260v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Path f5261w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Path f5262x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final RectF f5263y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final RectF f5264z;

    class a implements m.b {
        a() {
        }

        @Override // N4.m.b
        public void a(n nVar, Matrix matrix, int i10) {
            h.this.f5258t.set(i10, nVar.e());
            h.this.f5256r[i10] = nVar.f(matrix);
        }

        @Override // N4.m.b
        public void b(n nVar, Matrix matrix, int i10) {
            h.this.f5258t.set(i10 + 4, nVar.e());
            h.this.f5257s[i10] = nVar.f(matrix);
        }
    }

    class b implements l.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f5266a;

        b(float f10) {
            this.f5266a = f10;
        }

        @Override // N4.l.c
        public d a(d dVar) {
            return dVar instanceof j ? dVar : new N4.b(this.f5266a, dVar);
        }
    }

    static {
        Paint paint = new Paint(1);
        f5241O = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public h() {
        this(new l());
    }

    private float C() {
        if (J()) {
            return this.f5246E.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private boolean H() {
        c cVar = this.f5255q;
        int i10 = cVar.f5284q;
        if (i10 == 1 || cVar.f5285r <= 0) {
            return false;
        }
        return i10 == 2 || R();
    }

    private boolean I() {
        Paint.Style style = this.f5255q.f5289v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean J() {
        Paint.Style style = this.f5255q.f5289v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f5246E.getStrokeWidth() > 0.0f;
    }

    private void L() {
        super.invalidateSelf();
    }

    private void O(Canvas canvas) {
        if (H()) {
            canvas.save();
            Q(canvas);
            if (!this.f5254M) {
                n(canvas);
                canvas.restore();
                return;
            }
            int iWidth = (int) (this.f5253L.width() - getBounds().width());
            int iHeight = (int) (this.f5253L.height() - getBounds().height());
            if (iWidth < 0 || iHeight < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) this.f5253L.width()) + (this.f5255q.f5285r * 2) + iWidth, ((int) this.f5253L.height()) + (this.f5255q.f5285r * 2) + iHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            float f10 = (getBounds().left - this.f5255q.f5285r) - iWidth;
            float f11 = (getBounds().top - this.f5255q.f5285r) - iHeight;
            canvas2.translate(-f10, -f11);
            n(canvas2);
            canvas.drawBitmap(bitmapCreateBitmap, f10, f11, (Paint) null);
            bitmapCreateBitmap.recycle();
            canvas.restore();
        }
    }

    private static int P(int i10, int i11) {
        return (i10 * (i11 + (i11 >>> 7))) >>> 8;
    }

    private void Q(Canvas canvas) {
        canvas.translate(z(), A());
    }

    private boolean d0(int[] iArr) {
        boolean z9;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f5255q.f5271d == null || color2 == (colorForState2 = this.f5255q.f5271d.getColorForState(iArr, (color2 = this.f5245D.getColor())))) {
            z9 = false;
        } else {
            this.f5245D.setColor(colorForState2);
            z9 = true;
        }
        if (this.f5255q.f5272e == null || color == (colorForState = this.f5255q.f5272e.getColorForState(iArr, (color = this.f5246E.getColor())))) {
            return z9;
        }
        this.f5246E.setColor(colorForState);
        return true;
    }

    private boolean e0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f5250I;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f5251J;
        c cVar = this.f5255q;
        this.f5250I = k(cVar.f5274g, cVar.f5275h, this.f5245D, true);
        c cVar2 = this.f5255q;
        this.f5251J = k(cVar2.f5273f, cVar2.f5275h, this.f5246E, false);
        c cVar3 = this.f5255q;
        if (cVar3.f5288u) {
            this.f5247F.d(cVar3.f5274g.getColorForState(getState(), 0));
        }
        return (B0.d.a(porterDuffColorFilter, this.f5250I) && B0.d.a(porterDuffColorFilter2, this.f5251J)) ? false : true;
    }

    private PorterDuffColorFilter f(Paint paint, boolean z9) {
        if (!z9) {
            return null;
        }
        int color = paint.getColor();
        int iL = l(color);
        this.f5252K = iL;
        if (iL != color) {
            return new PorterDuffColorFilter(iL, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    private void f0() {
        float fG = G();
        this.f5255q.f5285r = (int) Math.ceil(0.75f * fG);
        this.f5255q.f5286s = (int) Math.ceil(fG * 0.25f);
        e0();
        L();
    }

    private void g(RectF rectF, Path path) {
        h(rectF, path);
        if (this.f5255q.f5277j != 1.0f) {
            this.f5260v.reset();
            Matrix matrix = this.f5260v;
            float f10 = this.f5255q.f5277j;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f5260v);
        }
        path.computeBounds(this.f5253L, true);
    }

    private void i() {
        l lVarY = B().y(new b(-C()));
        this.f5244C = lVarY;
        this.f5249H.e(lVarY, this.f5255q.f5278k, t(), this.f5262x);
    }

    private PorterDuffColorFilter j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z9) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z9) {
            colorForState = l(colorForState);
        }
        this.f5252K = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    private PorterDuffColorFilter k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z9) {
        return (colorStateList == null || mode == null) ? f(paint, z9) : j(colorStateList, mode, z9);
    }

    public static h m(Context context, float f10, ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(D4.a.c(context, p225w4.a.f28712o, h.class.getSimpleName()));
        }
        h hVar = new h();
        hVar.K(context);
        hVar.V(colorStateList);
        hVar.U(f10);
        return hVar;
    }

    private void n(Canvas canvas) {
        if (this.f5258t.cardinality() > 0) {
            Log.w(f5240N, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f5255q.f5286s != 0) {
            canvas.drawPath(this.f5261w, this.f5247F.c());
        }
        for (int i10 = 0; i10 < 4; i10++) {
            this.f5256r[i10].a(this.f5247F, this.f5255q.f5285r, canvas);
            this.f5257s[i10].a(this.f5247F, this.f5255q.f5285r, canvas);
        }
        if (this.f5254M) {
            int iZ = z();
            int iA = A();
            canvas.translate(-iZ, -iA);
            canvas.drawPath(this.f5261w, f5241O);
            canvas.translate(iZ, iA);
        }
    }

    private void o(Canvas canvas) {
        p(canvas, this.f5245D, this.f5261w, this.f5255q.f5268a, s());
    }

    private void p(Canvas canvas, Paint paint, Path path, l lVar, RectF rectF) {
        if (!lVar.u(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = lVar.t().a(rectF) * this.f5255q.f5278k;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    private RectF t() {
        this.f5264z.set(s());
        float fC = C();
        this.f5264z.inset(fC, fC);
        return this.f5264z;
    }

    public int A() {
        c cVar = this.f5255q;
        return (int) (((double) cVar.f5286s) * Math.cos(Math.toRadians(cVar.f5287t)));
    }

    public l B() {
        return this.f5255q.f5268a;
    }

    public float D() {
        return this.f5255q.f5268a.r().a(s());
    }

    public float E() {
        return this.f5255q.f5268a.t().a(s());
    }

    public float F() {
        return this.f5255q.f5283p;
    }

    public float G() {
        return u() + F();
    }

    public void K(Context context) {
        this.f5255q.f5269b = new F4.a(context);
        f0();
    }

    public boolean M() {
        F4.a aVar = this.f5255q.f5269b;
        return aVar != null && aVar.e();
    }

    public boolean N() {
        return this.f5255q.f5268a.u(s());
    }

    public boolean R() {
        if (N()) {
            return false;
        }
        this.f5261w.isConvex();
        return false;
    }

    public void S(float f10) {
        setShapeAppearanceModel(this.f5255q.f5268a.w(f10));
    }

    public void T(d dVar) {
        setShapeAppearanceModel(this.f5255q.f5268a.x(dVar));
    }

    public void U(float f10) {
        c cVar = this.f5255q;
        if (cVar.f5282o != f10) {
            cVar.f5282o = f10;
            f0();
        }
    }

    public void V(ColorStateList colorStateList) {
        c cVar = this.f5255q;
        if (cVar.f5271d != colorStateList) {
            cVar.f5271d = colorStateList;
            onStateChange(getState());
        }
    }

    public void W(float f10) {
        c cVar = this.f5255q;
        if (cVar.f5278k != f10) {
            cVar.f5278k = f10;
            this.f5259u = true;
            invalidateSelf();
        }
    }

    public void X(int i10, int i11, int i12, int i13) {
        c cVar = this.f5255q;
        if (cVar.f5276i == null) {
            cVar.f5276i = new Rect();
        }
        this.f5255q.f5276i.set(i10, i11, i12, i13);
        invalidateSelf();
    }

    public void Y(float f10) {
        c cVar = this.f5255q;
        if (cVar.f5281n != f10) {
            cVar.f5281n = f10;
            f0();
        }
    }

    public void Z(float f10, int i10) {
        c0(f10);
        b0(ColorStateList.valueOf(i10));
    }

    public void a0(float f10, ColorStateList colorStateList) {
        c0(f10);
        b0(colorStateList);
    }

    public void b0(ColorStateList colorStateList) {
        c cVar = this.f5255q;
        if (cVar.f5272e != colorStateList) {
            cVar.f5272e = colorStateList;
            onStateChange(getState());
        }
    }

    public void c0(float f10) {
        this.f5255q.f5279l = f10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f5245D.setColorFilter(this.f5250I);
        int alpha = this.f5245D.getAlpha();
        this.f5245D.setAlpha(P(alpha, this.f5255q.f5280m));
        this.f5246E.setColorFilter(this.f5251J);
        this.f5246E.setStrokeWidth(this.f5255q.f5279l);
        int alpha2 = this.f5246E.getAlpha();
        this.f5246E.setAlpha(P(alpha2, this.f5255q.f5280m));
        if (this.f5259u) {
            i();
            g(s(), this.f5261w);
            this.f5259u = false;
        }
        O(canvas);
        if (I()) {
            o(canvas);
        }
        if (J()) {
            r(canvas);
        }
        this.f5245D.setAlpha(alpha);
        this.f5246E.setAlpha(alpha2);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f5255q.f5280m;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f5255q;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f5255q.f5284q == 2) {
            return;
        }
        if (N()) {
            outline.setRoundRect(getBounds(), D() * this.f5255q.f5278k);
        } else {
            g(s(), this.f5261w);
            com.google.android.material.drawable.a.j(outline, this.f5261w);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f5255q.f5276i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f5242A.set(getBounds());
        g(s(), this.f5261w);
        this.f5243B.setPath(this.f5261w, this.f5242A);
        this.f5242A.op(this.f5243B, Region.Op.DIFFERENCE);
        return this.f5242A;
    }

    protected final void h(RectF rectF, Path path) {
        m mVar = this.f5249H;
        c cVar = this.f5255q;
        mVar.d(cVar.f5268a, cVar.f5278k, rectF, this.f5248G, path);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f5259u = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f5255q.f5274g;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f5255q.f5273f;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f5255q.f5272e;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.f5255q.f5271d;
        return colorStateList4 != null && colorStateList4.isStateful();
    }

    protected int l(int i10) {
        float fG = G() + x();
        F4.a aVar = this.f5255q.f5269b;
        return aVar != null ? aVar.c(i10, fG) : i10;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f5255q = new c(this.f5255q);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f5259u = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z9 = d0(iArr) || e0();
        if (z9) {
            invalidateSelf();
        }
        return z9;
    }

    protected void q(Canvas canvas, Paint paint, Path path, RectF rectF) {
        p(canvas, paint, path, this.f5255q.f5268a, rectF);
    }

    protected void r(Canvas canvas) {
        p(canvas, this.f5246E, this.f5262x, this.f5244C, t());
    }

    protected RectF s() {
        this.f5263y.set(getBounds());
        return this.f5263y;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        c cVar = this.f5255q;
        if (cVar.f5280m != i10) {
            cVar.f5280m = i10;
            L();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f5255q.f5270c = colorFilter;
        L();
    }

    @Override // N4.o
    public void setShapeAppearanceModel(l lVar) {
        this.f5255q.f5268a = lVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f5255q.f5274g = colorStateList;
        e0();
        L();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f5255q;
        if (cVar.f5275h != mode) {
            cVar.f5275h = mode;
            e0();
            L();
        }
    }

    public float u() {
        return this.f5255q.f5282o;
    }

    public ColorStateList v() {
        return this.f5255q.f5271d;
    }

    public float w() {
        return this.f5255q.f5278k;
    }

    public float x() {
        return this.f5255q.f5281n;
    }

    public int y() {
        return this.f5252K;
    }

    public int z() {
        c cVar = this.f5255q;
        return (int) (((double) cVar.f5286s) * Math.sin(Math.toRadians(cVar.f5287t)));
    }

    public h(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(l.e(context, attributeSet, i10, i11).m());
    }

    public h(l lVar) {
        this(new c(lVar, null));
    }

    protected h(c cVar) {
        m mVar;
        this.f5256r = new n.g[4];
        this.f5257s = new n.g[4];
        this.f5258t = new BitSet(8);
        this.f5260v = new Matrix();
        this.f5261w = new Path();
        this.f5262x = new Path();
        this.f5263y = new RectF();
        this.f5264z = new RectF();
        this.f5242A = new Region();
        this.f5243B = new Region();
        Paint paint = new Paint(1);
        this.f5245D = paint;
        Paint paint2 = new Paint(1);
        this.f5246E = paint2;
        this.f5247F = new M4.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            mVar = m.k();
        } else {
            mVar = new m();
        }
        this.f5249H = mVar;
        this.f5253L = new RectF();
        this.f5254M = true;
        this.f5255q = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        e0();
        d0(getState());
        this.f5248G = new a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static class c extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        l f5268a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        F4.a f5269b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ColorFilter f5270c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ColorStateList f5271d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        ColorStateList f5272e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        ColorStateList f5273f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ColorStateList f5274g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        PorterDuff.Mode f5275h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Rect f5276i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        float f5277j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f5278k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f5279l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f5280m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        float f5281n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        float f5282o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        float f5283p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f5284q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f5285r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f5286s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f5287t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        boolean f5288u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Paint.Style f5289v;

        public c(l lVar, F4.a aVar) {
            this.f5271d = null;
            this.f5272e = null;
            this.f5273f = null;
            this.f5274g = null;
            this.f5275h = PorterDuff.Mode.SRC_IN;
            this.f5276i = null;
            this.f5277j = 1.0f;
            this.f5278k = 1.0f;
            this.f5280m = 255;
            this.f5281n = 0.0f;
            this.f5282o = 0.0f;
            this.f5283p = 0.0f;
            this.f5284q = 0;
            this.f5285r = 0;
            this.f5286s = 0;
            this.f5287t = 0;
            this.f5288u = false;
            this.f5289v = Paint.Style.FILL_AND_STROKE;
            this.f5268a = lVar;
            this.f5269b = aVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            h hVar = new h(this);
            hVar.f5259u = true;
            return hVar;
        }

        public c(c cVar) {
            this.f5271d = null;
            this.f5272e = null;
            this.f5273f = null;
            this.f5274g = null;
            this.f5275h = PorterDuff.Mode.SRC_IN;
            this.f5276i = null;
            this.f5277j = 1.0f;
            this.f5278k = 1.0f;
            this.f5280m = 255;
            this.f5281n = 0.0f;
            this.f5282o = 0.0f;
            this.f5283p = 0.0f;
            this.f5284q = 0;
            this.f5285r = 0;
            this.f5286s = 0;
            this.f5287t = 0;
            this.f5288u = false;
            this.f5289v = Paint.Style.FILL_AND_STROKE;
            this.f5268a = cVar.f5268a;
            this.f5269b = cVar.f5269b;
            this.f5279l = cVar.f5279l;
            this.f5270c = cVar.f5270c;
            this.f5271d = cVar.f5271d;
            this.f5272e = cVar.f5272e;
            this.f5275h = cVar.f5275h;
            this.f5274g = cVar.f5274g;
            this.f5280m = cVar.f5280m;
            this.f5277j = cVar.f5277j;
            this.f5286s = cVar.f5286s;
            this.f5284q = cVar.f5284q;
            this.f5288u = cVar.f5288u;
            this.f5278k = cVar.f5278k;
            this.f5281n = cVar.f5281n;
            this.f5282o = cVar.f5282o;
            this.f5283p = cVar.f5283p;
            this.f5285r = cVar.f5285r;
            this.f5287t = cVar.f5287t;
            this.f5273f = cVar.f5273f;
            this.f5289v = cVar.f5289v;
            if (cVar.f5276i != null) {
                this.f5276i = new Rect(cVar.f5276i);
            }
        }
    }
}
