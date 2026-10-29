package J8;

import I8.InterfaceC0881g;
import kotlin.jvm.internal.I;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p219v8.q f3964a;

    /* synthetic */ class a extends kotlin.jvm.internal.l implements p219v8.q {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final a f3965q = new a();

        a() {
            super(3, InterfaceC0881g.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // p219v8.q
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object e(InterfaceC0881g interfaceC0881g, Object obj, p129m8.e eVar) {
            return interfaceC0881g.b(obj, eVar);
        }
    }

    static {
        a aVar = a.f3965q;
        kotlin.jvm.internal.n.f(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f3964a = (p219v8.q) I.d(aVar, 3);
    }
}
