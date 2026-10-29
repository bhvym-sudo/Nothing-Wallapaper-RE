package F8;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: F8.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0848y0 extends CancellationException {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final transient InterfaceC0846x0 f1903q;

    public C0848y0(String str, Throwable th, InterfaceC0846x0 interfaceC0846x0) {
        super(str);
        this.f1903q = interfaceC0846x0;
        if (th != null) {
            initCause(th);
        }
    }

    public final InterfaceC0846x0 a() {
        InterfaceC0846x0 interfaceC0846x0 = this.f1903q;
        return interfaceC0846x0 == null ? J0.f1819r : interfaceC0846x0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0848y0)) {
            return false;
        }
        C0848y0 c0848y0 = (C0848y0) obj;
        return kotlin.jvm.internal.n.d(c0848y0.getMessage(), getMessage()) && kotlin.jvm.internal.n.d(c0848y0.a(), a()) && kotlin.jvm.internal.n.d(c0848y0.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        kotlin.jvm.internal.n.e(message);
        int iHashCode = message.hashCode() * 31;
        InterfaceC0846x0 interfaceC0846x0A = a();
        int iHashCode2 = (iHashCode + (interfaceC0846x0A != null ? interfaceC0846x0A.hashCode() : 0)) * 31;
        Throwable cause = getCause();
        return iHashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + a();
    }
}
