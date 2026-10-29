package p170r;

import F8.AbstractC0812g;
import F8.C0803b0;
import F8.C0826n;
import F8.InterfaceC0822l;
import F8.L;
import android.view.Choreographer;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.o;
import p079h8.A;
import p079h8.q;
import p079h8.r;
import p129m8.e;
import p129m8.i;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
final class C implements InterfaceC1669a0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C f25277q = new C();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Choreographer f25278r = (Choreographer) AbstractC0812g.e(C0803b0.c().n1(), new a(null));

    static final class a extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f25279q;

        a(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new a(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, e eVar) {
            return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f25279q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            return Choreographer.getInstance();
        }
    }

    static final class b extends o implements p219v8.l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Choreographer.FrameCallback f25280r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f25280r = frameCallback;
        }

        public final void a(Throwable th) {
            C.f25278r.removeFrameCallback(this.f25280r);
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            a((Throwable) obj);
            return A.f21846a;
        }
    }

    static final class c implements Choreographer.FrameCallback {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0822l f25281q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p219v8.l f25282r;

        c(InterfaceC0822l interfaceC0822l, p219v8.l lVar) {
            this.f25281q = interfaceC0822l;
            this.f25282r = lVar;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j9) {
            Object objB;
            InterfaceC0822l interfaceC0822l = this.f25281q;
            C c10 = C.f25277q;
            p219v8.l lVar = this.f25282r;
            try {
                q.a aVar = q.f21862r;
                objB = q.b(lVar.f(Long.valueOf(j9)));
            } catch (Throwable th) {
                q.a aVar2 = q.f21862r;
                objB = q.b(r.a(th));
            }
            interfaceC0822l.resumeWith(objB);
        }
    }

    private C() {
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
        C0826n c0826n = new C0826n(p139n8.b.c(eVar), 1);
        c0826n.G();
        c cVar = new c(c0826n, lVar);
        f25278r.postFrameCallback(cVar);
        c0826n.i(new b(cVar));
        Object objA = c0826n.A();
        if (objA == p139n8.b.e()) {
            h.c(eVar);
        }
        return objA;
    }

    @Override // p129m8.i
    public i z(i iVar) {
        return InterfaceC1669a0.a.d(this, iVar);
    }
}
