package com.airbnb.lottie.value;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes.dex */
abstract class LottieInterpolatedValue<T> extends LottieValueCallback<T> {
    private final T endValue;
    private final Interpolator interpolator;
    private final T startValue;

    LottieInterpolatedValue(T t9, T t10) {
        this(t9, t10, new LinearInterpolator());
    }

    @Override // com.airbnb.lottie.value.LottieValueCallback
    public T getValue(LottieFrameInfo<T> lottieFrameInfo) {
        return interpolateValue(this.startValue, this.endValue, this.interpolator.getInterpolation(lottieFrameInfo.getOverallProgress()));
    }

    abstract T interpolateValue(T t9, T t10, float f10);

    LottieInterpolatedValue(T t9, T t10, Interpolator interpolator) {
        this.startValue = t9;
        this.endValue = t10;
        this.interpolator = interpolator;
    }
}
