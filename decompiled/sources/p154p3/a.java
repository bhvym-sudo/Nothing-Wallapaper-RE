package p154p3;

import android.widget.TextView;
import kotlin.jvm.internal.n;
import p079h8.m;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f23694a = new a();

    private a() {
    }

    public final void a(TextView view, p164q3.a viewModel) {
        n.h(view, "view");
        n.h(viewModel, "viewModel");
        if (viewModel instanceof q3.a.c) {
            view.setText(((q3.a.c) viewModel).b());
        } else {
            if (!(viewModel instanceof q3.a.b)) {
                throw new m();
            }
            view.setText(((q3.a.b) viewModel).b());
        }
    }
}
