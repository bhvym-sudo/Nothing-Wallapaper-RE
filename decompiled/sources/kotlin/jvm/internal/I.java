package kotlin.jvm.internal;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class I {
    public static Collection a(Object obj) {
        if ((obj instanceof p229w8.a) && !(obj instanceof p229w8.b)) {
            n(obj, "kotlin.collections.MutableCollection");
        }
        return e(obj);
    }

    public static List b(Object obj) {
        if ((obj instanceof p229w8.a) && !(obj instanceof p229w8.c)) {
            n(obj, "kotlin.collections.MutableList");
        }
        return f(obj);
    }

    public static Map c(Object obj) {
        if ((obj instanceof p229w8.a) && !(obj instanceof p229w8.d)) {
            n(obj, "kotlin.collections.MutableMap");
        }
        return g(obj);
    }

    public static Object d(Object obj, int i10) {
        if (obj != null && !i(obj, i10)) {
            n(obj, "kotlin.jvm.functions.Function" + i10);
        }
        return obj;
    }

    public static Collection e(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e10) {
            throw m(e10);
        }
    }

    public static List f(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e10) {
            throw m(e10);
        }
    }

    public static Map g(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e10) {
            throw m(e10);
        }
    }

    public static int h(Object obj) {
        if (obj instanceof j) {
            return ((j) obj).getArity();
        }
        if (obj instanceof p219v8.a) {
            return 0;
        }
        if (obj instanceof p219v8.l) {
            return 1;
        }
        if (obj instanceof p219v8.p) {
            return 2;
        }
        if (obj instanceof p219v8.q) {
            return 3;
        }
        if (obj instanceof p219v8.r) {
            return 4;
        }
        if (obj instanceof p219v8.s) {
            return 5;
        }
        if (obj instanceof p219v8.t) {
            return 6;
        }
        if (obj instanceof p219v8.u) {
            return 7;
        }
        if (obj instanceof p219v8.v) {
            return 8;
        }
        if (obj instanceof p219v8.w) {
            return 9;
        }
        if (obj instanceof p219v8.b) {
            return 10;
        }
        if (obj instanceof p219v8.c) {
            return 11;
        }
        if (obj instanceof p219v8.e) {
            return 13;
        }
        if (obj instanceof p219v8.f) {
            return 14;
        }
        if (obj instanceof p219v8.g) {
            return 15;
        }
        if (obj instanceof p219v8.h) {
            return 16;
        }
        if (obj instanceof p219v8.i) {
            return 17;
        }
        if (obj instanceof p219v8.j) {
            return 18;
        }
        if (obj instanceof p219v8.k) {
            return 19;
        }
        if (obj instanceof p219v8.m) {
            return 20;
        }
        return obj instanceof p219v8.n ? 21 : -1;
    }

    public static boolean i(Object obj, int i10) {
        return (obj instanceof p079h8.e) && h(obj) == i10;
    }

    public static boolean j(Object obj) {
        if (obj instanceof List) {
            return !(obj instanceof p229w8.a) || (obj instanceof p229w8.c);
        }
        return false;
    }

    public static boolean k(Object obj) {
        if (obj instanceof Set) {
            return !(obj instanceof p229w8.a) || (obj instanceof p229w8.e);
        }
        return false;
    }

    private static Throwable l(Throwable th) {
        return n.m(th, I.class.getName());
    }

    public static ClassCastException m(ClassCastException classCastException) {
        throw ((ClassCastException) l(classCastException));
    }

    public static void n(Object obj, String str) {
        o((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    public static void o(String str) {
        throw m(new ClassCastException(str));
    }
}
