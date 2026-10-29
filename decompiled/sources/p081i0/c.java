package p081i0;

import android.text.style.ClickableSpan;
import android.view.View;
import p031d0.d;

/* JADX INFO: loaded from: classes.dex */
final class c extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f21886a;

    public c(d dVar) {
        this.f21886a = dVar;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        this.f21886a.a();
    }
}
