package Y1;

import com.android.customization.picker.color.ui.view.ColorOptionIconView;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f9231a = new a();

    private a() {
    }

    public final void a(ColorOptionIconView view, p013b2.a viewModel, boolean z9) {
        n.h(view, "view");
        n.h(viewModel, "viewModel");
        if (z9) {
            view.a(viewModel.a(), viewModel.b(), viewModel.c(), viewModel.d());
        } else {
            view.a(viewModel.e(), viewModel.f(), viewModel.g(), viewModel.h());
        }
    }
}
