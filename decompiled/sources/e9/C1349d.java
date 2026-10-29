package e9;

import java.io.EOFException;

/* JADX INFO: renamed from: e9.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1349d implements z {
    @Override // e9.z
    public void Z(C1350e source, long j9) throws EOFException {
        kotlin.jvm.internal.n.h(source, "source");
        source.skip(j9);
    }

    @Override // e9.z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // e9.z
    public C e() {
        return C.f20236e;
    }

    @Override // e9.z, java.io.Flushable
    public void flush() {
    }
}
