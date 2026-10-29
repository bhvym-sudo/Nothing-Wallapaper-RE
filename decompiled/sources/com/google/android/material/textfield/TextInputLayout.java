package com.google.android.material.textfield;

import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C1011h;
import androidx.appcompat.widget.J;
import androidx.core.view.AbstractC1080l;
import androidx.core.view.C1069a;
import androidx.core.view.H;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.C1168c;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    private static final int f17358S0 = p225w4.j.f28916m;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    private static final int[][] f17359T0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    boolean f17360A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    private int f17361A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f17362B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    private int f17363B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f17364C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    private int f17365C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private e f17366D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    private ColorStateList f17367D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private TextView f17368E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    private int f17369E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f17370F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    private int f17371F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f17372G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    private int f17373G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private CharSequence f17374H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    private int f17375H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f17376I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    private int f17377I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private TextView f17378J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    int f17379J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private ColorStateList f17380K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    private boolean f17381K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private int f17382L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    final com.google.android.material.internal.a f17383L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private C1168c f17384M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    private boolean f17385M0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private C1168c f17386N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    private boolean f17387N0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private ColorStateList f17388O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    private ValueAnimator f17389O0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private ColorStateList f17390P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    private boolean f17391P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private ColorStateList f17392Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    private boolean f17393Q0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private ColorStateList f17394R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    private boolean f17395R0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f17396S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private CharSequence f17397T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private boolean f17398U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private N4.h f17399V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private N4.h f17400W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private StateListDrawable f17401a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f17402b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private N4.h f17403c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private N4.h f17404d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private N4.l f17405e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private boolean f17406f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private final int f17407g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private int f17408h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private int f17409i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private int f17410j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private int f17411k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private int f17412l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private int f17413m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private int f17414n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private final Rect f17415o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final Rect f17416p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final FrameLayout f17417q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private final RectF f17418q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final z f17419r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private Typeface f17420r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final r f17421s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private Drawable f17422s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    EditText f17423t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private int f17424t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private CharSequence f17425u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private final LinkedHashSet f17426u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f17427v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private Drawable f17428v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f17429w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private int f17430w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f17431x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private Drawable f17432x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f17433y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private ColorStateList f17434y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final u f17435z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private ColorStateList f17436z0;

    class a implements TextWatcher {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f17437q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ EditText f17438r;

        a(EditText editText) {
            this.f17438r = editText;
            this.f17437q = editText.getLineCount();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.s0(!textInputLayout.f17393Q0);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f17360A) {
                textInputLayout2.i0(editable);
            }
            if (TextInputLayout.this.f17376I) {
                TextInputLayout.this.w0(editable);
            }
            int lineCount = this.f17438r.getLineCount();
            int i10 = this.f17437q;
            if (lineCount != i10) {
                if (lineCount < i10) {
                    int iW = H.w(this.f17438r);
                    int i11 = TextInputLayout.this.f17379J0;
                    if (iW != i11) {
                        this.f17438r.setMinimumHeight(i11);
                    }
                }
                this.f17437q = lineCount;
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f17421s.h();
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f17383L0.y0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class d extends C1069a {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final TextInputLayout f17442q;

        public d(TextInputLayout textInputLayout) {
            this.f17442q = textInputLayout;
        }

        @Override // androidx.core.view.C1069a
        public void onInitializeAccessibilityNodeInfo(View view, C0.d dVar) {
            super.onInitializeAccessibilityNodeInfo(view, dVar);
            EditText editText = this.f17442q.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f17442q.getHint();
            CharSequence error = this.f17442q.getError();
            CharSequence placeholderText = this.f17442q.getPlaceholderText();
            int counterMaxLength = this.f17442q.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f17442q.getCounterOverflowDescription();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean zIsEmpty2 = TextUtils.isEmpty(hint);
            boolean zP = this.f17442q.P();
            boolean zIsEmpty3 = TextUtils.isEmpty(error);
            boolean z9 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
            String string = !zIsEmpty2 ? hint.toString() : "";
            this.f17442q.f17419r.A(dVar);
            if (!zIsEmpty) {
                dVar.M0(text);
            } else if (!TextUtils.isEmpty(string)) {
                dVar.M0(string);
                if (!zP && placeholderText != null) {
                    dVar.M0(string + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                dVar.M0(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                dVar.t0(string);
                dVar.J0(zIsEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            dVar.x0(counterMaxLength);
            if (z9) {
                if (zIsEmpty3) {
                    error = counterOverflowDescription;
                }
                dVar.p0(error);
            }
            View viewT = this.f17442q.f17435z.t();
            if (viewT != null) {
                dVar.v0(viewT);
            }
            this.f17442q.f17421s.m().o(view, dVar);
        }

        @Override // androidx.core.view.C1069a
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            this.f17442q.f17421s.m().p(view, accessibilityEvent);
        }
    }

    public interface e {
        int a(Editable editable);
    }

    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    static class g extends H0.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        CharSequence f17443q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f17444r;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i10) {
                return new g[i10];
            }
        }

        g(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f17443q) + "}";
        }

        @Override // H0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            TextUtils.writeToParcel(this.f17443q, parcel, i10);
            parcel.writeInt(this.f17444r ? 1 : 0);
        }

        g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f17443q = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f17444r = parcel.readInt() == 1;
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p225w4.a.f28699d0);
    }

    private C1168c A() {
        C1168c c1168c = new C1168c();
        c1168c.n0(I4.f.f(getContext(), p225w4.a.f28672G, 87));
        c1168c.p0(I4.f.g(getContext(), p225w4.a.f28677L, p235x4.a.f29939a));
        return c1168c;
    }

    private boolean B() {
        return this.f17396S && !TextUtils.isEmpty(this.f17397T) && (this.f17399V instanceof h);
    }

    private void C() {
        Iterator it = this.f17426u0.iterator();
        while (it.hasNext()) {
            ((f) it.next()).a(this);
        }
    }

    private void D(Canvas canvas) {
        N4.h hVar;
        if (this.f17404d0 == null || (hVar = this.f17403c0) == null) {
            return;
        }
        hVar.draw(canvas);
        if (this.f17423t.isFocused()) {
            Rect bounds = this.f17404d0.getBounds();
            Rect bounds2 = this.f17403c0.getBounds();
            float F9 = this.f17383L0.F();
            int iCenterX = bounds2.centerX();
            bounds.left = p235x4.a.c(iCenterX, bounds2.left, F9);
            bounds.right = p235x4.a.c(iCenterX, bounds2.right, F9);
            this.f17404d0.draw(canvas);
        }
    }

    private void E(Canvas canvas) {
        if (this.f17396S) {
            this.f17383L0.l(canvas);
        }
    }

    private void F(boolean z9) {
        ValueAnimator valueAnimator = this.f17389O0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f17389O0.cancel();
        }
        if (z9 && this.f17387N0) {
            l(0.0f);
        } else {
            this.f17383L0.y0(0.0f);
        }
        if (B() && ((h) this.f17399V).j0()) {
            y();
        }
        this.f17381K0 = true;
        L();
        this.f17419r.l(true);
        this.f17421s.H(true);
    }

    private N4.h G(boolean z9) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(p225w4.c.f28761c0);
        float f10 = z9 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f17423t;
        float popupElevation = editText instanceof v ? ((v) editText).getPopupElevation() : getResources().getDimensionPixelOffset(p225w4.c.f28785u);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(p225w4.c.f28757a0);
        N4.l lVarM = N4.l.a().A(f10).E(f10).s(dimensionPixelOffset).w(dimensionPixelOffset).m();
        EditText editText2 = this.f17423t;
        N4.h hVarM = N4.h.m(getContext(), popupElevation, editText2 instanceof v ? ((v) editText2).getDropDownBackgroundTintList() : null);
        hVarM.setShapeAppearanceModel(lVarM);
        hVarM.X(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        return hVarM;
    }

    private static Drawable H(N4.h hVar, int i10, int i11, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{D4.a.j(i11, i10, 0.1f), i10}), hVar, hVar);
    }

    private int I(int i10, boolean z9) {
        int compoundPaddingLeft;
        if (z9 || getPrefixText() == null) {
            compoundPaddingLeft = (!z9 || getSuffixText() == null) ? this.f17423t.getCompoundPaddingLeft() : this.f17421s.y();
        } else {
            compoundPaddingLeft = this.f17419r.c();
        }
        return i10 + compoundPaddingLeft;
    }

    private int J(int i10, boolean z9) {
        int compoundPaddingRight;
        if (z9 || getSuffixText() == null) {
            compoundPaddingRight = (!z9 || getPrefixText() == null) ? this.f17423t.getCompoundPaddingRight() : this.f17419r.c();
        } else {
            compoundPaddingRight = this.f17421s.y();
        }
        return i10 - compoundPaddingRight;
    }

    private static Drawable K(Context context, N4.h hVar, int i10, int[][] iArr) {
        int iC = D4.a.c(context, p225w4.a.f28712o, "TextInputLayout");
        N4.h hVar2 = new N4.h(hVar.B());
        int iJ = D4.a.j(i10, iC, 0.1f);
        hVar2.V(new ColorStateList(iArr, new int[]{iJ, 0}));
        hVar2.setTint(iC);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iJ, iC});
        N4.h hVar3 = new N4.h(hVar.B());
        hVar3.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, hVar2, hVar3), hVar});
    }

    private void L() {
        TextView textView = this.f17378J;
        if (textView == null || !this.f17376I) {
            return;
        }
        textView.setText((CharSequence) null);
        androidx.transition.u.a(this.f17417q, this.f17386N);
        this.f17378J.setVisibility(4);
    }

    private boolean Q() {
        if (b0()) {
            return true;
        }
        return this.f17368E != null && this.f17364C;
    }

    private boolean S() {
        return this.f17408h0 == 1 && this.f17423t.getMinLines() <= 1;
    }

    private void T() {
        p();
        p0();
        y0();
        f0();
        k();
        if (this.f17408h0 != 0) {
            r0();
        }
        Z();
    }

    private void U() {
        if (B()) {
            RectF rectF = this.f17418q0;
            this.f17383L0.o(rectF, this.f17423t.getWidth(), this.f17423t.getGravity());
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            o(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f17410j0);
            ((h) this.f17399V).m0(rectF);
        }
    }

    private void V() {
        if (!B() || this.f17381K0) {
            return;
        }
        y();
        U();
    }

    private static void W(ViewGroup viewGroup, boolean z9) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z9);
            if (childAt instanceof ViewGroup) {
                W((ViewGroup) childAt, z9);
            }
        }
    }

    private void Y() {
        TextView textView = this.f17378J;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void Z() {
        EditText editText = this.f17423t;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i10 = this.f17408h0;
                if (i10 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i10 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    public static /* synthetic */ int b(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    private boolean c0() {
        return (this.f17421s.G() || ((this.f17421s.A() && M()) || this.f17421s.w() != null)) && this.f17421s.getMeasuredWidth() > 0;
    }

    private boolean d0() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f17419r.getMeasuredWidth() > 0;
    }

    private void e0() {
        if (this.f17378J == null || !this.f17376I || TextUtils.isEmpty(this.f17374H)) {
            return;
        }
        this.f17378J.setText(this.f17374H);
        androidx.transition.u.a(this.f17417q, this.f17384M);
        this.f17378J.setVisibility(0);
        this.f17378J.bringToFront();
        announceForAccessibility(this.f17374H);
    }

    private void f0() {
        if (this.f17408h0 == 1) {
            if (K4.c.i(getContext())) {
                this.f17409i0 = getResources().getDimensionPixelSize(p225w4.c.f28734E);
            } else if (K4.c.h(getContext())) {
                this.f17409i0 = getResources().getDimensionPixelSize(p225w4.c.f28733D);
            }
        }
    }

    private void g0(Rect rect) {
        N4.h hVar = this.f17403c0;
        if (hVar != null) {
            int i10 = rect.bottom;
            hVar.setBounds(rect.left, i10 - this.f17411k0, rect.right, i10);
        }
        N4.h hVar2 = this.f17404d0;
        if (hVar2 != null) {
            int i11 = rect.bottom;
            hVar2.setBounds(rect.left, i11 - this.f17412l0, rect.right, i11);
        }
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f17423t;
        if (!(editText instanceof AutoCompleteTextView) || q.a(editText)) {
            return this.f17399V;
        }
        int iD = D4.a.d(this.f17423t, p225w4.a.f28707j);
        int i10 = this.f17408h0;
        if (i10 == 2) {
            return K(getContext(), this.f17399V, iD, f17359T0);
        }
        if (i10 == 1) {
            return H(this.f17399V, this.f17414n0, iD, f17359T0);
        }
        return null;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f17401a0 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f17401a0 = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f17401a0.addState(new int[0], G(false));
        }
        return this.f17401a0;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f17400W == null) {
            this.f17400W = G(true);
        }
        return this.f17400W;
    }

    private void h0() {
        if (this.f17368E != null) {
            EditText editText = this.f17423t;
            i0(editText == null ? null : editText.getText());
        }
    }

    private void j() {
        TextView textView = this.f17378J;
        if (textView != null) {
            this.f17417q.addView(textView);
            this.f17378J.setVisibility(0);
        }
    }

    private static void j0(Context context, TextView textView, int i10, int i11, boolean z9) {
        textView.setContentDescription(context.getString(z9 ? p225w4.i.f28880c : p225w4.i.f28879b, Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    private void k() {
        if (this.f17423t == null || this.f17408h0 != 1) {
            return;
        }
        if (K4.c.i(getContext())) {
            EditText editText = this.f17423t;
            H.v0(editText, H.z(editText), getResources().getDimensionPixelSize(p225w4.c.f28732C), H.y(this.f17423t), getResources().getDimensionPixelSize(p225w4.c.f28731B));
        } else if (K4.c.h(getContext())) {
            EditText editText2 = this.f17423t;
            H.v0(editText2, H.z(editText2), getResources().getDimensionPixelSize(p225w4.c.f28730A), H.y(this.f17423t), getResources().getDimensionPixelSize(p225w4.c.f28790z));
        }
    }

    private void k0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f17368E;
        if (textView != null) {
            a0(textView, this.f17364C ? this.f17370F : this.f17372G);
            if (!this.f17364C && (colorStateList2 = this.f17388O) != null) {
                this.f17368E.setTextColor(colorStateList2);
            }
            if (!this.f17364C || (colorStateList = this.f17390P) == null) {
                return;
            }
            this.f17368E.setTextColor(colorStateList);
        }
    }

    private void l0() {
        ColorStateList colorStateList;
        ColorStateList colorStateListG = this.f17392Q;
        if (colorStateListG == null) {
            colorStateListG = D4.a.g(getContext(), p225w4.a.f28706i);
        }
        EditText editText = this.f17423t;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = p201u0.a.r(this.f17423t.getTextCursorDrawable()).mutate();
        if (Q() && (colorStateList = this.f17394R) != null) {
            colorStateListG = colorStateList;
        }
        p201u0.a.o(drawableMutate, colorStateListG);
    }

    private void m() {
        N4.h hVar = this.f17399V;
        if (hVar == null) {
            return;
        }
        N4.l lVarB = hVar.B();
        N4.l lVar = this.f17405e0;
        if (lVarB != lVar) {
            this.f17399V.setShapeAppearanceModel(lVar);
        }
        if (w()) {
            this.f17399V.Z(this.f17410j0, this.f17413m0);
        }
        int iQ = q();
        this.f17414n0 = iQ;
        this.f17399V.V(ColorStateList.valueOf(iQ));
        n();
        p0();
    }

    private void n() {
        if (this.f17403c0 == null || this.f17404d0 == null) {
            return;
        }
        if (x()) {
            this.f17403c0.V(this.f17423t.isFocused() ? ColorStateList.valueOf(this.f17361A0) : ColorStateList.valueOf(this.f17413m0));
            this.f17404d0.V(ColorStateList.valueOf(this.f17413m0));
        }
        invalidate();
    }

    private void o(RectF rectF) {
        float f10 = rectF.left;
        int i10 = this.f17407g0;
        rectF.left = f10 - i10;
        rectF.right += i10;
    }

    private void o0() {
        H.k0(this.f17423t, getEditTextBoxBackground());
    }

    private void p() {
        int i10 = this.f17408h0;
        if (i10 == 0) {
            this.f17399V = null;
            this.f17403c0 = null;
            this.f17404d0 = null;
            return;
        }
        if (i10 == 1) {
            this.f17399V = new N4.h(this.f17405e0);
            this.f17403c0 = new N4.h();
            this.f17404d0 = new N4.h();
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException(this.f17408h0 + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.f17396S || (this.f17399V instanceof h)) {
                this.f17399V = new N4.h(this.f17405e0);
            } else {
                this.f17399V = h.h0(this.f17405e0);
            }
            this.f17403c0 = null;
            this.f17404d0 = null;
        }
    }

    private int q() {
        return this.f17408h0 == 1 ? D4.a.i(D4.a.e(this, p225w4.a.f28712o, 0), this.f17414n0) : this.f17414n0;
    }

    private boolean q0() {
        int iMax;
        if (this.f17423t == null || this.f17423t.getMeasuredHeight() >= (iMax = Math.max(this.f17421s.getMeasuredHeight(), this.f17419r.getMeasuredHeight()))) {
            return false;
        }
        this.f17423t.setMinimumHeight(iMax);
        return true;
    }

    private Rect r(Rect rect) {
        if (this.f17423t == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f17416p0;
        boolean zG = com.google.android.material.internal.n.g(this);
        rect2.bottom = rect.bottom;
        int i10 = this.f17408h0;
        if (i10 == 1) {
            rect2.left = I(rect.left, zG);
            rect2.top = rect.top + this.f17409i0;
            rect2.right = J(rect.right, zG);
            return rect2;
        }
        if (i10 != 2) {
            rect2.left = I(rect.left, zG);
            rect2.top = getPaddingTop();
            rect2.right = J(rect.right, zG);
            return rect2;
        }
        rect2.left = rect.left + this.f17423t.getPaddingLeft();
        rect2.top = rect.top - v();
        rect2.right = rect.right - this.f17423t.getPaddingRight();
        return rect2;
    }

    private void r0() {
        if (this.f17408h0 != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f17417q.getLayoutParams();
            int iV = v();
            if (iV != layoutParams.topMargin) {
                layoutParams.topMargin = iV;
                this.f17417q.requestLayout();
            }
        }
    }

    private int s(Rect rect, Rect rect2, float f10) {
        return S() ? (int) (rect2.top + f10) : rect.bottom - this.f17423t.getCompoundPaddingBottom();
    }

    private void setEditText(EditText editText) {
        if (this.f17423t != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f17423t = editText;
        int i10 = this.f17427v;
        if (i10 != -1) {
            setMinEms(i10);
        } else {
            setMinWidth(this.f17431x);
        }
        int i11 = this.f17429w;
        if (i11 != -1) {
            setMaxEms(i11);
        } else {
            setMaxWidth(this.f17433y);
        }
        this.f17402b0 = false;
        T();
        setTextInputAccessibilityDelegate(new d(this));
        this.f17383L0.N0(this.f17423t.getTypeface());
        this.f17383L0.v0(this.f17423t.getTextSize());
        this.f17383L0.q0(this.f17423t.getLetterSpacing());
        int gravity = this.f17423t.getGravity();
        this.f17383L0.j0((gravity & (-113)) | 48);
        this.f17383L0.u0(gravity);
        this.f17379J0 = H.w(editText);
        this.f17423t.addTextChangedListener(new a(editText));
        if (this.f17434y0 == null) {
            this.f17434y0 = this.f17423t.getHintTextColors();
        }
        if (this.f17396S) {
            if (TextUtils.isEmpty(this.f17397T)) {
                CharSequence hint = this.f17423t.getHint();
                this.f17425u = hint;
                setHint(hint);
                this.f17423t.setHint((CharSequence) null);
            }
            this.f17398U = true;
        }
        l0();
        if (this.f17368E != null) {
            i0(this.f17423t.getText());
        }
        n0();
        this.f17435z.f();
        this.f17419r.bringToFront();
        this.f17421s.bringToFront();
        C();
        this.f17421s.x0();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        t0(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f17397T)) {
            return;
        }
        this.f17397T = charSequence;
        this.f17383L0.K0(charSequence);
        if (this.f17381K0) {
            return;
        }
        U();
    }

    private void setPlaceholderTextEnabled(boolean z9) {
        if (this.f17376I == z9) {
            return;
        }
        if (z9) {
            j();
        } else {
            Y();
            this.f17378J = null;
        }
        this.f17376I = z9;
    }

    private int t(Rect rect, float f10) {
        return S() ? (int) (rect.centerY() - (f10 / 2.0f)) : rect.top + this.f17423t.getCompoundPaddingTop();
    }

    private void t0(boolean z9, boolean z10) {
        ColorStateList colorStateList;
        TextView textView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f17423t;
        boolean z11 = false;
        boolean z12 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f17423t;
        if (editText2 != null && editText2.hasFocus()) {
            z11 = true;
        }
        ColorStateList colorStateList2 = this.f17434y0;
        if (colorStateList2 != null) {
            this.f17383L0.d0(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f17434y0;
            this.f17383L0.d0(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f17377I0) : this.f17377I0));
        } else if (b0()) {
            this.f17383L0.d0(this.f17435z.r());
        } else if (this.f17364C && (textView = this.f17368E) != null) {
            this.f17383L0.d0(textView.getTextColors());
        } else if (z11 && (colorStateList = this.f17436z0) != null) {
            this.f17383L0.i0(colorStateList);
        }
        if (z12 || !this.f17385M0 || (isEnabled() && z11)) {
            if (z10 || this.f17381K0) {
                z(z9);
                return;
            }
            return;
        }
        if (z10 || !this.f17381K0) {
            F(z9);
        }
    }

    private Rect u(Rect rect) {
        if (this.f17423t == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f17416p0;
        float fC = this.f17383L0.C();
        rect2.left = rect.left + this.f17423t.getCompoundPaddingLeft();
        rect2.top = t(rect, fC);
        rect2.right = rect.right - this.f17423t.getCompoundPaddingRight();
        rect2.bottom = s(rect, rect2, fC);
        return rect2;
    }

    private void u0() {
        EditText editText;
        if (this.f17378J == null || (editText = this.f17423t) == null) {
            return;
        }
        this.f17378J.setGravity(editText.getGravity());
        this.f17378J.setPadding(this.f17423t.getCompoundPaddingLeft(), this.f17423t.getCompoundPaddingTop(), this.f17423t.getCompoundPaddingRight(), this.f17423t.getCompoundPaddingBottom());
    }

    private int v() {
        float fR;
        if (!this.f17396S) {
            return 0;
        }
        int i10 = this.f17408h0;
        if (i10 == 0) {
            fR = this.f17383L0.r();
        } else {
            if (i10 != 2) {
                return 0;
            }
            fR = this.f17383L0.r() / 2.0f;
        }
        return (int) fR;
    }

    private void v0() {
        EditText editText = this.f17423t;
        w0(editText == null ? null : editText.getText());
    }

    private boolean w() {
        return this.f17408h0 == 2 && x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w0(Editable editable) {
        if (this.f17366D.a(editable) != 0 || this.f17381K0) {
            L();
        } else {
            e0();
        }
    }

    private boolean x() {
        return this.f17410j0 > -1 && this.f17413m0 != 0;
    }

    private void x0(boolean z9, boolean z10) {
        int defaultColor = this.f17367D0.getDefaultColor();
        int colorForState = this.f17367D0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f17367D0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z9) {
            this.f17413m0 = colorForState2;
        } else if (z10) {
            this.f17413m0 = colorForState;
        } else {
            this.f17413m0 = defaultColor;
        }
    }

    private void y() {
        if (B()) {
            ((h) this.f17399V).k0();
        }
    }

    private void z(boolean z9) {
        ValueAnimator valueAnimator = this.f17389O0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f17389O0.cancel();
        }
        if (z9 && this.f17387N0) {
            l(1.0f);
        } else {
            this.f17383L0.y0(1.0f);
        }
        this.f17381K0 = false;
        if (B()) {
            U();
        }
        v0();
        this.f17419r.l(false);
        this.f17421s.H(false);
    }

    public boolean M() {
        return this.f17421s.F();
    }

    public boolean N() {
        return this.f17435z.A();
    }

    public boolean O() {
        return this.f17435z.B();
    }

    final boolean P() {
        return this.f17381K0;
    }

    public boolean R() {
        return this.f17398U;
    }

    public void X() {
        this.f17419r.m();
    }

    void a0(TextView textView, int i10) {
        try {
            androidx.core.widget.l.o(textView, i10);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        androidx.core.widget.l.o(textView, p225w4.j.f28905b);
        textView.setTextColor(p171r0.a.b(getContext(), p225w4.b.f28724a));
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i10, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f17417q.addView(view, layoutParams2);
        this.f17417q.setLayoutParams(layoutParams);
        r0();
        setEditText((EditText) view);
    }

    boolean b0() {
        return this.f17435z.l();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i10) {
        EditText editText = this.f17423t;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f17425u != null) {
            boolean z9 = this.f17398U;
            this.f17398U = false;
            CharSequence hint = editText.getHint();
            this.f17423t.setHint(this.f17425u);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
                return;
            } finally {
                this.f17423t.setHint(hint);
                this.f17398U = z9;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i10);
        onProvideAutofillVirtualStructure(viewStructure, i10);
        viewStructure.setChildCount(this.f17417q.getChildCount());
        for (int i11 = 0; i11 < this.f17417q.getChildCount(); i11++) {
            View childAt = this.f17417q.getChildAt(i11);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i11);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i10);
            if (childAt == this.f17423t) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f17393Q0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f17393Q0 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        E(canvas);
        D(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f17391P0) {
            return;
        }
        this.f17391P0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.a aVar = this.f17383L0;
        boolean zI0 = aVar != null ? aVar.I0(drawableState) : false;
        if (this.f17423t != null) {
            s0(H.M(this) && isEnabled());
        }
        n0();
        y0();
        if (zI0) {
            invalidate();
        }
        this.f17391P0 = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f17423t;
        return editText != null ? editText.getBaseline() + getPaddingTop() + v() : super.getBaseline();
    }

    N4.h getBoxBackground() {
        int i10 = this.f17408h0;
        if (i10 == 1 || i10 == 2) {
            return this.f17399V;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f17414n0;
    }

    public int getBoxBackgroundMode() {
        return this.f17408h0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f17409i0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return com.google.android.material.internal.n.g(this) ? this.f17405e0.j().a(this.f17418q0) : this.f17405e0.l().a(this.f17418q0);
    }

    public float getBoxCornerRadiusBottomStart() {
        return com.google.android.material.internal.n.g(this) ? this.f17405e0.l().a(this.f17418q0) : this.f17405e0.j().a(this.f17418q0);
    }

    public float getBoxCornerRadiusTopEnd() {
        return com.google.android.material.internal.n.g(this) ? this.f17405e0.r().a(this.f17418q0) : this.f17405e0.t().a(this.f17418q0);
    }

    public float getBoxCornerRadiusTopStart() {
        return com.google.android.material.internal.n.g(this) ? this.f17405e0.t().a(this.f17418q0) : this.f17405e0.r().a(this.f17418q0);
    }

    public int getBoxStrokeColor() {
        return this.f17365C0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f17367D0;
    }

    public int getBoxStrokeWidth() {
        return this.f17411k0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f17412l0;
    }

    public int getCounterMaxLength() {
        return this.f17362B;
    }

    CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f17360A && this.f17364C && (textView = this.f17368E) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f17390P;
    }

    public ColorStateList getCounterTextColor() {
        return this.f17388O;
    }

    public ColorStateList getCursorColor() {
        return this.f17392Q;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f17394R;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f17434y0;
    }

    public EditText getEditText() {
        return this.f17423t;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f17421s.l();
    }

    public Drawable getEndIconDrawable() {
        return this.f17421s.n();
    }

    public int getEndIconMinSize() {
        return this.f17421s.o();
    }

    public int getEndIconMode() {
        return this.f17421s.p();
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f17421s.q();
    }

    CheckableImageButton getEndIconView() {
        return this.f17421s.r();
    }

    public CharSequence getError() {
        if (this.f17435z.A()) {
            return this.f17435z.p();
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f17435z.n();
    }

    public CharSequence getErrorContentDescription() {
        return this.f17435z.o();
    }

    public int getErrorCurrentTextColors() {
        return this.f17435z.q();
    }

    public Drawable getErrorIconDrawable() {
        return this.f17421s.s();
    }

    public CharSequence getHelperText() {
        if (this.f17435z.B()) {
            return this.f17435z.s();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f17435z.u();
    }

    public CharSequence getHint() {
        if (this.f17396S) {
            return this.f17397T;
        }
        return null;
    }

    final float getHintCollapsedTextHeight() {
        return this.f17383L0.r();
    }

    final int getHintCurrentCollapsedTextColor() {
        return this.f17383L0.w();
    }

    public ColorStateList getHintTextColor() {
        return this.f17436z0;
    }

    public e getLengthCounter() {
        return this.f17366D;
    }

    public int getMaxEms() {
        return this.f17429w;
    }

    public int getMaxWidth() {
        return this.f17433y;
    }

    public int getMinEms() {
        return this.f17427v;
    }

    public int getMinWidth() {
        return this.f17431x;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f17421s.u();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f17421s.v();
    }

    public CharSequence getPlaceholderText() {
        if (this.f17376I) {
            return this.f17374H;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f17382L;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f17380K;
    }

    public CharSequence getPrefixText() {
        return this.f17419r.a();
    }

    public ColorStateList getPrefixTextColor() {
        return this.f17419r.b();
    }

    public TextView getPrefixTextView() {
        return this.f17419r.d();
    }

    public N4.l getShapeAppearanceModel() {
        return this.f17405e0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f17419r.e();
    }

    public Drawable getStartIconDrawable() {
        return this.f17419r.f();
    }

    public int getStartIconMinSize() {
        return this.f17419r.g();
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f17419r.h();
    }

    public CharSequence getSuffixText() {
        return this.f17421s.w();
    }

    public ColorStateList getSuffixTextColor() {
        return this.f17421s.x();
    }

    public TextView getSuffixTextView() {
        return this.f17421s.z();
    }

    public Typeface getTypeface() {
        return this.f17420r0;
    }

    public void i(f fVar) {
        this.f17426u0.add(fVar);
        if (this.f17423t != null) {
            fVar.a(this);
        }
    }

    void i0(Editable editable) {
        int iA = this.f17366D.a(editable);
        boolean z9 = this.f17364C;
        int i10 = this.f17362B;
        if (i10 == -1) {
            this.f17368E.setText(String.valueOf(iA));
            this.f17368E.setContentDescription(null);
            this.f17364C = false;
        } else {
            this.f17364C = iA > i10;
            j0(getContext(), this.f17368E, iA, this.f17362B, this.f17364C);
            if (z9 != this.f17364C) {
                k0();
            }
            this.f17368E.setText(p251z0.a.c().j(getContext().getString(p225w4.i.f28881d, Integer.valueOf(iA), Integer.valueOf(this.f17362B))));
        }
        if (this.f17423t == null || z9 == this.f17364C) {
            return;
        }
        s0(false);
        y0();
        n0();
    }

    void l(float f10) {
        if (this.f17383L0.F() == f10) {
            return;
        }
        if (this.f17389O0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f17389O0 = valueAnimator;
            valueAnimator.setInterpolator(I4.f.g(getContext(), p225w4.a.f28676K, p235x4.a.f29940b));
            this.f17389O0.setDuration(I4.f.f(getContext(), p225w4.a.f28671F, 167));
            this.f17389O0.addUpdateListener(new c());
        }
        this.f17389O0.setFloatValues(this.f17383L0.F(), f10);
        this.f17389O0.start();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0062  */
    boolean m0() {
        boolean z9;
        if (this.f17423t == null) {
            return false;
        }
        boolean z10 = true;
        if (d0()) {
            int measuredWidth = this.f17419r.getMeasuredWidth() - this.f17423t.getPaddingLeft();
            if (this.f17422s0 == null || this.f17424t0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f17422s0 = colorDrawable;
                this.f17424t0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] drawableArrA = androidx.core.widget.l.a(this.f17423t);
            Drawable drawable = drawableArrA[0];
            Drawable drawable2 = this.f17422s0;
            if (drawable != drawable2) {
                androidx.core.widget.l.i(this.f17423t, drawable2, drawableArrA[1], drawableArrA[2], drawableArrA[3]);
                z9 = true;
            } else {
                z9 = false;
            }
        } else if (this.f17422s0 != null) {
            Drawable[] drawableArrA2 = androidx.core.widget.l.a(this.f17423t);
            androidx.core.widget.l.i(this.f17423t, null, drawableArrA2[1], drawableArrA2[2], drawableArrA2[3]);
            this.f17422s0 = null;
            z9 = true;
        } else {
            z9 = false;
        }
        if (c0()) {
            int measuredWidth2 = this.f17421s.z().getMeasuredWidth() - this.f17423t.getPaddingRight();
            CheckableImageButton checkableImageButtonK = this.f17421s.k();
            if (checkableImageButtonK != null) {
                measuredWidth2 = measuredWidth2 + checkableImageButtonK.getMeasuredWidth() + AbstractC1080l.b((ViewGroup.MarginLayoutParams) checkableImageButtonK.getLayoutParams());
            }
            Drawable[] drawableArrA3 = androidx.core.widget.l.a(this.f17423t);
            Drawable drawable3 = this.f17428v0;
            if (drawable3 != null && this.f17430w0 != measuredWidth2) {
                this.f17430w0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                androidx.core.widget.l.i(this.f17423t, drawableArrA3[0], drawableArrA3[1], this.f17428v0, drawableArrA3[3]);
                return true;
            }
            if (drawable3 == null) {
                ColorDrawable colorDrawable2 = new ColorDrawable();
                this.f17428v0 = colorDrawable2;
                this.f17430w0 = measuredWidth2;
                colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable4 = drawableArrA3[2];
            Drawable drawable5 = this.f17428v0;
            if (drawable4 != drawable5) {
                this.f17432x0 = drawable4;
                androidx.core.widget.l.i(this.f17423t, drawableArrA3[0], drawableArrA3[1], drawable5, drawableArrA3[3]);
                return true;
            }
        } else if (this.f17428v0 != null) {
            Drawable[] drawableArrA4 = androidx.core.widget.l.a(this.f17423t);
            if (drawableArrA4[2] == this.f17428v0) {
                androidx.core.widget.l.i(this.f17423t, drawableArrA4[0], drawableArrA4[1], this.f17432x0, drawableArrA4[3]);
            } else {
                z10 = z9;
            }
            this.f17428v0 = null;
            return z10;
        }
        return z9;
    }

    void n0() {
        Drawable background;
        TextView textView;
        EditText editText = this.f17423t;
        if (editText == null || this.f17408h0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (androidx.appcompat.widget.v.a(background)) {
            background = background.mutate();
        }
        if (b0()) {
            background.setColorFilter(C1011h.e(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f17364C && (textView = this.f17368E) != null) {
            background.setColorFilter(C1011h.e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            p201u0.a.c(background);
            this.f17423t.refreshDrawableState();
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f17383L0.Y(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f17421s.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f17395R0 = false;
        boolean zQ0 = q0();
        boolean zM0 = m0();
        if (zQ0 || zM0) {
            this.f17423t.post(new Runnable() { // from class: com.google.android.material.textfield.A
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17355q.f17423t.requestLayout();
                }
            });
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        EditText editText = this.f17423t;
        if (editText != null) {
            Rect rect = this.f17415o0;
            com.google.android.material.internal.b.a(this, editText, rect);
            g0(rect);
            if (this.f17396S) {
                this.f17383L0.v0(this.f17423t.getTextSize());
                int gravity = this.f17423t.getGravity();
                this.f17383L0.j0((gravity & (-113)) | 48);
                this.f17383L0.u0(gravity);
                this.f17383L0.f0(r(rect));
                this.f17383L0.p0(u(rect));
                this.f17383L0.a0();
                if (!B() || this.f17381K0) {
                    return;
                }
                U();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.f17395R0) {
            this.f17421s.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f17395R0 = true;
        }
        u0();
        this.f17421s.x0();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.getSuperState());
        setError(gVar.f17443q);
        if (gVar.f17444r) {
            post(new b());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        boolean z9 = i10 == 1;
        if (z9 != this.f17406f0) {
            float fA = this.f17405e0.r().a(this.f17418q0);
            float fA2 = this.f17405e0.t().a(this.f17418q0);
            N4.l lVarM = N4.l.a().z(this.f17405e0.s()).D(this.f17405e0.q()).r(this.f17405e0.k()).v(this.f17405e0.i()).A(fA2).E(fA).s(this.f17405e0.l().a(this.f17418q0)).w(this.f17405e0.j().a(this.f17418q0)).m();
            this.f17406f0 = z9;
            setShapeAppearanceModel(lVarM);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        if (b0()) {
            gVar.f17443q = getError();
        }
        gVar.f17444r = this.f17421s.E();
        return gVar;
    }

    void p0() {
        EditText editText = this.f17423t;
        if (editText == null || this.f17399V == null) {
            return;
        }
        if ((this.f17402b0 || editText.getBackground() == null) && this.f17408h0 != 0) {
            o0();
            this.f17402b0 = true;
        }
    }

    void s0(boolean z9) {
        t0(z9, false);
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.f17414n0 != i10) {
            this.f17414n0 = i10;
            this.f17369E0 = i10;
            this.f17373G0 = i10;
            this.f17375H0 = i10;
            m();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        setBoxBackgroundColor(p171r0.a.b(getContext(), i10));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f17369E0 = defaultColor;
        this.f17414n0 = defaultColor;
        this.f17371F0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f17373G0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f17375H0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        m();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 == this.f17408h0) {
            return;
        }
        this.f17408h0 = i10;
        if (this.f17423t != null) {
            T();
        }
    }

    public void setBoxCollapsedPaddingTop(int i10) {
        this.f17409i0 = i10;
    }

    public void setBoxCornerFamily(int i10) {
        this.f17405e0 = this.f17405e0.v().y(i10, this.f17405e0.r()).C(i10, this.f17405e0.t()).q(i10, this.f17405e0.j()).u(i10, this.f17405e0.l()).m();
        m();
    }

    public void setBoxStrokeColor(int i10) {
        if (this.f17365C0 != i10) {
            this.f17365C0 = i10;
            y0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f17361A0 = colorStateList.getDefaultColor();
            this.f17377I0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f17363B0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f17365C0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f17365C0 != colorStateList.getDefaultColor()) {
            this.f17365C0 = colorStateList.getDefaultColor();
        }
        y0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f17367D0 != colorStateList) {
            this.f17367D0 = colorStateList;
            y0();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.f17411k0 = i10;
        y0();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.f17412l0 = i10;
        y0();
    }

    public void setBoxStrokeWidthFocusedResource(int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z9) {
        if (this.f17360A != z9) {
            if (z9) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f17368E = appCompatTextView;
                appCompatTextView.setId(p225w4.e.f28813M);
                Typeface typeface = this.f17420r0;
                if (typeface != null) {
                    this.f17368E.setTypeface(typeface);
                }
                this.f17368E.setMaxLines(1);
                this.f17435z.e(this.f17368E, 2);
                AbstractC1080l.d((ViewGroup.MarginLayoutParams) this.f17368E.getLayoutParams(), getResources().getDimensionPixelOffset(p225w4.c.f28771h0));
                k0();
                h0();
            } else {
                this.f17435z.C(this.f17368E, 2);
                this.f17368E = null;
            }
            this.f17360A = z9;
        }
    }

    public void setCounterMaxLength(int i10) {
        if (this.f17362B != i10) {
            if (i10 > 0) {
                this.f17362B = i10;
            } else {
                this.f17362B = -1;
            }
            if (this.f17360A) {
                h0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.f17370F != i10) {
            this.f17370F = i10;
            k0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f17390P != colorStateList) {
            this.f17390P = colorStateList;
            k0();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.f17372G != i10) {
            this.f17372G = i10;
            k0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f17388O != colorStateList) {
            this.f17388O = colorStateList;
            k0();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f17392Q != colorStateList) {
            this.f17392Q = colorStateList;
            l0();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f17394R != colorStateList) {
            this.f17394R = colorStateList;
            if (Q()) {
                l0();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f17434y0 = colorStateList;
        this.f17436z0 = colorStateList;
        if (this.f17423t != null) {
            s0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z9) {
        W(this, z9);
        super.setEnabled(z9);
    }

    public void setEndIconActivated(boolean z9) {
        this.f17421s.N(z9);
    }

    public void setEndIconCheckable(boolean z9) {
        this.f17421s.O(z9);
    }

    public void setEndIconContentDescription(int i10) {
        this.f17421s.P(i10);
    }

    public void setEndIconDrawable(int i10) {
        this.f17421s.R(i10);
    }

    public void setEndIconMinSize(int i10) {
        this.f17421s.T(i10);
    }

    public void setEndIconMode(int i10) {
        this.f17421s.U(i10);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        this.f17421s.V(onClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f17421s.W(onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        this.f17421s.X(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        this.f17421s.Y(colorStateList);
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        this.f17421s.Z(mode);
    }

    public void setEndIconVisible(boolean z9) {
        this.f17421s.a0(z9);
    }

    public void setError(CharSequence charSequence) {
        if (!this.f17435z.A()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f17435z.w();
        } else {
            this.f17435z.Q(charSequence);
        }
    }

    public void setErrorAccessibilityLiveRegion(int i10) {
        this.f17435z.E(i10);
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f17435z.F(charSequence);
    }

    public void setErrorEnabled(boolean z9) {
        this.f17435z.G(z9);
    }

    public void setErrorIconDrawable(int i10) {
        this.f17421s.b0(i10);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        this.f17421s.d0(onClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f17421s.e0(onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f17421s.f0(colorStateList);
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        this.f17421s.g0(mode);
    }

    public void setErrorTextAppearance(int i10) {
        this.f17435z.H(i10);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f17435z.I(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z9) {
        if (this.f17385M0 != z9) {
            this.f17385M0 = z9;
            s0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (O()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!O()) {
                setHelperTextEnabled(true);
            }
            this.f17435z.R(charSequence);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f17435z.L(colorStateList);
    }

    public void setHelperTextEnabled(boolean z9) {
        this.f17435z.K(z9);
    }

    public void setHelperTextTextAppearance(int i10) {
        this.f17435z.J(i10);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f17396S) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(RecyclerView.ItemAnimator.FLAG_MOVED);
        }
    }

    public void setHintAnimationEnabled(boolean z9) {
        this.f17387N0 = z9;
    }

    public void setHintEnabled(boolean z9) {
        if (z9 != this.f17396S) {
            this.f17396S = z9;
            if (z9) {
                CharSequence hint = this.f17423t.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f17397T)) {
                        setHint(hint);
                    }
                    this.f17423t.setHint((CharSequence) null);
                }
                this.f17398U = true;
            } else {
                this.f17398U = false;
                if (!TextUtils.isEmpty(this.f17397T) && TextUtils.isEmpty(this.f17423t.getHint())) {
                    this.f17423t.setHint(this.f17397T);
                }
                setHintInternal(null);
            }
            if (this.f17423t != null) {
                r0();
            }
        }
    }

    public void setHintTextAppearance(int i10) {
        this.f17383L0.g0(i10);
        this.f17436z0 = this.f17383L0.p();
        if (this.f17423t != null) {
            s0(false);
            r0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f17436z0 != colorStateList) {
            if (this.f17434y0 == null) {
                this.f17383L0.i0(colorStateList);
            }
            this.f17436z0 = colorStateList;
            if (this.f17423t != null) {
                s0(false);
            }
        }
    }

    public void setLengthCounter(e eVar) {
        this.f17366D = eVar;
    }

    public void setMaxEms(int i10) {
        this.f17429w = i10;
        EditText editText = this.f17423t;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxEms(i10);
    }

    public void setMaxWidth(int i10) {
        this.f17433y = i10;
        EditText editText = this.f17423t;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxWidth(i10);
    }

    public void setMaxWidthResource(int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinEms(int i10) {
        this.f17427v = i10;
        EditText editText = this.f17423t;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinEms(i10);
    }

    public void setMinWidth(int i10) {
        this.f17431x = i10;
        EditText editText = this.f17423t;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinWidth(i10);
    }

    public void setMinWidthResource(int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i10) {
        this.f17421s.i0(i10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        this.f17421s.k0(i10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z9) {
        this.f17421s.m0(z9);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f17421s.n0(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f17421s.o0(mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f17378J == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.f17378J = appCompatTextView;
            appCompatTextView.setId(p225w4.e.f28816P);
            H.q0(this.f17378J, 2);
            C1168c c1168cA = A();
            this.f17384M = c1168cA;
            c1168cA.s0(67L);
            this.f17386N = A();
            setPlaceholderTextAppearance(this.f17382L);
            setPlaceholderTextColor(this.f17380K);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f17376I) {
                setPlaceholderTextEnabled(true);
            }
            this.f17374H = charSequence;
        }
        v0();
    }

    public void setPlaceholderTextAppearance(int i10) {
        this.f17382L = i10;
        TextView textView = this.f17378J;
        if (textView != null) {
            androidx.core.widget.l.o(textView, i10);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f17380K != colorStateList) {
            this.f17380K = colorStateList;
            TextView textView = this.f17378J;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f17419r.n(charSequence);
    }

    public void setPrefixTextAppearance(int i10) {
        this.f17419r.o(i10);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f17419r.p(colorStateList);
    }

    public void setShapeAppearanceModel(N4.l lVar) {
        N4.h hVar = this.f17399V;
        if (hVar == null || hVar.B() == lVar) {
            return;
        }
        this.f17405e0 = lVar;
        m();
    }

    public void setStartIconCheckable(boolean z9) {
        this.f17419r.q(z9);
    }

    public void setStartIconContentDescription(int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconDrawable(int i10) {
        setStartIconDrawable(i10 != 0 ? p060g.a.b(getContext(), i10) : null);
    }

    public void setStartIconMinSize(int i10) {
        this.f17419r.t(i10);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.f17419r.u(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f17419r.v(onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        this.f17419r.w(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.f17419r.x(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.f17419r.y(mode);
    }

    public void setStartIconVisible(boolean z9) {
        this.f17419r.z(z9);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f17421s.p0(charSequence);
    }

    public void setSuffixTextAppearance(int i10) {
        this.f17421s.q0(i10);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f17421s.r0(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(d dVar) {
        EditText editText = this.f17423t;
        if (editText != null) {
            H.g0(editText, dVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f17420r0) {
            this.f17420r0 = typeface;
            this.f17383L0.N0(typeface);
            this.f17435z.N(typeface);
            TextView textView = this.f17368E;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    void y0() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.f17399V == null || this.f17408h0 == 0) {
            return;
        }
        boolean z9 = false;
        boolean z10 = isFocused() || ((editText2 = this.f17423t) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f17423t) != null && editText.isHovered())) {
            z9 = true;
        }
        if (!isEnabled()) {
            this.f17413m0 = this.f17377I0;
        } else if (b0()) {
            if (this.f17367D0 != null) {
                x0(z10, z9);
            } else {
                this.f17413m0 = getErrorCurrentTextColors();
            }
        } else if (!this.f17364C || (textView = this.f17368E) == null) {
            if (z10) {
                this.f17413m0 = this.f17365C0;
            } else if (z9) {
                this.f17413m0 = this.f17363B0;
            } else {
                this.f17413m0 = this.f17361A0;
            }
        } else if (this.f17367D0 != null) {
            x0(z10, z9);
        } else {
            this.f17413m0 = textView.getCurrentTextColor();
        }
        l0();
        this.f17421s.I();
        X();
        if (this.f17408h0 == 2) {
            int i10 = this.f17410j0;
            if (z10 && isEnabled()) {
                this.f17410j0 = this.f17412l0;
            } else {
                this.f17410j0 = this.f17411k0;
            }
            if (this.f17410j0 != i10) {
                V();
            }
        }
        if (this.f17408h0 == 1) {
            if (!isEnabled()) {
                this.f17414n0 = this.f17371F0;
            } else if (z9 && !z10) {
                this.f17414n0 = this.f17375H0;
            } else if (z10) {
                this.f17414n0 = this.f17373G0;
            } else {
                this.f17414n0 = this.f17369E0;
            }
        }
        m();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputLayout(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f17358S0;
        super(Q4.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f17427v = -1;
        this.f17429w = -1;
        this.f17431x = -1;
        this.f17433y = -1;
        this.f17435z = new u(this);
        this.f17366D = new e() { // from class: com.google.android.material.textfield.B
            @Override // com.google.android.material.textfield.TextInputLayout.e
            public final int a(Editable editable) {
                return TextInputLayout.b(editable);
            }
        };
        this.f17415o0 = new Rect();
        this.f17416p0 = new Rect();
        this.f17418q0 = new RectF();
        this.f17426u0 = new LinkedHashSet();
        com.google.android.material.internal.a aVar = new com.google.android.material.internal.a(this);
        this.f17383L0 = aVar;
        this.f17395R0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f17417q = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        TimeInterpolator timeInterpolator = p235x4.a.f29939a;
        aVar.L0(timeInterpolator);
        aVar.G0(timeInterpolator);
        aVar.j0(8388659);
        int[] iArr = p225w4.k.f29179a7;
        int i12 = p225w4.k.f29409x7;
        int i13 = p225w4.k.f29389v7;
        int i14 = p225w4.k.f29080P7;
        int i15 = p225w4.k.f29125U7;
        int i16 = p225w4.k.f29161Y7;
        J j9 = com.google.android.material.internal.k.j(context2, attributeSet, iArr, i10, i11, i12, i13, i14, i15, i16);
        z zVar = new z(this, j9);
        this.f17419r = zVar;
        this.f17396S = j9.a(p225w4.k.f29152X7, true);
        setHint(j9.p(p225w4.k.f29229f7));
        this.f17387N0 = j9.a(p225w4.k.f29143W7, true);
        this.f17385M0 = j9.a(p225w4.k.f29098R7, true);
        int i17 = p225w4.k.f29249h7;
        if (j9.s(i17)) {
            setMinEms(j9.k(i17, -1));
        } else {
            int i18 = p225w4.k.f29219e7;
            if (j9.s(i18)) {
                setMinWidth(j9.f(i18, -1));
            }
        }
        int i19 = p225w4.k.f29239g7;
        if (j9.s(i19)) {
            setMaxEms(j9.k(i19, -1));
        } else {
            int i20 = p225w4.k.f29209d7;
            if (j9.s(i20)) {
                setMaxWidth(j9.f(i20, -1));
            }
        }
        this.f17405e0 = N4.l.e(context2, attributeSet, i10, i11).m();
        this.f17407g0 = context2.getResources().getDimensionPixelOffset(p225w4.c.f28765e0);
        this.f17409i0 = j9.e(p225w4.k.f29279k7, 0);
        this.f17411k0 = j9.f(p225w4.k.f29349r7, context2.getResources().getDimensionPixelSize(p225w4.c.f28767f0));
        this.f17412l0 = j9.f(p225w4.k.f29359s7, context2.getResources().getDimensionPixelSize(p225w4.c.f28769g0));
        this.f17410j0 = this.f17411k0;
        float fD = j9.d(p225w4.k.f29319o7, -1.0f);
        float fD2 = j9.d(p225w4.k.f29309n7, -1.0f);
        float fD3 = j9.d(p225w4.k.f29289l7, -1.0f);
        float fD4 = j9.d(p225w4.k.f29299m7, -1.0f);
        N4.l.b bVarV = this.f17405e0.v();
        if (fD >= 0.0f) {
            bVarV.A(fD);
        }
        if (fD2 >= 0.0f) {
            bVarV.E(fD2);
        }
        if (fD3 >= 0.0f) {
            bVarV.w(fD3);
        }
        if (fD4 >= 0.0f) {
            bVarV.s(fD4);
        }
        this.f17405e0 = bVarV.m();
        ColorStateList colorStateListB = K4.c.b(context2, j9, p225w4.k.f29259i7);
        if (colorStateListB != null) {
            int defaultColor = colorStateListB.getDefaultColor();
            this.f17369E0 = defaultColor;
            this.f17414n0 = defaultColor;
            if (colorStateListB.isStateful()) {
                this.f17371F0 = colorStateListB.getColorForState(new int[]{-16842910}, -1);
                this.f17373G0 = colorStateListB.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f17375H0 = colorStateListB.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f17373G0 = this.f17369E0;
                ColorStateList colorStateListA = p060g.a.a(context2, p225w4.b.f28726c);
                this.f17371F0 = colorStateListA.getColorForState(new int[]{-16842910}, -1);
                this.f17375H0 = colorStateListA.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f17414n0 = 0;
            this.f17369E0 = 0;
            this.f17371F0 = 0;
            this.f17373G0 = 0;
            this.f17375H0 = 0;
        }
        int i21 = p225w4.k.f29199c7;
        if (j9.s(i21)) {
            ColorStateList colorStateListC = j9.c(i21);
            this.f17436z0 = colorStateListC;
            this.f17434y0 = colorStateListC;
        }
        int i22 = p225w4.k.f29329p7;
        ColorStateList colorStateListB2 = K4.c.b(context2, j9, i22);
        this.f17365C0 = j9.b(i22, 0);
        this.f17361A0 = p171r0.a.b(context2, p225w4.b.f28727d);
        this.f17377I0 = p171r0.a.b(context2, p225w4.b.f28728e);
        this.f17363B0 = p171r0.a.b(context2, p225w4.b.f28729f);
        if (colorStateListB2 != null) {
            setBoxStrokeColorStateList(colorStateListB2);
        }
        int i23 = p225w4.k.f29339q7;
        if (j9.s(i23)) {
            setBoxStrokeErrorColor(K4.c.b(context2, j9, i23));
        }
        if (j9.n(i16, -1) != -1) {
            setHintTextAppearance(j9.n(i16, 0));
        }
        this.f17392Q = j9.c(p225w4.k.f29429z7);
        this.f17394R = j9.c(p225w4.k.f28937A7);
        int iN = j9.n(i14, 0);
        CharSequence charSequenceP = j9.p(p225w4.k.f29035K7);
        int iK = j9.k(p225w4.k.f29026J7, 1);
        boolean zA = j9.a(p225w4.k.f29044L7, false);
        int iN2 = j9.n(i15, 0);
        boolean zA2 = j9.a(p225w4.k.f29116T7, false);
        CharSequence charSequenceP2 = j9.p(p225w4.k.f29107S7);
        int iN3 = j9.n(p225w4.k.f29240g8, 0);
        CharSequence charSequenceP3 = j9.p(p225w4.k.f29230f8);
        boolean zA3 = j9.a(p225w4.k.f29369t7, false);
        setCounterMaxLength(j9.k(p225w4.k.f29379u7, -1));
        this.f17372G = j9.n(i12, 0);
        this.f17370F = j9.n(i13, 0);
        setBoxBackgroundMode(j9.k(p225w4.k.f29269j7, 0));
        setErrorContentDescription(charSequenceP);
        setErrorAccessibilityLiveRegion(iK);
        setCounterOverflowTextAppearance(this.f17370F);
        setHelperTextTextAppearance(iN2);
        setErrorTextAppearance(iN);
        setCounterTextAppearance(this.f17372G);
        setPlaceholderText(charSequenceP3);
        setPlaceholderTextAppearance(iN3);
        int i24 = p225w4.k.f29089Q7;
        if (j9.s(i24)) {
            setErrorTextColor(j9.c(i24));
        }
        int i25 = p225w4.k.f29134V7;
        if (j9.s(i25)) {
            setHelperTextColor(j9.c(i25));
        }
        int i26 = p225w4.k.f29170Z7;
        if (j9.s(i26)) {
            setHintTextColor(j9.c(i26));
        }
        int i27 = p225w4.k.f29419y7;
        if (j9.s(i27)) {
            setCounterTextColor(j9.c(i27));
        }
        int i28 = p225w4.k.f29399w7;
        if (j9.s(i28)) {
            setCounterOverflowTextColor(j9.c(i28));
        }
        int i29 = p225w4.k.f29250h8;
        if (j9.s(i29)) {
            setPlaceholderTextColor(j9.c(i29));
        }
        r rVar = new r(this, j9);
        this.f17421s = rVar;
        boolean zA4 = j9.a(p225w4.k.f29189b7, true);
        j9.x();
        H.q0(this, 2);
        H.s0(this, 1);
        frameLayout.addView(zVar);
        frameLayout.addView(rVar);
        addView(frameLayout);
        setEnabled(zA4);
        setHelperTextEnabled(zA2);
        setErrorEnabled(zA);
        setCounterEnabled(zA3);
        setHelperText(charSequenceP2);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.f17421s.Q(charSequence);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f17421s.S(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f17421s.c0(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f17421s.j0(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f17421s.l0(drawable);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.f17419r.r(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f17419r.s(drawable);
    }

    public void setHint(int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }
}
