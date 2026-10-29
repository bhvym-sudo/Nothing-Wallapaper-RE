package androidx.compose.ui.platform;

import p170r.AbstractC1696o;
import p170r.AbstractC1716y0;
import p170r.I0;
import p170r.InterfaceC1683h0;
import p170r.InterfaceC1690l;

/* JADX INFO: loaded from: classes.dex */
public final class ComposeView extends AbstractComposeView {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final InterfaceC1683h0 f11681y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f11682z;

    static final class a extends kotlin.jvm.internal.o implements p219v8.p {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f11684s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10) {
            super(2);
            this.f11684s = i10;
        }

        public final void a(InterfaceC1690l interfaceC1690l, int i10) {
            ComposeView.this.a(interfaceC1690l, AbstractC1716y0.a(this.f11684s | 1));
        }

        @Override // p219v8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC1690l) obj, ((Number) obj2).intValue());
            return p079h8.A.f21846a;
        }
    }

    protected static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void a(InterfaceC1690l interfaceC1690l, int i10) {
        int i11;
        InterfaceC1690l interfaceC1690lG = interfaceC1690l.g(420213850);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC1690lG.f(this) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC1690lG.h()) {
            interfaceC1690lG.m();
        } else {
            if (AbstractC1696o.G()) {
                AbstractC1696o.O(420213850, i11, -1, "androidx.compose.ui.platform.ComposeView.Content (ComposeView.android.kt:439)");
            }
            p219v8.p pVar = (p219v8.p) this.f11681y.getValue();
            if (pVar == null) {
                interfaceC1690lG.t(358373017);
            } else {
                interfaceC1690lG.t(150107752);
                pVar.invoke(interfaceC1690lG, 0);
            }
            interfaceC1690lG.p();
            if (AbstractC1696o.G()) {
                AbstractC1696o.N();
            }
        }
        I0 i0K = interfaceC1690lG.k();
        if (i0K != null) {
            i0K.a(new a(i10));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return ComposeView.class.getName();
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f11682z;
    }

    public final void setContent(p219v8.p pVar) {
        this.f11682z = true;
        this.f11681y.setValue(pVar);
        if (isAttachedToWindow()) {
            d();
        }
    }
}
