package p175r4;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class U {
    static int a(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    static boolean b(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof K) {
            collection = ((K) collection).zza();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return c(set, collection.iterator());
        }
        Iterator it = set.iterator();
        collection.getClass();
        boolean z9 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z9 = true;
            }
        }
        return z9;
    }

    static boolean c(Set set, Iterator it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }
}
