package p155p4;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.util.Arrays;

/* JADX INFO: renamed from: p4.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1481x extends AbstractC1474p {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final AbstractC1474p f23759w = new C1481x(null, new Object[0], 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final transient Object f23760t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final transient Object[] f23761u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final transient int f23762v;

    private C1481x(Object obj, Object[] objArr, int i10) {
        this.f23760t = obj;
        this.f23761u = objArr;
        this.f23762v = i10;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ee  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    static C1481x h(int i10, Object[] objArr, C1473o c1473o) {
        int iHighestOneBit;
        boolean z9;
        int i11;
        char c10;
        ?? r9;
        char c11;
        short[] sArr;
        boolean z10;
        int i12;
        ?? r16;
        boolean z11;
        ?? r10;
        Object[] objArr2;
        C1472n c1472n;
        boolean z12;
        int i13 = i10;
        Object[] objArrCopyOf = objArr;
        if (i13 == 0) {
            return (C1481x) f23759w;
        }
        C1472n c1472n2 = null;
        ?? r11 = 0;
        C1472n c1472n3 = null;
        C1472n c1472n4 = null;
        boolean z13 = false;
        int i14 = 1;
        if (i13 == 1) {
            Object obj = objArrCopyOf[0];
            obj.getClass();
            Object obj2 = objArrCopyOf[1];
            obj2.getClass();
            AbstractC1464f.a(obj, obj2);
            return new C1481x(null, objArrCopyOf, 1);
        }
        AbstractC1461c.b(i13, objArrCopyOf.length >> 1, "index");
        char c12 = 2;
        int iMax = Math.max(i13, 2);
        if (iMax < 751619276) {
            iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (((double) iHighestOneBit) * 0.7d < iMax);
        } else {
            iHighestOneBit = BasicMeasure.EXACTLY;
            if (iMax >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i13 != 1) {
            int i15 = iHighestOneBit - 1;
            if (iHighestOneBit <= 128) {
                byte[] bArr = new byte[iHighestOneBit];
                Arrays.fill(bArr, (byte) -1);
                int i16 = 0;
                int i17 = 0;
                while (i16 < i13) {
                    int i18 = i17 + i17;
                    int i19 = i16 + i16;
                    Object obj3 = objArrCopyOf[i19];
                    obj3.getClass();
                    Object obj4 = objArrCopyOf[i19 ^ i14];
                    obj4.getClass();
                    AbstractC1464f.a(obj3, obj4);
                    int iA = AbstractC1466h.a(obj3.hashCode());
                    while (true) {
                        int i20 = iA & i15;
                        z10 = z13;
                        i12 = i14;
                        int i21 = bArr[i20] & 255;
                        if (i21 == 255) {
                            bArr[i20] = (byte) i18;
                            if (i17 < i16) {
                                objArrCopyOf[i18] = obj3;
                                objArrCopyOf[i18 ^ 1] = obj4;
                            }
                            i17++;
                            break;
                        }
                        if (obj3.equals(objArrCopyOf[i21 == true ? 1 : 0])) {
                            int i22 = ~i21;
                            Object obj5 = objArrCopyOf[i22 == true ? 1 : 0];
                            obj5.getClass();
                            C1472n c1472n5 = new C1472n(obj3, obj4, obj5);
                            objArrCopyOf[i22 == true ? 1 : 0] = obj4;
                            c1472n3 = c1472n5;
                            break;
                        }
                        iA = i20 + 1;
                        z13 = z10;
                        i14 = i12;
                    }
                    i16++;
                    z13 = z10;
                    i14 = i12;
                }
                z9 = z13;
                i11 = i14;
                if (i17 == i13) {
                    c10 = 2;
                    r9 = bArr;
                    r16 = z9;
                } else {
                    sArr = new Object[3];
                    sArr[z9 ? 1 : 0] = bArr;
                    sArr[i11] = Integer.valueOf(i17);
                    sArr[2] = c1472n3;
                    r11 = sArr;
                    z12 = z9;
                }
            } else {
                z9 = false;
                i11 = 1;
                if (iHighestOneBit <= 32768) {
                    sArr = new short[iHighestOneBit];
                    Arrays.fill(sArr, (short) -1);
                    int i23 = 0;
                    for (int i24 = 0; i24 < i13; i24++) {
                        int i25 = i23 + i23;
                        int i26 = i24 + i24;
                        Object obj6 = objArrCopyOf[i26];
                        obj6.getClass();
                        Object obj7 = objArrCopyOf[i26 ^ 1];
                        obj7.getClass();
                        AbstractC1464f.a(obj6, obj7);
                        int iA2 = AbstractC1466h.a(obj6.hashCode());
                        while (true) {
                            int i27 = iA2 & i15;
                            char c13 = (char) sArr[i27];
                            if (c13 == 65535) {
                                sArr[i27] = (short) i25;
                                if (i23 < i24) {
                                    objArrCopyOf[i25] = obj6;
                                    objArrCopyOf[i25 ^ 1] = obj7;
                                }
                                i23++;
                                break;
                            }
                            if (obj6.equals(objArrCopyOf[c13])) {
                                int i28 = c13 ^ 1;
                                Object obj8 = objArrCopyOf[i28 == true ? 1 : 0];
                                obj8.getClass();
                                C1472n c1472n6 = new C1472n(obj6, obj7, obj8);
                                objArrCopyOf[i28 == true ? 1 : 0] = obj7;
                                c1472n4 = c1472n6;
                                break;
                            }
                            iA2 = i27 + 1;
                        }
                    }
                    if (i23 == i13) {
                        r11 = sArr;
                        z12 = z9;
                    } else {
                        r11 = new Object[]{sArr, Integer.valueOf(i23), c1472n4};
                        z12 = z9;
                    }
                } else {
                    int[] iArr = new int[iHighestOneBit];
                    Arrays.fill(iArr, -1);
                    int i29 = 0;
                    int i30 = 0;
                    while (i29 < i13) {
                        int i31 = i30 + i30;
                        int i32 = i29 + i29;
                        Object obj9 = objArrCopyOf[i32];
                        obj9.getClass();
                        Object obj10 = objArrCopyOf[i32 ^ 1];
                        obj10.getClass();
                        AbstractC1464f.a(obj9, obj10);
                        int iA3 = AbstractC1466h.a(obj9.hashCode());
                        while (true) {
                            int i33 = iA3 & i15;
                            int i34 = iArr[i33];
                            if (i34 == -1) {
                                iArr[i33] = i31;
                                if (i30 < i29) {
                                    objArrCopyOf[i31] = obj9;
                                    objArrCopyOf[i31 ^ 1] = obj10;
                                }
                                i30++;
                                c11 = c12;
                                break;
                            }
                            c11 = c12;
                            if (obj9.equals(objArrCopyOf[i34])) {
                                int i35 = i34 ^ 1;
                                Object obj11 = objArrCopyOf[i35];
                                obj11.getClass();
                                C1472n c1472n7 = new C1472n(obj9, obj10, obj11);
                                objArrCopyOf[i35] = obj10;
                                c1472n2 = c1472n7;
                                break;
                            }
                            iA3 = i33 + 1;
                            c12 = c11;
                        }
                        i29++;
                        c12 = c11;
                    }
                    c10 = c12;
                    if (i30 == i13) {
                        r9 = iArr;
                        r16 = z9;
                    } else {
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = iArr;
                        objArr3[1] = Integer.valueOf(i30);
                        objArr3[c10] = c1472n2;
                        r9 = objArr3;
                        r16 = z9;
                    }
                }
            }
            z11 = r9 instanceof Object[];
            r10 = r9;
            if (z11) {
                objArr2 = (Object[]) r9;
                c1472n = (C1472n) objArr2[c10];
                if (c1473o != null) {
                    throw c1472n.a();
                }
                c1473o.f23742c = c1472n;
                Object obj12 = objArr2[r16];
                int iIntValue = ((Integer) objArr2[i11]).intValue();
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
                r10 = obj12;
                i13 = iIntValue;
            }
            return new C1481x(r10, objArrCopyOf, i13);
        }
        Object obj13 = objArrCopyOf[0];
        obj13.getClass();
        Object obj14 = objArrCopyOf[1];
        obj14.getClass();
        AbstractC1464f.a(obj13, obj14);
        z12 = false;
        i13 = 1;
        i11 = 1;
        c10 = 2;
        r9 = r11;
        r16 = z12;
        z11 = r9 instanceof Object[];
        r10 = r9;
        if (z11) {
            objArr2 = (Object[]) r9;
            c1472n = (C1472n) objArr2[c10];
            if (c1473o != null) {
                throw c1472n.a();
            }
            c1473o.f23742c = c1472n;
            Object obj15 = objArr2[r16];
            int iIntValue2 = ((Integer) objArr2[i11]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 + iIntValue2);
            r10 = obj15;
            i13 = iIntValue2;
        }
        return new C1481x(r10, objArrCopyOf, i13);
    }

    @Override // p155p4.AbstractC1474p
    final AbstractC1468j a() {
        return new C1480w(this.f23761u, 1, this.f23762v);
    }

    @Override // p155p4.AbstractC1474p
    final AbstractC1475q d() {
        return new C1478u(this, this.f23761u, 0, this.f23762v);
    }

    @Override // p155p4.AbstractC1474p
    final AbstractC1475q f() {
        return new C1479v(this, new C1480w(this.f23761u, 0, this.f23762v));
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // p155p4.AbstractC1474p, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            int i10 = this.f23762v;
            Object[] objArr = this.f23761u;
            if (i10 == 1) {
                Object obj3 = objArr[0];
                obj3.getClass();
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    obj2.getClass();
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.f23760t;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iA = AbstractC1466h.a(obj.hashCode());
                    while (true) {
                        int i11 = iA & length;
                        int i12 = bArr[i11] & 255;
                        if (i12 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i12])) {
                            obj2 = objArr[i12 ^ 1];
                        } else {
                            iA = i11 + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iA2 = AbstractC1466h.a(obj.hashCode());
                    while (true) {
                        int i13 = iA2 & length2;
                        char c10 = (char) sArr[i13];
                        if (c10 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[c10])) {
                            obj2 = objArr[c10 ^ 1];
                        } else {
                            iA2 = i13 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iA3 = AbstractC1466h.a(obj.hashCode());
                    while (true) {
                        int i14 = iA3 & length3;
                        int i15 = iArr[i14];
                        if (i15 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i15])) {
                            obj2 = objArr[i15 ^ 1];
                        } else {
                            iA3 = i14 + 1;
                        }
                    }
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f23762v;
    }
}
