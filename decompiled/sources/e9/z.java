package e9;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: loaded from: classes2.dex */
public interface z extends Closeable, Flushable {
    void Z(C1350e c1350e, long j9);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    C e();

    void flush();
}
