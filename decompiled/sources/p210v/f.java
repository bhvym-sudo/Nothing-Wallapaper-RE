package p210v;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.n;
import p089i8.AbstractC1434h;
import p229w8.d;
import p230x.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends AbstractC1434h implements Map, d {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private d f28054q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private p230x.d f28055r = new p230x.d();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private t f28056s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Object f28057t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f28058u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f28059v;

    public f(d dVar) {
        this.f28054q = dVar;
        this.f28056s = this.f28054q.o();
        this.f28059v = this.f28054q.size();
    }

    @Override // p089i8.AbstractC1434h
    public Set a() {
        return new h(this);
    }

    @Override // p089i8.AbstractC1434h
    public Set b() {
        return new j(this);
    }

    @Override // p089i8.AbstractC1434h
    public int c() {
        return this.f28059v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        t tVarA = t.f28071e.a();
        n.f(tVarA, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f28056s = tVarA;
        n(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f28056s.k(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // p089i8.AbstractC1434h
    public Collection d() {
        return new l(this);
    }

    public abstract d f();

    public final int g() {
        return this.f28058u;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.f28056s.o(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    public final t h() {
        return this.f28056s;
    }

    public final p230x.d i() {
        return this.f28055r;
    }

    public final void k(int i10) {
        this.f28058u = i10;
    }

    public final void l(Object obj) {
        this.f28057t = obj;
    }

    protected final void m(p230x.d dVar) {
        this.f28055r = dVar;
    }

    public void n(int i10) {
        this.f28059v = i10;
        this.f28058u++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        this.f28057t = null;
        this.f28056s = this.f28056s.D(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f28057t;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        d dVarF = map instanceof d ? (d) map : null;
        if (dVarF == null) {
            f fVar = map instanceof f ? (f) map : null;
            dVarF = fVar != null ? fVar.f() : null;
        }
        if (dVarF == null) {
            super.putAll(map);
            return;
        }
        b bVar = new b(0, 1, null);
        int size = size();
        t tVar = this.f28056s;
        t tVarO = dVarF.o();
        n.f(tVarO, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f28056s = tVar.E(tVarO, 0, bVar, this);
        int size2 = (dVarF.size() + size) - bVar.a();
        if (size != size2) {
            n(size2);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.f28057t = null;
        t tVarG = this.f28056s.G(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (tVarG == null) {
            tVarG = t.f28071e.a();
            n.f(tVarG, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.f28056s = tVarG;
        return this.f28057t;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        t tVarH = this.f28056s.H(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (tVarH == null) {
            tVarH = t.f28071e.a();
            n.f(tVarH, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.f28056s = tVarH;
        return size != size();
    }
}
