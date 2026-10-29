package com.nothing.cardwidget.battery.entity;

import p149o8.a;
import p149o8.b;

/* JADX INFO: loaded from: classes2.dex */
public enum DeviceType {
    PHONE(1),
    NOTHINGX_DEVICE(2),
    FASTPAIR_DEVICE(3),
    GENERAL_BLUETOOTH(4),
    AIRPODS(5);

    private static final /* synthetic */ a $ENTRIES = b.a(values());
    private final int type;

    DeviceType(int i10) {
        this.type = i10;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public final int getType() {
        return this.type;
    }
}
