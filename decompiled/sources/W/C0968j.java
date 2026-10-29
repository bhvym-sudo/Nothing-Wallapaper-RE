package W;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: W.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0968j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f8593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p079h8.h f8594b = p079h8.i.a(p079h8.l.NONE, b.f8597r);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Comparator f8595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final t0 f8596d;

    /* JADX INFO: renamed from: W.j$a */
    public static final class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(B b10, B b11) {
            int i10 = kotlin.jvm.internal.n.i(b10.A(), b11.A());
            return i10 != 0 ? i10 : kotlin.jvm.internal.n.i(b10.hashCode(), b11.hashCode());
        }
    }

    /* JADX INFO: renamed from: W.j$b */
    static final class b extends kotlin.jvm.internal.o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final b f8597r = new b();

        b() {
            super(0);
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map invoke() {
            return new LinkedHashMap();
        }
    }

    public C0968j(boolean z9) {
        this.f8593a = z9;
        a aVar = new a();
        this.f8595c = aVar;
        this.f8596d = new t0(aVar);
    }

    private final Map c() {
        return (Map) this.f8594b.getValue();
    }

    public final void a(B b10) {
        if (!b10.t0()) {
            T.a.b("DepthSortedSet.add called on an unattached node");
        }
        if (this.f8593a) {
            Integer num = (Integer) c().get(b10);
            if (num == null) {
                c().put(b10, Integer.valueOf(b10.A()));
            } else {
                if (!(num.intValue() == b10.A())) {
                    T.a.b("invalid node depth");
                }
            }
        }
        this.f8596d.add(b10);
    }

    public final boolean b(B b10) {
        boolean zContains = this.f8596d.contains(b10);
        if (this.f8593a) {
            if (!(zContains == c().containsKey(b10))) {
                T.a.b("inconsistency in TreeSet");
            }
        }
        return zContains;
    }

    public final boolean d() {
        return this.f8596d.isEmpty();
    }

    public final B e() {
        B b10 = (B) this.f8596d.first();
        f(b10);
        return b10;
    }

    public final boolean f(B b10) {
        if (!b10.t0()) {
            T.a.b("DepthSortedSet.remove called on an unattached node");
        }
        boolean zRemove = this.f8596d.remove(b10);
        if (this.f8593a) {
            if (!kotlin.jvm.internal.n.d((Integer) c().remove(b10), zRemove ? Integer.valueOf(b10.A()) : null)) {
                T.a.b("invalid node depth");
            }
        }
        return zRemove;
    }

    public String toString() {
        return this.f8596d.toString();
    }
}
