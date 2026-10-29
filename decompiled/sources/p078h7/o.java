package p078h7;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.AbstractActivityC1136v;
import androidx.lifecycle.InterfaceC1163x;
import com.android.wallpaper.picker.customization.ui.section.WallpaperQuickSwitchView;
import com.nothing.wallpaper.picker.customization.ui.binder.NTSuggestedWallpaperSectionBinder;
import kotlin.jvm.internal.n;
import p064g3.f;
import p079h8.A;
import p088i7.g;
import p219v8.a;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final AbstractActivityC1136v f21837q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final g f21838r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final InterfaceC1163x f21839s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final f.a f21840t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f21841u;

    public o(AbstractActivityC1136v activity, g viewModel, InterfaceC1163x lifecycleOwner, f.a navigator, boolean z9) {
        n.h(activity, "activity");
        n.h(viewModel, "viewModel");
        n.h(lifecycleOwner, "lifecycleOwner");
        n.h(navigator, "navigator");
        this.f21837q = activity;
        this.f21838r = viewModel;
        this.f21839s = lifecycleOwner;
        this.f21840t = navigator;
        this.f21841u = z9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A g(o oVar) {
        oVar.f21840t.g(new com.android.wallpaper.picker.g());
        return A.f21846a;
    }

    @Override // p064g3.f
    public View c(View view, Context context) {
        n.h(view, "view");
        n.h(context, "context");
        NTSuggestedWallpaperSectionBinder.d(this.f21837q, context, view, this.f21838r, this.f21839s, new a() { // from class: h7.n
            @Override // p219v8.a
            public final Object invoke() {
                return o.g(this.f21836q);
            }
        });
        return view;
    }

    @Override // p064g3.f
    public boolean e(Context context) {
        n.h(context, "context");
        return true;
    }

    @Override // p064g3.f
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public WallpaperQuickSwitchView f(Context context) {
        n.h(context, "context");
        throw new p079h8.n("An operation is not implemented: Not yet implemented");
    }
}
