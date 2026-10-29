package p111l0;

import android.content.Context;
import p121m0.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final d a(Context context) {
        float f10 = context.getResources().getConfiguration().fontScale;
        float f11 = context.getResources().getDisplayMetrics().density;
        p121m0.a aVarB = b.f23088a.b(f10);
        if (aVarB == null) {
            aVarB = new t(f10);
        }
        return new g(f11, f10, aVarB);
    }
}
