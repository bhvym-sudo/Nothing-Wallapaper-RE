package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f22768a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f22769b = new a(null, null, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static a f22770c;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f22771a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f22772b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Method f22773c;

        public a(Method method, Method method2, Method method3) {
            this.f22771a = method;
            this.f22772b = method2;
            this.f22773c = method3;
        }
    }

    private i() {
    }

    private final a a(kotlin.coroutines.jvm.internal.a aVar) {
        try {
            a aVar2 = new a(Class.class.getDeclaredMethod("getModule", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f22770c = aVar2;
            return aVar2;
        } catch (Exception unused) {
            a aVar3 = f22769b;
            f22770c = aVar3;
            return aVar3;
        }
    }

    public final String b(kotlin.coroutines.jvm.internal.a continuation) {
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        n.h(continuation, "continuation");
        a aVarA = f22770c;
        if (aVarA == null) {
            aVarA = a(continuation);
        }
        if (aVarA != f22769b && (method = aVarA.f22771a) != null && (objInvoke = method.invoke(continuation.getClass(), new Object[0])) != null && (method2 = aVarA.f22772b) != null && (objInvoke2 = method2.invoke(objInvoke, new Object[0])) != null) {
            Method method3 = aVarA.f22773c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, new Object[0]) : null;
            if (objInvoke3 instanceof String) {
                return (String) objInvoke3;
            }
        }
        return null;
    }
}
