package p083i2;

import F8.C0826n;
import F8.InterfaceC0822l;
import H3.k;
import H3.q;
import android.app.Activity;
import android.app.WallpaperColors;
import android.app.WallpaperManager;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.InterfaceC1163x;
import com.nothing.wallpaper.R;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import p064g3.v;
import p064g3.x;
import p064g3.z;
import p074h3.InterfaceC1363c;
import p074h3.InterfaceC1364d;
import p079h8.A;
import p079h8.r;
import p129m8.e;
import p139n8.b;
import p219v8.p;
import p224w3.d;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends d {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final InterfaceC1364d.a f21935D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final InterfaceC1363c f21936E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final v f21937F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final p194t3.a f21938G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final J1.a f21939H;

    static final class a extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f21940q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f21941r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f21942s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ boolean f21943t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ Context f21945v;

        /* JADX INFO: renamed from: i2.f$a$a, reason: collision with other inner class name */
        static final class C0549a implements InterfaceC1363c.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ f f21946a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Context f21947b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC0822l f21948c;

            C0549a(f fVar, Context context, InterfaceC0822l interfaceC0822l) {
                this.f21946a = fVar;
                this.f21947b = context;
                this.f21948c = interfaceC0822l;
            }

            @Override // p074h3.InterfaceC1363c.a
            public final void a(x xVar, x xVar2, int i10) {
                if (!this.f21946a.v() ? xVar == null : xVar2 != null) {
                    xVar = xVar2;
                }
                f fVar = this.f21946a;
                fVar.w(this.f21947b, fVar.f21935D);
                this.f21948c.k(xVar, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, e eVar) {
            super(2, eVar);
            this.f21945v = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            a aVar = f.this.new a(this.f21945v, eVar);
            aVar.f21943t = ((Boolean) obj).booleanValue();
            return aVar;
        }

        @Override // p219v8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return s(((Boolean) obj).booleanValue(), (e) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = b.e();
            int i10 = this.f21942s;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                return obj;
            }
            r.b(obj);
            boolean z9 = this.f21943t;
            f fVar = f.this;
            Context context = this.f21945v;
            this.f21940q = fVar;
            this.f21941r = context;
            this.f21943t = z9;
            this.f21942s = 1;
            C0826n c0826n = new C0826n(b.c(this), 1);
            c0826n.G();
            fVar.f21936E.a(context, z9, new C0549a(fVar, context, c0826n));
            Object objA = c0826n.A();
            if (objA == b.e()) {
                h.c(this);
            }
            return objA == objE ? objE : objA;
        }

        public final Object s(boolean z9, e eVar) {
            return ((a) create(Boolean.valueOf(z9), eVar)).invokeSuspend(A.f21846a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Activity activity, InterfaceC1163x lifecycleOwner, InterfaceC1364d.a screen, InterfaceC1363c wallpaperInfoFactory, v colorViewModel, k displayUtils, z wallpaperPreviewNavigator, p194t3.a wallpaperInteractor, J1.a themedIconInteractor, WallpaperManager wallpaperManager, boolean z9) {
        super(activity, lifecycleOwner, screen, wallpaperInfoFactory, colorViewModel, displayUtils, wallpaperPreviewNavigator, wallpaperInteractor, wallpaperManager, z9);
        n.h(activity, "activity");
        n.h(lifecycleOwner, "lifecycleOwner");
        n.h(screen, "screen");
        n.h(wallpaperInfoFactory, "wallpaperInfoFactory");
        n.h(colorViewModel, "colorViewModel");
        n.h(displayUtils, "displayUtils");
        n.h(wallpaperPreviewNavigator, "wallpaperPreviewNavigator");
        n.h(wallpaperInteractor, "wallpaperInteractor");
        n.h(themedIconInteractor, "themedIconInteractor");
        n.h(wallpaperManager, "wallpaperManager");
        this.f21935D = screen;
        this.f21936E = wallpaperInfoFactory;
        this.f21937F = colorViewModel;
        this.f21938G = wallpaperInteractor;
        this.f21939H = themedIconInteractor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle D(f fVar) {
        return fVar.t(fVar.v());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A E(f fVar, WallpaperColors wallpaperColors) {
        if (fVar.v()) {
            fVar.f21937F.j(wallpaperColors);
        } else {
            fVar.f21937F.i(wallpaperColors);
        }
        return A.f21846a;
    }

    @Override // p224w3.d
    protected p234x3.d p(Context context) {
        Context context2;
        q qVar;
        n.h(context, "context");
        if (v()) {
            context2 = context;
            qVar = new q(context2, null, context.getString(R.string.lock_screen_preview_provider_authority), 2, null);
        } else {
            context2 = context;
            String string = context2.getString(R.string.grid_control_metadata_name);
            n.g(string, "getString(...)");
            qVar = new q(context2, string);
        }
        return new p093j2.a(qVar, new p219v8.a() { // from class: i2.d
            @Override // p219v8.a
            public final Object invoke() {
                return f.D(this.f21933q);
            }
        }, new a(context2, null), new p219v8.l() { // from class: i2.e
            @Override // p219v8.l
            public final Object f(Object obj) {
                return f.E(this.f21934q, (WallpaperColors) obj);
            }
        }, this.f21938G, this.f21939H, this.f21935D);
    }
}
