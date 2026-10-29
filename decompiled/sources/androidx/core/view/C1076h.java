package androidx.core.view;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: renamed from: androidx.core.view.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1076h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final GestureDetector f12261a;

    public C1076h(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public boolean a(MotionEvent motionEvent) {
        return this.f12261a.onTouchEvent(motionEvent);
    }

    public C1076h(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.f12261a = new GestureDetector(context, onGestureListener, handler);
    }
}
