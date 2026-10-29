package W6;

import H3.AbstractC0851a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Window;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.Toolbar;
import androidx.core.view.W;
import androidx.fragment.app.AbstractActivityC1136v;
import androidx.fragment.app.AbstractComponentCallbacksC1132q;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.picker.creative.CreativeWallpaperActivity;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: renamed from: W6.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0992i extends AbstractComponentCallbacksC1132q implements CreativeWallpaperActivity.b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private a7.d.c f8821q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private p087i6.k f8823s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f8825u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f8826v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f8818x = new a(null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final long f8819y = 500;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final long f8820z = 500;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final float f8816A = 1.0f;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final float f8817B = 160.0f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final PathInterpolator f8822r = new PathInterpolator(0.2f, 0.0f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final C0988e f8824t = new C0988e();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final p079h8.h f8827w = p079h8.i.b(new p219v8.a() { // from class: W6.g
        @Override // p219v8.a
        public final Object invoke() {
            return AbstractC0992i.Q0(this.f8814q);
        }
    });

    /* JADX INFO: renamed from: W6.i$a */
    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        protected final long a() {
            return AbstractC0992i.f8819y;
        }

        protected final long b() {
            return AbstractC0992i.f8820z;
        }

        protected final float c() {
            return AbstractC0992i.f8817B;
        }

        protected final float d() {
            return AbstractC0992i.f8816A;
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean A0(AbstractC0992i abstractC0992i) {
        return abstractC0992i.x0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p079h8.A C0(p219v8.l lVar, boolean z9) {
        lVar.f(Boolean.valueOf(z9));
        return p079h8.A.f21846a;
    }

    private final void M0(int i10) {
        Context context = getContext();
        if (context != null) {
            Toast.makeText(context, getString(i10), 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final W Q0(AbstractC0992i abstractC0992i) {
        Window window = abstractC0992i.requireActivity().getWindow();
        return androidx.core.view.T.a(window, window.getDecorView());
    }

    protected static final long l0() {
        return f8818x.a();
    }

    protected static final long m0() {
        return f8818x.b();
    }

    protected static final float o0() {
        return f8818x.c();
    }

    protected static final float p0() {
        return f8818x.d();
    }

    private final W u0() {
        return (W) this.f8827w.getValue();
    }

    protected final void B0(final p219v8.l networkChanged) {
        kotlin.jvm.internal.n.h(networkChanged, "networkChanged");
        p087i6.k kVar = this.f8823s;
        if (kVar != null) {
            kVar.f(new p219v8.l() { // from class: W6.h
                @Override // p219v8.l
                public final Object f(Object obj) {
                    return AbstractC0992i.C0(networkChanged, ((Boolean) obj).booleanValue());
                }
            });
        }
    }

    protected final void D0(ImageView imageView) {
        kotlin.jvm.internal.n.h(imageView, "<this>");
        imageView.setImageDrawable(imageView.getContext().getDrawable(R.drawable.img_wallpaper_placeholder));
    }

    protected final void E0(int i10) {
        this.f8825u = i10;
    }

    protected final void F0(a7.d.c cVar) {
        this.f8821q = cVar;
    }

    protected final void G0(LottieAnimationView lottieAnimationView) {
        kotlin.jvm.internal.n.h(lottieAnimationView, "<this>");
        lottieAnimationView.setAnimation(R.raw.aigeneration_flare_8fps_3s);
    }

    protected final void H0(int i10) {
        this.f8826v = i10;
    }

    protected final void I0() {
        requireActivity().getWindow().setStatusBarColor(0);
        requireActivity().getWindow().setNavigationBarColor(0);
    }

    protected final void J0(Toolbar toolbar) {
        if (toolbar != null) {
            toolbar.setNavigationIcon(2131231193);
            toolbar.setNavigationContentDescription(R.string.bottom_action_bar_back);
            Drawable navigationIcon = toolbar.getNavigationIcon();
            if (navigationIcon != null) {
                navigationIcon.setAutoMirrored(true);
            }
            Drawable navigationIcon2 = toolbar.getNavigationIcon();
            if (navigationIcon2 != null) {
                navigationIcon2.setTint(H3.r.a(requireContext(), android.R.attr.textColorPrimary));
            }
        }
    }

    protected final void K0(X6.d.a aVar) {
        int i10;
        Exception excA;
        if (kotlin.jvm.internal.n.d(a7.d.c.f9877q.a(), (aVar == null || (excA = aVar.a()) == null) ? null : excA.getMessage())) {
            return;
        }
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.n.g(contextRequireContext, "requireContext(...)");
        if (p087i6.m.a(contextRequireContext)) {
            a7.d.b bVar = p008a7.d.f9853v;
            if (bVar.c(aVar != null ? aVar.a() : null)) {
                i10 = R.string.nt_troubles_connecting;
            } else {
                i10 = bVar.d(aVar != null ? aVar.a() : null) ? R.string.nt_update_time_tip : R.string.nt_failed_generate;
            }
        } else {
            i10 = R.string.nt_no_network_connection;
        }
        M0(i10);
    }

    protected final void L0() {
        M0(R.string.nt_no_network_connection);
    }

    public final void N0(RecyclerView recyclerView, int i10) {
        kotlin.jvm.internal.n.h(recyclerView, "recyclerView");
        O0(recyclerView, i10, s0());
    }

    public final void O0(RecyclerView recyclerView, int i10, int i11) {
        kotlin.jvm.internal.n.h(recyclerView, "recyclerView");
        if (H6.d.c(recyclerView)) {
            i10 = -i10;
        }
        recyclerView.smoothScrollBy(i10, 0, this.f8822r, i11);
    }

    protected final void P0() {
        p087i6.k kVar = this.f8823s;
        if (kVar != null) {
            kVar.g();
        }
    }

    public void k0(boolean z9) {
        AbstractActivityC1136v abstractActivityC1136vRequireActivity = requireActivity();
        kotlin.jvm.internal.n.f(abstractActivityC1136vRequireActivity, "null cannot be cast to non-null type com.nothing.wallpaper.picker.creative.CreativeWallpaperActivity");
        ((CreativeWallpaperActivity) abstractActivityC1136vRequireActivity).x0(z9);
    }

    protected final C0988e n0() {
        return this.f8824t;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onAttach(Context context) {
        kotlin.jvm.internal.n.h(context, "context");
        super.onAttach(context);
        W wU0 = u0();
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.n.g(contextRequireContext, "requireContext(...)");
        wU0.d(!H6.a.b(contextRequireContext));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f8824t.A(new p219v8.a() { // from class: W6.f
            @Override // p219v8.a
            public final Object invoke() {
                return Boolean.valueOf(AbstractC0992i.A0(this.f8813q));
            }
        });
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onDestroyView() {
        super.onDestroyView();
        this.f8824t.o();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onDetach() {
        super.onDetach();
        W wU0 = u0();
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.n.g(contextRequireContext, "requireContext(...)");
        wU0.d(!H6.a.b(contextRequireContext));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onStart() {
        super.onStart();
        AbstractActivityC1136v abstractActivityC1136vRequireActivity = requireActivity();
        kotlin.jvm.internal.n.f(abstractActivityC1136vRequireActivity, "null cannot be cast to non-null type com.nothing.wallpaper.picker.creative.CreativeWallpaperActivity");
        ((CreativeWallpaperActivity) abstractActivityC1136vRequireActivity).y0(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onStop() {
        super.onStop();
        AbstractActivityC1136v abstractActivityC1136vRequireActivity = requireActivity();
        kotlin.jvm.internal.n.f(abstractActivityC1136vRequireActivity, "null cannot be cast to non-null type com.nothing.wallpaper.picker.creative.CreativeWallpaperActivity");
        ((CreativeWallpaperActivity) abstractActivityC1136vRequireActivity).y0(null);
    }

    protected final int q0() {
        return this.f8825u;
    }

    protected final a7.d.c r0() {
        return this.f8821q;
    }

    public final int s0() {
        return (int) f8819y;
    }

    protected final int t0() {
        return this.f8826v;
    }

    protected final void v0() {
        Context context = getContext();
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.n.g(applicationContext, "getApplicationContext(...)");
            this.f8823s = new p087i6.k(applicationContext);
        }
    }

    protected final boolean w0() {
        AbstractActivityC1136v activity = getActivity();
        return activity == null || activity.isFinishing() || activity.isDestroyed() || getContext() == null;
    }

    protected final boolean x0() {
        a7.d.c cVar = this.f8821q;
        return (cVar instanceof a7.d.c.e) || (cVar instanceof a7.d.c.C0355d);
    }

    protected final boolean y0() {
        return !AbstractC0851a.j(getContext());
    }

    protected final void z0(LottieAnimationView lottieAnimationView, boolean z9) {
        kotlin.jvm.internal.n.h(lottieAnimationView, "<this>");
        if (z9) {
            lottieAnimationView.playAnimation();
        } else {
            lottieAnimationView.cancelAnimation();
        }
    }
}
