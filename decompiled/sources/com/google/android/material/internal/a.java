package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import androidx.core.view.AbstractC1077i;
import androidx.core.view.H;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final boolean f17015t0 = false;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final Paint f17016u0 = null;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private Typeface f17017A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private Typeface f17018B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private Typeface f17019C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private K4.a f17020D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private K4.a f17021E;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private CharSequence f17023G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private CharSequence f17024H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f17025I;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f17027K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private Bitmap f17028L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private Paint f17029M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private float f17030N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private float f17031O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private float f17032P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private float f17033Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private float f17034R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f17035S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int[] f17036T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private boolean f17037U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final TextPaint f17038V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private final TextPaint f17039W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private TimeInterpolator f17040X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private TimeInterpolator f17041Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private float f17042Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f17043a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private float f17044a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f17045b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private float f17046b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f17047c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private ColorStateList f17048c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f17049d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private float f17050d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f17051e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private float f17052e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f17053f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private float f17054f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Rect f17055g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private ColorStateList f17056g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Rect f17057h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private float f17058h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final RectF f17059i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private float f17060i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private float f17062j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private StaticLayout f17064k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private float f17066l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private float f17068m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ColorStateList f17069n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private float f17070n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ColorStateList f17071o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private CharSequence f17072o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f17073p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f17075q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f17077r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f17079s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f17081t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f17082u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f17083v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Typeface f17084w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Typeface f17085x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Typeface f17086y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Typeface f17087z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f17061j = 16;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f17063k = 16;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f17065l = 15.0f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f17067m = 15.0f;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private TextUtils.TruncateAt f17022F = TextUtils.TruncateAt.END;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f17026J = true;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f17074p0 = 1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private float f17076q0 = 0.0f;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private float f17078r0 = 1.0f;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private int f17080s0 = g.f17098n;

    /* JADX INFO: renamed from: com.google.android.material.internal.a$a, reason: collision with other inner class name */
    class C0462a implements K4.a.InterfaceC0141a {
        C0462a() {
        }

        @Override // K4.a.InterfaceC0141a
        public void a(Typeface typeface) {
            a.this.l0(typeface);
        }
    }

    class b implements K4.a.InterfaceC0141a {
        b() {
        }

        @Override // K4.a.InterfaceC0141a
        public void a(Typeface typeface) {
            a.this.w0(typeface);
        }
    }

    public a(View view) {
        this.f17043a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f17038V = textPaint;
        this.f17039W = new TextPaint(textPaint);
        this.f17057h = new Rect();
        this.f17055g = new Rect();
        this.f17059i = new RectF();
        this.f17051e = e();
        Y(view.getContext().getResources().getConfiguration());
    }

    private void C0(float f10) {
        h(f10);
        boolean z9 = f17015t0 && this.f17030N != 1.0f;
        this.f17027K = z9;
        if (z9) {
            n();
        }
        H.X(this.f17043a);
    }

    private Layout.Alignment M() {
        int iB = AbstractC1077i.b(this.f17061j, this.f17025I ? 1 : 0) & 7;
        if (iB == 1) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (iB != 5) {
            return this.f17025I ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return this.f17025I ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
    }

    private boolean O0() {
        if (this.f17074p0 > 1) {
            return (!this.f17025I || this.f17047c) && !this.f17027K;
        }
        return false;
    }

    private void P(TextPaint textPaint) {
        textPaint.setTextSize(this.f17067m);
        textPaint.setTypeface(this.f17084w);
        textPaint.setLetterSpacing(this.f17058h0);
    }

    private void Q(TextPaint textPaint) {
        textPaint.setTextSize(this.f17065l);
        textPaint.setTypeface(this.f17087z);
        textPaint.setLetterSpacing(this.f17060i0);
    }

    private void S(float f10) {
        if (this.f17047c) {
            this.f17059i.set(f10 < this.f17051e ? this.f17055g : this.f17057h);
            return;
        }
        this.f17059i.left = X(this.f17055g.left, this.f17057h.left, f10, this.f17040X);
        this.f17059i.top = X(this.f17075q, this.f17077r, f10, this.f17040X);
        this.f17059i.right = X(this.f17055g.right, this.f17057h.right, f10, this.f17040X);
        this.f17059i.bottom = X(this.f17055g.bottom, this.f17057h.bottom, f10, this.f17040X);
    }

    private static boolean T(float f10, float f11) {
        return Math.abs(f10 - f11) < 1.0E-5f;
    }

    private boolean U() {
        return H.v(this.f17043a) == 1;
    }

    private boolean W(CharSequence charSequence, boolean z9) {
        return (z9 ? p251z0.e.f30599d : p251z0.e.f30598c).a(charSequence, 0, charSequence.length());
    }

    private static float X(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        return p235x4.a.a(f10, f11, f12);
    }

    private float Z(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    private static int a(int i10, int i11, float f10) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((Color.alpha(i10) * f11) + (Color.alpha(i11) * f10)), Math.round((Color.red(i10) * f11) + (Color.red(i11) * f10)), Math.round((Color.green(i10) * f11) + (Color.green(i11) * f10)), Math.round((Color.blue(i10) * f11) + (Color.blue(i11) * f10)));
    }

    private void b(boolean z9) {
        StaticLayout staticLayout;
        i(1.0f, z9);
        CharSequence charSequence = this.f17024H;
        if (charSequence != null && (staticLayout = this.f17064k0) != null) {
            this.f17072o0 = TextUtils.ellipsize(charSequence, this.f17038V, staticLayout.getWidth(), this.f17022F);
        }
        CharSequence charSequence2 = this.f17072o0;
        float fZ = 0.0f;
        if (charSequence2 != null) {
            this.f17066l0 = Z(this.f17038V, charSequence2);
        } else {
            this.f17066l0 = 0.0f;
        }
        int iB = AbstractC1077i.b(this.f17063k, this.f17025I ? 1 : 0);
        int i10 = iB & 112;
        if (i10 == 48) {
            this.f17077r = this.f17057h.top;
        } else if (i10 != 80) {
            this.f17077r = this.f17057h.centerY() - ((this.f17038V.descent() - this.f17038V.ascent()) / 2.0f);
        } else {
            this.f17077r = this.f17057h.bottom + this.f17038V.ascent();
        }
        int i11 = iB & 8388615;
        if (i11 == 1) {
            this.f17081t = this.f17057h.centerX() - (this.f17066l0 / 2.0f);
        } else if (i11 != 5) {
            this.f17081t = this.f17057h.left;
        } else {
            this.f17081t = this.f17057h.right - this.f17066l0;
        }
        i(0.0f, z9);
        StaticLayout staticLayout2 = this.f17064k0;
        float height = staticLayout2 != null ? staticLayout2.getHeight() : 0.0f;
        StaticLayout staticLayout3 = this.f17064k0;
        if (staticLayout3 == null || this.f17074p0 <= 1) {
            CharSequence charSequence3 = this.f17024H;
            if (charSequence3 != null) {
                fZ = Z(this.f17038V, charSequence3);
            }
        } else {
            fZ = staticLayout3.getWidth();
        }
        StaticLayout staticLayout4 = this.f17064k0;
        this.f17073p = staticLayout4 != null ? staticLayout4.getLineCount() : 0;
        int iB2 = AbstractC1077i.b(this.f17061j, this.f17025I ? 1 : 0);
        int i12 = iB2 & 112;
        if (i12 == 48) {
            this.f17075q = this.f17055g.top;
        } else if (i12 != 80) {
            this.f17075q = this.f17055g.centerY() - (height / 2.0f);
        } else {
            this.f17075q = (this.f17055g.bottom - height) + this.f17038V.descent();
        }
        int i13 = iB2 & 8388615;
        if (i13 == 1) {
            this.f17079s = this.f17055g.centerX() - (fZ / 2.0f);
        } else if (i13 != 5) {
            this.f17079s = this.f17055g.left;
        } else {
            this.f17079s = this.f17055g.right - fZ;
        }
        j();
        C0(this.f17045b);
    }

    private void c() {
        g(this.f17045b);
    }

    private static boolean c0(Rect rect, int i10, int i11, int i12, int i13) {
        return rect.left == i10 && rect.top == i11 && rect.right == i12 && rect.bottom == i13;
    }

    private float d(float f10) {
        float f11 = this.f17051e;
        return f10 <= f11 ? p235x4.a.b(1.0f, 0.0f, this.f17049d, f11, f10) : p235x4.a.b(0.0f, 1.0f, f11, 1.0f, f10);
    }

    private float e() {
        float f10 = this.f17049d;
        return f10 + ((1.0f - f10) * 0.5f);
    }

    private boolean f(CharSequence charSequence) {
        boolean zU = U();
        return this.f17026J ? W(charSequence, zU) : zU;
    }

    private void g(float f10) {
        float f11;
        S(f10);
        if (!this.f17047c) {
            this.f17082u = X(this.f17079s, this.f17081t, f10, this.f17040X);
            this.f17083v = X(this.f17075q, this.f17077r, f10, this.f17040X);
            C0(f10);
            f11 = f10;
        } else if (f10 < this.f17051e) {
            this.f17082u = this.f17079s;
            this.f17083v = this.f17075q;
            C0(0.0f);
            f11 = 0.0f;
        } else {
            this.f17082u = this.f17081t;
            this.f17083v = this.f17077r - Math.max(0, this.f17053f);
            C0(1.0f);
            f11 = 1.0f;
        }
        TimeInterpolator timeInterpolator = p235x4.a.f29940b;
        h0(1.0f - X(0.0f, 1.0f, 1.0f - f10, timeInterpolator));
        s0(X(1.0f, 0.0f, f10, timeInterpolator));
        if (this.f17071o != this.f17069n) {
            this.f17038V.setColor(a(y(), w(), f11));
        } else {
            this.f17038V.setColor(w());
        }
        float f12 = this.f17058h0;
        float f13 = this.f17060i0;
        if (f12 != f13) {
            this.f17038V.setLetterSpacing(X(f13, f12, f10, timeInterpolator));
        } else {
            this.f17038V.setLetterSpacing(f12);
        }
        this.f17032P = X(this.f17050d0, this.f17042Z, f10, null);
        this.f17033Q = X(this.f17052e0, this.f17044a0, f10, null);
        this.f17034R = X(this.f17054f0, this.f17046b0, f10, null);
        int iA = a(x(this.f17056g0), x(this.f17048c0), f10);
        this.f17035S = iA;
        this.f17038V.setShadowLayer(this.f17032P, this.f17033Q, this.f17034R, iA);
        if (this.f17047c) {
            this.f17038V.setAlpha((int) (d(f10) * this.f17038V.getAlpha()));
            TextPaint textPaint = this.f17038V;
            textPaint.setShadowLayer(this.f17032P, this.f17033Q, this.f17034R, D4.a.a(this.f17035S, textPaint.getAlpha()));
        }
        H.X(this.f17043a);
    }

    private void h(float f10) {
        i(f10, false);
    }

    private void h0(float f10) {
        this.f17068m0 = f10;
        H.X(this.f17043a);
    }

    private void i(float f10, boolean z9) {
        float f11;
        float f12;
        Typeface typeface;
        if (this.f17023G == null) {
            return;
        }
        float fWidth = this.f17057h.width();
        float fWidth2 = this.f17055g.width();
        if (T(f10, 1.0f)) {
            f11 = this.f17067m;
            f12 = this.f17058h0;
            this.f17030N = 1.0f;
            typeface = this.f17084w;
        } else {
            float f13 = this.f17065l;
            float f14 = this.f17060i0;
            Typeface typeface2 = this.f17087z;
            if (T(f10, 0.0f)) {
                this.f17030N = 1.0f;
            } else {
                this.f17030N = X(this.f17065l, this.f17067m, f10, this.f17041Y) / this.f17065l;
            }
            float f15 = this.f17067m / this.f17065l;
            fWidth = (z9 || this.f17047c || fWidth2 * f15 <= fWidth) ? fWidth2 : Math.min(fWidth / f15, fWidth2);
            f11 = f13;
            f12 = f14;
            typeface = typeface2;
        }
        boolean z10 = false;
        if (fWidth > 0.0f) {
            boolean z11 = this.f17031O != f11;
            boolean z12 = this.f17062j0 != f12;
            boolean z13 = this.f17019C != typeface;
            StaticLayout staticLayout = this.f17064k0;
            boolean z14 = z11 || z12 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z13 || this.f17037U;
            this.f17031O = f11;
            this.f17062j0 = f12;
            this.f17019C = typeface;
            this.f17037U = false;
            this.f17038V.setLinearText(this.f17030N != 1.0f);
            z10 = z14;
        }
        if (this.f17024H == null || z10) {
            this.f17038V.setTextSize(this.f17031O);
            this.f17038V.setTypeface(this.f17019C);
            this.f17038V.setLetterSpacing(this.f17062j0);
            this.f17025I = f(this.f17023G);
            StaticLayout staticLayoutK = k(O0() ? this.f17074p0 : 1, fWidth, this.f17025I);
            this.f17064k0 = staticLayoutK;
            this.f17024H = staticLayoutK.getText();
        }
    }

    private void j() {
        Bitmap bitmap = this.f17028L;
        if (bitmap != null) {
            bitmap.recycle();
            this.f17028L = null;
        }
    }

    private StaticLayout k(int i10, float f10, boolean z9) {
        return (StaticLayout) B0.i.e(g.b(this.f17023G, this.f17038V, (int) f10).d(this.f17022F).g(z9).c(i10 == 1 ? Layout.Alignment.ALIGN_NORMAL : M()).f(false).i(i10).h(this.f17076q0, this.f17078r0).e(this.f17080s0).j(null).a());
    }

    private void m(Canvas canvas, float f10, float f11) {
        int alpha = this.f17038V.getAlpha();
        canvas.translate(f10, f11);
        if (!this.f17047c) {
            this.f17038V.setAlpha((int) (this.f17070n0 * alpha));
            TextPaint textPaint = this.f17038V;
            textPaint.setShadowLayer(this.f17032P, this.f17033Q, this.f17034R, D4.a.a(this.f17035S, textPaint.getAlpha()));
            this.f17064k0.draw(canvas);
        }
        if (!this.f17047c) {
            this.f17038V.setAlpha((int) (this.f17068m0 * alpha));
        }
        TextPaint textPaint2 = this.f17038V;
        textPaint2.setShadowLayer(this.f17032P, this.f17033Q, this.f17034R, D4.a.a(this.f17035S, textPaint2.getAlpha()));
        int lineBaseline = this.f17064k0.getLineBaseline(0);
        CharSequence charSequence = this.f17072o0;
        float f12 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f12, this.f17038V);
        this.f17038V.setShadowLayer(this.f17032P, this.f17033Q, this.f17034R, this.f17035S);
        if (this.f17047c) {
            return;
        }
        String strTrim = this.f17072o0.toString().trim();
        if (strTrim.endsWith("…")) {
            strTrim = strTrim.substring(0, strTrim.length() - 1);
        }
        this.f17038V.setAlpha(alpha);
        canvas.drawText(strTrim, 0, Math.min(this.f17064k0.getLineEnd(0), strTrim.length()), 0.0f, f12, (Paint) this.f17038V);
    }

    private boolean m0(Typeface typeface) {
        K4.a aVar = this.f17021E;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f17086y == typeface) {
            return false;
        }
        this.f17086y = typeface;
        Typeface typefaceB = K4.g.b(this.f17043a.getContext().getResources().getConfiguration(), typeface);
        this.f17085x = typefaceB;
        if (typefaceB == null) {
            typefaceB = this.f17086y;
        }
        this.f17084w = typefaceB;
        return true;
    }

    private void n() {
        if (this.f17028L != null || this.f17055g.isEmpty() || TextUtils.isEmpty(this.f17024H)) {
            return;
        }
        g(0.0f);
        int width = this.f17064k0.getWidth();
        int height = this.f17064k0.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.f17028L = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.f17064k0.draw(new Canvas(this.f17028L));
        if (this.f17029M == null) {
            this.f17029M = new Paint(3);
        }
    }

    private float s(int i10, int i11) {
        float f10;
        float f11;
        int i12;
        if (i11 == 17 || (i11 & 7) == 1) {
            f10 = i10 / 2.0f;
            f11 = this.f17066l0 / 2.0f;
        } else if ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) {
            if (this.f17025I) {
                i12 = this.f17057h.left;
                return i12;
            }
            f10 = this.f17057h.right;
            f11 = this.f17066l0;
        } else {
            if (!this.f17025I) {
                i12 = this.f17057h.left;
                return i12;
            }
            f10 = this.f17057h.right;
            f11 = this.f17066l0;
        }
        return f10 - f11;
    }

    private void s0(float f10) {
        this.f17070n0 = f10;
        H.X(this.f17043a);
    }

    private float t(RectF rectF, int i10, int i11) {
        float f10;
        float f11;
        int i12;
        if (i11 == 17 || (i11 & 7) == 1) {
            f10 = i10 / 2.0f;
            f11 = this.f17066l0 / 2.0f;
        } else if ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) {
            if (!this.f17025I) {
                i12 = this.f17057h.right;
                return i12;
            }
            f10 = rectF.left;
            f11 = this.f17066l0;
        } else {
            if (this.f17025I) {
                i12 = this.f17057h.right;
                return i12;
            }
            f10 = rectF.left;
            f11 = this.f17066l0;
        }
        return f10 + f11;
    }

    private int x(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f17036T;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    private boolean x0(Typeface typeface) {
        K4.a aVar = this.f17020D;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f17018B == typeface) {
            return false;
        }
        this.f17018B = typeface;
        Typeface typefaceB = K4.g.b(this.f17043a.getContext().getResources().getConfiguration(), typeface);
        this.f17017A = typefaceB;
        if (typefaceB == null) {
            typefaceB = this.f17018B;
        }
        this.f17087z = typefaceB;
        return true;
    }

    private int y() {
        return x(this.f17069n);
    }

    public float A() {
        Q(this.f17039W);
        return (-this.f17039W.ascent()) + this.f17039W.descent();
    }

    public void A0(float f10) {
        this.f17049d = f10;
        this.f17051e = e();
    }

    public int B() {
        return this.f17061j;
    }

    public void B0(int i10) {
        this.f17080s0 = i10;
    }

    public float C() {
        Q(this.f17039W);
        return -this.f17039W.ascent();
    }

    public float D() {
        return this.f17065l;
    }

    public void D0(float f10) {
        this.f17076q0 = f10;
    }

    public Typeface E() {
        Typeface typeface = this.f17087z;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public void E0(float f10) {
        this.f17078r0 = f10;
    }

    public float F() {
        return this.f17045b;
    }

    public void F0(int i10) {
        if (i10 != this.f17074p0) {
            this.f17074p0 = i10;
            j();
            a0();
        }
    }

    public float G() {
        return this.f17051e;
    }

    public void G0(TimeInterpolator timeInterpolator) {
        this.f17040X = timeInterpolator;
        a0();
    }

    public int H() {
        return this.f17080s0;
    }

    public void H0(boolean z9) {
        this.f17026J = z9;
    }

    public int I() {
        StaticLayout staticLayout = this.f17064k0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public final boolean I0(int[] iArr) {
        this.f17036T = iArr;
        if (!V()) {
            return false;
        }
        a0();
        return true;
    }

    public float J() {
        return this.f17064k0.getSpacingAdd();
    }

    public void J0(h hVar) {
        if (hVar != null) {
            b0(true);
        }
    }

    public float K() {
        return this.f17064k0.getSpacingMultiplier();
    }

    public void K0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f17023G, charSequence)) {
            this.f17023G = charSequence;
            this.f17024H = null;
            j();
            a0();
        }
    }

    public int L() {
        return this.f17074p0;
    }

    public void L0(TimeInterpolator timeInterpolator) {
        this.f17041Y = timeInterpolator;
        a0();
    }

    public void M0(TextUtils.TruncateAt truncateAt) {
        this.f17022F = truncateAt;
        a0();
    }

    public TimeInterpolator N() {
        return this.f17040X;
    }

    public void N0(Typeface typeface) {
        boolean zM0 = m0(typeface);
        boolean zX0 = x0(typeface);
        if (zM0 || zX0) {
            a0();
        }
    }

    public CharSequence O() {
        return this.f17023G;
    }

    public TextUtils.TruncateAt R() {
        return this.f17022F;
    }

    public final boolean V() {
        ColorStateList colorStateList = this.f17071o;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f17069n;
        return colorStateList2 != null && colorStateList2.isStateful();
    }

    public void Y(Configuration configuration) {
        Typeface typeface = this.f17086y;
        if (typeface != null) {
            this.f17085x = K4.g.b(configuration, typeface);
        }
        Typeface typeface2 = this.f17018B;
        if (typeface2 != null) {
            this.f17017A = K4.g.b(configuration, typeface2);
        }
        Typeface typeface3 = this.f17085x;
        if (typeface3 == null) {
            typeface3 = this.f17086y;
        }
        this.f17084w = typeface3;
        Typeface typeface4 = this.f17017A;
        if (typeface4 == null) {
            typeface4 = this.f17018B;
        }
        this.f17087z = typeface4;
        b0(true);
    }

    public void a0() {
        b0(false);
    }

    public void b0(boolean z9) {
        if ((this.f17043a.getHeight() <= 0 || this.f17043a.getWidth() <= 0) && !z9) {
            return;
        }
        b(z9);
        c();
    }

    public void d0(ColorStateList colorStateList) {
        if (this.f17071o == colorStateList && this.f17069n == colorStateList) {
            return;
        }
        this.f17071o = colorStateList;
        this.f17069n = colorStateList;
        a0();
    }

    public void e0(int i10, int i11, int i12, int i13) {
        if (c0(this.f17057h, i10, i11, i12, i13)) {
            return;
        }
        this.f17057h.set(i10, i11, i12, i13);
        this.f17037U = true;
    }

    public void f0(Rect rect) {
        e0(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void g0(int i10) {
        K4.d dVar = new K4.d(this.f17043a.getContext(), i10);
        if (dVar.i() != null) {
            this.f17071o = dVar.i();
        }
        if (dVar.j() != 0.0f) {
            this.f17067m = dVar.j();
        }
        ColorStateList colorStateList = dVar.f4095c;
        if (colorStateList != null) {
            this.f17048c0 = colorStateList;
        }
        this.f17044a0 = dVar.f4100h;
        this.f17046b0 = dVar.f4101i;
        this.f17042Z = dVar.f4102j;
        this.f17058h0 = dVar.f4104l;
        K4.a aVar = this.f17021E;
        if (aVar != null) {
            aVar.c();
        }
        this.f17021E = new K4.a(new C0462a(), dVar.e());
        dVar.g(this.f17043a.getContext(), this.f17021E);
        a0();
    }

    public void i0(ColorStateList colorStateList) {
        if (this.f17071o != colorStateList) {
            this.f17071o = colorStateList;
            a0();
        }
    }

    public void j0(int i10) {
        if (this.f17063k != i10) {
            this.f17063k = i10;
            a0();
        }
    }

    public void k0(float f10) {
        if (this.f17067m != f10) {
            this.f17067m = f10;
            a0();
        }
    }

    public void l(Canvas canvas) {
        int iSave = canvas.save();
        if (this.f17024H == null || this.f17059i.width() <= 0.0f || this.f17059i.height() <= 0.0f) {
            return;
        }
        this.f17038V.setTextSize(this.f17031O);
        float f10 = this.f17082u;
        float f11 = this.f17083v;
        boolean z9 = this.f17027K && this.f17028L != null;
        float f12 = this.f17030N;
        if (f12 != 1.0f && !this.f17047c) {
            canvas.scale(f12, f12, f10, f11);
        }
        if (z9) {
            canvas.drawBitmap(this.f17028L, f10, f11, this.f17029M);
            canvas.restoreToCount(iSave);
            return;
        }
        if (!O0() || (this.f17047c && this.f17045b <= this.f17051e)) {
            canvas.translate(f10, f11);
            this.f17064k0.draw(canvas);
        } else {
            m(canvas, this.f17082u - this.f17064k0.getLineStart(0), f11);
        }
        canvas.restoreToCount(iSave);
    }

    public void l0(Typeface typeface) {
        if (m0(typeface)) {
            a0();
        }
    }

    public void n0(int i10) {
        this.f17053f = i10;
    }

    public void o(RectF rectF, int i10, int i11) {
        this.f17025I = f(this.f17023G);
        rectF.left = Math.max(s(i10, i11), this.f17057h.left);
        rectF.top = this.f17057h.top;
        rectF.right = Math.min(t(rectF, i10, i11), this.f17057h.right);
        rectF.bottom = this.f17057h.top + r();
    }

    public void o0(int i10, int i11, int i12, int i13) {
        if (c0(this.f17055g, i10, i11, i12, i13)) {
            return;
        }
        this.f17055g.set(i10, i11, i12, i13);
        this.f17037U = true;
    }

    public ColorStateList p() {
        return this.f17071o;
    }

    public void p0(Rect rect) {
        o0(rect.left, rect.top, rect.right, rect.bottom);
    }

    public int q() {
        return this.f17063k;
    }

    public void q0(float f10) {
        if (this.f17060i0 != f10) {
            this.f17060i0 = f10;
            a0();
        }
    }

    public float r() {
        P(this.f17039W);
        return -this.f17039W.ascent();
    }

    public void r0(int i10) {
        K4.d dVar = new K4.d(this.f17043a.getContext(), i10);
        if (dVar.i() != null) {
            this.f17069n = dVar.i();
        }
        if (dVar.j() != 0.0f) {
            this.f17065l = dVar.j();
        }
        ColorStateList colorStateList = dVar.f4095c;
        if (colorStateList != null) {
            this.f17056g0 = colorStateList;
        }
        this.f17052e0 = dVar.f4100h;
        this.f17054f0 = dVar.f4101i;
        this.f17050d0 = dVar.f4102j;
        this.f17060i0 = dVar.f4104l;
        K4.a aVar = this.f17020D;
        if (aVar != null) {
            aVar.c();
        }
        this.f17020D = new K4.a(new b(), dVar.e());
        dVar.g(this.f17043a.getContext(), this.f17020D);
        a0();
    }

    public void t0(ColorStateList colorStateList) {
        if (this.f17069n != colorStateList) {
            this.f17069n = colorStateList;
            a0();
        }
    }

    public float u() {
        return this.f17067m;
    }

    public void u0(int i10) {
        if (this.f17061j != i10) {
            this.f17061j = i10;
            a0();
        }
    }

    public Typeface v() {
        Typeface typeface = this.f17084w;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public void v0(float f10) {
        if (this.f17065l != f10) {
            this.f17065l = f10;
            a0();
        }
    }

    public int w() {
        return x(this.f17071o);
    }

    public void w0(Typeface typeface) {
        if (x0(typeface)) {
            a0();
        }
    }

    public void y0(float f10) {
        float fA = p221w0.a.a(f10, 0.0f, 1.0f);
        if (fA != this.f17045b) {
            this.f17045b = fA;
            c();
        }
    }

    public int z() {
        return this.f17073p;
    }

    public void z0(boolean z9) {
        this.f17047c = z9;
    }
}
