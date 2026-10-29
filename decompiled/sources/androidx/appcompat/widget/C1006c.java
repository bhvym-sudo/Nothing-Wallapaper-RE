package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.core.view.AbstractC1070b;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.appcompat.widget.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1006c extends androidx.appcompat.view.menu.a implements AbstractC1070b.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    d f11038A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private Drawable f11039B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f11040C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f11041D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f11042E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f11043F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f11044G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f11045H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f11046I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f11047J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f11048K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f11049L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f11050M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final SparseBooleanArray f11051N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    e f11052O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    a f11053P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    RunnableC0364c f11054Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private b f11055R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    final f f11056S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    int f11057T;

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$a */
    private class a extends androidx.appcompat.view.menu.i {
        public a(Context context, androidx.appcompat.view.menu.m mVar, View view) {
            super(context, mVar, view, false, p050f.a.f20345k);
            if (!((androidx.appcompat.view.menu.g) mVar.getItem()).l()) {
                View view2 = C1006c.this.f11038A;
                f(view2 == null ? (View) ((androidx.appcompat.view.menu.a) C1006c.this).f10411y : view2);
            }
            j(C1006c.this.f11056S);
        }

        @Override // androidx.appcompat.view.menu.i
        protected void e() {
            C1006c c1006c = C1006c.this;
            c1006c.f11053P = null;
            c1006c.f11057T = 0;
            super.e();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$b */
    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public p100k.e a() {
            a aVar = C1006c.this.f11053P;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$c, reason: collision with other inner class name */
    private class RunnableC0364c implements Runnable {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private e f11060q;

        public RunnableC0364c(e eVar) {
            this.f11060q = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((androidx.appcompat.view.menu.a) C1006c.this).f10405s != null) {
                ((androidx.appcompat.view.menu.a) C1006c.this).f10405s.d();
            }
            View view = (View) ((androidx.appcompat.view.menu.a) C1006c.this).f10411y;
            if (view != null && view.getWindowToken() != null && this.f11060q.m()) {
                C1006c.this.f11052O = this.f11060q;
            }
            C1006c.this.f11054Q = null;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$d */
    private class d extends AppCompatImageView implements ActionMenuView.a {

        /* JADX INFO: renamed from: androidx.appcompat.widget.c$d$a */
        class a extends y {

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            final /* synthetic */ C1006c f11064z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, C1006c c1006c) {
                super(view);
                this.f11064z = c1006c;
            }

            @Override // androidx.appcompat.widget.y
            public p100k.e b() {
                e eVar = C1006c.this.f11052O;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // androidx.appcompat.widget.y
            public boolean c() {
                C1006c.this.K();
                return true;
            }

            @Override // androidx.appcompat.widget.y
            public boolean d() {
                C1006c c1006c = C1006c.this;
                if (c1006c.f11054Q != null) {
                    return false;
                }
                c1006c.B();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, p050f.a.f20344j);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            O.a(this, getContentDescription());
            setOnTouchListener(new a(this, C1006c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C1006c.this.K();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                p201u0.a.l(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$e */
    private class e extends androidx.appcompat.view.menu.i {
        public e(Context context, androidx.appcompat.view.menu.e eVar, View view, boolean z9) {
            super(context, eVar, view, z9, p050f.a.f20345k);
            h(8388613);
            j(C1006c.this.f11056S);
        }

        @Override // androidx.appcompat.view.menu.i
        protected void e() {
            if (((androidx.appcompat.view.menu.a) C1006c.this).f10405s != null) {
                ((androidx.appcompat.view.menu.a) C1006c.this).f10405s.close();
            }
            C1006c.this.f11052O = null;
            super.e();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$f */
    private class f implements androidx.appcompat.view.menu.j.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void c(androidx.appcompat.view.menu.e eVar, boolean z9) {
            if (eVar instanceof androidx.appcompat.view.menu.m) {
                eVar.D().e(false);
            }
            androidx.appcompat.view.menu.j.a aVarM = C1006c.this.m();
            if (aVarM != null) {
                aVarM.c(eVar, z9);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean d(androidx.appcompat.view.menu.e eVar) {
            if (eVar == ((androidx.appcompat.view.menu.a) C1006c.this).f10405s) {
                return false;
            }
            C1006c.this.f11057T = ((androidx.appcompat.view.menu.m) eVar).getItem().getItemId();
            androidx.appcompat.view.menu.j.a aVarM = C1006c.this.m();
            if (aVarM != null) {
                return aVarM.d(eVar);
            }
            return false;
        }
    }

    public C1006c(Context context) {
        super(context, p050f.g.f20458c, p050f.g.f20457b);
        this.f11051N = new SparseBooleanArray();
        this.f11056S = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View z(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f10411y;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof androidx.appcompat.view.menu.k.a) && ((androidx.appcompat.view.menu.k.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public Drawable A() {
        d dVar = this.f11038A;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f11040C) {
            return this.f11039B;
        }
        return null;
    }

    public boolean B() {
        Object obj;
        RunnableC0364c runnableC0364c = this.f11054Q;
        if (runnableC0364c != null && (obj = this.f10411y) != null) {
            ((View) obj).removeCallbacks(runnableC0364c);
            this.f11054Q = null;
            return true;
        }
        e eVar = this.f11052O;
        if (eVar == null) {
            return false;
        }
        eVar.b();
        return true;
    }

    public boolean C() {
        a aVar = this.f11053P;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean D() {
        return this.f11054Q != null || E();
    }

    public boolean E() {
        e eVar = this.f11052O;
        return eVar != null && eVar.d();
    }

    public void F(Configuration configuration) {
        if (!this.f11046I) {
            this.f11045H = androidx.appcompat.view.a.b(this.f10404r).d();
        }
        androidx.appcompat.view.menu.e eVar = this.f10405s;
        if (eVar != null) {
            eVar.L(true);
        }
    }

    public void G(boolean z9) {
        this.f11049L = z9;
    }

    public void H(ActionMenuView actionMenuView) {
        this.f10411y = actionMenuView;
        actionMenuView.b(this.f10405s);
    }

    public void I(Drawable drawable) {
        d dVar = this.f11038A;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.f11040C = true;
            this.f11039B = drawable;
        }
    }

    public void J(boolean z9) {
        this.f11041D = z9;
        this.f11042E = true;
    }

    public boolean K() {
        androidx.appcompat.view.menu.e eVar;
        if (!this.f11041D || E() || (eVar = this.f10405s) == null || this.f10411y == null || this.f11054Q != null || eVar.z().isEmpty()) {
            return false;
        }
        RunnableC0364c runnableC0364c = new RunnableC0364c(new e(this.f10404r, this.f10405s, this.f11038A, true));
        this.f11054Q = runnableC0364c;
        ((View) this.f10411y).post(runnableC0364c);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a
    public void b(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.k.a aVar) {
        aVar.e(gVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f10411y);
        if (this.f11055R == null) {
            this.f11055R = new b();
        }
        actionMenuItemView.setPopupCallback(this.f11055R);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void c(androidx.appcompat.view.menu.e eVar, boolean z9) {
        y();
        super.c(eVar, z9);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void d(boolean z9) {
        super.d(z9);
        ((View) this.f10411y).requestLayout();
        androidx.appcompat.view.menu.e eVar = this.f10405s;
        boolean z10 = false;
        if (eVar != null) {
            ArrayList arrayListS = eVar.s();
            int size = arrayListS.size();
            for (int i10 = 0; i10 < size; i10++) {
                AbstractC1070b abstractC1070bB = ((androidx.appcompat.view.menu.g) arrayListS.get(i10)).b();
                if (abstractC1070bB != null) {
                    abstractC1070bB.h(this);
                }
            }
        }
        androidx.appcompat.view.menu.e eVar2 = this.f10405s;
        ArrayList arrayListZ = eVar2 != null ? eVar2.z() : null;
        if (this.f11041D && arrayListZ != null) {
            int size2 = arrayListZ.size();
            if (size2 == 1) {
                z10 = !((androidx.appcompat.view.menu.g) arrayListZ.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z10 = true;
            }
        }
        if (z10) {
            if (this.f11038A == null) {
                this.f11038A = new d(this.f10403q);
            }
            ViewGroup viewGroup = (ViewGroup) this.f11038A.getParent();
            if (viewGroup != this.f10411y) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f11038A);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f10411y;
                actionMenuView.addView(this.f11038A, actionMenuView.F());
            }
        } else {
            d dVar = this.f11038A;
            if (dVar != null) {
                Object parent = dVar.getParent();
                Object obj = this.f10411y;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f11038A);
                }
            }
        }
        ((ActionMenuView) this.f10411y).setOverflowReserved(this.f11041D);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.appcompat.widget.c] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r15v1, types: [androidx.appcompat.view.menu.g] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.j
    public boolean e() {
        ArrayList arrayListE;
        int size;
        int i10;
        int iL;
        ?? r9;
        C1006c c1006c = this;
        androidx.appcompat.view.menu.e eVar = c1006c.f10405s;
        View view = null;
        ?? r10 = 0;
        if (eVar != null) {
            arrayListE = eVar.E();
            size = arrayListE.size();
        } else {
            arrayListE = null;
            size = 0;
        }
        int i11 = c1006c.f11045H;
        int i12 = c1006c.f11044G;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c1006c.f10411y;
        boolean z9 = false;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) arrayListE.get(i15);
            if (gVar.requiresActionButton()) {
                i13++;
            } else if (gVar.n()) {
                i14++;
            } else {
                z9 = true;
            }
            if (c1006c.f11049L && gVar.isActionViewExpanded()) {
                i11 = 0;
            }
        }
        if (c1006c.f11041D && (z9 || i14 + i13 > i11)) {
            i11--;
        }
        int i16 = i11 - i13;
        SparseBooleanArray sparseBooleanArray = c1006c.f11051N;
        sparseBooleanArray.clear();
        if (c1006c.f11047J) {
            int i17 = c1006c.f11050M;
            iL = i12 / i17;
            i10 = i17 + ((i12 % i17) / iL);
        } else {
            i10 = 0;
            iL = 0;
        }
        int i18 = 0;
        int i19 = 0;
        ?? r11 = c1006c;
        while (i18 < size) {
            ?? r15 = (androidx.appcompat.view.menu.g) arrayListE.get(i18);
            if (r15.requiresActionButton()) {
                View viewN = r11.n(r15, view, viewGroup);
                if (r11.f11047J) {
                    iL -= ActionMenuView.L(viewN, i10, iL, iMakeMeasureSpec, r10);
                } else {
                    viewN.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                int measuredWidth = viewN.getMeasuredWidth();
                i12 -= measuredWidth;
                if (i19 == 0) {
                    i19 = measuredWidth;
                }
                int groupId = r15.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                r15.t(true);
                r9 = r10;
            } else if (r15.n()) {
                int groupId2 = r15.getGroupId();
                boolean z10 = sparseBooleanArray.get(groupId2);
                boolean z11 = (i16 > 0 || z10) && i12 > 0 && (!r11.f11047J || iL > 0);
                boolean z12 = z11;
                if (z11) {
                    View viewN2 = r11.n(r15, null, viewGroup);
                    if (r11.f11047J) {
                        int iL2 = ActionMenuView.L(viewN2, i10, iL, iMakeMeasureSpec, 0);
                        iL -= iL2;
                        if (iL2 == 0) {
                            z12 = false;
                        }
                    } else {
                        viewN2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    }
                    boolean z13 = z12;
                    int measuredWidth2 = viewN2.getMeasuredWidth();
                    i12 -= measuredWidth2;
                    if (i19 == 0) {
                        i19 = measuredWidth2;
                    }
                    z11 = z13 & (!r11.f11047J ? i12 + i19 <= 0 : i12 < 0);
                }
                if (z11 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z10) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i20 = 0; i20 < i18; i20++) {
                        androidx.appcompat.view.menu.g gVar2 = (androidx.appcompat.view.menu.g) arrayListE.get(i20);
                        if (gVar2.getGroupId() == groupId2) {
                            if (gVar2.l()) {
                                i16++;
                            }
                            gVar2.t(false);
                        }
                    }
                }
                if (z11) {
                    i16--;
                }
                r15.t(z11);
                r9 = 0;
            } else {
                r9 = r10;
                r15.t(r9);
            }
            i18++;
            r10 = r9;
            size = size;
            view = null;
            r11 = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void i(Context context, androidx.appcompat.view.menu.e eVar) {
        super.i(context, eVar);
        Resources resources = context.getResources();
        androidx.appcompat.view.a aVarB = androidx.appcompat.view.a.b(context);
        if (!this.f11042E) {
            this.f11041D = aVarB.h();
        }
        if (!this.f11048K) {
            this.f11043F = aVarB.c();
        }
        if (!this.f11046I) {
            this.f11045H = aVarB.d();
        }
        int measuredWidth = this.f11043F;
        if (this.f11041D) {
            if (this.f11038A == null) {
                d dVar = new d(this.f10403q);
                this.f11038A = dVar;
                if (this.f11040C) {
                    dVar.setImageDrawable(this.f11039B);
                    this.f11039B = null;
                    this.f11040C = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f11038A.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f11038A.getMeasuredWidth();
        } else {
            this.f11038A = null;
        }
        this.f11044G = measuredWidth;
        this.f11050M = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public boolean k(androidx.appcompat.view.menu.m mVar) {
        boolean z9 = false;
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.m mVar2 = mVar;
        while (mVar2.f0() != this.f10405s) {
            mVar2 = (androidx.appcompat.view.menu.m) mVar2.f0();
        }
        View viewZ = z(mVar2.getItem());
        if (viewZ == null) {
            return false;
        }
        this.f11057T = mVar.getItem().getItemId();
        int size = mVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = mVar.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                z9 = true;
                break;
            }
        }
        a aVar = new a(this.f10404r, mVar, viewZ);
        this.f11053P = aVar;
        aVar.g(z9);
        this.f11053P.k();
        super.k(mVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean l(ViewGroup viewGroup, int i10) {
        if (viewGroup.getChildAt(i10) == this.f11038A) {
            return false;
        }
        return super.l(viewGroup, i10);
    }

    @Override // androidx.appcompat.view.menu.a
    public View n(androidx.appcompat.view.menu.g gVar, View view, ViewGroup viewGroup) {
        View actionView = gVar.getActionView();
        if (actionView == null || gVar.j()) {
            actionView = super.n(gVar, view, viewGroup);
        }
        actionView.setVisibility(gVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.a
    public androidx.appcompat.view.menu.k o(ViewGroup viewGroup) {
        androidx.appcompat.view.menu.k kVar = this.f10411y;
        androidx.appcompat.view.menu.k kVarO = super.o(viewGroup);
        if (kVar != kVarO) {
            ((ActionMenuView) kVarO).setPresenter(this);
        }
        return kVarO;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean q(int i10, androidx.appcompat.view.menu.g gVar) {
        return gVar.l();
    }

    public boolean y() {
        return C() | B();
    }
}
