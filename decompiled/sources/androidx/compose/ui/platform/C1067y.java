package androidx.compose.ui.platform;

import android.view.View;

/* JADX INFO: renamed from: androidx.compose.ui.platform.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1067y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1067y f12013a = new C1067y();

    private C1067y() {
    }

    public final void a(View view, int i10, boolean z9) {
        view.setFocusable(i10);
        view.setDefaultFocusHighlightEnabled(z9);
    }
}
