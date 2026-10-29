package com.nothing.wallpaper.picker.lockscreen.ui.view;

import E7.InterfaceC0769a;
import F8.AbstractC0816i;
import F8.InterfaceC0846x0;
import I8.InterfaceC0881g;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.AbstractC1164y;
import androidx.lifecycle.InterfaceC1163x;
import com.android.launcher3.AbstractC1219a;
import com.android.launcher3.Workspace;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.picker.lockscreen.ui.LockScreenFragment;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public final class WidgetPickerBottomSheet extends D implements E7.S {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final a f19023r0 = new a(null);

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private final com.android.launcher3.f f19024i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private final float f19025j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private final Workspace f19026k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private InterfaceC0769a f19027l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private WidgetPickerGroupPage f19028m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private WidgetPickerDetails f19029n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private InterfaceC0846x0 f19030o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private float f19031p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private boolean f19032q0;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public static /* synthetic */ WidgetPickerBottomSheet b(a aVar, LockScreenFragment lockScreenFragment, boolean z9, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z9 = true;
            }
            return aVar.a(lockScreenFragment, z9);
        }

        public final WidgetPickerBottomSheet a(LockScreenFragment fragment, boolean z9) {
            kotlin.jvm.internal.n.h(fragment, "fragment");
            View viewInflate = fragment.getLayoutInflater().inflate(R.layout.widget_picker_bottom_sheet, (ViewGroup) fragment.J(), false);
            kotlin.jvm.internal.n.f(viewInflate, "null cannot be cast to non-null type com.nothing.wallpaper.picker.lockscreen.ui.view.WidgetPickerBottomSheet");
            WidgetPickerBottomSheet widgetPickerBottomSheet = (WidgetPickerBottomSheet) viewInflate;
            widgetPickerBottomSheet.f19027l0 = fragment;
            widgetPickerBottomSheet.N();
            ((AbstractC1219a) widgetPickerBottomSheet).f15492q = true;
            widgetPickerBottomSheet.j0(z9);
            return widgetPickerBottomSheet;
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f19033q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ InterfaceC1163x f19034r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ WidgetPickerBottomSheet f19035s;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f19036q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private /* synthetic */ Object f19037r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ WidgetPickerBottomSheet f19038s;

            /* JADX INFO: renamed from: com.nothing.wallpaper.picker.lockscreen.ui.view.WidgetPickerBottomSheet$b$a$a, reason: collision with other inner class name */
            static final class C0512a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f19039q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ WidgetPickerBottomSheet f19040r;

                /* JADX INFO: renamed from: com.nothing.wallpaper.picker.lockscreen.ui.view.WidgetPickerBottomSheet$b$a$a$a, reason: collision with other inner class name */
                static final class C0513a implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ WidgetPickerBottomSheet f19041q;

                    C0513a(WidgetPickerBottomSheet widgetPickerBottomSheet) {
                        this.f19041q = widgetPickerBottomSheet;
                    }

                    @Override // I8.InterfaceC0881g
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object b(List list, p129m8.e eVar) {
                        WidgetPickerGroupPage widgetPickerGroupPage = this.f19041q.f19028m0;
                        if (widgetPickerGroupPage == null) {
                            kotlin.jvm.internal.n.r("widgetPickerGroupPage");
                            widgetPickerGroupPage = null;
                        }
                        widgetPickerGroupPage.a0(list);
                        return p079h8.A.f21846a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0512a(WidgetPickerBottomSheet widgetPickerBottomSheet, p129m8.e eVar) {
                    super(2, eVar);
                    this.f19040r = widgetPickerBottomSheet;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new C0512a(this.f19040r, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(F8.L l9, p129m8.e eVar) {
                    return ((C0512a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f19039q;
                    if (i10 == 0) {
                        p079h8.r.b(obj);
                        InterfaceC0769a interfaceC0769a = this.f19040r.f19027l0;
                        if (interfaceC0769a == null) {
                            kotlin.jvm.internal.n.r("bottomSheetCallback");
                            interfaceC0769a = null;
                        }
                        I8.E eF = interfaceC0769a.getLockScreenViewModel().F();
                        C0513a c0513a = new C0513a(this.f19040r);
                        this.f19039q = 1;
                        if (eF.a(c0513a, this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p079h8.r.b(obj);
                    }
                    throw new p079h8.f();
                }
            }

            /* JADX INFO: renamed from: com.nothing.wallpaper.picker.lockscreen.ui.view.WidgetPickerBottomSheet$b$a$b, reason: collision with other inner class name */
            static final class C0514b extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f19042q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ WidgetPickerBottomSheet f19043r;

                /* JADX INFO: renamed from: com.nothing.wallpaper.picker.lockscreen.ui.view.WidgetPickerBottomSheet$b$a$b$a, reason: collision with other inner class name */
                static final class C0515a implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ WidgetPickerBottomSheet f19044q;

                    C0515a(WidgetPickerBottomSheet widgetPickerBottomSheet) {
                        this.f19044q = widgetPickerBottomSheet;
                    }

                    @Override // I8.InterfaceC0881g
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object b(p258z7.d dVar, p129m8.e eVar) {
                        if (dVar != null) {
                            WidgetPickerDetails widgetPickerDetails = this.f19044q.f19029n0;
                            if (widgetPickerDetails == null) {
                                kotlin.jvm.internal.n.r("widgetPickerDetails");
                                widgetPickerDetails = null;
                            }
                            widgetPickerDetails.i(dVar);
                        }
                        return p079h8.A.f21846a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0514b(WidgetPickerBottomSheet widgetPickerBottomSheet, p129m8.e eVar) {
                    super(2, eVar);
                    this.f19043r = widgetPickerBottomSheet;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new C0514b(this.f19043r, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(F8.L l9, p129m8.e eVar) {
                    return ((C0514b) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f19042q;
                    if (i10 == 0) {
                        p079h8.r.b(obj);
                        InterfaceC0769a interfaceC0769a = this.f19043r.f19027l0;
                        if (interfaceC0769a == null) {
                            kotlin.jvm.internal.n.r("bottomSheetCallback");
                            interfaceC0769a = null;
                        }
                        I8.E eS = interfaceC0769a.getLockScreenViewModel().S();
                        C0515a c0515a = new C0515a(this.f19043r);
                        this.f19042q = 1;
                        if (eS.a(c0515a, this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p079h8.r.b(obj);
                    }
                    throw new p079h8.f();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(WidgetPickerBottomSheet widgetPickerBottomSheet, p129m8.e eVar) {
                super(2, eVar);
                this.f19038s = widgetPickerBottomSheet;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                a aVar = new a(this.f19038s, eVar);
                aVar.f19037r = obj;
                return aVar;
            }

            @Override // p219v8.p
            public final Object invoke(F8.L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f19036q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
                F8.L l9 = (F8.L) this.f19037r;
                AbstractC0816i.d(l9, null, null, new C0512a(this.f19038s, null), 3, null);
                AbstractC0816i.d(l9, null, null, new C0514b(this.f19038s, null), 3, null);
                return p079h8.A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC1163x interfaceC1163x, WidgetPickerBottomSheet widgetPickerBottomSheet, p129m8.e eVar) {
            super(2, eVar);
            this.f19034r = interfaceC1163x;
            this.f19035s = widgetPickerBottomSheet;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return new b(this.f19034r, this.f19035s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(F8.L l9, p129m8.e eVar) {
            return ((b) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f19033q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                InterfaceC1163x interfaceC1163x = this.f19034r;
                AbstractC1157q.b bVar = AbstractC1157q.b.STARTED;
                a aVar = new a(this.f19035s, null);
                this.f19033q = 1;
                if (androidx.lifecycle.N.b(interfaceC1163x, bVar, aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
            }
            return p079h8.A.f21846a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WidgetPickerBottomSheet(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.n.h(context, "context");
    }

    private final boolean D0() {
        WidgetPickerGroupPage widgetPickerGroupPage = this.f19028m0;
        if (widgetPickerGroupPage == null) {
            kotlin.jvm.internal.n.r("widgetPickerGroupPage");
            widgetPickerGroupPage = null;
        }
        return widgetPickerGroupPage.getVisibility() == 8;
    }

    private final boolean E0(MotionEvent motionEvent) {
        if (D0()) {
            return false;
        }
        WidgetPickerGroupPage widgetPickerGroupPage = this.f19028m0;
        if (widgetPickerGroupPage == null) {
            kotlin.jvm.internal.n.r("widgetPickerGroupPage");
            widgetPickerGroupPage = null;
        }
        return widgetPickerGroupPage.Y(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0101 A[PHI: r1
      0x0101: PHI (r1v2 android.view.View) = (r1v1 android.view.View), (r1v3 android.view.View) binds: [B:65:0x0105, B:61:0x00fb] A[DONT_GENERATE, DONT_INLINE]] */
    private final void F0(final boolean z9, boolean z10) {
        View view;
        View view2 = null;
        if (z10) {
            Animator openCloseAnimation = getOpenCloseAnimation();
            if (openCloseAnimation != null) {
                if (!openCloseAnimation.isRunning()) {
                    openCloseAnimation = null;
                }
                if (openCloseAnimation != null) {
                    openCloseAnimation.cancel();
                }
            }
            WidgetPickerDetails widgetPickerDetails = this.f19029n0;
            if (widgetPickerDetails == null) {
                kotlin.jvm.internal.n.r("widgetPickerDetails");
                widgetPickerDetails = null;
            }
            widgetPickerDetails.setVisibility(0);
            WidgetPickerGroupPage widgetPickerGroupPage = this.f19028m0;
            if (widgetPickerGroupPage == null) {
                kotlin.jvm.internal.n.r("widgetPickerGroupPage");
                widgetPickerGroupPage = null;
            }
            widgetPickerGroupPage.setVisibility(0);
            float f10 = z9 ? this.f19025j0 : this.f19031p0;
            if (z9) {
                this.f19031p0 = this.f15741z;
            }
            WidgetPickerGroupPage widgetPickerGroupPage2 = this.f19028m0;
            if (widgetPickerGroupPage2 == null) {
                kotlin.jvm.internal.n.r("widgetPickerGroupPage");
                widgetPickerGroupPage2 = null;
            }
            float scaleX = widgetPickerGroupPage2.getScaleX();
            float f11 = z9 ? 0.95f : 1.0f;
            WidgetPickerDetails widgetPickerDetails2 = this.f19029n0;
            if (widgetPickerDetails2 == null) {
                kotlin.jvm.internal.n.r("widgetPickerDetails");
                widgetPickerDetails2 = null;
            }
            final float translationY = widgetPickerDetails2.getTranslationY();
            final float f12 = z9 ? 0.0f : this.f19024i0.f15548Q;
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, com.android.launcher3.views.e.f15718N, this.f15741z, f10);
            objectAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.d0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    WidgetPickerBottomSheet.H0(this.f19098a, translationY, f12, valueAnimator);
                }
            });
            animatorSet.play(objectAnimatorOfFloat);
            WidgetPickerGroupPage widgetPickerGroupPage3 = this.f19028m0;
            if (widgetPickerGroupPage3 == null) {
                kotlin.jvm.internal.n.r("widgetPickerGroupPage");
                widgetPickerGroupPage3 = null;
            }
            animatorSet.play(ObjectAnimator.ofFloat(widgetPickerGroupPage3, com.android.launcher3.j.f15619b, scaleX, f11));
            animatorSet.setDuration(400L);
            animatorSet.setInterpolator(c0.f19086b0.a());
            animatorSet.addListener(p223w2.f.a(new Runnable() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.e0
                @Override // java.lang.Runnable
                public final void run() {
                    WidgetPickerBottomSheet.I0(this.f19102q, z9);
                }
            }));
            animatorSet.start();
            setOpenCloseAnimation(animatorSet);
        } else {
            WidgetPickerDetails widgetPickerDetails3 = this.f19029n0;
            if (widgetPickerDetails3 == null) {
                kotlin.jvm.internal.n.r("widgetPickerDetails");
                widgetPickerDetails3 = null;
            }
            widgetPickerDetails3.setTranslationY(0.0f);
            WidgetPickerDetails widgetPickerDetails4 = this.f19029n0;
            if (widgetPickerDetails4 == null) {
                kotlin.jvm.internal.n.r("widgetPickerDetails");
                widgetPickerDetails4 = null;
            }
            widgetPickerDetails4.setVisibility(z9 ? 0 : 8);
            WidgetPickerGroupPage widgetPickerGroupPage4 = this.f19028m0;
            if (widgetPickerGroupPage4 == null) {
                kotlin.jvm.internal.n.r("widgetPickerGroupPage");
                widgetPickerGroupPage4 = null;
            }
            widgetPickerGroupPage4.setVisibility(z9 ? 8 : 0);
            setTranslationShift(this.f19025j0);
            this.f19032q0 = false;
        }
        if (z9) {
            view = this.f19029n0;
            if (view == null) {
                kotlin.jvm.internal.n.r("widgetPickerDetails");
            } else {
                view2 = view;
            }
        } else {
            view = this.f19028m0;
            if (view == null) {
                kotlin.jvm.internal.n.r("widgetPickerGroupPage");
            } else {
                view2 = view;
            }
        }
        setCurPageView(view2);
    }

    static /* synthetic */ void G0(WidgetPickerBottomSheet widgetPickerBottomSheet, boolean z9, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = true;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        widgetPickerBottomSheet.F0(z9, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H0(WidgetPickerBottomSheet widgetPickerBottomSheet, float f10, float f11, ValueAnimator animation) {
        kotlin.jvm.internal.n.h(animation, "animation");
        float f12 = widgetPickerBottomSheet.f19025j0;
        Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.n.g(animatedValue, "getAnimatedValue(...)");
        float fD = (f12 - p206u5.a.d(animatedValue)) * widgetPickerBottomSheet.getShiftRange();
        float animatedFraction = animation.getAnimatedFraction();
        WidgetPickerDetails widgetPickerDetails = widgetPickerBottomSheet.f19029n0;
        if (widgetPickerDetails == null) {
            kotlin.jvm.internal.n.r("widgetPickerDetails");
            widgetPickerDetails = null;
        }
        widgetPickerDetails.setTranslationY(((1 - animatedFraction) * f10) + (animatedFraction * f11) + fD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I0(WidgetPickerBottomSheet widgetPickerBottomSheet, boolean z9) {
        WidgetPickerDetails widgetPickerDetails = widgetPickerBottomSheet.f19029n0;
        WidgetPickerGroupPage widgetPickerGroupPage = null;
        if (widgetPickerDetails == null) {
            kotlin.jvm.internal.n.r("widgetPickerDetails");
            widgetPickerDetails = null;
        }
        widgetPickerDetails.setVisibility(z9 ? 0 : 8);
        WidgetPickerGroupPage widgetPickerGroupPage2 = widgetPickerBottomSheet.f19028m0;
        if (widgetPickerGroupPage2 == null) {
            kotlin.jvm.internal.n.r("widgetPickerGroupPage");
        } else {
            widgetPickerGroupPage = widgetPickerGroupPage2;
        }
        widgetPickerGroupPage.setVisibility(z9 ? 8 : 0);
        widgetPickerBottomSheet.f19032q0 = false;
    }

    private final boolean J0(MotionEvent motionEvent) {
        Rect rect = new Rect();
        this.f19026k0.c(rect);
        return rect.contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    @Override // com.android.launcher3.AbstractC1219a
    protected boolean J(int i10) {
        return (i10 & 1) != 0;
    }

    @Override // E7.S
    public void a(boolean z9) {
        InterfaceC0769a interfaceC0769a = this.f19027l0;
        WidgetPickerGroupPage widgetPickerGroupPage = null;
        if (interfaceC0769a == null) {
            kotlin.jvm.internal.n.r("bottomSheetCallback");
            interfaceC0769a = null;
        }
        interfaceC0769a.a(z9);
        k0(0.0f);
        WidgetPickerGroupPage widgetPickerGroupPage2 = this.f19028m0;
        if (widgetPickerGroupPage2 == null) {
            kotlin.jvm.internal.n.r("widgetPickerGroupPage");
        } else {
            widgetPickerGroupPage = widgetPickerGroupPage2;
        }
        widgetPickerGroupPage.Z();
    }

    @Override // E7.S
    public void d(View view) {
        kotlin.jvm.internal.n.h(view, "view");
        Object tag = view.getTag();
        InterfaceC0769a interfaceC0769a = null;
        com.nothing.launcher.card.m mVar = tag instanceof com.nothing.launcher.card.m ? (com.nothing.launcher.card.m) tag : null;
        if (mVar != null) {
            InterfaceC0769a interfaceC0769a2 = this.f19027l0;
            if (interfaceC0769a2 == null) {
                kotlin.jvm.internal.n.r("bottomSheetCallback");
            } else {
                interfaceC0769a = interfaceC0769a2;
            }
            interfaceC0769a.C(mVar);
        }
    }

    @Override // com.android.launcher3.views.e
    protected boolean d0() {
        if (D0()) {
            return super.d0();
        }
        return this.f15741z > 0.0f;
    }

    @Override // com.nothing.wallpaper.picker.lockscreen.ui.view.c0, com.android.launcher3.views.e, F2.w
    public boolean h(MotionEvent ev) {
        kotlin.jvm.internal.n.h(ev, "ev");
        WidgetPickerGroupPage widgetPickerGroupPage = this.f19028m0;
        if (widgetPickerGroupPage == null) {
            kotlin.jvm.internal.n.r("widgetPickerGroupPage");
            widgetPickerGroupPage = null;
        }
        if (widgetPickerGroupPage.X(ev)) {
            return true;
        }
        return super.h(ev);
    }

    @Override // E7.S
    public void j(View view) {
        kotlin.jvm.internal.n.h(view, "view");
        InterfaceC0769a interfaceC0769a = this.f19027l0;
        if (interfaceC0769a == null) {
            kotlin.jvm.internal.n.r("bottomSheetCallback");
            interfaceC0769a = null;
        }
        interfaceC0769a.T();
        E2.f.f1271b.onLongClick(view);
    }

    @Override // com.nothing.wallpaper.picker.lockscreen.ui.view.c0, com.android.launcher3.views.e, F2.w
    public boolean k(MotionEvent ev) {
        kotlin.jvm.internal.n.h(ev, "ev");
        if (((p248y7.u) this.f15733r).p().y()) {
            return false;
        }
        if (ev.getAction() == 0) {
            this.f15723D = (J0(ev) && this.f15741z >= this.f19025j0) || E0(ev);
        }
        if (!this.f15723D && T(ev)) {
            WidgetPickerGroupPage widgetPickerGroupPage = this.f19028m0;
            if (widgetPickerGroupPage == null) {
                kotlin.jvm.internal.n.r("widgetPickerGroupPage");
                widgetPickerGroupPage = null;
            }
            if (widgetPickerGroupPage.W(ev)) {
                return true;
            }
        }
        return super.k(ev);
    }

    @Override // com.nothing.wallpaper.picker.lockscreen.ui.view.D, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC1163x interfaceC1163xA = androidx.lifecycle.g0.a(this);
        if (interfaceC1163xA != null) {
            this.f19030o0 = AbstractC0816i.d(AbstractC1164y.a(interfaceC1163xA), null, null, new b(interfaceC1163xA, this, null), 3, null);
        }
    }

    @Override // com.android.launcher3.AbstractC1219a, android.window.OnBackInvokedCallback
    public void onBackInvoked() {
        if (D0()) {
            G0(this, false, false, 2, null);
        } else {
            super.onBackInvoked();
        }
    }

    @Override // com.nothing.wallpaper.picker.lockscreen.ui.view.D, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0846x0 interfaceC0846x0 = this.f19030o0;
        if (interfaceC0846x0 != null) {
            InterfaceC0846x0.a.a(interfaceC0846x0, null, 1, null);
        }
        this.f19030o0 = null;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f15736u = (ViewGroup) requireViewById(R.id.container);
        this.f19029n0 = (WidgetPickerDetails) requireViewById(R.id.widget_picker_detail);
        this.f19028m0 = (WidgetPickerGroupPage) requireViewById(R.id.widget_picker_group);
        setWidgetDeleteView((DeleteDropView) requireViewById(R.id.widget_delete_view));
        WidgetPickerGroupPage widgetPickerGroupPage = this.f19028m0;
        WidgetPickerDetails widgetPickerDetails = null;
        if (widgetPickerGroupPage == null) {
            kotlin.jvm.internal.n.r("widgetPickerGroupPage");
            widgetPickerGroupPage = null;
        }
        setCurPageView(widgetPickerGroupPage);
        WidgetPickerDetails widgetPickerDetails2 = this.f19029n0;
        if (widgetPickerDetails2 == null) {
            kotlin.jvm.internal.n.r("widgetPickerDetails");
        } else {
            widgetPickerDetails = widgetPickerDetails2;
        }
        widgetPickerDetails.setTranslationY(this.f19024i0.f15548Q);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        int i14 = i13 - i11;
        int measuredWidth = this.f15736u.getMeasuredWidth();
        int i15 = ((i12 - i10) - measuredWidth) / 2;
        ViewGroup viewGroup = this.f15736u;
        viewGroup.layout(i15, i14 - viewGroup.getMeasuredHeight(), measuredWidth + i15, i14);
        getWidgetDeleteView().layout(0, 0, getWidgetDeleteView().getMeasuredWidth(), getWidgetDeleteView().getMeasuredHeight());
        WidgetPickerDetails widgetPickerDetails = this.f19029n0;
        WidgetPickerDetails widgetPickerDetails2 = null;
        if (widgetPickerDetails == null) {
            kotlin.jvm.internal.n.r("widgetPickerDetails");
            widgetPickerDetails = null;
        }
        WidgetPickerDetails widgetPickerDetails3 = this.f19029n0;
        if (widgetPickerDetails3 == null) {
            kotlin.jvm.internal.n.r("widgetPickerDetails");
            widgetPickerDetails3 = null;
        }
        int measuredWidth2 = widgetPickerDetails3.getMeasuredWidth();
        WidgetPickerDetails widgetPickerDetails4 = this.f19029n0;
        if (widgetPickerDetails4 == null) {
            kotlin.jvm.internal.n.r("widgetPickerDetails");
        } else {
            widgetPickerDetails2 = widgetPickerDetails4;
        }
        widgetPickerDetails.layout(0, 0, measuredWidth2, widgetPickerDetails2.getMeasuredHeight());
        setTranslationShift(this.f15741z);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        measureChildWithMargins(this.f15736u, i10, 0, i11, p239x8.a.b(this.f19024i0.f15546O));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f19024i0.f15548Q, BasicMeasure.EXACTLY);
        WidgetPickerDetails widgetPickerDetails = this.f19029n0;
        if (widgetPickerDetails == null) {
            kotlin.jvm.internal.n.r("widgetPickerDetails");
            widgetPickerDetails = null;
        }
        widgetPickerDetails.measure(i10, iMakeMeasureSpec);
        getWidgetDeleteView().measure(i10, iMakeMeasureSpec);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
    }

    @Override // E7.S
    public void p() {
        onBackInvoked();
    }

    @Override // com.android.launcher3.views.e
    protected void setTranslationShift(float f10) {
        if (D0()) {
            float f11 = this.f19025j0;
            if (f10 < f11) {
                f10 = f11;
            }
        }
        super.setTranslationShift(f10);
        float f12 = this.f19024i0.f15551T;
        float fMin = Math.min(1 - this.f15741z, f12) / f12;
        InterfaceC0769a interfaceC0769a = this.f19027l0;
        if (interfaceC0769a == null) {
            kotlin.jvm.internal.n.r("bottomSheetCallback");
            interfaceC0769a = null;
        }
        interfaceC0769a.c(fMin);
    }

    @Override // E7.S
    public void v(p258z7.c selectInfo) {
        kotlin.jvm.internal.n.h(selectInfo, "selectInfo");
        if (this.f19032q0) {
            return;
        }
        this.f19032q0 = true;
        InterfaceC0769a interfaceC0769a = this.f19027l0;
        if (interfaceC0769a == null) {
            kotlin.jvm.internal.n.r("bottomSheetCallback");
            interfaceC0769a = null;
        }
        interfaceC0769a.getLockScreenViewModel().N0(selectInfo);
        G0(this, false, false, 3, null);
    }

    public /* synthetic */ WidgetPickerBottomSheet(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC1457h abstractC1457h) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetPickerBottomSheet(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.n.h(context, "context");
        com.android.launcher3.f fVarK = ((p248y7.u) this.f15733r).K();
        this.f19024i0 = fVarK;
        float f10 = 1 - fVarK.f15551T;
        this.f19025j0 = f10;
        this.f19026k0 = ((p248y7.u) this.f15733r).M();
        this.f19031p0 = f10;
    }
}
