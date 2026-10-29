package p003a2;

import Y1.h;
import Z1.e;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.InterfaceC1163x;
import com.android.customization.picker.color.ui.view.ColorSectionView;
import com.nothing.wallpaper.R;
import kotlin.jvm.internal.n;
import p013b2.c;
import p064g3.f;
import p079h8.A;
import p219v8.l;

/* JADX INFO: loaded from: classes.dex */
public final class b implements f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final f.a f9604q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final c f9605r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final InterfaceC1163x f9606s;

    public b(f.a navigationController, c viewModel, InterfaceC1163x lifecycleOwner) {
        n.h(navigationController, "navigationController");
        n.h(viewModel, "viewModel");
        n.h(lifecycleOwner, "lifecycleOwner");
        this.f9604q = navigationController;
        this.f9605r = viewModel;
        this.f9606s = lifecycleOwner;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A j(b bVar, View it) {
        n.h(it, "it");
        bVar.f9604q.g(e.f9393w.a());
        return A.f21846a;
    }

    @Override // p064g3.f
    public boolean e(Context context) {
        n.h(context, "context");
        return true;
    }

    @Override // p064g3.f
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public ColorSectionView f(Context context) {
        n.h(context, "context");
        return h(context, new f.b(false, false, 3, null));
    }

    @Override // p064g3.f
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public ColorSectionView h(Context context, f.b params) {
        n.h(context, "context");
        n.h(params, "params");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.color_section_view, (ViewGroup) null);
        n.f(viewInflate, "null cannot be cast to non-null type com.android.customization.picker.color.ui.view.ColorSectionView");
        ColorSectionView colorSectionView = (ColorSectionView) viewInflate;
        h.c(colorSectionView, this.f9605r, this.f9606s, new l() { // from class: a2.a
            @Override // p219v8.l
            public final Object f(Object obj) {
                return b.j(this.f9603q, (View) obj);
            }
        }, params.a());
        return colorSectionView;
    }
}
