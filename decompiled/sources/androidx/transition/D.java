package androidx.transition;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
abstract class D {

    static class a {
        static int a(ViewGroup viewGroup, int i10) {
            return viewGroup.getChildDrawingOrder(i10);
        }

        static void b(ViewGroup viewGroup, boolean z9) {
            viewGroup.suppressLayout(z9);
        }
    }

    static void a(ViewGroup viewGroup, boolean z9) {
        a.b(viewGroup, z9);
    }
}
