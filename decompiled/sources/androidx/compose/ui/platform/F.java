package androidx.compose.ui.platform;

import F8.C0826n;
import F8.InterfaceC0822l;
import android.view.Choreographer;
import p170r.InterfaceC1669a0;

/* JADX INFO: loaded from: classes.dex */
public final class F implements InterfaceC1669a0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Choreographer f11711q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final D f11712r;

    static final class a extends kotlin.jvm.internal.o implements p219v8.l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ D f11713r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Choreographer.FrameCallback f11714s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(D d10, Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f11713r = d10;
            this.f11714s = frameCallback;
        }

        public final void a(Throwable th) {
            this.f11713r.z1(this.f11714s);
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            a((Throwable) obj);
            return p079h8.A.f21846a;
        }
    }

    static final class b extends kotlin.jvm.internal.o implements p219v8.l {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Choreographer.FrameCallback f11716s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f11716s = frameCallback;
        }

        public final void a(Throwable th) {
            F.this.c().removeFrameCallback(this.f11716s);
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            a((Throwable) obj);
            return p079h8.A.f21846a;
        }
    }

    static final class c implements Choreographer.FrameCallback {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0822l f11717q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ F f11718r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ p219v8.l f11719s;

        c(InterfaceC0822l interfaceC0822l, F f10, p219v8.l lVar) {
            this.f11717q = interfaceC0822l;
            this.f11718r = f10;
            this.f11719s = lVar;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j9) {
            Object objB;
            InterfaceC0822l interfaceC0822l = this.f11717q;
            p219v8.l lVar = this.f11719s;
            try {
                h8.q.a aVar = p079h8.q.f21862r;
                objB = p079h8.q.b(lVar.f(Long.valueOf(j9)));
            } catch (Throwable th) {
                h8.q.a aVar2 = p079h8.q.f21862r;
                objB = p079h8.q.b(p079h8.r.a(th));
            }
            interfaceC0822l.resumeWith(objB);
        }
    }

    public F(Choreographer choreographer, D d10) {
        this.f11711q = choreographer;
        this.f11712r = d10;
    }

    @Override // p129m8.i
    public Object U0(Object obj, p219v8.p pVar) {
        return InterfaceC1669a0.a.a(this, obj, pVar);
    }

    @Override // m8.i.b, p129m8.i
    public m8.i.b b(m8.i.c cVar) {
        return InterfaceC1669a0.a.b(this, cVar);
    }

    public final Choreographer c() {
        return this.f11711q;
    }

    @Override // p129m8.i
    public p129m8.i t0(m8.i.c cVar) {
        return InterfaceC1669a0.a.c(this, cVar);
    }

    @Override // p170r.InterfaceC1669a0
    public Object u(p219v8.l lVar, p129m8.e eVar) {
        D d10 = this.f11712r;
        if (d10 == null) {
            m8.i.b bVarB = eVar.getContext().b(p129m8.f.f23250l);
            d10 = bVarB instanceof D ? (D) bVarB : null;
        }
        C0826n c0826n = new C0826n(p139n8.b.c(eVar), 1);
        c0826n.G();
        c cVar = new c(c0826n, this, lVar);
        if (d10 == null || !kotlin.jvm.internal.n.d(d10.t1(), c())) {
            c().postFrameCallback(cVar);
            c0826n.i(new b(cVar));
        } else {
            d10.y1(cVar);
            c0826n.i(new a(d10, cVar));
        }
        Object objA = c0826n.A();
        if (objA == p139n8.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objA;
    }

    @Override // p129m8.i
    public p129m8.i z(p129m8.i iVar) {
        return InterfaceC1669a0.a.d(this, iVar);
    }
}
