package com.nothing.aiwidget;

import android.view.SurfaceView;

/* JADX INFO: loaded from: classes.dex */
public interface IAIWidgetView {
    void disallowTouchEvent(boolean z9);

    SurfaceView getSurfaceView();

    int getTouchMode();

    boolean isSurfaceViewShowing();

    void onRelease();

    void registerAIWidgetLauncherClient(IAIWidgetLauncherClient iAIWidgetLauncherClient);

    void setIgnoreSurfaceAttachEvent(boolean z9);

    void setOnTouchEventListener(OnTouchEventListener onTouchEventListener);

    void setOnTouchModeChangedListener(OnTouchModeChangedListener onTouchModeChangedListener);

    void setPreviewMode(boolean z9);
}
