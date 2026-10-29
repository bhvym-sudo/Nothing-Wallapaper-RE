package L3;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class d extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f4686a;

    d(List list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.f4686a = list;
    }

    @Override // L3.j
    public List c() {
        return this.f4686a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.f4686a.equals(((j) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f4686a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f4686a + "}";
    }
}
