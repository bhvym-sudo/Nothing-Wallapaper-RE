package p087i6;

import android.os.SystemClock;
import kotlin.jvm.internal.n;
import p219v8.a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f22187a;

    public static final void a(a onClick) {
        n.h(onClick, "onClick");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - f22187a > 500) {
            onClick.invoke();
            f22187a = jElapsedRealtime;
        }
    }
}
