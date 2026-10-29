package com.nothing.wallpaper.picker.creative.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class InterceptFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f18480q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterceptFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        n.h(context, "context");
    }

    public final boolean getNeedInterceptTouchEvent() {
        return this.f18480q;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f18480q) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setNeedInterceptTouchEvent(boolean z9) {
        this.f18480q = z9;
    }
}
