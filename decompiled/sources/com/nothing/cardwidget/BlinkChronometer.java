package com.nothing.cardwidget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.icu.text.MeasureFormat;
import android.icu.util.Measure;
import android.icu.util.MeasureUnit;
import android.net.Uri;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.IllegalFormatException;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.h;
import p079h8.i;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"AppCompatCustomView"})
public final class BlinkChronometer extends TextView {
    private static final long BLINK_INTERVAL = 800;
    public static final Companion Companion = new Companion(null);
    private static final String ELAPSED_FORMAT_HHMMSS = "%1$02d:%2$02d:%3$02d";
    private static final int HOUR_IN_SEC = 3600;
    public static final String METHOD_PAUSE = "pause";
    public static final String METHOD_SET_BASE = "setBase";
    public static final String METHOD_SET_FORMAT = "setFormat";
    public static final String METHOD_START = "start";
    public static final String METHOD_STOP = "stop";
    private static final int MIN_IN_SEC = 60;
    private static final String NEGATIVE_DURATION_FORMAT = "\\u2212%1$s";
    private static final String TAG = "BlinkChronometer";
    private long base;
    private final h blinkRunnable$delegate;
    private boolean blinking;
    private String format;
    private StringBuilder formatBuilder;
    private Formatter formatter;
    private final Object[] formatterArgs;
    private Locale formatterLocale;
    private boolean isCountDown;
    private boolean isLogged;
    private boolean isRunning;
    private boolean isStarted;
    private final Runnable mTickRunnable;
    private long now;
    private OnChronometerTickListener onChronometerTickListener;
    private CharSequence originText;
    private CharSequence prevText;
    private final StringBuilder recycleStrBuilder;
    private CharSequence showingText;
    private boolean startBlink;
    private boolean visible;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1457h abstractC1457h) {
            this();
        }

        private Companion() {
        }
    }

    public interface OnChronometerTickListener {
        void onChronometerTick(BlinkChronometer blinkChronometer);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BlinkChronometer(Context context) {
        this(context, null, 0, 6, null);
        n.h(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Runnable blinkRunnable_delegate$lambda$1(final BlinkChronometer this$0) {
        n.h(this$0, "this$0");
        return new Runnable() { // from class: com.nothing.cardwidget.b
            @Override // java.lang.Runnable
            public final void run() {
                BlinkChronometer.blinkRunnable_delegate$lambda$1$lambda$0(this.f18021q);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void blinkRunnable_delegate$lambda$1$lambda$0(BlinkChronometer this$0) {
        n.h(this$0, "this$0");
        this$0.makeTextBlink();
    }

    private final String formatDuration(long j9) {
        int i10;
        int i11;
        int i12 = (int) (j9 / 1000);
        if (i12 < 0) {
            i12 = -i12;
        }
        if (i12 >= HOUR_IN_SEC) {
            i10 = i12 / HOUR_IN_SEC;
            i12 -= i10 * HOUR_IN_SEC;
        } else {
            i10 = 0;
        }
        if (i12 >= 60) {
            i11 = i12 / 60;
            i12 -= i11 * 60;
        } else {
            i11 = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (i10 > 0) {
            arrayList.add(new Measure(Integer.valueOf(i10), MeasureUnit.HOUR));
        }
        if (i11 > 0) {
            arrayList.add(new Measure(Integer.valueOf(i11), MeasureUnit.MINUTE));
        }
        arrayList.add(new Measure(Integer.valueOf(i12), MeasureUnit.SECOND));
        MeasureFormat measureFormat = MeasureFormat.getInstance(Locale.getDefault(), MeasureFormat.FormatWidth.WIDE);
        Measure[] measureArr = (Measure[]) arrayList.toArray(new Measure[0]);
        String measures = measureFormat.formatMeasures((Measure[]) Arrays.copyOf(measureArr, measureArr.length));
        n.g(measures, "formatMeasures(...)");
        return measures;
    }

    private final String formatElapsedTime(StringBuilder sb, long j9) {
        long j10;
        long j11 = 0;
        if (j9 >= 3600) {
            long j12 = HOUR_IN_SEC;
            j10 = j9 / j12;
            j9 -= j12 * j10;
        } else {
            j10 = 0;
        }
        if (j9 >= 60) {
            long j13 = 60;
            long j14 = j9 / j13;
            j9 -= j13 * j14;
            j11 = j14;
        }
        if (sb == null) {
            sb = new StringBuilder(8);
        } else {
            sb.setLength(0);
        }
        String string = new Formatter(sb, Locale.getDefault()).format(ELAPSED_FORMAT_HHMMSS, Long.valueOf(j10), Long.valueOf(j11), Long.valueOf(j9)).toString();
        n.g(string, "toString(...)");
        return string;
    }

    private final Runnable getBlinkRunnable() {
        return (Runnable) this.blinkRunnable$delegate.getValue();
    }

    private final void initBlinkText(CharSequence charSequence) {
        this.originText = getText();
        this.showingText = getText();
        this.prevText = charSequence;
    }

    private final void makeTextBlink() {
        swapShowingText();
        setText(this.showingText);
        postDelayed(getBlinkRunnable(), 800L);
    }

    public static /* synthetic */ void pause$default(BlinkChronometer blinkChronometer, CharSequence charSequence, boolean z9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z9 = true;
        }
        blinkChronometer.pause(charSequence, z9);
    }

    private final void swapShowingText() {
        CharSequence charSequence = this.showingText;
        this.showingText = this.prevText;
        this.prevText = charSequence;
    }

    private final void updateBlinkState() {
        boolean z9 = this.startBlink && this.visible && isShown();
        if (z9 != this.blinking) {
            if (z9) {
                makeTextBlink();
            } else {
                removeCallbacks(getBlinkRunnable());
                CharSequence charSequence = this.originText;
                if (charSequence != null) {
                    setText(charSequence);
                }
                Log.i(TAG, "stop blinking! originText: " + ((Object) this.originText));
            }
            this.blinking = z9;
        }
    }

    private final void updateRunning() {
        boolean z9 = this.visible && this.isStarted && isShown();
        if (z9 != this.isRunning) {
            if (z9) {
                updateText(SystemClock.elapsedRealtime());
                dispatchChronometerTick();
                postDelayed(this.mTickRunnable, 1000L);
            } else {
                removeCallbacks(this.mTickRunnable);
            }
            this.isRunning = z9;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void updateText(long j9) {
        boolean z9;
        try {
            this.now = j9;
            long j10 = (this.isCountDown ? this.base - j9 : j9 - this.base) / ((long) 1000);
            if (j10 < 0) {
                j10 = -j10;
                z9 = true;
            } else {
                z9 = false;
            }
            String elapsedTime = formatElapsedTime(this.recycleStrBuilder, j10);
            if (z9) {
                elapsedTime = new Formatter(Locale.getDefault()).format(NEGATIVE_DURATION_FORMAT, elapsedTime).toString();
            }
            if (this.format != null) {
                Locale locale = Locale.getDefault();
                if (this.formatter == null || !n.d(locale, this.formatterLocale)) {
                    this.formatterLocale = locale;
                    this.formatter = new Formatter(this.formatBuilder, locale);
                }
                StringBuilder sb = this.formatBuilder;
                n.e(sb);
                sb.setLength(0);
                this.formatterArgs[0] = elapsedTime;
                try {
                    Formatter formatter = this.formatter;
                    n.e(formatter);
                    String str = this.format;
                    Object[] objArr = this.formatterArgs;
                    formatter.format(str, Arrays.copyOf(objArr, objArr.length));
                    elapsedTime = String.valueOf(this.formatBuilder);
                } catch (IllegalFormatException unused) {
                    if (!this.isLogged) {
                        Log.w(TAG, "Illegal format string: " + this.format);
                        this.isLogged = true;
                    }
                }
            }
            setText(elapsedTime);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void dispatchChronometerTick() {
        OnChronometerTickListener onChronometerTickListener = this.onChronometerTickListener;
        if (onChronometerTickListener != null) {
            n.e(onChronometerTickListener);
            onChronometerTickListener.onChronometerTick(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        String name = BlinkChronometer.class.getName();
        n.g(name, "getName(...)");
        return name;
    }

    @Override // android.view.View
    @SuppressLint({"GetContentDescriptionOverride"})
    public CharSequence getContentDescription() {
        return formatDuration(this.now - this.base);
    }

    public final OnChronometerTickListener getOnChronometerTickListener() {
        return this.onChronometerTickListener;
    }

    public final boolean isCountDown() {
        return this.isCountDown;
    }

    public final boolean isTheFinalCountDown() {
        try {
            getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://youtu.be/9jK-NcRmVcw")).addCategory("android.intent.category.BROWSABLE").addFlags(528384));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.visible = false;
        updateBlinkState();
        updateRunning();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onVisibilityChanged(View changedView, int i10) {
        n.h(changedView, "changedView");
        super.onVisibilityChanged(changedView, i10);
        updateBlinkState();
        updateRunning();
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.visible = i10 == 0;
        updateBlinkState();
        updateRunning();
    }

    public final void pause(CharSequence charSequence, boolean z9) {
        stop();
        if (charSequence != null) {
            this.startBlink = z9;
            if (z9) {
                initBlinkText(charSequence);
            } else {
                setText(charSequence);
            }
            updateBlinkState();
        }
    }

    public final void setBase(long j9, long j10) {
        this.base = j9;
        dispatchChronometerTick();
        updateText(j10);
    }

    public final void setCountDown(boolean z9) {
        this.isCountDown = z9;
        updateText(SystemClock.elapsedRealtime());
    }

    public final void setFormat(String str) {
        this.format = str;
        if (str == null || this.formatBuilder != null) {
            return;
        }
        this.formatBuilder = new StringBuilder(str.length() * 2);
    }

    public final void setOnChronometerTickListener(OnChronometerTickListener onChronometerTickListener) {
        this.onChronometerTickListener = onChronometerTickListener;
    }

    public final void setStarted(boolean z9) {
        this.isStarted = z9;
        updateRunning();
    }

    public final void start() {
        this.isStarted = true;
        this.startBlink = false;
        updateBlinkState();
        updateRunning();
    }

    public final void stop() {
        this.isStarted = false;
        this.startBlink = false;
        updateBlinkState();
        updateRunning();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BlinkChronometer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        n.h(context, "context");
    }

    public /* synthetic */ BlinkChronometer(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC1457h abstractC1457h) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlinkChronometer(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        n.h(context, "context");
        this.formatterArgs = new Object[1];
        this.recycleStrBuilder = new StringBuilder(8);
        this.blinkRunnable$delegate = i.b(new p219v8.a() { // from class: com.nothing.cardwidget.a
            @Override // p219v8.a
            public final Object invoke() {
                return BlinkChronometer.blinkRunnable_delegate$lambda$1(this.f18015q);
            }
        });
        this.mTickRunnable = new Runnable() { // from class: com.nothing.cardwidget.BlinkChronometer$mTickRunnable$1
            @Override // java.lang.Runnable
            public void run() {
                if (this.this$0.isRunning) {
                    this.this$0.updateText(SystemClock.elapsedRealtime());
                    this.this$0.dispatchChronometerTick();
                    this.this$0.postDelayed(this, 1000L);
                }
            }
        };
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.base = jElapsedRealtime;
        updateText(jElapsedRealtime);
    }
}
