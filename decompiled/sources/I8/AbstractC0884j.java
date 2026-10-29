package I8;

/* JADX INFO: renamed from: I8.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class AbstractC0884j {

    /* JADX INFO: renamed from: I8.j$a */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f3229q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f3230r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f3231s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f3232t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f3233u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f3234v;

        a(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3233u = obj;
            this.f3234v |= Integer.MIN_VALUE;
            return AbstractC0884j.c(null, null, false, this);
        }
    }

    public static final Object b(InterfaceC0881g interfaceC0881g, H8.v vVar, p129m8.e eVar) {
        Object objC = c(interfaceC0881g, vVar, true, eVar);
        return objC == p139n8.b.e() ? objC : p079h8.A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code duplicated, block: B:30:0x007f A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0036, B:24:0x0062, B:28:0x0077, B:30:0x007f, B:20:0x0054, B:23:0x005e), top: B:42:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0096  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
    
        if (r2.b(r9, r0) == r1) goto L32;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0091 -> B:14:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(I8.InterfaceC0881g r6, H8.v r7, boolean r8, p129m8.e r9) {
        /*
            boolean r0 = r9 instanceof I8.AbstractC0884j.a
            if (r0 == 0) goto L13
            r0 = r9
            I8.j$a r0 = (I8.AbstractC0884j.a) r0
            int r1 = r0.f3234v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3234v = r1
            goto L18
        L13:
            I8.j$a r0 = new I8.j$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f3233u
            java.lang.Object r1 = p139n8.b.e()
            int r2 = r0.f3234v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L58
            if (r2 == r4) goto L46
            if (r2 != r3) goto L3e
            boolean r8 = r0.f3232t
            java.lang.Object r6 = r0.f3231s
            H8.i r6 = (H8.i) r6
            java.lang.Object r7 = r0.f3230r
            H8.v r7 = (H8.v) r7
            java.lang.Object r2 = r0.f3229q
            I8.g r2 = (I8.InterfaceC0881g) r2
            p079h8.r.b(r9)     // Catch: java.lang.Throwable -> L3c
        L39:
            r9 = r6
            r6 = r2
            goto L62
        L3c:
            r6 = move-exception
            goto L9d
        L3e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L46:
            boolean r8 = r0.f3232t
            java.lang.Object r6 = r0.f3231s
            H8.i r6 = (H8.i) r6
            java.lang.Object r7 = r0.f3230r
            H8.v r7 = (H8.v) r7
            java.lang.Object r2 = r0.f3229q
            I8.g r2 = (I8.InterfaceC0881g) r2
            p079h8.r.b(r9)     // Catch: java.lang.Throwable -> L3c
            goto L77
        L58:
            p079h8.r.b(r9)
            I8.AbstractC0882h.v(r6)
            H8.i r9 = r7.iterator()     // Catch: java.lang.Throwable -> L3c
        L62:
            r0.f3229q = r6     // Catch: java.lang.Throwable -> L3c
            r0.f3230r = r7     // Catch: java.lang.Throwable -> L3c
            r0.f3231s = r9     // Catch: java.lang.Throwable -> L3c
            r0.f3232t = r8     // Catch: java.lang.Throwable -> L3c
            r0.f3234v = r4     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = r9.a(r0)     // Catch: java.lang.Throwable -> L3c
            if (r2 != r1) goto L73
            goto L93
        L73:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L77:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L3c
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L3c
            if (r9 == 0) goto L94
            java.lang.Object r9 = r6.next()     // Catch: java.lang.Throwable -> L3c
            r0.f3229q = r2     // Catch: java.lang.Throwable -> L3c
            r0.f3230r = r7     // Catch: java.lang.Throwable -> L3c
            r0.f3231s = r6     // Catch: java.lang.Throwable -> L3c
            r0.f3232t = r8     // Catch: java.lang.Throwable -> L3c
            r0.f3234v = r3     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r9 = r2.b(r9, r0)     // Catch: java.lang.Throwable -> L3c
            if (r9 != r1) goto L39
        L93:
            return r1
        L94:
            if (r8 == 0) goto L9a
            r6 = 0
            H8.m.a(r7, r6)
        L9a:
            h8.A r6 = p079h8.A.f21846a
            return r6
        L9d:
            throw r6     // Catch: java.lang.Throwable -> L9e
        L9e:
            r9 = move-exception
            if (r8 == 0) goto La4
            H8.m.a(r7, r6)
        La4:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: I8.AbstractC0884j.c(I8.g, H8.v, boolean, m8.e):java.lang.Object");
    }
}
