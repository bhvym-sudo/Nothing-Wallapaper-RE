package com.google.android.material.chip;

import C0.d;
import K4.f;
import N4.l;
import N4.o;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.view.H;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.k;
import com.google.android.material.internal.n;
import java.util.List;
import p225w4.i;
import p225w4.j;

/* JADX INFO: loaded from: classes.dex */
public class Chip extends AppCompatCheckBox implements com.google.android.material.chip.a.InterfaceC0458a, o, Checkable {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final int f16752M = j.f28921r;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final Rect f16753N = new Rect();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final int[] f16754O = {R.attr.state_selected};

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private static final int[] f16755P = {R.attr.state_checkable};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f16756A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f16757B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f16758C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f16759D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f16760E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f16761F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private CharSequence f16762G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final c f16763H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f16764I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final Rect f16765J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final RectF f16766K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final f f16767L;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private com.google.android.material.chip.a f16768u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private InsetDrawable f16769v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private RippleDrawable f16770w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private View.OnClickListener f16771x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f16772y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f16773z;

    class a extends f {
        a() {
        }

        @Override // K4.f
        public void a(int i10) {
        }

        @Override // K4.f
        public void b(Typeface typeface, boolean z9) {
            Chip chip = Chip.this;
            chip.setText(chip.f16768u.I2() ? Chip.this.f16768u.d1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    class b extends ViewOutlineProvider {
        b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f16768u != null) {
                Chip.this.f16768u.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    private class c extends I0.a {
        c(Chip chip) {
            super(chip);
        }

        @Override // I0.a
        protected void C(d dVar) {
            dVar.e0(Chip.this.r());
            dVar.h0(Chip.this.isClickable());
            dVar.g0(Chip.this.getAccessibilityClassName());
            dVar.M0(Chip.this.getText());
        }

        @Override // I0.a
        protected void D(int i10, d dVar) {
            if (i10 != 1) {
                dVar.k0("");
                dVar.c0(Chip.f16753N);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                dVar.k0(closeIconContentDescription);
            } else {
                CharSequence text = Chip.this.getText();
                dVar.k0(Chip.this.getContext().getString(i.f28891n, TextUtils.isEmpty(text) ? "" : text).trim());
            }
            dVar.c0(Chip.this.getCloseIconTouchBoundsInt());
            dVar.b(d.a.f543i);
            dVar.o0(Chip.this.isEnabled());
        }

        @Override // I0.a
        protected void E(int i10, boolean z9) {
            if (i10 == 1) {
                Chip.this.f16758C = z9;
                Chip.this.refreshDrawableState();
            }
        }

        @Override // I0.a
        protected int r(float f10, float f11) {
            return (Chip.this.n() && Chip.this.getCloseIconTouchBounds().contains(f10, f11)) ? 1 : 0;
        }

        @Override // I0.a
        protected void s(List list) {
            list.add(0);
            if (Chip.this.n() && Chip.this.s() && Chip.this.f16771x != null) {
                list.add(1);
            }
        }

        @Override // I0.a
        protected boolean z(int i10, int i11, Bundle bundle) {
            if (i11 != 16) {
                return false;
            }
            if (i10 == 0) {
                return Chip.this.performClick();
            }
            if (i10 == 1) {
                return Chip.this.t();
            }
            return false;
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p225w4.a.f28704g);
    }

    private void A() {
        com.google.android.material.chip.a aVar;
        if (TextUtils.isEmpty(getText()) || (aVar = this.f16768u) == null) {
            return;
        }
        int iF0 = (int) (aVar.F0() + this.f16768u.f1() + this.f16768u.m0());
        int iK0 = (int) (this.f16768u.K0() + this.f16768u.g1() + this.f16768u.i0());
        if (this.f16769v != null) {
            Rect rect = new Rect();
            this.f16769v.getPadding(rect);
            iK0 += rect.left;
            iF0 += rect.right;
        }
        H.v0(this, iK0, getPaddingTop(), iF0, getPaddingBottom());
    }

    private void B() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        K4.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.n(getContext(), paint, this.f16767L);
        }
    }

    private void C(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        }
    }

    public static /* synthetic */ void b(Chip chip, CompoundButton compoundButton, boolean z9) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.f16772y;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f16766K.setEmpty();
        if (n() && this.f16771x != null) {
            this.f16768u.U0(this.f16766K);
        }
        return this.f16766K;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f16765J.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f16765J;
    }

