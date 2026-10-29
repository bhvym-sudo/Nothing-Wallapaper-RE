package androidx.compose.ui.platform.coreshims;

import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    static class a {
        public static AutofillId a(View view) {
            return view.getAutofillId();
        }
    }

    private static class b {
        static ContentCaptureSession a(View view) {
            return view.getContentCaptureSession();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.coreshims.c$c, reason: collision with other inner class name */
    private static class C0376c {
        static void a(View view, int i10) {
            view.setImportantForContentCapture(i10);
        }
    }

    public static androidx.compose.ui.platform.coreshims.a a(View view) {
        return androidx.compose.ui.platform.coreshims.a.b(a.a(view));
    }

    public static androidx.compose.ui.platform.coreshims.b b(View view) {
        ContentCaptureSession contentCaptureSessionA = b.a(view);
        if (contentCaptureSessionA == null) {
            return null;
        }
        return androidx.compose.ui.platform.coreshims.b.f(contentCaptureSessionA, view);
    }

    public static void c(View view, int i10) {
        C0376c.a(view, i10);
    }
}
