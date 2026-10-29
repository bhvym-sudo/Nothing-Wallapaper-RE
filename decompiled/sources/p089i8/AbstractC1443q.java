package p089i8;

import B8.g;
import E8.i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.AbstractC1452c;
import kotlin.jvm.internal.n;
import p219v8.l;
import p259z8.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: i8.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1443q extends AbstractC1442p {

    /* JADX INFO: renamed from: i8.q$a */
    public static final class a implements Iterable, p229w8.a {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Object[] f22276q;

        public a(Object[] objArr) {
            this.f22276q = objArr;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return AbstractC1452c.a(this.f22276q);
        }
    }

    public static Iterable A(Object[] objArr) {
        n.h(objArr, "<this>");
        return objArr.length == 0 ? AbstractC1446u.l() : new a(objArr);
    }

    public static boolean B(int[] iArr, int i10) {
        n.h(iArr, "<this>");
        return J(iArr, i10) >= 0;
    }

    public static boolean C(Object[] objArr, Object obj) {
        n.h(objArr, "<this>");
        return K(objArr, obj) >= 0;
    }

    public static List D(Object[] objArr) {
        n.h(objArr, "<this>");
        return (List) E(objArr, new ArrayList());
    }

    public static final Collection E(Object[] objArr, Collection destination) {
        n.h(objArr, "<this>");
        n.h(destination, "destination");
        for (Object obj : objArr) {
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static g F(Object[] objArr) {
        n.h(objArr, "<this>");
        return new g(0, H(objArr));
    }

    public static int G(long[] jArr) {
        n.h(jArr, "<this>");
        return jArr.length - 1;
    }

    public static int H(Object[] objArr) {
        n.h(objArr, "<this>");
        return objArr.length - 1;
    }

    public static Object I(Object[] objArr, int i10) {
        n.h(objArr, "<this>");
        if (i10 < 0 || i10 >= objArr.length) {
            return null;
        }
        return objArr[i10];
    }

    public static final int J(int[] iArr, int i10) {
        n.h(iArr, "<this>");
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i10 == iArr[i11]) {
                return i11;
            }
        }
        return -1;
    }

    public static final int K(Object[] objArr, Object obj) {
        n.h(objArr, "<this>");
        int i10 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i10 < length) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i10 < length2) {
            if (n.d(obj, objArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final Appendable L(byte[] bArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, l lVar) throws IOException {
        n.h(bArr, "<this>");
        n.h(buffer, "buffer");
        n.h(separator, "separator");
        n.h(prefix, "prefix");
        n.h(postfix, "postfix");
        n.h(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (byte b10 : bArr) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (lVar != null) {
                buffer.append((CharSequence) lVar.f(Byte.valueOf(b10)));
            } else {
                buffer.append(String.valueOf((int) b10));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final Appendable M(Object[] objArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, l lVar) throws IOException {
        n.h(objArr, "<this>");
        n.h(buffer, "buffer");
        n.h(separator, "separator");
        n.h(prefix, "prefix");
        n.h(postfix, "postfix");
        n.h(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (Object obj : objArr) {
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

    public static final String N(byte[] bArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, l lVar) {
        n.h(bArr, "<this>");
        n.h(separator, "separator");
        n.h(prefix, "prefix");
        n.h(postfix, "postfix");
        n.h(truncated, "truncated");
        return ((StringBuilder) L(bArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, lVar)).toString();
    }

    public static final String O(Object[] objArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, l lVar) {
        n.h(objArr, "<this>");
        n.h(separator, "separator");
        n.h(prefix, "prefix");
        n.h(postfix, "postfix");
        n.h(truncated, "truncated");
        return ((StringBuilder) M(objArr, new StringBuilder(), separator, prefix, postfix, i10, truncated, lVar)).toString();
    }

    public static /* synthetic */ String P(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, l lVar, int i11, Object obj) {
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
        return N(bArr, charSequence, charSequence2, charSequence3, i10, charSequence5, lVar2);
    }

    public static /* synthetic */ String Q(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, l lVar, int i11, Object obj) {
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
        return O(objArr, charSequence, charSequence2, charSequence3, i10, charSequence5, lVar2);
    }

    public static void R(Object[] objArr) {
        n.h(objArr, "<this>");
        int length = (objArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        int iH = H(objArr);
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            Object obj = objArr[i10];
            objArr[i10] = objArr[iH];
            objArr[iH] = obj;
            iH--;
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public static void S(Object[] objArr) {
        n.h(objArr, "<this>");
        T(objArr, c.f30803q);
    }

    public static final void T(Object[] objArr, c random) {
        n.h(objArr, "<this>");
        n.h(random, "random");
        for (int iH = H(objArr); iH > 0; iH--) {
            int iC = random.c(iH + 1);
            Object obj = objArr[iH];
            objArr[iH] = objArr[iC];
            objArr[iC] = obj;
        }
    }

    public static char U(char[] cArr) {
        n.h(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static Object V(Object[] objArr) {
        n.h(objArr, "<this>");
        if (objArr.length == 1) {
            return objArr[0];
        }
        return null;
    }

    public static List W(Object[] objArr, int i10) {
        n.h(objArr, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return AbstractC1446u.l();
        }
        if (i10 >= objArr.length) {
            return Y(objArr);
        }
        if (i10 == 1) {
            return AbstractC1445t.e(objArr[0]);
        }
        ArrayList arrayList = new ArrayList(i10);
        int i11 = 0;
        for (Object obj : objArr) {
            arrayList.add(obj);
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return arrayList;
    }

    public static final Collection X(Object[] objArr, Collection destination) {
        n.h(objArr, "<this>");
        n.h(destination, "destination");
        for (Object obj : objArr) {
            destination.add(obj);
        }
        return destination;
    }

    public static List Y(Object[] objArr) {
        n.h(objArr, "<this>");
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? Z(objArr) : AbstractC1445t.e(objArr[0]);
        }
        return AbstractC1446u.l();
    }

    public static List Z(Object[] objArr) {
        n.h(objArr, "<this>");
        return new ArrayList(AbstractC1446u.i(objArr));
    }

    public static final Set a0(Object[] objArr) {
        n.h(objArr, "<this>");
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? (Set) X(objArr, new LinkedHashSet(P.d(objArr.length))) : V.c(objArr[0]);
        }
        return W.d();
    }
}
