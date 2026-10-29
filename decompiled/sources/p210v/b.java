package p210v;

import java.util.Map;
import kotlin.jvm.internal.n;
import p229w8.a;

/* JADX INFO: loaded from: classes.dex */
public class b implements Map.Entry, a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Object f28042q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Object f28043r;

    public b(Object obj, Object obj2) {
        this.f28042q = obj;
        this.f28043r = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && n.d(entry.getKey(), getKey()) && n.d(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.f28042q;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f28043r;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
