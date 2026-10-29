package D;

import android.view.View;
import android.view.autofill.AutofillManager;

/* JADX INFO: loaded from: classes.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AutofillManager f690c;

    public a(View view, g gVar) {
        this.f688a = view;
        this.f689b = gVar;
        AutofillManager autofillManager = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.f690c = autofillManager;
        view.setImportantForAutofill(1);
    }

    public final AutofillManager a() {
        return this.f690c;
    }

    public final g b() {
        return this.f689b;
    }

    public final View c() {
        return this.f688a;
    }
}
