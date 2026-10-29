package T3;

/* JADX INFO: renamed from: T3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0947a extends AbstractC0950d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f7642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f7643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f7644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f7645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f7646f;

    /* JADX INFO: renamed from: T3.a$b */
    static final class b extends AbstractC0950d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f7647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f7648b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f7649c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Long f7650d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Integer f7651e;

        b() {
        }

        @Override // T3.AbstractC0950d.a
        AbstractC0950d a() {
            String str = "";
            if (this.f7647a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f7648b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f7649c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f7650d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f7651e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C0947a(this.f7647a.longValue(), this.f7648b.intValue(), this.f7649c.intValue(), this.f7650d.longValue(), this.f7651e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // T3.AbstractC0950d.a
        AbstractC0950d.a b(int i10) {
            this.f7649c = Integer.valueOf(i10);
            return this;
        }

        @Override // T3.AbstractC0950d.a
        AbstractC0950d.a c(long j9) {
            this.f7650d = Long.valueOf(j9);
            return this;
        }

        @Override // T3.AbstractC0950d.a
        AbstractC0950d.a d(int i10) {
            this.f7648b = Integer.valueOf(i10);
            return this;
        }

        @Override // T3.AbstractC0950d.a
        AbstractC0950d.a e(int i10) {
            this.f7651e = Integer.valueOf(i10);
            return this;
        }

        @Override // T3.AbstractC0950d.a
        AbstractC0950d.a f(long j9) {
            this.f7647a = Long.valueOf(j9);
            return this;
        }
    }

    @Override // T3.AbstractC0950d
    int b() {
        return this.f7644d;
    }

    @Override // T3.AbstractC0950d
    long c() {
        return this.f7645e;
    }

    @Override // T3.AbstractC0950d
    int d() {
        return this.f7643c;
    }

    @Override // T3.AbstractC0950d
    int e() {
        return this.f7646f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0950d) {
            AbstractC0950d abstractC0950d = (AbstractC0950d) obj;
            if (this.f7642b == abstractC0950d.f() && this.f7643c == abstractC0950d.d() && this.f7644d == abstractC0950d.b() && this.f7645e == abstractC0950d.c() && this.f7646f == abstractC0950d.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // T3.AbstractC0950d
    long f() {
        return this.f7642b;
    }

    public int hashCode() {
        long j9 = this.f7642b;
        int i10 = (((((((int) (j9 ^ (j9 >>> 32))) ^ 1000003) * 1000003) ^ this.f7643c) * 1000003) ^ this.f7644d) * 1000003;
        long j10 = this.f7645e;
        return this.f7646f ^ ((i10 ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f7642b + ", loadBatchSize=" + this.f7643c + ", criticalSectionEnterTimeoutMs=" + this.f7644d + ", eventCleanUpAge=" + this.f7645e + ", maxBlobByteSizePerRow=" + this.f7646f + "}";
    }

    private C0947a(long j9, int i10, int i11, long j10, int i12) {
        this.f7642b = j9;
        this.f7643c = i10;
        this.f7644d = i11;
        this.f7645e = j10;
        this.f7646f = i12;
    }
}
