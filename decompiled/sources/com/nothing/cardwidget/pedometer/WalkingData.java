package com.nothing.cardwidget.pedometer;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public final class WalkingData extends PedometerData {
    private int currentProgress;
    private boolean isAnimateValid;
    private boolean isJustWalking;
    private boolean refreshProgress;
    private int walkingPercent;

    public /* synthetic */ WalkingData(int i10, boolean z9, boolean z10, int i11, boolean z11, int i12, AbstractC1457h abstractC1457h) {
        this(i10, (i12 & 2) != 0 ? false : z9, (i12 & 4) != 0 ? false : z10, (i12 & 8) != 0 ? 0 : i11, (i12 & 16) != 0 ? true : z11);
    }

    public final int getCurrentProgress() {
        return this.currentProgress;
    }

    public final boolean getRefreshProgress() {
        return this.refreshProgress;
    }

    public final int getWalkingPercent() {
        return this.walkingPercent;
    }

    public final boolean isAnimateValid() {
        return this.isAnimateValid;
    }

    public final boolean isJustWalking() {
        return this.isJustWalking;
    }

    public final void setAnimateValid(boolean z9) {
        this.isAnimateValid = z9;
    }

    public final void setCurrentProgress(int i10) {
        this.currentProgress = i10;
    }

    public final void setJustWalking(boolean z9) {
        this.isJustWalking = z9;
    }

    public final void setRefreshProgress(boolean z9) {
        this.refreshProgress = z9;
    }

    public final void setWalkingPercent(int i10) {
        this.walkingPercent = i10;
    }

    public WalkingData(int i10, boolean z9, boolean z10, int i11, boolean z11) {
        this.walkingPercent = i10;
        this.refreshProgress = z9;
        this.isJustWalking = z10;
        this.currentProgress = i11;
        this.isAnimateValid = z11;
    }
}
