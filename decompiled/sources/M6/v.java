package M6;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public final class v extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f5091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f5092b;

    public /* synthetic */ v(int i10, int i11, int i12, AbstractC1457h abstractC1457h) {
        this(i10, (i12 & 2) != 0 ? 1 : i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        kotlin.jvm.internal.n.h(outRect, "outRect");
        kotlin.jvm.internal.n.h(view, "view");
        kotlin.jvm.internal.n.h(parent, "parent");
        kotlin.jvm.internal.n.h(state, "state");
        if (this.f5092b != 0) {
            outRect.bottom = this.f5091a;
        } else {
            int i10 = this.f5091a;
            outRect.set(i10, i10, i10, i10);
        }
    }

    public v(int i10, int i11) {
        this.f5091a = i10;
        this.f5092b = i11;
    }
}
