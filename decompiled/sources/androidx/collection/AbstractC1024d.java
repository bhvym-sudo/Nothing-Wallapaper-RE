package androidx.collection;

import java.util.ConcurrentModificationException;

/* JADX INFO: renamed from: androidx.collection.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1024d {
    public static final void a(C1022b c1022b, int i10) {
        kotlin.jvm.internal.n.h(c1022b, "<this>");
        c1022b.p(new int[i10]);
        c1022b.o(new Object[i10]);
    }

    public static final int b(C1022b c1022b, int i10) {
        kotlin.jvm.internal.n.h(c1022b, "<this>");
        try {
            return p150p.a.a(c1022b.f(), c1022b.m(), i10);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final int c(C1022b c1022b, Object obj, int i10) {
        kotlin.jvm.internal.n.h(c1022b, "<this>");
        int iM = c1022b.m();
        if (iM == 0) {
            return -1;
        }
        int iB = b(c1022b, i10);
        if (iB < 0 || kotlin.jvm.internal.n.d(obj, c1022b.b()[iB])) {
            return iB;
        }
        int i11 = iB + 1;
        while (i11 < iM && c1022b.f()[i11] == i10) {
            if (kotlin.jvm.internal.n.d(obj, c1022b.b()[i11])) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iB - 1; i12 >= 0 && c1022b.f()[i12] == i10; i12--) {
            if (kotlin.jvm.internal.n.d(obj, c1022b.b()[i12])) {
                return i12;
            }
        }
        return ~i11;
    }

    public static final int d(C1022b c1022b) {
        kotlin.jvm.internal.n.h(c1022b, "<this>");
        return c(c1022b, null, 0);
    }
}
