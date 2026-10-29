package p155p4;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: p4.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1474p implements Map, Serializable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private transient AbstractC1475q f23743q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private transient AbstractC1475q f23744r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private transient AbstractC1468j f23745s;

    AbstractC1474p() {
    }

    public static AbstractC1474p c(Object obj, Object obj2) {
        AbstractC1464f.a("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return C1481x.h(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    }

    abstract AbstractC1468j a();

    @Override // java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC1468j values() {
        AbstractC1468j abstractC1468j = this.f23745s;
        if (abstractC1468j != null) {
            return abstractC1468j;
        }
        AbstractC1468j abstractC1468jA = a();
        this.f23745s = abstractC1468jA;
        return abstractC1468jA;
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

    abstract AbstractC1475q d();

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

    abstract AbstractC1475q f();

    @Override // java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final AbstractC1475q entrySet() {
        AbstractC1475q abstractC1475q = this.f23743q;
        if (abstractC1475q != null) {
            return abstractC1475q;
        }
        AbstractC1475q abstractC1475qD = d();
        this.f23743q = abstractC1475qD;
        return abstractC1475qD;
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
        return AbstractC1482y.a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        AbstractC1475q abstractC1475q = this.f23744r;
        if (abstractC1475q != null) {
            return abstractC1475q;
        }
        AbstractC1475q abstractC1475qF = f();
        this.f23744r = abstractC1475qF;
        return abstractC1475qF;
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
        if (size < 0) {
            throw new IllegalArgumentException("size cannot be negative but was: " + size);
        }
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
