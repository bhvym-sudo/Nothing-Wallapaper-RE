package androidx.compose.ui.window;

import U.i;
import android.annotation.SuppressLint;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.t0;
import kotlin.jvm.internal.AbstractC1457h;
import p079h8.A;
import p111l0.o;
import p111l0.q;
import p111l0.s;
import p170r.AbstractC1696o;
import p170r.AbstractC1716y0;
import p170r.I0;
import p170r.InterfaceC1683h0;
import p170r.InterfaceC1690l;
import p170r.b1;
import p219v8.l;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
public final class PopupLayout extends AbstractComposeView implements t0 {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final b f12055J = new b(null);

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final int f12056K = 8;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static final l f12057L = a.f12069r;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private s f12058A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final InterfaceC1683h0 f12059B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final InterfaceC1683h0 f12060C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private o f12061D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final b1 f12062E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final A.s f12063F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private Object f12064G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final InterfaceC1683h0 f12065H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f12066I;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f12067y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final WindowManager.LayoutParams f12068z;

    static final class a extends kotlin.jvm.internal.o implements l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a f12069r = new a();

        a() {
            super(1);
        }

        public final void a(PopupLayout popupLayout) {
            if (popupLayout.isAttachedToWindow()) {
                popupLayout.l();
            }
        }

        @Override // p219v8.l
        public /* bridge */ /* synthetic */ Object f(Object obj) {
            a((PopupLayout) obj);
            return A.f21846a;
        }
    }

    private static final class b {
        public /* synthetic */ b(AbstractC1457h abstractC1457h) {
            this();
        }

        private b() {
        }
    }

    static final class c extends kotlin.jvm.internal.o implements p {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f12071s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i10) {
            super(2);
            this.f12071s = i10;
        }

        public final void a(InterfaceC1690l interfaceC1690l, int i10) {
            PopupLayout.this.a(interfaceC1690l, AbstractC1716y0.a(this.f12071s | 1));
        }

        @Override // p219v8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC1690l) obj, ((Number) obj2).intValue());
            return A.f21846a;
        }
    }

    private final p getContent() {
        return (p) this.f12065H.getValue();
    }

    private final int getDisplayHeight() {
        return Math.round(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return Math.round(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    private final i getParentLayoutCoordinates() {
        return (i) this.f12060C.getValue();
    }

    private final void j() {
        throw null;
    }

    private final void k() {
        androidx.compose.ui.window.b.e(this, this.f12064G);
        this.f12064G = null;
    }

    private final void setContent(p pVar) {
        this.f12065H.setValue(pVar);
    }

    private final void setParentLayoutCoordinates(i iVar) {
        this.f12060C.setValue(iVar);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void a(InterfaceC1690l interfaceC1690l, int i10) {
        int i11;
        InterfaceC1690l interfaceC1690lG = interfaceC1690l.g(-857613600);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC1690lG.f(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC1690lG.h()) {
            interfaceC1690lG.m();
        } else {
            if (AbstractC1696o.G()) {
                AbstractC1696o.O(-857613600, i11, -1, "androidx.compose.ui.window.PopupLayout.Content (AndroidPopup.android.kt:572)");
            }
            getContent().invoke(interfaceC1690lG, 0);
            if (AbstractC1696o.G()) {
                AbstractC1696o.N();
            }
        }
        I0 i0K = interfaceC1690lG.k();
        if (i0K != null) {
            i0K.a(new c(i10));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4) {
            return super.dispatchKeyEvent(keyEvent);
        }
        throw null;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void f(boolean z9, int i10, int i11, int i12, int i13) {
        super.f(z9, i10, i11, i12, i13);
        throw null;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void g(int i10, int i11) {
        throw null;
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f12062E.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.f12068z;
    }

    public final s getParentLayoutDirection() {
        return this.f12058A;
    }

    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final q m6getPopupContentSizebOM6tXw() {
        return (q) this.f12059B.getValue();
    }

    public final androidx.compose.ui.window.c getPositionProvider() {
        return null;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f12066I;
    }

    @Override // androidx.compose.ui.platform.t0
    public AbstractComposeView getSubCompositionView() {
        return this;
    }

    public final String getTestTag() {
        return this.f12067y;
    }

    @Override // androidx.compose.ui.platform.t0
    public /* bridge */ /* synthetic */ View getViewRoot() {
        return super.getViewRoot();
    }

    public final void l() {
        if (this.f12061D == null) {
            return;
        }
        m6getPopupContentSizebOM6tXw();
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12063F.s();
        j();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f12063F.t();
        this.f12063F.j();
        k();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        throw null;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
    }

    public final void setParentLayoutDirection(s sVar) {
        this.f12058A = sVar;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m7setPopupContentSizefhxjrPA(q qVar) {
        this.f12059B.setValue(qVar);
    }

    public final void setPositionProvider(androidx.compose.ui.window.c cVar) {
    }

    public final void setTestTag(String str) {
        this.f12067y = str;
    }
}
