package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements androidx.appcompat.view.menu.e.b, androidx.appcompat.view.menu.k {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private androidx.appcompat.view.menu.e f10631F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private Context f10632G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f10633H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f10634I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private C1006c f10635J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private androidx.appcompat.view.menu.j.a f10636K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    androidx.appcompat.view.menu.e.a f10637L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private boolean f10638M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f10639N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f10640O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private int f10641P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    e f10642Q;

    public interface a {
        boolean a();

        boolean b();
    }

    private static class b implements androidx.appcompat.view.menu.j.a {
        b() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void c(androidx.appcompat.view.menu.e eVar, boolean z9) {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean d(androidx.appcompat.view.menu.e eVar) {
            return false;
        }
    }

    public static class c extends LinearLayoutCompat.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f10643a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10644b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f10645c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f10646d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f10647e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f10648f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super((ViewGroup.LayoutParams) cVar);
            this.f10643a = cVar.f10643a;
        }

        public c(int i10, int i11) {
            super(i10, i11);
            this.f10643a = false;
        }
    }

    private class d implements androidx.appcompat.view.menu.e.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            e eVar2 = ActionMenuView.this.f10642Q;
            return eVar2 != null && eVar2.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.e.a aVar = ActionMenuView.this.f10637L;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    static int L(View view, int i10, int i11, int i12, int i13) {
        int i14;
        c cVar = (c) view.getLayoutParams();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i12) - i13, View.MeasureSpec.getMode(i12));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z9 = false;
        boolean z10 = actionMenuItemView != null && actionMenuItemView.s();
        if (i11 > 0) {
            i14 = 2;
            if (!z10 || i11 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i11 * i10, Integer.MIN_VALUE), iMakeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i15 = measuredWidth / i10;
                if (measuredWidth % i10 != 0) {
                    i15++;
                }
                if (!z10 || i15 >= 2) {
                    i14 = i15;
                }
            } else {
                i14 = 0;
            }
        } else {
            i14 = 0;
        }
        if (!cVar.f10643a && z10) {
            z9 = true;
        }
        cVar.f10646d = z9;
        cVar.f10644b = i14;
        view.measure(View.MeasureSpec.makeMeasureSpec(i10 * i14, BasicMeasure.EXACTLY), iMakeMeasureSpec);
        return i14;
    }

    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v48 */
    private void M(int i10, int i11) {
        long j9;
        int i12;
        boolean z9;
        ?? r9;
        int i13;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingTop, -2);
        int i14 = size - paddingLeft;
        int i15 = this.f10640O;
        int i16 = i14 / i15;
        int i17 = i14 % i15;
        if (i16 == 0) {
            setMeasuredDimension(i14, 0);
            return;
        }
        int i18 = i15 + (i17 / i16);
        int childCount = getChildCount();
        int iMax = 0;
        int i19 = 0;
        boolean z10 = false;
        int i20 = 0;
        int iMax2 = 0;
        int i21 = 0;
        long j10 = 0;
        while (i19 < childCount) {
            View childAt = getChildAt(i19);
            int i22 = size2;
            if (childAt.getVisibility() == 8) {
                i13 = i18;
            } else {
                boolean z11 = childAt instanceof ActionMenuItemView;
                i20++;
                if (z11) {
                    int i23 = this.f10641P;
                    r9 = 0;
                    childAt.setPadding(i23, 0, i23, 0);
                } else {
                    r9 = 0;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f10648f = r9;
                cVar.f10645c = r9;
                cVar.f10644b = r9;
                cVar.f10646d = r9;
                ((LinearLayout.LayoutParams) cVar).leftMargin = r9;
                ((LinearLayout.LayoutParams) cVar).rightMargin = r9;
                cVar.f10647e = z11 && ((ActionMenuItemView) childAt).s();
                int iL = L(childAt, i18, cVar.f10643a ? 1 : i16, childMeasureSpec, paddingTop);
                iMax2 = Math.max(iMax2, iL);
                i13 = i18;
                if (cVar.f10646d) {
                    i21++;
                }
                if (cVar.f10643a) {
                    z10 = true;
                }
                i16 -= iL;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (iL == 1) {
                    j10 |= (long) (1 << i19);
                }
            }
            i19++;
            size2 = i22;
            i18 = i13;
        }
        int i24 = size2;
        int i25 = i18;
        char c10 = 2;
        boolean z12 = z10 && i20 == 2;
        boolean z13 = false;
        while (true) {
            if (i21 <= 0 || i16 <= 0) {
                j9 = 1;
                break;
            }
            int i26 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
            long j11 = 0;
            char c11 = c10;
            int i27 = 0;
            int i28 = 0;
            j9 = 1;
            while (i28 < childCount) {
                c cVar2 = (c) getChildAt(i28).getLayoutParams();
                boolean z14 = z12;
                if (cVar2.f10646d) {
                    int i29 = cVar2.f10644b;
                    if (i29 < i26) {
                        j11 = 1 << i28;
                        i26 = i29;
                        i27 = 1;
                    } else if (i29 == i26) {
                        j11 |= 1 << i28;
                        i27++;
                    }
                }
                i28++;
                z12 = z14;
            }
            boolean z15 = z12;
            j10 |= j11;
            if (i27 > i16) {
                break;
            }
            int i30 = i26 + 1;
            int i31 = 0;
            while (i31 < childCount) {
                View childAt2 = getChildAt(i31);
                c cVar3 = (c) childAt2.getLayoutParams();
                long j12 = 1 << i31;
                if ((j11 & j12) == 0) {
                    if (cVar3.f10644b == i30) {
                        j10 |= j12;
                    }
                    i31 = i31;
                } else {
                    if (!z15 || !cVar3.f10647e) {
                        z9 = true;
                    } else if (i16 == 1) {
                        int i32 = this.f10641P;
                        z9 = true;
                        childAt2.setPadding(i32 + i25, 0, i32, 0);
                    } else {
                        z9 = true;
                    }
                    cVar3.f10644b++;
                    cVar3.f10648f = z9;
                    i16--;
                }
                i31++;
            }
            c10 = c11;
            z12 = z15;
            z13 = true;
        }
        boolean z16 = !z10 && i20 == 1;
        if (i16 <= 0 || j10 == 0 || (i16 >= i20 - 1 && !z16 && iMax2 <= 1)) {
            i12 = 0;
        } else {
            float fBitCount = Long.bitCount(j10);
            if (z16) {
                i12 = 0;
            } else {
                if ((j10 & j9) != 0) {
                    i12 = 0;
                    if (!((c) getChildAt(0).getLayoutParams()).f10647e) {
                        fBitCount -= 0.5f;
                    }
                } else {
                    i12 = 0;
                }
                int i33 = childCount - 1;
                if ((j10 & ((long) (1 << i33))) != 0 && !((c) getChildAt(i33).getLayoutParams()).f10647e) {
                    fBitCount -= 0.5f;
                }
            }
            int i34 = fBitCount > 0.0f ? (int) ((i16 * i25) / fBitCount) : i12;
            boolean z17 = z13;
            for (int i35 = i12; i35 < childCount; i35++) {
                if ((j10 & ((long) (1 << i35))) != 0) {
                    View childAt3 = getChildAt(i35);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f10645c = i34;
                        cVar4.f10648f = true;
                        if (i35 == 0 && !cVar4.f10647e) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = (-i34) / 2;
                        }
                        z17 = true;
                    } else if (cVar4.f10643a) {
                        cVar4.f10645c = i34;
                        cVar4.f10648f = true;
                        ((LinearLayout.LayoutParams) cVar4).rightMargin = (-i34) / 2;
                        z17 = true;
                    } else {
                        if (i35 != 0) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = i34 / 2;
                        }
                        if (i35 != childCount - 1) {
                            ((LinearLayout.LayoutParams) cVar4).rightMargin = i34 / 2;
                        }
                    }
                }
            }
            z13 = z17;
        }
        if (z13) {
            for (int i36 = i12; i36 < childCount; i36++) {
                View childAt4 = getChildAt(i36);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f10648f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f10644b * i25) + cVar5.f10645c, BasicMeasure.EXACTLY), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i14, mode != 1073741824 ? iMax : i24);
    }

    public void B() {
        C1006c c1006c = this.f10635J;
        if (c1006c != null) {
            c1006c.y();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public c generateDefaultLayoutParams() {
        c cVar = new c(-2, -2);
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) cVar).gravity = 16;
        }
        return cVar;
    }

    public c F() {
        c cVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        cVarGenerateDefaultLayoutParams.f10643a = true;
        return cVarGenerateDefaultLayoutParams;
    }

    protected boolean G(int i10) {
        boolean zA = false;
        if (i10 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i10 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof a)) {
            zA = ((a) childAt).a();
        }
        return (i10 <= 0 || !(childAt2 instanceof a)) ? zA : ((a) childAt2).b() | zA;
    }

    public boolean H() {
        C1006c c1006c = this.f10635J;
        return c1006c != null && c1006c.B();
    }

    public boolean I() {
        C1006c c1006c = this.f10635J;
        return c1006c != null && c1006c.D();
    }

    public boolean J() {
        C1006c c1006c = this.f10635J;
        return c1006c != null && c1006c.E();
    }

    public boolean K() {
        return this.f10634I;
    }

    public androidx.appcompat.view.menu.e N() {
        return this.f10631F;
    }

    public void O(androidx.appcompat.view.menu.j.a aVar, androidx.appcompat.view.menu.e.a aVar2) {
        this.f10636K = aVar;
        this.f10637L = aVar2;
    }

    public boolean P() {
        C1006c c1006c = this.f10635J;
        return c1006c != null && c1006c.K();
    }

    @Override // androidx.appcompat.view.menu.e.b
    public boolean a(androidx.appcompat.view.menu.g gVar) {
        return this.f10631F.M(gVar, 0);
    }

    @Override // androidx.appcompat.view.menu.k
    public void b(androidx.appcompat.view.menu.e eVar) {
        this.f10631F = eVar;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f10631F == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
            this.f10631F = eVar;
            eVar.S(new d());
            C1006c c1006c = new C1006c(context);
            this.f10635J = c1006c;
            c1006c.J(true);
            C1006c c1006c2 = this.f10635J;
            androidx.appcompat.view.menu.j.a bVar = this.f10636K;
            if (bVar == null) {
                bVar = new b();
            }
            c1006c2.h(bVar);
            this.f10631F.c(this.f10635J, this.f10632G);
            this.f10635J.H(this);
        }
        return this.f10631F;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f10635J.A();
    }

    public int getPopupTheme() {
        return this.f10633H;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C1006c c1006c = this.f10635J;
        if (c1006c != null) {
            c1006c.d(false);
            if (this.f10635J.E()) {
                this.f10635J.B();
                this.f10635J.K();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        B();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        int width;
        int paddingLeft;
        if (!this.f10638M) {
            super.onLayout(z9, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i14 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i15 = i12 - i10;
        int paddingRight = (i15 - getPaddingRight()) - getPaddingLeft();
        boolean zB = Q.b(this);
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f10643a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (G(i18)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zB) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i19 = i14 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i19, width, measuredHeight + i19);
                    paddingRight -= measuredWidth;
                    i16 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    G(i18);
                    i17++;
                }
            }
        }
        if (childCount == 1 && i16 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i20 = (i15 / 2) - (measuredWidth2 / 2);
            int i21 = i14 - (measuredHeight2 / 2);
            childAt2.layout(i20, i21, measuredWidth2 + i20, measuredHeight2 + i21);
            return;
        }
        int i22 = i17 - (i16 ^ 1);
        int iMax = Math.max(0, i22 > 0 ? paddingRight / i22 : 0);
        if (zB) {
            int width2 = getWidth() - getPaddingRight();
            for (int i23 = 0; i23 < childCount; i23++) {
                View childAt3 = getChildAt(i23);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f10643a) {
                    int i24 = width2 - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i25 = i14 - (measuredHeight3 / 2);
                    childAt3.layout(i24 - measuredWidth3, i25, i24, measuredHeight3 + i25);
                    width2 = i24 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt4 = getChildAt(i26);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f10643a) {
                int i27 = paddingLeft2 + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i28 = i14 - (measuredHeight4 / 2);
                childAt4.layout(i27, i28, i27 + measuredWidth4, measuredHeight4 + i28);
                paddingLeft2 = i27 + measuredWidth4 + ((LinearLayout.LayoutParams) cVar3).rightMargin + iMax;
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int i10, int i11) {
        androidx.appcompat.view.menu.e eVar;
        boolean z9 = this.f10638M;
        boolean z10 = View.MeasureSpec.getMode(i10) == 1073741824;
        this.f10638M = z10;
        if (z9 != z10) {
            this.f10639N = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.f10638M && (eVar = this.f10631F) != null && size != this.f10639N) {
            this.f10639N = size;
            eVar.L(true);
        }
        int childCount = getChildCount();
        if (this.f10638M && childCount > 0) {
            M(i10, i11);
            return;
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            c cVar = (c) getChildAt(i12).getLayoutParams();
            ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
            ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
        }
        super.onMeasure(i10, i11);
    }

    public void setExpandedActionViewsExclusive(boolean z9) {
        this.f10635J.G(z9);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.f10642Q = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f10635J.I(drawable);
    }

    public void setOverflowReserved(boolean z9) {
        this.f10634I = z9;
    }

    public void setPopupTheme(int i10) {
        if (this.f10633H != i10) {
            this.f10633H = i10;
            if (i10 == 0) {
                this.f10632G = getContext();
            } else {
                this.f10632G = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setPresenter(C1006c c1006c) {
        this.f10635J = c1006c;
        c1006c.H(this);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f10640O = (int) (56.0f * f10);
        this.f10641P = (int) (f10 * 4.0f);
        this.f10632G = context;
        this.f10633H = 0;
    }
}
