package p175r4;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
abstract class G9 extends I9 implements Serializable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private transient Map f25963s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private transient int f25964t;

    protected G9(Map map) {
        if (!map.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.f25963s = map;
    }

    static /* bridge */ /* synthetic */ void n(G9 g10, Object obj) {
        Object objRemove;
        Map map = g10.f25963s;
        map.getClass();
        try {
            objRemove = map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            g10.f25964t -= size;
        }
    }

    @Override // p175r4.J
    public final boolean b(Object obj, Object obj2) {
        Collection collection = (Collection) this.f25963s.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.f25964t++;
            return true;
        }
        Collection collectionG = g();
        if (!collectionG.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f25964t++;
        this.f25963s.put(obj, collectionG);
        return true;
    }

    @Override // p175r4.I9
    final Map e() {
        return new C1876o6(this, this.f25963s);
    }

    @Override // p175r4.I9
    final Set f() {
        return new C1897q7(this, this.f25963s);
    }

    abstract Collection g();

    abstract Collection h(Object obj, Collection collection);

    public final Collection j(Object obj) {
        Collection collectionG = (Collection) this.f25963s.get(obj);
        if (collectionG == null) {
            collectionG = g();
        }
        return h(obj, collectionG);
    }

    final List k(Object obj, List list, T8 t9) {
        return list instanceof RandomAccess ? new R7(this, obj, list, t9) : new F9(this, obj, list, t9);
    }

    public final void o() {
        Iterator it = this.f25963s.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f25963s.clear();
        this.f25964t = 0;
    }
}
