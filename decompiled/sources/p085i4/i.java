package p085i4;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static boolean a() {
        return Looper.getMainLooper() == Looper.myLooper();
    }
}
