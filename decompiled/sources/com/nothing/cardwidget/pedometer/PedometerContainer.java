package com.nothing.cardwidget.pedometer;

import F8.AbstractC0816i;
import F8.L;
import O5.g;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;
import com.google.gson.Gson;
import com.nothing.cardwidget.NTPageIndicatorDot;
import com.nothing.cardwidget.R;
import com.nothing.cardwidget.RemoteServiceView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.r;
import p079h8.v;
import p089i8.AbstractC1444s;
import p089i8.N;
import p219v8.p;

/* JADX INFO: loaded from: classes2.dex */
public final class PedometerContainer extends RemoteServiceView {
    public static final int AOD_MODE = 1;
    public static final int NORMAL_MODE = 0;
    private static boolean sharedIsJustWalking;
    private static String sharedMonthStepsListJson;
    private static int sharedSevenDayAverage;
    private static int sharedSevenDayPercent;
    private static int sharedStepCounter;
    private static int sharedTodayPercent;
    private final String TAG;
    private int containerType;
    private final Gson gson;
    private final PedometerContainer$handler$1 handler;
    private boolean isResumed;
    private int isSupportAod;
    private MonthStepsData lastMonthStepsData;
    private String noDataDes;
    private String noPermissionDes;
    private TextView pedometerAbnormalTxt;
    private ImageView pedometerAnimIv;
    private NTPageIndicatorDot pedometerPageIndicator;
    private PedometerViewPagerAdapter pedometerViewPagerAdapter;
    private ViewPager2 pedometerViewpager;
    private Drawable reachGoalAnimRes;
    private Drawable walkingAnimRes;
    public static final Companion Companion = new Companion(null);
    private static int sharedPageState = -1;
    private static int sharedAnimType = -1;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1457h abstractC1457h) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.nothing.cardwidget.pedometer.PedometerContainer$showNormal$1, reason: invalid class name */
    @kotlin.coroutines.jvm.internal.f(c = "com.nothing.cardwidget.pedometer.PedometerContainer$showNormal$1", f = "PedometerContainer.kt", l = {}, m = "invokeSuspend")
    static final class AnonymousClass1 extends l implements p {
        int label;

        AnonymousClass1(p129m8.e<? super AnonymousClass1> eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e<A> create(Object obj, p129m8.e<?> eVar) {
            return PedometerContainer.this.new AnonymousClass1(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e<? super A> eVar) {
            return ((AnonymousClass1) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            PedometerContainer pedometerContainer = PedometerContainer.this;
            Bundle bundle = new Bundle();
            bundle.putString(Constants.KEY_METHOD_NAME, Constants.METHOD_ANIMATION_END);
            bundle.putInt(Constants.KEY_ANIMATION_FLAG, PedometerContainer.sharedAnimType);
            pedometerContainer.callRemoteService(bundle);
            return A.f21846a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PedometerContainer(Context context) {
        this(context, null, 0, 6, null);
        n.h(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$21(Context context, View view) {
        n.h(context, "$context");
        Intent intent = new Intent(Constants.PEDOMETER_WIDGET_CONFIGURE_AUTHORITIES);
        intent.addFlags(335544320);
        intent.addCategory("android.intent.category.DEFAULT");
        context.startActivity(intent);
    }

    private final int getAnimType(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? -1 : 2;
        }
        return 1;
    }

    private final MonthStepsData getMonthStepsData(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            MonthStepsData monthStepsData = (MonthStepsData) this.gson.fromJson(str, MonthStepsData.class);
            this.lastMonthStepsData = monthStepsData;
            return monthStepsData;
        } catch (Exception e10) {
            Log.e(this.TAG, "parse Json for MonthStepsData e: " + e10);
            return this.lastMonthStepsData;
        }
    }

    private final boolean isAod() {
        return this.containerType == 1;
    }

    private final void maybeUpdateWalkingPercent(int i10, int i11, boolean z9) {
        WalkingData walkingData = this.pedometerViewPagerAdapter.getWalkingData();
        if (walkingData != null) {
            if (i11 >= 0) {
                walkingData.setWalkingPercent(i11);
            }
            if (z9) {
                walkingData.setAnimateValid(this.isResumed);
                walkingData.setJustWalking(true);
                updateWalkingData();
            } else if (walkingData.getWalkingPercent() >= 100) {
                walkingData.setRefreshProgress(true);
                updateWalkingData();
            } else if (this.pedometerViewPagerAdapter.getPedometerDataList().size() >= 3 && this.isResumed && i10 == 0 && !hasMessages(1)) {
                walkingData.setRefreshProgress(true);
                updateWalkingData();
            }
        }
    }

    static /* synthetic */ void maybeUpdateWalkingPercent$default(PedometerContainer pedometerContainer, int i10, int i11, boolean z9, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = -1;
        }
        if ((i12 & 4) != 0) {
            z9 = false;
        }
        pedometerContainer.maybeUpdateWalkingPercent(i10, i11, z9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewPagerShow(boolean z9) {
        if (z9) {
            this.pedometerViewpager.setVisibility(0);
            this.pedometerPageIndicator.setVisibility(0);
        } else {
            this.pedometerViewpager.setVisibility(8);
            this.pedometerPageIndicator.setVisibility(8);
        }
    }

    private final void showAbnormal(boolean z9) {
        this.pedometerAbnormalTxt.setVisibility(0);
        setViewPagerShow(false);
        this.pedometerAbnormalTxt.setText(z9 ? this.noPermissionDes : this.noDataDes);
    }

    private final void showAnim(int i10) {
        AnimationDrawable animationDrawable;
        if (isAod()) {
            Drawable background = this.pedometerAnimIv.getBackground();
            animationDrawable = background instanceof AnimationDrawable ? (AnimationDrawable) background : null;
            if (animationDrawable != null) {
                animationDrawable.stop();
                return;
            }
            return;
        }
        if (hasMessages(i10) || this.reachGoalAnimRes == null || this.walkingAnimRes == null) {
            return;
        }
        if (this.pedometerAnimIv.getVisibility() == 8) {
            this.pedometerAnimIv.setVisibility(0);
            setViewPagerShow(false);
        }
        this.pedometerAnimIv.setBackground(i10 == 1 ? this.reachGoalAnimRes : this.walkingAnimRes);
        Drawable background2 = this.pedometerAnimIv.getBackground();
        animationDrawable = background2 instanceof AnimationDrawable ? (AnimationDrawable) background2 : null;
        if (animationDrawable != null) {
            animationDrawable.start();
            Message messageObtainMessage = obtainMessage();
            n.g(messageObtainMessage, "obtainMessage(...)");
            messageObtainMessage.what = 1;
            messageObtainMessage.obj = Integer.valueOf(i10);
            sendMessageDelayed(messageObtainMessage, Constants.TIME_ANIM_COAST_TIME);
        }
    }

    private final void showNormal(boolean z9, int i10, int i11, int i12, int i13, String str) {
        this.pedometerAbnormalTxt.setVisibility(8);
        boolean zHasMessages = hasMessages(1);
        Object obj = null;
        if (isAod() && zHasMessages) {
            setViewPagerShow(true);
            removeMessages(1);
            AbstractC0816i.d(g.j(), null, null, new AnonymousClass1(null), 3, null);
            maybeUpdateWalkingPercent$default(this, this.pedometerViewpager.getCurrentItem(), 0, false, 6, null);
        } else {
            setViewPagerShow(!zHasMessages);
        }
        ArrayList arrayList = new ArrayList();
        WalkingData walkingData = new WalkingData(i11, false, z9, 0, this.isResumed, 8, null);
        for (Object obj2 : this.pedometerViewPagerAdapter.getPedometerDataList()) {
            if (((PedometerData) obj2) instanceof WalkingData) {
                obj = obj2;
                break;
            }
        }
        PedometerData pedometerData = (PedometerData) obj;
        if (pedometerData != null) {
            walkingData.setCurrentProgress(((WalkingData) pedometerData).getCurrentProgress());
        }
        arrayList.add(walkingData);
        arrayList.add(new DigitalData(i10, i11, i12, i13));
        MonthStepsData monthStepsData = getMonthStepsData(str);
        if (monthStepsData != null) {
            arrayList.add(monthStepsData);
            this.pedometerViewPagerAdapter.updateAllData(arrayList);
        } else if (this.pedometerViewPagerAdapter.getItemCount() < 3) {
            arrayList.add(this.lastMonthStepsData);
            this.pedometerViewPagerAdapter.updateAllData(arrayList);
        } else {
            this.pedometerViewPagerAdapter.updateDataExcludeMonthStepsList(arrayList);
        }
        this.pedometerPageIndicator.refreshDotIfItemCountChanged();
    }

    private final void showPageState(int i10, boolean z9, int i11, int i12, int i13, int i14, String str) {
        if (i10 == 0) {
            showNormal(z9, i11, i12, i13, i14, str);
            return;
        }
        if (i10 == 1) {
            showAnim(2);
            return;
        }
        if (i10 == 2) {
            showAnim(1);
            return;
        }
        if (i10 == 3) {
            showAbnormal(true);
        } else if (i10 == 4) {
            showAbnormal(false);
        } else {
            if (i10 != 5) {
                return;
            }
            maybeUpdateWalkingPercent(this.pedometerViewpager.getCurrentItem(), i12, z9);
        }
    }

    private final void updateWalkingData() {
        if (this.isResumed) {
            this.pedometerViewpager.post(new Runnable() { // from class: com.nothing.cardwidget.pedometer.a
                @Override // java.lang.Runnable
                public final void run() {
                    PedometerContainer.updateWalkingData$lambda$27(this.f18085q);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateWalkingData$lambda$27(PedometerContainer this$0) {
        n.h(this$0, "this$0");
        if (this$0.pedometerViewpager.getVisibility() == 0) {
            this$0.pedometerViewPagerAdapter.notifyItemChanged(0);
            return;
        }
        PedometerViewPagerAdapter.PedometerWalkingViewHolder walkingViewHolder = this$0.pedometerViewPagerAdapter.getWalkingViewHolder();
        if (walkingViewHolder != null) {
            walkingViewHolder.bindData();
        }
    }

    @Override // com.nothing.cardwidget.RemoteServiceView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        showPageState(sharedPageState, sharedIsJustWalking, sharedStepCounter, sharedTodayPercent, sharedSevenDayAverage, sharedSevenDayPercent, sharedMonthStepsListJson);
    }

    @Override // com.nothing.cardwidget.RemoteServiceView
    public void onDataChanged(Bundle data) {
        n.h(data, "data");
        int i10 = data.getInt(Constants.KEY_PAGE_STATE);
        int i11 = data.getInt(Constants.KEY_STEPS);
        int i12 = data.getInt(Constants.KEY_TODAY_PERCENT);
        int i13 = data.getInt(Constants.KEY_SEVEN_DAY_AVERAGE);
        int i14 = data.getInt(Constants.KEY_SEVEN_DAY_PERCENT);
        String string = data.getString(PedometerCalendarView.KEY_MONTH_STEPS_LIST);
        boolean z9 = data.getBoolean(Constants.KEY_JUST_WALKING);
        Log.d(this.TAG, "onDataChanged,  isAod " + isAod() + " stepCounter: " + i11 + ", todayPercent: " + i12 + ", sevenDayAverage: " + i13 + ", sevenDayPercent: " + i14 + ", pageState: " + i10 + ", isJustWalking: " + z9 + ", monthStepsListJson: " + string);
        sharedPageState = i10;
        sharedIsJustWalking = z9;
        sharedAnimType = getAnimType(i10);
        sharedStepCounter = i11;
        sharedTodayPercent = i12;
        sharedSevenDayAverage = i13;
        sharedSevenDayPercent = i14;
        sharedMonthStepsListJson = string;
        showPageState(i10, z9, i11, i12, i13, i14, string);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.pedometerAbnormalTxt.setTextSize(0, (getHeight() / 172.0f) * 20.0f);
        ViewGroup.LayoutParams layoutParams = this.pedometerAnimIv.getLayoutParams();
        n.f(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.width = (int) (getWidth() * 0.55813956f);
        layoutParams2.height = (int) (getWidth() * 0.1627907f);
        this.pedometerAnimIv.setLayoutParams(layoutParams2);
        this.pedometerViewPagerAdapter.setWidthRatio(getWidth() / 172.0f);
        this.pedometerViewPagerAdapter.setHeightRatio(getHeight() / 172.0f);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View changedView, int i10) {
        n.h(changedView, "changedView");
        super.onVisibilityChanged(changedView, i10);
        this.isResumed = i10 == 0;
        if (!hasMessages(1) || this.isResumed) {
            return;
        }
        Log.d(this.TAG, "onVisibilityChanged, animation is interrupted, stop animation...");
        Drawable background = this.pedometerAnimIv.getBackground();
        n.f(background, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
        ((AnimationDrawable) background).stop();
        setViewPagerShow(true);
        this.pedometerAnimIv.setVisibility(8);
        removeMessages(1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PedometerContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        n.h(context, "context");
    }

    public /* synthetic */ PedometerContainer(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC1457h abstractC1457h) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.nothing.cardwidget.pedometer.PedometerContainer$handler$1] */
    public PedometerContainer(final Context context, AttributeSet attributeSet, int i10) {
        Integer numValueOf;
        boolean z9;
        super(context, attributeSet, i10, 0, 8, null);
        n.h(context, "context");
        this.TAG = "PedometerContainer";
        this.gson = new Gson();
        this.isResumed = true;
        boolean z10 = false;
        this.lastMonthStepsData = new MonthStepsData(AbstractC1444s.p(new PedometerStepsInfo(UtilsKt.getTodayTimeMillis(), -1, 0)));
        J5.a.C0120a c0120a = J5.a.f3535a;
        Iterator it = c0120a.k(attributeSet, N.i(v.a(Integer.valueOf(c0120a.c(context, "leftCircleColor")), Integer.valueOf(R.attr.leftCircleColor)), v.a(Integer.valueOf(c0120a.c(context, "rightDotColor")), Integer.valueOf(R.attr.rightDotColor)), v.a(Integer.valueOf(c0120a.c(context, "human")), Integer.valueOf(R.attr.human)), v.a(Integer.valueOf(c0120a.c(context, "goalNotReachedColor")), Integer.valueOf(R.attr.goalNotReachedColor)), v.a(Integer.valueOf(c0120a.c(context, "goalReachedColor")), Integer.valueOf(R.attr.goalReachedColor)), v.a(Integer.valueOf(c0120a.c(context, "currentDayColor")), Integer.valueOf(R.attr.currentDayColor)), v.a(Integer.valueOf(c0120a.c(context, "weeklyDesColor")), Integer.valueOf(R.attr.weeklyDesColor)), v.a(Integer.valueOf(c0120a.c(context, "totalTodayDes")), Integer.valueOf(R.attr.totalTodayDes)), v.a(Integer.valueOf(c0120a.c(context, "sevenDayAverageDes")), Integer.valueOf(R.attr.sevenDayAverageDes)), v.a(Integer.valueOf(c0120a.c(context, "commonTextColor")), Integer.valueOf(R.attr.commonTextColor)), v.a(Integer.valueOf(c0120a.c(context, "walkingAnimRes")), Integer.valueOf(R.attr.walkingAnimRes)), v.a(Integer.valueOf(c0120a.c(context, "reachGoalAnimRes")), Integer.valueOf(R.attr.reachGoalAnimRes)), v.a(Integer.valueOf(c0120a.c(context, "noPermissionDes")), Integer.valueOf(R.attr.noPermissionDes)), v.a(Integer.valueOf(c0120a.c(context, "noDataDes")), Integer.valueOf(R.attr.noDataDes)), v.a(Integer.valueOf(c0120a.c(context, "goalNotReachedShape")), Integer.valueOf(R.attr.goalNotReachedShape)), v.a(Integer.valueOf(c0120a.c(context, "goalReachedShape")), Integer.valueOf(R.attr.goalReachedShape)), v.a(Integer.valueOf(c0120a.c(context, "currentDayShape")), Integer.valueOf(R.attr.currentDayShape)), v.a(Integer.valueOf(c0120a.c(context, "containerUiType")), Integer.valueOf(R.attr.containerUiType)), v.a(Integer.valueOf(c0120a.c(context, "isSupportAod")), Integer.valueOf(R.attr.isSupportAod)))).entrySet().iterator();
        AnimationDrawable animationDrawable = null;
        String strJ = null;
        String strJ2 = null;
        Integer numValueOf2 = null;
        Integer num = null;
        int iE = -1;
        int iE2 = -1;
        int iE3 = -1;
        int iE4 = -1;
        int iE5 = -1;
        int iE6 = -1;
        int iE7 = -1;
        Integer numValueOf3 = null;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int iIntValue = ((Number) entry.getKey()).intValue();
            Iterator it2 = it;
            if (iIntValue == R.attr.leftCircleColor) {
                if (attributeSet != null) {
                    iE2 = J5.a.f3535a.e(context, attributeSet, ((Number) entry.getValue()).intValue());
                }
            } else if (iIntValue == R.attr.rightDotColor) {
                if (attributeSet != null) {
                    iE3 = J5.a.f3535a.e(context, attributeSet, ((Number) entry.getValue()).intValue());
                }
            } else if (iIntValue == R.attr.human) {
                if (attributeSet != null) {
                    Drawable drawableG = J5.a.f3535a.g(context, attributeSet, ((Number) entry.getValue()).intValue());
                    n.f(drawableG, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
                    animationDrawable = (AnimationDrawable) drawableG;
                }
            } else if (iIntValue == R.attr.goalNotReachedColor) {
                if (attributeSet != null) {
                    iE4 = J5.a.f3535a.e(context, attributeSet, ((Number) entry.getValue()).intValue());
                }
            } else if (iIntValue == R.attr.goalReachedColor) {
                if (attributeSet != null) {
                    iE5 = J5.a.f3535a.e(context, attributeSet, ((Number) entry.getValue()).intValue());
                }
            } else if (iIntValue == R.attr.currentDayColor) {
                if (attributeSet != null) {
                    iE6 = J5.a.f3535a.e(context, attributeSet, ((Number) entry.getValue()).intValue());
                }
            } else if (iIntValue == R.attr.weeklyDesColor) {
                if (attributeSet != null) {
                    iE7 = J5.a.f3535a.e(context, attributeSet, ((Number) entry.getValue()).intValue());
                }
            } else if (iIntValue == R.attr.totalTodayDes) {
                if (attributeSet != null) {
                    strJ = J5.a.f3535a.j(context, attributeSet, ((Number) entry.getValue()).intValue());
                }
            } else if (iIntValue == R.attr.sevenDayAverageDes) {
                if (attributeSet != null) {
                    strJ2 = J5.a.f3535a.j(context, attributeSet, ((Number) entry.getValue()).intValue());
                }
            } else if (iIntValue == R.attr.commonTextColor) {
                if (attributeSet != null) {
                    iE = J5.a.f3535a.e(context, attributeSet, ((Number) entry.getValue()).intValue());
                }
            } else if (iIntValue == R.attr.walkingAnimRes) {
                if (attributeSet != null) {
                    this.walkingAnimRes = J5.a.f3535a.g(context, attributeSet, ((Number) entry.getValue()).intValue());
                }
            } else if (iIntValue == R.attr.reachGoalAnimRes) {
                if (attributeSet != null) {
                    this.reachGoalAnimRes = J5.a.f3535a.g(context, attributeSet, ((Number) entry.getValue()).intValue());
                }
            } else if (iIntValue != R.attr.noPermissionDes) {
                if (iIntValue != R.attr.noDataDes) {
                    numValueOf = num;
                    if (iIntValue == R.attr.currentDayShape) {
                        if (attributeSet != null) {
                            numValueOf3 = Integer.valueOf(J5.a.f3535a.i(context, attributeSet, ((Number) entry.getValue()).intValue(), 3));
                        }
                    } else if (iIntValue == R.attr.goalReachedShape) {
                        if (attributeSet != null) {
                            numValueOf2 = Integer.valueOf(J5.a.f3535a.i(context, attributeSet, ((Number) entry.getValue()).intValue(), 3));
                        }
                    } else if (iIntValue == R.attr.goalNotReachedShape) {
                        if (attributeSet != null) {
                            numValueOf = Integer.valueOf(J5.a.f3535a.i(context, attributeSet, ((Number) entry.getValue()).intValue(), 3));
                        }
                    } else if (iIntValue != R.attr.containerUiType) {
                        z9 = false;
                        if (iIntValue == R.attr.isSupportAod && attributeSet != null) {
                            this.isSupportAod = J5.a.f3535a.i(context, attributeSet, ((Number) entry.getValue()).intValue(), 0);
                        }
                    } else if (attributeSet != null) {
                        z9 = false;
                        this.containerType = J5.a.f3535a.i(context, attributeSet, ((Number) entry.getValue()).intValue(), 0);
                    }
                    z9 = false;
                } else if (attributeSet != null) {
                    this.noDataDes = J5.a.f3535a.j(context, attributeSet, ((Number) entry.getValue()).intValue());
                }
                z10 = z9;
                it = it2;
                num = numValueOf;
            } else if (attributeSet != null) {
                this.noPermissionDes = J5.a.f3535a.j(context, attributeSet, ((Number) entry.getValue()).intValue());
            }
            numValueOf = num;
            z9 = false;
            z10 = z9;
            it = it2;
            num = numValueOf;
        }
        Integer num2 = num;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pedometer_container, this, z10);
        int i11 = R.id.pedometer_viewpager;
        this.pedometerViewpager = (ViewPager2) viewInflate.findViewById(i11);
        this.pedometerAnimIv = (ImageView) viewInflate.findViewById(R.id.pedometer_anim_iv);
        TextView textView = (TextView) viewInflate.findViewById(R.id.abnormal_txt);
        this.pedometerAbnormalTxt = textView;
        textView.setTextColor(iE);
        if (this.isSupportAod == 0) {
            this.pedometerAbnormalTxt.setOnClickListener(new View.OnClickListener() { // from class: com.nothing.cardwidget.pedometer.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PedometerContainer._init_$lambda$21(context, view);
                }
            });
        }
        PedometerViewPagerAdapter pedometerViewPagerAdapter = new PedometerViewPagerAdapter();
        this.pedometerViewPagerAdapter = pedometerViewPagerAdapter;
        pedometerViewPagerAdapter.setLeftCircleColor(iE2);
        this.pedometerViewPagerAdapter.setRightDotColor(iE3);
        this.pedometerViewPagerAdapter.setBgHuman(animationDrawable);
        this.pedometerViewPagerAdapter.setCommonTextColor(iE);
        this.pedometerViewPagerAdapter.setGoalNotReachedColor(iE4);
        this.pedometerViewPagerAdapter.setGoalReachedColor(iE5);
        this.pedometerViewPagerAdapter.setCurrentDayColor(iE6);
        this.pedometerViewPagerAdapter.setWeeklyDesColor(iE7);
        this.pedometerViewPagerAdapter.setTotalTodayDesStr(strJ);
        this.pedometerViewPagerAdapter.setSevenDayAverageDesStr(strJ2);
        this.pedometerViewPagerAdapter.setCurrentDayShape(numValueOf3);
        this.pedometerViewPagerAdapter.setGoalReachedShape(numValueOf2);
        this.pedometerViewPagerAdapter.setGoalNotReachedShape(num2);
        this.pedometerViewPagerAdapter.setContainerType(this.containerType);
        this.pedometerViewpager.setPageTransformer(new MarginPageTransformer(0));
        this.pedometerViewpager.setAdapter(this.pedometerViewPagerAdapter);
        this.pedometerViewpager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() { // from class: com.nothing.cardwidget.pedometer.PedometerContainer.3
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int i12) {
                super.onPageSelected(i12);
                PedometerContainer.maybeUpdateWalkingPercent$default(PedometerContainer.this, i12, 0, false, 6, null);
                PedometerContainer pedometerContainer = PedometerContainer.this;
                Bundle bundle = new Bundle();
                bundle.putString(Constants.KEY_METHOD_NAME, Constants.METHOD_PAGE_SELECTED);
                bundle.putInt(Constants.KEY_SELECTED_POSITION, i12);
                pedometerContainer.callRemoteService(bundle);
            }
        });
        NTPageIndicatorDot nTPageIndicatorDot = (NTPageIndicatorDot) viewInflate.findViewById(R.id.pedometer_page_indicator);
        this.pedometerPageIndicator = nTPageIndicatorDot;
        nTPageIndicatorDot.setPageListener(i11);
        addView(viewInflate);
        final Looper mainLooper = Looper.getMainLooper();
        this.handler = new Handler(mainLooper) { // from class: com.nothing.cardwidget.pedometer.PedometerContainer$handler$1
            @Override // android.os.Handler
            public void handleMessage(Message msg) {
                n.h(msg, "msg");
                super.handleMessage(msg);
                if (msg.what == 1) {
                    this.this$0.setViewPagerShow(true);
                    this.this$0.pedometerAnimIv.setVisibility(8);
                    if (this.this$0.isResumed) {
                        Object obj = msg.obj;
                        n.f(obj, "null cannot be cast to non-null type kotlin.Int");
                        AbstractC0816i.d(g.j(), null, null, new PedometerContainer$handler$1$handleMessage$1(this.this$0, ((Integer) obj).intValue(), null), 3, null);
                        PedometerContainer pedometerContainer = this.this$0;
                        PedometerContainer.maybeUpdateWalkingPercent$default(pedometerContainer, pedometerContainer.pedometerViewpager.getCurrentItem(), 0, false, 6, null);
                    }
                }
            }
        };
    }
}
