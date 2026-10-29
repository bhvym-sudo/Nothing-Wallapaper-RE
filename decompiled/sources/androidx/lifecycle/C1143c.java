package androidx.lifecycle;

import F8.AbstractC0816i;
import F8.C0803b0;
import F8.InterfaceC0846x0;

/* JADX INFO: renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1143c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1146f f13367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p219v8.p f13368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f13369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final F8.L f13370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p219v8.a f13371e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InterfaceC0846x0 f13372f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private InterfaceC0846x0 f13373g;

    /* JADX INFO: renamed from: androidx.lifecycle.c$a */
    static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f13374q;

        a(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return C1143c.this.new a(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(F8.L l9, p129m8.e eVar) {
            return ((a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f13374q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                long j9 = C1143c.this.f13369c;
                this.f13374q = 1;
                if (F8.W.b(j9, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
            }
            if (!C1143c.this.f13367a.f()) {
                InterfaceC0846x0 interfaceC0846x0 = C1143c.this.f13372f;
                if (interfaceC0846x0 != null) {
                    InterfaceC0846x0.a.a(interfaceC0846x0, null, 1, null);
                }
                C1143c.this.f13372f = null;
            }
            return p079h8.A.f21846a;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.c$b */
    static final class b extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f13376q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f13377r;

        b(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            b bVar = C1143c.this.new b(eVar);
            bVar.f13377r = obj;
            return bVar;
        }

        @Override // p219v8.p
        public final Object invoke(F8.L l9, p129m8.e eVar) {
            return ((b) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f13376q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                E e10 = new E(C1143c.this.f13367a, ((F8.L) this.f13377r).w0());
                p219v8.p pVar = C1143c.this.f13368b;
                this.f13376q = 1;
                if (pVar.invoke(e10, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
            }
            C1143c.this.f13371e.invoke();
            return p079h8.A.f21846a;
        }
    }

    public C1143c(C1146f liveData, p219v8.p block, long j9, F8.L scope, p219v8.a onDone) {
        kotlin.jvm.internal.n.h(liveData, "liveData");
        kotlin.jvm.internal.n.h(block, "block");
        kotlin.jvm.internal.n.h(scope, "scope");
        kotlin.jvm.internal.n.h(onDone, "onDone");
        this.f13367a = liveData;
        this.f13368b = block;
        this.f13369c = j9;
        this.f13370d = scope;
        this.f13371e = onDone;
    }

    public final void g() {
        if (this.f13373g != null) {
            throw new IllegalStateException("Cancel call cannot happen without a maybeRun");
        }
        this.f13373g = AbstractC0816i.d(this.f13370d, C0803b0.c().n1(), null, new a(null), 2, null);
    }

    public final void h() {
        InterfaceC0846x0 interfaceC0846x0 = this.f13373g;
        if (interfaceC0846x0 != null) {
            InterfaceC0846x0.a.a(interfaceC0846x0, null, 1, null);
        }
        this.f13373g = null;
        if (this.f13372f != null) {
            return;
        }
        this.f13372f = AbstractC0816i.d(this.f13370d, null, null, new b(null), 3, null);
    }
}
