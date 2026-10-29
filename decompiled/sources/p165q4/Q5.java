package p165q4;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q5 extends M4 implements Set {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private transient N5 f24347r;

    Q5() {
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public final N5 g() {
        N5 n9 = this.f24347r;
        if (n9 != null) {
            return n9;
        }
        N5 n5J = j();
        this.f24347r = n5J;
        return n5J;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return AbstractC1491b.a(this);
    }

    N5 j() {
        return N5.j(toArray());
    }
}
