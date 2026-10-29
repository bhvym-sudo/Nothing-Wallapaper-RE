package p159p8;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.n;
import p089i8.AbstractC1439m;
import p259z8.b;
import p259z8.c;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: p8.a$a, reason: collision with other inner class name */
    private static final class C0633a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0633a f23788a = new C0633a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Method f23789b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Method f23790c;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            n.e(methods);
            int length = methods.length;
            int i10 = 0;
            while (true) {
                method = null;
                if (i10 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i10];
                if (n.d(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    n.g(parameterTypes, "getParameterTypes(...)");
                    if (n.d(AbstractC1439m.V(parameterTypes), Throwable.class)) {
                        break;
                    }
                }
                i10++;
            }
            f23789b = method2;
            for (Method method3 : methods) {
                if (n.d(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
            }
            f23790c = method;
        }

        private C0633a() {
        }
    }

    public void a(Throwable cause, Throwable exception) throws IllegalAccessException, InvocationTargetException {
        n.h(cause, "cause");
        n.h(exception, "exception");
        Method method = C0633a.f23789b;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    public c b() {
        return new b();
    }
}
