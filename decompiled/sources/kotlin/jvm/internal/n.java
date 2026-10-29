package kotlin.jvm.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n {
    public static boolean a(float f10, Float f11) {
        return f11 != null && f10 == f11.floatValue();
    }

    public static boolean b(Float f10, float f11) {
        return f10 != null && f10.floatValue() == f11;
    }

    public static boolean c(Float f10, Float f11) {
        if (f10 == null) {
            return f11 == null;
        }
        return f11 != null && f10.floatValue() == f11.floatValue();
    }

    public static boolean d(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static void e(Object obj) {
        if (obj == null) {
            n();
        }
    }

    public static void f(Object obj, String str) {
        if (obj == null) {
            o(str);
        }
    }

    public static void g(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) l(new NullPointerException(str + " must not be null")));
    }

    public static void h(Object obj, String str) {
        if (obj == null) {
            p(str);
        }
    }

    public static int i(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 == i11 ? 0 : 1;
    }

    public static int j(long j9, long j10) {
        if (j9 < j10) {
            return -1;
        }
        return j9 == j10 ? 0 : 1;
    }

    private static String k(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = n.class.getName();
        int i10 = 0;
        while (!stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        while (stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        StackTraceElement stackTraceElement = stackTrace[i10];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    private static Throwable l(Throwable th) {
        return m(th, n.class.getName());
    }

    static Throwable m(Throwable th, String str) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(stackTrace[i11].getClassName())) {
                i10 = i11;
            }
        }
        th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i10 + 1, length));
        return th;
    }

    public static void n() {
        throw ((NullPointerException) l(new NullPointerException()));
    }

    public static void o(String str) {
        throw ((NullPointerException) l(new NullPointerException(str)));
    }

    private static void p(String str) {
        throw ((NullPointerException) l(new NullPointerException(k(str))));
    }

    public static void q(String str) {
        throw ((p079h8.z) l(new p079h8.z(str)));
    }

    public static void r(String str) {
        q("lateinit property " + str + " has not been initialized");
    }
}
