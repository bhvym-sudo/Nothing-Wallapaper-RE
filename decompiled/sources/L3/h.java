package L3;

/* JADX INFO: loaded from: classes.dex */
final class h extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f4719a;

    h(long j9) {
        this.f4719a = j9;
    }

    @Override // L3.n
    public long c() {
        return this.f4719a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof n) && this.f4719a == ((n) obj).c();
    }

    public int hashCode() {
        long j9 = this.f4719a;
        return ((int) (j9 ^ (j9 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f4719a + "}";
    }
}
