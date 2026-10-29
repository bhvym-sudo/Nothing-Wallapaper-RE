package androidx.compose.ui.platform;

import java.util.Comparator;

/* JADX INFO: renamed from: androidx.compose.ui.platform.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1061s implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Comparator f11997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Comparator f11998b;

    public C1061s(Comparator comparator, Comparator comparator2) {
        this.f11997a = comparator;
        this.f11998b = comparator2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iCompare = this.f11997a.compare(obj, obj2);
        return iCompare != 0 ? iCompare : this.f11998b.compare(((p011b0.j) obj).q(), ((p011b0.j) obj2).q());
    }
}
