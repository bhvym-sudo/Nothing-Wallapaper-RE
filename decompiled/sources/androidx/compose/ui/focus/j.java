package androidx.compose.ui.focus;

import W.AbstractC0967i;
import W.W;
import androidx.constraintlayout.core.widgets.Optimizer;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f11426b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final j f11427c = new j();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final j f11428d = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p190t.b f11429a = new p190t.b(new G.k[16], 0);

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final j a() {
            return j.f11428d;
        }

        public final j b() {
            return j.f11427c;
        }

        private a() {
        }
    }

    static final class b extends kotlin.jvm.internal.o implements p219v8.l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final b f11430r = new b();

        b() {
            super(1);
        }

        @Override // p219v8.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean f(k kVar) {
            return Boolean.valueOf(l.j(kVar));
        }
    }

    public final boolean c(p219v8.l lVar) {
        a aVar = f11426b;
        if (this == aVar.b()) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        if (this == aVar.a()) {
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        if (!this.f11429a.s()) {
            throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
        }
        p190t.b bVar = this.f11429a;
        int iP = bVar.p();
        if (iP <= 0) {
            return false;
        }
        Object[] objArrO = bVar.o();
        int i10 = 0;
        boolean z9 = false;
        do {
            G.k kVar = (G.k) objArrO[i10];
            int iA = W.a(Optimizer.OPTIMIZATION_GROUPING);
            if (!kVar.z().Q()) {
                throw new IllegalStateException("visitChildren called on an unattached node");
            }
            p190t.b bVar2 = new p190t.b(new C.c.AbstractC0022c[16], 0);
            C.c.AbstractC0022c abstractC0022cI = kVar.z().I();
            if (abstractC0022cI == null) {
                AbstractC0967i.c(bVar2, kVar.z());
            } else {
                bVar2.b(abstractC0022cI);
            }
            while (bVar2.s()) {
                C.c.AbstractC0022c abstractC0022cF = (C.c.AbstractC0022c) bVar2.w(bVar2.p() - 1);
                if ((abstractC0022cF.H() & iA) == 0) {
                    AbstractC0967i.c(bVar2, abstractC0022cF);
                } else {
                    while (abstractC0022cF != null) {
                        if ((abstractC0022cF.L() & iA) != 0) {
                            while (abstractC0022cF != null) {
                                if (abstractC0022cF instanceof k) {
                                    k kVar2 = (k) abstractC0022cF;
                                    if (kVar2.m0().i() ? ((Boolean) lVar.f(kVar2)).booleanValue() : p.k(kVar2, androidx.compose.ui.focus.b.f11397b.b(), lVar)) {
                                        z9 = true;
                                        break;
                                    }
                                } else {
                                    abstractC0022cF.L();
                                }
                                abstractC0022cF = AbstractC0967i.f(null);
                            }
                            break;
                        }
                        abstractC0022cF = abstractC0022cF.I();
                    }
                }
            }
            i10++;
        } while (i10 < iP);
        return z9;
    }

    public final boolean d() {
        return c(b.f11430r);
    }
}
