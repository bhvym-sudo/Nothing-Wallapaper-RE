package com.bumptech.glide.util;

import android.text.TextUtils;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class Preconditions {
    private Preconditions() {
    }

    public static void checkArgument(boolean z9) {
        checkArgument(z9, "");
    }

    public static String checkNotEmpty(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        return str;
    }

    public static <T> T checkNotNull(T t9) {
        return (T) checkNotNull(t9, "Argument must not be null");
    }

    public static void checkArgument(boolean z9, String str) {
        if (!z9) {
            throw new IllegalArgumentException(str);
        }
    }

    public static <T> T checkNotNull(T t9, String str) {
        if (t9 != null) {
            return t9;
        }
        throw new NullPointerException(str);
    }

    public static <T extends Collection<Y>, Y> T checkNotEmpty(T t9) {
        if (t9.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        return t9;
    }
}
