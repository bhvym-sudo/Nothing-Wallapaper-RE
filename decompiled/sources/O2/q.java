package O2;

import android.view.View;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public final class q extends K2.e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f5795e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final K2.c f5796f = new K2.c(K2.a.INFO);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final K2.c f5797g = new K2.c(K2.a.DEBUG);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final q f5798h = new q(null, new K2.c(K2.a.ERROR), "CLOCK_INIT");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f5799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f5800d;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final String a(String str) {
            if (str != null) {
                return E8.i.I(str, "\n", "\\n", false, 4, null);
            }
            return null;
        }

        public final String b(int i10) {
            String strValueOf;
            int size = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            if (mode == Integer.MIN_VALUE) {
                strValueOf = "AT MOST";
            } else if (mode != 0) {
                strValueOf = mode != 1073741824 ? String.valueOf(mode) : "EXACTLY";
            } else {
                strValueOf = "UNSPECIFIED";
            }
            return "(" + size + ", " + strValueOf + ")";
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(View view, K2.f buffer, String tag) {
        super(buffer, tag);
        kotlin.jvm.internal.n.h(buffer, "buffer");
        kotlin.jvm.internal.n.h(tag, "tag");
        this.f5799c = view;
        this.f5800d = 1000.0f;
    }

    private final boolean p() {
        View view = this.f5799c;
        return ((view != null ? view.mPrivateFlags : 0) & 32) > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String r(K2.b d10) {
        kotlin.jvm.internal.n.h(d10, "$this$d");
        return "onDraw(" + f5795e.a(d10.o()) + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String t(K2.b d10) {
        kotlin.jvm.internal.n.h(d10, "$this$d");
        a aVar = f5795e;
        return "onMeasure(" + aVar.b(d10.j()) + ", " + aVar.b(d10.l()) + ")";
    }

    public final void o() {
        View view;
        if (p() && (view = this.f5799c) != null && view.getVisibility() == 0) {
            K2.e.c(this, "invalidate()", null, 2, null);
        }
    }

    public final void q(String str) {
        p219v8.l lVar = new p219v8.l() { // from class: O2.p
            @Override // p219v8.l
            public final Object f(Object obj) {
                return q.r((K2.b) obj);
            }
        };
        K2.b bVarA = e().a(f(), K2.a.DEBUG, lVar, null);
        if (str == null) {
            str = "";
        }
        bVarA.k(str);
        e().b(bVarA);
    }

    public final void s(int i10, int i11) {
        p219v8.l lVar = new p219v8.l() { // from class: O2.o
            @Override // p219v8.l
            public final Object f(Object obj) {
                return q.t((K2.b) obj);
            }
        };
        K2.b bVarA = e().a(f(), K2.a.DEBUG, lVar, null);
        bVarA.f(i10);
        bVarA.a(i11);
        e().b(bVarA);
    }
}
