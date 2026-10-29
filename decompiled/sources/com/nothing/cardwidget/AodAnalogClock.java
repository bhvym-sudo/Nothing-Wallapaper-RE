package com.nothing.cardwidget;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import java.time.Clock;
import java.time.DateTimeException;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Formatter;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.v;
import p089i8.N;

/* JADX INFO: loaded from: classes.dex */
public final class AodAnalogClock extends View implements AlarmManager.OnAlarmListener {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "AodAnalogClock";
    private AlarmManager alarmManager;
    private L5.a alarmTimeOut;
    private boolean mChanged;
    private Clock mClock;
    private Drawable mDial;
    private int mDialHeight;
    private final TintInfo mDialTintInfo;
    private int mDialWidth;
    private float mHour;
    private Drawable mHourHand;
    private final TintInfo mHourHandTintInfo;
    private Drawable mMinuteHand;
    private final TintInfo mMinuteHandTintInfo;
    private float mMinutes;
    private Drawable mSecondHand;
    private final TintInfo mSecondHandTintInfo;
    private float mSeconds;
    private final int mSecondsHandFps;
    private final Runnable mTick;
    private ZoneId mTimeZone;
    private boolean mVisible;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1457h abstractC1457h) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ZoneId toZoneId(String str) {
            if (str == null) {
                return null;
            }
            try {
                return ZoneId.of(str);
            } catch (DateTimeException e10) {
                Log.w(AodAnalogClock.TAG, "Failed to parse time zone from " + str, e10);
                return null;
            }
        }

        private Companion() {
        }
    }

    private final class TintInfo {
        private boolean mHasTintBlendMode;
        private boolean mHasTintList;
        private BlendMode mTintBlendMode;
        private ColorStateList mTintList;

        public TintInfo() {
        }

        public final Drawable apply(Drawable drawable) {
            if (drawable == null) {
                return null;
            }
            Drawable drawableMutate = drawable.mutate();
            n.g(drawableMutate, "mutate(...)");
            if (this.mHasTintList) {
                drawableMutate.setTintList(this.mTintList);
            }
            if (this.mHasTintBlendMode) {
                drawableMutate.setTintBlendMode(this.mTintBlendMode);
            }
            if (drawable.isStateful()) {
                drawableMutate.setState(AodAnalogClock.this.getDrawableState());
            }
            return drawableMutate;
        }

        public final boolean getMHasTintBlendMode() {
            return this.mHasTintBlendMode;
        }

        public final boolean getMHasTintList() {
            return this.mHasTintList;
        }

        public final BlendMode getMTintBlendMode() {
            return this.mTintBlendMode;
        }

        public final ColorStateList getMTintList() {
            return this.mTintList;
        }

        public final void setMHasTintBlendMode(boolean z9) {
            this.mHasTintBlendMode = z9;
        }

        public final void setMHasTintList(boolean z9) {
            this.mHasTintList = z9;
        }

        public final void setMTintBlendMode(BlendMode blendMode) {
            this.mTintBlendMode = blendMode;
        }

        public final void setMTintList(ColorStateList colorStateList) {
            this.mTintList = colorStateList;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"UseCompatLoadingForDrawables"})
    public AodAnalogClock(Context context, AttributeSet attrs) {
        this(context, attrs, 0, 0, 12, null);
        n.h(context, "context");
        n.h(attrs, "attrs");
    }

    private final void createClock() {
        ZoneId zoneId = this.mTimeZone;
        this.mClock = zoneId == null ? Clock.systemDefaultZone() : Clock.system(zoneId);
    }

    private final void onInvisible() {
        if (this.mVisible) {
            L5.a aVar = this.alarmTimeOut;
            if (aVar != null) {
                aVar.a();
            }
            this.mVisible = false;
        }
    }

    private final void onVisibilityChanged(boolean z9) {
        if (z9) {
            onVisible();
        } else {
            onInvisible();
        }
    }

    private final void onVisible() {
        if (this.mVisible) {
            return;
        }
        this.mVisible = true;
        this.mTick.run();
    }

    private final void updateContentDescription(long j9) {
        String string = DateUtils.formatDateRange(getContext(), new Formatter(new StringBuilder(50), Locale.getDefault()), j9, j9, 129, getTimeZone()).toString();
        n.g(string, "toString(...)");
        setContentDescription(string);
    }

    public final BlendMode getDialTintBlendMode() {
        return this.mDialTintInfo.getMTintBlendMode();
    }

    public final ColorStateList getDialTintList() {
        return this.mDialTintInfo.getMTintList();
    }

    public final BlendMode getHourHandTintBlendMode() {
        return this.mHourHandTintInfo.getMTintBlendMode();
    }

    public final ColorStateList getHourHandTintList() {
        return this.mHourHandTintInfo.getMTintList();
    }

    public final BlendMode getMinuteHandTintBlendMode() {
        return this.mMinuteHandTintInfo.getMTintBlendMode();
    }

    public final ColorStateList getMinuteHandTintList() {
        return this.mMinuteHandTintInfo.getMTintList();
    }

    public final String getTimeZone() {
        ZoneId zoneId = this.mTimeZone;
        if (zoneId != null) {
            return zoneId.getId();
        }
        return null;
    }

    protected final Instant now() {
        Clock clock = this.mClock;
        n.e(clock);
        Instant instant = clock.instant();
        n.g(instant, "instant(...)");
        return instant;
    }

    @Override // android.app.AlarmManager.OnAlarmListener
    public void onAlarm() {
        Log.i(TAG, "Call onAlarm, time = " + System.currentTimeMillis());
        this.mTick.run();
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        onVisibilityChanged(true);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        onVisibilityChanged(false);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        n.h(canvas, "canvas");
        super.onDraw(canvas);
        boolean z9 = this.mChanged;
        boolean z10 = false;
        if (z9) {
            this.mChanged = false;
        }
        int width = getWidth();
        int height = getHeight();
        int i10 = width / 2;
        int i11 = height / 2;
        Drawable drawable = this.mDial;
        n.e(drawable);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (width < intrinsicWidth || height < intrinsicHeight) {
            float fMin = Math.min(width / intrinsicWidth, height / intrinsicHeight);
            canvas.save();
            canvas.scale(fMin, fMin, i10, i11);
            z10 = true;
        }
        if (z9) {
            int i12 = intrinsicWidth / 2;
            int i13 = intrinsicHeight / 2;
            drawable.setBounds(i10 - i12, i11 - i13, i12 + i10, i13 + i11);
        }
        drawable.draw(canvas);
        canvas.save();
        float f10 = i10;
        float f11 = i11;
        canvas.rotate((this.mHour / 12.0f) * 360.0f, f10, f11);
        Drawable drawable2 = this.mHourHand;
        if (z9) {
            n.e(drawable2);
            int intrinsicWidth2 = drawable2.getIntrinsicWidth() / 2;
            int intrinsicHeight2 = drawable2.getIntrinsicHeight() / 2;
            drawable2.setBounds(i10 - intrinsicWidth2, i11 - intrinsicHeight2, intrinsicWidth2 + i10, intrinsicHeight2 + i11);
        }
        n.e(drawable2);
        drawable2.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.rotate((this.mMinutes / 60.0f) * 360.0f, f10, f11);
        Drawable drawable3 = this.mMinuteHand;
        if (z9) {
            n.e(drawable3);
            int intrinsicWidth3 = drawable3.getIntrinsicWidth() / 2;
            int intrinsicHeight3 = drawable3.getIntrinsicHeight() / 2;
            drawable3.setBounds(i10 - intrinsicWidth3, i11 - intrinsicHeight3, intrinsicWidth3 + i10, intrinsicHeight3 + i11);
        }
        n.e(drawable3);
        drawable3.draw(canvas);
        canvas.restore();
        Drawable drawable4 = this.mSecondHand;
        if (drawable4 != null && this.mSecondsHandFps > 0) {
            canvas.save();
            canvas.rotate((this.mSeconds / 60.0f) * 360.0f, f10, f11);
            if (z9) {
                int intrinsicWidth4 = drawable4.getIntrinsicWidth() / 2;
                int intrinsicHeight4 = drawable4.getIntrinsicHeight() / 2;
                drawable4.setBounds(i10 - intrinsicWidth4, i11 - intrinsicHeight4, i10 + intrinsicWidth4, i11 + intrinsicHeight4);
            }
            drawable4.draw(canvas);
            canvas.restore();
        }
        if (z10) {
            canvas.restore();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        float f10 = 1.0f;
        float f11 = (mode == 0 || size >= (i13 = this.mDialWidth)) ? 1.0f : size / i13;
        if (mode2 != 0 && size2 < (i12 = this.mDialHeight)) {
            f10 = size2 / i12;
        }
        float fMin = Math.min(f11, f10);
        setMeasuredDimension(View.resolveSizeAndState((int) (this.mDialWidth * fMin), i10, 0), View.resolveSizeAndState((int) (this.mDialHeight * fMin), i11, 0));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.mChanged = true;
    }

    protected final void onTimeChanged() {
        Instant instantNow = now();
        Clock clock = this.mClock;
        n.e(clock);
        LocalTime localTime = instantNow.atZone(clock.getZone()).toLocalTime();
        n.g(localTime, "toLocalTime(...)");
        onTimeChanged(localTime, instantNow.toEpochMilli());
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z9) {
        super.onVisibilityAggregated(z9);
        if (z9) {
            createClock();
            onTimeChanged();
        }
    }

    public final void setDial(Icon icon) {
        n.h(icon, "icon");
        Drawable drawableLoadDrawable = icon.loadDrawable(getContext());
        this.mDial = drawableLoadDrawable;
        if (drawableLoadDrawable != null) {
            this.mDialWidth = drawableLoadDrawable.getIntrinsicWidth();
            this.mDialHeight = drawableLoadDrawable.getIntrinsicHeight();
            if (this.mDialTintInfo.getMHasTintList() || this.mDialTintInfo.getMHasTintBlendMode()) {
                this.mDial = this.mDialTintInfo.apply(this.mDial);
            }
            this.mChanged = true;
            invalidate();
        }
    }

    public final void setDialTintBlendMode(BlendMode blendMode) {
        this.mDialTintInfo.setMTintBlendMode(blendMode);
        this.mDialTintInfo.setMHasTintBlendMode(true);
        this.mDial = this.mDialTintInfo.apply(this.mDial);
    }

    public final void setDialTintList(ColorStateList colorStateList) {
        this.mDialTintInfo.setMTintList(colorStateList);
        this.mDialTintInfo.setMHasTintList(true);
        this.mDial = this.mDialTintInfo.apply(this.mDial);
    }

    public final void setHourHand(Icon icon) {
        n.h(icon, "icon");
        this.mHourHand = icon.loadDrawable(getContext());
        if (this.mHourHandTintInfo.getMHasTintList() || this.mHourHandTintInfo.getMHasTintBlendMode()) {
            this.mHourHand = this.mHourHandTintInfo.apply(this.mHourHand);
        }
        this.mChanged = true;
        invalidate();
    }

    public final void setHourHandTintBlendMode(BlendMode blendMode) {
        this.mHourHandTintInfo.setMTintBlendMode(blendMode);
        this.mHourHandTintInfo.setMHasTintBlendMode(true);
        this.mHourHand = this.mHourHandTintInfo.apply(this.mHourHand);
    }

    public final void setHourHandTintList(ColorStateList colorStateList) {
        this.mHourHandTintInfo.setMTintList(colorStateList);
        this.mHourHandTintInfo.setMHasTintList(true);
        this.mHourHand = this.mHourHandTintInfo.apply(this.mHourHand);
    }

    public final void setMinuteHand(Icon icon) {
        n.h(icon, "icon");
        this.mMinuteHand = icon.loadDrawable(getContext());
        if (this.mMinuteHandTintInfo.getMHasTintList() || this.mMinuteHandTintInfo.getMHasTintBlendMode()) {
            this.mMinuteHand = this.mMinuteHandTintInfo.apply(this.mMinuteHand);
        }
        this.mChanged = true;
        invalidate();
    }

    public final void setMinuteHandTintBlendMode(BlendMode blendMode) {
        this.mMinuteHandTintInfo.setMTintBlendMode(blendMode);
        this.mMinuteHandTintInfo.setMHasTintBlendMode(true);
        this.mMinuteHand = this.mMinuteHandTintInfo.apply(this.mMinuteHand);
    }

    public final void setMinuteHandTintList(ColorStateList colorStateList) {
        this.mMinuteHandTintInfo.setMTintList(colorStateList);
        this.mMinuteHandTintInfo.setMHasTintList(true);
        this.mMinuteHand = this.mMinuteHandTintInfo.apply(this.mMinuteHand);
    }

    public final void setTimeZone(String timeZone) {
        n.h(timeZone, "timeZone");
        this.mTimeZone = Companion.toZoneId(timeZone);
        createClock();
        onTimeChanged();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"UseCompatLoadingForDrawables"})
    public AodAnalogClock(Context context, AttributeSet attrs, int i10) {
        this(context, attrs, i10, 0, 8, null);
        n.h(context, "context");
        n.h(attrs, "attrs");
    }

    public /* synthetic */ AodAnalogClock(Context context, AttributeSet attributeSet, int i10, int i11, int i12, AbstractC1457h abstractC1457h) {
        this(context, attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTimeChanged(LocalTime localTime, long j9) {
        float f10 = this.mHour;
        float f11 = this.mMinutes;
        float second = localTime.getSecond() + (localTime.getNano() / 1.0E9f);
        int i10 = this.mSecondsHandFps;
        if (i10 > 0) {
            second = Math.round(second * i10) / this.mSecondsHandFps;
        }
        this.mSeconds = second;
        this.mMinutes = localTime.getMinute() + (this.mSeconds / 60.0f);
        float hour = localTime.getHour();
        float f12 = this.mMinutes;
        float f13 = hour + (f12 / 60.0f);
        this.mHour = f13;
        this.mChanged = true;
        if (((int) f10) == ((int) f13) && ((int) f11) == ((int) f12)) {
            return;
        }
        updateContentDescription(j9);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"UseCompatLoadingForDrawables"})
    public AodAnalogClock(Context context, AttributeSet attrs, int i10, int i11) {
        super(context, attrs, i10, i11);
        n.h(context, "context");
        n.h(attrs, "attrs");
        this.mSecondsHandFps = -1;
        this.mHourHandTintInfo = new TintInfo();
        this.mMinuteHandTintInfo = new TintInfo();
        this.mSecondHandTintInfo = new TintInfo();
        this.mDialTintInfo = new TintInfo();
        this.mTick = new Runnable() { // from class: com.nothing.cardwidget.AodAnalogClock$mTick$1
            @Override // java.lang.Runnable
            public void run() {
                long millis;
                if (this.this$0.mVisible) {
                    Instant instantNow = this.this$0.now();
                    Clock clock = this.this$0.mClock;
                    n.e(clock);
                    ZonedDateTime zonedDateTimeAtZone = instantNow.atZone(clock.getZone());
                    LocalTime localTime = zonedDateTimeAtZone.toLocalTime();
                    if (this.this$0.mSecondHand == null || this.this$0.mSecondsHandFps <= 0) {
                        long millis2 = Duration.between(instantNow, zonedDateTimeAtZone.plusMinutes(1L).withSecond(0).toInstant()).toMillis();
                        millis = millis2 <= 0 ? Duration.ofMinutes(1L).toMillis() : millis2;
                    } else {
                        long millis3 = Duration.ofNanos(localTime.getNano()).toMillis();
                        double d10 = ((double) 1000) / ((double) this.this$0.mSecondsHandFps);
                        millis = Math.round(d10 - Math.round(millis3 % d10));
                        if (millis <= 0) {
                            millis = Math.round(d10);
                        }
                    }
                    L5.a aVar = this.this$0.alarmTimeOut;
                    if (aVar != null) {
                        aVar.c(millis, 1);
                    }
                    AodAnalogClock aodAnalogClock = this.this$0;
                    n.e(localTime);
                    aodAnalogClock.onTimeChanged(localTime, instantNow.toEpochMilli());
                    this.this$0.invalidate();
                }
            }
        };
        int[] iArr = R.styleable.AodAnalogClock;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, iArr, i10, i11);
        n.g(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        saveAttributeDataForStyleable(context, iArr, attrs, typedArrayObtainStyledAttributes, i10, i11);
        J5.a.C0120a c0120a = J5.a.f3535a;
        for (Map.Entry entry : c0120a.k(attrs, N.i(v.a(Integer.valueOf(c0120a.c(context, "aod_dial")), Integer.valueOf(R.attr.aod_dial)), v.a(Integer.valueOf(c0120a.c(context, "aod_hand_hour")), Integer.valueOf(R.attr.aod_hand_hour)), v.a(Integer.valueOf(c0120a.c(context, "aod_hand_minute")), Integer.valueOf(R.attr.aod_hand_minute)), v.a(Integer.valueOf(c0120a.c(context, "aod_timeZone")), Integer.valueOf(R.attr.aod_timeZone)))).entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            if (iIntValue == R.attr.aod_dial) {
                Drawable drawableG = J5.a.f3535a.g(context, attrs, ((Number) entry.getValue()).intValue());
                this.mDial = drawableG;
                if (drawableG == null) {
                    this.mDial = context.getDrawable(O5.a.f5888a.a("clock_dial"));
                }
            } else if (iIntValue == R.attr.aod_hand_hour) {
                Drawable drawableG2 = J5.a.f3535a.g(context, attrs, ((Number) entry.getValue()).intValue());
                this.mHourHand = drawableG2;
                if (drawableG2 == null) {
                    this.mHourHand = context.getDrawable(O5.a.f5888a.a("clock_hand_hour"));
                }
            } else if (iIntValue == R.attr.aod_hand_minute) {
                Drawable drawableG3 = J5.a.f3535a.g(context, attrs, ((Number) entry.getValue()).intValue());
                this.mMinuteHand = drawableG3;
                if (drawableG3 == null) {
                    this.mMinuteHand = context.getDrawable(O5.a.f5888a.a("clock_hand_minute"));
                }
            } else if (iIntValue == R.attr.aod_timeZone) {
                this.mTimeZone = Companion.toZoneId(J5.a.f3535a.j(context, attrs, ((Number) entry.getValue()).intValue()));
            }
        }
        createClock();
        Drawable drawable = this.mDial;
        this.mDialWidth = drawable != null ? drawable.getIntrinsicWidth() : -1;
        Drawable drawable2 = this.mDial;
        this.mDialHeight = drawable2 != null ? drawable2.getIntrinsicHeight() : -1;
        Object systemService = context.getApplicationContext().getSystemService("alarm");
        AlarmManager alarmManager = systemService instanceof AlarmManager ? (AlarmManager) systemService : null;
        this.alarmManager = alarmManager;
        if (alarmManager != null) {
            AlarmManager alarmManager2 = this.alarmManager;
            n.e(alarmManager2);
            this.alarmTimeOut = new L5.a(alarmManager2, this, TAG, getHandler());
        }
    }
}
