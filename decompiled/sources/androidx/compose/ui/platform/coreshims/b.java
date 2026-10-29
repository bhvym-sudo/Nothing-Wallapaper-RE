package androidx.compose.ui.platform.coreshims;

import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f11872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f11873b;

    private static class a {
        static AutofillId a(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j9) {
            return contentCaptureSession.newAutofillId(autofillId, j9);
        }

        static ViewStructure b(ContentCaptureSession contentCaptureSession, View view) {
            return contentCaptureSession.newViewStructure(view);
        }

        static ViewStructure c(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j9) {
            return contentCaptureSession.newVirtualViewStructure(autofillId, j9);
        }

        static void d(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
            contentCaptureSession.notifyViewAppeared(viewStructure);
        }

        public static void e(ContentCaptureSession contentCaptureSession, AutofillId autofillId, CharSequence charSequence) {
            contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
        }

        static void f(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
            contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.coreshims.b$b, reason: collision with other inner class name */
    private static class C0375b {
        static void a(ContentCaptureSession contentCaptureSession, List<ViewStructure> list) {
            contentCaptureSession.notifyViewsAppeared(list);
        }
    }

    private b(ContentCaptureSession contentCaptureSession, View view) {
        this.f11872a = contentCaptureSession;
        this.f11873b = view;
    }

    public static b f(ContentCaptureSession contentCaptureSession, View view) {
        return new b(contentCaptureSession, view);
    }

    public AutofillId a(long j9) {
        ContentCaptureSession contentCaptureSession = (ContentCaptureSession) this.f11872a;
        androidx.compose.ui.platform.coreshims.a aVarA = c.a(this.f11873b);
        Objects.requireNonNull(aVarA);
        return a.a(contentCaptureSession, aVarA.a(), j9);
    }

    public d b(AutofillId autofillId, long j9) {
        return d.h(a.c((ContentCaptureSession) this.f11872a, autofillId, j9));
    }

    public void c(AutofillId autofillId, CharSequence charSequence) {
        a.e((ContentCaptureSession) this.f11872a, autofillId, charSequence);
    }

    public void d(List list) {
        C0375b.a((ContentCaptureSession) this.f11872a, list);
    }

    public void e(long[] jArr) {
        ContentCaptureSession contentCaptureSession = (ContentCaptureSession) this.f11872a;
        androidx.compose.ui.platform.coreshims.a aVarA = c.a(this.f11873b);
        Objects.requireNonNull(aVarA);
        a.f(contentCaptureSession, aVarA.a(), jArr);
    }
}
