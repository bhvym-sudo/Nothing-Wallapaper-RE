package p129m8;

import kotlin.jvm.internal.n;
import p219v8.l;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b implements i.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final l f23246q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final i.c f23247r;

    public b(i.c baseKey, l safeCast) {
        n.h(baseKey, "baseKey");
        n.h(safeCast, "safeCast");
        this.f23246q = safeCast;
        this.f23247r = baseKey instanceof b ? ((b) baseKey).f23247r : baseKey;
    }

    public final boolean a(i.c key) {
        n.h(key, "key");
        return key == this || this.f23247r == key;
    }

    public final i.b b(i.b element) {
        n.h(element, "element");
        return (i.b) this.f23246q.f(element);
    }
}
