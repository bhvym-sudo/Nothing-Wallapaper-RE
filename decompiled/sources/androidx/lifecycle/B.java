package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B f13256a = new B();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f13257b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f13258c = new HashMap();

    private B() {
    }

    private final InterfaceC1154n a(Constructor constructor, Object obj) {
        try {
            Object objNewInstance = constructor.newInstance(obj);
            kotlin.jvm.internal.n.g(objNewInstance, "{\n            constructo…tance(`object`)\n        }");
            androidx.appcompat.app.o.a(objNewInstance);
            return null;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    private final Constructor b(Class cls) {
        try {
            Package r9 = cls.getPackage();
            String name = cls.getCanonicalName();
            String fullPackage = r9 != null ? r9.getName() : "";
            kotlin.jvm.internal.n.g(fullPackage, "fullPackage");
            if (fullPackage.length() != 0) {
                kotlin.jvm.internal.n.g(name, "name");
                name = name.substring(fullPackage.length() + 1);
                kotlin.jvm.internal.n.g(name, "this as java.lang.String).substring(startIndex)");
            }
            kotlin.jvm.internal.n.g(name, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String strC = c(name);
            if (fullPackage.length() != 0) {
                strC = fullPackage + '.' + strC;
            }
            Class<?> cls2 = Class.forName(strC);
            kotlin.jvm.internal.n.f(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor<?> declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static final String c(String className) {
        kotlin.jvm.internal.n.h(className, "className");
        return E8.i.I(className, ".", "_", false, 4, null) + "_LifecycleAdapter";
    }

    private final int d(Class cls) {
        Map map = f13257b;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int iG = g(cls);
        map.put(cls, Integer.valueOf(iG));
        return iG;
    }

    private final boolean e(Class cls) {
        return cls != null && InterfaceC1162w.class.isAssignableFrom(cls);
    }

    public static final InterfaceC1160u f(Object object) {
        kotlin.jvm.internal.n.h(object, "object");
        boolean z9 = object instanceof InterfaceC1160u;
        boolean z10 = object instanceof InterfaceC1148h;
        if (z9 && z10) {
            return new C1149i((InterfaceC1148h) object, (InterfaceC1160u) object);
        }
        if (z10) {
            return new C1149i((InterfaceC1148h) object, null);
        }
        if (z9) {
            return (InterfaceC1160u) object;
        }
        Class<?> cls = object.getClass();
        B b10 = f13256a;
        if (b10.d(cls) != 2) {
            return new M(object);
        }
        Object obj = f13258c.get(cls);
        kotlin.jvm.internal.n.e(obj);
        List list = (List) obj;
        if (list.size() == 1) {
            b10.a((Constructor) list.get(0), object);
            return new Z(null);
        }
        int size = list.size();
        InterfaceC1154n[] interfaceC1154nArr = new InterfaceC1154n[size];
        for (int i10 = 0; i10 < size; i10++) {
            f13256a.a((Constructor) list.get(i10), object);
            interfaceC1154nArr[i10] = null;
        }
        return new C1145e(interfaceC1154nArr);
    }

    private final int g(Class cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor constructorB = b(cls);
        if (constructorB != null) {
            f13258c.put(cls, AbstractC1444s.e(constructorB));
            return 2;
        }
        if (C1144d.f13384c.d(cls)) {
            return 1;
        }
        Class superclass = cls.getSuperclass();
        if (e(superclass)) {
            kotlin.jvm.internal.n.g(superclass, "superclass");
            if (d(superclass) == 1) {
                return 1;
            }
            Object obj = f13258c.get(superclass);
            kotlin.jvm.internal.n.e(obj);
            arrayList = new ArrayList((Collection) obj);
        } else {
            arrayList = null;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        kotlin.jvm.internal.n.g(interfaces, "klass.interfaces");
        for (Class<?> intrface : interfaces) {
            if (e(intrface)) {
                kotlin.jvm.internal.n.g(intrface, "intrface");
                if (d(intrface) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                Object obj2 = f13258c.get(intrface);
                kotlin.jvm.internal.n.e(obj2);
                arrayList.addAll((Collection) obj2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f13258c.put(cls, arrayList);
        return 2;
    }
}
