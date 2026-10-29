package p175r4;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
abstract class I9 implements J {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private transient Set f25998q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private transient Map f25999r;

    I9() {
    }

    @Override // p175r4.J
    public final Map a() {
        Map map = this.f25999r;
        if (map != null) {
            return map;
        }
        Map mapE = e();
        this.f25999r = mapE;
        return mapE;
    }

    @Override // p175r4.J
    public final Set d() {
        Set set = this.f25998q;
        if (set != null) {
            return set;
        }
        Set setF = f();
        this.f25998q = setF;
        return setF;
    }

    abstract Map e();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof J) {
            return a().equals(((J) obj).a());
        }
        return false;
    }

    abstract Set f();

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
