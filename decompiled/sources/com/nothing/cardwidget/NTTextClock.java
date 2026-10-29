package com.nothing.cardwidget;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.icu.text.DateTimePatternGenerator;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;
import android.text.format.DateFormat;
import android.util.AttributeSet;
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
import p079h8.InterfaceC1386a;
import p079h8.v;
import p089i8.AbstractC1444s;
import p089i8.N;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"AppCompatCustomView"})
public final class NTTextClock extends TextView {
    public static final Companion Companion = new Companion(null);
    private static final CharSequence DEFAULT_FORMAT_12_HOUR = "h:mm a";
    private static final CharSequence DEFAULT_FORMAT_24_HOUR = "H:mm";
    private final O5.b.InterfaceC0194b broadcastListener;

    @ViewDebug.ExportedProperty
    private CharSequence format;
    private CharSequence mDescFormat;
    private String mDescFormat12;
    private String mDescFormat24;
    private String mFormat12;
    private String mFormat24;
    private ContentObserver mFormatChangeObserver;

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

        @InterfaceC1386a
        public static /* synthetic */ void getDEFAULT_FORMAT_12_HOUR$annotations() {
        }

        @InterfaceC1386a
        public static /* synthetic */ void getDEFAULT_FORMAT_24_HOUR$annotations() {
        }

        public final CharSequence getDEFAULT_FORMAT_12_HOUR() {
            return NTTextClock.DEFAULT_FORMAT_12_HOUR;
        }

