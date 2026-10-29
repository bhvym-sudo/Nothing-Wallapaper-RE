package I;

import android.graphics.Canvas;

/* JADX INFO: renamed from: I.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C0872p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0872p f2736a = new C0872p();

    private C0872p() {
    }

    public final void a(Canvas canvas, boolean z9) {
        if (z9) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }
}
