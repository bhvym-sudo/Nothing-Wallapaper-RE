package p175r4;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: r4.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1968y implements Map, Serializable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private transient AbstractC1978z f27487q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private transient AbstractC1978z f27488r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private transient r f27489s;

    AbstractC1968y() {
    }

    public static AbstractC1968y c(Object obj, Object obj2) {
        AbstractC1741c.b("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return S.h(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    }

    abstract r a();

    @Override // java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final r values() {
        r rVar = this.f27489s;
        if (rVar != null) {
            return rVar;
        }
        r rVarA = a();
        this.f27489s = rVarA;
        return rVarA;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    abstract AbstractC1978z d();

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    abstract AbstractC1978z f();

    @Override // java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final AbstractC1978z entrySet() {
        AbstractC1978z abstractC1978z = this.f27487q;
        if (abstractC1978z != null) {
            return abstractC1978z;
        }
        AbstractC1978z abstractC1978zD = d();
        this.f27487q = abstractC1978zD;
        return abstractC1978zD;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return U.a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        AbstractC1978z abstractC1978z = this.f27488r;
        if (abstractC1978z != null) {
            return abstractC1978z;
        }
        AbstractC1978z abstractC1978zF = f();
        this.f27488r = abstractC1978zF;
        return abstractC1978zF;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        AbstractC1741c.a(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb.append('{');
        boolean z9 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z9) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z9 = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
