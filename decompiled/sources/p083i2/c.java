package p083i2;

import F8.AbstractC0816i;
import F8.InterfaceC0846x0;
import F8.L;
import H3.k;
import R1.d;
import T1.b;
import android.app.WallpaperManager;
import android.content.Context;
import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.lifecycle.AbstractC1164y;
import androidx.lifecycle.InterfaceC1163x;
import androidx.lifecycle.a0;
import androidx.lifecycle.d0;
import com.android.customization.picker.clock.ui.view.ClockCarouselView;
import com.android.wallpaper.picker.customization.ui.section.ScreenPreviewClickView;
import com.android.wallpaper.picker.customization.ui.section.ScreenPreviewView;
import com.nothing.wallpaper.R;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.n;
import p010b.j;
import p064g3.f;
import p064g3.v;
import p064g3.z;
import p074h3.InterfaceC1363c;
import p074h3.InterfaceC1364d;
import p079h8.A;
import p079h8.r;
import p129m8.e;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
public final class c extends f {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final InterfaceC1163x f21913I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final InterfaceC1364d.a f21914J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final S1.a f21915K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final f.a f21916L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final boolean f21917M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final b f21918N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private View f21919O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final boolean f21920P;

    public static final class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ E f21921q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ c f21922r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Context f21923s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ClockCarouselView f21924t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ ScreenPreviewClickView f21925u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ E f21926v;

