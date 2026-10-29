package I8;

import F8.InterfaceC0846x0;
import java.util.concurrent.CancellationException;
import p079h8.AbstractC1388c;

/* JADX INFO: renamed from: I8.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class AbstractC0892s {

    /* JADX INFO: renamed from: I8.s$a */
    public static final class a implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f3278q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p219v8.q f3279r;

        /* JADX INFO: renamed from: I8.s$a$a, reason: collision with other inner class name */
        public static final class C0111a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            /* synthetic */ Object f3280q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f3281r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            Object f3283t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            Object f3284u;

            public C0111a(p129m8.e eVar) {
                super(eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f3280q = obj;
                this.f3281r |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        public a(InterfaceC0880f interfaceC0880f, p219v8.q qVar) {
            this.f3278q = interfaceC0880f;
            this.f3279r = qVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
        
            if (r5 == r1) goto L23;
         */
        @Override // I8.InterfaceC0880f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(I8.InterfaceC0881g r6, p129m8.e r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof I8.AbstractC0892s.a.C0111a
                if (r0 == 0) goto L13
                r0 = r7
                I8.s$a$a r0 = (I8.AbstractC0892s.a.C0111a) r0
                int r1 = r0.f3281r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f3281r = r1
                goto L18
            L13:
                I8.s$a$a r0 = new I8.s$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f3280q
                java.lang.Object r1 = p139n8.b.e()
                int r2 = r0.f3281r
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L41
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                p079h8.r.b(r7)
                goto L6f
            L2c:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L34:
                java.lang.Object r5 = r0.f3284u
                r6 = r5
                I8.g r6 = (I8.InterfaceC0881g) r6
                java.lang.Object r5 = r0.f3283t
                I8.s$a r5 = (I8.AbstractC0892s.a) r5
                p079h8.r.b(r7)
                goto L53
            L41:
                p079h8.r.b(r7)
                I8.f r7 = r5.f3278q
                r0.f3283t = r5
                r0.f3284u = r6
                r0.f3281r = r4
                java.lang.Object r7 = I8.AbstractC0882h.g(r7, r6, r0)
                if (r7 != r1) goto L53
                goto L6e
            L53:
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L6f
                v8.q r5 = r5.f3279r
                r2 = 0
                r0.f3283t = r2
                r0.f3284u = r2
                r0.f3281r = r3
                r2 = 6
                kotlin.jvm.internal.m.a(r2)
                java.lang.Object r5 = r5.e(r6, r7, r0)
                r6 = 7
                kotlin.jvm.internal.m.a(r6)
                if (r5 != r1) goto L6f
            L6e:
                return r1
            L6f:
                h8.A r5 = p079h8.A.f21846a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: I8.AbstractC0892s.a.a(I8.g, m8.e):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: I8.s$b */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f3285q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f3286r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f3287s;

        b(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3286r = obj;
            this.f3287s |= Integer.MIN_VALUE;
            return AbstractC0882h.g(null, null, this);
        }
    }

    /* JADX INFO: renamed from: I8.s$c */
    static final class c implements InterfaceC0881g {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0881g f3288q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.E f3289r;

        /* JADX INFO: renamed from: I8.s$c$a */
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            Object f3290q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f3291r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f3293t;

            a(p129m8.e eVar) {
                super(eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f3291r = obj;
                this.f3293t |= Integer.MIN_VALUE;
                return c.this.b(null, this);
            }
        }

        c(InterfaceC0881g interfaceC0881g, kotlin.jvm.internal.E e10) {
            this.f3288q = interfaceC0881g;
            this.f3289r = e10;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v4, types: [h8.A, java.lang.Object] */
        @Override // I8.InterfaceC0881g
        public final Object b(Object obj, p129m8.e eVar) {
            a aVar;
            if (eVar instanceof a) {
                aVar = (a) eVar;
                int i10 = aVar.f3293t;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f3293t = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(eVar);
                }
            } else {
                aVar = new a(eVar);
            }
            Object obj2 = aVar.f3291r;
            Object objE = p139n8.b.e();
            int i11 = aVar.f3293t;
            try {
                if (i11 == 0) {
                    p079h8.r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f3288q;
                    aVar.f3290q = this;
                    aVar.f3293t = 1;
                    if (interfaceC0881g.b(obj, aVar) == objE) {
                        return objE;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p079h8.r.b(obj2);
                }
                this = p079h8.A.f21846a;
                return this;
            } catch (Throwable th) {
                this.f3289r.f22779q = th;
                throw th;
            }
        }
    }

    public static final InterfaceC0880f a(InterfaceC0880f interfaceC0880f, p219v8.q qVar) {
        return new a(interfaceC0880f, qVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(InterfaceC0880f interfaceC0880f, InterfaceC0881g interfaceC0881g, p129m8.e eVar) throws Throwable {
        b bVar;
        kotlin.jvm.internal.E e10;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i10 = bVar.f3287s;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f3287s = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f3286r;
        Object objE = p139n8.b.e();
        int i11 = bVar.f3287s;
        if (i11 == 0) {
            p079h8.r.b(obj);
            kotlin.jvm.internal.E e11 = new kotlin.jvm.internal.E();
            try {
                InterfaceC0881g cVar = new c(interfaceC0881g, e11);
                bVar.f3285q = e11;
                bVar.f3287s = 1;
                if (interfaceC0880f.a(cVar, bVar) == objE) {
                    return objE;
                }
                return null;
            } catch (Throwable th) {
                th = th;
                e10 = e11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e10 = (kotlin.jvm.internal.E) bVar.f3285q;
            try {
                p079h8.r.b(obj);
                return null;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        Throwable th3 = (Throwable) e10.f22779q;
        if (d(th, th3) || c(th, bVar.getContext())) {
            throw th;
        }
        if (th3 == null) {
            return th;
        }
        if (th instanceof CancellationException) {
            AbstractC1388c.a(th3, th);
            throw th3;
        }
        AbstractC1388c.a(th, th3);
        throw th;
    }

    private static final boolean c(Throwable th, p129m8.i iVar) {
        InterfaceC0846x0 interfaceC0846x0 = (InterfaceC0846x0) iVar.b(InterfaceC0846x0.f1901e);
        if (interfaceC0846x0 == null || !interfaceC0846x0.isCancelled()) {
            return false;
        }
        return d(th, interfaceC0846x0.K());
    }

    private static final boolean d(Throwable th, Throwable th2) {
        return th2 != null && kotlin.jvm.internal.n.d(th2, th);
    }
}
