package p017b6;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f14921a = new c(32);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f14922b = new c(32);

    public static Class a(String str) {
        Map map = f14921a;
        Class<?> cls = (Class) map.get(str);
        if (cls == null) {
            try {
                cls = Class.forName(str);
                map.put(str, cls);
                return cls;
            } catch (ReflectiveOperationException e10) {
                e.a(e10);
            }
        }
        return cls;
    }
}
