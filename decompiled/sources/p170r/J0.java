package p170r;

import F8.AbstractC0812g;
import F8.C0803b0;
import F8.L;
import F8.W;
import kotlin.coroutines.jvm.internal.l;
import p079h8.A;
import p079h8.r;
import p129m8.e;
import p129m8.i;
import p139n8.b;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
final class J0 implements InterfaceC1669a0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final J0 f25307q = new J0();

    static final class a extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f25308q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p219v8.l f25309r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p219v8.l lVar, e eVar) {
            super(2, eVar);
            this.f25309r = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new a(this.f25309r, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, e eVar) {
            return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = b.e();
            int i10 = this.f25308q;
            if (i10 == 0) {
                r.b(obj);
                this.f25308q = 1;
                if (W.b(16L, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return this.f25309r.f(kotlin.coroutines.jvm.internal.b.d(System.nanoTime()));
        }
    }

    private J0() {
    }

    @Override // p129m8.i
    public Object U0(Object obj, p pVar) {
        return InterfaceC1669a0.a.a(this, obj, pVar);
    }

    @Override // m8.i.b, p129m8.i
    public i.b b(i.c cVar) {
        return InterfaceC1669a0.a.b(this, cVar);
    }

    @Override // p129m8.i
    public i t0(i.c cVar) {
        return InterfaceC1669a0.a.c(this, cVar);
    }

    @Override // p170r.InterfaceC1669a0
    public Object u(p219v8.l lVar, e eVar) {
        return AbstractC0812g.g(C0803b0.c(), new a(lVar, null), eVar);
    }

    @Override // p129m8.i
    public i z(i iVar) {
        return InterfaceC1669a0.a.d(this, iVar);
    }
}
