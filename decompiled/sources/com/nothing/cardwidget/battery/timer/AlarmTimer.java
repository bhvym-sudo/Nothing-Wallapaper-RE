package com.nothing.cardwidget.battery.timer;

import L5.a;
import android.app.AlarmManager;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.nothing.cardwidget.battery.timer.AlarmTimer;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.h;
import p079h8.i;

/* JADX INFO: loaded from: classes2.dex */
public final class AlarmTimer implements ITimerTask, AlarmManager.OnAlarmListener {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "AlarmTimer";
    private AlarmManager alarmManager;
    private a alarmTimeOut;
    private final Context context;
    private final h handler$delegate;
    private final String id;
    private WeakReference<ITimerListener> listener;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1457h abstractC1457h) {
            this();
        }

        private Companion() {
        }
    }

    public AlarmTimer(Context context, String id) {
        n.h(context, "context");
        n.h(id, "id");
        this.context = context;
        this.id = id;
        this.handler$delegate = i.b(new p219v8.a() { // from class: K5.a
            @Override // p219v8.a
            public final Object invoke() {
                return AlarmTimer.handler_delegate$lambda$0();
            }
        });
        Object systemService = context.getApplicationContext().getSystemService("alarm");
        AlarmManager alarmManager = systemService instanceof AlarmManager ? (AlarmManager) systemService : null;
        this.alarmManager = alarmManager;
        if (alarmManager != null) {
            AlarmManager alarmManager2 = this.alarmManager;
            n.e(alarmManager2);
            this.alarmTimeOut = new a(alarmManager2, this, TAG, getHandler());
        }
    }

    private final Handler getHandler() {
        return (Handler) this.handler$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler handler_delegate$lambda$0() {
        return new Handler(Looper.getMainLooper());
    }

    @Override // com.nothing.cardwidget.battery.timer.ITimerTask
    public void cancel() {
        a aVar;
        a aVar2 = this.alarmTimeOut;
        if (aVar2 != null && aVar2.b() && (aVar = this.alarmTimeOut) != null) {
            aVar.a();
        }
        Log.d(TAG, "cancel " + this.id + " alarm");
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getId() {
        return this.id;
    }

    @Override // android.app.AlarmManager.OnAlarmListener
    public void onAlarm() {
        ITimerListener iTimerListener;
        Log.d(TAG, "receive onAlarm: " + this.id);
        WeakReference<ITimerListener> weakReference = this.listener;
        if (weakReference == null || (iTimerListener = weakReference.get()) == null) {
            return;
        }
        iTimerListener.onTicker(this.id);
    }

    @Override // com.nothing.cardwidget.battery.timer.ITimerTask
    public void start(long j9, ITimerListener listener) {
        n.h(listener, "listener");
        this.listener = new WeakReference<>(listener);
        a aVar = this.alarmTimeOut;
        if (aVar == null || aVar.b()) {
            return;
        }
        a aVar2 = this.alarmTimeOut;
        if (aVar2 != null) {
            aVar2.c(j9, 2);
        }
        String str = this.id;
        a aVar3 = this.alarmTimeOut;
        Log.d(TAG, "start " + str + " alarm isScheduled: " + (aVar3 != null ? Boolean.valueOf(aVar3.b()) : null));
    }
}
