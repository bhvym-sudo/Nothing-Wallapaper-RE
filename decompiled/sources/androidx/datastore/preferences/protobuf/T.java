package androidx.datastore.preferences.protobuf;

import androidx.constraintlayout.core.widgets.Optimizer;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
final class T implements f0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int[] f12415r = new int[0];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Unsafe f12416s = p0.A();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f12417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object[] f12418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f12419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f12420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final P f12421e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f12422f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f12423g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a0 f12424h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f12425i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f12426j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f12427k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f12428l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final V f12429m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final D f12430n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final m0 f12431o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AbstractC1106p f12432p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final K f12433q;

    private T(int[] iArr, Object[] objArr, int i10, int i11, P p9, a0 a0Var, boolean z9, int[] iArr2, int i12, int i13, V v9, D d10, m0 m0Var, AbstractC1106p abstractC1106p, K k9) {
        this.f12417a = iArr;
        this.f12418b = objArr;
        this.f12419c = i10;
        this.f12420d = i11;
        this.f12423g = p9 instanceof AbstractC1112w;
        this.f12424h = a0Var;
        this.f12422f = abstractC1106p != null && abstractC1106p.e(p9);
        this.f12425i = z9;
        this.f12426j = iArr2;
        this.f12427k = i12;
        this.f12428l = i13;
        this.f12429m = v9;
        this.f12430n = d10;
        this.f12431o = m0Var;
        this.f12432p = abstractC1106p;
        this.f12421e = p9;
        this.f12433q = k9;
    }

    private boolean A(Object obj, int i10, int i11) {
        Map mapH = this.f12433q.h(p0.z(obj, R(i10)));
        if (mapH.isEmpty()) {
            return true;
        }
        if (this.f12433q.c(r(i11)).f12408c.d() != r0.c.MESSAGE) {
            return true;
        }
        f0 f0VarC = null;
        for (Object obj2 : mapH.values()) {
            if (f0VarC == null) {
                f0VarC = b0.a().c(obj2.getClass());
            }
            if (!f0VarC.d(obj2)) {
                return false;
            }
        }
        return true;
    }

    private static boolean B(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC1112w) {
            return ((AbstractC1112w) obj).C();
        }
        return true;
    }

    private boolean C(Object obj, Object obj2, int i10) {
        long jY = Y(i10) & 1048575;
        return p0.w(obj, jY) == p0.w(obj2, jY);
    }

    private boolean D(Object obj, int i10, int i11) {
        return p0.w(obj, (long) (Y(i11) & 1048575)) == i10;
    }

    private static boolean E(int i10) {
        return (i10 & 268435456) != 0;
    }

    private static long F(Object obj, long j9) {
        return p0.x(obj, j9);
    }

    /* JADX WARN: Code duplicated, block: B:231:0x06d5 A[Catch: all -> 0x06f6, TRY_LEAVE, TryCatch #9 {all -> 0x06f6, blocks: (B:229:0x06cf, B:231:0x06d5, B:242:0x06fa, B:243:0x06ff), top: B:274:0x06cf }] */
    /* JADX WARN: Code duplicated, block: B:236:0x06e2 A[LOOP:2: B:234:0x06de->B:236:0x06e2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:241:0x06f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:242:0x06fa A[Catch: all -> 0x06f6, TRY_ENTER, TryCatch #9 {all -> 0x06f6, blocks: (B:229:0x06cf, B:231:0x06d5, B:242:0x06fa, B:243:0x06ff), top: B:274:0x06cf }] */
    /* JADX WARN: Code duplicated, block: B:248:0x070d A[LOOP:3: B:246:0x0709->B:248:0x070d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:258:0x0730 A[LOOP:4: B:256:0x072c->B:258:0x0730, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:261:0x0743  */
    /* JADX WARN: Code duplicated, block: B:320:0x06db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:0x0706 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:337:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:339:? A[RETURN, SYNTHETIC] */
    private void G(m0 m0Var, AbstractC1106p abstractC1106p, Object obj, e0 e0Var, C1105o c1105o) throws Throwable {
        Object obj2;
        int i10;
        Object objO;
        m0 m0Var2;
        T t9;
        Object obj3;
        Object objF;
        m0 m0Var3;
        AbstractC1106p abstractC1106p2;
        Object objB;
        m0 m0Var4;
        int i11;
        Object objO2;
        int i12;
        e0 e0Var2;
        T t10;
        Object obj4;
        Object obj5;
        T t11 = this;
        C1105o c1105o2 = c1105o;
        C1108s c1108sD = null;
        Object objG = null;
        while (true) {
            try {
                int iY = e0Var.y();
                int iX = t11.X(iY);
                if (iX >= 0) {
                    obj3 = obj;
                    c1105o = c1105o2;
                    objF = objG;
                    m0Var3 = m0Var;
                    e0 e0Var3 = e0Var;
                    try {
                        int iK0 = t11.k0(iX);
                        try {
                            switch (j0(iK0)) {
                                case 0:
                                    p0.K(obj3, R(iK0), e0Var3.readDouble());
                                    t11.e0(obj3, iX);
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 1:
                                    p0.L(obj3, R(iK0), e0Var3.readFloat());
                                    t11.e0(obj3, iX);
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 2:
                                    p0.N(obj3, R(iK0), e0Var3.K());
                                    t11.e0(obj3, iX);
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 3:
                                    p0.N(obj3, R(iK0), e0Var3.b());
                                    t11.e0(obj3, iX);
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 4:
                                    p0.M(obj3, R(iK0), e0Var3.D());
                                    t11.e0(obj3, iX);
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 5:
                                    p0.N(obj3, R(iK0), e0Var3.c());
                                    t11.e0(obj3, iX);
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 6:
                                    p0.M(obj3, R(iK0), e0Var3.g());
                                    t11.e0(obj3, iX);
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 7:
                                    p0.E(obj3, R(iK0), e0Var3.h());
                                    t11.e0(obj3, iX);
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 8:
                                    t11.b0(obj3, iK0, e0Var3);
                                    t11.e0(obj3, iX);
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 9:
                                    P p9 = (P) t11.L(obj3, iX);
                                    e0Var3.n(p9, t11.s(iX), c1105o);
                                    t11.h0(obj3, iX, p9);
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 10:
                                    p0.O(obj3, R(iK0), e0Var3.B());
                                    t11.e0(obj3, iX);
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 11:
                                    p0.M(obj3, R(iK0), e0Var3.k());
                                    t11.e0(obj3, iX);
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 12:
                                    int iR = e0Var3.r();
                                    t11.q(iX);
                                    p0.M(obj3, R(iK0), iR);
                                    t11.e0(obj3, iX);
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 13:
                                    p0.M(obj3, R(iK0), e0Var3.G());
                                    t11.e0(obj3, iX);
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 14:
                                    p0.N(obj3, R(iK0), e0Var3.i());
                                    t11.e0(obj3, iX);
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 15:
                                    p0.M(obj3, R(iK0), e0Var3.u());
                                    t11.e0(obj3, iX);
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 16:
                                    p0.N(obj3, R(iK0), e0Var3.v());
                                    t11.e0(obj3, iX);
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 17:
                                    P p10 = (P) t11.L(obj3, iX);
                                    e0Var3.s(p10, t11.s(iX), c1105o);
                                    t11.h0(obj3, iX, p10);
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 18:
                                    e0Var3.I(t11.f12430n.c(obj3, R(iK0)));
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 19:
                                    e0Var3.C(t11.f12430n.c(obj3, R(iK0)));
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 20:
                                    e0Var3.l(t11.f12430n.c(obj3, R(iK0)));
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 21:
                                    e0Var3.j(t11.f12430n.c(obj3, R(iK0)));
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 22:
                                    e0Var3.o(t11.f12430n.c(obj3, R(iK0)));
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 23:
                                    e0Var3.M(t11.f12430n.c(obj3, R(iK0)));
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 24:
                                    e0Var3.t(t11.f12430n.c(obj3, R(iK0)));
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 25:
                                    e0Var3.w(t11.f12430n.c(obj3, R(iK0)));
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 26:
                                    t11.c0(obj3, iK0, e0Var3);
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 27:
                                    m0Var = m0Var3;
                                    obj2 = obj3;
                                    T t12 = t11;
                                    try {
                                        c1105o = c1105o;
                                        try {
                                            t11.a0(obj2, iK0, e0Var3, t12.s(iX), c1105o);
                                            objG = objF;
                                        } catch (C1115z.a unused) {
                                            objG = objF;
                                            try {
                                                if (m0Var.q(e0Var3)) {
                                                    if (objG == null) {
                                                        objG = m0Var.f(obj2);
                                                    }
                                                    if (!m0Var.m(objG, e0Var3, 0)) {
                                                        objO2 = objG;
                                                        for (i11 = t11.f12427k; i11 < t11.f12428l; i11++) {
                                                            objO2 = t11.o(obj2, t11.f12426j[i11], objO2, m0Var, obj);
                                                        }
                                                        if (objO2 == null) {
                                                            return;
                                                        }
                                                        m0Var.o(obj2, objO2);
                                                        return;
                                                    }
                                                } else if (!e0Var3.F()) {
                                                    objO2 = objG;
                                                    for (i12 = t11.f12427k; i12 < t11.f12428l; i12++) {
                                                        objO2 = t11.o(obj2, t11.f12426j[i12], objO2, m0Var, obj);
                                                    }
                                                    if (objO2 == null) {
                                                        return;
                                                    }
                                                    m0Var.o(obj2, objO2);
                                                    return;
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    } catch (C1115z.a unused2) {
                                        c1105o = c1105o;
                                        t11 = t12;
                                        e0Var3 = e0Var3;
                                    }
                                    c1105o2 = c1105o;
                                    break;
                                case 28:
                                    e0Var2 = e0Var3;
                                    t10 = t11;
                                    e0Var2.H(t10.f12430n.c(obj3, R(iK0)));
                                    t11 = t10;
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 29:
                                    e0Var2 = e0Var3;
                                    m0Var = m0Var3;
                                    obj2 = obj3;
                                    t10 = t11;
                                    try {
                                        try {
                                            e0Var2.f(t10.f12430n.c(obj2, R(iK0)));
                                            t11 = t10;
                                            objG = objF;
                                        } catch (C1115z.a unused3) {
                                            t11 = t10;
                                            objG = objF;
                                            e0Var3 = e0Var2;
                                            if (m0Var.q(e0Var3)) {
                                                if (objG == null) {
                                                    objG = m0Var.f(obj2);
                                                }
                                                if (!m0Var.m(objG, e0Var3, 0)) {
                                                    objO2 = objG;
                                                    while (i11 < t11.f12428l) {
                                                        objO2 = t11.o(obj2, t11.f12426j[i11], objO2, m0Var, obj);
                                                    }
                                                    if (objO2 == null) {
                                                        return;
                                                    }
                                                    m0Var.o(obj2, objO2);
                                                    return;
                                                }
                                            } else if (!e0Var3.F()) {
                                                objO2 = objG;
                                                while (i12 < t11.f12428l) {
                                                    objO2 = t11.o(obj2, t11.f12426j[i12], objO2, m0Var, obj);
                                                }
                                                if (objO2 == null) {
                                                    return;
                                                }
                                                m0Var.o(obj2, objO2);
                                                return;
                                            }
                                        }
                                        c1105o2 = c1105o;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        t11 = t10;
                                        objG = objF;
                                        i10 = t11.f12427k;
                                        objO = objG;
                                        while (i10 < t11.f12428l) {
                                            objO = t11.o(obj2, t11.f12426j[i10], objO, m0Var, obj);
                                            i10++;
                                            t11 = this;
                                        }
                                        m0Var2 = m0Var;
                                        if (objO != null) {
                                            m0Var2.o(obj2, objO);
                                        }
                                        throw th;
                                    }
                                    break;
                                case 30:
                                    t10 = t11;
                                    obj2 = obj3;
                                    e0Var2 = e0Var3;
                                    objG = objF;
                                    try {
                                        try {
                                            List listC = t10.f12430n.c(obj2, R(iK0));
                                            e0Var2.p(listC);
                                            try {
                                                t10.q(iX);
                                                obj4 = obj2;
                                                try {
                                                    objG = h0.z(obj4, iY, listC, null, objG, m0Var);
                                                    c1105o = c1105o;
                                                    t11 = t10;
                                                } catch (C1115z.a unused4) {
                                                    m0Var = m0Var;
                                                    obj2 = obj4;
                                                    t11 = t10;
                                                    e0Var3 = e0Var2;
                                                    if (m0Var.q(e0Var3)) {
                                                        if (objG == null) {
                                                            objG = m0Var.f(obj2);
                                                        }
                                                        if (!m0Var.m(objG, e0Var3, 0)) {
                                                            objO2 = objG;
                                                            while (i11 < t11.f12428l) {
                                                                objO2 = t11.o(obj2, t11.f12426j[i11], objO2, m0Var, obj);
                                                            }
                                                            if (objO2 == null) {
                                                                return;
                                                            }
                                                            m0Var.o(obj2, objO2);
                                                            return;
                                                        }
                                                    } else if (!e0Var3.F()) {
                                                        objO2 = objG;
                                                        while (i12 < t11.f12428l) {
                                                            objO2 = t11.o(obj2, t11.f12426j[i12], objO2, m0Var, obj);
                                                        }
                                                        if (objO2 == null) {
                                                            return;
                                                        }
                                                        m0Var.o(obj2, objO2);
                                                        return;
                                                    }
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    obj2 = obj4;
                                                    m0Var = m0Var;
                                                    t11 = t10;
                                                    i10 = t11.f12427k;
                                                    objO = objG;
                                                    while (i10 < t11.f12428l) {
                                                        objO = t11.o(obj2, t11.f12426j[i10], objO, m0Var, obj);
                                                        i10++;
                                                        t11 = this;
                                                    }
                                                    m0Var2 = m0Var;
                                                    if (objO != null) {
                                                        m0Var2.o(obj2, objO);
                                                    }
                                                    throw th;
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                                m0Var = m0Var;
                                                objF = objG;
                                                t11 = t10;
                                                objG = objF;
                                                i10 = t11.f12427k;
                                                objO = objG;
                                                while (i10 < t11.f12428l) {
                                                    objO = t11.o(obj2, t11.f12426j[i10], objO, m0Var, obj);
                                                    i10++;
                                                    t11 = this;
                                                }
                                                m0Var2 = m0Var;
                                                if (objO != null) {
                                                    m0Var2.o(obj2, objO);
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                            m0Var = m0Var;
                                        }
                                        break;
                                    } catch (C1115z.a unused5) {
                                        t11 = t10;
                                        e0Var3 = e0Var2;
                                        if (m0Var.q(e0Var3)) {
                                            if (objG == null) {
                                                objG = m0Var.f(obj2);
                                            }
                                            if (!m0Var.m(objG, e0Var3, 0)) {
                                                objO2 = objG;
                                                while (i11 < t11.f12428l) {
                                                    objO2 = t11.o(obj2, t11.f12426j[i11], objO2, m0Var, obj);
                                                }
                                                if (objO2 == null) {
                                                    return;
                                                }
                                                m0Var.o(obj2, objO2);
                                                return;
                                            }
                                        } else if (!e0Var3.F()) {
                                            objO2 = objG;
                                            while (i12 < t11.f12428l) {
                                                objO2 = t11.o(obj2, t11.f12426j[i12], objO2, m0Var, obj);
                                            }
                                            if (objO2 == null) {
                                                return;
                                            }
                                            m0Var.o(obj2, objO2);
                                            return;
                                        }
                                    }
                                    c1105o2 = c1105o;
                                    break;
                                case 31:
                                    e0Var2 = e0Var3;
                                    objG = objF;
                                    t10 = t11;
                                    e0Var2.d(t10.f12430n.c(obj3, R(iK0)));
                                    objF = objG;
                                    t11 = t10;
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 32:
                                    e0Var2 = e0Var3;
                                    objG = objF;
                                    t10 = t11;
                                    e0Var2.m(t10.f12430n.c(obj3, R(iK0)));
                                    objF = objG;
                                    t11 = t10;
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 33:
                                    e0Var2 = e0Var3;
                                    objG = objF;
                                    t10 = t11;
                                    e0Var2.a(t10.f12430n.c(obj3, R(iK0)));
                                    objF = objG;
                                    t11 = t10;
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 34:
                                    e0Var2 = e0Var3;
                                    objG = objF;
                                    t10 = t11;
                                    e0Var2.e(t10.f12430n.c(obj3, R(iK0)));
                                    objF = objG;
                                    t11 = t10;
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 35:
                                    e0Var2 = e0Var3;
                                    objG = objF;
                                    t10 = t11;
                                    e0Var2.I(t10.f12430n.c(obj3, R(iK0)));
                                    objF = objG;
                                    t11 = t10;
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 36:
                                    e0Var2 = e0Var3;
                                    objG = objF;
                                    t10 = t11;
                                    e0Var2.C(t10.f12430n.c(obj3, R(iK0)));
                                    objF = objG;
                                    t11 = t10;
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 37:
                                    e0Var2 = e0Var3;
                                    objG = objF;
                                    t10 = t11;
                                    e0Var2.l(t10.f12430n.c(obj3, R(iK0)));
                                    objF = objG;
                                    t11 = t10;
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 38:
                                    e0Var2 = e0Var3;
                                    objG = objF;
                                    t10 = t11;
                                    e0Var2.j(t10.f12430n.c(obj3, R(iK0)));
                                    objF = objG;
                                    t11 = t10;
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 39:
                                    e0Var2 = e0Var3;
                                    objG = objF;
                                    t10 = t11;
                                    e0Var2.o(t10.f12430n.c(obj3, R(iK0)));
                                    objF = objG;
                                    t11 = t10;
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 40:
                                    e0Var2 = e0Var3;
                                    objG = objF;
                                    t10 = t11;
                                    e0Var2.M(t10.f12430n.c(obj3, R(iK0)));
                                    objF = objG;
                                    t11 = t10;
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 41:
                                    e0Var2 = e0Var3;
                                    objG = objF;
                                    t10 = t11;
                                    e0Var2.t(t10.f12430n.c(obj3, R(iK0)));
                                    objF = objG;
                                    t11 = t10;
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 42:
                                    e0Var2 = e0Var3;
                                    objG = objF;
                                    t10 = t11;
                                    e0Var2.w(t10.f12430n.c(obj3, R(iK0)));
                                    objF = objG;
                                    t11 = t10;
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 43:
                                    e0Var2 = e0Var3;
                                    obj2 = obj3;
                                    objG = objF;
                                    t10 = t11;
                                    try {
                                        e0Var2.f(t10.f12430n.c(obj2, R(iK0)));
                                        objF = objG;
                                        t11 = t10;
                                        objG = objF;
                                    } catch (C1115z.a unused6) {
                                        t11 = t10;
                                        e0Var3 = e0Var2;
                                        if (m0Var.q(e0Var3)) {
                                            if (objG == null) {
                                                objG = m0Var.f(obj2);
                                            }
                                            if (!m0Var.m(objG, e0Var3, 0)) {
                                                objO2 = objG;
                                                while (i11 < t11.f12428l) {
                                                    objO2 = t11.o(obj2, t11.f12426j[i11], objO2, m0Var, obj);
                                                }
                                                if (objO2 == null) {
                                                    return;
                                                }
                                                m0Var.o(obj2, objO2);
                                                return;
                                            }
                                        } else if (!e0Var3.F()) {
                                            objO2 = objG;
                                            while (i12 < t11.f12428l) {
                                                objO2 = t11.o(obj2, t11.f12426j[i12], objO2, m0Var, obj);
                                            }
                                            if (objO2 == null) {
                                                return;
                                            }
                                            m0Var.o(obj2, objO2);
                                            return;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        m0Var = m0Var;
                                        t11 = t10;
                                        i10 = t11.f12427k;
                                        objO = objG;
                                        while (i10 < t11.f12428l) {
                                            objO = t11.o(obj2, t11.f12426j[i10], objO, m0Var, obj);
                                            i10++;
                                            t11 = this;
                                        }
                                        m0Var2 = m0Var;
                                        if (objO != null) {
                                            m0Var2.o(obj2, objO);
                                        }
                                        throw th;
                                    }
                                    c1105o2 = c1105o;
                                    break;
                                case 44:
                                    t10 = t11;
                                    obj4 = obj3;
                                    e0Var2 = e0Var3;
                                    try {
                                        List listC2 = t10.f12430n.c(obj4, R(iK0));
                                        e0Var2.p(listC2);
                                        t10.q(iX);
                                        objG = objF;
                                        try {
                                            objG = h0.z(obj4, iY, listC2, null, objG, m0Var3);
                                            c1105o = c1105o;
                                            t11 = t10;
                                        } catch (C1115z.a unused7) {
                                            m0Var = m0Var;
                                            obj2 = obj4;
                                            t11 = t10;
                                            e0Var3 = e0Var2;
                                            if (m0Var.q(e0Var3)) {
                                                if (objG == null) {
                                                    objG = m0Var.f(obj2);
                                                }
                                                if (!m0Var.m(objG, e0Var3, 0)) {
                                                    objO2 = objG;
                                                    while (i11 < t11.f12428l) {
                                                        objO2 = t11.o(obj2, t11.f12426j[i11], objO2, m0Var, obj);
                                                    }
                                                    if (objO2 == null) {
                                                        return;
                                                    }
                                                    m0Var.o(obj2, objO2);
                                                    return;
                                                }
                                            } else if (!e0Var3.F()) {
                                                objO2 = objG;
                                                while (i12 < t11.f12428l) {
                                                    objO2 = t11.o(obj2, t11.f12426j[i12], objO2, m0Var, obj);
                                                }
                                                if (objO2 == null) {
                                                    return;
                                                }
                                                m0Var.o(obj2, objO2);
                                                return;
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                            obj2 = obj4;
                                            m0Var = m0Var;
                                            t11 = t10;
                                            i10 = t11.f12427k;
                                            objO = objG;
                                            while (i10 < t11.f12428l) {
                                                objO = t11.o(obj2, t11.f12426j[i10], objO, m0Var, obj);
                                                i10++;
                                                t11 = this;
                                            }
                                            m0Var2 = m0Var;
                                            if (objO != null) {
                                                m0Var2.o(obj2, objO);
                                            }
                                            throw th;
                                        }
                                    } catch (C1115z.a unused8) {
                                        objG = objF;
                                    } catch (Throwable th9) {
                                        th = th9;
                                        obj2 = obj4;
                                        objG = objF;
                                    }
                                    c1105o2 = c1105o;
                                    break;
                                case 45:
                                    t10 = t11;
                                    obj5 = obj3;
                                    e0Var2 = e0Var3;
                                    e0Var2.d(t10.f12430n.c(obj5, R(iK0)));
                                    t11 = t10;
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 46:
                                    t10 = t11;
                                    obj5 = obj3;
                                    e0Var2 = e0Var3;
                                    e0Var2.m(t10.f12430n.c(obj5, R(iK0)));
                                    t11 = t10;
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 47:
                                    t10 = t11;
                                    obj5 = obj3;
                                    e0Var2 = e0Var3;
                                    e0Var2.a(t10.f12430n.c(obj5, R(iK0)));
                                    t11 = t10;
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 48:
                                    t10 = t11;
                                    obj5 = obj3;
                                    e0Var2 = e0Var3;
                                    m0Var = m0Var3;
                                    try {
                                        e0Var2.e(t10.f12430n.c(obj5, R(iK0)));
                                        t11 = t10;
                                        objG = objF;
                                    } catch (C1115z.a unused9) {
                                        obj2 = obj5;
                                        t11 = t10;
                                        objG = objF;
                                        e0Var3 = e0Var2;
                                        if (m0Var.q(e0Var3)) {
                                            if (objG == null) {
                                                objG = m0Var.f(obj2);
                                            }
                                            if (!m0Var.m(objG, e0Var3, 0)) {
                                                objO2 = objG;
                                                while (i11 < t11.f12428l) {
                                                    objO2 = t11.o(obj2, t11.f12426j[i11], objO2, m0Var, obj);
                                                }
                                                if (objO2 == null) {
                                                    return;
                                                }
                                                m0Var.o(obj2, objO2);
                                                return;
                                            }
                                        } else if (!e0Var3.F()) {
                                            objO2 = objG;
                                            while (i12 < t11.f12428l) {
                                                objO2 = t11.o(obj2, t11.f12426j[i12], objO2, m0Var, obj);
                                            }
                                            if (objO2 == null) {
                                                return;
                                            }
                                            m0Var.o(obj2, objO2);
                                            return;
                                        }
                                    } catch (Throwable th10) {
                                        th = th10;
                                        obj2 = obj5;
                                        t11 = t10;
                                        objG = objF;
                                        i10 = t11.f12427k;
                                        objO = objG;
                                        while (i10 < t11.f12428l) {
                                            objO = t11.o(obj2, t11.f12426j[i10], objO, m0Var, obj);
                                            i10++;
                                            t11 = this;
                                        }
                                        m0Var2 = m0Var;
                                        if (objO != null) {
                                            m0Var2.o(obj2, objO);
                                        }
                                        throw th;
                                    }
                                    c1105o2 = c1105o;
                                    break;
                                case 49:
                                    m0Var = m0Var3;
                                    try {
                                        obj2 = obj;
                                        try {
                                            t11.Z(obj2, R(iK0), e0Var, t11.s(iX), c1105o);
                                            t10 = t11;
                                            obj5 = obj2;
                                            e0Var2 = e0Var;
                                            t11 = t10;
                                            objG = objF;
                                        } catch (C1115z.a unused10) {
                                            c1105o = c1105o;
                                            e0Var3 = e0Var;
                                            objG = objF;
                                            if (m0Var.q(e0Var3)) {
                                                if (objG == null) {
                                                    objG = m0Var.f(obj2);
                                                }
                                                if (!m0Var.m(objG, e0Var3, 0)) {
                                                    objO2 = objG;
                                                    while (i11 < t11.f12428l) {
                                                        objO2 = t11.o(obj2, t11.f12426j[i11], objO2, m0Var, obj);
                                                    }
                                                    if (objO2 == null) {
                                                        return;
                                                    }
                                                    m0Var.o(obj2, objO2);
                                                    return;
                                                }
                                            } else if (!e0Var3.F()) {
                                                objO2 = objG;
                                                while (i12 < t11.f12428l) {
                                                    objO2 = t11.o(obj2, t11.f12426j[i12], objO2, m0Var, obj);
                                                }
                                                if (objO2 == null) {
                                                    return;
                                                }
                                                m0Var.o(obj2, objO2);
                                                return;
                                            }
                                        } catch (Throwable th11) {
                                            th = th11;
                                            t10 = t11;
                                            t11 = t10;
                                            objG = objF;
                                            i10 = t11.f12427k;
                                            objO = objG;
                                            while (i10 < t11.f12428l) {
                                                objO = t11.o(obj2, t11.f12426j[i10], objO, m0Var, obj);
                                                i10++;
                                                t11 = this;
                                            }
                                            m0Var2 = m0Var;
                                            if (objO != null) {
                                                m0Var2.o(obj2, objO);
                                            }
                                            throw th;
                                        }
                                        c1105o2 = c1105o;
                                    } catch (Throwable th12) {
                                        th = th12;
                                        t10 = t11;
                                        obj5 = obj;
                                        obj2 = obj5;
                                        t11 = t10;
                                        objG = objF;
                                        i10 = t11.f12427k;
                                        objO = objG;
                                        while (i10 < t11.f12428l) {
                                            objO = t11.o(obj2, t11.f12426j[i10], objO, m0Var, obj);
                                            i10++;
                                            t11 = this;
                                        }
                                        m0Var2 = m0Var;
                                        if (objO != null) {
                                            m0Var2.o(obj2, objO);
                                        }
                                        throw th;
                                    }
                                    break;
                                case 50:
                                    m0Var = m0Var3;
                                    try {
                                        try {
                                            t11.H(obj3, iX, t11.r(iX), c1105o, e0Var);
                                            c1105o = c1105o;
                                            objG = objF;
                                        } catch (C1115z.a unused11) {
                                            obj2 = obj;
                                            e0Var3 = e0Var;
                                            c1105o = c1105o;
                                            objG = objF;
                                            if (m0Var.q(e0Var3)) {
                                                if (objG == null) {
                                                    objG = m0Var.f(obj2);
                                                }
                                                if (!m0Var.m(objG, e0Var3, 0)) {
                                                    objO2 = objG;
                                                    while (i11 < t11.f12428l) {
                                                        objO2 = t11.o(obj2, t11.f12426j[i11], objO2, m0Var, obj);
                                                    }
                                                    if (objO2 == null) {
                                                        return;
                                                    }
                                                    m0Var.o(obj2, objO2);
                                                    return;
                                                }
                                            } else if (!e0Var3.F()) {
                                                objO2 = objG;
                                                while (i12 < t11.f12428l) {
                                                    objO2 = t11.o(obj2, t11.f12426j[i12], objO2, m0Var, obj);
                                                }
                                                if (objO2 == null) {
                                                    return;
                                                }
                                                m0Var.o(obj2, objO2);
                                                return;
                                            }
                                        }
                                        c1105o2 = c1105o;
                                    } catch (Throwable th13) {
                                        th = th13;
                                        obj2 = obj;
                                    }
                                    break;
                                case 51:
                                    p0.O(obj3, R(iK0), Double.valueOf(e0Var3.readDouble()));
                                    t11.f0(obj3, iY, iX);
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 52:
                                    p0.O(obj3, R(iK0), Float.valueOf(e0Var3.readFloat()));
                                    t11.f0(obj3, iY, iX);
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 53:
                                    p0.O(obj3, R(iK0), Long.valueOf(e0Var3.K()));
                                    t11.f0(obj3, iY, iX);
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 54:
                                    p0.O(obj3, R(iK0), Long.valueOf(e0Var3.b()));
                                    t11.f0(obj3, iY, iX);
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 55:
                                    p0.O(obj3, R(iK0), Integer.valueOf(e0Var3.D()));
                                    t11.f0(obj3, iY, iX);
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 56:
                                    p0.O(obj3, R(iK0), Long.valueOf(e0Var3.c()));
                                    t11.f0(obj3, iY, iX);
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 57:
                                    p0.O(obj3, R(iK0), Integer.valueOf(e0Var3.g()));
                                    t11.f0(obj3, iY, iX);
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 58:
                                    p0.O(obj3, R(iK0), Boolean.valueOf(e0Var3.h()));
                                    t11.f0(obj3, iY, iX);
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 59:
                                    t11.b0(obj3, iK0, e0Var3);
                                    t11.f0(obj3, iY, iX);
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 60:
                                    P p11 = (P) t11.M(obj3, iY, iX);
                                    e0Var3.n(p11, t11.s(iX), c1105o);
                                    t11.i0(obj3, iY, iX, p11);
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 61:
                                    p0.O(obj3, R(iK0), e0Var3.B());
                                    t11.f0(obj3, iY, iX);
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 62:
                                    p0.O(obj3, R(iK0), Integer.valueOf(e0Var3.k()));
                                    t11.f0(obj3, iY, iX);
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 63:
                                    int iR2 = e0Var3.r();
                                    t11.q(iX);
                                    p0.O(obj3, R(iK0), Integer.valueOf(iR2));
                                    t11.f0(obj3, iY, iX);
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 64:
                                    p0.O(obj3, R(iK0), Integer.valueOf(e0Var3.G()));
                                    t11.f0(obj3, iY, iX);
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 65:
                                    p0.O(obj3, R(iK0), Long.valueOf(e0Var3.i()));
                                    t11.f0(obj3, iY, iX);
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 66:
                                    p0.O(obj3, R(iK0), Integer.valueOf(e0Var3.u()));
                                    t11.f0(obj3, iY, iX);
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 67:
                                    p0.O(obj3, R(iK0), Long.valueOf(e0Var3.v()));
                                    t11.f0(obj3, iY, iX);
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                case 68:
                                    m0Var = m0Var3;
                                    try {
                                        P p12 = (P) t11.M(obj3, iY, iX);
                                        e0Var3.s(p12, t11.s(iX), c1105o);
                                        t11.i0(obj3, iY, iX, p12);
                                        objG = objF;
                                    } catch (C1115z.a unused12) {
                                        obj2 = obj3;
                                        objG = objF;
                                        if (m0Var.q(e0Var3)) {
                                            if (objG == null) {
                                                objG = m0Var.f(obj2);
                                            }
                                            if (!m0Var.m(objG, e0Var3, 0)) {
                                                objO2 = objG;
                                                while (i11 < t11.f12428l) {
                                                    objO2 = t11.o(obj2, t11.f12426j[i11], objO2, m0Var, obj);
                                                }
                                                if (objO2 == null) {
                                                    return;
                                                }
                                                m0Var.o(obj2, objO2);
                                                return;
                                            }
                                        } else if (!e0Var3.F()) {
                                            objO2 = objG;
                                            while (i12 < t11.f12428l) {
                                                objO2 = t11.o(obj2, t11.f12426j[i12], objO2, m0Var, obj);
                                            }
                                            if (objO2 == null) {
                                                return;
                                            }
                                            m0Var.o(obj2, objO2);
                                            return;
                                        }
                                    } catch (Throwable th14) {
                                        th = th14;
                                        obj2 = obj3;
                                        objG = objF;
                                        i10 = t11.f12427k;
                                        objO = objG;
                                        while (i10 < t11.f12428l) {
                                            objO = t11.o(obj2, t11.f12426j[i10], objO, m0Var, obj);
                                            i10++;
                                            t11 = this;
                                        }
                                        m0Var2 = m0Var;
                                        if (objO != null) {
                                            m0Var2.o(obj2, objO);
                                        }
                                        throw th;
                                    }
                                    c1105o2 = c1105o;
                                    break;
                                default:
                                    if (objF == null) {
                                        objF = m0Var3.f(obj3);
                                    }
                                    if (!m0Var3.m(objF, e0Var3, 0)) {
                                        Object objO3 = objF;
                                        for (int i13 = t11.f12427k; i13 < t11.f12428l; i13++) {
                                            objO3 = t11.o(obj3, t11.f12426j[i13], objO3, m0Var3, obj);
                                        }
                                        if (objO3 != null) {
                                            m0Var3.o(obj3, objO3);
                                            return;
                                        }
                                        return;
                                    }
                                    objG = objF;
                                    c1105o2 = c1105o;
                                    break;
                                    break;
                            }
                        } catch (C1115z.a unused13) {
                            m0Var = m0Var3;
                        }
                    } catch (Throwable th15) {
                        th = th15;
                        m0Var = m0Var3;
                        obj2 = obj3;
                        objG = objF;
                        i10 = t11.f12427k;
                        objO = objG;
                        while (i10 < t11.f12428l) {
                            objO = t11.o(obj2, t11.f12426j[i10], objO, m0Var, obj);
                            i10++;
                            t11 = this;
                        }
                        m0Var2 = m0Var;
                        if (objO != null) {
                            m0Var2.o(obj2, objO);
                        }
                        throw th;
                    }
                } else {
                    if (iY == Integer.MAX_VALUE) {
                        int i14 = t11.f12427k;
                        Object objO4 = objG;
                        while (i14 < t11.f12428l) {
                            objO4 = t11.o(obj, t11.f12426j[i14], objO4, m0Var, obj);
                            i14++;
                            t11 = t11;
                        }
                        if (objO4 != null) {
                            m0Var.o(obj, objO4);
                            return;
                        }
                        return;
                    }
                    t9 = t11;
                    try {
                        if (t9.f12422f) {
                            abstractC1106p2 = abstractC1106p;
                            objB = abstractC1106p2.b(c1105o2, t9.f12421e, iY);
                        } else {
                            abstractC1106p2 = abstractC1106p;
                            objB = null;
                        }
                        if (objB != null) {
                            if (c1108sD == null) {
                                try {
                                    c1108sD = abstractC1106p.d(obj);
                                } catch (Throwable th16) {
                                    th = th16;
                                    obj2 = obj;
                                    m0Var = m0Var;
                                    t11 = t9;
                                }
                            }
                            Object obj6 = objG;
                            C1108s c1108s = c1108sD;
                            try {
                                c1108sD = c1108s;
                                objG = abstractC1106p2.g(obj, e0Var, objB, c1105o2, c1108s, obj6, m0Var);
                                c1105o2 = c1105o2;
                                t11 = t9;
                            } catch (Throwable th17) {
                                th = th17;
                                obj2 = obj;
                                objF = obj6;
                                m0Var4 = m0Var;
                                m0Var = m0Var4;
                                t11 = t9;
                                objG = objF;
                                i10 = t11.f12427k;
                                objO = objG;
                                while (i10 < t11.f12428l) {
                                    objO = t11.o(obj2, t11.f12426j[i10], objO, m0Var, obj);
                                    i10++;
                                    t11 = this;
                                }
                                m0Var2 = m0Var;
                                if (objO != null) {
                                    m0Var2.o(obj2, objO);
                                }
                                throw th;
                            }
                        } else {
                            obj2 = obj;
                            objF = objG;
                            m0Var4 = m0Var;
                            C1105o c1105o3 = c1105o2;
                            try {
                                if (m0Var4.q(e0Var)) {
                                    try {
                                        if (!e0Var.F()) {
                                        }
                                        c1105o2 = c1105o3;
                                        t11 = t9;
                                        objG = objF;
                                    } catch (Throwable th18) {
                                        th = th18;
                                        m0Var = m0Var4;
                                        t11 = t9;
                                        objG = objF;
                                        i10 = t11.f12427k;
                                        objO = objG;
                                        while (i10 < t11.f12428l) {
                                            objO = t11.o(obj2, t11.f12426j[i10], objO, m0Var, obj);
                                            i10++;
                                            t11 = this;
                                        }
                                        m0Var2 = m0Var;
                                        if (objO != null) {
                                            m0Var2.o(obj2, objO);
                                        }
                                        throw th;
                                    }
                                } else {
                                    if (objF == null) {
                                        objF = m0Var4.f(obj2);
                                    }
                                    if (!m0Var4.m(objF, e0Var, 0)) {
                                    }
                                    c1105o2 = c1105o3;
                                    t11 = t9;
                                    objG = objF;
                                }
                            } catch (Throwable th19) {
                                th = th19;
                                t11 = t9;
                                m0Var = m0Var4;
                            }
                        }
                    } catch (Throwable th20) {
                        th = th20;
                        obj3 = obj;
                        objF = objG;
                        m0Var3 = m0Var;
                        t11 = t9;
                        m0Var = m0Var3;
                        obj2 = obj3;
                    }
                }
                objG = objF;
            } catch (Throwable th21) {
                th = th21;
                m0Var = m0Var;
                obj2 = obj;
            }
            i10 = t11.f12427k;
            objO = objG;
            while (i10 < t11.f12428l) {
                objO = t11.o(obj2, t11.f12426j[i10], objO, m0Var, obj);
                i10++;
                t11 = this;
            }
            m0Var2 = m0Var;
            if (objO != null) {
                m0Var2.o(obj2, objO);
            }
            throw th;
        }
        Object objO5 = objF;
        for (int i15 = t9.f12427k; i15 < t9.f12428l; i15++) {
            objO5 = t9.o(obj2, t9.f12426j[i15], objO5, m0Var4, obj);
        }
        if (objO5 != null) {
            m0Var4.o(obj2, objO5);
        }
    }

    private final void H(Object obj, int i10, Object obj2, C1105o c1105o, e0 e0Var) {
        long jR = R(k0(i10));
        Object objZ = p0.z(obj, jR);
        if (objZ == null) {
            objZ = this.f12433q.e(obj2);
            p0.O(obj, jR, objZ);
        } else if (this.f12433q.g(objZ)) {
            Object objE = this.f12433q.e(obj2);
            this.f12433q.a(objE, objZ);
            p0.O(obj, jR, objE);
            objZ = objE;
        }
        e0Var.q(this.f12433q.d(objZ), this.f12433q.c(obj2), c1105o);
    }

    private void I(Object obj, Object obj2, int i10) {
        if (w(obj2, i10)) {
            long jR = R(k0(i10));
            Unsafe unsafe = f12416s;
            Object object = unsafe.getObject(obj2, jR);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + Q(i10) + " is present but null: " + obj2);
            }
            f0 f0VarS = s(i10);
            if (!w(obj, i10)) {
                if (B(object)) {
                    Object objH = f0VarS.h();
                    f0VarS.a(objH, object);
                    unsafe.putObject(obj, jR, objH);
                } else {
                    unsafe.putObject(obj, jR, object);
                }
                e0(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, jR);
            if (!B(object2)) {
                Object objH2 = f0VarS.h();
                f0VarS.a(objH2, object2);
                unsafe.putObject(obj, jR, objH2);
                object2 = objH2;
            }
            f0VarS.a(object2, object);
        }
    }

    private void J(Object obj, Object obj2, int i10) {
        int iQ = Q(i10);
        if (D(obj2, iQ, i10)) {
            long jR = R(k0(i10));
            Unsafe unsafe = f12416s;
            Object object = unsafe.getObject(obj2, jR);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + Q(i10) + " is present but null: " + obj2);
            }
            f0 f0VarS = s(i10);
            if (!D(obj, iQ, i10)) {
                if (B(object)) {
                    Object objH = f0VarS.h();
                    f0VarS.a(objH, object);
                    unsafe.putObject(obj, jR, objH);
                } else {
                    unsafe.putObject(obj, jR, object);
                }
                f0(obj, iQ, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, jR);
            if (!B(object2)) {
                Object objH2 = f0VarS.h();
                f0VarS.a(objH2, object2);
                unsafe.putObject(obj, jR, objH2);
                object2 = objH2;
            }
            f0VarS.a(object2, object);
        }
    }

    private void K(Object obj, Object obj2, int i10) {
        int iK0 = k0(i10);
        long jR = R(iK0);
        int iQ = Q(i10);
        switch (j0(iK0)) {
            case 0:
                if (w(obj2, i10)) {
                    p0.K(obj, jR, p0.u(obj2, jR));
                    e0(obj, i10);
                }
                break;
            case 1:
                if (w(obj2, i10)) {
                    p0.L(obj, jR, p0.v(obj2, jR));
                    e0(obj, i10);
                }
                break;
            case 2:
                if (w(obj2, i10)) {
                    p0.N(obj, jR, p0.x(obj2, jR));
                    e0(obj, i10);
                }
                break;
            case 3:
                if (w(obj2, i10)) {
                    p0.N(obj, jR, p0.x(obj2, jR));
                    e0(obj, i10);
                }
                break;
            case 4:
                if (w(obj2, i10)) {
                    p0.M(obj, jR, p0.w(obj2, jR));
                    e0(obj, i10);
                }
                break;
            case 5:
                if (w(obj2, i10)) {
                    p0.N(obj, jR, p0.x(obj2, jR));
                    e0(obj, i10);
                }
                break;
            case 6:
                if (w(obj2, i10)) {
                    p0.M(obj, jR, p0.w(obj2, jR));
                    e0(obj, i10);
                }
                break;
            case 7:
                if (w(obj2, i10)) {
                    p0.E(obj, jR, p0.p(obj2, jR));
                    e0(obj, i10);
                }
                break;
            case 8:
                if (w(obj2, i10)) {
                    p0.O(obj, jR, p0.z(obj2, jR));
                    e0(obj, i10);
                }
                break;
            case 9:
                I(obj, obj2, i10);
                break;
            case 10:
                if (w(obj2, i10)) {
                    p0.O(obj, jR, p0.z(obj2, jR));
                    e0(obj, i10);
                }
                break;
            case 11:
                if (w(obj2, i10)) {
                    p0.M(obj, jR, p0.w(obj2, jR));
                    e0(obj, i10);
                }
                break;
            case 12:
                if (w(obj2, i10)) {
                    p0.M(obj, jR, p0.w(obj2, jR));
                    e0(obj, i10);
                }
                break;
            case 13:
                if (w(obj2, i10)) {
                    p0.M(obj, jR, p0.w(obj2, jR));
                    e0(obj, i10);
                }
                break;
            case 14:
                if (w(obj2, i10)) {
                    p0.N(obj, jR, p0.x(obj2, jR));
                    e0(obj, i10);
                }
                break;
            case 15:
                if (w(obj2, i10)) {
                    p0.M(obj, jR, p0.w(obj2, jR));
                    e0(obj, i10);
                }
                break;
            case 16:
                if (w(obj2, i10)) {
                    p0.N(obj, jR, p0.x(obj2, jR));
                    e0(obj, i10);
                }
                break;
            case 17:
                I(obj, obj2, i10);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f12430n.a(obj, obj2, jR);
                break;
            case 50:
                h0.E(this.f12433q, obj, obj2, jR);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (D(obj2, iQ, i10)) {
                    p0.O(obj, jR, p0.z(obj2, jR));
                    f0(obj, iQ, i10);
                }
                break;
            case 60:
                J(obj, obj2, i10);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (D(obj2, iQ, i10)) {
                    p0.O(obj, jR, p0.z(obj2, jR));
                    f0(obj, iQ, i10);
                }
                break;
            case 68:
                J(obj, obj2, i10);
                break;
        }
    }

    private Object L(Object obj, int i10) {
        f0 f0VarS = s(i10);
        long jR = R(k0(i10));
        if (!w(obj, i10)) {
            return f0VarS.h();
        }
        Object object = f12416s.getObject(obj, jR);
        if (B(object)) {
            return object;
        }
        Object objH = f0VarS.h();
        if (object != null) {
            f0VarS.a(objH, object);
        }
        return objH;
    }

    private Object M(Object obj, int i10, int i11) {
        f0 f0VarS = s(i11);
        if (!D(obj, i10, i11)) {
            return f0VarS.h();
        }
        Object object = f12416s.getObject(obj, R(k0(i11)));
        if (B(object)) {
            return object;
        }
        Object objH = f0VarS.h();
        if (object != null) {
            f0VarS.a(objH, object);
        }
        return objH;
    }

    static T N(Class cls, N n9, V v9, D d10, m0 m0Var, AbstractC1106p abstractC1106p, K k9) {
        if (n9 instanceof d0) {
            return P((d0) n9, v9, d10, m0Var, abstractC1106p, k9);
        }
        androidx.appcompat.app.o.a(n9);
        return O(null, v9, d10, m0Var, abstractC1106p, k9);
    }

    static T O(j0 j0Var, V v9, D d10, m0 m0Var, AbstractC1106p abstractC1106p, K k9) {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0251  */
    /* JADX WARN: Code duplicated, block: B:122:0x0254  */
    /* JADX WARN: Code duplicated, block: B:125:0x026b  */
    /* JADX WARN: Code duplicated, block: B:126:0x026e  */
    /* JADX WARN: Code duplicated, block: B:163:0x0326  */
    /* JADX WARN: Code duplicated, block: B:180:0x0375  */
    /* JADX WARN: Code duplicated, block: B:183:0x0383  */
    static T P(d0 d0Var, V v9, D d10, m0 m0Var, AbstractC1106p abstractC1106p, K k9) {
        int i10;
        int iCharAt;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr;
        int i15;
        int i16;
        int i17;
        char cCharAt;
        int i18;
        char cCharAt2;
        int i19;
        char cCharAt3;
        int i20;
        char cCharAt4;
        int i21;
        char cCharAt5;
        int i22;
        char cCharAt6;
        int i23;
        char cCharAt7;
        int i24;
        char cCharAt8;
        int i25;
        int i26;
        int i27;
        int i28;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i29;
        int i30;
        int iObjectFieldOffset3;
        int i31;
        Field fieldD0;
        char cCharAt9;
        int i32;
        int i33;
        int i34;
        Object obj;
        Field fieldD1;
        int i35;
        Object obj2;
        Field fieldD2;
        int i36;
        char cCharAt10;
        int i37;
        char cCharAt11;
        int i38;
        char cCharAt12;
        int i39;
        char cCharAt13;
        String strE = d0Var.e();
        int length = strE.length();
        char c10 = 55296;
        if (strE.charAt(0) >= 55296) {
            int i40 = 1;
            while (true) {
                i10 = i40 + 1;
                if (strE.charAt(i40) < 55296) {
                    break;
                }
                i40 = i10;
            }
        } else {
            i10 = 1;
        }
        int i41 = i10 + 1;
        int iCharAt2 = strE.charAt(i10);
        if (iCharAt2 >= 55296) {
            int i42 = iCharAt2 & 8191;
            int i43 = 13;
            while (true) {
                i39 = i41 + 1;
                cCharAt13 = strE.charAt(i41);
                if (cCharAt13 < 55296) {
                    break;
                }
                i42 |= (cCharAt13 & 8191) << i43;
                i43 += 13;
                i41 = i39;
            }
            iCharAt2 = i42 | (cCharAt13 << i43);
            i41 = i39;
        }
        if (iCharAt2 == 0) {
            i13 = 0;
            iCharAt = 0;
            i12 = 0;
            i16 = 0;
            i11 = 0;
            i15 = 0;
            iArr = f12415r;
            i14 = 0;
        } else {
            int i44 = i41 + 1;
            int iCharAt3 = strE.charAt(i41);
            if (iCharAt3 >= 55296) {
                int i45 = iCharAt3 & 8191;
                int i46 = 13;
                while (true) {
                    i24 = i44 + 1;
                    cCharAt8 = strE.charAt(i44);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt8 & 8191) << i46;
                    i46 += 13;
                    i44 = i24;
                }
                iCharAt3 = i45 | (cCharAt8 << i46);
                i44 = i24;
            }
            int i47 = i44 + 1;
            int iCharAt4 = strE.charAt(i44);
            if (iCharAt4 >= 55296) {
                int i48 = iCharAt4 & 8191;
                int i49 = 13;
                while (true) {
                    i23 = i47 + 1;
                    cCharAt7 = strE.charAt(i47);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt7 & 8191) << i49;
                    i49 += 13;
                    i47 = i23;
                }
                iCharAt4 = i48 | (cCharAt7 << i49);
                i47 = i23;
            }
            int i50 = i47 + 1;
            int iCharAt5 = strE.charAt(i47);
            if (iCharAt5 >= 55296) {
                int i51 = iCharAt5 & 8191;
                int i52 = 13;
                while (true) {
                    i22 = i50 + 1;
                    cCharAt6 = strE.charAt(i50);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt6 & 8191) << i52;
                    i52 += 13;
                    i50 = i22;
                }
                iCharAt5 = i51 | (cCharAt6 << i52);
                i50 = i22;
            }
            int i53 = i50 + 1;
            int iCharAt6 = strE.charAt(i50);
            if (iCharAt6 >= 55296) {
                int i54 = iCharAt6 & 8191;
                int i55 = 13;
                while (true) {
                    i21 = i53 + 1;
                    cCharAt5 = strE.charAt(i53);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt5 & 8191) << i55;
                    i55 += 13;
                    i53 = i21;
                }
                iCharAt6 = i54 | (cCharAt5 << i55);
                i53 = i21;
            }
            int i56 = i53 + 1;
            iCharAt = strE.charAt(i53);
            if (iCharAt >= 55296) {
                int i57 = iCharAt & 8191;
                int i58 = 13;
                while (true) {
                    i20 = i56 + 1;
                    cCharAt4 = strE.charAt(i56);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt4 & 8191) << i58;
                    i58 += 13;
                    i56 = i20;
                }
                iCharAt = i57 | (cCharAt4 << i58);
                i56 = i20;
            }
            int i59 = i56 + 1;
            int iCharAt7 = strE.charAt(i56);
            if (iCharAt7 >= 55296) {
                int i60 = iCharAt7 & 8191;
                int i61 = 13;
                while (true) {
                    i19 = i59 + 1;
                    cCharAt3 = strE.charAt(i59);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i60 |= (cCharAt3 & 8191) << i61;
                    i61 += 13;
                    i59 = i19;
                }
                iCharAt7 = i60 | (cCharAt3 << i61);
                i59 = i19;
            }
            int i62 = i59 + 1;
            int iCharAt8 = strE.charAt(i59);
            if (iCharAt8 >= 55296) {
                int i63 = iCharAt8 & 8191;
                int i64 = 13;
                while (true) {
                    i18 = i62 + 1;
                    cCharAt2 = strE.charAt(i62);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i63 |= (cCharAt2 & 8191) << i64;
                    i64 += 13;
                    i62 = i18;
                }
                iCharAt8 = i63 | (cCharAt2 << i64);
                i62 = i18;
            }
            int i65 = i62 + 1;
            int iCharAt9 = strE.charAt(i62);
            if (iCharAt9 >= 55296) {
                int i66 = iCharAt9 & 8191;
                int i67 = 13;
                while (true) {
                    i17 = i65 + 1;
                    cCharAt = strE.charAt(i65);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i66 |= (cCharAt & 8191) << i67;
                    i67 += 13;
                    i65 = i17;
                }
                iCharAt9 = i66 | (cCharAt << i67);
                i65 = i17;
            }
            int[] iArr2 = new int[iCharAt9 + iCharAt7 + iCharAt8];
            i11 = (iCharAt3 * 2) + iCharAt4;
            int i68 = iCharAt7;
            i12 = iCharAt5;
            i13 = i68;
            i14 = iCharAt3;
            iArr = iArr2;
            i15 = iCharAt9;
            i41 = i65;
            i16 = iCharAt6;
        }
        Unsafe unsafe = f12416s;
        Object[] objArrD = d0Var.d();
        Class<?> cls = d0Var.b().getClass();
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[iCharAt * 2];
        int i69 = i15 + i13;
        int i70 = i69;
        int i71 = i15;
        int i72 = 0;
        int i73 = 0;
        while (i41 < length) {
            int i74 = i41 + 1;
            int iCharAt10 = strE.charAt(i41);
            if (iCharAt10 >= c10) {
                int i75 = iCharAt10 & 8191;
                int i76 = i74;
                int i77 = 13;
                while (true) {
                    i38 = i76 + 1;
                    cCharAt12 = strE.charAt(i76);
                    if (cCharAt12 < c10) {
                        break;
                    }
                    i75 |= (cCharAt12 & 8191) << i77;
                    i77 += 13;
                    i76 = i38;
                }
                iCharAt10 = i75 | (cCharAt12 << i77);
                i25 = i38;
            } else {
                i25 = i74;
            }
            int i78 = i25 + 1;
            int iCharAt11 = strE.charAt(i25);
            if (iCharAt11 >= c10) {
                int i79 = iCharAt11 & 8191;
                int i80 = i78;
                int i81 = 13;
                while (true) {
                    i37 = i80 + 1;
                    cCharAt11 = strE.charAt(i80);
                    if (cCharAt11 < c10) {
                        break;
                    }
                    i79 |= (cCharAt11 & 8191) << i81;
                    i81 += 13;
                    i80 = i37;
                }
                iCharAt11 = i79 | (cCharAt11 << i81);
                i26 = i37;
            } else {
                i26 = i78;
            }
            int i82 = iCharAt11 & 255;
            int i83 = length;
            if ((iCharAt11 & Optimizer.OPTIMIZATION_GROUPING) != 0) {
                iArr[i72] = i73;
                i72++;
            }
            int[] iArr4 = iArr3;
            if (i82 >= 51) {
                int i84 = i26 + 1;
                int iCharAt12 = strE.charAt(i26);
                char c11 = 55296;
                if (iCharAt12 >= 55296) {
                    int i85 = iCharAt12 & 8191;
                    int i86 = 13;
                    while (true) {
                        i36 = i84 + 1;
                        cCharAt10 = strE.charAt(i84);
                        if (cCharAt10 < c11) {
                            break;
                        }
                        i85 |= (cCharAt10 & 8191) << i86;
                        i86 += 13;
                        i84 = i36;
                        c11 = 55296;
                    }
                    iCharAt12 = i85 | (cCharAt10 << i86);
                    i84 = i36;
                }
                int i87 = i82 - 51;
                int i88 = i84;
                if (i87 == 9 || i87 == 17) {
                    i33 = i11 + 1;
                    objArr[((i73 / 3) * 2) + 1] = objArrD[i11];
                } else {
                    if (i87 == 12 && (d0Var.c().equals(a0.PROTO2) || (iCharAt11 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0)) {
                        i33 = i11 + 1;
                        objArr[((i73 / 3) * 2) + 1] = objArrD[i11];
                    }
                    i34 = iCharAt12 * 2;
                    obj = objArrD[i34];
                    if (obj instanceof Field) {
                        fieldD1 = (Field) obj;
                    } else {
                        fieldD1 = d0(cls, (String) obj);
                        objArrD[i34] = fieldD1;
                    }
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldD1);
                    i35 = i34 + 1;
                    obj2 = objArrD[i35];
                    if (obj2 instanceof Field) {
                        fieldD2 = (Field) obj2;
                    } else {
                        fieldD2 = d0(cls, (String) obj2);
                        objArrD[i35] = fieldD2;
                    }
                    strE = strE;
                    iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldD2);
                    i31 = iObjectFieldOffset4;
                    i30 = 0;
                    i27 = iCharAt10;
                    i41 = i88;
                }
                i11 = i33;
                i34 = iCharAt12 * 2;
                obj = objArrD[i34];
                if (obj instanceof Field) {
                    fieldD1 = (Field) obj;
                } else {
                    fieldD1 = d0(cls, (String) obj);
                    objArrD[i34] = fieldD1;
                }
                int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldD1);
                i35 = i34 + 1;
                obj2 = objArrD[i35];
                if (obj2 instanceof Field) {
                    fieldD2 = (Field) obj2;
                } else {
                    fieldD2 = d0(cls, (String) obj2);
                    objArrD[i35] = fieldD2;
                }
                strE = strE;
                iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldD2);
                i31 = iObjectFieldOffset5;
                i30 = 0;
                i27 = iCharAt10;
                i41 = i88;
            } else {
                int i89 = i11 + 1;
                Field fieldD3 = d0(cls, (String) objArrD[i11]);
                if (i82 == 9 || i82 == 17) {
                    i27 = iCharAt10;
                    objArr[((i73 / 3) * 2) + 1] = fieldD3.getType();
                } else {
                    if (i82 == 27 || i82 == 49) {
                        i27 = iCharAt10;
                        i32 = i11 + 2;
                        objArr[((i73 / 3) * 2) + 1] = objArrD[i89];
                    } else if (i82 == 12 || i82 == 30 || i82 == 44) {
                        i27 = iCharAt10;
                        if (d0Var.c() == a0.PROTO2 || (iCharAt11 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0) {
                            i32 = i11 + 2;
                            objArr[((i73 / 3) * 2) + 1] = objArrD[i89];
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldD3);
                        if ((iCharAt11 & 4096) != 0 || i82 > 17) {
                            iObjectFieldOffset2 = 1048575;
                            i29 = i26;
                            i30 = 0;
                        } else {
                            int i90 = i26 + 1;
                            int iCharAt13 = strE.charAt(i26);
                            if (iCharAt13 >= 55296) {
                                int i91 = iCharAt13 & 8191;
                                int i92 = 13;
                                while (true) {
                                    i29 = i90 + 1;
                                    cCharAt9 = strE.charAt(i90);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i91 |= (cCharAt9 & 8191) << i92;
                                    i92 += 13;
                                    i90 = i29;
                                }
                                iCharAt13 = i91 | (cCharAt9 << i92);
                            } else {
                                i29 = i90;
                            }
                            int i93 = (i14 * 2) + (iCharAt13 / 32);
                            Object obj3 = objArrD[i93];
                            if (obj3 instanceof Field) {
                                fieldD0 = (Field) obj3;
                            } else {
                                fieldD0 = d0(cls, (String) obj3);
                                objArrD[i93] = fieldD0;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldD0);
                            i30 = iCharAt13 % 32;
                        }
                        int i94 = iObjectFieldOffset2;
                        if (i82 >= 18 && i82 <= 49) {
                            iArr[i70] = iObjectFieldOffset;
                            i70++;
                        }
                        iObjectFieldOffset3 = i94;
                        i31 = iObjectFieldOffset;
                        i11 = i28;
                        i41 = i29;
                    } else {
                        if (i82 == 50) {
                            int i95 = i71 + 1;
                            iArr[i71] = i73;
                            int i96 = (i73 / 3) * 2;
                            int i97 = i11 + 2;
                            objArr[i96] = objArrD[i89];
                            if ((iCharAt11 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0) {
                                i28 = i11 + 3;
                                objArr[i96 + 1] = objArrD[i97];
                                i27 = iCharAt10;
                                i71 = i95;
                            } else {
                                i28 = i97;
                                i71 = i95;
                                i27 = iCharAt10;
                            }
                        } else {
                            i27 = iCharAt10;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldD3);
                        if ((iCharAt11 & 4096) != 0) {
                            iObjectFieldOffset2 = 1048575;
                            i29 = i26;
                            i30 = 0;
                        } else {
                            iObjectFieldOffset2 = 1048575;
                            i29 = i26;
                            i30 = 0;
                        }
                        int i98 = iObjectFieldOffset2;
                        if (i82 >= 18) {
                            iArr[i70] = iObjectFieldOffset;
                            i70++;
                        }
                        iObjectFieldOffset3 = i98;
                        i31 = iObjectFieldOffset;
                        i11 = i28;
                        i41 = i29;
                    }
                    i28 = i32;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldD3);
                    if ((iCharAt11 & 4096) != 0) {
                        iObjectFieldOffset2 = 1048575;
                        i29 = i26;
                        i30 = 0;
                    } else {
                        iObjectFieldOffset2 = 1048575;
                        i29 = i26;
                        i30 = 0;
                    }
                    int i99 = iObjectFieldOffset2;
                    if (i82 >= 18) {
                        iArr[i70] = iObjectFieldOffset;
                        i70++;
                    }
                    iObjectFieldOffset3 = i99;
                    i31 = iObjectFieldOffset;
                    i11 = i28;
                    i41 = i29;
                }
                i28 = i89;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldD3);
                if ((iCharAt11 & 4096) != 0) {
                    iObjectFieldOffset2 = 1048575;
                    i29 = i26;
                    i30 = 0;
                } else {
                    iObjectFieldOffset2 = 1048575;
                    i29 = i26;
                    i30 = 0;
                }
                int i910 = iObjectFieldOffset2;
                if (i82 >= 18) {
                    iArr[i70] = iObjectFieldOffset;
                    i70++;
                }
                iObjectFieldOffset3 = i910;
                i31 = iObjectFieldOffset;
                i11 = i28;
                i41 = i29;
            }
            int i100 = i73 + 1;
            iArr4[i73] = i27;
            int i101 = i73 + 2;
            int i102 = iObjectFieldOffset3;
            iArr4[i100] = ((iCharAt11 & Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? Integer.MIN_VALUE : 0) | (i82 << 20) | i31;
            i73 += 3;
            iArr4[i101] = (i30 << 20) | i102;
            length = i83;
            iArr3 = iArr4;
            strE = strE;
            c10 = 55296;
        }
        return new T(iArr3, objArr, i12, i16, d0Var.b(), d0Var.c(), false, iArr, i15, i69, v9, d10, m0Var, abstractC1106p, k9);
    }

    private int Q(int i10) {
        return this.f12417a[i10];
    }

    private static long R(int i10) {
        return i10 & 1048575;
    }

    private static boolean S(Object obj, long j9) {
        return ((Boolean) p0.z(obj, j9)).booleanValue();
    }

    private static double T(Object obj, long j9) {
        return ((Double) p0.z(obj, j9)).doubleValue();
    }

    private static float U(Object obj, long j9) {
        return ((Float) p0.z(obj, j9)).floatValue();
    }

    private static int V(Object obj, long j9) {
        return ((Integer) p0.z(obj, j9)).intValue();
    }

    private static long W(Object obj, long j9) {
        return ((Long) p0.z(obj, j9)).longValue();
    }

    private int X(int i10) {
        if (i10 < this.f12419c || i10 > this.f12420d) {
            return -1;
        }
        return g0(i10, 0);
    }

    private int Y(int i10) {
        return this.f12417a[i10 + 2];
    }

    private void Z(Object obj, long j9, e0 e0Var, f0 f0Var, C1105o c1105o) {
        e0Var.E(this.f12430n.c(obj, j9), f0Var, c1105o);
    }

    private void a0(Object obj, int i10, e0 e0Var, f0 f0Var, C1105o c1105o) {
        e0Var.J(this.f12430n.c(obj, R(i10)), f0Var, c1105o);
    }

    private void b0(Object obj, int i10, e0 e0Var) {
        if (v(i10)) {
            p0.O(obj, R(i10), e0Var.L());
        } else if (this.f12423g) {
            p0.O(obj, R(i10), e0Var.x());
        } else {
            p0.O(obj, R(i10), e0Var.B());
        }
    }

    private void c0(Object obj, int i10, e0 e0Var) {
        if (v(i10)) {
            e0Var.A(this.f12430n.c(obj, R(i10)));
        } else {
            e0Var.z(this.f12430n.c(obj, R(i10)));
        }
    }

    private static Field d0(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private void e0(Object obj, int i10) {
        int iY = Y(i10);
        long j9 = 1048575 & iY;
        if (j9 == 1048575) {
            return;
        }
        p0.M(obj, j9, (1 << (iY >>> 20)) | p0.w(obj, j9));
    }

    private void f0(Object obj, int i10, int i11) {
        p0.M(obj, Y(i11) & 1048575, i10);
    }

    private int g0(int i10, int i11) {
        int length = (this.f12417a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int iQ = Q(i13);
            if (i10 == iQ) {
                return i13;
            }
            if (i10 < iQ) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private void h0(Object obj, int i10, Object obj2) {
        f12416s.putObject(obj, R(k0(i10)), obj2);
        e0(obj, i10);
    }

    private void i0(Object obj, int i10, int i11, Object obj2) {
        f12416s.putObject(obj, R(k0(i11)), obj2);
        f0(obj, i10, i11);
    }

    private boolean j(Object obj, Object obj2, int i10) {
        return w(obj, i10) == w(obj2, i10);
    }

    private static int j0(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    private static boolean k(Object obj, long j9) {
        return p0.p(obj, j9);
    }

    private int k0(int i10) {
        return this.f12417a[i10 + 1];
    }

    private static void l(Object obj) {
        if (B(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    private void l0(Object obj, s0 s0Var) {
        Map.Entry entry;
        Iterator it;
        boolean z9;
        int i10;
        int i11;
        int i12;
        boolean z10;
        T t9 = this;
        if (t9.f12422f) {
            C1108s c1108sC = t9.f12432p.c(obj);
            if (c1108sC.j()) {
                entry = null;
                it = null;
            } else {
                Iterator itN = c1108sC.n();
                entry = (Map.Entry) itN.next();
                it = itN;
            }
        } else {
            entry = null;
            it = null;
        }
        int length = t9.f12417a.length;
        Unsafe unsafe = f12416s;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i14 < length) {
            int iK0 = t9.k0(i14);
            int iQ = t9.Q(i14);
            int iJ0 = j0(iK0);
            if (iJ0 <= 17) {
                int i16 = t9.f12417a[i14 + 2];
                z9 = true;
                int i17 = i16 & 1048575;
                if (i17 != i13) {
                    i15 = i17 == 1048575 ? 0 : unsafe.getInt(obj, i17);
                    i13 = i17;
                }
                i10 = i13;
                i11 = i15;
                i12 = 1 << (i16 >>> 20);
            } else {
                z9 = true;
                i10 = i13;
                i11 = i15;
                i12 = 0;
            }
            while (entry != null && t9.f12432p.a(entry) <= iQ) {
                t9.f12432p.j(s0Var, entry);
                entry = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long jR = R(iK0);
            switch (iJ0) {
                case 0:
                    if (t9.x(obj, i14, i10, i11, i12)) {
                        s0Var.e(iQ, m(obj, jR));
                    }
                    break;
                case 1:
                    if (t9.x(obj, i14, i10, i11, i12)) {
                        s0Var.E(iQ, p(obj, jR));
                    }
                    t9 = this;
                    break;
                case 2:
                    if (t9.x(obj, i14, i10, i11, i12)) {
                        s0Var.p(iQ, unsafe.getLong(obj, jR));
                    }
                    t9 = this;
                    break;
                case 3:
                    if (t9.x(obj, i14, i10, i11, i12)) {
                        s0Var.n(iQ, unsafe.getLong(obj, jR));
                    }
                    t9 = this;
                    break;
                case 4:
                    if (t9.x(obj, i14, i10, i11, i12)) {
                        s0Var.t(iQ, unsafe.getInt(obj, jR));
                    }
                    t9 = this;
                    break;
                case 5:
                    if (t9.x(obj, i14, i10, i11, i12)) {
                        s0Var.h(iQ, unsafe.getLong(obj, jR));
                    }
                    t9 = this;
                    break;
                case 6:
                    if (t9.x(obj, i14, i10, i11, i12)) {
                        s0Var.d(iQ, unsafe.getInt(obj, jR));
                    }
                    t9 = this;
                    break;
                case 7:
                    if (t9.x(obj, i14, i10, i11, i12)) {
                        s0Var.q(iQ, k(obj, jR));
                    }
                    t9 = this;
                    break;
                case 8:
                    if (t9.x(obj, i14, i10, i11, i12)) {
                        t9.o0(iQ, unsafe.getObject(obj, jR), s0Var);
                    }
                    break;
                case 9:
                    if (t9.x(obj, i14, i10, i11, i12)) {
                        s0Var.z(iQ, unsafe.getObject(obj, jR), t9.s(i14));
                    }
                    break;
                case 10:
                    if (t9.x(obj, i14, i10, i11, i12)) {
                        s0Var.w(iQ, (AbstractC1097g) unsafe.getObject(obj, jR));
                    }
                    t9 = this;
                    break;
                case 11:
                    if (t9.x(obj, i14, i10, i11, i12)) {
                        s0Var.b(iQ, unsafe.getInt(obj, jR));
                    }
                    t9 = this;
                    break;
                case 12:
                    if (t9.x(obj, i14, i10, i11, i12)) {
                        s0Var.H(iQ, unsafe.getInt(obj, jR));
                    }
                    t9 = this;
                    break;
                case 13:
                    if (t9.x(obj, i14, i10, i11, i12)) {
                        s0Var.r(iQ, unsafe.getInt(obj, jR));
                    }
                    t9 = this;
                    break;
                case 14:
                    if (t9.x(obj, i14, i10, i11, i12)) {
                        s0Var.x(iQ, unsafe.getLong(obj, jR));
                    }
                    t9 = this;
                    break;
                case 15:
                    if (t9.x(obj, i14, i10, i11, i12)) {
                        s0Var.M(iQ, unsafe.getInt(obj, jR));
                    }
                    t9 = this;
                    break;
                case 16:
                    if (t9.x(obj, i14, i10, i11, i12)) {
                        s0Var.D(iQ, unsafe.getLong(obj, jR));
                    }
                    t9 = this;
                    break;
                case 17:
                    if (t9.x(obj, i14, i10, i11, i12)) {
                        s0Var.O(iQ, unsafe.getObject(obj, jR), t9.s(i14));
                    }
                    break;
                case 18:
                    h0.N(t9.Q(i14), (List) unsafe.getObject(obj, jR), s0Var, false);
                    break;
                case 19:
                    h0.R(t9.Q(i14), (List) unsafe.getObject(obj, jR), s0Var, false);
                    break;
                case 20:
                    h0.U(t9.Q(i14), (List) unsafe.getObject(obj, jR), s0Var, false);
                    break;
                case 21:
                    h0.c0(t9.Q(i14), (List) unsafe.getObject(obj, jR), s0Var, false);
                    break;
                case 22:
                    h0.T(t9.Q(i14), (List) unsafe.getObject(obj, jR), s0Var, false);
                    break;
                case 23:
                    h0.Q(t9.Q(i14), (List) unsafe.getObject(obj, jR), s0Var, false);
                    break;
                case 24:
                    h0.P(t9.Q(i14), (List) unsafe.getObject(obj, jR), s0Var, false);
                    break;
                case 25:
                    h0.L(t9.Q(i14), (List) unsafe.getObject(obj, jR), s0Var, false);
                    break;
                case 26:
                    h0.a0(t9.Q(i14), (List) unsafe.getObject(obj, jR), s0Var);
                    break;
                case 27:
                    h0.V(t9.Q(i14), (List) unsafe.getObject(obj, jR), s0Var, t9.s(i14));
                    break;
                case 28:
                    h0.M(t9.Q(i14), (List) unsafe.getObject(obj, jR), s0Var);
                    break;
                case 29:
                    z10 = false;
                    h0.b0(t9.Q(i14), (List) unsafe.getObject(obj, jR), s0Var, false);
                    break;
                case 30:
                    z10 = false;
                    h0.O(t9.Q(i14), (List) unsafe.getObject(obj, jR), s0Var, false);
                    break;
                case 31:
                    z10 = false;
                    h0.W(t9.Q(i14), (List) unsafe.getObject(obj, jR), s0Var, false);
                    break;
                case 32:
                    z10 = false;
                    h0.X(t9.Q(i14), (List) unsafe.getObject(obj, jR), s0Var, false);
                    break;
                case 33:
                    z10 = false;
                    h0.Y(t9.Q(i14), (List) unsafe.getObject(obj, jR), s0Var, false);
                    break;
                case 34:
                    z10 = false;
                    h0.Z(t9.Q(i14), (List) unsafe.getObject(obj, jR), s0Var, false);
                    break;
                case 35:
                    h0.N(t9.Q(i14), (List) unsafe.getObject(obj, jR), s0Var, z9);
                    break;
                case 36:
                    h0.R(t9.Q(i14), (List) unsafe.getObject(obj, jR), s0Var, z9);
                    break;
                case 37:
                    h0.U(t9.Q(i14), (List) unsafe.getObject(obj, jR), s0Var, z9);
                    break;
                case 38:
                    h0.c0(t9.Q(i14), (List) unsafe.getObject(obj, jR), s0Var, z9);
                    break;
                case 39:
                    h0.T(t9.Q(i14), (List) unsafe.getObject(obj, jR), s0Var, z9);
                    break;
                case 40:
                    h0.Q(t9.Q(i14), (List) unsafe.getObject(obj, jR), s0Var, z9);
                    break;
                case 41:
                    h0.P(t9.Q(i14), (List) unsafe.getObject(obj, jR), s0Var, z9);
                    break;
                case 42:
                    h0.L(t9.Q(i14), (List) unsafe.getObject(obj, jR), s0Var, z9);
                    break;
                case 43:
                    h0.b0(t9.Q(i14), (List) unsafe.getObject(obj, jR), s0Var, z9);
                    break;
                case 44:
                    h0.O(t9.Q(i14), (List) unsafe.getObject(obj, jR), s0Var, z9);
                    break;
                case 45:
                    h0.W(t9.Q(i14), (List) unsafe.getObject(obj, jR), s0Var, z9);
                    break;
                case 46:
                    h0.X(t9.Q(i14), (List) unsafe.getObject(obj, jR), s0Var, z9);
                    break;
                case 47:
                    h0.Y(t9.Q(i14), (List) unsafe.getObject(obj, jR), s0Var, z9);
                    break;
                case 48:
                    h0.Z(t9.Q(i14), (List) unsafe.getObject(obj, jR), s0Var, z9);
                    break;
                case 49:
                    h0.S(t9.Q(i14), (List) unsafe.getObject(obj, jR), s0Var, t9.s(i14));
                    break;
                case 50:
                    t9.n0(s0Var, iQ, unsafe.getObject(obj, jR), i14);
                    break;
                case 51:
                    if (t9.D(obj, iQ, i14)) {
                        s0Var.e(iQ, T(obj, jR));
                    }
                    break;
                case 52:
                    if (t9.D(obj, iQ, i14)) {
                        s0Var.E(iQ, U(obj, jR));
                    }
                    break;
                case 53:
                    if (t9.D(obj, iQ, i14)) {
                        s0Var.p(iQ, W(obj, jR));
                    }
                    break;
                case 54:
                    if (t9.D(obj, iQ, i14)) {
                        s0Var.n(iQ, W(obj, jR));
                    }
                    break;
                case 55:
                    if (t9.D(obj, iQ, i14)) {
                        s0Var.t(iQ, V(obj, jR));
                    }
                    break;
                case 56:
                    if (t9.D(obj, iQ, i14)) {
                        s0Var.h(iQ, W(obj, jR));
                    }
                    break;
                case 57:
                    if (t9.D(obj, iQ, i14)) {
                        s0Var.d(iQ, V(obj, jR));
                    }
                    break;
                case 58:
                    if (t9.D(obj, iQ, i14)) {
                        s0Var.q(iQ, S(obj, jR));
                    }
                    break;
                case 59:
                    if (t9.D(obj, iQ, i14)) {
                        t9.o0(iQ, unsafe.getObject(obj, jR), s0Var);
                    }
                    break;
                case 60:
                    if (t9.D(obj, iQ, i14)) {
                        s0Var.z(iQ, unsafe.getObject(obj, jR), t9.s(i14));
                    }
                    break;
                case 61:
                    if (t9.D(obj, iQ, i14)) {
                        s0Var.w(iQ, (AbstractC1097g) unsafe.getObject(obj, jR));
                    }
                    break;
                case 62:
                    if (t9.D(obj, iQ, i14)) {
                        s0Var.b(iQ, V(obj, jR));
                    }
                    break;
                case 63:
                    if (t9.D(obj, iQ, i14)) {
                        s0Var.H(iQ, V(obj, jR));
                    }
                    break;
                case 64:
                    if (t9.D(obj, iQ, i14)) {
                        s0Var.r(iQ, V(obj, jR));
                    }
                    break;
                case 65:
                    if (t9.D(obj, iQ, i14)) {
                        s0Var.x(iQ, W(obj, jR));
                    }
                    break;
                case 66:
                    if (t9.D(obj, iQ, i14)) {
                        s0Var.M(iQ, V(obj, jR));
                    }
                    break;
                case 67:
                    if (t9.D(obj, iQ, i14)) {
                        s0Var.D(iQ, W(obj, jR));
                    }
                    break;
                case 68:
                    if (t9.D(obj, iQ, i14)) {
                        s0Var.O(iQ, unsafe.getObject(obj, jR), t9.s(i14));
                    }
                    break;
                default:
                    break;
            }
            i14 += 3;
            i15 = i11;
            i13 = i10;
            entry = entry;
        }
        while (entry != null) {
            t9.f12432p.j(s0Var, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        t9.p0(t9.f12431o, obj, s0Var);
    }

    private static double m(Object obj, long j9) {
        return p0.u(obj, j9);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    private void m0(Object obj, s0 s0Var) {
        Iterator itE;
        Map.Entry entry;
        p0(this.f12431o, obj, s0Var);
        if (this.f12422f) {
            C1108s c1108sC = this.f12432p.c(obj);
            if (c1108sC.j()) {
                itE = null;
                entry = null;
            } else {
                itE = c1108sC.e();
                entry = (Map.Entry) itE.next();
            }
        } else {
            itE = null;
            entry = null;
        }
        for (int length = this.f12417a.length - 3; length >= 0; length -= 3) {
            int iK0 = k0(length);
            int iQ = Q(length);
            while (entry != null && this.f12432p.a(entry) > iQ) {
                this.f12432p.j(s0Var, entry);
                entry = itE.hasNext() ? (Map.Entry) itE.next() : null;
            }
            switch (j0(iK0)) {
                case 0:
                    if (w(obj, length)) {
                        s0Var.e(iQ, m(obj, R(iK0)));
                    }
                    break;
                case 1:
                    if (w(obj, length)) {
                        s0Var.E(iQ, p(obj, R(iK0)));
                    }
                    break;
                case 2:
                    if (w(obj, length)) {
                        s0Var.p(iQ, F(obj, R(iK0)));
                    }
                    break;
                case 3:
                    if (w(obj, length)) {
                        s0Var.n(iQ, F(obj, R(iK0)));
                    }
                    break;
                case 4:
                    if (w(obj, length)) {
                        s0Var.t(iQ, u(obj, R(iK0)));
                    }
                    break;
                case 5:
                    if (w(obj, length)) {
                        s0Var.h(iQ, F(obj, R(iK0)));
                    }
                    break;
                case 6:
                    if (w(obj, length)) {
                        s0Var.d(iQ, u(obj, R(iK0)));
                    }
                    break;
                case 7:
                    if (w(obj, length)) {
                        s0Var.q(iQ, k(obj, R(iK0)));
                    }
                    break;
                case 8:
                    if (w(obj, length)) {
                        o0(iQ, p0.z(obj, R(iK0)), s0Var);
                    }
                    break;
                case 9:
                    if (w(obj, length)) {
                        s0Var.z(iQ, p0.z(obj, R(iK0)), s(length));
                    }
                    break;
                case 10:
                    if (w(obj, length)) {
                        s0Var.w(iQ, (AbstractC1097g) p0.z(obj, R(iK0)));
                    }
                    break;
                case 11:
                    if (w(obj, length)) {
                        s0Var.b(iQ, u(obj, R(iK0)));
                    }
                    break;
                case 12:
                    if (w(obj, length)) {
                        s0Var.H(iQ, u(obj, R(iK0)));
                    }
                    break;
                case 13:
                    if (w(obj, length)) {
                        s0Var.r(iQ, u(obj, R(iK0)));
                    }
                    break;
                case 14:
                    if (w(obj, length)) {
                        s0Var.x(iQ, F(obj, R(iK0)));
                    }
                    break;
                case 15:
                    if (w(obj, length)) {
                        s0Var.M(iQ, u(obj, R(iK0)));
                    }
                    break;
                case 16:
                    if (w(obj, length)) {
                        s0Var.D(iQ, F(obj, R(iK0)));
                    }
                    break;
                case 17:
                    if (w(obj, length)) {
                        s0Var.O(iQ, p0.z(obj, R(iK0)), s(length));
                    }
                    break;
                case 18:
                    h0.N(Q(length), (List) p0.z(obj, R(iK0)), s0Var, false);
                    break;
                case 19:
                    h0.R(Q(length), (List) p0.z(obj, R(iK0)), s0Var, false);
                    break;
                case 20:
                    h0.U(Q(length), (List) p0.z(obj, R(iK0)), s0Var, false);
                    break;
                case 21:
                    h0.c0(Q(length), (List) p0.z(obj, R(iK0)), s0Var, false);
                    break;
                case 22:
                    h0.T(Q(length), (List) p0.z(obj, R(iK0)), s0Var, false);
                    break;
                case 23:
                    h0.Q(Q(length), (List) p0.z(obj, R(iK0)), s0Var, false);
                    break;
                case 24:
                    h0.P(Q(length), (List) p0.z(obj, R(iK0)), s0Var, false);
                    break;
                case 25:
                    h0.L(Q(length), (List) p0.z(obj, R(iK0)), s0Var, false);
                    break;
                case 26:
                    h0.a0(Q(length), (List) p0.z(obj, R(iK0)), s0Var);
                    break;
                case 27:
                    h0.V(Q(length), (List) p0.z(obj, R(iK0)), s0Var, s(length));
                    break;
                case 28:
                    h0.M(Q(length), (List) p0.z(obj, R(iK0)), s0Var);
                    break;
                case 29:
                    h0.b0(Q(length), (List) p0.z(obj, R(iK0)), s0Var, false);
                    break;
                case 30:
                    h0.O(Q(length), (List) p0.z(obj, R(iK0)), s0Var, false);
                    break;
                case 31:
                    h0.W(Q(length), (List) p0.z(obj, R(iK0)), s0Var, false);
                    break;
                case 32:
                    h0.X(Q(length), (List) p0.z(obj, R(iK0)), s0Var, false);
                    break;
                case 33:
                    h0.Y(Q(length), (List) p0.z(obj, R(iK0)), s0Var, false);
                    break;
                case 34:
                    h0.Z(Q(length), (List) p0.z(obj, R(iK0)), s0Var, false);
                    break;
                case 35:
                    h0.N(Q(length), (List) p0.z(obj, R(iK0)), s0Var, true);
                    break;
                case 36:
                    h0.R(Q(length), (List) p0.z(obj, R(iK0)), s0Var, true);
                    break;
                case 37:
                    h0.U(Q(length), (List) p0.z(obj, R(iK0)), s0Var, true);
                    break;
                case 38:
                    h0.c0(Q(length), (List) p0.z(obj, R(iK0)), s0Var, true);
                    break;
                case 39:
                    h0.T(Q(length), (List) p0.z(obj, R(iK0)), s0Var, true);
                    break;
                case 40:
                    h0.Q(Q(length), (List) p0.z(obj, R(iK0)), s0Var, true);
                    break;
                case 41:
                    h0.P(Q(length), (List) p0.z(obj, R(iK0)), s0Var, true);
                    break;
                case 42:
                    h0.L(Q(length), (List) p0.z(obj, R(iK0)), s0Var, true);
                    break;
                case 43:
                    h0.b0(Q(length), (List) p0.z(obj, R(iK0)), s0Var, true);
                    break;
                case 44:
                    h0.O(Q(length), (List) p0.z(obj, R(iK0)), s0Var, true);
                    break;
                case 45:
                    h0.W(Q(length), (List) p0.z(obj, R(iK0)), s0Var, true);
                    break;
                case 46:
                    h0.X(Q(length), (List) p0.z(obj, R(iK0)), s0Var, true);
                    break;
                case 47:
                    h0.Y(Q(length), (List) p0.z(obj, R(iK0)), s0Var, true);
                    break;
                case 48:
                    h0.Z(Q(length), (List) p0.z(obj, R(iK0)), s0Var, true);
                    break;
                case 49:
                    h0.S(Q(length), (List) p0.z(obj, R(iK0)), s0Var, s(length));
                    break;
                case 50:
                    n0(s0Var, iQ, p0.z(obj, R(iK0)), length);
                    break;
                case 51:
                    if (D(obj, iQ, length)) {
                        s0Var.e(iQ, T(obj, R(iK0)));
                    }
                    break;
                case 52:
                    if (D(obj, iQ, length)) {
                        s0Var.E(iQ, U(obj, R(iK0)));
                    }
                    break;
                case 53:
                    if (D(obj, iQ, length)) {
                        s0Var.p(iQ, W(obj, R(iK0)));
                    }
                    break;
                case 54:
                    if (D(obj, iQ, length)) {
                        s0Var.n(iQ, W(obj, R(iK0)));
                    }
                    break;
                case 55:
                    if (D(obj, iQ, length)) {
                        s0Var.t(iQ, V(obj, R(iK0)));
                    }
                    break;
                case 56:
                    if (D(obj, iQ, length)) {
                        s0Var.h(iQ, W(obj, R(iK0)));
                    }
                    break;
                case 57:
                    if (D(obj, iQ, length)) {
                        s0Var.d(iQ, V(obj, R(iK0)));
                    }
                    break;
                case 58:
                    if (D(obj, iQ, length)) {
                        s0Var.q(iQ, S(obj, R(iK0)));
                    }
                    break;
                case 59:
                    if (D(obj, iQ, length)) {
                        o0(iQ, p0.z(obj, R(iK0)), s0Var);
                    }
                    break;
                case 60:
                    if (D(obj, iQ, length)) {
                        s0Var.z(iQ, p0.z(obj, R(iK0)), s(length));
                    }
                    break;
                case 61:
                    if (D(obj, iQ, length)) {
                        s0Var.w(iQ, (AbstractC1097g) p0.z(obj, R(iK0)));
                    }
                    break;
                case 62:
                    if (D(obj, iQ, length)) {
                        s0Var.b(iQ, V(obj, R(iK0)));
                    }
                    break;
                case 63:
                    if (D(obj, iQ, length)) {
                        s0Var.H(iQ, V(obj, R(iK0)));
                    }
                    break;
                case 64:
                    if (D(obj, iQ, length)) {
                        s0Var.r(iQ, V(obj, R(iK0)));
                    }
                    break;
                case 65:
                    if (D(obj, iQ, length)) {
                        s0Var.x(iQ, W(obj, R(iK0)));
                    }
                    break;
                case 66:
                    if (D(obj, iQ, length)) {
                        s0Var.M(iQ, V(obj, R(iK0)));
                    }
                    break;
                case 67:
                    if (D(obj, iQ, length)) {
                        s0Var.D(iQ, W(obj, R(iK0)));
                    }
                    break;
                case 68:
                    if (D(obj, iQ, length)) {
                        s0Var.O(iQ, p0.z(obj, R(iK0)), s(length));
                    }
                    break;
            }
        }
        while (entry != null) {
            this.f12432p.j(s0Var, entry);
            entry = itE.hasNext() ? (Map.Entry) itE.next() : null;
        }
    }

    private boolean n(Object obj, Object obj2, int i10) {
        int iK0 = k0(i10);
        long jR = R(iK0);
        switch (j0(iK0)) {
            case 0:
                return j(obj, obj2, i10) && Double.doubleToLongBits(p0.u(obj, jR)) == Double.doubleToLongBits(p0.u(obj2, jR));
            case 1:
                return j(obj, obj2, i10) && Float.floatToIntBits(p0.v(obj, jR)) == Float.floatToIntBits(p0.v(obj2, jR));
            case 2:
                return j(obj, obj2, i10) && p0.x(obj, jR) == p0.x(obj2, jR);
            case 3:
                return j(obj, obj2, i10) && p0.x(obj, jR) == p0.x(obj2, jR);
            case 4:
                return j(obj, obj2, i10) && p0.w(obj, jR) == p0.w(obj2, jR);
            case 5:
                return j(obj, obj2, i10) && p0.x(obj, jR) == p0.x(obj2, jR);
            case 6:
                return j(obj, obj2, i10) && p0.w(obj, jR) == p0.w(obj2, jR);
            case 7:
                return j(obj, obj2, i10) && p0.p(obj, jR) == p0.p(obj2, jR);
            case 8:
                return j(obj, obj2, i10) && h0.H(p0.z(obj, jR), p0.z(obj2, jR));
            case 9:
                return j(obj, obj2, i10) && h0.H(p0.z(obj, jR), p0.z(obj2, jR));
            case 10:
                return j(obj, obj2, i10) && h0.H(p0.z(obj, jR), p0.z(obj2, jR));
            case 11:
                return j(obj, obj2, i10) && p0.w(obj, jR) == p0.w(obj2, jR);
            case 12:
                return j(obj, obj2, i10) && p0.w(obj, jR) == p0.w(obj2, jR);
            case 13:
                return j(obj, obj2, i10) && p0.w(obj, jR) == p0.w(obj2, jR);
            case 14:
                return j(obj, obj2, i10) && p0.x(obj, jR) == p0.x(obj2, jR);
            case 15:
                return j(obj, obj2, i10) && p0.w(obj, jR) == p0.w(obj2, jR);
            case 16:
                return j(obj, obj2, i10) && p0.x(obj, jR) == p0.x(obj2, jR);
            case 17:
                return j(obj, obj2, i10) && h0.H(p0.z(obj, jR), p0.z(obj2, jR));
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                return h0.H(p0.z(obj, jR), p0.z(obj2, jR));
            case 50:
                return h0.H(p0.z(obj, jR), p0.z(obj2, jR));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                return C(obj, obj2, i10) && h0.H(p0.z(obj, jR), p0.z(obj2, jR));
            default:
                return true;
        }
    }

    private void n0(s0 s0Var, int i10, Object obj, int i11) {
        if (obj != null) {
            s0Var.L(i10, this.f12433q.c(r(i11)), this.f12433q.h(obj));
        }
    }

    private Object o(Object obj, int i10, Object obj2, m0 m0Var, Object obj3) {
        Q(i10);
        if (p0.z(obj, R(k0(i10))) == null) {
            return obj2;
        }
        q(i10);
        return obj2;
    }

    private void o0(int i10, Object obj, s0 s0Var) {
        if (obj instanceof String) {
            s0Var.m(i10, (String) obj);
        } else {
            s0Var.w(i10, (AbstractC1097g) obj);
        }
    }

    private static float p(Object obj, long j9) {
        return p0.v(obj, j9);
    }

    private void p0(m0 m0Var, Object obj, s0 s0Var) {
        m0Var.t(m0Var.g(obj), s0Var);
    }

    private AbstractC1114y.a q(int i10) {
        androidx.appcompat.app.o.a(this.f12418b[((i10 / 3) * 2) + 1]);
        return null;
    }

    private Object r(int i10) {
        return this.f12418b[(i10 / 3) * 2];
    }

    private f0 s(int i10) {
        int i11 = (i10 / 3) * 2;
        f0 f0Var = (f0) this.f12418b[i11];
        if (f0Var != null) {
            return f0Var;
        }
        f0 f0VarC = b0.a().c((Class) this.f12418b[i11 + 1]);
        this.f12418b[i11] = f0VarC;
        return f0VarC;
    }

    private int t(m0 m0Var, Object obj) {
        return m0Var.h(m0Var.g(obj));
    }

    private static int u(Object obj, long j9) {
        return p0.w(obj, j9);
    }

    private static boolean v(int i10) {
        return (i10 & 536870912) != 0;
    }

    private boolean w(Object obj, int i10) {
        int iY = Y(i10);
        long j9 = 1048575 & iY;
        if (j9 != 1048575) {
            return ((1 << (iY >>> 20)) & p0.w(obj, j9)) != 0;
        }
        int iK0 = k0(i10);
        long jR = R(iK0);
        switch (j0(iK0)) {
            case 0:
                return Double.doubleToRawLongBits(p0.u(obj, jR)) != 0;
            case 1:
                return Float.floatToRawIntBits(p0.v(obj, jR)) != 0;
            case 2:
                return p0.x(obj, jR) != 0;
            case 3:
                return p0.x(obj, jR) != 0;
            case 4:
                return p0.w(obj, jR) != 0;
            case 5:
                return p0.x(obj, jR) != 0;
            case 6:
                return p0.w(obj, jR) != 0;
            case 7:
                return p0.p(obj, jR);
            case 8:
                Object objZ = p0.z(obj, jR);
                if (objZ instanceof String) {
                    return !((String) objZ).isEmpty();
                }
                if (objZ instanceof AbstractC1097g) {
                    return !AbstractC1097g.f12460r.equals(objZ);
                }
                throw new IllegalArgumentException();
            case 9:
                return p0.z(obj, jR) != null;
            case 10:
                return !AbstractC1097g.f12460r.equals(p0.z(obj, jR));
            case 11:
                return p0.w(obj, jR) != 0;
            case 12:
                return p0.w(obj, jR) != 0;
            case 13:
                return p0.w(obj, jR) != 0;
            case 14:
                return p0.x(obj, jR) != 0;
            case 15:
                return p0.w(obj, jR) != 0;
            case 16:
                return p0.x(obj, jR) != 0;
            case 17:
                return p0.z(obj, jR) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private boolean x(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return w(obj, i10);
        }
        return (i12 & i13) != 0;
    }

    private static boolean y(Object obj, int i10, f0 f0Var) {
        return f0Var.d(p0.z(obj, R(i10)));
    }

    private boolean z(Object obj, int i10, int i11) {
        List list = (List) p0.z(obj, R(i10));
        if (list.isEmpty()) {
            return true;
        }
        f0 f0VarS = s(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!f0VarS.d(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public void a(Object obj, Object obj2) {
        l(obj);
        obj2.getClass();
        for (int i10 = 0; i10 < this.f12417a.length; i10 += 3) {
            K(obj, obj2, i10);
        }
        h0.F(this.f12431o, obj, obj2);
        if (this.f12422f) {
            h0.D(this.f12432p, obj, obj2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public void b(Object obj, e0 e0Var, C1105o c1105o) throws Throwable {
        c1105o.getClass();
        l(obj);
        G(this.f12431o, this.f12432p, obj, e0Var, c1105o);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x007d A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.f0
    public void c(Object obj) {
        if (B(obj)) {
            if (obj instanceof AbstractC1112w) {
                AbstractC1112w abstractC1112w = (AbstractC1112w) obj;
                abstractC1112w.l();
                abstractC1112w.k();
                abstractC1112w.E();
            }
            int length = this.f12417a.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int iK0 = k0(i10);
                long jR = R(iK0);
                int iJ0 = j0(iK0);
                if (iJ0 != 9) {
                    if (iJ0 != 60 && iJ0 != 68) {
                        switch (iJ0) {
                            case 17:
                                if (w(obj, i10)) {
                                    s(i10).c(f12416s.getObject(obj, jR));
                                }
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.f12430n.b(obj, jR);
                                break;
                            case 50:
                                Unsafe unsafe = f12416s;
                                Object object = unsafe.getObject(obj, jR);
                                if (object != null) {
                                    unsafe.putObject(obj, jR, this.f12433q.b(object));
                                }
                                break;
                        }
                    } else if (D(obj, Q(i10), i10)) {
                        s(i10).c(f12416s.getObject(obj, jR));
                    }
                } else if (w(obj, i10)) {
                    s(i10).c(f12416s.getObject(obj, jR));
                }
            }
            this.f12431o.j(obj);
            if (this.f12422f) {
                this.f12432p.f(obj);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0094 A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.f0
    public final boolean d(Object obj) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.f12427k) {
            int i15 = this.f12426j[i13];
            int iQ = this.Q(i15);
            int iK0 = this.k0(i15);
            int i16 = this.f12417a[i15 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i12) {
                if (i17 != 1048575) {
                    i14 = f12416s.getInt(obj, i17);
                }
                i11 = i14;
                i10 = i17;
            } else {
                i10 = i12;
                i11 = i14;
            }
            T t9 = this;
            Object obj2 = obj;
            if (E(iK0) && !t9.x(obj2, i15, i10, i11, i18)) {
                return false;
            }
            int iJ0 = j0(iK0);
            if (iJ0 == 9 || iJ0 == 17) {
                if (t9.x(obj2, i15, i10, i11, i18) && !y(obj2, iK0, t9.s(i15))) {
                    return false;
                }
            } else if (iJ0 == 27) {
                if (!t9.z(obj2, iK0, i15)) {
                    return false;
                }
            } else if (iJ0 == 60 || iJ0 == 68) {
                if (t9.D(obj2, iQ, i15) && !y(obj2, iK0, t9.s(i15))) {
                    return false;
                }
            } else if (iJ0 != 49) {
                if (iJ0 == 50 && !t9.A(obj2, iK0, i15)) {
                    return false;
                }
            } else if (!t9.z(obj2, iK0, i15)) {
                return false;
            }
            i13++;
            this = t9;
            obj = obj2;
            i12 = i10;
            i14 = i11;
        }
        T t10 = this;
        return !t10.f12422f || t10.f12432p.c(obj).k();
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public void e(Object obj, s0 s0Var) {
        if (s0Var.i() == s0.a.DESCENDING) {
            m0(obj, s0Var);
        } else {
            l0(obj, s0Var);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public boolean f(Object obj, Object obj2) {
        int length = this.f12417a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!n(obj, obj2, i10)) {
                return false;
            }
        }
        if (!this.f12431o.g(obj).equals(this.f12431o.g(obj2))) {
            return false;
        }
        if (this.f12422f) {
            return this.f12432p.c(obj).equals(this.f12432p.c(obj2));
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:247:0x0552 A[PHI: r0 r1
      0x0552: PHI (r0v5 androidx.datastore.preferences.protobuf.T) = 
      (r0v1 androidx.datastore.preferences.protobuf.T)
      (r0v1 androidx.datastore.preferences.protobuf.T)
      (r0v1 androidx.datastore.preferences.protobuf.T)
      (r0v27 androidx.datastore.preferences.protobuf.T)
      (r0v33 androidx.datastore.preferences.protobuf.T)
      (r0v1 androidx.datastore.preferences.protobuf.T)
      (r0v1 androidx.datastore.preferences.protobuf.T)
      (r0v1 androidx.datastore.preferences.protobuf.T)
      (r0v1 androidx.datastore.preferences.protobuf.T)
      (r0v1 androidx.datastore.preferences.protobuf.T)
      (r0v1 androidx.datastore.preferences.protobuf.T)
      (r0v1 androidx.datastore.preferences.protobuf.T)
      (r0v1 androidx.datastore.preferences.protobuf.T)
      (r0v1 androidx.datastore.preferences.protobuf.T)
      (r0v1 androidx.datastore.preferences.protobuf.T)
      (r0v1 androidx.datastore.preferences.protobuf.T)
      (r0v1 androidx.datastore.preferences.protobuf.T)
      (r0v1 androidx.datastore.preferences.protobuf.T)
      (r0v1 androidx.datastore.preferences.protobuf.T)
      (r0v1 androidx.datastore.preferences.protobuf.T)
      (r0v1 androidx.datastore.preferences.protobuf.T)
      (r0v1 androidx.datastore.preferences.protobuf.T)
      (r0v1 androidx.datastore.preferences.protobuf.T)
      (r0v1 androidx.datastore.preferences.protobuf.T)
      (r0v1 androidx.datastore.preferences.protobuf.T)
      (r0v1 androidx.datastore.preferences.protobuf.T)
      (r0v1 androidx.datastore.preferences.protobuf.T)
      (r0v1 androidx.datastore.preferences.protobuf.T)
      (r0v1 androidx.datastore.preferences.protobuf.T)
      (r0v1 androidx.datastore.preferences.protobuf.T)
      (r0v1 androidx.datastore.preferences.protobuf.T)
      (r0v1 androidx.datastore.preferences.protobuf.T)
      (r0v1 androidx.datastore.preferences.protobuf.T)
      (r0v1 androidx.datastore.preferences.protobuf.T)
      (r0v1 androidx.datastore.preferences.protobuf.T)
      (r0v1 androidx.datastore.preferences.protobuf.T)
      (r0v1 androidx.datastore.preferences.protobuf.T)
      (r0v1 androidx.datastore.preferences.protobuf.T)
     binds: [B:22:0x005b, B:245:0x0548, B:215:0x04ab, B:201:0x0462, B:193:0x043b, B:187:0x0414, B:164:0x032b, B:158:0x030d, B:152:0x02ef, B:146:0x02d1, B:140:0x02b3, B:134:0x0295, B:128:0x0277, B:122:0x0259, B:116:0x023b, B:110:0x021e, B:104:0x0201, B:98:0x01e4, B:92:0x01c7, B:85:0x01a5, B:80:0x0171, B:77:0x0165, B:74:0x0155, B:71:0x0145, B:68:0x0135, B:65:0x0129, B:62:0x011d, B:59:0x0110, B:53:0x00f2, B:50:0x00df, B:47:0x00ce, B:44:0x00bf, B:41:0x00b0, B:38:0x00a5, B:35:0x009a, B:32:0x008b, B:29:0x007c, B:25:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0552: PHI (r1v2 java.lang.Object) = 
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v3 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
      (r1v1 java.lang.Object)
     binds: [B:22:0x005b, B:245:0x0548, B:215:0x04ab, B:201:0x0462, B:193:0x043b, B:187:0x0414, B:164:0x032b, B:158:0x030d, B:152:0x02ef, B:146:0x02d1, B:140:0x02b3, B:134:0x0295, B:128:0x0277, B:122:0x0259, B:116:0x023b, B:110:0x021e, B:104:0x0201, B:98:0x01e4, B:92:0x01c7, B:85:0x01a5, B:80:0x0171, B:77:0x0165, B:74:0x0155, B:71:0x0145, B:68:0x0135, B:65:0x0129, B:62:0x011d, B:59:0x0110, B:53:0x00f2, B:50:0x00df, B:47:0x00ce, B:44:0x00bf, B:41:0x00b0, B:38:0x00a5, B:35:0x009a, B:32:0x008b, B:29:0x007c, B:25:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.datastore.preferences.protobuf.f0
    public int g(Object obj) {
        int i10;
        int iH;
        int iP;
        int iW;
        int i11;
        int iO;
        int iQ;
        T t9 = this;
        Object obj2 = obj;
        Unsafe unsafe = f12416s;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 1048575;
        while (i13 < t9.f12417a.length) {
            int iK0 = t9.k0(i13);
            int iJ0 = j0(iK0);
            int iQ2 = t9.Q(i13);
            int i17 = t9.f12417a[i13 + 2];
            int i18 = i17 & i12;
            if (iJ0 <= 17) {
                if (i18 != i16) {
                    i14 = i18 == i12 ? 0 : unsafe.getInt(obj2, i18);
                    i16 = i18;
                }
                i10 = 1 << (i17 >>> 20);
            } else {
                i10 = 0;
            }
            int i19 = i15;
            long jR = R(iK0);
            if (iJ0 < EnumC1109t.f12647e0.d() || iJ0 > EnumC1109t.f12660r0.d()) {
                i18 = 0;
            }
            switch (iJ0) {
                case 0:
                    if (!t9.x(obj2, i13, i16, i14, i10)) {
                        i15 = i19;
                    } else {
                        iH = AbstractC1100j.h(iQ2, 0.0d);
                        i15 = i19 + iH;
                    }
                    break;
                case 1:
                    if (t9.x(obj2, i13, i16, i14, i10)) {
                        iP = AbstractC1100j.p(iQ2, 0.0f);
                        i15 = i19 + iP;
                        t9 = this;
                        obj2 = obj;
                    }
                    t9 = this;
                    obj2 = obj;
                    i15 = i19;
                    break;
                case 2:
                    if (t9.x(obj2, i13, i16, i14, i10)) {
                        iW = AbstractC1100j.w(iQ2, unsafe.getLong(obj2, jR));
                        i15 = i19 + iW;
                        t9 = this;
                    }
                    t9 = this;
                    i15 = i19;
                    break;
                case 3:
                    if (t9.x(obj2, i13, i16, i14, i10)) {
                        iW = AbstractC1100j.R(iQ2, unsafe.getLong(obj2, jR));
                        i15 = i19 + iW;
                        t9 = this;
                    }
                    t9 = this;
                    i15 = i19;
                    break;
                case 4:
                    if (t9.x(obj2, i13, i16, i14, i10)) {
                        iW = AbstractC1100j.u(iQ2, unsafe.getInt(obj2, jR));
                        i15 = i19 + iW;
                        t9 = this;
                    }
                    t9 = this;
                    i15 = i19;
                    break;
                case 5:
                    if (t9.x(obj2, i13, i16, i14, i10)) {
                        iP = AbstractC1100j.n(iQ2, 0L);
                        i15 = i19 + iP;
                        t9 = this;
                        obj2 = obj;
                    }
                    t9 = this;
                    obj2 = obj;
                    i15 = i19;
                    break;
                case 6:
                    if (t9.x(obj2, i13, i16, i14, i10)) {
                        iP = AbstractC1100j.l(iQ2, 0);
                        i15 = i19 + iP;
                        t9 = this;
                        obj2 = obj;
                    }
                    t9 = this;
                    obj2 = obj;
                    i15 = i19;
                    break;
                case 7:
                    if (t9.x(obj2, i13, i16, i14, i10)) {
                        iP = AbstractC1100j.c(iQ2, true);
                        i15 = i19 + iP;
                        t9 = this;
                        obj2 = obj;
                    }
                    t9 = this;
                    obj2 = obj;
                    i15 = i19;
                    break;
                case 8:
                    if (t9.x(obj2, i13, i16, i14, i10)) {
                        Object object = unsafe.getObject(obj2, jR);
                        iW = object instanceof AbstractC1097g ? AbstractC1100j.f(iQ2, (AbstractC1097g) object) : AbstractC1100j.M(iQ2, (String) object);
                        i15 = i19 + iW;
                        t9 = this;
                    }
                    t9 = this;
                    i15 = i19;
                    break;
                case 9:
                    if (!t9.x(obj2, i13, i16, i14, i10)) {
                        i15 = i19;
                    } else {
                        iH = h0.o(iQ2, unsafe.getObject(obj2, jR), t9.s(i13));
                        i15 = i19 + iH;
                    }
                    break;
                case 10:
                    if (t9.x(obj2, i13, i16, i14, i10)) {
                        iW = AbstractC1100j.f(iQ2, (AbstractC1097g) unsafe.getObject(obj2, jR));
                        i15 = i19 + iW;
                        t9 = this;
                    }
                    t9 = this;
                    i15 = i19;
                    break;
                case 11:
                    if (t9.x(obj2, i13, i16, i14, i10)) {
                        iW = AbstractC1100j.P(iQ2, unsafe.getInt(obj2, jR));
                        i15 = i19 + iW;
                        t9 = this;
                    }
                    t9 = this;
                    i15 = i19;
                    break;
                case 12:
                    if (t9.x(obj2, i13, i16, i14, i10)) {
                        iW = AbstractC1100j.j(iQ2, unsafe.getInt(obj2, jR));
                        i15 = i19 + iW;
                        t9 = this;
                    }
                    t9 = this;
                    i15 = i19;
                    break;
                case 13:
                    if (t9.x(obj2, i13, i16, i14, i10)) {
                        iP = AbstractC1100j.E(iQ2, 0);
                        i15 = i19 + iP;
                        t9 = this;
                        obj2 = obj;
                    }
                    t9 = this;
                    obj2 = obj;
                    i15 = i19;
                    break;
                case 14:
                    if (t9.x(obj2, i13, i16, i14, i10)) {
                        iP = AbstractC1100j.G(iQ2, 0L);
                        i15 = i19 + iP;
                        t9 = this;
                        obj2 = obj;
                    }
                    t9 = this;
                    obj2 = obj;
                    i15 = i19;
                    break;
                case 15:
                    if (t9.x(obj2, i13, i16, i14, i10)) {
                        iW = AbstractC1100j.I(iQ2, unsafe.getInt(obj2, jR));
                        i15 = i19 + iW;
                        t9 = this;
                    }
                    t9 = this;
                    i15 = i19;
                    break;
                case 16:
                    if (t9.x(obj2, i13, i16, i14, i10)) {
                        iW = AbstractC1100j.K(iQ2, unsafe.getLong(obj2, jR));
                        i15 = i19 + iW;
                        t9 = this;
                    }
                    t9 = this;
                    i15 = i19;
                    break;
                case 17:
                    if (!t9.x(obj2, i13, i16, i14, i10)) {
                        i15 = i19;
                    } else {
                        iH = AbstractC1100j.r(iQ2, (P) unsafe.getObject(obj2, jR), t9.s(i13));
                        i15 = i19 + iH;
                    }
                    break;
                case 18:
                    iH = h0.h(iQ2, (List) unsafe.getObject(obj2, jR), false);
                    i15 = i19 + iH;
                    break;
                case 19:
                    iH = h0.f(iQ2, (List) unsafe.getObject(obj2, jR), false);
                    i15 = i19 + iH;
                    break;
                case 20:
                    iH = h0.m(iQ2, (List) unsafe.getObject(obj2, jR), false);
                    i15 = i19 + iH;
                    break;
                case 21:
                    iH = h0.x(iQ2, (List) unsafe.getObject(obj2, jR), false);
                    i15 = i19 + iH;
                    break;
                case 22:
                    iH = h0.k(iQ2, (List) unsafe.getObject(obj2, jR), false);
                    i15 = i19 + iH;
                    break;
                case 23:
                    iH = h0.h(iQ2, (List) unsafe.getObject(obj2, jR), false);
                    i15 = i19 + iH;
                    break;
                case 24:
                    iH = h0.f(iQ2, (List) unsafe.getObject(obj2, jR), false);
                    i15 = i19 + iH;
                    break;
                case 25:
                    iH = h0.a(iQ2, (List) unsafe.getObject(obj2, jR), false);
                    i15 = i19 + iH;
                    break;
                case 26:
                    iH = h0.u(iQ2, (List) unsafe.getObject(obj2, jR));
                    i15 = i19 + iH;
                    break;
                case 27:
                    iH = h0.p(iQ2, (List) unsafe.getObject(obj2, jR), t9.s(i13));
                    i15 = i19 + iH;
                    break;
                case 28:
                    iH = h0.c(iQ2, (List) unsafe.getObject(obj2, jR));
                    i15 = i19 + iH;
                    break;
                case 29:
                    iH = h0.v(iQ2, (List) unsafe.getObject(obj2, jR), false);
                    i15 = i19 + iH;
                    break;
                case 30:
                    iH = h0.d(iQ2, (List) unsafe.getObject(obj2, jR), false);
                    i15 = i19 + iH;
                    break;
                case 31:
                    iH = h0.f(iQ2, (List) unsafe.getObject(obj2, jR), false);
                    i15 = i19 + iH;
                    break;
                case 32:
                    iH = h0.h(iQ2, (List) unsafe.getObject(obj2, jR), false);
                    i15 = i19 + iH;
                    break;
                case 33:
                    iH = h0.q(iQ2, (List) unsafe.getObject(obj2, jR), false);
                    i15 = i19 + iH;
                    break;
                case 34:
                    iH = h0.s(iQ2, (List) unsafe.getObject(obj2, jR), false);
                    i15 = i19 + iH;
                    break;
                case 35:
                    i11 = h0.i((List) unsafe.getObject(obj2, jR));
                    if (i11 <= 0) {
                        i15 = i19;
                    } else {
                        if (t9.f12425i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = AbstractC1100j.O(iQ2);
                        iQ = AbstractC1100j.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    break;
                case 36:
                    i11 = h0.g((List) unsafe.getObject(obj2, jR));
                    if (i11 <= 0) {
                        i15 = i19;
                    } else {
                        if (t9.f12425i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = AbstractC1100j.O(iQ2);
                        iQ = AbstractC1100j.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    break;
                case 37:
                    i11 = h0.n((List) unsafe.getObject(obj2, jR));
                    if (i11 <= 0) {
                        i15 = i19;
                    } else {
                        if (t9.f12425i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = AbstractC1100j.O(iQ2);
                        iQ = AbstractC1100j.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    break;
                case 38:
                    i11 = h0.y((List) unsafe.getObject(obj2, jR));
                    if (i11 <= 0) {
                        i15 = i19;
                    } else {
                        if (t9.f12425i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = AbstractC1100j.O(iQ2);
                        iQ = AbstractC1100j.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    break;
                case 39:
                    i11 = h0.l((List) unsafe.getObject(obj2, jR));
                    if (i11 <= 0) {
                        i15 = i19;
                    } else {
                        if (t9.f12425i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = AbstractC1100j.O(iQ2);
                        iQ = AbstractC1100j.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    break;
                case 40:
                    i11 = h0.i((List) unsafe.getObject(obj2, jR));
                    if (i11 <= 0) {
                        i15 = i19;
                    } else {
                        if (t9.f12425i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = AbstractC1100j.O(iQ2);
                        iQ = AbstractC1100j.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    break;
                case 41:
                    i11 = h0.g((List) unsafe.getObject(obj2, jR));
                    if (i11 <= 0) {
                        i15 = i19;
                    } else {
                        if (t9.f12425i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = AbstractC1100j.O(iQ2);
                        iQ = AbstractC1100j.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    break;
                case 42:
                    i11 = h0.b((List) unsafe.getObject(obj2, jR));
                    if (i11 <= 0) {
                        i15 = i19;
                    } else {
                        if (t9.f12425i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = AbstractC1100j.O(iQ2);
                        iQ = AbstractC1100j.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    break;
                case 43:
                    i11 = h0.w((List) unsafe.getObject(obj2, jR));
                    if (i11 <= 0) {
                        i15 = i19;
                    } else {
                        if (t9.f12425i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = AbstractC1100j.O(iQ2);
                        iQ = AbstractC1100j.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    break;
                case 44:
                    i11 = h0.e((List) unsafe.getObject(obj2, jR));
                    if (i11 <= 0) {
                        i15 = i19;
                    } else {
                        if (t9.f12425i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = AbstractC1100j.O(iQ2);
                        iQ = AbstractC1100j.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    break;
                case 45:
                    i11 = h0.g((List) unsafe.getObject(obj2, jR));
                    if (i11 <= 0) {
                        i15 = i19;
                    } else {
                        if (t9.f12425i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = AbstractC1100j.O(iQ2);
                        iQ = AbstractC1100j.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    break;
                case 46:
                    i11 = h0.i((List) unsafe.getObject(obj2, jR));
                    if (i11 <= 0) {
                        i15 = i19;
                    } else {
                        if (t9.f12425i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = AbstractC1100j.O(iQ2);
                        iQ = AbstractC1100j.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    break;
                case 47:
                    i11 = h0.r((List) unsafe.getObject(obj2, jR));
                    if (i11 <= 0) {
                        i15 = i19;
                    } else {
                        if (t9.f12425i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = AbstractC1100j.O(iQ2);
                        iQ = AbstractC1100j.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    break;
                case 48:
                    i11 = h0.t((List) unsafe.getObject(obj2, jR));
                    if (i11 <= 0) {
                        i15 = i19;
                    } else {
                        if (t9.f12425i) {
                            unsafe.putInt(obj2, i18, i11);
                        }
                        iO = AbstractC1100j.O(iQ2);
                        iQ = AbstractC1100j.Q(i11);
                        i15 = i19 + iO + iQ + i11;
                    }
                    break;
                case 49:
                    iH = h0.j(iQ2, (List) unsafe.getObject(obj2, jR), t9.s(i13));
                    i15 = i19 + iH;
                    break;
                case 50:
                    iH = t9.f12433q.f(iQ2, unsafe.getObject(obj2, jR), t9.r(i13));
                    i15 = i19 + iH;
                    break;
                case 51:
                    if (!t9.D(obj2, iQ2, i13)) {
                        i15 = i19;
                    } else {
                        iH = AbstractC1100j.h(iQ2, 0.0d);
                        i15 = i19 + iH;
                    }
                    break;
                case 52:
                    if (!t9.D(obj2, iQ2, i13)) {
                        i15 = i19;
                    } else {
                        iH = AbstractC1100j.p(iQ2, 0.0f);
                        i15 = i19 + iH;
                    }
                    break;
                case 53:
                    if (!t9.D(obj2, iQ2, i13)) {
                        i15 = i19;
                    } else {
                        iH = AbstractC1100j.w(iQ2, W(obj2, jR));
                        i15 = i19 + iH;
                    }
                    break;
                case 54:
                    if (!t9.D(obj2, iQ2, i13)) {
                        i15 = i19;
                    } else {
                        iH = AbstractC1100j.R(iQ2, W(obj2, jR));
                        i15 = i19 + iH;
                    }
                    break;
                case 55:
                    if (!t9.D(obj2, iQ2, i13)) {
                        i15 = i19;
                    } else {
                        iH = AbstractC1100j.u(iQ2, V(obj2, jR));
                        i15 = i19 + iH;
                    }
                    break;
                case 56:
                    if (!t9.D(obj2, iQ2, i13)) {
                        i15 = i19;
                    } else {
                        iH = AbstractC1100j.n(iQ2, 0L);
                        i15 = i19 + iH;
                    }
                    break;
                case 57:
                    if (!t9.D(obj2, iQ2, i13)) {
                        i15 = i19;
                    } else {
                        iH = AbstractC1100j.l(iQ2, 0);
                        i15 = i19 + iH;
                    }
                    break;
                case 58:
                    if (!t9.D(obj2, iQ2, i13)) {
                        i15 = i19;
                    } else {
                        iH = AbstractC1100j.c(iQ2, true);
                        i15 = i19 + iH;
                    }
                    break;
                case 59:
                    if (!t9.D(obj2, iQ2, i13)) {
                        i15 = i19;
                    } else {
                        Object object2 = unsafe.getObject(obj2, jR);
                        iH = object2 instanceof AbstractC1097g ? AbstractC1100j.f(iQ2, (AbstractC1097g) object2) : AbstractC1100j.M(iQ2, (String) object2);
                        i15 = i19 + iH;
                    }
                    break;
                case 60:
                    if (!t9.D(obj2, iQ2, i13)) {
                        i15 = i19;
                    } else {
                        iH = h0.o(iQ2, unsafe.getObject(obj2, jR), t9.s(i13));
                        i15 = i19 + iH;
                    }
                    break;
                case 61:
                    if (!t9.D(obj2, iQ2, i13)) {
                        i15 = i19;
                    } else {
                        iH = AbstractC1100j.f(iQ2, (AbstractC1097g) unsafe.getObject(obj2, jR));
                        i15 = i19 + iH;
                    }
                    break;
                case 62:
                    if (!t9.D(obj2, iQ2, i13)) {
                        i15 = i19;
                    } else {
                        iH = AbstractC1100j.P(iQ2, V(obj2, jR));
                        i15 = i19 + iH;
                    }
                    break;
                case 63:
                    if (!t9.D(obj2, iQ2, i13)) {
                        i15 = i19;
                    } else {
                        iH = AbstractC1100j.j(iQ2, V(obj2, jR));
                        i15 = i19 + iH;
                    }
                    break;
                case 64:
                    if (!t9.D(obj2, iQ2, i13)) {
                        i15 = i19;
                    } else {
                        iH = AbstractC1100j.E(iQ2, 0);
                        i15 = i19 + iH;
                    }
                    break;
                case 65:
                    if (!t9.D(obj2, iQ2, i13)) {
                        i15 = i19;
                    } else {
                        iH = AbstractC1100j.G(iQ2, 0L);
                        i15 = i19 + iH;
                    }
                    break;
                case 66:
                    if (!t9.D(obj2, iQ2, i13)) {
                        i15 = i19;
                    } else {
                        iH = AbstractC1100j.I(iQ2, V(obj2, jR));
                        i15 = i19 + iH;
                    }
                    break;
                case 67:
                    if (!t9.D(obj2, iQ2, i13)) {
                        i15 = i19;
                    } else {
                        iH = AbstractC1100j.K(iQ2, W(obj2, jR));
                        i15 = i19 + iH;
                    }
                    break;
                case 68:
                    if (!t9.D(obj2, iQ2, i13)) {
                        i15 = i19;
                    } else {
                        iH = AbstractC1100j.r(iQ2, (P) unsafe.getObject(obj2, jR), t9.s(i13));
                        i15 = i19 + iH;
                    }
                    break;
                default:
                    i15 = i19;
                    break;
            }
            i13 += 3;
            i12 = 1048575;
        }
        int iT = i15 + t9.t(t9.f12431o, obj2);
        return t9.f12422f ? iT + t9.f12432p.c(obj2).h() : iT;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public Object h() {
        return this.f12429m.a(this.f12421e);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public int i(Object obj) {
        int i10;
        int iF;
        int length = this.f12417a.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iK0 = k0(i12);
            int iQ = Q(i12);
            long jR = R(iK0);
            int iHashCode = 37;
            switch (j0(iK0)) {
                case 0:
                    i10 = i11 * 53;
                    iF = AbstractC1114y.f(Double.doubleToLongBits(p0.u(obj, jR)));
                    i11 = i10 + iF;
                    break;
                case 1:
                    i10 = i11 * 53;
                    iF = Float.floatToIntBits(p0.v(obj, jR));
                    i11 = i10 + iF;
                    break;
                case 2:
                    i10 = i11 * 53;
                    iF = AbstractC1114y.f(p0.x(obj, jR));
                    i11 = i10 + iF;
                    break;
                case 3:
                    i10 = i11 * 53;
                    iF = AbstractC1114y.f(p0.x(obj, jR));
                    i11 = i10 + iF;
                    break;
                case 4:
                    i10 = i11 * 53;
                    iF = p0.w(obj, jR);
                    i11 = i10 + iF;
                    break;
                case 5:
                    i10 = i11 * 53;
                    iF = AbstractC1114y.f(p0.x(obj, jR));
                    i11 = i10 + iF;
                    break;
                case 6:
                    i10 = i11 * 53;
                    iF = p0.w(obj, jR);
                    i11 = i10 + iF;
                    break;
                case 7:
                    i10 = i11 * 53;
                    iF = AbstractC1114y.c(p0.p(obj, jR));
                    i11 = i10 + iF;
                    break;
                case 8:
                    i10 = i11 * 53;
                    iF = ((String) p0.z(obj, jR)).hashCode();
                    i11 = i10 + iF;
                    break;
                case 9:
                    Object objZ = p0.z(obj, jR);
                    if (objZ != null) {
                        iHashCode = objZ.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i11 * 53;
                    iF = p0.z(obj, jR).hashCode();
                    i11 = i10 + iF;
                    break;
                case 11:
                    i10 = i11 * 53;
                    iF = p0.w(obj, jR);
                    i11 = i10 + iF;
                    break;
                case 12:
                    i10 = i11 * 53;
                    iF = p0.w(obj, jR);
                    i11 = i10 + iF;
                    break;
                case 13:
                    i10 = i11 * 53;
                    iF = p0.w(obj, jR);
                    i11 = i10 + iF;
                    break;
                case 14:
                    i10 = i11 * 53;
                    iF = AbstractC1114y.f(p0.x(obj, jR));
                    i11 = i10 + iF;
                    break;
                case 15:
                    i10 = i11 * 53;
                    iF = p0.w(obj, jR);
                    i11 = i10 + iF;
                    break;
                case 16:
                    i10 = i11 * 53;
                    iF = AbstractC1114y.f(p0.x(obj, jR));
                    i11 = i10 + iF;
                    break;
                case 17:
                    Object objZ2 = p0.z(obj, jR);
                    if (objZ2 != null) {
                        iHashCode = objZ2.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i10 = i11 * 53;
                    iF = p0.z(obj, jR).hashCode();
                    i11 = i10 + iF;
                    break;
                case 50:
                    i10 = i11 * 53;
                    iF = p0.z(obj, jR).hashCode();
                    i11 = i10 + iF;
                    break;
                case 51:
                    if (D(obj, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = AbstractC1114y.f(Double.doubleToLongBits(T(obj, jR)));
                        i11 = i10 + iF;
                    }
                    break;
                case 52:
                    if (D(obj, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = Float.floatToIntBits(U(obj, jR));
                        i11 = i10 + iF;
                    }
                    break;
                case 53:
                    if (D(obj, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = AbstractC1114y.f(W(obj, jR));
                        i11 = i10 + iF;
                    }
                    break;
                case 54:
                    if (D(obj, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = AbstractC1114y.f(W(obj, jR));
                        i11 = i10 + iF;
                    }
                    break;
                case 55:
                    if (D(obj, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = V(obj, jR);
                        i11 = i10 + iF;
                    }
                    break;
                case 56:
                    if (D(obj, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = AbstractC1114y.f(W(obj, jR));
                        i11 = i10 + iF;
                    }
                    break;
                case 57:
                    if (D(obj, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = V(obj, jR);
                        i11 = i10 + iF;
                    }
                    break;
                case 58:
                    if (D(obj, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = AbstractC1114y.c(S(obj, jR));
                        i11 = i10 + iF;
                    }
                    break;
                case 59:
                    if (D(obj, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = ((String) p0.z(obj, jR)).hashCode();
                        i11 = i10 + iF;
                    }
                    break;
                case 60:
                    if (D(obj, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = p0.z(obj, jR).hashCode();
                        i11 = i10 + iF;
                    }
                    break;
                case 61:
                    if (D(obj, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = p0.z(obj, jR).hashCode();
                        i11 = i10 + iF;
                    }
                    break;
                case 62:
                    if (D(obj, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = V(obj, jR);
                        i11 = i10 + iF;
                    }
                    break;
                case 63:
                    if (D(obj, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = V(obj, jR);
                        i11 = i10 + iF;
                    }
                    break;
                case 64:
                    if (D(obj, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = V(obj, jR);
                        i11 = i10 + iF;
                    }
                    break;
                case 65:
                    if (D(obj, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = AbstractC1114y.f(W(obj, jR));
                        i11 = i10 + iF;
                    }
                    break;
                case 66:
                    if (D(obj, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = V(obj, jR);
                        i11 = i10 + iF;
                    }
                    break;
                case 67:
                    if (D(obj, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = AbstractC1114y.f(W(obj, jR));
                        i11 = i10 + iF;
                    }
                    break;
                case 68:
                    if (D(obj, iQ, i12)) {
                        i10 = i11 * 53;
                        iF = p0.z(obj, jR).hashCode();
                        i11 = i10 + iF;
                    }
                    break;
            }
        }
        int iHashCode2 = (i11 * 53) + this.f12431o.g(obj).hashCode();
        return this.f12422f ? (iHashCode2 * 53) + this.f12432p.c(obj).hashCode() : iHashCode2;
    }
}
