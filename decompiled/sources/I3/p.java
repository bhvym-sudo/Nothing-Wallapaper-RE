package I3;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class p extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3019b;

    public p(int i10, int i11) {
        this.f3018a = i10;
        this.f3019b = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        if (recyclerView.getChildAdapterPosition(view) >= 0) {
            int i10 = this.f3018a;
            rect.left = i10;
            rect.right = i10;
            rect.bottom = this.f3019b;
        }
    }
}
