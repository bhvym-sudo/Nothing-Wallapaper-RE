package p089i8;

import java.util.AbstractCollection;
import java.util.Collection;
import p229w8.b;

/* JADX INFO: renamed from: i8.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1432f extends AbstractCollection implements Collection, b {
    protected AbstractC1432f() {
    }

    public abstract int a();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return a();
    }
}
