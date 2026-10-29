package com.android.systemui.shared.navigationbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.CanvasProperty;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.view.RenderNodeAnimator;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class KeyButtonRipple extends Drawable {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final Interpolator f15805B = new PathInterpolator(0.0f, 0.0f, 0.8f, 1.0f);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final AnimatorListenerAdapter f15806A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Paint f15807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CanvasProperty f15808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CanvasProperty f15809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CanvasProperty f15810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CanvasProperty f15811e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CanvasProperty f15812f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private CanvasProperty f15813g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private CanvasProperty f15814h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f15815i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f15816j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f15817k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f15818l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f15819m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f15820n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f15821o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f15822p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f15823q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f15824r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Runnable f15825s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Interpolator f15826t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f15827u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final View f15828v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Handler f15829w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final HashSet f15830x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final ArrayList f15831y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private a f15832z;

    public enum a {
        OVAL,
        ROUNDED_RECT
    }

    private void c(RecordingCanvas recordingCanvas) {
        if (this.f15819m) {
            if (this.f15832z == a.ROUNDED_RECT) {
                recordingCanvas.drawRoundRect(this.f15808b, this.f15809c, this.f15810d, this.f15811e, this.f15812f, this.f15813g, this.f15814h);
            } else {
                recordingCanvas.drawCircle(CanvasProperty.createFloat(getBounds().width() / 2), CanvasProperty.createFloat(getBounds().height() / 2), CanvasProperty.createFloat((Math.min(getBounds().width(), getBounds().height()) * 1.0f) / 2.0f), this.f15814h);
            }
        }
    }

    private void d(Canvas canvas) {
        if (this.f15815i > 0.0f) {
            Paint paintO = o();
            paintO.setAlpha((int) (this.f15815i * 255.0f));
            float fWidth = getBounds().width();
            float fHeight = getBounds().height();
            boolean z9 = fWidth > fHeight;
            float fP = p() * this.f15816j * 0.5f;
            float f10 = fWidth * 0.5f;
            float f11 = fHeight * 0.5f;
            float f12 = z9 ? fP : f10;
            if (z9) {
                fP = f11;
            }
            float f13 = z9 ? f11 : f10;
            if (this.f15832z == a.ROUNDED_RECT) {
                float f14 = fP;
                canvas.drawRoundRect(f10 - f12, f11 - f14, f12 + f10, f11 + f14, f13, f13, paintO);
                return;
            }
            canvas.save();
            canvas.translate(f10, f11);
            float fMin = Math.min(f12, fP);
            float f15 = -fMin;
            canvas.drawOval(f15, f15, fMin, fMin, paintO);
            canvas.restore();
        }
    }

    private void e(String str, boolean z9) {
        if (Trace.isEnabled()) {
            Trace.instant(4096L, "KeyButtonRipple.endAnim: reason=" + str + " cancel=" + z9);
        }
        this.f15818l = false;
        this.f15831y.addAll(this.f15830x);
        int size = this.f15831y.size();
        for (int i10 = 0; i10 < size; i10++) {
            Animator animator = (Animator) this.f15831y.get(i10);
            if (z9) {
                animator.cancel();
            } else {
                animator.end();
            }
        }
        this.f15831y.clear();
        this.f15830x.clear();
        this.f15829w.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        e("enterHardware", true);
        this.f15818l = true;
        this.f15819m = true;
        s(CanvasProperty.createFloat(k() / 2));
        RenderNodeAnimator renderNodeAnimator = new RenderNodeAnimator(l(), (k() / 2) - ((p() * 1.35f) / 2.0f));
        renderNodeAnimator.setDuration(350L);
        renderNodeAnimator.setInterpolator(this.f15826t);
        renderNodeAnimator.addListener(this.f15806A);
        renderNodeAnimator.setTarget(this.f15828v);
        r(CanvasProperty.createFloat(k() / 2));
        RenderNodeAnimator renderNodeAnimator2 = new RenderNodeAnimator(j(), (k() / 2) + ((p() * 1.35f) / 2.0f));
        renderNodeAnimator2.setDuration(350L);
        renderNodeAnimator2.setInterpolator(this.f15826t);
        renderNodeAnimator2.addListener(this.f15806A);
        renderNodeAnimator2.addListener((Animator.AnimatorListener) null);
        renderNodeAnimator2.setTarget(this.f15828v);
        if (q()) {
            this.f15809c = CanvasProperty.createFloat(0.0f);
            this.f15811e = CanvasProperty.createFloat(getBounds().height());
            this.f15812f = CanvasProperty.createFloat(getBounds().height() / 2);
            this.f15813g = CanvasProperty.createFloat(getBounds().height() / 2);
        } else {
            this.f15808b = CanvasProperty.createFloat(0.0f);
            this.f15810d = CanvasProperty.createFloat(getBounds().width());
            this.f15812f = CanvasProperty.createFloat(getBounds().width() / 2);
            this.f15813g = CanvasProperty.createFloat(getBounds().width() / 2);
        }
        this.f15816j = 1.35f;
        this.f15815i = n();
        Paint paintO = o();
        this.f15807a = paintO;
        paintO.setAlpha((int) (this.f15815i * 255.0f));
        this.f15814h = CanvasProperty.createPaint(this.f15807a);
        renderNodeAnimator.start();
        renderNodeAnimator2.start();
        this.f15830x.add(renderNodeAnimator);
        this.f15830x.add(renderNodeAnimator2);
        invalidateSelf();
        if (!this.f15823q || this.f15817k) {
            return;
        }
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        e("enterSoftware", true);
        this.f15818l = true;
        this.f15815i = n();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "glowScale", 0.0f, 1.35f);
        objectAnimatorOfFloat.setInterpolator(this.f15826t);
        objectAnimatorOfFloat.setDuration(350L);
        objectAnimatorOfFloat.addListener(this.f15806A);
        objectAnimatorOfFloat.start();
        this.f15830x.add(objectAnimatorOfFloat);
        if (!this.f15823q || this.f15817k) {
            return;
        }
        i();
    }

    private void h() {
        this.f15814h = CanvasProperty.createPaint(o());
        RenderNodeAnimator renderNodeAnimator = new RenderNodeAnimator(this.f15814h, 1, 0.0f);
        renderNodeAnimator.setDuration(m());
        renderNodeAnimator.setInterpolator(f15805B);
        renderNodeAnimator.addListener(this.f15806A);
        renderNodeAnimator.addListener((Animator.AnimatorListener) null);
        renderNodeAnimator.setTarget(this.f15828v);
        renderNodeAnimator.start();
        this.f15830x.add(renderNodeAnimator);
        invalidateSelf();
    }

    private void i() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "glowAlpha", this.f15815i, 0.0f);
        objectAnimatorOfFloat.setInterpolator(f15805B);
        objectAnimatorOfFloat.setDuration(m());
        objectAnimatorOfFloat.addListener(this.f15806A);
        objectAnimatorOfFloat.start();
        this.f15830x.add(objectAnimatorOfFloat);
    }

    private CanvasProperty j() {
        return q() ? this.f15810d : this.f15811e;
    }

    private int k() {
        boolean zQ = q();
        Rect bounds = getBounds();
        return zQ ? bounds.width() : bounds.height();
    }

    private CanvasProperty l() {
        return q() ? this.f15808b : this.f15809c;
    }

    private int m() {
        int i10 = this.f15824r ? 80 : 450;
        this.f15824r = false;
        return i10;
    }

    private float n() {
        return this.f15821o ? 0.1f : 0.2f;
    }

    private Paint o() {
        if (this.f15807a == null) {
            Paint paint = new Paint();
            this.f15807a = paint;
            paint.setAntiAlias(true);
            this.f15807a.setColor(this.f15821o ? -16777216 : -1);
        }
        return this.f15807a;
    }

    private int p() {
        return Math.min(q() ? getBounds().width() : getBounds().height(), this.f15820n);
    }

    private boolean q() {
        return getBounds().width() > getBounds().height();
    }

    private void r(CanvasProperty canvasProperty) {
        if (q()) {
            this.f15810d = canvasProperty;
        } else {
            this.f15811e = canvasProperty;
        }
    }

    private void s(CanvasProperty canvasProperty) {
        if (q()) {
            this.f15808b = canvasProperty;
        } else {
            this.f15809c = canvasProperty;
        }
    }

    private void t(boolean z9) {
        boolean z10 = this.f15822p;
        if (z10 != this.f15821o && z9) {
            this.f15807a = null;
            this.f15821o = z10;
        }
        if (this.f15827u) {
            u(z9);
        } else {
            v(z9);
        }
    }

    private void u(boolean z9) {
        if (!z9) {
            h();
            return;
        }
        if (!this.f15823q) {
            f();
            return;
        }
        if (this.f15830x.isEmpty()) {
            this.f15829w.removeCallbacksAndMessages(null);
            this.f15829w.postDelayed(new Runnable() { // from class: S2.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7224q.f();
                }
            }, ViewConfiguration.getTapTimeout());
        } else if (this.f15818l) {
            f();
        }
    }

    private void v(boolean z9) {
        if (!z9) {
            i();
            return;
        }
        if (!this.f15823q) {
            g();
            return;
        }
        if (this.f15830x.isEmpty()) {
            this.f15829w.removeCallbacksAndMessages(null);
            this.f15829w.postDelayed(new Runnable() { // from class: S2.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7225q.g();
                }
            }, ViewConfiguration.getTapTimeout());
        } else if (this.f15818l) {
            g();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean zIsHardwareAccelerated = canvas.isHardwareAccelerated();
        this.f15827u = zIsHardwareAccelerated;
        if (zIsHardwareAccelerated) {
            c((RecordingCanvas) canvas);
        } else {
            d(canvas);
        }
        if (this.f15817k || this.f15818l || this.f15825s == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(this.f15825s);
        this.f15825s = null;
    }

    @Keep
    public float getGlowAlpha() {
        return this.f15815i;
    }

    @Keep
    public float getGlowScale() {
        return this.f15816j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean hasFocusStateSpecified() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        e("jumpToCurrentState", false);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z9;
        int i10 = 0;
        while (true) {
            if (i10 >= iArr.length) {
                z9 = false;
                break;
            }
            if (iArr[i10] == 16842919) {
                z9 = true;
                break;
            }
            i10++;
        }
        if (z9 == this.f15817k) {
            return false;
        }
        t(z9);
        this.f15817k = z9;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Keep
    public void setGlowAlpha(float f10) {
        this.f15815i = f10;
        invalidateSelf();
    }

    @Keep
    public void setGlowScale(float f10) {
        this.f15816j = f10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z9, boolean z10) {
        boolean visible = super.setVisible(z9, z10);
        if (visible) {
            jumpToCurrentState();
        }
        return visible;
    }
}
