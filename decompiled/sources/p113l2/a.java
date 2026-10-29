package p113l2;

import I8.InterfaceC0880f;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.n;
import p129m8.e;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p103k2.a f22890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final R2.a f22891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p069g8.a f22892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC0880f f22893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC0880f f22894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC0880f f22895f;

    /* JADX INFO: renamed from: l2.a$a, reason: collision with other inner class name */
    static final class C0580a extends d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f22896q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f22897r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f22899t;

        C0580a(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f22897r = obj;
            this.f22899t |= Integer.MIN_VALUE;
            return a.this.e(null, null, this);
        }
    }

    static final class b extends d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f22900q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f22901r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f22902s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f22904u;

        b(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f22902s = obj;
            this.f22904u |= Integer.MIN_VALUE;
            return a.this.f(this);
        }
    }

    static final class c extends d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f22905q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f22906r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f22908t;

        c(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f22906r = obj;
            this.f22908t |= Integer.MIN_VALUE;
            return a.this.g(null, this);
        }
    }

    public a(p103k2.a repository, R2.a client, p069g8.a snapshotRestorer) {
        n.h(repository, "repository");
        n.h(client, "client");
        n.h(snapshotRestorer, "snapshotRestorer");
        this.f22890a = repository;
        this.f22891b = client;
        this.f22892c = snapshotRestorer;
        this.f22893d = repository.f();
        this.f22894e = repository.d();
        this.f22895f = repository.e();
    }

    public final Object a(int i10, e eVar) {
        return R2.a.g(this.f22891b, i10, 0, eVar, 2, null);
    }

    public final InterfaceC0880f b() {
        return this.f22894e;
    }

    public final InterfaceC0880f c() {
        return this.f22895f;
    }

    public final InterfaceC0880f d() {
        return this.f22893d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        if (r5.g(r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r6, java.lang.String r7, p129m8.e r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof p113l2.a.C0580a
            if (r0 == 0) goto L13
            r0 = r8
            l2.a$a r0 = (p113l2.a.C0580a) r0
            int r1 = r0.f22899t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22899t = r1
            goto L18
        L13:
            l2.a$a r0 = new l2.a$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f22897r
            java.lang.Object r1 = p139n8.b.e()
            int r2 = r0.f22899t
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            p079h8.r.b(r8)
            goto L60
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r5 = r0.f22896q
            l2.a r5 = (p113l2.a) r5
            p079h8.r.b(r8)
            goto L4c
        L3c:
            p079h8.r.b(r8)
            R2.a r8 = r5.f22891b
            r0.f22896q = r5
            r0.f22899t = r4
            java.lang.Object r6 = r8.e(r6, r7, r0)
            if (r6 != r1) goto L4c
            goto L5f
        L4c:
            g8.a r5 = r5.f22892c
            java.lang.Object r5 = r5.get()
            l2.c r5 = (p113l2.c) r5
            r6 = 0
            r0.f22896q = r6
            r0.f22899t = r3
            java.lang.Object r5 = r5.g(r0)
            if (r5 != r1) goto L60
        L5f:
            return r1
        L60:
            h8.A r5 = p079h8.A.f21846a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p113l2.a.e(java.lang.String, java.lang.String, m8.e):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:28:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:? A[LOOP:0: B:20:0x005c->B:30:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        if (r6 == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(p129m8.e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof l2.a.b
            if (r0 == 0) goto L13
            r0 = r6
            l2.a$b r0 = (l2.a.b) r0
            int r1 = r0.f22904u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22904u = r1
            goto L18
        L13:
            l2.a$b r0 = new l2.a$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f22902s
            java.lang.Object r1 = p139n8.b.e()
            int r2 = r0.f22904u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r5 = r0.f22901r
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r2 = r0.f22900q
            l2.a r2 = (p113l2.a) r2
            p079h8.r.b(r6)
            goto L5c
        L34:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3c:
            java.lang.Object r5 = r0.f22900q
            l2.a r5 = (p113l2.a) r5
            p079h8.r.b(r6)
            goto L54
        L44:
            p079h8.r.b(r6)
            R2.a r6 = r5.f22891b
            r0.f22900q = r5
            r0.f22904u = r4
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L54
            goto L7a
        L54:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
            r2 = r5
            r5 = r6
        L5c:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L7b
            java.lang.Object r6 = r5.next()
            R2.a$d r6 = (R2.a.d) r6
            R2.a r4 = r2.f22891b
            java.lang.String r6 = r6.b()
            r0.f22900q = r2
            r0.f22901r = r5
            r0.f22904u = r3
            java.lang.Object r6 = r4.f(r6, r0)
            if (r6 != r1) goto L5c
        L7a:
            return r1
        L7b:
            h8.A r5 = p079h8.A.f21846a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p113l2.a.f(m8.e):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        if (r5.g(r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r6, p129m8.e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof l2.a.c
            if (r0 == 0) goto L13
            r0 = r7
            l2.a$c r0 = (l2.a.c) r0
            int r1 = r0.f22908t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22908t = r1
            goto L18
        L13:
            l2.a$c r0 = new l2.a$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f22906r
            java.lang.Object r1 = p139n8.b.e()
            int r2 = r0.f22908t
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            p079h8.r.b(r7)
            goto L60
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r5 = r0.f22905q
            l2.a r5 = (p113l2.a) r5
            p079h8.r.b(r7)
            goto L4c
        L3c:
            p079h8.r.b(r7)
            R2.a r7 = r5.f22891b
            r0.f22905q = r5
            r0.f22908t = r4
            java.lang.Object r6 = r7.f(r6, r0)
            if (r6 != r1) goto L4c
            goto L5f
        L4c:
            g8.a r5 = r5.f22892c
            java.lang.Object r5 = r5.get()
            l2.c r5 = (p113l2.c) r5
            r6 = 0
            r0.f22905q = r6
            r0.f22908t = r3
            java.lang.Object r5 = r5.g(r0)
            if (r5 != r1) goto L60
        L5f:
            return r1
        L60:
            h8.A r5 = p079h8.A.f21846a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p113l2.a.g(java.lang.String, m8.e):java.lang.Object");
    }
}
