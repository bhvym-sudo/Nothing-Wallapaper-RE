package p175r4;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: r4.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1849m extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final Object f26808z = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private transient Object f26809q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    transient int[] f26810r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    transient Object[] f26811s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    transient Object[] f26812t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private transient int f26813u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private transient int f26814v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private transient Set f26815w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private transient Set f26816x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private transient Collection f26817y;

    C1849m(int i10) {
        o(12);
    }

    static /* synthetic */ Object i(C1849m c1849m) {
        Object obj = c1849m.f26809q;
        obj.getClass();
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int r() {
        return (1 << (this.f26813u & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int s(Object obj) {
        if (q()) {
            return -1;
        }
        int iA = AbstractC1869o.a(obj);
        int iR = r();
        Object obj2 = this.f26809q;
        obj2.getClass();
        int iC = AbstractC1859n.c(obj2, iA & iR);
        if (iC != 0) {
            int i10 = ~iR;
            int i11 = iA & i10;
            do {
                int i12 = iC - 1;
                int[] iArr = this.f26810r;
                iArr.getClass();
                int i13 = iArr[i12];
                if ((i13 & i10) == i11) {
                    Object[] objArr = this.f26811s;
                    objArr.getClass();
                    if (AbstractC1765e1.a(obj, objArr[i12])) {
                        return i12;
                    }
                }
                iC = i13 & iR;
            } while (iC != 0);
        }
        return -1;
    }

    private final int t(int i10, int i11, int i12, int i13) {
        int i14 = i11 - 1;
        Object objD = AbstractC1859n.d(i11);
        if (i13 != 0) {
            AbstractC1859n.e(objD, i12 & i14, i13 + 1);
        }
        Object obj = this.f26809q;
        obj.getClass();
        int[] iArr = this.f26810r;
        iArr.getClass();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iC = AbstractC1859n.c(obj, i15);
            while (iC != 0) {
                int i16 = iC - 1;
                int i17 = iArr[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int iC2 = AbstractC1859n.c(objD, i19);
                AbstractC1859n.e(objD, i19, iC);
                iArr[i16] = ((~i14) & i18) | (iC2 & i14);
                iC = i17 & i10;
            }
        }
        this.f26809q = objD;
        v(i14);
        return i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object u(Object obj) {
        if (q()) {
            return f26808z;
        }
        int iR = r();
        Object obj2 = this.f26809q;
        obj2.getClass();
        int[] iArr = this.f26810r;
        iArr.getClass();
        Object[] objArr = this.f26811s;
        objArr.getClass();
        int iB = AbstractC1859n.b(obj, null, iR, obj2, iArr, objArr, null);
        if (iB == -1) {
            return f26808z;
        }
        Object[] objArr2 = this.f26812t;
        objArr2.getClass();
        Object obj3 = objArr2[iB];
        p(iB, iR);
        this.f26814v--;
        n();
        return obj3;
    }

    private final void v(int i10) {
        this.f26813u = ((32 - Integer.numberOfLeadingZeros(i10)) & 31) | (this.f26813u & (-32));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (q()) {
            return;
        }
        n();
        Map mapL = l();
        if (mapL != null) {
            this.f26813u = Y.a(size(), 3, 1073741823);
            mapL.clear();
            this.f26809q = null;
            this.f26814v = 0;
            return;
        }
        Object[] objArr = this.f26811s;
        objArr.getClass();
        Arrays.fill(objArr, 0, this.f26814v, (Object) null);
        Object[] objArr2 = this.f26812t;
        objArr2.getClass();
        Arrays.fill(objArr2, 0, this.f26814v, (Object) null);
        Object obj = this.f26809q;
        obj.getClass();
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        int[] iArr = this.f26810r;
        iArr.getClass();
        Arrays.fill(iArr, 0, this.f26814v, 0);
        this.f26814v = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapL = l();
        if (mapL != null) {
            return mapL.containsKey(obj);
        }
        return s(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapL = l();
        if (mapL != null) {
            return mapL.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f26814v; i10++) {
            Object[] objArr = this.f26812t;
            objArr.getClass();
            if (AbstractC1765e1.a(obj, objArr[i10])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f26816x;
        if (set != null) {
            return set;
        }
        C1785g c1785g = new C1785g(this);
        this.f26816x = c1785g;
        return c1785g;
    }

    final int f() {
        return isEmpty() ? -1 : 0;
    }

    final int g(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f26814v) {
            return i11;
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapL = l();
        if (mapL != null) {
            return mapL.get(obj);
        }
        int iS = s(obj);
        if (iS == -1) {
            return null;
        }
        Object[] objArr = this.f26812t;
        objArr.getClass();
        return objArr[iS];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.f26815w;
        if (set != null) {
            return set;
        }
        C1818j c1818j = new C1818j(this);
        this.f26815w = c1818j;
        return c1818j;
    }

    final Map l() {
        Object obj = this.f26809q;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    final void n() {
        this.f26813u += 32;
    }

    final void o(int i10) {
        this.f26813u = Y.a(12, 1, 1073741823);
    }

    final void p(int i10, int i11) {
        Object obj = this.f26809q;
        obj.getClass();
        int[] iArr = this.f26810r;
        iArr.getClass();
        Object[] objArr = this.f26811s;
        objArr.getClass();
        Object[] objArr2 = this.f26812t;
        objArr2.getClass();
        int size = size();
        int i12 = size - 1;
        if (i10 >= i12) {
            objArr[i10] = null;
            objArr2[i10] = null;
            iArr[i10] = 0;
            return;
        }
        int i13 = i10 + 1;
        Object obj2 = objArr[i12];
        objArr[i10] = obj2;
        objArr2[i10] = objArr2[i12];
        objArr[i12] = null;
        objArr2[i12] = null;
        iArr[i10] = iArr[i12];
        iArr[i12] = 0;
        int iA = AbstractC1869o.a(obj2) & i11;
        int iC = AbstractC1859n.c(obj, iA);
        if (iC == size) {
            AbstractC1859n.e(obj, iA, i13);
            return;
        }
        while (true) {
            int i14 = iC - 1;
            int i15 = iArr[i14];
            int i16 = i15 & i11;
            if (i16 == size) {
                iArr[i14] = ((~i11) & i15) | (i13 & i11);
                return;
            }
            iC = i16;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i10;
        if (q()) {
            AbstractC1811i3.d(q(), "Arrays already allocated");
            int i11 = this.f26813u;
            int iMax = Math.max(i11 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = BasicMeasure.EXACTLY;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.f26809q = AbstractC1859n.d(iMax2);
            v(iMax2 - 1);
            this.f26810r = new int[i11];
            this.f26811s = new Object[i11];
            this.f26812t = new Object[i11];
        }
        Map mapL = l();
        if (mapL != null) {
            return mapL.put(obj, obj2);
        }
        int[] iArr = this.f26810r;
        iArr.getClass();
        Object[] objArr = this.f26811s;
        objArr.getClass();
        Object[] objArr2 = this.f26812t;
        objArr2.getClass();
        int i12 = this.f26814v;
        int i13 = i12 + 1;
        int iA = AbstractC1869o.a(obj);
        int iR = r();
        int i14 = iA & iR;
        Object obj3 = this.f26809q;
        obj3.getClass();
        int iC = AbstractC1859n.c(obj3, i14);
        if (iC == 0) {
            if (i13 > iR) {
                iR = t(iR, AbstractC1859n.a(iR), iA, i12);
            } else {
                Object obj4 = this.f26809q;
                obj4.getClass();
                AbstractC1859n.e(obj4, i14, i13);
            }
            i10 = 1;
        } else {
            int i15 = ~iR;
            int i16 = iA & i15;
            int i17 = 0;
            while (true) {
                int i18 = iC - 1;
                int i19 = iArr[i18];
                i10 = 1;
                int i20 = i19 & i15;
                if (i20 == i16 && AbstractC1765e1.a(obj, objArr[i18])) {
                    Object obj5 = objArr2[i18];
                    objArr2[i18] = obj2;
                    return obj5;
                }
                int i21 = i19 & iR;
                i17++;
                if (i21 == 0) {
                    if (i17 < 9) {
                        if (i13 <= iR) {
                            iArr[i18] = (i13 & iR) | i20;
                            break;
                        }
                        iR = t(iR, AbstractC1859n.a(iR), iA, i12);
                        break;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(r() + 1, 1.0f);
                    int iF = f();
                    while (iF >= 0) {
                        Object[] objArr3 = this.f26811s;
                        objArr3.getClass();
                        Object obj6 = objArr3[iF];
                        Object[] objArr4 = this.f26812t;
                        objArr4.getClass();
                        linkedHashMap.put(obj6, objArr4[iF]);
                        iF = g(iF);
                    }
                    this.f26809q = linkedHashMap;
                    this.f26810r = null;
                    this.f26811s = null;
                    this.f26812t = null;
                    n();
                    return linkedHashMap.put(obj, obj2);
                }
                iC = i21;
            }
        }
        int[] iArr2 = this.f26810r;
        iArr2.getClass();
        int length = iArr2.length;
        if (i13 > length) {
            int i22 = i10;
            int iMin = Math.min(1073741823, (Math.max(i22, length >>> 1) + length) | i22);
            if (iMin != length) {
                int[] iArr3 = this.f26810r;
                iArr3.getClass();
                this.f26810r = Arrays.copyOf(iArr3, iMin);
                Object[] objArr5 = this.f26811s;
                objArr5.getClass();
                this.f26811s = Arrays.copyOf(objArr5, iMin);
                Object[] objArr6 = this.f26812t;
                objArr6.getClass();
                this.f26812t = Arrays.copyOf(objArr6, iMin);
            }
        }
        int i23 = (~iR) & iA;
        int[] iArr4 = this.f26810r;
        iArr4.getClass();
        iArr4[i12] = i23;
        Object[] objArr7 = this.f26811s;
        objArr7.getClass();
        objArr7[i12] = obj;
        Object[] objArr8 = this.f26812t;
        objArr8.getClass();
        objArr8[i12] = obj2;
        this.f26814v = i13;
        n();
        return null;
    }

    final boolean q() {
        return this.f26809q == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapL = l();
        if (mapL != null) {
            return mapL.remove(obj);
        }
        Object objU = u(obj);
        if (objU == f26808z) {
            return null;
        }
        return objU;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapL = l();
        return mapL != null ? mapL.size() : this.f26814v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f26817y;
        if (collection != null) {
            return collection;
        }
        C1839l c1839l = new C1839l(this);
        this.f26817y = c1839l;
        return c1839l;
    }
}
