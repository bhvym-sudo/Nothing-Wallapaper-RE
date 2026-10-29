package androidx.compose.ui.platform;

import android.view.MotionEvent;

/* JADX INFO: renamed from: androidx.compose.ui.platform.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1042b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1042b0 f11853a = new C1042b0();

    private C1042b0() {
    }

    public final boolean a(MotionEvent motionEvent, int i10) {
        float rawX = motionEvent.getRawX(i10);
        if (Float.isInfinite(rawX) || Float.isNaN(rawX)) {
            return false;
        }
        float rawY = motionEvent.getRawY(i10);
        return (Float.isInfinite(rawY) || Float.isNaN(rawY)) ? false : true;
    }
}
