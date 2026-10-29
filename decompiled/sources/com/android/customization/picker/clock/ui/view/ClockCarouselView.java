package com.android.customization.picker.clock.ui.view;

import O2.d;
import O2.h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.constraintlayout.helper.widget.Carousel;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.view.K;
import androidx.core.view.y;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.android.wallpaper.picker.FixedWidthDisplayRatioFrameLayout;
import com.nothing.wallpaper.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.m;
import p079h8.o;
import p089i8.AbstractC1444s;
import p219v8.l;

/* JADX INFO: loaded from: classes.dex */
public final class ClockCarouselView extends FrameLayout {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final b f15325D = new b(null);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final List f15326E = AbstractC1444s.n(Integer.valueOf(R.id.item_view_0), Integer.valueOf(R.id.item_view_1), Integer.valueOf(R.id.item_view_2), Integer.valueOf(R.id.item_view_3), Integer.valueOf(R.id.item_view_4));

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private ClockHostView f15327A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private View f15328B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private View f15329C;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Carousel f15330q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final MotionLayout f15331r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final float f15332s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private a f15333t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private S1.a f15334u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private h f15335v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private h f15336w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private View f15337x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private View f15338y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private ClockHostView f15339z;

    private static final class a implements Carousel.Adapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f15340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final N1.a f15341b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f15342c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final S1.a f15343d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final l f15344e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Map f15345f;

