package androidx.appcompat.app;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ServiceInfo;
import androidx.constraintlayout.core.widgets.Optimizer;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends Service {

    private static class a {
        static int a() {
            return Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING;
        }
    }

    public static ServiceInfo a(Context context) {
        return context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) m.class), a.a() | Optimizer.OPTIMIZATION_GRAPH_WRAP);
    }
}
