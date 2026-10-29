package S3;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class b extends d.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f7228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f7229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f7230c;

    /* JADX INFO: renamed from: S3.b$b, reason: collision with other inner class name */
    static final class C0261b extends d.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f7231a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f7232b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Set f7233c;

        C0261b() {
        }

        @Override // S3.d.b.a
        public d.b a() {
            String str = "";
            if (this.f7231a == null) {
                str = " delta";
            }
            if (this.f7232b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f7233c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new b(this.f7231a.longValue(), this.f7232b.longValue(), this.f7233c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // S3.d.b.a
        public d.b.a b(long j9) {
            this.f7231a = Long.valueOf(j9);
            return this;
        }

        @Override // S3.d.b.a
        public d.b.a c(Set set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f7233c = set;
            return this;
        }

        @Override // S3.d.b.a
        public d.b.a d(long j9) {
            this.f7232b = Long.valueOf(j9);
            return this;
        }
    }

    @Override // S3.d.b
    long b() {
        return this.f7228a;
    }

    @Override // S3.d.b
    Set c() {
        return this.f7230c;
    }

    @Override // S3.d.b
    long d() {
        return this.f7229b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d.b) {
            d.b bVar = (d.b) obj;
            if (this.f7228a == bVar.b() && this.f7229b == bVar.d() && this.f7230c.equals(bVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j9 = this.f7228a;
        int i10 = (((int) (j9 ^ (j9 >>> 32))) ^ 1000003) * 1000003;
        long j10 = this.f7229b;
        return this.f7230c.hashCode() ^ ((i10 ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003);
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f7228a + ", maxAllowedDelay=" + this.f7229b + ", flags=" + this.f7230c + "}";
    }

    private b(long j9, long j10, Set set) {
        this.f7228a = j9;
        this.f7229b = j10;
        this.f7230c = set;
    }
}
