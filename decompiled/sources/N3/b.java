package N3;

/* JADX INFO: loaded from: classes.dex */
final class b extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g.a f5212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f5213b;

    b(g.a aVar, long j9) {
        if (aVar == null) {
            throw new NullPointerException("Null status");
        }
        this.f5212a = aVar;
        this.f5213b = j9;
    }

    @Override // N3.g
    public long b() {
        return this.f5213b;
    }

    @Override // N3.g
    public g.a c() {
        return this.f5212a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f5212a.equals(gVar.c()) && this.f5213b == gVar.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f5212a.hashCode() ^ 1000003) * 1000003;
        long j9 = this.f5213b;
        return ((int) (j9 ^ (j9 >>> 32))) ^ iHashCode;
    }

    public String toString() {
        return "BackendResponse{status=" + this.f5212a + ", nextRequestWaitMillis=" + this.f5213b + "}";
    }
}
