package L0;

import F8.AbstractC0816i;
import F8.InterfaceC0846x0;
import F8.L;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L f4268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p219v8.p f4269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final H8.g f4270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C0925b f4271d;

    static final class a extends kotlin.jvm.internal.o implements p219v8.l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p219v8.l f4272r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ B f4273s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ p219v8.p f4274t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p219v8.l lVar, B b10, p219v8.p pVar) {
            super(1);
            this.f4272r = lVar;
            this.f4273s = b10;
            this.f4274t = pVar;
        }

        public final void a(Throwable th) {
            p079h8.A a10;
            this.f4272r.f(th);
            this.f4273s.f4270c.h(th);
            do {
                Object objF = H8.k.f(this.f4273s.f4270c.g());
                if (objF != null) {
                    this.f4274t.invoke(objF, th);
                    a10 = p079h8.A.f21846a;
                } else {
                    a10 = null;
                }
            } while (a10 != null);
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            a((Throwable) obj);
            return p079h8.A.f21846a;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f4275q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f4276r;

        b(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return B.this.new b(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((b) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0051 A[PHI: r1 r6
          0x0051: PHI (r1v1 v8.p) = (r1v2 v8.p), (r1v4 v8.p) binds: [B:13:0x004e, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]
          0x0051: PHI (r6v5 java.lang.Object) = (r6v12 java.lang.Object), (r6v0 java.lang.Object) binds: [B:13:0x004e, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
        
            if (r1.invoke(r6, r5) == r0) goto L17;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005a -> B:18:0x005d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p139n8.b.e()
                int r1 = r5.f4276r
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                p079h8.r.b(r6)
                goto L5d
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L1a:
                java.lang.Object r1 = r5.f4275q
                v8.p r1 = (p219v8.p) r1
                p079h8.r.b(r6)
                goto L51
            L22:
                p079h8.r.b(r6)
                L0.B r6 = L0.B.this
                L0.b r6 = L0.B.c(r6)
                int r6 = r6.b()
                if (r6 <= 0) goto L6c
            L31:
                L0.B r6 = L0.B.this
                F8.L r6 = L0.B.d(r6)
                F8.M.f(r6)
                L0.B r6 = L0.B.this
                v8.p r1 = L0.B.a(r6)
                L0.B r6 = L0.B.this
                H8.g r6 = L0.B.b(r6)
                r5.f4275q = r1
                r5.f4276r = r3
                java.lang.Object r6 = r6.l(r5)
                if (r6 != r0) goto L51
                goto L5c
            L51:
                r4 = 0
                r5.f4275q = r4
                r5.f4276r = r2
                java.lang.Object r6 = r1.invoke(r6, r5)
                if (r6 != r0) goto L5d
            L5c:
                return r0
            L5d:
                L0.B r6 = L0.B.this
                L0.b r6 = L0.B.c(r6)
                int r6 = r6.a()
                if (r6 != 0) goto L31
                h8.A r5 = p079h8.A.f21846a
                return r5
            L6c:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "Check failed."
                r5.<init>(r6)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: L0.B.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public B(L scope, p219v8.l onComplete, p219v8.p onUndeliveredElement, p219v8.p consumeMessage) {
        kotlin.jvm.internal.n.h(scope, "scope");
        kotlin.jvm.internal.n.h(onComplete, "onComplete");
        kotlin.jvm.internal.n.h(onUndeliveredElement, "onUndeliveredElement");
        kotlin.jvm.internal.n.h(consumeMessage, "consumeMessage");
        this.f4268a = scope;
        this.f4269b = consumeMessage;
        this.f4270c = H8.j.b(SubsamplingScaleImageView.TILE_SIZE_AUTO, null, null, 6, null);
        this.f4271d = new C0925b(0);
        InterfaceC0846x0 interfaceC0846x0 = (InterfaceC0846x0) scope.w0().b(InterfaceC0846x0.f1901e);
        if (interfaceC0846x0 != null) {
            interfaceC0846x0.c1(new a(onComplete, this, onUndeliveredElement));
        }
    }

    public final void e(Object obj) throws Throwable {
        Object objP = this.f4270c.p(obj);
        if (objP instanceof H8.k.a) {
            Throwable thE = H8.k.e(objP);
            if (thE != null) {
                throw thE;
            }
            throw new H8.p("Channel was closed normally");
        }
        if (!H8.k.i(objP)) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f4271d.c() == 0) {
            AbstractC0816i.d(this.f4268a, null, null, new b(null), 3, null);
        }
    }
}
