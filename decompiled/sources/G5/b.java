package G5;

import android.content.Context;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f1947a = new b();

    private b() {
    }

    public final boolean a(Context context) {
        n.h(context, "context");
        return context.getResources().getConfiguration().getLayoutDirection() == 0;
    }
}
