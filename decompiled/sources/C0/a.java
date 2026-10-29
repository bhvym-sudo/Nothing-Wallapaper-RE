package C0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f512c;

    public a(int i10, d dVar, int i11) {
        this.f510a = i10;
        this.f511b = dVar;
        this.f512c = i11;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f510a);
        this.f511b.X(this.f512c, bundle);
    }
}
