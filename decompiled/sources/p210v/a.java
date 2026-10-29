package p210v;

import java.util.Map;
import p089i8.AbstractC1435i;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends AbstractC1435i {
    public final boolean b(Map.Entry entry) {
        if ((entry != null ? entry : null) == null) {
            return false;
        }
        return f(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return b((Map.Entry) obj);
        }
        return false;
    }

    public abstract boolean f(Map.Entry entry);

    public final boolean g(Map.Entry entry) {
        if ((entry != null ? entry : null) == null) {
            return false;
        }
        return m(entry);
    }

    public abstract boolean m(Map.Entry entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return g((Map.Entry) obj);
        }
        return false;
    }
}
