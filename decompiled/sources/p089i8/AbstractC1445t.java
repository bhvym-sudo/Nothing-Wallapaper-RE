package p089i8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.n;
import p099j8.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: i8.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1445t {
    public static List a(List builder) {
        n.h(builder, "builder");
        return ((b) builder).v();
    }

    public static final Object[] b(Object[] objArr, boolean z9) {
        n.h(objArr, "<this>");
        if (z9 && n.d(objArr.getClass(), Object[].class)) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        n.g(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    public static List c() {
        return new b(0, 1, null);
    }

    public static List d(int i10) {
        return new b(i10);
    }

    public static List e(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        n.g(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static List f(Iterable iterable) {
        n.h(iterable, "<this>");
        List listT0 = D.t0(iterable);
        Collections.shuffle(listT0);
        return listT0;
    }

    public static Object[] g(int i10, Object[] array) {
        n.h(array, "array");
        if (i10 < array.length) {
            array[i10] = null;
        }
        return array;
    }
}
