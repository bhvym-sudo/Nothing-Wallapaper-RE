package androidx.compose.ui.platform;

import java.util.Comparator;

/* JADX INFO: renamed from: androidx.compose.ui.platform.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1062t implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Comparator f12000a;

    public C1062t(Comparator comparator) {
        this.f12000a = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iCompare = this.f12000a.compare(obj, obj2);
        return iCompare != 0 ? iCompare : p109k8.a.d(Integer.valueOf(((p011b0.j) obj).o()), Integer.valueOf(((p011b0.j) obj2).o()));
    }
}
