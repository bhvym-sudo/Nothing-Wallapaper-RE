package A;

import androidx.collection.C;
import androidx.collection.E;
import androidx.collection.F;
import androidx.collection.H;
import androidx.collection.N;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.I;
import p079h8.A;
import p089i8.AbstractC1439m;
import p089i8.AbstractC1444s;
import p170r.AbstractC1672c;
import p170r.AbstractC1696o;
import p170r.AbstractC1701q0;
import p170r.R0;
import p170r.S0;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f70k = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p219v8.l f71a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f73c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private f f77g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f78h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a f79i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference f72b = new AtomicReference(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p219v8.p f74d = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p219v8.l f75e = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p190t.b f76f = new p190t.b(new a[16], 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f80j = -1;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p219v8.l f81a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Object f82b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private C f83c;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f90j;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f84d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final p190t.f f85e = new p190t.f();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final E f86f = new E(0, 1, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final F f87g = new F(0, 1, null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final p190t.b f88h = new p190t.b(new p170r.E[16], 0);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final p170r.F f89i = new C0001a();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final p190t.f f91k = new p190t.f();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final HashMap f92l = new HashMap();

        /* JADX INFO: renamed from: A.s$a$a, reason: collision with other inner class name */
        public static final class C0001a implements p170r.F {
            C0001a() {
            }

            @Override // p170r.F
            public void a(p170r.E e10) {
                a.this.f90j--;
            }

            @Override // p170r.F
            public void b(p170r.E e10) {
                a.this.f90j++;
            }
        }

        public a(p219v8.l lVar) {
            this.f81a = lVar;
        }

        private final void d(Object obj) {
            int i10 = this.f84d;
            C c10 = this.f83c;
            if (c10 == null) {
                return;
            }
            long[] jArr = c10.f11270a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i11 = 0;
            while (true) {
                long j9 = jArr[i11];
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j9) < 128) {
                            int i14 = (i11 << 3) + i13;
                            Object obj2 = c10.f11271b[i14];
                            boolean z9 = c10.f11272c[i14] != i10;
                            if (z9) {
                                m(obj, obj2);
                            }
                            if (z9) {
                                c10.p(i14);
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i12 != 8) {
                        return;
                    }
                }
                if (i11 == length) {
                    return;
                } else {
                    i11++;
                }
            }
        }

        private final void l(Object obj, int i10, Object obj2, C c10) {
            int i11;
            int i12;
            int i13;
            if (this.f90j > 0) {
                return;
            }
            int iO = c10.o(obj, i10, -1);
            int i14 = 2;
            if (!(obj instanceof p170r.E) || iO == i10) {
                i11 = 2;
                i12 = -1;
            } else {
                r.E.a aVarJ = ((p170r.E) obj).j();
                this.f92l.put(obj, aVarJ.a());
                H hB = aVarJ.b();
                p190t.f fVar = this.f91k;
                fVar.g(obj);
                Object[] objArr = hB.f11271b;
                long[] jArr = hB.f11270a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j9 = jArr[i15];
                        if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i16 = 8 - ((~(i15 - length)) >>> 31);
                            int i17 = 0;
                            while (i17 < i16) {
                                if ((j9 & 255) < 128) {
                                    i13 = i14;
                                    u uVar = (u) objArr[(i15 << 3) + i17];
                                    if (uVar instanceof v) {
                                        ((v) uVar).m(g.a(i13));
                                    }
                                    fVar.a(uVar, obj);
                                } else {
                                    i13 = i14;
                                }
                                j9 >>= 8;
                                i17++;
                                i14 = i13;
                            }
                            i11 = i14;
                            if (i16 != 8) {
                                break;
                            }
                        } else {
                            i11 = i14;
                        }
                        if (i15 == length) {
                            break;
                        }
                        i15++;
                        i14 = i11;
                    }
                } else {
                    i11 = 2;
                }
                i12 = -1;
            }
            if (iO == i12) {
                if (obj instanceof v) {
                    ((v) obj).m(g.a(i11));
                }
                this.f85e.a(obj, obj2);
            }
        }

        private final void m(Object obj, Object obj2) {
            this.f85e.f(obj2, obj);
            if (!(obj2 instanceof p170r.E) || this.f85e.c(obj2)) {
                return;
            }
            this.f91k.g(obj2);
            this.f92l.remove(obj2);
        }

        public final void c() {
            this.f85e.b();
            this.f86f.h();
            this.f91k.b();
            this.f92l.clear();
        }

        public final void e(Object obj) {
            C c10 = (C) this.f86f.o(obj);
            if (c10 == null) {
                return;
            }
            Object[] objArr = c10.f11271b;
            int[] iArr = c10.f11272c;
            long[] jArr = c10.f11270a;
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
                            int i13 = (i10 << 3) + i12;
                            Object obj2 = objArr[i13];
                            int i14 = iArr[i13];
                            m(obj, obj2);
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

        public final p219v8.l f() {
            return this.f81a;
        }

        public final boolean g() {
            return this.f86f.f();
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0042 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:15:0x0044 A[LOOP:0: B:5:0x000f->B:15:0x0044, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:19:0x0047 A[EDGE_INSN: B:19:0x0047->B:16:0x0047 BREAK  A[LOOP:0: B:5:0x000f->B:15:0x0044], SYNTHETIC] */
        public final void h() {
            F f10 = this.f87g;
            p219v8.l lVar = this.f81a;
            Object[] objArr = f10.f11289b;
            long[] jArr = f10.f11288a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j9 = jArr[i10];
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i10 != length) {
                            break;
                            break;
                        }
                        i10++;
                    } else {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j9) < 128) {
                                lVar.f(objArr[(i10 << 3) + i12]);
                            }
                            j9 >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        } else if (i10 != length) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
            }
            f10.m();
        }

        public final void i(Object obj, p219v8.l lVar, p219v8.a aVar) {
            Object obj2 = this.f82b;
            C c10 = this.f83c;
            int i10 = this.f84d;
            this.f82b = obj;
            this.f83c = (C) this.f86f.b(obj);
            if (this.f84d == -1) {
                this.f84d = p.H().f();
            }
            p170r.F f10 = this.f89i;
            p190t.b bVarA = S0.a();
            try {
                bVarA.b(f10);
                k.f25e.h(lVar, null, aVar);
                bVarA.w(bVarA.p() - 1);
                Object obj3 = this.f82b;
                kotlin.jvm.internal.n.e(obj3);
                d(obj3);
                this.f82b = obj2;
                this.f83c = c10;
                this.f84d = i10;
            } catch (Throwable th) {
                bVarA.w(bVarA.p() - 1);
                throw th;
            }
        }

        /* JADX WARN: Code duplicated, block: B:101:0x0244  */
        /* JADX WARN: Code duplicated, block: B:119:0x029e A[DONT_INVERT, PHI: r11
          0x029e: PHI (r11v50 boolean) = (r11v49 boolean), (r11v51 boolean) binds: [B:110:0x0275, B:118:0x029c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:120:0x02a0 A[LOOP:6: B:109:0x026b->B:120:0x02a0, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:178:0x040c A[PHI: r13
          0x040c: PHI (r13v4 boolean) = (r13v3 boolean), (r13v5 boolean) binds: [B:169:0x03de, B:177:0x040a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:181:0x0412 A[LOOP:14: B:168:0x03d1->B:181:0x0412, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:216:0x04cb A[DONT_INVERT, PHI: r11
          0x04cb: PHI (r11v14 boolean) = (r11v13 boolean), (r11v15 boolean) binds: [B:207:0x04a2, B:215:0x04c9] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:217:0x04cd A[LOOP:18: B:206:0x0498->B:217:0x04cd, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:220:0x04dc  */
        /* JADX WARN: Code duplicated, block: B:264:0x0179 A[EDGE_INSN: B:264:0x0179->B:64:0x0179 BREAK  A[LOOP:4: B:46:0x011a->B:60:0x015c], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:269:0x02a8 A[EDGE_INSN: B:269:0x02a8->B:122:0x02a8 BREAK  A[LOOP:6: B:109:0x026b->B:120:0x02a0], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:274:0x0250 A[EDGE_INSN: B:274:0x0250->B:102:0x0250 BREAK  A[LOOP:8: B:87:0x0200->B:98:0x0235], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:288:0x0426 A[EDGE_INSN: B:288:0x0426->B:184:0x0426 BREAK  A[LOOP:14: B:168:0x03d1->B:181:0x0412], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:296:0x04e0 A[EDGE_INSN: B:296:0x04e0->B:221:0x04e0 BREAK  A[LOOP:18: B:206:0x0498->B:217:0x04cd], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:57:0x0154 A[PHI: r41
          0x0154: PHI (r41v1 boolean) = (r41v0 boolean), (r41v2 boolean) binds: [B:47:0x0128, B:56:0x0152] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:60:0x015c A[LOOP:4: B:46:0x011a->B:60:0x015c, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:97:0x0233 A[DONT_INVERT, PHI: r11
          0x0233: PHI (r11v59 boolean) = (r11v58 boolean), (r11v60 boolean) binds: [B:88:0x020a, B:96:0x0231] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:98:0x0235 A[LOOP:8: B:87:0x0200->B:98:0x0235, LOOP_END] */
        public final boolean j(Set set) {
            boolean z9;
            Iterator it;
            p190t.f fVar;
            Object objB;
            long[] jArr;
            Iterator it2;
            p190t.f fVar2;
            long[] jArr2;
            long j9;
            long[] jArr3;
            p190t.f fVar3;
            Object[] objArr;
            String str;
            int i10;
            p190t.f fVar4;
            Object[] objArr2;
            String str2;
            int i11;
            int i12;
            long j10;
            int i13;
            int i14;
            Object objB2;
            Object[] objArr3;
            int i15;
            long j11;
            int i16;
            p190t.f fVar5 = this.f91k;
            HashMap map = this.f92l;
            p190t.f fVar6 = this.f85e;
            F f10 = this.f87g;
            String str3 = "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>";
            int i17 = 8;
            int i18 = 0;
            if (set instanceof p190t.d) {
                N nA = ((p190t.d) set).a();
                Object[] objArr4 = nA.f11289b;
                long[] jArr4 = nA.f11288a;
                int length = jArr4.length - 2;
                if (length >= 0) {
                    int i19 = 0;
                    z9 = false;
                    while (true) {
                        long j12 = jArr4[i19];
                        if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i20 = 8 - ((~(i19 - length)) >>> 31);
                            int i21 = 0;
                            while (i21 < i20) {
                                if ((j12 & 255) < 128) {
                                    int i22 = i17;
                                    Object obj = objArr4[(i19 << 3) + i21];
                                    if (obj instanceof v) {
                                        fVar4 = fVar6;
                                        if (!((v) obj).l(g.a(2))) {
                                            objArr2 = objArr4;
                                            str2 = str3;
                                            i11 = length;
                                            i12 = i19;
                                            j10 = j12;
                                            i13 = i20;
                                        }
                                        i14 = 8;
                                    } else {
                                        fVar4 = fVar6;
                                    }
                                    if (!fVar5.c(obj) || (objB2 = fVar5.d().b(obj)) == null) {
                                        objArr2 = objArr4;
                                        str2 = str3;
                                        i11 = length;
                                        i12 = i19;
                                        j10 = j12;
                                        i13 = i20;
                                    } else if (objB2 instanceof F) {
                                        F f11 = (F) objB2;
                                        Object[] objArr5 = f11.f11289b;
                                        long[] jArr5 = f11.f11288a;
                                        int length2 = jArr5.length - 2;
                                        if (length2 >= 0) {
                                            j10 = j12;
                                            int i23 = 0;
                                            boolean z10 = z9;
                                            while (true) {
                                                long j13 = jArr5[i23];
                                                i11 = length;
                                                i12 = i19;
                                                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i24 = 8 - ((~(i23 - length2)) >>> 31);
                                                    int i25 = 0;
                                                    while (i25 < i24) {
                                                        if ((j13 & 255) < 128) {
                                                            objArr3 = objArr4;
                                                            p170r.E e10 = (p170r.E) objArr5[(i23 << 3) + i25];
                                                            kotlin.jvm.internal.n.f(e10, str3);
                                                            i15 = i25;
                                                            Object obj2 = map.get(e10);
                                                            R0 r0A = e10.a();
                                                            if (r0A == null) {
                                                                r0A = S0.g();
                                                            }
                                                            j11 = j13;
                                                            if (r0A.a(e10.j().a(), obj2)) {
                                                                str3 = str3;
                                                                i16 = i20;
                                                                this.f88h.b(e10);
                                                            } else {
                                                                Object objB3 = fVar4.d().b(e10);
                                                                if (objB3 != null) {
                                                                    if (objB3 instanceof F) {
                                                                        F f12 = (F) objB3;
                                                                        Object[] objArr6 = f12.f11289b;
                                                                        long[] jArr6 = f12.f11288a;
                                                                        int length3 = jArr6.length - 2;
                                                                        if (length3 >= 0) {
                                                                            str3 = str3;
                                                                            int i26 = 0;
                                                                            while (true) {
                                                                                long j14 = jArr6[i26];
                                                                                boolean z11 = z10;
                                                                                i16 = i20;
                                                                                if ((((~j14) << 7) & j14 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                                                    z10 = z11;
                                                                                    if (i26 != length3) {
                                                                                        break;
                                                                                        break;
                                                                                    }
                                                                                    i26++;
                                                                                    i20 = i16;
                                                                                    i22 = 8;
                                                                                } else {
                                                                                    int i27 = 8 - ((~(i26 - length3)) >>> 31);
                                                                                    for (int i28 = 0; i28 < i27; i28++) {
                                                                                        if ((j14 & 255) < 128) {
                                                                                            f10.h(objArr6[(i26 << 3) + i28]);
                                                                                            z11 = true;
                                                                                        }
                                                                                        j14 >>= i22;
                                                                                    }
                                                                                    if (i27 != i22) {
                                                                                        z10 = z11;
                                                                                        break;
                                                                                    }
                                                                                    z10 = z11;
                                                                                    if (i26 != length3) {
                                                                                        break;
                                                                                    }
                                                                                    i26++;
                                                                                    i20 = i16;
                                                                                    i22 = 8;
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        str3 = str3;
                                                                        i16 = i20;
                                                                        f10.h(objB3);
                                                                        z10 = true;
                                                                    }
                                                                }
                                                            }
                                                            j13 = j11 >> 8;
                                                            i25 = i15 + 1;
                                                            i22 = 8;
                                                            objArr4 = objArr3;
                                                            str3 = str3;
                                                            i20 = i16;
                                                        } else {
                                                            objArr3 = objArr4;
                                                            i15 = i25;
                                                            j11 = j13;
                                                        }
                                                        i16 = i20;
                                                        j13 = j11 >> 8;
                                                        i25 = i15 + 1;
                                                        i22 = 8;
                                                        objArr4 = objArr3;
                                                        str3 = str3;
                                                        i20 = i16;
                                                    }
                                                    objArr2 = objArr4;
                                                    str2 = str3;
                                                    i13 = i20;
                                                    if (i24 != i22) {
                                                        break;
                                                    }
                                                } else {
                                                    objArr2 = objArr4;
                                                    str2 = str3;
                                                    i13 = i20;
                                                }
                                                if (i23 == length2) {
                                                    break;
                                                }
                                                i23++;
                                                length = i11;
                                                i19 = i12;
                                                objArr4 = objArr2;
                                                str3 = str2;
                                                i20 = i13;
                                                i22 = 8;
                                            }
                                            z9 = z10;
                                        } else {
                                            objArr2 = objArr4;
                                            str2 = str3;
                                            i11 = length;
                                            i12 = i19;
                                            j10 = j12;
                                            i13 = i20;
                                        }
                                    } else {
                                        objArr2 = objArr4;
                                        str2 = str3;
                                        i11 = length;
                                        i12 = i19;
                                        j10 = j12;
                                        i13 = i20;
                                        p170r.E e11 = (p170r.E) objB2;
                                        Object obj3 = map.get(e11);
                                        R0 r0A2 = e11.a();
                                        if (r0A2 == null) {
                                            r0A2 = S0.g();
                                        }
                                        if (r0A2.a(e11.j().a(), obj3)) {
                                            this.f88h.b(e11);
                                        } else {
                                            Object objB4 = fVar4.d().b(e11);
                                            if (objB4 != null) {
                                                if (objB4 instanceof F) {
                                                    F f13 = (F) objB4;
                                                    Object[] objArr7 = f13.f11289b;
                                                    long[] jArr7 = f13.f11288a;
                                                    int length4 = jArr7.length - 2;
                                                    if (length4 >= 0) {
                                                        int i29 = 0;
                                                        while (true) {
                                                            long j15 = jArr7[i29];
                                                            if ((((~j15) << 7) & j15 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                                if (i29 != length4) {
                                                                    break;
                                                                    break;
                                                                }
                                                                i29++;
                                                            } else {
                                                                int i30 = 8 - ((~(i29 - length4)) >>> 31);
                                                                for (int i31 = 0; i31 < i30; i31++) {
                                                                    if ((j15 & 255) < 128) {
                                                                        f10.h(objArr7[(i29 << 3) + i31]);
                                                                        z9 = true;
                                                                    }
                                                                    j15 >>= 8;
                                                                }
                                                                if (i30 != 8) {
                                                                    break;
                                                                }
                                                                if (i29 != length4) {
                                                                    break;
                                                                }
                                                                i29++;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    f10.h(objB4);
                                                    z9 = true;
                                                }
                                            }
                                        }
                                    }
                                    Object objB5 = fVar4.d().b(obj);
                                    if (objB5 != null) {
                                        if (objB5 instanceof F) {
                                            F f14 = (F) objB5;
                                            Object[] objArr8 = f14.f11289b;
                                            long[] jArr8 = f14.f11288a;
                                            int length5 = jArr8.length - 2;
                                            if (length5 >= 0) {
                                                int i32 = 0;
                                                while (true) {
                                                    long j16 = jArr8[i32];
                                                    if ((((~j16) << 7) & j16 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                        if (i32 != length5) {
                                                            break;
                                                            break;
                                                        }
                                                        i32++;
                                                    } else {
                                                        int i33 = 8 - ((~(i32 - length5)) >>> 31);
                                                        for (int i34 = 0; i34 < i33; i34++) {
                                                            if ((j16 & 255) < 128) {
                                                                f10.h(objArr8[(i32 << 3) + i34]);
                                                                z9 = true;
                                                            }
                                                            j16 >>= 8;
                                                        }
                                                        if (i33 != 8) {
                                                            break;
                                                        }
                                                        if (i32 != length5) {
                                                            break;
                                                        }
                                                        i32++;
                                                    }
                                                }
                                            }
                                        } else {
                                            f10.h(objB5);
                                            z9 = true;
                                        }
                                    }
                                    i14 = 8;
                                } else {
                                    fVar4 = fVar6;
                                    objArr2 = objArr4;
                                    str2 = str3;
                                    i11 = length;
                                    i12 = i19;
                                    j10 = j12;
                                    i13 = i20;
                                    i14 = i17;
                                }
                                j12 = j10 >> i14;
                                i21++;
                                i17 = i14;
                                jArr4 = jArr4;
                                fVar6 = fVar4;
                                length = i11;
                                i19 = i12;
                                objArr4 = objArr2;
                                str3 = str2;
                                i20 = i13;
                            }
                            jArr3 = jArr4;
                            fVar3 = fVar6;
                            objArr = objArr4;
                            str = str3;
                            int i35 = length;
                            int i36 = i19;
                            if (i20 != i17) {
                                break;
                            }
                            length = i35;
                            i10 = i36;
                        } else {
                            jArr3 = jArr4;
                            fVar3 = fVar6;
                            objArr = objArr4;
                            str = str3;
                            i10 = i19;
                        }
                        if (i10 == length) {
                            break;
                        }
                        i19 = i10 + 1;
                        jArr4 = jArr3;
                        fVar6 = fVar3;
                        objArr4 = objArr;
                        str3 = str;
                        i17 = 8;
                    }
                } else {
                    z9 = false;
                }
            } else {
                Iterator it3 = set.iterator();
                z9 = false;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    if (!(next instanceof v) || ((v) next).l(g.a(2))) {
                        if (!fVar5.c(next) || (objB = fVar5.d().b(next)) == null) {
                            it = it3;
                            fVar = fVar5;
                        } else if (objB instanceof F) {
                            F f15 = (F) objB;
                            Object[] objArr9 = f15.f11289b;
                            long[] jArr9 = f15.f11288a;
                            int length6 = jArr9.length - 2;
                            if (length6 >= 0) {
                                int i37 = 0;
                                while (true) {
                                    long j17 = jArr9[i37];
                                    if ((((~j17) << 7) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i38 = 8 - ((~(i37 - length6)) >>> 31);
                                        int i39 = 0;
                                        while (i39 < i38) {
                                            if ((j17 & 255) < 128) {
                                                p170r.E e12 = (p170r.E) objArr9[(i37 << 3) + i39];
                                                it2 = it3;
                                                kotlin.jvm.internal.n.f(e12, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
                                                Object obj4 = map.get(e12);
                                                R0 r0A3 = e12.a();
                                                if (r0A3 == null) {
                                                    r0A3 = S0.g();
                                                }
                                                fVar2 = fVar5;
                                                jArr2 = jArr9;
                                                if (r0A3.a(e12.j().a(), obj4)) {
                                                    j9 = j17;
                                                    this.f88h.b(e12);
                                                } else {
                                                    Object objB6 = fVar6.d().b(e12);
                                                    if (objB6 != null) {
                                                        if (objB6 instanceof F) {
                                                            F f16 = (F) objB6;
                                                            Object[] objArr10 = f16.f11289b;
                                                            long[] jArr10 = f16.f11288a;
                                                            int length7 = jArr10.length - 2;
                                                            if (length7 >= 0) {
                                                                int i40 = 0;
                                                                while (true) {
                                                                    long j18 = jArr10[i40];
                                                                    j9 = j17;
                                                                    boolean z12 = z9;
                                                                    if ((((~j18) << 7) & j18 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                                        z9 = z12;
                                                                        if (i40 != length7) {
                                                                            break;
                                                                            break;
                                                                        }
                                                                        i40++;
                                                                        j17 = j9;
                                                                    } else {
                                                                        int i41 = 8 - ((~(i40 - length7)) >>> 31);
                                                                        int i42 = 0;
                                                                        while (i42 < i41) {
                                                                            if ((j18 & 255) < 128) {
                                                                                f10.h(objArr10[(i40 << 3) + i42]);
                                                                                z12 = true;
                                                                            }
                                                                            i42++;
                                                                            j18 >>= 8;
                                                                        }
                                                                        if (i41 != 8) {
                                                                            z9 = z12;
                                                                            break;
                                                                        }
                                                                        z9 = z12;
                                                                        if (i40 != length7) {
                                                                            break;
                                                                        }
                                                                        i40++;
                                                                        j17 = j9;
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            j9 = j17;
                                                            f10.h(objB6);
                                                            z9 = true;
                                                        }
                                                    }
                                                }
                                                j17 = j9 >> 8;
                                                i39++;
                                                it3 = it2;
                                                fVar5 = fVar2;
                                                jArr9 = jArr2;
                                            } else {
                                                it2 = it3;
                                                fVar2 = fVar5;
                                                jArr2 = jArr9;
                                            }
                                            j9 = j17;
                                            j17 = j9 >> 8;
                                            i39++;
                                            it3 = it2;
                                            fVar5 = fVar2;
                                            jArr9 = jArr2;
                                        }
                                        it = it3;
                                        fVar = fVar5;
                                        jArr = jArr9;
                                        if (i38 != 8) {
                                            break;
                                        }
                                    } else {
                                        it = it3;
                                        fVar = fVar5;
                                        jArr = jArr9;
                                    }
                                    if (i37 == length6) {
                                        break;
                                    }
                                    i37++;
                                    it3 = it;
                                    fVar5 = fVar;
                                    jArr9 = jArr;
                                }
                            } else {
                                it = it3;
                                fVar = fVar5;
                            }
                        } else {
                            it = it3;
                            fVar = fVar5;
                            p170r.E e13 = (p170r.E) objB;
                            Object obj5 = map.get(e13);
                            R0 r0A4 = e13.a();
                            if (r0A4 == null) {
                                r0A4 = S0.g();
                            }
                            if (r0A4.a(e13.j().a(), obj5)) {
                                this.f88h.b(e13);
                            } else {
                                Object objB7 = fVar6.d().b(e13);
                                if (objB7 != null) {
                                    if (objB7 instanceof F) {
                                        F f17 = (F) objB7;
                                        Object[] objArr11 = f17.f11289b;
                                        long[] jArr11 = f17.f11288a;
                                        int length8 = jArr11.length - 2;
                                        if (length8 >= 0) {
                                            int i43 = 0;
                                            while (true) {
                                                long j19 = jArr11[i43];
                                                if ((((~j19) << 7) & j19 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                    if (i43 != length8) {
                                                        break;
                                                        break;
                                                    }
                                                    i43++;
                                                } else {
                                                    int i44 = 8 - ((~(i43 - length8)) >>> 31);
                                                    for (int i45 = 0; i45 < i44; i45++) {
                                                        if ((j19 & 255) < 128) {
                                                            f10.h(objArr11[(i43 << 3) + i45]);
                                                            z9 = true;
                                                        }
                                                        j19 >>= 8;
                                                    }
                                                    if (i44 != 8) {
                                                        break;
                                                    }
                                                    if (i43 != length8) {
                                                        break;
                                                    }
                                                    i43++;
                                                }
                                            }
                                        }
                                    } else {
                                        f10.h(objB7);
                                        z9 = true;
                                    }
                                }
                            }
                        }
                        Object objB8 = fVar6.d().b(next);
                        if (objB8 != null) {
                            if (objB8 instanceof F) {
                                F f18 = (F) objB8;
                                Object[] objArr12 = f18.f11289b;
                                long[] jArr12 = f18.f11288a;
                                int length9 = jArr12.length - 2;
                                if (length9 >= 0) {
                                    int i46 = 0;
                                    while (true) {
                                        long j20 = jArr12[i46];
                                        if ((((~j20) << 7) & j20 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i47 = 8 - ((~(i46 - length9)) >>> 31);
                                            for (int i48 = 0; i48 < i47; i48++) {
                                                if ((j20 & 255) < 128) {
                                                    f10.h(objArr12[(i46 << 3) + i48]);
                                                    z9 = true;
                                                }
                                                j20 >>= 8;
                                            }
                                            if (i47 != 8) {
                                                break;
                                            }
                                        }
                                        if (i46 == length9) {
                                            break;
                                        }
                                        i46++;
                                    }
                                }
                            } else {
                                f10.h(objB8);
                                z9 = true;
                            }
                        }
                        it3 = it;
                        fVar5 = fVar;
                    } else {
                        it = it3;
                        fVar = fVar5;
                    }
                    it3 = it;
                    fVar5 = fVar;
                }
            }
            if (this.f88h.s()) {
                p190t.b bVar = this.f88h;
                int iP = bVar.p();
                if (iP > 0) {
                    Object[] objArrO = bVar.o();
                    while (true) {
                        o((p170r.E) objArrO[i18]);
                        int i49 = i18 + 1;
                        if (i49 >= iP) {
                            break;
                        }
                        i18 = i49;
                    }
                }
                this.f88h.j();
            }
            return z9;
        }

        public final void k(Object obj) {
            Object obj2 = this.f82b;
            kotlin.jvm.internal.n.e(obj2);
            int i10 = this.f84d;
            C c10 = this.f83c;
            if (c10 == null) {
                c10 = new C(0, 1, null);
                this.f83c = c10;
                this.f86f.r(obj2, c10);
                A a10 = A.f21846a;
            }
            l(obj, i10, obj2, c10);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x009d A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:28:0x009f A[LOOP:2: B:16:0x0066->B:28:0x009f, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:29:0x00a8  */
        /* JADX WARN: Code duplicated, block: B:49:0x00ac A[EDGE_INSN: B:49:0x00ac->B:30:0x00ac BREAK  A[LOOP:2: B:16:0x0066->B:28:0x009f], SYNTHETIC] */
        public final void n(p219v8.l lVar) {
            long[] jArr;
            long[] jArr2;
            long j9;
            char c10;
            long j10;
            int i10;
            E e10 = this.f86f;
            long[] jArr3 = e10.f11281a;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i11 = 0;
            while (true) {
                long j11 = jArr3[i11];
                char c11 = 7;
                long j12 = -9187201950435737472L;
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8;
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j11 & 255) < 128) {
                            int i15 = (i11 << 3) + i14;
                            c10 = c11;
                            Object obj = e10.f11282b[i15];
                            j10 = j12;
                            C c12 = (C) e10.f11283c[i15];
                            Boolean bool = (Boolean) lVar.f(obj);
                            if (bool.booleanValue()) {
                                Object[] objArr = c12.f11271b;
                                int[] iArr = c12.f11272c;
                                long[] jArr4 = c12.f11270a;
                                int i16 = i12;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    jArr2 = jArr3;
                                    j9 = j11;
                                    int i17 = 0;
                                    while (true) {
                                        long j13 = jArr4[i17];
                                        long[] jArr5 = jArr4;
                                        if ((((~j13) << c10) & j13 & j10) != j10) {
                                            int i18 = 8 - ((~(i17 - length2)) >>> 31);
                                            for (int i19 = 0; i19 < i18; i19++) {
                                                if ((j13 & 255) < 128) {
                                                    int i20 = (i17 << 3) + i19;
                                                    Object obj2 = objArr[i20];
                                                    int i21 = iArr[i20];
                                                    m(obj, obj2);
                                                }
                                                j13 >>= i16;
                                            }
                                            if (i18 != i16) {
                                                break;
                                            }
                                            if (i17 != length2) {
                                                break;
                                            }
                                            i17++;
                                            jArr4 = jArr5;
                                            i16 = 8;
                                        } else if (i17 != length2) {
                                            break;
                                            break;
                                        } else {
                                            i17++;
                                            jArr4 = jArr5;
                                            i16 = 8;
                                        }
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j9 = j11;
                                }
                            } else {
                                jArr2 = jArr3;
                                j9 = j11;
                            }
                            if (bool.booleanValue()) {
                                e10.p(i15);
                            }
                            i10 = 8;
                        } else {
                            jArr2 = jArr3;
                            j9 = j11;
                            c10 = c11;
                            j10 = j12;
                            i10 = i12;
                        }
                        i14++;
                        i12 = i10;
                        j11 = j9 >> i10;
                        c11 = c10;
                        j12 = j10;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i13 != i12) {
                        return;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i11 == length) {
                    return;
                }
                i11++;
                jArr3 = jArr;
            }
        }

        public final void o(p170r.E e10) {
            long[] jArr;
            C c10;
            E e11 = this.f86f;
            int iF = p.H().f();
            Object objB = this.f85e.d().b(e10);
            if (objB == null) {
                return;
            }
            if (!(objB instanceof F)) {
                C c11 = (C) e11.b(objB);
                if (c11 == null) {
                    c11 = new C(0, 1, null);
                    e11.r(objB, c11);
                    A a10 = A.f21846a;
                }
                l(e10, iF, objB, c11);
                return;
            }
            F f10 = (F) objB;
            Object[] objArr = f10.f11289b;
            long[] jArr2 = f10.f11288a;
            int length = jArr2.length - 2;
            if (length < 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                long j9 = jArr2[i10];
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8;
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    int i13 = 0;
                    while (i13 < i12) {
                        if ((j9 & 255) < 128) {
                            Object obj = objArr[(i10 << 3) + i13];
                            C c12 = (C) e11.b(obj);
                            if (c12 == null) {
                                c10 = new C(0, 1, null);
                                e11.r(obj, c10);
                                A a11 = A.f21846a;
                            } else {
                                c10 = c12;
                            }
                            l(e10, iF, obj, c10);
                        }
                        j9 >>= i11;
                        i13++;
                        i11 = i11;
                        jArr2 = jArr2;
                    }
                    jArr = jArr2;
                    if (i12 != i11) {
                        return;
                    }
                } else {
                    jArr = jArr2;
                }
                if (i10 == length) {
                    return;
                }
                i10++;
                jArr2 = jArr;
            }
        }
    }

    static final class b extends kotlin.jvm.internal.o implements p219v8.p {
        b() {
            super(2);
        }

        public final void a(Set set, k kVar) {
            s.this.i(set);
            if (s.this.m()) {
                s.this.r();
            }
        }

        @Override // p219v8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Set) obj, (k) obj2);
            return A.f21846a;
        }
    }

    static final class c extends kotlin.jvm.internal.o implements p219v8.l {
        c() {
            super(1);
        }

        public final void a(Object obj) {
            if (s.this.f78h) {
                return;
            }
            p190t.b bVar = s.this.f76f;
            s sVar = s.this;
            synchronized (bVar) {
                a aVar = sVar.f79i;
                kotlin.jvm.internal.n.e(aVar);
                aVar.k(obj);
                A a10 = A.f21846a;
            }
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            a(obj);
            return A.f21846a;
        }
    }

    static final class d extends kotlin.jvm.internal.o implements p219v8.a {
        d() {
            super(0);
        }

        public final void a() {
            do {
                p190t.b bVar = s.this.f76f;
                s sVar = s.this;
                synchronized (bVar) {
                    try {
                        if (!sVar.f73c) {
                            sVar.f73c = true;
                            try {
                                p190t.b bVar2 = sVar.f76f;
                                int iP = bVar2.p();
                                if (iP > 0) {
                                    Object[] objArrO = bVar2.o();
                                    int i10 = 0;
                                    do {
                                        ((a) objArrO[i10]).h();
                                        i10++;
                                    } while (i10 < iP);
                                }
                                sVar.f73c = false;
                            } catch (Throwable th) {
                                sVar.f73c = false;
                                throw th;
                            }
                        }
                        A a10 = A.f21846a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } while (s.this.m());
        }

        @Override // p219v8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return A.f21846a;
        }
    }

    public s(p219v8.l lVar) {
        this.f71a = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void i(Set set) {
        Object obj;
        Collection collectionG0;
        do {
            obj = this.f72b.get();
            if (obj == null) {
                collectionG0 = set;
            } else if (obj instanceof Set) {
                collectionG0 = AbstractC1444s.n(obj, set);
            } else {
                if (!(obj instanceof List)) {
                    q();
                    throw new p079h8.f();
                }
                collectionG0 = AbstractC1444s.g0((Collection) obj, AbstractC1444s.e(set));
            }
        } while (!this.f72b.compareAndSet(obj, collectionG0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean m() {
        boolean z9;
        synchronized (this.f76f) {
            z9 = this.f73c;
        }
        if (z9) {
            return false;
        }
        boolean z10 = false;
        while (true) {
            Set setP = p();
            if (setP == null) {
                return z10;
            }
            synchronized (this.f76f) {
                try {
                    p190t.b bVar = this.f76f;
                    int iP = bVar.p();
                    if (iP > 0) {
                        Object[] objArrO = bVar.o();
                        int i10 = 0;
                        do {
                            z10 = ((a) objArrO[i10]).j(setP) || z10;
                            i10++;
                        } while (i10 < iP);
                    }
                    A a10 = A.f21846a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private final a n(p219v8.l lVar) {
        Object obj;
        p190t.b bVar = this.f76f;
        int iP = bVar.p();
        if (iP <= 0) {
            obj = null;
            break;
        }
        Object[] objArrO = bVar.o();
        int i10 = 0;
        while (true) {
            obj = objArrO[i10];
            if (((a) obj).f() == lVar) {
                break;
            }
            i10++;
            if (i10 >= iP) {
                obj = null;
                break;
            }
        }
        a aVar = (a) obj;
        if (aVar != null) {
            return aVar;
        }
        kotlin.jvm.internal.n.f(lVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
        a aVar2 = new a((p219v8.l) I.d(lVar, 1));
        this.f76f.b(aVar2);
        return aVar2;
    }

    private final Set p() {
        Object obj;
        Object objSubList;
        Set set;
        do {
            obj = this.f72b.get();
            objSubList = null;
            if (obj == null) {
                return null;
            }
            if (obj instanceof Set) {
                set = (Set) obj;
            } else {
                if (!(obj instanceof List)) {
                    q();
                    throw new p079h8.f();
                }
                List list = (List) obj;
                Set set2 = (Set) list.get(0);
                if (list.size() == 2) {
                    objSubList = list.get(1);
                } else if (list.size() > 2) {
                    objSubList = list.subList(1, list.size());
                }
                set = set2;
            }
        } while (!this.f72b.compareAndSet(obj, objSubList));
        return set;
    }

    private final Void q() {
        AbstractC1696o.s("Unexpected notification");
        throw new p079h8.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r() {
        this.f71a.f(new d());
    }

    public final void j() {
        synchronized (this.f76f) {
            try {
                p190t.b bVar = this.f76f;
                int iP = bVar.p();
                if (iP > 0) {
                    Object[] objArrO = bVar.o();
                    int i10 = 0;
                    do {
                        ((a) objArrO[i10]).c();
                        i10++;
                    } while (i10 < iP);
                }
                A a10 = A.f21846a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(Object obj) {
        synchronized (this.f76f) {
            try {
                p190t.b bVar = this.f76f;
                int iP = bVar.p();
                int i10 = 0;
                for (int i11 = 0; i11 < iP; i11++) {
                    a aVar = (a) bVar.o()[i11];
                    aVar.e(obj);
                    if (!aVar.g()) {
                        i10++;
                    } else if (i10 > 0) {
                        bVar.o()[i11 - i10] = bVar.o()[i11];
                    }
                }
                int i12 = iP - i10;
                AbstractC1439m.q(bVar.o(), null, i12, iP);
                bVar.A(i12);
                A a10 = A.f21846a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(p219v8.l lVar) {
        synchronized (this.f76f) {
            try {
                p190t.b bVar = this.f76f;
                int iP = bVar.p();
                int i10 = 0;
                for (int i11 = 0; i11 < iP; i11++) {
                    a aVar = (a) bVar.o()[i11];
                    aVar.n(lVar);
                    if (!aVar.g()) {
                        i10++;
                    } else if (i10 > 0) {
                        bVar.o()[i11 - i10] = bVar.o()[i11];
                    }
                }
                int i12 = iP - i10;
                AbstractC1439m.q(bVar.o(), null, i12, iP);
                bVar.A(i12);
                A a10 = A.f21846a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o(Object obj, p219v8.l lVar, p219v8.a aVar) {
        a aVarN;
        synchronized (this.f76f) {
            aVarN = n(lVar);
        }
        boolean z9 = this.f78h;
        a aVar2 = this.f79i;
        long j9 = this.f80j;
        if (j9 != -1) {
            if (!(j9 == AbstractC1672c.a())) {
                AbstractC1701q0.a("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j9 + "), currentThread={id=" + AbstractC1672c.a() + ", name=" + AbstractC1672c.b() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            }
        }
        try {
            this.f78h = false;
            this.f79i = aVarN;
            this.f80j = AbstractC1672c.a();
            aVarN.i(obj, this.f75e, aVar);
        } finally {
            this.f79i = aVar2;
            this.f78h = z9;
            this.f80j = j9;
        }
    }

    public final void s() {
        this.f77g = k.f25e.i(this.f74d);
    }

    public final void t() {
        f fVar = this.f77g;
        if (fVar != null) {
            fVar.dispose();
        }
    }
}
