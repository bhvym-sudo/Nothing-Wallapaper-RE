package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextView f11115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private H f11116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private H f11117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private H f11118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private H f11119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private H f11120f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private H f11121g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private H f11122h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final s f11123i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f11124j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f11125k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Typeface f11126l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f11127m;

    class a extends s0.h.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f11128a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f11129b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeakReference f11130c;

        a(int i10, int i11, WeakReference weakReference) {
            this.f11128a = i10;
            this.f11129b = i11;
            this.f11130c = weakReference;
        }

        @Override // s0.h.e
        public void f(int i10) {
        }

        @Override // s0.h.e
        public void g(Typeface typeface) {
            int i10 = this.f11128a;
            if (i10 != -1) {
                typeface = e.a(typeface, i10, (this.f11129b & 2) != 0);
            }
            r.this.n(this.f11130c, typeface);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ TextView f11132q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Typeface f11133r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f11134s;

        b(TextView textView, Typeface typeface, int i10) {
            this.f11132q = textView;
            this.f11133r = typeface;
            this.f11134s = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11132q.setTypeface(this.f11133r, this.f11134s);
        }
    }

    static class c {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    static class d {
        static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        static void b(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        static void c(TextView textView, int[] iArr, int i10) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    static class e {
        static Typeface a(Typeface typeface, int i10, boolean z9) {
            return Typeface.create(typeface, i10, z9);
        }
    }

    r(TextView textView) {
        this.f11115a = textView;
        this.f11123i = new s(textView);
    }

    private void B(int i10, float f10) {
        this.f11123i.t(i10, f10);
    }

    private void C(Context context, J j9) {
        String strO;
        this.f11124j = j9.k(p050f.j.f20510E2, this.f11124j);
        int iK = j9.k(p050f.j.f20522H2, -1);
        this.f11125k = iK;
        if (iK != -1) {
            this.f11124j &= 2;
        }
        int i10 = p050f.j.f20518G2;
        if (!j9.s(i10) && !j9.s(p050f.j.f20526I2)) {
            int i11 = p050f.j.f20506D2;
            if (j9.s(i11)) {
                this.f11127m = false;
                int iK2 = j9.k(i11, 1);
                if (iK2 == 1) {
                    this.f11126l = Typeface.SANS_SERIF;
                    return;
                } else if (iK2 == 2) {
                    this.f11126l = Typeface.SERIF;
                    return;
                } else {
                    if (iK2 != 3) {
                        return;
                    }
                    this.f11126l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f11126l = null;
        int i12 = p050f.j.f20526I2;
        if (j9.s(i12)) {
            i10 = i12;
        }
        int i13 = this.f11125k;
        int i14 = this.f11124j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceJ = j9.j(i10, this.f11124j, new a(i13, i14, new WeakReference(this.f11115a)));
                if (typefaceJ != null) {
                    if (this.f11125k != -1) {
                        this.f11126l = e.a(Typeface.create(typefaceJ, 0), this.f11125k, (this.f11124j & 2) != 0);
                    } else {
                        this.f11126l = typefaceJ;
                    }
                }
                this.f11127m = this.f11126l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f11126l != null || (strO = j9.o(i10)) == null) {
            return;
        }
        if (this.f11125k != -1) {
            this.f11126l = e.a(Typeface.create(strO, 0), this.f11125k, (this.f11124j & 2) != 0);
        } else {
            this.f11126l = Typeface.create(strO, this.f11124j);
        }
    }

    private void a(Drawable drawable, H h10) {
        if (drawable == null || h10 == null) {
            return;
        }
        C1011h.i(drawable, h10, this.f11115a.getDrawableState());
    }

    private static H d(Context context, C1011h c1011h, int i10) {
        ColorStateList colorStateListF = c1011h.f(context, i10);
        if (colorStateListF == null) {
            return null;
        }
        H h10 = new H();
        h10.f10799d = true;
        h10.f10796a = colorStateListF;
        return h10;
    }

    private void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f11115a.getCompoundDrawablesRelative();
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            TextView textView = this.f11115a;
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.f11115a.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            this.f11115a.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative2[2], drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f11115a.getCompoundDrawables();
        TextView textView2 = this.f11115a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    private void z() {
        H h10 = this.f11122h;
        this.f11116b = h10;
        this.f11117c = h10;
        this.f11118d = h10;
        this.f11119e = h10;
        this.f11120f = h10;
        this.f11121g = h10;
    }

    void A(int i10, float f10) {
        if (Q.f10851a || l()) {
            return;
        }
        B(i10, f10);
    }

    void b() {
        if (this.f11116b != null || this.f11117c != null || this.f11118d != null || this.f11119e != null) {
            Drawable[] compoundDrawables = this.f11115a.getCompoundDrawables();
            a(compoundDrawables[0], this.f11116b);
            a(compoundDrawables[1], this.f11117c);
            a(compoundDrawables[2], this.f11118d);
            a(compoundDrawables[3], this.f11119e);
        }
        if (this.f11120f == null && this.f11121g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f11115a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f11120f);
        a(compoundDrawablesRelative[2], this.f11121g);
    }

    void c() {
        this.f11123i.a();
    }

    int e() {
        return this.f11123i.f();
    }

    int f() {
        return this.f11123i.g();
    }

    int g() {
        return this.f11123i.h();
    }

    int[] h() {
        return this.f11123i.i();
    }

    int i() {
        return this.f11123i.j();
    }

    ColorStateList j() {
        H h10 = this.f11122h;
        if (h10 != null) {
            return h10.f10796a;
        }
        return null;
    }

    PorterDuff.Mode k() {
        H h10 = this.f11122h;
        if (h10 != null) {
            return h10.f10797b;
        }
        return null;
    }

    boolean l() {
        return this.f11123i.n();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:43:0x00fb  */
    void m(AttributeSet attributeSet, int i10) {
        boolean zA;
        boolean z9;
        String strO;
        String strO2;
        int iA;
        float f10;
        Context context = this.f11115a.getContext();
        C1011h c1011hB = C1011h.b();
        int[] iArr = p050f.j.f20587Y;
        J jV = J.v(context, attributeSet, iArr, i10, 0);
        TextView textView = this.f11115a;
        androidx.core.view.H.e0(textView, textView.getContext(), iArr, attributeSet, jV.r(), i10, 0);
        int iN = jV.n(p050f.j.f20591Z, -1);
        int i11 = p050f.j.f20606c0;
        if (jV.s(i11)) {
            this.f11116b = d(context, c1011hB, jV.n(i11, 0));
        }
        int i12 = p050f.j.f20596a0;
        if (jV.s(i12)) {
            this.f11117c = d(context, c1011hB, jV.n(i12, 0));
        }
        int i13 = p050f.j.f20611d0;
        if (jV.s(i13)) {
            this.f11118d = d(context, c1011hB, jV.n(i13, 0));
        }
        int i14 = p050f.j.f20601b0;
        if (jV.s(i14)) {
            this.f11119e = d(context, c1011hB, jV.n(i14, 0));
        }
        int i15 = p050f.j.f20616e0;
        if (jV.s(i15)) {
            this.f11120f = d(context, c1011hB, jV.n(i15, 0));
        }
        int i16 = p050f.j.f20621f0;
        if (jV.s(i16)) {
            this.f11121g = d(context, c1011hB, jV.n(i16, 0));
        }
        jV.x();
        boolean z10 = this.f11115a.getTransformationMethod() instanceof PasswordTransformationMethod;
        boolean z11 = true;
        if (iN != -1) {
            J jT = J.t(context, iN, p050f.j.f20498B2);
            if (z10) {
                zA = false;
                z9 = false;
            } else {
                int i17 = p050f.j.f20534K2;
                if (jT.s(i17)) {
                    zA = jT.a(i17, false);
                    z9 = true;
                } else {
                    zA = false;
                    z9 = false;
                }
            }
            C(context, jT);
            int i18 = p050f.j.f20538L2;
            strO = jT.s(i18) ? jT.o(i18) : null;
            int i19 = p050f.j.f20530J2;
            strO2 = jT.s(i19) ? jT.o(i19) : null;
            jT.x();
        } else {
            zA = false;
            z9 = false;
            strO = null;
            strO2 = null;
        }
        J jV2 = J.v(context, attributeSet, p050f.j.f20498B2, i10, 0);
        if (z10) {
            z11 = z9;
        } else {
            int i20 = p050f.j.f20534K2;
            if (jV2.s(i20)) {
                zA = jV2.a(i20, false);
            } else {
                z11 = z9;
            }
        }
        int i21 = p050f.j.f20538L2;
        if (jV2.s(i21)) {
            strO = jV2.o(i21);
        }
        int i22 = p050f.j.f20530J2;
        if (jV2.s(i22)) {
            strO2 = jV2.o(i22);
        }
        int i23 = p050f.j.f20502C2;
        if (jV2.s(i23) && jV2.f(i23, -1) == 0) {
            this.f11115a.setTextSize(0, 0.0f);
        }
        C(context, jV2);
        jV2.x();
        if (!z10 && z11) {
            s(zA);
        }
        Typeface typeface = this.f11126l;
        if (typeface != null) {
            if (this.f11125k == -1) {
                this.f11115a.setTypeface(typeface, this.f11124j);
            } else {
                this.f11115a.setTypeface(typeface);
            }
        }
        if (strO2 != null) {
            d.d(this.f11115a, strO2);
        }
        if (strO != null) {
            c.b(this.f11115a, c.a(strO));
        }
        this.f11123i.o(attributeSet, i10);
        if (Q.f10851a && this.f11123i.j() != 0) {
            int[] iArrI = this.f11123i.i();
            if (iArrI.length > 0) {
                if (d.a(this.f11115a) != -1.0f) {
                    d.b(this.f11115a, this.f11123i.g(), this.f11123i.f(), this.f11123i.h(), 0);
                } else {
                    d.c(this.f11115a, iArrI, 0);
                }
            }
        }
        J jU = J.u(context, attributeSet, p050f.j.f20626g0);
        int iN2 = jU.n(p050f.j.f20666o0, -1);
        Drawable drawableC = iN2 != -1 ? c1011hB.c(context, iN2) : null;
        int iN3 = jU.n(p050f.j.f20691t0, -1);
        Drawable drawableC2 = iN3 != -1 ? c1011hB.c(context, iN3) : null;
        int iN4 = jU.n(p050f.j.f20671p0, -1);
        Drawable drawableC3 = iN4 != -1 ? c1011hB.c(context, iN4) : null;
        int iN5 = jU.n(p050f.j.f20656m0, -1);
        Drawable drawableC4 = iN5 != -1 ? c1011hB.c(context, iN5) : null;
        int iN6 = jU.n(p050f.j.f20676q0, -1);
        Drawable drawableC5 = iN6 != -1 ? c1011hB.c(context, iN6) : null;
        int iN7 = jU.n(p050f.j.f20661n0, -1);
        y(drawableC, drawableC2, drawableC3, drawableC4, drawableC5, iN7 != -1 ? c1011hB.c(context, iN7) : null);
        int i24 = p050f.j.f20681r0;
        if (jU.s(i24)) {
            androidx.core.widget.l.g(this.f11115a, jU.c(i24));
        }
        int i25 = p050f.j.f20686s0;
        if (jU.s(i25)) {
            androidx.core.widget.l.h(this.f11115a, v.d(jU.k(i25, -1), null));
        }
        int iF = jU.f(p050f.j.f20701v0, -1);
        int iF2 = jU.f(p050f.j.f20706w0, -1);
        int i26 = p050f.j.f20711x0;
        if (jU.s(i26)) {
            TypedValue typedValueW = jU.w(i26);
            if (typedValueW == null || typedValueW.type != 5) {
                f10 = jU.f(i26, -1);
                iA = -1;
            } else {
                iA = B0.j.a(typedValueW.data);
                f10 = TypedValue.complexToFloat(typedValueW.data);
            }
        } else {
            iA = -1;
            f10 = -1.0f;
        }
        jU.x();
        if (iF != -1) {
            androidx.core.widget.l.j(this.f11115a, iF);
        }
        if (iF2 != -1) {
            androidx.core.widget.l.k(this.f11115a, iF2);
        }
        if (f10 != -1.0f) {
            if (iA == -1) {
                androidx.core.widget.l.l(this.f11115a, (int) f10);
            } else {
                androidx.core.widget.l.m(this.f11115a, iA, f10);
            }
        }
    }

    void n(WeakReference weakReference, Typeface typeface) {
        if (this.f11127m) {
            this.f11126l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new b(textView, typeface, this.f11124j));
                } else {
                    textView.setTypeface(typeface, this.f11124j);
                }
            }
        }
    }

    void o(boolean z9, int i10, int i11, int i12, int i13) {
        if (Q.f10851a) {
            return;
        }
        c();
    }

    void p() {
        b();
    }

    void q(Context context, int i10) {
        String strO;
        J jT = J.t(context, i10, p050f.j.f20498B2);
        int i11 = p050f.j.f20534K2;
        if (jT.s(i11)) {
            s(jT.a(i11, false));
        }
        int i12 = p050f.j.f20502C2;
        if (jT.s(i12) && jT.f(i12, -1) == 0) {
            this.f11115a.setTextSize(0, 0.0f);
        }
        C(context, jT);
        int i13 = p050f.j.f20530J2;
        if (jT.s(i13) && (strO = jT.o(i13)) != null) {
            d.d(this.f11115a, strO);
        }
        jT.x();
        Typeface typeface = this.f11126l;
        if (typeface != null) {
            this.f11115a.setTypeface(typeface, this.f11124j);
        }
    }

    void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
    }

    void s(boolean z9) {
        this.f11115a.setAllCaps(z9);
    }

    void t(int i10, int i11, int i12, int i13) {
        this.f11123i.p(i10, i11, i12, i13);
    }

    void u(int[] iArr, int i10) {
        this.f11123i.q(iArr, i10);
    }

    void v(int i10) {
        this.f11123i.r(i10);
    }

    void w(ColorStateList colorStateList) {
        if (this.f11122h == null) {
            this.f11122h = new H();
        }
        H h10 = this.f11122h;
        h10.f10796a = colorStateList;
        h10.f10799d = colorStateList != null;
        z();
    }

    void x(PorterDuff.Mode mode) {
        if (this.f11122h == null) {
            this.f11122h = new H();
        }
        H h10 = this.f11122h;
        h10.f10797b = mode;
        h10.f10798c = mode != null;
        z();
    }
}
