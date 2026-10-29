package K6;

import F8.C0803b0;
import F8.I;
import H3.s;
import J7.i;
import K1.p;
import U5.e;
import android.app.Activity;
import android.app.WallpaperManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Bundle;
import androidx.fragment.app.AbstractComponentCallbacksC1132q;
import androidx.lifecycle.InterfaceC1148h;
import androidx.lifecycle.InterfaceC1163x;
import com.nothing.wallpaper.picker.lockscreen.ui.view.H;
import kotlin.jvm.internal.n;
import p010b.j;
import p064g3.InterfaceC1357b;
import p064g3.k;
import p064g3.x;
import p074h3.InterfaceC1363c;
import p084i3.C1422v;
import p084i3.J;
import p167q6.f;
import p248y7.C2005g;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends p {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private InterfaceC1357b f4125p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private p197t6.c f4126q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private f f4127r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private com.android.launcher3.f f4128s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private U5.a f4129t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private B7.a f4130u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private C2005g f4131v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private S1.a f4132w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private i.C0897c f4133x0;

    public static final class a implements InterfaceC1148h {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.InterfaceC1148h
        public void onDestroy(InterfaceC1163x owner) {
            S1.a aVar;
            n.h(owner, "owner");
            super.onDestroy(owner);
            if (((Activity) owner).isChangingConfigurations() || (aVar = c.this.f4132w0) == null) {
                return;
            }
            aVar.onDestroy();
        }
    }

    public static final class b implements com.android.wallpaper.picker.f.a {
        b() {
        }

        @Override // com.android.wallpaper.picker.f.a
        public Intent a(Context context) {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setType("image/*");
            return intent;
        }

        @Override // com.android.wallpaper.picker.f.a
        public Intent b(Context context) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType("image/*");
            return intent;
        }
    }

    private final C2005g H0(Context context) {
        C2005g c2005g = this.f4131v0;
        if (c2005g != null) {
            return c2005g;
        }
        Context applicationContext = context.getApplicationContext();
        n.g(applicationContext, "getApplicationContext(...)");
        C2005g c2005g2 = new C2005g(applicationContext, G(), C0803b0.b());
        this.f4131v0 = c2005g2;
        return c2005g2;
    }

    @Override // p074h3.V, p074h3.H
    public p034d3.a C() {
        p197t6.c cVar = this.f4126q0;
        if (cVar != null) {
            return cVar;
        }
        p197t6.c cVar2 = new p197t6.c();
        this.f4126q0 = cVar2;
        return cVar2;
    }

    @Override // p074h3.H
    public com.android.wallpaper.picker.f.a E() {
        return new b();
    }

    public final T1.b.C0264b I0(j activity) {
        n.h(activity, "activity");
        Context applicationContext = activity.getApplicationContext();
        S1.a aVarD0 = d0(activity);
        Resources resources = activity.getResources();
        n.e(applicationContext);
        M1.b bVarW = W(applicationContext);
        n.e(resources);
        return V(bVarW, aVarD0, resources);
    }

    public final com.android.launcher3.f J0(Context context) {
        n.h(context, "context");
        com.android.launcher3.f fVar = this.f4128s0;
        if (fVar != null) {
            return fVar;
        }
        Context applicationContext = context.getApplicationContext();
        n.g(applicationContext, "getApplicationContext(...)");
        int iB = S1.c.f7215i.b(context);
        Context applicationContext2 = context.getApplicationContext();
        n.g(applicationContext2, "getApplicationContext(...)");
        com.android.launcher3.f fVar2 = new com.android.launcher3.f(applicationContext, iB, N0(applicationContext2), G());
        this.f4128s0 = fVar2;
        return fVar2;
    }

    public final i.C0897c K0(j activity) {
        n.h(activity, "activity");
        i.C0897c c0897c = this.f4133x0;
        if (c0897c != null) {
            n.e(c0897c);
            return c0897c;
        }
        Context applicationContext = activity.getApplicationContext();
        S1.a aVarD0 = d0(activity);
        Resources resources = activity.getResources();
        i.C0897c c0897c2 = this.f4133x0;
        if (c0897c2 != null) {
            return c0897c2;
        }
        n.e(applicationContext);
        U5.a aVarN0 = N0(applicationContext);
        B7.a aVarL0 = L0(applicationContext);
        InterfaceC1363c interfaceC1363cK = k(applicationContext);
        M1.b bVarW = W(applicationContext);
        I iU = U();
        n.e(resources);
        i.C0897c c0897c3 = new i.C0897c(aVarN0, aVarL0, interfaceC1363cK, bVarW, iU, aVarD0, resources);
        this.f4133x0 = c0897c3;
        return c0897c3;
    }

    public final B7.a L0(Context context) {
        n.h(context, "context");
        B7.a aVar = this.f4130u0;
        if (aVar != null) {
            return aVar;
        }
        Context applicationContext = context.getApplicationContext();
        n.g(applicationContext, "getApplicationContext(...)");
        B7.b bVar = new B7.b(applicationContext, t0(context));
        this.f4130u0 = bVar;
        return bVar;
    }

    public final f M0(Context context) {
        n.h(context, "context");
        f fVar = this.f4127r0;
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(context);
        this.f4127r0 = fVar2;
        return fVar2;
    }

    public final U5.a N0(Context context) {
        n.h(context, "context");
        U5.a aVar = this.f4129t0;
        if (aVar != null) {
            return aVar;
        }
        Context applicationContext = context.getApplicationContext();
        n.g(applicationContext, "getApplicationContext(...)");
        e eVar = new e(applicationContext, G(), C0803b0.b());
        this.f4129t0 = eVar;
        return eVar;
    }

    @Override // p074h3.H
    public InterfaceC1357b a(Context context) {
        n.h(context, "context");
        InterfaceC1357b interfaceC1357b = this.f4125p0;
        if (interfaceC1357b != null) {
            return interfaceC1357b;
        }
        Context applicationContext = context.getApplicationContext();
        n.g(applicationContext, "getApplicationContext(...)");
        K6.a aVar = new K6.a(applicationContext);
        this.f4125p0 = aVar;
        return aVar;
    }

    @Override // p074h3.H
    public AbstractComponentCallbacksC1132q b(Context context, x wallpaperInfo, int i10, boolean z9, boolean z10, boolean z11, boolean z12) {
        n.h(context, "context");
        n.h(wallpaperInfo, "wallpaperInfo");
        Bundle bundle = new Bundle();
        bundle.putParcelable("wallpaper", wallpaperInfo);
        bundle.putInt("preview_mode", i10);
        bundle.putBoolean("view_as_home", z9);
        bundle.putBoolean("view_full_screen", z11);
        bundle.putBoolean("testing_mode_enabled", z12);
        AbstractComponentCallbacksC1132q j9 = wallpaperInfo instanceof k ? new J() : new C1422v();
        j9.setArguments(bundle);
        return j9;
    }

    @Override // K1.p
    public S1.a d0(j activity) {
        n.h(activity, "activity");
        S1.a aVar = this.f4132w0;
        if (aVar != null) {
            return aVar;
        }
        Context applicationContext = activity.getApplicationContext();
        n.g(applicationContext, "getApplicationContext(...)");
        Point pointE = s.a().e(activity.getWindowManager().getDefaultDisplay());
        n.g(pointE, "getScreenSize(...)");
        WallpaperManager wallpaperManager = WallpaperManager.getInstance(activity.getApplicationContext());
        n.g(wallpaperManager, "getInstance(...)");
        Context applicationContext2 = activity.getApplicationContext();
        n.g(applicationContext2, "getApplicationContext(...)");
        Q2.k kVarA0 = a0(applicationContext2);
        Context applicationContext3 = activity.getApplicationContext();
        n.g(applicationContext3, "getApplicationContext(...)");
        H h10 = new H(applicationContext, pointE, wallpaperManager, kVarA0, H0(applicationContext3));
        this.f4132w0 = h10;
        activity.getLifecycle().a(new a());
        return h10;
    }
}
