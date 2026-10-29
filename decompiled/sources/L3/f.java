package L3;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class f extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f4691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f4692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f4693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f4694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f4695e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f4696f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final o f4697g;

    static final class b extends l.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f4698a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f4699b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f4700c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f4701d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f4702e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Long f4703f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private o f4704g;

        b() {
        }

        @Override // L3.l.a
        public l a() {
            String str = "";
            if (this.f4698a == null) {
                str = " eventTimeMs";
            }
            if (this.f4700c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f4703f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new f(this.f4698a.longValue(), this.f4699b, this.f4700c.longValue(), this.f4701d, this.f4702e, this.f4703f.longValue(), this.f4704g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // L3.l.a
        public l.a b(Integer num) {
            this.f4699b = num;
            return this;
        }

        @Override // L3.l.a
        public l.a c(long j9) {
            this.f4698a = Long.valueOf(j9);
            return this;
        }

        @Override // L3.l.a
        public l.a d(long j9) {
            this.f4700c = Long.valueOf(j9);
            return this;
        }

        @Override // L3.l.a
        public l.a e(o oVar) {
            this.f4704g = oVar;
            return this;
        }

        @Override // L3.l.a
        l.a f(byte[] bArr) {
            this.f4701d = bArr;
            return this;
        }

        @Override // L3.l.a
        l.a g(String str) {
            this.f4702e = str;
            return this;
        }

        @Override // L3.l.a
        public l.a h(long j9) {
            this.f4703f = Long.valueOf(j9);
            return this;
        }
    }

    @Override // L3.l
    public Integer b() {
        return this.f4692b;
    }

    @Override // L3.l
    public long c() {
        return this.f4691a;
    }

    @Override // L3.l
    public long d() {
        return this.f4693c;
    }

    @Override // L3.l
    public o e() {
        return this.f4697g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        o oVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f4691a == lVar.c() && ((num = this.f4692b) != null ? num.equals(lVar.b()) : lVar.b() == null) && this.f4693c == lVar.d()) {
                if (Arrays.equals(this.f4694d, lVar instanceof f ? ((f) lVar).f4694d : lVar.f()) && ((str = this.f4695e) != null ? str.equals(lVar.g()) : lVar.g() == null) && this.f4696f == lVar.h() && ((oVar = this.f4697g) != null ? oVar.equals(lVar.e()) : lVar.e() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // L3.l
    public byte[] f() {
        return this.f4694d;
    }

    @Override // L3.l
    public String g() {
        return this.f4695e;
    }

    @Override // L3.l
    public long h() {
        return this.f4696f;
    }

    public int hashCode() {
        long j9 = this.f4691a;
        int i10 = (((int) (j9 ^ (j9 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f4692b;
        int iHashCode = num == null ? 0 : num.hashCode();
        long j10 = this.f4693c;
        int iHashCode2 = (((((i10 ^ iHashCode) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f4694d)) * 1000003;
        String str = this.f4695e;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        long j11 = this.f4696f;
        int i11 = (((iHashCode2 ^ iHashCode3) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        o oVar = this.f4697g;
        return i11 ^ (oVar != null ? oVar.hashCode() : 0);
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f4691a + ", eventCode=" + this.f4692b + ", eventUptimeMs=" + this.f4693c + ", sourceExtension=" + Arrays.toString(this.f4694d) + ", sourceExtensionJsonProto3=" + this.f4695e + ", timezoneOffsetSeconds=" + this.f4696f + ", networkConnectionInfo=" + this.f4697g + "}";
    }

    private f(long j9, Integer num, long j10, byte[] bArr, String str, long j11, o oVar) {
        this.f4691a = j9;
        this.f4692b = num;
        this.f4693c = j10;
        this.f4694d = bArr;
        this.f4695e = str;
        this.f4696f = j11;
        this.f4697g = oVar;
    }
}