        /* JADX INFO: renamed from: com.android.customization.picker.clock.ui.view.ClockCarouselView$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0440a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f15346a;

            static {
                int[] iArr = new int[N1.a.values().length];
                try {
                    iArr[N1.a.DYNAMIC.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[N1.a.SMALL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f15346a = iArr;
            }
        }

        public static final class b implements Runnable {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ View f15347q;

            public b(View view) {
                this.f15347q = view;
            }

            @Override // java.lang.Runnable
            public final void run() {
                View view = this.f15347q;
                view.setPivotX(view.getWidth() / 2.0f);
                view.setPivotY(view.getHeight() / 2.0f);
            }
        }

        public static final class c implements Runnable {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ View f15348q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ boolean f15349r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ View f15350s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ ClockHostView f15351t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ a f15352u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ String f15353v;

            public c(View view, boolean z9, View view2, ClockHostView clockHostView, a aVar, String str) {
                this.f15348q = view;
                this.f15349r = z9;
                this.f15350s = view2;
                this.f15351t = clockHostView;
                this.f15352u = aVar;
                this.f15353v = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                View view = this.f15348q;
                if (this.f15349r) {
                    view.setPivotX(ClockCarouselView.f15325D.b(view));
                    view.setPivotY(0.0f);
                    this.f15350s.setTranslationX(0.0f);
                    this.f15350s.setTranslationY(0.0f);
                    return;
                }
                view.setPivotX(view.getWidth() / 2.0f);
                view.setPivotY(view.getHeight() / 2.0f);
                b bVar = ClockCarouselView.f15325D;
                float fJ = bVar.j(this.f15351t.getWidth(), this.f15350s.getWidth(), this.f15350s.getLeft());
                float fJ2 = bVar.j(this.f15351t.getHeight(), this.f15350s.getHeight(), this.f15350s.getTop());
                this.f15350s.setTranslationX(fJ);
                this.f15350s.setTranslationY(fJ2);
                this.f15352u.f15345f.put(this.f15353v, new o(Float.valueOf(fJ), Float.valueOf(fJ2)));
            }
        }

        public a(float f10, N1.a clockSize, List clocks, S1.a clockViewFactory, l onClockSelected) {
            n.h(clockSize, "clockSize");
            n.h(clocks, "clocks");
            n.h(clockViewFactory, "clockViewFactory");
            n.h(onClockSelected, "onClockSelected");
            this.f15340a = f10;
            this.f15341b = clockSize;
            this.f15342c = clocks;
            this.f15343d = clockViewFactory;
            this.f15344e = onClockSelected;
            this.f15345f = new LinkedHashMap();
        }

        private final void d(boolean z9, View view, String str, ClockHostView clockHostView) {
            y.a(clockHostView, new b(clockHostView));
            h hVarD = this.f15343d.d(str);
            if (hVarD != null) {
                if (z9) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                    hVarD.e().d().a(1.0f);
                } else {
                    view.setScaleX(this.f15340a);
                    view.setScaleY(this.f15340a);
                    hVarD.e().d().a(0.0f);
                }
            }
        }

        private final void e(String str, boolean z9, ClockHostView clockHostView, View view) {
            o oVar = (o) this.f15345f.get(str);
            if (oVar != null && !z9) {
                view.setTranslationX(((Number) oVar.c()).floatValue());
                view.setTranslationY(((Number) oVar.d()).floatValue());
            }
            y.a(clockHostView, new c(clockHostView, z9, view, clockHostView, this, str));
        }

        public final List b() {
            return this.f15342c;
        }

        public final String c(int i10, Resources resources) {
            n.h(resources, "resources");
            return ((T1.a) this.f15342c.get(i10)).b();
        }

        @Override // androidx.constraintlayout.helper.widget.Carousel.Adapter
        public int count() {
            return this.f15342c.size();
        }

        @Override // androidx.constraintlayout.helper.widget.Carousel.Adapter
        public void onNewItem(int i10) {
            this.f15344e.f(this.f15342c.get(i10));
        }

        @Override // androidx.constraintlayout.helper.widget.Carousel.Adapter
        public void populate(View view, int i10) {
            b bVar;
            Integer numC;
            Integer numE;
            Integer numD;
            View viewB;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup == null || (numC = (bVar = ClockCarouselView.f15325D).c(viewGroup.getId())) == null) {
                return;
            }
            View viewFindViewById = viewGroup.findViewById(numC.intValue());
            if (viewFindViewById == null) {
                viewFindViewById = null;
            }
            if (viewFindViewById == null || (numE = bVar.e(viewGroup.getId())) == null) {
                return;
            }
            View viewFindViewById2 = viewGroup.findViewById(numE.intValue());
            if (viewFindViewById2 == null) {
                viewFindViewById2 = null;
            }
            if (viewFindViewById2 == null || (numD = bVar.d(viewGroup.getId())) == null) {
                return;
            }
            View viewFindViewById3 = viewGroup.findViewById(numD.intValue());
            ClockHostView clockHostView = viewFindViewById3 instanceof ClockHostView ? (ClockHostView) viewFindViewById3 : null;
            if (clockHostView == null) {
                return;
            }
            String strA = ((T1.a) this.f15342c.get(i10)).a();
            clockHostView.removeAllViews();
            N1.a aVar = this.f15341b;
            int[] iArr = C0440a.f15346a;
            int i11 = iArr[aVar.ordinal()];
            if (i11 == 1) {
                S1.a aVar2 = this.f15343d;
                Context context = clockHostView.getContext();
                n.g(context, "getContext(...)");
                viewB = aVar2.b(context, strA);
            } else {
                if (i11 != 2) {
                    throw new m();
                }
                viewB = this.f15343d.f(strA);
            }
            ViewParent parent = viewB.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(viewB);
            }
            clockHostView.addView(viewB);
            boolean zK = bVar.k(viewGroup.getId());
            Resources resources = ((ViewGroup) view).getResources();
            n.g(resources, "getResources(...)");
            viewGroup.setContentDescription(c(i10, resources));
            viewGroup.setSelected(zK);
            int i12 = iArr[this.f15341b.ordinal()];
            if (i12 == 1) {
                d(zK, viewFindViewById2, strA, clockHostView);
            } else {
                if (i12 != 2) {
                    throw new m();
                }
                e(strA, zK, clockHostView, viewB);
            }
            viewFindViewById.setAlpha(zK ? 0.0f : 1.0f);
        }
    }

    public static final class b {
        public /* synthetic */ b(AbstractC1457h abstractC1457h) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float j(int i10, int i11, int i12) {
            return ((i10 - i11) / 2) - i12;
        }

        public final float b(View hostView) {
            n.h(hostView, "hostView");
            if (hostView.isLayoutRtl()) {
                return hostView.getWidth();
            }
            return 0.0f;
        }

        public final Integer c(int i10) {
            switch (i10) {
                case R.id.item_view_0 /* 2131362412 */:
                    return Integer.valueOf(R.id.item_card_0);
                case R.id.item_view_1 /* 2131362413 */:
                    return Integer.valueOf(R.id.item_card_1);
                case R.id.item_view_2 /* 2131362414 */:
                    return Integer.valueOf(R.id.item_card_2);
                case R.id.item_view_3 /* 2131362415 */:
                    return Integer.valueOf(R.id.item_card_3);
                case R.id.item_view_4 /* 2131362416 */:
                    return Integer.valueOf(R.id.item_card_4);
                default:
                    return null;
            }
        }

