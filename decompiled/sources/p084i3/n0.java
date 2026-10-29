package p084i3;

import H3.n;
import H3.q;
import H3.r;
import H3.t;
import android.app.Activity;
import android.app.ActivityOptions;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import android.widget.Button;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.AbstractActivityC1136v;
import androidx.lifecycle.I;
import androidx.lifecycle.d0;
import com.android.wallpaper.picker.FullPreviewActivity;
import com.android.wallpaper.widget.BottomActionBar;
import com.android.wallpaper.widget.WallpaperInfoView;
import com.google.android.material.tabs.TabLayout;
import com.nothing.wallpaper.R;
import java.util.Date;
import java.util.Optional;
import java.util.function.Supplier;
import p010b.u;
import p064g3.k;
import p064g3.x;
import p074h3.H;
import p074h3.InterfaceC1364d;
import p074h3.J;
import p074h3.S;
import p074h3.a0;

/* JADX INFO: loaded from: classes.dex */
public abstract class n0 extends com.android.wallpaper.picker.a implements w0.a, x0.b, L.b {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final Interpolator f22048N = new PathInterpolator(0.0f, 0.0f, 0.8f, 1.0f);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    protected View f22049A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    protected n f22050B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    protected int f22051C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    protected boolean f22052D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    protected boolean f22053E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    protected boolean f22054F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    protected p064g3.n f22055G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    protected d0 f22056H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    protected Optional f22057I = Optional.empty();

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private u f22058J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private x0 f22059K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private L f22060L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private ProgressDialog f22061M;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected x f22062v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected J0 f22063w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected a0 f22064x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected S f22065y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected BottomActionBar f22066z;

    class a implements I {
        a() {
        }

        @Override // androidx.lifecycle.I
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(g3.n.b bVar) {
            if (bVar == g3.n.b.LOADING) {
                n0.this.i1();
            } else {
                n0.this.J0();
            }
        }
    }

    class b extends u {
        b(boolean z9) {
            super(z9);
        }

        @Override // p010b.u
        public void d() {
            if (n0.this.f22050B.j()) {
                n0 n0Var = n0.this;
                if (!n0Var.f22054F) {
                    n0Var.f22050B.t(false);
                    return;
                }
            }
            BottomActionBar bottomActionBar = n0.this.f22066z;
            if (bottomActionBar == null || bottomActionBar.G()) {
                n0.this.getActivity().finish();
            } else {
                n0.this.f22066z.s();
            }
        }
    }

