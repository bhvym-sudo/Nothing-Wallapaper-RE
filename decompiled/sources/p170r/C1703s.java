package p170r;

import A.g;
import A.u;
import A.v;
import B.c;
import androidx.collection.E;
import androidx.collection.F;
import androidx.collection.H;
import androidx.collection.N;
import androidx.collection.O;
import androidx.collection.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.o;
import p089i8.AbstractC1439m;
import p089i8.AbstractC1444s;
import p129m8.i;
import p190t.d;
import p190t.f;
import p219v8.p;

/* JADX INFO: renamed from: r.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1703s implements B, InterfaceC1698p, InterfaceC1718z0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final p180s.a f25547A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final p180s.a f25548B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final f f25549C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private f f25550D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f25551E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private C1703s f25552F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f25553G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final C1715y f25554H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final C1692m f25555I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final i f25556J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final boolean f25557K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f25558L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private p f25559M;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final AbstractC1700q f25560q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final InterfaceC1678f f25561r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final AtomicReference f25562s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Object f25563t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Set f25564u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final L0 f25565v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final f f25566w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final F f25567x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final F f25568y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final f f25569z;

    /* JADX INFO: renamed from: r.s$a */
    private static final class a implements E0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set f25570a;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private F f25574e;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f25571b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f25572c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f25573d = new ArrayList();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final List f25575f = new ArrayList();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final w f25576g = new w(0, 1, null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final w f25577h = new w(0, 1, null);

        public a(Set set) {
            this.f25570a = set;
        }

        private final void g(int i10) {
            if (this.f25575f.isEmpty()) {
                return;
            }
            int i11 = 0;
            int i12 = 0;
            List listP = null;
            w wVar = null;
            w wVar2 = null;
            while (i12 < this.f25577h.b()) {
                if (i10 <= this.f25577h.a(i12)) {
                    Object objRemove = this.f25575f.remove(i12);
                    int i13 = this.f25577h.i(i12);
                    int i14 = this.f25576g.i(i12);
                    if (listP == null) {
                        listP = AbstractC1444s.p(objRemove);
                        wVar2 = new w(0, 1, null);
                        wVar2.e(i13);
                        wVar = new w(0, 1, null);
                        wVar.e(i14);
                    } else {
                        n.f(wVar, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                        n.f(wVar2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                        listP.add(objRemove);
                        wVar2.e(i13);
                        wVar.e(i14);
                    }
                } else {
                    i12++;
                }
            }
            if (listP != null) {
                n.f(wVar, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                n.f(wVar2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                int size = listP.size() - 1;
                while (i11 < size) {
                    int i15 = i11 + 1;
                    int size2 = listP.size();
                    for (int i16 = i15; i16 < size2; i16++) {
                        int iA = wVar2.a(i11);
                        int iA2 = wVar2.a(i16);
                        if (iA < iA2 || (iA2 == iA && wVar.a(i11) < wVar.a(i16))) {
                            AbstractC1705t.f(listP, i11, i16);
                            AbstractC1705t.e(wVar, i11, i16);
                            AbstractC1705t.e(wVar2, i11, i16);
                        }
                    }
                    i11 = i15;
                }
                this.f25572c.addAll(listP);
            }
        }

        private final void h(Object obj, int i10, int i11, int i12) {
            g(i10);
            if (i12 < 0 || i12 >= i10) {
                this.f25572c.add(obj);
                return;
            }
            this.f25575f.add(obj);
            this.f25576g.e(i11);
            this.f25577h.e(i12);
        }

        @Override // p170r.E0
        public void a(F0 f10) {
            this.f25571b.add(f10);
        }

        @Override // p170r.E0
        public void b(F0 f10, int i10, int i11, int i12) {
            h(f10, i10, i11, i12);
        }

        @Override // p170r.E0
        public void c(InterfaceC1686j interfaceC1686j, int i10, int i11, int i12) {
            F fA = this.f25574e;
            if (fA == null) {
                fA = O.a();
                this.f25574e = fA;
            }
            fA.w(interfaceC1686j);
            h(interfaceC1686j, i10, i11, i12);
        }

        public final void d() {
            if (this.f25570a.isEmpty()) {
                return;
            }
            Object objA = f1.f25445a.a("Compose:abandons");
            try {
                Iterator it = this.f25570a.iterator();
                while (it.hasNext()) {
                    F0 f10 = (F0) it.next();
                    it.remove();
                    f10.a();
                }
                A a10 = A.f21846a;
            } finally {
                f1.f25445a.b(objA);
            }
        }

        public final void e() {
            g(Integer.MIN_VALUE);
            if (!this.f25572c.isEmpty()) {
                Object objA = f1.f25445a.a("Compose:onForgotten");
                try {
                    F f10 = this.f25574e;
                    for (int size = this.f25572c.size() - 1; -1 < size; size--) {
                        Object obj = this.f25572c.get(size);
                        if (obj instanceof F0) {
                            this.f25570a.remove(obj);
                            ((F0) obj).b();
                        }
                        if (obj instanceof InterfaceC1686j) {
                            if (f10 == null || !f10.a(obj)) {
                                ((InterfaceC1686j) obj).b();
                            } else {
                                ((InterfaceC1686j) obj).onRelease();
                            }
                        }
                    }
                    A a10 = A.f21846a;
                    f1.f25445a.b(objA);
                } catch (Throwable th) {
                    f1.f25445a.b(objA);
                    throw th;
                }
            }
            if (this.f25571b.isEmpty()) {
                return;
            }
            Object objA2 = f1.f25445a.a("Compose:onRemembered");
            try {
                List list = this.f25571b;
                int size2 = list.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    F0 f11 = (F0) list.get(i10);
                    this.f25570a.remove(f11);
                    f11.c();
                }
                A a11 = A.f21846a;
            } finally {
                f1.f25445a.b(objA2);
            }
        }

        public final void f() {
            if (this.f25573d.isEmpty()) {
                return;
            }
            Object objA = f1.f25445a.a("Compose:sideeffects");
            try {
                List list = this.f25573d;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((p219v8.a) list.get(i10)).invoke();
                }
                this.f25573d.clear();
                A a10 = A.f21846a;
            } finally {
                f1.f25445a.b(objA);
            }
        }
    }

    public C1703s(AbstractC1700q abstractC1700q, InterfaceC1678f interfaceC1678f, i iVar) {
        this.f25560q = abstractC1700q;
        this.f25561r = interfaceC1678f;
        this.f25562s = new AtomicReference(null);
        this.f25563t = new Object();
        Set setL = new F(0, 1, null).l();
        this.f25564u = setL;
        L0 l9 = new L0();
        if (abstractC1700q.c()) {
            l9.m();
        }
        if (abstractC1700q.e()) {
            l9.n();
        }
        this.f25565v = l9;
        this.f25566w = new f();
        this.f25567x = new F(0, 1, null);
        this.f25568y = new F(0, 1, null);
        this.f25569z = new f();
        p180s.a aVar = new p180s.a();
        this.f25547A = aVar;
        p180s.a aVar2 = new p180s.a();
        this.f25548B = aVar2;
        this.f25549C = new f();
        this.f25550D = new f();
        this.f25554H = new C1715y(null, false, 3, null);
        C1692m c1692m = new C1692m(interfaceC1678f, abstractC1700q, l9, setL, aVar, aVar2, this);
        abstractC1700q.n(c1692m);
        this.f25555I = c1692m;
        this.f25556J = iVar;
        this.f25557K = abstractC1700q instanceof A0;
        this.f25559M = C1684i.f25457a.a();
    }

    private final void A() {
        Object andSet = this.f25562s.getAndSet(AbstractC1705t.f25578a);
        if (andSet != null) {
            if (n.d(andSet, AbstractC1705t.f25578a)) {
                AbstractC1696o.s("pending composition has not been applied");
                throw new p079h8.f();
            }
            if (andSet instanceof Set) {
                w((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                AbstractC1696o.s("corrupt pendingModifications drain: " + this.f25562s);
                throw new p079h8.f();
            }
            for (Set set : (Set[]) andSet) {
                w(set, true);
            }
        }
    }

    private final void B() {
        Object andSet = this.f25562s.getAndSet(null);
        if (n.d(andSet, AbstractC1705t.f25578a)) {
            return;
        }
        if (andSet instanceof Set) {
            w((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                w(set, false);
            }
            return;
        }
        if (andSet == null) {
            AbstractC1696o.s("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new p079h8.f();
        }
        AbstractC1696o.s("corrupt pendingModifications drain: " + this.f25562s);
        throw new p079h8.f();
    }

    private final boolean C() {
        return this.f25555I.a0();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x00a5 A[Catch: all -> 0x001e, LOOP:0: B:32:0x0064->B:46:0x00a5, LOOP_END, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x000b, B:6:0x0010, B:14:0x0023, B:16:0x0029, B:19:0x002d, B:21:0x0032, B:22:0x003b, B:24:0x003f, B:25:0x0048, B:27:0x0054, B:29:0x0058, B:32:0x0064, B:34:0x0074, B:36:0x0080, B:38:0x008a, B:42:0x0099, B:46:0x00a5, B:47:0x00a8, B:50:0x00ad), top: B:63:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ad A[Catch: all -> 0x001e, EDGE_INSN: B:50:0x00ad->B:51:0x00b2 BREAK  A[LOOP:0: B:32:0x0064->B:46:0x00a5], TRY_LEAVE, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x000b, B:6:0x0010, B:14:0x0023, B:16:0x0029, B:19:0x002d, B:21:0x0032, B:22:0x003b, B:24:0x003f, B:25:0x0048, B:27:0x0054, B:29:0x0058, B:32:0x0064, B:34:0x0074, B:36:0x0080, B:38:0x008a, B:42:0x0099, B:46:0x00a5, B:47:0x00a8, B:50:0x00ad), top: B:63:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:66:0x00ad A[SYNTHETIC] */
    private final T D(C1714x0 c1714x0, C1674d c1674d, Object obj) {
        synchronized (this.f25563t) {
            try {
                C1703s c1703s = this.f25552F;
                C1703s c1703s2 = null;
                if (c1703s != null) {
                    if (!this.f25565v.x(this.f25553G, c1674d)) {
                        c1703s = null;
                    }
                    c1703s2 = c1703s;
                }
                if (c1703s2 == null) {
                    if (J(c1714x0, obj)) {
                        return T.IMMINENT;
                    }
                    F();
                    if (obj != null && (obj instanceof E)) {
                        Object objB = this.f25550D.d().b(c1714x0);
                        if (objB != null) {
                            if (!(objB instanceof F)) {
                                if (objB != H0.f25305a) {
                                    this.f25550D.a(c1714x0, obj);
                                    break;
                                }
                            } else {
                                F f10 = (F) objB;
                                Object[] objArr = f10.f11289b;
                                long[] jArr = f10.f11288a;
                                int length = jArr.length - 2;
                                if (length < 0) {
                                    this.f25550D.a(c1714x0, obj);
                                    break;
                                }
                                int i10 = 0;
                                loop0: while (true) {
                                    long j9 = jArr[i10];
                                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i10 == length) {
                                            this.f25550D.a(c1714x0, obj);
                                            break;
                                        }
                                        i10++;
                                    } else {
                                        int i11 = 8;
                                        int i12 = 8 - ((~(i10 - length)) >>> 31);
                                        int i13 = 0;
                                        while (i13 < i12) {
                                            if ((j9 & 255) < 128 && objArr[(i10 << 3) + i13] == H0.f25305a) {
                                                break loop0;
                                            }
                                            j9 >>= i11;
                                            i13++;
                                            i11 = i11;
                                        }
                                        if (i12 == i11) {
                                            if (i10 == length) {
                                                i10++;
                                            }
                                        }
                                        this.f25550D.a(c1714x0, obj);
                                        break;
                                    }
                                }
                            }
                        } else {
                            this.f25550D.a(c1714x0, obj);
                            break;
                        }
                    } else {
                        this.f25550D.h(c1714x0, H0.f25305a);
                    }
                }
                if (c1703s2 != null) {
                    return c1703s2.D(c1714x0, c1674d, obj);
                }
                this.f25560q.k(this);
                return n() ? T.DEFERRED : T.SCHEDULED;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void E(Object obj) {
        Object objB = this.f25566w.d().b(obj);
        if (objB == null) {
            return;
        }
        if (!(objB instanceof F)) {
            C1714x0 c1714x0 = (C1714x0) objB;
            if (c1714x0.r(obj) == T.IMMINENT) {
                this.f25549C.a(obj, c1714x0);
                return;
            }
            return;
        }
        F f10 = (F) objB;
        Object[] objArr = f10.f11289b;
        long[] jArr = f10.f11288a;
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
                        C1714x0 c1714x1 = (C1714x0) objArr[(i10 << 3) + i12];
                        if (c1714x1.r(obj) == T.IMMINENT) {
                            this.f25549C.a(obj, c1714x1);
                        }
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

    private final c F() {
        C1715y c1715y = this.f25554H;
        if (c1715y.b()) {
            c1715y.a();
            return null;
        }
        C1715y c1715yI = this.f25560q.i();
        if (c1715yI != null) {
            c1715yI.a();
        }
        c1715y.a();
        if (!n.d(null, null)) {
            c1715y.c(null);
        }
        return null;
    }

    private final f I() {
        f fVar = this.f25550D;
        this.f25550D = new f();
        return fVar;
    }

    private final boolean J(C1714x0 c1714x0, Object obj) {
        return n() && this.f25555I.O0(c1714x0, obj);
    }

    private final void v(Object obj, boolean z9) {
        Object objB = this.f25566w.d().b(obj);
        if (objB == null) {
            return;
        }
        if (!(objB instanceof F)) {
            C1714x0 c1714x0 = (C1714x0) objB;
            if (this.f25549C.f(obj, c1714x0) || c1714x0.r(obj) == T.IGNORED) {
                return;
            }
            if (!c1714x0.s() || z9) {
                this.f25567x.h(c1714x0);
                return;
            } else {
                this.f25568y.h(c1714x0);
                return;
            }
        }
        F f10 = (F) objB;
        Object[] objArr = f10.f11289b;
        long[] jArr = f10.f11288a;
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
                        C1714x0 c1714x1 = (C1714x0) objArr[(i10 << 3) + i12];
                        if (!this.f25549C.f(obj, c1714x1) && c1714x1.r(obj) != T.IGNORED) {
                            if (!c1714x1.s() || z9) {
                                this.f25567x.h(c1714x1);
                            } else {
                                this.f25568y.h(c1714x1);
                            }
                        }
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

    /* JADX WARN: Code duplicated, block: B:107:0x023e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x0240 A[LOOP:6: B:91:0x01ec->B:108:0x0240, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:167:0x0353 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:168:0x0355 A[LOOP:10: B:150:0x0308->B:168:0x0355, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:191:0x00c7 A[EDGE_INSN: B:191:0x00c7->B:37:0x00c7 BREAK  A[LOOP:2: B:24:0x007b->B:35:0x00b7], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x024d A[EDGE_INSN: B:199:0x024d->B:110:0x024d BREAK  A[LOOP:6: B:91:0x01ec->B:108:0x0240], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x035c A[EDGE_INSN: B:205:0x035c->B:170:0x035c BREAK  A[LOOP:10: B:150:0x0308->B:168:0x0355], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x0117 A[EDGE_INSN: B:219:0x0117->B:214:0x0117 BREAK  A[LOOP:13: B:60:0x014c->B:71:0x0180], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b7 A[LOOP:2: B:24:0x007b->B:35:0x00b7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:70:0x017e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x0180 A[LOOP:13: B:60:0x014c->B:71:0x0180, LOOP_END] */
    private final void w(Set set, boolean z9) {
        char c10;
        long j9;
        long j10;
        long j11;
        long[] jArr;
        String str;
        long j12;
        boolean zA;
        long j13;
        long[] jArr2;
        int i10;
        long[] jArr3;
        int i11;
        int i12;
        long j14;
        boolean zD;
        int i13;
        long j15;
        long j16;
        char c11;
        long j17;
        int i14;
        int i15;
        Object obj = null;
        char c12 = 7;
        long j18 = -9187201950435737472L;
        int i16 = 8;
        if (set instanceof d) {
            N nA = ((d) set).a();
            Object[] objArr = nA.f11289b;
            long[] jArr4 = nA.f11288a;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i17 = 0;
                j10 = 128;
                while (true) {
                    long j19 = jArr4[i17];
                    j11 = 255;
                    if ((((~j19) << c12) & j19 & j18) != j18) {
                        int i18 = 8 - ((~(i17 - length)) >>> 31);
                        int i19 = 0;
                        while (i19 < i18) {
                            if ((j19 & 255) < 128) {
                                c11 = c12;
                                Object obj2 = objArr[(i17 << 3) + i19];
                                j17 = j18;
                                if (obj2 instanceof C1714x0) {
                                    ((C1714x0) obj2).r(obj);
                                } else {
                                    v(obj2, z9);
                                    Object objB = this.f25569z.d().b(obj2);
                                    if (objB != null) {
                                        if (objB instanceof F) {
                                            F f10 = (F) objB;
                                            Object[] objArr2 = f10.f11289b;
                                            long[] jArr5 = f10.f11288a;
                                            int length2 = jArr5.length - 2;
                                            if (length2 >= 0) {
                                                j16 = j19;
                                                int i20 = 0;
                                                while (true) {
                                                    long j20 = jArr5[i20];
                                                    int i21 = i16;
                                                    i14 = length;
                                                    if ((((~j20) << c11) & j20 & j17) != j17) {
                                                        int i22 = 8 - ((~(i20 - length2)) >>> 31);
                                                        int i23 = 0;
                                                        while (i23 < i22) {
                                                            if ((j20 & 255) < 128) {
                                                                v((E) objArr2[(i20 << 3) + i23], z9);
                                                            }
                                                            j20 >>= i21;
                                                            i23++;
                                                            i21 = i21;
                                                        }
                                                        if (i22 != i21) {
                                                            break;
                                                        }
                                                        if (i20 != length2) {
                                                            break;
                                                        }
                                                        i20++;
                                                        length = i14;
                                                        i16 = 8;
                                                    } else if (i20 != length2) {
                                                        break;
                                                        break;
                                                    } else {
                                                        i20++;
                                                        length = i14;
                                                        i16 = 8;
                                                    }
                                                }
                                            }
                                        } else {
                                            j16 = j19;
                                            i14 = length;
                                            v((E) objB, z9);
                                        }
                                    }
                                    i15 = 8;
                                }
                                j16 = j19;
                                i14 = length;
                                i15 = 8;
                            } else {
                                j16 = j19;
                                c11 = c12;
                                j17 = j18;
                                i14 = length;
                                i15 = i16;
                            }
                            i19++;
                            length = i14;
                            i16 = i15;
                            c12 = c11;
                            j18 = j17;
                            j19 = j16 >> i15;
                            obj = null;
                        }
                        c10 = c12;
                        j9 = j18;
                        int i24 = length;
                        if (i18 != i16) {
                            break;
                        } else {
                            length = i24;
                        }
                    } else {
                        c10 = c12;
                        j9 = j18;
                    }
                    if (i17 == length) {
                        break;
                    }
                    i17++;
                    c12 = c10;
                    j18 = j9;
                    obj = null;
                    i16 = 8;
                }
            } else {
                c10 = 7;
                j9 = -9187201950435737472L;
                j10 = 128;
                j11 = 255;
            }
        } else {
            c10 = 7;
            j9 = -9187201950435737472L;
            j10 = 128;
            j11 = 255;
            for (Object obj3 : set) {
                if (obj3 instanceof C1714x0) {
                    ((C1714x0) obj3).r(null);
                } else {
                    v(obj3, z9);
                    Object objB2 = this.f25569z.d().b(obj3);
                    if (objB2 != null) {
                        if (objB2 instanceof F) {
                            F f11 = (F) objB2;
                            Object[] objArr3 = f11.f11289b;
                            long[] jArr6 = f11.f11288a;
                            int length3 = jArr6.length - 2;
                            if (length3 >= 0) {
                                int i25 = 0;
                                while (true) {
                                    long j21 = jArr6[i25];
                                    if ((((~j21) << 7) & j21 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i25 != length3) {
                                            break;
                                            break;
                                        }
                                        i25++;
                                    } else {
                                        int i26 = 8 - ((~(i25 - length3)) >>> 31);
                                        for (int i27 = 0; i27 < i26; i27++) {
                                            if ((j21 & 255) < 128) {
                                                v((E) objArr3[(i25 << 3) + i27], z9);
                                            }
                                            j21 >>= 8;
                                        }
                                        if (i26 != 8) {
                                            break;
                                        } else if (i25 != length3) {
                                            break;
                                        } else {
                                            i25++;
                                        }
                                    }
                                }
                            }
                        } else {
                            v((E) objB2, z9);
                        }
                    }
                }
            }
        }
        F f12 = this.f25568y;
        F f13 = this.f25567x;
        String str2 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>";
        if (!z9 || !f12.e()) {
            if (f13.e()) {
                E eD = this.f25566w.d();
                long[] jArr7 = eD.f11281a;
                int length4 = jArr7.length - 2;
                if (length4 >= 0) {
                    int i28 = 0;
                    while (true) {
                        long j22 = jArr7[i28];
                        if ((((~j22) << c10) & j22 & j9) != j9) {
                            int i29 = 8 - ((~(i28 - length4)) >>> 31);
                            int i30 = 0;
                            while (i30 < i29) {
                                if ((j22 & j11) < j10) {
                                    int i31 = (i28 << 3) + i30;
                                    Object obj4 = eD.f11282b[i31];
                                    Object obj5 = eD.f11283c[i31];
                                    if (obj5 instanceof F) {
                                        n.f(obj5, str2);
                                        F f14 = (F) obj5;
                                        Object[] objArr4 = f14.f11289b;
                                        long[] jArr8 = f14.f11288a;
                                        int length5 = jArr8.length - 2;
                                        if (length5 >= 0) {
                                            int i32 = 0;
                                            while (true) {
                                                long j23 = jArr8[i32];
                                                j12 = j22;
                                                if ((((~j23) << c10) & j23 & j9) != j9) {
                                                    int i33 = 8 - ((~(i32 - length5)) >>> 31);
                                                    int i34 = 0;
                                                    while (i34 < i33) {
                                                        if ((j23 & j11) < j10) {
                                                            j13 = j23;
                                                            int i35 = (i32 << 3) + i34;
                                                            if (f13.a((C1714x0) objArr4[i35])) {
                                                                f14.y(i35);
                                                            }
                                                        } else {
                                                            j13 = j23;
                                                        }
                                                        i34++;
                                                        j23 = j13 >> 8;
                                                    }
                                                    if (i33 != 8) {
                                                        break;
                                                    }
                                                    if (i32 != length5) {
                                                        break;
                                                    }
                                                    i32++;
                                                    j22 = j12;
                                                } else if (i32 != length5) {
                                                    break;
                                                    break;
                                                } else {
                                                    i32++;
                                                    j22 = j12;
                                                }
                                            }
                                        } else {
                                            j12 = j22;
                                        }
                                        zA = f14.d();
                                    } else {
                                        j12 = j22;
                                        n.f(obj5, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                        zA = f13.a((C1714x0) obj5);
                                    }
                                    if (zA) {
                                        eD.p(i31);
                                    }
                                } else {
                                    jArr7 = jArr7;
                                    str2 = str2;
                                    j12 = j22;
                                }
                                j22 = j12 >> 8;
                                i30++;
                                jArr7 = jArr7;
                                str2 = str2;
                            }
                            jArr = jArr7;
                            str = str2;
                            if (i29 != 8) {
                                break;
                            }
                        } else {
                            jArr = jArr7;
                            str = str2;
                        }
                        if (i28 == length4) {
                            break;
                        }
                        i28++;
                        jArr7 = jArr;
                        str2 = str;
                    }
                }
                y();
                f13.m();
                return;
            }
            return;
        }
        E eD2 = this.f25566w.d();
        long[] jArr9 = eD2.f11281a;
        int length6 = jArr9.length - 2;
        if (length6 >= 0) {
            int i36 = 0;
            while (true) {
                long j24 = jArr9[i36];
                if ((((~j24) << c10) & j24 & j9) != j9) {
                    int i37 = 8 - ((~(i36 - length6)) >>> 31);
                    int i38 = 0;
                    while (i38 < i37) {
                        if ((j24 & j11) < j10) {
                            int i39 = (i36 << 3) + i38;
                            Object obj6 = eD2.f11282b[i39];
                            Object obj7 = eD2.f11283c[i39];
                            if (obj7 instanceof F) {
                                n.f(obj7, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>");
                                F f15 = (F) obj7;
                                Object[] objArr5 = f15.f11289b;
                                long[] jArr10 = f15.f11288a;
                                jArr3 = jArr9;
                                int length7 = jArr10.length - 2;
                                if (length7 >= 0) {
                                    j14 = j24;
                                    int i40 = 0;
                                    while (true) {
                                        long j25 = jArr10[i40];
                                        i11 = length6;
                                        i12 = i36;
                                        if ((((~j25) << c10) & j25 & j9) != j9) {
                                            int i41 = 8 - ((~(i40 - length7)) >>> 31);
                                            for (int i42 = 0; i42 < i41; i42 = i13 + 1) {
                                                if ((j25 & j11) < j10) {
                                                    i13 = i42;
                                                    int i43 = (i40 << 3) + i13;
                                                    j15 = j25;
                                                    C1714x0 c1714x0 = (C1714x0) objArr5[i43];
                                                    if (f12.a(c1714x0) || f13.a(c1714x0)) {
                                                        f15.y(i43);
                                                    }
                                                } else {
                                                    i13 = i42;
                                                    j15 = j25;
                                                }
                                                j25 = j15 >> 8;
                                            }
                                            if (i41 != 8) {
                                                break;
                                            }
                                            if (i40 != length7) {
                                                break;
                                            }
                                            i40++;
                                            length6 = i11;
                                            i36 = i12;
                                        } else if (i40 != length7) {
                                            break;
                                            break;
                                        } else {
                                            i40++;
                                            length6 = i11;
                                            i36 = i12;
                                        }
                                    }
                                } else {
                                    i11 = length6;
                                    i12 = i36;
                                    j14 = j24;
                                }
                                zD = f15.d();
                            } else {
                                jArr3 = jArr9;
                                i11 = length6;
                                i12 = i36;
                                j14 = j24;
                                n.f(obj7, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                C1714x0 c1714x1 = (C1714x0) obj7;
                                zD = f12.a(c1714x1) || f13.a(c1714x1);
                            }
                            if (zD) {
                                eD2.p(i39);
                            }
                        } else {
                            jArr3 = jArr9;
                            i11 = length6;
                            i12 = i36;
                            j14 = j24;
                        }
                        j24 = j14 >> 8;
                        i38++;
                        length6 = i11;
                        jArr9 = jArr3;
                        i36 = i12;
                    }
                    jArr2 = jArr9;
                    int i44 = length6;
                    int i45 = i36;
                    if (i37 != 8) {
                        break;
                    }
                    length6 = i44;
                    i10 = i45;
                } else {
                    jArr2 = jArr9;
                    i10 = i36;
                }
                if (i10 == length6) {
                    break;
                }
                i36 = i10 + 1;
                jArr9 = jArr2;
            }
        }
        f12.m();
        y();
    }

    private final void x(p180s.a aVar) throws Throwable {
        a aVar2;
        boolean z9;
        long[] jArr;
        int i10;
        a aVar3;
        long[] jArr2;
        long j9;
        char c10;
        long j10;
        int i11;
        boolean zD;
        a aVar4;
        boolean z10 = true;
        a aVar5 = new a(this.f25564u);
        try {
            if (aVar.c()) {
                if (this.f25548B.c()) {
                    aVar5.d();
                    return;
                }
                return;
            }
            try {
                f1 f1Var = f1.f25445a;
                Object objA = f1Var.a("Compose:applyChanges");
                try {
                    this.f25561r.d();
                    O0 o0Z = this.f25565v.z();
                    int i12 = 0;
                    try {
                        aVar.b(this.f25561r, o0Z, aVar5);
                        A a10 = A.f21846a;
                        o0Z.K(true);
                        this.f25561r.h();
                        f1Var.b(objA);
                        aVar5.e();
                        aVar5.f();
                        if (this.f25551E) {
                            Object objA2 = f1Var.a("Compose:unobserve");
                            try {
                                this.f25551E = false;
                                E eD = this.f25566w.d();
                                long[] jArr3 = eD.f11281a;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    int i13 = 0;
                                    while (true) {
                                        long j11 = jArr3[i13];
                                        char c11 = 7;
                                        long j12 = -9187201950435737472L;
                                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i14 = 8;
                                            int i15 = 8 - ((~(i13 - length)) >>> 31);
                                            z9 = z10;
                                            int i16 = i12;
                                            while (i16 < i15) {
                                                if ((j11 & 255) < 128) {
                                                    c10 = c11;
                                                    int i17 = (i13 << 3) + i16;
                                                    j10 = j12;
                                                    Object obj = eD.f11282b[i17];
                                                    Object obj2 = eD.f11283c[i17];
                                                    if (obj2 instanceof F) {
                                                        n.f(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>");
                                                        F f10 = (F) obj2;
                                                        Object[] objArr = f10.f11289b;
                                                        long[] jArr4 = f10.f11288a;
                                                        int i18 = i14;
                                                        int length2 = jArr4.length - 2;
                                                        i10 = i16;
                                                        if (length2 >= 0) {
                                                            jArr2 = jArr3;
                                                            int i19 = 0;
                                                            while (true) {
                                                                long j13 = jArr4[i19];
                                                                j9 = j11;
                                                                if ((((~j13) << c10) & j13 & j10) != j10) {
                                                                    int i20 = 8 - ((~(i19 - length2)) >>> 31);
                                                                    int i21 = 0;
                                                                    while (i21 < i20) {
                                                                        if ((j13 & 255) < 128) {
                                                                            aVar4 = aVar5;
                                                                            int i22 = (i19 << 3) + i21;
                                                                            try {
                                                                                if (!((C1714x0) objArr[i22]).q()) {
                                                                                    f10.y(i22);
                                                                                }
                                                                            } catch (Throwable th) {
                                                                                th = th;
                                                                                f1.f25445a.b(objA2);
                                                                                throw th;
                                                                            }
                                                                        } else {
                                                                            aVar4 = aVar5;
                                                                        }
                                                                        j13 >>= i18;
                                                                        i21++;
                                                                        aVar5 = aVar4;
                                                                    }
                                                                    aVar3 = aVar5;
                                                                    if (i20 != i18) {
                                                                        break;
                                                                    }
                                                                } else {
                                                                    aVar3 = aVar5;
                                                                }
                                                                if (i19 == length2) {
                                                                    break;
                                                                }
                                                                i19++;
                                                                j11 = j9;
                                                                aVar5 = aVar3;
                                                                i18 = 8;
                                                            }
                                                        } else {
                                                            aVar3 = aVar5;
                                                            jArr2 = jArr3;
                                                            j9 = j11;
                                                        }
                                                        zD = f10.d();
                                                    } else {
                                                        i10 = i16;
                                                        aVar3 = aVar5;
                                                        jArr2 = jArr3;
                                                        j9 = j11;
                                                        n.f(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                                        zD = !((C1714x0) obj2).q() ? z9 : false;
                                                    }
                                                    if (zD) {
                                                        eD.p(i17);
                                                    }
                                                    i11 = 8;
                                                } else {
                                                    i10 = i16;
                                                    aVar3 = aVar5;
                                                    jArr2 = jArr3;
                                                    j9 = j11;
                                                    c10 = c11;
                                                    j10 = j12;
                                                    i11 = i14;
                                                }
                                                j11 = j9 >> i11;
                                                i16 = i10 + 1;
                                                c11 = c10;
                                                i14 = i11;
                                                j12 = j10;
                                                jArr3 = jArr2;
                                                aVar5 = aVar3;
                                            }
                                            aVar2 = aVar5;
                                            jArr = jArr3;
                                            if (i15 != i14) {
                                                break;
                                            }
                                        } else {
                                            z9 = z10;
                                            aVar2 = aVar5;
                                            jArr = jArr3;
                                        }
                                        if (i13 == length) {
                                            break;
                                        }
                                        i13++;
                                        z10 = z9;
                                        jArr3 = jArr;
                                        aVar5 = aVar2;
                                        i12 = 0;
                                    }
                                } else {
                                    aVar2 = aVar5;
                                }
                                y();
                                A a11 = A.f21846a;
                                f1.f25445a.b(objA2);
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            aVar2 = aVar5;
                        }
                        if (this.f25548B.c()) {
                            aVar2.d();
                            return;
                        }
                        return;
                    } catch (Throwable th3) {
                        try {
                            o0Z.K(false);
                            throw th3;
                        } catch (Throwable th4) {
                            th = th4;
                            f1.f25445a.b(objA);
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
        }
        if (this.f25548B.c()) {
            aVar5.d();
        }
        throw th;
    }

    private final void y() {
        char c10;
        long j9;
        long j10;
        long j11;
        long[] jArr;
        long[] jArr2;
        long j12;
        int i10;
        char c11;
        long j13;
        long j14;
        int i11;
        boolean zD;
        long[] jArr3;
        int i12;
        int i13;
        E eD = this.f25569z.d();
        long[] jArr4 = eD.f11281a;
        int length = jArr4.length - 2;
        char c12 = 7;
        long j15 = -9187201950435737472L;
        int i14 = 8;
        if (length >= 0) {
            int i15 = 0;
            long j16 = 128;
            while (true) {
                long j17 = jArr4[i15];
                j10 = 255;
                if ((((~j17) << c12) & j17 & j15) != j15) {
                    int i16 = 8 - ((~(i15 - length)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j17 & 255) < j16) {
                            c11 = c12;
                            int i18 = (i15 << 3) + i17;
                            j13 = j15;
                            Object obj = eD.f11282b[i18];
                            Object obj2 = eD.f11283c[i18];
                            if (obj2 instanceof F) {
                                n.f(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>");
                                F f10 = (F) obj2;
                                Object[] objArr = f10.f11289b;
                                long[] jArr5 = f10.f11288a;
                                int length2 = jArr5.length - 2;
                                if (length2 >= 0) {
                                    j14 = j16;
                                    int i19 = 0;
                                    int i20 = i14;
                                    while (true) {
                                        int i21 = length2;
                                        long j18 = jArr5[i19];
                                        j12 = j17;
                                        if ((((~j18) << c11) & j18 & j13) != j13) {
                                            int i22 = 8 - ((~(i19 - i21)) >>> 31);
                                            int i23 = 0;
                                            while (i23 < i22) {
                                                if ((j18 & 255) < j14) {
                                                    jArr3 = jArr4;
                                                    int i24 = (i19 << 3) + i23;
                                                    i12 = i23;
                                                    i13 = i17;
                                                    if (!this.f25566w.c((E) objArr[i24])) {
                                                        f10.y(i24);
                                                    }
                                                } else {
                                                    jArr3 = jArr4;
                                                    i12 = i23;
                                                    i13 = i17;
                                                }
                                                j18 >>= i20;
                                                i23 = i12 + 1;
                                                i17 = i13;
                                                jArr4 = jArr3;
                                            }
                                            jArr2 = jArr4;
                                            i10 = i17;
                                            if (i22 != i20) {
                                                break;
                                            }
                                        } else {
                                            jArr2 = jArr4;
                                            i10 = i17;
                                        }
                                        length2 = i21;
                                        if (i19 == length2) {
                                            break;
                                        }
                                        i19++;
                                        j17 = j12;
                                        i17 = i10;
                                        jArr4 = jArr2;
                                        i20 = 8;
                                    }
                                } else {
                                    jArr2 = jArr4;
                                    j12 = j17;
                                    i10 = i17;
                                    j14 = j16;
                                }
                                zD = f10.d();
                            } else {
                                jArr2 = jArr4;
                                j12 = j17;
                                i10 = i17;
                                j14 = j16;
                                n.f(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                zD = !this.f25566w.c((E) obj2);
                            }
                            if (zD) {
                                eD.p(i18);
                            }
                            i11 = 8;
                        } else {
                            jArr2 = jArr4;
                            j12 = j17;
                            i10 = i17;
                            c11 = c12;
                            j13 = j15;
                            j14 = j16;
                            i11 = i14;
                        }
                        j17 = j12 >> i11;
                        i17 = i10 + 1;
                        i14 = i11;
                        c12 = c11;
                        j15 = j13;
                        j16 = j14;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    c10 = c12;
                    j9 = j15;
                    j11 = j16;
                    if (i16 != i14) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                    c10 = c12;
                    j9 = j15;
                    j11 = j16;
                }
                if (i15 == length) {
                    break;
                }
                i15++;
                c12 = c10;
                j15 = j9;
                j16 = j11;
                jArr4 = jArr;
                i14 = 8;
            }
        } else {
            c10 = 7;
            j9 = -9187201950435737472L;
            j10 = 255;
            j11 = 128;
        }
        if (!this.f25568y.e()) {
            return;
        }
        F f11 = this.f25568y;
        Object[] objArr2 = f11.f11289b;
        long[] jArr6 = f11.f11288a;
        int length3 = jArr6.length - 2;
        if (length3 < 0) {
            return;
        }
        int i25 = 0;
        while (true) {
            long j19 = jArr6[i25];
            if ((((~j19) << c10) & j19 & j9) != j9) {
                int i26 = 8 - ((~(i25 - length3)) >>> 31);
                for (int i27 = 0; i27 < i26; i27++) {
                    if ((j19 & j10) < j11) {
                        int i28 = (i25 << 3) + i27;
                        if (!((C1714x0) objArr2[i28]).s()) {
                            f11.y(i28);
                        }
                    }
                    j19 >>= 8;
                }
                if (i26 != 8) {
                    return;
                }
            }
            if (i25 == length3) {
                return;
            } else {
                i25++;
            }
        }
    }

    private final void z(p pVar) {
        if (this.f25558L) {
            AbstractC1701q0.b("The composition is disposed");
        }
        this.f25559M = pVar;
        this.f25560q.a(this, pVar);
    }

    public final void G(E e10) {
        if (this.f25566w.c(e10)) {
            return;
        }
        this.f25569z.g(e10);
    }

    public final void H(Object obj, C1714x0 c1714x0) {
        this.f25566w.f(obj, c1714x0);
    }

    @Override // p170r.B, p170r.InterfaceC1718z0
    public void a(Object obj) {
        C1714x0 c1714x0D0;
        int i10;
        int i11;
        if (C() || (c1714x0D0 = this.f25555I.d0()) == null) {
            return;
        }
        int i12 = 1;
        c1714x0D0.F(true);
        if (c1714x0D0.v(obj)) {
            return;
        }
        if (obj instanceof v) {
            ((v) obj).m(g.a(1));
        }
        this.f25566w.a(obj, c1714x0D0);
        if (obj instanceof E) {
            E e10 = (E) obj;
            E.a aVarJ = e10.j();
            this.f25569z.g(obj);
            H hB = aVarJ.b();
            Object[] objArr = hB.f11271b;
            long[] jArr = hB.f11270a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i13 = 0;
                while (true) {
                    long j9 = jArr[i13];
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8;
                        int i15 = 8 - ((~(i13 - length)) >>> 31);
                        int i16 = 0;
                        while (i16 < i15) {
                            if ((j9 & 255) < 128) {
                                i11 = i12;
                                u uVar = (u) objArr[(i13 << 3) + i16];
                                if (uVar instanceof v) {
                                    ((v) uVar).m(g.a(i11));
                                }
                                this.f25569z.a(uVar, obj);
                            } else {
                                i11 = i12;
                                i14 = i14;
                            }
                            j9 >>= i14;
                            i16++;
                            i12 = i11;
                            i14 = i14;
                        }
                        i10 = i12;
                        if (i15 != i14) {
                            break;
                        }
                    } else {
                        i10 = i12;
                    }
                    if (i13 == length) {
                        break;
                    }
                    i13++;
                    i12 = i10;
                }
            }
            c1714x0D0.u(e10, aVarJ.a());
        }
    }

    @Override // p170r.InterfaceC1718z0
    public void b(C1714x0 c1714x0) {
        this.f25551E = true;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0059 A[LOOP:0: B:7:0x0016->B:21:0x0059, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x007d A[SYNTHETIC] */
    @Override // p170r.B
    public boolean c(Set set) {
        if (set instanceof d) {
            N nA = ((d) set).a();
            Object[] objArr = nA.f11289b;
            long[] jArr = nA.f11288a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                loop0: while (true) {
                    long j9 = jArr[i10];
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j9) < 128) {
                                Object obj = objArr[(i10 << 3) + i12];
                                if (this.f25566w.c(obj) || this.f25569z.c(obj)) {
                                    break loop0;
                                }
                            }
                            j9 >>= 8;
                        }
                        if (i11 == 8) {
                            if (i10 != length) {
                                i10++;
                            }
                        }
                    } else if (i10 != length) {
                        i10++;
                    }
                }
                return true;
            }
        } else {
            for (Object obj2 : set) {
                if (this.f25566w.c(obj2) || this.f25569z.c(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p170r.InterfaceC1698p
    public void d(p pVar) {
        z(pVar);
    }

    @Override // p170r.InterfaceC1698p
    public void dispose() {
        synchronized (this.f25563t) {
            try {
                if (this.f25555I.m0()) {
                    AbstractC1701q0.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (!this.f25558L) {
                    this.f25558L = true;
                    this.f25559M = C1684i.f25457a.b();
                    p180s.a aVarE0 = this.f25555I.e0();
                    if (aVarE0 != null) {
                        x(aVarE0);
                    }
                    boolean z9 = this.f25565v.r() > 0;
                    if (z9 || !this.f25564u.isEmpty()) {
                        a aVar = new a(this.f25564u);
                        if (z9) {
                            this.f25561r.d();
                            O0 o0Z = this.f25565v.z();
                            try {
                                AbstractC1696o.J(o0Z, aVar);
                                A a10 = A.f21846a;
                                o0Z.K(true);
                                this.f25561r.clear();
                                this.f25561r.h();
                                aVar.e();
                            } catch (Throwable th) {
                                o0Z.K(false);
                                throw th;
                            }
                        }
                        aVar.d();
                    }
                    this.f25555I.N();
                }
                A a11 = A.f21846a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f25560q.q(this);
    }

    @Override // p170r.B
    public Object e(B b10, int i10, p219v8.a aVar) {
        if (b10 == null || n.d(b10, this) || i10 < 0) {
            return aVar.invoke();
        }
        this.f25552F = (C1703s) b10;
        this.f25553G = i10;
        try {
            return aVar.invoke();
        } finally {
            this.f25552F = null;
            this.f25553G = 0;
        }
    }

    @Override // p170r.B
    public void f() {
        synchronized (this.f25563t) {
            try {
                if (this.f25548B.d()) {
                    x(this.f25548B);
                }
                A a10 = A.f21846a;
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.f25564u.isEmpty()) {
                            new a(this.f25564u).d();
                        }
                        throw th;
                    } catch (Exception e10) {
                        r();
                        throw e10;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // p170r.InterfaceC1718z0
    public T g(C1714x0 c1714x0, Object obj) {
        C1703s c1703s;
        if (c1714x0.k()) {
            c1714x0.A(true);
        }
        C1674d c1674dI = c1714x0.i();
        if (c1674dI == null || !c1674dI.b()) {
            return T.IGNORED;
        }
        if (this.f25565v.A(c1674dI)) {
            return !c1714x0.j() ? T.IGNORED : D(c1714x0, c1674dI, obj);
        }
        synchronized (this.f25563t) {
            c1703s = this.f25552F;
        }
        return (c1703s == null || !c1703s.J(c1714x0, obj)) ? T.IGNORED : T.IMMINENT;
    }

    @Override // p170r.InterfaceC1698p
    public boolean h() {
        return this.f25558L;
    }

    @Override // p170r.B
    public void i(p219v8.a aVar) {
        this.f25555I.r0(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p170r.B
    public void k(Set set) {
        Object obj;
        Object objW;
        do {
            obj = this.f25562s.get();
            if (obj == null ? true : n.d(obj, AbstractC1705t.f25578a)) {
                objW = set;
            } else if (obj instanceof Set) {
                objW = new Set[]{obj, set};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f25562s).toString());
                }
                n.f(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                objW = AbstractC1439m.w((Set[]) obj, set);
            }
        } while (!this.f25562s.compareAndSet(obj, objW));
        if (obj == null) {
            synchronized (this.f25563t) {
                B();
                A a10 = A.f21846a;
            }
        }
    }

    @Override // p170r.B
    public void l(p pVar) throws Exception {
        try {
            synchronized (this.f25563t) {
                A();
                f fVarI = I();
                try {
                    F();
                    this.f25555I.H(fVarI, pVar);
                } catch (Exception e10) {
                    this.f25550D = fVarI;
                    throw e10;
                }
            }
        } catch (Throwable th) {
            try {
                if (!this.f25564u.isEmpty()) {
                    new a(this.f25564u).d();
                }
                throw th;
            } catch (Exception e11) {
                r();
                throw e11;
            }
        }
    }

    @Override // p170r.B
    public void m() {
        synchronized (this.f25563t) {
            try {
                x(this.f25547A);
                B();
                A a10 = A.f21846a;
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.f25564u.isEmpty()) {
                            new a(this.f25564u).d();
                        }
                        throw th;
                    } catch (Exception e10) {
                        r();
                        throw e10;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // p170r.B
    public boolean n() {
        return this.f25555I.m0();
    }

    @Override // p170r.B
    public void o(List list) throws Exception {
        boolean z9 = true;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!n.d(((C1677e0) ((o) list.get(i10)).c()).b(), this)) {
                z9 = false;
                break;
            }
        }
        AbstractC1696o.M(z9);
        try {
            this.f25555I.j0(list);
            A a10 = A.f21846a;
        } catch (Throwable th) {
            try {
                if (!this.f25564u.isEmpty()) {
                    new a(this.f25564u).d();
                }
                throw th;
            } catch (Exception e10) {
                r();
                throw e10;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x005d A[Catch: all -> 0x0053, LOOP:0: B:11:0x0023->B:23:0x005d, LOOP_END, TryCatch #0 {all -> 0x0053, blocks: (B:4:0x0003, B:6:0x0012, B:8:0x0016, B:11:0x0023, B:13:0x0033, B:15:0x003f, B:17:0x0048, B:20:0x0055, B:23:0x005d, B:24:0x0060, B:25:0x0065), top: B:30:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0065 A[EDGE_INSN: B:33:0x0065->B:25:0x0065 BREAK  A[LOOP:0: B:11:0x0023->B:23:0x005d], SYNTHETIC] */
    @Override // p170r.B
    public void p(Object obj) {
        synchronized (this.f25563t) {
            try {
                E(obj);
                Object objB = this.f25569z.d().b(obj);
                if (objB != null) {
                    if (objB instanceof F) {
                        F f10 = (F) objB;
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
                                            E((E) objArr[(i10 << 3) + i12]);
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
                    } else {
                        E((E) objB);
                    }
                }
                A a10 = A.f21846a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p170r.B
    public void q(AbstractC1675d0 abstractC1675d0) {
        a aVar = new a(this.f25564u);
        O0 o0Z = abstractC1675d0.a().z();
        try {
            AbstractC1696o.J(o0Z, aVar);
            A a10 = A.f21846a;
            o0Z.K(true);
            aVar.e();
        } catch (Throwable th) {
            o0Z.K(false);
            throw th;
        }
    }

    @Override // p170r.B
    public void r() {
        this.f25562s.set(null);
        this.f25547A.a();
        this.f25548B.a();
        if (this.f25564u.isEmpty()) {
            return;
        }
        new a(this.f25564u).d();
    }

    @Override // p170r.B
    public void s() {
        synchronized (this.f25563t) {
            try {
                this.f25555I.E();
                if (!this.f25564u.isEmpty()) {
                    new a(this.f25564u).d();
                }
                A a10 = A.f21846a;
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.f25564u.isEmpty()) {
                            new a(this.f25564u).d();
                        }
                        throw th;
                    } catch (Exception e10) {
                        r();
                        throw e10;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // p170r.B
    public boolean t() {
        boolean zT0;
        synchronized (this.f25563t) {
            try {
                A();
                try {
                    f fVarI = I();
                    try {
                        F();
                        zT0 = this.f25555I.t0(fVarI);
                        if (!zT0) {
                            B();
                        }
                    } catch (Exception e10) {
                        this.f25550D = fVarI;
                        throw e10;
                    }
                } catch (Throwable th) {
                    try {
                        if (!this.f25564u.isEmpty()) {
                            new a(this.f25564u).d();
                        }
                        throw th;
                    } catch (Exception e11) {
                        r();
                        throw e11;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zT0;
    }

    @Override // p170r.B
    public void u() {
        synchronized (this.f25563t) {
            try {
                for (Object obj : this.f25565v.s()) {
                    C1714x0 c1714x0 = obj instanceof C1714x0 ? (C1714x0) obj : null;
                    if (c1714x0 != null) {
                        c1714x0.invalidate();
                    }
                }
                A a10 = A.f21846a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ C1703s(AbstractC1700q abstractC1700q, InterfaceC1678f interfaceC1678f, i iVar, int i10, AbstractC1457h abstractC1457h) {
        this(abstractC1700q, interfaceC1678f, (i10 & 4) != 0 ? null : iVar);
    }
}
