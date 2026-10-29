package com.google.android.material.textfield;

import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.core.view.H;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class v extends AppCompatAutoCompleteTextView {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f17554A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private ColorStateList f17555B;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final androidx.appcompat.widget.z f17556u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final AccessibilityManager f17557v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Rect f17558w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int f17559x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final float f17560y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private ColorStateList f17561z;

    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i10, long j9) {
            v vVar = v.this;
            v.this.l(i10 < 0 ? vVar.f17556u.v() : vVar.getAdapter().getItem(i10));
            AdapterView.OnItemClickListener onItemClickListener = v.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i10 < 0) {
                    view = v.this.f17556u.y();
                    i10 = v.this.f17556u.x();
                    j9 = v.this.f17556u.w();
                }
                onItemClickListener.onItemClick(v.this.f17556u.j(), view, i10, j9);
            }
            v.this.f17556u.dismiss();
        }
    }

    private class b extends ArrayAdapter {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private ColorStateList f17563q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private ColorStateList f17564r;

        b(Context context, int i10, String[] strArr) {
            super(context, i10, strArr);
            f();
        }

        private ColorStateList a() {
            if (!c() || !d()) {
                return null;
            }
            int[] iArr = {R.attr.state_hovered, -16842919};
            int[] iArr2 = {R.attr.state_selected, -16842919};
            return new ColorStateList(new int[][]{iArr2, iArr, new int[0]}, new int[]{D4.a.i(v.this.f17554A, v.this.f17555B.getColorForState(iArr2, 0)), D4.a.i(v.this.f17554A, v.this.f17555B.getColorForState(iArr, 0)), v.this.f17554A});
        }

        private Drawable b() {
            if (!c()) {
                return null;
            }
            ColorDrawable colorDrawable = new ColorDrawable(v.this.f17554A);
            if (this.f17564r == null) {
                return colorDrawable;
            }
            p201u0.a.o(colorDrawable, this.f17563q);
            return new RippleDrawable(this.f17564r, colorDrawable, null);
        }

        private boolean c() {
            return v.this.f17554A != 0;
        }

        private boolean d() {
            return v.this.f17555B != null;
        }

        private ColorStateList e() {
            if (!d()) {
                return null;
            }
            int[] iArr = {R.attr.state_pressed};
            return new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{v.this.f17555B.getColorForState(iArr, 0), 0});
        }

        void f() {
            this.f17564r = e();
            this.f17563q = a();
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i10, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                H.k0(textView, v.this.getText().toString().contentEquals(textView.getText()) ? b() : null);
            }
            return view2;
        }
    }

    public v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p225w4.a.f28694b);
    }

    private TextInputLayout f() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private boolean g() {
        return i() || h();
    }

    private boolean h() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f17557v;
        if (accessibilityManager != null && accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = this.f17557v.getEnabledAccessibilityServiceList(16)) != null) {
            for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean i() {
        AccessibilityManager accessibilityManager = this.f17557v;
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    private int j() {
        ListAdapter adapter = getAdapter();
        TextInputLayout textInputLayoutF = f();
        int i10 = 0;
        if (adapter == null || textInputLayoutF == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMin = Math.min(adapter.getCount(), Math.max(0, this.f17556u.x()) + 15);
        View view = null;
        int iMax = 0;
        for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
            int itemViewType = adapter.getItemViewType(iMax2);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = adapter.getView(iMax2, view, textInputLayoutF);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax = Math.max(iMax, view.getMeasuredWidth());
        }
        Drawable drawableH = this.f17556u.h();
        if (drawableH != null) {
            drawableH.getPadding(this.f17558w);
            Rect rect = this.f17558w;
            iMax += rect.left + rect.right;
        }
        return iMax + textInputLayoutF.getEndIconView().getMeasuredWidth();
    }

    private void k() {
        TextInputLayout textInputLayoutF = f();
        if (textInputLayoutF != null) {
            textInputLayoutF.p0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.AutoCompleteTextView
    public void dismissDropDown() {
        if (g()) {
            this.f17556u.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f17561z;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutF = f();
        return (textInputLayoutF == null || !textInputLayoutF.R()) ? super.getHint() : textInputLayoutF.getHint();
    }

    public float getPopupElevation() {
        return this.f17560y;
    }

    public int getSimpleItemSelectedColor() {
        return this.f17554A;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f17555B;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutF = f();
        if (textInputLayoutF != null && textInputLayoutF.R() && super.getHint() == null && com.google.android.material.internal.e.b()) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f17556u.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), j()), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z9) {
        if (g()) {
            return;
        }
        super.onWindowFocusChanged(z9);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t9) {
        super.setAdapter(t9);
        this.f17556u.p(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        androidx.appcompat.widget.z zVar = this.f17556u;
        if (zVar != null) {
            zVar.k(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i10) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i10));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f17561z = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof N4.h) {
            ((N4.h) dropDownBackground).V(this.f17561z);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f17556u.M(getOnItemSelectedListener());
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i10) {
        super.setRawInputType(i10);
        k();
    }

    public void setSimpleItemSelectedColor(int i10) {
        this.f17554A = i10;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f17555B = colorStateList;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItems(int i10) {
        setSimpleItems(getResources().getStringArray(i10));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        if (g()) {
            this.f17556u.b();
        } else {
            super.showDropDown();
        }
    }

    public v(Context context, AttributeSet attributeSet, int i10) {
        super(Q4.a.c(context, attributeSet, i10, 0), attributeSet, i10);
        this.f17558w = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayI = com.google.android.material.internal.k.i(context2, attributeSet, p225w4.k.f29225f3, i10, p225w4.j.f28910g, new int[0]);
        int i11 = p225w4.k.f29235g3;
        if (typedArrayI.hasValue(i11) && typedArrayI.getInt(i11, 0) == 0) {
            setKeyListener(null);
        }
        this.f17559x = typedArrayI.getResourceId(p225w4.k.f29265j3, p225w4.g.f28864o);
        this.f17560y = typedArrayI.getDimensionPixelOffset(p225w4.k.f29245h3, p225w4.c.f28755Z);
        int i12 = p225w4.k.f29255i3;
        if (typedArrayI.hasValue(i12)) {
            this.f17561z = ColorStateList.valueOf(typedArrayI.getColor(i12, 0));
        }
        this.f17554A = typedArrayI.getColor(p225w4.k.f29275k3, 0);
        this.f17555B = K4.c.a(context2, typedArrayI, p225w4.k.f29285l3);
        this.f17557v = (AccessibilityManager) context2.getSystemService("accessibility");
        androidx.appcompat.widget.z zVar = new androidx.appcompat.widget.z(context2);
        this.f17556u = zVar;
        zVar.J(true);
        zVar.D(this);
        zVar.I(2);
        zVar.p(getAdapter());
        zVar.L(new a());
        int i13 = p225w4.k.f29295m3;
        if (typedArrayI.hasValue(i13)) {
            setSimpleItems(typedArrayI.getResourceId(i13, 0));
        }
        typedArrayI.recycle();
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new b(getContext(), this.f17559x, strArr));
    }
}
