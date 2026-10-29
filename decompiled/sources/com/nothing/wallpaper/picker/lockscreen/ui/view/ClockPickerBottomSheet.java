package com.nothing.wallpaper.picker.lockscreen.ui.view;

import E7.InterfaceC0769a;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.FloatProperty;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import com.android.launcher3.AbstractC1219a;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.picker.lockscreen.ui.LockScreenFragment;
import kotlin.jvm.internal.AbstractC1457h;
import p248y7.InterfaceC2016s;

/* JADX INFO: loaded from: classes2.dex */
public final class ClockPickerBottomSheet extends com.android.launcher3.views.e implements InterfaceC2016s {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final b f18844b0 = new b(null);

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final a f18845c0 = new a();

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final com.android.launcher3.f f18846P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private ClockPickerPage f18847Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private InterfaceC0769a f18848R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final PathInterpolator f18849S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private float f18850T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private float f18851U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private Animator f18852V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private final p079h8.h f18853W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final p079h8.h f18854a0;

    public static final class a extends FloatProperty {
        a() {
            super("dynamicFont");
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(ClockPickerBottomSheet cbs) {
            kotlin.jvm.internal.n.h(cbs, "cbs");
            return Float.valueOf(cbs.f18851U);
        }

        @Override // android.util.FloatProperty
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(ClockPickerBottomSheet cbs, float f10) {
            kotlin.jvm.internal.n.h(cbs, "cbs");
            cbs.s0(f10, ((com.android.launcher3.views.e) cbs).f15741z);
        }
    }

    public static final class b {
        public /* synthetic */ b(AbstractC1457h abstractC1457h) {
            this();
        }

        public static /* synthetic */ ClockPickerBottomSheet b(b bVar, LockScreenFragment lockScreenFragment, boolean z9, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z9 = true;
            }
            return bVar.a(lockScreenFragment, z9);
        }

        public final ClockPickerBottomSheet a(LockScreenFragment fragment, boolean z9) {
            kotlin.jvm.internal.n.h(fragment, "fragment");
            View viewInflate = fragment.getLayoutInflater().inflate(R.layout.clock_picker_bottom_sheet, (ViewGroup) fragment.J(), false);
            kotlin.jvm.internal.n.f(viewInflate, "null cannot be cast to non-null type com.nothing.wallpaper.picker.lockscreen.ui.view.ClockPickerBottomSheet");
            ClockPickerBottomSheet clockPickerBottomSheet = (ClockPickerBottomSheet) viewInflate;
            clockPickerBottomSheet.f18848R = fragment;
            clockPickerBottomSheet.N();
            ((AbstractC1219a) clockPickerBottomSheet).f15492q = true;
            clockPickerBottomSheet.r0(z9);
            return clockPickerBottomSheet;
        }

        private b() {
        }
    }

