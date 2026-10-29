package p022c1;

import android.graphics.Color;
import android.util.TimingLogger;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes.dex */
final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Comparator f14996g = new C0432a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int[] f14997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int[] f14998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final List f14999c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final c1.b.c[] f15001e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float[] f15002f = new float[3];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final TimingLogger f15000d = null;

    /* JADX INFO: renamed from: c1.a$a, reason: collision with other inner class name */
    static class C0432a implements Comparator {
        C0432a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            return bVar2.g() - bVar.g();
        }
    }

    private class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f15003a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f15004b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f15005c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f15006d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f15007e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f15008f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f15009g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f15010h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f15011i;

        b(int i10, int i11) {
            this.f15003a = i10;
            this.f15004b = i11;
            c();
        }

        final boolean a() {
            return e() > 1;
        }

        final int b() {
            int iF = f();
            a aVar = a.this;
            int[] iArr = aVar.f14997a;
            int[] iArr2 = aVar.f14998b;
            a.e(iArr, iF, this.f15003a, this.f15004b);
            Arrays.sort(iArr, this.f15003a, this.f15004b + 1);
            a.e(iArr, iF, this.f15003a, this.f15004b);
            int i10 = this.f15005c / 2;
            int i11 = this.f15003a;
            int i12 = 0;
            while (true) {
                int i13 = this.f15004b;
                if (i11 > i13) {
                    return this.f15003a;
                }
                i12 += iArr2[iArr[i11]];
                if (i12 >= i10) {
                    return Math.min(i13 - 1, i11);
                }
                i11++;
            }
        }

        final void c() {
            a aVar = a.this;
            int[] iArr = aVar.f14997a;
            int[] iArr2 = aVar.f14998b;
            int i10 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
            int i11 = Integer.MIN_VALUE;
            int i12 = Integer.MIN_VALUE;
            int i13 = Integer.MIN_VALUE;
            int i14 = 0;
            int i15 = Integer.MAX_VALUE;
            int i16 = Integer.MAX_VALUE;
            for (int i17 = this.f15003a; i17 <= this.f15004b; i17++) {
                int i18 = iArr[i17];
                i14 += iArr2[i18];
                int iK = a.k(i18);
                int iJ = a.j(i18);
                int i19 = a.i(i18);
                if (iK > i11) {
                    i11 = iK;
                }
                if (iK < i10) {
                    i10 = iK;
                }
                if (iJ > i12) {
                    i12 = iJ;
                }
                if (iJ < i15) {
                    i15 = iJ;
                }
                if (i19 > i13) {
                    i13 = i19;
                }
                if (i19 < i16) {
                    i16 = i19;
                }
            }
            this.f15006d = i10;
            this.f15007e = i11;
            this.f15008f = i15;
            this.f15009g = i12;
            this.f15010h = i16;
            this.f15011i = i13;
            this.f15005c = i14;
        }

        final c1.b.e d() {
            a aVar = a.this;
            int[] iArr = aVar.f14997a;
            int[] iArr2 = aVar.f14998b;
            int iK = 0;
            int i10 = 0;
            int iJ = 0;
            int i11 = 0;
            for (int i12 = this.f15003a; i12 <= this.f15004b; i12++) {
                int i13 = iArr[i12];
                int i14 = iArr2[i13];
                i10 += i14;
                iK += a.k(i13) * i14;
                iJ += a.j(i13) * i14;
                i11 += i14 * a.i(i13);
            }
            float f10 = i10;
            return new c1.b.e(a.b(Math.round(iK / f10), Math.round(iJ / f10), Math.round(i11 / f10)), i10);
        }

        final int e() {
            return (this.f15004b + 1) - this.f15003a;
        }

        final int f() {
            int i10 = this.f15007e - this.f15006d;
            int i11 = this.f15009g - this.f15008f;
            int i12 = this.f15011i - this.f15010h;
            if (i10 < i11 || i10 < i12) {
                return (i11 < i10 || i11 < i12) ? -1 : -2;
            }
            return -3;
        }

        final int g() {
            return ((this.f15007e - this.f15006d) + 1) * ((this.f15009g - this.f15008f) + 1) * ((this.f15011i - this.f15010h) + 1);
        }

        final b h() {
            if (!a()) {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
            int iB = b();
            b bVar = a.this.new b(iB + 1, this.f15004b);
            this.f15004b = iB;
            c();
            return bVar;
        }
    }

    a(int[] iArr, int i10, c1.b.c[] cVarArr) {
        this.f15001e = cVarArr;
        int[] iArr2 = new int[32768];
        this.f14998b = iArr2;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            int iG = g(iArr[i11]);
            iArr[i11] = iG;
            iArr2[iG] = iArr2[iG] + 1;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < 32768; i13++) {
            if (iArr2[i13] > 0 && l(i13)) {
                iArr2[i13] = 0;
            }
            if (iArr2[i13] > 0) {
                i12++;
            }
        }
        int[] iArr3 = new int[i12];
        this.f14997a = iArr3;
        int i14 = 0;
        for (int i15 = 0; i15 < 32768; i15++) {
            if (iArr2[i15] > 0) {
                iArr3[i14] = i15;
                i14++;
            }
        }
        if (i12 > i10) {
            this.f14999c = h(i10);
            return;
        }
        this.f14999c = new ArrayList();
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = iArr3[i16];
            this.f14999c.add(new c1.b.e(a(i17), iArr2[i17]));
        }
    }

    private static int a(int i10) {
        return b(k(i10), j(i10), i(i10));
    }

    static int b(int i10, int i11, int i12) {
        return Color.rgb(f(i10, 5, 8), f(i11, 5, 8), f(i12, 5, 8));
    }

    private List c(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c1.b.e eVarD = ((b) it.next()).d();
            if (!n(eVarD)) {
                arrayList.add(eVarD);
            }
        }
        return arrayList;
    }

    static void e(int[] iArr, int i10, int i11, int i12) {
        if (i10 == -2) {
            while (i11 <= i12) {
                int i13 = iArr[i11];
                iArr[i11] = i(i13) | (j(i13) << 10) | (k(i13) << 5);
                i11++;
            }
            return;
        }
        if (i10 != -1) {
            return;
        }
        while (i11 <= i12) {
            int i14 = iArr[i11];
            iArr[i11] = k(i14) | (i(i14) << 10) | (j(i14) << 5);
            i11++;
        }
    }

    private static int f(int i10, int i11, int i12) {
        return (i12 > i11 ? i10 << (i12 - i11) : i10 >> (i11 - i12)) & ((1 << i12) - 1);
    }

    private static int g(int i10) {
        return f(Color.blue(i10), 8, 5) | (f(Color.red(i10), 8, 5) << 10) | (f(Color.green(i10), 8, 5) << 5);
    }

    private List h(int i10) {
        PriorityQueue priorityQueue = new PriorityQueue(i10, f14996g);
        priorityQueue.offer(new b(0, this.f14997a.length - 1));
        o(priorityQueue, i10);
        return c(priorityQueue);
    }

    static int i(int i10) {
        return i10 & 31;
    }

    static int j(int i10) {
        return (i10 >> 5) & 31;
    }

    static int k(int i10) {
        return (i10 >> 10) & 31;
    }

    private boolean l(int i10) {
        int iA = a(i10);
        p191t0.a.m(iA, this.f15002f);
        return m(iA, this.f15002f);
    }

    private boolean m(int i10, float[] fArr) {
        c1.b.c[] cVarArr = this.f15001e;
        if (cVarArr != null && cVarArr.length > 0) {
            int length = cVarArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                if (!this.f15001e[i11].a(i10, fArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean n(c1.b.e eVar) {
        return m(eVar.e(), eVar.c());
    }

    private void o(PriorityQueue priorityQueue, int i10) {
        b bVar;
        while (priorityQueue.size() < i10 && (bVar = (b) priorityQueue.poll()) != null && bVar.a()) {
            priorityQueue.offer(bVar.h());
            priorityQueue.offer(bVar);
        }
    }

    List d() {
        return this.f14999c;
    }
}
