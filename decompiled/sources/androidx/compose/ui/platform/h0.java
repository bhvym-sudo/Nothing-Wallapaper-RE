package androidx.compose.ui.platform;

import androidx.collection.AbstractC1031k;
import androidx.collection.AbstractC1034n;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p011b0.g f11909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.collection.y f11910b = AbstractC1034n.b();

    public h0(p011b0.j jVar, AbstractC1031k abstractC1031k) {
        this.f11909a = jVar.w();
        List listT = jVar.t();
        int size = listT.size();
        for (int i10 = 0; i10 < size; i10++) {
            p011b0.j jVar2 = (p011b0.j) listT.get(i10);
            if (abstractC1031k.a(jVar2.o())) {
                this.f11910b.f(jVar2.o());
            }
        }
    }

    public final androidx.collection.y a() {
        return this.f11910b;
    }

    public final p011b0.g b() {
        return this.f11909a;
    }
}
