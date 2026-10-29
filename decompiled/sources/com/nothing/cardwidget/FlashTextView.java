package com.nothing.cardwidget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import java.time.Duration;
import java.time.Instant;
import java.util.Calendar;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.q;
import p079h8.r;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"AppCompatCustomView"})
public final class FlashTextView extends TextView {
    private static final int CORRECT_DELTA = 100;
    public static final Companion Companion = new Companion(null);
    private static final int NEXT_FLASH = 1001;
    private static final String TAG = "FlashTextView";
    private Float darkAlpha;
    private Handler flashHandler;
    private Float originalAlpha;
    private final O5.b.InterfaceC0194b timeChangedReceiver;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1457h abstractC1457h) {
            this();
        }

        private Companion() {
        }
    }

    public final class FlashHandler extends Handler {
        final /* synthetic */ FlashTextView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FlashHandler(FlashTextView flashTextView, Looper _looper) {
            super(_looper);
            n.h(_looper, "_looper");
            this.this$0 = flashTextView;
        }

        private final boolean isEvenSecondForPresent() {
            Object objClone = this.this$0.getInstantCalendar().clone();
            n.f(objClone, "null cannot be cast to non-null type java.util.Calendar");
            return ((Calendar) objClone).toInstant().getEpochSecond() % ((long) 2) == 0;
        }

        private final void startNextFlash() {
            Message messageObtain = Message.obtain();
            messageObtain.what = FlashTextView.NEXT_FLASH;
            FlashTextView flashTextView = this.this$0;
            Handler handler = flashTextView.flashHandler;
            if (handler == null) {
                n.r("flashHandler");
                handler = null;
            }
            handler.sendMessageDelayed(messageObtain, flashTextView.calcNextFlashDelay());
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            n.h(msg, "msg");
            if (msg.what == FlashTextView.NEXT_FLASH) {
                this.this$0.changeAlpha(!isEvenSecondForPresent());
                startNextFlash();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FlashTextView(Context context, AttributeSet attrs) {
        this(context, attrs, 0, 0, 12, null);
        n.h(context, "context");
        n.h(attrs, "attrs");
    }

    private final long calcFlashStartUpDelay() {
        Object objB;
        try {
            q.a aVar = q.f21862r;
            Object objClone = getInstantCalendar().clone();
            n.f(objClone, "null cannot be cast to non-null type java.util.Calendar");
            Calendar calendar = (Calendar) objClone;
            Instant instant = calendar.toInstant();
            objB = q.b(Long.valueOf(Duration.between(instant, instant.atZone(calendar.getTimeZone().toZoneId()).plusSeconds(1L).withNano(0).toInstant()).toMillis() + ((long) 100)));
        } catch (Throwable th) {
            q.a aVar2 = q.f21862r;
            objB = q.b(r.a(th));
        }
        Throwable thD = q.d(objB);
        if (thD != null) {
            Log.e(TAG, "calcFlashStartUpDelay error: " + thD.getMessage());
        }
        if (q.f(objB)) {
            objB = 0L;
        }
        return ((Number) objB).longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long calcNextFlashDelay() {
        long j9 = 1000;
        return (j9 - (System.currentTimeMillis() % j9)) + ((long) 100);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeAlpha(boolean z9) {
        float fFloatValue;
        if (z9) {
            Float f10 = this.originalAlpha;
            n.e(f10);
            fFloatValue = f10.floatValue();
        } else {
            Float f11 = this.darkAlpha;
            fFloatValue = f11 != null ? f11.floatValue() : 0.0f;
        }
        setAlpha(fFloatValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Calendar getInstantCalendar() {
        Calendar calendar = Calendar.getInstance();
        n.g(calendar, "getInstance(...)");
        return calendar;
    }

    private final void init() {
        this.originalAlpha = Float.valueOf(getAlpha());
        Looper mainLooper = Looper.getMainLooper();
        n.g(mainLooper, "getMainLooper(...)");
        this.flashHandler = new FlashHandler(this, mainLooper);
    }

    private final void registerReceiver() {
        Context context = getContext();
        n.g(context, "getContext(...)");
        O5.b.a(context, this.timeChangedReceiver, AbstractC1444s.n("android.intent.action.TIME_SET", "android.intent.action.TIMEZONE_CHANGED"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startFlash() {
        Handler handler = this.flashHandler;
        Handler handler2 = null;
        if (handler == null) {
            n.r("flashHandler");
            handler = null;
        }
        handler.removeCallbacksAndMessages(null);
        Message messageObtain = Message.obtain();
        messageObtain.what = NEXT_FLASH;
        Handler handler3 = this.flashHandler;
        if (handler3 == null) {
            n.r("flashHandler");
        } else {
            handler2 = handler3;
        }
        handler2.sendMessageDelayed(messageObtain, calcFlashStartUpDelay());
    }

    private final void stopFlash() {
        Handler handler = this.flashHandler;
        if (handler == null) {
            n.r("flashHandler");
            handler = null;
        }
        handler.removeCallbacksAndMessages(null);
        Float f10 = this.originalAlpha;
        if (f10 != null) {
            setAlpha(f10.floatValue());
        }
        changeAlpha(true);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        startFlash();
        registerReceiver();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopFlash();
        Context context = getContext();
        n.g(context, "getContext(...)");
        O5.b.d(context, this.timeChangedReceiver);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onVisibilityChanged(View changedView, int i10) {
        n.h(changedView, "changedView");
        super.onVisibilityChanged(changedView, i10);
        if (i10 == 0) {
            startFlash();
        } else {
            stopFlash();
        }
    }

    public final void setFlashDarkAlpha(float f10) {
        this.darkAlpha = Float.valueOf(f10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FlashTextView(Context context, AttributeSet attrs, int i10) {
        this(context, attrs, i10, 0, 8, null);
        n.h(context, "context");
        n.h(attrs, "attrs");
    }

    public FlashTextView(Context context) {
        super(context);
        this.timeChangedReceiver = new O5.b.InterfaceC0194b() { // from class: com.nothing.cardwidget.FlashTextView$timeChangedReceiver$1
            @Override // O5.b.InterfaceC0194b
            public void onBroadcastReceive(Intent intent) {
                n.h(intent, "intent");
                if (this.this$0.getVisibility() == 0) {
                    this.this$0.startFlash();
                }
            }
        };
        init();
    }

    public /* synthetic */ FlashTextView(Context context, AttributeSet attributeSet, int i10, int i11, int i12, AbstractC1457h abstractC1457h) {
        this(context, attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlashTextView(Context context, AttributeSet attrs, int i10, int i11) {
        super(context, attrs, i10, i11);
        n.h(context, "context");
        n.h(attrs, "attrs");
        this.timeChangedReceiver = new O5.b.InterfaceC0194b() { // from class: com.nothing.cardwidget.FlashTextView$timeChangedReceiver$1
            @Override // O5.b.InterfaceC0194b
            public void onBroadcastReceive(Intent intent) {
                n.h(intent, "intent");
                if (this.this$0.getVisibility() == 0) {
                    this.this$0.startFlash();
                }
            }
        };
        init();
    }
}
