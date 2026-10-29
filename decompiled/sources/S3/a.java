package S3;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V3.a f7226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f7227b;

    a(V3.a aVar, Map map) {
        if (aVar == null) {
            throw new NullPointerException("Null clock");
        }
        this.f7226a = aVar;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f7227b = map;
    }

    @Override // S3.d
    V3.a e() {
        return this.f7226a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f7226a.equals(dVar.e()) && this.f7227b.equals(dVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // S3.d
    Map h() {
        return this.f7227b;
    }

    public int hashCode() {
        return this.f7227b.hashCode() ^ ((this.f7226a.hashCode() ^ 1000003) * 1000003);
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f7226a + ", values=" + this.f7227b + "}";
    }
}
