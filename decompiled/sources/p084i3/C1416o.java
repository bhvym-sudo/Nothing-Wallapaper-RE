package p084i3;

import F8.InterfaceC0807d0;
import H3.AbstractC0851a;
import android.app.Activity;
import android.app.WallpaperManager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.AbstractActivityC1136v;
import androidx.fragment.app.AbstractComponentCallbacksC1132q;
import androidx.lifecycle.d0;
import com.android.wallpaper.picker.a;
import com.nothing.wallpaper.R;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import p064g3.f;
import p064g3.m;
import p064g3.z;
import p074h3.G;
import p074h3.H;
import p074h3.I;
import p074h3.InterfaceC1364d;
import p074h3.J;
import p219v8.l;
import p234x3.b;

/* JADX INFO: renamed from: i3.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1416o extends a implements f.a {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    protected b f22075B;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private InterfaceC0807d0 f22076v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private NestedScrollView f22078x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private NestedScrollView f22079y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Bundle f22080z;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final List f22077w = new ArrayList();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final G f22074A = I.a().u();

    private boolean D0(Activity activity) {
        return I.a().e(requireContext()).n(activity) && new J().b(requireContext()) && activity.getDisplay().getWidth() <= getResources().getDimensionPixelSize(R.dimen.two_pane_small_width_threshold);
    }

    private m E0() {
        return (m) getActivity();
    }

    private z G0() {
        return (z) getActivity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean J0(f fVar) {
        if (fVar.e(getContext())) {
            return true;
        }
        fVar.a();
        Log.d("CustomizationPickerFragment", "Section is not available: " + fVar);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List K0(Bundle bundle, Boolean bool) {
        return A0(F0(bool.booleanValue() ? InterfaceC1364d.a.LOCK_SCREEN : InterfaceC1364d.a.HOME_SCREEN, bundle));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L0(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13) {
        if (i11 == 0) {
            o0(android.R.color.transparent);
        } else {
            o0(R.color.toolbar_color);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M0(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13) {
        if (i11 == 0) {
            o0(android.R.color.transparent);
        } else {
            o0(R.color.toolbar_color);
        }
    }

    public static C1416o N0(boolean z9) {
        C1416o c1416o = new C1416o();
        Bundle bundle = new Bundle();
        bundle.putBoolean("start_from_lock_screen", z9);
        c1416o.setArguments(bundle);
        return c1416o;
    }

    private void O0(final Bundle bundle) {
        NestedScrollView nestedScrollView = this.f22078x;
        if (nestedScrollView != null) {
            bundle.putInt("SCROLL_POSITION_Y", nestedScrollView.getScrollY());
        }
        this.f22077w.forEach(new Consumer() { // from class: i3.j
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((f) obj).d(bundle);
            }
        });
    }

    private void P0(View view, int i10) {
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.content_frame);
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        LayoutInflater.from(view.getContext()).inflate(i10, viewGroup);
    }

    protected List A0(List list) {
        return (List) list.stream().filter(new Predicate() { // from class: i3.n
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return this.f22047a.J0((f) obj);
            }
        }).collect(Collectors.toList());
    }

    protected int B0() {
        return R.layout.fragment_tabbed_customization_picker;
    }

    public int C0() {
        return R.layout.toolbar_container_layout;
    }

    public List F0(InterfaceC1364d.a aVar, Bundle bundle) {
        H hA = I.a();
        AbstractActivityC1136v abstractActivityC1136vRequireActivity = requireActivity();
        return hA.D(abstractActivityC1136vRequireActivity).a(aVar, getActivity(), getViewLifecycleOwner(), hA.i(), E0(), G0(), this, bundle, hA.k(requireContext()), hA.e(abstractActivityC1136vRequireActivity), this.f22075B, hA.p(requireContext()), WallpaperManager.getInstance(requireContext()), D0(abstractActivityC1136vRequireActivity));
    }

    protected void H0(View view, final Bundle bundle) {
        InterfaceC0807d0 interfaceC0807d0 = this.f22076v;
        if (interfaceC0807d0 != null) {
            interfaceC0807d0.dispose();
        }
        this.f22076v = p214v3.f.d(view, k0(), this.f22075B, this, new l() { // from class: i3.m
            @Override // p219v8.l
            public final Object f(Object obj) {
                return this.f22044q.K0(bundle, (Boolean) obj);
            }
        });
    }

    protected void I0(View view) {
        if (AbstractC0851a.f(getActivity().getIntent())) {
            r0(view, !G2.a.b(getActivity(), true));
        } else {
            r0(view, false);
        }
    }

    public void P(String str) {
        AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132qA = this.f22074A.a(str);
        androidx.fragment.app.J jO0 = getActivity().o0();
        jO0.p().r(R.id.fragment_container, abstractComponentCallbacksC1132qA).i();
        jO0.g0();
    }

    public void g(AbstractComponentCallbacksC1132q abstractComponentCallbacksC1132q) {
        androidx.fragment.app.J jO0 = getActivity().o0();
        jO0.p().r(R.id.fragment_container, abstractComponentCallbacksC1132q).g(null).i();
        jO0.g0();
    }

    @Override // com.android.wallpaper.picker.a
    public CharSequence i0() {
        return getString(R.string.app_name);
    }

    @Override // com.android.wallpaper.picker.a
    protected int j0() {
        return android.R.color.transparent;
    }

    @Override // com.android.wallpaper.picker.a
    protected int k0() {
        return R.id.toolbar;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z9 = false;
        View viewInflate = layoutInflater.inflate(C0(), viewGroup, false);
        I0(viewInflate);
        H hA = I.a();
        P0(viewInflate, B0());
        this.f22075B = (b) new d0(this, b.l(this, bundle, hA.w(requireContext(), requireActivity()), hA.p(requireContext()))).b(b.class);
        Bundle arguments = getArguments();
        b bVar = this.f22075B;
        if (arguments != null && arguments.getBoolean("start_from_lock_screen")) {
            z9 = true;
        }
        bVar.m(z9);
        s0(R.menu.undoable_customization_menu);
        H0(viewInflate, bundle);
        if (this.f22080z != null) {
            this.f22080z = null;
        }
        if (I.a().C().l()) {
            return viewInflate;
        }
        this.f22078x = (NestedScrollView) viewInflate.findViewById(R.id.home_scroll_container);
        this.f22079y = (NestedScrollView) viewInflate.findViewById(R.id.lock_scroll_container);
        this.f22078x.setOnScrollChangeListener(new NestedScrollView.e() { // from class: i3.k
            @Override // androidx.core.widget.NestedScrollView.e
            public final void onScrollChange(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13) {
                this.f22040a.L0(nestedScrollView, i10, i11, i12, i13);
            }
        });
        this.f22079y.setOnScrollChangeListener(new NestedScrollView.e() { // from class: i3.l
            @Override // androidx.core.widget.NestedScrollView.e
            public final void onScrollChange(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13) {
                this.f22042a.M0(nestedScrollView, i10, i11, i12, i13);
            }
        });
        return viewInflate;
    }

    @Override // com.android.wallpaper.picker.a, androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onDestroyView() {
        Bundle bundle = new Bundle();
        this.f22080z = bundle;
        O0(bundle);
        this.f22077w.forEach(new Consumer() { // from class: i3.i
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((f) obj).a();
            }
        });
        this.f22077w.clear();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1132q
    public void onSaveInstanceState(Bundle bundle) {
        O0(bundle);
        super.onSaveInstanceState(bundle);
    }
}
