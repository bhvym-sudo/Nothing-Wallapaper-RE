package com.android.wallpaper.picker.customization.ui.section;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p219v8.l;

/* JADX INFO: loaded from: classes.dex */
public final class ScreenPreviewClickView extends FrameLayout {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f15984t = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f15985q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f15986r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private l f15987s;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private final float b(MotionEvent motionEvent, float f10, float f11) {
            double d10 = 2;
            return (float) Math.sqrt(((float) Math.pow(motionEvent.getX() - f10, d10)) + ((float) Math.pow(motionEvent.getY() - f11, d10)));
        }

        private final long c(MotionEvent motionEvent) {
            return motionEvent.getEventTime() - motionEvent.getDownTime();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean d(MotionEvent motionEvent, float f10, float f11) {
            return motionEvent.getActionMasked() == 1 && c(motionEvent) <= ((long) ViewConfiguration.getTapTimeout()) && b(motionEvent, f10, f11) <= ((float) ViewConfiguration.getTouchSlop());
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenPreviewClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        n.h(context, "context");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent event) {
        n.h(event, "event");
        if (event.getActionMasked() == 0) {
            this.f15985q = event.getX();
            this.f15986r = event.getY();
        }
        return f15984t.d(event, this.f15985q, this.f15986r) ? performClick() : super.onInterceptTouchEvent(event);
    }

    public final void setOnSideClickedListener(l onSideClicked) {
        n.h(onSideClicked, "onSideClicked");
        this.f15987s = onSideClicked;
    }
}
