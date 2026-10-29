package L0;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

/* JADX INFO: renamed from: L0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0924a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0924a f4303a = new C0924a();

    private C0924a() {
    }

    public final boolean a(File srcFile, File dstFile) {
        kotlin.jvm.internal.n.h(srcFile, "srcFile");
        kotlin.jvm.internal.n.h(dstFile, "dstFile");
        try {
            Files.move(srcFile.toPath(), dstFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
