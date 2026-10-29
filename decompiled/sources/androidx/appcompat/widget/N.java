package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public class N implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Toolbar f10827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f10828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f10829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f10830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Drawable f10831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Drawable f10832f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Drawable f10833g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f10834h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    CharSequence f10835i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private CharSequence f10836j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private CharSequence f10837k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    Window.Callback f10838l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f10839m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private C1006c f10840n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f10841o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f10842p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Drawable f10843q;

    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final p100k.a f10844q;

        a() {
            this.f10844q = new p100k.a(N.this.f10827a.getContext(), 0, R.id.home, 0, 0, N.this.f10835i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            N n9 = N.this;
            Window.Callback callback = n9.f10838l;
            if (callback == null || !n9.f10839m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f10844q);
        }
    }

    class b extends androidx.core.view.Q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f10846a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f10847b;

        b(int i10) {
            this.f10847b = i10;
        }

        @Override // androidx.core.view.Q, androidx.core.view.P
        public void a(View view) {
            this.f10846a = true;
        }

        @Override // androidx.core.view.P
        public void b(View view) {
            if (this.f10846a) {
                return;
            }
            N.this.f10827a.setVisibility(this.f10847b);
        }

        @Override // androidx.core.view.Q, androidx.core.view.P
        public void c(View view) {
            N.this.f10827a.setVisibility(0);
        }
    }

    public N(Toolbar toolbar, boolean z9) {
        this(toolbar, z9, p050f.h.f20473a, p050f.e.f20411n);
    }

    private void F(CharSequence charSequence) {
        this.f10835i = charSequence;
        if ((this.f10828b & 8) != 0) {
            this.f10827a.setTitle(charSequence);
            if (this.f10834h) {
                androidx.core.view.H.j0(this.f10827a.getRootView(), charSequence);
            }
        }
    }

    private void G() {
        if ((this.f10828b & 4) != 0) {
            if (TextUtils.isEmpty(this.f10837k)) {
                this.f10827a.setNavigationContentDescription(this.f10842p);
            } else {
                this.f10827a.setNavigationContentDescription(this.f10837k);
            }
        }
    }

    private void H() {
        if ((this.f10828b & 4) == 0) {
            this.f10827a.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.f10827a;
        Drawable drawable = this.f10833g;
        if (drawable == null) {
            drawable = this.f10843q;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void I() {
        Drawable drawable;
        int i10 = this.f10828b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) == 0 || (drawable = this.f10832f) == null) {
            drawable = this.f10831e;
        }
        this.f10827a.setLogo(drawable);
    }

    private int x() {
        if (this.f10827a.getNavigationIcon() == null) {
            return 11;
        }
        this.f10843q = this.f10827a.getNavigationIcon();
        return 15;
    }

    public void A(Drawable drawable) {
        this.f10832f = drawable;
        I();
    }

    public void B(int i10) {
        C(i10 == 0 ? null : getContext().getString(i10));
    }

    public void C(CharSequence charSequence) {
        this.f10837k = charSequence;
        G();
    }

    public void D(Drawable drawable) {
        this.f10833g = drawable;
        H();
    }

    public void E(CharSequence charSequence) {
        this.f10836j = charSequence;
        if ((this.f10828b & 8) != 0) {
            this.f10827a.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.u
    public void a(Menu menu, androidx.appcompat.view.menu.j.a aVar) {
        if (this.f10840n == null) {
            C1006c c1006c = new C1006c(this.f10827a.getContext());
            this.f10840n = c1006c;
            c1006c.p(p050f.f.f20436g);
        }
        this.f10840n.h(aVar);
        this.f10827a.M((androidx.appcompat.view.menu.e) menu, this.f10840n);
    }

    @Override // androidx.appcompat.widget.u
    public boolean b() {
        return this.f10827a.C();
    }

    @Override // androidx.appcompat.widget.u
    public void c() {
        this.f10839m = true;
    }

    @Override // androidx.appcompat.widget.u
    public void collapseActionView() {
        this.f10827a.e();
    }

    @Override // androidx.appcompat.widget.u
    public boolean d() {
        return this.f10827a.d();
    }

    @Override // androidx.appcompat.widget.u
    public boolean e() {
        return this.f10827a.B();
    }

    @Override // androidx.appcompat.widget.u
    public boolean f() {
        return this.f10827a.x();
    }

    @Override // androidx.appcompat.widget.u
    public boolean g() {
        return this.f10827a.S();
    }

    @Override // androidx.appcompat.widget.u
    public Context getContext() {
        return this.f10827a.getContext();
    }

    @Override // androidx.appcompat.widget.u
    public CharSequence getTitle() {
        return this.f10827a.getTitle();
    }

    @Override // androidx.appcompat.widget.u
    public void h() {
        this.f10827a.f();
    }

    @Override // androidx.appcompat.widget.u
    public void i(ScrollingTabContainerView scrollingTabContainerView) {
        View view = this.f10829c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f10827a;
            if (parent == toolbar) {
                toolbar.removeView(this.f10829c);
            }
        }
        this.f10829c = scrollingTabContainerView;
        if (scrollingTabContainerView == null || this.f10841o != 2) {
            return;
        }
        this.f10827a.addView(scrollingTabContainerView, 0);
        Toolbar.g gVar = (Toolbar.g) this.f10829c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) gVar).width = -2;
        ((ViewGroup.MarginLayoutParams) gVar).height = -2;
        gVar.f10093a = 8388691;
        scrollingTabContainerView.setAllowCollapse(true);
    }

    @Override // androidx.appcompat.widget.u
    public boolean j() {
        return this.f10827a.w();
    }

    @Override // androidx.appcompat.widget.u
    public void k(int i10) {
        View view;
        int i11 = this.f10828b ^ i10;
        this.f10828b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    G();
                }
                H();
            }
            if ((i11 & 3) != 0) {
                I();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    this.f10827a.setTitle(this.f10835i);
                    this.f10827a.setSubtitle(this.f10836j);
                } else {
                    this.f10827a.setTitle((CharSequence) null);
                    this.f10827a.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) == 0 || (view = this.f10830d) == null) {
                return;
            }
            if ((i10 & 16) != 0) {
                this.f10827a.addView(view);
            } else {
                this.f10827a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.u
    public Menu l() {
        return this.f10827a.getMenu();
    }

    @Override // androidx.appcompat.widget.u
    public void m(int i10) {
        A(i10 != 0 ? p060g.a.b(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.u
    public int n() {
        return this.f10841o;
    }

    @Override // androidx.appcompat.widget.u
    public androidx.core.view.O o(int i10, long j9) {
        return androidx.core.view.H.d(this.f10827a).b(i10 == 0 ? 1.0f : 0.0f).e(j9).g(new b(i10));
    }

    @Override // androidx.appcompat.widget.u
    public void p(androidx.appcompat.view.menu.j.a aVar, androidx.appcompat.view.menu.e.a aVar2) {
        this.f10827a.N(aVar, aVar2);
    }

    @Override // androidx.appcompat.widget.u
    public void q(int i10) {
        this.f10827a.setVisibility(i10);
    }

    @Override // androidx.appcompat.widget.u
    public ViewGroup r() {
        return this.f10827a;
    }

    @Override // androidx.appcompat.widget.u
    public void s(boolean z9) {
    }

    @Override // androidx.appcompat.widget.u
    public void setIcon(int i10) {
        setIcon(i10 != 0 ? p060g.a.b(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.u
    public void setTitle(CharSequence charSequence) {
        this.f10834h = true;
        F(charSequence);
    }

    @Override // androidx.appcompat.widget.u
    public void setWindowCallback(Window.Callback callback) {
        this.f10838l = callback;
    }

    @Override // androidx.appcompat.widget.u
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f10834h) {
            return;
        }
        F(charSequence);
    }

    @Override // androidx.appcompat.widget.u
    public int t() {
        return this.f10828b;
    }

    @Override // androidx.appcompat.widget.u
    public void u() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.u
    public void v() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.u
    public void w(boolean z9) {
        this.f10827a.setCollapsible(z9);
    }

    public void y(View view) {
        View view2 = this.f10830d;
        if (view2 != null && (this.f10828b & 16) != 0) {
            this.f10827a.removeView(view2);
        }
        this.f10830d = view;
        if (view == null || (this.f10828b & 16) == 0) {
            return;
        }
        this.f10827a.addView(view);
    }

    public void z(int i10) {
        if (i10 == this.f10842p) {
            return;
        }
        this.f10842p = i10;
        if (TextUtils.isEmpty(this.f10827a.getNavigationContentDescription())) {
            B(this.f10842p);
        }
    }

    public N(Toolbar toolbar, boolean z9, int i10, int i11) {
        Drawable drawable;
        this.f10841o = 0;
        this.f10842p = 0;
        this.f10827a = toolbar;
        this.f10835i = toolbar.getTitle();
        this.f10836j = toolbar.getSubtitle();
        this.f10834h = this.f10835i != null;
        this.f10833g = toolbar.getNavigationIcon();
        J jV = J.v(toolbar.getContext(), null, p050f.j.f20595a, p050f.a.f20337c, 0);
        this.f10843q = jV.g(p050f.j.f20650l);
        if (z9) {
            CharSequence charSequenceP = jV.p(p050f.j.f20680r);
            if (!TextUtils.isEmpty(charSequenceP)) {
                setTitle(charSequenceP);
            }
            CharSequence charSequenceP2 = jV.p(p050f.j.f20670p);
            if (!TextUtils.isEmpty(charSequenceP2)) {
                E(charSequenceP2);
            }
            Drawable drawableG = jV.g(p050f.j.f20660n);
            if (drawableG != null) {
                A(drawableG);
            }
            Drawable drawableG2 = jV.g(p050f.j.f20655m);
            if (drawableG2 != null) {
                setIcon(drawableG2);
            }
            if (this.f10833g == null && (drawable = this.f10843q) != null) {
                D(drawable);
            }
            k(jV.k(p050f.j.f20630h, 0));
            int iN = jV.n(p050f.j.f20625g, 0);
            if (iN != 0) {
                y(LayoutInflater.from(this.f10827a.getContext()).inflate(iN, (ViewGroup) this.f10827a, false));
                k(this.f10828b | 16);
            }
            int iM = jV.m(p050f.j.f20640j, 0);
            if (iM > 0) {
                ViewGroup.LayoutParams layoutParams = this.f10827a.getLayoutParams();
                layoutParams.height = iM;
                this.f10827a.setLayoutParams(layoutParams);
            }
            int iE = jV.e(p050f.j.f20620f, -1);
            int iE2 = jV.e(p050f.j.f20615e, -1);
            if (iE >= 0 || iE2 >= 0) {
                this.f10827a.L(Math.max(iE, 0), Math.max(iE2, 0));
            }
            int iN2 = jV.n(p050f.j.f20685s, 0);
            if (iN2 != 0) {
                Toolbar toolbar2 = this.f10827a;
                toolbar2.P(toolbar2.getContext(), iN2);
            }
            int iN3 = jV.n(p050f.j.f20675q, 0);
            if (iN3 != 0) {
                Toolbar toolbar3 = this.f10827a;
                toolbar3.O(toolbar3.getContext(), iN3);
            }
            int iN4 = jV.n(p050f.j.f20665o, 0);
            if (iN4 != 0) {
                this.f10827a.setPopupTheme(iN4);
            }
        } else {
            this.f10828b = x();
        }
        jV.x();
        z(i10);
        this.f10837k = this.f10827a.getNavigationContentDescription();
        this.f10827a.setNavigationOnClickListener(new a());
    }

    @Override // androidx.appcompat.widget.u
    public void setIcon(Drawable drawable) {
        this.f10831e = drawable;
        I();
    }
}
