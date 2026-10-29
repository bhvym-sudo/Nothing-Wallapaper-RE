package K8;

/* JADX INFO: renamed from: K8.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0914g extends RuntimeException {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final transient p129m8.i f4161q;

    public C0914g(p129m8.i iVar) {
        this.f4161q = iVar;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return String.valueOf(this.f4161q);
    }
}
