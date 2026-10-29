package p129m8;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.q;
import p139n8.b;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements e, e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final a f23253r = new a(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f23254s = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "result");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final e f23255q;
    private volatile Object result;

    private static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public k(e delegate, Object obj) {
        n.h(delegate, "delegate");
        this.f23255q = delegate;
        this.result = obj;
    }

    public final Object b() {
        Object obj = this.result;
        p139n8.a aVar = p139n8.a.UNDECIDED;
        if (obj == aVar) {
            if (f23254s.compareAndSet(this, aVar, b.e())) {
                return b.e();
            }
            obj = this.result;
        }
        if (obj == p139n8.a.RESUMED) {
            return b.e();
        }
        if (obj instanceof q.b) {
            throw ((q.b) obj).f21864q;
        }
        return obj;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public e getCallerFrame() {
        e eVar = this.f23255q;
        if (eVar instanceof e) {
            return (e) eVar;
        }
        return null;
    }

    @Override // p129m8.e
    public i getContext() {
        return this.f23255q.getContext();
    }

    @Override // p129m8.e
    public void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            p139n8.a aVar = p139n8.a.UNDECIDED;
            if (obj2 == aVar) {
                if (f23254s.compareAndSet(this, aVar, obj)) {
                    return;
                }
            } else {
                if (obj2 != b.e()) {
                    throw new IllegalStateException("Already resumed");
                }
                if (f23254s.compareAndSet(this, b.e(), p139n8.a.RESUMED)) {
                    this.f23255q.resumeWith(obj);
                    return;
                }
            }
        }
    }

    public String toString() {
        return "SafeContinuation for " + this.f23255q;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(e delegate) {
        this(delegate, p139n8.a.UNDECIDED);
        n.h(delegate, "delegate");
    }
}
