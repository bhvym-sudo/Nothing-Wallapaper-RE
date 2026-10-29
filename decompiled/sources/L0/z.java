package L0;

import F8.AbstractC0845x;
import F8.InterfaceC0841v;

/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O8.a f4522a = O8.g.b(false, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0841v f4523b = AbstractC0845x.b(null, 1, null);

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f4524q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f4525r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f4526s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f4528u;

        a(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f4526s = obj;
            this.f4528u |= Integer.MIN_VALUE;
            return z.this.c(this);
        }
    }

    public final Object a(p129m8.e eVar) {
        Object objP0 = this.f4523b.P0(eVar);
        return objP0 == p139n8.b.e() ? objP0 : p079h8.A.f21846a;
    }

    protected abstract Object b(p129m8.e eVar);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(p129m8.e eVar) throws Throwable {
        a aVar;
        O8.a aVar2;
        Throwable th;
        O8.a aVar3;
        z zVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i10 = aVar.f4528u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f4528u = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f4526s;
        Object objE = p139n8.b.e();
        int i11 = aVar.f4528u;
        try {
            if (i11 == 0) {
                p079h8.r.b(obj);
                if (this.f4523b.O0()) {
                    return p079h8.A.f21846a;
                }
                aVar2 = this.f4522a;
                aVar.f4524q = this;
                aVar.f4525r = aVar2;
                aVar.f4528u = 1;
                if (aVar2.c(null, aVar) != objE) {
                }
                return objE;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar3 = (O8.a) aVar.f4525r;
                zVar = (z) aVar.f4524q;
                try {
                    p079h8.r.b(obj);
                    InterfaceC0841v interfaceC0841v = zVar.f4523b;
                    p079h8.A a10 = p079h8.A.f21846a;
                    interfaceC0841v.B0(a10);
                    aVar3.b(null);
                    return a10;
                } catch (Throwable th2) {
                    th = th2;
                    aVar3.b(null);
                    throw th;
                }
            }
            O8.a aVar4 = (O8.a) aVar.f4525r;
            z zVar2 = (z) aVar.f4524q;
            p079h8.r.b(obj);
            aVar2 = aVar4;
            this = zVar2;
            if (this.f4523b.O0()) {
                p079h8.A a11 = p079h8.A.f21846a;
                aVar2.b(null);
                return a11;
            }
            aVar.f4524q = this;
            aVar.f4525r = aVar2;
            aVar.f4528u = 2;
            if (this.b(aVar) != objE) {
                zVar = this;
                aVar3 = aVar2;
                InterfaceC0841v interfaceC0841v2 = zVar.f4523b;
                p079h8.A a12 = p079h8.A.f21846a;
                interfaceC0841v2.B0(a12);
                aVar3.b(null);
                return a12;
            }
            return objE;
        } catch (Throwable th3) {
            O8.a aVar5 = aVar2;
            th = th3;
            aVar3 = aVar5;
            aVar3.b(null);
            throw th;
        }
    }
}
