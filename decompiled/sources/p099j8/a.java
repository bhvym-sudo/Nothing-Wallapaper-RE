package p099j8;

import java.util.Map;
import kotlin.jvm.internal.n;
import p089i8.AbstractC1435i;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends AbstractC1435i {
    public final boolean b(Map.Entry element) {
        n.h(element, "element");
        return f(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return b((Map.Entry) obj);
        }
        return false;
    }

    public abstract boolean f(Map.Entry entry);

    public abstract /* bridge */ boolean g(Map.Entry entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return g((Map.Entry) obj);
        }
        return false;
    }
}
