package J7;

import F8.AbstractC0816i;
import F8.L;
import p079h8.A;
import p079h8.r;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f3865a = new l();

    static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f3866q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ U5.a f3867r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(U5.a aVar, p129m8.e eVar) {
            super(2, eVar);
            this.f3867r = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return new a(this.f3867r, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f3866q;
            if (i10 == 0) {
                r.b(obj);
                U5.a aVar = this.f3867r;
                this.f3866q = 1;
                if (aVar.k(this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return A.f21846a;
        }
    }

    private l() {
    }

    @Override // J7.o
    public void a(U5.a repository) {
        kotlin.jvm.internal.n.h(repository, "repository");
        repository.f();
    }

    @Override // J7.o
    public void b(L scope, U5.a repository, boolean z9) {
        kotlin.jvm.internal.n.h(scope, "scope");
        kotlin.jvm.internal.n.h(repository, "repository");
        repository.a(z9);
    }

    @Override // J7.o
    public void c(L scope, U5.a repository) {
        kotlin.jvm.internal.n.h(scope, "scope");
        kotlin.jvm.internal.n.h(repository, "repository");
        AbstractC0816i.d(scope, null, null, new a(repository, null), 3, null);
    }

    @Override // J7.o
    public void d(L scope, U5.a repository) {
        kotlin.jvm.internal.n.h(scope, "scope");
        kotlin.jvm.internal.n.h(repository, "repository");
    }

    @Override // J7.o
    public void e(L scope, U5.a repository, p079h8.o info) {
        kotlin.jvm.internal.n.h(scope, "scope");
        kotlin.jvm.internal.n.h(repository, "repository");
        kotlin.jvm.internal.n.h(info, "info");
        repository.q(info);
    }

    @Override // J7.o
    public void f(L scope, U5.a repository) {
        kotlin.jvm.internal.n.h(scope, "scope");
        kotlin.jvm.internal.n.h(repository, "repository");
        repository.v();
    }

    @Override // J7.o
    public void g(L scope, U5.a repository, int i10) {
        kotlin.jvm.internal.n.h(scope, "scope");
        kotlin.jvm.internal.n.h(repository, "repository");
        repository.y(i10);
    }
}
