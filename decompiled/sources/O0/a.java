package O0;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.n;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final Set a(Set set) {
        n.h(set, "set");
        Set setUnmodifiableSet = Collections.unmodifiableSet(AbstractC1444s.w0(set));
        n.g(setUnmodifiableSet, "unmodifiableSet(set.toSet())");
        return setUnmodifiableSet;
    }

    public static final Map b(Map map) {
        n.h(map, "map");
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        n.g(mapUnmodifiableMap, "unmodifiableMap(map)");
        return mapUnmodifiableMap;
    }
}
