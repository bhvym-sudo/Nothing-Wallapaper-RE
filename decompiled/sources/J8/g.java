package J8;

import F8.G;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g extends e {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected final InterfaceC0880f f3899t;

    static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f3900q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f3901r;

        a(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            a aVar = g.this.new a(eVar);
            aVar.f3901r = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f3900q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                InterfaceC0881g interfaceC0881g = (InterfaceC0881g) this.f3901r;
                g gVar = g.this;
                this.f3900q = 1;
                if (gVar.t(interfaceC0881g, this) == objE) {
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
        public final Object invoke(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            return ((a) create(interfaceC0881g, eVar)).invokeSuspend(p079h8.A.f21846a);
        }
    }

    public g(InterfaceC0880f interfaceC0880f, p129m8.i iVar, int i10, H8.a aVar) {
        super(iVar, i10, aVar);
        this.f3899t = interfaceC0880f;
    }

    static /* synthetic */ Object q(g gVar, InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
        if (gVar.f3890r == -3) {
            p129m8.i context = eVar.getContext();
            p129m8.i iVarK = G.k(context, gVar.f3889q);
            if (kotlin.jvm.internal.n.d(iVarK, context)) {
                Object objT = gVar.t(interfaceC0881g, eVar);
                return objT == p139n8.b.e() ? objT : p079h8.A.f21846a;
            }
            m8.f.b bVar = p129m8.f.f23250l;
            if (kotlin.jvm.internal.n.d(iVarK.b(bVar), context.b(bVar))) {
                Object objS = gVar.s(interfaceC0881g, iVarK, eVar);
                return objS == p139n8.b.e() ? objS : p079h8.A.f21846a;
            }
        }
        Object objA = super.a(interfaceC0881g, eVar);
        return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
    }

    static /* synthetic */ Object r(g gVar, H8.t tVar, p129m8.e eVar) {
        Object objT = gVar.t(new z(tVar), eVar);
        return objT == p139n8.b.e() ? objT : p079h8.A.f21846a;
    }

    private final Object s(InterfaceC0881g interfaceC0881g, p129m8.i iVar, p129m8.e eVar) {
        return f.c(iVar, f.d(interfaceC0881g, eVar.getContext()), null, new a(null), eVar, 4, null);
    }

    @Override // J8.e, I8.InterfaceC0880f
    public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
        return q(this, interfaceC0881g, eVar);
    }

    @Override // J8.e
    protected Object j(H8.t tVar, p129m8.e eVar) {
        return r(this, tVar, eVar);
    }

    protected abstract Object t(InterfaceC0881g interfaceC0881g, p129m8.e eVar);

    @Override // J8.e
    public String toString() {
        return this.f3899t + " -> " + super.toString();
    }
}
