package com.nothing.cardwidget.battery.timer;

import android.os.Handler;
import android.os.Looper;
import com.nothing.cardwidget.battery.timer.HandleTimer;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.h;
import p079h8.i;
import p219v8.a;

/* JADX INFO: loaded from: classes2.dex */
public final class HandleTimer implements ITimerTask {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "HandleTimer";
    private final h handler$delegate;
    private final String id;
    private WeakReference<ITimerListener> listener;
    private final Runnable timeTicker;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1457h abstractC1457h) {
            this();
        }

        private Companion() {
        }
    }

    public HandleTimer(String id) {
        n.h(id, "id");
        this.id = id;
        this.handler$delegate = i.b(new a() { // from class: K5.b
            @Override // p219v8.a
            public final Object invoke() {
                return HandleTimer.handler_delegate$lambda$0();
            }
        });
        this.timeTicker = new Runnable() { // from class: K5.c
            @Override // java.lang.Runnable
            public final void run() {
                HandleTimer.timeTicker$lambda$1(this.f4117q);
            }
        };
    }

    private final Handler getHandler() {
        return (Handler) this.handler$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler handler_delegate$lambda$0() {
        return new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void timeTicker$lambda$1(HandleTimer this$0) {
        ITimerListener iTimerListener;
        n.h(this$0, "this$0");
        WeakReference<ITimerListener> weakReference = this$0.listener;
        if (weakReference == null || (iTimerListener = weakReference.get()) == null) {
            return;
        }
        iTimerListener.onTicker(this$0.id);
    }

    @Override // com.nothing.cardwidget.battery.timer.ITimerTask
    public void cancel() {
        if (getHandler().hasCallbacks(this.timeTicker)) {
            getHandler().removeCallbacks(this.timeTicker);
        }
    }

    public final String getId() {
        return this.id;
    }

    @Override // com.nothing.cardwidget.battery.timer.ITimerTask
    public void start(long j9, ITimerListener listener) {
        n.h(listener, "listener");
        this.listener = new WeakReference<>(listener);
        if (getHandler().hasCallbacks(this.timeTicker)) {
            return;
        }
        getHandler().postDelayed(this.timeTicker, j9);
    }
}
