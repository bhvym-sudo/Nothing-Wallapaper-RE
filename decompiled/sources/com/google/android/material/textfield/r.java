package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.J;
import androidx.core.view.AbstractC1080l;
import androidx.core.view.H;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
class r extends LinearLayout {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private ColorStateList f17486A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private PorterDuff.Mode f17487B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f17488C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private ImageView.ScaleType f17489D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private View.OnLongClickListener f17490E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private CharSequence f17491F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final TextView f17492G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f17493H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private EditText f17494I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final AccessibilityManager f17495J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private C0.c.a f17496K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final TextWatcher f17497L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final TextInputLayout.f f17498M;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final TextInputLayout f17499q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final FrameLayout f17500r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final CheckableImageButton f17501s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ColorStateList f17502t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private PorterDuff.Mode f17503u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private View.OnLongClickListener f17504v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final CheckableImageButton f17505w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final d f17506x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f17507y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final LinkedHashSet f17508z;

    class a extends com.google.android.material.internal.j {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            r.this.m().a(editable);
        }

        @Override // com.google.android.material.internal.j, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            r.this.m().b(charSequence, i10, i11, i12);
        }
    }

    class b implements TextInputLayout.f {
        b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            if (r.this.f17494I == textInputLayout.getEditText()) {
                return;
            }
            if (r.this.f17494I != null) {
                r.this.f17494I.removeTextChangedListener(r.this.f17497L);
                if (r.this.f17494I.getOnFocusChangeListener() == r.this.m().e()) {
                    r.this.f17494I.setOnFocusChangeListener(null);
                }
            }
            r.this.f17494I = textInputLayout.getEditText();
            if (r.this.f17494I != null) {
                r.this.f17494I.addTextChangedListener(r.this.f17497L);
            }
            r.this.m().n(r.this.f17494I);
            r rVar = r.this;
            rVar.h0(rVar.m());
        }
    }

    class c implements View.OnAttachStateChangeListener {
        c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            r.this.g();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            r.this.M();
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SparseArray f17512a = new SparseArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final r f17513b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f17514c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f17515d;

        d(r rVar, J j9) {
            this.f17513b = rVar;
            this.f17514c = j9.n(p225w4.k.f28967D7, 0);
            this.f17515d = j9.n(p225w4.k.f29190b8, 0);
        }

        private s b(int i10) {
            if (i10 == -1) {
                return new g(this.f17513b);
            }
            if (i10 == 0) {
                return new w(this.f17513b);
            }
            if (i10 == 1) {
                return new y(this.f17513b, this.f17515d);
            }
            if (i10 == 2) {
                return new f(this.f17513b);
            }
            if (i10 == 3) {
                return new p(this.f17513b);
            }
            throw new IllegalArgumentException("Invalid end icon mode: " + i10);
        }

        s c(int i10) {
            s sVar = (s) this.f17512a.get(i10);
            if (sVar != null) {
                return sVar;
            }
            s sVarB = b(i10);
            this.f17512a.append(i10, sVarB);
            return sVarB;
        }
    }

    r(TextInputLayout textInputLayout, J j9) {
        super(textInputLayout.getContext());
        this.f17507y = 0;
        this.f17508z = new LinkedHashSet();
        this.f17497L = new a();
        b bVar = new b();
        this.f17498M = bVar;
        this.f17495J = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f17499q = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f17500r = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonI = i(this, layoutInflaterFrom, p225w4.e.f28812L);
        this.f17501s = checkableImageButtonI;
        CheckableImageButton checkableImageButtonI2 = i(frameLayout, layoutInflaterFrom, p225w4.e.f28811K);
        this.f17505w = checkableImageButtonI2;
        this.f17506x = new d(this, j9);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f17492G = appCompatTextView;
        C(j9);
        B(j9);
        D(j9);
        frameLayout.addView(checkableImageButtonI2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButtonI);
        textInputLayout.i(bVar);
        addOnAttachStateChangeListener(new c());
    }

    private void B(J j9) {
        int i10 = p225w4.k.f29200c8;
        if (!j9.s(i10)) {
            int i11 = p225w4.k.f29007H7;
            if (j9.s(i11)) {
                this.f17486A = K4.c.b(getContext(), j9, i11);
            }
            int i12 = p225w4.k.f29017I7;
            if (j9.s(i12)) {
                this.f17487B = com.google.android.material.internal.n.h(j9.k(i12, -1), null);
            }
        }
        int i13 = p225w4.k.f28987F7;
        if (j9.s(i13)) {
            U(j9.k(i13, 0));
            int i14 = p225w4.k.f28957C7;
            if (j9.s(i14)) {
                Q(j9.p(i14));
            }
            O(j9.a(p225w4.k.f28947B7, true));
        } else if (j9.s(i10)) {
            int i15 = p225w4.k.f29210d8;
            if (j9.s(i15)) {
                this.f17486A = K4.c.b(getContext(), j9, i15);
            }
            int i16 = p225w4.k.f29220e8;
            if (j9.s(i16)) {
                this.f17487B = com.google.android.material.internal.n.h(j9.k(i16, -1), null);
            }
            U(j9.a(i10, false) ? 1 : 0);
            Q(j9.p(p225w4.k.f29180a8));
        }
        T(j9.f(p225w4.k.f28977E7, getResources().getDimensionPixelSize(p225w4.c.f28759b0)));
        int i17 = p225w4.k.f28997G7;
        if (j9.s(i17)) {
            X(t.b(j9.k(i17, -1)));
        }
    }

    private void C(J j9) {
        int i10 = p225w4.k.f29062N7;
        if (j9.s(i10)) {
            this.f17502t = K4.c.b(getContext(), j9, i10);
        }
        int i11 = p225w4.k.f29071O7;
        if (j9.s(i11)) {
            this.f17503u = com.google.android.material.internal.n.h(j9.k(i11, -1), null);
        }
        int i12 = p225w4.k.f29053M7;
        if (j9.s(i12)) {
            c0(j9.g(i12));
        }
        this.f17501s.setContentDescription(getResources().getText(p225w4.i.f28883f));
        H.q0(this.f17501s, 2);
        this.f17501s.setClickable(false);
        this.f17501s.setPressable(false);
        this.f17501s.setFocusable(false);
    }

    private void D(J j9) {
        this.f17492G.setVisibility(8);
        this.f17492G.setId(p225w4.e.f28818R);
        this.f17492G.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        H.i0(this.f17492G, 1);
        q0(j9.n(p225w4.k.f29370t8, 0));
        int i10 = p225w4.k.f29380u8;
        if (j9.s(i10)) {
            r0(j9.c(i10));
        }
        p0(j9.p(p225w4.k.f29360s8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        AccessibilityManager accessibilityManager;
        C0.c.a aVar = this.f17496K;
        if (aVar == null || (accessibilityManager = this.f17495J) == null) {
            return;
        }
        C0.c.b(accessibilityManager, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f17496K == null || this.f17495J == null || !H.L(this)) {
            return;
        }
        C0.c.a(this.f17495J, this.f17496K);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(s sVar) {
        if (this.f17494I == null) {
            return;
        }
        if (sVar.e() != null) {
            this.f17494I.setOnFocusChangeListener(sVar.e());
        }
        if (sVar.g() != null) {
            this.f17505w.setOnFocusChangeListener(sVar.g());
        }
    }

    private CheckableImageButton i(ViewGroup viewGroup, LayoutInflater layoutInflater, int i10) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(p225w4.g.f28856g, viewGroup, false);
        checkableImageButton.setId(i10);
        t.e(checkableImageButton);
        if (K4.c.h(getContext())) {
            AbstractC1080l.d((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    private void j(int i10) {
        Iterator it = this.f17508z.iterator();
        if (it.hasNext()) {
            androidx.appcompat.app.o.a(it.next());
            throw null;
        }
    }

    private void s0(s sVar) {
        sVar.s();
        this.f17496K = sVar.h();
        g();
    }

    private int t(s sVar) {
        int i10 = this.f17506x.f17514c;
        return i10 == 0 ? sVar.d() : i10;
    }

    private void t0(s sVar) {
        M();
        this.f17496K = null;
        sVar.u();
    }

    private void u0(boolean z9) {
        if (!z9 || n() == null) {
            t.a(this.f17499q, this.f17505w, this.f17486A, this.f17487B);
            return;
        }
        Drawable drawableMutate = p201u0.a.r(n()).mutate();
        p201u0.a.n(drawableMutate, this.f17499q.getErrorCurrentTextColors());
        this.f17505w.setImageDrawable(drawableMutate);
    }

    private void v0() {
        this.f17500r.setVisibility((this.f17505w.getVisibility() != 0 || G()) ? 8 : 0);
        setVisibility((F() || G() || ((this.f17491F == null || this.f17493H) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    private void w0() {
        this.f17501s.setVisibility(s() != null && this.f17499q.N() && this.f17499q.b0() ? 0 : 8);
        v0();
        x0();
        if (A()) {
            return;
        }
        this.f17499q.m0();
    }

    private void y0() {
        int visibility = this.f17492G.getVisibility();
        int i10 = (this.f17491F == null || this.f17493H) ? 8 : 0;
        if (visibility != i10) {
            m().q(i10 == 0);
        }
        v0();
        this.f17492G.setVisibility(i10);
        this.f17499q.m0();
    }

    boolean A() {
        return this.f17507y != 0;
    }

    boolean E() {
        return A() && this.f17505w.isChecked();
    }

    boolean F() {
        return this.f17500r.getVisibility() == 0 && this.f17505w.getVisibility() == 0;
    }

    boolean G() {
        return this.f17501s.getVisibility() == 0;
    }

    void H(boolean z9) {
        this.f17493H = z9;
        y0();
    }

    void I() {
        w0();
        K();
        J();
        if (m().t()) {
            u0(this.f17499q.b0());
        }
    }

    void J() {
        t.d(this.f17499q, this.f17505w, this.f17486A);
    }

    void K() {
        t.d(this.f17499q, this.f17501s, this.f17502t);
    }

    void L(boolean z9) {
        boolean z10;
        boolean zIsActivated;
        boolean zIsChecked;
        s sVarM = m();
        boolean z11 = true;
        if (!sVarM.l() || (zIsChecked = this.f17505w.isChecked()) == sVarM.m()) {
            z10 = false;
        } else {
            this.f17505w.setChecked(!zIsChecked);
            z10 = true;
        }
        if (!sVarM.j() || (zIsActivated = this.f17505w.isActivated()) == sVarM.k()) {
            z11 = z10;
        } else {
            N(!zIsActivated);
        }
        if (z9 || z11) {
            J();
        }
    }

    void N(boolean z9) {
        this.f17505w.setActivated(z9);
    }

    void O(boolean z9) {
        this.f17505w.setCheckable(z9);
    }

    void P(int i10) {
        Q(i10 != 0 ? getResources().getText(i10) : null);
    }

    void Q(CharSequence charSequence) {
        if (l() != charSequence) {
            this.f17505w.setContentDescription(charSequence);
        }
    }

    void R(int i10) {
        S(i10 != 0 ? p060g.a.b(getContext(), i10) : null);
    }

    void S(Drawable drawable) {
        this.f17505w.setImageDrawable(drawable);
        if (drawable != null) {
            t.a(this.f17499q, this.f17505w, this.f17486A, this.f17487B);
            J();
        }
    }

    void T(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i10 != this.f17488C) {
            this.f17488C = i10;
            t.g(this.f17505w, i10);
            t.g(this.f17501s, i10);
        }
    }

    void U(int i10) {
        if (this.f17507y == i10) {
            return;
        }
        t0(m());
        int i11 = this.f17507y;
        this.f17507y = i10;
        j(i11);
        a0(i10 != 0);
        s sVarM = m();
        R(t(sVarM));
        P(sVarM.c());
        O(sVarM.l());
        if (!sVarM.i(this.f17499q.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + this.f17499q.getBoxBackgroundMode() + " is not supported by the end icon mode " + i10);
        }
        s0(sVarM);
        V(sVarM.f());
        EditText editText = this.f17494I;
        if (editText != null) {
            sVarM.n(editText);
            h0(sVarM);
        }
        t.a(this.f17499q, this.f17505w, this.f17486A, this.f17487B);
        L(true);
    }

    void V(View.OnClickListener onClickListener) {
        t.h(this.f17505w, onClickListener, this.f17490E);
    }

    void W(View.OnLongClickListener onLongClickListener) {
        this.f17490E = onLongClickListener;
        t.i(this.f17505w, onLongClickListener);
    }

    void X(ImageView.ScaleType scaleType) {
        this.f17489D = scaleType;
        t.j(this.f17505w, scaleType);
        t.j(this.f17501s, scaleType);
    }

    void Y(ColorStateList colorStateList) {
        if (this.f17486A != colorStateList) {
            this.f17486A = colorStateList;
            t.a(this.f17499q, this.f17505w, colorStateList, this.f17487B);
        }
    }

    void Z(PorterDuff.Mode mode) {
        if (this.f17487B != mode) {
            this.f17487B = mode;
            t.a(this.f17499q, this.f17505w, this.f17486A, mode);
        }
    }

    void a0(boolean z9) {
        if (F() != z9) {
            this.f17505w.setVisibility(z9 ? 0 : 8);
            v0();
            x0();
            this.f17499q.m0();
        }
    }

    void b0(int i10) {
        c0(i10 != 0 ? p060g.a.b(getContext(), i10) : null);
        K();
    }

    void c0(Drawable drawable) {
        this.f17501s.setImageDrawable(drawable);
        w0();
        t.a(this.f17499q, this.f17501s, this.f17502t, this.f17503u);
    }

    void d0(View.OnClickListener onClickListener) {
        t.h(this.f17501s, onClickListener, this.f17504v);
    }

    void e0(View.OnLongClickListener onLongClickListener) {
        this.f17504v = onLongClickListener;
        t.i(this.f17501s, onLongClickListener);
    }

    void f0(ColorStateList colorStateList) {
        if (this.f17502t != colorStateList) {
            this.f17502t = colorStateList;
            t.a(this.f17499q, this.f17501s, colorStateList, this.f17503u);
        }
    }

    void g0(PorterDuff.Mode mode) {
        if (this.f17503u != mode) {
            this.f17503u = mode;
            t.a(this.f17499q, this.f17501s, this.f17502t, mode);
        }
    }

    void h() {
        this.f17505w.performClick();
        this.f17505w.jumpDrawablesToCurrentState();
    }

    void i0(int i10) {
        j0(i10 != 0 ? getResources().getText(i10) : null);
    }

    void j0(CharSequence charSequence) {
        this.f17505w.setContentDescription(charSequence);
    }

    CheckableImageButton k() {
        if (G()) {
            return this.f17501s;
        }
        if (A() && F()) {
            return this.f17505w;
        }
        return null;
    }

    void k0(int i10) {
        l0(i10 != 0 ? p060g.a.b(getContext(), i10) : null);
    }

    CharSequence l() {
        return this.f17505w.getContentDescription();
    }

    void l0(Drawable drawable) {
        this.f17505w.setImageDrawable(drawable);
    }

    s m() {
        return this.f17506x.c(this.f17507y);
    }

    void m0(boolean z9) {
        if (z9 && this.f17507y != 1) {
            U(1);
        } else {
            if (z9) {
                return;
            }
            U(0);
        }
    }

    Drawable n() {
        return this.f17505w.getDrawable();
    }

    void n0(ColorStateList colorStateList) {
        this.f17486A = colorStateList;
        t.a(this.f17499q, this.f17505w, colorStateList, this.f17487B);
    }

    int o() {
        return this.f17488C;
    }

    void o0(PorterDuff.Mode mode) {
        this.f17487B = mode;
        t.a(this.f17499q, this.f17505w, this.f17486A, mode);
    }

    int p() {
        return this.f17507y;
    }

    void p0(CharSequence charSequence) {
        this.f17491F = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f17492G.setText(charSequence);
        y0();
    }

    ImageView.ScaleType q() {
        return this.f17489D;
    }

    void q0(int i10) {
        androidx.core.widget.l.o(this.f17492G, i10);
    }

    CheckableImageButton r() {
        return this.f17505w;
    }

    void r0(ColorStateList colorStateList) {
        this.f17492G.setTextColor(colorStateList);
    }

    Drawable s() {
        return this.f17501s.getDrawable();
    }

    CharSequence u() {
        return this.f17505w.getContentDescription();
    }

    Drawable v() {
        return this.f17505w.getDrawable();
    }

    CharSequence w() {
        return this.f17491F;
    }

    ColorStateList x() {
        return this.f17492G.getTextColors();
    }

    void x0() {
        if (this.f17499q.f17423t == null) {
            return;
        }
        H.v0(this.f17492G, getContext().getResources().getDimensionPixelSize(p225w4.c.f28738I), this.f17499q.f17423t.getPaddingTop(), (F() || G()) ? 0 : H.y(this.f17499q.f17423t), this.f17499q.f17423t.getPaddingBottom());
    }

    int y() {
        return H.y(this) + H.y(this.f17492G) + ((F() || G()) ? this.f17505w.getMeasuredWidth() + AbstractC1080l.b((ViewGroup.MarginLayoutParams) this.f17505w.getLayoutParams()) : 0);
    }

    TextView z() {
        return this.f17492G;
    }
}
