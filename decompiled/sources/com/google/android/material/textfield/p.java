package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.core.view.H;

/* JADX INFO: loaded from: classes.dex */
class p extends s {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final boolean f17470s = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f17471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f17472f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final TimeInterpolator f17473g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AutoCompleteTextView f17474h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final View.OnClickListener f17475i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final View.OnFocusChangeListener f17476j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C0.c.a f17477k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f17478l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f17479m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f17480n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f17481o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private AccessibilityManager f17482p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ValueAnimator f17483q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ValueAnimator f17484r;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            p.this.r();
            p.this.f17484r.start();
        }
    }

    p(r rVar) {
        super(rVar);
        this.f17475i = new View.OnClickListener() { // from class: com.google.android.material.textfield.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17466q.J();
            }
        };
        this.f17476j = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.m
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z9) {
                p.y(this.f17467a, view, z9);
            }
        };
        this.f17477k = new C0.c.a() { // from class: com.google.android.material.textfield.n
            @Override // C0.c.a
            public final void onTouchExplorationStateChanged(boolean z9) {
                p.w(this.f17468a, z9);
            }
        };
        this.f17481o = Long.MAX_VALUE;
        Context context = rVar.getContext();
        int i10 = p225w4.a.f28673H;
        this.f17472f = I4.f.f(context, i10, 67);
        this.f17471e = I4.f.f(rVar.getContext(), i10, 50);
        this.f17473g = I4.f.g(rVar.getContext(), p225w4.a.f28677L, p235x4.a.f29939a);
    }

    public static /* synthetic */ void A(p pVar) {
        pVar.K();
        pVar.H(false);
    }

    private static AutoCompleteTextView D(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private ValueAnimator E(int i10, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f17473g);
        valueAnimatorOfFloat.setDuration(i10);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.i
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                p.x(this.f17463a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private void F() {
        this.f17484r = E(this.f17472f, 0.0f, 1.0f);
        ValueAnimator valueAnimatorE = E(this.f17471e, 1.0f, 0.0f);
        this.f17483q = valueAnimatorE;
        valueAnimatorE.addListener(new a());
    }

    private boolean G() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f17481o;
        return jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300;
    }

    private void H(boolean z9) {
        if (this.f17480n != z9) {
            this.f17480n = z9;
            this.f17484r.cancel();
            this.f17483q.start();
        }
    }

    private void I() {
        this.f17474h.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.textfield.j
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return p.z(this.f17464q, view, motionEvent);
            }
        });
        if (f17470s) {
            this.f17474h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.k
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    p.A(this.f17465a);
                }
            });
        }
        this.f17474h.setThreshold(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        if (this.f17474h == null) {
            return;
        }
        if (G()) {
            this.f17479m = false;
        }
        if (this.f17479m) {
            this.f17479m = false;
            return;
        }
        if (f17470s) {
            H(!this.f17480n);
        } else {
            this.f17480n = !this.f17480n;
            r();
        }
        if (!this.f17480n) {
            this.f17474h.dismissDropDown();
        } else {
            this.f17474h.requestFocus();
            this.f17474h.showDropDown();
        }
    }

    private void K() {
        this.f17479m = true;
        this.f17481o = System.currentTimeMillis();
    }

    public static /* synthetic */ void v(p pVar) {
        boolean zIsPopupShowing = pVar.f17474h.isPopupShowing();
        pVar.H(zIsPopupShowing);
        pVar.f17479m = zIsPopupShowing;
    }

    public static /* synthetic */ void w(p pVar, boolean z9) {
        AutoCompleteTextView autoCompleteTextView = pVar.f17474h;
        if (autoCompleteTextView == null || q.a(autoCompleteTextView)) {
            return;
        }
        H.q0(pVar.f17519d, z9 ? 2 : 1);
    }

    public static /* synthetic */ void x(p pVar, ValueAnimator valueAnimator) {
        pVar.getClass();
        pVar.f17519d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void y(p pVar, View view, boolean z9) {
        pVar.f17478l = z9;
        pVar.r();
        if (z9) {
            return;
        }
        pVar.H(false);
        pVar.f17479m = false;
    }

    public static /* synthetic */ boolean z(p pVar, View view, MotionEvent motionEvent) {
        pVar.getClass();
        if (motionEvent.getAction() == 1) {
            if (pVar.G()) {
                pVar.f17479m = false;
            }
            pVar.J();
            pVar.K();
        }
        return false;
    }

    @Override // com.google.android.material.textfield.s
    public void a(Editable editable) {
        if (this.f17482p.isTouchExplorationEnabled() && q.a(this.f17474h) && !this.f17519d.hasFocus()) {
            this.f17474h.dismissDropDown();
        }
        this.f17474h.post(new Runnable() { // from class: com.google.android.material.textfield.o
            @Override // java.lang.Runnable
            public final void run() {
                p.v(this.f17469q);
            }
        });
    }

    @Override // com.google.android.material.textfield.s
    int c() {
        return p225w4.i.f28884g;
    }

    @Override // com.google.android.material.textfield.s
    int d() {
        return f17470s ? p225w4.d.f28797g : p225w4.d.f28798h;
    }

    @Override // com.google.android.material.textfield.s
    View.OnFocusChangeListener e() {
        return this.f17476j;
    }

    @Override // com.google.android.material.textfield.s
    View.OnClickListener f() {
        return this.f17475i;
    }

    @Override // com.google.android.material.textfield.s
    public C0.c.a h() {
        return this.f17477k;
    }

    @Override // com.google.android.material.textfield.s
    boolean i(int i10) {
        return i10 != 0;
    }

    @Override // com.google.android.material.textfield.s
    boolean j() {
        return true;
    }

    @Override // com.google.android.material.textfield.s
    boolean k() {
        return this.f17478l;
    }

    @Override // com.google.android.material.textfield.s
    boolean l() {
        return true;
    }

    @Override // com.google.android.material.textfield.s
    boolean m() {
        return this.f17480n;
    }

    @Override // com.google.android.material.textfield.s
    public void n(EditText editText) {
        this.f17474h = D(editText);
        I();
        this.f17516a.setErrorIconDrawable((Drawable) null);
        if (!q.a(editText) && this.f17482p.isTouchExplorationEnabled()) {
            H.q0(this.f17519d, 2);
        }
        this.f17516a.setEndIconVisible(true);
    }

    @Override // com.google.android.material.textfield.s
    public void o(View view, C0.d dVar) {
        if (!q.a(this.f17474h)) {
            dVar.g0(Spinner.class.getName());
        }
        if (dVar.R()) {
            dVar.t0(null);
        }
    }

    @Override // com.google.android.material.textfield.s
    public void p(View view, AccessibilityEvent accessibilityEvent) {
        if (!this.f17482p.isEnabled() || q.a(this.f17474h)) {
            return;
        }
        boolean z9 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f17480n && !this.f17474h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z9) {
            J();
            K();
        }
    }

    @Override // com.google.android.material.textfield.s
    void s() {
        F();
        this.f17482p = (AccessibilityManager) this.f17518c.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.s
    boolean t() {
        return true;
    }

    @Override // com.google.android.material.textfield.s
    void u() {
        AutoCompleteTextView autoCompleteTextView = this.f17474h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            if (f17470s) {
                this.f17474h.setOnDismissListener(null);
            }
        }
    }
}
