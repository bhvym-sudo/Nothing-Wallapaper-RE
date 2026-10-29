package p089i8;

import java.util.AbstractSet;
import java.util.Set;
import p229w8.e;

/* JADX INFO: renamed from: i8.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1435i extends AbstractSet implements Set, e {
    protected AbstractC1435i() {
    }

    public abstract int a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return a();
    }
}
