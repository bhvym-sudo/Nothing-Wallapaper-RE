package p023c2;

import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public class a extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0434a f15048b = new C0434a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f15049a;

    /* JADX INFO: renamed from: c2.a$a, reason: collision with other inner class name */
    public static final class C0434a {
        public /* synthetic */ C0434a(AbstractC1457h abstractC1457h) {
            this();
        }

        private C0434a() {
        }
    }

    public a(int i10) {
        this.f15049a = i10;
    }

    private final int b(int i10, float f10) {
        return (int) (i10 * f10);
    }

    public int a(float f10) {
        return b(this.f15049a, f10) / 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect outRect, int i10, RecyclerView parent) {
        n.h(outRect, "outRect");
        n.h(parent, "parent");
        boolean z9 = i10 > 0;
        RecyclerView.Adapter adapter = parent.getAdapter();
        boolean z10 = i10 < (adapter != null ? adapter.getItemCount() : 0) - 1;
        RecyclerView.LayoutManager layoutManager = parent.getLayoutManager();
        boolean z11 = layoutManager != null && layoutManager.getLayoutDirection() == 1;
        int iA = a(parent.getContext().getResources().getDisplayMetrics().density);
        if (z11) {
            outRect.left = z10 ? iA : 0;
            outRect.right = z9 ? iA : 0;
        } else {
            outRect.left = z9 ? iA : 0;
            outRect.right = z10 ? iA : 0;
        }
    }
}
