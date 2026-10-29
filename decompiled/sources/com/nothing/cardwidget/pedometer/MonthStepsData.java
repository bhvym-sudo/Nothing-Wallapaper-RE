package com.nothing.cardwidget.pedometer;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class MonthStepsData extends PedometerData {

    @SerializedName("monthStepsList")
    private final List<PedometerStepsInfo> monthStepsList;

    public MonthStepsData(List<PedometerStepsInfo> monthStepsList) {
        n.h(monthStepsList, "monthStepsList");
        this.monthStepsList = monthStepsList;
    }

    public final List<PedometerStepsInfo> getMonthStepsList() {
        return this.monthStepsList;
    }
}
