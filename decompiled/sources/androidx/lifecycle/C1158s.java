package androidx.lifecycle;

import F8.AbstractC0816i;
import F8.B0;
import F8.C0803b0;

/* JADX INFO: renamed from: androidx.lifecycle.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1158s extends r implements InterfaceC1160u {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final AbstractC1157q f13454q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final p129m8.i f13455r;

    /* JADX INFO: renamed from: androidx.lifecycle.s$a */
    static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f13456q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f13457r;

        a(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            a aVar = C1158s.this.new a(eVar);
            aVar.f13457r = obj;
            return aVar;
        }

        @Override // p219v8.p
        public final Object invoke(F8.L l9, p129m8.e eVar) {
            return ((a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f13456q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            F8.L l9 = (F8.L) this.f13457r;
            if (C1158s.this.a().b().compareTo(AbstractC1157q.b.INITIALIZED) >= 0) {
                C1158s.this.a().a(C1158s.this);
            } else {
                B0.f(l9.w0(), null, 1, null);
            }
            return p079h8.A.f21846a;
        }
    }

    public C1158s(AbstractC1157q lifecycle, p129m8.i coroutineContext) {
        kotlin.jvm.internal.n.h(lifecycle, "lifecycle");
        kotlin.jvm.internal.n.h(coroutineContext, "coroutineContext");
        this.f13454q = lifecycle;
        this.f13455r = coroutineContext;
        if (a().b() == AbstractC1157q.b.DESTROYED) {
            B0.f(w0(), null, 1, null);
        }
    }

    public AbstractC1157q a() {
        return this.f13454q;
    }

    public final void c() {
        AbstractC0816i.d(this, C0803b0.c().n1(), null, new a(null), 2, null);
    }

    @Override // androidx.lifecycle.InterfaceC1160u
    public void onStateChanged(InterfaceC1163x source, AbstractC1157q.a event) {
        kotlin.jvm.internal.n.h(source, "source");
        kotlin.jvm.internal.n.h(event, "event");
        if (a().b().compareTo(AbstractC1157q.b.DESTROYED) <= 0) {
            a().d(this);
            B0.f(w0(), null, 1, null);
        }
    }

    @Override // F8.L
    public p129m8.i w0() {
        return this.f13455r;
    }
}
