package p089i8;

import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
abstract class O {
    public static final Object a(Map map, Object obj) {
        n.h(map, "<this>");
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }
}
