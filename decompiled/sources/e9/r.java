package e9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC1457h;
import p089i8.AbstractC1429c;
import p089i8.AbstractC1439m;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends AbstractC1429c implements RandomAccess {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f20287t = new a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final h[] f20288r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int[] f20289s;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private final void a(long j9, C1350e c1350e, int i10, List list, int i11, int i12, List list2) {
            int i13;
            int i14;
            int i15;
            long j10;
            int i16 = i10;
            if (i11 >= i12) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for (int i17 = i11; i17 < i12; i17++) {
                if (((h) list.get(i17)).v() < i16) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            h hVar = (h) list.get(i11);
            h hVar2 = (h) list.get(i12 - 1);
            if (i16 == hVar.v()) {
                int iIntValue = ((Number) list2.get(i11)).intValue();
                int i18 = i11 + 1;
                h hVar3 = (h) list.get(i18);
                i13 = i18;
                i14 = iIntValue;
                hVar = hVar3;
            } else {
                i13 = i11;
                i14 = -1;
            }
            if (hVar.h(i16) == hVar2.h(i16)) {
                int iMin = Math.min(hVar.v(), hVar2.v());
                int i19 = 0;
                for (int i20 = i16; i20 < iMin && hVar.h(i20) == hVar2.h(i20); i20++) {
                    i19++;
                }
                long jC = j9 + c(c1350e) + ((long) 2) + ((long) i19) + 1;
                c1350e.x(-i19);
                c1350e.x(i14);
                int i21 = i16 + i19;
                while (i16 < i21) {
                    c1350e.x(hVar.h(i16) & 255);
                    i16++;
                }
                if (i13 + 1 == i12) {
                    if (i21 != ((h) list.get(i13)).v()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    c1350e.x(((Number) list2.get(i13)).intValue());
                    return;
                } else {
                    C1350e c1350e2 = new C1350e();
                    c1350e.x(((int) (c(c1350e2) + jC)) * (-1));
                    a(jC, c1350e2, i21, list, i13, i12, list2);
                    c1350e.l1(c1350e2);
                    return;
                }
            }
            int i22 = 1;
            for (int i23 = i13 + 1; i23 < i12; i23++) {
                if (((h) list.get(i23 - 1)).h(i16) != ((h) list.get(i23)).h(i16)) {
                    i22++;
                }
            }
            long jC2 = j9 + c(c1350e) + ((long) 2) + ((long) (i22 * 2));
            c1350e.x(i22);
            c1350e.x(i14);
            for (int i24 = i13; i24 < i12; i24++) {
                byte bH = ((h) list.get(i24)).h(i16);
                if (i24 == i13 || bH != ((h) list.get(i24 - 1)).h(i16)) {
                    c1350e.x(bH & 255);
                }
            }
            C1350e c1350e3 = new C1350e();
            while (i13 < i12) {
                byte bH2 = ((h) list.get(i13)).h(i16);
                int i25 = i13 + 1;
                int i26 = i25;
                while (true) {
                    if (i26 >= i12) {
                        i15 = i12;
                        break;
                    } else {
                        if (bH2 != ((h) list.get(i26)).h(i16)) {
                            i15 = i26;
                            break;
                        }
                        i26++;
                    }
                }
                if (i25 == i15 && i16 + 1 == ((h) list.get(i13)).v()) {
                    c1350e.x(((Number) list2.get(i13)).intValue());
                    j10 = jC2;
                } else {
                    c1350e.x(((int) (c(c1350e3) + jC2)) * (-1));
                    j10 = jC2;
                    a(j10, c1350e3, i16 + 1, list, i13, i15, list2);
                }
                jC2 = j10;
                i13 = i15;
            }
            c1350e.l1(c1350e3);
        }

        static /* synthetic */ void b(a aVar, long j9, C1350e c1350e, int i10, List list, int i11, int i12, List list2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                j9 = 0;
            }
            aVar.a(j9, c1350e, (i13 & 4) != 0 ? 0 : i10, list, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? list.size() : i12, list2);
        }

        private final long c(C1350e c1350e) {
            return c1350e.X0() / ((long) 4);
        }

        public final r d(h... byteStrings) {
            kotlin.jvm.internal.n.h(byteStrings, "byteStrings");
            AbstractC1457h abstractC1457h = null;
            if (byteStrings.length == 0) {
                return new r(new h[0], new int[]{0, -1}, abstractC1457h);
            }
            List listZ = AbstractC1439m.Z(byteStrings);
            AbstractC1444s.x(listZ);
            int size = listZ.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(-1);
            }
            int length = byteStrings.length;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                arrayList.set(AbstractC1444s.k(listZ, byteStrings[i11], 0, 0, 6, null), Integer.valueOf(i12));
                i11++;
                i12++;
            }
            if (((h) listZ.get(0)).v() <= 0) {
                throw new IllegalArgumentException("the empty byte string is not a supported option");
            }
            int i13 = 0;
            while (i13 < listZ.size()) {
                h hVar = (h) listZ.get(i13);
                int i14 = i13 + 1;
                int i15 = i14;
                while (i15 < listZ.size()) {
                    h hVar2 = (h) listZ.get(i15);
                    if (!hVar2.w(hVar)) {
                        break;
                    }
                    if (hVar2.v() == hVar.v()) {
                        throw new IllegalArgumentException(("duplicate option: " + hVar2).toString());
                    }
                    if (((Number) arrayList.get(i15)).intValue() > ((Number) arrayList.get(i13)).intValue()) {
                        listZ.remove(i15);
                        ((Number) arrayList.remove(i15)).intValue();
                    } else {
                        i15++;
                    }
                }
                i13 = i14;
            }
            C1350e c1350e = new C1350e();
            b(this, 0L, c1350e, 0, listZ, 0, 0, arrayList, 53, null);
            int iC = (int) c(c1350e);
            int[] iArr = new int[iC];
            for (int i16 = 0; i16 < iC; i16++) {
                iArr[i16] = c1350e.readInt();
            }
            Object[] objArrCopyOf = Arrays.copyOf(byteStrings, byteStrings.length);
            kotlin.jvm.internal.n.g(objArrCopyOf, "copyOf(...)");
            return new r((h[]) objArrCopyOf, iArr, abstractC1457h);
        }

        private a() {
        }
    }

    public /* synthetic */ r(h[] hVarArr, int[] iArr, AbstractC1457h abstractC1457h) {
        this(hVarArr, iArr);
    }

    public static final r r(h... hVarArr) {
        return f20287t.d(hVarArr);
    }

    @Override // p089i8.AbstractC1428b
    public int b() {
        return this.f20288r.length;
    }

    @Override // p089i8.AbstractC1428b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof h) {
            return g((h) obj);
        }
        return false;
    }

    public /* bridge */ boolean g(h hVar) {
        return super.contains(hVar);
    }

    @Override // p089i8.AbstractC1429c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof h) {
            return p((h) obj);
        }
        return -1;
    }

    @Override // p089i8.AbstractC1429c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof h) {
            return q((h) obj);
        }
        return -1;
    }

    @Override // p089i8.AbstractC1429c, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public h get(int i10) {
        return this.f20288r[i10];
    }

    public final h[] n() {
        return this.f20288r;
    }

    public final int[] o() {
        return this.f20289s;
    }

    public /* bridge */ int p(h hVar) {
        return super.indexOf(hVar);
    }

    public /* bridge */ int q(h hVar) {
        return super.lastIndexOf(hVar);
    }

    private r(h[] hVarArr, int[] iArr) {
        this.f20288r = hVarArr;
        this.f20289s = iArr;
    }
}