        public final Integer d(int i10) {
            switch (i10) {
                case R.id.item_view_0 /* 2131362412 */:
                    return Integer.valueOf(R.id.clock_host_view_0);
                case R.id.item_view_1 /* 2131362413 */:
                    return Integer.valueOf(R.id.clock_host_view_1);
                case R.id.item_view_2 /* 2131362414 */:
                    return Integer.valueOf(R.id.clock_host_view_2);
                case R.id.item_view_3 /* 2131362415 */:
                    return Integer.valueOf(R.id.clock_host_view_3);
                case R.id.item_view_4 /* 2131362416 */:
                    return Integer.valueOf(R.id.clock_host_view_4);
                default:
                    return null;
            }
        }

        public final Integer e(int i10) {
            switch (i10) {
                case R.id.item_view_0 /* 2131362412 */:
                    return Integer.valueOf(R.id.clock_scale_view_0);
                case R.id.item_view_1 /* 2131362413 */:
                    return Integer.valueOf(R.id.clock_scale_view_1);
                case R.id.item_view_2 /* 2131362414 */:
                    return Integer.valueOf(R.id.clock_scale_view_2);
                case R.id.item_view_3 /* 2131362415 */:
                    return Integer.valueOf(R.id.clock_scale_view_3);
                case R.id.item_view_4 /* 2131362416 */:
                    return Integer.valueOf(R.id.clock_scale_view_4);
                default:
                    return null;
            }
        }

        public final float f(float f10) {
            return Float.max(1.0f - (f10 * 4), 0.0f);
        }

        public final float g(float f10, float f11) {
            return 1.0f - (f10 * (1.0f - f11));
        }

        public final float h(float f10, float f11) {
            return f11 + (f10 * (1.0f - f11));
        }

        public final float i(float f10) {
            return Float.max(f10 - 0.75f, 0.0f) * 4;
        }

        public final boolean k(int i10) {
            return i10 == R.id.item_view_2;
        }

