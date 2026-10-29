package N8;

import F8.W;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.n;
import p079h8.A;
import p219v8.q;

/* JADX INFO: loaded from: classes2.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f5399a;

    /* synthetic */ class a extends kotlin.jvm.internal.l implements q {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final a f5400q = new a();

        a() {
            super(3, b.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        @Override // p219v8.q
        public /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3) {
            g((b) obj, (k) obj2, obj3);
            return A.f21846a;
        }

        public final void g(b bVar, k kVar, Object obj) {
            bVar.d(kVar, obj);
        }
    }

    public b(long j9) {
        this.f5399a = j9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(final k kVar, Object obj) {
        if (this.f5399a <= 0) {
            kVar.f(A.f21846a);
            return;
        }
        Runnable runnable = new Runnable() { // from class: N8.a
            @Override // java.lang.Runnable
            public final void run() {
                b.e(kVar, this);
            }
        };
        n.f(kVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        j jVar = (j) kVar;
        p129m8.i context = jVar.getContext();
        jVar.n(W.c(context).W0(this.f5399a, runnable, context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(k kVar, b bVar) {
        kVar.d(bVar, A.f21846a);
    }

    public final e c() {
        a aVar = a.f5400q;
        n.f(aVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        return new f(this, (q) I.d(aVar, 3), null, 4, null);
    }
}
