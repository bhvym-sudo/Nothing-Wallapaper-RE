package p240y;

import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p170r.AbstractC1707u;
import p170r.InterfaceC1699p0;
import p170r.g1;
import p210v.d;
import p210v.f;
import p210v.t;

/* JADX INFO: loaded from: classes.dex */
public final class e extends d implements InterfaceC1699p0 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final b f30092w = new b(null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final e f30093x;

    public static final class a extends f implements InterfaceC1699p0.a {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private e f30094w;

        public a(e eVar) {
            super(eVar);
            this.f30094w = eVar;
        }

        @Override // p210v.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof AbstractC1707u) {
                return p((AbstractC1707u) obj);
            }
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof g1) {
                return q((g1) obj);
            }
            return false;
        }

        @Override // p210v.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (obj instanceof AbstractC1707u) {
                return r((AbstractC1707u) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof AbstractC1707u) ? obj2 : s((AbstractC1707u) obj, (g1) obj2);
        }

        @Override // p210v.f
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public e f() {
            e eVar;
            if (h() == this.f30094w.o()) {
                eVar = this.f30094w;
            } else {
                m(new p230x.d());
                eVar = new e(h(), size());
            }
            this.f30094w = eVar;
            return eVar;
        }

        public /* bridge */ boolean p(AbstractC1707u abstractC1707u) {
            return super.containsKey(abstractC1707u);
        }

        public /* bridge */ boolean q(g1 g1Var) {
            return super.containsValue(g1Var);
        }

        public /* bridge */ g1 r(AbstractC1707u abstractC1707u) {
            return (g1) super.get(abstractC1707u);
        }

        @Override // p210v.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (obj instanceof AbstractC1707u) {
                return t((AbstractC1707u) obj);
            }
            return null;
        }

        public /* bridge */ g1 s(AbstractC1707u abstractC1707u, g1 g1Var) {
            return (g1) super.getOrDefault(abstractC1707u, g1Var);
        }

        public /* bridge */ g1 t(AbstractC1707u abstractC1707u) {
            return (g1) super.remove(abstractC1707u);
        }
    }

    public static final class b {
        public /* synthetic */ b(AbstractC1457h abstractC1457h) {
            this();
        }

        public final e a() {
            return e.f30093x;
        }

        private b() {
        }
    }

    static {
        t tVarA = t.f28071e.a();
        n.f(tVarA, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.ValueHolder<kotlin.Any?>>");
        f30093x = new e(tVarA, 0);
    }

    public e(t tVar, int i10) {
        super(tVar, i10);
    }

    @Override // p210v.d, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC1707u) {
            return u((AbstractC1707u) obj);
        }
        return false;
    }

    @Override // p089i8.AbstractC1431e, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof g1) {
            return v((g1) obj);
        }
        return false;
    }

    @Override // p170r.InterfaceC1699p0
    public InterfaceC1699p0 e(AbstractC1707u abstractC1707u, g1 g1Var) {
        t.b bVarP = o().P(abstractC1707u.hashCode(), abstractC1707u, g1Var, 0);
        return bVarP == null ? this : new e(bVarP.a(), size() + bVarP.b());
    }

    @Override // p210v.d, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof AbstractC1707u) {
            return w((AbstractC1707u) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC1707u) ? obj2 : x((AbstractC1707u) obj, (g1) obj2);
    }

    @Override // p170r.InterfaceC1699p0
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public a j() {
        return new a(this);
    }

    public /* bridge */ boolean u(AbstractC1707u abstractC1707u) {
        return super.containsKey(abstractC1707u);
    }

    public /* bridge */ boolean v(g1 g1Var) {
        return super.containsValue(g1Var);
    }

    public /* bridge */ g1 w(AbstractC1707u abstractC1707u) {
        return (g1) super.get(abstractC1707u);
    }

    public /* bridge */ g1 x(AbstractC1707u abstractC1707u, g1 g1Var) {
        return (g1) super.getOrDefault(abstractC1707u, g1Var);
    }
}
