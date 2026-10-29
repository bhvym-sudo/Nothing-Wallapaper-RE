package E7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.cardview.widget.CardView;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.picker.lockscreen.depth.DepthEffectState;
import com.nothing.wallpaper.picker.lockscreen.depth.NotApplicableReason;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: renamed from: E7.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0771c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f1394e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final PathInterpolator f1395f = new PathInterpolator(0.4f, 0.0f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Z f1396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p079h8.h f1397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CardView f1398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ObjectAnimator f1399d;

    /* JADX INFO: renamed from: E7.c$a */
    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: E7.c$b */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1400a;

        static {
            int[] iArr = new int[NotApplicableReason.values().length];
            try {
                iArr[NotApplicableReason.NO_SUBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NotApplicableReason.NOT_SUPPORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NotApplicableReason.EXTENDED_WIDGET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NotApplicableReason.APPLIED_GLASS_EFFECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NotApplicableReason.NO_OVERLAP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[NotApplicableReason.OVERLAP_TOO_MUCH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f1400a = iArr;
        }
    }

    /* JADX INFO: renamed from: E7.c$c, reason: collision with other inner class name */
    public static final class C0057c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f1401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f1402b;

        C0057c(View view, boolean z9) {
            this.f1401a = view;
            this.f1402b = z9;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            kotlin.jvm.internal.n.h(animation, "animation");
            this.f1401a.setAlpha(1.0f);
            this.f1401a.setVisibility(this.f1402b ? 0 : 4);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.n.h(animation, "animation");
            this.f1401a.setAlpha(1.0f);
            this.f1401a.setVisibility(this.f1402b ? 0 : 4);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            kotlin.jvm.internal.n.h(animation, "animation");
            this.f1401a.setVisibility(0);
        }
    }

    public C0771c(Z wallpaperHelper) {
        kotlin.jvm.internal.n.h(wallpaperHelper, "wallpaperHelper");
        this.f1396a = wallpaperHelper;
        this.f1397b = p079h8.i.b(new p219v8.a() { // from class: E7.b
            @Override // p219v8.a
            public final Object invoke() {
                return C0771c.i();
            }
        });
        this.f1398c = wallpaperHelper.D();
    }

    private final p167q6.d c() {
        return (p167q6.d) this.f1397b.getValue();
    }

    public static /* synthetic */ ObjectAnimator f(C0771c c0771c, View view, boolean z9, long j9, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j9 = 300;
        }
        return c0771c.e(view, z9, j9);
    }

    private final void g(int i10) {
        Context context = this.f1396a.y().getContext();
        if (context == null) {
            return;
        }
        p167q6.d dVarC = c();
        String string = context.getString(i10);
        kotlin.jvm.internal.n.g(string, "getString(...)");
        dVarC.d(context, string);
    }

    private final void h() {
        com.nothing.wallpaper.common.log.c.d("DepthUIController", "showUnavailableTip " + this.f1396a.w());
        Context context = this.f1396a.y().getContext();
        if (context == null) {
            return;
        }
        DepthEffectState depthEffectStateW = this.f1396a.w();
        boolean z9 = depthEffectStateW instanceof DepthEffectState.ModuleUnavailable;
        int i10 = R.string.depth_effect_not_applicable;
        if (z9) {
            if (!p087i6.m.a(context)) {
                i10 = R.string.nt_no_network_connection;
            } else if (((DepthEffectState.ModuleUnavailable) depthEffectStateW).isInstalling()) {
                i10 = R.string.depth_effect_download_component;
            }
            g(i10);
            return;
        }
        if (depthEffectStateW instanceof DepthEffectState.DepthNotApplicable) {
            switch (b.f1400a[((DepthEffectState.DepthNotApplicable) depthEffectStateW).getReason().ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    break;
                case 5:
                case 6:
                    i10 = R.string.depth_effect_try_move;
                    break;
                default:
                    throw new p079h8.m();
            }
            g(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p167q6.d i() {
        return new p167q6.d();
    }

    public final ObjectAnimator b() {
        return this.f1399d;
    }

    public final void d(DepthEffectState newState) {
        kotlin.jvm.internal.n.h(newState, "newState");
        com.nothing.wallpaper.common.log.c.k("DepthUIController", "handleDepthStateChange newState:" + newState);
        boolean z9 = this.f1398c.getVisibility() == 0;
        if (!(newState instanceof DepthEffectState.Initializing)) {
            if ((newState instanceof DepthEffectState.ModuleUnavailable) || (newState instanceof DepthEffectState.DepthNotApplicable)) {
                z9 = false;
            } else if (newState instanceof DepthEffectState.DepthOn) {
                z9 = true;
            } else {
                if (!(newState instanceof DepthEffectState.DepthOff)) {
                    throw new p079h8.m();
                }
                z9 = false;
            }
        }
        ObjectAnimator objectAnimator = this.f1399d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (z9 != (this.f1398c.getVisibility() == 0)) {
            this.f1399d = e(this.f1398c, z9, 300L);
        }
    }

    public final ObjectAnimator e(View view, boolean z9, long j9) {
        kotlin.jvm.internal.n.h(view, "view");
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, z9 ? 0.0f : 1.0f, z9 ? 1.0f : 0.0f);
        objectAnimatorOfFloat.setDuration(j9);
        objectAnimatorOfFloat.setInterpolator(f1395f);
        objectAnimatorOfFloat.addListener(new C0057c(view, z9));
        objectAnimatorOfFloat.start();
        kotlin.jvm.internal.n.e(objectAnimatorOfFloat);
        return objectAnimatorOfFloat;
    }

    public final void j(boolean z9, boolean z10) {
        p098j7.j jVarP2;
        if (z10) {
            h();
        }
        if (z9 || (jVarP2 = this.f1396a.y().P2()) == null) {
            return;
        }
        jVarP2.a1();
    }
}
