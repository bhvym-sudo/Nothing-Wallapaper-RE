package p089i8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.n;
import p109k8.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: i8.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1446u extends AbstractC1445t {
    public static ArrayList h(Object... elements) {
        n.h(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new C1437k(elements, true));
    }

    public static final Collection i(Object[] objArr) {
        n.h(objArr, "<this>");
        return new C1437k(objArr, false);
    }

    public static final int j(List list, Comparable comparable, int i10, int i11) {
        n.h(list, "<this>");
        r(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int iD = a.d((Comparable) list.get(i13), comparable);
            if (iD < 0) {
                i10 = i13 + 1;
            } else {
                if (iD <= 0) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static /* synthetic */ int k(List list, Comparable comparable, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = list.size();
        }
        return j(list, comparable, i10, i11);
    }

    public static List l() {
        return F.f22250q;
    }

    public static int m(List list) {
        n.h(list, "<this>");
        return list.size() - 1;
    }

    public static List n(Object... elements) {
        n.h(elements, "elements");
        return elements.length > 0 ? AbstractC1442p.c(elements) : l();
    }

    public static List o(Object... elements) {
        n.h(elements, "elements");
        return AbstractC1443q.D(elements);
    }

    public static List p(Object... elements) {
        n.h(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new C1437k(elements, true));
    }

    public static final List q(List list) {
        n.h(list, "<this>");
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : AbstractC1445t.e(list.get(0));
        }
        return l();
    }

    private static final void r(int i10, int i11, int i12) {
        if (i11 > i12) {
            throw new IllegalArgumentException("fromIndex (" + i11 + ") is greater than toIndex (" + i12 + ").");
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i11 + ") is less than zero.");
        }
        if (i12 <= i10) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i12 + ") is greater than size (" + i10 + ").");
    }

    public static void s() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void t() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
