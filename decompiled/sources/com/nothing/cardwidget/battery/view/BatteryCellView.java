package com.nothing.cardwidget.battery.view;

import F8.AbstractC0816i;
import F8.InterfaceC0846x0;
import F8.L;
import I8.AbstractC0882h;
import I8.G;
import I8.InterfaceC0880f;
import I8.z;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.nothing.cardwidget.R;
import com.nothing.cardwidget.battery.AttributeHelper;
import com.nothing.cardwidget.battery.BatteryConfig;
import com.nothing.cardwidget.mediaplayer.utils.DisplayUtil;
import com.nothing.cardwidget.util.UiUtil;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.r;
import p219v8.p;

/* JADX INFO: loaded from: classes2.dex */
public final class BatteryCellView extends FrameLayout {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "BatteryCellView";
    private final p079h8.h animDeviceEnter$delegate;
    private final p079h8.h animDeviceExit$delegate;
    private final p079h8.h animIndicatorEnter$delegate;
    private final p079h8.h animIndicatorExit$delegate;
    private AttributeHelper attrsHelper;
    private RelativeLayout batteryCellNormalView;
    private ImageView batteryDeviceIv;
    private ImageView batteryIndicatorIv;
    private ImageView batteryLevelIv;
    private RelativeLayout batteryView;
    private InterfaceC0846x0 emitJob;
    private z indicatorUpdateFilter;
    private InterfaceC0846x0 indicatorUpdateJob;
    private M5.a lastBatteryInfo;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1457h abstractC1457h) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.nothing.cardwidget.battery.view.BatteryCellView$initIndicatorUpdateJob$1, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.nothing.cardwidget.battery.view.BatteryCellView$initIndicatorUpdateJob$1", f = "BatteryCellView.kt", l = {142}, m = "invokeSuspend")
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements p {
        int label;

        /* JADX INFO: renamed from: com.nothing.cardwidget.battery.view.BatteryCellView$initIndicatorUpdateJob$1$1, reason: invalid class name and collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "com.nothing.cardwidget.battery.view.BatteryCellView$initIndicatorUpdateJob$1$1", f = "BatteryCellView.kt", l = {}, m = "invokeSuspend")
        static final class C04781 extends kotlin.coroutines.jvm.internal.l implements p {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ BatteryCellView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C04781(BatteryCellView batteryCellView, p129m8.e<? super C04781> eVar) {
                super(2, eVar);
                this.this$0 = batteryCellView;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e<A> create(Object obj, p129m8.e<?> eVar) {
                C04781 c04781 = new C04781(this.this$0, eVar);
                c04781.L$0 = obj;
                return c04781;
            }

            @Override // p219v8.p
            public final Object invoke(M5.a aVar, p129m8.e<? super A> eVar) {
                return ((C04781) create(aVar, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                M5.a aVar = (M5.a) this.L$0;
                ImageView imageView = this.this$0.batteryIndicatorIv;
                if (imageView != null) {
                    this.this$0.setBatteryIndicator(imageView, aVar);
                }
                return A.f21846a;
            }
        }

        AnonymousClass1(p129m8.e<? super AnonymousClass1> eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e<A> create(Object obj, p129m8.e<?> eVar) {
            return BatteryCellView.this.new AnonymousClass1(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e<? super A> eVar) {
            return ((AnonymousClass1) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.label;
            if (i10 == 0) {
                r.b(obj);
                InterfaceC0880f interfaceC0880fN = AbstractC0882h.n(BatteryCellView.this.indicatorUpdateFilter, 800L);
                C04781 c04781 = new C04781(BatteryCellView.this, null);
                this.label = 1;
                if (AbstractC0882h.i(interfaceC0880fN, c04781, this) == objE) {
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

    /* JADX INFO: renamed from: com.nothing.cardwidget.battery.view.BatteryCellView$updateUI$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.coroutines.jvm.internal.f(c = "com.nothing.cardwidget.battery.view.BatteryCellView$updateUI$1", f = "BatteryCellView.kt", l = {135}, m = "invokeSuspend")
    static final class C12351 extends kotlin.coroutines.jvm.internal.l implements p {
        final /* synthetic */ M5.a $batteryInfo;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12351(M5.a aVar, p129m8.e<? super C12351> eVar) {
            super(2, eVar);
            this.$batteryInfo = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e<A> create(Object obj, p129m8.e<?> eVar) {
            return BatteryCellView.this.new C12351(this.$batteryInfo, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e<? super A> eVar) {
            return ((C12351) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.label;
            if (i10 == 0) {
                r.b(obj);
                z zVar = BatteryCellView.this.indicatorUpdateFilter;
                M5.a aVar = this.$batteryInfo;
                this.label = 1;
                if (zVar.b(aVar, this) == objE) {
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BatteryCellView(Context context) {
        this(context, null, 0, 0, 14, null);
        n.h(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Animator animDeviceEnter_delegate$lambda$3(BatteryCellView this$0) {
        Animator animDeviceEnter;
        Animator animatorClone;
        n.h(this$0, "this$0");
        AttributeHelper attributeHelper = this$0.attrsHelper;
        if (attributeHelper == null || (animDeviceEnter = attributeHelper.getAnimDeviceEnter()) == null || (animatorClone = animDeviceEnter.clone()) == null) {
            return null;
        }
        animatorClone.setTarget(this$0.batteryDeviceIv);
        return animatorClone;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Animator animDeviceExit_delegate$lambda$7(BatteryCellView this$0) {
        Animator animDeviceExit;
        Animator animatorClone;
        n.h(this$0, "this$0");
        AttributeHelper attributeHelper = this$0.attrsHelper;
        if (attributeHelper == null || (animDeviceExit = attributeHelper.getAnimDeviceExit()) == null || (animatorClone = animDeviceExit.clone()) == null) {
            return null;
        }
        animatorClone.setTarget(this$0.batteryDeviceIv);
        return animatorClone;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Animator animIndicatorEnter_delegate$lambda$1(BatteryCellView this$0) {
        Animator animChargingEnter;
        Animator animatorClone;
        n.h(this$0, "this$0");
        AttributeHelper attributeHelper = this$0.attrsHelper;
        if (attributeHelper == null || (animChargingEnter = attributeHelper.getAnimChargingEnter()) == null || (animatorClone = animChargingEnter.clone()) == null) {
            return null;
        }
        animatorClone.setTarget(this$0.batteryIndicatorIv);
        return animatorClone;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Animator animIndicatorExit_delegate$lambda$5(BatteryCellView this$0) {
        Animator animChargingExit;
        Animator animatorClone;
        n.h(this$0, "this$0");
        AttributeHelper attributeHelper = this$0.attrsHelper;
        if (attributeHelper == null || (animChargingExit = attributeHelper.getAnimChargingExit()) == null || (animatorClone = animChargingExit.clone()) == null) {
            return null;
        }
        animatorClone.setTarget(this$0.batteryIndicatorIv);
        return animatorClone;
    }

    private final void cancelAnimator(Animator animator) {
        if (animator == null || !animator.isRunning()) {
            return;
        }
        animator.cancel();
    }

    private final Animator getAnimDeviceEnter() {
        return (Animator) this.animDeviceEnter$delegate.getValue();
    }

    private final Animator getAnimDeviceExit() {
        return (Animator) this.animDeviceExit$delegate.getValue();
    }

    private final Animator getAnimIndicatorEnter() {
        return (Animator) this.animIndicatorEnter$delegate.getValue();
    }

    private final Animator getAnimIndicatorExit() {
        return (Animator) this.animIndicatorExit$delegate.getValue();
    }

    private final void hideView() {
        RelativeLayout relativeLayout = this.batteryView;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
    }

    private final void initIndicatorUpdateJob() {
        InterfaceC0846x0 interfaceC0846x0 = this.indicatorUpdateJob;
        if (interfaceC0846x0 != null) {
            InterfaceC0846x0.a.a(interfaceC0846x0, null, 1, null);
        }
        this.indicatorUpdateJob = AbstractC0816i.d(O5.g.k(), null, null, new AnonymousClass1(null), 3, null);
    }

    private final void initView(View view) {
        this.batteryView = (RelativeLayout) view.findViewById(R.id.battery_view);
        this.batteryCellNormalView = (RelativeLayout) view.findViewById(R.id.rv_battery_cell);
        this.batteryLevelIv = (ImageView) view.findViewById(R.id.iv_battery_level);
        this.batteryDeviceIv = (ImageView) view.findViewById(R.id.iv_battery_device);
        this.batteryIndicatorIv = (ImageView) view.findViewById(R.id.iv_battery_indicator);
    }

    private final String obtainDescByBatteryStatus(String str) {
        if (str == null) {
            return "";
        }
        int iHashCode = str.hashCode();
        if (iHashCode == -2076224911) {
            if (!str.equals("CHARGING")) {
                return "";
            }
            String string = getContext().getResources().getString(R.string.text_charging);
            n.g(string, "getString(...)");
            return string;
        }
        if (iHashCode == 75572) {
            if (!str.equals("LOW")) {
                return "";
            }
            String string2 = getContext().getResources().getString(R.string.text_low_battery);
            n.g(string2, "getString(...)");
            return string2;
        }
        if (iHashCode != 955558039 || !str.equals("POWER_SAVE")) {
            return "";
        }
        String string3 = getContext().getResources().getString(R.string.text_power_saving_mode);
        n.g(string3, "getString(...)");
        return string3;
    }

    private final Drawable parseIndicator(M5.a aVar) {
        AttributeHelper attributeHelper;
        String strB = aVar.b();
        if (n.d(strB, "CHARGING")) {
            AttributeHelper attributeHelper2 = this.attrsHelper;
            if (attributeHelper2 != null) {
                return attributeHelper2.getChargingDrawable();
            }
            return null;
        }
        if (!n.d(strB, "POWER_SAVE") || (attributeHelper = this.attrsHelper) == null) {
            return null;
        }
        return attributeHelper.getPowerSaveDrawable();
    }

    private final Integer parseProgressbarColor(M5.a aVar) {
        Integer normalLevelColor;
        if (BatteryConfig.INSTANCE.isLowBattery(aVar)) {
            AttributeHelper attributeHelper = this.attrsHelper;
            if (attributeHelper != null) {
                return attributeHelper.getLowBatteryLevelColor();
            }
            return null;
        }
        AttributeHelper attributeHelper2 = this.attrsHelper;
        if (attributeHelper2 == null || (normalLevelColor = attributeHelper2.getNormalLevelColor()) == null) {
            return null;
        }
        AttributeHelper attributeHelper3 = this.attrsHelper;
        if (attributeHelper3 != null ? n.d(attributeHelper3.isAod(), Boolean.FALSE) : false) {
            UiUtil uiUtil = UiUtil.INSTANCE;
            Context context = getContext();
            n.g(context, "getContext(...)");
            if (!uiUtil.isDarkTheme(context)) {
                int color = getContext().getColor(android.R.color.system_neutral1_200);
                Color.argb(p239x8.a.a(102.0d), Color.red(color), Color.green(color), Color.blue(color));
            }
        }
        return normalLevelColor;
    }

    private final void setAodBatteryIndicator(ImageView imageView, M5.a aVar) {
        Drawable indicator = parseIndicator(aVar);
        if (indicator == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            imageView.setImageDrawable(indicator);
        }
    }

    private final void setBatteryDeviceIcon(ImageView imageView, M5.a aVar) {
        Boolean boolIsAod;
        BatteryConfig batteryConfig = BatteryConfig.INSTANCE;
        Context context = imageView.getContext();
        n.g(context, "getContext(...)");
        AttributeHelper attributeHelper = this.attrsHelper;
        imageView.setImageDrawable(batteryConfig.getDeviceIcon(aVar, context, (attributeHelper == null || (boolIsAod = attributeHelper.isAod()) == null) ? false : boolIsAod.booleanValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x0046  */
    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    /* JADX WARN: Code duplicated, block: B:22:0x0058  */
    public final void setBatteryIndicator(final ImageView imageView, M5.a aVar) {
        ImageView imageView2;
        Object objValueOf;
        final Drawable indicator = parseIndicator(aVar);
        if (indicator != null) {
            if (imageView.getVisibility() == 0) {
                imageView.setVisibility(0);
                imageView.setImageDrawable(indicator);
                imageView2 = this.batteryDeviceIv;
                if (imageView2 != null) {
                    imageView2.setTranslationY(-22.0f);
                    objValueOf = A.f21846a;
                } else {
                    objValueOf = null;
                }
            } else {
                AttributeHelper attributeHelper = this.attrsHelper;
                if (attributeHelper != null ? n.d(attributeHelper.isAod(), Boolean.TRUE) : false) {
                    imageView.setVisibility(0);
                    imageView.setImageDrawable(indicator);
                    imageView2 = this.batteryDeviceIv;
                    if (imageView2 != null) {
                        imageView2.setTranslationY(-22.0f);
                        objValueOf = A.f21846a;
                    } else {
                        objValueOf = null;
                    }
                } else {
                    Animator animIndicatorEnter = getAnimIndicatorEnter();
                    if (animIndicatorEnter != null) {
                        animIndicatorEnter.removeAllListeners();
                    }
                    Animator animIndicatorEnter2 = getAnimIndicatorEnter();
                    if (animIndicatorEnter2 != null) {
                        animIndicatorEnter2.addListener(new AnimatorListenerAdapter() { // from class: com.nothing.cardwidget.battery.view.BatteryCellView$setBatteryIndicator$1$1$1
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationEnd(Animator animation) {
                                n.h(animation, "animation");
                                ImageView imageView3 = this.this$0.batteryIndicatorIv;
                                if (imageView3 != null) {
                                    imageView3.setVisibility(0);
                                }
                                ImageView imageView4 = this.this$0.batteryDeviceIv;
                                if (imageView4 != null) {
                                    imageView4.setTranslationY(-22.0f);
                                }
                            }

                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationStart(Animator animation) {
                                n.h(animation, "animation");
                                ImageView imageView3 = this.this$0.batteryIndicatorIv;
                                if (imageView3 != null) {
                                    imageView3.setVisibility(0);
                                }
                            }
                        });
                    }
                    objValueOf = Boolean.valueOf(imageView.post(new Runnable() { // from class: com.nothing.cardwidget.battery.view.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            BatteryCellView.setBatteryIndicator$lambda$25$lambda$22$lambda$21(this.f18022q, indicator);
                        }
                    }));
                }
            }
            if (objValueOf != null) {
                return;
            }
        }
        if (imageView.getVisibility() == 0) {
            M5.a aVar2 = this.lastBatteryInfo;
            if (n.d(aVar2 != null ? aVar2.i() : null, aVar.i())) {
                AttributeHelper attributeHelper2 = this.attrsHelper;
                if (attributeHelper2 != null ? n.d(attributeHelper2.isAod(), Boolean.FALSE) : false) {
                    Animator animIndicatorExit = getAnimIndicatorExit();
                    if (animIndicatorExit != null) {
                        animIndicatorExit.removeAllListeners();
                    }
                    Animator animIndicatorExit2 = getAnimIndicatorExit();
                    if (animIndicatorExit2 != null) {
                        animIndicatorExit2.addListener(new AnimatorListenerAdapter() { // from class: com.nothing.cardwidget.battery.view.BatteryCellView$setBatteryIndicator$1$2$1
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationEnd(Animator animation) {
                                n.h(animation, "animation");
                                imageView.setVisibility(4);
                                ImageView imageView3 = this.batteryDeviceIv;
                                if (imageView3 != null) {
                                    imageView3.setTranslationY(0.0f);
                                }
                            }
                        });
                    }
                    imageView.post(new Runnable() { // from class: com.nothing.cardwidget.battery.view.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            BatteryCellView.setBatteryIndicator$lambda$25$lambda$24$lambda$23(this.f18024q);
                        }
                    });
                    return;
                }
            }
        }
        imageView.setVisibility(4);
        ImageView imageView3 = this.batteryDeviceIv;
        if (imageView3 != null) {
            imageView3.setTranslationY(0.0f);
            A a10 = A.f21846a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setBatteryIndicator$lambda$25$lambda$22$lambda$21(BatteryCellView this$0, Drawable drawable) {
        n.h(this$0, "this$0");
        this$0.cancelAnimator(this$0.getAnimIndicatorExit());
        this$0.cancelAnimator(this$0.getAnimDeviceExit());
        Animator animIndicatorEnter = this$0.getAnimIndicatorEnter();
        if (animIndicatorEnter != null) {
            animIndicatorEnter.start();
        }
        Animator animDeviceEnter = this$0.getAnimDeviceEnter();
        if (animDeviceEnter != null) {
            animDeviceEnter.start();
        }
        ImageView imageView = this$0.batteryIndicatorIv;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setBatteryIndicator$lambda$25$lambda$24$lambda$23(BatteryCellView this$0) {
        n.h(this$0, "this$0");
        this$0.cancelAnimator(this$0.getAnimIndicatorEnter());
        this$0.cancelAnimator(this$0.getAnimDeviceEnter());
        Animator animIndicatorExit = this$0.getAnimIndicatorExit();
        if (animIndicatorExit != null) {
            animIndicatorExit.start();
        }
        Animator animDeviceExit = this$0.getAnimDeviceExit();
        if (animDeviceExit != null) {
            animDeviceExit.start();
        }
    }

    private final void setBatteryLevel(ImageView imageView, M5.a aVar) {
        AttributeHelper attributeHelper = this.attrsHelper;
        boolean zD = attributeHelper != null ? n.d(attributeHelper.isAod(), Boolean.TRUE) : false;
        if (!zD) {
            if (zD) {
                throw new p079h8.m();
            }
            Drawable drawable = imageView.getDrawable();
            BatteryLevelDrawable batteryLevelDrawable = drawable instanceof BatteryLevelDrawable ? (BatteryLevelDrawable) drawable : null;
            if (batteryLevelDrawable != null) {
                Integer progressbarColor = parseProgressbarColor(aVar);
                if (progressbarColor != null) {
                    batteryLevelDrawable.setColor(progressbarColor.intValue());
                }
                batteryLevelDrawable.setBatteryLevel(aVar.l());
                return;
            }
            BatteryLevelDrawable batteryLevelDrawable2 = new BatteryLevelDrawable();
            Integer progressbarColor2 = parseProgressbarColor(aVar);
            if (progressbarColor2 != null) {
                batteryLevelDrawable2.setColor(progressbarColor2.intValue());
            }
            batteryLevelDrawable2.setBatteryLevel(aVar.l());
            imageView.setImageDrawable(batteryLevelDrawable2);
            return;
        }
        Drawable drawable2 = imageView.getDrawable();
        BatteryAODLevelDrawable batteryAODLevelDrawable = drawable2 instanceof BatteryAODLevelDrawable ? (BatteryAODLevelDrawable) drawable2 : null;
        if (batteryAODLevelDrawable != null) {
            Integer progressbarColor3 = parseProgressbarColor(aVar);
            if (progressbarColor3 != null) {
                batteryAODLevelDrawable.setColor(progressbarColor3.intValue());
            }
            batteryAODLevelDrawable.setBatteryLevel(aVar.l());
            return;
        }
        BatteryAODLevelDrawable batteryAODLevelDrawable2 = new BatteryAODLevelDrawable();
        Integer progressbarColor4 = parseProgressbarColor(aVar);
        if (progressbarColor4 != null) {
            batteryAODLevelDrawable2.setColor(progressbarColor4.intValue());
        }
        DisplayMetrics displayMetrics = imageView.getResources().getDisplayMetrics();
        n.g(displayMetrics, "getDisplayMetrics(...)");
        batteryAODLevelDrawable2.setBorderWidth(1.0f, displayMetrics);
        batteryAODLevelDrawable2.setBatteryLevel(aVar.l());
        imageView.setImageDrawable(batteryAODLevelDrawable2);
    }

    private final void showView() {
        RelativeLayout relativeLayout = this.batteryView;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
    }

    private final void updateUI(M5.a aVar) {
        RelativeLayout relativeLayout = this.batteryCellNormalView;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        ImageView imageView = this.batteryLevelIv;
        if (imageView != null) {
            setBatteryLevel(imageView, aVar);
        }
        ImageView imageView2 = this.batteryDeviceIv;
        if (imageView2 != null) {
            setBatteryDeviceIcon(imageView2, aVar);
        }
        InterfaceC0846x0 interfaceC0846x0 = this.emitJob;
        if (interfaceC0846x0 != null) {
            InterfaceC0846x0.a.a(interfaceC0846x0, null, 1, null);
        }
        this.emitJob = AbstractC0816i.d(O5.g.j(), null, null, new C12351(aVar, null), 3, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        initIndicatorUpdateJob();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0846x0 interfaceC0846x0 = this.emitJob;
        if (interfaceC0846x0 != null) {
            InterfaceC0846x0.a.a(interfaceC0846x0, null, 1, null);
        }
        InterfaceC0846x0 interfaceC0846x1 = this.indicatorUpdateJob;
        if (interfaceC0846x1 != null) {
            InterfaceC0846x0.a.a(interfaceC0846x1, null, 1, null);
        }
    }

    public final void setAttributeHelper(AttributeHelper attributeHelper) {
        n.h(attributeHelper, "attributeHelper");
        this.attrsHelper = attributeHelper;
    }

    public final void setBatteryInfo(M5.a aVar) {
        if (aVar == null) {
            hideView();
        } else {
            showView();
            updateUI(aVar);
        }
        this.lastBatteryInfo = aVar;
        if (aVar != null) {
            int iL = aVar.l();
            Resources resources = getContext().getResources();
            int i10 = R.string.battery_content_desc;
            M5.a aVar2 = this.lastBatteryInfo;
            String strG = aVar2 != null ? aVar2.g() : null;
            String strValueOf = String.valueOf(iL);
            M5.a aVar3 = this.lastBatteryInfo;
            setContentDescription(resources.getString(i10, strG, strValueOf, obtainDescByBatteryStatus(aVar3 != null ? aVar3.b() : null)));
        }
    }

    public final void updateRatio(float f10) {
        UiUtil uiUtil = UiUtil.INSTANCE;
        Context context = getContext();
        n.g(context, "getContext(...)");
        int iB = p239x8.a.b(uiUtil.dp2px(context, 50) * f10);
        Context context2 = getContext();
        n.g(context2, "getContext(...)");
        int iB2 = p239x8.a.b(uiUtil.dp2px(context2, 30) * f10);
        Context context3 = getContext();
        n.g(context3, "getContext(...)");
        int iB3 = p239x8.a.b(uiUtil.dp2px(context3, 16) * f10);
        Context context4 = getContext();
        n.g(context4, "getContext(...)");
        int iB4 = p239x8.a.b(uiUtil.dp2px(context4, 48) * f10);
        ImageView imageView = this.batteryDeviceIv;
        n.e(imageView);
        DisplayUtil displayUtil = DisplayUtil.INSTANCE;
        displayUtil.setViewSize(imageView, Integer.valueOf(iB), Integer.valueOf(iB2));
        ImageView imageView2 = this.batteryIndicatorIv;
        n.e(imageView2);
        displayUtil.setViewSize(imageView2, Integer.valueOf(iB3), Integer.valueOf(iB3));
        displayUtil.setViewMargin(imageView2, DisplayUtil.MARGIN_TOP, iB4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BatteryCellView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        n.h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BatteryCellView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0, 8, null);
        n.h(context, "context");
    }

    public /* synthetic */ BatteryCellView(Context context, AttributeSet attributeSet, int i10, int i11, int i12, AbstractC1457h abstractC1457h) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BatteryCellView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        n.h(context, "context");
        this.indicatorUpdateFilter = G.b(1, 0, H8.a.DROP_OLDEST, 2, null);
        this.animIndicatorEnter$delegate = p079h8.i.b(new p219v8.a() { // from class: com.nothing.cardwidget.battery.view.c
            @Override // p219v8.a
            public final Object invoke() {
                return BatteryCellView.animIndicatorEnter_delegate$lambda$1(this.f18025q);
            }
        });
        this.animDeviceEnter$delegate = p079h8.i.b(new p219v8.a() { // from class: com.nothing.cardwidget.battery.view.d
            @Override // p219v8.a
            public final Object invoke() {
                return BatteryCellView.animDeviceEnter_delegate$lambda$3(this.f18026q);
            }
        });
        this.animIndicatorExit$delegate = p079h8.i.b(new p219v8.a() { // from class: com.nothing.cardwidget.battery.view.e
            @Override // p219v8.a
            public final Object invoke() {
                return BatteryCellView.animIndicatorExit_delegate$lambda$5(this.f18027q);
            }
        });
        this.animDeviceExit$delegate = p079h8.i.b(new p219v8.a() { // from class: com.nothing.cardwidget.battery.view.f
            @Override // p219v8.a
            public final Object invoke() {
                return BatteryCellView.animDeviceExit_delegate$lambda$7(this.f18028q);
            }
        });
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.battery_cell, (ViewGroup) this, false);
        addView(viewInflate);
        n.e(viewInflate);
        initView(viewInflate);
    }
}
