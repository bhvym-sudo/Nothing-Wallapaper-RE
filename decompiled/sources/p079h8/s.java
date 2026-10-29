package p079h8;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
final class s implements h, Serializable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f21865t = new a(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f21866u = AtomicReferenceFieldUpdater.newUpdater(s.class, Object.class, "r");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private volatile p219v8.a f21867q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private volatile Object f21868r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Object f21869s;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public s(p219v8.a initializer) {
        n.h(initializer, "initializer");
        this.f21867q = initializer;
        y yVar = y.f21878a;
        this.f21868r = yVar;
        this.f21869s = yVar;
    }

    @Override // p079h8.h
    public boolean a() {
        return this.f21868r != y.f21878a;
    }

    @Override // p079h8.h
    public Object getValue() {
        Object obj = this.f21868r;
        y yVar = y.f21878a;
        if (obj != yVar) {
            return obj;
        }
        p219v8.a aVar = this.f21867q;
        if (aVar != null) {
            Object objInvoke = aVar.invoke();
            if (f21866u.compareAndSet(this, yVar, objInvoke)) {
                this.f21867q = null;
                return objInvoke;
            }
        }
        return this.f21868r;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
