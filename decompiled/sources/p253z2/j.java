package p253z2;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public interface j {
    static j c(final int i10) {
        return new j() { // from class: z2.i
            @Override // p253z2.j
            public final int getViewType() {
                return j.e(i10);
            }
        };
    }

    static /* synthetic */ int e(int i10) {
        return i10;
    }

    default void b(Rect rect) {
        d(rect);
    }

    default void d(Rect rect) {
    }

    int getViewType();
}
