package p134n3;

import android.content.Context;
import android.widget.ImageView;
import kotlin.jvm.internal.n;
import p079h8.m;
import p144o3.a;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f23260a = new b();

    private b() {
    }

    public final void a(ImageView view, a viewModel) {
        String strB;
        n.h(view, "view");
        n.h(viewModel, "viewModel");
        if (viewModel instanceof a.b) {
            view.setImageResource(((a.b) viewModel).b());
        } else {
            if (!(viewModel instanceof a.C0618a)) {
                throw new m();
            }
            view.setImageDrawable(((a.C0618a) viewModel).b());
        }
        p164q3.a aVarA = viewModel.a();
        if (aVarA instanceof q3.a.c) {
            Context context = view.getContext();
            p164q3.a aVarA2 = viewModel.a();
            n.f(aVarA2, "null cannot be cast to non-null type com.android.wallpaper.picker.common.text.ui.viewmodel.Text.Resource");
            strB = context.getString(((q3.a.c) aVarA2).b());
        } else if (aVarA instanceof q3.a.b) {
            p164q3.a aVarA3 = viewModel.a();
            n.f(aVarA3, "null cannot be cast to non-null type com.android.wallpaper.picker.common.text.ui.viewmodel.Text.Loaded");
            strB = ((q3.a.b) aVarA3).b();
        } else {
            if (aVarA != null) {
                throw new m();
            }
            strB = null;
        }
        view.setContentDescription(strB);
    }
}
