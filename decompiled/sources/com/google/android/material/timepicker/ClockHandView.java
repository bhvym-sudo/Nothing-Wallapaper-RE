package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.H;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.android.material.internal.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p225w4.j;
import p225w4.k;

/* JADX INFO: loaded from: classes.dex */
class ClockHandView extends View {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final int f17603A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final float f17604B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final Paint f17605C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final RectF f17606D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final int f17607E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private float f17608F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f17609G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private double f17610H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f17611I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f17612J;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f17613q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final TimeInterpolator f17614r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ValueAnimator f17615s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f17616t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f17617u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f17618v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f17619w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int f17620x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f17621y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final List f17622z;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface b {
        void a(float f10, boolean z9);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p225w4.a.f28666A);
    }

    public static /* synthetic */ void a(ClockHandView clockHandView, ValueAnimator valueAnimator) {
        clockHandView.getClass();
        clockHandView.o(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    private void c(float f10, float f11) {
        this.f17612J = H4.a.a((float) (getWidth() / 2), (float) (getHeight() / 2), f10, f11) > ((float) h(2)) + n.c(getContext(), 12) ? 1 : 2;
    }

    private void d(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int iH = h(this.f17612J);
        float f10 = width;
        float f11 = iH;
        float fCos = (((float) Math.cos(this.f17610H)) * f11) + f10;
        float f12 = height;
        float fSin = (f11 * ((float) Math.sin(this.f17610H))) + f12;
        this.f17605C.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f17603A, this.f17605C);
        double dSin = Math.sin(this.f17610H);
        double dCos = Math.cos(this.f17610H);
        double d10 = iH - this.f17603A;
        this.f17605C.setStrokeWidth(this.f17607E);
        canvas.drawLine(f10, f12, width + ((int) (dCos * d10)), height + ((int) (d10 * dSin)), this.f17605C);
        canvas.drawCircle(f10, f12, this.f17604B, this.f17605C);
    }

    private int f(float f10, float f11) {
        int degrees = (int) Math.toDegrees(Math.atan2(f11 - (getHeight() / 2), f10 - (getWidth() / 2)));
        int i10 = degrees + 90;
        return i10 < 0 ? degrees + 450 : i10;
    }

    private int h(int i10) {
        int i11 = this.f17611I;
        return i10 == 2 ? Math.round(i11 * 0.66f) : i11;
    }

    private Pair j(float f10) {
        float fG = g();
        if (Math.abs(fG - f10) > 180.0f) {
            if (fG > 180.0f && f10 < 180.0f) {
                f10 += 360.0f;
            }
            if (fG < 180.0f && f10 > 180.0f) {
                fG += 360.0f;
            }
        }
        return new Pair(Float.valueOf(fG), Float.valueOf(f10));
    }

    private boolean k(float f10, float f11, boolean z9, boolean z10, boolean z11) {
        float f12 = f(f10, f11);
        boolean z12 = false;
        boolean z13 = g() != f12;
        if (z10 && z13) {
            return true;
        }
        if (!z13 && !z9) {
            return false;
        }
        if (z11 && this.f17616t) {
            z12 = true;
        }
        n(f12, z12);
        return true;
    }

    private void o(float f10, boolean z9) {
        float f11 = f10 % 360.0f;
        this.f17608F = f11;
        this.f17610H = Math.toRadians(f11 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fH = h(this.f17612J);
        float fCos = width + (((float) Math.cos(this.f17610H)) * fH);
        float fSin = height + (fH * ((float) Math.sin(this.f17610H)));
        RectF rectF = this.f17606D;
        int i10 = this.f17603A;
        rectF.set(fCos - i10, fSin - i10, fCos + i10, fSin + i10);
        Iterator it = this.f17622z.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(f11, z9);
        }
        invalidate();
    }

    public void b(b bVar) {
        this.f17622z.add(bVar);
    }

    public RectF e() {
        return this.f17606D;
    }

    public float g() {
        return this.f17608F;
    }

    public int i() {
        return this.f17603A;
    }

    public void l(int i10) {
        this.f17611I = i10;
        invalidate();
    }

    public void m(float f10) {
        n(f10, false);
    }

    public void n(float f10, boolean z9) {
        ValueAnimator valueAnimator = this.f17615s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z9) {
            o(f10, false);
            return;
        }
        Pair pairJ = j(f10);
        this.f17615s.setFloatValues(((Float) pairJ.first).floatValue(), ((Float) pairJ.second).floatValue());
        this.f17615s.setDuration(this.f17613q);
        this.f17615s.setInterpolator(this.f17614r);
        this.f17615s.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ClockHandView.a(this.f17634a, valueAnimator2);
            }
        });
        this.f17615s.addListener(new a());
        this.f17615s.start();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        if (this.f17615s.isRunning()) {
            return;
        }
        m(g());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        boolean z10;
        boolean z11;
        int actionMasked = motionEvent.getActionMasked();
        float x9 = motionEvent.getX();
        float y9 = motionEvent.getY();
        if (actionMasked == 0) {
            this.f17617u = x9;
            this.f17618v = y9;
            this.f17619w = true;
            this.f17609G = false;
            z9 = true;
            z10 = false;
            z11 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i10 = (int) (x9 - this.f17617u);
            int i11 = (int) (y9 - this.f17618v);
            this.f17619w = (i10 * i10) + (i11 * i11) > this.f17620x;
            z10 = this.f17609G;
            boolean z12 = actionMasked == 1;
            if (this.f17621y) {
                c(x9, y9);
            }
            z11 = z12;
            z9 = false;
        } else {
            z10 = false;
            z9 = false;
            z11 = false;
        }
        this.f17609G = k(x9, y9, z10, z9, z11) | this.f17609G;
        return true;
    }

    void p(boolean z9) {
        if (this.f17621y && !z9) {
            this.f17612J = 1;
        }
        this.f17621y = z9;
        invalidate();
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f17615s = new ValueAnimator();
        this.f17622z = new ArrayList();
        Paint paint = new Paint();
        this.f17605C = paint;
        this.f17606D = new RectF();
        this.f17612J = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f29011I1, i10, j.f28927x);
        this.f17613q = I4.f.f(context, p225w4.a.f28668C, ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION);
        this.f17614r = I4.f.g(context, p225w4.a.f28676K, p235x4.a.f29940b);
        this.f17611I = typedArrayObtainStyledAttributes.getDimensionPixelSize(k.f29029K1, 0);
        this.f17603A = typedArrayObtainStyledAttributes.getDimensionPixelSize(k.f29038L1, 0);
        Resources resources = getResources();
        this.f17607E = resources.getDimensionPixelSize(p225w4.c.f28788x);
        this.f17604B = resources.getDimensionPixelSize(p225w4.c.f28786v);
        int color = typedArrayObtainStyledAttributes.getColor(k.f29020J1, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        m(0.0f);
        this.f17620x = ViewConfiguration.get(context).getScaledTouchSlop();
        H.q0(this, 2);
        typedArrayObtainStyledAttributes.recycle();
    }
}
