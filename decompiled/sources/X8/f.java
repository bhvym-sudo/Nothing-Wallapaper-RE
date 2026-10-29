package X8;

import com.airbnb.lottie.utils.Utils;
import e9.C1350e;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.E;
import p079h8.A;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements Closeable {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final b f9076S = new b(null);

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private static final m f9077T;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final T8.d f9078A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final X8.l f9079B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private long f9080C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private long f9081D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private long f9082E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private long f9083F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private long f9084G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private long f9085H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final m f9086I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private m f9087J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private long f9088K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private long f9089L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private long f9090M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private long f9091N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Socket f9092O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final X8.j f9093P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private final d f9094Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private final Set f9095R;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f9096q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final c f9097r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Map f9098s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f9099t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f9100u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f9101v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f9102w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final T8.e f9103x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final T8.d f9104y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final T8.d f9105z;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f9106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final T8.e f9107b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Socket f9108c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f9109d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public e9.g f9110e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public e9.f f9111f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private c f9112g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private X8.l f9113h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f9114i;

        public a(boolean z9, T8.e taskRunner) {
            kotlin.jvm.internal.n.h(taskRunner, "taskRunner");
            this.f9106a = z9;
            this.f9107b = taskRunner;
            this.f9112g = c.f9116b;
            this.f9113h = X8.l.f9218b;
        }

        public final f a() {
            return new f(this);
        }

        public final boolean b() {
            return this.f9106a;
        }

        public final String c() {
            String str = this.f9109d;
            if (str != null) {
                return str;
            }
            kotlin.jvm.internal.n.r("connectionName");
            return null;
        }

        public final c d() {
            return this.f9112g;
        }

        public final int e() {
            return this.f9114i;
        }

        public final X8.l f() {
            return this.f9113h;
        }

        public final e9.f g() {
            e9.f fVar = this.f9111f;
            if (fVar != null) {
                return fVar;
            }
            kotlin.jvm.internal.n.r("sink");
            return null;
        }

        public final Socket h() {
            Socket socket = this.f9108c;
            if (socket != null) {
                return socket;
            }
            kotlin.jvm.internal.n.r("socket");
            return null;
        }

        public final e9.g i() {
            e9.g gVar = this.f9110e;
            if (gVar != null) {
                return gVar;
            }
            kotlin.jvm.internal.n.r("source");
            return null;
        }

        public final T8.e j() {
            return this.f9107b;
        }

        public final a k(c listener) {
            kotlin.jvm.internal.n.h(listener, "listener");
            this.f9112g = listener;
            return this;
        }

        public final a l(int i10) {
            this.f9114i = i10;
            return this;
        }

        public final void m(String str) {
            kotlin.jvm.internal.n.h(str, "<set-?>");
            this.f9109d = str;
        }

        public final void n(e9.f fVar) {
            kotlin.jvm.internal.n.h(fVar, "<set-?>");
            this.f9111f = fVar;
        }

        public final void o(Socket socket) {
            kotlin.jvm.internal.n.h(socket, "<set-?>");
            this.f9108c = socket;
        }

        public final void p(e9.g gVar) {
            kotlin.jvm.internal.n.h(gVar, "<set-?>");
            this.f9110e = gVar;
        }

        public final a q(Socket socket, String peerName, e9.g source, e9.f sink) {
            String str;
            kotlin.jvm.internal.n.h(socket, "socket");
            kotlin.jvm.internal.n.h(peerName, "peerName");
            kotlin.jvm.internal.n.h(source, "source");
            kotlin.jvm.internal.n.h(sink, "sink");
            o(socket);
            if (this.f9106a) {
                str = Q8.d.f6933i + ' ' + peerName;
            } else {
                str = "MockWebServer " + peerName;
            }
            m(str);
            p(source);
            n(sink);
            return this;
        }
    }

    public static final class b {
        public /* synthetic */ b(AbstractC1457h abstractC1457h) {
            this();
        }

        public final m a() {
            return f.f9077T;
        }

        private b() {
        }
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f9115a = new b(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f9116b = new a();

        public static final class a extends c {
            a() {
            }

            @Override // X8.f.c
            public void c(X8.i stream) {
                kotlin.jvm.internal.n.h(stream, "stream");
                stream.d(X8.b.REFUSED_STREAM, null);
            }
        }

        public static final class b {
            public /* synthetic */ b(AbstractC1457h abstractC1457h) {
                this();
            }

            private b() {
            }
        }

        public void b(f connection, m settings) {
            kotlin.jvm.internal.n.h(connection, "connection");
            kotlin.jvm.internal.n.h(settings, "settings");
        }

        public abstract void c(X8.i iVar);
    }

    public final class d implements X8.h.c, p219v8.a {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final X8.h f9117q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ f f9118r;

        public static final class a extends T8.a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ f f9119e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ E f9120f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, boolean z9, f fVar, E e10) {
                super(str, z9);
                this.f9119e = fVar;
                this.f9120f = e10;
            }

            @Override // T8.a
            public long f() {
                this.f9119e.T0().b(this.f9119e, (m) this.f9120f.f22779q);
                return -1L;
            }
        }

        public static final class b extends T8.a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ f f9121e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ X8.i f9122f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, boolean z9, f fVar, X8.i iVar) {
                super(str, z9);
                this.f9121e = fVar;
                this.f9122f = iVar;
            }

            @Override // T8.a
            public long f() {
                try {
                    this.f9121e.T0().c(this.f9122f);
                    return -1L;
                } catch (IOException e10) {
                    Z8.h.f9546a.g().j("Http2Connection.Listener failure for " + this.f9121e.O0(), 4, e10);
                    try {
                        this.f9122f.d(X8.b.PROTOCOL_ERROR, e10);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            }
        }

        public static final class c extends T8.a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ f f9123e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f9124f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ int f9125g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str, boolean z9, f fVar, int i10, int i11) {
                super(str, z9);
                this.f9123e = fVar;
                this.f9124f = i10;
                this.f9125g = i11;
            }

            @Override // T8.a
            public long f() {
                this.f9123e.B1(true, this.f9124f, this.f9125g);
                return -1L;
            }
        }

        /* JADX INFO: renamed from: X8.f$d$d, reason: collision with other inner class name */
        public static final class C0324d extends T8.a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ d f9126e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f9127f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ m f9128g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0324d(String str, boolean z9, d dVar, boolean z10, m mVar) {
                super(str, z9);
                this.f9126e = dVar;
                this.f9127f = z10;
                this.f9128g = mVar;
            }

            @Override // T8.a
            public long f() {
                this.f9126e.q(this.f9127f, this.f9128g);
                return -1L;
            }
        }

        public d(f fVar, X8.h reader) {
            kotlin.jvm.internal.n.h(reader, "reader");
            this.f9118r = fVar;
            this.f9117q = reader;
        }

        @Override // X8.h.c
        public void a() {
        }

        @Override // X8.h.c
        public void b(boolean z9, int i10, int i11, List headerBlock) {
            kotlin.jvm.internal.n.h(headerBlock, "headerBlock");
            if (this.f9118r.q1(i10)) {
                this.f9118r.n1(i10, headerBlock, z9);
                return;
            }
            f fVar = this.f9118r;
            synchronized (fVar) {
                X8.i iVarC1 = fVar.c1(i10);
                if (iVarC1 != null) {
                    A a10 = A.f21846a;
                    iVarC1.x(Q8.d.P(headerBlock), z9);
                    return;
                }
                if (fVar.f9102w) {
                    return;
                }
                if (i10 <= fVar.P0()) {
                    return;
                }
                if (i10 % 2 == fVar.U0() % 2) {
                    return;
                }
                X8.i iVar = new X8.i(i10, fVar, false, z9, Q8.d.P(headerBlock));
                fVar.t1(i10);
                fVar.g1().put(Integer.valueOf(i10), iVar);
                fVar.f9103x.i().i(new b(fVar.O0() + '[' + i10 + "] onStream", true, fVar, iVar), 0L);
            }
        }

        @Override // X8.h.c
        public void d(int i10, X8.b errorCode) {
            kotlin.jvm.internal.n.h(errorCode, "errorCode");
            if (this.f9118r.q1(i10)) {
                this.f9118r.p1(i10, errorCode);
                return;
            }
            X8.i iVarR1 = this.f9118r.r1(i10);
            if (iVarR1 != null) {
                iVarR1.y(errorCode);
            }
        }

        @Override // X8.h.c
        public void g(int i10, long j9) {
            if (i10 == 0) {
                f fVar = this.f9118r;
                synchronized (fVar) {
                    fVar.f9091N = fVar.h1() + j9;
                    kotlin.jvm.internal.n.f(fVar, "null cannot be cast to non-null type java.lang.Object");
                    fVar.notifyAll();
                    A a10 = A.f21846a;
                }
                return;
            }
            X8.i iVarC1 = this.f9118r.c1(i10);
            if (iVarC1 != null) {
                synchronized (iVarC1) {
                    iVarC1.a(j9);
                    A a11 = A.f21846a;
                }
            }
        }

        @Override // X8.h.c
        public void h(int i10, X8.b errorCode, e9.h debugData) {
            int i11;
            Object[] array;
            kotlin.jvm.internal.n.h(errorCode, "errorCode");
            kotlin.jvm.internal.n.h(debugData, "debugData");
            debugData.v();
            f fVar = this.f9118r;
            synchronized (fVar) {
                array = fVar.g1().values().toArray(new X8.i[0]);
                fVar.f9102w = true;
                A a10 = A.f21846a;
            }
            for (X8.i iVar : (X8.i[]) array) {
                if (iVar.j() > i10 && iVar.t()) {
                    iVar.y(X8.b.REFUSED_STREAM);
                    this.f9118r.r1(iVar.j());
                }
            }
        }

        @Override // X8.h.c
        public void i(boolean z9, m settings) {
            kotlin.jvm.internal.n.h(settings, "settings");
            this.f9118r.f9104y.i(new C0324d(this.f9118r.O0() + " applyAndAckSettings", true, this, z9, settings), 0L);
        }

        @Override // p219v8.a
        public /* bridge */ /* synthetic */ Object invoke() throws Throwable {
            r();
            return A.f21846a;
        }

        @Override // X8.h.c
        public void k(boolean z9, int i10, int i11) {
            if (!z9) {
                this.f9118r.f9104y.i(new c(this.f9118r.O0() + " ping", true, this.f9118r, i10, i11), 0L);
                return;
            }
            f fVar = this.f9118r;
            synchronized (fVar) {
                try {
                    if (i10 == 1) {
                        fVar.f9081D++;
                    } else if (i10 != 2) {
                        if (i10 == 3) {
                            fVar.f9084G++;
                            kotlin.jvm.internal.n.f(fVar, "null cannot be cast to non-null type java.lang.Object");
                            fVar.notifyAll();
                        }
                        A a10 = A.f21846a;
                    } else {
                        fVar.f9083F++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // X8.h.c
        public void l(int i10, int i11, int i12, boolean z9) {
        }

        @Override // X8.h.c
        public void m(int i10, int i11, List requestHeaders) throws Throwable {
            kotlin.jvm.internal.n.h(requestHeaders, "requestHeaders");
            this.f9118r.o1(i11, requestHeaders);
        }

        @Override // X8.h.c
        public void o(boolean z9, int i10, e9.g source, int i11) {
            kotlin.jvm.internal.n.h(source, "source");
            if (this.f9118r.q1(i10)) {
                this.f9118r.m1(i10, source, i11, z9);
                return;
            }
            X8.i iVarC1 = this.f9118r.c1(i10);
            if (iVarC1 == null) {
                this.f9118r.D1(i10, X8.b.PROTOCOL_ERROR);
                long j9 = i11;
                this.f9118r.y1(j9);
                source.skip(j9);
                return;
            }
            iVarC1.w(source, i11);
            if (z9) {
                iVarC1.x(Q8.d.f6926b, true);
            }
        }

        public final void q(boolean z9, m settings) {
            long jC;
            int i10;
            X8.i[] iVarArr;
            kotlin.jvm.internal.n.h(settings, "settings");
            E e10 = new E();
            X8.j jVarI1 = this.f9118r.i1();
            f fVar = this.f9118r;
            synchronized (jVarI1) {
                synchronized (fVar) {
                    try {
                        m mVarX0 = fVar.X0();
                        if (!z9) {
                            m mVar = new m();
                            mVar.g(mVarX0);
                            mVar.g(settings);
                            settings = mVar;
                        }
                        e10.f22779q = settings;
                        jC = ((long) settings.c()) - ((long) mVarX0.c());
                        iVarArr = (jC == 0 || fVar.g1().isEmpty()) ? null : (X8.i[]) fVar.g1().values().toArray(new X8.i[0]);
                        fVar.u1((m) e10.f22779q);
                        fVar.f9078A.i(new a(fVar.O0() + " onSettings", true, fVar, e10), 0L);
                        A a10 = A.f21846a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                try {
                    fVar.i1().a((m) e10.f22779q);
                } catch (IOException e11) {
                    fVar.B0(e11);
                }
                A a11 = A.f21846a;
            }
            if (iVarArr != null) {
                for (X8.i iVar : iVarArr) {
                    synchronized (iVar) {
                        iVar.a(jC);
                        A a12 = A.f21846a;
                    }
                }
            }
        }

        public void r() throws Throwable {
            X8.b bVar = X8.b.INTERNAL_ERROR;
            try {
                try {
                    this.f9117q.f(this);
                    while (this.f9117q.b(false, this)) {
                    }
                    try {
                        this.f9118r.A0(X8.b.NO_ERROR, X8.b.CANCEL, null);
                        Q8.d.m(this.f9117q);
                    } catch (IOException e10) {
                        e = e10;
                        X8.b bVar2 = X8.b.PROTOCOL_ERROR;
                        this.f9118r.A0(bVar2, bVar2, e);
                        Q8.d.m(this.f9117q);
                    }
                } catch (Throwable th) {
                    th = th;
                    this.f9118r.A0(bVar, bVar, null);
                    Q8.d.m(this.f9117q);
                    throw th;
                }
            } catch (IOException e11) {
                e = e11;
            } catch (Throwable th2) {
                th = th2;
                this.f9118r.A0(bVar, bVar, null);
                Q8.d.m(this.f9117q);
                throw th;
            }
        }
    }

    public static final class e extends T8.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f9129e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f9130f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ C1350e f9131g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f9132h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f9133i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, boolean z9, f fVar, int i10, C1350e c1350e, int i11, boolean z10) {
            super(str, z9);
            this.f9129e = fVar;
            this.f9130f = i10;
            this.f9131g = c1350e;
            this.f9132h = i11;
            this.f9133i = z10;
        }

        @Override // T8.a
        public long f() {
            try {
                boolean zA = this.f9129e.f9079B.a(this.f9130f, this.f9131g, this.f9132h, this.f9133i);
                if (zA) {
                    this.f9129e.i1().K(this.f9130f, X8.b.CANCEL);
                }
                if (!zA && !this.f9133i) {
                    return -1L;
                }
                synchronized (this.f9129e) {
                    this.f9129e.f9095R.remove(Integer.valueOf(this.f9130f));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* JADX INFO: renamed from: X8.f$f, reason: collision with other inner class name */
    public static final class C0325f extends T8.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f9134e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f9135f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f9136g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f9137h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0325f(String str, boolean z9, f fVar, int i10, List list, boolean z10) {
            super(str, z9);
            this.f9134e = fVar;
            this.f9135f = i10;
            this.f9136g = list;
            this.f9137h = z10;
        }

        @Override // T8.a
        public long f() {
            boolean zD = this.f9134e.f9079B.d(this.f9135f, this.f9136g, this.f9137h);
            if (zD) {
                try {
                    this.f9134e.i1().K(this.f9135f, X8.b.CANCEL);
                } catch (IOException unused) {
                    return -1L;
                }
            }
            if (!zD && !this.f9137h) {
                return -1L;
            }
            synchronized (this.f9134e) {
                this.f9134e.f9095R.remove(Integer.valueOf(this.f9135f));
            }
            return -1L;
        }
    }

    public static final class g extends T8.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f9138e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f9139f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f9140g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, boolean z9, f fVar, int i10, List list) {
            super(str, z9);
            this.f9138e = fVar;
            this.f9139f = i10;
            this.f9140g = list;
        }

        @Override // T8.a
        public long f() {
            if (!this.f9138e.f9079B.c(this.f9139f, this.f9140g)) {
                return -1L;
            }
            try {
                this.f9138e.i1().K(this.f9139f, X8.b.CANCEL);
                synchronized (this.f9138e) {
                    this.f9138e.f9095R.remove(Integer.valueOf(this.f9139f));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    public static final class h extends T8.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f9141e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f9142f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ X8.b f9143g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, boolean z9, f fVar, int i10, X8.b bVar) {
            super(str, z9);
            this.f9141e = fVar;
            this.f9142f = i10;
            this.f9143g = bVar;
        }

        @Override // T8.a
        public long f() {
            this.f9141e.f9079B.b(this.f9142f, this.f9143g);
            synchronized (this.f9141e) {
                this.f9141e.f9095R.remove(Integer.valueOf(this.f9142f));
                A a10 = A.f21846a;
            }
            return -1L;
        }
    }

    public static final class i extends T8.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f9144e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, boolean z9, f fVar) {
            super(str, z9);
            this.f9144e = fVar;
        }

        @Override // T8.a
        public long f() {
            this.f9144e.B1(false, 2, 0);
            return -1L;
        }
    }

    public static final class j extends T8.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f9145e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f9146f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, f fVar, long j9) {
            super(str, false, 2, null);
            this.f9145e = fVar;
            this.f9146f = j9;
        }

        @Override // T8.a
        public long f() {
            boolean z9;
            synchronized (this.f9145e) {
                if (this.f9145e.f9081D < this.f9145e.f9080C) {
                    z9 = true;
                } else {
                    this.f9145e.f9080C++;
                    z9 = false;
                }
            }
            if (z9) {
                this.f9145e.B0(null);
                return -1L;
            }
            this.f9145e.B1(false, 1, 0);
            return this.f9146f;
        }
    }

    public static final class k extends T8.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f9147e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f9148f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ X8.b f9149g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, boolean z9, f fVar, int i10, X8.b bVar) {
            super(str, z9);
            this.f9147e = fVar;
            this.f9148f = i10;
            this.f9149g = bVar;
        }

        @Override // T8.a
        public long f() {
            try {
                this.f9147e.C1(this.f9148f, this.f9149g);
                return -1L;
            } catch (IOException e10) {
                this.f9147e.B0(e10);
                return -1L;
            }
        }
    }

    public static final class l extends T8.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f9150e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f9151f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f9152g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, boolean z9, f fVar, int i10, long j9) {
            super(str, z9);
            this.f9150e = fVar;
            this.f9151f = i10;
            this.f9152g = j9;
        }

        @Override // T8.a
        public long f() {
            try {
                this.f9150e.i1().U(this.f9151f, this.f9152g);
                return -1L;
            } catch (IOException e10) {
                this.f9150e.B0(e10);
                return -1L;
            }
        }
    }

    static {
        m mVar = new m();
        mVar.h(7, 65535);
        mVar.h(5, 16384);
        f9077T = mVar;
    }

    public f(a builder) {
        kotlin.jvm.internal.n.h(builder, "builder");
        boolean zB = builder.b();
        this.f9096q = zB;
        this.f9097r = builder.d();
        this.f9098s = new LinkedHashMap();
        String strC = builder.c();
        this.f9099t = strC;
        this.f9101v = builder.b() ? 3 : 2;
        T8.e eVarJ = builder.j();
        this.f9103x = eVarJ;
        T8.d dVarI = eVarJ.i();
        this.f9104y = dVarI;
        this.f9105z = eVarJ.i();
        this.f9078A = eVarJ.i();
        this.f9079B = builder.f();
        m mVar = new m();
        if (builder.b()) {
            mVar.h(7, 16777216);
        }
        this.f9086I = mVar;
        m mVar2 = f9077T;
        this.f9087J = mVar2;
        this.f9091N = mVar2.c();
        this.f9092O = builder.h();
        this.f9093P = new X8.j(builder.g(), zB);
        this.f9094Q = new d(this, new X8.h(builder.i(), zB));
        this.f9095R = new LinkedHashSet();
        if (builder.e() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(builder.e());
            dVarI.i(new j(strC + " ping", this, nanos), nanos);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B0(IOException iOException) {
        X8.b bVar = X8.b.PROTOCOL_ERROR;
        A0(bVar, bVar, iOException);
    }

    private final X8.i k1(int i10, List list, boolean z9) {
        Throwable th;
        X8.i iVar;
        boolean z10 = true;
        boolean z11 = !z9;
        synchronized (this.f9093P) {
            try {
                synchronized (this) {
                    try {
                        if (this.f9101v > 1073741823) {
                            try {
                                v1(X8.b.REFUSED_STREAM);
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        try {
                            if (this.f9102w) {
                                throw new X8.a();
                            }
                            int i11 = this.f9101v;
                            this.f9101v = i11 + 2;
                            iVar = new X8.i(i11, this, z11, false, null);
                            if (z9 && this.f9090M < this.f9091N && iVar.r() < iVar.q()) {
                                z10 = false;
                            }
                            if (iVar.u()) {
                                this.f9098s.put(Integer.valueOf(i11), iVar);
                            }
                            A a10 = A.f21846a;
                            if (i10 == 0) {
                                this.f9093P.z(z11, i11, list);
                            } else {
                                if (this.f9096q) {
                                    throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                                }
                                this.f9093P.I(i10, i11, list);
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                    th = th;
                    throw th;
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
        if (z10) {
            this.f9093P.flush();
        }
        return iVar;
    }

    public static /* synthetic */ void x1(f fVar, boolean z9, T8.e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = true;
        }
        if ((i10 & 2) != 0) {
            eVar = T8.e.f7738i;
        }
        fVar.w1(z9, eVar);
    }

    public final void A0(X8.b connectionCode, X8.b streamCode, IOException iOException) {
        int i10;
        Object[] array;
        kotlin.jvm.internal.n.h(connectionCode, "connectionCode");
        kotlin.jvm.internal.n.h(streamCode, "streamCode");
        if (Q8.d.f6932h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        try {
            v1(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.f9098s.isEmpty()) {
                    array = null;
                } else {
                    array = this.f9098s.values().toArray(new X8.i[0]);
                    this.f9098s.clear();
                }
                A a10 = A.f21846a;
            } catch (Throwable th) {
                throw th;
            }
        }
        X8.i[] iVarArr = (X8.i[]) array;
        if (iVarArr != null) {
            for (X8.i iVar : iVarArr) {
                try {
                    iVar.d(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f9093P.close();
        } catch (IOException unused3) {
        }
        try {
            this.f9092O.close();
        } catch (IOException unused4) {
        }
        this.f9104y.n();
        this.f9105z.n();
        this.f9078A.n();
    }

    public final void A1(int i10, boolean z9, List alternating) {
        kotlin.jvm.internal.n.h(alternating, "alternating");
        this.f9093P.z(z9, i10, alternating);
    }

    public final void B1(boolean z9, int i10, int i11) {
        try {
            this.f9093P.G(z9, i10, i11);
        } catch (IOException e10) {
            B0(e10);
        }
    }

    public final void C1(int i10, X8.b statusCode) {
        kotlin.jvm.internal.n.h(statusCode, "statusCode");
        this.f9093P.K(i10, statusCode);
    }

    public final void D1(int i10, X8.b errorCode) {
        kotlin.jvm.internal.n.h(errorCode, "errorCode");
        this.f9104y.i(new k(this.f9099t + '[' + i10 + "] writeSynReset", true, this, i10, errorCode), 0L);
    }

    public final void E1(int i10, long j9) {
        this.f9104y.i(new l(this.f9099t + '[' + i10 + "] windowUpdate", true, this, i10, j9), 0L);
    }

    public final boolean I0() {
        return this.f9096q;
    }

    public final String O0() {
        return this.f9099t;
    }

    public final int P0() {
        return this.f9100u;
    }

    public final c T0() {
        return this.f9097r;
    }

    public final int U0() {
        return this.f9101v;
    }

    public final m W0() {
        return this.f9086I;
    }

    public final m X0() {
        return this.f9087J;
    }

    public final synchronized X8.i c1(int i10) {
        return (X8.i) this.f9098s.get(Integer.valueOf(i10));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        A0(X8.b.NO_ERROR, X8.b.CANCEL, null);
    }

    public final void flush() {
        this.f9093P.flush();
    }

    public final Map g1() {
        return this.f9098s;
    }

    public final long h1() {
        return this.f9091N;
    }

    public final X8.j i1() {
        return this.f9093P;
    }

    public final synchronized boolean j1(long j9) {
        if (this.f9102w) {
            return false;
        }
        return this.f9083F >= this.f9082E || j9 < this.f9085H;
    }

    public final X8.i l1(List requestHeaders, boolean z9) {
        kotlin.jvm.internal.n.h(requestHeaders, "requestHeaders");
        return k1(0, requestHeaders, z9);
    }

    public final void m1(int i10, e9.g source, int i11, boolean z9) {
        kotlin.jvm.internal.n.h(source, "source");
        C1350e c1350e = new C1350e();
        long j9 = i11;
        source.Y0(j9);
        source.e1(c1350e, j9);
        this.f9105z.i(new e(this.f9099t + '[' + i10 + "] onData", true, this, i10, c1350e, i11, z9), 0L);
    }

    public final void n1(int i10, List requestHeaders, boolean z9) {
        kotlin.jvm.internal.n.h(requestHeaders, "requestHeaders");
        this.f9105z.i(new C0325f(this.f9099t + '[' + i10 + "] onHeaders", true, this, i10, requestHeaders, z9), 0L);
    }

    public final void o1(int i10, List requestHeaders) throws Throwable {
        Throwable th;
        kotlin.jvm.internal.n.h(requestHeaders, "requestHeaders");
        synchronized (this) {
            try {
                if (!this.f9095R.contains(Integer.valueOf(i10))) {
                    this.f9095R.add(Integer.valueOf(i10));
                    this.f9105z.i(new g(this.f9099t + '[' + i10 + "] onRequest", true, this, i10, requestHeaders), 0L);
                    return;
                }
                try {
                    D1(i10, X8.b.PROTOCOL_ERROR);
                    return;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
            throw th;
        }
    }

    public final void p1(int i10, X8.b errorCode) {
        kotlin.jvm.internal.n.h(errorCode, "errorCode");
        this.f9105z.i(new h(this.f9099t + '[' + i10 + "] onReset", true, this, i10, errorCode), 0L);
    }

    public final boolean q1(int i10) {
        return i10 != 0 && (i10 & 1) == 0;
    }

    public final synchronized X8.i r1(int i10) {
        X8.i iVar;
        iVar = (X8.i) this.f9098s.remove(Integer.valueOf(i10));
        kotlin.jvm.internal.n.f(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return iVar;
    }

    public final void s1() {
        synchronized (this) {
            long j9 = this.f9083F;
            long j10 = this.f9082E;
            if (j9 < j10) {
                return;
            }
            this.f9082E = j10 + 1;
            this.f9085H = System.nanoTime() + ((long) Utils.SECOND_IN_NANOS);
            A a10 = A.f21846a;
            this.f9104y.i(new i(this.f9099t + " ping", true, this), 0L);
        }
    }

    public final void t1(int i10) {
        this.f9100u = i10;
    }

    public final void u1(m mVar) {
        kotlin.jvm.internal.n.h(mVar, "<set-?>");
        this.f9087J = mVar;
    }

    public final void v1(X8.b statusCode) {
        kotlin.jvm.internal.n.h(statusCode, "statusCode");
        synchronized (this.f9093P) {
            C c10 = new C();
            synchronized (this) {
                if (this.f9102w) {
                    return;
                }
                this.f9102w = true;
                int i10 = this.f9100u;
                c10.f22777q = i10;
                A a10 = A.f21846a;
                this.f9093P.u(i10, statusCode, Q8.d.f6925a);
            }
        }
    }

    public final void w1(boolean z9, T8.e taskRunner) {
        kotlin.jvm.internal.n.h(taskRunner, "taskRunner");
        if (z9) {
            this.f9093P.b();
            this.f9093P.Q(this.f9086I);
            int iC = this.f9086I.c();
            if (iC != 65535) {
                this.f9093P.U(0, iC - 65535);
            }
        }
        taskRunner.i().i(new T8.c(this.f9099t, true, this.f9094Q), 0L);
    }

    public final synchronized void y1(long j9) {
        long j10 = this.f9088K + j9;
        this.f9088K = j10;
        long j11 = j10 - this.f9089L;
        if (j11 >= this.f9086I.c() / 2) {
            E1(0, j11);
            this.f9089L += j11;
        }
    }

    public final void z1(int i10, boolean z9, C1350e c1350e, long j9) {
        long j10;
        long j11;
        int iMin;
        long j12;
        if (j9 == 0) {
            this.f9093P.f(z9, i10, c1350e, 0);
            return;
        }
        while (j9 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j10 = this.f9090M;
                            j11 = this.f9091N;
                            if (j10 >= j11) {
                                if (!this.f9098s.containsKey(Integer.valueOf(i10))) {
                                    throw new IOException("stream closed");
                                }
                                kotlin.jvm.internal.n.f(this, "null cannot be cast to non-null type java.lang.Object");
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    throw th;
                }
                iMin = Math.min((int) Math.min(j9, j11 - j10), this.f9093P.B());
                j12 = iMin;
                this.f9090M += j12;
                A a10 = A.f21846a;
            }
            j9 -= j12;
            this.f9093P.f(z9 && j9 == 0, i10, c1350e, iMin);
        }
    }
}
