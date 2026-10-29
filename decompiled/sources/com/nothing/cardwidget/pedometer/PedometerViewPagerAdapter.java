package com.nothing.cardwidget.pedometer;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nothing.cardwidget.R;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
public final class PedometerViewPagerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final Companion Companion = new Companion(null);
    private static final int DESIGN_COMMON_MARGIN = 16;
    private static final int DESIGN_HUMAN_HEIGHT = 34;
    private static final int DESIGN_HUMAN_WIDTH = 24;
    private static final int DESIGN_LEFT_GAP = 8;
    private static final int DESIGN_PERCENT_MARGIN_TOP = 16;
    private static final int DESIGN_TOTAL_WIDTH = 172;
    private static final int DESIGN_WALKING_PROGRESS_HEIGHT = 4;
    private static final float FLOAT_50 = 50.0f;
    private static final long FRAME_ANIM_EXECUTION_CYCLE = 5050;
    private static final String MARK_PERCENT = "%";
    public static final int PEDOMETER_CALENDAR_VIEW = 2;
    public static final int PEDOMETER_DIGITAL_VIEW = 1;
    public static final int PEDOMETER_WALKING_VIEW = 0;
    public static final String TAG = "PedometerAdapter";
    private AnimationDrawable bgHuman;
    private int containerType;
    private Integer currentDayShape;
    private final DecimalFormat digitalFormat;
    private Integer goalNotReachedShape;
    private Integer goalReachedShape;
    private float heightRatio;
    private List<PedometerData> pedometerDataList;
    private String sevenDayAverageDesStr;
    private String totalTodayDesStr;
    private PedometerWalkingViewHolder walkingViewHolder;
    private float widthRatio;
    private int goalNotReachedColor = -1;
    private int goalReachedColor = -1;
    private int currentDayColor = -1;
    private int weeklyDesColor = -1;
    private int commonTextColor = -1;
    private int leftCircleColor = -1;
    private int rightDotColor = -1;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1457h abstractC1457h) {
            this();
        }

        private Companion() {
        }
    }

    public final class PedometerCalendarViewHolder extends RecyclerView.ViewHolder {
        private final PedometerCalendarView pedometerCalendar;
        final /* synthetic */ PedometerViewPagerAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PedometerCalendarViewHolder(PedometerViewPagerAdapter pedometerViewPagerAdapter, View itemView) {
            super(itemView);
            n.h(itemView, "itemView");
            this.this$0 = pedometerViewPagerAdapter;
            View viewFindViewById = itemView.findViewById(R.id.pedometer_calendar);
            n.g(viewFindViewById, "findViewById(...)");
            this.pedometerCalendar = (PedometerCalendarView) viewFindViewById;
        }

        public final void bindData(PedometerData data) {
            n.h(data, "data");
            if ((data instanceof MonthStepsData ? (MonthStepsData) data : null) != null) {
                PedometerViewPagerAdapter pedometerViewPagerAdapter = this.this$0;
                this.pedometerCalendar.setFixRatio(pedometerViewPagerAdapter.widthRatio);
                this.pedometerCalendar.setCurrentDayColor(pedometerViewPagerAdapter.getCurrentDayColor());
                this.pedometerCalendar.setGoalReachedColor(pedometerViewPagerAdapter.getGoalReachedColor());
                this.pedometerCalendar.setGoalNotReachedColor(pedometerViewPagerAdapter.getGoalNotReachedColor());
                this.pedometerCalendar.setWeeklyDesColor(pedometerViewPagerAdapter.getWeeklyDesColor());
                Integer goalNotReachedShape = pedometerViewPagerAdapter.getGoalNotReachedShape();
                if (goalNotReachedShape != null) {
                    this.pedometerCalendar.setGoalNotReachedShape(goalNotReachedShape.intValue());
                }
                Integer goalReachedShape = pedometerViewPagerAdapter.getGoalReachedShape();
                if (goalReachedShape != null) {
                    this.pedometerCalendar.setGoalReachedShape(goalReachedShape.intValue());
                }
                Integer currentDayShape = pedometerViewPagerAdapter.getCurrentDayShape();
                if (currentDayShape != null) {
                    this.pedometerCalendar.setCurrentDayShape(currentDayShape.intValue());
                }
                this.pedometerCalendar.onDataChanged(((MonthStepsData) data).getMonthStepsList());
            }
        }
    }

    public final class PedometerDigitalViewHolder extends RecyclerView.ViewHolder {
        private final TextView sevenDayAverageDes;
        private final TextView sevenDayAverageReachPercent;
        private final TextView sevenDayAverageValue;
        private final LinearLayout sevenDaysStepsLayout;
        final /* synthetic */ PedometerViewPagerAdapter this$0;
        private final TextView todayStepsDes;
        private final LinearLayout todayStepsLayout;
        private final TextView todayStepsReachPercent;
        private final TextView todayStepsValue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PedometerDigitalViewHolder(PedometerViewPagerAdapter pedometerViewPagerAdapter, View itemView) {
            super(itemView);
            n.h(itemView, "itemView");
            this.this$0 = pedometerViewPagerAdapter;
            View viewFindViewById = itemView.findViewById(R.id.today_steps_value_txt);
            n.g(viewFindViewById, "findViewById(...)");
            TextView textView = (TextView) viewFindViewById;
            this.todayStepsValue = textView;
            View viewFindViewById2 = itemView.findViewById(R.id.today_steps_des_txt);
            n.g(viewFindViewById2, "findViewById(...)");
            TextView textView2 = (TextView) viewFindViewById2;
            this.todayStepsDes = textView2;
            View viewFindViewById3 = itemView.findViewById(R.id.today_steps_reach_percent_txt);
            n.g(viewFindViewById3, "findViewById(...)");
            TextView textView3 = (TextView) viewFindViewById3;
            this.todayStepsReachPercent = textView3;
            View viewFindViewById4 = itemView.findViewById(R.id.seven_day_average_value_txt);
            n.g(viewFindViewById4, "findViewById(...)");
            TextView textView4 = (TextView) viewFindViewById4;
            this.sevenDayAverageValue = textView4;
            View viewFindViewById5 = itemView.findViewById(R.id.seven_day_average_reach_percent_txt);
            n.g(viewFindViewById5, "findViewById(...)");
            TextView textView5 = (TextView) viewFindViewById5;
            this.sevenDayAverageReachPercent = textView5;
            View viewFindViewById6 = itemView.findViewById(R.id.seven_day_average_des_txt);
            n.g(viewFindViewById6, "findViewById(...)");
            TextView textView6 = (TextView) viewFindViewById6;
            this.sevenDayAverageDes = textView6;
            View viewFindViewById7 = itemView.findViewById(R.id.ll_today_steps);
            n.g(viewFindViewById7, "findViewById(...)");
            this.todayStepsLayout = (LinearLayout) viewFindViewById7;
            View viewFindViewById8 = itemView.findViewById(R.id.ll_seven_day_average_steps);
            n.g(viewFindViewById8, "findViewById(...)");
            this.sevenDaysStepsLayout = (LinearLayout) viewFindViewById8;
            textView2.setText(pedometerViewPagerAdapter.getTotalTodayDesStr());
            textView6.setText(pedometerViewPagerAdapter.getSevenDayAverageDesStr());
            textView.setTextColor(pedometerViewPagerAdapter.getCommonTextColor());
            textView2.setTextColor(pedometerViewPagerAdapter.getCommonTextColor());
            textView3.setTextColor(pedometerViewPagerAdapter.getCommonTextColor());
            textView4.setTextColor(pedometerViewPagerAdapter.getCommonTextColor());
            textView5.setTextColor(pedometerViewPagerAdapter.getCommonTextColor());
            textView6.setTextColor(pedometerViewPagerAdapter.getCommonTextColor());
            textView.setTextSize(0, pedometerViewPagerAdapter.widthRatio * 30.0f);
            textView4.setTextSize(0, pedometerViewPagerAdapter.widthRatio * 30.0f);
            textView3.setTextSize(0, pedometerViewPagerAdapter.widthRatio * 11.0f);
            textView5.setTextSize(0, pedometerViewPagerAdapter.widthRatio * 11.0f);
            textView6.setTextSize(0, pedometerViewPagerAdapter.widthRatio * 11.0f);
            textView2.setTextSize(0, pedometerViewPagerAdapter.widthRatio * 11.0f);
            setViewMargin();
        }

        private final void setViewMargin() {
            int i10 = (int) (16 * this.this$0.heightRatio);
            int i11 = (int) (4 * this.this$0.heightRatio);
            ViewGroup.LayoutParams layoutParams = this.todayStepsLayout.getLayoutParams();
            n.f(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.setMargins(i10, i11, i10, 0);
            this.todayStepsLayout.setLayoutParams(layoutParams2);
            ViewGroup.LayoutParams layoutParams3 = this.sevenDaysStepsLayout.getLayoutParams();
            n.f(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
            layoutParams4.setMargins(i10, 0, i10, i10);
            this.sevenDaysStepsLayout.setLayoutParams(layoutParams4);
            ViewGroup.LayoutParams layoutParams5 = this.todayStepsValue.getLayoutParams();
            n.f(layoutParams5, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) layoutParams5;
            layoutParams6.setMargins(i10, i10, i10, 0);
            this.todayStepsValue.setLayoutParams(layoutParams6);
            ViewGroup.LayoutParams layoutParams7 = this.sevenDayAverageValue.getLayoutParams();
            n.f(layoutParams7, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams8 = (RelativeLayout.LayoutParams) layoutParams7;
            layoutParams8.setMargins(i10, 0, i10, i11);
            this.sevenDayAverageValue.setLayoutParams(layoutParams8);
        }

        public final void bindData(PedometerData data) {
            String str;
            n.h(data, "data");
            if ((data instanceof DigitalData ? (DigitalData) data : null) != null) {
                PedometerViewPagerAdapter pedometerViewPagerAdapter = this.this$0;
                DigitalData digitalData = (DigitalData) data;
                this.todayStepsValue.setText(pedometerViewPagerAdapter.digitalFormat.format(Integer.valueOf(digitalData.getStepCounter())));
                this.sevenDayAverageValue.setText(pedometerViewPagerAdapter.digitalFormat.format(Integer.valueOf(digitalData.getSevenDayAverage())));
                TextView textView = this.todayStepsReachPercent;
                String str2 = "";
                if (digitalData.getStepCounter() > 0) {
                    str = digitalData.getTodayPercent() + PedometerViewPagerAdapter.MARK_PERCENT;
                } else {
                    str = "";
                }
                textView.setText(str);
                TextView textView2 = this.sevenDayAverageReachPercent;
                if (digitalData.getSevenDayAverage() > 0) {
                    str2 = digitalData.getSevenDayPercent() + PedometerViewPagerAdapter.MARK_PERCENT;
                }
                textView2.setText(str2);
            }
        }
    }

    public final class PedometerWalkingViewHolder extends RecyclerView.ViewHolder {
        private ValueAnimator bgAnimator;
        private Handler handler;
        private ValueAnimator humanAnimator;
        private ImageView humanView;
        private boolean isRtl;
        private float leftGap;
        final /* synthetic */ PedometerViewPagerAdapter this$0;
        private TextView todayPercent;
        private PedometerWalkingBgView walkingBgView;
        private float walkingRange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PedometerWalkingViewHolder(PedometerViewPagerAdapter pedometerViewPagerAdapter, View itemView) {
            super(itemView);
            n.h(itemView, "itemView");
            this.this$0 = pedometerViewPagerAdapter;
            View viewFindViewById = itemView.findViewById(R.id.walking_bg_view);
            n.g(viewFindViewById, "findViewById(...)");
            this.walkingBgView = (PedometerWalkingBgView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R.id.human_view);
            n.g(viewFindViewById2, "findViewById(...)");
            this.humanView = (ImageView) viewFindViewById2;
            View viewFindViewById3 = itemView.findViewById(R.id.tv_today_percent);
            n.g(viewFindViewById3, "findViewById(...)");
            this.todayPercent = (TextView) viewFindViewById3;
            this.handler = new Handler(Looper.getMainLooper());
            int i10 = (int) (24 * pedometerViewPagerAdapter.widthRatio);
            ViewGroup.LayoutParams layoutParams = this.humanView.getLayoutParams();
            n.f(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.width = i10;
            layoutParams2.height = (int) (34 * pedometerViewPagerAdapter.heightRatio);
            this.humanView.setLayoutParams(layoutParams2);
            AnimationDrawable bgHuman = pedometerViewPagerAdapter.getBgHuman();
            if (bgHuman != null) {
                this.humanView.setBackground(bgHuman);
            }
            this.todayPercent.setTextColor(pedometerViewPagerAdapter.getLeftCircleColor());
            ViewGroup.LayoutParams layoutParams3 = this.todayPercent.getLayoutParams();
            n.f(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
            layoutParams4.topMargin = (int) (16 * pedometerViewPagerAdapter.heightRatio);
            this.todayPercent.setLayoutParams(layoutParams4);
            ViewGroup.LayoutParams layoutParams5 = this.walkingBgView.getLayoutParams();
            n.f(layoutParams5, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) layoutParams5;
            layoutParams6.height = (int) (4 * pedometerViewPagerAdapter.heightRatio);
            this.walkingBgView.setLayoutParams(layoutParams6);
            this.walkingBgView.init(i10, pedometerViewPagerAdapter.getLeftCircleColor(), pedometerViewPagerAdapter.getRightDotColor());
            this.leftGap = 8 * pedometerViewPagerAdapter.widthRatio;
            this.walkingRange = (156 * pedometerViewPagerAdapter.widthRatio) - i10;
            setHumanProgress(0.0f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bindData$lambda$5$lambda$4(PedometerWalkingViewHolder this$0) {
            n.h(this$0, "this$0");
            this$0.humanView.setVisibility(0);
            Context context = this$0.walkingBgView.getContext();
            n.g(context, "getContext(...)");
            boolean zIsRtl = UtilsKt.isRtl(context);
            this$0.isRtl = zIsRtl;
            if (zIsRtl) {
                this$0.humanView.setRotationY(180.0f);
            }
            this$0.walkingBgView.refreshRtl(this$0.isRtl);
            this$0.update();
        }

        private final void setHumanProgress(float f10) {
            float f11 = ((this.walkingRange * f10) / 100) + this.leftGap;
            ImageView imageView = this.humanView;
            if (this.isRtl) {
                f11 = -f11;
            }
            imageView.setTranslationX(f11);
        }

        private final void startWalking() {
            if (this.this$0.isAod()) {
                Drawable background = this.humanView.getBackground();
                n.f(background, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
                AnimationDrawable animationDrawable = (AnimationDrawable) background;
                animationDrawable.stop();
                animationDrawable.selectDrawable(0);
                return;
            }
            Drawable background2 = this.humanView.getBackground();
            n.f(background2, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
            final AnimationDrawable animationDrawable2 = (AnimationDrawable) background2;
            if (!animationDrawable2.isRunning()) {
                animationDrawable2.start();
            }
            Log.d(PedometerViewPagerAdapter.TAG, "startWalking " + this.handler + ", " + animationDrawable2);
            this.handler.removeMessages(0);
            this.handler.postDelayed(new Runnable() { // from class: com.nothing.cardwidget.pedometer.c
                @Override // java.lang.Runnable
                public final void run() {
                    PedometerViewPagerAdapter.PedometerWalkingViewHolder.startWalking$lambda$15(animationDrawable2, this);
                }
            }, PedometerViewPagerAdapter.FRAME_ANIM_EXECUTION_CYCLE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void startWalking$lambda$15(AnimationDrawable animDrawable, PedometerWalkingViewHolder this$0) {
            n.h(animDrawable, "$animDrawable");
            n.h(this$0, "this$0");
            animDrawable.stop();
            animDrawable.selectDrawable(0);
            Log.d(PedometerViewPagerAdapter.TAG, "stopWalking " + this$0.handler + ", " + animDrawable);
        }

        private final void update() {
            WalkingData walkingData = this.this$0.getWalkingData();
            if (walkingData != null) {
                PedometerViewPagerAdapter pedometerViewPagerAdapter = this.this$0;
                if (walkingData.isJustWalking() && walkingData.isAnimateValid()) {
                    startWalking();
                }
                walkingData.setJustWalking(false);
                if (walkingData.getWalkingPercent() < 100) {
                    if (walkingData.getRefreshProgress()) {
                        walkingData.setRefreshProgress(false);
                        updateBeforeComplete((walkingData.getWalkingPercent() - walkingData.getCurrentProgress() < 5 || pedometerViewPagerAdapter.isAod()) ? -1 : walkingData.getCurrentProgress());
                        return;
                    }
                    return;
                }
                ValueAnimator valueAnimator = this.bgAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = this.humanAnimator;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                updateAfterComplete(walkingData.getWalkingPercent());
                walkingData.setCurrentProgress(walkingData.getWalkingPercent());
            }
        }

        private final void updateAfterComplete(int i10) {
            this.walkingBgView.setVisibility(4);
            if (i10 > 100) {
                this.todayPercent.setVisibility(0);
                this.todayPercent.setText(i10 + PedometerViewPagerAdapter.MARK_PERCENT);
                this.humanView.setTranslationY(((float) (-21)) * this.this$0.heightRatio);
            } else {
                this.todayPercent.setVisibility(8);
                this.humanView.setTranslationY(0.0f);
            }
            setHumanProgress(PedometerViewPagerAdapter.FLOAT_50);
        }

        private final void updateBeforeComplete(int i10) {
            WalkingData walkingData = this.this$0.getWalkingData();
            if (walkingData != null) {
                final PedometerViewPagerAdapter pedometerViewPagerAdapter = this.this$0;
                if (this.humanView.getTranslationY() != 0.0f) {
                    this.humanView.setTranslationY(0.0f);
                }
                this.walkingBgView.setVisibility(0);
                this.todayPercent.setVisibility(4);
                if (i10 < 0) {
                    ValueAnimator valueAnimator = this.bgAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator valueAnimator2 = this.humanAnimator;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    setHumanProgress(walkingData.getWalkingPercent());
                    this.walkingBgView.setProgress(walkingData.getWalkingPercent());
                    walkingData.setCurrentProgress(walkingData.getWalkingPercent());
                    return;
                }
                ValueAnimator valueAnimator3 = this.bgAnimator;
                if (valueAnimator3 != null) {
                    if (!valueAnimator3.isRunning()) {
                        valueAnimator3 = null;
                    }
                    if (valueAnimator3 != null) {
                        return;
                    }
                }
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i10, walkingData.getWalkingPercent());
                this.bgAnimator = valueAnimatorOfInt;
                if (valueAnimatorOfInt != null) {
                    valueAnimatorOfInt.setDuration(PedometerViewPagerAdapter.FRAME_ANIM_EXECUTION_CYCLE);
                    valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
                    valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.nothing.cardwidget.pedometer.d
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                            PedometerViewPagerAdapter.PedometerWalkingViewHolder.updateBeforeComplete$lambda$14$lambda$11$lambda$10(this.f18089a, pedometerViewPagerAdapter, valueAnimator4);
                        }
                    });
                    valueAnimatorOfInt.start();
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(i10, walkingData.getWalkingPercent());
                this.humanAnimator = valueAnimatorOfFloat;
                if (valueAnimatorOfFloat != null) {
                    valueAnimatorOfFloat.setDuration(PedometerViewPagerAdapter.FRAME_ANIM_EXECUTION_CYCLE);
                    valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                    valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.nothing.cardwidget.pedometer.e
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                            PedometerViewPagerAdapter.PedometerWalkingViewHolder.updateBeforeComplete$lambda$14$lambda$13$lambda$12(this.f18091a, valueAnimator4);
                        }
                    });
                    valueAnimatorOfFloat.start();
                }
                startWalking();
            }
        }

        static /* synthetic */ void updateBeforeComplete$default(PedometerWalkingViewHolder pedometerWalkingViewHolder, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = -1;
            }
            pedometerWalkingViewHolder.updateBeforeComplete(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void updateBeforeComplete$lambda$14$lambda$11$lambda$10(PedometerWalkingViewHolder this$0, PedometerViewPagerAdapter this$1, ValueAnimator it) {
            n.h(this$0, "this$0");
            n.h(this$1, "this$1");
            n.h(it, "it");
            Object animatedValue = it.getAnimatedValue();
            n.f(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) animatedValue).intValue();
            this$0.walkingBgView.setProgress(iIntValue);
            WalkingData walkingData = this$1.getWalkingData();
            if (walkingData != null) {
                walkingData.setCurrentProgress(iIntValue);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void updateBeforeComplete$lambda$14$lambda$13$lambda$12(PedometerWalkingViewHolder this$0, ValueAnimator it) {
            n.h(this$0, "this$0");
            n.h(it, "it");
            Object animatedValue = it.getAnimatedValue();
            n.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            this$0.setHumanProgress(((Float) animatedValue).floatValue());
        }

        public final void bindData() {
            WalkingData walkingData = this.this$0.getWalkingData();
            if (walkingData != null) {
                this.walkingBgView.setVisibility(walkingData.getWalkingPercent() >= 100 ? 4 : 0);
                this.walkingBgView.post(new Runnable() { // from class: com.nothing.cardwidget.pedometer.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        PedometerViewPagerAdapter.PedometerWalkingViewHolder.bindData$lambda$5$lambda$4(this.f18092q);
                    }
                });
            }
        }
    }

    public PedometerViewPagerAdapter() {
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.applyPattern("#,###");
        this.digitalFormat = decimalFormat;
        this.pedometerDataList = new ArrayList();
    }

    public final AnimationDrawable getBgHuman() {
        return this.bgHuman;
    }

    public final int getCommonTextColor() {
        return this.commonTextColor;
    }

    public final int getContainerType() {
        return this.containerType;
    }

    public final int getCurrentDayColor() {
        return this.currentDayColor;
    }

    public final Integer getCurrentDayShape() {
        return this.currentDayShape;
    }

    public final int getGoalNotReachedColor() {
        return this.goalNotReachedColor;
    }

    public final Integer getGoalNotReachedShape() {
        return this.goalNotReachedShape;
    }

    public final int getGoalReachedColor() {
        return this.goalReachedColor;
    }

    public final Integer getGoalReachedShape() {
        return this.goalReachedShape;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.pedometerDataList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return i10 == 1 ? 1 : 2;
    }

    public final int getLeftCircleColor() {
        return this.leftCircleColor;
    }

    public final List<PedometerData> getPedometerDataList() {
        return this.pedometerDataList;
    }

    public final int getRightDotColor() {
        return this.rightDotColor;
    }

    public final String getSevenDayAverageDesStr() {
        return this.sevenDayAverageDesStr;
    }

    public final String getTotalTodayDesStr() {
        return this.totalTodayDesStr;
    }

    public final WalkingData getWalkingData() {
        if (this.pedometerDataList.size() > 0) {
            PedometerData pedometerData = this.pedometerDataList.get(0);
            if (pedometerData instanceof WalkingData) {
                return (WalkingData) pedometerData;
            }
        }
        return null;
    }

    public final PedometerWalkingViewHolder getWalkingViewHolder() {
        return this.walkingViewHolder;
    }

    public final int getWeeklyDesColor() {
        return this.weeklyDesColor;
    }

    public final boolean isAod() {
        return this.containerType == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int i10) {
        n.h(holder, "holder");
        int itemViewType = getItemViewType(i10);
        if (itemViewType == 0) {
            PedometerWalkingViewHolder pedometerWalkingViewHolder = (PedometerWalkingViewHolder) holder;
            this.walkingViewHolder = pedometerWalkingViewHolder;
            if (pedometerWalkingViewHolder != null) {
                pedometerWalkingViewHolder.bindData();
                return;
            }
            return;
        }
        if (itemViewType == 1) {
            ((PedometerDigitalViewHolder) holder).bindData(this.pedometerDataList.get(i10));
        } else {
            if (itemViewType != 2) {
                return;
            }
            ((PedometerCalendarViewHolder) holder).bindData(this.pedometerDataList.get(i10));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i10) throws Exception {
        n.h(parent, "parent");
        if (i10 == 0) {
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.pedometer_walking, parent, false);
            n.g(viewInflate, "inflate(...)");
            return new PedometerWalkingViewHolder(this, viewInflate);
        }
        if (i10 == 1) {
            View viewInflate2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.pedometer_digital, parent, false);
            n.g(viewInflate2, "inflate(...)");
            return new PedometerDigitalViewHolder(this, viewInflate2);
        }
        if (i10 != 2) {
            throw new Exception("PedometerViewPagerAdapter no such viewType!!!");
        }
        View viewInflate3 = LayoutInflater.from(parent.getContext()).inflate(R.layout.pedometer_calendar, parent, false);
        n.g(viewInflate3, "inflate(...)");
        return new PedometerCalendarViewHolder(this, viewInflate3);
    }

    public final void setBgHuman(AnimationDrawable animationDrawable) {
        this.bgHuman = animationDrawable;
    }

    public final void setCommonTextColor(int i10) {
        this.commonTextColor = i10;
    }

    public final void setContainerType(int i10) {
        this.containerType = i10;
    }

    public final void setCurrentDayColor(int i10) {
        this.currentDayColor = i10;
    }

    public final void setCurrentDayShape(Integer num) {
        this.currentDayShape = num;
    }

    public final void setGoalNotReachedColor(int i10) {
        this.goalNotReachedColor = i10;
    }

    public final void setGoalNotReachedShape(Integer num) {
        this.goalNotReachedShape = num;
    }

    public final void setGoalReachedColor(int i10) {
        this.goalReachedColor = i10;
    }

    public final void setGoalReachedShape(Integer num) {
        this.goalReachedShape = num;
    }

    public final void setHeightRatio(float f10) {
        this.heightRatio = f10;
    }

    public final void setLeftCircleColor(int i10) {
        this.leftCircleColor = i10;
    }

    public final void setPedometerDataList(List<PedometerData> list) {
        n.h(list, "<set-?>");
        this.pedometerDataList = list;
    }

    public final void setRightDotColor(int i10) {
        this.rightDotColor = i10;
    }

    public final void setSevenDayAverageDesStr(String str) {
        this.sevenDayAverageDesStr = str;
    }

    public final void setTotalTodayDesStr(String str) {
        this.totalTodayDesStr = str;
    }

    public final void setWalkingViewHolder(PedometerWalkingViewHolder pedometerWalkingViewHolder) {
        this.walkingViewHolder = pedometerWalkingViewHolder;
    }

    public final void setWeeklyDesColor(int i10) {
        this.weeklyDesColor = i10;
    }

    public final void setWidthRatio(float f10) {
        this.widthRatio = f10;
    }

    public final void updateAllData(List<PedometerData> pedometerDatas) {
        n.h(pedometerDatas, "pedometerDatas");
        this.pedometerDataList = pedometerDatas;
        notifyDataSetChanged();
    }

    public final void updateDataExcludeMonthStepsList(List<? extends PedometerData> pedometerDatas) {
        n.h(pedometerDatas, "pedometerDatas");
        int i10 = 0;
        for (Object obj : pedometerDatas) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC1444s.t();
            }
            this.pedometerDataList.set(i10, (PedometerData) obj);
            i10 = i11;
        }
        notifyItemRangeChanged(0, pedometerDatas.size());
    }
}
