package androidx.fragment.app;

/* JADX INFO: renamed from: androidx.fragment.app.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1140z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final androidx.collection.P f13254a = new androidx.collection.P();

    static boolean b(ClassLoader classLoader, String str) {
        try {
            return AbstractComponentCallbacksC1132q.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static Class c(ClassLoader classLoader, String str) throws ClassNotFoundException {
        androidx.collection.P p9 = f13254a;
        androidx.collection.P p10 = (androidx.collection.P) p9.get(classLoader);
        if (p10 == null) {
            p10 = new androidx.collection.P();
            p9.put(classLoader, p10);
        }
        Class cls = (Class) p10.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        p10.put(str, cls2);
        return cls2;
    }

    public static Class d(ClassLoader classLoader, String str) {
        try {
            return c(classLoader, str);
        } catch (ClassCastException e10) {
            throw new AbstractComponentCallbacksC1132q.l("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e10);
        } catch (ClassNotFoundException e11) {
            throw new AbstractComponentCallbacksC1132q.l("Unable to instantiate fragment " + str + ": make sure class name exists", e11);
        }
    }

    public abstract AbstractComponentCallbacksC1132q a(ClassLoader classLoader, String str);
}
