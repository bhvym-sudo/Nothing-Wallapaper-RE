package L0;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class I extends OutputStream {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final FileOutputStream f4297q;

    public I(FileOutputStream fileOutputStream) {
        kotlin.jvm.internal.n.h(fileOutputStream, "fileOutputStream");
        this.f4297q = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.f4297q.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        this.f4297q.write(i10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] b10) throws IOException {
        kotlin.jvm.internal.n.h(b10, "b");
        this.f4297q.write(b10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bytes, int i10, int i11) throws IOException {
        kotlin.jvm.internal.n.h(bytes, "bytes");
        this.f4297q.write(bytes, i10, i11);
    }
}
