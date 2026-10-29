package androidx.compose.ui.platform.coreshims;

import android.view.autofill.AutofillId;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f11871a;

    private a(AutofillId autofillId) {
        this.f11871a = autofillId;
    }

    public static a b(AutofillId autofillId) {
        return new a(autofillId);
    }

    public AutofillId a() {
        return (AutofillId) this.f11871a;
    }
}
