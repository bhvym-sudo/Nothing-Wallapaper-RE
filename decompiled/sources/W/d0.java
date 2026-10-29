package W;

import androidx.compose.ui.platform.InterfaceC1049f;
import androidx.compose.ui.platform.w0;

/* JADX INFO: loaded from: classes.dex */
public interface d0 extends Q.B {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f8569h = a.f8570a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f8570a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static boolean f8571b;

        private a() {
        }

        public final boolean a() {
            return f8571b;
        }
    }

    public interface b {
        void a();
    }

    static /* synthetic */ void d(d0 d0Var, B b10, boolean z9, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestMeasure");
        }
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        d0Var.e(b10, z9, z10, z11);
    }

    static /* synthetic */ c0 f(d0 d0Var, p219v8.p pVar, p219v8.a aVar, L.c cVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLayer");
        }
        if ((i10 & 4) != 0) {
            cVar = null;
        }
        return d0Var.u(pVar, aVar, cVar);
    }

    static /* synthetic */ void l(d0 d0Var, B b10, boolean z9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forceMeasureTheSubtree");
        }
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        d0Var.o(b10, z9);
    }

    static /* synthetic */ void r(d0 d0Var, boolean z9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
        }
        if ((i10 & 1) != 0) {
            z9 = true;
        }
        d0Var.a(z9);
    }

    static /* synthetic */ void v(d0 d0Var, B b10, boolean z9, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestRelayout");
        }
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        d0Var.k(b10, z9, z10);
    }

    void a(boolean z9);

    long c(long j9);

    void e(B b10, boolean z9, boolean z10, boolean z11);

    InterfaceC1049f getAccessibilityManager();

    D.c getAutofill();

    D.g getAutofillTree();

    androidx.compose.ui.platform.K getClipboardManager();

    p111l0.d getDensity();

    F.b getDragAndDropManager();

    G.g getFocusOwner();

    f0.g.a getFontFamilyResolver();

    p051f0.f getFontLoader();

    I.y getGraphicsContext();

    M.a getHapticFeedBack();

    N.b getInputModeManager();

    p111l0.s getLayoutDirection();

    U.t.a getPlacementScope();

    Q.q getPointerIconService();

    B getRoot();

    D getSharedDrawScope();

    boolean getShowLayoutBounds();

    f0 getSnapshotObserver();

    androidx.compose.ui.platform.l0 getSoftwareKeyboardController();

    p061g0.A getTextInputService();

    androidx.compose.ui.platform.m0 getTextToolbar();

    androidx.compose.ui.platform.q0 getViewConfiguration();

    w0 getWindowInfo();

    void h(B b10);

    void i(B b10);

    void k(B b10, boolean z9, boolean z10);

    void m(B b10);

    void o(B b10, boolean z9);

    void p();

    void q();

    void s(B b10);

    void setShowLayoutBounds(boolean z9);

    c0 u(p219v8.p pVar, p219v8.a aVar, L.c cVar);
}
