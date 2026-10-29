package p170r;

import androidx.collection.E;
import androidx.collection.x;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import p079h8.h;
import p079h8.i;

/* JADX INFO: renamed from: r.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1697o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f25539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f25540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f25541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f25542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final x f25543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h f25544f;

    /* JADX INFO: renamed from: r.o0$a */
    static final class a extends o implements p219v8.a {
        a() {
            super(0);
        }

        public final E a() {
            E eH = AbstractC1696o.H(C1697o0.this.b().size());
            C1697o0 c1697o0 = C1697o0.this;
            int size = c1697o0.b().size();
            for (int i10 = 0; i10 < size; i10++) {
                V v9 = (V) c1697o0.b().get(i10);
                C1681g0.f(eH, AbstractC1696o.z(v9), v9);
            }
            return eH;
        }

        @Override // p219v8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            return C1681g0.a(a());
        }
    }

    public C1697o0(List list, int i10) {
        this.f25539a = list;
        this.f25540b = i10;
        if (!(i10 >= 0)) {
            AbstractC1701q0.a("Invalid start index");
        }
        this.f25542d = new ArrayList();
        x xVar = new x(0, 1, null);
        int size = list.size();
        int iC = 0;
        for (int i11 = 0; i11 < size; i11++) {
            V v9 = (V) this.f25539a.get(i11);
            xVar.s(v9.b(), new M(i11, iC, v9.c()));
            iC += v9.c();
        }
        this.f25543e = xVar;
        this.f25544f = i.b(new a());
    }

    public final int a() {
        return this.f25541c;
    }

    public final List b() {
        return this.f25539a;
    }

    public final E c() {
        return ((C1681g0) this.f25544f.getValue()).h();
    }

    public final V d(int i10, Object obj) {
        return (V) C1681g0.e(c(), obj != null ? new U(Integer.valueOf(i10), obj) : Integer.valueOf(i10));
    }

    public final int e() {
        return this.f25540b;
    }

    public final List f() {
        return this.f25542d;
    }

    public final int g(V v9) {
        M m9 = (M) this.f25543e.c(v9.b());
        if (m9 != null) {
            return m9.b();
        }
        return -1;
    }

    public final boolean h(V v9) {
        return this.f25542d.add(v9);
    }

    public final void i(V v9, int i10) {
        this.f25543e.s(v9.b(), new M(-1, i10, 0));
    }

    public final void j(int i10, int i11, int i12) {
        char c10;
        long j9;
        char c11;
        long j10;
        char c12 = 7;
        long j11 = -9187201950435737472L;
        if (i10 > i11) {
            x xVar = this.f25543e;
            Object[] objArr = xVar.f11332c;
            long[] jArr = xVar.f11330a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i13 = 0;
            while (true) {
                long j12 = jArr[i13];
                if ((((~j12) << c12) & j12 & j11) != j11) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j12 & 255) < 128) {
                            c11 = c12;
                            M m9 = (M) objArr[(i13 << 3) + i15];
                            j10 = j11;
                            int iB = m9.b();
                            if (i10 <= iB && iB < i10 + i12) {
                                m9.e((iB - i10) + i11);
                            } else if (i11 <= iB && iB < i10) {
                                m9.e(iB + i12);
                            }
                        } else {
                            c11 = c12;
                            j10 = j11;
                        }
                        j12 >>= 8;
                        i15++;
                        c12 = c11;
                        j11 = j10;
                    }
                    c10 = c12;
                    j9 = j11;
                    if (i14 != 8) {
                        return;
                    }
                } else {
                    c10 = c12;
                    j9 = j11;
                }
                if (i13 == length) {
                    return;
                }
                i13++;
                c12 = c10;
                j11 = j9;
            }
        } else {
            if (i11 <= i10) {
                return;
            }
            x xVar2 = this.f25543e;
            Object[] objArr2 = xVar2.f11332c;
            long[] jArr2 = xVar2.f11330a;
            int length2 = jArr2.length - 2;
            if (length2 < 0) {
                return;
            }
            int i16 = 0;
            while (true) {
                long j13 = jArr2[i16];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i17 = 8 - ((~(i16 - length2)) >>> 31);
                    for (int i18 = 0; i18 < i17; i18++) {
                        if ((j13 & 255) < 128) {
                            M m10 = (M) objArr2[(i16 << 3) + i18];
                            int iB2 = m10.b();
                            if (i10 <= iB2 && iB2 < i10 + i12) {
                                m10.e((iB2 - i10) + i11);
                            } else if (i10 + 1 <= iB2 && iB2 < i11) {
                                m10.e(iB2 - i12);
                            }
                        }
                        j13 >>= 8;
                    }
                    if (i17 != 8) {
                        return;
                    }
                }
                if (i16 == length2) {
                    return;
                } else {
                    i16++;
                }
            }
        }
    }

    public final void k(int i10, int i11) {
        char c10;
        long j9;
        char c11;
        long j10;
        char c12 = 7;
        long j11 = -9187201950435737472L;
        if (i10 > i11) {
            x xVar = this.f25543e;
            Object[] objArr = xVar.f11332c;
            long[] jArr = xVar.f11330a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i12 = 0;
            while (true) {
                long j12 = jArr[i12];
                if ((((~j12) << c12) & j12 & j11) != j11) {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j12 & 255) < 128) {
                            c11 = c12;
                            M m9 = (M) objArr[(i12 << 3) + i14];
                            j10 = j11;
                            int iC = m9.c();
                            if (iC == i10) {
                                m9.f(i11);
                            } else if (i11 <= iC && iC < i10) {
                                m9.f(iC + 1);
                            }
                        } else {
                            c11 = c12;
                            j10 = j11;
                        }
                        j12 >>= 8;
                        i14++;
                        c12 = c11;
                        j11 = j10;
                    }
                    c10 = c12;
                    j9 = j11;
                    if (i13 != 8) {
                        return;
                    }
                } else {
                    c10 = c12;
                    j9 = j11;
                }
                if (i12 == length) {
                    return;
                }
                i12++;
                c12 = c10;
                j11 = j9;
            }
        } else {
            if (i11 <= i10) {
                return;
            }
            x xVar2 = this.f25543e;
            Object[] objArr2 = xVar2.f11332c;
            long[] jArr2 = xVar2.f11330a;
            int length2 = jArr2.length - 2;
            if (length2 < 0) {
                return;
            }
            int i15 = 0;
            while (true) {
                long j13 = jArr2[i15];
                if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i16 = 8 - ((~(i15 - length2)) >>> 31);
                    for (int i17 = 0; i17 < i16; i17++) {
                        if ((j13 & 255) < 128) {
                            M m10 = (M) objArr2[(i15 << 3) + i17];
                            int iC2 = m10.c();
                            if (iC2 == i10) {
                                m10.f(i11);
                            } else if (i10 + 1 <= iC2 && iC2 < i11) {
                                m10.f(iC2 - 1);
                            }
                        }
                        j13 >>= 8;
                    }
                    if (i16 != 8) {
                        return;
                    }
                }
                if (i15 == length2) {
                    return;
                } else {
                    i15++;
                }
            }
        }
    }

    public final void l(int i10) {
        this.f25541c = i10;
    }

    public final int m(V v9) {
        M m9 = (M) this.f25543e.c(v9.b());
        if (m9 != null) {
            return m9.c();
        }
        return -1;
    }

    public final boolean n(int i10, int i11) {
        int iB;
        M m9 = (M) this.f25543e.c(i10);
        if (m9 == null) {
            return false;
        }
        int iB2 = m9.b();
        int iA = i11 - m9.a();
        m9.d(i11);
        if (iA == 0) {
            return true;
        }
        x xVar = this.f25543e;
        Object[] objArr = xVar.f11332c;
        long[] jArr = xVar.f11330a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i12 = 0;
        while (true) {
            long j9 = jArr[i12];
            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8 - ((~(i12 - length)) >>> 31);
                for (int i14 = 0; i14 < i13; i14++) {
                    if ((255 & j9) < 128) {
                        M m10 = (M) objArr[(i12 << 3) + i14];
                        if (m10.b() >= iB2 && !n.d(m10, m9) && (iB = m10.b() + iA) >= 0) {
                            m10.e(iB);
                        }
                    }
                    j9 >>= 8;
                }
                if (i13 != 8) {
                    return true;
                }
            }
            if (i12 == length) {
                return true;
            }
            i12++;
        }
    }

    public final int o(V v9) {
        M m9 = (M) this.f25543e.c(v9.b());
        return m9 != null ? m9.a() : v9.c();
    }
}
