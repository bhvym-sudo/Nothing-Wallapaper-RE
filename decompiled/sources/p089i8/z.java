package p089i8;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.n;
import p219v8.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract class z extends y {
    public static boolean A(Collection collection, Object[] elements) {
        n.h(collection, "<this>");
        n.h(elements, "elements");
        return collection.addAll(AbstractC1442p.c(elements));
    }

    public static final Collection B(Iterable iterable) {
        n.h(iterable, "<this>");
        return iterable instanceof Collection ? (Collection) iterable : D.r0(iterable);
    }

    private static final boolean C(Iterable iterable, l lVar, boolean z9) {
        Iterator it = iterable.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (((Boolean) lVar.f(it.next())).booleanValue() == z9) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static boolean D(Iterable iterable, l predicate) {
        n.h(iterable, "<this>");
        n.h(predicate, "predicate");
        return C(iterable, predicate, true);
    }

    public static Object E(List list) {
        n.h(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    public static Object F(List list) {
        n.h(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(AbstractC1446u.m(list));
    }

    public static Object G(List list) {
        n.h(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(AbstractC1446u.m(list));
    }

    public static boolean H(Iterable iterable, l predicate) {
        n.h(iterable, "<this>");
        n.h(predicate, "predicate");
        return C(iterable, predicate, false);
    }

    public static boolean z(Collection collection, Iterable elements) {
        n.h(collection, "<this>");
        n.h(elements, "elements");
        if (elements instanceof Collection) {
            return collection.addAll((Collection) elements);
        }
        Iterator it = elements.iterator();
        boolean z9 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z9 = true;
            }
        }
        return z9;
    }
}
