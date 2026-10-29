package p175r4;

import java.util.Set;

/* JADX INFO: renamed from: r4.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1978z extends r implements Set {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private transient AbstractC1948w f27504r;

    AbstractC1978z() {
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

    public final AbstractC1948w g() {
        AbstractC1948w abstractC1948w = this.f27504r;
        if (abstractC1948w != null) {
            return abstractC1948w;
        }
        AbstractC1948w abstractC1948wJ = j();
        this.f27504r = abstractC1948wJ;
        return abstractC1948wJ;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return U.a(this);
    }

    AbstractC1948w j() {
        Object[] array = toArray();
        int i10 = AbstractC1948w.f27443s;
        return AbstractC1948w.j(array, array.length);
    }
}
