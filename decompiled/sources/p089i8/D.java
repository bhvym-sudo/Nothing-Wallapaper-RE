package p089i8;

import D8.h;
import E8.i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.jvm.internal.n;
import p079h8.v;
import p219v8.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract class D extends B {

    public static final class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterable f22248a;

        public a(Iterable iterable) {
            this.f22248a = iterable;
        }

        @Override // D8.h
        public Iterator iterator() {
            return this.f22248a.iterator();
        }
    }

    public static h K(Iterable iterable) {
        n.h(iterable, "<this>");
        return new a(iterable);
    }

    public static boolean L(Iterable iterable, Object obj) {
        n.h(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        return W(iterable, obj) >= 0;
    }

    public static List M(Iterable iterable) {
        n.h(iterable, "<this>");
        return r0(v0(iterable));
    }

    public static List N(Iterable iterable, int i10) {
        ArrayList arrayList;
        n.h(iterable, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return r0(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i10;
            if (size <= 0) {
                return AbstractC1446u.l();
            }
            if (size == 1) {
                return AbstractC1445t.e(b0(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i10 < size2) {
                        arrayList.add(list.get(i10));
                        i10++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i10);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i11 = 0;
        for (Object obj : iterable) {
            if (i11 >= i10) {
                arrayList.add(obj);
            } else {
                i11++;
            }
        }
        return AbstractC1446u.q(arrayList);
    }

    public static List O(List list, int i10) {
        n.h(list, "<this>");
        if (i10 >= 0) {
            return o0(list, B8.h.f(list.size() - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static List P(Iterable iterable) {
        n.h(iterable, "<this>");
        return (List) Q(iterable, new ArrayList());
    }

    public static final Collection Q(Iterable iterable, Collection destination) {
        n.h(iterable, "<this>");
        n.h(destination, "destination");
        for (Object obj : iterable) {
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static Object R(Iterable iterable) {
        n.h(iterable, "<this>");
        if (iterable instanceof List) {
            return S((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object S(List list) {
        n.h(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object T(Iterable iterable) {
        n.h(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object U(List list) {
        n.h(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object V(List list, int i10) {
        n.h(list, "<this>");
        if (i10 < 0 || i10 >= list.size()) {
            return null;
        }
        return list.get(i10);
    }

    public static int W(Iterable iterable, Object obj) {
        n.h(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i10 = 0;
        for (Object obj2 : iterable) {
            if (i10 < 0) {
                AbstractC1446u.t();
            }
            if (n.d(obj, obj2)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final Appendable X(Iterable iterable, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, l lVar) throws IOException {
        n.h(iterable, "<this>");
        n.h(buffer, "buffer");
        n.h(separator, "separator");
        n.h(prefix, "prefix");
        n.h(postfix, "postfix");
        n.h(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (Object obj : iterable) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            i.a(buffer, obj, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final String Z(Iterable iterable, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, l lVar) {
        n.h(iterable, "<this>");
        n.h(separator, "separator");
        n.h(prefix, "prefix");
        n.h(postfix, "postfix");
        n.h(truncated, "truncated");
        return ((StringBuilder) X(iterable, new StringBuilder(), separator, prefix, postfix, i10, truncated, lVar)).toString();
    }

    public static /* synthetic */ String a0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        l lVar2 = lVar;
        return Z(iterable, charSequence, charSequence2, charSequence3, i10, charSequence5, lVar2);
    }

    public static final Object b0(Iterable iterable) {
        n.h(iterable, "<this>");
        if (iterable instanceof List) {
            return c0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object c0(List list) {
        n.h(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(AbstractC1446u.m(list));
    }

    public static Object d0(Iterable iterable, Comparator comparator) {
        n.h(iterable, "<this>");
        n.h(comparator, "comparator");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (comparator.compare(next, next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    public static Comparable e0(Iterable iterable) {
        n.h(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static List f0(Iterable iterable, Object obj) {
        n.h(iterable, "<this>");
        ArrayList arrayList = new ArrayList(AbstractC1447v.u(iterable, 10));
        boolean z9 = false;
        for (Object obj2 : iterable) {
            boolean z10 = true;
            if (!z9 && n.d(obj2, obj)) {
                z9 = true;
                z10 = false;
            }
            if (z10) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static List g0(Collection collection, Iterable elements) {
        n.h(collection, "<this>");
        n.h(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            z.z(arrayList, elements);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static List h0(Collection collection, Object obj) {
        n.h(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static Object i0(Iterable iterable) {
        n.h(iterable, "<this>");
        if (iterable instanceof List) {
            return j0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static final Object j0(List list) {
        n.h(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static Object k0(List list) {
        n.h(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List l0(Iterable iterable) {
        n.h(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List listT0 = t0(iterable);
            y.x(listT0);
            return listT0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return r0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        AbstractC1442p.x((Comparable[]) array);
        return AbstractC1442p.c(array);
    }

    public static List m0(Iterable iterable, Comparator comparator) {
        n.h(iterable, "<this>");
        n.h(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List listT0 = t0(iterable);
            y.y(listT0, comparator);
            return listT0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return r0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        AbstractC1442p.y(array, comparator);
        return AbstractC1442p.c(array);
    }

    public static float n0(Iterable iterable) {
        n.h(iterable, "<this>");
        Iterator it = iterable.iterator();
        float fFloatValue = 0.0f;
        while (it.hasNext()) {
            fFloatValue += ((Number) it.next()).floatValue();
        }
        return fFloatValue;
    }

    public static List o0(Iterable iterable, int i10) {
        n.h(iterable, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return AbstractC1446u.l();
        }
        if (iterable instanceof Collection) {
            if (i10 >= ((Collection) iterable).size()) {
                return r0(iterable);
            }
            if (i10 == 1) {
                return AbstractC1445t.e(R(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i10);
        Iterator it = iterable.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return AbstractC1446u.q(arrayList);
    }

    public static final Collection p0(Iterable iterable, Collection destination) {
        n.h(iterable, "<this>");
        n.h(destination, "destination");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    public static int[] q0(Collection collection) {
        n.h(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = ((Number) it.next()).intValue();
            i10++;
        }
        return iArr;
    }

    public static List r0(Iterable iterable) {
        n.h(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return AbstractC1446u.q(t0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return AbstractC1446u.l();
        }
        if (size != 1) {
            return u0(collection);
        }
        return AbstractC1445t.e(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static long[] s0(Collection collection) {
        n.h(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            jArr[i10] = ((Number) it.next()).longValue();
            i10++;
        }
        return jArr;
    }

    public static final List t0(Iterable iterable) {
        n.h(iterable, "<this>");
        return iterable instanceof Collection ? u0((Collection) iterable) : (List) p0(iterable, new ArrayList());
    }

    public static List u0(Collection collection) {
        n.h(collection, "<this>");
        return new ArrayList(collection);
    }

    public static Set v0(Iterable iterable) {
        n.h(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) p0(iterable, new LinkedHashSet());
    }

    public static Set w0(Iterable iterable) {
        n.h(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return W.e((Set) p0(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return W.d();
        }
        if (size != 1) {
            return (Set) p0(iterable, new LinkedHashSet(P.d(collection.size())));
        }
        return V.c(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static Iterable x0(final Iterable iterable) {
        n.h(iterable, "<this>");
        return new J(new p219v8.a() { // from class: i8.C
            @Override // p219v8.a
            public final Object invoke() {
                return D.y0(iterable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterator y0(Iterable iterable) {
        return iterable.iterator();
    }

    public static List z0(Iterable iterable, Iterable other) {
        n.h(iterable, "<this>");
        n.h(other, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(AbstractC1447v.u(iterable, 10), AbstractC1447v.u(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(v.a(it.next(), it2.next()));
        }
        return arrayList;
    }
}
