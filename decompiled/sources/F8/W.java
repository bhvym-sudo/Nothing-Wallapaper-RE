package F8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class W {

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f1838q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f1839r;

        a(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f1838q = obj;
            this.f1839r |= Integer.MIN_VALUE;
            return W.a(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(p129m8.e eVar) {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i10 = aVar.f1839r;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f1839r = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f1838q;
        Object objE = p139n8.b.e();
        int i11 = aVar.f1839r;
        if (i11 == 0) {
            p079h8.r.b(obj);
            aVar.f1839r = 1;
            C0826n c0826n = new C0826n(p139n8.b.c(aVar), 1);
            c0826n.G();
            Object objA = c0826n.A();
            if (objA == p139n8.b.e()) {
                kotlin.coroutines.jvm.internal.h.c(aVar);
            }
            if (objA == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
        }
        throw new p079h8.f();
    }

    public static final Object b(long j9, p129m8.e eVar) {
        if (j9 <= 0) {
            return p079h8.A.f21846a;
        }
        C0826n c0826n = new C0826n(p139n8.b.c(eVar), 1);
        c0826n.G();
        if (j9 < Long.MAX_VALUE) {
            c(c0826n.getContext()).T0(j9, c0826n);
        }
        Object objA = c0826n.A();
        if (objA == p139n8.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
    }

    public static final V c(p129m8.i iVar) {
        m8.i.b bVarB = iVar.b(p129m8.f.f23250l);
        V v9 = bVarB instanceof V ? (V) bVarB : null;
        return v9 == null ? S.a() : v9;
    }
}
