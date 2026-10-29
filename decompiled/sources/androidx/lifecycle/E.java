package androidx.lifecycle;

import F8.AbstractC0812g;
import F8.C0803b0;

/* JADX INFO: loaded from: classes.dex */
public final class E implements D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C1146f f13278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p129m8.i f13279b;

    static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f13280q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Object f13282s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Object obj, p129m8.e eVar) {
            super(2, eVar);
            this.f13282s = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return E.this.new a(this.f13282s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(F8.L l9, p129m8.e eVar) {
            return ((a) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f13280q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                C1146f c1146fA = E.this.a();
                this.f13280q = 1;
                if (c1146fA.p(this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
            }
            E.this.a().n(this.f13282s);
            return p079h8.A.f21846a;
        }
    }

    public E(C1146f target, p129m8.i context) {
        kotlin.jvm.internal.n.h(target, "target");
        kotlin.jvm.internal.n.h(context, "context");
        this.f13278a = target;
        this.f13279b = context.z(C0803b0.c().n1());
    }

    public final C1146f a() {
        return this.f13278a;
    }

    @Override // androidx.lifecycle.D
    public Object b(Object obj, p129m8.e eVar) {
        Object objG = AbstractC0812g.g(this.f13279b, new a(obj, null), eVar);
        return objG == p139n8.b.e() ? objG : p079h8.A.f21846a;
    }
}
