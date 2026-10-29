package F8;

/* JADX INFO: loaded from: classes2.dex */
public final class X extends Exception {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Throwable f1841q;

    public X(Throwable th, I i10, p129m8.i iVar) {
        super("Coroutine dispatcher " + i10 + " threw an exception, context = " + iVar, th);
        this.f1841q = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f1841q;
    }
}
