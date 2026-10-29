package J7;

import I8.A;
import I8.O;
import androidx.lifecycle.Q;
import androidx.lifecycle.a0;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends a0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f3660j = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Q f3661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f3662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f3663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final A f3664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private p258z7.a f3665f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f3666g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final O f3667h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final O f3668i;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public b(Q savedStateHandle) {
        kotlin.jvm.internal.n.h(savedStateHandle, "savedStateHandle");
        this.f3661b = savedStateHandle;
        Float f10 = (Float) savedStateHandle.d("lock_screen_tran_x");
        this.f3662c = f10 != null ? f10.floatValue() : 0.0f;
        Boolean bool = (Boolean) savedStateHandle.d("lock_screen_show");
        this.f3663d = bool != null ? bool.booleanValue() : false;
        this.f3664e = I8.Q.a(null);
        this.f3665f = (p258z7.a) savedStateHandle.d("animation_params");
        Boolean bool2 = (Boolean) savedStateHandle.d("key_start_from_lock");
        this.f3666g = bool2 != null ? bool2.booleanValue() : false;
        this.f3667h = savedStateHandle.e("key_ui_state", n.b.f3872q);
        this.f3668i = savedStateHandle.e("selector_fragment_show", null);
    }

    private final void e(n nVar) {
        this.f3661b.i("key_ui_state", nVar);
    }

    public final void f() {
        e(n.b.f3872q);
    }

    public final p258z7.a g() {
        return this.f3665f;
    }

    public final float h() {
        return this.f3662c;
    }

    public final boolean i() {
        return this.f3663d;
    }

    public final A j() {
        return this.f3664e;
    }

    public final O k() {
        return this.f3668i;
    }

    public final boolean l() {
        return this.f3666g;
    }

    public final O m() {
        return this.f3667h;
    }

    public final void n(String destinationId, boolean z9) {
        n nVar;
        kotlin.jvm.internal.n.h(destinationId, "destinationId");
        y(z9);
        if (kotlin.jvm.internal.n.d(destinationId, "custom_widget")) {
            nVar = n.d.f3874q;
        } else {
            nVar = kotlin.jvm.internal.n.d(destinationId, "custom_short_cut") ? n.c.f3873q : n.b.f3872q;
        }
        e(nVar);
    }

    public final boolean o() {
        return kotlin.jvm.internal.n.d(this.f3667h.getValue(), n.a.f3871q);
    }

    public final boolean p() {
        return kotlin.jvm.internal.n.d(this.f3667h.getValue(), n.c.f3873q);
    }

    public final boolean q() {
        return kotlin.jvm.internal.n.d(this.f3667h.getValue(), n.d.f3874q);
    }

    public final void r() {
        e(n.a.f3871q);
    }

    public final void s() {
        e(n.c.f3873q);
    }

    public final void t() {
        e(n.d.f3874q);
    }

    public final void u(p258z7.a aVar) {
        this.f3661b.i("animation_params", aVar);
        this.f3665f = aVar;
    }

    public final void v(float f10) {
        this.f3661b.i("lock_screen_tran_x", Float.valueOf(f10));
        this.f3662c = f10;
    }

    public final void w(boolean z9) {
        this.f3661b.i("lock_screen_show", Boolean.valueOf(z9));
        this.f3664e.setValue(Boolean.valueOf(z9));
        this.f3663d = z9;
    }

    public final void x(boolean z9) {
        this.f3661b.i("selector_fragment_show", Boolean.valueOf(z9));
    }

    public final void y(boolean z9) {
        this.f3661b.i("key_start_from_lock", Boolean.valueOf(z9));
        this.f3666g = z9;
    }
}
