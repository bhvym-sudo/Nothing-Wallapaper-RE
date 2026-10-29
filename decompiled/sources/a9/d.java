package a9;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f9969a = new d();

    private d() {
    }

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }

    @Override // java.util.logging.Handler
    public void publish(LogRecord record) {
        n.h(record, "record");
        c cVar = c.f9966a;
        String loggerName = record.getLoggerName();
        n.g(loggerName, "record.loggerName");
        int iB = e.b(record);
        String message = record.getMessage();
        n.g(message, "record.message");
        cVar.a(loggerName, iB, message, record.getThrown());
    }
}
