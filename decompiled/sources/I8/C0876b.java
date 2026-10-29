package I8;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: renamed from: I8.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0876b extends AbstractC0877c {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final p219v8.p f3212u;

    /* JADX INFO: renamed from: I8.b$a */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f3213q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f3214r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f3216t;

        a(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3214r = obj;
            this.f3216t |= Integer.MIN_VALUE;
            return C0876b.this.j(null, this);
        }
    }

    public /* synthetic */ C0876b(p219v8.p pVar, p129m8.i iVar, int i10, H8.a aVar, int i11, AbstractC1457h abstractC1457h) {
        this(pVar, (i11 & 2) != 0 ? p129m8.j.f23252q : iVar, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? H8.a.SUSPEND : aVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // I8.AbstractC0877c, J8.e
    protected Object j(H8.t tVar, p129m8.e eVar) {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i10 = aVar.f3216t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f3216t = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f3214r;
        Object objE = p139n8.b.e();
        int i11 = aVar.f3216t;
        if (i11 == 0) {
            p079h8.r.b(obj);
            aVar.f3213q = tVar;
            aVar.f3216t = 1;
            if (super.j(tVar, aVar) == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tVar = (H8.t) aVar.f3213q;
            p079h8.r.b(obj);
        }
        if (tVar.s()) {
            return p079h8.A.f21846a;
        }
        throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
    }

    @Override // J8.e
    protected J8.e k(p129m8.i iVar, int i10, H8.a aVar) {
        return new C0876b(this.f3212u, iVar, i10, aVar);
    }

    public C0876b(p219v8.p pVar, p129m8.i iVar, int i10, H8.a aVar) {
        super(pVar, iVar, i10, aVar);
        this.f3212u = pVar;
    }
}
