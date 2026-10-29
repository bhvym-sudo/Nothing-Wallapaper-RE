package p139n8;

import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.n;
import p079h8.r;
import p129m8.e;
import p129m8.i;
import p219v8.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    public static final class a extends j {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f23287q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p f23288r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Object f23289s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, p pVar, Object obj) {
            super(eVar);
            this.f23288r = pVar;
            this.f23289s = obj;
            n.f(eVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i10 = this.f23287q;
            if (i10 == 0) {
                this.f23287q = 1;
                r.b(obj);
                n.f(this.f23288r, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((p) I.d(this.f23288r, 2)).invoke(this.f23289s, this);
            }
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f23287q = 2;
            r.b(obj);
            return obj;
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f23290q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p f23291r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Object f23292s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e eVar, i iVar, p pVar, Object obj) {
            super(eVar, iVar);
            this.f23291r = pVar;
            this.f23292s = obj;
            n.f(eVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i10 = this.f23290q;
            if (i10 == 0) {
                this.f23290q = 1;
                r.b(obj);
                n.f(this.f23291r, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((p) I.d(this.f23291r, 2)).invoke(this.f23292s, this);
            }
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f23290q = 2;
            r.b(obj);
            return obj;
        }
    }

    /* JADX INFO: renamed from: n8.c$c, reason: collision with other inner class name */
    public static final class C0595c extends j {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0595c(e eVar) {
            super(eVar);
            n.f(eVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            r.b(obj);
            return obj;
        }
    }

    public static final class d extends kotlin.coroutines.jvm.internal.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(e eVar, i iVar) {
            super(eVar, iVar);
            n.f(eVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            r.b(obj);
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e a(p pVar, Object obj, e completion) {
        n.h(pVar, "<this>");
        n.h(completion, "completion");
        e<?> eVarA = h.a(completion);
        if (pVar instanceof kotlin.coroutines.jvm.internal.a) {
            return ((kotlin.coroutines.jvm.internal.a) pVar).create(obj, eVarA);
        }
        i context = eVarA.getContext();
        return context == p129m8.j.f23252q ? new a(eVarA, pVar, obj) : new b(eVarA, context, pVar, obj);
    }

    private static final e b(e eVar) {
        i context = eVar.getContext();
        return context == p129m8.j.f23252q ? new C0595c(eVar) : new d(eVar, context);
    }

    public static e c(e eVar) {
        e<Object> eVarIntercepted;
        n.h(eVar, "<this>");
        kotlin.coroutines.jvm.internal.d dVar = eVar instanceof kotlin.coroutines.jvm.internal.d ? (kotlin.coroutines.jvm.internal.d) eVar : null;
        return (dVar == null || (eVarIntercepted = dVar.intercepted()) == null) ? eVar : eVarIntercepted;
    }

    public static Object d(p pVar, Object obj, e completion) {
        n.h(pVar, "<this>");
        n.h(completion, "completion");
        return ((p) I.d(pVar, 2)).invoke(obj, b(h.a(completion)));
    }
}
