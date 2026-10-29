package p068g7;

import F8.InterfaceC0807d0;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.g;
import androidx.fragment.app.AbstractComponentCallbacksC1132q;
import androidx.lifecycle.InterfaceC1163x;
import com.nothing.wallpaper.R;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p038d7.c;
import p044e3.AbstractC1342w;
import p064g3.f;
import p074h3.I;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends AbstractComponentCallbacksC1132q {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f21354s = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f21355q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private InterfaceC0807d0 f21356r;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final m a(boolean z9) {
            m mVar = new m();
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_lock_screen", z9);
            mVar.setArguments(bundle);
            return mVar;
        }

        private a() {
        }
    }

    private final p048e7.a e0() {
        InterfaceC1163x interfaceC1163xRequireParentFragment = requireParentFragment();
        n.f(interfaceC1163xRequireParentFragment, "null cannot be cast to non-null type com.nothing.wallpaper.picker.customization.ui.callback.ScreenPreviewCallback");
        return (p048e7.a) interfaceC1163xRequireParentFragment;
    }

    private final void f0() {
        InterfaceC0807d0 interfaceC0807d0B;
        InterfaceC0807d0 interfaceC0807d0 = this.f21356r;
        if (interfaceC0807d0 != null) {
            interfaceC0807d0.dispose();
        }
        View view = getView();
        if (view != null) {
            InterfaceC1163x viewLifecycleOwner = getViewLifecycleOwner();
            n.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            interfaceC0807d0B = c.b(view, viewLifecycleOwner, e0().r(this.f21355q), new p219v8.a() { // from class: g7.l
                @Override // p219v8.a
                public final Object invoke() {
                    return Boolean.valueOf(m.g0(this.f21353q));
                }
            });
        } else {
            interfaceC0807d0B = null;
        }
        this.f21356r = interfaceC0807d0B;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g0(m mVar) {
        boolean zV = mVar.e0().v(mVar.f21355q, true);
        if (!mVar.f21355q || zV || !I.a().C().s()) {
            return zV;
        }
        InterfaceC1163x interfaceC1163xRequireParentFragment = mVar.requireParentFragment();
        f.a aVar = interfaceC1163xRequireParentFragment instanceof f.a ? (f.a) interfaceC1163xRequireParentFragment : null;
        if (aVar != null) {
            aVar.P("lock_screen_preview");
        }
        return true;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        boolean z9 = false;
        if (arguments != null && arguments.getBoolean("is_lock_screen", false)) {
            z9 = true;
        }
        this.f21355q = z9;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        n.h(inflater, "inflater");
        g gVarE = androidx.databinding.f.e(LayoutInflater.from(requireContext()), R.layout.fragment_screen_preview, viewGroup, false);
        n.g(gVarE, "inflate(...)");
        AbstractC1342w abstractC1342w = (AbstractC1342w) gVarE;
        if (!this.f21355q) {
            abstractC1342w.f20157v.setTag(R.id.preview_location, getString(R.string.preview_location_main));
        }
        View viewO = abstractC1342w.o();
        n.g(viewO, "getRoot(...)");
        return viewO;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onViewCreated(View view, Bundle bundle) {
        n.h(view, "view");
        super.onViewCreated(view, bundle);
        f0();
    }
}
