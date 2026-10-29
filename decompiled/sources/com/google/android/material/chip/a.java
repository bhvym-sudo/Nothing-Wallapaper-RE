package com.google.android.material.chip;

import K4.d;
import L4.b;
import N4.h;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.material.internal.i;
import com.google.android.material.internal.k;
import com.google.android.material.internal.n;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p235x4.c;

/* JADX INFO: loaded from: classes.dex */
public class a extends h implements Drawable.Callback, i.b {

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    private static final int[] f16777Z0 = {R.attr.state_enabled};

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private static final ShapeDrawable f16778a1 = new ShapeDrawable(new OvalShape());

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    private final RectF f16779A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    private final PointF f16780B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    private final Path f16781C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    private final i f16782D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    private int f16783E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    private int f16784F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    private int f16785G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    private int f16786H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    private int f16787I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    private int f16788J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    private boolean f16789K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    private int f16790L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    private int f16791M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    private ColorFilter f16792N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    private PorterDuffColorFilter f16793O0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private ColorStateList f16794P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    private ColorStateList f16795P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private ColorStateList f16796Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    private PorterDuff.Mode f16797Q0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private float f16798R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    private int[] f16799R0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private float f16800S;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    private boolean f16801S0;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private ColorStateList f16802T;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    private ColorStateList f16803T0;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private float f16804U;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    private WeakReference f16805U0;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private ColorStateList f16806V;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    private TextUtils.TruncateAt f16807V0;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private CharSequence f16808W;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    private boolean f16809W0;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private boolean f16810X;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    private int f16811X0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private Drawable f16812Y;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    private boolean f16813Y0;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private ColorStateList f16814Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private float f16815a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f16816b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f16817c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private Drawable f16818d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private Drawable f16819e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private ColorStateList f16820f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private float f16821g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private CharSequence f16822h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private boolean f16823i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private boolean f16824j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private Drawable f16825k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private ColorStateList f16826l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private c f16827m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private c f16828n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private float f16829o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private float f16830p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private float f16831q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private float f16832r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private float f16833s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private float f16834t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private float f16835u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private float f16836v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private final Context f16837w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private final Paint f16838x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private final Paint f16839y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private final Paint.FontMetrics f16840z0;

    /* JADX INFO: renamed from: com.google.android.material.chip.a$a, reason: collision with other inner class name */
    public interface InterfaceC0458a {
        void a();
    }

    private a(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f16800S = -1.0f;
        this.f16838x0 = new Paint(1);
        this.f16840z0 = new Paint.FontMetrics();
        this.f16779A0 = new RectF();
        this.f16780B0 = new PointF();
        this.f16781C0 = new Path();
        this.f16791M0 = 255;
        this.f16797Q0 = PorterDuff.Mode.SRC_IN;
        this.f16805U0 = new WeakReference(null);
        K(context);
        this.f16837w0 = context;
        i iVar = new i(this);
        this.f16782D0 = iVar;
        this.f16808W = "";
        iVar.g().density = context.getResources().getDisplayMetrics().density;
        this.f16839y0 = null;
        int[] iArr = f16777Z0;
        setState(iArr);
        h2(iArr);
        this.f16809W0 = true;
        if (b.f4786a) {
            f16778a1.setTint(-1);
        }
    }

