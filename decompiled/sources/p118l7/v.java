package p118l7;

import G6.e;
import H3.C;
import android.app.wallpaper.WallpaperDescription;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.service.wallpaper.IWallpaperEngine;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.AbstractActivityC1136v;
import androidx.fragment.app.AbstractComponentCallbacksC1132q;
import androidx.fragment.app.X;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import com.android.launcher3.w;
import com.nothing.wallpaper.R;
import java.io.IOException;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import p079h8.A;
import p079h8.h;
import p084i3.J0;

/* JADX INFO: loaded from: classes2.dex */
public final class v extends k implements C.c {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final String f23062J = "CropLiveFragment";

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final h f23063K = X.b(this, F.b(p148o7.h.class), new a(this), new b(null, this), new c(this));

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private CardView f23064L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private SurfaceView f23065M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private H3.F f23066N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private C f23067O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private J0 f23068P;

    public static final class a extends o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ AbstractComponentCallbacksC1132q f23069r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
            super(0);
            this.f23069r = abstractComponentCallbacksC1132q;
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e0 invoke() {
            return this.f23069r.requireActivity().getViewModelStore();
        }
    }

    public static final class b extends o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p219v8.a f23070r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ AbstractComponentCallbacksC1132q f23071s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p219v8.a aVar, AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
            super(0);
            this.f23070r = aVar;
            this.f23071s = abstractComponentCallbacksC1132q;
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Z0.a invoke() {
            Z0.a aVar;
            p219v8.a aVar2 = this.f23070r;
            return (aVar2 == null || (aVar = (Z0.a) aVar2.invoke()) == null) ? this.f23071s.requireActivity().getDefaultViewModelCreationExtras() : aVar;
        }
    }

    public static final class c extends o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ AbstractComponentCallbacksC1132q f23072r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
            super(0);
            this.f23072r = abstractComponentCallbacksC1132q;
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d0.c invoke() {
            return this.f23072r.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t1(v vVar) {
        vVar.u1();
    }

    private final void u1() {
        SurfaceView surfaceView = this.f23065M;
        if (surfaceView != null) {
            surfaceView.post(new Runnable() { // from class: l7.u
                @Override // java.lang.Runnable
                public final void run() {
                    v.v1(this.f23061q);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v1(v vVar) {
        H3.F f10;
        if (vVar.getActivity() == null) {
            return;
        }
        H3.F f11 = vVar.f23066N;
        if ((f11 != null ? f11.c() : null) != null && (f10 = vVar.f23066N) != null) {
            f10.i(true);
        }
        vVar.w1();
    }

    private final void w1() {
        v vVar;
        C c10;
        if (M0()) {
            return;
        }
        String strR1 = r1();
        Intent intentY = G0().y();
        com.nothing.wallpaper.common.log.c.k(strR1, "setUpLiveWallpaperPreview " + (intentY != null ? intentY.getComponent() : null));
        if (this.f23067O == null && C.l0()) {
            if (w.f15765i) {
                Intent intentY2 = G0().y();
                AbstractActivityC1136v activity = getActivity();
                SurfaceView surfaceView = this.f23065M;
                n.e(surfaceView);
                vVar = this;
                c10 = new C(intentY2, activity, vVar, surfaceView, null, Integer.valueOf(G0().z() ? 1 : 2), N0() ? C.d.EDIT_NON_CURRENT : C.d.EDIT_CURRENT, new WallpaperDescription.Builder().setComponent(G0().x()).build());
            } else {
                Intent intentY3 = G0().y();
                AbstractActivityC1136v activity2 = getActivity();
                SurfaceView surfaceView2 = this.f23065M;
                n.e(surfaceView2);
                C c11 = new C(intentY3, activity2, this, surfaceView2, null, Integer.valueOf(G0().z() ? 1 : 2), N0() ? C.d.EDIT_NON_CURRENT : C.d.EDIT_CURRENT);
                vVar = this;
                c10 = c11;
            }
            vVar.f23067O = c10;
            c10.u0(true);
        } else {
            vVar = this;
        }
        C c12 = vVar.f23067O;
        if (c12 == null || c12.d0()) {
            return;
        }
        C c13 = vVar.f23067O;
        if (c13 != null) {
            c13.e0();
        }
        vVar.f23067O = null;
    }

    private final void x1() {
        CardView cardView = this.f23064L;
        if (cardView != null) {
            cardView.setOnTouchListener(new View.OnTouchListener() { // from class: l7.s
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return v.y1(this.f23059q, view, motionEvent);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean y1(v vVar, View view, MotionEvent ev) {
        IWallpaperEngine iWallpaperEngineI0;
        IWallpaperEngine iWallpaperEngineI1;
        IWallpaperEngine iWallpaperEngineI2;
        n.h(ev, "ev");
        C c10 = vVar.f23067O;
        if ((c10 != null ? c10.i0() : null) == null) {
            return false;
        }
        int actionMasked = ev.getActionMasked();
        MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(ev);
        try {
            try {
                C c11 = vVar.f23067O;
                if (c11 != null && (iWallpaperEngineI2 = c11.i0()) != null) {
                    iWallpaperEngineI2.dispatchPointer(motionEventObtainNoHistory);
                }
                if (actionMasked == 1) {
                    C c12 = vVar.f23067O;
                    if (c12 != null && (iWallpaperEngineI0 = c12.i0()) != null) {
                        iWallpaperEngineI0.dispatchWallpaperCommand("android.wallpaper.tap", (int) ev.getX(), (int) ev.getY(), 0, (Bundle) null);
                    }
                } else if (actionMasked == 6) {
                    int actionIndex = ev.getActionIndex();
                    C c13 = vVar.f23067O;
                    if (c13 != null && (iWallpaperEngineI1 = c13.i0()) != null) {
                        iWallpaperEngineI1.dispatchWallpaperCommand("android.wallpaper.secondaryTap", (int) ev.getX(actionIndex), (int) ev.getY(actionIndex), 0, (Bundle) null);
                    }
                }
                A a10 = A.f21846a;
            } catch (RemoteException unused) {
                Log.e(vVar.r1(), "Remote exception of wallpaper connection");
            }
            return false;
        } finally {
            motionEventObtainNoHistory.recycle();
        }
    }

    private final void z1() {
        SurfaceHolder holder;
        SurfaceView surfaceView = this.f23065M;
        if (surfaceView != null && (holder = surfaceView.getHolder()) != null) {
            holder.addCallback(this.f23066N);
        }
        SurfaceView surfaceView2 = this.f23065M;
        if (surfaceView2 != null) {
            surfaceView2.setZOrderMediaOverlay(true);
        }
    }

    @Override // p118l7.k
    protected void K0(View view) {
        n.h(view, "view");
        super.K0(view);
        this.f23064L = (CardView) view.findViewById(R.id.live_wallpaper_preview_card);
        this.f23065M = (SurfaceView) view.findViewById(R.id.live_wallpaper_surface);
        Context context = getContext();
        CardView cardView = this.f23064L;
        SurfaceView surfaceView = this.f23065M;
        Context contextRequireContext = requireContext();
        n.g(contextRequireContext, "requireContext(...)");
        this.f23066N = new H3.F(context, cardView, surfaceView, e.f(contextRequireContext), new H3.F.a() { // from class: l7.t
            @Override // H3.F.a
            public final void a() {
                v.t1(this.f23060a);
            }
        });
        H0();
    }

    @Override // H3.C.c
    public void m() {
        SurfaceView surfaceView;
        com.nothing.wallpaper.common.log.c.k(r1(), "onEngineShown");
        if (M0() || (surfaceView = this.f23065M) == null) {
            return;
        }
        surfaceView.setBackgroundColor(0);
    }

    @Override // p118l7.k, androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context context = getContext();
        this.f23068P = new J0(context != null ? context.getApplicationContext() : null, P0());
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        n.h(inflater, "inflater");
        Y0();
        View viewInflate = inflater.inflate(R.layout.nt_fragment_crop_live_wallpaper, viewGroup, false);
        n.e(viewInflate);
        K0(viewInflate);
        return viewInflate;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onDestroy() throws IOException {
        super.onDestroy();
        G0().w();
    }

    @Override // p118l7.k, androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onDestroyView() {
        SurfaceHolder holder;
        super.onDestroyView();
        C c10 = this.f23067O;
        if (c10 != null) {
            c10.e0();
        }
        this.f23067O = null;
        this.f23064L = null;
        this.f23065M = null;
        H3.F f10 = this.f23066N;
        if (f10 != null) {
            f10.b();
        }
        SurfaceView surfaceView = this.f23065M;
        if (surfaceView != null && (holder = surfaceView.getHolder()) != null) {
            holder.removeCallback(this.f23066N);
        }
        this.f23066N = null;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onPause() {
        super.onPause();
        C c10 = this.f23067O;
        if (c10 != null) {
            c10.u0(false);
        }
    }

    @Override // p118l7.k, androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onResume() {
        super.onResume();
        C c10 = this.f23067O;
        if (c10 != null) {
            c10.u0(true);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onStop() {
        super.onStop();
        C c10 = this.f23067O;
        if (c10 != null) {
            c10.g0();
        }
    }

    @Override // p118l7.k, androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onViewCreated(View view, Bundle bundle) {
        n.h(view, "view");
        super.onViewCreated(view, bundle);
        com.nothing.wallpaper.common.log.c.j("onViewCreated");
        z1();
        x1();
    }

    protected String r1() {
        return this.f23062J;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p118l7.k
    /* JADX INFO: renamed from: s1, reason: merged with bridge method [inline-methods] */
    public p148o7.h G0() {
        return (p148o7.h) this.f23063K.getValue();
    }
}
