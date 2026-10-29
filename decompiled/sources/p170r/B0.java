package p170r;

import java.util.List;
import java.util.Map;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes.dex */
public abstract class B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f25275a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f25276b = new Object();

    public static final Object a(Map map, Object obj) {
        List list = (List) map.get(obj);
        if (list == null) {
            return null;
        }
        Object objE = AbstractC1444s.E(list);
        if (list.isEmpty()) {
            map.remove(obj);
        }
        return objE;
    }
}
