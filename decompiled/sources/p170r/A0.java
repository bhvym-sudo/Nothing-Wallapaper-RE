package p170r;

import A.v;
import F8.AbstractC0812g;
import F8.AbstractC0825m0;
import F8.C0826n;
import F8.InterfaceC0822l;
import F8.InterfaceC0846x0;
import F8.InterfaceC0847y;
import F8.L;
import F8.M;
import I8.A;
import I8.AbstractC0882h;
import I8.O;
import I8.Q;
import androidx.collection.F;
import androidx.collection.N;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import p079h8.AbstractC1388c;
import p079h8.q;
import p079h8.r;
import p089i8.AbstractC1439m;
import p089i8.AbstractC1444s;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
public final class A0 extends AbstractC1700q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f25199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1682h f25200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f25201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC0846x0 f25202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Throwable f25203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f25204f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List f25205g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private F f25206h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final p190t.b f25207i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f25208j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List f25209k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map f25210l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Map f25211m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List f25212n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Set f25213o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private InterfaceC0822l f25214p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f25215q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f25216r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private b f25217s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f25218t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final A f25219u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final InterfaceC0847y f25220v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final p129m8.i f25221w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final c f25222x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final a f25197y = new a(null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f25198z = 8;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final A f25195A = Q.a(p200u.a.a());

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final AtomicReference f25196B = new AtomicReference(Boolean.FALSE);

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void c(c cVar) {
            p200u.d dVar;
            p200u.d dVarAdd;
            do {
                dVar = (p200u.d) A0.f25195A.getValue();
                dVarAdd = dVar.add((Object) cVar);
                if (dVar == dVarAdd) {
                    return;
                }
            } while (!A0.f25195A.d(dVar, dVarAdd));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(c cVar) {
            p200u.d dVar;
            p200u.d dVarRemove;
            do {
                dVar = (p200u.d) A0.f25195A.getValue();
                dVarRemove = dVar.remove((Object) cVar);
                if (dVar == dVarRemove) {
                    return;
                }
            } while (!A0.f25195A.d(dVar, dVarRemove));
        }

        private a() {
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f25223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Exception f25224b;

        public b(boolean z9, Exception exc) {
            this.f25223a = z9;
            this.f25224b = exc;
        }

        public Exception a() {
            return this.f25224b;
        }
    }

    private final class c {
        public c() {
        }
    }

    public enum d {
        ShutDown,
        ShuttingDown,
        Inactive,
        InactivePendingWork,
        Idle,
        PendingWork
    }

    static final class e extends o implements p219v8.a {
        e() {
            super(0);
        }

        public final void a() {
            InterfaceC0822l interfaceC0822lZ;
            Object obj = A0.this.f25201c;
            A0 a10 = A0.this;
            synchronized (obj) {
                interfaceC0822lZ = a10.Z();
                if (((d) a10.f25219u.getValue()).compareTo(d.ShuttingDown) <= 0) {
                    throw AbstractC0825m0.a("Recomposer shutdown; frame clock awaiter will never resume", a10.f25203e);
                }
            }
            if (interfaceC0822lZ != null) {
                q.a aVar = q.f21862r;
                interfaceC0822lZ.resumeWith(q.b(p079h8.A.f21846a));
            }
        }

        @Override // p219v8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p079h8.A.f21846a;
        }
    }

    static final class f extends o implements p219v8.l {

        static final class a extends o implements p219v8.l {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ A0 f25235r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ Throwable f25236s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(A0 a10, Throwable th) {
                super(1);
                this.f25235r = a10;
                this.f25236s = th;
            }

            public final void a(Throwable th) {
                Object obj = this.f25235r.f25201c;
                A0 a10 = this.f25235r;
                Throwable th2 = this.f25236s;
                synchronized (obj) {
                    if (th2 == null) {
                        th2 = null;
                    } else if (th != null) {
                        try {
                            if (th instanceof CancellationException) {
                                th = null;
                            }
                            if (th != null) {
                                AbstractC1388c.a(th2, th);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    a10.f25203e = th2;
                    a10.f25219u.setValue(d.ShutDown);
                    p079h8.A a11 = p079h8.A.f21846a;
                }
            }

            @Override // p219v8.l
            public /* bridge */ /* synthetic */ Object f(Object obj) {
                a((Throwable) obj);
                return p079h8.A.f21846a;
            }
        }

        f() {
            super(1);
        }

        public final void a(Throwable th) {
            InterfaceC0822l interfaceC0822l;
            InterfaceC0822l interfaceC0822l2;
            CancellationException cancellationExceptionA = AbstractC0825m0.a("Recomposer effect job completed", th);
            Object obj = A0.this.f25201c;
            A0 a10 = A0.this;
            synchronized (obj) {
                try {
                    InterfaceC0846x0 interfaceC0846x0 = a10.f25202d;
                    interfaceC0822l = null;
                    if (interfaceC0846x0 != null) {
                        a10.f25219u.setValue(d.ShuttingDown);
                        if (a10.f25216r) {
                            if (a10.f25214p != null) {
                                interfaceC0822l2 = a10.f25214p;
                            }
                            a10.f25214p = null;
                            interfaceC0846x0.c1(new a(a10, th));
                            interfaceC0822l = interfaceC0822l2;
                        } else {
                            interfaceC0846x0.f(cancellationExceptionA);
                        }
                        interfaceC0822l2 = null;
                        a10.f25214p = null;
                        interfaceC0846x0.c1(new a(a10, th));
                        interfaceC0822l = interfaceC0822l2;
                    } else {
                        a10.f25203e = cancellationExceptionA;
                        a10.f25219u.setValue(d.ShutDown);
                        p079h8.A a11 = p079h8.A.f21846a;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (interfaceC0822l != null) {
                q.a aVar = q.f21862r;
                interfaceC0822l.resumeWith(q.b(p079h8.A.f21846a));
            }
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            a((Throwable) obj);
            return p079h8.A.f21846a;
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f25237q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f25238r;

        g(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            g gVar = new g(eVar);
            gVar.f25238r = obj;
            return gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f25237q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            return kotlin.coroutines.jvm.internal.b.a(((d) this.f25238r) == d.ShutDown);
        }

        @Override // p219v8.p
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object invoke(d dVar, p129m8.e eVar) {
            return ((g) create(dVar, eVar)).invokeSuspend(p079h8.A.f21846a);
        }
    }

    static final class h extends o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ F f25239r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ B f25240s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(F f10, B b10) {
            super(0);
            this.f25239r = f10;
            this.f25240s = b10;
        }

        public final void a() {
            F f10 = this.f25239r;
            B b10 = this.f25240s;
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
                            b10.p(objArr[(i10 << 3) + i12]);
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

        @Override // p219v8.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return p079h8.A.f21846a;
        }
    }

    static final class i extends o implements p219v8.l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ B f25241r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(B b10) {
            super(1);
            this.f25241r = b10;
        }

        public final void a(Object obj) {
            this.f25241r.a(obj);
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            a(obj);
            return p079h8.A.f21846a;
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f25242q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f25243r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f25244s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ p219v8.q f25246u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ InterfaceC1669a0 f25247v;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f25248q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private /* synthetic */ Object f25249r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ p219v8.q f25250s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ InterfaceC1669a0 f25251t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p219v8.q qVar, InterfaceC1669a0 interfaceC1669a0, p129m8.e eVar) {
                super(2, eVar);
                this.f25250s = qVar;
                this.f25251t = interfaceC1669a0;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                a aVar = new a(this.f25250s, this.f25251t, eVar);
                aVar.f25249r = obj;
                return aVar;
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f25248q;
                if (i10 == 0) {
                    r.b(obj);
                    L l9 = (L) this.f25249r;
                    p219v8.q qVar = this.f25250s;
                    InterfaceC1669a0 interfaceC1669a0 = this.f25251t;
                    this.f25248q = 1;
                    if (qVar.e(l9, interfaceC1669a0, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                }
                return p079h8.A.f21846a;
            }
        }

        static final class b extends o implements p {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ A0 f25252r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(A0 a10) {
                super(2);
                this.f25252r = a10;
            }

            public final void a(Set set, A.k kVar) {
                InterfaceC0822l interfaceC0822lZ;
                Object obj = this.f25252r.f25201c;
                A0 a10 = this.f25252r;
                synchronized (obj) {
                    try {
                        if (((d) a10.f25219u.getValue()).compareTo(d.Idle) >= 0) {
                            F f10 = a10.f25206h;
                            if (set instanceof p190t.d) {
                                N nA = ((p190t.d) set).a();
                                Object[] objArr = nA.f11289b;
                                long[] jArr = nA.f11288a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i10 = 0;
                                    while (true) {
                                        long j9 = jArr[i10];
                                        if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                                            for (int i12 = 0; i12 < i11; i12++) {
                                                if ((255 & j9) < 128) {
                                                    Object obj2 = objArr[(i10 << 3) + i12];
                                                    if (!(obj2 instanceof v) || ((v) obj2).l(A.g.a(1))) {
                                                        f10.h(obj2);
                                                    }
                                                }
                                                j9 >>= 8;
                                            }
                                            if (i11 != 8) {
                                                break;
                                            }
                                        }
                                        if (i10 == length) {
                                            break;
                                        } else {
                                            i10++;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj3 : set) {
                                    if (!(obj3 instanceof v) || ((v) obj3).l(A.g.a(1))) {
                                        f10.h(obj3);
                                    }
                                }
                            }
                            interfaceC0822lZ = a10.Z();
                        } else {
                            interfaceC0822lZ = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (interfaceC0822lZ != null) {
                    q.a aVar = q.f21862r;
                    interfaceC0822lZ.resumeWith(q.b(p079h8.A.f21846a));
                }
            }

            @Override // p219v8.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((Set) obj, (A.k) obj2);
                return p079h8.A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(p219v8.q qVar, InterfaceC1669a0 interfaceC1669a0, p129m8.e eVar) {
            super(2, eVar);
            this.f25246u = qVar;
            this.f25247v = interfaceC1669a0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            j jVar = A0.this.new j(this.f25246u, this.f25247v, eVar);
            jVar.f25244s = obj;
            return jVar;
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((j) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x009f A[Catch: all -> 0x00a3, TryCatch #2 {all -> 0x00a3, blocks: (B:28:0x0099, B:30:0x009f, B:33:0x00a5), top: B:58:0x0099 }] */
        /* JADX WARN: Code duplicated, block: B:46:0x00ce A[Catch: all -> 0x00d2, TryCatch #1 {all -> 0x00d2, blocks: (B:44:0x00c8, B:46:0x00ce, B:49:0x00d4), top: B:56:0x00c8 }] */
        /* JADX WARN: Code duplicated, block: B:56:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:58:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC0846x0 interfaceC0846x0K;
            A.f fVar;
            Throwable th;
            List listH0;
            Object obj2;
            A0 a10;
            Object obj3;
            A0 a11;
            Object objE = p139n8.b.e();
            int i10 = this.f25243r;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fVar = (A.f) this.f25242q;
                interfaceC0846x0K = (InterfaceC0846x0) this.f25244s;
                try {
                    r.b(obj);
                    fVar.dispose();
                    obj3 = A0.this.f25201c;
                    a11 = A0.this;
                    synchronized (obj3) {
                        try {
                            if (a11.f25202d == interfaceC0846x0K) {
                                a11.f25202d = null;
                            }
                            a11.Z();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    A0.f25197y.d(A0.this.f25222x);
                    return p079h8.A.f21846a;
                } catch (Throwable th3) {
                    th = th3;
                    fVar.dispose();
                    obj2 = A0.this.f25201c;
                    a10 = A0.this;
                    synchronized (obj2) {
                        try {
                            if (a10.f25202d == interfaceC0846x0K) {
                                a10.f25202d = null;
                            }
                            a10.Z();
                            A0.f25197y.d(A0.this.f25222x);
                            throw th;
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                }
            }
            r.b(obj);
            interfaceC0846x0K = F8.A0.k(((L) this.f25244s).w0());
            A0.this.v0(interfaceC0846x0K);
            A.f fVarI = A.k.f25e.i(new b(A0.this));
            A0.f25197y.c(A0.this.f25222x);
            try {
                Object obj4 = A0.this.f25201c;
                A0 a12 = A0.this;
                synchronized (obj4) {
                    listH0 = a12.h0();
                }
                int size = listH0.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((B) listH0.get(i11)).u();
                }
                a aVar = new a(this.f25246u, this.f25247v, null);
                this.f25244s = interfaceC0846x0K;
                this.f25242q = fVarI;
                this.f25243r = 1;
                if (M.e(aVar, this) == objE) {
                    return objE;
                }
                fVar = fVarI;
                fVar.dispose();
                obj3 = A0.this.f25201c;
                a11 = A0.this;
                synchronized (obj3) {
                    if (a11.f25202d == interfaceC0846x0K) {
                        a11.f25202d = null;
                    }
                    a11.Z();
                    A0.f25197y.d(A0.this.f25222x);
                    return p079h8.A.f21846a;
                }
            } catch (Throwable th5) {
                fVar = fVarI;
                th = th5;
                fVar.dispose();
                obj2 = A0.this.f25201c;
                a10 = A0.this;
                synchronized (obj2) {
                    if (a10.f25202d == interfaceC0846x0K) {
                        a10.f25202d = null;
                    }
                    a10.Z();
                }
                A0.f25197y.d(A0.this.f25222x);
                throw th;
            }
        }
    }

    static final class k extends kotlin.coroutines.jvm.internal.l implements p219v8.q {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f25254q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f25255r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f25256s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f25257t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f25258u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f25259v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        Object f25260w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        Object f25261x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f25262y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        /* synthetic */ Object f25263z;

        static final class a extends o implements p219v8.l {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ A0 f25264r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ F f25265s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ F f25266t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ List f25267u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ List f25268v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            final /* synthetic */ F f25269w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            final /* synthetic */ List f25270x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            final /* synthetic */ F f25271y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            final /* synthetic */ Set f25272z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(A0 a10, F f10, F f11, List list, List list2, F f12, List list3, F f13, Set set) {
                super(1);
                this.f25264r = a10;
                this.f25265s = f10;
                this.f25266t = f11;
                this.f25267u = list;
                this.f25268v = list2;
                this.f25269w = f12;
                this.f25270x = list3;
                this.f25271y = f13;
                this.f25272z = set;
            }

            /* JADX WARN: Code duplicated, block: B:100:0x0187  */
            /* JADX WARN: Code duplicated, block: B:105:0x019a  */
            /* JADX WARN: Code duplicated, block: B:109:0x01ab  */
            /* JADX WARN: Code duplicated, block: B:111:0x01b7  */
            /* JADX WARN: Code duplicated, block: B:113:0x01bd  */
            /* JADX WARN: Code duplicated, block: B:124:0x01db  */
            /* JADX WARN: Code duplicated, block: B:126:0x01df A[LOOP:4: B:106:0x019b->B:126:0x01df, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:129:0x01ec  */
            /* JADX WARN: Code duplicated, block: B:142:0x0211 A[Catch: all -> 0x00d9, PHI: r2
              0x0211: PHI (r2v16 r.A0) = (r2v0 r.A0), (r2v4 r.A0) binds: [B:102:0x018f, B:131:0x01f1] A[DONT_GENERATE, DONT_INLINE], TryCatch #17 {all -> 0x00d9, blocks: (B:11:0x0049, B:12:0x0050, B:22:0x007b, B:23:0x007c, B:24:0x0082, B:26:0x008b, B:29:0x0096, B:31:0x009f, B:43:0x00d5, B:57:0x00f7, B:58:0x00fa, B:52:0x00ec, B:59:0x00fb, B:95:0x017c, B:98:0x0183, B:99:0x0186, B:88:0x0164, B:101:0x018b, B:137:0x0206, B:140:0x020d, B:141:0x0210, B:130:0x01ee, B:142:0x0211, B:143:0x0215, B:145:0x0219, B:146:0x021a, B:148:0x022e, B:149:0x022f, B:161:0x025a, B:163:0x0263, B:192:0x02f5, B:194:0x02fb, B:195:0x02fe, B:197:0x0307, B:203:0x031f, B:167:0x0272, B:168:0x0276, B:191:0x02f4, B:204:0x032c, B:205:0x032d, B:212:0x0343, B:213:0x0346, B:210:0x033d, B:214:0x0347, B:215:0x0348, B:144:0x0216, B:13:0x0051, B:15:0x005b, B:16:0x0060, B:21:0x0072, B:32:0x00a9, B:34:0x00b0, B:39:0x00c2, B:41:0x00c9, B:169:0x0277, B:171:0x0282, B:173:0x028e, B:175:0x0294, B:178:0x029e, B:179:0x02a1, B:181:0x02ad, B:183:0x02bb, B:185:0x02c1, B:189:0x02de, B:188:0x02d0, B:190:0x02e3), top: B:249:0x0049, inners: #9, #11, #12, #13, #18 }] */
            /* JADX WARN: Code duplicated, block: B:228:0x0108 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:234:0x0191 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:239:0x0216 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:260:0x01ee A[EDGE_INSN: B:260:0x01ee->B:130:0x01ee BREAK  A[LOOP:4: B:106:0x019b->B:126:0x01df], SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:261:0x01ee A[EDGE_INSN: B:261:0x01ee->B:130:0x01ee BREAK  A[LOOP:4: B:106:0x019b->B:126:0x01df], SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:263:0x0164 A[EDGE_INSN: B:263:0x0164->B:88:0x0164 BREAK  A[LOOP:6: B:65:0x0119->B:84:0x0159], SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:264:0x0164 A[EDGE_INSN: B:264:0x0164->B:88:0x0164 BREAK  A[LOOP:6: B:65:0x0119->B:84:0x0159], SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:266:0x014c A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:64:0x0118  */
            /* JADX WARN: Code duplicated, block: B:68:0x012b  */
            /* JADX WARN: Code duplicated, block: B:70:0x0135  */
            /* JADX WARN: Code duplicated, block: B:72:0x013b  */
            /* JADX WARN: Code duplicated, block: B:82:0x0155  */
            /* JADX WARN: Code duplicated, block: B:84:0x0159 A[LOOP:6: B:65:0x0119->B:84:0x0159, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:87:0x0162  */
            public final void a(long j9) {
                List list;
                Set set;
                Set set2;
                long j10;
                F f10;
                Object[] objArr;
                char c10;
                long[] jArr;
                long j11;
                int length;
                int i10;
                int i11;
                long j12;
                int i12;
                int i13;
                A0 a10;
                Object[] objArr2;
                long[] jArr2;
                int length2;
                int i14;
                long j13;
                long[] jArr3;
                int i15;
                int i16;
                List list2;
                if (this.f25264r.d0()) {
                    A0 a11 = this.f25264r;
                    f1 f1Var = f1.f25445a;
                    Object objA = f1Var.a("Recomposer:animation");
                    try {
                        a11.f25200b.m(j9);
                        A.k.f25e.n();
                        p079h8.A a12 = p079h8.A.f21846a;
                        f1Var.b(objA);
                    } catch (Throwable th) {
                        f1.f25445a.b(objA);
                        throw th;
                    }
                }
                A0 a13 = this.f25264r;
                F f11 = this.f25265s;
                F f12 = this.f25266t;
                List list3 = this.f25267u;
                List list4 = this.f25268v;
                F f13 = this.f25269w;
                List list5 = this.f25270x;
                F f14 = this.f25271y;
                Set set3 = this.f25272z;
                Object objA2 = f1.f25445a.a("Recomposer:recompose");
                try {
                    a13.t0();
                    synchronized (a13.f25201c) {
                        try {
                            p190t.b bVar = a13.f25207i;
                            int iP = bVar.p();
                            if (iP > 0) {
                                Object[] objArrO = bVar.o();
                                int i17 = 0;
                                do {
                                    list3.add((B) objArrO[i17]);
                                    i17++;
                                } while (i17 < iP);
                            }
                            a13.f25207i.j();
                            p079h8.A a14 = p079h8.A.f21846a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    f11.m();
                    f12.m();
                    while (true) {
                        if (list3.isEmpty() && list4.isEmpty()) {
                            break;
                        }
                        try {
                            try {
                                int size = list3.size();
                                for (int i18 = 0; i18 < size; i18++) {
                                    B b10 = (B) list3.get(i18);
                                    B bO0 = a13.o0(b10, f11);
                                    if (bO0 != null) {
                                        list5.add(bO0);
                                        p079h8.A a15 = p079h8.A.f21846a;
                                    }
                                    f12.h(b10);
                                }
                                list3.clear();
                                if (f11.e() || a13.f25207i.s()) {
                                    synchronized (a13.f25201c) {
                                        try {
                                            List listH0 = a13.h0();
                                            int size2 = listH0.size();
                                            for (int i19 = 0; i19 < size2; i19++) {
                                                B b11 = (B) listH0.get(i19);
                                                if (!f12.a(b11) && b11.c(set3)) {
                                                    list3.add(b11);
                                                }
                                            }
                                            p190t.b bVar2 = a13.f25207i;
                                            int iP2 = bVar2.p();
                                            int i20 = 0;
                                            int i21 = 0;
                                            while (i20 < iP2) {
                                                B b12 = (B) bVar2.o()[i20];
                                                if (f12.a(b12) || list3.contains(b12)) {
                                                    set2 = set3;
                                                    if (i21 > 0) {
                                                        bVar2.o()[i20 - i21] = bVar2.o()[i20];
                                                    }
                                                } else {
                                                    set2 = set3;
                                                    list3.add(b12);
                                                    i21++;
                                                }
                                                i20++;
                                                set3 = set2;
                                            }
                                            set = set3;
                                            int i22 = iP2 - i21;
                                            AbstractC1439m.q(bVar2.o(), null, i22, iP2);
                                            bVar2.A(i22);
                                            p079h8.A a16 = p079h8.A.f21846a;
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                } else {
                                    set = set3;
                                }
                                if (list3.isEmpty()) {
                                    try {
                                        k.x(list4, a13);
                                        while (!list4.isEmpty()) {
                                            f13.v(a13.n0(list4, f11));
                                            k.x(list4, a13);
                                        }
                                    } catch (Exception e10) {
                                        A0.q0(a13, e10, null, true, 2, null);
                                        k.w(a13, list3, list4, list5, f13, f14, f11, f12);
                                    }
                                }
                                set3 = set;
                            } catch (Exception e11) {
                                A0.q0(a13, e11, null, true, 2, null);
                                list = list3;
                                try {
                                    k.w(a13, list, list4, list5, f13, f14, f11, f12);
                                    list.clear();
                                } catch (Throwable th4) {
                                    th = th4;
                                    list.clear();
                                    throw th;
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            list = list3;
                            list.clear();
                            throw th;
                        }
                        f1.f25445a.b(objA2);
                    }
                    if (list5.isEmpty()) {
                        j10 = 255;
                        if (f13.e()) {
                            f14.u(f13);
                            objArr = f13.f11289b;
                            c10 = 7;
                            jArr = f13.f11288a;
                            j11 = 128;
                            length = jArr.length - 2;
                            if (length >= 0) {
                                i10 = 0;
                                while (true) {
                                    i11 = length;
                                    j12 = jArr[i10];
                                    f10 = f11;
                                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        length = i11;
                                        if (i10 != length) {
                                            break;
                                            break;
                                        } else {
                                            i10++;
                                            f11 = f10;
                                        }
                                    } else {
                                        i12 = 8 - ((~(i10 - i11)) >>> 31);
                                        for (i13 = 0; i13 < i12; i13++) {
                                            if ((j12 & 255) < 128) {
                                                ((B) objArr[(i10 << 3) + i13]).f();
                                            }
                                            j12 >>= 8;
                                        }
                                        if (i12 == 8) {
                                            break;
                                            break;
                                        }
                                        length = i11;
                                        if (i10 != length) {
                                            break;
                                            break;
                                        } else {
                                            i10++;
                                            f11 = f10;
                                        }
                                    }
                                }
                            } else {
                                f10 = f11;
                            }
                            f13.m();
                            f11 = f10;
                        } else {
                            c10 = 7;
                            j11 = 128;
                        }
                        if (f14.e()) {
                            objArr2 = f14.f11289b;
                            jArr2 = f14.f11288a;
                            length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                i14 = 0;
                                while (true) {
                                    j13 = jArr2[i14];
                                    a10 = a13;
                                    jArr3 = jArr2;
                                    if ((((~j13) << c10) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        i15 = 8 - ((~(i14 - length2)) >>> 31);
                                        i16 = 0;
                                        while (i16 < i15) {
                                            if ((j13 & j10) < j11) {
                                                ((B) objArr2[(i14 << 3) + i16]).s();
                                            }
                                            j13 >>= 8;
                                            i16++;
                                            j10 = 255;
                                        }
                                        if (i15 == 8) {
                                            break;
                                            break;
                                        }
                                    }
                                    if (i14 != length2) {
                                        break;
                                        break;
                                    }
                                    i14++;
                                    a13 = a10;
                                    jArr2 = jArr3;
                                    j10 = 255;
                                }
                            } else {
                                a10 = a13;
                            }
                            f14.m();
                            a13 = a10;
                            synchronized (a13.f25201c) {
                                a13.Z();
                                A.k.f25e.g();
                                f12.m();
                                f11.m();
                                a13.f25213o = null;
                                p079h8.A a17 = p079h8.A.f21846a;
                            }
                        } else {
                            synchronized (a13.f25201c) {
                                a13.Z();
                                A.k.f25e.g();
                                f12.m();
                                f11.m();
                                a13.f25213o = null;
                                p079h8.A a18 = p079h8.A.f21846a;
                            }
                        }
                    } else {
                        a13.f25199a = a13.b0() + 1;
                        try {
                            try {
                                int size3 = list5.size();
                                for (int i23 = 0; i23 < size3; i23++) {
                                    f14.h((B) list5.get(i23));
                                }
                                int size4 = list5.size();
                                for (int i24 = 0; i24 < size4; i24++) {
                                    ((B) list5.get(i24)).m();
                                }
                                list5.clear();
                                j10 = 255;
                                if (f13.e()) {
                                    try {
                                        try {
                                            f14.u(f13);
                                            objArr = f13.f11289b;
                                            c10 = 7;
                                            jArr = f13.f11288a;
                                            j11 = 128;
                                            length = jArr.length - 2;
                                            if (length >= 0) {
                                                i10 = 0;
                                                while (true) {
                                                    i11 = length;
                                                    j12 = jArr[i10];
                                                    f10 = f11;
                                                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        length = i11;
                                                        if (i10 != length) {
                                                            break;
                                                            break;
                                                        } else {
                                                            i10++;
                                                            f11 = f10;
                                                        }
                                                    } else {
                                                        i12 = 8 - ((~(i10 - i11)) >>> 31);
                                                        while (i13 < i12) {
                                                            if ((j12 & 255) < 128) {
                                                                try {
                                                                    ((B) objArr[(i10 << 3) + i13]).f();
                                                                } catch (Exception e12) {
                                                                    e = e12;
                                                                    A0.q0(a13, e, null, false, 6, null);
                                                                    try {
                                                                        k.w(a13, list3, list4, list5, f13, f14, f10, f12);
                                                                        f13.m();
                                                                        f1.f25445a.b(objA2);
                                                                    } catch (Throwable th6) {
                                                                        th = th6;
                                                                        f13 = f13;
                                                                        f13.m();
                                                                        throw th;
                                                                    }
                                                                }
                                                            }
                                                            j12 >>= 8;
                                                        }
                                                        if (i12 == 8) {
                                                            break;
                                                        }
                                                        length = i11;
                                                        if (i10 != length) {
                                                            break;
                                                        }
                                                        i10++;
                                                        f11 = f10;
                                                    }
                                                }
                                            } else {
                                                f10 = f11;
                                            }
                                            f13.m();
                                            f11 = f10;
                                        } catch (Throwable th7) {
                                            th = th7;
                                            f13.m();
                                            throw th;
                                        }
                                    } catch (Exception e13) {
                                        e = e13;
                                        f10 = f11;
                                    }
                                } else {
                                    c10 = 7;
                                    j11 = 128;
                                }
                                if (f14.e()) {
                                    try {
                                        try {
                                            objArr2 = f14.f11289b;
                                            jArr2 = f14.f11288a;
                                            length2 = jArr2.length - 2;
                                            if (length2 >= 0) {
                                                i14 = 0;
                                                while (true) {
                                                    j13 = jArr2[i14];
                                                    a10 = a13;
                                                    jArr3 = jArr2;
                                                    if ((((~j13) << c10) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        i15 = 8 - ((~(i14 - length2)) >>> 31);
                                                        i16 = 0;
                                                        while (i16 < i15) {
                                                            if ((j13 & j10) < j11) {
                                                                try {
                                                                    ((B) objArr2[(i14 << 3) + i16]).s();
                                                                } catch (Exception e14) {
                                                                    e = e14;
                                                                    A0 a19 = a10;
                                                                    A0.q0(a19, e, null, false, 6, null);
                                                                    try {
                                                                        k.w(a19, list3, list4, list5, f13, f14, f11, f12);
                                                                        f14.m();
                                                                        f1.f25445a.b(objA2);
                                                                    } catch (Throwable th8) {
                                                                        th = th8;
                                                                        f14 = f14;
                                                                        f14.m();
                                                                        throw th;
                                                                    }
                                                                }
                                                            }
                                                            j13 >>= 8;
                                                            i16++;
                                                            j10 = 255;
                                                        }
                                                        if (i15 == 8) {
                                                            break;
                                                        }
                                                    }
                                                    if (i14 != length2) {
                                                        break;
                                                    }
                                                    i14++;
                                                    a13 = a10;
                                                    jArr2 = jArr3;
                                                    j10 = 255;
                                                }
                                            } else {
                                                a10 = a13;
                                            }
                                            f14.m();
                                            a13 = a10;
                                            synchronized (a13.f25201c) {
                                                a13.Z();
                                            }
                                            A.k.f25e.g();
                                            f12.m();
                                            f11.m();
                                            a13.f25213o = null;
                                            p079h8.A a110 = p079h8.A.f21846a;
                                        } catch (Throwable th9) {
                                            th = th9;
                                            f14.m();
                                            throw th;
                                        }
                                    } catch (Exception e15) {
                                        e = e15;
                                        a10 = a13;
                                    }
                                } else {
                                    synchronized (a13.f25201c) {
                                        a13.Z();
                                        A.k.f25e.g();
                                        f12.m();
                                        f11.m();
                                        a13.f25213o = null;
                                        p079h8.A a111 = p079h8.A.f21846a;
                                    }
                                }
                            } catch (Exception e16) {
                                A0.q0(a13, e16, null, false, 6, null);
                                try {
                                    k.w(a13, list3, list4, list5, f13, f14, f11, f12);
                                    list5.clear();
                                } catch (Throwable th10) {
                                    th = th10;
                                    list2 = list5;
                                    list2.clear();
                                    throw th;
                                }
                            }
                        } catch (Throwable th11) {
                            th = th11;
                            list2 = list5;
                            list2.clear();
                            throw th;
                        }
                    }
                    f1.f25445a.b(objA2);
                } catch (Throwable th12) {
                    f1.f25445a.b(objA2);
                    throw th12;
                }
            }

            @Override // p219v8.l
            public /* bridge */ /* synthetic */ Object f(Object obj) {
                a(((Number) obj).longValue());
                return p079h8.A.f21846a;
            }
        }

        k(p129m8.e eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:21:0x0077 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:22:0x0079 A[Catch: all -> 0x002b, LOOP:1: B:12:0x0043->B:22:0x0079, LOOP_END, TryCatch #0 {all -> 0x002b, blocks: (B:4:0x000d, B:6:0x001a, B:9:0x002e, B:12:0x0043, B:14:0x0054, B:16:0x005e, B:18:0x0064, B:19:0x0071, B:24:0x0084, B:27:0x0091, B:29:0x009c, B:31:0x00a6, B:33:0x00ac, B:34:0x00b6, B:37:0x00be, B:38:0x00c1, B:41:0x00d1, B:43:0x00dc, B:45:0x00e6, B:47:0x00ec, B:48:0x00f9, B:51:0x0101, B:52:0x0104, B:22:0x0079), top: B:57:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:36:0x00bc A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:37:0x00be A[Catch: all -> 0x002b, LOOP:3: B:27:0x0091->B:37:0x00be, LOOP_END, TryCatch #0 {all -> 0x002b, blocks: (B:4:0x000d, B:6:0x001a, B:9:0x002e, B:12:0x0043, B:14:0x0054, B:16:0x005e, B:18:0x0064, B:19:0x0071, B:24:0x0084, B:27:0x0091, B:29:0x009c, B:31:0x00a6, B:33:0x00ac, B:34:0x00b6, B:37:0x00be, B:38:0x00c1, B:41:0x00d1, B:43:0x00dc, B:45:0x00e6, B:47:0x00ec, B:48:0x00f9, B:51:0x0101, B:52:0x0104, B:22:0x0079), top: B:57:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:50:0x00ff A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:51:0x0101 A[Catch: all -> 0x002b, LOOP:5: B:41:0x00d1->B:51:0x0101, LOOP_END, TryCatch #0 {all -> 0x002b, blocks: (B:4:0x000d, B:6:0x001a, B:9:0x002e, B:12:0x0043, B:14:0x0054, B:16:0x005e, B:18:0x0064, B:19:0x0071, B:24:0x0084, B:27:0x0091, B:29:0x009c, B:31:0x00a6, B:33:0x00ac, B:34:0x00b6, B:37:0x00be, B:38:0x00c1, B:41:0x00d1, B:43:0x00dc, B:45:0x00e6, B:47:0x00ec, B:48:0x00f9, B:51:0x0101, B:52:0x0104, B:22:0x0079), top: B:57:0x000d }] */
        /* JADX WARN: Code duplicated, block: B:61:0x0084 A[EDGE_INSN: B:61:0x0084->B:24:0x0084 BREAK  A[LOOP:1: B:12:0x0043->B:22:0x0079], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:66:0x00c1 A[EDGE_INSN: B:66:0x00c1->B:38:0x00c1 BREAK  A[LOOP:3: B:27:0x0091->B:37:0x00be], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:71:0x0104 A[EDGE_INSN: B:71:0x0104->B:52:0x0104 BREAK  A[LOOP:5: B:41:0x00d1->B:51:0x0101], SYNTHETIC] */
        public static final void w(A0 a10, List list, List list2, List list3, F f10, F f11, F f12, F f13) {
            char c10;
            long j9;
            long j10;
            synchronized (a10.f25201c) {
                try {
                    list.clear();
                    list2.clear();
                    int size = list3.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        B b10 = (B) list3.get(i10);
                        b10.r();
                        a10.u0(b10);
                    }
                    list3.clear();
                    Object[] objArr = f10.f11289b;
                    long[] jArr = f10.f11288a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i11 = 0;
                        j9 = 255;
                        while (true) {
                            long j11 = jArr[i11];
                            c10 = 7;
                            j10 = -9187201950435737472L;
                            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i11 != length) {
                                    break;
                                    break;
                                }
                                i11++;
                            } else {
                                int i12 = 8 - ((~(i11 - length)) >>> 31);
                                for (int i13 = 0; i13 < i12; i13++) {
                                    if ((j11 & 255) < 128) {
                                        B b11 = (B) objArr[(i11 << 3) + i13];
                                        b11.r();
                                        a10.u0(b11);
                                    }
                                    j11 >>= 8;
                                }
                                if (i12 != 8) {
                                    break;
                                } else if (i11 != length) {
                                    break;
                                } else {
                                    i11++;
                                }
                            }
                        }
                    } else {
                        c10 = 7;
                        j9 = 255;
                        j10 = -9187201950435737472L;
                    }
                    f10.m();
                    Object[] objArr2 = f11.f11289b;
                    long[] jArr2 = f11.f11288a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i14 = 0;
                        while (true) {
                            long j12 = jArr2[i14];
                            if ((((~j12) << c10) & j12 & j10) == j10) {
                                if (i14 != length2) {
                                    break;
                                    break;
                                }
                                i14++;
                            } else {
                                int i15 = 8 - ((~(i14 - length2)) >>> 31);
                                for (int i16 = 0; i16 < i15; i16++) {
                                    if ((j12 & j9) < 128) {
                                        ((B) objArr2[(i14 << 3) + i16]).s();
                                    }
                                    j12 >>= 8;
                                }
                                if (i15 != 8) {
                                    break;
                                } else if (i14 != length2) {
                                    break;
                                } else {
                                    i14++;
                                }
                            }
                        }
                    }
                    f11.m();
                    f12.m();
                    Object[] objArr3 = f13.f11289b;
                    long[] jArr3 = f13.f11288a;
                    int length3 = jArr3.length - 2;
                    if (length3 >= 0) {
                        int i17 = 0;
                        while (true) {
                            long j13 = jArr3[i17];
                            if ((((~j13) << c10) & j13 & j10) == j10) {
                                if (i17 != length3) {
                                    break;
                                    break;
                                }
                                i17++;
                            } else {
                                int i18 = 8 - ((~(i17 - length3)) >>> 31);
                                for (int i19 = 0; i19 < i18; i19++) {
                                    if ((j13 & j9) < 128) {
                                        B b12 = (B) objArr3[(i17 << 3) + i19];
                                        b12.r();
                                        a10.u0(b12);
                                    }
                                    j13 >>= 8;
                                }
                                if (i18 != 8) {
                                    break;
                                } else if (i17 != length3) {
                                    break;
                                } else {
                                    i17++;
                                }
                            }
                        }
                    }
                    f13.m();
                    p079h8.A a11 = p079h8.A.f21846a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void x(List list, A0 a10) {
            list.clear();
            synchronized (a10.f25201c) {
                try {
                    List list2 = a10.f25209k;
                    int size = list2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        list.add((C1677e0) list2.get(i10));
                    }
                    a10.f25209k.clear();
                    p079h8.A a11 = p079h8.A.f21846a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:14:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:17:0x00d1  */
        /* JADX WARN: Code duplicated, block: B:20:0x00df  */
        /* JADX WARN: Code duplicated, block: B:23:0x0101  */
        /* JADX WARN: Code duplicated, block: B:25:0x010f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0101 -> B:24:0x0109). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x010f -> B:12:0x00ac). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 283
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: r.A0.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p219v8.q
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public final Object e(L l9, InterfaceC1669a0 interfaceC1669a0, p129m8.e eVar) {
            k kVar = A0.this.new k(eVar);
            kVar.f25263z = interfaceC1669a0;
            return kVar.invokeSuspend(p079h8.A.f21846a);
        }
    }

    static final class l extends o implements p219v8.l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ B f25273r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ F f25274s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(B b10, F f10) {
            super(1);
            this.f25273r = b10;
            this.f25274s = f10;
        }

        public final void a(Object obj) {
            this.f25273r.p(obj);
            F f10 = this.f25274s;
            if (f10 != null) {
                f10.h(obj);
            }
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            a(obj);
            return p079h8.A.f21846a;
        }
    }

    public A0(p129m8.i iVar) {
        C1682h c1682h = new C1682h(new e());
        this.f25200b = c1682h;
        this.f25201c = new Object();
        this.f25204f = new ArrayList();
        this.f25206h = new F(0, 1, null);
        this.f25207i = new p190t.b(new B[16], 0);
        this.f25208j = new ArrayList();
        this.f25209k = new ArrayList();
        this.f25210l = new LinkedHashMap();
        this.f25211m = new LinkedHashMap();
        this.f25219u = Q.a(d.Inactive);
        InterfaceC0847y interfaceC0847yA = F8.A0.a((InterfaceC0846x0) iVar.b(InterfaceC0846x0.f1901e));
        interfaceC0847yA.c1(new f());
        this.f25220v = interfaceC0847yA;
        this.f25221w = iVar.z(c1682h).z(interfaceC0847yA);
        this.f25222x = new c();
    }

    private final void U(B b10) {
        this.f25204f.add(b10);
        this.f25205g = null;
    }

    private final void V(A.c cVar) {
        try {
            if (cVar.C() instanceof A.l.a) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
            cVar.d();
        } catch (Throwable th) {
            cVar.d();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object W(p129m8.e eVar) {
        C0826n c0826n;
        if (g0()) {
            return p079h8.A.f21846a;
        }
        C0826n c0826n2 = new C0826n(p139n8.b.c(eVar), 1);
        c0826n2.G();
        synchronized (this.f25201c) {
            if (g0()) {
                c0826n = c0826n2;
            } else {
                this.f25214p = c0826n2;
                c0826n = null;
            }
        }
        if (c0826n != null) {
            q.a aVar = q.f21862r;
            c0826n.resumeWith(q.b(p079h8.A.f21846a));
        }
        Object objA = c0826n2.A();
        if (objA == p139n8.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
    }

    private final void Y() {
        this.f25204f.clear();
        this.f25205g = AbstractC1444s.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC0822l Z() {
        d dVar;
        int i10 = 0;
        int i11 = 1;
        AbstractC1457h abstractC1457h = null;
        if (((d) this.f25219u.getValue()).compareTo(d.ShuttingDown) <= 0) {
            Y();
            this.f25206h = new F(i10, i11, abstractC1457h);
            this.f25207i.j();
            this.f25208j.clear();
            this.f25209k.clear();
            this.f25212n = null;
            InterfaceC0822l interfaceC0822l = this.f25214p;
            if (interfaceC0822l != null) {
                InterfaceC0822l.a.a(interfaceC0822l, null, 1, null);
            }
            this.f25214p = null;
            this.f25217s = null;
            return null;
        }
        if (this.f25217s != null) {
            dVar = d.Inactive;
        } else if (this.f25202d == null) {
            this.f25206h = new F(i10, i11, abstractC1457h);
            this.f25207i.j();
            dVar = e0() ? d.InactivePendingWork : d.Inactive;
        } else {
            dVar = (this.f25207i.s() || this.f25206h.e() || !this.f25208j.isEmpty() || !this.f25209k.isEmpty() || this.f25215q > 0 || e0()) ? d.PendingWork : d.Idle;
        }
        this.f25219u.setValue(dVar);
        if (dVar != d.PendingWork) {
            return null;
        }
        InterfaceC0822l interfaceC0822l2 = this.f25214p;
        this.f25214p = null;
        return interfaceC0822l2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a0() {
        int i10;
        List listL;
        synchronized (this.f25201c) {
            try {
                if (this.f25210l.isEmpty()) {
                    listL = AbstractC1444s.l();
                } else {
                    List listW = AbstractC1444s.w(this.f25210l.values());
                    this.f25210l.clear();
                    listL = new ArrayList(listW.size());
                    int size = listW.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        C1677e0 c1677e0 = (C1677e0) listW.get(i11);
                        listL.add(p079h8.v.a(c1677e0, this.f25211m.get(c1677e0)));
                    }
                    this.f25211m.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int size2 = listL.size();
        for (i10 = 0; i10 < size2; i10++) {
            p079h8.o oVar = (p079h8.o) listL.get(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean d0() {
        boolean zE0;
        synchronized (this.f25201c) {
            zE0 = e0();
        }
        return zE0;
    }

    private final boolean e0() {
        return !this.f25218t && this.f25200b.l();
    }

    private final boolean f0() {
        return this.f25207i.s() || e0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean g0() {
        boolean z9;
        synchronized (this.f25201c) {
            z9 = this.f25206h.e() || this.f25207i.s() || e0();
        }
        return z9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List h0() {
        List listL = this.f25205g;
        if (listL == null) {
            List list = this.f25204f;
            listL = list.isEmpty() ? AbstractC1444s.l() : new ArrayList(list);
            this.f25205g = listL;
        }
        return listL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean i0() {
        boolean z9;
        synchronized (this.f25201c) {
            z9 = this.f25216r;
        }
        if (!z9) {
            return true;
        }
        Iterator it = this.f25220v.B().iterator();
        while (it.hasNext()) {
            if (((InterfaceC0846x0) it.next()).a()) {
                return true;
            }
        }
        return false;
    }

    private final void l0(B b10) {
        synchronized (this.f25201c) {
            List list = this.f25209k;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (n.d(((C1677e0) list.get(i10)).b(), b10)) {
                    p079h8.A a10 = p079h8.A.f21846a;
                    ArrayList arrayList = new ArrayList();
                    m0(arrayList, this, b10);
                    while (!arrayList.isEmpty()) {
                        n0(arrayList, null);
                        m0(arrayList, this, b10);
                    }
                    return;
                }
            }
        }
    }

    private static final void m0(List list, A0 a10, B b10) {
        list.clear();
        synchronized (a10.f25201c) {
            try {
                Iterator it = a10.f25209k.iterator();
                while (it.hasNext()) {
                    C1677e0 c1677e0 = (C1677e0) it.next();
                    if (n.d(c1677e0.b(), b10)) {
                        list.add(c1677e0);
                        it.remove();
                    }
                }
                p079h8.A a11 = p079h8.A.f21846a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List n0(List list, F f10) {
        ArrayList arrayList;
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            B b10 = ((C1677e0) obj).b();
            Object arrayList2 = map.get(b10);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(b10, arrayList2);
            }
            ((ArrayList) arrayList2).add(obj);
        }
        for (Map.Entry entry : map.entrySet()) {
            B b11 = (B) entry.getKey();
            List list2 = (List) entry.getValue();
            AbstractC1696o.M(!b11.n());
            A.c cVarO = A.k.f25e.o(r0(b11), z0(b11, f10));
            try {
                A.k kVarL = cVarO.l();
                try {
                    synchronized (this.f25201c) {
                        arrayList = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i11 = 0; i11 < size2; i11++) {
                            C1677e0 c1677e0 = (C1677e0) list2.get(i11);
                            Map map2 = this.f25210l;
                            c1677e0.c();
                            arrayList.add(p079h8.v.a(c1677e0, B0.a(map2, null)));
                        }
                    }
                    int size3 = arrayList.size();
                    for (int i12 = 0; i12 < size3; i12++) {
                        if (((p079h8.o) arrayList.get(i12)).d() != null) {
                            int size4 = arrayList.size();
                            for (int i13 = 0; i13 < size4; i13++) {
                                if (((p079h8.o) arrayList.get(i13)).d() == null) {
                                    ArrayList arrayList3 = new ArrayList(arrayList.size());
                                    int size5 = arrayList.size();
                                    for (int i14 = 0; i14 < size5; i14++) {
                                        p079h8.o oVar = (p079h8.o) arrayList.get(i14);
                                        C1677e0 c1677e1 = oVar.d() == null ? (C1677e0) oVar.c() : null;
                                        if (c1677e1 != null) {
                                            arrayList3.add(c1677e1);
                                        }
                                    }
                                    synchronized (this.f25201c) {
                                        AbstractC1444s.z(this.f25209k, arrayList3);
                                        p079h8.A a10 = p079h8.A.f21846a;
                                    }
                                    ArrayList arrayList4 = new ArrayList(arrayList.size());
                                    int size6 = arrayList.size();
                                    for (int i15 = 0; i15 < size6; i15++) {
                                        Object obj2 = arrayList.get(i15);
                                        if (((p079h8.o) obj2).d() != null) {
                                            arrayList4.add(obj2);
                                        }
                                    }
                                    arrayList = arrayList4;
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    b11.o(arrayList);
                    p079h8.A a11 = p079h8.A.f21846a;
                    cVarO.s(kVarL);
                    V(cVarO);
                } catch (Throwable th) {
                    cVarO.s(kVarL);
                    throw th;
                }
            } catch (Throwable th2) {
                V(cVarO);
                throw th2;
            }
        }
        return AbstractC1444s.r0(map.keySet());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final B o0(B b10, F f10) {
        Set set;
        if (b10.n() || b10.h() || ((set = this.f25213o) != null && set.contains(b10))) {
            return null;
        }
        A.c cVarO = A.k.f25e.o(r0(b10), z0(b10, f10));
        try {
            A.k kVarL = cVarO.l();
            if (f10 != null) {
                try {
                    if (f10.e()) {
                        b10.i(new h(f10, b10));
                    }
                } catch (Throwable th) {
                    cVarO.s(kVarL);
                    throw th;
                }
            }
            boolean zT = b10.t();
            cVarO.s(kVarL);
            V(cVarO);
            if (zT) {
                return b10;
            }
            return null;
        } catch (Throwable th2) {
            V(cVarO);
            throw th2;
        }
    }

    private final void p0(Exception exc, B b10, boolean z9) throws Exception {
        int i10 = 0;
        if (!((Boolean) f25196B.get()).booleanValue() || (exc instanceof C1688k)) {
            synchronized (this.f25201c) {
                b bVar = this.f25217s;
                if (bVar != null) {
                    throw bVar.a();
                }
                this.f25217s = new b(false, exc);
                p079h8.A a10 = p079h8.A.f21846a;
            }
            throw exc;
        }
        synchronized (this.f25201c) {
            try {
                AbstractC1670b.d("Error was captured in composition while live edit was enabled.", exc);
                this.f25208j.clear();
                this.f25207i.j();
                this.f25206h = new F(i10, 1, null);
                this.f25209k.clear();
                this.f25210l.clear();
                this.f25211m.clear();
                this.f25217s = new b(z9, exc);
                if (b10 != null) {
                    u0(b10);
                }
                Z();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static /* synthetic */ void q0(A0 a10, Exception exc, B b10, boolean z9, int i10, Object obj) throws Exception {
        if ((i10 & 2) != 0) {
            b10 = null;
        }
        if ((i10 & 4) != 0) {
            z9 = false;
        }
        a10.p0(exc, b10, z9);
    }

    private final p219v8.l r0(B b10) {
        return new i(b10);
    }

    private final Object s0(p219v8.q qVar, p129m8.e eVar) {
        Object objG = AbstractC0812g.g(this.f25200b, new j(qVar, AbstractC1671b0.a(eVar.getContext()), null), eVar);
        return objG == p139n8.b.e() ? objG : p079h8.A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean t0() {
        List listH0;
        boolean zF0;
        int i10 = 1;
        synchronized (this.f25201c) {
            if (this.f25206h.d()) {
                return f0();
            }
            Set setA = p190t.e.a(this.f25206h);
            AbstractC1457h abstractC1457h = null;
            int i11 = 0;
            this.f25206h = new F(i11, i10, abstractC1457h);
            synchronized (this.f25201c) {
                listH0 = h0();
            }
            try {
                int size = listH0.size();
                for (int i12 = 0; i12 < size; i12++) {
                    ((B) listH0.get(i12)).k(setA);
                    if (((d) this.f25219u.getValue()).compareTo(d.ShuttingDown) <= 0) {
                        break;
                    }
                }
                synchronized (this.f25201c) {
                    this.f25206h = new F(i11, i10, abstractC1457h);
                    p079h8.A a10 = p079h8.A.f21846a;
                }
                synchronized (this.f25201c) {
                    if (Z() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zF0 = f0();
                }
                return zF0;
            } catch (Throwable th) {
                synchronized (this.f25201c) {
                    this.f25206h.j(setA);
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u0(B b10) {
        List arrayList = this.f25212n;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f25212n = arrayList;
        }
        if (!arrayList.contains(b10)) {
            arrayList.add(b10);
        }
        w0(b10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v0(InterfaceC0846x0 interfaceC0846x0) {
        synchronized (this.f25201c) {
            Throwable th = this.f25203e;
            if (th != null) {
                throw th;
            }
            if (((d) this.f25219u.getValue()).compareTo(d.ShuttingDown) <= 0) {
                throw new IllegalStateException("Recomposer shut down");
            }
            if (this.f25202d != null) {
                throw new IllegalStateException("Recomposer already running");
            }
            this.f25202d = interfaceC0846x0;
            Z();
        }
    }

    private final void w0(B b10) {
        this.f25204f.remove(b10);
        this.f25205g = null;
    }

    private final p219v8.l z0(B b10, F f10) {
        return new l(b10, f10);
    }

    public final void X() {
        synchronized (this.f25201c) {
            try {
                if (((d) this.f25219u.getValue()).compareTo(d.Idle) >= 0) {
                    this.f25219u.setValue(d.ShuttingDown);
                }
                p079h8.A a10 = p079h8.A.f21846a;
            } catch (Throwable th) {
                throw th;
            }
        }
        InterfaceC0846x0.a.a(this.f25220v, null, 1, null);
    }

    @Override // p170r.AbstractC1700q
    public void a(B b10, p pVar) throws Exception {
        boolean zN = b10.n();
        try {
            A.k.a aVar = A.k.f25e;
            A.c cVarO = aVar.o(r0(b10), z0(b10, null));
            try {
                A.k kVarL = cVarO.l();
                try {
                    b10.l(pVar);
                    p079h8.A a10 = p079h8.A.f21846a;
                    cVarO.s(kVarL);
                    V(cVarO);
                    if (!zN) {
                        aVar.g();
                    }
                    synchronized (this.f25201c) {
                        if (((d) this.f25219u.getValue()).compareTo(d.ShuttingDown) > 0 && !h0().contains(b10)) {
                            U(b10);
                        }
                    }
                    try {
                        l0(b10);
                        try {
                            b10.m();
                            b10.f();
                            if (zN) {
                                return;
                            }
                            aVar.g();
                        } catch (Exception e10) {
                            q0(this, e10, null, false, 6, null);
                        }
                    } catch (Exception e11) {
                        p0(e11, b10, true);
                    }
                } catch (Throwable th) {
                    cVarO.s(kVarL);
                    throw th;
                }
            } catch (Throwable th2) {
                V(cVarO);
                throw th2;
            }
        } catch (Exception e12) {
            p0(e12, b10, true);
        }
    }

    public final long b0() {
        return this.f25199a;
    }

    @Override // p170r.AbstractC1700q
    public boolean c() {
        return ((Boolean) f25196B.get()).booleanValue();
    }

    public final O c0() {
        return this.f25219u;
    }

    @Override // p170r.AbstractC1700q
    public boolean d() {
        return false;
    }

    @Override // p170r.AbstractC1700q
    public boolean e() {
        return false;
    }

    @Override // p170r.AbstractC1700q
    public int g() {
        return 1000;
    }

    @Override // p170r.AbstractC1700q
    public p129m8.i h() {
        return this.f25221w;
    }

    @Override // p170r.AbstractC1700q
    public void j(C1677e0 c1677e0) {
        InterfaceC0822l interfaceC0822lZ;
        synchronized (this.f25201c) {
            this.f25209k.add(c1677e0);
            interfaceC0822lZ = Z();
        }
        if (interfaceC0822lZ != null) {
            q.a aVar = q.f21862r;
            interfaceC0822lZ.resumeWith(q.b(p079h8.A.f21846a));
        }
    }

    public final Object j0(p129m8.e eVar) {
        Object objY = AbstractC0882h.y(c0(), new g(null), eVar);
        return objY == p139n8.b.e() ? objY : p079h8.A.f21846a;
    }

    @Override // p170r.AbstractC1700q
    public void k(B b10) {
        InterfaceC0822l interfaceC0822lZ;
        synchronized (this.f25201c) {
            if (this.f25207i.k(b10)) {
                interfaceC0822lZ = null;
            } else {
                this.f25207i.b(b10);
                interfaceC0822lZ = Z();
            }
        }
        if (interfaceC0822lZ != null) {
            q.a aVar = q.f21862r;
            interfaceC0822lZ.resumeWith(q.b(p079h8.A.f21846a));
        }
    }

    public final void k0() {
        synchronized (this.f25201c) {
            this.f25218t = true;
            p079h8.A a10 = p079h8.A.f21846a;
        }
    }

    @Override // p170r.AbstractC1700q
    public AbstractC1675d0 l(C1677e0 c1677e0) {
        AbstractC1675d0 abstractC1675d0;
        synchronized (this.f25201c) {
            abstractC1675d0 = (AbstractC1675d0) this.f25211m.remove(c1677e0);
        }
        return abstractC1675d0;
    }

    @Override // p170r.AbstractC1700q
    public void m(Set set) {
    }

    @Override // p170r.AbstractC1700q
    public void q(B b10) {
        synchronized (this.f25201c) {
            w0(b10);
            this.f25207i.u(b10);
            this.f25208j.remove(b10);
            p079h8.A a10 = p079h8.A.f21846a;
        }
    }

    public final void x0() {
        InterfaceC0822l interfaceC0822lZ;
        synchronized (this.f25201c) {
            if (this.f25218t) {
                this.f25218t = false;
                interfaceC0822lZ = Z();
            } else {
                interfaceC0822lZ = null;
            }
        }
        if (interfaceC0822lZ != null) {
            q.a aVar = q.f21862r;
            interfaceC0822lZ.resumeWith(q.b(p079h8.A.f21846a));
        }
    }

    public final Object y0(p129m8.e eVar) {
        Object objS0 = s0(new k(null), eVar);
        return objS0 == p139n8.b.e() ? objS0 : p079h8.A.f21846a;
    }
}