    private K4.d getTextAppearance() {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            return aVar.e1();
        }
        return null;
    }

    private void j(com.google.android.material.chip.a aVar) {
        aVar.l2(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    private int[] k() {
        ?? IsEnabled = isEnabled();
        int i10 = IsEnabled;
        if (this.f16758C) {
            i10 = IsEnabled + 1;
        }
        int i11 = i10;
        if (this.f16757B) {
            i11 = i10 + 1;
        }
        int i12 = i11;
        if (this.f16756A) {
            i12 = i11 + 1;
        }
        int i13 = i12;
        if (isChecked()) {
            i13 = i12 + 1;
        }
        int[] iArr = new int[i13];
        int i14 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i14 = 1;
        }
        if (this.f16758C) {
            iArr[i14] = 16842908;
            i14++;
        }
        if (this.f16757B) {
            iArr[i14] = 16843623;
            i14++;
        }
        if (this.f16756A) {
            iArr[i14] = 16842919;
            i14++;
        }
        if (isChecked()) {
            iArr[i14] = 16842913;
        }
        return iArr;
    }

    private void m() {
        if (getBackgroundDrawable() == this.f16769v && this.f16768u.getCallback() == null) {
            this.f16768u.setCallback(this.f16769v);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n() {
        com.google.android.material.chip.a aVar = this.f16768u;
        return (aVar == null || aVar.N0() == null) ? false : true;
    }

    private void o(Context context, AttributeSet attributeSet, int i10) {
        TypedArray typedArrayI = k.i(context, attributeSet, p225w4.k.f29064O0, i10, f16752M, new int[0]);
        this.f16759D = typedArrayI.getBoolean(p225w4.k.f29373u1, false);
        this.f16761F = (int) Math.ceil(typedArrayI.getDimension(p225w4.k.f29253i1, (float) Math.ceil(n.c(getContext(), 48))));
        typedArrayI.recycle();
    }

    private void p() {
        setOutlineProvider(new b());
    }

    private void q(int i10, int i11, int i12, int i13) {
        this.f16769v = new InsetDrawable((Drawable) this.f16768u, i10, i11, i12, i13);
    }

    private void setCloseIconHovered(boolean z9) {
        if (this.f16757B != z9) {
            this.f16757B = z9;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z9) {
        if (this.f16756A != z9) {
            this.f16756A = z9;
            refreshDrawableState();
        }
    }

    private void u() {
        if (this.f16769v != null) {
            this.f16769v = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            y();
        }
    }

    private void w(com.google.android.material.chip.a aVar) {
        if (aVar != null) {
            aVar.l2(null);
        }
    }

    private void x() {
        if (n() && s() && this.f16771x != null) {
            H.g0(this, this.f16763H);
            this.f16764I = true;
        } else {
            H.g0(this, null);
            this.f16764I = false;
        }
    }

    private void y() {
        if (L4.b.f4786a) {
            z();
            return;
        }
        this.f16768u.H2(true);
        H.k0(this, getBackgroundDrawable());
        A();
        m();
    }

    private void z() {
        this.f16770w = new RippleDrawable(L4.b.d(this.f16768u.b1()), getBackgroundDrawable(), null);
        this.f16768u.H2(false);
        H.k0(this, this.f16770w);
        A();
    }

    @Override // com.google.android.material.chip.a.InterfaceC0458a
    public void a() {
        l(this.f16761F);
        requestLayout();
        invalidateOutline();
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.f16764I) {
            return this.f16763H.k(motionEvent) || super.dispatchHoverEvent(motionEvent);
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f16764I) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.f16763H.l(keyEvent) || this.f16763H.q() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.f16768u;
        if ((aVar == null || !aVar.l1()) ? false : this.f16768u.h2(k())) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f16762G)) {
            return this.f16762G;
        }
        if (!r()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f16769v;
        return insetDrawable == null ? this.f16768u : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            return aVar.B0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            return aVar.C0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            return aVar.D0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            return Math.max(0.0f, aVar.E0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f16768u;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            return aVar.F0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            return aVar.G0();
        }
        return null;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            return aVar.H0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            return aVar.I0();
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            return aVar.J0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            return aVar.K0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            return aVar.L0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            return aVar.M0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            return aVar.N0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            return aVar.O0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            return aVar.P0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            return aVar.Q0();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            return aVar.R0();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            return aVar.T0();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            return aVar.X0();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.f16764I && (this.f16763H.q() == 1 || this.f16763H.m() == 1)) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public p235x4.c getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            return aVar.Y0();
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            return aVar.Z0();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            return aVar.a1();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            return aVar.b1();
        }
        return null;
    }

    public l getShapeAppearanceModel() {
        return this.f16768u.B();
    }

    public p235x4.c getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            return aVar.c1();
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            return aVar.f1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            return aVar.g1();
        }
        return 0.0f;
    }

    public boolean l(int i10) {
        this.f16761F = i10;
        if (!v()) {
            if (this.f16769v != null) {
                u();
            } else {
                y();
            }
            return false;
        }
        int iMax = Math.max(0, i10 - this.f16768u.getIntrinsicHeight());
        int iMax2 = Math.max(0, i10 - this.f16768u.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            if (this.f16769v != null) {
                u();
            } else {
                y();
            }
            return false;
        }
        int i11 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i12 = iMax > 0 ? iMax / 2 : 0;
        if (this.f16769v != null) {
            Rect rect = new Rect();
            this.f16769v.getPadding(rect);
            if (rect.top == i12 && rect.bottom == i12 && rect.left == i11 && rect.right == i11) {
                y();
                return true;
            }
        }
        if (getMinHeight() != i10) {
            setMinHeight(i10);
        }
        if (getMinWidth() != i10) {
            setMinWidth(i10);
        }
        q(i11, i12, i11, i12);
        y();
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        N4.i.f(this, this.f16768u);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f16754O);
        }
        if (r()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f16755P);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z9, int i10, Rect rect) {
        super.onFocusChanged(z9, i10, rect);
        if (this.f16764I) {
            this.f16763H.y(z9, i10, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(r());
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i10);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.f16760E != i10) {
            this.f16760E = i10;
            A();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                } else if (this.f16756A) {
                    if (!zContains) {
                        setCloseIconPressed(false);
                    }
                    z9 = true;
                }
                z9 = false;
            } else {
                if (this.f16756A) {
                    t();
                    z9 = true;
                }
                setCloseIconPressed(false);
            }
            z9 = false;
            setCloseIconPressed(false);
        } else if (zContains) {
            setCloseIconPressed(true);
            z9 = true;
        } else {
            z9 = false;
        }
        return z9 || super.onTouchEvent(motionEvent);
    }

    public boolean r() {
        com.google.android.material.chip.a aVar = this.f16768u;
        return aVar != null && aVar.k1();
    }

    public boolean s() {
        com.google.android.material.chip.a aVar = this.f16768u;
        return aVar != null && aVar.m1();
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f16762G = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f16770w) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f16770w) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i10) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z9) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.t1(z9);
        }
    }

    public void setCheckableResource(int i10) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.u1(i10);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z9) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar == null) {
            this.f16773z = z9;
        } else if (aVar.k1()) {
            super.setChecked(z9);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.v1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z9) {
        setCheckedIconVisible(z9);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i10) {
        setCheckedIconVisible(i10);
    }

    public void setCheckedIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.w1(i10);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.x1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.y1(i10);
        }
    }

    public void setCheckedIconVisible(int i10) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.z1(i10);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.B1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.C1(i10);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f10) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.D1(f10);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i10) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.E1(i10);
        }
    }

    public void setChipDrawable(com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.f16768u;
        if (aVar2 != aVar) {
            w(aVar2);
            this.f16768u = aVar;
            aVar.w2(false);
            j(this.f16768u);
            l(this.f16761F);
        }
    }

    public void setChipEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.F1(f10);
        }
    }

    public void setChipEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.G1(i10);
        }
    }

    public void setChipIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.H1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z9) {
        setChipIconVisible(z9);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i10) {
        setChipIconVisible(i10);
    }

    public void setChipIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.I1(i10);
        }
    }

    public void setChipIconSize(float f10) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.J1(f10);
        }
    }

    public void setChipIconSizeResource(int i10) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.K1(i10);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.L1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.M1(i10);
        }
    }

    public void setChipIconVisible(int i10) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.N1(i10);
        }
    }

    public void setChipMinHeight(float f10) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.P1(f10);
        }
    }

    public void setChipMinHeightResource(int i10) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.Q1(i10);
        }
    }

    public void setChipStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.R1(f10);
        }
    }

    public void setChipStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.S1(i10);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.T1(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.U1(i10);
        }
    }

    public void setChipStrokeWidth(float f10) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.V1(f10);
        }
    }

    public void setChipStrokeWidthResource(int i10) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.W1(i10);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i10) {
        setText(getResources().getString(i10));
    }

    public void setCloseIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.Y1(drawable);
        }
        x();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.Z1(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z9) {
        setCloseIconVisible(z9);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i10) {
        setCloseIconVisible(i10);
    }

    public void setCloseIconEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.a2(f10);
        }
    }

    public void setCloseIconEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.b2(i10);
        }
    }

    public void setCloseIconResource(int i10) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.c2(i10);
        }
        x();
    }

    public void setCloseIconSize(float f10) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.d2(f10);
        }
    }

    public void setCloseIconSizeResource(int i10) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.e2(i10);
        }
    }

    public void setCloseIconStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.f2(f10);
        }
    }

    public void setCloseIconStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.g2(i10);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.i2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i10) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.j2(i10);
        }
    }

    public void setCloseIconVisible(int i10) {
        setCloseIconVisible(getResources().getBoolean(i10));
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        if (i10 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i12 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i10, i11, i12, i13);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.U(f10);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f16768u == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.m2(truncateAt);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z9) {
        this.f16759D = z9;
        l(this.f16761F);
    }

    @Override // android.widget.TextView
    public void setGravity(int i10) {
        if (i10 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i10);
        }
    }

    public void setHideMotionSpec(p235x4.c cVar) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.n2(cVar);
        }
    }

    public void setHideMotionSpecResource(int i10) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.o2(i10);
        }
    }

    public void setIconEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.p2(f10);
        }
    }

    public void setIconEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.q2(i10);
        }
    }

    public void setIconStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.r2(f10);
        }
    }

    public void setIconStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.s2(i10);
        }
    }

    public void setInternalOnCheckedChangeListener(com.google.android.material.internal.f fVar) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        if (this.f16768u == null) {
            return;
        }
        super.setLayoutDirection(i10);
    }

    @Override // android.widget.TextView
    public void setLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i10);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i10) {
        super.setMaxWidth(i10);
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.t2(i10);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i10) {
        if (i10 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i10);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f16772y = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f16771x = onClickListener;
        x();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.u2(colorStateList);
        }
        if (this.f16768u.i1()) {
            return;
        }
        z();
    }

    public void setRippleColorResource(int i10) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.v2(i10);
            if (this.f16768u.i1()) {
                return;
            }
            z();
        }
    }

    @Override // N4.o
    public void setShapeAppearanceModel(l lVar) {
        this.f16768u.setShapeAppearanceModel(lVar);
    }

    public void setShowMotionSpec(p235x4.c cVar) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.x2(cVar);
        }
    }

    public void setShowMotionSpecResource(int i10) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.y2(i10);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z9) {
        if (!z9) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z9);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(aVar.I2() ? null : charSequence, bufferType);
        com.google.android.material.chip.a aVar2 = this.f16768u;
        if (aVar2 != null) {
            aVar2.z2(charSequence);
        }
    }

    public void setTextAppearance(K4.d dVar) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.A2(dVar);
        }
        B();
    }

    public void setTextAppearanceResource(int i10) {
        setTextAppearance(getContext(), i10);
    }

    public void setTextEndPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.C2(f10);
        }
    }

    public void setTextEndPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.D2(i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        super.setTextSize(i10, f10);
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.E2(TypedValue.applyDimension(i10, f10, getResources().getDisplayMetrics()));
        }
        B();
    }

    public void setTextStartPadding(float f10) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.F2(f10);
        }
    }

    public void setTextStartPaddingResource(int i10) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.G2(i10);
        }
    }

    public boolean t() {
        boolean z9 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f16771x;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z9 = true;
        }
        if (this.f16764I) {
            this.f16763H.K(1, 1);
        }
        return z9;
    }

    public boolean v() {
        return this.f16759D;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Chip(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f16752M;
        super(Q4.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f16765J = new Rect();
        this.f16766K = new RectF();
        this.f16767L = new a();
        Context context2 = getContext();
        C(attributeSet);
        com.google.android.material.chip.a aVarR0 = com.google.android.material.chip.a.r0(context2, attributeSet, i10, i11);
        o(context2, attributeSet, i10);
        setChipDrawable(aVarR0);
        aVarR0.U(H.r(this));
        TypedArray typedArrayI = k.i(context2, attributeSet, p225w4.k.f29064O0, i10, i11, new int[0]);
        boolean zHasValue = typedArrayI.hasValue(p225w4.k.f29423z1);
        typedArrayI.recycle();
        this.f16763H = new c(this);
        x();
        if (!zHasValue) {
            p();
        }
        setChecked(this.f16773z);
        setText(aVarR0.d1());
        setEllipsize(aVarR0.X0());
        B();
        if (!this.f16768u.I2()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        A();
        if (v()) {
            setMinHeight(this.f16761F);
        }
        this.f16760E = H.v(this);
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: C4.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
                Chip.b(this.f611q, compoundButton, z9);
            }
        });
    }

    public void setCloseIconVisible(boolean z9) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.k2(z9);
        }
        x();
    }

    public void setCheckedIconVisible(boolean z9) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.A1(z9);
        }
    }

    public void setChipIconVisible(boolean z9) {
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.O1(z9);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.B2(i10);
        }
        B();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i10) {
        super.setTextAppearance(i10);
        com.google.android.material.chip.a aVar = this.f16768u;
        if (aVar != null) {
            aVar.B2(i10);
        }
        B();
    }
}
