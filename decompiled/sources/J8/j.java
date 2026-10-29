package J8;

import F8.AbstractC0816i;
import F8.L;
import I8.InterfaceC0880f;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends e {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Iterable f3922t;

    static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f3923q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f3924r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ z f3925s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC0880f interfaceC0880f, z zVar, p129m8.e eVar) {
            super(2, eVar);
            this.f3924r = interfaceC0880f;
            this.f3925s = zVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return new a(this.f3924r, this.f3925s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f3923q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                InterfaceC0880f interfaceC0880f = this.f3924r;
                z zVar = this.f3925s;
                this.f3923q = 1;
                if (interfaceC0880f.a(zVar, this) == objE) {
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

    public /* synthetic */ j(Iterable iterable, p129m8.i iVar, int i10, H8.a aVar, int i11, AbstractC1457h abstractC1457h) {
        this(iterable, (i11 & 2) != 0 ? p129m8.j.f23252q : iVar, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? H8.a.SUSPEND : aVar);
    }

    @Override // J8.e
    protected Object j(H8.t tVar, p129m8.e eVar) {
        z zVar = new z(tVar);
        Iterator it = this.f3922t.iterator();
        while (it.hasNext()) {
            AbstractC0816i.d(tVar, null, null, new a((InterfaceC0880f) it.next(), zVar, null), 3, null);
        }
        return p079h8.A.f21846a;
    }

    @Override // J8.e
    protected e k(p129m8.i iVar, int i10, H8.a aVar) {
        return new j(this.f3922t, iVar, i10, aVar);
    }

    @Override // J8.e
    public H8.v p(L l9) {
        return H8.r.c(l9, this.f3889q, this.f3890r, n());
    }

    public j(Iterable iterable, p129m8.i iVar, int i10, H8.a aVar) {
        super(iVar, i10, aVar);
        this.f3922t = iterable;
    }
}
