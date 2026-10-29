package com.nothing.wallpaper.picker.edit.preview.bean;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
public final class LoadingStateKt {
    private static final long a() {
        return 230L;
    }

    @Keep
    public static final long getLoadingSilenceDelay(boolean z9) {
        if (z9) {
            return 500L;
        }
        return a();
    }
}
