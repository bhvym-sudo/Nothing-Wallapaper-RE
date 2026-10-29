package Y8;

import e9.B;
import e9.o;
import e9.p;
import e9.z;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0343a f9378a = C0343a.f9380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f9379b = new C0343a.C0344a();

    /* JADX INFO: renamed from: Y8.a$a, reason: collision with other inner class name */
    public static final class C0343a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ C0343a f9380a = new C0343a();

        /* JADX INFO: renamed from: Y8.a$a$a, reason: collision with other inner class name */
        private static final class C0344a implements a {
            @Override // Y8.a
            public B a(File file) {
                n.h(file, "file");
                return o.j(file);
            }

            @Override // Y8.a
            public z b(File file) {
                n.h(file, "file");
                try {
                    return p.g(file, false, 1, null);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return p.g(file, false, 1, null);
                }
            }

            @Override // Y8.a
            public void c(File directory) throws IOException {
                n.h(directory, "directory");
                File[] fileArrListFiles = directory.listFiles();
                if (fileArrListFiles == null) {
                    throw new IOException("not a readable directory: " + directory);
                }
                for (File file : fileArrListFiles) {
                    if (file.isDirectory()) {
                        n.g(file, "file");
                        c(file);
                    }
                    if (!file.delete()) {
                        throw new IOException("failed to delete " + file);
                    }
                }
            }

            @Override // Y8.a
            public boolean d(File file) {
                n.h(file, "file");
                return file.exists();
            }

            @Override // Y8.a
            public void e(File from, File to) throws IOException {
                n.h(from, "from");
                n.h(to, "to");
                f(to);
                if (from.renameTo(to)) {
                    return;
                }
                throw new IOException("failed to rename " + from + " to " + to);
            }

            @Override // Y8.a
            public void f(File file) throws IOException {
                n.h(file, "file");
                if (file.delete() || !file.exists()) {
                    return;
                }
                throw new IOException("failed to delete " + file);
            }

            @Override // Y8.a
            public z g(File file) {
                n.h(file, "file");
                try {
                    return o.a(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return o.a(file);
                }
            }

            @Override // Y8.a
            public long h(File file) {
                n.h(file, "file");
                return file.length();
            }

            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        private C0343a() {
        }
    }

    B a(File file);

    z b(File file);

    void c(File file);

    boolean d(File file);

    void e(File file, File file2);

    void f(File file);

    z g(File file);

    long h(File file);
}
