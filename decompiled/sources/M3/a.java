package M3;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class a extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f4926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f4927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f4928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f4929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f4930e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f4931f;

    static final class b extends h.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f4932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f4933b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private g f4934c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Long f4935d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Long f4936e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Map f4937f;

        b() {
        }

        @Override // M3.h.a
        public h d() {
            String str = "";
            if (this.f4932a == null) {
                str = " transportName";
            }
            if (this.f4934c == null) {
                str = str + " encodedPayload";
            }
            if (this.f4935d == null) {
                str = str + " eventMillis";
            }
            if (this.f4936e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f4937f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new a(this.f4932a, this.f4933b, this.f4934c, this.f4935d.longValue(), this.f4936e.longValue(), this.f4937f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // M3.h.a
        protected Map e() {
            Map map = this.f4937f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // M3.h.a
        protected h.a f(Map map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f4937f = map;
            return this;
        }

        @Override // M3.h.a
        public h.a g(Integer num) {
            this.f4933b = num;
            return this;
        }

        @Override // M3.h.a
        public h.a h(g gVar) {
            if (gVar == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f4934c = gVar;
            return this;
        }

        @Override // M3.h.a
        public h.a i(long j9) {
            this.f4935d = Long.valueOf(j9);
            return this;
        }

        @Override // M3.h.a
        public h.a j(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f4932a = str;
            return this;
        }

        @Override // M3.h.a
        public h.a k(long j9) {
            this.f4936e = Long.valueOf(j9);
            return this;
        }
    }

    @Override // M3.h
    protected Map c() {
        return this.f4931f;
    }

    @Override // M3.h
    public Integer d() {
        return this.f4927b;
    }

    @Override // M3.h
    public g e() {
        return this.f4928c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f4926a.equals(hVar.j()) && ((num = this.f4927b) != null ? num.equals(hVar.d()) : hVar.d() == null) && this.f4928c.equals(hVar.e()) && this.f4929d == hVar.f() && this.f4930e == hVar.k() && this.f4931f.equals(hVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // M3.h
    public long f() {
        return this.f4929d;
    }

    public int hashCode() {
        int iHashCode = (this.f4926a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f4927b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f4928c.hashCode()) * 1000003;
        long j9 = this.f4929d;
        int i10 = (iHashCode2 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        long j10 = this.f4930e;
        return this.f4931f.hashCode() ^ ((i10 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    @Override // M3.h
    public String j() {
        return this.f4926a;
    }

    @Override // M3.h
    public long k() {
        return this.f4930e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f4926a + ", code=" + this.f4927b + ", encodedPayload=" + this.f4928c + ", eventMillis=" + this.f4929d + ", uptimeMillis=" + this.f4930e + ", autoMetadata=" + this.f4931f + "}";
    }

    private a(String str, Integer num, g gVar, long j9, long j10, Map map) {
        this.f4926a = str;
        this.f4927b = num;
        this.f4928c = gVar;
        this.f4929d = j9;
        this.f4930e = j10;
        this.f4931f = map;
    }
}
