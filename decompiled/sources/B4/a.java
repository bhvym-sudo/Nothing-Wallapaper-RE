package B4;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.app.o;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.J;
import androidx.vectordrawable.graphics.drawable.c;
import com.google.android.material.internal.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p225w4.d;
import p225w4.e;
import p225w4.i;
import p225w4.j;
import p225w4.k;

/* JADX INFO: loaded from: classes.dex */
public class a extends AppCompatCheckBox {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final int f350O = j.f28922s;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private static final int[] f351P = {p225w4.a.f28688W};

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private static final int[] f352Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private static final int[][] f353R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final int f354S;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private CharSequence f355A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private Drawable f356B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private Drawable f357C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f358D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    ColorStateList f359E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    ColorStateList f360F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private PorterDuff.Mode f361G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f362H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int[] f363I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f364J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private CharSequence f365K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f366L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final c f367M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final androidx.vectordrawable.graphics.drawable.b f368N;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final LinkedHashSet f369u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final LinkedHashSet f370v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private ColorStateList f371w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f372x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f373y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f374z;

    /* JADX INFO: renamed from: B4.a$a, reason: collision with other inner class name */
    class C0015a extends androidx.vectordrawable.graphics.drawable.b {
        C0015a() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.b
        public void b(Drawable drawable) {
            super.b(drawable);
            ColorStateList colorStateList = a.this.f359E;
            if (colorStateList != null) {
                p201u0.a.o(drawable, colorStateList);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.b
        public void c(Drawable drawable) {
            super.c(drawable);
            a aVar = a.this;
            ColorStateList colorStateList = aVar.f359E;
            if (colorStateList != null) {
                p201u0.a.n(drawable, colorStateList.getColorForState(aVar.f363I, a.this.f359E.getDefaultColor()));
            }
        }
    }

    static class b extends View.BaseSavedState {
        public static final Parcelable.Creator<b> CREATOR = new C0016a();

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f376q;

        /* JADX INFO: renamed from: B4.a$b$a, reason: collision with other inner class name */
        class C0016a implements Parcelable.Creator {
            C0016a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        /* synthetic */ b(Parcel parcel, C0015a c0015a) {
            this(parcel);
        }

        private String a() {
            int i10 = this.f376q;
            if (i10 != 1) {
                return i10 != 2 ? "unchecked" : "indeterminate";
            }
            return "checked";
        }

        public String toString() {
            return "MaterialCheckBox.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " CheckedState=" + a() + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Integer.valueOf(this.f376q));
        }

        b(Parcelable parcelable) {
            super(parcelable);
        }

        private b(Parcel parcel) {
            super(parcel);
            this.f376q = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }
    }

    static {
        int i10 = p225w4.a.f28687V;
        f352Q = new int[]{i10};
        f353R = new int[][]{new int[]{R.attr.state_enabled, i10}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
        f354S = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p225w4.a.f28702f);
    }

    private boolean c(J j9) {
        return j9.n(k.f29276k4, 0) == f354S && j9.n(k.f29286l4, 0) == 0;
    }

    private void e() {
        this.f356B = com.google.android.material.drawable.a.c(this.f356B, this.f359E, androidx.core.widget.c.c(this));
        this.f357C = com.google.android.material.drawable.a.c(this.f357C, this.f360F, this.f361G);
        f();
        g();
        super.setButtonDrawable(com.google.android.material.drawable.a.a(this.f356B, this.f357C));
        refreshDrawableState();
    }

    private void f() {
        c cVar;
        if (this.f358D) {
            c cVar2 = this.f367M;
            if (cVar2 != null) {
                cVar2.f(this.f368N);
                this.f367M.b(this.f368N);
            }
            Drawable drawable = this.f356B;
            if (!(drawable instanceof AnimatedStateListDrawable) || (cVar = this.f367M) == null) {
                return;
            }
            int i10 = e.f28823b;
            int i11 = e.f28820T;
            ((AnimatedStateListDrawable) drawable).addTransition(i10, i11, cVar, false);
            ((AnimatedStateListDrawable) this.f356B).addTransition(e.f28831j, i11, this.f367M, false);
        }
    }

    private void g() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.f356B;
        if (drawable != null && (colorStateList2 = this.f359E) != null) {
            p201u0.a.o(drawable, colorStateList2);
        }
        Drawable drawable2 = this.f357C;
        if (drawable2 == null || (colorStateList = this.f360F) == null) {
            return;
        }
        p201u0.a.o(drawable2, colorStateList);
    }

    private String getButtonStateDescription() {
        int i10 = this.f362H;
        if (i10 == 1) {
            return getResources().getString(i.f28888k);
        }
        return i10 == 0 ? getResources().getString(i.f28890m) : getResources().getString(i.f28889l);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f371w == null) {
            int[][] iArr = f353R;
            int[] iArr2 = new int[iArr.length];
            int iD = D4.a.d(this, p225w4.a.f28706i);
            int iD2 = D4.a.d(this, p225w4.a.f28708k);
            int iD3 = D4.a.d(this, p225w4.a.f28712o);
            int iD4 = D4.a.d(this, p225w4.a.f28709l);
            iArr2[0] = D4.a.j(iD3, iD2, 1.0f);
            iArr2[1] = D4.a.j(iD3, iD, 1.0f);
            iArr2[2] = D4.a.j(iD3, iD4, 0.54f);
            iArr2[3] = D4.a.j(iD3, iD4, 0.38f);
            iArr2[4] = D4.a.j(iD3, iD4, 0.38f);
            this.f371w = new ColorStateList(iArr, iArr2);
        }
        return this.f371w;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f359E;
        if (colorStateList != null) {
            return colorStateList;
        }
        return super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    private void h() {
    }

    private void setDefaultStateDescription() {
        if (this.f365K == null) {
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public boolean d() {
        return this.f374z;
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f356B;
    }

    public Drawable getButtonIconDrawable() {
        return this.f357C;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f360F;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f361G;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f359E;
    }

    public int getCheckedState() {
        return this.f362H;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f355A;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public boolean isChecked() {
        return this.f362H == 1;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f372x && this.f359E == null && this.f360F == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f351P);
        }
        if (d()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f352Q);
        }
        this.f363I = com.google.android.material.drawable.a.e(iArrOnCreateDrawableState);
        h();
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable drawableA;
        if (!this.f373y || !TextUtils.isEmpty(getText()) || (drawableA = androidx.core.widget.c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableA.getIntrinsicWidth()) / 2) * (n.g(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableA.getBounds();
            p201u0.a.l(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && d()) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f355A));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        setCheckedState(bVar.f376q);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f376q = getCheckedState();
        return bVar;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(p060g.a.b(getContext(), i10));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f357C = drawable;
        e();
    }

    public void setButtonIconDrawableResource(int i10) {
        setButtonIconDrawable(p060g.a.b(getContext(), i10));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f360F == colorStateList) {
            return;
        }
        this.f360F = colorStateList;
        e();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f361G == mode) {
            return;
        }
        this.f361G = mode;
        e();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f359E == colorStateList) {
            return;
        }
        this.f359E = colorStateList;
        e();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        e();
    }

    public void setCenterIfNoTextEnabled(boolean z9) {
        this.f373y = z9;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z9) {
        setCheckedState(z9 ? 1 : 0);
    }

    public void setCheckedState(int i10) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f362H != i10) {
            this.f362H = i10;
            super.setChecked(i10 == 1);
            refreshDrawableState();
            setDefaultStateDescription();
            if (this.f364J) {
                return;
            }
            this.f364J = true;
            LinkedHashSet linkedHashSet = this.f370v;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    o.a(it.next());
                    throw null;
                }
            }
            if (this.f362H != 2 && (onCheckedChangeListener = this.f366L) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f364J = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        h();
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f355A = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i10) {
        setErrorAccessibilityLabel(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setErrorShown(boolean z9) {
        if (this.f374z == z9) {
            return;
        }
        this.f374z = z9;
        refreshDrawableState();
        Iterator it = this.f369u.iterator();
        if (it.hasNext()) {
            o.a(it.next());
            throw null;
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f366L = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f365K = charSequence;
        if (charSequence == null) {
            setDefaultStateDescription();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    public void setUseMaterialThemeColors(boolean z9) {
        this.f372x = z9;
        if (z9) {
            androidx.core.widget.c.d(this, getMaterialThemeColorsTintList());
        } else {
            androidx.core.widget.c.d(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f350O;
        super(Q4.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f369u = new LinkedHashSet();
        this.f370v = new LinkedHashSet();
        this.f367M = c.a(getContext(), d.f28795e);
        this.f368N = new C0015a();
        Context context2 = getContext();
        this.f356B = androidx.core.widget.c.a(this);
        this.f359E = getSuperButtonTintList();
        setSupportButtonTintList(null);
        J j9 = com.google.android.material.internal.k.j(context2, attributeSet, k.f29266j4, i10, i11, new int[0]);
        this.f357C = j9.g(k.f29296m4);
        if (this.f356B != null && com.google.android.material.internal.k.g(context2) && c(j9)) {
            super.setButtonDrawable((Drawable) null);
            this.f356B = p060g.a.b(context2, d.f28794d);
            this.f358D = true;
            if (this.f357C == null) {
                this.f357C = p060g.a.b(context2, d.f28796f);
            }
        }
        this.f360F = K4.c.b(context2, j9, k.f29306n4);
        this.f361G = n.h(j9.k(k.f29316o4, -1), PorterDuff.Mode.SRC_IN);
        this.f372x = j9.a(k.f29366t4, false);
        this.f373y = j9.a(k.f29326p4, true);
        this.f374z = j9.a(k.f29356s4, false);
        this.f355A = j9.p(k.f29346r4);
        int i12 = k.f29336q4;
        if (j9.s(i12)) {
            setCheckedState(j9.k(i12, 0));
        }
        j9.x();
        e();
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f356B = drawable;
        this.f358D = false;
        e();
    }
}
