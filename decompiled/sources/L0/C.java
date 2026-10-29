package L0;

import I8.AbstractC0882h;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;

/* JADX INFO: loaded from: classes.dex */
public final class C implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f4278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final O8.a f4279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0925b f4280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC0880f f4281d;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f4282q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f4283r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f4284s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f4286u;

        a(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4284s = obj;
            this.f4286u |= Integer.MIN_VALUE;
            return C.this.d(null, this);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f4287q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f4288r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f4289s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f4291u;

        b(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4289s = obj;
            this.f4291u |= Integer.MIN_VALUE;
            return C.this.c(null, this);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f4292q;

        c(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return new c(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f4292q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            return p079h8.A.f21846a;
        }

        @Override // p219v8.p
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            return ((c) create(interfaceC0881g, eVar)).invokeSuspend(p079h8.A.f21846a);
        }
    }

    public C(String filePath) {
        kotlin.jvm.internal.n.h(filePath, "filePath");
        this.f4278a = filePath;
        this.f4279b = O8.g.b(false, 1, null);
        this.f4280c = new C0925b(0);
        this.f4281d = AbstractC0882h.A(new c(null));
    }

    @Override // L0.t
    public Object a(p129m8.e eVar) {
        return kotlin.coroutines.jvm.internal.b.c(this.f4280c.d());
    }

    @Override // L0.t
    public Object b(p129m8.e eVar) {
        return kotlin.coroutines.jvm.internal.b.c(this.f4280c.b());
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0065  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // L0.t
    public Object c(p219v8.p pVar, p129m8.e eVar) throws Throwable {
        b bVar;
        O8.a aVar;
        boolean z9;
        Throwable th;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i10 = bVar.f4291u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f4291u = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f4289s;
        Object objE = p139n8.b.e();
        int i11 = bVar.f4291u;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z9 = bVar.f4288r;
            aVar = (O8.a) bVar.f4287q;
            try {
                p079h8.r.b(obj);
                if (z9) {
                    aVar.b(null);
                }
                return obj;
            } catch (Throwable th2) {
                th = th2;
                if (z9) {
                    aVar.b(null);
                }
                throw th;
            }
        }
        p079h8.r.b(obj);
        O8.a aVar2 = this.f4279b;
        boolean zA = aVar2.a(null);
        try {
            Object objA = kotlin.coroutines.jvm.internal.b.a(zA);
            bVar.f4287q = aVar2;
            bVar.f4288r = zA;
            bVar.f4291u = 1;
            Object objInvoke = pVar.invoke(objA, bVar);
            if (objInvoke == objE) {
                return objE;
            }
            aVar = aVar2;
            z9 = zA;
            obj = objInvoke;
            if (z9) {
                aVar.b(null);
            }
            return obj;
        } catch (Throwable th3) {
            aVar = aVar2;
            z9 = zA;
            th = th3;
            if (z9) {
                aVar.b(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [L0.C] */
    /* JADX WARN: Type inference failed for: r6v1, types: [O8.a] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v4, types: [O8.a] */
    @Override // L0.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(p219v8.l r7, p129m8.e r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof L0.C.a
            if (r0 == 0) goto L13
            r0 = r8
            L0.C$a r0 = (L0.C.a) r0
            int r1 = r0.f4286u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4286u = r1
            goto L18
        L13:
            L0.C$a r0 = new L0.C$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f4284s
            java.lang.Object r1 = p139n8.b.e()
            int r2 = r0.f4286u
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.f4282q
            O8.a r6 = (O8.a) r6
            p079h8.r.b(r8)     // Catch: java.lang.Throwable -> L31
            goto L66
        L31:
            r7 = move-exception
            goto L6a
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            java.lang.Object r6 = r0.f4283r
            O8.a r6 = (O8.a) r6
            java.lang.Object r7 = r0.f4282q
            v8.l r7 = (p219v8.l) r7
            p079h8.r.b(r8)
            goto L59
        L47:
            p079h8.r.b(r8)
            O8.a r6 = r6.f4279b
            r0.f4282q = r7
            r0.f4283r = r6
            r0.f4286u = r4
            java.lang.Object r8 = r6.c(r5, r0)
            if (r8 != r1) goto L59
            goto L65
        L59:
            r0.f4282q = r6     // Catch: java.lang.Throwable -> L31
            r0.f4283r = r5     // Catch: java.lang.Throwable -> L31
            r0.f4286u = r3     // Catch: java.lang.Throwable -> L31
            java.lang.Object r8 = r7.f(r0)     // Catch: java.lang.Throwable -> L31
            if (r8 != r1) goto L66
        L65:
            return r1
        L66:
            r6.b(r5)
            return r8
        L6a:
            r6.b(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: L0.C.d(v8.l, m8.e):java.lang.Object");
    }

    @Override // L0.t
    public InterfaceC0880f e() {
        return this.f4281d;
    }
}
