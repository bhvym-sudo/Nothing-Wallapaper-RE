package p089i8;

import java.util.AbstractList;
import java.util.List;
import p229w8.c;

/* JADX INFO: renamed from: i8.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1433g extends AbstractList implements List, c {
    protected AbstractC1433g() {
    }

    public abstract int a();

    public abstract Object b(int i10);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i10) {
        return b(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return a();
    }
}
