package com.nothing.cardwidget.battery.view;

import android.animation.Animator;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.nothing.cardwidget.R;
import com.nothing.cardwidget.RemoteServiceView;
import com.nothing.cardwidget.battery.AttributeHelper;
import com.nothing.cardwidget.battery.BatteryStateManager;
import com.nothing.cardwidget.mediaplayer.utils.DisplayUtil;
import com.nothing.cardwidget.util.UiUtil;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.o;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
public final class BatterySmallContainerView extends RemoteServiceView {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "SmallContainerView";
    private final p079h8.h animEnter$delegate;
    private RelativeLayout aodPermissionContainer;
    private ImageView aodPermissionIv;
    private final p079h8.h attributeHelper$delegate;
    private RelativeLayout batteryContainer;
    private ImageView batteryPermissionIv;
    private TextView batteryPermissionTv;
    private BatteryCellView batteryView;
    private Consumer<o> iconClickConsumer;
    private M5.a lastInfo;
    private View.OnClickListener permissionClickListener;
    private RelativeLayout permissionContainer;
    private Integer widgetId;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1457h abstractC1457h) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BatterySmallContainerView(Context context) {
        this(context, null, 0, 0, 14, null);
        n.h(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Animator animEnter_delegate$lambda$1(BatterySmallContainerView this$0) {
        Animator animatorClone;
        n.h(this$0, "this$0");
        Animator animBatteryEnter = this$0.getAttributeHelper().getAnimBatteryEnter();
        if (animBatteryEnter == null || (animatorClone = animBatteryEnter.clone()) == null) {
            return null;
        }
        animatorClone.setTarget(this$0.batteryView);
        return animatorClone;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AttributeHelper attributeHelper_delegate$lambda$2() {
        return new AttributeHelper();
    }

    private final void crossFadeAnimation(BatteryCellView batteryCellView, M5.a aVar, M5.a aVar2) {
        if (n.d(getAttributeHelper().isAod(), Boolean.TRUE)) {
            batteryCellView.setBatteryInfo(aVar2);
            return;
        }
        if (n.d(aVar != null ? aVar.a() : null, aVar2 != null ? aVar2.a() : null) || aVar == null) {
            batteryCellView.setBatteryInfo(aVar2);
        } else {
            batteryCellView.setBatteryInfo(aVar2);
            Animator animEnter = getAnimEnter();
            if (animEnter != null) {
                animEnter.start();
            }
        }
        this.lastInfo = aVar2;
    }

    private final Animator getAnimEnter() {
        return (Animator) this.animEnter$delegate.getValue();
    }

    private final AttributeHelper getAttributeHelper() {
        return (AttributeHelper) this.attributeHelper$delegate.getValue();
    }

    private final void initView(View view) {
        this.batteryContainer = (RelativeLayout) view.findViewById(R.id.battery_container);
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.layout_battery_permission);
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.nothing.cardwidget.battery.view.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BatterySmallContainerView.initView$lambda$5$lambda$4(this.f18033q, view2);
            }
        });
        this.permissionContainer = relativeLayout;
        this.aodPermissionContainer = (RelativeLayout) view.findViewById(R.id.layout_battery_aod_permission);
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_battery_permission);
        ImageView imageView2 = null;
        if (imageView != null) {
            imageView.setBackground(getAttributeHelper().getPermissionBgDrawable());
        } else {
            imageView = null;
        }
        this.batteryPermissionIv = imageView;
        ImageView imageView3 = (ImageView) view.findViewById(R.id.iv_battery_aod_permission);
        if (imageView3 != null) {
            imageView3.setImageDrawable(getAttributeHelper().getAodPermissionDrawable());
            imageView2 = imageView3;
        }
        this.aodPermissionIv = imageView2;
        BatteryCellView batteryCellView = (BatteryCellView) view.findViewById(R.id.battery_small_view);
        batteryCellView.setAttributeHelper(getAttributeHelper());
        this.batteryView = batteryCellView;
        TextView textView = (TextView) view.findViewById(R.id.tv_battery_permission);
        String permissionStr = getAttributeHelper().getPermissionStr();
        if (permissionStr != null) {
            textView.setText(permissionStr);
        }
        Integer permissionTvColor = getAttributeHelper().getPermissionTvColor();
        if (permissionTvColor != null) {
            textView.setTextColor(permissionTvColor.intValue());
        }
        this.batteryPermissionTv = textView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$5$lambda$4(BatterySmallContainerView this$0, View view) {
        n.h(this$0, "this$0");
        View.OnClickListener onClickListener = this$0.permissionClickListener;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    private final void setBatteryClickListener(final String str) {
        RelativeLayout relativeLayout = this.batteryContainer;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.nothing.cardwidget.battery.view.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BatterySmallContainerView.setBatteryClickListener$lambda$18(this.f18035q, str, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setBatteryClickListener$lambda$18(BatterySmallContainerView this$0, String address, View view) {
        n.h(this$0, "this$0");
        n.h(address, "$address");
        view.setTag(this$0.widgetId);
        Consumer<o> consumer = this$0.iconClickConsumer;
        if (consumer != null) {
            consumer.accept(new o(view, address));
        }
    }

    private final void showBatteryUI() {
        RelativeLayout relativeLayout = this.permissionContainer;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(4);
        }
        RelativeLayout relativeLayout2 = this.aodPermissionContainer;
        if (relativeLayout2 != null) {
            relativeLayout2.setVisibility(4);
        }
        BatteryCellView batteryCellView = this.batteryView;
        if (batteryCellView != null) {
            batteryCellView.setVisibility(0);
        }
    }

    private final void showPermissionUI() {
        BatteryCellView batteryCellView = this.batteryView;
        if (batteryCellView != null) {
            batteryCellView.setVisibility(4);
        }
        if (n.d(getAttributeHelper().isAod(), Boolean.TRUE)) {
            RelativeLayout relativeLayout = this.permissionContainer;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(4);
            }
            RelativeLayout relativeLayout2 = this.aodPermissionContainer;
            if (relativeLayout2 != null) {
                relativeLayout2.setVisibility(0);
                return;
            }
            return;
        }
        RelativeLayout relativeLayout3 = this.aodPermissionContainer;
        if (relativeLayout3 != null) {
            relativeLayout3.setVisibility(4);
        }
        RelativeLayout relativeLayout4 = this.permissionContainer;
        if (relativeLayout4 != null) {
            relativeLayout4.setVisibility(0);
        }
    }

    @Override // com.nothing.cardwidget.RemoteServiceView
    public void onDataChanged(Bundle data) {
        n.h(data, "data");
    }

    public final void setBatteryInfo(ArrayList<M5.a> batteryInfoList) {
        M5.a aVar;
        n.h(batteryInfoList, "batteryInfoList");
        if (batteryInfoList.size() > 1) {
            final Comparator comparator = new Comparator() { // from class: com.nothing.cardwidget.battery.view.BatterySmallContainerView$setBatteryInfo$$inlined$compareByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t9, T t10) {
                    return p109k8.a.d(Boolean.valueOf(!n.d(((M5.a) t10).h(), "PHONE")), Boolean.valueOf(!n.d(((M5.a) t9).h(), "PHONE")));
                }
            };
            final Comparator comparator2 = new Comparator() { // from class: com.nothing.cardwidget.battery.view.BatterySmallContainerView$setBatteryInfo$$inlined$thenByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t9, T t10) {
                    int iCompare = comparator.compare(t9, t10);
                    return iCompare != 0 ? iCompare : p109k8.a.d(Boolean.valueOf(((M5.a) t10).o()), Boolean.valueOf(((M5.a) t9).o()));
                }
            };
            List listM0 = AbstractC1444s.m0(batteryInfoList, new Comparator() { // from class: com.nothing.cardwidget.battery.view.BatterySmallContainerView$setBatteryInfo$$inlined$thenByDescending$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t9, T t10) {
                    int iCompare = comparator2.compare(t9, t10);
                    return iCompare != 0 ? iCompare : p109k8.a.d(Long.valueOf(((M5.a) t10).f()), Long.valueOf(((M5.a) t9).f()));
                }
            });
            ArrayList arrayList = new ArrayList(AbstractC1444s.u(listM0, 10));
            Iterator it = listM0.iterator();
            while (it.hasNext()) {
                arrayList.add(BatteryStateManager.INSTANCE.earProductsOnCombine((M5.a) it.next()));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((M5.a) obj).l() != -1) {
                    arrayList2.add(obj);
                }
            }
            aVar = (M5.a) AbstractC1444s.S(arrayList2);
        } else {
            aVar = (M5.a) AbstractC1444s.S(batteryInfoList);
        }
        BatteryCellView batteryCellView = this.batteryView;
        if (batteryCellView != null) {
            crossFadeAnimation(batteryCellView, this.lastInfo, aVar);
        }
        setBatteryClickListener(aVar.a());
    }

    public final void setBatteryWidgetId(int i10) {
        this.widgetId = Integer.valueOf(i10);
    }

    public final void setClickEventConsumer(Consumer<o> c10) {
        n.h(c10, "c");
        this.iconClickConsumer = c10;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.permissionClickListener = onClickListener;
    }

    public final void setPermission(boolean z9) {
        if (z9) {
            showBatteryUI();
        } else {
            showPermissionUI();
        }
    }

    public final void setSmallBatteryDisplayRatio(float f10) {
        ImageView imageView = this.batteryPermissionIv;
        n.e(imageView);
        UiUtil uiUtil = UiUtil.INSTANCE;
        Context context = imageView.getContext();
        n.g(context, "getContext(...)");
        int iB = p239x8.a.b(uiUtil.dp2px(context, 18) * f10);
        Context context2 = imageView.getContext();
        n.g(context2, "getContext(...)");
        DisplayUtil.INSTANCE.setViewSize(imageView, Integer.valueOf(iB), Integer.valueOf(p239x8.a.b(uiUtil.dp2px(context2, 32) * f10)));
        BatteryCellView batteryCellView = this.batteryView;
        if (batteryCellView != null) {
            batteryCellView.updateRatio(f10);
        }
        TextView textView = this.batteryPermissionTv;
        if (textView != null) {
            textView.setTextSize(0, f10 * 51.0f);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BatterySmallContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        n.h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BatterySmallContainerView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0, 8, null);
        n.h(context, "context");
    }

    public /* synthetic */ BatterySmallContainerView(Context context, AttributeSet attributeSet, int i10, int i11, int i12, AbstractC1457h abstractC1457h) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BatterySmallContainerView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        n.h(context, "context");
        this.animEnter$delegate = p079h8.i.b(new p219v8.a() { // from class: com.nothing.cardwidget.battery.view.k
            @Override // p219v8.a
            public final Object invoke() {
                return BatterySmallContainerView.animEnter_delegate$lambda$1(this.f18034q);
            }
        });
        this.attributeHelper$delegate = p079h8.i.b(new p219v8.a() { // from class: com.nothing.cardwidget.battery.view.l
            @Override // p219v8.a
            public final Object invoke() {
                return BatterySmallContainerView.attributeHelper_delegate$lambda$2();
            }
        });
        getAttributeHelper().getRemoteResource(attributeSet, context);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.battery_small_container, (ViewGroup) this, false);
        addView(viewInflate);
        n.e(viewInflate);
        initView(viewInflate);
    }
}
