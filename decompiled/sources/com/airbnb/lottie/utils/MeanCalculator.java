package com.airbnb.lottie.utils;

/* JADX INFO: loaded from: classes.dex */
public class MeanCalculator {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f15311n;
    private float sum;

    public void add(float f10) {
        float f11 = this.sum + f10;
        this.sum = f11;
        int i10 = this.f15311n + 1;
        this.f15311n = i10;
        if (i10 == Integer.MAX_VALUE) {
            this.sum = f11 / 2.0f;
            this.f15311n = i10 / 2;
        }
    }

    public float getMean() {
        int i10 = this.f15311n;
        if (i10 == 0) {
            return 0.0f;
        }
        return this.sum / i10;
    }
}
