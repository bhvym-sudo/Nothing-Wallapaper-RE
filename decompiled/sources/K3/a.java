package K3;

/* JADX INFO: loaded from: classes.dex */
final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f4082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f4083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f4084c;

    a(Integer num, Object obj, d dVar) {
        this.f4082a = num;
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.f4083b = obj;
        if (dVar == null) {
            throw new NullPointerException("Null priority");
        }
        this.f4084c = dVar;
    }

    @Override // K3.c
    public Integer a() {
        return this.f4082a;
    }

    @Override // K3.c
    public Object b() {
        return this.f4083b;
    }

    @Override // K3.c
    public d c() {
        return this.f4084c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            Integer num = this.f4082a;
            if (num != null ? num.equals(cVar.a()) : cVar.a() == null) {
                if (this.f4083b.equals(cVar.b()) && this.f4084c.equals(cVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f4082a;
        return this.f4084c.hashCode() ^ (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f4083b.hashCode()) * 1000003);
    }

    public String toString() {
        return "Event{code=" + this.f4082a + ", payload=" + this.f4083b + ", priority=" + this.f4084c + "}";
    }
}
