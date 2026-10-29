package com.nothing.widget.ui;

import android.R;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import android.widget.CompoundButton;
import com.nothing.widget.ui.NtSwitch;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p057f6.b;
import p067g6.c;

/* JADX INFO: loaded from: classes2.dex */
public final class NtSwitch extends CompoundButton {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final a f19243J = new a(null);

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static final PathInterpolator f19244K = new PathInterpolator(0.4f, 0.0f, 1.0f, 0.6f);

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static final PathInterpolator f19245L = new PathInterpolator(0.0f, 0.4f, 0.4f, 1.0f);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private float f19246A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private float f19247B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private ValueAnimator f19248C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f19249D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f19250E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f19251F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f19252G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f19253H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final Paint f19254I;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f19255q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private GradientDrawable f19256r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private GradientDrawable f19257s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private GradientDrawable f19258t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f19259u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f19260v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f19261w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f19262x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f19263y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f19264z;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NtSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        n.h(context, "context");
    }

    private final void b(boolean z9) {
        final float f10 = this.f19247B;
        final float f11 = z9 ? 1.0f : 0.0f;
        final int i10 = z9 ? this.f19252G : this.f19251F;
        final int i11 = z9 ? this.f19251F : this.f19252G;
        ValueAnimator valueAnimator = this.f19248C;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X7.n
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                NtSwitch.c(this.f9018a, f10, f11, i10, i11, valueAnimator2);
            }
        });
        valueAnimatorOfFloat.start();
        this.f19248C = valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(NtSwitch this$0, float f10, float f11, int i10, int i11, ValueAnimator it) {
        n.h(this$0, "this$0");
        n.h(it, "it");
        Object animatedValue = it.getAnimatedValue();
        n.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) animatedValue).floatValue();
        if (fFloatValue < 0.5f) {
            float interpolation = f19244K.getInterpolation(fFloatValue / 0.5f);
            int i12 = this$0.f19260v;
            this$0.f19259u = (int) (i12 + ((this$0.f19261w - i12) * interpolation));
            this$0.f19247B = f10;
        } else {
            float interpolation2 = f19245L.getInterpolation((fFloatValue - 0.5f) / 0.5f);
            int i13 = this$0.f19261w;
            this$0.f19259u = (int) (i13 - ((i13 - this$0.f19260v) * interpolation2));
            this$0.f19247B = f10 + ((f11 - f10) * interpolation2);
            Object objEvaluate = new ArgbEvaluator().evaluate(interpolation2, Integer.valueOf(i10), Integer.valueOf(i11));
            n.f(objEvaluate, "null cannot be cast to non-null type kotlin.Int");
            this$0.f19253H = ((Integer) objEvaluate).intValue();
        }
        this$0.invalidate();
    }

    private final GradientDrawable d() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        int i10 = this.f19260v;
        gradientDrawable.setSize(i10, i10);
        gradientDrawable.setCornerRadius(this.f19246A);
        gradientDrawable.setColor(this.f19249D);
        return gradientDrawable;
    }

    private final GradientDrawable e(int i10) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setSize(this.f19263y, this.f19264z);
        gradientDrawable.setCornerRadius(this.f19246A);
        gradientDrawable.setColor(i10);
        return gradientDrawable;
    }

    private final void f() {
        this.f19262x = getResources().getDimensionPixelSize(b.f20858d);
        int dimensionPixelSize = getResources().getDimensionPixelSize(b.f20860f);
        this.f19260v = dimensionPixelSize;
        this.f19259u = dimensionPixelSize;
        this.f19261w = getResources().getDimensionPixelSize(b.f20859e);
        this.f19263y = getResources().getDimensionPixelSize(b.f20862h);
        this.f19264z = getResources().getDimensionPixelSize(b.f20861g);
        this.f19246A = getResources().getDimension(b.f20856b);
        Context context = getContext();
        int i10 = p057f6.a.f20854d;
        this.f19249D = p171r0.a.b(context, i10);
        this.f19250E = p171r0.a.b(getContext(), i10);
        this.f19251F = p171r0.a.b(getContext(), p057f6.a.f20853c);
        int iB = p171r0.a.b(getContext(), p057f6.a.f20852b);
        this.f19252G = iB;
        this.f19253H = iB;
    }

    private final void h() {
        float f10;
        if (isEnabled()) {
            f10 = 1.0f;
        } else {
            f10 = isChecked() ? 0.3f : 0.4f;
        }
        int i10 = (int) (f10 * 255);
        this.f19249D = p191t0.a.x(this.f19249D, i10);
        this.f19250E = p191t0.a.x(this.f19250E, i10);
        this.f19251F = p191t0.a.x(this.f19251F, i10);
        this.f19252G = p191t0.a.x(this.f19252G, i10);
        this.f19253H = isChecked() ? this.f19251F : this.f19252G;
    }

    public final void g(boolean z9, boolean z10) {
        this.f19255q = z10;
        setChecked(z9);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        n.h(canvas, "canvas");
        super.onDraw(canvas);
        float height = getHeight() / 2.0f;
        float width = (getWidth() - this.f19263y) / 2.0f;
        float f10 = height - (this.f19264z / 2.0f);
        GradientDrawable gradientDrawable = isChecked() ? this.f19257s : this.f19258t;
        gradientDrawable.setColor(this.f19253H);
        gradientDrawable.setBounds((int) width, (int) f10, (int) (this.f19263y + width), (int) (f10 + this.f19264z));
        gradientDrawable.draw(canvas);
        boolean z9 = getLayoutDirection() == 1;
        int i10 = this.f19263y;
        int i11 = this.f19259u;
        int i12 = this.f19262x;
        float f11 = width + i12 + ((z9 ? 1.0f - this.f19247B : this.f19247B) * ((i10 - i11) - (i12 * 2)));
        int i13 = this.f19260v;
        float f12 = height - (i13 / 2.0f);
        this.f19256r.setBounds((int) f11, (int) f12, (int) (f11 + i11), (int) (f12 + i13));
        this.f19256r.draw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.resolveSize(this.f19263y, i10), View.resolveSize(this.f19264z + (this.f19262x * 2), i11));
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z9) {
        boolean zIsChecked = isChecked();
        h();
        super.setChecked(z9);
        GradientDrawable gradientDrawable = this.f19256r;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(z9 ? this.f19249D : this.f19250E);
        }
        if (zIsChecked == z9 || !this.f19255q) {
            this.f19247B = z9 ? 1.0f : 0.0f;
            this.f19253H = z9 ? this.f19251F : this.f19252G;
        } else {
            b(z9);
            c.a aVar = c.f21297f;
            Context context = getContext();
            n.g(context, "getContext(...)");
            aVar.a(context).g();
        }
        this.f19255q = true;
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        h();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        super.toggle();
    }

    public /* synthetic */ NtSwitch(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC1457h abstractC1457h) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? R.attr.switchStyle : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NtSwitch(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        n.h(context, "context");
        this.f19255q = true;
        this.f19254I = new Paint(1);
        f();
        this.f19256r = d();
        this.f19257s = e(this.f19251F);
        this.f19258t = e(this.f19252G);
        setBackground(null);
    }
}
