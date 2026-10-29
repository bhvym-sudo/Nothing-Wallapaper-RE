package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import androidx.collection.C1021a;
import androidx.constraintlayout.motion.widget.Key;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p181s0.k;

/* JADX INFO: loaded from: classes.dex */
public class f extends androidx.vectordrawable.graphics.drawable.e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    static final PorterDuff.Mode f14263A = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private h f14264r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private PorterDuffColorFilter f14265s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ColorFilter f14266t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f14267u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f14268v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Drawable.ConstantState f14269w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final float[] f14270x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Matrix f14271y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Rect f14272z;

    private static class b extends AbstractC0420f {
        b() {
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f14299b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f14298a = p191t0.d.d(string2);
            }
            this.f14300c = k.k(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // androidx.vectordrawable.graphics.drawable.f.AbstractC0420f
        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (k.p(xmlPullParser, "pathData")) {
                TypedArray typedArrayQ = k.q(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f14236d);
                f(typedArrayQ, xmlPullParser);
                typedArrayQ.recycle();
            }
        }

        b(b bVar) {
            super(bVar);
        }
    }

    private static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    private static class h extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f14319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        g f14320b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ColorStateList f14321c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        PorterDuff.Mode f14322d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f14323e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Bitmap f14324f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ColorStateList f14325g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        PorterDuff.Mode f14326h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f14327i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f14328j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f14329k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Paint f14330l;

        public h(h hVar) {
            this.f14321c = null;
            this.f14322d = f.f14263A;
            if (hVar != null) {
                this.f14319a = hVar.f14319a;
                g gVar = new g(hVar.f14320b);
                this.f14320b = gVar;
                if (hVar.f14320b.f14307e != null) {
                    gVar.f14307e = new Paint(hVar.f14320b.f14307e);
                }
                if (hVar.f14320b.f14306d != null) {
                    this.f14320b.f14306d = new Paint(hVar.f14320b.f14306d);
                }
                this.f14321c = hVar.f14321c;
                this.f14322d = hVar.f14322d;
                this.f14323e = hVar.f14323e;
            }
        }

        public boolean a(int i10, int i11) {
            return i10 == this.f14324f.getWidth() && i11 == this.f14324f.getHeight();
        }

        public boolean b() {
            return !this.f14329k && this.f14325g == this.f14321c && this.f14326h == this.f14322d && this.f14328j == this.f14323e && this.f14327i == this.f14320b.getRootAlpha();
        }

        public void c(int i10, int i11) {
            if (this.f14324f == null || !a(i10, i11)) {
                this.f14324f = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                this.f14329k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f14324f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.f14330l == null) {
                Paint paint = new Paint();
                this.f14330l = paint;
                paint.setFilterBitmap(true);
            }
            this.f14330l.setAlpha(this.f14320b.getRootAlpha());
            this.f14330l.setColorFilter(colorFilter);
            return this.f14330l;
        }

        public boolean f() {
            return this.f14320b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f14320b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f14319a;
        }

        public boolean h(int[] iArr) {
            boolean zG = this.f14320b.g(iArr);
            this.f14329k |= zG;
            return zG;
        }

        public void i() {
            this.f14325g = this.f14321c;
            this.f14326h = this.f14322d;
            this.f14327i = this.f14320b.getRootAlpha();
            this.f14328j = this.f14323e;
            this.f14329k = false;
        }

        public void j(int i10, int i11) {
            this.f14324f.eraseColor(0);
            this.f14320b.b(new Canvas(this.f14324f), i10, i11, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new f(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new f(this);
        }

        public h() {
            this.f14321c = null;
            this.f14322d = f.f14263A;
            this.f14320b = new g();
        }
    }

    f() {
        this.f14268v = true;
        this.f14270x = new float[9];
        this.f14271y = new Matrix();
        this.f14272z = new Rect();
        this.f14264r = new h();
    }

    static int a(int i10, float f10) {
        return (i10 & 16777215) | (((int) (Color.alpha(i10) * f10)) << 24);
    }

    public static f b(Resources resources, int i10, Resources.Theme theme) {
        f fVar = new f();
        fVar.f14262q = p181s0.h.e(resources, i10, theme);
        fVar.f14269w = new i(fVar.f14262q.getConstantState());
        return fVar;
    }

    private void d(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        h hVar = this.f14264r;
        g gVar = hVar.f14320b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f14310h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z9 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f14286b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f14318p.put(cVar.getPathName(), cVar);
                    }
                    hVar.f14319a = cVar.f14301d | hVar.f14319a;
                    z9 = false;
                } else if ("clip-path".equals(name)) {
                    b bVar = new b();
                    bVar.e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f14286b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f14318p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f14319a = bVar.f14301d | hVar.f14319a;
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f14286b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f14318p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f14319a = dVar2.f14295k | hVar.f14319a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z9) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private boolean e() {
        return isAutoMirrored() && p201u0.a.f(this) == 1;
    }

    private static PorterDuff.Mode f(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        h hVar = this.f14264r;
        g gVar = hVar.f14320b;
        hVar.f14322d = f(k.k(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateListG = k.g(typedArray, xmlPullParser, theme, "tint", 1);
        if (colorStateListG != null) {
            hVar.f14321c = colorStateListG;
        }
        hVar.f14323e = k.e(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f14323e);
        gVar.f14313k = k.j(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f14313k);
        float fJ = k.j(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f14314l);
        gVar.f14314l = fJ;
        if (gVar.f14313k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (fJ <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        gVar.f14311i = typedArray.getDimension(3, gVar.f14311i);
        float dimension = typedArray.getDimension(2, gVar.f14312j);
        gVar.f14312j = dimension;
        if (gVar.f14311i <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        gVar.setAlpha(k.j(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            gVar.f14316n = string;
            gVar.f14318p.put(string, gVar);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    Object c(String str) {
        return this.f14264r.f14320b.f14318p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f14262q;
        if (drawable == null) {
            return false;
        }
        p201u0.a.b(drawable);
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f14262q;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f14272z);
        if (this.f14272z.width() <= 0 || this.f14272z.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f14266t;
        if (colorFilter == null) {
            colorFilter = this.f14265s;
        }
        canvas.getMatrix(this.f14271y);
        this.f14271y.getValues(this.f14270x);
        float fAbs = Math.abs(this.f14270x[0]);
        float fAbs2 = Math.abs(this.f14270x[4]);
        float fAbs3 = Math.abs(this.f14270x[1]);
        float fAbs4 = Math.abs(this.f14270x[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (this.f14272z.width() * fAbs);
        int iHeight = (int) (this.f14272z.height() * fAbs2);
        int iMin = Math.min(RecyclerView.ItemAnimator.FLAG_MOVED, iWidth);
        int iMin2 = Math.min(RecyclerView.ItemAnimator.FLAG_MOVED, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        Rect rect = this.f14272z;
        canvas.translate(rect.left, rect.top);
        if (e()) {
            canvas.translate(this.f14272z.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f14272z.offsetTo(0, 0);
        this.f14264r.c(iMin, iMin2);
        if (!this.f14268v) {
            this.f14264r.j(iMin, iMin2);
        } else if (!this.f14264r.b()) {
            this.f14264r.j(iMin, iMin2);
            this.f14264r.i();
        }
        this.f14264r.d(canvas, colorFilter, this.f14272z);
        canvas.restoreToCount(iSave);
    }

    void g(boolean z9) {
        this.f14268v = z9;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f14262q;
        return drawable != null ? p201u0.a.d(drawable) : this.f14264r.f14320b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f14262q;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.f14264r.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f14262q;
        return drawable != null ? p201u0.a.e(drawable) : this.f14266t;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f14262q != null) {
            return new i(this.f14262q.getConstantState());
        }
        this.f14264r.f14319a = getChangingConfigurations();
        return this.f14264r;
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f14262q;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f14264r.f14320b.f14312j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f14262q;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f14264r.f14320b.f14311i;
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f14262q;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f14262q;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f14262q;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f14262q;
        return drawable != null ? p201u0.a.h(drawable) : this.f14264r.f14323e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f14262q;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        h hVar = this.f14264r;
        if (hVar == null) {
            return false;
        }
        if (hVar.g()) {
            return true;
        }
        ColorStateList colorStateList = this.f14264r.f14321c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f14262q;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f14267u && super.mutate() == this) {
            this.f14264r = new h(this.f14264r);
            this.f14267u = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f14262q;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z9;
        PorterDuff.Mode mode;
        Drawable drawable = this.f14262q;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        h hVar = this.f14264r;
        ColorStateList colorStateList = hVar.f14321c;
        if (colorStateList == null || (mode = hVar.f14322d) == null) {
            z9 = false;
        } else {
            this.f14265s = updateTintFilter(this.f14265s, colorStateList, mode);
            invalidateSelf();
            z9 = true;
        }
        if (!hVar.g() || !hVar.h(iArr)) {
            return z9;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j9) {
        Drawable drawable = this.f14262q;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j9);
        } else {
            super.scheduleSelf(runnable, j9);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f14262q;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f14264r.f14320b.getRootAlpha() != i10) {
            this.f14264r.f14320b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z9) {
        Drawable drawable = this.f14262q;
        if (drawable != null) {
            p201u0.a.j(drawable, z9);
        } else {
            this.f14264r.f14323e = z9;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z9) {
        super.setFilterBitmap(z9);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        Drawable drawable = this.f14262q;
        if (drawable != null) {
            p201u0.a.n(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f14262q;
        if (drawable != null) {
            p201u0.a.o(drawable, colorStateList);
            return;
        }
        h hVar = this.f14264r;
        if (hVar.f14321c != colorStateList) {
            hVar.f14321c = colorStateList;
            this.f14265s = updateTintFilter(this.f14265s, colorStateList, hVar.f14322d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f14262q;
        if (drawable != null) {
            p201u0.a.p(drawable, mode);
            return;
        }
        h hVar = this.f14264r;
        if (hVar.f14322d != mode) {
            hVar.f14322d = mode;
            this.f14265s = updateTintFilter(this.f14265s, hVar.f14321c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z9, boolean z10) {
        Drawable drawable = this.f14262q;
        return drawable != null ? drawable.setVisible(z9, z10) : super.setVisible(z9, z10);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f14262q;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    PorterDuffColorFilter updateTintFilter(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    private static class i extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f14331a;

        public i(Drawable.ConstantState constantState) {
            this.f14331a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f14331a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f14331a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            f fVar = new f();
            fVar.f14262q = (VectorDrawable) this.f14331a.newDrawable();
            return fVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            f fVar = new f();
            fVar.f14262q = (VectorDrawable) this.f14331a.newDrawable(resources);
            return fVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            f fVar = new f();
            fVar.f14262q = (VectorDrawable) this.f14331a.newDrawable(resources, theme);
            return fVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f14262q;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f14266t = colorFilter;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.f$f, reason: collision with other inner class name */
    private static abstract class AbstractC0420f extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected t0.d.b[] f14298a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f14299b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f14300c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f14301d;

        public AbstractC0420f() {
            super();
            this.f14298a = null;
            this.f14300c = 0;
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            t0.d.b[] bVarArr = this.f14298a;
            if (bVarArr != null) {
                t0.d.b.h(bVarArr, path);
            }
        }

        public t0.d.b[] getPathData() {
            return this.f14298a;
        }

        public String getPathName() {
            return this.f14299b;
        }

        public void setPathData(t0.d.b[] bVarArr) {
            if (p191t0.d.b(this.f14298a, bVarArr)) {
                p191t0.d.k(this.f14298a, bVarArr);
            } else {
                this.f14298a = p191t0.d.f(bVarArr);
            }
        }

        public AbstractC0420f(AbstractC0420f abstractC0420f) {
            super();
            this.f14298a = null;
            this.f14300c = 0;
            this.f14299b = abstractC0420f.f14299b;
            this.f14301d = abstractC0420f.f14301d;
            this.f14298a = p191t0.d.f(abstractC0420f.f14298a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f14262q;
        if (drawable != null) {
            p201u0.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f14264r;
        hVar.f14320b = new g();
        TypedArray typedArrayQ = k.q(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f14233a);
        h(typedArrayQ, xmlPullParser, theme);
        typedArrayQ.recycle();
        hVar.f14319a = getChangingConfigurations();
        hVar.f14329k = true;
        d(resources, xmlPullParser, attributeSet, theme);
        this.f14265s = updateTintFilter(this.f14265s, hVar.f14321c, hVar.f14322d);
    }

    f(h hVar) {
        this.f14268v = true;
        this.f14270x = new float[9];
        this.f14271y = new Matrix();
        this.f14272z = new Rect();
        this.f14264r = hVar;
        this.f14265s = updateTintFilter(this.f14265s, hVar.f14321c, hVar.f14322d);
    }

    private static class c extends AbstractC0420f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int[] f14273e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        p181s0.d f14274f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        float f14275g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        p181s0.d f14276h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        float f14277i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        float f14278j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f14279k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f14280l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        float f14281m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Paint.Cap f14282n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Paint.Join f14283o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        float f14284p;

        c() {
            this.f14275g = 0.0f;
            this.f14277i = 1.0f;
            this.f14278j = 1.0f;
            this.f14279k = 0.0f;
            this.f14280l = 1.0f;
            this.f14281m = 0.0f;
            this.f14282n = Paint.Cap.BUTT;
            this.f14283o = Paint.Join.MITER;
            this.f14284p = 4.0f;
        }

        private Paint.Cap e(int i10, Paint.Cap cap) {
            if (i10 == 0) {
                return Paint.Cap.BUTT;
            }
            if (i10 != 1) {
                return i10 != 2 ? cap : Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }

        private Paint.Join f(int i10, Paint.Join join) {
            if (i10 == 0) {
                return Paint.Join.MITER;
            }
            if (i10 != 1) {
                return i10 != 2 ? join : Paint.Join.BEVEL;
            }
            return Paint.Join.ROUND;
        }

        private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f14273e = null;
            if (k.p(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f14299b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f14298a = p191t0.d.d(string2);
                }
                this.f14276h = k.i(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f14278j = k.j(typedArray, xmlPullParser, "fillAlpha", 12, this.f14278j);
                this.f14282n = e(k.k(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f14282n);
                this.f14283o = f(k.k(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f14283o);
                this.f14284p = k.j(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f14284p);
                this.f14274f = k.i(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f14277i = k.j(typedArray, xmlPullParser, "strokeAlpha", 11, this.f14277i);
                this.f14275g = k.j(typedArray, xmlPullParser, "strokeWidth", 4, this.f14275g);
                this.f14280l = k.j(typedArray, xmlPullParser, "trimPathEnd", 6, this.f14280l);
                this.f14281m = k.j(typedArray, xmlPullParser, "trimPathOffset", 7, this.f14281m);
                this.f14279k = k.j(typedArray, xmlPullParser, "trimPathStart", 5, this.f14279k);
                this.f14300c = k.k(typedArray, xmlPullParser, "fillType", 13, this.f14300c);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.f.e
        public boolean a() {
            return this.f14276h.i() || this.f14274f.i();
        }

        @Override // androidx.vectordrawable.graphics.drawable.f.e
        public boolean b(int[] iArr) {
            return this.f14274f.j(iArr) | this.f14276h.j(iArr);
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayQ = k.q(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f14235c);
            h(typedArrayQ, xmlPullParser, theme);
            typedArrayQ.recycle();
        }

        float getFillAlpha() {
            return this.f14278j;
        }

        int getFillColor() {
            return this.f14276h.e();
        }

        float getStrokeAlpha() {
            return this.f14277i;
        }

        int getStrokeColor() {
            return this.f14274f.e();
        }

        float getStrokeWidth() {
            return this.f14275g;
        }

        float getTrimPathEnd() {
            return this.f14280l;
        }

        float getTrimPathOffset() {
            return this.f14281m;
        }

        float getTrimPathStart() {
            return this.f14279k;
        }

        void setFillAlpha(float f10) {
            this.f14278j = f10;
        }

        void setFillColor(int i10) {
            this.f14276h.k(i10);
        }

        void setStrokeAlpha(float f10) {
            this.f14277i = f10;
        }

        void setStrokeColor(int i10) {
            this.f14274f.k(i10);
        }

        void setStrokeWidth(float f10) {
            this.f14275g = f10;
        }

        void setTrimPathEnd(float f10) {
            this.f14280l = f10;
        }

        void setTrimPathOffset(float f10) {
            this.f14281m = f10;
        }

        void setTrimPathStart(float f10) {
            this.f14279k = f10;
        }

        c(c cVar) {
            super(cVar);
            this.f14275g = 0.0f;
            this.f14277i = 1.0f;
            this.f14278j = 1.0f;
            this.f14279k = 0.0f;
            this.f14280l = 1.0f;
            this.f14281m = 0.0f;
            this.f14282n = Paint.Cap.BUTT;
            this.f14283o = Paint.Join.MITER;
            this.f14284p = 4.0f;
            this.f14273e = cVar.f14273e;
            this.f14274f = cVar.f14274f;
            this.f14275g = cVar.f14275g;
            this.f14277i = cVar.f14277i;
            this.f14276h = cVar.f14276h;
            this.f14300c = cVar.f14300c;
            this.f14278j = cVar.f14278j;
            this.f14279k = cVar.f14279k;
            this.f14280l = cVar.f14280l;
            this.f14281m = cVar.f14281m;
            this.f14282n = cVar.f14282n;
            this.f14283o = cVar.f14283o;
            this.f14284p = cVar.f14284p;
        }
    }

    private static class g {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final Matrix f14302q = new Matrix();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Path f14303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Path f14304b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Matrix f14305c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Paint f14306d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Paint f14307e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private PathMeasure f14308f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f14309g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final d f14310h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        float f14311i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        float f14312j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f14313k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f14314l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f14315m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        String f14316n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Boolean f14317o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final C1021a f14318p;

        public g() {
            this.f14305c = new Matrix();
            this.f14311i = 0.0f;
            this.f14312j = 0.0f;
            this.f14313k = 0.0f;
            this.f14314l = 0.0f;
            this.f14315m = 255;
            this.f14316n = null;
            this.f14317o = null;
            this.f14318p = new C1021a();
            this.f14310h = new d();
            this.f14303a = new Path();
            this.f14304b = new Path();
        }

        private static float a(float f10, float f11, float f12, float f13) {
            return (f10 * f13) - (f11 * f12);
        }

        private void c(d dVar, Matrix matrix, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            d dVar2 = dVar;
            dVar2.f14285a.set(matrix);
            dVar2.f14285a.preConcat(dVar2.f14294j);
            canvas.save();
            int i12 = 0;
            while (i12 < dVar2.f14286b.size()) {
                e eVar = (e) dVar2.f14286b.get(i12);
                if (eVar instanceof d) {
                    c((d) eVar, dVar2.f14285a, canvas, i10, i11, colorFilter);
                } else if (eVar instanceof AbstractC0420f) {
                    d(dVar2, (AbstractC0420f) eVar, canvas, i10, i11, colorFilter);
                }
                i12++;
                dVar2 = dVar;
            }
            canvas.restore();
        }

        private void d(d dVar, AbstractC0420f abstractC0420f, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            float f10 = i10 / this.f14313k;
            float f11 = i11 / this.f14314l;
            float fMin = Math.min(f10, f11);
            Matrix matrix = dVar.f14285a;
            this.f14305c.set(matrix);
            this.f14305c.postScale(f10, f11);
            float fE = e(matrix);
            if (fE == 0.0f) {
                return;
            }
            abstractC0420f.d(this.f14303a);
            Path path = this.f14303a;
            this.f14304b.reset();
            if (abstractC0420f.c()) {
                this.f14304b.setFillType(abstractC0420f.f14300c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f14304b.addPath(path, this.f14305c);
                canvas.clipPath(this.f14304b);
                return;
            }
            c cVar = (c) abstractC0420f;
            float f12 = cVar.f14279k;
            if (f12 != 0.0f || cVar.f14280l != 1.0f) {
                float f13 = cVar.f14281m;
                float f14 = (f12 + f13) % 1.0f;
                float f15 = (cVar.f14280l + f13) % 1.0f;
                if (this.f14308f == null) {
                    this.f14308f = new PathMeasure();
                }
                this.f14308f.setPath(this.f14303a, false);
                float length = this.f14308f.getLength();
                float f16 = f14 * length;
                float f17 = f15 * length;
                path.reset();
                if (f16 > f17) {
                    this.f14308f.getSegment(f16, length, path, true);
                    this.f14308f.getSegment(0.0f, f17, path, true);
                } else {
                    this.f14308f.getSegment(f16, f17, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f14304b.addPath(path, this.f14305c);
            if (cVar.f14276h.l()) {
                p181s0.d dVar2 = cVar.f14276h;
                if (this.f14307e == null) {
                    Paint paint = new Paint(1);
                    this.f14307e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f14307e;
                if (dVar2.h()) {
                    Shader shaderF = dVar2.f();
                    shaderF.setLocalMatrix(this.f14305c);
                    paint2.setShader(shaderF);
                    paint2.setAlpha(Math.round(cVar.f14278j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(f.a(dVar2.e(), cVar.f14278j));
                }
                paint2.setColorFilter(colorFilter);
                this.f14304b.setFillType(cVar.f14300c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f14304b, paint2);
            }
            if (cVar.f14274f.l()) {
                p181s0.d dVar3 = cVar.f14274f;
                if (this.f14306d == null) {
                    Paint paint3 = new Paint(1);
                    this.f14306d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f14306d;
                Paint.Join join = cVar.f14283o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f14282n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f14284p);
                if (dVar3.h()) {
                    Shader shaderF2 = dVar3.f();
                    shaderF2.setLocalMatrix(this.f14305c);
                    paint4.setShader(shaderF2);
                    paint4.setAlpha(Math.round(cVar.f14277i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(f.a(dVar3.e(), cVar.f14277i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f14275g * fMin * fE);
                canvas.drawPath(this.f14304b, paint4);
            }
        }

        private float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
            float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float fA = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float fMax = Math.max(fHypot, fHypot2);
            if (fMax > 0.0f) {
                return Math.abs(fA) / fMax;
            }
            return 0.0f;
        }

        public void b(Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            c(this.f14310h, f14302q, canvas, i10, i11, colorFilter);
        }

        public boolean f() {
            if (this.f14317o == null) {
                this.f14317o = Boolean.valueOf(this.f14310h.a());
            }
            return this.f14317o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f14310h.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f14315m;
        }

        public void setAlpha(float f10) {
            setRootAlpha((int) (f10 * 255.0f));
        }

        public void setRootAlpha(int i10) {
            this.f14315m = i10;
        }

        public g(g gVar) {
            this.f14305c = new Matrix();
            this.f14311i = 0.0f;
            this.f14312j = 0.0f;
            this.f14313k = 0.0f;
            this.f14314l = 0.0f;
            this.f14315m = 255;
            this.f14316n = null;
            this.f14317o = null;
            C1021a c1021a = new C1021a();
            this.f14318p = c1021a;
            this.f14310h = new d(gVar.f14310h, c1021a);
            this.f14303a = new Path(gVar.f14303a);
            this.f14304b = new Path(gVar.f14304b);
            this.f14311i = gVar.f14311i;
            this.f14312j = gVar.f14312j;
            this.f14313k = gVar.f14313k;
            this.f14314l = gVar.f14314l;
            this.f14309g = gVar.f14309g;
            this.f14315m = gVar.f14315m;
            this.f14316n = gVar.f14316n;
            String str = gVar.f14316n;
            if (str != null) {
                c1021a.put(str, this);
            }
            this.f14317o = gVar.f14317o;
        }
    }

    private static class d extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Matrix f14285a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ArrayList f14286b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f14287c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f14288d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f14289e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private float f14290f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f14291g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f14292h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private float f14293i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final Matrix f14294j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f14295k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int[] f14296l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private String f14297m;

        public d(d dVar, C1021a c1021a) {
            AbstractC0420f bVar;
            super();
            this.f14285a = new Matrix();
            this.f14286b = new ArrayList();
            this.f14287c = 0.0f;
            this.f14288d = 0.0f;
            this.f14289e = 0.0f;
            this.f14290f = 1.0f;
            this.f14291g = 1.0f;
            this.f14292h = 0.0f;
            this.f14293i = 0.0f;
            Matrix matrix = new Matrix();
            this.f14294j = matrix;
            this.f14297m = null;
            this.f14287c = dVar.f14287c;
            this.f14288d = dVar.f14288d;
            this.f14289e = dVar.f14289e;
            this.f14290f = dVar.f14290f;
            this.f14291g = dVar.f14291g;
            this.f14292h = dVar.f14292h;
            this.f14293i = dVar.f14293i;
            this.f14296l = dVar.f14296l;
            String str = dVar.f14297m;
            this.f14297m = str;
            this.f14295k = dVar.f14295k;
            if (str != null) {
                c1021a.put(str, this);
            }
            matrix.set(dVar.f14294j);
            ArrayList arrayList = dVar.f14286b;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Object obj = arrayList.get(i10);
                if (obj instanceof d) {
                    this.f14286b.add(new d((d) obj, c1021a));
                } else {
                    if (obj instanceof c) {
                        bVar = new c((c) obj);
                    } else {
                        if (!(obj instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) obj);
                    }
                    this.f14286b.add(bVar);
                    Object obj2 = bVar.f14299b;
                    if (obj2 != null) {
                        c1021a.put(obj2, bVar);
                    }
                }
            }
        }

        private void d() {
            this.f14294j.reset();
            this.f14294j.postTranslate(-this.f14288d, -this.f14289e);
            this.f14294j.postScale(this.f14290f, this.f14291g);
            this.f14294j.postRotate(this.f14287c, 0.0f, 0.0f);
            this.f14294j.postTranslate(this.f14292h + this.f14288d, this.f14293i + this.f14289e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f14296l = null;
            this.f14287c = k.j(typedArray, xmlPullParser, Key.ROTATION, 5, this.f14287c);
            this.f14288d = typedArray.getFloat(1, this.f14288d);
            this.f14289e = typedArray.getFloat(2, this.f14289e);
            this.f14290f = k.j(typedArray, xmlPullParser, "scaleX", 3, this.f14290f);
            this.f14291g = k.j(typedArray, xmlPullParser, "scaleY", 4, this.f14291g);
            this.f14292h = k.j(typedArray, xmlPullParser, "translateX", 6, this.f14292h);
            this.f14293i = k.j(typedArray, xmlPullParser, "translateY", 7, this.f14293i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f14297m = string;
            }
            d();
        }

        @Override // androidx.vectordrawable.graphics.drawable.f.e
        public boolean a() {
            for (int i10 = 0; i10 < this.f14286b.size(); i10++) {
                if (((e) this.f14286b.get(i10)).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.vectordrawable.graphics.drawable.f.e
        public boolean b(int[] iArr) {
            boolean zB = false;
            for (int i10 = 0; i10 < this.f14286b.size(); i10++) {
                zB |= ((e) this.f14286b.get(i10)).b(iArr);
            }
            return zB;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayQ = k.q(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f14234b);
            e(typedArrayQ, xmlPullParser);
            typedArrayQ.recycle();
        }

        public String getGroupName() {
            return this.f14297m;
        }

        public Matrix getLocalMatrix() {
            return this.f14294j;
        }

        public float getPivotX() {
            return this.f14288d;
        }

        public float getPivotY() {
            return this.f14289e;
        }

        public float getRotation() {
            return this.f14287c;
        }

        public float getScaleX() {
            return this.f14290f;
        }

        public float getScaleY() {
            return this.f14291g;
        }

        public float getTranslateX() {
            return this.f14292h;
        }

        public float getTranslateY() {
            return this.f14293i;
        }

        public void setPivotX(float f10) {
            if (f10 != this.f14288d) {
                this.f14288d = f10;
                d();
            }
        }

        public void setPivotY(float f10) {
            if (f10 != this.f14289e) {
                this.f14289e = f10;
                d();
            }
        }

        public void setRotation(float f10) {
            if (f10 != this.f14287c) {
                this.f14287c = f10;
                d();
            }
        }

        public void setScaleX(float f10) {
            if (f10 != this.f14290f) {
                this.f14290f = f10;
                d();
            }
        }

        public void setScaleY(float f10) {
            if (f10 != this.f14291g) {
                this.f14291g = f10;
                d();
            }
        }

        public void setTranslateX(float f10) {
            if (f10 != this.f14292h) {
                this.f14292h = f10;
                d();
            }
        }

        public void setTranslateY(float f10) {
            if (f10 != this.f14293i) {
                this.f14293i = f10;
                d();
            }
        }

        public d() {
            super();
            this.f14285a = new Matrix();
            this.f14286b = new ArrayList();
            this.f14287c = 0.0f;
            this.f14288d = 0.0f;
            this.f14289e = 0.0f;
            this.f14290f = 1.0f;
            this.f14291g = 1.0f;
            this.f14292h = 0.0f;
            this.f14293i = 0.0f;
            this.f14294j = new Matrix();
            this.f14297m = null;
        }
    }
}
