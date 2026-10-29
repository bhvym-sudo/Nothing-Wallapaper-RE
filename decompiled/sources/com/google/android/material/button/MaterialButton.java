package com.google.android.material.button;

import K4.c;
import N4.i;
import N4.o;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.view.H;
import androidx.core.widget.l;
import com.google.android.material.internal.k;
import com.google.android.material.internal.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p225w4.j;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButton extends AppCompatButton implements Checkable, o {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final int[] f16620E = {R.attr.state_checkable};

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final int[] f16621F = {R.attr.state_checked};

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final int f16622G = j.f28920q;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f16623A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f16624B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f16625C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f16626D;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final com.google.android.material.button.a f16627q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final LinkedHashSet f16628r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private a f16629s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private PorterDuff.Mode f16630t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ColorStateList f16631u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Drawable f16632v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f16633w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f16634x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f16635y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f16636z;

    interface a {
        void a(MaterialButton materialButton, boolean z9);
    }

    static class b extends H0.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f16637q;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        private void a(Parcel parcel) {
            this.f16637q = parcel.readInt() == 1;
        }

        @Override // H0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f16637q ? 1 : 0);
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            a(parcel);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p225w4.a.f28721x);
    }

    private boolean b() {
        int i10 = this.f16626D;
        return i10 == 3 || i10 == 4;
    }

    private boolean c() {
        int i10 = this.f16626D;
        return i10 == 1 || i10 == 2;
    }

    private boolean d() {
        int i10 = this.f16626D;
        return i10 == 16 || i10 == 32;
    }

    private boolean e() {
        return H.v(this) == 1;
    }

    private boolean f() {
        com.google.android.material.button.a aVar = this.f16627q;
        return (aVar == null || aVar.o()) ? false : true;
    }

    private void g() {
        if (c()) {
            l.i(this, this.f16632v, null, null, null);
        } else if (b()) {
            l.i(this, null, null, this.f16632v, null);
        } else if (d()) {
            l.i(this, null, this.f16632v, null, null);
        }
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            return (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i10 = 0; i10 < lineCount; i10++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i10));
        }
        return (int) Math.ceil(fMax);
    }

    private void h(boolean z9) {
        Drawable drawable = this.f16632v;
        if (drawable != null) {
            Drawable drawableMutate = p201u0.a.r(drawable).mutate();
            this.f16632v = drawableMutate;
            p201u0.a.o(drawableMutate, this.f16631u);
            PorterDuff.Mode mode = this.f16630t;
            if (mode != null) {
                p201u0.a.p(this.f16632v, mode);
            }
            int intrinsicWidth = this.f16634x;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f16632v.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f16634x;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f16632v.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f16632v;
            int i10 = this.f16635y;
            int i11 = this.f16636z;
            drawable2.setBounds(i10, i11, intrinsicWidth + i10, intrinsicHeight + i11);
            this.f16632v.setVisible(true, z9);
        }
        if (z9) {
            g();
            return;
        }
        Drawable[] drawableArrA = l.a(this);
        Drawable drawable3 = drawableArrA[0];
        Drawable drawable4 = drawableArrA[1];
        Drawable drawable5 = drawableArrA[2];
        if ((!c() || drawable3 == this.f16632v) && ((!b() || drawable5 == this.f16632v) && (!d() || drawable4 == this.f16632v))) {
            return;
        }
        g();
    }

    private void i(int i10, int i11) {
        if (this.f16632v == null || getLayout() == null) {
            return;
        }
        if (!c() && !b()) {
            if (d()) {
                this.f16635y = 0;
                if (this.f16626D == 16) {
                    this.f16636z = 0;
                    h(false);
                    return;
                }
                int intrinsicHeight = this.f16634x;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f16632v.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i11 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f16623A) - getPaddingBottom()) / 2);
                if (this.f16636z != iMax) {
                    this.f16636z = iMax;
                    h(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f16636z = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i12 = this.f16626D;
        if (i12 == 1 || i12 == 3 || ((i12 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i12 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f16635y = 0;
            h(false);
            return;
        }
        int intrinsicWidth = this.f16634x;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f16632v.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i10 - getTextLayoutWidth()) - H.y(this)) - intrinsicWidth) - this.f16623A) - H.z(this);
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if (e() != (this.f16626D == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.f16635y != textLayoutWidth) {
            this.f16635y = textLayoutWidth;
            h(false);
        }
    }

    public boolean a() {
        com.google.android.material.button.a aVar = this.f16627q;
        return aVar != null && aVar.p();
    }

    String getA11yClassName() {
        if (TextUtils.isEmpty(this.f16633w)) {
            return (a() ? CompoundButton.class : Button.class).getName();
        }
        return this.f16633w;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (f()) {
            return this.f16627q.b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f16632v;
    }

    public int getIconGravity() {
        return this.f16626D;
    }

    public int getIconPadding() {
        return this.f16623A;
    }

    public int getIconSize() {
        return this.f16634x;
    }

    public ColorStateList getIconTint() {
        return this.f16631u;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f16630t;
    }

    public int getInsetBottom() {
        return this.f16627q.c();
    }

    public int getInsetTop() {
        return this.f16627q.d();
    }

    public ColorStateList getRippleColor() {
        if (f()) {
            return this.f16627q.h();
        }
        return null;
    }

    public N4.l getShapeAppearanceModel() {
        if (f()) {
            return this.f16627q.i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (f()) {
            return this.f16627q.j();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (f()) {
            return this.f16627q.k();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        return f() ? this.f16627q.l() : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return f() ? this.f16627q.m() : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f16624B;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (f()) {
            i.f(this, this.f16627q.f());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (a()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f16620E);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f16621F);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        setChecked(bVar.f16637q);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f16637q = this.f16624B;
        return bVar;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.f16627q.q()) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f16632v != null) {
            if (this.f16632v.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    void setA11yClassName(String str) {
        this.f16633w = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (f()) {
            this.f16627q.s(i10);
        } else {
            super.setBackgroundColor(i10);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!f()) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.f16627q.t();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i10) {
        setBackgroundDrawable(i10 != 0 ? p060g.a.b(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z9) {
        if (f()) {
            this.f16627q.u(z9);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z9) {
        if (a() && isEnabled() && this.f16624B != z9) {
            this.f16624B = z9;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup) getParent()).m(this, this.f16624B);
            }
            if (this.f16625C) {
                return;
            }
            this.f16625C = true;
            Iterator it = this.f16628r.iterator();
            if (it.hasNext()) {
                androidx.appcompat.app.o.a(it.next());
                throw null;
            }
            this.f16625C = false;
        }
    }

    public void setCornerRadius(int i10) {
        if (f()) {
            this.f16627q.v(i10);
        }
    }

    public void setCornerRadiusResource(int i10) {
        if (f()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        if (f()) {
            this.f16627q.f().U(f10);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f16632v != drawable) {
            this.f16632v = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.f16626D != i10) {
            this.f16626D = i10;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i10) {
        if (this.f16623A != i10) {
            this.f16623A = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        setIcon(i10 != 0 ? p060g.a.b(getContext(), i10) : null);
    }

    public void setIconSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f16634x != i10) {
            this.f16634x = i10;
            h(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f16631u != colorStateList) {
            this.f16631u = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f16630t != mode) {
            this.f16630t = mode;
            h(false);
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(p060g.a.a(getContext(), i10));
    }

    public void setInsetBottom(int i10) {
        this.f16627q.w(i10);
    }

    public void setInsetTop(int i10) {
        this.f16627q.x(i10);
    }

    void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    void setOnPressedChangeListenerInternal(a aVar) {
        this.f16629s = aVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z9) {
        a aVar = this.f16629s;
        if (aVar != null) {
            aVar.a(this, z9);
        }
        super.setPressed(z9);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (f()) {
            this.f16627q.y(colorStateList);
        }
    }

    public void setRippleColorResource(int i10) {
        if (f()) {
            setRippleColor(p060g.a.a(getContext(), i10));
        }
    }

    @Override // N4.o
    public void setShapeAppearanceModel(N4.l lVar) {
        if (!f()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f16627q.z(lVar);
    }

    void setShouldDrawSurfaceColorStroke(boolean z9) {
        if (f()) {
            this.f16627q.A(z9);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (f()) {
            this.f16627q.B(colorStateList);
        }
    }

    public void setStrokeColorResource(int i10) {
        if (f()) {
            setStrokeColor(p060g.a.a(getContext(), i10));
        }
    }

    public void setStrokeWidth(int i10) {
        if (f()) {
            this.f16627q.C(i10);
        }
    }

    public void setStrokeWidthResource(int i10) {
        if (f()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (f()) {
            this.f16627q.D(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (f()) {
            this.f16627q.E(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i10) {
        super.setTextAlignment(i10);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z9) {
        this.f16627q.F(z9);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f16624B);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f16622G;
        super(Q4.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f16628r = new LinkedHashSet();
        this.f16624B = false;
        this.f16625C = false;
        Context context2 = getContext();
        TypedArray typedArrayI = k.i(context2, attributeSet, p225w4.k.f29305n3, i10, i11, new int[0]);
        this.f16623A = typedArrayI.getDimensionPixelSize(p225w4.k.f28933A3, 0);
        this.f16630t = n.h(typedArrayI.getInt(p225w4.k.f28963D3, -1), PorterDuff.Mode.SRC_IN);
        this.f16631u = c.a(getContext(), typedArrayI, p225w4.k.f28953C3);
        this.f16632v = c.d(getContext(), typedArrayI, p225w4.k.f29415y3);
        this.f16626D = typedArrayI.getInteger(p225w4.k.f29425z3, 1);
        this.f16634x = typedArrayI.getDimensionPixelSize(p225w4.k.f28943B3, 0);
        com.google.android.material.button.a aVar = new com.google.android.material.button.a(this, N4.l.e(context2, attributeSet, i10, i11).m());
        this.f16627q = aVar;
        aVar.r(typedArrayI);
        typedArrayI.recycle();
        setCompoundDrawablePadding(this.f16623A);
        h(this.f16632v != null);
    }
}
