package com.airbnb.lottie.model;

import androidx.collection.t;
import com.airbnb.lottie.LottieComposition;

/* JADX INFO: loaded from: classes.dex */
public class LottieCompositionCache {
    private static final LottieCompositionCache INSTANCE = new LottieCompositionCache();
    private final t cache = new t(20);

    LottieCompositionCache() {
    }

    public static LottieCompositionCache getInstance() {
        return INSTANCE;
    }

    public void clear() {
        this.cache.c();
    }

    public LottieComposition get(String str) {
        if (str == null) {
            return null;
        }
        return (LottieComposition) this.cache.d(str);
    }

    public void put(String str, LottieComposition lottieComposition) {
        if (str == null) {
            return;
        }
        this.cache.e(str, lottieComposition);
    }

    public void resize(int i10) {
        this.cache.f(i10);
    }
}
