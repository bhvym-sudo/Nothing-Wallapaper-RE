package p196t5;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f27936a = new a();

    private a() {
    }

    public final void a(Context context, int i10) {
        n.h(context, "context");
        File file = new File(context.getCacheDir(), "snap_" + i10 + ".png");
        if (file.exists()) {
            file.delete();
        }
    }
}
