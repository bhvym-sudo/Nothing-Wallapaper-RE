package p087i6;

import android.app.Application;
import android.content.Context;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f22207a = new o();

    private o() {
    }

    public final boolean a(Context context) {
        n.h(context, "context");
        String processName = Application.getProcessName();
        return processName != null && n.d(processName, context.getPackageName());
    }
}
