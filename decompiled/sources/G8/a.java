package G8;

import F8.H0;
import K8.r;
import android.os.Looper;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements r {
    @Override // K8.r
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // K8.r
    public H0 b(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new f(h.a(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // K8.r
    public int c() {
        return 1073741823;
    }
}
