package p078h7;

import Q6.e;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.InterfaceC1163x;
import com.nothing.wallpaper.picker.customization.ui.activity.NTColorPickerActivity;
import kotlin.jvm.internal.n;
import p013b2.c;
import p064g3.f;
import p079h8.A;
import p084i3.s0;
import p219v8.l;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final f.a f21815q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final c f21816r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final InterfaceC1163x f21817s;

    public b(f.a navigationController, c viewModel, InterfaceC1163x lifecycleOwner) {
        n.h(navigationController, "navigationController");
        n.h(viewModel, "viewModel");
        n.h(lifecycleOwner, "lifecycleOwner");
        this.f21815q = navigationController;
        this.f21816r = viewModel;
        this.f21817s = lifecycleOwner;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A g(Context context, View it) {
        n.h(it, "it");
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            NTColorPickerActivity.f18495S.a(activity);
        }
        return A.f21846a;
    }

    @Override // p064g3.f
    public View c(View view, final Context context) {
        n.h(view, "view");
        n.h(context, "context");
        return e.c(context, (ViewGroup) view, this.f21816r, this.f21817s, new l() { // from class: h7.a
            @Override // p219v8.l
            public final Object f(Object obj) {
                return b.g(context, (View) obj);
            }
        });
    }

    @Override // p064g3.f
    public boolean e(Context context) {
        n.h(context, "context");
        return true;
    }

    @Override // p064g3.f
    public s0 f(Context context) {
        n.h(context, "context");
        throw new p079h8.n("An operation is not implemented: Not yet implemented");
    }
}
