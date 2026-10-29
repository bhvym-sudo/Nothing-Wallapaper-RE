package p074h3;

import android.content.Context;

/* JADX INFO: renamed from: h3.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1382w implements Q {
    @Override // p074h3.Q
    public boolean a(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.telephony");
    }
}
