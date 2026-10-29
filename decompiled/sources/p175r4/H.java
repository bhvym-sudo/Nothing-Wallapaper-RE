package p175r4;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
abstract class H extends AbstractMap {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private transient Set f25965q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private transient Collection f25966r;

    H() {
    }

    abstract Set a();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f25965q;
        if (set != null) {
            return set;
        }
        Set setA = a();
        this.f25965q = setA;
        return setA;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f25966r;
        if (collection != null) {
            return collection;
        }
        G g10 = new G(this);
        this.f25966r = g10;
        return g10;
    }
}
