package g9;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes2.dex */
abstract class z {
    z() {
    }

    static z b(y yVar, Class cls, Method method) {
        w wVarB = w.b(yVar, cls, method);
        Type genericReturnType = method.getGenericReturnType();
        if (C.j(genericReturnType)) {
            throw C.n(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        }
        if (genericReturnType != Void.TYPE) {
            return n.f(yVar, method, wVarB);
        }
        throw C.n(method, "Service methods cannot return void.", new Object[0]);
    }

    abstract Object a(Object obj, Object[] objArr);
}
