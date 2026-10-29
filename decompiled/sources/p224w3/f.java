package p224w3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.InterfaceC1163x;
import com.android.wallpaper.picker.b;
import com.android.wallpaper.picker.customization.ui.section.WallpaperQuickSwitchView;
import com.nothing.wallpaper.R;
import kotlin.jvm.internal.n;
import p079h8.A;
import p214v3.v;
import p219v8.a;
import p234x3.g;

/* JADX INFO: loaded from: classes.dex */
public final class f implements p064g3.f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final g f28662q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final InterfaceC1163x f28663r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final g3.f.a f28664s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f28665t;

    public f(g viewModel, InterfaceC1163x lifecycleOwner, g3.f.a navigator, boolean z9) {
        n.h(viewModel, "viewModel");
        n.h(lifecycleOwner, "lifecycleOwner");
        n.h(navigator, "navigator");
        this.f28662q = viewModel;
        this.f28663r = lifecycleOwner;
        this.f28664s = navigator;
        this.f28665t = z9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A i(f fVar) {
        fVar.f28664s.g(new b());
        return A.f21846a;
    }

    @Override // p064g3.f
    public boolean e(Context context) {
        n.h(context, "context");
        return true;
    }

    @Override // p064g3.f
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public WallpaperQuickSwitchView f(Context context) {
        n.h(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.wallpaper_quick_switch_section, (ViewGroup) null);
        n.f(viewInflate, "null cannot be cast to non-null type com.android.wallpaper.picker.customization.ui.section.WallpaperQuickSwitchView");
        WallpaperQuickSwitchView wallpaperQuickSwitchView = (WallpaperQuickSwitchView) viewInflate;
        v.f28462a.e(wallpaperQuickSwitchView, this.f28662q, this.f28663r, this.f28665t, new a() { // from class: w3.e
            @Override // p219v8.a
            public final Object invoke() {
                return f.i(this.f28661q);
            }
        });
        return wallpaperQuickSwitchView;
    }
}
