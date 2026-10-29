package com.nothing.cardwidget.battery.entity;

import p149o8.a;
import p149o8.b;

/* JADX INFO: loaded from: classes2.dex */
public enum BatteryStatus {
    NORMAL(0),
    LOW(1),
    POWER_SAVE(2),
    CHARGING(3);

    private static final /* synthetic */ a $ENTRIES = b.a(values());
    private final int status;

    BatteryStatus(int i10) {
        this.status = i10;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public final int getStatus() {
        return this.status;
    }
}
