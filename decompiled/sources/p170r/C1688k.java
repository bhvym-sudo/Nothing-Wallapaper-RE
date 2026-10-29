package p170r;

/* JADX INFO: renamed from: r.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1688k extends IllegalStateException {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f25466q;

    public C1688k(String str) {
        this.f25466q = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f25466q;
    }
}