    class c implements TabLayout.d {
        c() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(TabLayout.f fVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(TabLayout.f fVar) {
            n0.this.f22057I = Optional.of(Integer.valueOf(fVar.g()));
            n0.this.l1(fVar.g() == 0);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(TabLayout.f fVar) {
        }
    }

    static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22070a;

        static {
            int[] iArr = new int[g3.n.b.values().length];
            f22070a = iArr;
            try {
                iArr[g3.n.b.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22070a[g3.n.b.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    protected final class e extends BottomActionBar.f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Intent f22071c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private CharSequence f22072d;

        public e(Context context) {
            super(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void m(Runnable runnable, CharSequence charSequence, Intent intent) {
            this.f22072d = charSequence;
            this.f22071c = intent;
            if (runnable != null) {
                runnable.run();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n(View view) {
            if (n0.this.getContext() == null) {
                return;
            }
            n0.this.f22065y.b();
            n0.this.startActivity(this.f22071c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void l(WallpaperInfoView wallpaperInfoView) {
            n0 n0Var = n0.this;
            wallpaperInfoView.e(n0Var.f22062v, this.f22072d, D0.c(n0Var.getContext(), this.f22071c), new View.OnClickListener() { // from class: i3.q0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f22087q.n(view);
                }
            });
        }

        private void q(final Runnable runnable) {
            Context context = n0.this.getContext();
            if (context == null) {
                return;
            }
            D0.b(context, n0.this.f22062v, new D0.a() { // from class: i3.p0
                @Override // i3.D0.a
                public final void a(CharSequence charSequence, Intent intent) {
                    this.f22084a.m(runnable, charSequence, intent);
                }
            });
        }

        @Override // com.android.wallpaper.widget.BottomActionBar.f
        public int d() {
            return R.layout.wallpaper_info_view;
        }

        @Override // com.android.wallpaper.widget.BottomActionBar.f
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public void f(final WallpaperInfoView wallpaperInfoView) {
            if (n0.this.f22062v == null) {
                return;
            }
            if (this.f22072d == null) {
                q(new Runnable() { // from class: i3.o0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f22081q.l(wallpaperInfoView);
                    }
                });
            } else {
                l(wallpaperInfoView);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J0() {
        ProgressDialog progressDialog = this.f22061M;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f22061M = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O0(View view) {
        if (new J().b(getContext())) {
            g1(this.f22062v);
        } else {
            this.f22050B.t(true);
        }
        this.f22066z.t(BottomActionBar.d.EDIT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P0() {
        this.f22050B.t(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ WindowInsets Q0(View view, WindowInsets windowInsets) {
        view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), 0);
        this.f22050B.r(windowInsets);
        this.f22050B.l(view);
        View viewFindViewById = view.findViewById(R.id.preview_header);
        viewFindViewById.setPadding(viewFindViewById.getPaddingLeft(), this.f22050B.h(), viewFindViewById.getPaddingRight(), viewFindViewById.getPaddingBottom());
        return WindowInsets.CONSUMED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R0() {
        K0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S0(g3.n.b bVar) {
        int i10 = d.f22070a[bVar.ordinal()];
        if (i10 == 1) {
            Handler.getMain().postDelayed(new Runnable() { // from class: i3.i0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22037q.R0();
                }
            }, 200L);
        } else {
            if (i10 != 2) {
                return;
            }
            j1(this.f22055G.g());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T0(View view) {
        boolean zI = this.f22050B.i();
        ((Button) view).setText(zI ? R.string.show_ui_preview_text : R.string.hide_ui_preview_text);
        this.f22050B.s(!zI);
        view.announceForAccessibility(zI ? getString(R.string.hint_hide_ui_preview) : getString(R.string.hint_show_ui_preview));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U0(View view) {
        Z0(null, L0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V0(View view) {
        boolean zI = this.f22050B.i();
        this.f22050B.s(!zI);
        ((LayerDrawable) ((RippleDrawable) view.findViewById(R.id.hide_ui_view).getBackground()).getDrawable(0)).getDrawable(0).setTint(!zI ? getActivity().getColor(android.R.color.materialColorOnPrimaryFixedVariant) : r.a(getActivity(), android.R.^attr-private.colorAccentPrimary));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W0(View view) {
        f1(this.f22062v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer X0() {
        return Integer.valueOf(!this.f22052D ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y0(int i10) {
        this.f22055G.i(i10);
        a1(i10);
    }

    private void f1(x xVar) {
        boolean z9;
        boolean z10;
        boolean z11 = xVar instanceof k;
        if (z11) {
            boolean z12 = this.f22052D;
            z9 = z12;
            z10 = !z12;
        } else {
            z9 = true;
            z10 = true;
        }
        this.f22064x.m(getActivity(), getParentFragmentManager(), new w0.a() { // from class: i3.h0
            @Override // i3.w0.a
            public final void n(int i10) {
                this.f22036q.Y0(i10);
            }
        }, z11, z9, z10);
    }

    private void g1(x xVar) {
        if (xVar == null) {
            return;
        }
        startActivity(FullPreviewActivity.L0(getActivity(), xVar, ((Integer) this.f22057I.orElse(0)).intValue() == 0), ActivityOptions.makeSceneTransitionAnimation(getActivity(), new Pair[0]).toBundle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i1() {
        J0();
        AbstractActivityC1136v abstractActivityC1136vRequireActivity = requireActivity();
        ProgressDialog progressDialog = new ProgressDialog(abstractActivityC1136vRequireActivity, R.style.LightDialogTheme);
        this.f22061M = progressDialog;
        progressDialog.setTitle((CharSequence) null);
        this.f22061M.setMessage(abstractActivityC1136vRequireActivity.getString(R.string.set_wallpaper_progress_message));
        this.f22061M.setInverseBackgroundForced(true);
        this.f22061M.setCanceledOnTouchOutside(false);
        this.f22061M.setCancelable(false);
        this.f22061M.show();
    }

    @Override // i3.x0.b
    public void B(int i10) {
        this.f22055G.i(i10);
        a1(i10);
    }

    @Override // i3.L.b
    public void I() {
        AbstractActivityC1136v activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    protected M0 I0(SurfaceView surfaceView, InterfaceC1364d.a aVar, Boolean bool) {
        Context contextRequireContext = requireContext();
        return new M0(surfaceView, aVar == InterfaceC1364d.a.LOCK_SCREEN ? new q(contextRequireContext, null, contextRequireContext.getString(R.string.lock_screen_preview_provider_authority)) : new q(contextRequireContext, contextRequireContext.getString(R.string.grid_control_metadata_name)), !bool.booleanValue());
    }

    protected void K0(boolean z9) {
        AbstractActivityC1136v activity = getActivity();
        if (activity == null) {
            return;
        }
        if (z9) {
            try {
                Toast.makeText(activity, R.string.wallpaper_set_successfully_message, 0).show();
            } catch (Resources.NotFoundException e10) {
                Log.e("PreviewFragment", "Could not show toast " + e10);
            }
            d1(activity);
        }
        activity.finish();
        activity.overridePendingTransition(R.anim.fade_in_short, R.anim.fade_out_short);
    }

    protected x L0() {
        return this.f22062v;
    }

    protected abstract int M0();

    protected boolean N0() {
        return getResources().getConfiguration().getLayoutDirection() == 1;
    }

    protected void Z0(View view, x xVar) {
        f1(xVar);
    }

    protected abstract void a1(int i10);

    protected void b1(View view) {
        if (this.f22054F) {
            view.findViewById(R.id.hide_ui_preview_button).setVisibility(8);
            view.findViewById(R.id.set_as_wallpaper_button).setVisibility(8);
            s0(R.menu.fullpreview_menu);
            t0(R.id.action_hide_ui, new View.OnClickListener() { // from class: i3.l0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f22043q.V0(view2);
                }
            });
            t0(R.id.action_set_wallpaper, new View.OnClickListener() { // from class: i3.m0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f22046q.W0(view2);
                }
            });
        } else {
            Button button = (Button) view.findViewById(R.id.hide_ui_preview_button);
            button.setText(this.f22050B.i() ? R.string.hide_ui_preview_text : R.string.show_ui_preview_text);
            button.setOnClickListener(new View.OnClickListener() { // from class: i3.j0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f22039q.T0(view2);
                }
            });
            view.findViewById(R.id.set_as_wallpaper_button).setOnClickListener(new View.OnClickListener() { // from class: i3.k0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f22041q.U0(view2);
                }
            });
        }
        this.f22050B.e();
    }

    protected void c1(CardView cardView) {
        float fO = t.o(requireActivity(), cardView.getMeasuredWidth());
        if (fO == 0.0f) {
            fO = 34.7f;
        }
        cardView.setRadius(fO);
    }

    protected void d1(Activity activity) {
        activity.setResult(-1);
    }

    @Override // com.android.wallpaper.picker.a, p084i3.C1395d
    protected void e0(BottomActionBar bottomActionBar) {
        super.e0(bottomActionBar);
        this.f22066z = bottomActionBar;
        if (this.f22054F) {
            bottomActionBar.post(new Runnable() { // from class: i3.e0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22032q.P0();
                }
            });
        } else {
            bottomActionBar.P(BottomActionBar.d.EDIT, new View.OnClickListener() { // from class: i3.c0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f22029q.O0(view);
                }
            });
        }
        b1(this.f22049A.findViewById(R.id.fullscreen_buttons_container));
        if (this.f22058J == null) {
            this.f22058J = new b(true);
            getActivity().f().h(this, this.f22058J);
        }
    }

    protected void e1(TabLayout tabLayout) {
        tabLayout.i(tabLayout.E().n(R.string.home_screen_message));
        tabLayout.i(tabLayout.E().n(R.string.lock_screen_message));
        tabLayout.h(new c());
        int iIntValue = ((Integer) this.f22057I.orElseGet(new Supplier() { // from class: i3.d0
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.f22031a.X0();
            }
        })).intValue();
        tabLayout.B(iIntValue).l();
        l1(iIntValue == 0);
    }

    protected void h1() {
        L lS0 = L.s0();
        lS0.setTargetFragment(this, 1);
        AbstractActivityC1393c abstractActivityC1393c = (AbstractActivityC1393c) getActivity();
        if (abstractActivityC1393c == null || !abstractActivityC1393c.I0()) {
            this.f22060L = lS0;
        } else {
            lS0.r0(requireFragmentManager(), "load_wallpaper_error_dialog");
        }
    }

    @Override // com.android.wallpaper.picker.a
    public CharSequence i0() {
        return getContext().getString(R.string.preview);
    }

    @Override // com.android.wallpaper.picker.a
    protected int j0() {
        return android.R.color.transparent;
    }

    protected void j1(int i10) {
        x0 x0VarS0 = x0.s0(R.string.set_wallpaper_error_message, i10);
        x0VarS0.setTargetFragment(this, 1);
        if (((AbstractActivityC1393c) requireActivity()).I0()) {
            x0VarS0.r0(requireFragmentManager(), "set_wallpaper_error_dialog");
        } else {
            this.f22059K = x0VarS0;
        }
    }

    protected void k1(View view) {
        view.findViewById(R.id.preview_header).setBackgroundColor(getContext().getColor(R.color.toolbar_color));
    }

    protected abstract void l1(boolean z9);

    @Override // i3.w0.a
    public void n(int i10) {
        this.f22055G.i(i10);
        a1(i10);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context applicationContext = requireContext().getApplicationContext();
        H hA = p074h3.I.a();
        Bundle bundleRequireArguments = requireArguments();
        this.f22065y = hA.q(applicationContext);
        this.f22062v = (x) bundleRequireArguments.getParcelable("wallpaper");
        this.f22063w = new J0(applicationContext, N0());
        this.f22051C = bundleRequireArguments.getInt("preview_mode");
        this.f22052D = bundleRequireArguments.getBoolean("view_as_home");
        this.f22053E = bundleRequireArguments.getBoolean("is_asset_id_present");
        this.f22054F = bundleRequireArguments.getBoolean("view_full_screen");
        this.f22064x = new a0(hA.A(applicationContext), hA.f(applicationContext), this.f22065y, hA.k(applicationContext));
        d0 d0Var = new d0(requireActivity());
        this.f22056H = d0Var;
        this.f22055G = (p064g3.n) d0Var.b(p064g3.n.class);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(M0(), viewGroup, false);
        q0(viewInflate);
        this.f22055G.h().h(getViewLifecycleOwner(), new a());
        this.f22049A = viewInflate;
        n nVar = new n(viewInflate);
        this.f22050B = nVar;
        nVar.p(this.f22054F);
        getActivity().getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: i3.f0
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                return this.f22033a.Q0(view, windowInsets);
            }
        });
        return viewInflate;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onDestroy() {
        super.onDestroy();
        this.f22064x.g();
        J0();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onResume() {
        super.onResume();
        p074h3.I.a().f(getActivity()).j(new Date().getTime());
        L l9 = this.f22060L;
        if (l9 != null) {
            l9.r0(requireFragmentManager(), "load_wallpaper_error_dialog");
            this.f22060L = null;
        }
        x0 x0Var = this.f22059K;
        if (x0Var != null) {
            x0Var.r0(requireFragmentManager(), "set_wallpaper_error_dialog");
            this.f22059K = null;
        }
        this.f22055G.h().h(requireActivity(), new I() { // from class: i3.g0
            @Override // androidx.lifecycle.I
            public final void b(Object obj) {
                this.f22034q.S0((g3.n.b) obj);
            }
        });
    }

    @Override // i3.w0.a
    public void u(boolean z9) {
        this.f22066z.t(BottomActionBar.d.APPLY);
    }
}
