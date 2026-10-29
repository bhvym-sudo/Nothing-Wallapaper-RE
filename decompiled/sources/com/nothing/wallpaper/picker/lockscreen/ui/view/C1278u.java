package com.nothing.wallpaper.picker.lockscreen.ui.view;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.nothing.wallpaper.R;

/* JADX INFO: renamed from: com.nothing.wallpaper.picker.lockscreen.ui.view.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1278u extends RecyclerView.ItemDecoration {
    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        kotlin.jvm.internal.n.h(outRect, "outRect");
        kotlin.jvm.internal.n.h(view, "view");
        kotlin.jvm.internal.n.h(parent, "parent");
        kotlin.jvm.internal.n.h(state, "state");
        int dimension = (int) view.getContext().getResources().getDimension(R.dimen.nt_clock_space_margin);
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = parent.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        boolean z9 = parent.getLayoutDirection() == 1;
        if (childAdapterPosition == 0) {
            if (z9) {
                outRect.right = dimension * 2;
            } else {
                outRect.left = dimension * 2;
            }
        }
        int i10 = itemCount - 1;
        if (childAdapterPosition == i10) {
            if (z9) {
                outRect.left = dimension * 2;
            } else {
                outRect.right = dimension * 2;
            }
        }
        if (childAdapterPosition < 0 || childAdapterPosition >= i10) {
            return;
        }
        if (z9) {
            outRect.left = dimension;
        } else {
            outRect.right = dimension;
        }
    }
}
