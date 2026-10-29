package androidx.datastore.preferences.protobuf;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1091a implements P {
    protected int memoizedHashCode = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0384a implements P.a {
        protected static void i(Iterable iterable, List list) {
            AbstractC1114y.a(iterable);
            if (!(iterable instanceof C)) {
                if (iterable instanceof Z) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    j(iterable, list);
                    return;
                }
            }
            List listI = ((C) iterable).i();
            C c10 = (C) list;
            int size = list.size();
            for (Object obj : listI) {
                if (obj == null) {
                    String str = "Element at index " + (c10.size() - size) + " is null.";
                    for (int size2 = c10.size() - 1; size2 >= size; size2--) {
                        c10.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof AbstractC1097g) {
                    c10.h((AbstractC1097g) obj);
                } else if (obj instanceof byte[]) {
                    c10.h(AbstractC1097g.g((byte[]) obj));
                } else {
                    c10.add((String) obj);
                }
            }
        }

        private static void j(Iterable iterable, List list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (Object obj : iterable) {
                if (obj == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(obj);
            }
        }

        protected static l0 k(P p9) {
            return new l0(p9);
        }
    }

    protected static void a(Iterable iterable, List list) {
        AbstractC0384a.i(iterable, list);
    }

    abstract int b(f0 f0Var);

    l0 f() {
        return new l0(this);
    }

    public void g(OutputStream outputStream) {
        AbstractC1100j abstractC1100jY = AbstractC1100j.Y(outputStream, AbstractC1100j.C(d()));
        e(abstractC1100jY);
        abstractC1100jY.V();
    }
}
