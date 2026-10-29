package H8;

import F8.C0826n;
import F8.G;
import F8.InterfaceC0822l;
import F8.InterfaceC0846x0;
import F8.L;
import F8.N;
import p079h8.A;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r {

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f2631q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f2632r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f2633s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f2634t;

        a(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f2633s = obj;
            this.f2634t |= Integer.MIN_VALUE;
            return r.a(null, null, this);
        }
    }

    static final class b implements p219v8.l {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0822l f2635q;

        b(InterfaceC0822l interfaceC0822l) {
            this.f2635q = interfaceC0822l;
        }

        public final void a(Throwable th) {
            InterfaceC0822l interfaceC0822l = this.f2635q;
            h8.q.a aVar = p079h8.q.f21862r;
            interfaceC0822l.resumeWith(p079h8.q.b(A.f21846a));
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            a((Throwable) obj);
            return A.f21846a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(t tVar, p219v8.a aVar, p129m8.e eVar) {
        a aVar2;
        if (eVar instanceof a) {
            aVar2 = (a) eVar;
            int i10 = aVar2.f2634t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar2.f2634t = i10 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(eVar);
            }
        } else {
            aVar2 = new a(eVar);
        }
        Object obj = aVar2.f2633s;
        Object objE = p139n8.b.e();
        int i11 = aVar2.f2634t;
        try {
            if (i11 == 0) {
                p079h8.r.b(obj);
                if (aVar2.getContext().b(InterfaceC0846x0.f1901e) != tVar) {
                    throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                }
                aVar2.f2631q = tVar;
                aVar2.f2632r = aVar;
                aVar2.f2634t = 1;
                C0826n c0826n = new C0826n(p139n8.b.c(aVar2), 1);
                c0826n.G();
                tVar.e(new b(c0826n));
                Object objA = c0826n.A();
                if (objA == p139n8.b.e()) {
                    kotlin.coroutines.jvm.internal.h.c(aVar2);
                }
                if (objA == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (p219v8.a) aVar2.f2632r;
                p079h8.r.b(obj);
            }
            aVar.invoke();
            return A.f21846a;
        } catch (Throwable th) {
            aVar.invoke();
            throw th;
        }
    }

    public static final v b(L l9, p129m8.i iVar, int i10, H8.a aVar, N n9, p219v8.l lVar, p219v8.p pVar) {
        s sVar = new s(G.j(l9, iVar), j.b(i10, aVar, null, 4, null));
        if (lVar != null) {
            sVar.c1(lVar);
        }
        sVar.W0(n9, sVar, pVar);
        return sVar;
    }

    public static final v c(L l9, p129m8.i iVar, int i10, p219v8.p pVar) {
        return b(l9, iVar, i10, H8.a.SUSPEND, N.DEFAULT, null, pVar);
    }

    public static /* synthetic */ v d(L l9, p129m8.i iVar, int i10, H8.a aVar, N n9, p219v8.l lVar, p219v8.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iVar = p129m8.j.f23252q;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            aVar = H8.a.SUSPEND;
        }
        if ((i11 & 8) != 0) {
            n9 = N.DEFAULT;
        }
        if ((i11 & 16) != 0) {
            lVar = null;
        }
        p219v8.l lVar2 = lVar;
        return b(l9, iVar, i10, aVar, n9, lVar2, pVar);
    }

    public static /* synthetic */ v e(L l9, p129m8.i iVar, int i10, p219v8.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iVar = p129m8.j.f23252q;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return c(l9, iVar, i10, pVar);
    }
}
