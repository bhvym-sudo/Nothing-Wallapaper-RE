package D6;

import F8.AbstractC0816i;
import F8.L;
import I8.AbstractC0882h;
import I8.G;
import I8.z;
import kotlin.jvm.internal.AbstractC1457h;
import p079h8.A;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f1060f = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p219v8.p f1061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p167q6.b f1062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z f1063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final z f1064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile long f1065e;

    static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f1066q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ long f1068s;

        /* JADX INFO: renamed from: D6.h$a$a, reason: collision with other inner class name */
        static final class C0040a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            Object f1069q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f1070r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            /* synthetic */ Object f1071s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ long f1072t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ h f1073u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0040a(long j9, h hVar, p129m8.e eVar) {
                super(2, eVar);
                this.f1072t = j9;
                this.f1073u = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                C0040a c0040a = new C0040a(this.f1072t, this.f1073u, eVar);
                c0040a.f1071s = obj;
                return c0040a;
            }

            /* JADX WARN: Code restructure failed: missing block: B:21:0x00a3, code lost:
            
                if (r3.b(r4, r9) == r0) goto L22;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    java.lang.Object r0 = p139n8.b.e()
                    int r1 = r9.f1070r
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L2e
                    if (r1 == r4) goto L28
                    if (r1 == r3) goto L1e
                    if (r1 != r2) goto L16
                    p079h8.r.b(r10)
                    goto La6
                L16:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r10)
                    throw r9
                L1e:
                    java.lang.Object r1 = r9.f1069q
                    java.lang.Object r3 = r9.f1071s
                    I8.z r3 = (I8.z) r3
                    p079h8.r.b(r10)
                    goto L93
                L28:
                    java.lang.Object r1 = r9.f1071s
                    p079h8.r.b(r10)
                    goto L41
                L2e:
                    p079h8.r.b(r10)
                    java.lang.Object r10 = r9.f1071s
                    long r5 = r9.f1072t
                    r9.f1071s = r10
                    r9.f1070r = r4
                    java.lang.Object r1 = F8.W.b(r5, r9)
                    if (r1 != r0) goto L40
                    goto La5
                L40:
                    r1 = r10
                L41:
                    D6.h r10 = r9.f1073u
                    q6.b r10 = D6.h.c(r10)
                    long r4 = java.lang.System.currentTimeMillis()
                    D6.h r6 = r9.f1073u
                    long r6 = D6.h.b(r6)
                    long r4 = r4 - r6
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder
                    r6.<init>()
                    java.lang.String r7 = "start do action "
                    r6.append(r7)
                    r6.append(r1)
                    java.lang.String r7 = ", last RunTime gap "
                    r6.append(r7)
                    r6.append(r4)
                    java.lang.String r4 = r6.toString()
                    r10.a(r4)
                    D6.h r10 = r9.f1073u
                    long r4 = java.lang.System.currentTimeMillis()
                    D6.h.d(r10, r4)
                    D6.h r10 = r9.f1073u
                    I8.z r10 = r10.g()
                    D6.h r4 = r9.f1073u
                    v8.p r4 = r4.f()
                    r9.f1071s = r10
                    r9.f1069q = r1
                    r9.f1070r = r3
                    java.lang.Object r3 = r4.invoke(r1, r9)
                    if (r3 != r0) goto L90
                    goto La5
                L90:
                    r8 = r3
                    r3 = r10
                    r10 = r8
                L93:
                    D6.h$c r4 = new D6.h$c
                    r4.<init>(r1, r10)
                    r10 = 0
                    r9.f1071s = r10
                    r9.f1069q = r10
                    r9.f1070r = r2
                    java.lang.Object r9 = r3.b(r4, r9)
                    if (r9 != r0) goto La6
                La5:
                    return r0
                La6:
                    h8.A r9 = p079h8.A.f21846a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: D6.h.a.C0040a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // p219v8.p
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Object obj, p129m8.e eVar) {
                return ((C0040a) create(obj, eVar)).invokeSuspend(A.f21846a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j9, p129m8.e eVar) {
            super(2, eVar);
            this.f1068s = j9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return h.this.new a(this.f1068s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f1066q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                z zVar = h.this.f1064d;
                C0040a c0040a = new C0040a(this.f1068s, h.this, null);
                this.f1066q = 1;
                if (AbstractC0882h.i(zVar, c0040a, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
            }
            return A.f21846a;
        }
    }

    public static final class b {
        public /* synthetic */ b(AbstractC1457h abstractC1457h) {
            this();
        }

        private b() {
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f1074a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f1075b;

        public c(Object obj, Object obj2) {
            this.f1074a = obj;
            this.f1075b = obj2;
        }

        public final Object a() {
            return this.f1074a;
        }

        public final Object b() {
            return this.f1075b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.n.d(this.f1074a, cVar.f1074a) && kotlin.jvm.internal.n.d(this.f1075b, cVar.f1075b);
        }

        public int hashCode() {
            Object obj = this.f1074a;
            int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
            Object obj2 = this.f1075b;
            return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
        }

        public String toString() {
            return "Result(p=" + this.f1074a + ", r=" + this.f1075b + ")";
        }
    }

    public h(L coroutineScope, long j9, p219v8.p action) {
        kotlin.jvm.internal.n.h(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.n.h(action, "action");
        this.f1061a = action;
        this.f1062b = new p167q6.b(this);
        this.f1063c = G.a(1, 0, H8.a.DROP_OLDEST);
        this.f1064d = G.a(1, 0, H8.a.SUSPEND);
        AbstractC0816i.d(coroutineScope, null, null, new a(j9, null), 3, null);
    }

    public final Object e(Object obj, p129m8.e eVar) {
        this.f1062b.a("emit " + obj);
        Object objB = this.f1064d.b(obj, eVar);
        return objB == p139n8.b.e() ? objB : A.f21846a;
    }

    public final p219v8.p f() {
        return this.f1061a;
    }

    public final z g() {
        return this.f1063c;
    }
}
