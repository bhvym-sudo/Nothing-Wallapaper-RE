package androidx.viewpager2.widget;

import android.view.View;
import androidx.core.view.H;
import androidx.core.view.InterfaceC1090w;
import androidx.core.view.V;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class WindowInsetsApplier implements InterfaceC1090w {
    private WindowInsetsApplier() {
    }

    private V consumeAllInsets(V v9) {
        V v10 = V.f12222b;
        return v10.t() != null ? v10 : v9.c().b();
    }

    public static boolean install(ViewPager2 viewPager2) {
        if (viewPager2.getContext().getApplicationInfo().targetSdkVersion >= 30) {
            return false;
        }
        H.u0(viewPager2, new WindowInsetsApplier());
        return true;
    }

    @Override // androidx.core.view.InterfaceC1090w
    public V onApplyWindowInsets(View view, V v9) {
        ViewPager2 viewPager2 = (ViewPager2) view;
        V vT = H.T(viewPager2, v9);
        if (vT.o()) {
            return vT;
        }
        RecyclerView recyclerView = viewPager2.mRecyclerView;
        int childCount = recyclerView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            H.f(recyclerView.getChildAt(i10), new V(vT));
        }
        return consumeAllInsets(vT);
    }
}
