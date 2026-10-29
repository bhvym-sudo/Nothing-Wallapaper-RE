package com.nothing.wallpaper.picker.lockscreen.ui.view;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface E {
    default void a(boolean z9, O1.b model, S1.a clockViewFactory, p219v8.l onTransitionStart, p219v8.a onTransitionEnd) {
        kotlin.jvm.internal.n.h(model, "model");
        kotlin.jvm.internal.n.h(clockViewFactory, "clockViewFactory");
        kotlin.jvm.internal.n.h(onTransitionStart, "onTransitionStart");
        kotlin.jvm.internal.n.h(onTransitionEnd, "onTransitionEnd");
    }

    void b(boolean z9);

    default void c(float f10) {
    }

    void d();

    default void e(A7.a align, N1.a size, p219v8.l onTransitionStart, p219v8.a onTransitionEnd) {
        kotlin.jvm.internal.n.h(align, "align");
        kotlin.jvm.internal.n.h(size, "size");
        kotlin.jvm.internal.n.h(onTransitionStart, "onTransitionStart");
        kotlin.jvm.internal.n.h(onTransitionEnd, "onTransitionEnd");
    }

    ObjectAnimator f(float f10);

    default void g(List clocks, int i10, S1.a clockViewFactory) {
        kotlin.jvm.internal.n.h(clocks, "clocks");
        kotlin.jvm.internal.n.h(clockViewFactory, "clockViewFactory");
    }

    View getClockView();

    default View getIndicator() {
        return null;
    }

    View getView();

    default void h(float f10) {
    }

    default void i(N1.a size, A7.a align, p219v8.l onClockSizeChanged, p219v8.a onTransitionStart, p219v8.a onTransitionEnd) {
        kotlin.jvm.internal.n.h(size, "size");
        kotlin.jvm.internal.n.h(align, "align");
        kotlin.jvm.internal.n.h(onClockSizeChanged, "onClockSizeChanged");
        kotlin.jvm.internal.n.h(onTransitionStart, "onTransitionStart");
        kotlin.jvm.internal.n.h(onTransitionEnd, "onTransitionEnd");
    }

    void setOnClockChangedListener(p219v8.l lVar);
}
