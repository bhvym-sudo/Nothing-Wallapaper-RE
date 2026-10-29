package com.nothing.wallpaper.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.nothing.wallpaper.common.log.c;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class VerticallyRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f19193v = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f19194q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f19195r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f19196s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f19197t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f19198u;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VerticallyRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        n.h(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent e10) {
        n.h(e10, "e");
        requestDisallowInterceptTouchEvent(false);
        return super.dispatchTouchEvent(e10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent e10) {
        n.h(e10, "e");
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        boolean zCanScrollHorizontally = layoutManager != null ? layoutManager.canScrollHorizontally() : false;
        RecyclerView.LayoutManager layoutManager2 = getLayoutManager();
        boolean zCanScrollVertically = layoutManager2 != null ? layoutManager2.canScrollVertically() : false;
        int actionMasked = e10.getActionMasked();
        int actionIndex = e10.getActionIndex();
        if (actionMasked == 0) {
            this.f19194q = e10.getPointerId(0);
            this.f19195r = p239x8.a.b(e10.getX() + 0.5f);
            this.f19196s = p239x8.a.b(e10.getY() + 0.5f);
            this.f19198u = false;
        } else if (actionMasked == 2) {
            int iFindPointerIndex = e10.findPointerIndex(this.f19194q);
            if (iFindPointerIndex < 0) {
                c.f("VerticallyRecyclerView", "Error processing scroll; pointer index for id " + this.f19194q + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int iB = p239x8.a.b(e10.getX(iFindPointerIndex) + 0.5f);
            int iB2 = p239x8.a.b(e10.getY(iFindPointerIndex) + 0.5f);
            if (!this.f19198u) {
                int i10 = iB - this.f19195r;
                int i11 = iB2 - this.f19196s;
                if (zCanScrollHorizontally && Math.abs(i10) > this.f19197t && Math.abs(i10) > Math.abs(i11)) {
                    this.f19198u = true;
                }
                if (zCanScrollVertically && Math.abs(i11) > this.f19197t && Math.abs(i11) > Math.abs(i10)) {
                    this.f19198u = true;
                }
            }
        } else if (actionMasked == 5) {
            this.f19194q = e10.getPointerId(actionIndex);
            this.f19195r = p239x8.a.b(e10.getX(actionIndex) + 0.5f);
            this.f19196s = p239x8.a.b(e10.getY(actionIndex) + 0.5f);
        }
        return super.onInterceptTouchEvent(e10) && this.f19198u;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 == 0) {
            this.f19197t = viewConfiguration.getScaledTouchSlop();
        } else if (i10 == 1) {
            this.f19197t = viewConfiguration.getScaledPagingTouchSlop();
        }
        super.setScrollingTouchSlop(i10);
    }

    public /* synthetic */ VerticallyRecyclerView(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC1457h abstractC1457h) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticallyRecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        n.h(context, "context");
        this.f19194q = -1;
        this.f19197t = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
