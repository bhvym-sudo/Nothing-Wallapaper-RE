package p084i3;

import H3.C;
import H3.F;
import H3.r;
import H3.s;
import I3.v;
import android.app.AlertDialog;
import android.app.WallpaperColors;
import android.app.WallpaperInfo;
import android.app.WallpaperManager;
import android.app.wallpaper.WallpaperDescription;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Color;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.fragment.app.AbstractActivityC1136v;
import androidx.slice.widget.SliceView;
import androidx.slice.widget.g;
import com.android.wallpaper.picker.TouchForwardingLayout;
import com.android.wallpaper.widget.BottomActionBar;
import com.google.android.material.tabs.TabLayout;
import com.nothing.wallpaper.R;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p064g3.n;
import p064g3.x;
import p074h3.InterfaceC1364d;
import p074h3.a0;

/* JADX INFO: loaded from: classes.dex */
public class J extends n0 implements C.c {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    protected C f21966O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    protected CardView f21967P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    protected SurfaceView f21968Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    protected F f21969R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    protected M0 f21970S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    protected SurfaceView f21971T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    protected M0 f21972U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private Intent f21973V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private Intent f21974W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private SliceView f21975X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private androidx.lifecycle.C f21976Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private Point f21977Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private ViewGroup f21978a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private TouchForwardingLayout f21979b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private SurfaceView f21980c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private Future f21981d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private WallpaperColors f21982e0;

    class a implements F.a {
        a() {
        }

        @Override // H3.F.a
        public void a() {
            J.this.Q1(null);
        }
    }

    class b implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f21984a;

