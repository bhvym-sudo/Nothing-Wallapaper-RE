package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1144d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static C1144d f13384c = new C1144d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f13385a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f13386b = new HashMap();

    /* JADX INFO: renamed from: androidx.lifecycle.d$a */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map f13387a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Map f13388b;

        a(Map map) {
            this.f13388b = map;
            for (Map.Entry entry : map.entrySet()) {
                AbstractC1157q.a aVar = (AbstractC1157q.a) entry.getValue();
                List arrayList = (List) this.f13387a.get(aVar);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f13387a.put(aVar, arrayList);
                }
                arrayList.add((b) entry.getKey());
            }
        }

        private static void b(List list, InterfaceC1163x interfaceC1163x, AbstractC1157q.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((b) list.get(size)).a(interfaceC1163x, aVar, obj);
                }
            }
        }

        void a(InterfaceC1163x interfaceC1163x, AbstractC1157q.a aVar, Object obj) {
            b((List) this.f13387a.get(aVar), interfaceC1163x, aVar, obj);
            b((List) this.f13387a.get(AbstractC1157q.a.ON_ANY), interfaceC1163x, aVar, obj);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.d$b */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f13389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Method f13390b;

        b(int i10, Method method) {
            this.f13389a = i10;
            this.f13390b = method;
            method.setAccessible(true);
        }

        void a(InterfaceC1163x interfaceC1163x, AbstractC1157q.a aVar, Object obj) {
            try {
                int i10 = this.f13389a;
                if (i10 == 0) {
                    this.f13390b.invoke(obj, new Object[0]);
                } else if (i10 == 1) {
                    this.f13390b.invoke(obj, interfaceC1163x);
                } else {
                    if (i10 != 2) {
                        return;
                    }
                    this.f13390b.invoke(obj, interfaceC1163x, aVar);
                }
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException("Failed to call observer method", e11.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f13389a == bVar.f13389a && this.f13390b.getName().equals(bVar.f13390b.getName());
        }

        public int hashCode() {
            return (this.f13389a * 31) + this.f13390b.getName().hashCode();
        }
    }

    C1144d() {
    }

    private a a(Class cls, Method[] methodArr) {
        int i10;
        a aVarC;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (aVarC = c(superclass)) != null) {
            map.putAll(aVarC.f13388b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : c(cls2).f13388b.entrySet()) {
                e(map, (b) entry.getKey(), (AbstractC1157q.a) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z9 = false;
        for (Method method : methodArr) {
            J j9 = (J) method.getAnnotation(J.class);
            if (j9 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else {
                    if (!InterfaceC1163x.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i10 = 1;
                }
                AbstractC1157q.a aVarValue = j9.value();
                if (parameterTypes.length > 1) {
                    if (!AbstractC1157q.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (aVarValue != AbstractC1157q.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i10 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(map, new b(i10, method), aVarValue, cls);
                z9 = true;
            }
        }
        a aVar = new a(map);
        this.f13385a.put(cls, aVar);
        this.f13386b.put(cls, Boolean.valueOf(z9));
        return aVar;
    }

    private Method[] b(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e10) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
        }
    }

    private void e(Map map, b bVar, AbstractC1157q.a aVar, Class cls) {
        AbstractC1157q.a aVar2 = (AbstractC1157q.a) map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(bVar, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f13390b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }

    a c(Class cls) {
        a aVar = (a) this.f13385a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    boolean d(Class cls) {
        Boolean bool = (Boolean) this.f13386b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] methodArrB = b(cls);
        for (Method method : methodArrB) {
            if (((J) method.getAnnotation(J.class)) != null) {
                a(cls, methodArrB);
                return true;
            }
        }
        this.f13386b.put(cls, Boolean.FALSE);
        return false;
    }
}
