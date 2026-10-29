package p224w3;

import F8.AbstractC0812g;
import F8.AbstractC0816i;
import F8.C0803b0;
import F8.C0826n;
import F8.H0;
import F8.InterfaceC0822l;
import F8.L;
import H3.k;
import android.app.Activity;
import android.app.WallpaperColors;
import android.app.WallpaperManager;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.AbstractC1164y;
import androidx.lifecycle.InterfaceC1163x;
import com.android.wallpaper.picker.FixedWidthDisplayRatioFrameLayout;
import com.android.wallpaper.picker.customization.ui.section.ScreenPreviewClickView;
import com.android.wallpaper.picker.customization.ui.section.ScreenPreviewView;
import com.nothing.wallpaper.R;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.n;
import p064g3.f;
import p064g3.v;
import p064g3.x;
import p064g3.z;
import p074h3.I;
import p074h3.InterfaceC1363c;
import p074h3.InterfaceC1364d;
import p079h8.A;
import p079h8.r;
import p129m8.e;
import p214v3.l;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements f {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final boolean f28637A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private l.a f28638B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final boolean f28639C;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Activity f28640q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final InterfaceC1163x f28641r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final InterfaceC1364d.a f28642s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final InterfaceC1363c f28643t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final v f28644u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final k f28645v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final z f28646w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final p194t3.a f28647x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final WallpaperManager f28648y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final boolean f28649z;

    static final class a extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f28650q;

        a(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return d.this.new a(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, e eVar) {
            return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f28650q;
            if (i10 == 0) {
                r.b(obj);
                d dVar = d.this;
                this.f28650q = 1;
                obj = dVar.u(this);
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
                d dVar2 = d.this;
                dVar2.f28646w.H(xVar, !dVar2.v());
            }
            return A.f21846a;
        }
    }

    static final class b implements InterfaceC1363c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0822l f28652a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f28653b;

        b(InterfaceC0822l interfaceC0822l, d dVar) {
            this.f28652a = interfaceC0822l;
            this.f28653b = dVar;
        }

        @Override // p074h3.InterfaceC1363c.a
        public final void a(x xVar, x xVar2, int i10) {
            InterfaceC0822l interfaceC0822l = this.f28652a;
            if (this.f28653b.v() && xVar2 != null) {
                xVar = xVar2;
            }
            interfaceC0822l.k(xVar, null);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f28654q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ InterfaceC1364d.a f28656s;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f28657q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ InterfaceC1364d.a f28658r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ d f28659s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ WallpaperColors f28660t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC1364d.a aVar, d dVar, WallpaperColors wallpaperColors, e eVar) {
                super(2, eVar);
                this.f28658r = aVar;
                this.f28659s = dVar;
                this.f28660t = wallpaperColors;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final e create(Object obj, e eVar) {
                return new a(this.f28658r, this.f28659s, this.f28660t, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f28657q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                if (this.f28658r == InterfaceC1364d.a.LOCK_SCREEN) {
                    this.f28659s.f28644u.j(this.f28660t);
                } else {
                    this.f28659s.f28644u.i(this.f28660t);
                }
                return A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC1364d.a aVar, e eVar) {
            super(2, eVar);
            this.f28656s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return d.this.new c(this.f28656s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, e eVar) {
            return ((c) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f28654q;
            if (i10 == 0) {
                r.b(obj);
                WallpaperColors wallpaperColors = d.this.f28648y.getWallpaperColors(this.f28656s == InterfaceC1364d.a.LOCK_SCREEN ? 2 : 1);
                H0 h0C = C0803b0.c();
                a aVar = new a(this.f28656s, d.this, wallpaperColors, null);
                this.f28654q = 1;
                if (AbstractC0812g.g(h0C, aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return A.f21846a;
        }
    }

    public d(Activity activity, InterfaceC1163x lifecycleOwner, InterfaceC1364d.a screen, InterfaceC1363c wallpaperInfoFactory, v colorViewModel, k displayUtils, z wallpaperPreviewNavigator, p194t3.a wallpaperInteractor, WallpaperManager wallpaperManager, boolean z9) {
        n.h(activity, "activity");
        n.h(lifecycleOwner, "lifecycleOwner");
        n.h(screen, "screen");
        n.h(wallpaperInfoFactory, "wallpaperInfoFactory");
        n.h(colorViewModel, "colorViewModel");
        n.h(displayUtils, "displayUtils");
        n.h(wallpaperPreviewNavigator, "wallpaperPreviewNavigator");
        n.h(wallpaperInteractor, "wallpaperInteractor");
        n.h(wallpaperManager, "wallpaperManager");
        this.f28640q = activity;
        this.f28641r = lifecycleOwner;
        this.f28642s = screen;
        this.f28643t = wallpaperInfoFactory;
        this.f28644u = colorViewModel;
        this.f28645v = displayUtils;
        this.f28646w = wallpaperPreviewNavigator;
        this.f28647x = wallpaperInteractor;
        this.f28648y = wallpaperManager;
        this.f28649z = z9;
        this.f28637A = screen == InterfaceC1364d.a.LOCK_SCREEN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A o(d dVar) {
        dVar.f28640q.recreate();
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(d dVar, View view) {
        AbstractC0816i.d(AbstractC1164y.a(dVar.f28641r), null, null, dVar.new a(null), 3, null);
    }

    @Override // p064g3.f
    public boolean e(Context context) {
        n.h(context, "context");
        return true;
    }

    protected void n(CardView previewView, Context context) {
        n.h(previewView, "previewView");
        n.h(context, "context");
        l.a aVar = this.f28638B;
        if (aVar != null) {
            aVar.a();
        }
        l lVar = l.f28194a;
        this.f28638B = l.n(this.f28640q, previewView, p(context), this.f28641r, false, true, this.f28637A && I.a().C().m(), this.f28645v.o(this.f28640q), false, new p219v8.a() { // from class: w3.b
            @Override // p219v8.a
            public final Object invoke() {
                return d.o(this.f28635q);
            }
        }, null, true, 1296, null);
    }

    protected abstract p234x3.d p(Context context);

    @Override // p064g3.f
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public ScreenPreviewView f(Context context) {
        n.h(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.screen_preview_section, (ViewGroup) null);
        n.f(viewInflate, "null cannot be cast to non-null type com.android.wallpaper.picker.customization.ui.section.ScreenPreviewView");
        ScreenPreviewView screenPreviewView = (ScreenPreviewView) viewInflate;
        if (this.f28649z) {
            View viewRequireViewById = screenPreviewView.requireViewById(R.id.preview_host);
            n.g(viewRequireViewById, "requireViewById(...)");
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(context.getResources().getDimensionPixelSize(R.dimen.screen_preview_width_for_2_pane_small_width), -2);
            layoutParams.gravity = 17;
            ((FixedWidthDisplayRatioFrameLayout) viewRequireViewById).setLayoutParams(layoutParams);
        }
        ((ScreenPreviewClickView) screenPreviewView.requireViewById(R.id.screen_preview_click_view)).setOnClickListener(new View.OnClickListener() { // from class: w3.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d.r(this.f28636q, view);
            }
        });
        View viewRequireViewById2 = screenPreviewView.requireViewById(R.id.preview);
        n.g(viewRequireViewById2, "requireViewById(...)");
        n((CardView) viewRequireViewById2, context);
        return screenPreviewView;
    }

    public boolean s() {
        return this.f28639C;
    }

    protected final Bundle t(boolean z9) {
        if (!z9) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("hide_clock", s());
        return bundle;
    }

    protected final Object u(e eVar) {
        C0826n c0826n = new C0826n(p139n8.b.c(eVar), 1);
        c0826n.G();
        this.f28643t.a(this.f28640q, true, new b(c0826n, this));
        Object objA = c0826n.A();
        if (objA == p139n8.b.e()) {
            h.c(eVar);
        }
        return objA;
    }

    protected final boolean v() {
        return this.f28637A;
    }

    protected final void w(Context context, InterfaceC1364d.a screen) {
        n.h(context, "context");
        n.h(screen, "screen");
        AbstractC0816i.d(AbstractC1164y.a(this.f28641r), C0803b0.b(), null, new c(screen, null), 2, null);
    }
}
