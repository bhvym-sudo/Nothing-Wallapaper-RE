package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC1457h;
import p089i8.AbstractC1439m;

/* JADX INFO: loaded from: classes.dex */
public final class F extends N {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f11248e;

    private final class a extends N.a implements Set, p229w8.e {

        /* JADX INFO: renamed from: androidx.collection.F$a$a, reason: collision with other inner class name */
        public static final class C0365a implements Iterator, p229w8.a {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            private int f11250q = -1;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private final Iterator f11251r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ F f11252s;

            /* JADX INFO: renamed from: androidx.collection.F$a$a$a, reason: collision with other inner class name */
            static final class C0366a extends kotlin.coroutines.jvm.internal.k implements p219v8.p {

                /* JADX INFO: renamed from: A, reason: collision with root package name */
                private /* synthetic */ Object f11253A;

                /* JADX INFO: renamed from: B, reason: collision with root package name */
                final /* synthetic */ F f11254B;

                /* JADX INFO: renamed from: C, reason: collision with root package name */
                final /* synthetic */ C0365a f11255C;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                Object f11256r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                Object f11257s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                Object f11258t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                int f11259u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                int f11260v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                int f11261w;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                int f11262x;

                /* JADX INFO: renamed from: y, reason: collision with root package name */
                long f11263y;

                /* JADX INFO: renamed from: z, reason: collision with root package name */
                int f11264z;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0366a(F f10, C0365a c0365a, p129m8.e eVar) {
                    super(2, eVar);
                    this.f11254B = f10;
                    this.f11255C = c0365a;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    C0366a c0366a = new C0366a(this.f11254B, this.f11255C, eVar);
                    c0366a.f11253A = obj;
                    return c0366a;
                }