    private void A0(Canvas canvas, Rect rect) {
        if (this.f16808W != null) {
            Paint.Align alignP0 = p0(rect, this.f16780B0);
            n0(rect, this.f16779A0);
            if (this.f16782D0.e() != null) {
                this.f16782D0.g().drawableState = getState();
                this.f16782D0.n(this.f16837w0);
            }
            this.f16782D0.g().setTextAlign(alignP0);
            int iSave = 0;
            boolean z9 = Math.round(this.f16782D0.h(d1().toString())) > Math.round(this.f16779A0.width());
            if (z9) {
                iSave = canvas.save();
                canvas.clipRect(this.f16779A0);
            }
            CharSequence charSequenceEllipsize = this.f16808W;
            if (z9 && this.f16807V0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f16782D0.g(), this.f16779A0.width(), this.f16807V0);
            }
            CharSequence charSequence = charSequenceEllipsize;
            int length = charSequence.length();
            PointF pointF = this.f16780B0;
            canvas.drawText(charSequence, 0, length, pointF.x, pointF.y, this.f16782D0.g());
            if (z9) {
                canvas.restoreToCount(iSave);
            }
        }
    }

    private boolean J2() {
        return this.f16824j0 && this.f16825k0 != null && this.f16789K0;
    }

    private boolean K2() {
        return this.f16810X && this.f16812Y != null;
    }

    private boolean L2() {
        return this.f16817c0 && this.f16818d0 != null;
    }

    private void M2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    private void N2() {
        this.f16803T0 = this.f16801S0 ? b.d(this.f16806V) : null;
    }

    private void O2() {
        this.f16819e0 = new RippleDrawable(b.d(b1()), this.f16818d0, f16778a1);
    }

    private float V0() {
        Drawable drawable = this.f16789K0 ? this.f16825k0 : this.f16812Y;
        float f10 = this.f16815a0;
        if (f10 > 0.0f || drawable == null) {
            return f10;
        }
        float fCeil = (float) Math.ceil(n.c(this.f16837w0, 24));
        return ((float) drawable.getIntrinsicHeight()) <= fCeil ? drawable.getIntrinsicHeight() : fCeil;
    }

    private float W0() {
        Drawable drawable = this.f16789K0 ? this.f16825k0 : this.f16812Y;
        float f10 = this.f16815a0;
        return (f10 > 0.0f || drawable == null) ? f10 : drawable.getIntrinsicWidth();
    }

    private void X1(ColorStateList colorStateList) {
        if (this.f16794P != colorStateList) {
            this.f16794P = colorStateList;
            onStateChange(getState());
        }
    }

    private void g0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        p201u0.a.m(drawable, p201u0.a.f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f16818d0) {
            if (drawable.isStateful()) {
                drawable.setState(S0());
            }
            p201u0.a.o(drawable, this.f16820f0);
            return;
        }
        Drawable drawable2 = this.f16812Y;
        if (drawable == drawable2 && this.f16816b0) {
            p201u0.a.o(drawable2, this.f16814Z);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    private void h0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (K2() || J2()) {
            float f10 = this.f16829o0 + this.f16830p0;
            float fW0 = W0();
            if (p201u0.a.f(this) == 0) {
                float f11 = rect.left + f10;
                rectF.left = f11;
                rectF.right = f11 + fW0;
            } else {
                float f12 = rect.right - f10;
                rectF.right = f12;
                rectF.left = f12 - fW0;
            }
            float fV0 = V0();
            float fExactCenterY = rect.exactCenterY() - (fV0 / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fV0;
        }
    }

    private ColorFilter h1() {
        ColorFilter colorFilter = this.f16792N0;
        return colorFilter != null ? colorFilter : this.f16793O0;
    }

    private void j0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (L2()) {
            float f10 = this.f16836v0 + this.f16835u0 + this.f16821g0 + this.f16834t0 + this.f16833s0;
            if (p201u0.a.f(this) == 0) {
                rectF.right = rect.right - f10;
            } else {
                rectF.left = rect.left + f10;
            }
        }
    }

    private static boolean j1(int[] iArr, int i10) {
        if (iArr == null) {
            return false;
        }
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    private void k0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (L2()) {
            float f10 = this.f16836v0 + this.f16835u0;
            if (p201u0.a.f(this) == 0) {
                float f11 = rect.right - f10;
                rectF.right = f11;
                rectF.left = f11 - this.f16821g0;
            } else {
                float f12 = rect.left + f10;
                rectF.left = f12;
                rectF.right = f12 + this.f16821g0;
            }
            float fExactCenterY = rect.exactCenterY();
            float f13 = this.f16821g0;
            float f14 = fExactCenterY - (f13 / 2.0f);
            rectF.top = f14;
            rectF.bottom = f14 + f13;
        }
    }

    private void l0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (L2()) {
            float f10 = this.f16836v0 + this.f16835u0 + this.f16821g0 + this.f16834t0 + this.f16833s0;
            if (p201u0.a.f(this) == 0) {
                float f11 = rect.right;
                rectF.right = f11;
                rectF.left = f11 - f10;
            } else {
                int i10 = rect.left;
                rectF.left = i10;
                rectF.right = i10 + f10;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private void n0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f16808W != null) {
            float fI0 = this.f16829o0 + i0() + this.f16832r0;
            float fM0 = this.f16836v0 + m0() + this.f16833s0;
            if (p201u0.a.f(this) == 0) {
                rectF.left = rect.left + fI0;
                rectF.right = rect.right - fM0;
            } else {
                rectF.left = rect.left + fM0;
                rectF.right = rect.right - fI0;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private static boolean n1(d dVar) {
        return (dVar == null || dVar.i() == null || !dVar.i().isStateful()) ? false : true;
    }

    private float o0() {
        this.f16782D0.g().getFontMetrics(this.f16840z0);
        Paint.FontMetrics fontMetrics = this.f16840z0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private static boolean o1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private static boolean p1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    private boolean q0() {
        return this.f16824j0 && this.f16825k0 != null && this.f16823i0;
    }

    private void q1(AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayI = k.i(this.f16837w0, attributeSet, p225w4.k.f29064O0, i10, i11, new int[0]);
        this.f16813Y0 = typedArrayI.hasValue(p225w4.k.f29423z1);
        X1(K4.c.a(this.f16837w0, typedArrayI, p225w4.k.f29293m1));
        B1(K4.c.a(this.f16837w0, typedArrayI, p225w4.k.f29163Z0));
        P1(typedArrayI.getDimension(p225w4.k.f29243h1, 0.0f));
        int i12 = p225w4.k.f29173a1;
        if (typedArrayI.hasValue(i12)) {
            D1(typedArrayI.getDimension(i12, 0.0f));
        }
        T1(K4.c.a(this.f16837w0, typedArrayI, p225w4.k.f29273k1));
        V1(typedArrayI.getDimension(p225w4.k.f29283l1, 0.0f));
        u2(K4.c.a(this.f16837w0, typedArrayI, p225w4.k.f29413y1));
        z2(typedArrayI.getText(p225w4.k.f29109T0));
        d dVarG = K4.c.g(this.f16837w0, typedArrayI, p225w4.k.f29073P0);
        dVarG.l(typedArrayI.getDimension(p225w4.k.f29082Q0, dVarG.j()));
        A2(dVarG);
        int i13 = typedArrayI.getInt(p225w4.k.f29091R0, 0);
        if (i13 == 1) {
            m2(TextUtils.TruncateAt.START);
        } else if (i13 == 2) {
            m2(TextUtils.TruncateAt.MIDDLE);
        } else if (i13 == 3) {
            m2(TextUtils.TruncateAt.END);
        }
        O1(typedArrayI.getBoolean(p225w4.k.f29233g1, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            O1(typedArrayI.getBoolean(p225w4.k.f29203d1, false));
        }
        H1(K4.c.d(this.f16837w0, typedArrayI, p225w4.k.f29193c1));
        int i14 = p225w4.k.f29223f1;
        if (typedArrayI.hasValue(i14)) {
            L1(K4.c.a(this.f16837w0, typedArrayI, i14));
        }
        J1(typedArrayI.getDimension(p225w4.k.f29213e1, -1.0f));
        k2(typedArrayI.getBoolean(p225w4.k.f29363t1, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            k2(typedArrayI.getBoolean(p225w4.k.f29313o1, false));
        }
        Y1(K4.c.d(this.f16837w0, typedArrayI, p225w4.k.f29303n1));
        i2(K4.c.a(this.f16837w0, typedArrayI, p225w4.k.f29353s1));
        d2(typedArrayI.getDimension(p225w4.k.f29333q1, 0.0f));
        t1(typedArrayI.getBoolean(p225w4.k.f29118U0, false));
        A1(typedArrayI.getBoolean(p225w4.k.f29154Y0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            A1(typedArrayI.getBoolean(p225w4.k.f29136W0, false));
        }
        v1(K4.c.d(this.f16837w0, typedArrayI, p225w4.k.f29127V0));
        int i15 = p225w4.k.f29145X0;
        if (typedArrayI.hasValue(i15)) {
            x1(K4.c.a(this.f16837w0, typedArrayI, i15));
        }
        x2(c.b(this.f16837w0, typedArrayI, p225w4.k.f28931A1));
        n2(c.b(this.f16837w0, typedArrayI, p225w4.k.f29383v1));
        R1(typedArrayI.getDimension(p225w4.k.f29263j1, 0.0f));
        r2(typedArrayI.getDimension(p225w4.k.f29403x1, 0.0f));
        p2(typedArrayI.getDimension(p225w4.k.f29393w1, 0.0f));
        F2(typedArrayI.getDimension(p225w4.k.f28951C1, 0.0f));
        C2(typedArrayI.getDimension(p225w4.k.f28941B1, 0.0f));
        f2(typedArrayI.getDimension(p225w4.k.f29343r1, 0.0f));
        a2(typedArrayI.getDimension(p225w4.k.f29323p1, 0.0f));
        F1(typedArrayI.getDimension(p225w4.k.f29183b1, 0.0f));
        t2(typedArrayI.getDimensionPixelSize(p225w4.k.f29100S0, SubsamplingScaleImageView.TILE_SIZE_AUTO));
        typedArrayI.recycle();
    }

    public static a r0(Context context, AttributeSet attributeSet, int i10, int i11) {
        a aVar = new a(context, attributeSet, i10, i11);
        aVar.q1(attributeSet, i10, i11);
        return aVar;
    }

    private void s0(Canvas canvas, Rect rect) {
        if (J2()) {
            h0(rect, this.f16779A0);
            RectF rectF = this.f16779A0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f16825k0.setBounds(0, 0, (int) this.f16779A0.width(), (int) this.f16779A0.height());
            this.f16825k0.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    private boolean s1(int[] iArr, int[] iArr2) {
        boolean z9;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.f16794P;
        int iL = l(colorStateList != null ? colorStateList.getColorForState(iArr, this.f16783E0) : 0);
        boolean state = true;
        if (this.f16783E0 != iL) {
            this.f16783E0 = iL;
            zOnStateChange = true;
        }
        ColorStateList colorStateList2 = this.f16796Q;
        int iL2 = l(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f16784F0) : 0);
        if (this.f16784F0 != iL2) {
            this.f16784F0 = iL2;
            zOnStateChange = true;
        }
        int i10 = D4.a.i(iL, iL2);
        if ((this.f16785G0 != i10) | (v() == null)) {
            this.f16785G0 = i10;
            V(ColorStateList.valueOf(i10));
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f16802T;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f16786H0) : 0;
        if (this.f16786H0 != colorForState) {
            this.f16786H0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.f16803T0 == null || !b.e(iArr)) ? 0 : this.f16803T0.getColorForState(iArr, this.f16787I0);
        if (this.f16787I0 != colorForState2) {
            this.f16787I0 = colorForState2;
            if (this.f16801S0) {
                zOnStateChange = true;
            }
        }
        int colorForState3 = (this.f16782D0.e() == null || this.f16782D0.e().i() == null) ? 0 : this.f16782D0.e().i().getColorForState(iArr, this.f16788J0);
        if (this.f16788J0 != colorForState3) {
            this.f16788J0 = colorForState3;
            zOnStateChange = true;
        }
        boolean z10 = j1(getState(), R.attr.state_checked) && this.f16823i0;
        if (this.f16789K0 == z10 || this.f16825k0 == null) {
            z9 = false;
        } else {
            float fI0 = i0();
            this.f16789K0 = z10;
            if (fI0 != i0()) {
                zOnStateChange = true;
                z9 = true;
            } else {
                z9 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.f16795P0;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f16790L0) : 0;
        if (this.f16790L0 != colorForState4) {
            this.f16790L0 = colorForState4;
            this.f16793O0 = com.google.android.material.drawable.a.l(this, this.f16795P0, this.f16797Q0);
        } else {
            state = zOnStateChange;
        }
        if (p1(this.f16812Y)) {
            state |= this.f16812Y.setState(iArr);
        }
        if (p1(this.f16825k0)) {
            state |= this.f16825k0.setState(iArr);
        }
        if (p1(this.f16818d0)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f16818d0.setState(iArr3);
        }
        if (b.f4786a && p1(this.f16819e0)) {
            state |= this.f16819e0.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z9) {
            r1();
        }
        return state;
    }

    private void t0(Canvas canvas, Rect rect) {
        if (this.f16813Y0) {
            return;
        }
        this.f16838x0.setColor(this.f16784F0);
        this.f16838x0.setStyle(Paint.Style.FILL);
        this.f16838x0.setColorFilter(h1());
        this.f16779A0.set(rect);
        canvas.drawRoundRect(this.f16779A0, E0(), E0(), this.f16838x0);
    }

    private void u0(Canvas canvas, Rect rect) {
        if (K2()) {
            h0(rect, this.f16779A0);
            RectF rectF = this.f16779A0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f16812Y.setBounds(0, 0, (int) this.f16779A0.width(), (int) this.f16779A0.height());
            this.f16812Y.draw(canvas);
            canvas.translate(-f10, -f11);
        }
    }

    private void v0(Canvas canvas, Rect rect) {
        if (this.f16804U <= 0.0f || this.f16813Y0) {
            return;
        }
        this.f16838x0.setColor(this.f16786H0);
        this.f16838x0.setStyle(Paint.Style.STROKE);
        if (!this.f16813Y0) {
            this.f16838x0.setColorFilter(h1());
        }
        RectF rectF = this.f16779A0;
        float f10 = rect.left;
        float f11 = this.f16804U;
        rectF.set(f10 + (f11 / 2.0f), rect.top + (f11 / 2.0f), rect.right - (f11 / 2.0f), rect.bottom - (f11 / 2.0f));
        float f12 = this.f16800S - (this.f16804U / 2.0f);
        canvas.drawRoundRect(this.f16779A0, f12, f12, this.f16838x0);
    }

    private void w0(Canvas canvas, Rect rect) {
        if (this.f16813Y0) {
            return;
        }
        this.f16838x0.setColor(this.f16783E0);
        this.f16838x0.setStyle(Paint.Style.FILL);
        this.f16779A0.set(rect);
        canvas.drawRoundRect(this.f16779A0, E0(), E0(), this.f16838x0);
    }

    private void x0(Canvas canvas, Rect rect) {
        if (L2()) {
            k0(rect, this.f16779A0);
            RectF rectF = this.f16779A0;
            float f10 = rectF.left;
            float f11 = rectF.top;
            canvas.translate(f10, f11);
            this.f16818d0.setBounds(0, 0, (int) this.f16779A0.width(), (int) this.f16779A0.height());
            if (b.f4786a) {
                this.f16819e0.setBounds(this.f16818d0.getBounds());
                this.f16819e0.jumpToCurrentState();
                this.f16819e0.draw(canvas);
            } else {
                this.f16818d0.draw(canvas);
            }
            canvas.translate(-f10, -f11);
        }
    }

    private void y0(Canvas canvas, Rect rect) {
        this.f16838x0.setColor(this.f16787I0);
        this.f16838x0.setStyle(Paint.Style.FILL);
        this.f16779A0.set(rect);
        if (!this.f16813Y0) {
            canvas.drawRoundRect(this.f16779A0, E0(), E0(), this.f16838x0);
        } else {
            h(new RectF(rect), this.f16781C0);
            super.q(canvas, this.f16838x0, this.f16781C0, s());
        }
    }

    private void z0(Canvas canvas, Rect rect) {
        Canvas canvas2;
        Paint paint = this.f16839y0;
        if (paint != null) {
            paint.setColor(p191t0.a.x(-16777216, 127));
            canvas.drawRect(rect, this.f16839y0);
            if (K2() || J2()) {
                h0(rect, this.f16779A0);
                canvas.drawRect(this.f16779A0, this.f16839y0);
            }
            if (this.f16808W != null) {
                canvas2 = canvas;
                canvas2.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.f16839y0);
            } else {
                canvas2 = canvas;
            }
            if (L2()) {
                k0(rect, this.f16779A0);
                canvas2.drawRect(this.f16779A0, this.f16839y0);
            }
            this.f16839y0.setColor(p191t0.a.x(-65536, 127));
            j0(rect, this.f16779A0);
            canvas2.drawRect(this.f16779A0, this.f16839y0);
            this.f16839y0.setColor(p191t0.a.x(-16711936, 127));
            l0(rect, this.f16779A0);
            canvas2.drawRect(this.f16779A0, this.f16839y0);
        }
    }

    public void A1(boolean z9) {
        if (this.f16824j0 != z9) {
            boolean zJ2 = J2();
            this.f16824j0 = z9;
            boolean zJ3 = J2();
            if (zJ2 != zJ3) {
                if (zJ3) {
                    g0(this.f16825k0);
                } else {
                    M2(this.f16825k0);
                }
                invalidateSelf();
                r1();
            }
        }
    }

    public void A2(d dVar) {
        this.f16782D0.k(dVar, this.f16837w0);
    }

    public Drawable B0() {
        return this.f16825k0;
    }

    public void B1(ColorStateList colorStateList) {
        if (this.f16796Q != colorStateList) {
            this.f16796Q = colorStateList;
            onStateChange(getState());
        }
    }

    public void B2(int i10) {
        A2(new d(this.f16837w0, i10));
    }

    public ColorStateList C0() {
        return this.f16826l0;
    }

    public void C1(int i10) {
        B1(p060g.a.a(this.f16837w0, i10));
    }

    public void C2(float f10) {
        if (this.f16833s0 != f10) {
            this.f16833s0 = f10;
            invalidateSelf();
            r1();
        }
    }

    public ColorStateList D0() {
        return this.f16796Q;
    }

    public void D1(float f10) {
        if (this.f16800S != f10) {
            this.f16800S = f10;
            setShapeAppearanceModel(B().w(f10));
        }
    }

    public void D2(int i10) {
        C2(this.f16837w0.getResources().getDimension(i10));
    }

    public float E0() {
        return this.f16813Y0 ? D() : this.f16800S;
    }

    public void E1(int i10) {
        D1(this.f16837w0.getResources().getDimension(i10));
    }

    public void E2(float f10) {
        d dVarE1 = e1();
        if (dVarE1 != null) {
            dVarE1.l(f10);
            this.f16782D0.g().setTextSize(f10);
            a();
        }
    }

    public float F0() {
        return this.f16836v0;
    }

    public void F1(float f10) {
        if (this.f16836v0 != f10) {
            this.f16836v0 = f10;
            invalidateSelf();
            r1();
        }
    }

    public void F2(float f10) {
        if (this.f16832r0 != f10) {
            this.f16832r0 = f10;
            invalidateSelf();
            r1();
        }
    }

    public Drawable G0() {
        Drawable drawable = this.f16812Y;
        if (drawable != null) {
            return p201u0.a.q(drawable);
        }
        return null;
    }

    public void G1(int i10) {
        F1(this.f16837w0.getResources().getDimension(i10));
    }

    public void G2(int i10) {
        F2(this.f16837w0.getResources().getDimension(i10));
    }

    public float H0() {
        return this.f16815a0;
    }

    public void H1(Drawable drawable) {
        Drawable drawableG0 = G0();
        if (drawableG0 != drawable) {
            float fI0 = i0();
            this.f16812Y = drawable != null ? p201u0.a.r(drawable).mutate() : null;
            float fI1 = i0();
            M2(drawableG0);
            if (K2()) {
                g0(this.f16812Y);
            }
            invalidateSelf();
            if (fI0 != fI1) {
                r1();
            }
        }
    }

    public void H2(boolean z9) {
        if (this.f16801S0 != z9) {
            this.f16801S0 = z9;
            N2();
            onStateChange(getState());
        }
    }

    public ColorStateList I0() {
        return this.f16814Z;
    }

    public void I1(int i10) {
        H1(p060g.a.b(this.f16837w0, i10));
    }

    boolean I2() {
        return this.f16809W0;
    }

    public float J0() {
        return this.f16798R;
    }

    public void J1(float f10) {
        if (this.f16815a0 != f10) {
            float fI0 = i0();
            this.f16815a0 = f10;
            float fI1 = i0();
            invalidateSelf();
            if (fI0 != fI1) {
                r1();
            }
        }
    }

    public float K0() {
        return this.f16829o0;
    }

    public void K1(int i10) {
        J1(this.f16837w0.getResources().getDimension(i10));
    }

    public ColorStateList L0() {
        return this.f16802T;
    }

    public void L1(ColorStateList colorStateList) {
        this.f16816b0 = true;
        if (this.f16814Z != colorStateList) {
            this.f16814Z = colorStateList;
            if (K2()) {
                p201u0.a.o(this.f16812Y, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public float M0() {
        return this.f16804U;
    }

    public void M1(int i10) {
        L1(p060g.a.a(this.f16837w0, i10));
    }

    public Drawable N0() {
        Drawable drawable = this.f16818d0;
        if (drawable != null) {
            return p201u0.a.q(drawable);
        }
        return null;
    }

    public void N1(int i10) {
        O1(this.f16837w0.getResources().getBoolean(i10));
    }

    public CharSequence O0() {
        return this.f16822h0;
    }

    public void O1(boolean z9) {
        if (this.f16810X != z9) {
            boolean zK2 = K2();
            this.f16810X = z9;
            boolean zK3 = K2();
            if (zK2 != zK3) {
                if (zK3) {
                    g0(this.f16812Y);
                } else {
                    M2(this.f16812Y);
                }
                invalidateSelf();
                r1();
            }
        }
    }

    public float P0() {
        return this.f16835u0;
    }

    public void P1(float f10) {
        if (this.f16798R != f10) {
            this.f16798R = f10;
            invalidateSelf();
            r1();
        }
    }

    public float Q0() {
        return this.f16821g0;
    }

    public void Q1(int i10) {
        P1(this.f16837w0.getResources().getDimension(i10));
    }

    public float R0() {
        return this.f16834t0;
    }

    public void R1(float f10) {
        if (this.f16829o0 != f10) {
            this.f16829o0 = f10;
            invalidateSelf();
            r1();
        }
    }

    public int[] S0() {
        return this.f16799R0;
    }

    public void S1(int i10) {
        R1(this.f16837w0.getResources().getDimension(i10));
    }

    public ColorStateList T0() {
        return this.f16820f0;
    }

    public void T1(ColorStateList colorStateList) {
        if (this.f16802T != colorStateList) {
            this.f16802T = colorStateList;
            if (this.f16813Y0) {
                b0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void U0(RectF rectF) {
        l0(getBounds(), rectF);
    }

    public void U1(int i10) {
        T1(p060g.a.a(this.f16837w0, i10));
    }

    public void V1(float f10) {
        if (this.f16804U != f10) {
            this.f16804U = f10;
            this.f16838x0.setStrokeWidth(f10);
            if (this.f16813Y0) {
                super.c0(f10);
            }
            invalidateSelf();
        }
    }

    public void W1(int i10) {
        V1(this.f16837w0.getResources().getDimension(i10));
    }

    public TextUtils.TruncateAt X0() {
        return this.f16807V0;
    }

    public c Y0() {
        return this.f16828n0;
    }

    public void Y1(Drawable drawable) {
        Drawable drawableN0 = N0();
        if (drawableN0 != drawable) {
            float fM0 = m0();
            this.f16818d0 = drawable != null ? p201u0.a.r(drawable).mutate() : null;
            if (b.f4786a) {
                O2();
            }
            float fM1 = m0();
            M2(drawableN0);
            if (L2()) {
                g0(this.f16818d0);
            }
            invalidateSelf();
            if (fM0 != fM1) {
                r1();
            }
        }
    }

    public float Z0() {
        return this.f16831q0;
    }

    public void Z1(CharSequence charSequence) {
        if (this.f16822h0 != charSequence) {
            this.f16822h0 = p251z0.a.c().h(charSequence);
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.internal.i.b
    public void a() {
        r1();
        invalidateSelf();
    }

    public float a1() {
        return this.f16830p0;
    }

    public void a2(float f10) {
        if (this.f16835u0 != f10) {
            this.f16835u0 = f10;
            invalidateSelf();
            if (L2()) {
                r1();
            }
        }
    }

    public ColorStateList b1() {
        return this.f16806V;
    }

    public void b2(int i10) {
        a2(this.f16837w0.getResources().getDimension(i10));
    }

    public c c1() {
        return this.f16827m0;
    }

    public void c2(int i10) {
        Y1(p060g.a.b(this.f16837w0, i10));
    }

    public CharSequence d1() {
        return this.f16808W;
    }

    public void d2(float f10) {
        if (this.f16821g0 != f10) {
            this.f16821g0 = f10;
            invalidateSelf();
            if (L2()) {
                r1();
            }
        }
    }

    @Override // N4.h, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Canvas canvas2;
        int iA;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i10 = this.f16791M0;
        if (i10 < 255) {
            canvas2 = canvas;
            iA = p255z4.a.a(canvas2, bounds.left, bounds.top, bounds.right, bounds.bottom, i10);
        } else {
            canvas2 = canvas;
            iA = 0;
        }
        w0(canvas2, bounds);
        t0(canvas2, bounds);
        if (this.f16813Y0) {
            super.draw(canvas2);
        }
        v0(canvas2, bounds);
        y0(canvas2, bounds);
        u0(canvas2, bounds);
        s0(canvas2, bounds);
        if (this.f16809W0) {
            A0(canvas2, bounds);
        }
        x0(canvas2, bounds);
        z0(canvas2, bounds);
        if (this.f16791M0 < 255) {
            canvas2.restoreToCount(iA);
        }
    }

    public d e1() {
        return this.f16782D0.e();
    }

    public void e2(int i10) {
        d2(this.f16837w0.getResources().getDimension(i10));
    }

    public float f1() {
        return this.f16833s0;
    }

    public void f2(float f10) {
        if (this.f16834t0 != f10) {
            this.f16834t0 = f10;
            invalidateSelf();
            if (L2()) {
                r1();
            }
        }
    }

    public float g1() {
        return this.f16832r0;
    }

    public void g2(int i10) {
        f2(this.f16837w0.getResources().getDimension(i10));
    }

    @Override // N4.h, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f16791M0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f16792N0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f16798R;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f16829o0 + i0() + this.f16832r0 + this.f16782D0.h(d1().toString()) + this.f16833s0 + m0() + this.f16836v0), this.f16811X0);
    }

    @Override // N4.h, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // N4.h, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Outline outline2;
        if (this.f16813Y0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f16800S);
        } else {
            outline.setRoundRect(bounds, this.f16800S);
            outline2 = outline;
        }
        outline2.setAlpha(getAlpha() / 255.0f);
    }

    public boolean h2(int[] iArr) {
        if (Arrays.equals(this.f16799R0, iArr)) {
            return false;
        }
        this.f16799R0 = iArr;
        if (L2()) {
            return s1(getState(), iArr);
        }
        return false;
    }

    float i0() {
        if (K2() || J2()) {
            return this.f16830p0 + W0() + this.f16831q0;
        }
        return 0.0f;
    }

    public boolean i1() {
        return this.f16801S0;
    }

    public void i2(ColorStateList colorStateList) {
        if (this.f16820f0 != colorStateList) {
            this.f16820f0 = colorStateList;
            if (L2()) {
                p201u0.a.o(this.f16818d0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // N4.h, android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (o1(this.f16794P) || o1(this.f16796Q) || o1(this.f16802T)) {
            return true;
        }
        return (this.f16801S0 && o1(this.f16803T0)) || n1(this.f16782D0.e()) || q0() || p1(this.f16812Y) || p1(this.f16825k0) || o1(this.f16795P0);
    }

    public void j2(int i10) {
        i2(p060g.a.a(this.f16837w0, i10));
    }

    public boolean k1() {
        return this.f16823i0;
    }

    public void k2(boolean z9) {
        if (this.f16817c0 != z9) {
            boolean zL2 = L2();
            this.f16817c0 = z9;
            boolean zL3 = L2();
            if (zL2 != zL3) {
                if (zL3) {
                    g0(this.f16818d0);
                } else {
                    M2(this.f16818d0);
                }
                invalidateSelf();
                r1();
            }
        }
    }

    public boolean l1() {
        return p1(this.f16818d0);
    }

    public void l2(InterfaceC0458a interfaceC0458a) {
        this.f16805U0 = new WeakReference(interfaceC0458a);
    }

    float m0() {
        if (L2()) {
            return this.f16834t0 + this.f16821g0 + this.f16835u0;
        }
        return 0.0f;
    }

    public boolean m1() {
        return this.f16817c0;
    }

    public void m2(TextUtils.TruncateAt truncateAt) {
        this.f16807V0 = truncateAt;
    }

    public void n2(c cVar) {
        this.f16828n0 = cVar;
    }

    public void o2(int i10) {
        n2(c.c(this.f16837w0, i10));
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (K2()) {
            zOnLayoutDirectionChanged |= p201u0.a.m(this.f16812Y, i10);
        }
        if (J2()) {
            zOnLayoutDirectionChanged |= p201u0.a.m(this.f16825k0, i10);
        }
        if (L2()) {
            zOnLayoutDirectionChanged |= p201u0.a.m(this.f16818d0, i10);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        boolean zOnLevelChange = super.onLevelChange(i10);
        if (K2()) {
            zOnLevelChange |= this.f16812Y.setLevel(i10);
        }
        if (J2()) {
            zOnLevelChange |= this.f16825k0.setLevel(i10);
        }
        if (L2()) {
            zOnLevelChange |= this.f16818d0.setLevel(i10);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // N4.h, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.f16813Y0) {
            super.onStateChange(iArr);
        }
        return s1(iArr, S0());
    }

    Paint.Align p0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f16808W != null) {
            float fI0 = this.f16829o0 + i0() + this.f16832r0;
            if (p201u0.a.f(this) == 0) {
                pointF.x = rect.left + fI0;
            } else {
                pointF.x = rect.right - fI0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - o0();
        }
        return align;
    }

    public void p2(float f10) {
        if (this.f16831q0 != f10) {
            float fI0 = i0();
            this.f16831q0 = f10;
            float fI1 = i0();
            invalidateSelf();
            if (fI0 != fI1) {
                r1();
            }
        }
    }

    public void q2(int i10) {
        p2(this.f16837w0.getResources().getDimension(i10));
    }

    protected void r1() {
        InterfaceC0458a interfaceC0458a = (InterfaceC0458a) this.f16805U0.get();
        if (interfaceC0458a != null) {
            interfaceC0458a.a();
        }
    }

    public void r2(float f10) {
        if (this.f16830p0 != f10) {
            float fI0 = i0();
            this.f16830p0 = f10;
            float fI1 = i0();
            invalidateSelf();
            if (fI0 != fI1) {
                r1();
            }
        }
    }

    public void s2(int i10) {
        r2(this.f16837w0.getResources().getDimension(i10));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j9) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j9);
        }
    }

    @Override // N4.h, android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f16791M0 != i10) {
            this.f16791M0 = i10;
            invalidateSelf();
        }
    }

    @Override // N4.h, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f16792N0 != colorFilter) {
            this.f16792N0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // N4.h, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.f16795P0 != colorStateList) {
            this.f16795P0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // N4.h, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f16797Q0 != mode) {
            this.f16797Q0 = mode;
            this.f16793O0 = com.google.android.material.drawable.a.l(this, this.f16795P0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z9, boolean z10) {
        boolean visible = super.setVisible(z9, z10);
        if (K2()) {
            visible |= this.f16812Y.setVisible(z9, z10);
        }
        if (J2()) {
            visible |= this.f16825k0.setVisible(z9, z10);
        }
        if (L2()) {
            visible |= this.f16818d0.setVisible(z9, z10);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public void t1(boolean z9) {
        if (this.f16823i0 != z9) {
            this.f16823i0 = z9;
            float fI0 = i0();
            if (!z9 && this.f16789K0) {
                this.f16789K0 = false;
            }
            float fI1 = i0();
            invalidateSelf();
            if (fI0 != fI1) {
                r1();
            }
        }
    }

    public void t2(int i10) {
        this.f16811X0 = i10;
    }

    public void u1(int i10) {
        t1(this.f16837w0.getResources().getBoolean(i10));
    }

    public void u2(ColorStateList colorStateList) {
        if (this.f16806V != colorStateList) {
            this.f16806V = colorStateList;
            N2();
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public void v1(Drawable drawable) {
        if (this.f16825k0 != drawable) {
            float fI0 = i0();
            this.f16825k0 = drawable;
            float fI1 = i0();
            M2(this.f16825k0);
            g0(this.f16825k0);
            invalidateSelf();
            if (fI0 != fI1) {
                r1();
            }
        }
    }

    public void v2(int i10) {
        u2(p060g.a.a(this.f16837w0, i10));
    }

    public void w1(int i10) {
        v1(p060g.a.b(this.f16837w0, i10));
    }

    void w2(boolean z9) {
        this.f16809W0 = z9;
    }

    public void x1(ColorStateList colorStateList) {
        if (this.f16826l0 != colorStateList) {
            this.f16826l0 = colorStateList;
            if (q0()) {
                p201u0.a.o(this.f16825k0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void x2(c cVar) {
        this.f16827m0 = cVar;
    }

    public void y1(int i10) {
        x1(p060g.a.a(this.f16837w0, i10));
    }

    public void y2(int i10) {
        x2(c.c(this.f16837w0, i10));
    }

    public void z1(int i10) {
        A1(this.f16837w0.getResources().getBoolean(i10));
    }

    public void z2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.f16808W, charSequence)) {
            return;
        }
        this.f16808W = charSequence;
        this.f16782D0.m(true);
        invalidateSelf();
        r1();
    }
}
