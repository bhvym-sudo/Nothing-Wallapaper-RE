package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ScrollingTabContainerView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.u;
import androidx.core.view.H;
import androidx.core.view.O;
import androidx.core.view.P;
import androidx.core.view.Q;
import androidx.core.view.S;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class s extends androidx.appcompat.app.a implements ActionBarOverlayLayout.d {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final Interpolator f10258E = new AccelerateInterpolator();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final Interpolator f10259F = new DecelerateInterpolator();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    boolean f10260A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f10264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f10265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Activity f10266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ActionBarOverlayLayout f10267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ActionBarContainer f10268e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    u f10269f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ActionBarContextView f10270g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    View f10271h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    ScrollingTabContainerView f10272i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f10275l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    d f10276m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    androidx.appcompat.view.b f10277n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    androidx.appcompat.view.b.a f10278o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f10279p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f10281r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    boolean f10284u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    boolean f10285v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f10286w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    androidx.appcompat.view.h f10288y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f10289z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ArrayList f10273j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f10274k = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ArrayList f10280q = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f10282s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    boolean f10283t = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f10287x = true;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    final P f10261B = new a();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final P f10262C = new b();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final S f10263D = new c();

    class a extends Q {
        a() {
        }

        @Override // androidx.core.view.P
        public void b(View view) {
            View view2;
            s sVar = s.this;
            if (sVar.f10283t && (view2 = sVar.f10271h) != null) {
                view2.setTranslationY(0.0f);
                s.this.f10268e.setTranslationY(0.0f);
            }
            s.this.f10268e.setVisibility(8);
            s.this.f10268e.setTransitioning(false);
            s sVar2 = s.this;
            sVar2.f10288y = null;
            sVar2.z();
            ActionBarOverlayLayout actionBarOverlayLayout = s.this.f10267d;
            if (actionBarOverlayLayout != null) {
                H.d0(actionBarOverlayLayout);
            }
        }
    }

    class b extends Q {
        b() {
        }

        @Override // androidx.core.view.P
        public void b(View view) {
            s sVar = s.this;
            sVar.f10288y = null;
            sVar.f10268e.requestLayout();
        }
    }

    class c implements S {
        c() {
        }

        @Override // androidx.core.view.S
        public void a(View view) {
            ((View) s.this.f10268e.getParent()).invalidate();
        }
    }

    public class d extends androidx.appcompat.view.b implements androidx.appcompat.view.menu.e.a {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final Context f10293s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final androidx.appcompat.view.menu.e f10294t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private androidx.appcompat.view.b.a f10295u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private WeakReference f10296v;

        public d(Context context, androidx.appcompat.view.b.a aVar) {
            this.f10293s = context;
            this.f10295u = aVar;
            androidx.appcompat.view.menu.e eVarT = new androidx.appcompat.view.menu.e(context).T(1);
            this.f10294t = eVarT;
            eVarT.S(this);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            androidx.appcompat.view.b.a aVar = this.f10295u;
            if (aVar != null) {
                return aVar.d(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (this.f10295u == null) {
                return;
            }
            k();
            s.this.f10270g.l();
        }

        @Override // androidx.appcompat.view.b
        public void c() {
            s sVar = s.this;
            if (sVar.f10276m != this) {
                return;
            }
            if (s.y(sVar.f10284u, sVar.f10285v, false)) {
                this.f10295u.a(this);
            } else {
                s sVar2 = s.this;
                sVar2.f10277n = this;
                sVar2.f10278o = this.f10295u;
            }
            this.f10295u = null;
            s.this.x(false);
            s.this.f10270g.g();
            s sVar3 = s.this;
            sVar3.f10267d.setHideOnContentScrollEnabled(sVar3.f10260A);
            s.this.f10276m = null;
        }

        @Override // androidx.appcompat.view.b
        public View d() {
            WeakReference weakReference = this.f10296v;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        @Override // androidx.appcompat.view.b
        public Menu e() {
            return this.f10294t;
        }

        @Override // androidx.appcompat.view.b
        public MenuInflater f() {
            return new androidx.appcompat.view.g(this.f10293s);
        }

        @Override // androidx.appcompat.view.b
        public CharSequence g() {
            return s.this.f10270g.getSubtitle();
        }

        @Override // androidx.appcompat.view.b
        public CharSequence i() {
            return s.this.f10270g.getTitle();
        }

        @Override // androidx.appcompat.view.b
        public void k() {
            if (s.this.f10276m != this) {
                return;
            }
            this.f10294t.e0();
            try {
                this.f10295u.c(this, this.f10294t);
            } finally {
                this.f10294t.d0();
            }
        }

        @Override // androidx.appcompat.view.b
        public boolean l() {
            return s.this.f10270g.j();
        }

        @Override // androidx.appcompat.view.b
        public void m(View view) {
            s.this.f10270g.setCustomView(view);
            this.f10296v = new WeakReference(view);
        }

        @Override // androidx.appcompat.view.b
        public void n(int i10) {
            o(s.this.f10264a.getResources().getString(i10));
        }

        @Override // androidx.appcompat.view.b
        public void o(CharSequence charSequence) {
            s.this.f10270g.setSubtitle(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public void q(int i10) {
            r(s.this.f10264a.getResources().getString(i10));
        }

        @Override // androidx.appcompat.view.b
        public void r(CharSequence charSequence) {
            s.this.f10270g.setTitle(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public void s(boolean z9) {
            super.s(z9);
            s.this.f10270g.setTitleOptional(z9);
        }

        public boolean t() {
            this.f10294t.e0();
            try {
                return this.f10295u.b(this, this.f10294t);
            } finally {
                this.f10294t.d0();
            }
        }
    }

    public s(Activity activity, boolean z9) {
        this.f10266c = activity;
        View decorView = activity.getWindow().getDecorView();
        F(decorView);
        if (z9) {
            return;
        }
        this.f10271h = decorView.findViewById(R.id.content);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private u C(View view) {
        if (view instanceof u) {
            return (u) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    private void E() {
        if (this.f10286w) {
            this.f10286w = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f10267d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            N(false);
        }
    }

    private void F(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(p050f.f.f20445p);
        this.f10267d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f10269f = C(view.findViewById(p050f.f.f20430a));
        this.f10270g = (ActionBarContextView) view.findViewById(p050f.f.f20435f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(p050f.f.f20432c);
        this.f10268e = actionBarContainer;
        u uVar = this.f10269f;
        if (uVar == null || this.f10270g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f10264a = uVar.getContext();
        boolean z9 = (this.f10269f.t() & 4) != 0;
        if (z9) {
            this.f10275l = true;
        }
        androidx.appcompat.view.a aVarB = androidx.appcompat.view.a.b(this.f10264a);
        K(aVarB.a() || z9);
        I(aVarB.g());
        TypedArray typedArrayObtainStyledAttributes = this.f10264a.obtainStyledAttributes(null, p050f.j.f20595a, p050f.a.f20337c, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(p050f.j.f20645k, false)) {
            J(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(p050f.j.f20635i, 0);
        if (dimensionPixelSize != 0) {
            H(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void I(boolean z9) {
        this.f10281r = z9;
        if (z9) {
            this.f10268e.setTabContainer(null);
            this.f10269f.i(this.f10272i);
        } else {
            this.f10269f.i(null);
            this.f10268e.setTabContainer(this.f10272i);
        }
        boolean z10 = D() == 2;
        ScrollingTabContainerView scrollingTabContainerView = this.f10272i;
        if (scrollingTabContainerView != null) {
            if (z10) {
                scrollingTabContainerView.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f10267d;
                if (actionBarOverlayLayout != null) {
                    H.d0(actionBarOverlayLayout);
                }
            } else {
                scrollingTabContainerView.setVisibility(8);
            }
        }
        this.f10269f.w(!this.f10281r && z10);
        this.f10267d.setHasNonEmbeddedTabs(!this.f10281r && z10);
    }

    private boolean L() {
        return this.f10268e.isLaidOut();
    }

    private void M() {
        if (this.f10286w) {
            return;
        }
        this.f10286w = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f10267d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        N(false);
    }

    private void N(boolean z9) {
        if (y(this.f10284u, this.f10285v, this.f10286w)) {
            if (this.f10287x) {
                return;
            }
            this.f10287x = true;
            B(z9);
            return;
        }
        if (this.f10287x) {
            this.f10287x = false;
            A(z9);
        }
    }

    static boolean y(boolean z9, boolean z10, boolean z11) {
        if (z11) {
            return true;
        }
        return (z9 || z10) ? false : true;
    }

    public void A(boolean z9) {
        View view;
        androidx.appcompat.view.h hVar = this.f10288y;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f10282s != 0 || (!this.f10289z && !z9)) {
            this.f10261B.b(null);
            return;
        }
        this.f10268e.setAlpha(1.0f);
        this.f10268e.setTransitioning(true);
        androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
        float f10 = -this.f10268e.getHeight();
        if (z9) {
            int[] iArr = {0, 0};
            this.f10268e.getLocationInWindow(iArr);
            f10 -= iArr[1];
        }
        O oL = H.d(this.f10268e).l(f10);
        oL.j(this.f10263D);
        hVar2.c(oL);
        if (this.f10283t && (view = this.f10271h) != null) {
            hVar2.c(H.d(view).l(f10));
        }
        hVar2.f(f10258E);
        hVar2.e(250L);
        hVar2.g(this.f10261B);
        this.f10288y = hVar2;
        hVar2.h();
    }

    public void B(boolean z9) {
        View view;
        View view2;
        androidx.appcompat.view.h hVar = this.f10288y;
        if (hVar != null) {
            hVar.a();
        }
        this.f10268e.setVisibility(0);
        if (this.f10282s == 0 && (this.f10289z || z9)) {
            this.f10268e.setTranslationY(0.0f);
            float f10 = -this.f10268e.getHeight();
            if (z9) {
                int[] iArr = {0, 0};
                this.f10268e.getLocationInWindow(iArr);
                f10 -= iArr[1];
            }
            this.f10268e.setTranslationY(f10);
            androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
            O oL = H.d(this.f10268e).l(0.0f);
            oL.j(this.f10263D);
            hVar2.c(oL);
            if (this.f10283t && (view2 = this.f10271h) != null) {
                view2.setTranslationY(f10);
                hVar2.c(H.d(this.f10271h).l(0.0f));
            }
            hVar2.f(f10259F);
            hVar2.e(250L);
            hVar2.g(this.f10262C);
            this.f10288y = hVar2;
            hVar2.h();
        } else {
            this.f10268e.setAlpha(1.0f);
            this.f10268e.setTranslationY(0.0f);
            if (this.f10283t && (view = this.f10271h) != null) {
                view.setTranslationY(0.0f);
            }
            this.f10262C.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f10267d;
        if (actionBarOverlayLayout != null) {
            H.d0(actionBarOverlayLayout);
        }
    }

    public int D() {
        return this.f10269f.n();
    }

    public void G(int i10, int i11) {
        int iT = this.f10269f.t();
        if ((i11 & 4) != 0) {
            this.f10275l = true;
        }
        this.f10269f.k((i10 & i11) | ((~i11) & iT));
    }

    public void H(float f10) {
        H.o0(this.f10268e, f10);
    }

    public void J(boolean z9) {
        if (z9 && !this.f10267d.r()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f10260A = z9;
        this.f10267d.setHideOnContentScrollEnabled(z9);
    }

    public void K(boolean z9) {
        this.f10269f.s(z9);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.f10285v) {
            this.f10285v = false;
            N(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c(boolean z9) {
        this.f10283t = z9;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
        if (this.f10285v) {
            return;
        }
        this.f10285v = true;
        N(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        androidx.appcompat.view.h hVar = this.f10288y;
        if (hVar != null) {
            hVar.a();
            this.f10288y = null;
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void f(int i10) {
        this.f10282s = i10;
    }

    @Override // androidx.appcompat.app.a
    public boolean h() {
        u uVar = this.f10269f;
        if (uVar == null || !uVar.j()) {
            return false;
        }
        this.f10269f.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void i(boolean z9) {
        if (z9 == this.f10279p) {
            return;
        }
        this.f10279p = z9;
        if (this.f10280q.size() <= 0) {
            return;
        }
        o.a(this.f10280q.get(0));
        throw null;
    }

    @Override // androidx.appcompat.app.a
    public int j() {
        return this.f10269f.t();
    }

    @Override // androidx.appcompat.app.a
    public Context k() {
        if (this.f10265b == null) {
            TypedValue typedValue = new TypedValue();
            this.f10264a.getTheme().resolveAttribute(p050f.a.f20340f, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f10265b = new ContextThemeWrapper(this.f10264a, i10);
            } else {
                this.f10265b = this.f10264a;
            }
        }
        return this.f10265b;
    }

    @Override // androidx.appcompat.app.a
    public void m(Configuration configuration) {
        I(androidx.appcompat.view.a.b(this.f10264a).g());
    }

    @Override // androidx.appcompat.app.a
    public boolean o(int i10, KeyEvent keyEvent) {
        Menu menuE;
        d dVar = this.f10276m;
        if (dVar == null || (menuE = dVar.e()) == null) {
            return false;
        }
        menuE.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuE.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.a
    public void r(boolean z9) {
        if (this.f10275l) {
            return;
        }
        s(z9);
    }

    @Override // androidx.appcompat.app.a
    public void s(boolean z9) {
        G(z9 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.a
    public void t(boolean z9) {
        androidx.appcompat.view.h hVar;
        this.f10289z = z9;
        if (z9 || (hVar = this.f10288y) == null) {
            return;
        }
        hVar.a();
    }

    @Override // androidx.appcompat.app.a
    public void u(CharSequence charSequence) {
        this.f10269f.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void v(CharSequence charSequence) {
        this.f10269f.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public androidx.appcompat.view.b w(androidx.appcompat.view.b.a aVar) {
        d dVar = this.f10276m;
        if (dVar != null) {
            dVar.c();
        }
        this.f10267d.setHideOnContentScrollEnabled(false);
        this.f10270g.k();
        d dVar2 = new d(this.f10270g.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.f10276m = dVar2;
        dVar2.k();
        this.f10270g.h(dVar2);
        x(true);
        return dVar2;
    }

    public void x(boolean z9) {
        O oF;
        O oF2;
        if (z9) {
            M();
        } else {
            E();
        }
        if (!L()) {
            if (z9) {
                this.f10269f.q(4);
                this.f10270g.setVisibility(0);
                return;
            } else {
                this.f10269f.q(0);
                this.f10270g.setVisibility(8);
                return;
            }
        }
        if (z9) {
            oF = this.f10269f.o(4, 100L);
            oF2 = this.f10270g.f(0, 200L);
        } else {
            O o9 = this.f10269f.o(0, 200L);
            oF = this.f10270g.f(8, 100L);
            oF2 = o9;
        }
        androidx.appcompat.view.h hVar = new androidx.appcompat.view.h();
        hVar.d(oF, oF2);
        hVar.h();
    }

    void z() {
        androidx.appcompat.view.b.a aVar = this.f10278o;
        if (aVar != null) {
            aVar.a(this.f10277n);
            this.f10277n = null;
            this.f10278o = null;
        }
    }

    public s(Dialog dialog) {
        F(dialog.getWindow().getDecorView());
    }
}
