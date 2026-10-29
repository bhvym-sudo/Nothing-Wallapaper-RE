package C1;

import android.widget.ImageView;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f570a = new a();

    private a() {
    }

    public final void a(ImageView view, E1.a viewModel) {
        n.h(view, "view");
        n.h(viewModel, "viewModel");
        view.setImageDrawable(new p203u2.a(viewModel.a(), viewModel.c(), viewModel.b()));
    }
}
