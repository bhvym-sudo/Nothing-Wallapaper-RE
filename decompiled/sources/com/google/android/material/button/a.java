package com.google.android.material.button;

import K4.c;
import L4.b;
import N4.h;
import N4.l;
import N4.o;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.core.view.H;
import com.google.android.material.internal.n;
import p225w4.k;

/* JADX INFO: loaded from: classes.dex */
class a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final boolean f16657u = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final boolean f16658v = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MaterialButton f16659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private l f16660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f16661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f16662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f16663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f16664f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f16665g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f16666h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private PorterDuff.Mode f16667i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ColorStateList f16668j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ColorStateList f16669k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ColorStateList f16670l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Drawable f16671m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f16675q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private LayerDrawable f16677s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f16678t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f16672n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f16673o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f16674p = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f16676r = true;

    a(MaterialButton materialButton, l lVar) {
        this.f16659a = materialButton;
        this.f16660b = lVar;
    }

    private void G(int i10, int i11) {
        int iZ = H.z(this.f16659a);
        int paddingTop = this.f16659a.getPaddingTop();
        int iY = H.y(this.f16659a);
        int paddingBottom = this.f16659a.getPaddingBottom();
        int i12 = this.f16663e;
        int i13 = this.f16664f;
        this.f16664f = i11;
        this.f16663e = i10;
        if (!this.f16673o) {
            H();
        }
        H.v0(this.f16659a, iZ, (paddingTop + i10) - i12, iY, (paddingBottom + i11) - i13);
    }

    private void H() {
        this.f16659a.setInternalBackground(a());
        h hVarF = f();
        if (hVarF != null) {
            hVarF.U(this.f16678t);
            hVarF.setState(this.f16659a.getDrawableState());
        }
    }

    private void I(l lVar) {
        if (f16658v && !this.f16673o) {
            int iZ = H.z(this.f16659a);
            int paddingTop = this.f16659a.getPaddingTop();
            int iY = H.y(this.f16659a);
            int paddingBottom = this.f16659a.getPaddingBottom();
            H();
            H.v0(this.f16659a, iZ, paddingTop, iY, paddingBottom);
            return;
        }
        if (f() != null) {
            f().setShapeAppearanceModel(lVar);
        }
        if (n() != null) {
            n().setShapeAppearanceModel(lVar);
        }
        if (e() != null) {
            e().setShapeAppearanceModel(lVar);
        }
    }

    private void J() {
        h hVarF = f();
        h hVarN = n();
        if (hVarF != null) {
            hVarF.a0(this.f16666h, this.f16669k);
            if (hVarN != null) {
                hVarN.Z(this.f16666h, this.f16672n ? D4.a.d(this.f16659a, p225w4.a.f28712o) : 0);
            }
        }
    }

    private InsetDrawable K(Drawable drawable) {
        return new InsetDrawable(drawable, this.f16661c, this.f16663e, this.f16662d, this.f16664f);
    }

    private Drawable a() {
        h hVar = new h(this.f16660b);
        hVar.K(this.f16659a.getContext());
        p201u0.a.o(hVar, this.f16668j);
        PorterDuff.Mode mode = this.f16667i;
        if (mode != null) {
            p201u0.a.p(hVar, mode);
        }
        hVar.a0(this.f16666h, this.f16669k);
        h hVar2 = new h(this.f16660b);
        hVar2.setTint(0);
        hVar2.Z(this.f16666h, this.f16672n ? D4.a.d(this.f16659a, p225w4.a.f28712o) : 0);
        if (f16657u) {
            h hVar3 = new h(this.f16660b);
            this.f16671m = hVar3;
            p201u0.a.n(hVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(b.d(this.f16670l), K(new LayerDrawable(new Drawable[]{hVar2, hVar})), this.f16671m);
            this.f16677s = rippleDrawable;
            return rippleDrawable;
        }
        L4.a aVar = new L4.a(this.f16660b);
        this.f16671m = aVar;
        p201u0.a.o(aVar, b.d(this.f16670l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{hVar2, hVar, this.f16671m});
        this.f16677s = layerDrawable;
        return K(layerDrawable);
    }

    private h g(boolean z9) {
        LayerDrawable layerDrawable = this.f16677s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return f16657u ? (h) ((LayerDrawable) ((InsetDrawable) this.f16677s.getDrawable(0)).getDrawable()).getDrawable(!z9 ? 1 : 0) : (h) this.f16677s.getDrawable(!z9 ? 1 : 0);
    }

    private h n() {
        return g(true);
    }

    void A(boolean z9) {
        this.f16672n = z9;
        J();
    }

    void B(ColorStateList colorStateList) {
        if (this.f16669k != colorStateList) {
            this.f16669k = colorStateList;
            J();
        }
    }

    void C(int i10) {
        if (this.f16666h != i10) {
            this.f16666h = i10;
            J();
        }
    }

    void D(ColorStateList colorStateList) {
        if (this.f16668j != colorStateList) {
            this.f16668j = colorStateList;
            if (f() != null) {
                p201u0.a.o(f(), this.f16668j);
            }
        }
    }

    void E(PorterDuff.Mode mode) {
        if (this.f16667i != mode) {
            this.f16667i = mode;
            if (f() == null || this.f16667i == null) {
                return;
            }
            p201u0.a.p(f(), this.f16667i);
        }
    }

    void F(boolean z9) {
        this.f16676r = z9;
    }

    int b() {
        return this.f16665g;
    }

    public int c() {
        return this.f16664f;
    }

    public int d() {
        return this.f16663e;
    }

    public o e() {
        LayerDrawable layerDrawable = this.f16677s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f16677s.getNumberOfLayers() > 2 ? (o) this.f16677s.getDrawable(2) : (o) this.f16677s.getDrawable(1);
    }

    h f() {
        return g(false);
    }

    ColorStateList h() {
        return this.f16670l;
    }

    l i() {
        return this.f16660b;
    }

    ColorStateList j() {
        return this.f16669k;
    }

    int k() {
        return this.f16666h;
    }

    ColorStateList l() {
        return this.f16668j;
    }

    PorterDuff.Mode m() {
        return this.f16667i;
    }

    boolean o() {
        return this.f16673o;
    }

    boolean p() {
        return this.f16675q;
    }

    boolean q() {
        return this.f16676r;
    }

    void r(TypedArray typedArray) {
        this.f16661c = typedArray.getDimensionPixelOffset(k.f29325p3, 0);
        this.f16662d = typedArray.getDimensionPixelOffset(k.f29335q3, 0);
        this.f16663e = typedArray.getDimensionPixelOffset(k.f29345r3, 0);
        this.f16664f = typedArray.getDimensionPixelOffset(k.f29355s3, 0);
        int i10 = k.f29395w3;
        if (typedArray.hasValue(i10)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i10, -1);
            this.f16665g = dimensionPixelSize;
            z(this.f16660b.w(dimensionPixelSize));
            this.f16674p = true;
        }
        this.f16666h = typedArray.getDimensionPixelSize(k.f28993G3, 0);
        this.f16667i = n.h(typedArray.getInt(k.f29385v3, -1), PorterDuff.Mode.SRC_IN);
        this.f16668j = c.a(this.f16659a.getContext(), typedArray, k.f29375u3);
        this.f16669k = c.a(this.f16659a.getContext(), typedArray, k.f28983F3);
        this.f16670l = c.a(this.f16659a.getContext(), typedArray, k.f28973E3);
        this.f16675q = typedArray.getBoolean(k.f29365t3, false);
        this.f16678t = typedArray.getDimensionPixelSize(k.f29405x3, 0);
        this.f16676r = typedArray.getBoolean(k.f29003H3, true);
        int iZ = H.z(this.f16659a);
        int paddingTop = this.f16659a.getPaddingTop();
        int iY = H.y(this.f16659a);
        int paddingBottom = this.f16659a.getPaddingBottom();
        if (typedArray.hasValue(k.f29315o3)) {
            t();
        } else {
            H();
        }
        H.v0(this.f16659a, iZ + this.f16661c, paddingTop + this.f16663e, iY + this.f16662d, paddingBottom + this.f16664f);
    }

    void s(int i10) {
        if (f() != null) {
            f().setTint(i10);
        }
    }

    void t() {
        this.f16673o = true;
        this.f16659a.setSupportBackgroundTintList(this.f16668j);
        this.f16659a.setSupportBackgroundTintMode(this.f16667i);
    }

    void u(boolean z9) {
        this.f16675q = z9;
    }

    void v(int i10) {
        if (this.f16674p && this.f16665g == i10) {
            return;
        }
        this.f16665g = i10;
        this.f16674p = true;
        z(this.f16660b.w(i10));
    }

    public void w(int i10) {
        G(this.f16663e, i10);
    }

    public void x(int i10) {
        G(i10, this.f16664f);
    }

    void y(ColorStateList colorStateList) {
        if (this.f16670l != colorStateList) {
            this.f16670l = colorStateList;
            boolean z9 = f16657u;
            if (z9 && (this.f16659a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f16659a.getBackground()).setColor(b.d(colorStateList));
            } else {
                if (z9 || !(this.f16659a.getBackground() instanceof L4.a)) {
                    return;
                }
                ((L4.a) this.f16659a.getBackground()).setTintList(b.d(colorStateList));
            }
        }
    }

    void z(l lVar) {
        this.f16660b = lVar;
        I(lVar);
    }
}
