package kotlin.coroutines.jvm.internal;

import java.io.Serializable;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.q;
import p079h8.r;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements p129m8.e, e, Serializable {
    private final p129m8.e<Object> completion;

    public a(p129m8.e eVar) {
        this.completion = eVar;
    }

    public p129m8.e<A> create(p129m8.e<?> completion) {
        n.h(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public e getCallerFrame() {
        p129m8.e<Object> eVar = this.completion;
        if (eVar instanceof e) {
            return (e) eVar;
        }
        return null;
    }

    public final p129m8.e<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return g.d(this);
    }

    protected abstract Object invokeSuspend(Object obj);

    protected void releaseIntercepted() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [m8.e] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // p129m8.e
    public final void resumeWith(Object obj) {
        ?? r9 = this;
        while (true) {
            h.b(r9);
            a aVar = (a) r9;
            p129m8.e<Object> eVar = aVar.completion;
            n.e(eVar);
            try {
                Object objInvokeSuspend = aVar.invokeSuspend(obj);
                if (objInvokeSuspend == p139n8.b.e()) {
                    return;
                } else {
                    obj = q.b(objInvokeSuspend);
                }
            } catch (Throwable th) {
                q.a aVar2 = q.f21862r;
                obj = q.b(r.a(th));
            }
            aVar.releaseIntercepted();
            if (!(eVar instanceof a)) {
                eVar.resumeWith(obj);
                return;
            }
            r9 = eVar;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public p129m8.e<A> create(Object obj, p129m8.e<?> completion) {
        n.h(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
