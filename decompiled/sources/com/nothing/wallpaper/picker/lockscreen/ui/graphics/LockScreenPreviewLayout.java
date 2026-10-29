package com.nothing.wallpaper.picker.lockscreen.ui.graphics;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.android.launcher3.dragndrop.DragLayer;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class LockScreenPreviewLayout extends DragLayer {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LockScreenPreviewLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        n.h(context, "context");
        n.h(attrs, "attrs");
    }

    @Override // com.android.launcher3.dragndrop.DragLayer, android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return false;
    }

    @Override // com.android.launcher3.dragndrop.DragLayer, com.android.launcher3.views.g, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // com.android.launcher3.views.g, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
