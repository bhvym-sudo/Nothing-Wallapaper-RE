package g9;

import P8.D;
import P8.InterfaceC0939e;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes2.dex */
abstract class n extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f21398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0939e.a f21399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f21400c;

    static final class a extends n {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final e f21401d;

        a(w wVar, InterfaceC0939e.a aVar, h hVar, e eVar) {
            super(wVar, aVar, hVar);
            this.f21401d = eVar;
        }

        @Override // g9.n
        protected Object c(d dVar, Object[] objArr) {
            return this.f21401d.b(dVar);
        }
    }

    static final class b extends n {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final e f21402d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f21403e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f21404f;

        b(w wVar, InterfaceC0939e.a aVar, h hVar, e eVar, boolean z9, boolean z10) {
            super(wVar, aVar, hVar);
            this.f21402d = eVar;
            this.f21403e = z9;
            this.f21404f = z10;
        }

        @Override // g9.n
        protected Object c(d dVar, Object[] objArr) {
            d dVar2 = (d) this.f21402d.b(dVar);
            p129m8.e eVar = (p129m8.e) objArr[objArr.length - 1];
            try {
                if (this.f21404f) {
                    return p.d(dVar2, eVar);
                }
                return this.f21403e ? p.b(dVar2, eVar) : p.a(dVar2, eVar);
            } catch (LinkageError | ThreadDeath | VirtualMachineError e10) {
                throw e10;
            } catch (Throwable th) {
                return p.e(th, eVar);
            }
        }
    }

    static final class c extends n {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final e f21405d;

        c(w wVar, InterfaceC0939e.a aVar, h hVar, e eVar) {
            super(wVar, aVar, hVar);
            this.f21405d = eVar;
        }

        @Override // g9.n
        protected Object c(d dVar, Object[] objArr) {
            d dVar2 = (d) this.f21405d.b(dVar);
            p129m8.e eVar = (p129m8.e) objArr[objArr.length - 1];
            try {
                return p.c(dVar2, eVar);
            } catch (Exception e10) {
                return p.e(e10, eVar);
            }
        }
    }

    n(w wVar, InterfaceC0939e.a aVar, h hVar) {
        this.f21398a = wVar;
        this.f21399b = aVar;
        this.f21400c = hVar;
    }

    private static e d(y yVar, Method method, Type type, Annotation[] annotationArr) {
        try {
            return yVar.a(type, annotationArr);
        } catch (RuntimeException e10) {
            throw C.o(method, e10, "Unable to create call adapter for %s", type);
        }
    }

    private static h e(y yVar, Method method, Type type) {
        try {
            return yVar.h(type, method.getAnnotations());
        } catch (RuntimeException e10) {
            throw C.o(method, e10, "Unable to create converter for %s", type);
        }
    }

    static n f(y yVar, Method method, w wVar) {
        Type genericReturnType;
        boolean z9;
        boolean z10;
        boolean zM;
        boolean z11 = wVar.f21515l;
        Annotation[] annotations = method.getAnnotations();
        if (z11) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            z9 = true;
            Type typeF = C.f(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (C.h(typeF) == x.class && (typeF instanceof ParameterizedType)) {
                typeF = C.g(0, (ParameterizedType) typeF);
                zM = false;
            } else {
                if (C.h(typeF) == d.class) {
                    throw C.n(method, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", C.g(0, (ParameterizedType) typeF));
                }
                zM = C.m(typeF);
                z9 = false;
            }
            genericReturnType = new C.b(null, d.class, typeF);
            annotations = B.a(annotations);
            z10 = zM;
        } else {
            genericReturnType = method.getGenericReturnType();
            z9 = false;
            z10 = false;
        }
        e eVarD = d(yVar, method, genericReturnType, annotations);
        Type typeA = eVarD.a();
        if (typeA == D.class) {
            throw C.n(method, "'" + C.h(typeA).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        }
        if (typeA == x.class) {
            throw C.n(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        }
        if (wVar.f21507d.equals("HEAD") && !Void.class.equals(typeA) && !C.m(typeA)) {
            throw C.n(method, "HEAD method must use Void or Unit as response type.", new Object[0]);
        }
        h hVarE = e(yVar, method, typeA);
        InterfaceC0939e.a aVar = yVar.f21546b;
        if (z11) {
            return z9 ? new c(wVar, aVar, hVarE, eVarD) : new b(wVar, aVar, hVarE, eVarD, false, z10);
        }
        return new a(wVar, aVar, hVarE, eVarD);
    }

    @Override // g9.z
    final Object a(Object obj, Object[] objArr) {
        return c(new q(this.f21398a, obj, objArr, this.f21399b, this.f21400c), objArr);
    }

    protected abstract Object c(d dVar, Object[] objArr);
}
