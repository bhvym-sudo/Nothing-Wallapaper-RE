package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.AbstractC1077i;
import androidx.core.view.C1082n;
import androidx.core.view.InterfaceC1081m;
import androidx.core.view.InterfaceC1084p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup implements InterfaceC1081m {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f10966A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f10967B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f10968C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    int f10969D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f10970E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f10971F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f10972G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f10973H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f10974I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private D f10975J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f10976K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private int f10977L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f10978M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private CharSequence f10979N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private CharSequence f10980O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private ColorStateList f10981P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private ColorStateList f10982Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private boolean f10983R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f10984S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final ArrayList f10985T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final ArrayList f10986U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private final int[] f10987V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    final C1082n f10988W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private ArrayList f10989a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    h f10990b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final ActionMenuView.e f10991c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private N f10992d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private C1006c f10993e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private f f10994f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private androidx.appcompat.view.menu.j.a f10995g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    androidx.appcompat.view.menu.e.a f10996h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private boolean f10997i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private OnBackInvokedCallback f10998j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private OnBackInvokedDispatcher f10999k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private boolean f11000l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private final Runnable f11001m0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    ActionMenuView f11002q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private TextView f11003r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private TextView f11004s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ImageButton f11005t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ImageView f11006u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Drawable f11007v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private CharSequence f11008w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    ImageButton f11009x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    View f11010y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Context f11011z;

    class a implements ActionMenuView.e {
        a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.f10988W.d(menuItem)) {
                return true;
            }
            h hVar = Toolbar.this.f10990b0;
            if (hVar != null) {
                return hVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.S();
        }
    }

    class c implements androidx.appcompat.view.menu.e.a {
        c() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            androidx.appcompat.view.menu.e.a aVar = Toolbar.this.f10996h0;
            return aVar != null && aVar.a(eVar, menuItem);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (!Toolbar.this.f11002q.J()) {
                Toolbar.this.f10988W.e(eVar);
            }
            androidx.appcompat.view.menu.e.a aVar = Toolbar.this.f10996h0;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    static class e {
        static OnBackInvokedDispatcher a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        static OnBackInvokedCallback b(final Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new OnBackInvokedCallback() { // from class: androidx.appcompat.widget.M
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }

        static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        static void d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    private class f implements androidx.appcompat.view.menu.j {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        androidx.appcompat.view.menu.e f11016q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        androidx.appcompat.view.menu.g f11017r;

        f() {
        }

        @Override // androidx.appcompat.view.menu.j
        public void c(androidx.appcompat.view.menu.e eVar, boolean z9) {
        }

        @Override // androidx.appcompat.view.menu.j
        public void d(boolean z9) {
            if (this.f11017r != null) {
                androidx.appcompat.view.menu.e eVar = this.f11016q;
                if (eVar != null) {
                    int size = eVar.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f11016q.getItem(i10) == this.f11017r) {
                            return;
                        }
                    }
                }
                f(this.f11016q, this.f11017r);
            }
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean e() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean f(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            KeyEvent.Callback callback = Toolbar.this.f11010y;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).f();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f11010y);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f11009x);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f11010y = null;
            toolbar3.a();
            this.f11017r = null;
            Toolbar.this.requestLayout();
            gVar.q(false);
            Toolbar.this.T();
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean g(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            Toolbar.this.h();
            ViewParent parent = Toolbar.this.f11009x.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f11009x);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f11009x);
            }
            Toolbar.this.f11010y = gVar.getActionView();
            this.f11017r = gVar;
            ViewParent parent2 = Toolbar.this.f11010y.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f11010y);
                }
                g gVarGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                gVarGenerateDefaultLayoutParams.f10093a = (toolbar4.f10969D & 112) | 8388611;
                gVarGenerateDefaultLayoutParams.f11019b = 2;
                toolbar4.f11010y.setLayoutParams(gVarGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f11010y);
            }
            Toolbar.this.K();
            Toolbar.this.requestLayout();
            gVar.q(true);
            KeyEvent.Callback callback = Toolbar.this.f11010y;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).c();
            }
            Toolbar.this.T();
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public void i(Context context, androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.g gVar;
            androidx.appcompat.view.menu.e eVar2 = this.f11016q;
            if (eVar2 != null && (gVar = this.f11017r) != null) {
                eVar2.f(gVar);
            }
            this.f11016q = eVar;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean k(androidx.appcompat.view.menu.m mVar) {
            return false;
        }
    }

    public interface h {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p050f.a.f20334N);
    }

    private boolean A(View view) {
        return view.getParent() == this || this.f10986U.contains(view);
    }

    private int E(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - iArr[0];
        int iMax = i10 + Math.max(0, i12);
        iArr[0] = Math.max(0, -i12);
        int iR = r(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iR, iMax + measuredWidth, view.getMeasuredHeight() + iR);
        return iMax + measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).rightMargin;
    }

    private int F(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - iArr[1];
        int iMax = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int iR = r(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iR, iMax, view.getMeasuredHeight() + iR);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).leftMargin);
    }

    private int G(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i14) + Math.max(0, i15);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + iMax + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    private void H(View view, int i10, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i14 >= 0) {
            if (mode != 0) {
                i14 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i14);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, BasicMeasure.EXACTLY);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void I() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.f10988W.b(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f10989a0 = currentMenuItems2;
    }

    private void J() {
        removeCallbacks(this.f11001m0);
        post(this.f11001m0);
    }

    private boolean Q() {
        if (!this.f10997i0) {
            return false;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (R(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean R(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private void b(List list, int i10) {
        boolean z9 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int iB = AbstractC1077i.b(i10, getLayoutDirection());
        list.clear();
        if (!z9) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f11019b == 0 && R(childAt) && q(gVar.f10093a) == iB) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            View childAt2 = getChildAt(i12);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.f11019b == 0 && R(childAt2) && q(gVar2.f10093a) == iB) {
                list.add(childAt2);
            }
        }
    }

    private void c(View view, boolean z9) {
        g gVarGenerateLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            gVarGenerateLayoutParams = generateDefaultLayoutParams();
        } else {
            gVarGenerateLayoutParams = !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (g) layoutParams;
        }
        gVarGenerateLayoutParams.f11019b = 1;
        if (!z9 || this.f11010y == null) {
            addView(view, gVarGenerateLayoutParams);
        } else {
            view.setLayoutParams(gVarGenerateLayoutParams);
            this.f10986U.add(view);
        }
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new androidx.appcompat.view.g(getContext());
    }

    private void i() {
        if (this.f10975J == null) {
            this.f10975J = new D();
        }
    }

    private void j() {
        if (this.f11006u == null) {
            this.f11006u = new AppCompatImageView(getContext());
        }
    }

    private void k() {
        l();
        if (this.f11002q.N() == null) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) this.f11002q.getMenu();
            if (this.f10994f0 == null) {
                this.f10994f0 = new f();
            }
            this.f11002q.setExpandedActionViewsExclusive(true);
            eVar.c(this.f10994f0, this.f11011z);
            T();
        }
    }

    private void l() {
        if (this.f11002q == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f11002q = actionMenuView;
            actionMenuView.setPopupTheme(this.f10966A);
            this.f11002q.setOnMenuItemClickListener(this.f10991c0);
            this.f11002q.O(this.f10995g0, new c());
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f10093a = (this.f10969D & 112) | 8388613;
            this.f11002q.setLayoutParams(gVarGenerateDefaultLayoutParams);
            c(this.f11002q, false);
        }
    }

    private void m() {
        if (this.f11005t == null) {
            this.f11005t = new AppCompatImageButton(getContext(), null, p050f.a.f20333M);
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f10093a = (this.f10969D & 112) | 8388611;
            this.f11005t.setLayoutParams(gVarGenerateDefaultLayoutParams);
        }
    }

    private int q(int i10) {
        int layoutDirection = getLayoutDirection();
        int iB = AbstractC1077i.b(i10, layoutDirection) & 7;
        if (iB == 1 || iB == 3 || iB == 5) {
            return iB;
        }
        return layoutDirection == 1 ? 5 : 3;
    }

    private int r(View view, int i10) {
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int iS = s(gVar.f10093a);
        if (iS == 48) {
            return getPaddingTop() - i11;
        }
        if (iS == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
        if (iMax < i12) {
            iMax = i12;
        } else {
            int i13 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i14 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
            if (i13 < i14) {
                iMax = Math.max(0, iMax - (i14 - i13));
            }
        }
        return paddingTop + iMax;
    }

    private int s(int i10) {
        int i11 = i10 & 112;
        return (i11 == 16 || i11 == 48 || i11 == 80) ? i11 : this.f10978M & 112;
    }

    private int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    private int u(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int v(List list, int[] iArr) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int size = list.size();
        int i12 = 0;
        int measuredWidth = 0;
        while (i12 < size) {
            View view = (View) list.get(i12);
            g gVar = (g) view.getLayoutParams();
            int i13 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - i10;
            int i14 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - i11;
            int iMax = Math.max(0, i13);
            int iMax2 = Math.max(0, i14);
            int iMax3 = Math.max(0, -i13);
            int iMax4 = Math.max(0, -i14);
            measuredWidth += iMax + view.getMeasuredWidth() + iMax2;
            i12++;
            i11 = iMax4;
            i10 = iMax3;
        }
        return measuredWidth;
    }

    public boolean B() {
        ActionMenuView actionMenuView = this.f11002q;
        return actionMenuView != null && actionMenuView.I();
    }

    public boolean C() {
        ActionMenuView actionMenuView = this.f11002q;
        return actionMenuView != null && actionMenuView.J();
    }

    @Override // androidx.core.view.InterfaceC1081m
    public void D(InterfaceC1084p interfaceC1084p) {
        this.f10988W.a(interfaceC1084p);
    }

    void K() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((g) childAt.getLayoutParams()).f11019b != 2 && childAt != this.f11002q) {
                removeViewAt(childCount);
                this.f10986U.add(childAt);
            }
        }
    }

    public void L(int i10, int i11) {
        i();
        this.f10975J.g(i10, i11);
    }

    public void M(androidx.appcompat.view.menu.e eVar, C1006c c1006c) {
        if (eVar == null && this.f11002q == null) {
            return;
        }
        l();
        androidx.appcompat.view.menu.e eVarN = this.f11002q.N();
        if (eVarN == eVar) {
            return;
        }
        if (eVarN != null) {
            eVarN.P(this.f10993e0);
            eVarN.P(this.f10994f0);
        }
        if (this.f10994f0 == null) {
            this.f10994f0 = new f();
        }
        c1006c.G(true);
        if (eVar != null) {
            eVar.c(c1006c, this.f11011z);
            eVar.c(this.f10994f0, this.f11011z);
        } else {
            c1006c.i(this.f11011z, null);
            this.f10994f0.i(this.f11011z, null);
            c1006c.d(true);
            this.f10994f0.d(true);
        }
        this.f11002q.setPopupTheme(this.f10966A);
        this.f11002q.setPresenter(c1006c);
        this.f10993e0 = c1006c;
        T();
    }

    public void N(androidx.appcompat.view.menu.j.a aVar, androidx.appcompat.view.menu.e.a aVar2) {
        this.f10995g0 = aVar;
        this.f10996h0 = aVar2;
        ActionMenuView actionMenuView = this.f11002q;
        if (actionMenuView != null) {
            actionMenuView.O(aVar, aVar2);
        }
    }

    public void O(Context context, int i10) {
        this.f10968C = i10;
        TextView textView = this.f11004s;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public void P(Context context, int i10) {
        this.f10967B = i10;
        TextView textView = this.f11003r;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public boolean S() {
        ActionMenuView actionMenuView = this.f11002q;
        return actionMenuView != null && actionMenuView.P();
    }

    void T() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedDispatcher onBackInvokedDispatcherA = e.a(this);
        boolean z9 = w() && onBackInvokedDispatcherA != null && isAttachedToWindow() && this.f11000l0;
        if (z9 && this.f10999k0 == null) {
            if (this.f10998j0 == null) {
                this.f10998j0 = e.b(new Runnable() { // from class: androidx.appcompat.widget.K
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10804q.e();
                    }
                });
            }
            e.c(onBackInvokedDispatcherA, this.f10998j0);
            this.f10999k0 = onBackInvokedDispatcherA;
            return;
        }
        if (z9 || (onBackInvokedDispatcher = this.f10999k0) == null) {
            return;
        }
        e.d(onBackInvokedDispatcher, this.f10998j0);
        this.f10999k0 = null;
    }

    void a() {
        for (int size = this.f10986U.size() - 1; size >= 0; size--) {
            addView((View) this.f10986U.get(size));
        }
        this.f10986U.clear();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g);
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f11002q) != null && actionMenuView.K();
    }

    public void e() {
        f fVar = this.f10994f0;
        androidx.appcompat.view.menu.g gVar = fVar == null ? null : fVar.f11017r;
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f11002q;
        if (actionMenuView != null) {
            actionMenuView.B();
        }
    }

    @Override // androidx.core.view.InterfaceC1081m
    public void g(InterfaceC1084p interfaceC1084p) {
        this.f10988W.f(interfaceC1084p);
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f11009x;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f11009x;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        D d10 = this.f10975J;
        if (d10 != null) {
            return d10.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.f10977L;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        D d10 = this.f10975J;
        if (d10 != null) {
            return d10.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        D d10 = this.f10975J;
        if (d10 != null) {
            return d10.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        D d10 = this.f10975J;
        if (d10 != null) {
            return d10.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.f10976K;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.e eVarN;
        ActionMenuView actionMenuView = this.f11002q;
        return (actionMenuView == null || (eVarN = actionMenuView.N()) == null || !eVarN.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f10977L, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f10976K, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f11006u;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f11006u;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        k();
        return this.f11002q.getMenu();
    }

    View getNavButtonView() {
        return this.f11005t;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f11005t;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f11005t;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    C1006c getOuterActionMenuPresenter() {
        return this.f10993e0;
    }

    public Drawable getOverflowIcon() {
        k();
        return this.f11002q.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f11011z;
    }

    public int getPopupTheme() {
        return this.f10966A;
    }

    public CharSequence getSubtitle() {
        return this.f10980O;
    }

    final TextView getSubtitleTextView() {
        return this.f11004s;
    }

    public CharSequence getTitle() {
        return this.f10979N;
    }

    public int getTitleMarginBottom() {
        return this.f10974I;
    }

    public int getTitleMarginEnd() {
        return this.f10972G;
    }

    public int getTitleMarginStart() {
        return this.f10971F;
    }

    public int getTitleMarginTop() {
        return this.f10973H;
    }

    final TextView getTitleTextView() {
        return this.f11003r;
    }

    public u getWrapper() {
        if (this.f10992d0 == null) {
            this.f10992d0 = new N(this, true);
        }
        return this.f10992d0;
    }

    void h() {
        if (this.f11009x == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, p050f.a.f20333M);
            this.f11009x = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f11007v);
            this.f11009x.setContentDescription(this.f11008w);
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f10093a = (this.f10969D & 112) | 8388611;
            gVarGenerateDefaultLayoutParams.f11019b = 2;
            this.f11009x.setLayoutParams(gVarGenerateDefaultLayoutParams);
            this.f11009x.setOnClickListener(new d());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public g generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        T();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f11001m0);
        T();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f10984S = false;
        }
        if (!this.f10984S) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f10984S = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f10984S = false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0281  */
    /* JADX WARN: Code duplicated, block: B:102:0x0284  */
    /* JADX WARN: Code duplicated, block: B:105:0x0298 A[LOOP:0: B:104:0x0296->B:105:0x0298, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:108:0x02b6 A[LOOP:1: B:107:0x02b4->B:108:0x02b6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:112:0x02de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:114:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:117:0x02ed A[LOOP:2: B:116:0x02eb->B:117:0x02ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0062  */
    /* JADX WARN: Code duplicated, block: B:21:0x0069  */
    /* JADX WARN: Code duplicated, block: B:24:0x0077 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0079  */
    /* JADX WARN: Code duplicated, block: B:26:0x0080  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:42:0x0104  */
    /* JADX WARN: Code duplicated, block: B:43:0x011d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0127 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0129  */
    /* JADX WARN: Code duplicated, block: B:50:0x012c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0130  */
    /* JADX WARN: Code duplicated, block: B:53:0x0133  */
    /* JADX WARN: Code duplicated, block: B:56:0x0145  */
    /* JADX WARN: Code duplicated, block: B:58:0x014d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:65:0x0166  */
    /* JADX WARN: Code duplicated, block: B:67:0x016a  */
    /* JADX WARN: Code duplicated, block: B:69:0x017d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0180  */
    /* JADX WARN: Code duplicated, block: B:72:0x018c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0198  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:77:0x01af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:83:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:86:0x0212  */
    /* JADX WARN: Code duplicated, block: B:88:0x0215  */
    /* JADX WARN: Code duplicated, block: B:90:0x021e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0220  */
    /* JADX WARN: Code duplicated, block: B:93:0x0225  */
    /* JADX WARN: Code duplicated, block: B:96:0x0239  */
    /* JADX WARN: Code duplicated, block: B:97:0x025c  */
    /* JADX WARN: Code duplicated, block: B:99:0x025f  */
    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        int iE;
        int iF;
        int iMax;
        int iMin;
        boolean zR;
        boolean zR2;
        int measuredHeight;
        TextView textView;
        TextView textView2;
        g gVar;
        g gVar2;
        int i14;
        boolean z10;
        int i15;
        int i16;
        int paddingTop;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int iMax2;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int size;
        int iE2;
        int i29;
        int size2;
        int i30;
        int i31;
        int i32;
        int size3;
        boolean z11 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i33 = width - paddingRight;
        int[] iArr = this.f10987V;
        iArr[1] = 0;
        iArr[0] = 0;
        int iW = androidx.core.view.H.w(this);
        int iMin2 = iW >= 0 ? Math.min(iW, i13 - i11) : 0;
        if (R(this.f11005t)) {
            if (z11) {
                iF = F(this.f11005t, i33, iArr, iMin2);
                iE = paddingLeft;
            } else {
                iE = E(this.f11005t, paddingLeft, iArr, iMin2);
            }
            if (R(this.f11009x)) {
                if (z11) {
                    iF = F(this.f11009x, iF, iArr, iMin2);
                } else {
                    iE = E(this.f11009x, iE, iArr, iMin2);
                }
            }
            if (R(this.f11002q)) {
                if (z11) {
                    iE = E(this.f11002q, iE, iArr, iMin2);
                } else {
                    iF = F(this.f11002q, iF, iArr, iMin2);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iE);
            iArr[1] = Math.max(0, currentContentInsetRight - (i33 - iF));
            iMax = Math.max(iE, currentContentInsetLeft);
            iMin = Math.min(iF, i33 - currentContentInsetRight);
            if (R(this.f11010y)) {
                if (z11) {
                    iMin = F(this.f11010y, iMin, iArr, iMin2);
                } else {
                    iMax = E(this.f11010y, iMax, iArr, iMin2);
                }
            }
            if (R(this.f11006u)) {
                if (z11) {
                    iMin = F(this.f11006u, iMin, iArr, iMin2);
                } else {
                    iMax = E(this.f11006u, iMax, iArr, iMin2);
                }
            }
            zR = R(this.f11003r);
            zR2 = R(this.f11004s);
            if (zR) {
                g gVar3 = (g) this.f11003r.getLayoutParams();
                measuredHeight = ((ViewGroup.MarginLayoutParams) gVar3).bottomMargin + ((ViewGroup.MarginLayoutParams) gVar3).topMargin + this.f11003r.getMeasuredHeight();
            } else {
                measuredHeight = 0;
            }
            if (zR2) {
                g gVar4 = (g) this.f11004s.getLayoutParams();
                measuredHeight += ((ViewGroup.MarginLayoutParams) gVar4).topMargin + this.f11004s.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar4).bottomMargin;
            }
            if (!zR || zR2) {
                if (zR) {
                    textView = this.f11003r;
                } else {
                    textView = this.f11004s;
                }
                if (zR2) {
                    textView2 = this.f11004s;
                } else {
                    textView2 = this.f11003r;
                }
                gVar = (g) textView.getLayoutParams();
                gVar2 = (g) textView2.getLayoutParams();
                i14 = measuredHeight;
                z10 = (!zR && this.f11003r.getMeasuredWidth() > 0) || (zR2 && this.f11004s.getMeasuredWidth() > 0);
                i15 = this.f10978M & 112;
                i16 = iMax;
                if (i15 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + this.f10973H;
                } else if (i15 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - i14) / 2;
                    i24 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
                    i25 = this.f10973H;
                    if (iMax2 < i24 + i25) {
                        iMax2 = i24 + i25;
                    } else {
                        i26 = (((height - paddingBottom) - i14) - iMax2) - paddingTop2;
                        i27 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                        i28 = this.f10974I;
                        if (i26 < i27 + i28) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) gVar2).bottomMargin + i28) - i26));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin) - this.f10974I) - i14;
                }
                if (z11) {
                    if (z10) {
                        i21 = this.f10971F;
                    } else {
                        i21 = 0;
                    }
                    int i34 = i21 - iArr[1];
                    iMin -= Math.max(0, i34);
                    iArr[1] = Math.max(0, -i34);
                    if (zR) {
                        g gVar5 = (g) this.f11003r.getLayoutParams();
                        int measuredWidth = iMin - this.f11003r.getMeasuredWidth();
                        int measuredHeight2 = this.f11003r.getMeasuredHeight() + paddingTop;
                        this.f11003r.layout(measuredWidth, paddingTop, iMin, measuredHeight2);
                        i22 = measuredWidth - this.f10972G;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) gVar5).bottomMargin;
                    } else {
                        i22 = iMin;
                    }
                    if (zR2) {
                        int i35 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f11004s.getLayoutParams())).topMargin;
                        this.f11004s.layout(iMin - this.f11004s.getMeasuredWidth(), i35, iMin, this.f11004s.getMeasuredHeight() + i35);
                        i23 = iMin - this.f10972G;
                    } else {
                        i23 = iMin;
                    }
                    if (z10) {
                        iMin = Math.min(i22, i23);
                    }
                    iMax = i16;
                    i18 = 0;
                } else {
                    if (z10) {
                        i17 = this.f10971F;
                    } else {
                        i17 = 0;
                    }
                    i18 = 0;
                    int i36 = i17 - iArr[0];
                    iMax = i16 + Math.max(0, i36);
                    iArr[0] = Math.max(0, -i36);
                    if (zR) {
                        g gVar6 = (g) this.f11003r.getLayoutParams();
                        int measuredWidth2 = this.f11003r.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.f11003r.getMeasuredHeight() + paddingTop;
                        this.f11003r.layout(iMax, paddingTop, measuredWidth2, measuredHeight3);
                        i19 = measuredWidth2 + this.f10972G;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) gVar6).bottomMargin;
                    } else {
                        i19 = iMax;
                    }
                    if (zR2) {
                        int i37 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f11004s.getLayoutParams())).topMargin;
                        int measuredWidth3 = this.f11004s.getMeasuredWidth() + iMax;
                        this.f11004s.layout(iMax, i37, measuredWidth3, this.f11004s.getMeasuredHeight() + i37);
                        i20 = measuredWidth3 + this.f10972G;
                    } else {
                        i20 = iMax;
                    }
                    if (z10) {
                        iMax = Math.max(i19, i20);
                    }
                }
            } else {
                i18 = 0;
            }
            b(this.f10985T, 3);
            size = this.f10985T.size();
            iE2 = iMax;
            for (i29 = i18; i29 < size; i29++) {
                iE2 = E((View) this.f10985T.get(i29), iE2, iArr, iMin2);
            }
            b(this.f10985T, 5);
            size2 = this.f10985T.size();
            for (i30 = i18; i30 < size2; i30++) {
                iMin = F((View) this.f10985T.get(i30), iMin, iArr, iMin2);
            }
            b(this.f10985T, 1);
            int iV = v(this.f10985T, iArr);
            i31 = (paddingLeft + (((width - paddingLeft) - paddingRight) / 2)) - (iV / 2);
            i32 = iV + i31;
            if (i31 >= iE2) {
                if (i32 > iMin) {
                    iE2 = i31 - (i32 - iMin);
                } else {
                    iE2 = i31;
                }
            }
            size3 = this.f10985T.size();
            while (i18 < size3) {
                iE2 = E((View) this.f10985T.get(i18), iE2, iArr, iMin2);
                i18++;
            }
            this.f10985T.clear();
        }
        iE = paddingLeft;
        iF = i33;
        if (R(this.f11009x)) {
            if (z11) {
                iF = F(this.f11009x, iF, iArr, iMin2);
            } else {
                iE = E(this.f11009x, iE, iArr, iMin2);
            }
        }
        if (R(this.f11002q)) {
            if (z11) {
                iE = E(this.f11002q, iE, iArr, iMin2);
            } else {
                iF = F(this.f11002q, iF, iArr, iMin2);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iE);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i33 - iF));
        iMax = Math.max(iE, currentContentInsetLeft2);
        iMin = Math.min(iF, i33 - currentContentInsetRight2);
        if (R(this.f11010y)) {
            if (z11) {
                iMin = F(this.f11010y, iMin, iArr, iMin2);
            } else {
                iMax = E(this.f11010y, iMax, iArr, iMin2);
            }
        }
        if (R(this.f11006u)) {
            if (z11) {
                iMin = F(this.f11006u, iMin, iArr, iMin2);
            } else {
                iMax = E(this.f11006u, iMax, iArr, iMin2);
            }
        }
        zR = R(this.f11003r);
        zR2 = R(this.f11004s);
        if (zR) {
            g gVar7 = (g) this.f11003r.getLayoutParams();
            measuredHeight = ((ViewGroup.MarginLayoutParams) gVar7).bottomMargin + ((ViewGroup.MarginLayoutParams) gVar7).topMargin + this.f11003r.getMeasuredHeight();
        } else {
            measuredHeight = 0;
        }
        if (zR2) {
            g gVar8 = (g) this.f11004s.getLayoutParams();
            measuredHeight += ((ViewGroup.MarginLayoutParams) gVar8).topMargin + this.f11004s.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar8).bottomMargin;
        }
        if (zR) {
            if (zR) {
                textView = this.f11003r;
            } else {
                textView = this.f11004s;
            }
            if (zR2) {
                textView2 = this.f11004s;
            } else {
                textView2 = this.f11003r;
            }
            gVar = (g) textView.getLayoutParams();
            gVar2 = (g) textView2.getLayoutParams();
            i14 = measuredHeight;
            if (zR) {
            }
            i15 = this.f10978M & 112;
            i16 = iMax;
            if (i15 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + this.f10973H;
            } else if (i15 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i14) / 2;
                i24 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
                i25 = this.f10973H;
                if (iMax2 < i24 + i25) {
                    iMax2 = i24 + i25;
                } else {
                    i26 = (((height - paddingBottom) - i14) - iMax2) - paddingTop2;
                    i27 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                    i28 = this.f10974I;
                    if (i26 < i27 + i28) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) gVar2).bottomMargin + i28) - i26));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin) - this.f10974I) - i14;
            }
            if (z11) {
                if (z10) {
                    i21 = this.f10971F;
                } else {
                    i21 = 0;
                }
                int i38 = i21 - iArr[1];
                iMin -= Math.max(0, i38);
                iArr[1] = Math.max(0, -i38);
                if (zR) {
                    g gVar9 = (g) this.f11003r.getLayoutParams();
                    int measuredWidth4 = iMin - this.f11003r.getMeasuredWidth();
                    int measuredHeight4 = this.f11003r.getMeasuredHeight() + paddingTop;
                    this.f11003r.layout(measuredWidth4, paddingTop, iMin, measuredHeight4);
                    i22 = measuredWidth4 - this.f10972G;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) gVar9).bottomMargin;
                } else {
                    i22 = iMin;
                }
                if (zR2) {
                    int i39 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f11004s.getLayoutParams())).topMargin;
                    this.f11004s.layout(iMin - this.f11004s.getMeasuredWidth(), i39, iMin, this.f11004s.getMeasuredHeight() + i39);
                    i23 = iMin - this.f10972G;
                } else {
                    i23 = iMin;
                }
                if (z10) {
                    iMin = Math.min(i22, i23);
                }
                iMax = i16;
                i18 = 0;
            } else {
                if (z10) {
                    i17 = this.f10971F;
                } else {
                    i17 = 0;
                }
                i18 = 0;
                int i310 = i17 - iArr[0];
                iMax = i16 + Math.max(0, i310);
                iArr[0] = Math.max(0, -i310);
                if (zR) {
                    g gVar10 = (g) this.f11003r.getLayoutParams();
                    int measuredWidth5 = this.f11003r.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.f11003r.getMeasuredHeight() + paddingTop;
                    this.f11003r.layout(iMax, paddingTop, measuredWidth5, measuredHeight5);
                    i19 = measuredWidth5 + this.f10972G;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) gVar10).bottomMargin;
                } else {
                    i19 = iMax;
                }
                if (zR2) {
                    int i311 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f11004s.getLayoutParams())).topMargin;
                    int measuredWidth6 = this.f11004s.getMeasuredWidth() + iMax;
                    this.f11004s.layout(iMax, i311, measuredWidth6, this.f11004s.getMeasuredHeight() + i311);
                    i20 = measuredWidth6 + this.f10972G;
                } else {
                    i20 = iMax;
                }
                if (z10) {
                    iMax = Math.max(i19, i20);
                }
            }
        } else {
            if (zR) {
                textView = this.f11003r;
            } else {
                textView = this.f11004s;
            }
            if (zR2) {
                textView2 = this.f11004s;
            } else {
                textView2 = this.f11003r;
            }
            gVar = (g) textView.getLayoutParams();
            gVar2 = (g) textView2.getLayoutParams();
            i14 = measuredHeight;
            if (zR) {
            }
            i15 = this.f10978M & 112;
            i16 = iMax;
            if (i15 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + this.f10973H;
            } else if (i15 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i14) / 2;
                i24 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
                i25 = this.f10973H;
                if (iMax2 < i24 + i25) {
                    iMax2 = i24 + i25;
                } else {
                    i26 = (((height - paddingBottom) - i14) - iMax2) - paddingTop2;
                    i27 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                    i28 = this.f10974I;
                    if (i26 < i27 + i28) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) gVar2).bottomMargin + i28) - i26));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin) - this.f10974I) - i14;
            }
            if (z11) {
                if (z10) {
                    i21 = this.f10971F;
                } else {
                    i21 = 0;
                }
                int i312 = i21 - iArr[1];
                iMin -= Math.max(0, i312);
                iArr[1] = Math.max(0, -i312);
                if (zR) {
                    g gVar11 = (g) this.f11003r.getLayoutParams();
                    int measuredWidth7 = iMin - this.f11003r.getMeasuredWidth();
                    int measuredHeight6 = this.f11003r.getMeasuredHeight() + paddingTop;
                    this.f11003r.layout(measuredWidth7, paddingTop, iMin, measuredHeight6);
                    i22 = measuredWidth7 - this.f10972G;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) gVar11).bottomMargin;
                } else {
                    i22 = iMin;
                }
                if (zR2) {
                    int i313 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f11004s.getLayoutParams())).topMargin;
                    this.f11004s.layout(iMin - this.f11004s.getMeasuredWidth(), i313, iMin, this.f11004s.getMeasuredHeight() + i313);
                    i23 = iMin - this.f10972G;
                } else {
                    i23 = iMin;
                }
                if (z10) {
                    iMin = Math.min(i22, i23);
                }
                iMax = i16;
                i18 = 0;
            } else {
                if (z10) {
                    i17 = this.f10971F;
                } else {
                    i17 = 0;
                }
                i18 = 0;
                int i314 = i17 - iArr[0];
                iMax = i16 + Math.max(0, i314);
                iArr[0] = Math.max(0, -i314);
                if (zR) {
                    g gVar12 = (g) this.f11003r.getLayoutParams();
                    int measuredWidth8 = this.f11003r.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.f11003r.getMeasuredHeight() + paddingTop;
                    this.f11003r.layout(iMax, paddingTop, measuredWidth8, measuredHeight7);
                    i19 = measuredWidth8 + this.f10972G;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) gVar12).bottomMargin;
                } else {
                    i19 = iMax;
                }
                if (zR2) {
                    int i315 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f11004s.getLayoutParams())).topMargin;
                    int measuredWidth9 = this.f11004s.getMeasuredWidth() + iMax;
                    this.f11004s.layout(iMax, i315, measuredWidth9, this.f11004s.getMeasuredHeight() + i315);
                    i20 = measuredWidth9 + this.f10972G;
                } else {
                    i20 = iMax;
                }
                if (z10) {
                    iMax = Math.max(i19, i20);
                }
            }
        }
        b(this.f10985T, 3);
        size = this.f10985T.size();
        iE2 = iMax;
        while (i29 < size) {
            iE2 = E((View) this.f10985T.get(i29), iE2, iArr, iMin2);
        }
        b(this.f10985T, 5);
        size2 = this.f10985T.size();
        while (i30 < size2) {
            iMin = F((View) this.f10985T.get(i30), iMin, iArr, iMin2);
        }
        b(this.f10985T, 1);
        int iV2 = v(this.f10985T, iArr);
        i31 = (paddingLeft + (((width - paddingLeft) - paddingRight) / 2)) - (iV2 / 2);
        i32 = iV2 + i31;
        if (i31 >= iE2) {
            if (i32 > iMin) {
                iE2 = i31 - (i32 - iMin);
            } else {
                iE2 = i31;
            }
        }
        size3 = this.f10985T.size();
        while (i18 < size3) {
            iE2 = E((View) this.f10985T.get(i18), iE2, iArr, iMin2);
            i18++;
        }
        this.f10985T.clear();
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int[] iArr;
        int iMax2;
        int iCombineMeasuredStates2;
        int measuredHeight;
        int[] iArr2 = this.f10987V;
        boolean zB = Q.b(this);
        int i12 = !zB ? 1 : 0;
        if (R(this.f11005t)) {
            H(this.f11005t, i10, 0, i11, 0, this.f10970E);
            measuredWidth = this.f11005t.getMeasuredWidth() + t(this.f11005t);
            iMax = Math.max(0, this.f11005t.getMeasuredHeight() + u(this.f11005t));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f11005t.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (R(this.f11009x)) {
            H(this.f11009x, i10, 0, i11, 0, this.f10970E);
            measuredWidth = this.f11009x.getMeasuredWidth() + t(this.f11009x);
            iMax = Math.max(iMax, this.f11009x.getMeasuredHeight() + u(this.f11009x));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f11009x.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, measuredWidth);
        iArr2[zB ? 1 : 0] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (R(this.f11002q)) {
            H(this.f11002q, i10, iMax3, i11, 0, this.f10970E);
            measuredWidth2 = this.f11002q.getMeasuredWidth() + t(this.f11002q);
            iMax = Math.max(iMax, this.f11002q.getMeasuredHeight() + u(this.f11002q));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f11002q.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr2[i12] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (R(this.f11010y)) {
            iArr = iArr2;
            iMax4 += G(this.f11010y, i10, iMax4, i11, 0, iArr);
            iMax = Math.max(iMax, this.f11010y.getMeasuredHeight() + u(this.f11010y));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f11010y.getMeasuredState());
        } else {
            iArr = iArr2;
        }
        if (R(this.f11006u)) {
            iMax4 += G(this.f11006u, i10, iMax4, i11, 0, iArr);
            iMax = Math.max(iMax, this.f11006u.getMeasuredHeight() + u(this.f11006u));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f11006u.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((g) childAt.getLayoutParams()).f11019b == 0 && R(childAt)) {
                iMax4 += G(childAt, i10, iMax4, i11, 0, iArr);
                int iMax5 = Math.max(iMax, childAt.getMeasuredHeight() + u(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax5;
            } else {
                iMax4 = iMax4;
            }
        }
        int i14 = iMax4;
        int i15 = this.f10973H + this.f10974I;
        int i16 = this.f10971F + this.f10972G;
        if (R(this.f11003r)) {
            G(this.f11003r, i10, i14 + i16, i11, i15, iArr);
            int measuredWidth3 = this.f11003r.getMeasuredWidth() + t(this.f11003r);
            int measuredHeight2 = this.f11003r.getMeasuredHeight() + u(this.f11003r);
            iMax2 = measuredWidth3;
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f11003r.getMeasuredState());
            measuredHeight = measuredHeight2;
        } else {
            iMax2 = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            measuredHeight = 0;
        }
        if (R(this.f11004s)) {
            iMax2 = Math.max(iMax2, G(this.f11004s, i10, i14 + i16, i11, i15 + measuredHeight, iArr));
            measuredHeight += this.f11004s.getMeasuredHeight() + u(this.f11004s);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f11004s.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i14 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, (-16777216) & iCombineMeasuredStates2), Q() ? 0 : View.resolveSizeAndState(Math.max(Math.max(iMax, measuredHeight) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.getSuperState());
        ActionMenuView actionMenuView = this.f11002q;
        androidx.appcompat.view.menu.e eVarN = actionMenuView != null ? actionMenuView.N() : null;
        int i10 = iVar.f11020q;
        if (i10 != 0 && this.f10994f0 != null && eVarN != null && (menuItemFindItem = eVarN.findItem(i10)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (iVar.f11021r) {
            J();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        i();
        this.f10975J.f(i10 == 1);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.g gVar;
        i iVar = new i(super.onSaveInstanceState());
        f fVar = this.f10994f0;
        if (fVar != null && (gVar = fVar.f11017r) != null) {
            iVar.f11020q = gVar.getItemId();
        }
        iVar.f11021r = C();
        return iVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f10983R = false;
        }
        if (!this.f10983R) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f10983R = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f10983R = false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof g) {
            return new g((g) layoutParams);
        }
        if (layoutParams instanceof androidx.appcompat.app.a.C0360a) {
            return new g((androidx.appcompat.app.a.C0360a) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new g((ViewGroup.MarginLayoutParams) layoutParams) : new g(layoutParams);
    }

    public void setBackInvokedCallbackEnabled(boolean z9) {
        if (this.f11000l0 != z9) {
            this.f11000l0 = z9;
            T();
        }
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(p060g.a.b(getContext(), i10));
    }

    public void setCollapsible(boolean z9) {
        this.f10997i0 = z9;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f10977L) {
            this.f10977L = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f10976K) {
            this.f10976K = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(p060g.a.b(getContext(), i10));
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(p060g.a.b(getContext(), i10));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m();
        this.f11005t.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
        this.f10990b0 = hVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        k();
        this.f11002q.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f10966A != i10) {
            this.f10966A = i10;
            if (i10 == 0) {
                this.f11011z = getContext();
            } else {
                this.f11011z = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitleMarginBottom(int i10) {
        this.f10974I = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f10972G = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f10971F = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f10973H = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public boolean w() {
        f fVar = this.f10994f0;
        return (fVar == null || fVar.f11017r == null) ? false : true;
    }

    public boolean x() {
        ActionMenuView actionMenuView = this.f11002q;
        return actionMenuView != null && actionMenuView.H();
    }

    public void y(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    public void z() {
        Iterator it = this.f10989a0.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        I();
    }

    public static class g extends androidx.appcompat.app.a.C0360a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f11019b;

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f11019b = 0;
        }

        void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public g(int i10, int i11) {
            super(i10, i11);
            this.f11019b = 0;
            this.f10093a = 8388627;
        }

        public g(g gVar) {
            super((androidx.appcompat.app.a.C0360a) gVar);
            this.f11019b = 0;
            this.f11019b = gVar.f11019b;
        }

        public g(androidx.appcompat.app.a.C0360a c0360a) {
            super(c0360a);
            this.f11019b = 0;
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f11019b = 0;
            a(marginLayoutParams);
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f11019b = 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f10978M = 8388627;
        this.f10985T = new ArrayList();
        this.f10986U = new ArrayList();
        this.f10987V = new int[2];
        this.f10988W = new C1082n(new Runnable() { // from class: androidx.appcompat.widget.L
            @Override // java.lang.Runnable
            public final void run() {
                this.f10805q.z();
            }
        });
        this.f10989a0 = new ArrayList();
        this.f10991c0 = new a();
        this.f11001m0 = new b();
        Context context2 = getContext();
        int[] iArr = p050f.j.f20542M2;
        J jV = J.v(context2, attributeSet, iArr, i10, 0);
        androidx.core.view.H.e0(this, context, iArr, attributeSet, jV.r(), i10, 0);
        this.f10967B = jV.n(p050f.j.f20669o3, 0);
        this.f10968C = jV.n(p050f.j.f20624f3, 0);
        this.f10978M = jV.l(p050f.j.f20546N2, this.f10978M);
        this.f10969D = jV.l(p050f.j.f20550O2, 48);
        int iE = jV.e(p050f.j.f20639i3, 0);
        int i11 = p050f.j.f20664n3;
        iE = jV.s(i11) ? jV.e(i11, iE) : iE;
        this.f10974I = iE;
        this.f10973H = iE;
        this.f10972G = iE;
        this.f10971F = iE;
        int iE2 = jV.e(p050f.j.f20654l3, -1);
        if (iE2 >= 0) {
            this.f10971F = iE2;
        }
        int iE3 = jV.e(p050f.j.f20649k3, -1);
        if (iE3 >= 0) {
            this.f10972G = iE3;
        }
        int iE4 = jV.e(p050f.j.f20659m3, -1);
        if (iE4 >= 0) {
            this.f10973H = iE4;
        }
        int iE5 = jV.e(p050f.j.f20644j3, -1);
        if (iE5 >= 0) {
            this.f10974I = iE5;
        }
        this.f10970E = jV.f(p050f.j.f20594Z2, -1);
        int iE6 = jV.e(p050f.j.f20578V2, Integer.MIN_VALUE);
        int iE7 = jV.e(p050f.j.f20562R2, Integer.MIN_VALUE);
        int iF = jV.f(p050f.j.f20570T2, 0);
        int iF2 = jV.f(p050f.j.f20574U2, 0);
        i();
        this.f10975J.e(iF, iF2);
        if (iE6 != Integer.MIN_VALUE || iE7 != Integer.MIN_VALUE) {
            this.f10975J.g(iE6, iE7);
        }
        this.f10976K = jV.e(p050f.j.f20582W2, Integer.MIN_VALUE);
        this.f10977L = jV.e(p050f.j.f20566S2, Integer.MIN_VALUE);
        this.f11007v = jV.g(p050f.j.f20558Q2);
        this.f11008w = jV.p(p050f.j.f20554P2);
        CharSequence charSequenceP = jV.p(p050f.j.f20634h3);
        if (!TextUtils.isEmpty(charSequenceP)) {
            setTitle(charSequenceP);
        }
        CharSequence charSequenceP2 = jV.p(p050f.j.f20619e3);
        if (!TextUtils.isEmpty(charSequenceP2)) {
            setSubtitle(charSequenceP2);
        }
        this.f11011z = getContext();
        setPopupTheme(jV.n(p050f.j.f20614d3, 0));
        Drawable drawableG = jV.g(p050f.j.f20609c3);
        if (drawableG != null) {
            setNavigationIcon(drawableG);
        }
        CharSequence charSequenceP3 = jV.p(p050f.j.f20604b3);
        if (!TextUtils.isEmpty(charSequenceP3)) {
            setNavigationContentDescription(charSequenceP3);
        }
        Drawable drawableG2 = jV.g(p050f.j.f20586X2);
        if (drawableG2 != null) {
            setLogo(drawableG2);
        }
        CharSequence charSequenceP4 = jV.p(p050f.j.f20590Y2);
        if (!TextUtils.isEmpty(charSequenceP4)) {
            setLogoDescription(charSequenceP4);
        }
        int i12 = p050f.j.f20674p3;
        if (jV.s(i12)) {
            setTitleTextColor(jV.c(i12));
        }
        int i13 = p050f.j.f20629g3;
        if (jV.s(i13)) {
            setSubtitleTextColor(jV.c(i13));
        }
        int i14 = p050f.j.f20599a3;
        if (jV.s(i14)) {
            y(jV.n(i14, 0));
        }
        jV.x();
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            h();
        }
        ImageButton imageButton = this.f11009x;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            h();
            this.f11009x.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f11009x;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f11007v);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            j();
            if (!A(this.f11006u)) {
                c(this.f11006u, true);
            }
        } else {
            ImageView imageView = this.f11006u;
            if (imageView != null && A(imageView)) {
                removeView(this.f11006u);
                this.f10986U.remove(this.f11006u);
            }
        }
        ImageView imageView2 = this.f11006u;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            j();
        }
        ImageView imageView = this.f11006u;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m();
        }
        ImageButton imageButton = this.f11005t;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            O.a(this.f11005t, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m();
            if (!A(this.f11005t)) {
                c(this.f11005t, true);
            }
        } else {
            ImageButton imageButton = this.f11005t;
            if (imageButton != null && A(imageButton)) {
                removeView(this.f11005t);
                this.f10986U.remove(this.f11005t);
            }
        }
        ImageButton imageButton2 = this.f11005t;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f11004s;
            if (textView != null && A(textView)) {
                removeView(this.f11004s);
                this.f10986U.remove(this.f11004s);
            }
        } else {
            if (this.f11004s == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f11004s = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f11004s.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f10968C;
                if (i10 != 0) {
                    this.f11004s.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f10982Q;
                if (colorStateList != null) {
                    this.f11004s.setTextColor(colorStateList);
                }
            }
            if (!A(this.f11004s)) {
                c(this.f11004s, true);
            }
        }
        TextView textView2 = this.f11004s;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f10980O = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f10982Q = colorStateList;
        TextView textView = this.f11004s;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f11003r;
            if (textView != null && A(textView)) {
                removeView(this.f11003r);
                this.f10986U.remove(this.f11003r);
            }
        } else {
            if (this.f11003r == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f11003r = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f11003r.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f10967B;
                if (i10 != 0) {
                    this.f11003r.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f10981P;
                if (colorStateList != null) {
                    this.f11003r.setTextColor(colorStateList);
                }
            }
            if (!A(this.f11003r)) {
                c(this.f11003r, true);
            }
        }
        TextView textView2 = this.f11003r;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f10979N = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f10981P = colorStateList;
        TextView textView = this.f11003r;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public static class i extends H0.a {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f11020q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f11021r;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public i[] newArray(int i10) {
                return new i[i10];
            }
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f11020q = parcel.readInt();
            this.f11021r = parcel.readInt() != 0;
        }

        @Override // H0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f11020q);
            parcel.writeInt(this.f11021r ? 1 : 0);
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
