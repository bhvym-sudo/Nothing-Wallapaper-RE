package I7;

import E7.Z;
import android.content.Context;
import android.graphics.PointF;
import androidx.fragment.app.AbstractActivityC1136v;
import com.nothing.wallpaper.effects.data.model.ViewScope;
import com.nothing.wallpaper.picker.lockscreen.depth.DepthEffectState;
import com.nothing.wallpaper.picker.lockscreen.ui.LockScreenFragment;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p064g3.x;
import p089i8.AbstractC1444s;
import p098j7.j;
import p148o7.g;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f3131b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LockScreenFragment f3132a;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public d(LockScreenFragment fragment) {
        n.h(fragment, "fragment");
        this.f3132a = fragment;
    }

    private final boolean a() {
        x xVarF;
        Z zN2 = this.f3132a.N2();
        return (zN2 == null || (xVarF = zN2.F()) == null || !G6.e.i(xVarF)) ? false : true;
    }

    private final boolean b() {
        Z zN2 = this.f3132a.N2();
        return zN2 != null && zN2.G();
    }

    private final boolean c() {
        j jVarP2 = this.f3132a.P2();
        if (jVarP2 == null || !jVarP2.k0()) {
            return false;
        }
        Z zN2 = this.f3132a.N2();
        return !((zN2 != null ? zN2.w() : null) instanceof DepthEffectState.DepthOn);
    }

    private final boolean d() {
        j jVarP2 = this.f3132a.P2();
        if (jVarP2 != null && jVarP2.k0()) {
            return false;
        }
        Z zN2 = this.f3132a.N2();
        return (zN2 != null ? zN2.w() : null) instanceof DepthEffectState.DepthOn;
    }

    private final boolean e() {
        if (b()) {
            return d() || c();
        }
        return false;
    }

    private final boolean f() {
        x xVarF;
        Z zN2 = this.f3132a.N2();
        return (zN2 == null || (xVarF = zN2.F()) == null || !G6.e.m(xVarF)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    public final boolean g() {
        g gVarM2;
        boolean z9;
        if (f() || (gVarM2 = this.f3132a.M2()) == null) {
            return false;
        }
        ViewScope viewScopeW = gVarM2.W();
        PointF center = viewScopeW != null ? viewScopeW.getCenter() : null;
        ViewScope viewScopeB0 = gVarM2.b0();
        if (n.d(center, viewScopeB0 != null ? viewScopeB0.getCenter() : null)) {
            ViewScope viewScopeW2 = gVarM2.W();
            Float fValueOf = viewScopeW2 != null ? Float.valueOf(viewScopeW2.getScale()) : null;
            ViewScope viewScopeB1 = gVarM2.b0();
            if (n.c(fValueOf, viewScopeB1 != null ? Float.valueOf(viewScopeB1.getScale()) : null)) {
                z9 = false;
            } else {
                z9 = true;
            }
        } else {
            z9 = true;
        }
        Z zN2 = this.f3132a.N2();
        com.nothing.wallpaper.common.log.c.d("WallpaperPersistStrategy", "isNeedSaveWallpaper moved:" + z9 + " state:" + (zN2 != null ? zN2.w() : null));
        return z9 || (b() && d());
    }

    public final boolean h() {
        if (f()) {
            return false;
        }
        return g() || e();
    }

    public final void i() {
        g gVarM2;
        Z zN2;
        PointF pointFG;
        if (f() || (gVarM2 = this.f3132a.M2()) == null || (zN2 = this.f3132a.N2()) == null) {
            return;
        }
        ViewScope viewScopeB0 = gVarM2.b0();
        float scale = viewScopeB0 != null ? viewScopeB0.getScale() : zN2.A().h();
        ViewScope viewScopeB1 = gVarM2.b0();
        if (viewScopeB1 == null || (pointFG = viewScopeB1.getCenter()) == null) {
            pointFG = zN2.A().g();
        }
        if (b()) {
            zN2.C().setScaleAndCenter(scale, pointFG);
        }
        zN2.E().setScaleAndCenter(scale, pointFG);
        gVarM2.j0(pointFG, Float.valueOf(scale), "reason_depth_init");
    }

    public final boolean j() {
        Context context = this.f3132a.getContext();
        if (context == null || !n.d(this.f3132a.T2().j().getValue(), Boolean.TRUE) || f()) {
            return false;
        }
        boolean zG = g();
        com.nothing.wallpaper.common.log.c.k("WallpaperPersistStrategy", "saveWallpaper need:" + zG);
        if (zG) {
            if (a()) {
                j jVarP2 = this.f3132a.P2();
                if (jVarP2 != null) {
                    AbstractActivityC1136v abstractActivityC1136vRequireActivity = this.f3132a.requireActivity();
                    n.g(abstractActivityC1136vRequireActivity, "requireActivity(...)");
                    jVarP2.Z0(abstractActivityC1136vRequireActivity, AbstractC1444s.e(p108k7.a.Blur), 2, null);
                }
            } else {
                j jVarP3 = this.f3132a.P2();
                if (jVarP3 != null) {
                    AbstractActivityC1136v abstractActivityC1136vRequireActivity2 = this.f3132a.requireActivity();
                    n.g(abstractActivityC1136vRequireActivity2, "requireActivity(...)");
                    jVarP3.Z0(abstractActivityC1136vRequireActivity2, AbstractC1444s.l(), 1, null);
                }
            }
        }
        if (b() && c()) {
            j.f22340T.c(context, false);
        }
        return zG;
    }
}
