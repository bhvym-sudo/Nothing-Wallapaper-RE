package p079h8;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p219v8.a;

/* JADX INFO: loaded from: classes2.dex */
final class t implements h, Serializable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private a f21870q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private volatile Object f21871r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Object f21872s;

    public t(a initializer, Object obj) {
        n.h(initializer, "initializer");
        this.f21870q = initializer;
        this.f21871r = y.f21878a;
        this.f21872s = obj == null ? this : obj;
    }

    @Override // p079h8.h
    public boolean a() {
        return this.f21871r != y.f21878a;
    }

    @Override // p079h8.h
    public Object getValue() {
        Object objInvoke;
        Object obj = this.f21871r;
        y yVar = y.f21878a;
        if (obj != yVar) {
            return obj;
        }
        synchronized (this.f21872s) {
            objInvoke = this.f21871r;
            if (objInvoke == yVar) {
                a aVar = this.f21870q;
                n.e(aVar);
                objInvoke = aVar.invoke();
                this.f21871r = objInvoke;
                this.f21870q = null;
            }
        }
        return objInvoke;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ t(a aVar, Object obj, int i10, AbstractC1457h abstractC1457h) {
        this(aVar, (i10 & 2) != 0 ? null : obj);
    }
}
