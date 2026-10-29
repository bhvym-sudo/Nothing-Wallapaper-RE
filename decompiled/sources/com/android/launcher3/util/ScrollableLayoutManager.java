package com.android.launcher3.util;

import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class ScrollableLayoutManager extends GridLayoutManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final SparseIntArray f15704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RecyclerView f15705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int[] f15706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f15707d;

    private int e(RecyclerView.Adapter adapter, int i10) {
        int itemCount = adapter.getItemCount();
        int i11 = itemCount + 1;
        if (this.f15706c.length < i11) {
            this.f15706c = new int[i11];
            this.f15707d = 0;
        }
        if (i10 > itemCount) {
            i10 = itemCount;
        } else if (i10 < 0) {
            i10 = 0;
        }
        int i12 = this.f15707d;
        if (i10 <= i12) {
            return this.f15706c[i10];
        }
        int iF = this.f15706c[i12];
        while (i12 < i10) {
            iF = f(adapter, i12, iF);
            i12++;
            this.f15706c[i12] = iF;
        }
        this.f15707d = i10;
        return iF;
    }

    private void g() {
        this.f15707d = 0;
    }

    private void h(View view) {
        int itemViewType = this.f15705b.getChildViewHolder(view).getItemViewType();
        int measuredHeight = view.getMeasuredHeight();
        if (this.f15704a.get(itemViewType, -1) != measuredHeight) {
            g();
        }
        this.f15704a.put(itemViewType, measuredHeight);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    protected void calculateExtraLayoutSpace(RecyclerView.State state, int[] iArr) {
        super.calculateExtraLayoutSpace(state, iArr);
        iArr[1] = Math.max(iArr[1], (int) (getHeight() * 0.050000012f));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(RecyclerView.State state) {
        RecyclerView recyclerView = this.f15705b;
        if (recyclerView == null) {
            return 0;
        }
        return recyclerView.getHeight();
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        View childAt;
        RecyclerView.ViewHolder viewHolderFindContainingViewHolder;
        int layoutPosition;
        RecyclerView recyclerView = this.f15705b;
        RecyclerView.Adapter adapter = recyclerView == null ? null : recyclerView.getAdapter();
        if (adapter == null || adapter.getItemCount() == 0 || getChildCount() == 0 || (viewHolderFindContainingViewHolder = this.f15705b.findContainingViewHolder((childAt = getChildAt(0)))) == null || (layoutPosition = viewHolderFindContainingViewHolder.getLayoutPosition()) < 0) {
            return 0;
        }
        return (getPaddingTop() + e(adapter, layoutPosition)) - getDecoratedTop(childAt);
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        RecyclerView recyclerView = this.f15705b;
        RecyclerView.Adapter adapter = recyclerView == null ? null : recyclerView.getAdapter();
        if (adapter == null) {
            return 0;
        }
        return e(adapter, adapter.getItemCount());
    }

    protected int f(RecyclerView.Adapter adapter, int i10, int i11) {
        return i11 + this.f15704a.get(adapter.getItemViewType(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void layoutDecorated(View view, int i10, int i11, int i12, int i13) {
        super.layoutDecorated(view, i10, i11, i12, i13);
        h(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void layoutDecoratedWithMargins(View view, int i10, int i11, int i12, int i13) {
        super.layoutDecoratedWithMargins(view, i10, i11, i12, i13);
        h(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.f15705b = recyclerView;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(RecyclerView recyclerView, int i10, int i11) {
        super.onItemsAdded(recyclerView, i10, i11);
        g();
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsChanged(RecyclerView recyclerView) {
        super.onItemsChanged(recyclerView);
        g();
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsMoved(RecyclerView recyclerView, int i10, int i11, int i12) {
        super.onItemsMoved(recyclerView, i10, i11, i12);
        g();
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(RecyclerView recyclerView, int i10, int i11) {
        super.onItemsRemoved(recyclerView, i10, i11);
        g();
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(RecyclerView recyclerView, int i10, int i11, Object obj) {
        super.onItemsUpdated(recyclerView, i10, i11, obj);
        g();
    }
}
