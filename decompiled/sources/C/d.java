package C;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class d extends CancellationException {
    public d() {
        super("The Modifier.Node was detached");
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(e.f460a);
        return this;
    }
}
