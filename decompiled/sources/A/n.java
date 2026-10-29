package A;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC1457h;
import p079h8.A;
import p089i8.AbstractC1439m;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes.dex */
public final class n implements Iterable, p229w8.a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final a f38u = new a(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final n f39v = new n(0, 0, 0, null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final long f40q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final long f41r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f42s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int[] f43t;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final n a() {
            return n.f39v;
        }

        private a() {
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.k implements p219v8.p {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f44r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f45s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f46t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f47u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private /* synthetic */ Object f48v;

        b(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            b bVar = n.this.new b(eVar);
            bVar.f48v = obj;
            return bVar;
        }

        /* JADX WARN: Code duplicated, block: B:36:0x00c7  */
        /* JADX WARN: Code duplicated, block: B:38:0x00d4  */
        /* JADX WARN: Code duplicated, block: B:41:0x00f0  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0079 -> B:19:0x007d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x009b -> B:30:0x00b7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00b4 -> B:30:0x00b7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00d2 -> B:43:0x00f2). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00f0 -> B:42:0x00f1). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instruction units count: 247
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: A.n.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p219v8.p
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object invoke(D8.j jVar, p129m8.e eVar) {
            return ((b) create(jVar, eVar)).invokeSuspend(A.f21846a);
        }
    }

    private n(long j9, long j10, int i10, int[] iArr) {
        this.f40q = j9;
        this.f41r = j10;
        this.f42s = i10;
        this.f43t = iArr;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return D8.k.b(new b(null)).iterator();
    }

    public final n n(n nVar) {
        n nVar2 = f39v;
        if (nVar == nVar2) {
            return this;
        }
        if (this == nVar2) {
            return nVar2;
        }
        int i10 = nVar.f42s;
        int i11 = this.f42s;
        if (i10 == i11) {
            int[] iArr = nVar.f43t;
            int[] iArr2 = this.f43t;
            if (iArr == iArr2) {
                return new n(this.f40q & (~nVar.f40q), this.f41r & (~nVar.f41r), i11, iArr2);
            }
        }
        int[] iArr3 = nVar.f43t;
        if (iArr3 != null) {
            for (int i12 : iArr3) {
                this = this.o(i12);
            }
        }
        if (nVar.f41r != 0) {
            for (int i13 = 0; i13 < 64; i13++) {
                if ((nVar.f41r & (1 << i13)) != 0) {
                    this = this.o(nVar.f42s + i13);
                }
            }
        }
        if (nVar.f40q != 0) {
            for (int i14 = 0; i14 < 64; i14++) {
                if ((nVar.f40q & (1 << i14)) != 0) {
                    this = this.o(i14 + 64 + nVar.f42s);
                }
            }
        }
        return this;
    }

    public final n o(int i10) {
        int[] iArr;
        int iA;
        int i11 = this.f42s;
        int i12 = i10 - i11;
        if (i12 >= 0 && i12 < 64) {
            long j9 = 1 << i12;
            long j10 = this.f41r;
            if ((j10 & j9) != 0) {
                return new n(this.f40q, (~j9) & j10, i11, this.f43t);
            }
        } else if (i12 >= 64 && i12 < 128) {
            long j11 = 1 << (i12 - 64);
            long j12 = this.f40q;
            if ((j12 & j11) != 0) {
                return new n((~j11) & j12, this.f41r, i11, this.f43t);
            }
        } else if (i12 < 0 && (iArr = this.f43t) != null && (iA = o.a(iArr, i10)) >= 0) {
            int length = iArr.length;
            int i13 = length - 1;
            if (i13 == 0) {
                return new n(this.f40q, this.f41r, this.f42s, null);
            }
            int[] iArr2 = new int[i13];
            if (iA > 0) {
                AbstractC1439m.f(iArr, iArr2, 0, 0, iA);
            }
            if (iA < i13) {
                AbstractC1439m.f(iArr, iArr2, iA, iA + 1, length);
            }
            return new n(this.f40q, this.f41r, this.f42s, iArr2);
        }
        return this;
    }

    public final boolean p(int i10) {
        int[] iArr;
        int i11 = i10 - this.f42s;
        if (i11 >= 0 && i11 < 64) {
            return (this.f41r & (1 << i11)) != 0;
        }
        if (i11 < 64 || i11 >= 128) {
            return i11 <= 0 && (iArr = this.f43t) != null && o.a(iArr, i10) >= 0;
        }
        return (this.f40q & (1 << (i11 - 64))) != 0;
    }

    public final int q(int i10) {
        int[] iArr = this.f43t;
        if (iArr != null) {
            return iArr[0];
        }
        long j9 = this.f41r;
        if (j9 != 0) {
            return this.f42s + Long.numberOfTrailingZeros(j9);
        }
        long j10 = this.f40q;
        return j10 != 0 ? this.f42s + 64 + Long.numberOfTrailingZeros(j10) : i10;
    }

    public final n r(n nVar) {
        n nVar2 = f39v;
        if (nVar == nVar2) {
            return this;
        }
        if (this == nVar2) {
            return nVar;
        }
        int i10 = nVar.f42s;
        int i11 = this.f42s;
        if (i10 == i11) {
            int[] iArr = nVar.f43t;
            int[] iArr2 = this.f43t;
            if (iArr == iArr2) {
                return new n(this.f40q | nVar.f40q, this.f41r | nVar.f41r, i11, iArr2);
            }
        }
        int i12 = 0;
        if (this.f43t == null) {
            int[] iArr3 = this.f43t;
            if (iArr3 != null) {
                for (int i13 : iArr3) {
                    nVar = nVar.s(i13);
                }
            }
            if (this.f41r != 0) {
                for (int i14 = 0; i14 < 64; i14++) {
                    if ((this.f41r & (1 << i14)) != 0) {
                        nVar = nVar.s(this.f42s + i14);
                    }
                }
            }
            if (this.f40q != 0) {
                while (i12 < 64) {
                    if ((this.f40q & (1 << i12)) != 0) {
                        nVar = nVar.s(i12 + 64 + this.f42s);
                    }
                    i12++;
                }
            }
            return nVar;
        }
        int[] iArr4 = nVar.f43t;
        if (iArr4 != null) {
            for (int i15 : iArr4) {
                this = this.s(i15);
            }
        }
        if (nVar.f41r != 0) {
            for (int i16 = 0; i16 < 64; i16++) {
                if ((nVar.f41r & (1 << i16)) != 0) {
                    this = this.s(nVar.f42s + i16);
                }
            }
        }
        if (nVar.f40q != 0) {
            while (i12 < 64) {
                if ((nVar.f40q & (1 << i12)) != 0) {
                    this = this.s(i12 + 64 + nVar.f42s);
                }
                i12++;
            }
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0085 A[PHI: r9
      0x0085: PHI (r9v5 java.util.ArrayList) = (r9v2 java.util.ArrayList), (r9v7 java.util.ArrayList) binds: [B:24:0x0064, B:26:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    public final n s(int i10) {
        int i11;
        int[] iArrQ0;
        long j9;
        int i12 = this.f42s;
        int i13 = i10 - i12;
        long j10 = 1;
        long j11 = 0;
        if (i13 >= 0 && i13 < 64) {
            long j12 = 1 << i13;
            long j13 = this.f41r;
            if ((j13 & j12) == 0) {
                return new n(this.f40q, j13 | j12, i12, this.f43t);
            }
        } else if (i13 >= 64 && i13 < 128) {
            long j14 = 1 << (i13 - 64);
            long j15 = this.f40q;
            if ((j15 & j14) == 0) {
                return new n(j14 | j15, this.f41r, i12, this.f43t);
            }
        } else if (i13 < 128) {
            int[] iArr = this.f43t;
            if (iArr == null) {
                return new n(this.f40q, this.f41r, i12, new int[]{i10});
            }
            int iA = o.a(iArr, i10);
            if (iA < 0) {
                int i14 = -(iA + 1);
                int length = iArr.length;
                int[] iArr2 = new int[length + 1];
                AbstractC1439m.f(iArr, iArr2, 0, 0, i14);
                AbstractC1439m.f(iArr, iArr2, i14 + 1, i14, length);
                iArr2[i14] = i10;
                return new n(this.f40q, this.f41r, this.f42s, iArr2);
            }
        } else if (!p(i10)) {
            long j16 = this.f40q;
            long j17 = this.f41r;
            int i15 = this.f42s;
            int i16 = ((i10 + 1) / 64) * 64;
            ArrayList arrayList = null;
            long j18 = j17;
            long j19 = j16;
            while (true) {
                if (i15 >= i16) {
                    i11 = i15;
                    break;
                }
                if (j18 != j11) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        int[] iArr3 = this.f43t;
                        if (iArr3 != null) {
                            int length2 = iArr3.length;
                            int i17 = 0;
                            while (i17 < length2) {
                                arrayList.add(Integer.valueOf(iArr3[i17]));
                                i17++;
                                j11 = j11;
                            }
                        }
                    }
                    j9 = j11;
                    for (int i18 = 0; i18 < 64; i18++) {
                        if (((j10 << i18) & j18) != j9) {
                            arrayList.add(Integer.valueOf(i18 + i15));
                        }
                    }
                } else {
                    j10 = j10;
                    j9 = j11;
                }
                if (j19 == j9) {
                    i11 = i16;
                    j18 = j9;
                    break;
                }
                i15 += 64;
                j18 = j19;
                j10 = j10;
                j11 = j9;
                j19 = j11;
            }
            if (arrayList == null || (iArrQ0 = AbstractC1444s.q0(arrayList)) == null) {
                iArrQ0 = this.f43t;
            }
            return new n(j19, j18, i11, iArrQ0).s(i10);
        }
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(AbstractC1444s.u(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        sb.append(A.b.d(arrayList, null, null, null, 0, null, null, 63, null));
        sb.append(']');
        return sb.toString();
    }
}
