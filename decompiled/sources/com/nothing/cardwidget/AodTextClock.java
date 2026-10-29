package com.nothing.cardwidget;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.content.Context;
import android.icu.text.DateTimePatternGenerator;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewDebug;
import android.widget.TextView;
import com.nothing.cardwidget.utils.DateFormatUtils;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.v;
import p089i8.N;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"AppCompatCustomView"})
public final class AodTextClock extends TextView implements AlarmManager.OnAlarmListener {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "AodTextClock";
    private AlarmManager alarmManager;
    private L5.a alarmTimeOut;
    private boolean autoLocaleEnable;

    @ViewDebug.ExportedProperty
    private CharSequence format;
    private CharSequence mDescFormat;
    private String mDescFormat12;
    private String mDescFormat24;
    private String mFormat12;
    private String mFormat24;

    @ViewDebug.ExportedProperty
    private boolean mHasSeconds;
    private boolean mRegistered;
    private boolean mShouldRunTicker;
    private boolean mShowCurrentUserTime;
    private boolean mStopTicking;
    private final Runnable mTicker;
    private Calendar mTime;
    private String mTimeZone;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1457h abstractC1457h) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final CharSequence abc(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
            if (charSequence == null) {
                return charSequence2 == null ? charSequence3 : charSequence2;
            }
            return charSequence;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AodTextClock(Context context, AttributeSet attrs) {
        this(context, attrs, 0, 0, 12, null);
        n.h(context, "context");
        n.h(attrs, "attrs");
    }

    private final void chooseFormat() {
        if (is24HourModeEnabled()) {
            Companion companion = Companion;
            CharSequence charSequenceAbc = companion.abc(this.mFormat24, this.mFormat12, getBestDateTimePattern("Hm"));
            this.format = charSequenceAbc;
            this.mDescFormat = companion.abc(this.mDescFormat24, this.mDescFormat12, charSequenceAbc);
        } else {
            Companion companion2 = Companion;
            CharSequence charSequenceAbc2 = companion2.abc(this.mFormat12, this.mFormat24, getBestDateTimePattern("hm"));
            this.format = charSequenceAbc2;
            this.mDescFormat = companion2.abc(this.mDescFormat12, this.mDescFormat24, charSequenceAbc2);
        }
        this.mHasSeconds = DateFormatUtils.INSTANCE.hasSeconds(this.format);
    }

    private final void createTime(String str) {
        this.mTime = str != null ? Calendar.getInstance(TimeZone.getTimeZone(str)) : Calendar.getInstance();
    }

    private final String getBestDateTimePattern(String str) {
        String bestPattern = DateTimePatternGenerator.getInstance(getContext().getResources().getConfiguration().locale).getBestPattern(str);
        n.g(bestPattern, "getBestPattern(...)");
        return bestPattern;
    }

    private final void init() {
        if (this.mFormat12 == null) {
            this.mFormat12 = getBestDateTimePattern("hm");
        }
        if (this.mFormat24 == null) {
            this.mFormat24 = getBestDateTimePattern("Hm");
        }
        createTime(this.mTimeZone);
        chooseFormat();
        Object systemService = getContext().getApplicationContext().getSystemService("alarm");
        AlarmManager alarmManager = systemService instanceof AlarmManager ? (AlarmManager) systemService : null;
        this.alarmManager = alarmManager;
        if (alarmManager != null) {
            AlarmManager alarmManager2 = this.alarmManager;
            n.e(alarmManager2);
            this.alarmTimeOut = new L5.a(alarmManager2, this, TAG, getHandler());
        }
    }

    private final boolean is24HourModeEnabled() {
        return DateFormat.is24HourFormat(getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTimeChanged() {
        Calendar calendar = this.mTime;
        Calendar calendar2 = null;
        if (calendar == null) {
            n.r("mTime");
            calendar = null;
        }
        calendar.setTimeInMillis(System.currentTimeMillis());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(String.valueOf(this.format), this.autoLocaleEnable ? Locale.getDefault() : Locale.ENGLISH);
        Calendar calendar3 = this.mTime;
        if (calendar3 == null) {
            n.r("mTime");
            calendar3 = null;
        }
        simpleDateFormat.setTimeZone(calendar3.getTimeZone());
        setText(simpleDateFormat.format(Long.valueOf(System.currentTimeMillis())));
        CharSequence charSequence = this.mDescFormat;
        Calendar calendar4 = this.mTime;
        if (calendar4 == null) {
            n.r("mTime");
            calendar4 = null;
        }
        setContentDescription(DateFormat.format(charSequence, calendar4));
        Calendar calendar5 = this.mTime;
        if (calendar5 == null) {
            n.r("mTime");
        } else {
            calendar2 = calendar5;
        }
        Log.i(TAG, "Call onTimeChanged, time = " + calendar2.getTimeInMillis() + ", text = " + ((Object) getText()));
    }

    private final void onVisibilityChanged(boolean z9) {
        boolean z10 = this.mShouldRunTicker;
        if (!z10 && z9) {
            this.mShouldRunTicker = true;
            this.mTicker.run();
        } else {
            if (!z10 || z9) {
                return;
            }
            this.mShouldRunTicker = false;
            L5.a aVar = this.alarmTimeOut;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    public final CharSequence getFormat() {
        return this.format;
    }

    public final CharSequence getFormat12Hour() {
        return this.mFormat12;
    }

    public final CharSequence getFormat24Hour() {
        return this.mFormat24;
    }

    @Override // android.app.AlarmManager.OnAlarmListener
    public void onAlarm() {
        Log.i(TAG, "Call onAlarm, time = " + System.currentTimeMillis() + ", Pre text = " + ((Object) getText()));
        this.mTicker.run();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        onVisibilityChanged(true);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        onVisibilityChanged(false);
    }

    @Override // android.widget.TextView, android.view.View
    public void onVisibilityAggregated(boolean z9) {
        super.onVisibilityAggregated(z9);
        if (z9) {
            createTime(this.mTimeZone);
            chooseFormat();
            onTimeChanged();
        }
    }

    public final void refreshTime() {
        onTimeChanged();
        invalidate();
    }

    public final void setAutoLocaleEnable(boolean z9) {
        this.autoLocaleEnable = z9;
        onTimeChanged();
    }

    public final void setContentDescriptionFormat12Hour(CharSequence charSequence) {
        this.mDescFormat12 = charSequence != null ? charSequence.toString() : null;
        chooseFormat();
        onTimeChanged();
    }

    public final void setContentDescriptionFormat24Hour(String str) {
        this.mDescFormat24 = str;
        chooseFormat();
        onTimeChanged();
    }

    public final void setFormat12Hour(CharSequence charSequence) {
        this.mFormat12 = charSequence != null ? charSequence.toString() : null;
        chooseFormat();
        onTimeChanged();
    }

    public final void setFormat24Hour(CharSequence charSequence) {
        this.mFormat24 = charSequence != null ? charSequence.toString() : null;
        chooseFormat();
        onTimeChanged();
    }

    public final void setShowCurrentUserTime(boolean z9) {
        this.mShowCurrentUserTime = z9;
        chooseFormat();
        onTimeChanged();
    }

    public final void setTimeZone(String str) {
        this.mTimeZone = str;
        createTime(str);
        onTimeChanged();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AodTextClock(Context context, AttributeSet attrs, int i10) {
        this(context, attrs, i10, 0, 8, null);
        n.h(context, "context");
        n.h(attrs, "attrs");
    }

    public AodTextClock(Context context) {
        super(context);
        this.mTicker = new Runnable() { // from class: com.nothing.cardwidget.AodTextClock$mTicker$1
            @Override // java.lang.Runnable
            public void run() {
                ZonedDateTime zonedDateTimeWithNano;
                if (this.this$0.mStopTicking || !this.this$0.mShouldRunTicker) {
                    return;
                }
                this.this$0.onTimeChanged();
                Calendar calendar = this.this$0.mTime;
                Calendar calendar2 = null;
                if (calendar == null) {
                    n.r("mTime");
                    calendar = null;
                }
                Instant instant = calendar.toInstant();
                Calendar calendar3 = this.this$0.mTime;
                if (calendar3 == null) {
                    n.r("mTime");
                } else {
                    calendar2 = calendar3;
                }
                ZoneId zoneId = calendar2.getTimeZone().toZoneId();
                if (this.this$0.mHasSeconds) {
                    zonedDateTimeWithNano = instant.atZone(zoneId).plusSeconds(1L).withNano(0);
                    n.e(zonedDateTimeWithNano);
                } else {
                    zonedDateTimeWithNano = instant.atZone(zoneId).plusMinutes(1L).withSecond(0).withNano(0);
                    n.e(zonedDateTimeWithNano);
                }
                long millis = Duration.between(instant, zonedDateTimeWithNano.toInstant()).toMillis();
                if (millis <= 0) {
                    millis = 1000;
                }
                L5.a aVar = this.this$0.alarmTimeOut;
                if (aVar != null) {
                    aVar.c(millis, 1);
                }
            }
        };
        init();
    }

    public /* synthetic */ AodTextClock(Context context, AttributeSet attributeSet, int i10, int i11, int i12, AbstractC1457h abstractC1457h) {
        this(context, attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AodTextClock(Context context, AttributeSet attrs, int i10, int i11) {
        super(context, attrs, i10, i11);
        n.h(context, "context");
        n.h(attrs, "attrs");
        this.mTicker = new Runnable() { // from class: com.nothing.cardwidget.AodTextClock$mTicker$1
            @Override // java.lang.Runnable
            public void run() {
                ZonedDateTime zonedDateTimeWithNano;
                if (this.this$0.mStopTicking || !this.this$0.mShouldRunTicker) {
                    return;
                }
                this.this$0.onTimeChanged();
                Calendar calendar = this.this$0.mTime;
                Calendar calendar2 = null;
                if (calendar == null) {
                    n.r("mTime");
                    calendar = null;
                }
                Instant instant = calendar.toInstant();
                Calendar calendar3 = this.this$0.mTime;
                if (calendar3 == null) {
                    n.r("mTime");
                } else {
                    calendar2 = calendar3;
                }
                ZoneId zoneId = calendar2.getTimeZone().toZoneId();
                if (this.this$0.mHasSeconds) {
                    zonedDateTimeWithNano = instant.atZone(zoneId).plusSeconds(1L).withNano(0);
                    n.e(zonedDateTimeWithNano);
                } else {
                    zonedDateTimeWithNano = instant.atZone(zoneId).plusMinutes(1L).withSecond(0).withNano(0);
                    n.e(zonedDateTimeWithNano);
                }
                long millis = Duration.between(instant, zonedDateTimeWithNano.toInstant()).toMillis();
                if (millis <= 0) {
                    millis = 1000;
                }
                L5.a aVar = this.this$0.alarmTimeOut;
                if (aVar != null) {
                    aVar.c(millis, 1);
                }
            }
        };
        J5.a.C0120a c0120a = J5.a.f3535a;
        for (Map.Entry entry : c0120a.k(attrs, N.i(v.a(Integer.valueOf(c0120a.c(context, "clockFormat12Hour")), Integer.valueOf(R.attr.clockFormat12Hour)), v.a(Integer.valueOf(c0120a.c(context, "clockFormat24Hour")), Integer.valueOf(R.attr.clockFormat24Hour)), v.a(Integer.valueOf(c0120a.c(context, "clockTimeZone")), Integer.valueOf(R.attr.clockTimeZone)))).entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            if (iIntValue == R.attr.clockFormat12Hour) {
                this.mFormat12 = J5.a.f3535a.j(context, attrs, ((Number) entry.getValue()).intValue());
            } else if (iIntValue == R.attr.clockFormat24Hour) {
                this.mFormat24 = J5.a.f3535a.j(context, attrs, ((Number) entry.getValue()).intValue());
            } else if (iIntValue == R.attr.clockTimeZone) {
                this.mTimeZone = J5.a.f3535a.j(context, attrs, ((Number) entry.getValue()).intValue());
            }
        }
        init();
    }
}
