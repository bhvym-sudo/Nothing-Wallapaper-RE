package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int[] f11221x = {R.attr.colorBackground};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final c f11222y;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f11223q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f11224r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f11225s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f11226t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final Rect f11227u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final Rect f11228v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final b f11229w;

    class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Drawable f11230a;

        a() {
        }

        @Override // androidx.cardview.widget.b
        public void a(Drawable drawable) {
            this.f11230a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // androidx.cardview.widget.b
        public boolean b() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // androidx.cardview.widget.b
        public boolean c() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // androidx.cardview.widget.b
        public Drawable d() {
            return this.f11230a;
        }

        @Override // androidx.cardview.widget.b
        public View e() {
            return CardView.this;
        }

        @Override // androidx.cardview.widget.b
        public void f(int i10, int i11, int i12, int i13) {
            CardView.this.f11228v.set(i10, i11, i12, i13);
            CardView cardView = CardView.this;
            Rect rect = cardView.f11227u;
            CardView.super.setPadding(i10 + rect.left, i11 + rect.top, i12 + rect.right, i13 + rect.bottom);
        }
    }

    static {
        androidx.cardview.widget.a aVar = new androidx.cardview.widget.a();
        f11222y = aVar;
        aVar.i();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p140o.a.f23293a);
    }

    public ColorStateList getCardBackgroundColor() {
        return f11222y.h(this.f11229w);
    }

    public float getCardElevation() {
        return f11222y.c(this.f11229w);
    }

    public int getContentPaddingBottom() {
        return this.f11227u.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f11227u.left;
    }

    public int getContentPaddingRight() {
        return this.f11227u.right;
    }

    public int getContentPaddingTop() {
        return this.f11227u.top;
    }

    public float getMaxCardElevation() {
        return f11222y.g(this.f11229w);
    }

    public boolean getPreventCornerOverlap() {
        return this.f11224r;
    }

    public float getRadius() {
        return f11222y.d(this.f11229w);
    }

    public boolean getUseCompatPadding() {
        return this.f11223q;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        c cVar = f11222y;
        if (cVar instanceof androidx.cardview.widget.a) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(cVar.k(this.f11229w)), View.MeasureSpec.getSize(i10)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(cVar.j(this.f11229w)), View.MeasureSpec.getSize(i11)), mode2);
        }
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(int i10) {
        f11222y.m(this.f11229w, ColorStateList.valueOf(i10));
    }

    public void setCardElevation(float f10) {
        f11222y.f(this.f11229w, f10);
    }

    public void setMaxCardElevation(float f10) {
        f11222y.n(this.f11229w, f10);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i10) {
        this.f11226t = i10;
        super.setMinimumHeight(i10);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i10) {
        this.f11225s = i10;
        super.setMinimumWidth(i10);
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }

    public void setPreventCornerOverlap(boolean z9) {
        if (z9 != this.f11224r) {
            this.f11224r = z9;
            f11222y.l(this.f11229w);
        }
    }

    public void setRadius(float f10) {
        f11222y.b(this.f11229w, f10);
    }

    public void setUseCompatPadding(boolean z9) {
        if (this.f11223q != z9) {
            this.f11223q = z9;
            f11222y.e(this.f11229w);
        }
    }

    public CardView(Context context, AttributeSet attributeSet, int i10) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i10);
        Rect rect = new Rect();
        this.f11227u = rect;
        this.f11228v = new Rect();
        a aVar = new a();
        this.f11229w = aVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p140o.d.f23297a, i10, p140o.c.f23296a);
        int i11 = p140o.d.f23300d;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(i11);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f11221x);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(p140o.b.f23295b) : getResources().getColor(p140o.b.f23294a));
        }
        ColorStateList colorStateList = colorStateListValueOf;
        float dimension = typedArrayObtainStyledAttributes.getDimension(p140o.d.f23301e, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(p140o.d.f23302f, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(p140o.d.f23303g, 0.0f);
        this.f11223q = typedArrayObtainStyledAttributes.getBoolean(p140o.d.f23305i, false);
        this.f11224r = typedArrayObtainStyledAttributes.getBoolean(p140o.d.f23304h, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(p140o.d.f23306j, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(p140o.d.f23308l, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(p140o.d.f23310n, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(p140o.d.f23309m, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(p140o.d.f23307k, dimensionPixelSize);
        float f10 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f11225s = typedArrayObtainStyledAttributes.getDimensionPixelSize(p140o.d.f23298b, 0);
        this.f11226t = typedArrayObtainStyledAttributes.getDimensionPixelSize(p140o.d.f23299c, 0);
        typedArrayObtainStyledAttributes.recycle();
        f11222y.a(aVar, context, colorStateList, dimension, dimension2, f10);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f11222y.m(this.f11229w, colorStateList);
    }
}
