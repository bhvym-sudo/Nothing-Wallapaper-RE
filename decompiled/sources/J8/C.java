package J8;

import I8.InterfaceC0881g;
import K8.K;

/* JADX INFO: loaded from: classes2.dex */
final class C implements InterfaceC0881g {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final p129m8.i f3877q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Object f3878r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final p219v8.p f3879s;

    static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f3880q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f3881r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ InterfaceC0881g f3882s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            super(2, eVar);
            this.f3882s = interfaceC0881g;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            a aVar = new a(this.f3882s, eVar);
            aVar.f3881r = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f3880q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                Object obj2 = this.f3881r;
                InterfaceC0881g interfaceC0881g = this.f3882s;
                this.f3880q = 1;
                if (interfaceC0881g.b(obj2, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
            }
            return p079h8.A.f21846a;
        }

        @Override // p219v8.p
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, p129m8.e eVar) {
            return ((a) create(obj, eVar)).invokeSuspend(p079h8.A.f21846a);
        }
    }

    public C(InterfaceC0881g interfaceC0881g, p129m8.i iVar) {
        this.f3877q = iVar;
        this.f3878r = K.g(iVar);
        this.f3879s = new a(interfaceC0881g, null);
    }

    @Override // I8.InterfaceC0881g
    public Object b(Object obj, p129m8.e eVar) {
        Object objB = f.b(this.f3877q, obj, this.f3878r, this.f3879s, eVar);
        return objB == p139n8.b.e() ? objB : p079h8.A.f21846a;
    }
}
