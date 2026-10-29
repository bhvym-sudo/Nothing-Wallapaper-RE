package p149o8;

import java.io.Serializable;
import kotlin.jvm.internal.n;
import p089i8.AbstractC1429c;
import p089i8.AbstractC1439m;

/* JADX INFO: loaded from: classes2.dex */
final class c extends AbstractC1429c implements a, Serializable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Enum[] f23554r;

    public c(Enum[] entries) {
        n.h(entries, "entries");
        this.f23554r = entries;
    }

    @Override // p089i8.AbstractC1428b
    public int b() {
        return this.f23554r.length;
    }

    @Override // p089i8.AbstractC1428b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return g((Enum) obj);
        }
        return false;
    }

    public boolean g(Enum element) {
        n.h(element, "element");
        return ((Enum) AbstractC1439m.I(this.f23554r, element.ordinal())) == element;
    }

    @Override // p089i8.AbstractC1429c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return n((Enum) obj);
        }
        return -1;
    }

    @Override // p089i8.AbstractC1429c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return o((Enum) obj);
        }
        return -1;
    }

    @Override // p089i8.AbstractC1429c, java.util.List
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public Enum get(int i10) {
        AbstractC1429c.f22259q.b(i10, this.f23554r.length);
        return this.f23554r[i10];
    }

    public int n(Enum element) {
        n.h(element, "element");
        int iOrdinal = element.ordinal();
        if (((Enum) AbstractC1439m.I(this.f23554r, iOrdinal)) == element) {
            return iOrdinal;
        }
        return -1;
    }

    public int o(Enum element) {
        n.h(element, "element");
        return indexOf(element);
    }
}
