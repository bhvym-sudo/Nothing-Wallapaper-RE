package com.nothing.wallpaper.picker.lockscreen.depth;

import androidx.annotation.Keep;
import p149o8.a;
import p149o8.b;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public enum NotApplicableReason {
    NOT_SUPPORT,
    NO_SUBJECT,
    NO_OVERLAP,
    OVERLAP_TOO_MUCH,
    APPLIED_GLASS_EFFECT,
    EXTENDED_WIDGET;

    private static final /* synthetic */ a $ENTRIES = b.a(values());

    public static a getEntries() {
        return $ENTRIES;
    }
}
