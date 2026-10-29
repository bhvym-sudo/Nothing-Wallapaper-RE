package p134n3;

import android.view.View;
import kotlin.jvm.internal.n;
import p079h8.m;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f23259a = new a();

    private a() {
    }

    public final void a(View view, p164q3.a viewModel) {
        String strB;
        n.h(view, "view");
        n.h(viewModel, "viewModel");
        if (viewModel instanceof q3.a.c) {
            strB = view.getContext().getString(((q3.a.c) viewModel).b());
        } else {
            if (!(viewModel instanceof q3.a.b)) {
                throw new m();
            }
            strB = ((q3.a.b) viewModel).b();
        }
        view.setContentDescription(strB);
    }
}
