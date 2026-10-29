package p176r5;

import android.os.Process;
import com.nothing.wallpaper.common.log.c;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27527a = "ThreadHelper";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f27528b = -1;

    public final void a(int i10) {
        c.k(this.f27527a, "setThreadHighPriority tid:" + i10);
        this.f27528b = i10;
        Process.setThreadPriority(i10, -8);
    }

    public final void b(int i10) {
        c.k(this.f27527a, "setThreadNormalPriority tid:" + i10);
        if (this.f27528b == i10) {
            Process.setThreadPriority(i10, 0);
        }
    }
}