        private b() {
        }
    }

    public static final class c implements MotionLayout.TransitionListener {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ N1.a f15354q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ ClockCarouselView f15355r;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f15356a;

            static {
                int[] iArr = new int[N1.a.values().length];
                try {
                    iArr[N1.a.DYNAMIC.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[N1.a.SMALL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f15356a = iArr;
            }
        }

        public static final class b implements Runnable {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ View f15357q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ float f15358r;

            public b(View view, float f10) {
                this.f15357q = view;
                this.f15358r = f10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                View view = this.f15357q;
                float f10 = 2;
                view.setPivotX(((this.f15358r * view.getWidth()) / f10) + ((1 - this.f15358r) * ClockCarouselView.f15325D.b(view)));
                view.setPivotY((this.f15358r * view.getHeight()) / f10);
            }
        }

        /* JADX INFO: renamed from: com.android.customization.picker.clock.ui.view.ClockCarouselView$c$c, reason: collision with other inner class name */
        public static final class RunnableC0441c implements Runnable {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ View f15359q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ float f15360r;

            public RunnableC0441c(View view, float f10) {
                this.f15359q = view;
                this.f15360r = f10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                View view = this.f15359q;
                float f10 = 1;
                float f11 = 2;
                view.setPivotX((((f10 - this.f15360r) * view.getWidth()) / f11) + (this.f15360r * ClockCarouselView.f15325D.b(view)));
                view.setPivotY(((f10 - this.f15360r) * view.getHeight()) / f11);
            }
        }

        c(N1.a aVar, ClockCarouselView clockCarouselView) {
            this.f15354q = aVar;
            this.f15355r = clockCarouselView;
        }

        private final void a(float f10) {
            View view = this.f15355r.f15329C;
            if (view != null) {
                view.setAlpha(ClockCarouselView.f15325D.i(f10));
            }
            View view2 = this.f15355r.f15328B;
            if (view2 != null) {
                view2.setAlpha(ClockCarouselView.f15325D.f(f10));
            }
        }

        private final void b(float f10) {
            O2.l lVarE;
            d dVarD;
            O2.l lVarE2;
            d dVarD2;
            h hVar = this.f15355r.f15336w;
            if (hVar != null && (lVarE2 = hVar.e()) != null && (dVarD2 = lVarE2.d()) != null) {
                dVarD2.a(1 - f10);
            }
            h hVar2 = this.f15355r.f15335v;
            if (hVar2 != null && (lVarE = hVar2.e()) != null && (dVarD = lVarE.d()) != null) {
                dVarD.a(f10);
            }
            b bVar = ClockCarouselView.f15325D;
            float fG = bVar.g(f10, this.f15355r.f15332s);
            float fH = bVar.h(f10, this.f15355r.f15332s);
            View view = this.f15355r.f15338y;
            if (view != null) {
                view.setScaleX(fG);
            }
            View view2 = this.f15355r.f15338y;
            if (view2 != null) {
                view2.setScaleY(fG);
            }
            View view3 = this.f15355r.f15337x;
            if (view3 != null) {
                view3.setScaleX(fH);
            }
            View view4 = this.f15355r.f15337x;
            if (view4 != null) {
                view4.setScaleY(fH);
            }
        }

        private final void c(float f10) {
            ClockHostView clockHostView;
            ClockHostView clockHostView2 = this.f15355r.f15327A;
            if (clockHostView2 == null || (clockHostView = this.f15355r.f15339z) == null) {
                return;
            }
            View viewA = clockHostView2.getChildCount() != 0 ? K.a(clockHostView2, 0) : null;
            if (viewA == null) {
                return;
            }
            View viewA2 = clockHostView.getChildCount() != 0 ? K.a(clockHostView, 0) : null;
            if (viewA2 == null) {
                return;
            }
            y.a(clockHostView2, new b(clockHostView2, f10));
            y.a(clockHostView, new RunnableC0441c(clockHostView, f10));
            b bVar = ClockCarouselView.f15325D;
            viewA.setTranslationX(bVar.j(clockHostView2.getWidth(), viewA.getWidth(), viewA.getLeft()) * f10);
            viewA.setTranslationY(bVar.j(clockHostView2.getHeight(), viewA.getHeight(), viewA.getTop()) * f10);
            float f11 = 1 - f10;
            viewA2.setTranslationX(bVar.j(clockHostView.getWidth(), viewA2.getWidth(), viewA2.getLeft()) * f11);
            viewA2.setTranslationY(bVar.j(clockHostView.getHeight(), viewA2.getHeight(), viewA2.getTop()) * f11);
        }

        private final void d(MotionLayout motionLayout, int i10) {
            this.f15355r.f15329C = motionLayout.findViewById(R.id.item_card_2);
            this.f15355r.f15328B = motionLayout.findViewById(i10 == R.id.next ? R.id.item_card_3 : R.id.item_card_1);
        }

        private final void e(MotionLayout motionLayout, int i10) {
            int iCount;
            a aVar = this.f15355r.f15333t;
            S1.a aVar2 = null;
            if (aVar == null) {
                n.r("adapter");
                aVar = null;
            }
            String strA = ((T1.a) aVar.b().get(this.f15355r.getCarousel().getCurrentIndex())).a();
            if (i10 == R.id.next) {
                int currentIndex = this.f15355r.getCarousel().getCurrentIndex() + 1;
                a aVar3 = this.f15355r.f15333t;
                if (aVar3 == null) {
                    n.r("adapter");
                    aVar3 = null;
                }
                iCount = currentIndex % aVar3.count();
            } else {
                int currentIndex2 = this.f15355r.getCarousel().getCurrentIndex() - 1;
                a aVar4 = this.f15355r.f15333t;
                if (aVar4 == null) {
                    n.r("adapter");
                    aVar4 = null;
                }
                int iCount2 = currentIndex2 + aVar4.count();
                a aVar5 = this.f15355r.f15333t;
                if (aVar5 == null) {
                    n.r("adapter");
                    aVar5 = null;
                }
                iCount = iCount2 % aVar5.count();
            }
            a aVar6 = this.f15355r.f15333t;
            if (aVar6 == null) {
                n.r("adapter");
                aVar6 = null;
            }
            String strA2 = ((T1.a) aVar6.b().get(iCount)).a();
            ClockCarouselView clockCarouselView = this.f15355r;
            S1.a aVar7 = clockCarouselView.f15334u;
            if (aVar7 == null) {
                n.r("clockViewFactory");
                aVar7 = null;
            }
            clockCarouselView.f15336w = aVar7.d(strA);
            ClockCarouselView clockCarouselView2 = this.f15355r;
            S1.a aVar8 = clockCarouselView2.f15334u;
            if (aVar8 == null) {
                n.r("clockViewFactory");
            } else {
                aVar2 = aVar8;
            }
            clockCarouselView2.f15335v = aVar2.d(strA2);
            this.f15355r.f15338y = motionLayout.findViewById(R.id.clock_scale_view_2);
            this.f15355r.f15337x = motionLayout.findViewById(i10 == R.id.next ? R.id.clock_scale_view_3 : R.id.clock_scale_view_1);
        }

        private final void f(MotionLayout motionLayout, int i10) {
            this.f15355r.f15327A = (ClockHostView) motionLayout.findViewById(R.id.clock_host_view_2);
            this.f15355r.f15339z = (ClockHostView) motionLayout.findViewById(i10 == R.id.next ? R.id.clock_host_view_3 : R.id.clock_host_view_1);
        }

        private final void g(boolean z9) {
            int i10 = a.f15356a[this.f15354q.ordinal()];
            if (i10 == 1) {
                b(z9 ? 0.0f : 1.0f);
            } else {
                if (i10 != 2) {
                    throw new m();
                }
                c(z9 ? 0.0f : 1.0f);
            }
            a(z9 ? 0.0f : 1.0f);
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
        public void onTransitionChange(MotionLayout motionLayout, int i10, int i11, float f10) {
            int i12 = a.f15356a[this.f15354q.ordinal()];
            if (i12 == 1) {
                b(f10);
            } else {
                if (i12 != 2) {
                    throw new m();
                }
                c(f10);
            }
            a(f10);
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
        public void onTransitionCompleted(MotionLayout motionLayout, int i10) {
            g(i10 == R.id.start);
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
        public void onTransitionStarted(MotionLayout motionLayout, int i10, int i11) {
            if (motionLayout == null) {
                return;
            }
            int i12 = a.f15356a[this.f15354q.ordinal()];
            if (i12 == 1) {
                e(motionLayout, i11);
            } else {
                if (i12 != 2) {
                    throw new m();
                }
                f(motionLayout, i11);
            }
            d(motionLayout, i11);
            g(true);
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
        public void onTransitionTrigger(MotionLayout motionLayout, int i10, boolean z9, float f10) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClockCarouselView(Context context, AttributeSet attrs) {
        super(context, attrs);
        n.h(context, "context");
        n.h(attrs, "attrs");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.clock_carousel, this);
        this.f15330q = (Carousel) viewInflate.requireViewById(R.id.carousel);
        MotionLayout motionLayout = (MotionLayout) viewInflate.requireViewById(R.id.motion_container);
        this.f15331r = motionLayout;
        motionLayout.setVisibility(8);
        motionLayout.setContentDescription(context.getString(R.string.custom_clocks_label));
        TypedValue typedValue = new TypedValue();
        getResources().getValue(R.dimen.clock_carousel_scale, typedValue, true);
        this.f15332s = typedValue.getFloat();
    }

    private final void u() {
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.screen_preview_width_for_2_pane_small_width);
        Iterator it = f15326E.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            View viewRequireViewById = this.f15331r.requireViewById(iIntValue);
            n.g(viewRequireViewById, "requireViewById(...)");
            FrameLayout frameLayout = (FrameLayout) viewRequireViewById;
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            layoutParams.width = dimensionPixelSize;
            frameLayout.setLayoutParams(layoutParams);
            Integer numE = f15325D.e(iIntValue);
            if (numE != null) {
                View viewRequireViewById2 = this.f15331r.requireViewById(numE.intValue());
                n.g(viewRequireViewById2, "requireViewById(...)");
                FixedWidthDisplayRatioFrameLayout fixedWidthDisplayRatioFrameLayout = (FixedWidthDisplayRatioFrameLayout) viewRequireViewById2;
                ViewGroup.LayoutParams layoutParams2 = fixedWidthDisplayRatioFrameLayout.getLayoutParams();
                layoutParams2.width = dimensionPixelSize;
                fixedWidthDisplayRatioFrameLayout.setLayoutParams(layoutParams2);
            }
        }
        for (ConstraintSet constraintSet : AbstractC1444s.n(this.f15331r.getConstraintSet(R.id.previous), this.f15331r.getConstraintSet(R.id.start), this.f15331r.getConstraintSet(R.id.next))) {
            Iterator it2 = f15326E.iterator();
            while (it2.hasNext()) {
                ConstraintSet.Constraint constraint = constraintSet.getConstraint(((Number) it2.next()).intValue());
                if (constraint != null) {
                    ConstraintSet.Layout layout = constraint.layout;
                    if (layout.mWidth == getContext().getResources().getDimensionPixelSize(R.dimen.screen_preview_width)) {
                        layout.mWidth = dimensionPixelSize;
                    }
                    if (constraint.layout.widthMax == getContext().getResources().getDimensionPixelSize(R.dimen.screen_preview_width)) {
                        layout.widthMax = dimensionPixelSize;
                    }
                }
            }
        }
    }

    public final Carousel getCarousel() {
        return this.f15330q;
    }

    public final void setCarouselCardColor(int i10) {
        Iterator it = f15326E.iterator();
        while (it.hasNext()) {
            Integer numC = f15325D.c(((Number) it.next()).intValue());
            if (numC != null) {
                View viewRequireViewById = this.f15331r.requireViewById(numC.intValue());
                n.g(viewRequireViewById, "requireViewById(...)");
                viewRequireViewById.setBackgroundTintList(ColorStateList.valueOf(i10));
            }
        }
    }

    public final void setClockViewFactory(S1.a factory) {
        n.h(factory, "factory");
        this.f15334u = factory;
    }

    public final void setSelectedClockIndex(int i10) {
        if (i10 >= this.f15330q.getCount() || i10 == this.f15330q.getCurrentIndex()) {
            return;
        }
        this.f15330q.jumpToIndex(i10);
    }

    public final String t(int i10) {
        a aVar = this.f15333t;
        if (aVar == null) {
            n.r("adapter");
            aVar = null;
        }
        Resources resources = getResources();
        n.g(resources, "getResources(...)");
        return aVar.c(i10, resources);
    }

    public final void v() {
        if (this.f15330q.getCount() > 1) {
            if ((this.f15330q.isInfinite() || this.f15330q.getCurrentIndex() != this.f15330q.getCount() - 1) && this.f15331r.getCurrentState() == R.id.start) {
                this.f15331r.transitionToState(R.id.next, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
            }
        }
    }

    public final void w() {
        if (this.f15330q.getCount() > 1) {
            if ((this.f15330q.isInfinite() || this.f15330q.getCurrentIndex() != 0) && this.f15331r.getCurrentState() == R.id.start) {
                this.f15331r.transitionToState(R.id.previous, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
            }
        }
    }

    public final void x(N1.a clockSize, List clocks, l onClockSelected, boolean z9) {
        S1.a aVar;
        n.h(clockSize, "clockSize");
        n.h(clocks, "clocks");
        n.h(onClockSelected, "onClockSelected");
        if (clocks.isEmpty()) {
            this.f15331r.setVisibility(8);
            return;
        }
        if (z9) {
            u();
        }
        float f10 = this.f15332s;
        S1.a aVar2 = this.f15334u;
        if (aVar2 == null) {
            n.r("clockViewFactory");
            aVar = null;
        } else {
            aVar = aVar2;
        }
        this.f15333t = new a(f10, clockSize, clocks, aVar, onClockSelected);
        this.f15330q.setInfinite(clocks.size() >= 5);
        Carousel carousel = this.f15330q;
        a aVar3 = this.f15333t;
        if (aVar3 == null) {
            n.r("adapter");
            aVar3 = null;
        }
        carousel.setAdapter(aVar3);
        Iterator it = clocks.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            } else if (((T1.a) it.next()).c()) {
                break;
            } else {
                i10++;
            }
        }
        Integer numValueOf = Integer.valueOf(i10);
        Integer num = numValueOf.intValue() != -1 ? numValueOf : null;
        this.f15330q.jumpToIndex(num != null ? num.intValue() : 0);
        this.f15331r.setTransitionListener(new c(clockSize, this));
        this.f15331r.setVisibility(0);
    }

    public final void y() {
        if (this.f15330q.getCount() != 0) {
            int currentIndex = (this.f15330q.getCurrentIndex() + 1) % this.f15330q.getCount();
            this.f15330q.jumpToIndex(currentIndex);
            a aVar = this.f15333t;
            if (aVar == null) {
                n.r("adapter");
                aVar = null;
            }
            aVar.onNewItem(currentIndex);
        }
    }

    public final void z() {
        if (this.f15330q.getCount() != 0) {
            int currentIndex = ((this.f15330q.getCurrentIndex() + this.f15330q.getCount()) - 1) % this.f15330q.getCount();
            this.f15330q.jumpToIndex(currentIndex);
            a aVar = this.f15333t;
            if (aVar == null) {
                n.r("adapter");
                aVar = null;
            }
            aVar.onNewItem(currentIndex);
        }
    }
}
