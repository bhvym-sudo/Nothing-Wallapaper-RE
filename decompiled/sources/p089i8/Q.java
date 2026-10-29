package p089i8;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.n;
import p079h8.o;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract class Q extends P {
    public static Map g() {
        G g10 = G.f22251q;
        n.f(g10, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return g10;
    }

    public static Object h(Map map, Object obj) {
        n.h(map, "<this>");
        return O.a(map, obj);
    }

    public static Map i(o... pairs) {
        n.h(pairs, "pairs");
        return pairs.length > 0 ? q(pairs, new LinkedHashMap(P.d(pairs.length))) : g();
    }

    public static Map j(o... pairs) {
        n.h(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(P.d(pairs.length));
        m(linkedHashMap, pairs);
        return linkedHashMap;
    }

    public static final Map k(Map map) {
        n.h(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? map : P.f(map);
        }
        return g();
    }

    public static void l(Map map, Iterable pairs) {
        n.h(map, "<this>");
        n.h(pairs, "pairs");
        Iterator it = pairs.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            map.put(oVar.a(), oVar.b());
        }
    }

    public static final void m(Map map, o[] pairs) {
        n.h(map, "<this>");
        n.h(pairs, "pairs");
        for (o oVar : pairs) {
            map.put(oVar.a(), oVar.b());
        }
    }

    public static Map n(Iterable iterable) {
        n.h(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return k(o(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return g();
        }
        if (size != 1) {
            return o(iterable, new LinkedHashMap(P.d(collection.size())));
        }
        return P.e((o) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
    }

    public static final Map o(Iterable iterable, Map destination) {
        n.h(iterable, "<this>");
        n.h(destination, "destination");
        l(destination, iterable);
        return destination;
    }

    public static Map p(Map map) {
        n.h(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? r(map) : P.f(map);
        }
        return g();
    }

    public static final Map q(o[] oVarArr, Map destination) {
        n.h(oVarArr, "<this>");
        n.h(destination, "destination");
        m(destination, oVarArr);
        return destination;
    }

    public static Map r(Map map) {
        n.h(map, "<this>");
        return new LinkedHashMap(map);
    }
}
