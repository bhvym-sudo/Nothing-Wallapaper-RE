package J8;

import F8.L;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o {

    public static final class a implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ p219v8.q f3948q;

        public a(p219v8.q qVar) {
            this.f3948q = qVar;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = o.a(new b(this.f3948q, interfaceC0881g, null), eVar);
            return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f3949q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f3950r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ p219v8.q f3951s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ InterfaceC0881g f3952t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p219v8.q qVar, InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            super(2, eVar);
            this.f3951s = qVar;
            this.f3952t = interfaceC0881g;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            b bVar = new b(this.f3951s, this.f3952t, eVar);
            bVar.f3950r = obj;
            return bVar;
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((b) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f3949q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                L l9 = (L) this.f3950r;
                p219v8.q qVar = this.f3951s;
                InterfaceC0881g interfaceC0881g = this.f3952t;
                this.f3949q = 1;
                if (qVar.e(l9, interfaceC0881g, this) == objE) {
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
    }

    public static final Object a(p219v8.p pVar, p129m8.e eVar) {
        n nVar = new n(eVar.getContext(), eVar);
        Object objB = L8.b.b(nVar, nVar, pVar);
        if (objB == p139n8.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objB;
    }

    public static final InterfaceC0880f b(p219v8.q qVar) {
        return new a(qVar);
    }
}
