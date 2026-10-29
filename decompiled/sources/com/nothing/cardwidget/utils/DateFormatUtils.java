package com.nothing.cardwidget.utils;

/* JADX INFO: loaded from: classes2.dex */
public final class DateFormatUtils {
    public static final DateFormatUtils INSTANCE = new DateFormatUtils();
    private static final char QUOTE = '\'';

    private DateFormatUtils() {
    }

    private final boolean hasDesignator(CharSequence charSequence, char c10) {
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        boolean z9 = false;
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt == '\'') {
                z9 = !z9;
            } else if (!z9 && cCharAt == c10) {
                return true;
            }
        }
        return false;
    }

    public final boolean hasSeconds(CharSequence charSequence) {
        return hasDesignator(charSequence, 's');
    }
}
