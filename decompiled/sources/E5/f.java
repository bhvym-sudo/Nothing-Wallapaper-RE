package E5;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.q;
import p079h8.r;
import p219v8.l;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f1291a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final InterfaceC0048f f1292b = new a();

    /* JADX INFO: Access modifiers changed from: private */
    static final class a implements InterfaceC0048f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f1293a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final k f1294b = new k();

        /* JADX INFO: Access modifiers changed from: private */
        public static final Map g(ClassLoader it) {
            n.h(it, "it");
            return new HashMap();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Map h(l tmp0, Object obj) {
            n.h(tmp0, "$tmp0");
            return (Map) tmp0.f(obj);
        }

        @Override // E5.f.InterfaceC0048f
        public g a(String className) {
            n.h(className, "className");
            return f(a.class.getClassLoader(), className);
        }

        @Override // E5.f.InterfaceC0048f
        public g b(Object target) {
            n.h(target, "target");
            return e(target.getClass());
        }

        public g e(Class clazz) {
            n.h(clazz, "clazz");
            ClassLoader classLoader = clazz.getClassLoader();
            String name = clazz.getName();
            n.g(name, "getName(...)");
            return f(classLoader, name);
        }

        public g f(ClassLoader classLoader, String className) {
            Object objB;
            n.h(className, "className");
            try {
                q.a aVar = q.f21862r;
                if (classLoader == null) {
                    throw new ClassNotFoundException("Can not find class loader from given class name = " + className);
                }
                HashMap map = this.f1293a;
                final l lVar = new l() { // from class: E5.d
                    @Override // p219v8.l
                    public final Object f(Object obj) {
                        return f.a.g((ClassLoader) obj);
                    }
                };
                Object objComputeIfAbsent = map.computeIfAbsent(classLoader, new Function() { // from class: E5.e
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return f.a.h(lVar, obj);
                    }
                });
                n.g(objComputeIfAbsent, "computeIfAbsent(...)");
                Map map2 = (Map) objComputeIfAbsent;
                Object bVar = (g) map2.get(className);
                if (bVar == null) {
                    Class<?> clsLoadClass = classLoader.loadClass(className);
                    n.e(clsLoadClass);
                    bVar = new b(clsLoadClass);
                    map2.put(className, bVar);
                }
                objB = q.b(bVar);
                k kVar = this.f1294b;
                if (q.f(objB)) {
                    objB = kVar;
                }
                return (g) objB;
            } catch (Throwable th) {
                q.a aVar2 = q.f21862r;
                objB = q.b(r.a(th));
            }
        }
    }

    private static final class b implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f1295a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HashMap f1296b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final HashMap f1297c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final HashMap f1298d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final a f1299e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final c f1300f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final C0047b f1301g;

        public static final class a implements h {
            a() {
            }

            @Override // E5.f.h
            public Object a(Object... objArr) {
                return h.a.a(this, objArr);
            }
        }

        /* JADX INFO: renamed from: E5.f$b$b, reason: collision with other inner class name */
        public static final class C0047b implements i {
            C0047b() {
            }

            @Override // E5.f.i
            public void a(Object obj, int i10) {
                i.a.c(this, obj, i10);
            }

            @Override // E5.f.i
            public void b(Object obj, float f10) {
                i.a.b(this, obj, f10);
            }

            @Override // E5.f.i
            public void c(Object obj, boolean z9) {
                i.a.a(this, obj, z9);
            }

            @Override // E5.f.i
            public void d(Object obj, Object obj2) {
                i.a.d(this, obj, obj2);
            }
        }

        public static final class c implements j {
            c() {
            }

            @Override // E5.f.j
            public Object a(Object obj, Object... objArr) {
                return j.a.b(this, obj, objArr);
            }

            @Override // E5.f.j
            public Object b(Object obj, Object... objArr) {
                return j.a.a(this, obj, objArr);
            }
        }

        public b(Class targetClass) {
            n.h(targetClass, "targetClass");
            this.f1295a = targetClass;
            this.f1296b = new HashMap();
            this.f1297c = new HashMap();
            this.f1298d = new HashMap();
            this.f1299e = new a();
            this.f1300f = new c();
            this.f1301g = new C0047b();
        }

        @Override // E5.f.g
        public j a(String methodName, Class... parameterTypes) {
            Object objB;
            Method declaredMethod;
            n.h(methodName, "methodName");
            n.h(parameterTypes, "parameterTypes");
            try {
                q.a aVar = q.f21862r;
                StringBuilder sb = new StringBuilder(methodName);
                if (!(parameterTypes.length == 0)) {
                    for (Class cls : parameterTypes) {
                        sb.append(cls.getName());
                    }
                }
                String string = sb.toString();
                n.g(string, "toString(...)");
                j jVar = (j) this.f1297c.get(string);
                if (jVar == null) {
                    Class superclass = this.f1295a;
                    while (true) {
                        if (superclass == null) {
                            declaredMethod = null;
                            break;
                        }
                        try {
                            declaredMethod = superclass.getDeclaredMethod(methodName, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
                            break;
                        } catch (Exception unused) {
                            superclass = superclass.getSuperclass();
                        }
                    }
                    if (declaredMethod == null) {
                        String string2 = Arrays.toString(parameterTypes);
                        n.g(string2, "toString(...)");
                        throw new NoSuchMethodException(methodName + " can not found with params =  " + string2);
                    }
                    e eVar = new e(declaredMethod);
                    this.f1297c.put(string, eVar);
                    jVar = eVar;
                }
                objB = q.b(jVar);
            } catch (Throwable th) {
                q.a aVar2 = q.f21862r;
                objB = q.b(r.a(th));
            }
            c cVar = this.f1300f;
            if (q.f(objB)) {
                objB = cVar;
            }
            return (j) objB;
        }

        @Override // E5.f.g
        public h b(Class... parameterTypes) {
            Object objB;
            n.h(parameterTypes, "parameterTypes");
            try {
                q.a aVar = q.f21862r;
                StringBuilder sb = new StringBuilder();
                if (!(parameterTypes.length == 0)) {
                    for (Class cls : parameterTypes) {
                        sb.append(cls.getName());
                    }
                }
                String string = sb.toString();
                n.g(string, "toString(...)");
                Object cVar = (h) this.f1296b.get(string);
                if (cVar == null) {
                    Constructor constructor = this.f1295a.getConstructor((Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
                    n.e(constructor);
                    cVar = new c(constructor);
                    this.f1296b.put(string, cVar);
                }
                objB = q.b(cVar);
            } catch (Throwable th) {
                q.a aVar2 = q.f21862r;
                objB = q.b(r.a(th));
            }
            a aVar3 = this.f1299e;
            if (q.f(objB)) {
                objB = aVar3;
            }
            return (h) objB;
        }

        @Override // E5.f.g
        public i c(String fieldName) {
            Object objB;
            Field declaredField;
            n.h(fieldName, "fieldName");
            try {
                q.a aVar = q.f21862r;
                i iVar = (i) this.f1298d.get(fieldName);
                if (iVar == null) {
                    Class superclass = this.f1295a;
                    while (true) {
                        if (superclass == null) {
                            declaredField = null;
                            break;
                        }
                        try {
                            declaredField = superclass.getDeclaredField(fieldName);
                            break;
                        } catch (Exception unused) {
                            superclass = superclass.getSuperclass();
                        }
                    }
                    if (declaredField == null) {
                        throw new NoSuchFieldException(fieldName + " can not found from the given class:" + this.f1295a);
                    }
                    d dVar = new d(declaredField);
                    this.f1298d.put(fieldName, dVar);
                    iVar = dVar;
                }
                objB = q.b(iVar);
            } catch (Throwable th) {
                q.a aVar2 = q.f21862r;
                objB = q.b(r.a(th));
            }
            C0047b c0047b = this.f1301g;
            if (q.f(objB)) {
                objB = c0047b;
            }
            return (i) objB;
        }
    }

    private static final class c implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Constructor f1302a;

        public c(Constructor constructor) {
            n.h(constructor, "constructor");
            this.f1302a = constructor;
            constructor.setAccessible(true);
        }

        @Override // E5.f.h
        public Object a(Object... args) {
            Object objB;
            n.h(args, "args");
            try {
                q.a aVar = q.f21862r;
                objB = q.b(this.f1302a.newInstance(Arrays.copyOf(args, args.length)));
            } catch (Throwable th) {
                q.a aVar2 = q.f21862r;
                objB = q.b(r.a(th));
            }
            if (q.f(objB)) {
                return null;
            }
            return objB;
        }
    }

    private static final class d implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Field f1303a;

        public d(Field field) {
            n.h(field, "field");
            this.f1303a = field;
            field.setAccessible(true);
        }

        @Override // E5.f.i
        public void a(Object obj, int i10) {
            try {
                q.a aVar = q.f21862r;
                this.f1303a.setInt(obj, i10);
                q.b(A.f21846a);
            } catch (Throwable th) {
                q.a aVar2 = q.f21862r;
                q.b(r.a(th));
            }
        }

        @Override // E5.f.i
        public void b(Object obj, float f10) {
            try {
                q.a aVar = q.f21862r;
                this.f1303a.setFloat(obj, f10);
                q.b(A.f21846a);
            } catch (Throwable th) {
                q.a aVar2 = q.f21862r;
                q.b(r.a(th));
            }
        }

        @Override // E5.f.i
        public void c(Object obj, boolean z9) {
            try {
                q.a aVar = q.f21862r;
                this.f1303a.setBoolean(obj, z9);
                q.b(A.f21846a);
            } catch (Throwable th) {
                q.a aVar2 = q.f21862r;
                q.b(r.a(th));
            }
        }

        @Override // E5.f.i
        public void d(Object obj, Object obj2) {
            try {
                q.a aVar = q.f21862r;
                this.f1303a.set(obj, obj2);
                q.b(A.f21846a);
            } catch (Throwable th) {
                q.a aVar2 = q.f21862r;
                q.b(r.a(th));
            }
        }
    }

    private static final class e implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f1304a;

        public e(Method method) {
            n.h(method, "method");
            this.f1304a = method;
            method.setAccessible(true);
        }

        @Override // E5.f.j
        public Object a(Object obj, Object... args) {
            Object objB;
            n.h(args, "args");
            try {
                q.a aVar = q.f21862r;
                objB = q.b(this.f1304a.invoke(obj, Arrays.copyOf(args, args.length)));
            } catch (Throwable th) {
                q.a aVar2 = q.f21862r;
                objB = q.b(r.a(th));
            }
            if (q.f(objB)) {
                return null;
            }
            return objB;
        }

        @Override // E5.f.j
        public Object b(Object obj, Object... args) {
            n.h(args, "args");
            return this.f1304a.invoke(obj, Arrays.copyOf(args, args.length));
        }
    }

    /* JADX INFO: renamed from: E5.f$f, reason: collision with other inner class name */
    public interface InterfaceC0048f {
        g a(String str);

        g b(Object obj);
    }

    public interface g {

        public static final class a {

            /* JADX INFO: renamed from: E5.f$g$a$a, reason: collision with other inner class name */
            public static final class C0049a implements h {
                C0049a() {
                }

                @Override // E5.f.h
                public Object a(Object... objArr) {
                    return h.a.a(this, objArr);
                }
            }

            public static final class b implements i {
                b() {
                }

                @Override // E5.f.i
                public void a(Object obj, int i10) {
                    i.a.c(this, obj, i10);
                }

                @Override // E5.f.i
                public void b(Object obj, float f10) {
                    i.a.b(this, obj, f10);
                }

                @Override // E5.f.i
                public void c(Object obj, boolean z9) {
                    i.a.a(this, obj, z9);
                }

                @Override // E5.f.i
                public void d(Object obj, Object obj2) {
                    i.a.d(this, obj, obj2);
                }
            }

            public static final class c implements j {
                c() {
                }

                @Override // E5.f.j
                public Object a(Object obj, Object... objArr) {
                    return j.a.b(this, obj, objArr);
                }

                @Override // E5.f.j
                public Object b(Object obj, Object... objArr) {
                    return j.a.a(this, obj, objArr);
                }
            }

            public static h a(g gVar, Class... parameterTypes) {
                n.h(parameterTypes, "parameterTypes");
                return new C0049a();
            }

            public static i b(g gVar, String fieldName) {
                n.h(fieldName, "fieldName");
                return new b();
            }

            public static j c(g gVar, String methodName, Class... parameterTypes) {
                n.h(methodName, "methodName");
                n.h(parameterTypes, "parameterTypes");
                return new c();
            }
        }

        j a(String str, Class... clsArr);

        h b(Class... clsArr);

        i c(String str);
    }

    public interface h {

        public static final class a {
            public static Object a(h hVar, Object... args) {
                n.h(args, "args");
                return null;
            }
        }

        Object a(Object... objArr);
    }

    public interface i {

        public static final class a {
            public static void a(i iVar, Object obj, boolean z9) {
            }

            public static void b(i iVar, Object obj, float f10) {
            }

            public static void c(i iVar, Object obj, int i10) {
            }

            public static void d(i iVar, Object obj, Object obj2) {
            }
        }

        void a(Object obj, int i10);

        void b(Object obj, float f10);

        void c(Object obj, boolean z9);

        void d(Object obj, Object obj2);
    }

    public interface j {

        public static final class a {
            public static Object a(j jVar, Object obj, Object... args) {
                n.h(args, "args");
                return null;
            }

            public static Object b(j jVar, Object obj, Object... args) {
                n.h(args, "args");
                return null;
            }
        }

        Object a(Object obj, Object... objArr);

        Object b(Object obj, Object... objArr);
    }

    public static final class k implements g {
        @Override // E5.f.g
        public j a(String str, Class... clsArr) {
            return g.a.c(this, str, clsArr);
        }

        @Override // E5.f.g
        public h b(Class... clsArr) {
            return g.a.a(this, clsArr);
        }

        @Override // E5.f.g
        public i c(String str) {
            return g.a.b(this, str);
        }
    }

    private f() {
    }

    public static final g a(Object target) {
        n.h(target, "target");
        return f1292b.b(target);
    }

    public static final g b(String className) {
        n.h(className, "className");
        return f1292b.a(className);
    }
}
