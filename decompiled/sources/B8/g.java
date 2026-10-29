package B8;

import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends e implements c {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final a f440u = new a(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final g f441v = new g(1, 0);

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final g a() {
            return g.f441v;
        }

        private a() {
        }
    }

    public g(int i10, int i11) {
        super(i10, i11, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // B8.c
    public /* bridge */ /* synthetic */ boolean b(Comparable comparable) {
        return q(((Number) comparable).intValue());
    }

    @Override // B8.e
    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        if (isEmpty() && ((g) obj).isEmpty()) {
            return true;
        }
        g gVar = (g) obj;
        return g() == gVar.g() && m() == gVar.m();
    }

    @Override // B8.e
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (g() * 31) + m();
    }

    @Override // B8.e
    public boolean isEmpty() {
        return g() > m();
    }

    public boolean q(int i10) {
        return g() <= i10 && i10 <= m();
    }

    @Override // B8.c
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Integer f() {
        return Integer.valueOf(m());
    }

    @Override // B8.c
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public Integer a() {
        return Integer.valueOf(g());
    }

    @Override // B8.e
    public String toString() {
        return g() + ".." + m();
    }
}
