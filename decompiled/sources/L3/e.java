package L3;

/* JADX INFO: loaded from: classes.dex */
final class e extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k.b f4687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L3.a f4688b;

    static final class b extends k.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private k.b f4689a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private L3.a f4690b;

        b() {
        }

        @Override // L3.k.a
        public k a() {
            return new e(this.f4689a, this.f4690b);
        }

        @Override // L3.k.a
        public k.a b(L3.a aVar) {
            this.f4690b = aVar;
            return this;
        }

        @Override // L3.k.a
        public k.a c(k.b bVar) {
            this.f4689a = bVar;
            return this;
        }
    }

    @Override // L3.k
    public L3.a b() {
        return this.f4688b;
    }

    @Override // L3.k
    public k.b c() {
        return this.f4687a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            k.b bVar = this.f4687a;
            if (bVar != null ? bVar.equals(kVar.c()) : kVar.c() == null) {
                L3.a aVar = this.f4688b;
                if (aVar != null ? aVar.equals(kVar.b()) : kVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        k.b bVar = this.f4687a;
        int iHashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        L3.a aVar = this.f4688b;
        return iHashCode ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f4687a + ", androidClientInfo=" + this.f4688b + "}";
    }

    private e(k.b bVar, L3.a aVar) {
        this.f4687a = bVar;
        this.f4688b = aVar;
    }
}
