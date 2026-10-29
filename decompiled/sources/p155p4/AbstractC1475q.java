package p155p4;

import java.util.Set;

/* JADX INFO: renamed from: p4.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1475q extends AbstractC1468j implements Set {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private transient AbstractC1471m f23746r;

    AbstractC1475q() {
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

    public final AbstractC1471m g() {
        AbstractC1471m abstractC1471m = this.f23746r;
        if (abstractC1471m != null) {
            return abstractC1471m;
        }
        AbstractC1471m abstractC1471mJ = j();
        this.f23746r = abstractC1471mJ;
        return abstractC1471mJ;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return AbstractC1482y.a(this);
    }

    AbstractC1471m j() {
        Object[] array = toArray();
        int i10 = AbstractC1471m.f23736s;
        return AbstractC1471m.j(array, array.length);
    }
}
