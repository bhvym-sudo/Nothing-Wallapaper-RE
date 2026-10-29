package p064g3;

import android.content.Context;
import android.content.Intent;
import p171r0.a;

/* JADX INFO: loaded from: classes.dex */
public interface j {
    default boolean a(Context context) {
        return a.a(context, "android.permission.BIND_WALLPAPER") == 0;
    }

    Intent b(Context context, x xVar, boolean z9);
}