        /* JADX INFO: renamed from: i2.c$a$a, reason: collision with other inner class name */
        static final class C0548a extends l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f21927q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ Context f21928r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ ClockCarouselView f21929s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ ScreenPreviewClickView f21930t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ c f21931u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ E f21932v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0548a(Context context, ClockCarouselView clockCarouselView, ScreenPreviewClickView screenPreviewClickView, c cVar, E e10, e eVar) {
                super(2, eVar);
                this.f21928r = context;
                this.f21929s = clockCarouselView;
                this.f21930t = screenPreviewClickView;
                this.f21931u = cVar;
                this.f21932v = e10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final e create(Object obj, e eVar) {
                return new C0548a(this.f21928r, this.f21929s, this.f21930t, this.f21931u, this.f21932v, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, e eVar) {
                return ((C0548a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f21927q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                Q1.e.d(this.f21928r, this.f21929s, this.f21930t, this.f21931u.f21918N, this.f21931u.f21915K, this.f21931u.f21913I, this.f21931u.f21917M);
                if (this.f21932v.f22779q != null) {
                    this.f21929s.getCarousel().removeOnAttachStateChangeListener((View.OnAttachStateChangeListener) this.f21932v.f22779q);
                }
                return A.f21846a;
            }
        }

        a(E e10, c cVar, Context context, ClockCarouselView clockCarouselView, ScreenPreviewClickView screenPreviewClickView, E e11) {
            this.f21921q = e10;
            this.f21922r = cVar;
            this.f21923s = context;
            this.f21924t = clockCarouselView;
            this.f21925u = screenPreviewClickView;
            this.f21926v = e11;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            n.h(view, "view");
            this.f21921q.f22779q = AbstractC0816i.d(AbstractC1164y.a(this.f21922r.f21913I), null, null, new C0548a(this.f21923s, this.f21924t, this.f21925u, this.f21922r, this.f21926v, null), 3, null);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            n.h(view, "view");
            InterfaceC0846x0 interfaceC0846x0 = (InterfaceC0846x0) this.f21921q.f22779q;
            if (interfaceC0846x0 != null) {
                InterfaceC0846x0.a.a(interfaceC0846x0, null, 1, null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(j activity, InterfaceC1163x lifecycleOwner, InterfaceC1364d.a screen, InterfaceC1363c wallpaperInfoFactory, v colorViewModel, k displayUtils, b.C0264b clockCarouselViewModelFactory, S1.a clockViewFactory, z wallpaperPreviewNavigator, f.a navigationController, p194t3.a wallpaperInteractor, J1.a themedIconInteractor, WallpaperManager wallpaperManager, boolean z9) {
        super(activity, lifecycleOwner, screen, wallpaperInfoFactory, colorViewModel, displayUtils, wallpaperPreviewNavigator, wallpaperInteractor, themedIconInteractor, wallpaperManager, z9);
        n.h(activity, "activity");
        n.h(lifecycleOwner, "lifecycleOwner");
        n.h(screen, "screen");
        n.h(wallpaperInfoFactory, "wallpaperInfoFactory");
        n.h(colorViewModel, "colorViewModel");
        n.h(displayUtils, "displayUtils");
        n.h(clockCarouselViewModelFactory, "clockCarouselViewModelFactory");
        n.h(clockViewFactory, "clockViewFactory");
        n.h(wallpaperPreviewNavigator, "wallpaperPreviewNavigator");
        n.h(navigationController, "navigationController");
        n.h(wallpaperInteractor, "wallpaperInteractor");
        n.h(themedIconInteractor, "themedIconInteractor");
        n.h(wallpaperManager, "wallpaperManager");
        this.f21913I = lifecycleOwner;
        this.f21914J = screen;
        this.f21915K = clockViewFactory;
        this.f21916L = navigationController;
        this.f21917M = z9;
        a0 a0VarA = new d0(activity, clockCarouselViewModelFactory).a(F.b(b.class));
        n.f(a0VarA, "null cannot be cast to non-null type com.android.customization.picker.clock.ui.viewmodel.ClockCarouselViewModel");
        this.f21918N = (b) a0VarA;
        this.f21920P = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(c cVar, View view) {
        cVar.f21916L.g(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(c cVar, Context context, ScreenPreviewView screenPreviewView) {
        Rect rect = new Rect();
        View view = cVar.f21919O;
        if (view != null) {
            view.getHitRect(rect);
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.screen_preview_section_vertical_space);
        rect.top -= dimensionPixelSize;
        rect.bottom += dimensionPixelSize;
        screenPreviewView.setTouchDelegate(new TouchDelegate(rect, cVar.f21919O));
    }

    @Override // p224w3.d, p064g3.f
    /* JADX INFO: renamed from: q */
    public ScreenPreviewView f(final Context context) {
        n.h(context, "context");
        final ScreenPreviewView screenPreviewViewF = super.f(context);
        if (this.f21914J == InterfaceC1364d.a.LOCK_SCREEN) {
            View viewRequireViewById = screenPreviewViewF.requireViewById(R.id.screen_preview_click_view);
            n.g(viewRequireViewById, "requireViewById(...)");
            ScreenPreviewClickView screenPreviewClickView = (ScreenPreviewClickView) viewRequireViewById;
            View viewRequireViewById2 = screenPreviewViewF.requireViewById(R.id.clock_color_and_size_button);
            n.g(viewRequireViewById2, "requireViewById(...)");
            ViewStub viewStub = (ViewStub) viewRequireViewById2;
            viewStub.setLayoutResource(R.layout.clock_color_and_size_button);
            View viewInflate = viewStub.inflate();
            n.f(viewInflate, "null cannot be cast to non-null type android.view.View");
            this.f21919O = viewInflate;
            if (viewInflate != null) {
                viewInflate.setOnClickListener(new View.OnClickListener() { // from class: i2.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        c.L(this.f21909q, view);
                    }
                });
            }
            screenPreviewViewF.post(new Runnable() { // from class: i2.b
                @Override // java.lang.Runnable
                public final void run() {
                    c.M(this.f21910q, context, screenPreviewViewF);
                }
            });
            View viewRequireViewById3 = screenPreviewViewF.requireViewById(R.id.clock_carousel_view_stub);
            n.g(viewRequireViewById3, "requireViewById(...)");
            ViewStub viewStub2 = (ViewStub) viewRequireViewById3;
            viewStub2.setLayoutResource(R.layout.clock_carousel_view);
            View viewInflate2 = viewStub2.inflate();
            n.f(viewInflate2, "null cannot be cast to non-null type com.android.customization.picker.clock.ui.view.ClockCarouselView");
            ClockCarouselView clockCarouselView = (ClockCarouselView) viewInflate2;
            if (this.f21917M) {
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.clock_carousel_guideline_margin_for_2_pane_small_width);
                View viewRequireViewById4 = clockCarouselView.requireViewById(R.id.guideline_start);
                n.g(viewRequireViewById4, "requireViewById(...)");
                Guideline guideline = (Guideline) viewRequireViewById4;
                ViewGroup.LayoutParams layoutParams = guideline.getLayoutParams();
                n.f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                layoutParams2.guideBegin = dimensionPixelSize;
                guideline.setLayoutParams(layoutParams2);
                View viewRequireViewById5 = clockCarouselView.requireViewById(R.id.guideline_end);
                n.g(viewRequireViewById5, "requireViewById(...)");
                Guideline guideline2 = (Guideline) viewRequireViewById5;
                ViewGroup.LayoutParams layoutParams3 = guideline2.getLayoutParams();
                n.f(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                layoutParams4.guideEnd = dimensionPixelSize;
                guideline2.setLayoutParams(layoutParams4);
            }
            View viewRequireViewById6 = screenPreviewViewF.requireViewById(R.id.single_clock_view_stub);
            n.g(viewRequireViewById6, "requireViewById(...)");
            ViewStub viewStub3 = (ViewStub) viewRequireViewById6;
            viewStub3.setLayoutResource(R.layout.single_clock_view);
            View viewInflate3 = viewStub3.inflate();
            n.f(viewInflate3, "null cannot be cast to non-null type android.view.ViewGroup");
            E e10 = new E();
            e10.f22779q = new a(new E(), this, context, clockCarouselView, screenPreviewClickView, e10);
            clockCarouselView.getCarousel().addOnAttachStateChangeListener((View.OnAttachStateChangeListener) e10.f22779q);
        }
        return screenPreviewViewF;
    }

    @Override // p224w3.d
    public boolean s() {
        return this.f21920P;
    }
}
