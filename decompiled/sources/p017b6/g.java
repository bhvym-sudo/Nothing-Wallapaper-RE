package p017b6;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f14982a = new c(32);

    public static Method a(Class cls, String str, Class... clsArr) {
        a.b(cls, "Class must not be null");
        a.b(str, "Method name must not be null");
        Method method = (Method) f14982a.get(cls.getName() + str + Arrays.toString(clsArr));
        if (method != null) {
            return method;
        }
        for (Class superclass = cls; superclass != null; superclass = superclass.getSuperclass()) {
            for (Method method2 : superclass.isInterface() ? superclass.getMethods() : superclass.getDeclaredMethods()) {
                if (str.equals(method2.getName()) && (clsArr == null || Arrays.equals(clsArr, method2.getParameterTypes()))) {
                    f14982a.put(cls.getName() + str + Arrays.toString(clsArr), method2);
                    return method2;
                }
            }
        }
        return null;
    }

    public static Object b(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (ReflectiveOperationException e10) {
            e.a(e10);
            return null;
        }
    }
}
