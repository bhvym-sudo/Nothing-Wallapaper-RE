package com.nothing.cardwidget.mediaplayer.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class ContextExtKt {
    public static final boolean isAppExist(Context context, String packageName) {
        n.h(context, "<this>");
        n.h(packageName, "packageName");
        if (TextUtils.isEmpty(packageName)) {
            return false;
        }
        try {
            context.getPackageManager().getApplicationInfo(packageName, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
