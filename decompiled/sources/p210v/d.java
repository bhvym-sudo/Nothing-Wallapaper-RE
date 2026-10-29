package p210v;

import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p089i8.AbstractC1431e;
import p200u.b;
import p200u.c;

/* JADX INFO: loaded from: classes.dex */
public class d extends AbstractC1431e implements Map, p229w8.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f28046t = new a(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f28047u = 8;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final d f28048v = new d(t.f28071e.a(), 0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final t f28049r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f28050s;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final d a() {
            d dVar = d.f28048v;
            n.f(dVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
            return dVar;
        }

        private a() {
        }
    }

    public d(t tVar, int i10) {
        this.f28049r = tVar;
        this.f28050s = i10;
    }

    private final c m() {
        return new n(this);
    }

    @Override // p089i8.AbstractC1431e
    public final Set c() {
        return m();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f28049r.k(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // p089i8.AbstractC1431e
    public int f() {
        return this.f28050s;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f28049r.o(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // p089i8.AbstractC1431e
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public c d() {
        return new p(this);
    }

    public final t o() {
        return this.f28049r;
    }

    @Override // p089i8.AbstractC1431e
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public b g() {
        return new r(this);
    }

    public d q(Object obj, Object obj2) {
        t.b bVarP = this.f28049r.P(obj != null ? obj.hashCode() : 0, obj, obj2, 0);
        return bVarP == null ? this : new d(bVarP.a(), size() + bVarP.b());
    }

    public d r(Object obj) {
        t tVarQ = this.f28049r.Q(obj != null ? obj.hashCode() : 0, obj, 0);
        if (this.f28049r == tVarQ) {
            return this;
        }
        return tVarQ == null ? f28046t.a() : new d(tVarQ, size() - 1);
    }
}
