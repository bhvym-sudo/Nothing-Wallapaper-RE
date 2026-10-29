package p150p;

import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f23566a;

    public c(int i10, float f10) {
        this.f23566a = new LinkedHashMap(i10, f10, true);
    }

    public final Object a(Object key) {
        n.h(key, "key");
        return this.f23566a.get(key);
    }

    public final Set b() {
        Set setEntrySet = this.f23566a.entrySet();
        n.g(setEntrySet, "map.entries");
        return setEntrySet;
    }

    public final boolean c() {
        return this.f23566a.isEmpty();
    }

    public final Object d(Object key, Object value) {
        n.h(key, "key");
        n.h(value, "value");
        return this.f23566a.put(key, value);
    }

    public final Object e(Object key) {
        n.h(key, "key");
        return this.f23566a.remove(key);
    }
}
