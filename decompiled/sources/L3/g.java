package L3;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class g extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f4705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f4706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k f4707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f4708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f4709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f4710f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p f4711g;

    static final class b extends m.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f4712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f4713b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private k f4714c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f4715d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f4716e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List f4717f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private p f4718g;

        b() {
        }

        @Override // L3.m.a
        public m a() {
            String str = "";
            if (this.f4712a == null) {
                str = " requestTimeMs";
            }
            if (this.f4713b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new g(this.f4712a.longValue(), this.f4713b.longValue(), this.f4714c, this.f4715d, this.f4716e, this.f4717f, this.f4718g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // L3.m.a
        public m.a b(k kVar) {
            this.f4714c = kVar;
            return this;
        }

        @Override // L3.m.a
        public m.a c(List list) {
            this.f4717f = list;
            return this;
        }

        @Override // L3.m.a
        m.a d(Integer num) {
            this.f4715d = num;
            return this;
        }

        @Override // L3.m.a
        m.a e(String str) {
            this.f4716e = str;
            return this;
        }

        @Override // L3.m.a
        public m.a f(p pVar) {
            this.f4718g = pVar;
            return this;
        }

        @Override // L3.m.a
        public m.a g(long j9) {
            this.f4712a = Long.valueOf(j9);
            return this;
        }

        @Override // L3.m.a
        public m.a h(long j9) {
            this.f4713b = Long.valueOf(j9);
            return this;
        }
    }

    @Override // L3.m
    public k b() {
        return this.f4707c;
    }

    @Override // L3.m
    public List c() {
        return this.f4710f;
    }

    @Override // L3.m
    public Integer d() {
        return this.f4708d;
    }

    @Override // L3.m
    public String e() {
        return this.f4709e;
    }

    public boolean equals(Object obj) {
        k kVar;
        Integer num;
        String str;
        List list;
        p pVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f4705a == mVar.g() && this.f4706b == mVar.h() && ((kVar = this.f4707c) != null ? kVar.equals(mVar.b()) : mVar.b() == null) && ((num = this.f4708d) != null ? num.equals(mVar.d()) : mVar.d() == null) && ((str = this.f4709e) != null ? str.equals(mVar.e()) : mVar.e() == null) && ((list = this.f4710f) != null ? list.equals(mVar.c()) : mVar.c() == null) && ((pVar = this.f4711g) != null ? pVar.equals(mVar.f()) : mVar.f() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // L3.m
    public p f() {
        return this.f4711g;
    }

    @Override // L3.m
    public long g() {
        return this.f4705a;
    }

    @Override // L3.m
    public long h() {
        return this.f4706b;
    }

    public int hashCode() {
        long j9 = this.f4705a;
        long j10 = this.f4706b;
        int i10 = (((((int) (j9 ^ (j9 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003;
        k kVar = this.f4707c;
        int iHashCode = (i10 ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003;
        Integer num = this.f4708d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f4709e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f4710f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        p pVar = this.f4711g;
        return iHashCode4 ^ (pVar != null ? pVar.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f4705a + ", requestUptimeMs=" + this.f4706b + ", clientInfo=" + this.f4707c + ", logSource=" + this.f4708d + ", logSourceName=" + this.f4709e + ", logEvents=" + this.f4710f + ", qosTier=" + this.f4711g + "}";
    }

    private g(long j9, long j10, k kVar, Integer num, String str, List list, p pVar) {
        this.f4705a = j9;
        this.f4706b = j10;
        this.f4707c = kVar;
        this.f4708d = num;
        this.f4709e = str;
        this.f4710f = list;
        this.f4711g = pVar;
    }
}
