package com.nothing.cardwidget.battery.view;

import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class BatteryContainerViewKt {
    public static final boolean isSingleBattery(M5.a aVar) {
        n.h(aVar, "<this>");
        return aVar.j() == -1 && aVar.m() == -1 && aVar.l() != -1;
    }
}
