package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.O;
import androidx.core.view.C1069a;
import androidx.core.view.H;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends d implements androidx.appcompat.view.menu.k.a {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private static final int[] f17001W = {R.attr.state_checked};

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private int f17002L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private boolean f17003M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    boolean f17004N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    boolean f17005O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final CheckedTextView f17006P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private FrameLayout f17007Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private androidx.appcompat.view.menu.g f17008R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private ColorStateList f17009S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f17010T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private Drawable f17011U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final C1069a f17012V;

    class a extends C1069a {
        a() {
        }

        @Override // androidx.core.view.C1069a
        public void onInitializeAccessibilityNodeInfo(View view, C0.d dVar) {
            super.onInitializeAccessibilityNodeInfo(view, dVar);
            dVar.e0(NavigationMenuItemView.this.f17004N);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void B() {
        if (D()) {
            this.f17006P.setVisibility(8);
            FrameLayout frameLayout = this.f17007Q;
            if (frameLayout != null) {
                LinearLayoutCompat.a aVar = (LinearLayoutCompat.a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) aVar).width = -1;
                this.f17007Q.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.f17006P.setVisibility(0);
        FrameLayout frameLayout2 = this.f17007Q;
        if (frameLayout2 != null) {
            LinearLayoutCompat.a aVar2 = (LinearLayoutCompat.a) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) aVar2).width = -2;
            this.f17007Q.setLayoutParams(aVar2);
        }
    }

    private StateListDrawable C() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(p050f.a.f20356v, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f17001W, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    private boolean D() {
        return this.f17008R.getTitle() == null && this.f17008R.getIcon() == null && this.f17008R.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f17007Q == null) {
                this.f17007Q = (FrameLayout) ((ViewStub) findViewById(p225w4.e.f28828g)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f17007Q.removeAllViews();
            this.f17007Q.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void e(androidx.appcompat.view.menu.g gVar, int i10) {
        this.f17008R = gVar;
        if (gVar.getItemId() > 0) {
            setId(gVar.getItemId());
        }
        setVisibility(gVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            H.k0(this, C());
        }
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setTitle(gVar.getTitle());
        setIcon(gVar.getIcon());
        setActionView(gVar.getActionView());
        setContentDescription(gVar.getContentDescription());
        O.a(this, gVar.getTooltipText());
        B();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public androidx.appcompat.view.menu.g getItemData() {
        return this.f17008R;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        androidx.appcompat.view.menu.g gVar = this.f17008R;
        if (gVar != null && gVar.isCheckable() && this.f17008R.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f17001W);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z9) {
        refreshDrawableState();
        if (this.f17004N != z9) {
            this.f17004N = z9;
            this.f17012V.sendAccessibilityEvent(this.f17006P, RecyclerView.ItemAnimator.FLAG_MOVED);
        }
    }

    public void setChecked(boolean z9) {
        refreshDrawableState();
        this.f17006P.setChecked(z9);
        CheckedTextView checkedTextView = this.f17006P;
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z9 && this.f17005O) ? 1 : 0);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, getPaddingTop(), i10, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f17010T) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = p201u0.a.r(drawable).mutate();
                p201u0.a.o(drawable, this.f17009S);
            }
            int i10 = this.f17002L;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.f17003M) {
            if (this.f17011U == null) {
                Drawable drawableE = p181s0.h.e(getResources(), p225w4.d.f28800j, getContext().getTheme());
                this.f17011U = drawableE;
                if (drawableE != null) {
                    int i11 = this.f17002L;
                    drawableE.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.f17011U;
        }
        androidx.core.widget.l.i(this.f17006P, drawable, null, null, null);
    }

    public void setIconPadding(int i10) {
        this.f17006P.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(int i10) {
        this.f17002L = i10;
    }

    void setIconTintList(ColorStateList colorStateList) {
        this.f17009S = colorStateList;
        this.f17010T = colorStateList != null;
        androidx.appcompat.view.menu.g gVar = this.f17008R;
        if (gVar != null) {
            setIcon(gVar.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.f17006P.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z9) {
        this.f17003M = z9;
    }

    public void setTextAppearance(int i10) {
        androidx.core.widget.l.o(this.f17006P, i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f17006P.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f17006P.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f17005O = true;
        a aVar = new a();
        this.f17012V = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(p225w4.g.f28855f, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(p225w4.c.f28760c));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(p225w4.e.f28829h);
        this.f17006P = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        H.g0(checkedTextView, aVar);
    }
}
