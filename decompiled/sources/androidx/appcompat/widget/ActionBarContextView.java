package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends AbstractC1004a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private View f10579A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private View f10580B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private View f10581C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private LinearLayout f10582D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private TextView f10583E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private TextView f10584F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f10585G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f10586H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f10587I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f10588J;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private CharSequence f10589y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private CharSequence f10590z;

    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ androidx.appcompat.view.b f10591q;

        a(androidx.appcompat.view.b bVar) {
            this.f10591q = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f10591q.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    private void i() {
        if (this.f10582D == null) {
            LayoutInflater.from(getContext()).inflate(p050f.g.f20456a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f10582D = linearLayout;
            this.f10583E = (TextView) linearLayout.findViewById(p050f.f.f20434e);
            this.f10584F = (TextView) this.f10582D.findViewById(p050f.f.f20433d);
            if (this.f10585G != 0) {
                this.f10583E.setTextAppearance(getContext(), this.f10585G);
            }
            if (this.f10586H != 0) {
                this.f10584F.setTextAppearance(getContext(), this.f10586H);
            }
        }
        this.f10583E.setText(this.f10589y);
        this.f10584F.setText(this.f10590z);
        boolean zIsEmpty = TextUtils.isEmpty(this.f10589y);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f10590z);
        this.f10584F.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f10582D.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f10582D.getParent() == null) {
            addView(this.f10582D);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC1004a
    public /* bridge */ /* synthetic */ androidx.core.view.O f(int i10, long j9) {
        return super.f(i10, j9);
    }

    public void g() {
        if (this.f10579A == null) {
            k();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.AbstractC1004a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.AbstractC1004a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f10590z;
    }

    public CharSequence getTitle() {
        return this.f10589y;
    }

    public void h(androidx.appcompat.view.b bVar) {
        View view = this.f10579A;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f10588J, (ViewGroup) this, false);
            this.f10579A = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f10579A);
        }
        View viewFindViewById = this.f10579A.findViewById(p050f.f.f20438i);
        this.f10580B = viewFindViewById;
        viewFindViewById.setOnClickListener(new a(bVar));
        androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) bVar.e();
        C1006c c1006c = this.f11029t;
        if (c1006c != null) {
            c1006c.y();
        }
        C1006c c1006c2 = new C1006c(getContext());
        this.f11029t = c1006c2;
        c1006c2.J(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        eVar.c(this.f11029t, this.f11027r);
        ActionMenuView actionMenuView = (ActionMenuView) this.f11029t.o(this);
        this.f11028s = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f11028s, layoutParams);
    }

    public boolean j() {
        return this.f10587I;
    }

    public void k() {
        removeAllViews();
        this.f10581C = null;
        this.f11028s = null;
        this.f11029t = null;
        View view = this.f10580B;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public boolean l() {
        C1006c c1006c = this.f11029t;
        if (c1006c != null) {
            return c1006c.K();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1006c c1006c = this.f11029t;
        if (c1006c != null) {
            c1006c.B();
            this.f11029t.C();
        }
    }

    @Override // androidx.appcompat.widget.AbstractC1004a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        boolean zB = Q.b(this);
        int paddingRight = zB ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f10579A;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f10579A.getLayoutParams();
            int i14 = zB ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = zB ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iD = AbstractC1004a.d(paddingRight, i14, zB);
            paddingRight = AbstractC1004a.d(iD + e(this.f10579A, iD, paddingTop, paddingTop2, zB), i15, zB);
        }
        int iE = paddingRight;
        LinearLayout linearLayout = this.f10582D;
        if (linearLayout != null && this.f10581C == null && linearLayout.getVisibility() != 8) {
            iE += e(this.f10582D, iE, paddingTop, paddingTop2, zB);
        }
        View view2 = this.f10581C;
        if (view2 != null) {
            e(view2, iE, paddingTop, paddingTop2, zB);
        }
        int paddingLeft = zB ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.f11028s;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zB);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int i12 = BasicMeasure.EXACTLY;
        if (mode != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i11) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = this.f11030u;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i11);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f10579A;
        if (view != null) {
            int iC = c(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f10579A.getLayoutParams();
            paddingLeft = iC - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f11028s;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = c(this.f11028s, paddingLeft, iMakeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f10582D;
        if (linearLayout != null && this.f10581C == null) {
            if (this.f10587I) {
                this.f10582D.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f10582D.getMeasuredWidth();
                boolean z9 = measuredWidth <= paddingLeft;
                if (z9) {
                    paddingLeft -= measuredWidth;
                }
                this.f10582D.setVisibility(z9 ? 0 : 8);
            } else {
                paddingLeft = c(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        View view2 = this.f10581C;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i13 = layoutParams.width;
            int i14 = i13 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i13 >= 0) {
                paddingLeft = Math.min(i13, paddingLeft);
            }
            int i15 = layoutParams.height;
            if (i15 == -2) {
                i12 = Integer.MIN_VALUE;
            }
            if (i15 >= 0) {
                iMin = Math.min(i15, iMin);
            }
            this.f10581C.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i14), View.MeasureSpec.makeMeasureSpec(iMin, i12));
        }
        if (this.f11030u > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            int measuredHeight = getChildAt(i17).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i16) {
                i16 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i16);
    }

    @Override // androidx.appcompat.widget.AbstractC1004a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.AbstractC1004a
    public void setContentHeight(int i10) {
        this.f11030u = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f10581C;
        if (view2 != null) {
            removeView(view2);
        }
        this.f10581C = view;
        if (view != null && (linearLayout = this.f10582D) != null) {
            removeView(linearLayout);
            this.f10582D = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f10590z = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f10589y = charSequence;
        i();
        androidx.core.view.H.j0(this, charSequence);
    }

    public void setTitleOptional(boolean z9) {
        if (z9 != this.f10587I) {
            requestLayout();
        }
        this.f10587I = z9;
    }

    @Override // androidx.appcompat.widget.AbstractC1004a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p050f.a.f20343i);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        J jV = J.v(context, attributeSet, p050f.j.f20715y, i10, 0);
        setBackground(jV.g(p050f.j.f20720z));
        this.f10585G = jV.n(p050f.j.f20503D, 0);
        this.f10586H = jV.n(p050f.j.f20499C, 0);
        this.f11030u = jV.m(p050f.j.f20495B, 0);
        this.f10588J = jV.n(p050f.j.f20490A, p050f.g.f20459d);
        jV.x();
    }
}