    public static final class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.n.h(animation, "animation");
            ((com.android.launcher3.views.e) ClockPickerBottomSheet.this).f15736u.setLayerType(0, null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            kotlin.jvm.internal.n.h(animation, "animation");
            ((com.android.launcher3.views.e) ClockPickerBottomSheet.this).f15736u.setLayerType(2, null);
        }
    }

    public static final class d implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f18857b;

        public d(boolean z9) {
            this.f18857b = z9;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            view.removeOnLayoutChangeListener(this);
            ClockPickerBottomSheet.this.q(this.f18857b, false);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClockPickerBottomSheet(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.n.h(context, "context");
    }

    private final AnimatorSet o0(boolean z9, float f10) {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f18845c0, this.f18851U, f10);
        ClockPickerPage clockPickerPage = this.f18847Q;
        if (clockPickerPage == null) {
            kotlin.jvm.internal.n.r("clockPickerPage");
            clockPickerPage = null;
        }
        animatorSet.playTogether(objectAnimatorOfFloat, clockPickerPage.f(z9));
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(this.f18849S);
        animatorSet.addListener(new c());
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S1.a p0(ClockPickerBottomSheet clockPickerBottomSheet) {
        InterfaceC0769a interfaceC0769a = clockPickerBottomSheet.f18848R;
        if (interfaceC0769a == null) {
            kotlin.jvm.internal.n.r("bottomSheetCallback");
            interfaceC0769a = null;
        }
        return interfaceC0769a.getClockViewFactory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J7.i q0(ClockPickerBottomSheet clockPickerBottomSheet) {
        InterfaceC0769a interfaceC0769a = clockPickerBottomSheet.f18848R;
        if (interfaceC0769a == null) {
            kotlin.jvm.internal.n.r("bottomSheetCallback");
            interfaceC0769a = null;
        }
        return interfaceC0769a.getLockScreenViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s0(float f10, float f11) {
        super.setTranslationShift(f11);
        this.f18851U = f10;
        ViewGroup viewGroup = this.f15736u;
        viewGroup.setTranslationY(viewGroup.getTranslationY() + this.f18851U);
    }

    @Override // com.android.launcher3.AbstractC1219a
    protected void I(boolean z9) {
        S(z9, this.f18846P.f15545N);
    }

    @Override // com.android.launcher3.AbstractC1219a
    protected boolean J(int i10) {
        return (i10 & 8) != 0;
    }

    @Override // p248y7.InterfaceC2016s
    public S1.a getClockViewFactory() {
        return (S1.a) this.f18854a0.getValue();
    }

    @Override // p248y7.InterfaceC2016s
    public J7.i getLockScreenViewModel() {
        return (J7.i) this.f18853W.getValue();
    }

    @Override // com.android.launcher3.views.e, F2.w
    public boolean k(MotionEvent ev) {
        kotlin.jvm.internal.n.h(ev, "ev");
        if (ev.getAction() == 0) {
            InterfaceC0769a interfaceC0769a = this.f18848R;
            if (interfaceC0769a == null) {
                kotlin.jvm.internal.n.r("bottomSheetCallback");
                interfaceC0769a = null;
            }
            View clockView = interfaceC0769a.l().getClockView();
            if (clockView != null) {
                this.f15723D = getPopupContainer().n(clockView, ev);
            }
        }
        return super.k(ev);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Animator animator = this.f18852V;
        if (animator != null) {
            animator.cancel();
        }
        this.f18852V = null;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f15736u = (ViewGroup) findViewById(R.id.container);
        Drawable drawable = getContext().getDrawable(R.drawable.bottom_sheet_bg);
        if (drawable != null) {
            Z(drawable, this.f15736u);
        }
        this.f18847Q = (ClockPickerPage) requireViewById(R.id.clock_picker);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        int i14 = i13 - i11;
        int measuredWidth = this.f15736u.getMeasuredWidth();
        int i15 = ((i12 - i10) - measuredWidth) / 2;
        ViewGroup viewGroup = this.f15736u;
        viewGroup.layout(i15, i14 - viewGroup.getMeasuredHeight(), measuredWidth + i15, i14);
        if (this.f18850T == 0.0f) {
            ClockPickerPage clockPickerPage = this.f18847Q;
            if (clockPickerPage == null) {
                kotlin.jvm.internal.n.r("clockPickerPage");
                clockPickerPage = null;
            }
            float dynamicFontHeight = clockPickerPage.getDynamicFontHeight();
            this.f18850T = dynamicFontHeight;
            this.f18851U = dynamicFontHeight;
        }
        setTranslationShift(this.f15741z);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        measureChildWithMargins(this.f15736u, i10, 0, i11, p239x8.a.b(this.f18846P.f15550S));
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
    }

    @Override // p248y7.InterfaceC2016s
    public void q(boolean z9, boolean z10) {
        float f10 = this.f18850T;
        if (f10 == 0.0f) {
            if (!isLaidOut() || isLayoutRequested()) {
                addOnLayoutChangeListener(new d(z9));
                return;
            } else {
                q(z9, false);
                return;
            }
        }
        if (z9) {
            f10 = 0.0f;
        }
        if (this.f18851U == f10) {
            return;
        }
        Animator animator = this.f18852V;
        if (animator != null) {
            animator.cancel();
        }
        if (!z10) {
            this.f18851U = f10;
            setTranslationShift(this.f15741z);
        } else {
            AnimatorSet animatorSetO0 = o0(z9, f10);
            animatorSetO0.start();
            this.f18852V = animatorSetO0;
        }
    }

    public final void r0(boolean z9) {
        if (z9) {
            b0().m();
        } else {
            setTranslationShift(0.0f);
            post(new Runnable() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f19129q.A();
                }
            });
        }
    }

    @Override // com.android.launcher3.views.e
    protected void setTranslationShift(float f10) {
        super.setTranslationShift(f10);
        ViewGroup viewGroup = this.f15736u;
        viewGroup.setTranslationY(viewGroup.getTranslationY() + this.f18851U);
        float fG = this.f18846P.g();
        float fMin = Math.min(1 - this.f15741z, fG) / fG;
        InterfaceC0769a interfaceC0769a = this.f18848R;
        if (interfaceC0769a == null) {
            kotlin.jvm.internal.n.r("bottomSheetCallback");
            interfaceC0769a = null;
        }
        interfaceC0769a.L(fMin);
    }

    @Override // p248y7.InterfaceC2016s
    public void x() {
        onBackInvoked();
    }

    public /* synthetic */ ClockPickerBottomSheet(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC1457h abstractC1457h) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClockPickerBottomSheet(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.n.h(context, "context");
        this.f18846P = ((p248y7.u) this.f15733r).K();
        this.f18849S = new PathInterpolator(0.0f, 0.4f, 0.4f, 1.0f);
        this.f18853W = p079h8.i.b(new p219v8.a() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.v
            @Override // p219v8.a
            public final Object invoke() {
                return ClockPickerBottomSheet.q0(this.f19127q);
            }
        });
        this.f18854a0 = p079h8.i.b(new p219v8.a() { // from class: com.nothing.wallpaper.picker.lockscreen.ui.view.w
            @Override // p219v8.a
            public final Object invoke() {
                return ClockPickerBottomSheet.p0(this.f19128q);
            }
        });
    }
}
