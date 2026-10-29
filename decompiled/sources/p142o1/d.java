package p142o1;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f23334a = new d();

    private d() {
    }

    public static final File a(Context context) {
        n.h(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        n.g(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
