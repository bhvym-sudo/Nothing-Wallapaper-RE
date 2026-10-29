package I8;

import java.util.List;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
final class N implements K {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f3186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f3187c;

    static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.q {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f3188q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f3189r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ int f3190s;

        a(p129m8.e eVar) {
            super(3, eVar);
        }

        @Override // p219v8.q
        public /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3) {
            return s((InterfaceC0881g) obj, ((Number) obj2).intValue(), (p129m8.e) obj3);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0070  */
        /* JADX WARN: Code duplicated, block: B:29:0x007d A[PHI: r1
          0x007d: PHI (r1v4 I8.g) = (r1v3 I8.g), (r1v9 I8.g) binds: [B:27:0x007a, B:13:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:32:0x008e A[PHI: r1
          0x008e: PHI (r1v5 I8.g) = (r1v3 I8.g), (r1v4 I8.g), (r1v11 I8.g) binds: [B:25:0x006e, B:30:0x008b, B:12:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
        
            if (r1.b(r10, r9) == r0) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
        
            if (r1.b(r10, r9) == r0) goto L34;
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
                int r1 = r9.f3188q
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L3c
                if (r1 == r6) goto L38
                if (r1 == r5) goto L30
                if (r1 == r4) goto L28
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                goto L38
            L18:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L20:
                java.lang.Object r1 = r9.f3189r
                I8.g r1 = (I8.InterfaceC0881g) r1
                p079h8.r.b(r10)
                goto L8e
            L28:
                java.lang.Object r1 = r9.f3189r
                I8.g r1 = (I8.InterfaceC0881g) r1
                p079h8.r.b(r10)
                goto L7d
            L30:
                java.lang.Object r1 = r9.f3189r
                I8.g r1 = (I8.InterfaceC0881g) r1
                p079h8.r.b(r10)
                goto L64
            L38:
                p079h8.r.b(r10)
                goto L9c
            L3c:
                p079h8.r.b(r10)
                java.lang.Object r10 = r9.f3189r
                r1 = r10
                I8.g r1 = (I8.InterfaceC0881g) r1
                int r10 = r9.f3190s
                if (r10 <= 0) goto L53
                I8.I r10 = I8.I.START
                r9.f3188q = r6
                java.lang.Object r9 = r1.b(r10, r9)
                if (r9 != r0) goto L9c
                goto L9b
            L53:
                I8.N r10 = I8.N.this
                long r6 = I8.N.c(r10)
                r9.f3189r = r1
                r9.f3188q = r5
                java.lang.Object r10 = F8.W.b(r6, r9)
                if (r10 != r0) goto L64
                goto L9b
            L64:
                I8.N r10 = I8.N.this
                long r5 = I8.N.b(r10)
                r7 = 0
                int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r10 <= 0) goto L8e
                I8.I r10 = I8.I.STOP
                r9.f3189r = r1
                r9.f3188q = r4
                java.lang.Object r10 = r1.b(r10, r9)
                if (r10 != r0) goto L7d
                goto L9b
            L7d:
                I8.N r10 = I8.N.this
                long r4 = I8.N.b(r10)
                r9.f3189r = r1
                r9.f3188q = r3
                java.lang.Object r10 = F8.W.b(r4, r9)
                if (r10 != r0) goto L8e
                goto L9b
            L8e:
                I8.I r10 = I8.I.STOP_AND_RESET_REPLAY_CACHE
                r3 = 0
                r9.f3189r = r3
                r9.f3188q = r2
                java.lang.Object r9 = r1.b(r10, r9)
                if (r9 != r0) goto L9c
            L9b:
                return r0
            L9c:
                h8.A r9 = p079h8.A.f21846a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: I8.N.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object s(InterfaceC0881g interfaceC0881g, int i10, p129m8.e eVar) {
            a aVar = N.this.new a(eVar);
            aVar.f3189r = interfaceC0881g;
            aVar.f3190s = i10;
            return aVar.invokeSuspend(p079h8.A.f21846a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f3192q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f3193r;

        b(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            b bVar = new b(eVar);
            bVar.f3193r = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f3192q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            return kotlin.coroutines.jvm.internal.b.a(((I) this.f3193r) != I.START);
        }

        @Override // p219v8.p
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object invoke(I i10, p129m8.e eVar) {
            return ((b) create(i10, eVar)).invokeSuspend(p079h8.A.f21846a);
        }
    }

    public N(long j9, long j10) {
        this.f3186b = j9;
        this.f3187c = j10;
        if (j9 < 0) {
            throw new IllegalArgumentException(("stopTimeout(" + j9 + " ms) cannot be negative").toString());
        }
        if (j10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("replayExpiration(" + j10 + " ms) cannot be negative").toString());
    }

    @Override // I8.K
    public InterfaceC0880f a(O o9) {
        return AbstractC0882h.o(AbstractC0882h.r(AbstractC0882h.N(o9, new a(null)), new b(null)));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof N)) {
            return false;
        }
        N n9 = (N) obj;
        return this.f3186b == n9.f3186b && this.f3187c == n9.f3187c;
    }

    public int hashCode() {
        return (Long.hashCode(this.f3186b) * 31) + Long.hashCode(this.f3187c);
    }

    public String toString() {
        List listD = AbstractC1444s.d(2);
        if (this.f3186b > 0) {
            listD.add("stopTimeout=" + this.f3186b + "ms");
        }
        if (this.f3187c < Long.MAX_VALUE) {
            listD.add("replayExpiration=" + this.f3187c + "ms");
        }
        return "SharingStarted.WhileSubscribed(" + AbstractC1444s.a0(AbstractC1444s.a(listD), null, null, null, 0, null, null, 63, null) + ')';
    }
}
