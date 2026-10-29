package com.nothing.wallpaper.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.google.android.material.tabs.TabLayout;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class NTUnscrollableTabLayout extends TabLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NTUnscrollableTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        n.h(context, "context");
    }

    @Override // com.google.android.material.tabs.TabLayout, android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // com.google.android.material.tabs.TabLayout, android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null || motionEvent.getActionMasked() == 8) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }
}
