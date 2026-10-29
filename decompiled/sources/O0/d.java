package O0;

import I8.InterfaceC0880f;
import L0.InterfaceC0932i;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.r;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
public final class d implements InterfaceC0932i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0932i f5738a;

    static final class a extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f5739q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f5740r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ p f5741s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p pVar, p129m8.e eVar) {
            super(2, eVar);
            this.f5741s = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            a aVar = new a(this.f5741s, eVar);
            aVar.f5740r = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f5739q;
            if (i10 == 0) {
                r.b(obj);
                f fVar = (f) this.f5740r;
                p pVar = this.f5741s;
                this.f5739q = 1;
                obj = pVar.invoke(fVar, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            f fVar2 = (f) obj;
            n.f(fVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
            ((c) fVar2).f();
            return fVar2;
        }

        @Override // p219v8.p
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object invoke(f fVar, p129m8.e eVar) {
            return ((a) create(fVar, eVar)).invokeSuspend(A.f21846a);
        }
    }

    public d(InterfaceC0932i delegate) {
        n.h(delegate, "delegate");
        this.f5738a = delegate;
    }

    @Override // L0.InterfaceC0932i
    public Object a(p pVar, p129m8.e eVar) {
        return this.f5738a.a(new a(pVar, null), eVar);
    }

    @Override // L0.InterfaceC0932i
    public InterfaceC0880f getData() {
        return this.f5738a.getData();
    }
}
