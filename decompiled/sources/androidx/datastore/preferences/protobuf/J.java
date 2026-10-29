package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class J extends LinkedHashMap {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final J f12410r;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f12411q;

    static {
        J j9 = new J();
        f12410r = j9;
        j9.o();
    }

    private J() {
        this.f12411q = true;
    }

    static int c(Map map) {
        int iD = 0;
        for (Map.Entry entry : map.entrySet()) {
            iD += d(entry.getValue()) ^ d(entry.getKey());
        }
        return iD;
    }

    private static int d(Object obj) {
        return obj instanceof byte[] ? AbstractC1114y.d((byte[]) obj) : obj.hashCode();
    }

    private static void h(Map map) {
        for (Object obj : map.keySet()) {
            AbstractC1114y.a(obj);
            AbstractC1114y.a(map.get(obj));
        }
    }

    public static J i() {
        return f12410r;
    }

    private void k() {
        if (!n()) {
            throw new UnsupportedOperationException();
        }
    }

    private static boolean l(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    static boolean m(Map map, Map map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !l(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        k();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && m(this, (Map) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return c(this);
    }

    public boolean n() {
        return this.f12411q;
    }

    public void o() {
        this.f12411q = false;
    }

    public void p(J j9) {
        k();
        if (j9.isEmpty()) {
            return;
        }
        putAll(j9);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        k();
        AbstractC1114y.a(obj);
        AbstractC1114y.a(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        k();
        h(map);
        super.putAll(map);
    }

    public J q() {
        return isEmpty() ? new J() : new J(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        k();
        return super.remove(obj);
    }

    private J(Map map) {
        super(map);
        this.f12411q = true;
    }
}
