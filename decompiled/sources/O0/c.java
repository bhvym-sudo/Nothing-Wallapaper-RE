package O0;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import p089i8.AbstractC1439m;
import p089i8.AbstractC1444s;
import p089i8.N;
import p219v8.l;

/* JADX INFO: loaded from: classes.dex */
public final class c extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f5735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f5736b;

    static final class a extends o implements l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a f5737r = new a();

        a() {
            super(1);
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence f(Map.Entry entry) {
            n.h(entry, "entry");
            Object value = entry.getValue();
            return "  " + ((f.a) entry.getKey()).a() + " = " + (value instanceof byte[] ? AbstractC1439m.P((byte[]) value, ", ", "[", "]", 0, null, null, 56, null) : String.valueOf(entry.getValue()));
        }
    }

    public /* synthetic */ c(Map map, boolean z9, int i10, AbstractC1457h abstractC1457h) {
        this((i10 & 1) != 0 ? new LinkedHashMap() : map, (i10 & 2) != 0 ? true : z9);
    }

    @Override // O0.f
    public Map a() {
        p079h8.o oVar;
        Set<Map.Entry> setEntrySet = this.f5735a.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(B8.h.f(N.d(AbstractC1444s.u(setEntrySet, 10)), 16));
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                n.g(bArrCopyOf, "copyOf(this, size)");
                oVar = new p079h8.o(key, bArrCopyOf);
            } else {
                oVar = new p079h8.o(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(oVar.c(), oVar.d());
        }
        return O0.a.b(linkedHashMap);
    }

    @Override // O0.f
    public Object b(f.a key) {
        n.h(key, "key");
        Object obj = this.f5735a.get(key);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        n.g(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    public final void e() {
        if (this.f5736b.a()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    public boolean equals(Object obj) {
        boolean zD;
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        Map map = cVar.f5735a;
        if (map == this.f5735a) {
            return true;
        }
        if (map.size() != this.f5735a.size()) {
            return false;
        }
        Map map2 = cVar.f5735a;
        if (map2.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : map2.entrySet()) {
            Object obj2 = this.f5735a.get(entry.getKey());
            if (obj2 != null) {
                Object value = entry.getValue();
                if (!(value instanceof byte[])) {
                    zD = n.d(value, obj2);
                } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                    zD = true;
                } else {
                    zD = false;
                }
            } else {
                zD = false;
            }
            if (!zD) {
                return false;
            }
        }
        return true;
    }

    public final void f() {
        this.f5736b.b(true);
    }

    public final void g(f.b... pairs) {
        n.h(pairs, "pairs");
        e();
        if (pairs.length <= 0) {
            return;
        }
        f.b bVar = pairs[0];
        throw null;
    }

    public final Object h(f.a key) {
        n.h(key, "key");
        e();
        return this.f5735a.remove(key);
    }

    public int hashCode() {
        Iterator it = this.f5735a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final void i(f.a key, Object obj) {
        n.h(key, "key");
        j(key, obj);
    }

    public final void j(f.a key, Object obj) {
        n.h(key, "key");
        e();
        if (obj == null) {
            h(key);
            return;
        }
        if (obj instanceof Set) {
            this.f5735a.put(key, O0.a.a((Set) obj));
            return;
        }
        if (!(obj instanceof byte[])) {
            this.f5735a.put(key, obj);
            return;
        }
        Map map = this.f5735a;
        byte[] bArr = (byte[]) obj;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        n.g(bArrCopyOf, "copyOf(this, size)");
        map.put(key, bArrCopyOf);
    }

    public String toString() {
        return AbstractC1444s.a0(this.f5735a.entrySet(), ",\n", "{\n", "\n}", 0, null, a.f5737r, 24, null);
    }

    public c(Map preferencesMap, boolean z9) {
        n.h(preferencesMap, "preferencesMap");
        this.f5735a = preferencesMap;
        this.f5736b = new b(z9);
    }
}
