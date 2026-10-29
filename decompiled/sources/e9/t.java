package e9;

/* JADX INFO: loaded from: classes2.dex */
public final class t implements B {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final g f20292q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final C1350e f20293r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private w f20294s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f20295t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f20296u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f20297v;

    public t(g upstream) {
        kotlin.jvm.internal.n.h(upstream, "upstream");
        this.f20292q = upstream;
        C1350e c1350eD = upstream.d();
        this.f20293r = c1350eD;
        w wVar = c1350eD.f20257q;
        this.f20294s = wVar;
        this.f20295t = wVar != null ? wVar.f20308b : -1;
    }

    @Override // e9.B, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f20296u = true;
    }

    @Override // e9.B
    public C e() {
        return this.f20292q.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r3 == r4.f20308b) goto L15;
     */
    @Override // e9.B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long e1(e9.C1350e r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.n.h(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L74
            boolean r3 = r8.f20296u
            if (r3 != 0) goto L6c
            e9.w r3 = r8.f20294s
            if (r3 == 0) goto L2b
            e9.e r4 = r8.f20293r
            e9.w r4 = r4.f20257q
            if (r3 != r4) goto L23
            int r3 = r8.f20295t
            kotlin.jvm.internal.n.e(r4)
            int r4 = r4.f20308b
            if (r3 != r4) goto L23
            goto L2b
        L23:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Peek source is invalid because upstream source was used"
            r8.<init>(r9)
            throw r8
        L2b:
            if (r2 != 0) goto L2e
            return r0
        L2e:
            e9.g r0 = r8.f20292q
            long r1 = r8.f20297v
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.u0(r1)
            if (r0 != 0) goto L3e
            r8 = -1
            return r8
        L3e:
            e9.w r0 = r8.f20294s
            if (r0 != 0) goto L51
            e9.e r0 = r8.f20293r
            e9.w r0 = r0.f20257q
            if (r0 == 0) goto L51
            r8.f20294s = r0
            kotlin.jvm.internal.n.e(r0)
            int r0 = r0.f20308b
            r8.f20295t = r0
        L51:
            e9.e r0 = r8.f20293r
            long r0 = r0.X0()
            long r2 = r8.f20297v
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            e9.e r2 = r8.f20293r
            long r4 = r8.f20297v
            r3 = r9
            r2.Q(r3, r4, r6)
            long r9 = r8.f20297v
            long r9 = r9 + r6
            r8.f20297v = r9
            return r6
        L6c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "closed"
            r8.<init>(r9)
            throw r8
        L74:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "byteCount < 0: "
            r8.append(r9)
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: e9.t.e1(e9.e, long):long");
    }
}
