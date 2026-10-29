package com.android.wallpaper.picker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.widget.FrameLayout;
import androidx.core.view.C1069a;
import androidx.core.view.H;

/* JADX INFO: loaded from: classes.dex */
public class TouchForwardingLayout extends FrameLayout {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private View f15934q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f15935r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private GestureDetector f15936s;

    class a extends GestureDetector.SimpleOnGestureListener {
        a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            return TouchForwardingLayout.this.performClick();
        }
    }

    class b extends C1069a {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f15938q;

        b(TouchForwardingLayout touchForwardingLayout, int i10) {
            this.f15938q = i10;
        }

        @Override // androidx.core.view.C1069a
        public void onInitializeAccessibilityNodeInfo(View view, C0.d dVar) {
            super.onInitializeAccessibilityNodeInfo(view, dVar);
            dVar.b(new C0.d.a(16, view.getResources().getString(this.f15938q)));
        }
    }

    public TouchForwardingLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15936s = new GestureDetector(context, new a());
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.f15936s.onTouchEvent(motionEvent);
        View view = this.f15934q;
        if (view == null || !this.f15935r) {
            return true;
        }
        view.dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return super.generateDefaultLayoutParams();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return super.generateLayoutParams(attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public /* bridge */ /* synthetic */ ViewOverlay getOverlay() {
        return super.getOverlay();
    }

    public void setForwardingEnabled(boolean z9) {
        this.f15935r = z9;
    }

    public void setOnClickAccessibilityDescription(int i10) {
        H.g0(this, new b(this, i10));
    }

    public void setTargetView(View view) {
        this.f15934q = view;
    }
}
