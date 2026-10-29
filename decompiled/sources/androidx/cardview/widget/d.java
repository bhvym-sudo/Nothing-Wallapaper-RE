package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
class d extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f11232a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RectF f11234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f11235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f11236e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ColorStateList f11239h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private PorterDuffColorFilter f11240i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ColorStateList f11241j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f11237f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f11238g = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PorterDuff.Mode f11242k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f11233b = new Paint(5);

    d(ColorStateList colorStateList, float f10) {
        this.f11232a = f10;
        e(colorStateList);
        this.f11234c = new RectF();
        this.f11235d = new Rect();
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    private void e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f11239h = colorStateList;
        this.f11233b.setColor(colorStateList.getColorForState(getState(), this.f11239h.getDefaultColor()));
    }

    private void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f11234c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f11235d.set(rect);
        if (this.f11237f) {
            this.f11235d.inset((int) Math.ceil(e.a(this.f11236e, this.f11232a, this.f11238g)), (int) Math.ceil(e.b(this.f11236e, this.f11232a, this.f11238g)));
            this.f11234c.set(this.f11235d);
        }
    }

    public ColorStateList b() {
        return this.f11239h;
    }

    float c() {
        return this.f11236e;
    }

    public float d() {
        return this.f11232a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z9;
        Paint paint = this.f11233b;
        if (this.f11240i == null || paint.getColorFilter() != null) {
            z9 = false;
        } else {
            paint.setColorFilter(this.f11240i);
            z9 = true;
        }
        RectF rectF = this.f11234c;
        float f10 = this.f11232a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z9) {
            paint.setColorFilter(null);
        }
    }

    public void f(ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    void g(float f10, boolean z9, boolean z10) {
        if (f10 == this.f11236e && this.f11237f == z9 && this.f11238g == z10) {
            return;
        }
        this.f11236e = f10;
        this.f11237f = z9;
        this.f11238g = z10;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f11235d, this.f11232a);
    }

    void h(float f10) {
        if (f10 == this.f11232a) {
            return;
        }
        this.f11232a = f10;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f11241j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f11239h;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f11239h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z9 = colorForState != this.f11233b.getColor();
        if (z9) {
            this.f11233b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f11241j;
        if (colorStateList2 == null || (mode = this.f11242k) == null) {
            return z9;
        }
        this.f11240i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f11233b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f11233b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f11241j = colorStateList;
        this.f11240i = a(colorStateList, this.f11242k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f11242k = mode;
        this.f11240i = a(this.f11241j, mode);
        invalidateSelf();
    }
}
