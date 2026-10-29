package com.nothing.cardwidget.battery.timer;

import android.content.Context;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.n;
import p079h8.m;
import p149o8.a;
import p149o8.b;

/* JADX INFO: loaded from: classes2.dex */
public final class TimerFactory {
    public static final TimerFactory INSTANCE = new TimerFactory();
    private static final Map<String, ITimerTask> allTimers;

    public enum TimerType {
        HANDLE,
        ALARM;

        private static final /* synthetic */ a $ENTRIES = b.a(values());

        public static a getEntries() {
            return $ENTRIES;
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TimerType.values().length];
            try {
                iArr[TimerType.HANDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimerType.ALARM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Map<String, ITimerTask> mapSynchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        n.g(mapSynchronizedMap, "synchronizedMap(...)");
        allTimers = mapSynchronizedMap;
    }

    private TimerFactory() {
    }

    private final ITimerTask start(Context context, String str, TimerType timerType, long j9, ITimerListener iTimerListener) {
        Map<String, ITimerTask> map = allTimers;
        ITimerTask handleTimer = map.get(str);
        if (handleTimer == null) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[timerType.ordinal()];
            if (i10 == 1) {
                handleTimer = new HandleTimer(str);
            } else {
                if (i10 != 2) {
                    throw new m();
                }
                handleTimer = new AlarmTimer(context, str);
            }
            map.put(str, handleTimer);
        }
        handleTimer.start(j9, iTimerListener);
        return handleTimer;
    }

    public final void startAlarmTimer(Context context, String timerId, long j9, ITimerListener listener) {
        n.h(context, "context");
        n.h(timerId, "timerId");
        n.h(listener, "listener");
        start(context, timerId, TimerType.ALARM, j9, listener);
    }

    public final void startHandleTimer(Context context, String timerId, long j9, ITimerListener listener) {
        n.h(context, "context");
        n.h(timerId, "timerId");
        n.h(listener, "listener");
        start(context, timerId, TimerType.HANDLE, j9, listener);
    }

    public final void stopTimer(String timerId) {
        n.h(timerId, "timerId");
        ITimerTask iTimerTaskRemove = allTimers.remove(timerId);
        if (iTimerTaskRemove != null) {
            iTimerTaskRemove.cancel();
        }
    }
}
