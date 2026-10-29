package B8;

import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
class d implements c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Comparable f430q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Comparable f431r;

    public d(Comparable start, Comparable endInclusive) {
        n.h(start, "start");
        n.h(endInclusive, "endInclusive");
        this.f430q = start;
        this.f431r = endInclusive;
    }

    @Override // B8.c
    public Comparable a() {
        return this.f430q;
    }

    @Override // B8.c
    public boolean b(Comparable comparable) {
        return c.a.a(this, comparable);
    }

    public boolean c() {
        return c.a.b(this);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        if (c() && ((d) obj).c()) {
            return true;
        }
        d dVar = (d) obj;
        return n.d(a(), dVar.a()) && n.d(f(), dVar.f());
    }

    @Override // B8.c
    public Comparable f() {
        return this.f431r;
    }

    public int hashCode() {
        if (c()) {
            return -1;
        }
        return (a().hashCode() * 31) + f().hashCode();
    }

    public String toString() {
        return a() + ".." + f();
    }
}
