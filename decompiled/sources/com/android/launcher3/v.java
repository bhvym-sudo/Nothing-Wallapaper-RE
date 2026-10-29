package com.android.launcher3;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Trace;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;

/* JADX INFO: loaded from: classes.dex */
public class v extends ViewGroup {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int[] f15708q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f15709r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f15710s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Point f15711t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f15712u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f15713v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f15714w;

    interface a {
    }

    public v(Context context) {
        super(context);
        this.f15708q = new int[2];
        this.f15714w = false;
        setClipChildren(false);
    }

    public View a(int i10, int i11) {
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            p233x2.b bVar = (p233x2.b) childAt.getLayoutParams();
            if (bVar.a() <= i10 && i10 < bVar.a() + bVar.f29762f && bVar.b() <= i11 && i11 < bVar.b() + bVar.f29763g) {
                return childAt;
            }
        }
        return null;
    }

    public boolean b() {
        return this.f15714w && w.g(getResources());
    }

    public void c(View view) {
        p233x2.b bVar = (p233x2.b) view.getLayoutParams();
        int i10 = bVar.f29766j;
        int i11 = bVar.f29767k;
        view.layout(i10, i11, ((ViewGroup.MarginLayoutParams) bVar).width + i10, ((ViewGroup.MarginLayoutParams) bVar).height + i11);
        if (bVar.f29768l) {
            bVar.f29768l = false;
        }
    }

    @Override // android.view.View
    public void cancelLongPress() {
        super.cancelLongPress();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).cancelLongPress();
        }
    }

    public void d(View view) {
        p233x2.b bVar = (p233x2.b) view.getLayoutParams();
        bVar.j(this.f15709r, this.f15710s, b(), this.f15712u, this.f15713v, this.f15711t);
        view.measure(View.MeasureSpec.makeMeasureSpec(((ViewGroup.MarginLayoutParams) bVar).width, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(((ViewGroup.MarginLayoutParams) bVar).height, BasicMeasure.EXACTLY));
    }

    public void e(int i10, int i11, int i12, int i13, Point point) {
        this.f15709r = i10;
        this.f15710s = i11;
        this.f15712u = i12;
        this.f15713v = i13;
        this.f15711t = point;
    }

    @Override // android.view.ViewGroup, android.view.View
    public /* bridge */ /* synthetic */ ViewOverlay getOverlay() {
        return super.getOverlay();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && getAlpha() == 0.0f) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        Trace.beginSection("ShortcutAndWidgetConteiner#onLayout");
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                c(childAt);
            }
        }
        Trace.endSection();
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int childCount = getChildCount();
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                d(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (view != null) {
            Rect rect = new Rect();
            view.getDrawingRect(rect);
            requestRectangleOnScreen(rect);
        }
    }

    public void setInvertIfRtl(boolean z9) {
        this.f15714w = z9;
    }

    void setTranslationProvider(a aVar) {
    }

    public void setupLp(View view) {
        ((p233x2.b) view.getLayoutParams()).j(this.f15709r, this.f15710s, b(), this.f15712u, this.f15713v, this.f15711t);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
