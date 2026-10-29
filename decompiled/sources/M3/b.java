package M3;

/* JADX INFO: loaded from: classes.dex */
final class b extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f4938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f4939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final K3.c f4940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final K3.e f4941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final K3.b f4942e;

    /* JADX INFO: renamed from: M3.b$b, reason: collision with other inner class name */
    static final class C0180b extends l.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private m f4943a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f4944b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private K3.c f4945c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private K3.e f4946d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private K3.b f4947e;

        C0180b() {
        }

        @Override // M3.l.a
        public l a() {
            String str = "";
            if (this.f4943a == null) {
                str = " transportContext";
            }
            if (this.f4944b == null) {
                str = str + " transportName";
            }
            if (this.f4945c == null) {
                str = str + " event";
            }
            if (this.f4946d == null) {
                str = str + " transformer";
            }
            if (this.f4947e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new b(this.f4943a, this.f4944b, this.f4945c, this.f4946d, this.f4947e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // M3.l.a
        l.a b(K3.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f4947e = bVar;
            return this;
        }

        @Override // M3.l.a
        l.a c(K3.c cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null event");
            }
            this.f4945c = cVar;
            return this;
        }

        @Override // M3.l.a
        l.a d(K3.e eVar) {
            if (eVar == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f4946d = eVar;
            return this;
        }

        @Override // M3.l.a
        public l.a e(m mVar) {
            if (mVar == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f4943a = mVar;
            return this;
        }

        @Override // M3.l.a
        public l.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f4944b = str;
            return this;
        }
    }

    @Override // M3.l
    public K3.b b() {
        return this.f4942e;
    }

    @Override // M3.l
    K3.c c() {
        return this.f4940c;
    }

    @Override // M3.l
    K3.e e() {
        return this.f4941d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f4938a.equals(lVar.f()) && this.f4939b.equals(lVar.g()) && this.f4940c.equals(lVar.c()) && this.f4941d.equals(lVar.e()) && this.f4942e.equals(lVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // M3.l
    public m f() {
        return this.f4938a;
    }

    @Override // M3.l
    public String g() {
        return this.f4939b;
    }

    public int hashCode() {
        return this.f4942e.hashCode() ^ ((((((((this.f4938a.hashCode() ^ 1000003) * 1000003) ^ this.f4939b.hashCode()) * 1000003) ^ this.f4940c.hashCode()) * 1000003) ^ this.f4941d.hashCode()) * 1000003);
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f4938a + ", transportName=" + this.f4939b + ", event=" + this.f4940c + ", transformer=" + this.f4941d + ", encoding=" + this.f4942e + "}";
    }

    private b(m mVar, String str, K3.c cVar, K3.e eVar, K3.b bVar) {
        this.f4938a = mVar;
        this.f4939b = str;
        this.f4940c = cVar;
        this.f4941d = eVar;
        this.f4942e = bVar;
    }
}
