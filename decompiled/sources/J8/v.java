package J8;

import F8.A0;
import I8.InterfaceC0881g;

/* JADX INFO: loaded from: classes2.dex */
public final class v extends kotlin.coroutines.jvm.internal.d implements InterfaceC0881g, kotlin.coroutines.jvm.internal.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final InterfaceC0881g f3959q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p129m8.i f3960r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f3961s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private p129m8.i f3962t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private p129m8.e f3963u;

    public v(InterfaceC0881g interfaceC0881g, p129m8.i iVar) {
        super(r.f3953q, p129m8.j.f23252q);
        this.f3959q = interfaceC0881g;
        this.f3960r = iVar;
        this.f3961s = ((Number) iVar.U0(0, new p219v8.p() { // from class: J8.u
            @Override // p219v8.p
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(v.v(((Integer) obj).intValue(), (m8.i.b) obj2));
            }
        })).intValue();
    }

    private final void u(p129m8.i iVar, p129m8.i iVar2, Object obj) {
        if (iVar2 instanceof m) {
            x((m) iVar2, obj);
        }
        y.b(this, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int v(int i10, m8.i.b bVar) {
        return i10 + 1;
    }

    private final Object w(p129m8.e eVar, Object obj) {
        p129m8.i context = eVar.getContext();
        A0.j(context);
        p129m8.i iVar = this.f3962t;
        if (iVar != context) {
            u(context, iVar, obj);
            this.f3962t = context;
        }
        this.f3963u = eVar;
        p219v8.q qVar = w.f3964a;
        InterfaceC0881g interfaceC0881g = this.f3959q;
        kotlin.jvm.internal.n.f(interfaceC0881g, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        kotlin.jvm.internal.n.f(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object objE = qVar.e(interfaceC0881g, obj, this);
        if (!kotlin.jvm.internal.n.d(objE, p139n8.b.e())) {
            this.f3963u = null;
        }
        return objE;
    }

    private final void x(m mVar, Object obj) {
        throw new IllegalStateException(E8.i.j("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + mVar.f3947r + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // I8.InterfaceC0881g
    public Object b(Object obj, p129m8.e eVar) {
        try {
            Object objW = w(eVar, obj);
            if (objW == p139n8.b.e()) {
                kotlin.coroutines.jvm.internal.h.c(eVar);
            }
            return objW == p139n8.b.e() ? objW : p079h8.A.f21846a;
        } catch (Throwable th) {
            this.f3962t = new m(th, eVar.getContext());
            throw th;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a, kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        p129m8.e eVar = this.f3963u;
        if (eVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) eVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.d, p129m8.e
    public p129m8.i getContext() {
        p129m8.i iVar = this.f3962t;
        return iVar == null ? p129m8.j.f23252q : iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    protected Object invokeSuspend(Object obj) {
        Throwable thD = p079h8.q.d(obj);
        if (thD != null) {
            this.f3962t = new m(thD, getContext());
        }
        p129m8.e eVar = this.f3963u;
        if (eVar != null) {
            eVar.resumeWith(obj);
        }
        return p139n8.b.e();
    }

    @Override // kotlin.coroutines.jvm.internal.d, kotlin.coroutines.jvm.internal.a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
