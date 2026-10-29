package I8;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import p089i8.AbstractC1439m;

/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f3325a = K8.E.b("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, SubsamplingScaleImageView.TILE_SIZE_AUTO);

    static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.q {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f3326q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f3327r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f3328s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ p219v8.p f3329t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p219v8.p pVar, p129m8.e eVar) {
            super(3, eVar);
            this.f3329t = pVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        
            if (r1.b(r6, r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p139n8.b.e()
                int r1 = r5.f3326q
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                p079h8.r.b(r6)
                goto L45
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L1a:
                java.lang.Object r1 = r5.f3327r
                I8.g r1 = (I8.InterfaceC0881g) r1
                p079h8.r.b(r6)
                goto L39
            L22:
                p079h8.r.b(r6)
                java.lang.Object r6 = r5.f3327r
                r1 = r6
                I8.g r1 = (I8.InterfaceC0881g) r1
                java.lang.Object r6 = r5.f3328s
                v8.p r4 = r5.f3329t
                r5.f3327r = r1
                r5.f3326q = r3
                java.lang.Object r6 = r4.invoke(r6, r5)
                if (r6 != r0) goto L39
                goto L44
            L39:
                r3 = 0
                r5.f3327r = r3
                r5.f3326q = r2
                java.lang.Object r5 = r1.b(r6, r5)
                if (r5 != r0) goto L45
            L44:
                return r0
            L45:
                h8.A r5 = p079h8.A.f21846a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: I8.u.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p219v8.q
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object e(InterfaceC0881g interfaceC0881g, Object obj, p129m8.e eVar) {
            a aVar = new a(this.f3329t, eVar);
            aVar.f3327r = interfaceC0881g;
            aVar.f3328s = obj;
            return aVar.invokeSuspend(p079h8.A.f21846a);
        }
    }

    public static final InterfaceC0880f a(InterfaceC0880f interfaceC0880f, p219v8.p pVar) {
        return AbstractC0882h.N(interfaceC0880f, new a(pVar, null));
    }

    public static final InterfaceC0880f b(Iterable iterable) {
        return new J8.j(iterable, null, 0, null, 14, null);
    }

    public static final InterfaceC0880f c(InterfaceC0880f... interfaceC0880fArr) {
        return AbstractC0882h.F(AbstractC1439m.A(interfaceC0880fArr));
    }

    public static final InterfaceC0880f d(InterfaceC0880f interfaceC0880f, p219v8.q qVar) {
        return new J8.i(qVar, interfaceC0880f, null, 0, null, 28, null);
    }
}
