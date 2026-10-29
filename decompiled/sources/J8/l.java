package J8;

import F8.L;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l {

    static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f3926q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f3927r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f3928s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f3929t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f3930u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private /* synthetic */ Object f3931v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f[] f3932w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ p219v8.a f3933x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        final /* synthetic */ p219v8.q f3934y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        final /* synthetic */ InterfaceC0881g f3935z;

        /* JADX INFO: renamed from: J8.l$a$a, reason: collision with other inner class name */
        static final class C0137a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f3936q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ InterfaceC0880f[] f3937r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ int f3938s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ AtomicInteger f3939t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ H8.g f3940u;

            /* JADX INFO: renamed from: J8.l$a$a$a, reason: collision with other inner class name */
            static final class C0138a implements InterfaceC0881g {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                final /* synthetic */ H8.g f3941q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ int f3942r;

                /* JADX INFO: renamed from: J8.l$a$a$a$a, reason: collision with other inner class name */
                static final class C0139a extends kotlin.coroutines.jvm.internal.d {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    /* synthetic */ Object f3943q;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    int f3945s;

                    C0139a(p129m8.e eVar) {
                        super(eVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f3943q = obj;
                        this.f3945s |= Integer.MIN_VALUE;
                        return C0138a.this.b(null, this);
                    }
                }

                C0138a(H8.g gVar, int i10) {
                    this.f3941q = gVar;
                    this.f3942r = i10;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
                
                    if (F8.e1.a(r0) == r1) goto L21;
                 */
                @Override // I8.InterfaceC0881g
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object b(java.lang.Object r6, p129m8.e r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof J8.l.a.C0137a.C0138a.C0139a
                        if (r0 == 0) goto L13
                        r0 = r7
                        J8.l$a$a$a$a r0 = (J8.l.a.C0137a.C0138a.C0139a) r0
                        int r1 = r0.f3945s
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f3945s = r1
                        goto L18
                    L13:
                        J8.l$a$a$a$a r0 = new J8.l$a$a$a$a
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.f3943q
                        java.lang.Object r1 = p139n8.b.e()
                        int r2 = r0.f3945s
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L38
                        if (r2 == r4) goto L34
                        if (r2 != r3) goto L2c
                        p079h8.r.b(r7)
                        goto L56
                    L2c:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L34:
                        p079h8.r.b(r7)
                        goto L4d
                    L38:
                        p079h8.r.b(r7)
                        H8.g r7 = r5.f3941q
                        i8.I r2 = new i8.I
                        int r5 = r5.f3942r
                        r2.<init>(r5, r6)
                        r0.f3945s = r4
                        java.lang.Object r5 = r7.n(r2, r0)
                        if (r5 != r1) goto L4d
                        goto L55
                    L4d:
                        r0.f3945s = r3
                        java.lang.Object r5 = F8.e1.a(r0)
                        if (r5 != r1) goto L56
                    L55:
                        return r1
                    L56:
                        h8.A r5 = p079h8.A.f21846a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: J8.l.a.C0137a.C0138a.b(java.lang.Object, m8.e):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0137a(InterfaceC0880f[] interfaceC0880fArr, int i10, AtomicInteger atomicInteger, H8.g gVar, p129m8.e eVar) {
                super(2, eVar);
                this.f3937r = interfaceC0880fArr;
                this.f3938s = i10;
                this.f3939t = atomicInteger;
                this.f3940u = gVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new C0137a(this.f3937r, this.f3938s, this.f3939t, this.f3940u, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((C0137a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f3936q;
                try {
                    if (i10 == 0) {
                        p079h8.r.b(obj);
                        InterfaceC0880f[] interfaceC0880fArr = this.f3937r;
                        int i11 = this.f3938s;
                        InterfaceC0880f interfaceC0880f = interfaceC0880fArr[i11];
                        C0138a c0138a = new C0138a(this.f3940u, i11);
                        this.f3936q = 1;
                        if (interfaceC0880f.a(c0138a, this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p079h8.r.b(obj);
                    }
                    if (this.f3939t.decrementAndGet() == 0) {
                        H8.w.a.a(this.f3940u, null, 1, null);
                    }
                    return p079h8.A.f21846a;
                } catch (Throwable th) {
                    if (this.f3939t.decrementAndGet() == 0) {
                        H8.w.a.a(this.f3940u, null, 1, null);
                    }
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC0880f[] interfaceC0880fArr, p219v8.a aVar, p219v8.q qVar, InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            super(2, eVar);
            this.f3932w = interfaceC0880fArr;
            this.f3933x = aVar;
            this.f3934y = qVar;
            this.f3935z = interfaceC0881g;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            a aVar = new a(this.f3932w, this.f3933x, this.f3934y, this.f3935z, eVar);
            aVar.f3931v = obj;
            return aVar;
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x00d1  */
        /* JADX WARN: Code duplicated, block: B:33:0x00d7  */
        /* JADX WARN: Code duplicated, block: B:35:0x00e6 A[EDGE_INSN: B:35:0x00e6->B:44:0x0129 BREAK  A[LOOP:0: B:28:0x00c1->B:47:?]] */
        /* JADX WARN: Code duplicated, block: B:36:0x00e8  */
        /* JADX WARN: Code duplicated, block: B:38:0x00f2  */
        /* JADX WARN: Code duplicated, block: B:41:0x0109  */
        /* JADX WARN: Code duplicated, block: B:46:0x00e6 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:47:? A[LOOP:0: B:28:0x00c1->B:47:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0106 -> B:44:0x0129). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0126 -> B:44:0x0129). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:41:0x0109
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instruction units count: 304
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: J8.l.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final Object a(InterfaceC0881g interfaceC0881g, InterfaceC0880f[] interfaceC0880fArr, p219v8.a aVar, p219v8.q qVar, p129m8.e eVar) {
        Object objA = o.a(new a(interfaceC0880fArr, aVar, qVar, interfaceC0881g, null), eVar);
        return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
    }
}
