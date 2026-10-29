package androidx.compose.ui.platform;

import android.view.View;

/* JADX INFO: renamed from: androidx.compose.ui.platform.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1066x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1066x f12009a = new C1066x();

    private C1066x() {
    }

    public final void a(View view) {
        view.clearViewTranslationCallback();
    }

    public final void b(View view) {
        view.setViewTranslationCallback(ViewTranslationCallbackC1065w.f12008a);
    }
}