        b(View view) {
            this.f21984a = view;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            J j9 = J.this;
            j9.c1(j9.f21967P);
            this.f21984a.removeOnLayoutChangeListener(this);
        }
    }

    class c implements BottomActionBar.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f21986a;

        c(View view) {
            this.f21986a = view;
        }

        @Override // com.android.wallpaper.widget.BottomActionBar.c
        public void a() {
            J.this.f21978a0.setImportantForAccessibility(4);
            this.f21986a.setImportantForAccessibility(4);
        }

        @Override // com.android.wallpaper.widget.BottomActionBar.c
        public void b() {
            J.this.f21978a0.setImportantForAccessibility(1);
            this.f21986a.setImportantForAccessibility(1);
        }
    }

    private final class d extends BottomActionBar.f {
        @Override // com.android.wallpaper.widget.BottomActionBar.f
        public int d() {
            return R.layout.preview_customize_settings;
        }

        @Override // com.android.wallpaper.widget.BottomActionBar.f
        public void e(View view) {
            super.e(view);
            if (J.this.f21976Y == null || !J.this.f21976Y.g() || J.this.f21975X == null) {
                return;
            }
            J.this.f21976Y.m(J.this.f21975X);
        }

        @Override // com.android.wallpaper.widget.BottomActionBar.f
        public void f(View view) {
            J.this.f21975X = (SliceView) view.findViewById(R.id.settings_slice);
            J.this.f21975X.setMode(2);
            J.this.f21975X.setScrollable(false);
            if (J.this.f21976Y != null) {
                J.this.f21976Y.i(J.this.f21975X);
            }
        }

        private d(Context context) {
            super(context);
        }
    }

    private x.a A1() {
        x.a aVar;
        try {
            aVar = (x.a) this.f21981d0.get(50L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            Log.i("LivePreviewFragment", "Couldn't obtain placeholder color", e10);
            aVar = null;
        }
        return aVar == null ? new x.a(new WallpaperColors(Color.valueOf(0), null, null), null) : aVar;
    }

    private boolean G1(ApplicationInfo applicationInfo) {
        return (applicationInfo == null || (applicationInfo.flags & 1) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H1(View view) {
        Z0(null, this.f22062v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I1(View view) {
        startActivity(this.f21974W);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J1(View view) {
        V1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K1(boolean z9) {
        if (z9) {
            return;
        }
        this.f22066z.z(BottomActionBar.d.EDIT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L1() {
        AbstractActivityC1136v activity = getActivity();
        if (activity == null) {
            return;
        }
        if (this.f21969R.c() != null) {
            this.f21969R.i(true);
            Integer numA = A1().a();
            this.f22062v.o(activity.getApplicationContext()).q(activity, this.f21969R.c(), numA != null ? numA.intValue() : r.a(activity, android.R.attr.colorBackground), this.f22063w);
        }
        T1(this.f22062v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M1(WallpaperColors wallpaperColors) {
        onWallpaperColorsChanged(wallpaperColors, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean N1(View view, MotionEvent motionEvent) {
        C c10 = this.f21966O;
        if (c10 == null || c10.i0() == null) {
            return false;
        }
        float width = this.f21979b0.getWidth() / this.f21977Z.x;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f22066z.s();
        }
        MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        motionEventObtainNoHistory.setLocation(motionEvent.getX() / width, motionEvent.getY() / width);
        try {
            this.f21966O.i0().dispatchPointer(motionEventObtainNoHistory);
            if (actionMasked == 1) {
                this.f21966O.i0().dispatchWallpaperCommand("android.wallpaper.tap", (int) motionEvent.getX(), (int) motionEvent.getY(), 0, (Bundle) null);
            } else if (actionMasked == 6) {
                int actionIndex = motionEvent.getActionIndex();
                this.f21966O.i0().dispatchWallpaperCommand("android.wallpaper.secondaryTap", (int) motionEvent.getX(actionIndex), (int) motionEvent.getY(actionIndex), 0, (Bundle) null);
            }
            return false;
        } catch (RemoteException unused) {
            Log.e("LivePreviewFragment", "Remote exception of wallpaper connection");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O1(DialogInterface dialogInterface) {
        this.f22066z.t(BottomActionBar.d.DELETE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P1(DialogInterface dialogInterface, int i10) {
        z1();
    }

    private void R1() {
        this.f21971T.setZOrderMediaOverlay(true);
        this.f21971T.getHolder().addCallback(this.f21972U);
    }

    private void S1() {
        this.f21968Q.setZOrderMediaOverlay(true);
        this.f21968Q.getHolder().addCallback(this.f21970S);
    }

    private void U1() {
        this.f21967P.setOnTouchListener(new View.OnTouchListener() { // from class: i3.E
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f21958q.N1(view, motionEvent);
            }
        });
    }

    private void V1() {
        new AlertDialog.Builder(getContext()).setMessage(R.string.delete_wallpaper_confirmation).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: i3.F
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f21959q.O1(dialogInterface);
            }
        }).setPositiveButton(R.string.delete_live_wallpaper, new DialogInterface.OnClickListener() { // from class: i3.G
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f21960q.P1(dialogInterface, i10);
            }
        }).setNegativeButton(android.R.string.cancel, (DialogInterface.OnClickListener) null).create().show();
    }

    private void W1() {
        this.f21980c0.getHolder().addCallback(this.f21969R);
        this.f21980c0.setZOrderMediaOverlay(true);
    }

    private void z1() {
        if (this.f21973V != null) {
            requireContext().startService(this.f21973V);
            K0(false);
        }
    }

    protected String B1(WallpaperInfo wallpaperInfo) {
        Bundle bundle;
        WallpaperInfo wallpaperInfo2 = WallpaperManager.getInstance(requireContext()).getWallpaperInfo();
        ServiceInfo serviceInfo = wallpaperInfo.getServiceInfo();
        if (!G1(serviceInfo.applicationInfo)) {
            Log.d("LivePreviewFragment", "This wallpaper is not pre-installed: " + serviceInfo.name);
            return null;
        }
        ServiceInfo serviceInfo2 = wallpaperInfo2 == null ? null : wallpaperInfo2.getServiceInfo();
        if ((serviceInfo2 == null || !TextUtils.equals(serviceInfo.name, serviceInfo2.name)) && (bundle = serviceInfo.metaData) != null) {
            return bundle.getString("action_delete_live_wallpaper");
        }
        return null;
    }

    protected String C1(WallpaperInfo wallpaperInfo) {
        return wallpaperInfo.getSettingsActivity();
    }

    protected Uri D1(WallpaperInfo wallpaperInfo) {
        return wallpaperInfo.getSettingsSliceUri();
    }

    protected Intent E1(WallpaperInfo wallpaperInfo) {
        return new Intent("android.service.wallpaper.WallpaperService").setClassName(wallpaperInfo.getPackageName(), wallpaperInfo.getServiceName());
    }

    protected boolean F1() {
        C c10 = this.f21966O;
        return c10 != null && c10.k0();
    }

    @Override // p084i3.n0
    protected int M0() {
        return R.layout.fragment_live_preview;
    }

    protected void Q1(ImageView imageView) {
        this.f21980c0.post(new Runnable() { // from class: i3.H
            @Override // java.lang.Runnable
            public final void run() {
                this.f21962q.L1();
            }
        });
    }

    protected void T1(x xVar) {
        final J j9;
        AbstractActivityC1136v activity = getActivity();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        if (this.f21966O == null && C.l0()) {
            j9 = this;
            C c10 = new C(E1(xVar.q()), activity, j9, this.f21980c0, null, Integer.valueOf(this.f22052D ? 1 : 2), this.f22053E ? C.d.EDIT_NON_CURRENT : C.d.EDIT_CURRENT, new WallpaperDescription.Builder().setComponent(xVar.q().getComponent()).build());
            j9.f21966O = c10;
            c10.u0(true);
        } else {
            j9 = this;
            v.b(activity, xVar.o(activity), new v.a() { // from class: i3.I
                @Override // I3.v.a
                public final void a(WallpaperColors wallpaperColors) {
                    this.f21964a.M1(wallpaperColors);
                }
            });
        }
        C c11 = j9.f21966O;
        if (c11 == null || c11.d0()) {
            return;
        }
        j9.f21966O.e0();
        j9.f21966O = null;
    }

    @Override // p084i3.n0
    protected void a1(int i10) {
        a0 a0Var = this.f22064x;
        AbstractActivityC1136v activity = getActivity();
        x xVar = this.f22062v;
        WallpaperColors wallpaperColorsB = this.f21982e0;
        if (wallpaperColorsB == null) {
            wallpaperColorsB = A1().b();
        }
        a0Var.u(activity, xVar, null, i10, 0.0f, null, wallpaperColorsB, n.f(this.f22056H));
    }

    @Override // p084i3.n0, com.android.wallpaper.picker.a, p084i3.C1395d
    protected void e0(BottomActionBar bottomActionBar) {
        super.e0(bottomActionBar);
        AbstractActivityC1136v activity = getActivity();
        p074h3.J j9 = new p074h3.J();
        if (activity == null || !(activity.isInMultiWindowMode() || j9.b(getContext()))) {
            this.f22066z.S(BottomActionBar.d.INFORMATION, BottomActionBar.d.DELETE, BottomActionBar.d.EDIT, BottomActionBar.d.CUSTOMIZE, BottomActionBar.d.APPLY);
        } else {
            this.f22066z.S(BottomActionBar.d.INFORMATION, BottomActionBar.d.DELETE, BottomActionBar.d.CUSTOMIZE, BottomActionBar.d.APPLY);
        }
        this.f22066z.P(BottomActionBar.d.APPLY, new View.OnClickListener() { // from class: i3.B
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21951q.H1(view);
            }
        });
        this.f22066z.r(new n0.e(getContext()), BottomActionBar.d.INFORMATION);
        this.f22066z.setAccessibilityCallback(new c(getView().findViewById(R.id.separated_tabs_container)));
        Uri uriD1 = D1(this.f22062v.q());
        if (uriD1 != null) {
            this.f21976Y = g.a(requireContext(), uriD1);
            this.f22066z.r(new d(getContext()), BottomActionBar.d.CUSTOMIZE);
        } else if (this.f21974W != null) {
            this.f22066z.P(BottomActionBar.d.CUSTOMIZE, new View.OnClickListener() { // from class: i3.C
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f21954q.I1(view);
                }
            });
        } else {
            this.f22066z.C(BottomActionBar.d.CUSTOMIZE);
        }
        if (TextUtils.isEmpty(B1(this.f22062v.q()))) {
            this.f22066z.C(BottomActionBar.d.DELETE);
        } else {
            this.f22066z.P(BottomActionBar.d.DELETE, new View.OnClickListener() { // from class: i3.D
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f21957q.J1(view);
                }
            });
        }
        this.f22066z.Q();
        this.f22066z.u();
        if (F1()) {
            this.f22066z.x();
        }
    }

    @Override // p084i3.n0
    protected void l1(boolean z9) {
        this.f21968Q.setVisibility(z9 ? 0 : 4);
        this.f21971T.setVisibility(z9 ? 4 : 0);
        this.f22050B.o(z9);
    }

    @Override // H3.C.c
    public void m() {
        if (getActivity() == null) {
            return;
        }
        this.f21969R.c().animate().setStartDelay(250L).setDuration(250L).alpha(0.0f).setInterpolator(n0.f22048N).start();
        this.f21980c0.setBackgroundColor(0);
        BottomActionBar bottomActionBar = this.f22066z;
        if (bottomActionBar != null) {
            bottomActionBar.x();
        }
    }

    @Override // p084i3.n0, androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WallpaperInfo wallpaperInfoQ = this.f22062v.q();
        this.f21981d0 = this.f22062v.b(getContext());
        String strB1 = B1(wallpaperInfoQ);
        if (!TextUtils.isEmpty(strB1)) {
            Intent intent = new Intent(strB1);
            this.f21973V = intent;
            intent.setPackage(wallpaperInfoQ.getPackageName());
            this.f21973V.putExtra("android.live_wallpaper.info", wallpaperInfoQ);
        }
        String strC1 = C1(wallpaperInfoQ);
        if (strC1 != null) {
            Intent intent2 = new Intent();
            this.f21974W = intent2;
            intent2.setComponent(new ComponentName(wallpaperInfoQ.getPackageName(), strC1));
            this.f21974W.putExtra("android.service.wallpaper.PREVIEW_MODE", true);
            if (this.f21974W.resolveActivityInfo(requireContext().getPackageManager(), 0) == null) {
                Log.i("LivePreviewFragment", "Couldn't find wallpaper settings activity: " + strC1);
                this.f21974W = null;
            }
        }
    }

    @Override // p084i3.n0, androidx.fragment.app.AbstractComponentCallbacksC1132q
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f21977Z = s.a().e(requireActivity().getWindowManager().getDefaultDisplay());
        this.f21978a0 = (ViewGroup) viewOnCreateView.findViewById(R.id.container);
        this.f21979b0 = (TouchForwardingLayout) viewOnCreateView.findViewById(R.id.touch_forwarding_layout);
        k1(viewOnCreateView);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone((ConstraintLayout) this.f21978a0);
        constraintSet.setDimensionRatio(this.f21979b0.getId(), String.format(Locale.US, "%d:%d", Integer.valueOf(this.f21977Z.x), Integer.valueOf(this.f21977Z.y)));
        constraintSet.applyTo((ConstraintLayout) this.f21978a0);
        this.f21967P = (CardView) this.f21978a0.findViewById(R.id.wallpaper_full_preview_card);
        this.f22050B.m(new H3.n.b() { // from class: i3.A
            @Override // H3.n.b
            public final void a(boolean z9) {
                this.f21949a.K1(z9);
            }
        });
        SurfaceView surfaceView = (SurfaceView) this.f21967P.findViewById(R.id.lock_surface);
        this.f21971T = surfaceView;
        InterfaceC1364d.a aVar = InterfaceC1364d.a.LOCK_SCREEN;
        Boolean bool = Boolean.TRUE;
        this.f21972U = I0(surfaceView, aVar, bool);
        this.f21979b0.setTargetView(this.f21967P);
        this.f21979b0.setForwardingEnabled(true);
        SurfaceView surfaceView2 = (SurfaceView) this.f21967P.findViewById(R.id.workspace_surface);
        this.f21968Q = surfaceView2;
        this.f21970S = I0(surfaceView2, InterfaceC1364d.a.HOME_SCREEN, bool);
        this.f21980c0 = (SurfaceView) this.f21967P.findViewById(R.id.wallpaper_surface);
        this.f21969R = new F(getContext(), this.f21967P, this.f21980c0, this.f21981d0, new a());
        e1((TabLayout) viewOnCreateView.findViewById(R.id.separated_tabs));
        viewOnCreateView.addOnLayoutChangeListener(new b(viewOnCreateView));
        return viewOnCreateView;
    }

    @Override // com.android.wallpaper.picker.a, androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onDestroyView() {
        SliceView sliceView;
        super.onDestroyView();
        androidx.lifecycle.C c10 = this.f21976Y;
        if (c10 != null && c10.g() && (sliceView = this.f21975X) != null) {
            this.f21976Y.m(sliceView);
            this.f21976Y = null;
        }
        C c11 = this.f21966O;
        if (c11 != null) {
            c11.e0();
            this.f21966O = null;
        }
        this.f21972U.b();
        this.f21971T.getHolder().removeCallback(this.f21972U);
        this.f21970S.b();
        this.f21968Q.getHolder().removeCallback(this.f21970S);
        this.f21969R.b();
        this.f21980c0.getHolder().removeCallback(this.f21969R);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onPause() {
        super.onPause();
        C c10 = this.f21966O;
        if (c10 != null) {
            c10.u0(false);
        }
    }

    @Override // p084i3.n0, androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onResume() {
        super.onResume();
        C c10 = this.f21966O;
        if (c10 != null) {
            c10.u0(true);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onStop() {
        super.onStop();
        C c10 = this.f21966O;
        if (c10 != null) {
            c10.g0();
        }
    }

    @Override // p084i3.C1395d, androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        W1();
        U1();
        S1();
        R1();
    }

    @Override // H3.C.c
    public void onWallpaperColorsChanged(WallpaperColors wallpaperColors, int i10) {
        this.f21982e0 = wallpaperColors;
        this.f22050B.n((wallpaperColors == null || (wallpaperColors.getColorHints() & 1) == 0) ? H3.n.c.LIGHT : H3.n.c.DARK);
    }
}
