package p163q2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.InterfaceC1163x;
import com.android.customization.picker.quickaffordance.ui.view.KeyguardQuickAffordanceSectionView;
import com.nothing.wallpaper.R;
import kotlin.jvm.internal.n;
import p034d3.a;
import p064g3.f;
import p079h8.A;
import p173r2.c;

/* JADX INFO: loaded from: classes.dex */
public class b implements f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final f.a f23884q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final c f23885r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final InterfaceC1163x f23886s;

    public b(f.a navigationController, c viewModel, InterfaceC1163x lifecycleOwner) {
        n.h(navigationController, "navigationController");
        n.h(viewModel, "viewModel");
        n.h(lifecycleOwner, "lifecycleOwner");
        this.f23884q = navigationController;
        this.f23885r = viewModel;
        this.f23886s = lifecycleOwner;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A i(b bVar) {
        bVar.f23884q.g(p153p2.b.f23692v.a());
        return A.f21846a;
    }

    @Override // p064g3.f
    public boolean e(Context context) {
        n.h(context, "context");
        return a.f19546c.a().i(context);
    }

    @Override // p064g3.f
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public KeyguardQuickAffordanceSectionView f(Context context) {
        n.h(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.keyguard_quick_affordance_section_view, (ViewGroup) null);
        n.f(viewInflate, "null cannot be cast to non-null type com.android.customization.picker.quickaffordance.ui.view.KeyguardQuickAffordanceSectionView");
        KeyguardQuickAffordanceSectionView keyguardQuickAffordanceSectionView = (KeyguardQuickAffordanceSectionView) viewInflate;
        p143o2.f.f23416a.b(keyguardQuickAffordanceSectionView, this.f23885r, this.f23886s, new p219v8.a() { // from class: q2.a
            @Override // p219v8.a
            public final Object invoke() {
                return b.i(this.f23883q);
            }
        });
        return keyguardQuickAffordanceSectionView;
    }
}
