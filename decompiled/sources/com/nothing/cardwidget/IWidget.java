package com.nothing.cardwidget;

import android.os.Message;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public interface IWidget {

    public static final class DefaultImpls {
        public static void send(IWidget iWidget, Message msg) {
            n.h(msg, "msg");
        }

        public static void send(IWidget iWidget, Runnable r9) {
            n.h(r9, "r");
        }
    }

    long getReactDelay();

    void send(Message message);

    void send(Runnable runnable);
}
