package p089i8;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract class X extends W {
    public static Set g(Set set, Iterable elements) {
        n.h(set, "<this>");
        n.h(elements, "elements");
        Collection<?> collectionB = z.B(elements);
        if (collectionB.isEmpty()) {
            return D.w0(set);
        }
        if (!(collectionB instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionB);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!((Set) collectionB).contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    public static Set h(Set set, Iterable elements) {
        int size;
        n.h(set, "<this>");
        n.h(elements, "elements");
        Integer numV = AbstractC1447v.v(elements);
        if (numV != null) {
            size = set.size() + numV.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(P.d(size));
        linkedHashSet.addAll(set);
        z.z(linkedHashSet, elements);
        return linkedHashSet;
    }
}