        public final CharSequence getDEFAULT_FORMAT_24_HOUR() {
            return NTTextClock.DEFAULT_FORMAT_24_HOUR;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NTTextClock(Context context, AttributeSet attrs) {
        this(context, attrs, 0, 0, 12, null);
        n.h(context, "context");
        n.h(attrs, "attrs");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void chooseFormat() {
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
        boolean z9 = this.mHasSeconds;
        boolean zHasSeconds = DateFormatUtils.INSTANCE.hasSeconds(this.format);
        this.mHasSeconds = zHasSeconds;
        if (!this.mShouldRunTicker || z9 == zHasSeconds) {
            return;
        }
        this.mTicker.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createTime(String str) {
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
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(String.valueOf(this.format), Locale.ENGLISH);
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
        } else {
            calendar2 = calendar4;
        }
        setContentDescription(DateFormat.format(charSequence, calendar2));
    }

    private final void registerObserver() {
        if (this.mRegistered) {
            if (this.mFormatChangeObserver == null) {
                this.mFormatChangeObserver = new FormatChangeObserver(getHandler());
            }
            ContentResolver contentResolver = getContext().getContentResolver();
            Uri uriFor = Settings.System.getUriFor("time_12_24");
            if (this.mShowCurrentUserTime) {
                ContentObserver contentObserver = this.mFormatChangeObserver;
                n.e(contentObserver);
                contentResolver.registerContentObserver(uriFor, true, contentObserver);
            } else {
                ContentObserver contentObserver2 = this.mFormatChangeObserver;
                n.e(contentObserver2);
                contentResolver.registerContentObserver(uriFor, true, contentObserver2);
            }
        }
    }

    private final void registerReceiver() {
        Context context = getContext();
        n.g(context, "getContext(...)");
        O5.b.a(context, this.broadcastListener, AbstractC1444s.n("android.intent.action.TIME_SET", "android.intent.action.TIMEZONE_CHANGED"));
    }

    private final void unregisterObserver() {
        if (this.mFormatChangeObserver != null) {
            ContentResolver contentResolver = getContext().getContentResolver();
            ContentObserver contentObserver = this.mFormatChangeObserver;
            n.e(contentObserver);
            contentResolver.unregisterContentObserver(contentObserver);
        }
    }

    private final void unregisterReceiver() {
        Context context = getContext();
        n.g(context, "getContext(...)");
        O5.b.d(context, this.broadcastListener);
    }

    public final void disableClockTick() {
        this.mStopTicking = true;
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

    public final boolean is24HourModeEnabled() {
        return DateFormat.is24HourFormat(getContext());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.mRegistered) {
            this.mRegistered = true;
            registerReceiver();
            registerObserver();
            createTime(this.mTimeZone);
        }
        onVisibilityAggregated(true);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.mRegistered) {
            unregisterReceiver();
            unregisterObserver();
            this.mRegistered = false;
        }
        onVisibilityAggregated(false);
    }

    public void onHostVisibilityChange(boolean z9) {
        onVisibilityAggregated(z9);
    }

    @Override // android.widget.TextView, android.view.View
    public void onVisibilityAggregated(boolean z9) {
        super.onVisibilityAggregated(z9);
        boolean z10 = this.mShouldRunTicker;
        if (!z10 && z9) {
            this.mShouldRunTicker = true;
            this.mTicker.run();
        } else {
            if (!z10 || z9) {
                return;
            }
            this.mShouldRunTicker = false;
            removeCallbacks(this.mTicker);
        }
    }

    public final void refreshTime() {
        onTimeChanged();
        invalidate();
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
        unregisterObserver();
        registerObserver();
    }

    public final void setTimeZone(String str) {
        this.mTimeZone = str;
        createTime(str);
        onTimeChanged();
    }

    private final class FormatChangeObserver extends ContentObserver {
        public FormatChangeObserver(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z9) {
            NTTextClock.this.chooseFormat();
            NTTextClock.this.onTimeChanged();
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z9, Uri uri) {
            NTTextClock.this.chooseFormat();
            NTTextClock.this.onTimeChanged();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NTTextClock(Context context, AttributeSet attrs, int i10) {
        this(context, attrs, i10, 0, 8, null);
        n.h(context, "context");
        n.h(attrs, "attrs");
    }

    public NTTextClock(Context context) {
        super(context);
        this.broadcastListener = new O5.b.InterfaceC0194b() { // from class: com.nothing.cardwidget.NTTextClock$broadcastListener$1
            @Override // O5.b.InterfaceC0194b
            public void onBroadcastReceive(Intent intent) {
                n.h(intent, "intent");
                if (this.this$0.mStopTicking) {
                    return;
                }
                if (this.this$0.mTimeZone == null && n.d("android.intent.action.TIMEZONE_CHANGED", intent.getAction())) {
                    this.this$0.createTime(intent.getStringExtra("time-zone"));
                } else if (!this.this$0.mShouldRunTicker && (n.d("android.intent.action.TIME_TICK", intent.getAction()) || n.d("android.intent.action.TIME_SET", intent.getAction()))) {
                    return;
                }
                this.this$0.onTimeChanged();
            }
        };
        this.mTicker = new Runnable() { // from class: com.nothing.cardwidget.NTTextClock$mTicker$1
            @Override // java.lang.Runnable
            public void run() {
                ZonedDateTime zonedDateTimeWithNano;
                this.this$0.removeCallbacks(this);
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
                this.this$0.postDelayed(this, millis);
            }
        };
        init();
    }

    public /* synthetic */ NTTextClock(Context context, AttributeSet attributeSet, int i10, int i11, int i12, AbstractC1457h abstractC1457h) {
        this(context, attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NTTextClock(Context context, AttributeSet attrs, int i10, int i11) {
        super(context, attrs, i10, i11);
        n.h(context, "context");
        n.h(attrs, "attrs");
        this.broadcastListener = new O5.b.InterfaceC0194b() { // from class: com.nothing.cardwidget.NTTextClock$broadcastListener$1
            @Override // O5.b.InterfaceC0194b
            public void onBroadcastReceive(Intent intent) {
                n.h(intent, "intent");
                if (this.this$0.mStopTicking) {
                    return;
                }
                if (this.this$0.mTimeZone == null && n.d("android.intent.action.TIMEZONE_CHANGED", intent.getAction())) {
                    this.this$0.createTime(intent.getStringExtra("time-zone"));
                } else if (!this.this$0.mShouldRunTicker && (n.d("android.intent.action.TIME_TICK", intent.getAction()) || n.d("android.intent.action.TIME_SET", intent.getAction()))) {
                    return;
                }
                this.this$0.onTimeChanged();
            }
        };
        this.mTicker = new Runnable() { // from class: com.nothing.cardwidget.NTTextClock$mTicker$1
            @Override // java.lang.Runnable
            public void run() {
                ZonedDateTime zonedDateTimeWithNano;
                this.this$0.removeCallbacks(this);
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
                this.this$0.postDelayed(this, millis);
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
