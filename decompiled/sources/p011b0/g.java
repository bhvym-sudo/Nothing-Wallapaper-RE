package p011b0;

import androidx.compose.ui.platform.Y;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.n;
import p079h8.e;
import p229w8.a;

/* JADX INFO: loaded from: classes.dex */
public final class g implements r, Iterable, a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Map f14598q = new LinkedHashMap();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f14599r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f14600s;

    @Override // p011b0.r
    public void a(q qVar, Object obj) {
        if (!(obj instanceof a) || !b(qVar)) {
            this.f14598q.put(qVar, obj);
            return;
        }
        Object obj2 = this.f14598q.get(qVar);
        n.f(obj2, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
        a aVar = (a) obj2;
        Map map = this.f14598q;
        a aVar2 = (a) obj;
        String strB = aVar2.b();
        if (strB == null) {
            strB = aVar.b();
        }
        e eVarA = aVar2.a();
        if (eVarA == null) {
            eVarA = aVar.a();
        }
        map.put(qVar, new a(strB, eVarA));
    }

    public final boolean b(q qVar) {
        return this.f14598q.containsKey(qVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return n.d(this.f14598q, gVar.f14598q) && this.f14599r == gVar.f14599r && this.f14600s == gVar.f14600s;
    }

    public final boolean f() {
        Set setKeySet = this.f14598q.keySet();
        if ((setKeySet instanceof Collection) && setKeySet.isEmpty()) {
            return false;
        }
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            if (((q) it.next()).b()) {
                return true;
            }
        }
        return false;
    }

    public final g g() {
        g gVar = new g();
        gVar.f14599r = this.f14599r;
        gVar.f14600s = this.f14600s;
        gVar.f14598q.putAll(this.f14598q);
        return gVar;
    }

    public int hashCode() {
        return (((this.f14598q.hashCode() * 31) + Boolean.hashCode(this.f14599r)) * 31) + Boolean.hashCode(this.f14600s);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f14598q.entrySet().iterator();
    }

    public final Object m(q qVar) {
        Object obj = this.f14598q.get(qVar);
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Key not present: " + qVar + " - consider getOrElse or getOrNull");
    }

    public final Object n(q qVar, p219v8.a aVar) {
        Object obj = this.f14598q.get(qVar);
        return obj == null ? aVar.invoke() : obj;
    }

    public final Object o(q qVar, p219v8.a aVar) {
        Object obj = this.f14598q.get(qVar);
        return obj == null ? aVar.invoke() : obj;
    }

    public final boolean p() {
        return this.f14600s;
    }

    public final boolean q() {
        return this.f14599r;
    }

    public final void r(g gVar) {
        for (Map.Entry entry : gVar.f14598q.entrySet()) {
            q qVar = (q) entry.getKey();
            Object value = entry.getValue();
            Object obj = this.f14598q.get(qVar);
            n.f(qVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
            Object objC = qVar.c(obj, value);
            if (objC != null) {
                this.f14598q.put(qVar, objC);
            }
        }
    }

    public final void s(boolean z9) {
        this.f14600s = z9;
    }

    public final void t(boolean z9) {
        this.f14599r = z9;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        if (this.f14599r) {
            sb.append("");
            sb.append("mergeDescendants=true");
            str = ", ";
        }
        if (this.f14600s) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry entry : this.f14598q.entrySet()) {
            q qVar = (q) entry.getKey();
            Object value = entry.getValue();
            sb.append(str);
            sb.append(qVar.a());
            sb.append(" : ");
            sb.append(value);
            str = ", ";
        }
        return Y.a(this, null) + "{ " + ((Object) sb) + " }";
    }
}
