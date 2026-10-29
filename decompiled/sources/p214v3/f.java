package p214v3;

import D8.k;
import F8.AbstractC0816i;
import F8.InterfaceC0807d0;
import F8.InterfaceC0846x0;
import F8.L;
import I8.InterfaceC0881g;
import I8.O;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.Toolbar;
import androidx.core.view.K;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.AbstractC1164y;
import androidx.lifecycle.InterfaceC1163x;
import androidx.lifecycle.N;
import com.nothing.wallpaper.R;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.o;
import p079h8.r;
import p129m8.e;
import p219v8.p;
import p234x3.b;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f28147a = new f();

    static final class a extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f28148q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ InterfaceC1163x f28149r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ ViewGroup f28150s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ViewGroup f28151t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ b f28152u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ NestedScrollView f28153v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ NestedScrollView f28154w;

        /* JADX INFO: renamed from: v3.f$a$a, reason: collision with other inner class name */
        static final class C0694a extends l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f28155q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private /* synthetic */ Object f28156r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ b f28157s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ NestedScrollView f28158t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ NestedScrollView f28159u;

            /* JADX INFO: renamed from: v3.f$a$a$a, reason: collision with other inner class name */
            static final class C0695a extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f28160q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ b f28161r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ NestedScrollView f28162s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ NestedScrollView f28163t;

                /* JADX INFO: renamed from: v3.f$a$a$a$a, reason: collision with other inner class name */
                static final class C0696a implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ NestedScrollView f28164q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    final /* synthetic */ NestedScrollView f28165r;

                    C0696a(NestedScrollView nestedScrollView, NestedScrollView nestedScrollView2) {
                        this.f28164q = nestedScrollView;
                        this.f28165r = nestedScrollView2;
                    }

                    public final Object a(boolean z9, e eVar) {
                        this.f28164q.scrollTo(0, 0);
                        this.f28165r.scrollTo(0, 0);
                        this.f28164q.setVisibility(!z9 ? 4 : 0);
                        this.f28165r.setVisibility(z9 ? 4 : 0);
                        return A.f21846a;
                    }

                    @Override // I8.InterfaceC0881g
                    public /* bridge */ /* synthetic */ Object b(Object obj, e eVar) {
                        return a(((Boolean) obj).booleanValue(), eVar);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0695a(b bVar, NestedScrollView nestedScrollView, NestedScrollView nestedScrollView2, e eVar) {
                    super(2, eVar);
                    this.f28161r = bVar;
                    this.f28162s = nestedScrollView;
                    this.f28163t = nestedScrollView2;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final e create(Object obj, e eVar) {
                    return new C0695a(this.f28161r, this.f28162s, this.f28163t, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, e eVar) {
                    return ((C0695a) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f28160q;
                    if (i10 == 0) {
                        r.b(obj);
                        O oK = this.f28161r.k();
                        C0696a c0696a = new C0696a(this.f28162s, this.f28163t);
                        this.f28160q = 1;
                        if (oK.a(c0696a, this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj);
                    }
                    throw new p079h8.f();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0694a(b bVar, NestedScrollView nestedScrollView, NestedScrollView nestedScrollView2, e eVar) {
                super(2, eVar);
                this.f28157s = bVar;
                this.f28158t = nestedScrollView;
                this.f28159u = nestedScrollView2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final e create(Object obj, e eVar) {
                C0694a c0694a = new C0694a(this.f28157s, this.f28158t, this.f28159u, eVar);
                c0694a.f28156r = obj;
                return c0694a;
            }

            @Override // p219v8.p
            public final Object invoke(L l9, e eVar) {
                return ((C0694a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f28155q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                AbstractC0816i.d((L) this.f28156r, null, null, new C0695a(this.f28157s, this.f28158t, this.f28159u, null), 3, null);
                return A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC1163x interfaceC1163x, ViewGroup viewGroup, ViewGroup viewGroup2, b bVar, NestedScrollView nestedScrollView, NestedScrollView nestedScrollView2, e eVar) {
            super(2, eVar);
            this.f28149r = interfaceC1163x;
            this.f28150s = viewGroup;
            this.f28151t = viewGroup2;
            this.f28152u = bVar;
            this.f28153v = nestedScrollView;
            this.f28154w = nestedScrollView2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final o v(View view) {
            Object tag = view.getTag();
            return new o(view, tag instanceof p064g3.f ? (p064g3.f) tag : null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final o w(View view) {
            Object tag = view.getTag();
            return new o(view, tag instanceof p064g3.f ? (p064g3.f) tag : null);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new a(this.f28149r, this.f28150s, this.f28151t, this.f28152u, this.f28153v, this.f28154w, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, e eVar) {
            return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f28148q;
            if (i10 == 0) {
                r.b(obj);
                InterfaceC1163x interfaceC1163x = this.f28149r;
                AbstractC1157q.b bVar = AbstractC1157q.b.STARTED;
                C0694a c0694a = new C0694a(this.f28152u, this.f28153v, this.f28154w, null);
                this.f28148q = 1;
                if (N.b(interfaceC1163x, bVar, c0694a, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            for (o oVar : k.x(K.b(this.f28150s), new p219v8.l() { // from class: v3.d
                @Override // p219v8.l
                public final Object f(Object obj2) {
                    return f.a.v((View) obj2);
                }
            })) {
                p064g3.f fVar = (p064g3.f) oVar.d();
                if (fVar != null) {
                    fVar.a();
                }
                View view = (View) oVar.c();
                if (view != null) {
                    view.setTag(null);
                }
            }
            this.f28150s.removeAllViews();
            for (o oVar2 : k.x(K.b(this.f28151t), new p219v8.l() { // from class: v3.e
                @Override // p219v8.l
                public final Object f(Object obj2) {
                    return f.a.w((View) obj2);
                }
            })) {
                p064g3.f fVar2 = (p064g3.f) oVar2.d();
                if (fVar2 != null) {
                    fVar2.a();
                }
                View view2 = (View) oVar2.c();
                if (view2 != null) {
                    view2.setTag(null);
                }
            }
            this.f28151t.removeAllViews();
            return A.f21846a;
        }
    }

    private f() {
    }

    public static final InterfaceC0807d0 d(View view, int i10, b viewModel, InterfaceC1163x lifecycleOwner, p219v8.l sectionControllerProvider) {
        n.h(view, "view");
        n.h(viewModel, "viewModel");
        n.h(lifecycleOwner, "lifecycleOwner");
        n.h(sectionControllerProvider, "sectionControllerProvider");
        F3.b bVar = F3.b.f1606a;
        View viewRequireViewById = view.requireViewById(i10);
        n.g(viewRequireViewById, "requireViewById(...)");
        bVar.d((Toolbar) viewRequireViewById, viewModel.h(), lifecycleOwner);
        g.a(view, viewModel, lifecycleOwner);
        View viewRequireViewById2 = view.requireViewById(R.id.lock_scroll_container);
        n.g(viewRequireViewById2, "requireViewById(...)");
        NestedScrollView nestedScrollView = (NestedScrollView) viewRequireViewById2;
        View viewRequireViewById3 = view.requireViewById(R.id.home_scroll_container);
        n.g(viewRequireViewById3, "requireViewById(...)");
        NestedScrollView nestedScrollView2 = (NestedScrollView) viewRequireViewById3;
        View viewRequireViewById4 = view.requireViewById(R.id.lock_section_container);
        n.g(viewRequireViewById4, "requireViewById(...)");
        ViewGroup viewGroup = (ViewGroup) viewRequireViewById4;
        viewGroup.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: v3.a
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                return f.e(view2, windowInsets);
            }
        });
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = 0;
        viewGroup.setLayoutParams(layoutParams2);
        View viewRequireViewById5 = view.requireViewById(R.id.home_section_container);
        n.g(viewRequireViewById5, "requireViewById(...)");
        ViewGroup viewGroup2 = (ViewGroup) viewRequireViewById5;
        viewGroup2.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: v3.b
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                return f.f(view2, windowInsets);
            }
        });
        ViewGroup.LayoutParams layoutParams3 = viewGroup2.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
        layoutParams4.topMargin = 0;
        viewGroup2.setLayoutParams(layoutParams4);
        f fVar = f28147a;
        Context context = view.getContext();
        n.g(context, "getContext(...)");
        fVar.h(context, viewGroup2, false, sectionControllerProvider);
        Context context2 = view.getContext();
        n.g(context2, "getContext(...)");
        fVar.h(context2, viewGroup, true, sectionControllerProvider);
        final InterfaceC0846x0 interfaceC0846x0D = AbstractC0816i.d(AbstractC1164y.a(lifecycleOwner), null, null, new a(lifecycleOwner, viewGroup, viewGroup2, viewModel, nestedScrollView, nestedScrollView2, null), 3, null);
        return new InterfaceC0807d0() { // from class: v3.c
            @Override // F8.InterfaceC0807d0
            public final void dispose() {
                f.g(interfaceC0846x0D);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets e(View v9, WindowInsets windowInsets) {
        n.h(v9, "v");
        n.h(windowInsets, "windowInsets");
        v9.setPadding(v9.getPaddingLeft(), v9.getPaddingTop(), v9.getPaddingRight(), windowInsets.getSystemWindowInsetBottom());
        return windowInsets.consumeSystemWindowInsets();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets f(View v9, WindowInsets windowInsets) {
        n.h(v9, "v");
        n.h(windowInsets, "windowInsets");
        v9.setPadding(v9.getPaddingLeft(), v9.getPaddingTop(), v9.getPaddingRight(), windowInsets.getSystemWindowInsetBottom());
        return windowInsets.consumeSystemWindowInsets();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(InterfaceC0846x0 interfaceC0846x0) {
        InterfaceC0846x0.a.a(interfaceC0846x0, null, 1, null);
    }

    private final void h(Context context, ViewGroup viewGroup, boolean z9, p219v8.l lVar) {
        Iterable iterable = (Iterable) lVar.f(Boolean.valueOf(z9));
        ArrayList<p064g3.f> arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (((p064g3.f) obj).e(context)) {
                arrayList.add(obj);
            }
        }
        for (p064g3.f fVar : arrayList) {
            View viewH = fVar.h(context, new g3.f.b(z9, false, 2, null));
            viewH.setTag(fVar);
            viewGroup.addView(viewH);
        }
    }
}
