package I8;

/* JADX INFO: renamed from: I8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0875a implements InterfaceC0880f {

    /* JADX INFO: renamed from: I8.a$a, reason: collision with other inner class name */
    static final class C0106a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f3208q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f3209r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f3211t;

        C0106a(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3209r = obj;
            this.f3211t |= Integer.MIN_VALUE;
            return AbstractC0875a.this.a(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // I8.InterfaceC0880f
    public final Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) throws Throwable {
        C0106a c0106a;
        J8.v vVar;
        if (eVar instanceof C0106a) {
            c0106a = (C0106a) eVar;
            int i10 = c0106a.f3211t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0106a.f3211t = i10 - Integer.MIN_VALUE;
            } else {
                c0106a = new C0106a(eVar);
            }
        } else {
            c0106a = new C0106a(eVar);
        }
        Object obj = c0106a.f3209r;
        Object objE = p139n8.b.e();
        int i11 = c0106a.f3211t;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vVar = (J8.v) c0106a.f3208q;
            try {
                p079h8.r.b(obj);
                vVar.releaseIntercepted();
                return p079h8.A.f21846a;
            } catch (Throwable th) {
                th = th;
                vVar.releaseIntercepted();
                throw th;
            }
        }
        p079h8.r.b(obj);
        J8.v vVar2 = new J8.v(interfaceC0881g, c0106a.getContext());
        try {
            c0106a.f3208q = vVar2;
            c0106a.f3211t = 1;
            if (f(vVar2, c0106a) == objE) {
                return objE;
            }
            vVar = vVar2;
            vVar.releaseIntercepted();
            return p079h8.A.f21846a;
        } catch (Throwable th2) {
            th = th2;
            vVar = vVar2;
            vVar.releaseIntercepted();
            throw th;
        }
    }

    public abstract Object f(InterfaceC0881g interfaceC0881g, p129m8.e eVar);
}
