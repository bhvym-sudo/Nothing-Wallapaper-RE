package com.nothing.cardwidget.pedometer;

/* JADX INFO: loaded from: classes2.dex */
public final class DigitalData extends PedometerData {
    private final int sevenDayAverage;
    private final int sevenDayPercent;
    private final int stepCounter;
    private final int todayPercent;

    public DigitalData(int i10, int i11, int i12, int i13) {
        this.stepCounter = i10;
        this.todayPercent = i11;
        this.sevenDayAverage = i12;
        this.sevenDayPercent = i13;
    }

    public final int getSevenDayAverage() {
        return this.sevenDayAverage;
    }

    public final int getSevenDayPercent() {
        return this.sevenDayPercent;
    }

    public final int getStepCounter() {
        return this.stepCounter;
    }

    public final int getTodayPercent() {
        return this.todayPercent;
    }
}