                /* JADX WARN: Code duplicated, block: B:13:0x0059  */
                /* JADX WARN: Code duplicated, block: B:21:0x00a0 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:22:0x00a2  */
                /* JADX WARN: Code duplicated, block: B:24:0x00ab  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0057 -> B:23:0x00a9). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0059 -> B:14:0x006d). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0076 -> B:20:0x009d). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x009a -> B:20:0x009d). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                @Override // kotlin.coroutines.jvm.internal.a
                public final java.lang.Object invokeSuspend(java.lang.Object r22) {
                    /*
                        r21 = this;
                        r0 = r21
                        java.lang.Object r1 = p139n8.b.e()
                        int r2 = r0.f11264z
                        r4 = 8
                        r5 = 1
                        if (r2 == 0) goto L36
                        if (r2 != r5) goto L2e
                        int r2 = r0.f11262x
                        int r6 = r0.f11261w
                        long r7 = r0.f11263y
                        int r9 = r0.f11260v
                        int r10 = r0.f11259u
                        java.lang.Object r11 = r0.f11258t
                        long[] r11 = (long[]) r11
                        java.lang.Object r12 = r0.f11257s
                        androidx.collection.F r12 = (androidx.collection.F) r12
                        java.lang.Object r13 = r0.f11256r
                        androidx.collection.F$a$a r13 = (androidx.collection.F.a.C0365a) r13
                        java.lang.Object r14 = r0.f11253A
                        D8.j r14 = (D8.j) r14
                        p079h8.r.b(r22)
                        goto L9d
                    L2e:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                        r0.<init>(r1)
                        throw r0
                    L36:
                        p079h8.r.b(r22)
                        java.lang.Object r2 = r0.f11253A
                        D8.j r2 = (D8.j) r2
                        androidx.collection.F r6 = r0.f11254B
                        androidx.collection.F$a$a r7 = r0.f11255C
                        long[] r8 = r6.f11288a
                        int r9 = r8.length
                        int r9 = r9 + (-2)
                        if (r9 < 0) goto Lae
                        r10 = 0
                    L49:
                        r11 = r8[r10]
                        long r13 = ~r11
                        r15 = 7
                        long r13 = r13 << r15
                        long r13 = r13 & r11
                        r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                        long r13 = r13 & r15
                        int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                        if (r13 == 0) goto La9
                        int r13 = r10 - r9
                        int r13 = ~r13
                        int r13 = r13 >>> 31
                        int r13 = 8 - r13
                        r14 = r10
                        r10 = r9
                        r9 = r14
                        r14 = r2
                        r2 = 0
                        r19 = r11
                        r12 = r6
                        r11 = r8
                        r6 = r13
                        r13 = r7
                        r7 = r19
                    L6d:
                        if (r2 >= r6) goto La0
                        r15 = 255(0xff, double:1.26E-321)
                        long r15 = r15 & r7
                        r17 = 128(0x80, double:6.3E-322)
                        int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
                        if (r15 >= 0) goto L9d
                        int r15 = r9 << 3
                        int r15 = r15 + r2
                        r13.a(r15)
                        java.lang.Object[] r3 = r12.f11289b
                        r3 = r3[r15]
                        r0.f11253A = r14
                        r0.f11256r = r13
                        r0.f11257s = r12
                        r0.f11258t = r11
                        r0.f11259u = r10
                        r0.f11260v = r9
                        r0.f11263y = r7
                        r0.f11261w = r6
                        r0.f11262x = r2
                        r0.f11264z = r5
                        java.lang.Object r3 = r14.c(r3, r0)
                        if (r3 != r1) goto L9d
                        return r1
                    L9d:
                        long r7 = r7 >> r4
                        int r2 = r2 + r5
                        goto L6d
                    La0:
                        if (r6 != r4) goto Lae
                        r2 = r10
                        r10 = r9
                        r9 = r2
                        r8 = r11
                        r6 = r12
                        r7 = r13
                        r2 = r14
                    La9:
                        if (r10 == r9) goto Lae
                        int r10 = r10 + 1
                        goto L49
                    Lae:
                        h8.A r0 = p079h8.A.f21846a
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.collection.F.a.C0365a.C0366a.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // p219v8.p
                /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                public final Object invoke(D8.j jVar, p129m8.e eVar) {
                    return ((C0366a) create(jVar, eVar)).invokeSuspend(p079h8.A.f21846a);
                }
            }

            C0365a(F f10) {
                this.f11252s = f10;
                this.f11251r = D8.k.a(new C0366a(f10, this, null));
            }

            public final void a(int i10) {
                this.f11250q = i10;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f11251r.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                return this.f11251r.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                int i10 = this.f11250q;
                if (i10 != -1) {
                    this.f11252s.y(i10);
                    this.f11250q = -1;
                }
            }
        }

        public a() {
            super();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            return F.this.h(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection elements) {
            kotlin.jvm.internal.n.h(elements, "elements");
            return F.this.j(elements);
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            F.this.m();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new C0365a(F.this);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            return F.this.x(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection elements) {
            kotlin.jvm.internal.n.h(elements, "elements");
            int iC = F.this.c();
            Iterator it = elements.iterator();
            while (it.hasNext()) {
                F.this.t(it.next());
            }
            return iC != F.this.c();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection elements) {
            kotlin.jvm.internal.n.h(elements, "elements");
            F f10 = F.this;
            long[] jArr = f10.f11288a;
            int length = jArr.length - 2;
            if (length < 0) {
                return false;
            }
            int i10 = 0;
            boolean z9 = false;
            while (true) {
                long j9 = jArr[i10];
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j9) < 128) {
                            int i13 = (i10 << 3) + i12;
                            if (!elements.contains(f10.f11289b[i13])) {
                                f10.y(i13);
                                z9 = true;
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i11 != 8) {
                        return z9;
                    }
                }
                if (i10 == length) {
                    return z9;
                }
                i10++;
            }
        }
    }

    public F(int i10) {
        super(null);
        if (!(i10 >= 0)) {
            p150p.d.a("Capacity must be a positive value.");
        }
        s(M.g(i10));
    }

    private final int o(Object obj) {
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f11290c;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f11288a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j9 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j10 = i12;
            int i18 = i12;
            long j11 = j9 ^ (j10 * 72340172838076673L);
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j12) >> 3)) & i13;
                if (kotlin.jvm.internal.n.d(this.f11289b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j9) << 6) & j9 & (-9187201950435737472L)) != 0) {
                int iP = p(i11);
                if (this.f11248e == 0 && ((this.f11288a[iP >> 3] >> ((iP & 7) << 3)) & 255) != 254) {
                    k();
                    iP = p(i11);
                }
                this.f11291d++;
                int i19 = this.f11248e;
                long[] jArr2 = this.f11288a;
                int i20 = iP >> 3;
                long j13 = jArr2[i20];
                int i21 = (iP & 7) << 3;
                this.f11248e = i19 - (((j13 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.f11290c;
                long j14 = ((~(255 << i21)) & j13) | (j10 << i21);
                jArr2[i20] = j14;
                jArr2[(((iP - 7) & i22) + (i22 & 7)) >> 3] = j14;
                return iP;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
        }
    }

    private final int p(int i10) {
        int i11 = this.f11290c;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f11288a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j9 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j10 = j9 & ((~j9) << 7) & (-9187201950435737472L);
            if (j10 != 0) {
                return (i12 + (Long.numberOfTrailingZeros(j10) >> 3)) & i11;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
    }

    private final void q() {
        this.f11248e = M.c(b()) - this.f11291d;
    }

    private final void r(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = M.f11286a;
        } else {
            long[] jArr2 = new long[((i10 + 15) & (-8)) >> 3];
            AbstractC1439m.s(jArr2, -9187201950435737472L, 0, 0, 6, null);
            jArr = jArr2;
        }
        this.f11288a = jArr;
        int i11 = i10 >> 3;
        long j9 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j9)) | j9;
        q();
    }

    private final void s(int i10) {
        int iMax = i10 > 0 ? Math.max(7, M.f(i10)) : 0;
        this.f11290c = iMax;
        r(iMax);
        this.f11289b = new Object[iMax];
    }

    public final boolean h(Object obj) {
        int iC = c();
        this.f11289b[o(obj)] = obj;
        return c() != iC;
    }

    public final boolean i(N elements) {
        kotlin.jvm.internal.n.h(elements, "elements");
        int iC = c();
        u(elements);
        return iC != c();
    }

    public final boolean j(Iterable elements) {
        kotlin.jvm.internal.n.h(elements, "elements");
        int iC = c();
        v(elements);
        return iC != c();
    }

    public final void k() {
        if (this.f11290c <= 8 || Long.compareUnsigned(p079h8.x.d(p079h8.x.d(this.f11291d) * 32), p079h8.x.d(p079h8.x.d(this.f11290c) * 25)) > 0) {
            z(M.e(this.f11290c));
        } else {
            n();
        }
    }

    public final Set l() {
        return new a();
    }

    public final void m() {
        this.f11291d = 0;
        long[] jArr = this.f11288a;
        if (jArr != M.f11286a) {
            AbstractC1439m.s(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f11288a;
            int i10 = this.f11290c;
            int i11 = i10 >> 3;
            long j9 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j9)) | j9;
        }
        AbstractC1439m.q(this.f11289b, null, 0, this.f11290c);
        q();
    }

    public final void n() {
        long[] jArr = this.f11288a;
        int i10 = this.f11290c;
        Object[] objArr = this.f11289b;
        M.a(jArr, i10);
        int iB = -1;
        int i11 = 0;
        while (i11 != i10) {
            int i12 = i11 >> 3;
            int i13 = (i11 & 7) << 3;
            long j9 = (jArr[i12] >> i13) & 255;
            if (j9 == 128) {
                iB = i11;
                i11++;
            } else {
                if (j9 == 254) {
                    Object obj = objArr[i11];
                    int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                    int i14 = iHashCode ^ (iHashCode << 16);
                    int i15 = i14 >>> 7;
                    int iP = p(i15);
                    int i16 = i15 & i10;
                    if (((iP - i16) & i10) / 8 == ((i11 - i16) & i10) / 8) {
                        jArr[i12] = (((long) (i14 & 127)) << i13) | ((~(255 << i13)) & jArr[i12]);
                        jArr[AbstractC1439m.G(jArr)] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i17 = iP >> 3;
                        long j10 = jArr[i17];
                        int i18 = (iP & 7) << 3;
                        if (((j10 >> i18) & 255) == 128) {
                            jArr[i17] = (((long) (i14 & 127)) << i18) | (j10 & (~(255 << i18)));
                            jArr[i12] = (jArr[i12] & (~(255 << i13))) | (128 << i13);
                            objArr[iP] = objArr[i11];
                            objArr[i11] = null;
                            iB = i11;
                        } else {
                            jArr[i17] = (((long) (i14 & 127)) << i18) | (j10 & (~(255 << i18)));
                            if (iB == -1) {
                                iB = M.b(jArr, i11 + 1, i10);
                            }
                            objArr[iB] = objArr[iP];
                            objArr[iP] = objArr[i11];
                            objArr[i11] = objArr[iB];
                            i11--;
                        }
                        jArr[AbstractC1439m.G(jArr)] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                    }
                }
                i11++;
            }
        }
        q();
    }

    public final void t(Object obj) {
        int iNumberOfTrailingZeros;
        int i10 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f11290c;
        int i14 = i11 >>> 7;
        loop0: while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f11288a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j9 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j10 = (((long) i12) * 72340172838076673L) ^ j9;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i15) & i13;
                if (kotlin.jvm.internal.n.d(this.f11289b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j9 & ((~j9) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            } else {
                i10 += 8;
                i14 = i15 + i10;
            }
        }
        if (iNumberOfTrailingZeros >= 0) {
            y(iNumberOfTrailingZeros);
        }
    }

    public final void u(N elements) {
        kotlin.jvm.internal.n.h(elements, "elements");
        Object[] objArr = elements.f11289b;
        long[] jArr = elements.f11288a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j9 = jArr[i10];
            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j9) < 128) {
                        w(objArr[(i10 << 3) + i12]);
                    }
                    j9 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void v(Iterable elements) {
        kotlin.jvm.internal.n.h(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            w(it.next());
        }
    }

    public final void w(Object obj) {
        this.f11289b[o(obj)] = obj;
    }

    public final boolean x(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f11290c;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f11288a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j9 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j10 = (((long) i11) * 72340172838076673L) ^ j9;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i13) & i12;
                if (kotlin.jvm.internal.n.d(this.f11289b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j9 & ((~j9) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        boolean z9 = iNumberOfTrailingZeros >= 0;
        if (z9) {
            y(iNumberOfTrailingZeros);
        }
        return z9;
    }

    public final void y(int i10) {
        this.f11291d--;
        long[] jArr = this.f11288a;
        int i11 = this.f11290c;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j9 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j9;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j9;
        this.f11289b[i10] = null;
    }

    public final void z(int i10) {
        long[] jArr = this.f11288a;
        Object[] objArr = this.f11289b;
        int i11 = this.f11290c;
        s(i10);
        long[] jArr2 = this.f11288a;
        Object[] objArr2 = this.f11289b;
        int i12 = this.f11290c;
        for (int i13 = 0; i13 < i11; i13++) {
            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i13];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i14 = iHashCode ^ (iHashCode << 16);
                int iP = p(i14 >>> 7);
                long j9 = i14 & 127;
                int i15 = iP >> 3;
                int i16 = (iP & 7) << 3;
                long j10 = (jArr2[i15] & (~(255 << i16))) | (j9 << i16);
                jArr2[i15] = j10;
                jArr2[(((iP - 7) & i12) + (i12 & 7)) >> 3] = j10;
                objArr2[iP] = obj;
            }
        }
    }

    public /* synthetic */ F(int i10, int i11, AbstractC1457h abstractC1457h) {
        this((i11 & 1) != 0 ? 6 : i10);
    }
}
