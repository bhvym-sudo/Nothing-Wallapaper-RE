package com.nothing.cardwidget.battery.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.nothing.cardwidget.R;
import com.nothing.cardwidget.RemoteServiceView;
import com.nothing.cardwidget.battery.AttributeHelper;
import com.nothing.cardwidget.battery.BatteryConfig;
import com.nothing.cardwidget.battery.BatteryStateManager;
import com.nothing.cardwidget.battery.timer.ITimerListener;
import com.nothing.cardwidget.battery.timer.TimerFactory;
import com.nothing.cardwidget.mediaplayer.utils.DisplayUtil;
import com.nothing.cardwidget.util.UiUtil;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.o;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
public final class BatteryContainerView extends RemoteServiceView implements ITimerListener {
    private final String TAG;
    private Animator animEnterBottomLeft;
    private Animator animEnterBottomRight;
    private Animator animEnterTopRight;
    private Animator animExitBottomLeft;
    private Animator animExitBottomRight;
    private Animator animExitTopRight;
    private final p079h8.h attributeHelper$delegate;
    private LinearLayout batteryContainer;
    private TextView batteryLevelTv;
    private TextView batteryPermissionTv;
    private BatteryCellView batteryViewBottomLeft;
    private M5.a batteryViewBottomLeftInfo;
    private BatteryCellView batteryViewBottomRight;
    private M5.a batteryViewBottomRightInfo;
    private BatteryCellView batteryViewTopLeft;
    private BatteryCellView batteryViewTopRight;
    private M5.a batteryViewTopRightInfo;
    private Consumer<o> clickListener;
    private View.OnClickListener permissionClickListener;
    private ArrayList<M5.a> tempList;
    private Integer widgetId;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BatteryConfig.BatteryState.values().length];
            try {
                iArr[BatteryConfig.BatteryState.INIT_IN_CASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BatteryConfig.BatteryState.OUT_OF_CASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BatteryConfig.BatteryState.OUT_OF_CASE_COUNTING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BatteryContainerView(Context context) {
        this(context, null, 0, 0, 14, null);
        n.h(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AttributeHelper attributeHelper_delegate$lambda$0() {
        return new AttributeHelper();
    }

    private final void clearOutDatedData(ArrayList<M5.a> arrayList) {
        ArrayList arrayList2 = new ArrayList(AbstractC1444s.u(arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(getBaseId(getUniqueId((M5.a) it.next())));
        }
        Set setW0 = AbstractC1444s.w0(arrayList2);
        Set<String> setKeySet = BatteryStateManager.INSTANCE.getBatteryStateInfo().keySet();
        n.g(setKeySet, "<get-keys>(...)");
        ArrayList<String> arrayList3 = new ArrayList();
        for (Object obj : setKeySet) {
            String str = (String) obj;
            n.e(str);
            if (!setW0.contains(getBaseId(str)) && n.d(getWidgetIdFromUniqueId(str), String.valueOf(this.widgetId))) {
                arrayList3.add(obj);
            }
        }
        for (String str2 : arrayList3) {
            BatteryStateManager batteryStateManager = BatteryStateManager.INSTANCE;
            n.e(str2);
            batteryStateManager.clearBatteryState(str2);
            TimerFactory.INSTANCE.stopTimer(str2);
        }
        BatteryStateManager batteryStateManager2 = BatteryStateManager.INSTANCE;
        ArrayList arrayList4 = new ArrayList(AbstractC1444s.u(arrayList, 10));
        Iterator<T> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((M5.a) it2.next()).a());
        }
        batteryStateManager2.clearOldCachedBatteryInfo(AbstractC1444s.w0(arrayList4));
    }

    private final void crossFadeAnimation(final BatteryCellView batteryCellView, Animator animator, Animator animator2, M5.a aVar, final M5.a aVar2) {
        if (n.d(getAttributeHelper().isAod(), Boolean.TRUE)) {
            batteryCellView.setBatteryInfo(aVar2);
            return;
        }
        if (animator != null) {
            animator.removeAllListeners();
        }
        if (animator2 != null) {
            animator2.removeAllListeners();
        }
        if (animator2 != null) {
            animator2.addListener(new AnimatorListenerAdapter() { // from class: com.nothing.cardwidget.battery.view.BatteryContainerView.crossFadeAnimation.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animation) {
                    n.h(animation, "animation");
                    batteryCellView.setBatteryInfo(aVar2);
                }
            });
        }
        if (animator != null) {
            animator.addListener(new AnimatorListenerAdapter() { // from class: com.nothing.cardwidget.battery.view.BatteryContainerView.crossFadeAnimation.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animation) {
                    n.h(animation, "animation");
                    batteryCellView.setBatteryInfo(aVar2);
                }
            });
        }
        if (aVar == null && aVar2 != null) {
            batteryCellView.setBatteryInfo(aVar2);
            if (animator != null) {
                animator.start();
                return;
            }
            return;
        }
        if (aVar != null && aVar2 == null) {
            if (animator2 != null) {
                animator2.start();
            }
        } else if (aVar == null && aVar2 == null) {
            batteryCellView.setBatteryInfo(aVar2);
        } else {
            batteryCellView.setBatteryInfo(aVar2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0094 A[EDGE_INSN: B:40:0x0094->B:33:0x0094 BREAK  A[LOOP:0: B:3:0x0004->B:46:0x0004], SYNTHETIC] */
    private final void deviceOnReceived(ArrayList<M5.a> arrayList) {
        for (M5.a aVar : arrayList) {
            String strH = aVar.h();
            int iHashCode = strH.hashCode();
            if (iHashCode == -273684744) {
                if (!strH.equals("AIRPODS")) {
                    continue;
                } else {
                    if (!BatteryContainerViewKt.isSingleBattery(aVar)) {
                        break;
                        break;
                    }
                    nothingDeviceOnReceived(aVar);
                }
            } else if (iHashCode != -79410817) {
                if (iHashCode == 1386738378 && strH.equals("NOTHINGX_DEVICE")) {
                    if (!BatteryContainerViewKt.isSingleBattery(aVar)) {
                        break;
                    } else {
                        nothingDeviceOnReceived(aVar);
                    }
                }
            } else if (!strH.equals("FASTPAIR_DEVICE")) {
                continue;
            } else {
                if (BatteryContainerViewKt.isSingleBattery(aVar)) {
                    break;
                }
                ArrayList<M5.a> arrayList2 = this.tempList;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayList2) {
                    if (n.d(((M5.a) obj).a(), aVar.a())) {
                        arrayList3.add(obj);
                    }
                }
                arrayList2.removeAll(AbstractC1444s.w0(arrayList3));
                this.tempList.add(BatteryStateManager.INSTANCE.earProductsOnCombine(aVar));
            }
        }
        updateUI();
    }

    private final ArrayList<M5.a> deviceStateOnHandle(M5.a aVar) {
        Integer num;
        Integer num2;
        BatteryStateManager batteryStateManager = BatteryStateManager.INSTANCE;
        batteryStateManager.getCurrentHandleBatteryInfo().put(aVar.a(), aVar);
        int i10 = WhenMappings.$EnumSwitchMapping$0[batteryStateManager.queryBatteryState(aVar, getUniqueId(aVar)).ordinal()];
        if (i10 == 1) {
            return AbstractC1444s.h(new M5.a(aVar.a(), aVar.h(), aVar.g(), aVar.j(), aVar.b(), aVar.d(), aVar.c(), aVar.j(), aVar.m(), aVar.o(), aVar.f(), null, null, null, aVar.k(), 14336, null), new M5.a(aVar.a(), aVar.h(), aVar.g(), aVar.m(), aVar.b(), aVar.d(), aVar.c(), aVar.j(), aVar.m(), aVar.o(), aVar.f(), null, null, null, aVar.n(), 14336, null), new M5.a(aVar.a(), aVar.h(), aVar.g(), aVar.c(), aVar.d(), aVar.d(), aVar.c(), aVar.j(), aVar.m(), aVar.o(), aVar.f(), null, null, null, aVar.e(), 14336, null));
        }
        if (i10 == 2) {
            if (batteryStateManager.getCaseBatteryInfo().get(aVar.a()) == null || ((num = batteryStateManager.getCaseBatteryInfo().get(aVar.a())) != null && num.intValue() == -1)) {
                return AbstractC1444s.h(batteryStateManager.earProductsOnCombine(aVar));
            }
            batteryStateManager.setBatteryState(getUniqueId(aVar), BatteryConfig.BatteryState.OUT_OF_CASE_COUNTING);
            if (n.d(getAttributeHelper().isAod(), Boolean.TRUE)) {
                TimerFactory timerFactory = TimerFactory.INSTANCE;
                Context context = getContext();
                n.g(context, "getContext(...)");
                timerFactory.startAlarmTimer(context, getUniqueId(aVar), BatteryConfig.DURATION_TASK_AWAITING, this);
            } else {
                TimerFactory timerFactory2 = TimerFactory.INSTANCE;
                Context context2 = getContext();
                n.g(context2, "getContext(...)");
                timerFactory2.startHandleTimer(context2, getUniqueId(aVar), BatteryConfig.DURATION_TASK_AWAITING, this);
            }
            M5.a aVarEarProductsOnCombine = batteryStateManager.earProductsOnCombine(aVar);
            String strA = aVar.a();
            String strH = aVar.h();
            String strG = aVar.g();
            Integer num3 = batteryStateManager.getCaseBatteryInfo().get(aVar.a());
            return AbstractC1444s.h(aVarEarProductsOnCombine, new M5.a(strA, strH, strG, num3 != null ? num3.intValue() : -1, aVar.d(), aVar.d(), aVar.c(), aVar.j(), aVar.m(), aVar.o(), aVar.f(), null, null, null, aVar.e(), 14336, null));
        }
        if (i10 != 3) {
            return AbstractC1444s.h(batteryStateManager.earProductsOnCombine(aVar));
        }
        if (batteryStateManager.getCaseBatteryInfo().get(aVar.a()) == null || ((num2 = batteryStateManager.getCaseBatteryInfo().get(aVar.a())) != null && num2.intValue() == -1)) {
            return AbstractC1444s.h(batteryStateManager.earProductsOnCombine(aVar));
        }
        if (n.d(getAttributeHelper().isAod(), Boolean.TRUE)) {
            TimerFactory timerFactory3 = TimerFactory.INSTANCE;
            Context context3 = getContext();
            n.g(context3, "getContext(...)");
            timerFactory3.startAlarmTimer(context3, getUniqueId(aVar), BatteryConfig.DURATION_TASK_AWAITING, this);
        } else {
            TimerFactory timerFactory4 = TimerFactory.INSTANCE;
            Context context4 = getContext();
            n.g(context4, "getContext(...)");
            timerFactory4.startHandleTimer(context4, getUniqueId(aVar), BatteryConfig.DURATION_TASK_AWAITING, this);
        }
        M5.a aVarEarProductsOnCombine2 = batteryStateManager.earProductsOnCombine(aVar);
        String strA2 = aVar.a();
        String strH2 = aVar.h();
        String strG2 = aVar.g();
        Integer num4 = batteryStateManager.getCaseBatteryInfo().get(aVar.a());
        return AbstractC1444s.h(aVarEarProductsOnCombine2, new M5.a(strA2, strH2, strG2, num4 != null ? num4.intValue() : -1, aVar.d(), aVar.d(), aVar.c(), aVar.j(), aVar.m(), aVar.o(), aVar.f(), null, null, null, aVar.e(), 14336, null));
    }

    private final String getAddressFromUniqueId(String str) {
        return (String) AbstractC1444s.S(E8.i.D0(str, new String[]{"+"}, false, 0, 6, null));
    }

    private final AttributeHelper getAttributeHelper() {
        return (AttributeHelper) this.attributeHelper$delegate.getValue();
    }

    private final String getBaseId(String str) {
        List listD0 = E8.i.D0(str, new String[]{"+"}, false, 0, 6, null);
        if (listD0.size() < 2) {
            return str;
        }
        return listD0.get(0) + "+" + listD0.get(1);
    }

    private final <T, E> Set<T> getKeysByValue(Map<T, ? extends E> map, E e10) {
        HashSet hashSet = new HashSet();
        for (Map.Entry<T, ? extends E> entry : map.entrySet()) {
            T key = entry.getKey();
            if (n.d(e10, entry.getValue())) {
                hashSet.add(key);
            }
        }
        return hashSet;
    }

    private final String getUniqueId(M5.a aVar) {
        return aVar.a() + "+" + this.widgetId + "+" + getAttributeHelper().isAod();
    }

    private final String getWidgetIdFromUniqueId(String str) {
        String str2 = (String) AbstractC1444s.V(E8.i.D0(str, new String[]{"+"}, false, 0, 6, null), 1);
        return str2 == null ? "" : str2;
    }

    private final void initView(View view) {
        Animator animatorClone;
        Animator animatorClone2;
        Animator animatorClone3;
        Animator animatorClone4;
        Animator animatorClone5;
        Animator animatorClone6;
        this.batteryContainer = (LinearLayout) view.findViewById(R.id.battery_container);
        BatteryCellView batteryCellView = (BatteryCellView) view.findViewById(R.id.battery_view_top_left);
        Animator animator = null;
        if (batteryCellView != null) {
            batteryCellView.setAttributeHelper(getAttributeHelper());
        } else {
            batteryCellView = null;
        }
        this.batteryViewTopLeft = batteryCellView;
        BatteryCellView batteryCellView2 = (BatteryCellView) view.findViewById(R.id.battery_view_top_right);
        if (batteryCellView2 != null) {
            batteryCellView2.setAttributeHelper(getAttributeHelper());
        } else {
            batteryCellView2 = null;
        }
        this.batteryViewTopRight = batteryCellView2;
        BatteryCellView batteryCellView3 = (BatteryCellView) view.findViewById(R.id.battery_view_bottom_left);
        if (batteryCellView3 != null) {
            batteryCellView3.setAttributeHelper(getAttributeHelper());
        } else {
            batteryCellView3 = null;
        }
        this.batteryViewBottomLeft = batteryCellView3;
        BatteryCellView batteryCellView4 = (BatteryCellView) view.findViewById(R.id.battery_view_bottom_right);
        if (batteryCellView4 != null) {
            batteryCellView4.setAttributeHelper(getAttributeHelper());
        } else {
            batteryCellView4 = null;
        }
        this.batteryViewBottomRight = batteryCellView4;
        TextView textView = (TextView) view.findViewById(R.id.tv_battery_level);
        Integer batteryLevelTvColor = getAttributeHelper().getBatteryLevelTvColor();
        if (batteryLevelTvColor != null) {
            textView.setTextColor(batteryLevelTvColor.intValue());
        }
        this.batteryLevelTv = textView;
        TextView textView2 = (TextView) view.findViewById(R.id.tv_battery_permission);
        String permissionStr = getAttributeHelper().getPermissionStr();
        if (permissionStr != null) {
            textView2.setText(permissionStr);
        }
        Integer permissionTvColor = getAttributeHelper().getPermissionTvColor();
        if (permissionTvColor != null) {
            textView2.setTextColor(permissionTvColor.intValue());
        }
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.nothing.cardwidget.battery.view.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BatteryContainerView.initView$lambda$11$lambda$10(this.f18032q, view2);
            }
        });
        this.batteryPermissionTv = textView2;
        Animator animBatteryEnter = getAttributeHelper().getAnimBatteryEnter();
        if (animBatteryEnter == null || (animatorClone = animBatteryEnter.clone()) == null) {
            animatorClone = null;
        } else {
            animatorClone.setTarget(this.batteryViewTopRight);
        }
        this.animEnterTopRight = animatorClone;
        Animator animBatteryExit = getAttributeHelper().getAnimBatteryExit();
        if (animBatteryExit == null || (animatorClone2 = animBatteryExit.clone()) == null) {
            animatorClone2 = null;
        } else {
            animatorClone2.setTarget(this.batteryViewTopRight);
        }
        this.animExitTopRight = animatorClone2;
        Animator animBatteryEnter2 = getAttributeHelper().getAnimBatteryEnter();
        if (animBatteryEnter2 == null || (animatorClone3 = animBatteryEnter2.clone()) == null) {
            animatorClone3 = null;
        } else {
            animatorClone3.setTarget(this.batteryViewBottomLeft);
        }
        this.animEnterBottomLeft = animatorClone3;
        Animator animBatteryExit2 = getAttributeHelper().getAnimBatteryExit();
        if (animBatteryExit2 == null || (animatorClone4 = animBatteryExit2.clone()) == null) {
            animatorClone4 = null;
        } else {
            animatorClone4.setTarget(this.batteryViewBottomLeft);
        }
        this.animExitBottomLeft = animatorClone4;
        Animator animBatteryEnter3 = getAttributeHelper().getAnimBatteryEnter();
        if (animBatteryEnter3 == null || (animatorClone5 = animBatteryEnter3.clone()) == null) {
            animatorClone5 = null;
        } else {
            animatorClone5.setTarget(this.batteryViewBottomRight);
        }
        this.animEnterBottomRight = animatorClone5;
        Animator animBatteryExit3 = getAttributeHelper().getAnimBatteryExit();
        if (animBatteryExit3 != null && (animatorClone6 = animBatteryExit3.clone()) != null) {
            animatorClone6.setTarget(this.batteryViewBottomRight);
            animator = animatorClone6;
        }
        this.animExitBottomRight = animator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$11$lambda$10(BatteryContainerView this$0, View view) {
        n.h(this$0, "this$0");
        View.OnClickListener onClickListener = this$0.permissionClickListener;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    private final void nothingDeviceOnReceived(M5.a aVar) {
        BatteryStateManager batteryStateManager = BatteryStateManager.INSTANCE;
        batteryStateManager.getCurrentHandleBatteryInfo().put(aVar.a(), aVar);
        if (aVar.c() != -1) {
            batteryStateManager.getCaseBatteryInfo().put(aVar.a(), Integer.valueOf(aVar.c()));
            batteryStateManager.setBatteryState(getUniqueId(aVar), BatteryConfig.BatteryState.INIT_IN_CASE);
            TimerFactory.INSTANCE.stopTimer(getUniqueId(aVar));
        } else if (batteryStateManager.queryBatteryState(aVar, getUniqueId(aVar)) == BatteryConfig.BatteryState.INIT_IN_CASE) {
            batteryStateManager.setBatteryState(getUniqueId(aVar), BatteryConfig.BatteryState.OUT_OF_CASE);
        }
        ArrayList<M5.a> arrayList = this.tempList;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (n.d(((M5.a) obj).a(), aVar.a())) {
                arrayList2.add(obj);
            }
        }
        arrayList.removeAll(AbstractC1444s.w0(arrayList2));
        this.tempList.addAll(deviceStateOnHandle(aVar));
    }

    private final void setAllBatteryClickListener(List<M5.a> list) {
        M5.a aVar = (M5.a) AbstractC1444s.V(list, 0);
        String strA = aVar != null ? aVar.a() : null;
        M5.a aVar2 = (M5.a) AbstractC1444s.V(list, 1);
        String strA2 = aVar2 != null ? aVar2.a() : null;
        M5.a aVar3 = (M5.a) AbstractC1444s.V(list, 2);
        String strA3 = aVar3 != null ? aVar3.a() : null;
        M5.a aVar4 = (M5.a) AbstractC1444s.V(list, 3);
        String strA4 = aVar4 != null ? aVar4.a() : null;
        LinearLayout linearLayout = this.batteryContainer;
        if (linearLayout != null) {
            setBatteryClickListener(linearLayout, null);
        }
        int size = list.size();
        if (size == 1) {
            LinearLayout linearLayout2 = this.batteryContainer;
            if (linearLayout2 != null) {
                setBatteryClickListener(linearLayout2, strA);
            }
            BatteryCellView batteryCellView = this.batteryViewTopRight;
            if (batteryCellView != null) {
                setBatteryClickListener(batteryCellView, strA);
            }
            BatteryCellView batteryCellView2 = this.batteryViewBottomLeft;
            if (batteryCellView2 != null) {
                setBatteryClickListener(batteryCellView2, strA);
            }
            BatteryCellView batteryCellView3 = this.batteryViewBottomRight;
            if (batteryCellView3 != null) {
                setBatteryClickListener(batteryCellView3, strA);
                return;
            }
            return;
        }
        if (size == 2) {
            BatteryCellView batteryCellView4 = this.batteryViewTopLeft;
            if (batteryCellView4 != null) {
                setBatteryClickListener(batteryCellView4, strA);
            }
            BatteryCellView batteryCellView5 = this.batteryViewTopRight;
            if (batteryCellView5 != null) {
                setBatteryClickListener(batteryCellView5, null);
            }
            BatteryCellView batteryCellView6 = this.batteryViewBottomLeft;
            if (batteryCellView6 != null) {
                setBatteryClickListener(batteryCellView6, null);
            }
            BatteryCellView batteryCellView7 = this.batteryViewBottomRight;
            if (batteryCellView7 != null) {
                setBatteryClickListener(batteryCellView7, strA2);
                return;
            }
            return;
        }
        if (size != 3) {
            BatteryCellView batteryCellView8 = this.batteryViewTopLeft;
            if (batteryCellView8 != null) {
                setBatteryClickListener(batteryCellView8, strA);
            }
            BatteryCellView batteryCellView9 = this.batteryViewTopRight;
            if (batteryCellView9 != null) {
                setBatteryClickListener(batteryCellView9, strA2);
            }
            BatteryCellView batteryCellView10 = this.batteryViewBottomLeft;
            if (batteryCellView10 != null) {
                setBatteryClickListener(batteryCellView10, strA3);
            }
            BatteryCellView batteryCellView11 = this.batteryViewBottomRight;
            if (batteryCellView11 != null) {
                setBatteryClickListener(batteryCellView11, strA4);
                return;
            }
            return;
        }
        BatteryCellView batteryCellView12 = this.batteryViewTopLeft;
        if (batteryCellView12 != null) {
            setBatteryClickListener(batteryCellView12, strA);
        }
        BatteryCellView batteryCellView13 = this.batteryViewTopRight;
        if (batteryCellView13 != null) {
            setBatteryClickListener(batteryCellView13, strA2);
        }
        BatteryCellView batteryCellView14 = this.batteryViewBottomLeft;
        if (batteryCellView14 != null) {
            setBatteryClickListener(batteryCellView14, strA3);
        }
        BatteryCellView batteryCellView15 = this.batteryViewBottomRight;
        if (batteryCellView15 != null) {
            setBatteryClickListener(batteryCellView15, null);
        }
    }

    private final void setBatteryClickListener(final View view, final String str) {
        if (str != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.nothing.cardwidget.battery.view.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BatteryContainerView.setBatteryClickListener$lambda$55$lambda$54(view, this, str, view2);
                }
            });
        } else {
            view.setOnClickListener(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setBatteryClickListener$lambda$55$lambda$54(View batteryView, BatteryContainerView this$0, String str, View view) {
        n.h(batteryView, "$batteryView");
        n.h(this$0, "this$0");
        batteryView.setTag(this$0.widgetId);
        Consumer<o> consumer = this$0.clickListener;
        if (consumer != null) {
            consumer.accept(new o(batteryView, str));
        }
    }

    private final void showBatteryUI() {
        TextView textView = this.batteryPermissionTv;
        if (textView != null) {
            textView.setVisibility(8);
        }
        LinearLayout linearLayout = this.batteryContainer;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        TextView textView2 = this.batteryLevelTv;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
    }

    private final void showPermissionUI() {
        TextView textView = this.batteryPermissionTv;
        if (textView != null) {
            textView.setVisibility(0);
        }
        LinearLayout linearLayout = this.batteryContainer;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        TextView textView2 = this.batteryLevelTv;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
    }

    private final void updateUI() {
        Log.d(this.TAG, "updateUI tempList: " + this.tempList);
        ArrayList<M5.a> arrayList = this.tempList;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((M5.a) obj).l() != -1) {
                arrayList2.add(obj);
            }
        }
        final Comparator comparator = new Comparator() { // from class: com.nothing.cardwidget.battery.view.BatteryContainerView$updateUI$$inlined$compareByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t9, T t10) {
                return p109k8.a.d(Boolean.valueOf(n.d(((M5.a) t10).h(), "PHONE")), Boolean.valueOf(n.d(((M5.a) t9).h(), "PHONE")));
            }
        };
        final Comparator comparator2 = new Comparator() { // from class: com.nothing.cardwidget.battery.view.BatteryContainerView$updateUI$$inlined$thenByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t9, T t10) {
                int iCompare = comparator.compare(t9, t10);
                return iCompare != 0 ? iCompare : p109k8.a.d(Boolean.valueOf(((M5.a) t10).o()), Boolean.valueOf(((M5.a) t9).o()));
            }
        };
        ArrayList<M5.a> arrayList3 = new ArrayList<>(AbstractC1444s.m0(arrayList2, new Comparator() { // from class: com.nothing.cardwidget.battery.view.BatteryContainerView$updateUI$$inlined$thenByDescending$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t9, T t10) {
                int iCompare = comparator2.compare(t9, t10);
                return iCompare != 0 ? iCompare : p109k8.a.d(Long.valueOf(((M5.a) t10).f()), Long.valueOf(((M5.a) t9).f()));
            }
        }));
        this.tempList = arrayList3;
        int size = arrayList3.size();
        if (size == 1) {
            BatteryCellView batteryCellView = this.batteryViewTopLeft;
            if (batteryCellView != null) {
                batteryCellView.setBatteryInfo(this.tempList.get(0));
            }
            BatteryCellView batteryCellView2 = this.batteryViewTopRight;
            if (batteryCellView2 != null) {
                crossFadeAnimation(batteryCellView2, this.animEnterTopRight, this.animExitTopRight, this.batteryViewTopRightInfo, null);
            }
            BatteryCellView batteryCellView3 = this.batteryViewBottomLeft;
            if (batteryCellView3 != null) {
                crossFadeAnimation(batteryCellView3, this.animEnterBottomLeft, this.animExitBottomLeft, this.batteryViewBottomLeftInfo, null);
            }
            BatteryCellView batteryCellView4 = this.batteryViewBottomRight;
            if (batteryCellView4 != null) {
                crossFadeAnimation(batteryCellView4, this.animEnterBottomRight, this.animExitBottomRight, this.batteryViewBottomRightInfo, null);
            }
            TextView textView = this.batteryLevelTv;
            if (textView != null) {
                textView.setText(this.tempList.get(0).l() + "%");
            }
            this.batteryViewTopRightInfo = null;
            this.batteryViewBottomLeftInfo = null;
            this.batteryViewBottomRightInfo = null;
        } else if (size == 2) {
            BatteryCellView batteryCellView5 = this.batteryViewTopLeft;
            if (batteryCellView5 != null) {
                batteryCellView5.setBatteryInfo(this.tempList.get(0));
            }
            BatteryCellView batteryCellView6 = this.batteryViewTopRight;
            if (batteryCellView6 != null) {
                crossFadeAnimation(batteryCellView6, this.animEnterTopRight, this.animExitTopRight, this.batteryViewTopRightInfo, null);
            }
            BatteryCellView batteryCellView7 = this.batteryViewBottomLeft;
            if (batteryCellView7 != null) {
                crossFadeAnimation(batteryCellView7, this.animEnterBottomLeft, this.animExitBottomLeft, this.batteryViewBottomLeftInfo, null);
            }
            BatteryCellView batteryCellView8 = this.batteryViewBottomRight;
            if (batteryCellView8 != null) {
                crossFadeAnimation(batteryCellView8, this.animEnterBottomRight, this.animExitBottomRight, this.batteryViewBottomRightInfo, this.tempList.get(1));
            }
            TextView textView2 = this.batteryLevelTv;
            if (textView2 != null) {
                textView2.setText("");
            }
            this.batteryViewTopRightInfo = null;
            this.batteryViewBottomLeftInfo = null;
            this.batteryViewBottomRightInfo = this.tempList.get(1);
        } else if (size != 3) {
            BatteryCellView batteryCellView9 = this.batteryViewTopLeft;
            if (batteryCellView9 != null) {
                batteryCellView9.setBatteryInfo(this.tempList.get(0));
            }
            BatteryCellView batteryCellView10 = this.batteryViewTopRight;
            if (batteryCellView10 != null) {
                crossFadeAnimation(batteryCellView10, this.animEnterTopRight, this.animExitTopRight, this.batteryViewTopRightInfo, this.tempList.get(1));
            }
            BatteryCellView batteryCellView11 = this.batteryViewBottomLeft;
            if (batteryCellView11 != null) {
                crossFadeAnimation(batteryCellView11, this.animEnterBottomLeft, this.animExitBottomLeft, this.batteryViewBottomLeftInfo, this.tempList.get(2));
            }
            BatteryCellView batteryCellView12 = this.batteryViewBottomRight;
            if (batteryCellView12 != null) {
                crossFadeAnimation(batteryCellView12, this.animEnterBottomRight, this.animExitBottomRight, this.batteryViewBottomRightInfo, this.tempList.get(3));
            }
            TextView textView3 = this.batteryLevelTv;
            if (textView3 != null) {
                textView3.setText("");
            }
            this.batteryViewTopRightInfo = this.tempList.get(1);
            this.batteryViewBottomLeftInfo = this.tempList.get(2);
            this.batteryViewBottomRightInfo = this.tempList.get(3);
        } else {
            BatteryCellView batteryCellView13 = this.batteryViewTopLeft;
            if (batteryCellView13 != null) {
                batteryCellView13.setBatteryInfo(this.tempList.get(0));
            }
            BatteryCellView batteryCellView14 = this.batteryViewTopRight;
            if (batteryCellView14 != null) {
                crossFadeAnimation(batteryCellView14, this.animEnterTopRight, this.animExitTopRight, this.batteryViewTopRightInfo, this.tempList.get(1));
            }
            BatteryCellView batteryCellView15 = this.batteryViewBottomLeft;
            if (batteryCellView15 != null) {
                crossFadeAnimation(batteryCellView15, this.animEnterBottomLeft, this.animExitBottomLeft, this.batteryViewBottomLeftInfo, this.tempList.get(2));
            }
            BatteryCellView batteryCellView16 = this.batteryViewBottomRight;
            if (batteryCellView16 != null) {
                crossFadeAnimation(batteryCellView16, this.animEnterBottomRight, this.animExitBottomRight, this.batteryViewBottomRightInfo, null);
            }
            TextView textView4 = this.batteryLevelTv;
            if (textView4 != null) {
                textView4.setText("");
            }
            this.batteryViewTopRightInfo = this.tempList.get(1);
            this.batteryViewBottomLeftInfo = this.tempList.get(2);
            this.batteryViewBottomRightInfo = null;
        }
        setAllBatteryClickListener(this.tempList);
    }

    @Override // com.nothing.cardwidget.RemoteServiceView
    public void onDataChanged(Bundle data) {
        n.h(data, "data");
    }

    @Override // com.nothing.cardwidget.battery.timer.ITimerListener
    public void onTicker(String uniqueId) {
        Object next;
        n.h(uniqueId, "uniqueId");
        Iterator it = getKeysByValue(BatteryStateManager.INSTANCE.getBatteryStateInfo(), BatteryConfig.BatteryState.OUT_OF_CASE_COUNTING).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!n.d((String) next, uniqueId));
        String str = (String) next;
        if (str != null) {
            BatteryStateManager batteryStateManager = BatteryStateManager.INSTANCE;
            M5.a aVar = batteryStateManager.getCurrentHandleBatteryInfo().get(getAddressFromUniqueId(str));
            if (aVar != null) {
                batteryStateManager.setBatteryState(uniqueId, BatteryConfig.BatteryState.NORMAL);
                TimerFactory.INSTANCE.stopTimer(uniqueId);
                ArrayList<M5.a> arrayList = this.tempList;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (n.d(((M5.a) obj).a(), aVar.a())) {
                        arrayList2.add(obj);
                    }
                }
                arrayList.removeAll(AbstractC1444s.w0(arrayList2));
                this.tempList.addAll(deviceStateOnHandle(aVar));
            }
        }
        updateUI();
    }

    public final void setBatteryDisplayRatio(float f10) {
        UiUtil uiUtil = UiUtil.INSTANCE;
        Context context = getContext();
        n.g(context, "getContext(...)");
        int iB = p239x8.a.b(uiUtil.dp2px(context, 70) * f10);
        Context context2 = getContext();
        n.g(context2, "getContext(...)");
        int iB2 = p239x8.a.b(uiUtil.dp2px(context2, 6) * f10);
        Context context3 = getContext();
        n.g(context3, "getContext(...)");
        int iB3 = p239x8.a.b(uiUtil.dp2px(context3, 10) * f10);
        Context context4 = getContext();
        n.g(context4, "getContext(...)");
        int iB4 = p239x8.a.b(uiUtil.dp2px(context4, 3) * f10);
        Context context5 = getContext();
        n.g(context5, "getContext(...)");
        int iB5 = p239x8.a.b(uiUtil.dp2px(context5, 16) * f10);
        BatteryCellView batteryCellView = this.batteryViewTopLeft;
        if (batteryCellView != null) {
            DisplayUtil displayUtil = DisplayUtil.INSTANCE;
            displayUtil.setViewSize(batteryCellView, Integer.valueOf(iB), Integer.valueOf(iB));
            displayUtil.setViewMargin(batteryCellView, DisplayUtil.MARGIN_TOP, iB2);
            displayUtil.setViewMargin(batteryCellView, DisplayUtil.MARGIN_START, iB2);
            displayUtil.setViewMargin(batteryCellView, DisplayUtil.MARGIN_END, iB4);
            displayUtil.setViewMargin(batteryCellView, DisplayUtil.MARGIN_BOTTOM, iB4);
            batteryCellView.updateRatio(f10);
        }
        BatteryCellView batteryCellView2 = this.batteryViewTopRight;
        if (batteryCellView2 != null) {
            DisplayUtil displayUtil2 = DisplayUtil.INSTANCE;
            displayUtil2.setViewSize(batteryCellView2, Integer.valueOf(iB), Integer.valueOf(iB));
            displayUtil2.setViewMargin(batteryCellView2, DisplayUtil.MARGIN_TOP, iB2);
            displayUtil2.setViewMargin(batteryCellView2, DisplayUtil.MARGIN_START, iB4);
            displayUtil2.setViewMargin(batteryCellView2, DisplayUtil.MARGIN_END, iB2);
            displayUtil2.setViewMargin(batteryCellView2, DisplayUtil.MARGIN_BOTTOM, iB4);
            batteryCellView2.updateRatio(f10);
        }
        BatteryCellView batteryCellView3 = this.batteryViewBottomLeft;
        if (batteryCellView3 != null) {
            DisplayUtil displayUtil3 = DisplayUtil.INSTANCE;
            displayUtil3.setViewSize(batteryCellView3, Integer.valueOf(iB), Integer.valueOf(iB));
            displayUtil3.setViewMargin(batteryCellView3, DisplayUtil.MARGIN_TOP, iB4);
            displayUtil3.setViewMargin(batteryCellView3, DisplayUtil.MARGIN_START, iB2);
            displayUtil3.setViewMargin(batteryCellView3, DisplayUtil.MARGIN_END, iB4);
            displayUtil3.setViewMargin(batteryCellView3, DisplayUtil.MARGIN_BOTTOM, iB2);
            batteryCellView3.updateRatio(f10);
        }
        BatteryCellView batteryCellView4 = this.batteryViewBottomRight;
        if (batteryCellView4 != null) {
            DisplayUtil displayUtil4 = DisplayUtil.INSTANCE;
            displayUtil4.setViewSize(batteryCellView4, Integer.valueOf(iB), Integer.valueOf(iB));
            displayUtil4.setViewMargin(batteryCellView4, DisplayUtil.MARGIN_TOP, iB4);
            displayUtil4.setViewMargin(batteryCellView4, DisplayUtil.MARGIN_START, iB4);
            displayUtil4.setViewMargin(batteryCellView4, DisplayUtil.MARGIN_END, iB2);
            displayUtil4.setViewMargin(batteryCellView4, DisplayUtil.MARGIN_BOTTOM, iB2);
            batteryCellView4.updateRatio(f10);
        }
        TextView textView = this.batteryLevelTv;
        if (textView != null) {
            DisplayUtil displayUtil5 = DisplayUtil.INSTANCE;
            displayUtil5.setViewMargin(textView, DisplayUtil.MARGIN_END, iB5);
            displayUtil5.setViewMargin(textView, DisplayUtil.MARGIN_BOTTOM, iB3);
            textView.setTextSize(0, 76.0f * f10);
        }
        TextView textView2 = this.batteryPermissionTv;
        if (textView2 != null) {
            textView2.setTextSize(0, f10 * 51.0f);
        }
    }

    public final void setBatteryInfo(ArrayList<M5.a> batteryInfoList) {
        n.h(batteryInfoList, "batteryInfoList");
        clearOutDatedData(batteryInfoList);
        this.tempList.clear();
        Iterator<T> it = batteryInfoList.iterator();
        while (it.hasNext()) {
            this.tempList.add((M5.a) it.next());
        }
        deviceOnReceived(batteryInfoList);
    }

    public final void setBatteryWidgetId(int i10) {
        this.widgetId = Integer.valueOf(i10);
    }

    public final void setClickEventConsumer(Consumer<o> c10) {
        n.h(c10, "c");
        this.clickListener = c10;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.permissionClickListener = onClickListener;
    }

    public final void setPermission(boolean z9) {
        Log.d(this.TAG, "updateBatteryViewState state: " + z9);
        if (z9) {
            showBatteryUI();
        } else {
            showPermissionUI();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BatteryContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        n.h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BatteryContainerView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0, 8, null);
        n.h(context, "context");
    }

    public /* synthetic */ BatteryContainerView(Context context, AttributeSet attributeSet, int i10, int i11, int i12, AbstractC1457h abstractC1457h) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BatteryContainerView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        n.h(context, "context");
        this.TAG = "BatteryContainerView";
        this.tempList = new ArrayList<>();
        this.attributeHelper$delegate = p079h8.i.b(new p219v8.a() { // from class: com.nothing.cardwidget.battery.view.g
            @Override // p219v8.a
            public final Object invoke() {
                return BatteryContainerView.attributeHelper_delegate$lambda$0();
            }
        });
        getAttributeHelper().getRemoteResource(attributeSet, context);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.battery_container, (ViewGroup) this, false);
        addView(viewInflate);
        n.e(viewInflate);
        initView(viewInflate);
    }
}
