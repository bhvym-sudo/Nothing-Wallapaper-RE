package p017b6;

import java.lang.reflect.Field;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f14981a = new c(32);

    public static Field a(Class cls, String str, Class cls2) {
        a.b(cls, "Class must not be null");
        a.a((str == null && cls2 == null) ? false : true, "Either name or type of the field must be specified");
        Field field = (Field) f14981a.get(cls.getName() + str);
        if (field != null) {
            return field;
        }
        for (Class superclass = cls; !Object.class.equals(superclass) && superclass != null; superclass = superclass.getSuperclass()) {
            for (Field field2 : superclass.getDeclaredFields()) {
                if ((str == null || str.equals(field2.getName())) && (cls2 == null || cls2.equals(field2.getType()))) {
                    f14981a.put(cls.getName() + str, field2);
                    return field2;
                }
            }
        }
        return null;
    }

    public static Object b(Field field, Object obj) {
        try {
            return field.get(obj);
        } catch (IllegalAccessException e10) {
            e.a(e10);
            return null;
        }
    }
}
