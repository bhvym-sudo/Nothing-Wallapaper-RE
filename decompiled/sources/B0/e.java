package B0;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f329b;

    public e(Object obj, Object obj2) {
        this.f328a = obj;
        this.f329b = obj2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return d.a(eVar.f328a, this.f328a) && d.a(eVar.f329b, this.f329b);
    }

    public int hashCode() {
        Object obj = this.f328a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f329b;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f328a + " " + this.f329b + "}";
    }
}
