package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.appcompat.app.o;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
@ViewPager.e
public class PagerTitleStrip extends ViewGroup {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final int[] f14361D = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.gravity};

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final int[] f14362E = {R.attr.textAllCaps};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private WeakReference f14363A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f14364B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    int f14365C;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    ViewPager f14366q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    TextView f14367r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    TextView f14368s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    TextView f14369t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f14370u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    float f14371v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f14372w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f14373x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f14374y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f14375z;

    private static class a extends SingleLineTransformationMethod {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Locale f14376a;

        a(Context context) {
            this.f14376a = context.getResources().getConfiguration().locale;
        }

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.f14376a);
            }
            return null;
        }
    }

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new a(textView.getContext()));
    }

    void a(androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2) {
        ViewPager viewPager = this.f14366q;
        if (viewPager != null) {
            this.f14370u = -1;
            this.f14371v = -1.0f;
            b(viewPager.getCurrentItem(), aVar2);
            requestLayout();
        }
    }

    void b(int i10, androidx.viewpager.widget.a aVar) {
        this.f14374y = true;
        this.f14367r.setText((CharSequence) null);
        this.f14368s.setText((CharSequence) null);
        this.f14369t.setText((CharSequence) null);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.f14367r.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f14368s.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f14369t.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f14370u = i10;
        if (!this.f14375z) {
            c(i10, this.f14371v, false);
        }
        this.f14374y = false;
    }

    void c(int i10, float f10, boolean z9) {
        int i11;
        int i12;
        int i13;
        int i14;
        if (i10 != this.f14370u) {
            this.f14366q.getAdapter();
            b(i10, null);
        } else if (!z9 && f10 == this.f14371v) {
            return;
        }
        this.f14375z = true;
        int measuredWidth = this.f14367r.getMeasuredWidth();
        int measuredWidth2 = this.f14368s.getMeasuredWidth();
        int measuredWidth3 = this.f14369t.getMeasuredWidth();
        int i15 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i16 = paddingRight + i15;
        int i17 = (width - (paddingLeft + i15)) - i16;
        float f11 = 0.5f + f10;
        if (f11 > 1.0f) {
            f11 -= 1.0f;
        }
        int i18 = ((width - i16) - ((int) (i17 * f11))) - i15;
        int i19 = measuredWidth2 + i18;
        int baseline = this.f14367r.getBaseline();
        int baseline2 = this.f14368s.getBaseline();
        int baseline3 = this.f14369t.getBaseline();
        int iMax = Math.max(Math.max(baseline, baseline2), baseline3);
        int i20 = iMax - baseline;
        int i21 = iMax - baseline2;
        int i22 = iMax - baseline3;
        int iMax2 = Math.max(Math.max(this.f14367r.getMeasuredHeight() + i20, this.f14368s.getMeasuredHeight() + i21), this.f14369t.getMeasuredHeight() + i22);
        int i23 = this.f14373x & 112;
        if (i23 != 16) {
            if (i23 != 80) {
                i12 = i20 + paddingTop;
                i13 = i21 + paddingTop;
                i14 = paddingTop + i22;
            } else {
                i11 = (height - paddingBottom) - iMax2;
            }
            TextView textView = this.f14368s;
            textView.layout(i18, i13, i19, textView.getMeasuredHeight() + i13);
            int iMin = Math.min(paddingLeft, (i18 - this.f14372w) - measuredWidth);
            TextView textView2 = this.f14367r;
            textView2.layout(iMin, i12, iMin + measuredWidth, textView2.getMeasuredHeight() + i12);
            int iMax3 = Math.max((width - paddingRight) - measuredWidth3, i19 + this.f14372w);
            TextView textView3 = this.f14369t;
            textView3.layout(iMax3, i14, iMax3 + measuredWidth3, textView3.getMeasuredHeight() + i14);
            this.f14371v = f10;
            this.f14375z = false;
        }
        i11 = (((height - paddingTop) - paddingBottom) - iMax2) / 2;
        i12 = i20 + i11;
        i13 = i21 + i11;
        i14 = i11 + i22;
        TextView textView4 = this.f14368s;
        textView4.layout(i18, i13, i19, textView4.getMeasuredHeight() + i13);
        int iMin2 = Math.min(paddingLeft, (i18 - this.f14372w) - measuredWidth);
        TextView textView5 = this.f14367r;
        textView5.layout(iMin2, i12, iMin2 + measuredWidth, textView5.getMeasuredHeight() + i12);
        int iMax4 = Math.max((width - paddingRight) - measuredWidth3, i19 + this.f14372w);
        TextView textView6 = this.f14369t;
        textView6.layout(iMax4, i14, iMax4 + measuredWidth3, textView6.getMeasuredHeight() + i14);
        this.f14371v = f10;
        this.f14375z = false;
    }

    int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.f14372w;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof ViewPager)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        ViewPager viewPager = (ViewPager) parent;
        viewPager.getAdapter();
        viewPager.K(null);
        viewPager.a(null);
        this.f14366q = viewPager;
        WeakReference weakReference = this.f14363A;
        if (weakReference != null) {
            o.a(weakReference.get());
        }
        a(null, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.f14366q;
        if (viewPager != null) {
            viewPager.getAdapter();
            a(null, null);
            this.f14366q.K(null);
            this.f14366q.C(null);
            this.f14366q = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        if (this.f14366q != null) {
            float f10 = this.f14371v;
            if (f10 < 0.0f) {
                f10 = 0.0f;
            }
            c(this.f14370u, f10, true);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int iMax;
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingTop, -2);
        int size = View.MeasureSpec.getSize(i10);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i10, (int) (size * 0.2f), -2);
        this.f14367r.measure(childMeasureSpec2, childMeasureSpec);
        this.f14368s.measure(childMeasureSpec2, childMeasureSpec);
        this.f14369t.measure(childMeasureSpec2, childMeasureSpec);
        if (View.MeasureSpec.getMode(i11) == 1073741824) {
            iMax = View.MeasureSpec.getSize(i11);
        } else {
            iMax = Math.max(getMinHeight(), this.f14368s.getMeasuredHeight() + paddingTop);
        }
        setMeasuredDimension(size, View.resolveSizeAndState(iMax, i11, this.f14368s.getMeasuredState() << 16));
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f14374y) {
            return;
        }
        super.requestLayout();
    }

    public void setGravity(int i10) {
        this.f14373x = i10;
        requestLayout();
    }

    public void setNonPrimaryAlpha(float f10) {
        int i10 = ((int) (f10 * 255.0f)) & 255;
        this.f14364B = i10;
        int i11 = (i10 << 24) | (this.f14365C & 16777215);
        this.f14367r.setTextColor(i11);
        this.f14369t.setTextColor(i11);
    }

    public void setTextColor(int i10) {
        this.f14365C = i10;
        this.f14368s.setTextColor(i10);
        int i11 = (this.f14364B << 24) | (this.f14365C & 16777215);
        this.f14367r.setTextColor(i11);
        this.f14369t.setTextColor(i11);
    }

    public void setTextSpacing(int i10) {
        this.f14372w = i10;
        requestLayout();
    }
}
