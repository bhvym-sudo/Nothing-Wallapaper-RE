package g9;

import P8.InterfaceC0939e;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f21545a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final InterfaceC0939e.a f21546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final P8.v f21547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final List f21548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f21549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final List f21550f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f21551g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Executor f21552h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final boolean f21553i;

    class a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object[] f21554a = new Object[0];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f21555b;

        a(Class cls) {
            this.f21555b = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f21554a;
            }
            u uVar = t.f21487b;
            return uVar.c(method) ? uVar.b(method, this.f21555b, obj, objArr) : y.this.c(this.f21555b, method).a(obj, objArr);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private InterfaceC0939e.a f21557a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private P8.v f21558b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f21559c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f21560d = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Executor f21561e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f21562f;

        public b a(h.a aVar) {
            List list = this.f21559c;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public b b(P8.v vVar) {
            Objects.requireNonNull(vVar, "baseUrl == null");
            List listM = vVar.m();
            if ("".equals(listM.get(listM.size() - 1))) {
                this.f21558b = vVar;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + vVar);
        }

        public b c(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return b(P8.v.h(str));
        }

        public y d() {
            if (this.f21558b == null) {
                throw new IllegalStateException("Base URL required.");
            }
            InterfaceC0939e.a zVar = this.f21557a;
            if (zVar == null) {
                zVar = new P8.z();
            }
            InterfaceC0939e.a aVar = zVar;
            Executor executor = this.f21561e;
            if (executor == null) {
                executor = t.f21486a;
            }
            Executor executor2 = executor;
            C1360c c1360c = t.f21488c;
            ArrayList arrayList = new ArrayList(this.f21560d);
            List listA = c1360c.a(executor2);
            arrayList.addAll(listA);
            List listB = c1360c.b();
            int size = listB.size();
            ArrayList arrayList2 = new ArrayList(this.f21559c.size() + 1 + size);
            arrayList2.add(new C1359b());
            arrayList2.addAll(this.f21559c);
            arrayList2.addAll(listB);
            return new y(aVar, this.f21558b, Collections.unmodifiableList(arrayList2), size, Collections.unmodifiableList(arrayList), listA.size(), executor2, this.f21562f);
        }

        public b e(InterfaceC0939e.a aVar) {
            Objects.requireNonNull(aVar, "factory == null");
            this.f21557a = aVar;
            return this;
        }
    }

    y(InterfaceC0939e.a aVar, P8.v vVar, List list, int i10, List list2, int i11, Executor executor, boolean z9) {
        this.f21546b = aVar;
        this.f21547c = vVar;
        this.f21548d = list;
        this.f21549e = i10;
        this.f21550f = list2;
        this.f21551g = i11;
        this.f21552h = executor;
        this.f21553i = z9;
    }

    private void j(Class cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                sb.append(cls2.getName());
                if (cls2 != cls) {
                    sb.append(" which is an interface of ");
                    sb.append(cls.getName());
                }
                throw new IllegalArgumentException(sb.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        if (this.f21553i) {
            u uVar = t.f21487b;
            for (Method method : cls.getDeclaredMethods()) {
                if (!uVar.c(method) && !Modifier.isStatic(method.getModifiers()) && !method.isSynthetic()) {
                    c(cls, method);
                }
            }
        }
    }

    public e a(Type type, Annotation[] annotationArr) {
        return d(null, type, annotationArr);
    }

    public Object b(Class cls) {
        j(cls);
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    z c(Class cls, Method method) {
        while (true) {
            Object objPutIfAbsent = this.f21545a.get(method);
            if (objPutIfAbsent instanceof z) {
                return (z) objPutIfAbsent;
            }
            if (objPutIfAbsent == null) {
                Object obj = new Object();
                synchronized (obj) {
                    try {
                        objPutIfAbsent = this.f21545a.putIfAbsent(method, obj);
                        if (objPutIfAbsent == null) {
                            try {
                                z zVarB = z.b(this, cls, method);
                                this.f21545a.put(method, zVarB);
                                return zVarB;
                            } catch (Throwable th) {
                                this.f21545a.remove(method);
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            synchronized (objPutIfAbsent) {
                try {
                    Object obj2 = this.f21545a.get(method);
                    if (obj2 != null) {
                        return (z) obj2;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public e d(e.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.f21550f.indexOf(aVar) + 1;
        int size = this.f21550f.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            e eVarA = ((e.a) this.f21550f.get(i10)).a(type, annotationArr, this);
            if (eVarA != null) {
                return eVarA;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i11 = 0; i11 < iIndexOf; i11++) {
                sb.append("\n   * ");
                sb.append(((e.a) this.f21550f.get(i11)).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.f21550f.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((e.a) this.f21550f.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public h e(h.a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int iIndexOf = this.f21548d.indexOf(aVar) + 1;
        int size = this.f21548d.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            h hVarC = ((h.a) this.f21548d.get(i10)).c(type, annotationArr, annotationArr2, this);
            if (hVarC != null) {
                return hVarC;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i11 = 0; i11 < iIndexOf; i11++) {
                sb.append("\n   * ");
                sb.append(((h.a) this.f21548d.get(i11)).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.f21548d.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((h.a) this.f21548d.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public h f(h.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.f21548d.indexOf(aVar) + 1;
        int size = this.f21548d.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            h hVarD = ((h.a) this.f21548d.get(i10)).d(type, annotationArr, this);
            if (hVarD != null) {
                return hVarD;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i11 = 0; i11 < iIndexOf; i11++) {
                sb.append("\n   * ");
                sb.append(((h.a) this.f21548d.get(i11)).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.f21548d.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((h.a) this.f21548d.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public h g(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return e(null, type, annotationArr, annotationArr2);
    }

    public h h(Type type, Annotation[] annotationArr) {
        return f(null, type, annotationArr);
    }

    public h i(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f21548d.size();
        for (int i10 = 0; i10 < size; i10++) {
            h hVarE = ((h.a) this.f21548d.get(i10)).e(type, annotationArr, this);
            if (hVarE != null) {
                return hVarE;
            }
        }
        return C1359b.d.f21370a;
    }
}
