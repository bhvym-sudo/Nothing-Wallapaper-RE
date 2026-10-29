package a9;

import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f9980d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Method f9981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Method f9982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Method f9983c;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final h a() {
            Method method;
            Method method2;
            Method method3;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                method = cls.getMethod("get", new Class[0]);
                method3 = cls.getMethod("open", String.class);
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
            } catch (Exception unused) {
                method = null;
                method2 = null;
                method3 = null;
            }
            return new h(method, method3, method2);
        }

        private a() {
        }
    }

    public h(Method method, Method method2, Method method3) {
        this.f9981a = method;
        this.f9982b = method2;
        this.f9983c = method3;
    }

    public final Object a(String closer) {
        n.h(closer, "closer");
        Method method = this.f9981a;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, new Object[0]);
                Method method2 = this.f9982b;
                n.e(method2);
                method2.invoke(objInvoke, closer);
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean b(Object obj) {
        if (obj != null) {
            try {
                Method method = this.f9983c;
                n.e(method);
                method.invoke(obj, new Object[0]);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
