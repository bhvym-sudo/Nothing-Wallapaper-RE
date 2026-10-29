package com.google.android.material.timepicker;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.C1069a;
import androidx.core.view.H;
import java.util.Arrays;
import p225w4.g;
import p225w4.j;
import p225w4.k;

/* JADX INFO: loaded from: classes.dex */
class ClockFaceView extends d implements ClockHandView.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final float[] f17586A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final int f17587B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f17588C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final int f17589D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final int f17590E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private String[] f17591F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private float f17592G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final ColorStateList f17593H;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ClockHandView f17594t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Rect f17595u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final RectF f17596v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Rect f17597w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final SparseArray f17598x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final C1069a f17599y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final int[] f17600z;

    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.f(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.f17594t.i()) - ClockFaceView.this.f17587B);
            return true;
        }
    }

    class b extends C1069a {
        b() {
        }

        @Override // androidx.core.view.C1069a
        public void onInitializeAccessibilityNodeInfo(View view, C0.d dVar) {
            super.onInitializeAccessibilityNodeInfo(view, dVar);
            int iIntValue = ((Integer) view.getTag(p225w4.e.f28839r)).intValue();
            if (iIntValue > 0) {
                dVar.O0((View) ClockFaceView.this.f17598x.get(iIntValue - 1));
            }
            dVar.j0(C0.d.f.a(0, 1, iIntValue, 1, false, view.isSelected()));
            dVar.h0(true);
            dVar.b(C0.d.a.f543i);
        }

        @Override // androidx.core.view.C1069a
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            if (i10 != 16) {
                return super.performAccessibilityAction(view, i10, bundle);
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            view.getHitRect(ClockFaceView.this.f17595u);
            float fCenterX = ClockFaceView.this.f17595u.centerX();
            float fCenterY = ClockFaceView.this.f17595u.centerY();
            ClockFaceView.this.f17594t.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
            ClockFaceView.this.f17594t.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
            return true;
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p225w4.a.f28666A);
    }

    private void n() {
        RectF rectFE = this.f17594t.e();
        TextView textViewP = p(rectFE);
        for (int i10 = 0; i10 < this.f17598x.size(); i10++) {
            TextView textView = (TextView) this.f17598x.get(i10);
            if (textView != null) {
                textView.setSelected(textView == textViewP);
                textView.getPaint().setShader(o(rectFE, textView));
                textView.invalidate();
            }
        }
    }

    private RadialGradient o(RectF rectF, TextView textView) {
        textView.getHitRect(this.f17595u);
        this.f17596v.set(this.f17595u);
        textView.getLineBounds(0, this.f17597w);
        RectF rectF2 = this.f17596v;
        Rect rect = this.f17597w;
        rectF2.inset(rect.left, rect.top);
        if (RectF.intersects(rectF, this.f17596v)) {
            return new RadialGradient(rectF.centerX() - this.f17596v.left, rectF.centerY() - this.f17596v.top, rectF.width() * 0.5f, this.f17600z, this.f17586A, Shader.TileMode.CLAMP);
        }
        return null;
    }

    private TextView p(RectF rectF) {
        float f10 = Float.MAX_VALUE;
        TextView textView = null;
        for (int i10 = 0; i10 < this.f17598x.size(); i10++) {
            TextView textView2 = (TextView) this.f17598x.get(i10);
            if (textView2 != null) {
                textView2.getHitRect(this.f17595u);
                this.f17596v.set(this.f17595u);
                this.f17596v.union(rectF);
                float fWidth = this.f17596v.width() * this.f17596v.height();
                if (fWidth < f10) {
                    textView = textView2;
                    f10 = fWidth;
                }
            }
        }
        return textView;
    }

    private static float q(float f10, float f11, float f12) {
        return Math.max(Math.max(f10, f11), f12);
    }

    private void s(int i10) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = this.f17598x.size();
        boolean z9 = false;
        for (int i11 = 0; i11 < Math.max(this.f17591F.length, size); i11++) {
            TextView textView = (TextView) this.f17598x.get(i11);
            if (i11 >= this.f17591F.length) {
                removeView(textView);
                this.f17598x.remove(i11);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(g.f28858i, (ViewGroup) this, false);
                    this.f17598x.put(i11, textView);
                    addView(textView);
                }
                textView.setText(this.f17591F[i11]);
                textView.setTag(p225w4.e.f28839r, Integer.valueOf(i11));
                int i12 = (i11 / 12) + 1;
                textView.setTag(p225w4.e.f28834m, Integer.valueOf(i12));
                if (i12 > 1) {
                    z9 = true;
                }
                H.g0(textView, this.f17599y);
                textView.setTextColor(this.f17593H);
                if (i10 != 0) {
                    textView.setContentDescription(getResources().getString(i10, this.f17591F[i11]));
                }
            }
        }
        this.f17594t.p(z9);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.b
    public void a(float f10, boolean z9) {
        if (Math.abs(this.f17592G - f10) > 0.001f) {
            this.f17592G = f10;
            n();
        }
    }

    @Override // com.google.android.material.timepicker.d
    public void f(int i10) {
        if (i10 != e()) {
            super.f(i10);
            this.f17594t.l(e());
        }
    }

    @Override // com.google.android.material.timepicker.d
    protected void h() {
        super.h();
        for (int i10 = 0; i10 < this.f17598x.size(); i10++) {
            ((TextView) this.f17598x.get(i10)).setVisibility(0);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C0.d.U0(accessibilityNodeInfo).i0(C0.d.e.a(1, this.f17591F.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        n();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iQ = (int) (this.f17590E / q(this.f17588C / displayMetrics.heightPixels, this.f17589D / displayMetrics.widthPixels, 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iQ, BasicMeasure.EXACTLY);
        setMeasuredDimension(iQ, iQ);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    public void r(String[] strArr, int i10) {
        this.f17591F = strArr;
        s(i10);
    }

    public ClockFaceView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f17595u = new Rect();
        this.f17596v = new RectF();
        this.f17597w = new Rect();
        this.f17598x = new SparseArray();
        this.f17586A = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f28981F1, i10, j.f28927x);
        Resources resources = getResources();
        ColorStateList colorStateListA = K4.c.a(context, typedArrayObtainStyledAttributes, k.f29001H1);
        this.f17593H = colorStateListA;
        LayoutInflater.from(context).inflate(g.f28859j, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(p225w4.e.f28833l);
        this.f17594t = clockHandView;
        this.f17587B = resources.getDimensionPixelSize(p225w4.c.f28787w);
        int colorForState = colorStateListA.getColorForState(new int[]{R.attr.state_selected}, colorStateListA.getDefaultColor());
        this.f17600z = new int[]{colorForState, colorForState, colorStateListA.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = p060g.a.a(context, p225w4.b.f28725b).getDefaultColor();
        ColorStateList colorStateListA2 = K4.c.a(context, typedArrayObtainStyledAttributes, k.f28991G1);
        setBackgroundColor(colorStateListA2 != null ? colorStateListA2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.f17599y = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        r(strArr, 0);
        this.f17588C = resources.getDimensionPixelSize(p225w4.c.f28739J);
        this.f17589D = resources.getDimensionPixelSize(p225w4.c.f28740K);
        this.f17590E = resources.getDimensionPixelSize(p225w4.c.f28789y);
    }
}
