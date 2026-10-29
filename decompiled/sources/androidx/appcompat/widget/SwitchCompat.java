package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final Property f10919l0 = new a(Float.class, "thumbPos");

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final int[] f10920m0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f10921A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f10922B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f10923C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f10924D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private CharSequence f10925E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private CharSequence f10926F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private CharSequence f10927G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private CharSequence f10928H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f10929I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f10930J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f10931K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private float f10932L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private float f10933M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private VelocityTracker f10934N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f10935O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    float f10936P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private int f10937Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private int f10938R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f10939S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int f10940T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private int f10941U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private int f10942V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private int f10943W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f10944a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final TextPaint f10945b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private ColorStateList f10946c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private Layout f10947d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private Layout f10948e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private TransformationMethod f10949f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    ObjectAnimator f10950g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private final r f10951h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private C1013j f10952i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private b f10953j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private final Rect f10954k0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Drawable f10955q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ColorStateList f10956r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private PorterDuff.Mode f10957s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f10958t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f10959u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Drawable f10960v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private ColorStateList f10961w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private PorterDuff.Mode f10962x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f10963y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f10964z;

    class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f10936P);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(SwitchCompat switchCompat, Float f10) {
            switchCompat.setThumbPosition(f10.floatValue());
        }
    }

    static class b extends androidx.emoji2.text.e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Reference f10965a;

        b(SwitchCompat switchCompat) {
            this.f10965a = new WeakReference(switchCompat);
        }

        @Override // androidx.emoji2.text.e.f
        public void a(Throwable th) {
            SwitchCompat switchCompat = (SwitchCompat) this.f10965a.get();
            if (switchCompat != null) {
                switchCompat.j();
            }
        }

        @Override // androidx.emoji2.text.e.f
        public void b() {
            SwitchCompat switchCompat = (SwitchCompat) this.f10965a.get();
            if (switchCompat != null) {
                switchCompat.j();
            }
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p050f.a.f20331K);
    }

    private void a(boolean z9) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<SwitchCompat, Float>) f10919l0, z9 ? 1.0f : 0.0f);
        this.f10950g0 = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.f10950g0.setAutoCancel(true);
        this.f10950g0.start();
    }

    private void b() {
        Drawable drawable = this.f10955q;
        if (drawable != null) {
            if (this.f10958t || this.f10959u) {
                Drawable drawableMutate = p201u0.a.r(drawable).mutate();
                this.f10955q = drawableMutate;
                if (this.f10958t) {
                    p201u0.a.o(drawableMutate, this.f10956r);
                }
                if (this.f10959u) {
                    p201u0.a.p(this.f10955q, this.f10957s);
                }
                if (this.f10955q.isStateful()) {
                    this.f10955q.setState(getDrawableState());
                }
            }
        }
    }

    private void c() {
        Drawable drawable = this.f10960v;
        if (drawable != null) {
            if (this.f10963y || this.f10964z) {
                Drawable drawableMutate = p201u0.a.r(drawable).mutate();
                this.f10960v = drawableMutate;
                if (this.f10963y) {
                    p201u0.a.o(drawableMutate, this.f10961w);
                }
                if (this.f10964z) {
                    p201u0.a.p(this.f10960v, this.f10962x);
                }
                if (this.f10960v.isStateful()) {
                    this.f10960v.setState(getDrawableState());
                }
            }
        }
    }

    private void d() {
        ObjectAnimator objectAnimator = this.f10950g0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private void e(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        super.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    private static float f(float f10, float f11, float f12) {
        if (f10 < f11) {
            return f11;
        }
        return f10 > f12 ? f12 : f10;
    }

    private CharSequence g(CharSequence charSequence) {
        TransformationMethod transformationMethodF = getEmojiTextViewHelper().f(this.f10949f0);
        return transformationMethodF != null ? transformationMethodF.getTransformation(charSequence, this) : charSequence;
    }

    private C1013j getEmojiTextViewHelper() {
        if (this.f10952i0 == null) {
            this.f10952i0 = new C1013j(this);
        }
        return this.f10952i0;
    }

    private boolean getTargetCheckedState() {
        return this.f10936P > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((Q.b(this) ? 1.0f - this.f10936P : this.f10936P) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f10960v;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f10954k0;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f10955q;
        Rect rectC = drawable2 != null ? v.c(drawable2) : v.f11151c;
        return ((((this.f10937Q - this.f10939S) - rect.left) - rect.right) - rectC.left) - rectC.right;
    }

    private boolean h(float f10, float f11) {
        if (this.f10955q == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f10955q.getPadding(this.f10954k0);
        int i10 = this.f10941U;
        int i11 = this.f10931K;
        int i12 = i10 - i11;
        int i13 = (this.f10940T + thumbOffset) - i11;
        int i14 = this.f10939S + i13;
        Rect rect = this.f10954k0;
        return f10 > ((float) i13) && f10 < ((float) (((i14 + rect.left) + rect.right) + i11)) && f11 > ((float) i12) && f11 < ((float) (this.f10943W + i11));
    }

    private Layout i(CharSequence charSequence) {
        TextPaint textPaint = this.f10945b0;
        return new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private void k() {
        CharSequence string = this.f10927G;
        if (string == null) {
            string = getResources().getString(p050f.h.f20474b);
        }
        androidx.core.view.H.y0(this, string);
    }

    private void l() {
        CharSequence string = this.f10925E;
        if (string == null) {
            string = getResources().getString(p050f.h.f20475c);
        }
        androidx.core.view.H.y0(this, string);
    }

    private void o(int i10, int i11) {
        Typeface typeface;
        if (i10 == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i10 != 2) {
            typeface = i10 != 3 ? null : Typeface.MONOSPACE;
        } else {
            typeface = Typeface.SERIF;
        }
        n(typeface, i11);
    }

    private void p() {
        if (this.f10953j0 == null && this.f10952i0.b() && androidx.emoji2.text.e.i()) {
            androidx.emoji2.text.e eVarC = androidx.emoji2.text.e.c();
            int iE = eVarC.e();
            if (iE == 3 || iE == 0) {
                b bVar = new b(this);
                this.f10953j0 = bVar;
                eVarC.t(bVar);
            }
        }
    }

    private void q(MotionEvent motionEvent) {
        this.f10930J = 0;
        boolean targetCheckedState = true;
        boolean z9 = motionEvent.getAction() == 1 && isEnabled();
        boolean zIsChecked = isChecked();
        if (z9) {
            this.f10934N.computeCurrentVelocity(1000);
            float xVelocity = this.f10934N.getXVelocity();
            if (Math.abs(xVelocity) <= this.f10935O) {
                targetCheckedState = getTargetCheckedState();
            } else if (!Q.b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                targetCheckedState = false;
            }
        } else {
            targetCheckedState = zIsChecked;
        }
        if (targetCheckedState != zIsChecked) {
            playSoundEffect(0);
        }
        setChecked(targetCheckedState);
        e(motionEvent);
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f10927G = charSequence;
        this.f10928H = g(charSequence);
        this.f10948e0 = null;
        if (this.f10929I) {
            p();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f10925E = charSequence;
        this.f10926F = g(charSequence);
        this.f10947d0 = null;
        if (this.f10929I) {
            p();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i10;
        int i11;
        Rect rect = this.f10954k0;
        int i12 = this.f10940T;
        int i13 = this.f10941U;
        int i14 = this.f10942V;
        int i15 = this.f10943W;
        int thumbOffset = getThumbOffset() + i12;
        Drawable drawable = this.f10955q;
        Rect rectC = drawable != null ? v.c(drawable) : v.f11151c;
        Drawable drawable2 = this.f10960v;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i16 = rect.left;
            thumbOffset += i16;
            if (rectC != null) {
                int i17 = rectC.left;
                if (i17 > i16) {
                    i12 += i17 - i16;
                }
                int i18 = rectC.top;
                int i19 = rect.top;
                i10 = i18 > i19 ? (i18 - i19) + i13 : i13;
                int i20 = rectC.right;
                int i21 = rect.right;
                if (i20 > i21) {
                    i14 -= i20 - i21;
                }
                int i22 = rectC.bottom;
                int i23 = rect.bottom;
                if (i22 > i23) {
                    i11 = i15 - (i22 - i23);
                }
                this.f10960v.setBounds(i12, i10, i14, i11);
            } else {
                i10 = i13;
            }
            i11 = i15;
            this.f10960v.setBounds(i12, i10, i14, i11);
        }
        Drawable drawable3 = this.f10955q;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i24 = thumbOffset - rect.left;
            int i25 = thumbOffset + this.f10939S + rect.right;
            this.f10955q.setBounds(i24, i13, i25, i15);
            Drawable background = getBackground();
            if (background != null) {
                p201u0.a.l(background, i24, i13, i25, i15);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f10955q;
        if (drawable != null) {
            p201u0.a.k(drawable, f10, f11);
        }
        Drawable drawable2 = this.f10960v;
        if (drawable2 != null) {
            p201u0.a.k(drawable2, f10, f11);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f10955q;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f10960v;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!Q.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f10937Q;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f10923C : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (Q.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f10937Q;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f10923C : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.l.q(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f10929I;
    }

    public boolean getSplitTrack() {
        return this.f10924D;
    }

    public int getSwitchMinWidth() {
        return this.f10922B;
    }

    public int getSwitchPadding() {
        return this.f10923C;
    }

    public CharSequence getTextOff() {
        return this.f10927G;
    }

    public CharSequence getTextOn() {
        return this.f10925E;
    }

    public Drawable getThumbDrawable() {
        return this.f10955q;
    }

    protected final float getThumbPosition() {
        return this.f10936P;
    }

    public int getThumbTextPadding() {
        return this.f10921A;
    }

    public ColorStateList getThumbTintList() {
        return this.f10956r;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f10957s;
    }

    public Drawable getTrackDrawable() {
        return this.f10960v;
    }

    public ColorStateList getTrackTintList() {
        return this.f10961w;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f10962x;
    }

    void j() {
        setTextOnInternal(this.f10925E);
        setTextOffInternal(this.f10927G);
        requestLayout();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f10955q;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f10960v;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f10950g0;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f10950g0.end();
        this.f10950g0 = null;
    }

    public void m(Context context, int i10) {
        J jT = J.t(context, i10, p050f.j.f20498B2);
        ColorStateList colorStateListC = jT.c(p050f.j.f20514F2);
        if (colorStateListC != null) {
            this.f10946c0 = colorStateListC;
        } else {
            this.f10946c0 = getTextColors();
        }
        int iF = jT.f(p050f.j.f20502C2, 0);
        if (iF != 0) {
            float f10 = iF;
            if (f10 != this.f10945b0.getTextSize()) {
                this.f10945b0.setTextSize(f10);
                requestLayout();
            }
        }
        o(jT.k(p050f.j.f20506D2, -1), jT.k(p050f.j.f20510E2, -1));
        if (jT.a(p050f.j.f20534K2, false)) {
            this.f10949f0 = new p090j.a(getContext());
        } else {
            this.f10949f0 = null;
        }
        setTextOnInternal(this.f10925E);
        setTextOffInternal(this.f10927G);
        jT.x();
    }

    public void n(Typeface typeface, int i10) {
        if (i10 <= 0) {
            this.f10945b0.setFakeBoldText(false);
            this.f10945b0.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        } else {
            Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i10) : Typeface.create(typeface, i10);
            setSwitchTypeface(typefaceDefaultFromStyle);
            int i11 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i10;
            this.f10945b0.setFakeBoldText((i11 & 1) != 0);
            this.f10945b0.setTextSkewX((i11 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f10920m0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.f10954k0;
        Drawable drawable = this.f10960v;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i10 = this.f10941U;
        int i11 = this.f10943W;
        int i12 = i10 + rect.top;
        int i13 = i11 - rect.bottom;
        Drawable drawable2 = this.f10955q;
        if (drawable != null) {
            if (!this.f10924D || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectC = v.c(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectC.left;
                rect.right -= rectC.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f10947d0 : this.f10948e0;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f10946c0;
            if (colorStateList != null) {
                this.f10945b0.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f10945b0.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i12 + i13) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        int iMax;
        int width;
        int paddingLeft;
        int i14;
        int paddingTop;
        int height;
        super.onLayout(z9, i10, i11, i12, i13);
        int iMax2 = 0;
        if (this.f10955q != null) {
            Rect rect = this.f10954k0;
            Drawable drawable = this.f10960v;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectC = v.c(this.f10955q);
            iMax = Math.max(0, rectC.left - rect.left);
            iMax2 = Math.max(0, rectC.right - rect.right);
        } else {
            iMax = 0;
        }
        if (Q.b(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.f10937Q + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.f10937Q) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity != 16) {
            if (gravity != 80) {
                paddingTop = getPaddingTop();
                i14 = this.f10938R;
            } else {
                height = getHeight() - getPaddingBottom();
                paddingTop = height - this.f10938R;
            }
            this.f10940T = paddingLeft;
            this.f10941U = paddingTop;
            this.f10943W = height;
            this.f10942V = width;
        }
        int paddingTop2 = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
        i14 = this.f10938R;
        paddingTop = paddingTop2 - (i14 / 2);
        height = i14 + paddingTop;
        this.f10940T = paddingLeft;
        this.f10941U = paddingTop;
        this.f10943W = height;
        this.f10942V = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int intrinsicWidth;
        int intrinsicHeight;
        if (this.f10929I) {
            if (this.f10947d0 == null) {
                this.f10947d0 = i(this.f10926F);
            }
            if (this.f10948e0 == null) {
                this.f10948e0 = i(this.f10928H);
            }
        }
        Rect rect = this.f10954k0;
        Drawable drawable = this.f10955q;
        int intrinsicHeight2 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f10955q.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f10955q.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.f10939S = Math.max(this.f10929I ? Math.max(this.f10947d0.getWidth(), this.f10948e0.getWidth()) + (this.f10921A * 2) : 0, intrinsicWidth);
        Drawable drawable2 = this.f10960v;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f10960v.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.f10955q;
        if (drawable3 != null) {
            Rect rectC = v.c(drawable3);
            iMax = Math.max(iMax, rectC.left);
            iMax2 = Math.max(iMax2, rectC.right);
        }
        int iMax3 = this.f10944a0 ? Math.max(this.f10922B, (this.f10939S * 2) + iMax + iMax2) : this.f10922B;
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.f10937Q = iMax3;
        this.f10938R = iMax4;
        super.onMeasure(i10, i11);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f10925E : this.f10927G;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0089  */
    /* JADX WARN: Code duplicated, block: B:36:0x008d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0094  */
    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f10;
        this.f10934N.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x9 = motionEvent.getX();
            float y9 = motionEvent.getY();
            if (isEnabled() && h(x9, y9)) {
                this.f10930J = 1;
                this.f10932L = x9;
                this.f10933M = y9;
            }
        } else if (actionMasked == 1) {
            if (this.f10930J == 2) {
                q(motionEvent);
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.f10930J = 0;
            this.f10934N.clear();
        } else if (actionMasked == 2) {
            int i10 = this.f10930J;
            if (i10 == 1) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (Math.abs(x10 - this.f10932L) > this.f10931K || Math.abs(y10 - this.f10933M) > this.f10931K) {
                    this.f10930J = 2;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    this.f10932L = x10;
                    this.f10933M = y10;
                    return true;
                }
            } else if (i10 == 2) {
                float x11 = motionEvent.getX();
                int thumbScrollRange = getThumbScrollRange();
                float f11 = x11 - this.f10932L;
                if (thumbScrollRange != 0) {
                    f10 = f11 / thumbScrollRange;
                } else {
                    f10 = f11 > 0.0f ? 1.0f : -1.0f;
                }
                if (Q.b(this)) {
                    f10 = -f10;
                }
                float f12 = f(this.f10936P + f10, 0.0f, 1.0f);
                if (f12 != this.f10936P) {
                    this.f10932L = x11;
                    setThumbPosition(f12);
                }
                return true;
            }
        } else if (actionMasked == 3) {
            if (this.f10930J == 2) {
                q(motionEvent);
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.f10930J = 0;
            this.f10934N.clear();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z9) {
        super.setAllCaps(z9);
        getEmojiTextViewHelper().d(z9);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z9) {
        super.setChecked(z9);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            l();
        } else {
            k();
        }
        if (getWindowToken() != null && isLaidOut()) {
            a(zIsChecked);
        } else {
            d();
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.l.r(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z9) {
        getEmojiTextViewHelper().e(z9);
        setTextOnInternal(this.f10925E);
        setTextOffInternal(this.f10927G);
        requestLayout();
    }

    protected final void setEnforceSwitchWidth(boolean z9) {
        this.f10944a0 = z9;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z9) {
        if (this.f10929I != z9) {
            this.f10929I = z9;
            requestLayout();
            if (z9) {
                p();
            }
        }
    }

    public void setSplitTrack(boolean z9) {
        this.f10924D = z9;
        invalidate();
    }

    public void setSwitchMinWidth(int i10) {
        this.f10922B = i10;
        requestLayout();
    }

    public void setSwitchPadding(int i10) {
        this.f10923C = i10;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f10945b0.getTypeface() == null || this.f10945b0.getTypeface().equals(typeface)) && (this.f10945b0.getTypeface() != null || typeface == null)) {
            return;
        }
        this.f10945b0.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            return;
        }
        k();
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            l();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f10955q;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f10955q = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    void setThumbPosition(float f10) {
        this.f10936P = f10;
        invalidate();
    }

    public void setThumbResource(int i10) {
        setThumbDrawable(p060g.a.b(getContext(), i10));
    }

    public void setThumbTextPadding(int i10) {
        this.f10921A = i10;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f10956r = colorStateList;
        this.f10958t = true;
        b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f10957s = mode;
        this.f10959u = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f10960v;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f10960v = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i10) {
        setTrackDrawable(p060g.a.b(getContext(), i10));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f10961w = colorStateList;
        this.f10963y = true;
        c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f10962x = mode;
        this.f10964z = true;
        c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f10955q || drawable == this.f10960v;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f10956r = null;
        this.f10957s = null;
        this.f10958t = false;
        this.f10959u = false;
        this.f10961w = null;
        this.f10962x = null;
        this.f10963y = false;
        this.f10964z = false;
        this.f10934N = VelocityTracker.obtain();
        this.f10944a0 = true;
        this.f10954k0 = new Rect();
        F.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f10945b0 = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = p050f.j.f20658m2;
        J jV = J.v(context, attributeSet, iArr, i10, 0);
        androidx.core.view.H.e0(this, context, iArr, attributeSet, jV.r(), i10, 0);
        Drawable drawableG = jV.g(p050f.j.f20673p2);
        this.f10955q = drawableG;
        if (drawableG != null) {
            drawableG.setCallback(this);
        }
        Drawable drawableG2 = jV.g(p050f.j.f20718y2);
        this.f10960v = drawableG2;
        if (drawableG2 != null) {
            drawableG2.setCallback(this);
        }
        setTextOnInternal(jV.p(p050f.j.f20663n2));
        setTextOffInternal(jV.p(p050f.j.f20668o2));
        this.f10929I = jV.a(p050f.j.f20678q2, true);
        this.f10921A = jV.f(p050f.j.f20703v2, 0);
        this.f10922B = jV.f(p050f.j.f20688s2, 0);
        this.f10923C = jV.f(p050f.j.f20693t2, 0);
        this.f10924D = jV.a(p050f.j.f20683r2, false);
        ColorStateList colorStateListC = jV.c(p050f.j.f20708w2);
        if (colorStateListC != null) {
            this.f10956r = colorStateListC;
            this.f10958t = true;
        }
        PorterDuff.Mode modeD = v.d(jV.k(p050f.j.f20713x2, -1), null);
        if (this.f10957s != modeD) {
            this.f10957s = modeD;
            this.f10959u = true;
        }
        if (this.f10958t || this.f10959u) {
            b();
        }
        ColorStateList colorStateListC2 = jV.c(p050f.j.f20723z2);
        if (colorStateListC2 != null) {
            this.f10961w = colorStateListC2;
            this.f10963y = true;
        }
        PorterDuff.Mode modeD2 = v.d(jV.k(p050f.j.f20493A2, -1), null);
        if (this.f10962x != modeD2) {
            this.f10962x = modeD2;
            this.f10964z = true;
        }
        if (this.f10963y || this.f10964z) {
            c();
        }
        int iN = jV.n(p050f.j.f20698u2, 0);
        if (iN != 0) {
            m(context, iN);
        }
        r rVar = new r(this);
        this.f10951h0 = rVar;
        rVar.m(attributeSet, i10);
        jV.x();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f10931K = viewConfiguration.getScaledTouchSlop();
        this.f10935O = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().c(attributeSet, i10);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
