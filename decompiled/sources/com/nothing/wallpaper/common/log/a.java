package com.nothing.wallpaper.common.log;

import android.os.HandlerThread;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    public static Looper a(String str) {
        return b(str, 0);
    }

    public static Looper b(String str, int i10) {
        HandlerThread handlerThread = new HandlerThread(str, i10);
        handlerThread.start();
        return handlerThread.getLooper();
    }
}
