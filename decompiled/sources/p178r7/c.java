package p178r7;

import F8.AbstractC0816i;
import F8.L;
import G7.s;
import H3.k;
import android.app.Activity;
import android.app.WallpaperManager;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.AbstractC1164y;
import androidx.lifecycle.InterfaceC1163x;
import com.android.wallpaper.picker.FixedWidthDisplayRatioFrameLayout;
import com.nothing.wallpaper.R;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import p010b.j;
import p064g3.v;
import p064g3.x;
import p064g3.z;
import p074h3.I;
import p074h3.InterfaceC1363c;
import p074h3.InterfaceC1364d;
import p079h8.A;
import p079h8.r;
import p083i2.f;
import p129m8.e;
import p219v8.p;
import p228w7.b;
import p234x3.d;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends f {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final Activity f27567I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final InterfaceC1163x f27568J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final z f27569K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final b f27570L;

    static final class a extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f27571q;

        a(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return c.this.new a(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, e eVar) {
            return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f27571q;
            if (i10 == 0) {
                r.b(obj);
                c cVar = c.this;
                this.f27571q = 1;
                obj = cVar.u(this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            x xVar = (x) obj;
            if (xVar != null) {
                c cVar2 = c.this;
                cVar2.f27569K.H(xVar, !cVar2.v());
            }
            return A.f21846a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Activity activity, InterfaceC1163x lifecycleOwner, InterfaceC1364d.a screen, InterfaceC1363c wallpaperInfoFactory, v colorViewModel, k displayUtils, z wallpaperPreviewNavigator, p194t3.a wallpaperInteractor, J1.a themedIconInteractor, b launcherGridInteractor, WallpaperManager wallpaperManager, boolean z9) {
        super(activity, lifecycleOwner, screen, wallpaperInfoFactory, colorViewModel, displayUtils, wallpaperPreviewNavigator, wallpaperInteractor, themedIconInteractor, wallpaperManager, z9);
        n.h(activity, "activity");
        n.h(lifecycleOwner, "lifecycleOwner");
        n.h(screen, "screen");
        n.h(wallpaperInfoFactory, "wallpaperInfoFactory");
        n.h(colorViewModel, "colorViewModel");
        n.h(displayUtils, "displayUtils");
        n.h(wallpaperPreviewNavigator, "wallpaperPreviewNavigator");
        n.h(wallpaperInteractor, "wallpaperInteractor");
        n.h(themedIconInteractor, "themedIconInteractor");
        n.h(launcherGridInteractor, "launcherGridInteractor");
        n.h(wallpaperManager, "wallpaperManager");
        this.f27567I = activity;
        this.f27568J = lifecycleOwner;
        this.f27569K = wallpaperPreviewNavigator;
        this.f27570L = launcherGridInteractor;
    }

    private final void K(ViewGroup viewGroup) {
        Activity activity = this.f27567I;
        n.f(activity, "null cannot be cast to non-null type androidx.activity.ComponentActivity");
        s.d((j) activity, this.f27568J, viewGroup);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(final p219v8.a aVar, final c cVar, View view) {
        p087i6.b.a(new p219v8.a() { // from class: r7.b
            @Override // p219v8.a
            public final Object invoke() {
                return c.N(aVar, cVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A N(p219v8.a aVar, c cVar) {
        if (!((Boolean) aVar.invoke()).booleanValue()) {
            AbstractC0816i.d(AbstractC1164y.a(cVar.f27568J), null, null, cVar.new a(null), 3, null);
        }
        return A.f21846a;
    }

    public final void L(View container, final p219v8.a highPriorityClickEvent) {
        n.h(container, "container");
        n.h(highPriorityClickEvent, "highPriorityClickEvent");
        ((FixedWidthDisplayRatioFrameLayout) container.requireViewById(R.id.preview_host)).setOnClickListener(new View.OnClickListener() { // from class: r7.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c.M(highPriorityClickEvent, this, view);
            }
        });
    }

    @Override // p064g3.f
    public View c(View view, Context context) {
        n.h(view, "view");
        n.h(context, "context");
        View viewRequireViewById = view.requireViewById(R.id.preview_host);
        n.g(viewRequireViewById, "requireViewById(...)");
        FixedWidthDisplayRatioFrameLayout fixedWidthDisplayRatioFrameLayout = (FixedWidthDisplayRatioFrameLayout) viewRequireViewById;
        if (v() && I.a().C().s()) {
            fixedWidthDisplayRatioFrameLayout.setContentDescription(context.getString(R.string.lock_wallpaper_preview_card_content_description));
            View viewRequireViewById2 = view.requireViewById(R.id.preview);
            n.g(viewRequireViewById2, "requireViewById(...)");
            viewRequireViewById2.setVisibility(8);
            return fixedWidthDisplayRatioFrameLayout;
        }
        View viewRequireViewById3 = view.requireViewById(R.id.preview);
        n.g(viewRequireViewById3, "requireViewById(...)");
        n((CardView) viewRequireViewById3, context);
        if (v() && I.a().C().m()) {
            View viewRequireViewById4 = view.requireViewById(R.id.lock_screen_preview_container);
            n.g(viewRequireViewById4, "requireViewById(...)");
            K((ViewGroup) viewRequireViewById4);
        }
        return fixedWidthDisplayRatioFrameLayout;
    }

    @Override // p083i2.f, p224w3.d
    protected d p(Context context) {
        n.h(context, "context");
        d dVarP = super.p(context);
        if (dVarP.i() == InterfaceC1364d.a.HOME_SCREEN) {
            p093j2.a aVar = dVarP instanceof p093j2.a ? (p093j2.a) dVarP : null;
            if (aVar != null) {
                aVar.s(this.f27570L);
            }
        }
        return dVarP;
    }
}
