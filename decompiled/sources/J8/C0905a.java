package J8;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: J8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0905a extends CancellationException {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final transient Object f3883q;

    public C0905a(Object obj) {
        super("Flow was aborted, no more elements needed");
        this.f3883q = obj;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
