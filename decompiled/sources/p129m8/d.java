package p129m8;

import java.io.Serializable;
import kotlin.jvm.internal.n;
import p219v8.p;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements i, Serializable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final i f23248q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final i.b f23249r;

    public d(i left, i.b element) {
        n.h(left, "left");
        n.h(element, "element");
        this.f23248q = left;
        this.f23249r = element;
    }

    private final boolean d(i.b bVar) {
        return n.d(b(bVar.getKey()), bVar);
    }

    private final boolean e(d dVar) {
        while (d(dVar.f23249r)) {
            i iVar = dVar.f23248q;
            if (!(iVar instanceof d)) {
                n.f(iVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return d((i.b) iVar);
            }
            dVar = (d) iVar;
        }
        return false;
    }

    private final int g() {
        int i10 = 2;
        while (true) {
            i iVar = this.f23248q;
            this = iVar instanceof d ? (d) iVar : null;
            if (this == null) {
                return i10;
            }
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String h(String acc, i.b element) {
        n.h(acc, "acc");
        n.h(element, "element");
        if (acc.length() == 0) {
            return element.toString();
        }
        return acc + ", " + element;
    }

    @Override // p129m8.i
    public Object U0(Object obj, p operation) {
        n.h(operation, "operation");
        return operation.invoke(this.f23248q.U0(obj, operation), this.f23249r);
    }

    @Override // p129m8.i
    public i.b b(i.c key) {
        n.h(key, "key");
        while (true) {
            i.b bVarB = this.f23249r.b(key);
            if (bVarB != null) {
                return bVarB;
            }
            i iVar = this.f23248q;
            if (!(iVar instanceof d)) {
                return iVar.b(key);
            }
            this = (d) iVar;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.g() == g() && dVar.e(this);
    }

    public int hashCode() {
        return this.f23248q.hashCode() + this.f23249r.hashCode();
    }

    @Override // p129m8.i
    public i t0(i.c key) {
        n.h(key, "key");
        if (this.f23249r.b(key) != null) {
            return this.f23248q;
        }
        i iVarT0 = this.f23248q.t0(key);
        if (iVarT0 == this.f23248q) {
            return this;
        }
        return iVarT0 == j.f23252q ? this.f23249r : new d(iVarT0, this.f23249r);
    }

    public String toString() {
        return '[' + ((String) U0("", new p() { // from class: m8.c
            @Override // p219v8.p
            public final Object invoke(Object obj, Object obj2) {
                return d.h((String) obj, (i.b) obj2);
            }
        })) + ']';
    }

    @Override // p129m8.i
    public i z(i iVar) {
        return i.a.b(this, iVar);
    }
}
