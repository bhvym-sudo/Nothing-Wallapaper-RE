package L3;

/* JADX INFO: loaded from: classes.dex */
final class i extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o.c f4720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o.b f4721b;

    static final class b extends o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private o.c f4722a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private o.b f4723b;

        b() {
        }

        @Override // L3.o.a
        public o a() {
            return new i(this.f4722a, this.f4723b);
        }

        @Override // L3.o.a
        public o.a b(o.b bVar) {
            this.f4723b = bVar;
            return this;
        }

        @Override // L3.o.a
        public o.a c(o.c cVar) {
            this.f4722a = cVar;
            return this;
        }
    }

    @Override // L3.o
    public o.b b() {
        return this.f4721b;
    }

    @Override // L3.o
    public o.c c() {
        return this.f4720a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            o.c cVar = this.f4720a;
            if (cVar != null ? cVar.equals(oVar.c()) : oVar.c() == null) {
                o.b bVar = this.f4721b;
                if (bVar != null ? bVar.equals(oVar.b()) : oVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        o.c cVar = this.f4720a;
        int iHashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        o.b bVar = this.f4721b;
        return iHashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f4720a + ", mobileSubtype=" + this.f4721b + "}";
    }

    private i(o.c cVar, o.b bVar) {
        this.f4720a = cVar;
        this.f4721b = bVar;
    }
}
