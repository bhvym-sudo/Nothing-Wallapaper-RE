package p073h2;

import F8.AbstractC0816i;
import F8.L;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.d0;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.r;
import p129m8.e;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
public final class a extends a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final U2.a f21600b;

    /* JADX INFO: renamed from: h2.a$a, reason: collision with other inner class name */
    public static final class C0546a implements d0.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final U2.a f21601b;

        public C0546a(U2.a interactor) {
            n.h(interactor, "interactor");
            this.f21601b = interactor;
        }

        @Override // androidx.lifecycle.d0.c
        public a0 a(Class modelClass) {
            n.h(modelClass, "modelClass");
            return new a(this.f21601b);
        }
    }

    static final class b extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f21602q;

        b(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return a.this.new b(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, e eVar) {
            return ((b) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f21602q;
            if (i10 == 0) {
                r.b(obj);
                U2.a aVar = a.this.f21600b;
                this.f21602q = 1;
                if (aVar.c(this) == objE) {
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

    public a(U2.a interactor) {
        n.h(interactor, "interactor");
        this.f21600b = interactor;
    }

    public final Object f(e eVar) {
        return this.f21600b.a(eVar);
    }

    public final void g() {
        AbstractC0816i.d(b0.a(this), null, null, new b(null), 3, null);
    }
}
