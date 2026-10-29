package L0;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {
    public static final t a(File file) {
        kotlin.jvm.internal.n.h(file, "file");
        String absolutePath = file.getCanonicalFile().getAbsolutePath();
        kotlin.jvm.internal.n.g(absolutePath, "file.canonicalFile.absolutePath");
        return u.a(absolutePath);
    }
}
