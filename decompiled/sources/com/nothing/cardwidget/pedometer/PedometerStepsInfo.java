package com.nothing.cardwidget.pedometer;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes2.dex */
public final class PedometerStepsInfo {

    @SerializedName("date")
    private final long date;

    @SerializedName(Constants.KEY_STEPS)
    private final int steps;

    @SerializedName(TypedValues.AttributesType.S_TARGET)
    private final int target;

    public PedometerStepsInfo(long j9, int i10, int i11) {
        this.date = j9;
        this.steps = i10;
        this.target = i11;
    }

    public static /* synthetic */ PedometerStepsInfo copy$default(PedometerStepsInfo pedometerStepsInfo, long j9, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j9 = pedometerStepsInfo.date;
        }
        if ((i12 & 2) != 0) {
            i10 = pedometerStepsInfo.steps;
        }
        if ((i12 & 4) != 0) {
            i11 = pedometerStepsInfo.target;
        }
        return pedometerStepsInfo.copy(j9, i10, i11);
    }

    public final long component1() {
        return this.date;
    }

    public final int component2() {
        return this.steps;
    }

    public final int component3() {
        return this.target;
    }

    public final PedometerStepsInfo copy(long j9, int i10, int i11) {
        return new PedometerStepsInfo(j9, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PedometerStepsInfo)) {
            return false;
        }
        PedometerStepsInfo pedometerStepsInfo = (PedometerStepsInfo) obj;
        return this.date == pedometerStepsInfo.date && this.steps == pedometerStepsInfo.steps && this.target == pedometerStepsInfo.target;
    }

    public final long getDate() {
        return this.date;
    }

    public final int getSteps() {
        return this.steps;
    }

    public final int getTarget() {
        return this.target;
    }

    public int hashCode() {
        return (((Long.hashCode(this.date) * 31) + Integer.hashCode(this.steps)) * 31) + Integer.hashCode(this.target);
    }

    public String toString() {
        return "PedometerStepsInfo(date=" + this.date + ", steps=" + this.steps + ", target=" + this.target + ")";
    }
}
