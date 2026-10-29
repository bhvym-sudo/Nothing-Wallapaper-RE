package F8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Y0 {

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        long f1844q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f1845r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f1846s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f1847t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f1848u;

        a(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f1847t = obj;
            this.f1848u |= Integer.MIN_VALUE;
            return Y0.c(0L, null, this);
        }
    }

    public static final W0 a(long j9, V v9, InterfaceC0846x0 interfaceC0846x0) {
        return new W0("Timed out waiting for " + j9 + " ms", interfaceC0846x0);
    }

    private static final Object b(X0 x9, p219v8.p pVar) {
        A0.h(x9, W.c(x9.f4198t.getContext()).W0(x9.f1842u, x9, x9.getContext()));
        return L8.b.c(x9, x9, pVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(long j9, p219v8.p pVar, p129m8.e eVar) {
        a aVar;
        kotlin.jvm.internal.E e10;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i10 = aVar.f1848u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f1848u = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f1847t;
        Object objE = p139n8.b.e();
        int i11 = aVar.f1848u;
        if (i11 == 0) {
            p079h8.r.b(obj);
            if (j9 <= 0) {
                return null;
            }
            kotlin.jvm.internal.E e11 = new kotlin.jvm.internal.E();
            try {
                aVar.f1845r = pVar;
                aVar.f1846s = e11;
                aVar.f1844q = j9;
                aVar.f1848u = 1;
                X0 x9 = new X0(j9, aVar);
                e11.f22779q = x9;
                Object objB = b(x9, pVar);
                if (objB == p139n8.b.e()) {
                    kotlin.coroutines.jvm.internal.h.c(aVar);
                }
                return objB == objE ? objE : objB;
            } catch (W0 e12) {
                e = e12;
                e10 = e11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e10 = (kotlin.jvm.internal.E) aVar.f1846s;
            try {
                p079h8.r.b(obj);
                return obj;
            } catch (W0 e13) {
                e = e13;
            }
        }
        if (e.f1840q == e10.f22779q) {
            return null;
        }
        throw e;
    }
}
