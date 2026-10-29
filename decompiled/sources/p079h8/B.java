package p079h8;

import java.io.Serializable;
import kotlin.jvm.internal.n;
import p219v8.a;

/* JADX INFO: loaded from: classes2.dex */
public final class B implements h, Serializable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private a f21847q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Object f21848r;

    public B(a initializer) {
        n.h(initializer, "initializer");
        this.f21847q = initializer;
        this.f21848r = y.f21878a;
    }

    @Override // p079h8.h
    public boolean a() {
        return this.f21848r != y.f21878a;
    }

    @Override // p079h8.h
    public Object getValue() {
        if (this.f21848r == y.f21878a) {
            a aVar = this.f21847q;
            n.e(aVar);
            this.f21848r = aVar.invoke();
            this.f21847q = null;
        }
        return this.f21848r;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
