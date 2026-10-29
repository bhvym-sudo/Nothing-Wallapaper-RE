package p190t;

import android.util.SparseArray;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseArray f27837a;

    private a(SparseArray sparseArray) {
        this.f27837a = sparseArray;
    }

    public final Object a(int i10) {
        return this.f27837a.get(i10);
    }

    public final void b(int i10, Object obj) {
        this.f27837a.put(i10, obj);
    }

    public a(int i10) {
        this(new SparseArray(i10));
    }

    public /* synthetic */ a(int i10, int i11, AbstractC1457h abstractC1457h) {
        this((i11 & 1) != 0 ? 10 : i10);
    }
}
