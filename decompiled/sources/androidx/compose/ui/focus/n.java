package androidx.compose.ui.focus;

import W.AbstractC0967i;
import W.B;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
final class n implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f11444a = new n();

    private n() {
    }

    private final p190t.b b(B b10) {
        p190t.b bVar = new p190t.b(new B[16], 0);
        while (b10 != null) {
            bVar.a(0, b10);
            b10 = b10.Y();
        }
        return bVar;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(k kVar, k kVar2) {
        int i10 = 0;
        if (!m.g(kVar) || !m.g(kVar2)) {
            if (m.g(kVar)) {
                return -1;
            }
            return m.g(kVar2) ? 1 : 0;
        }
        B bH = AbstractC0967i.h(kVar);
        B bH2 = AbstractC0967i.h(kVar2);
        if (kotlin.jvm.internal.n.d(bH, bH2)) {
            return 0;
        }
        p190t.b bVarB = b(bH);
        p190t.b bVarB2 = b(bH2);
        int iMin = Math.min(bVarB.p() - 1, bVarB2.p() - 1);
        if (iMin >= 0) {
            while (kotlin.jvm.internal.n.d(bVarB.o()[i10], bVarB2.o()[i10])) {
                if (i10 != iMin) {
                    i10++;
                }
            }
            return kotlin.jvm.internal.n.i(((B) bVarB.o()[i10]).Z(), ((B) bVarB2.o()[i10]).Z());
        }
        throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
    }
}
