package K8;

import F8.U0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D f4146a = new D("NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p219v8.p f4147b = new p219v8.p() { // from class: K8.H
        @Override // p219v8.p
        public final Object invoke(Object obj, Object obj2) {
            return K.d(obj, (m8.i.b) obj2);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p219v8.p f4148c = new p219v8.p() { // from class: K8.I
        @Override // p219v8.p
        public final Object invoke(Object obj, Object obj2) {
            return K.e((U0) obj, (m8.i.b) obj2);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final p219v8.p f4149d = new p219v8.p() { // from class: K8.J
        @Override // p219v8.p
        public final Object invoke(Object obj, Object obj2) {
            return K.h((O) obj, (m8.i.b) obj2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(Object obj, m8.i.b bVar) {
        if (!(bVar instanceof U0)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int iIntValue = num != null ? num.intValue() : 1;
        return iIntValue == 0 ? bVar : Integer.valueOf(iIntValue + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final U0 e(U0 u9, m8.i.b bVar) {
        if (u9 != null) {
            return u9;
        }
        if (bVar instanceof U0) {
            return (U0) bVar;
        }
        return null;
    }

    public static final void f(p129m8.i iVar, Object obj) {
        if (obj == f4146a) {
            return;
        }
        if (obj instanceof O) {
            ((O) obj).b(iVar);
            return;
        }
        Object objU0 = iVar.U0(null, f4148c);
        kotlin.jvm.internal.n.f(objU0, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((U0) objU0).X0(iVar, obj);
    }

    public static final Object g(p129m8.i iVar) {
        Object objU0 = iVar.U0(0, f4147b);
        kotlin.jvm.internal.n.e(objU0);
        return objU0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final O h(O o9, m8.i.b bVar) {
        if (bVar instanceof U0) {
            U0 u9 = (U0) bVar;
            o9.a(u9, u9.j(o9.f4152a));
        }
        return o9;
    }

    public static final Object i(p129m8.i iVar, Object obj) {
        if (obj == null) {
            obj = g(iVar);
        }
        if (obj == 0) {
            return f4146a;
        }
        if (obj instanceof Integer) {
            return iVar.U0(new O(iVar, ((Number) obj).intValue()), f4149d);
        }
        kotlin.jvm.internal.n.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((U0) obj).j(iVar);
    }
}
