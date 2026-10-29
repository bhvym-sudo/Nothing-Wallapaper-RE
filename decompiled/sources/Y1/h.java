package Y1;

import F8.AbstractC0816i;
import F8.L;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import I8.O;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.AbstractC1164y;
import androidx.lifecycle.InterfaceC1163x;
import androidx.lifecycle.N;
import com.android.customization.picker.color.ui.view.ColorOptionIconView;
import com.nothing.wallpaper.R;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.r;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f9285a = new h();

    static final class a extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f9286q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ InterfaceC1163x f9287r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ p013b2.c f9288s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ LinearLayout f9289t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ boolean f9290u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ p219v8.l f9291v;

        /* JADX INFO: renamed from: Y1.h$a$a, reason: collision with other inner class name */
        static final class C0335a extends l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f9292q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private /* synthetic */ Object f9293r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ p013b2.c f9294s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ LinearLayout f9295t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ InterfaceC1163x f9296u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ boolean f9297v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            final /* synthetic */ p219v8.l f9298w;

            /* JADX INFO: renamed from: Y1.h$a$a$a, reason: collision with other inner class name */
            static final class C0336a extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f9299q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ p013b2.c f9300r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ LinearLayout f9301s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ InterfaceC1163x f9302t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                final /* synthetic */ boolean f9303u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                final /* synthetic */ p219v8.l f9304v;

                /* JADX INFO: renamed from: Y1.h$a$a$a$a, reason: collision with other inner class name */
                static final class C0337a implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ LinearLayout f9305q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    final /* synthetic */ InterfaceC1163x f9306r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    final /* synthetic */ boolean f9307s;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    final /* synthetic */ p219v8.l f9308t;

                    C0337a(LinearLayout linearLayout, InterfaceC1163x interfaceC1163x, boolean z9, p219v8.l lVar) {
                        this.f9305q = linearLayout;
                        this.f9306r = interfaceC1163x;
                        this.f9307s = z9;
                        this.f9308t = lVar;
                    }

                    @Override // I8.InterfaceC0881g
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object b(List list, p129m8.e eVar) {
                        h.f9285a.e(list, this.f9305q, this.f9306r, !this.f9307s, this.f9308t);
                        return A.f21846a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0336a(p013b2.c cVar, LinearLayout linearLayout, InterfaceC1163x interfaceC1163x, boolean z9, p219v8.l lVar, p129m8.e eVar) {
                    super(2, eVar);
                    this.f9300r = cVar;
                    this.f9301s = linearLayout;
                    this.f9302t = interfaceC1163x;
                    this.f9303u = z9;
                    this.f9304v = lVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new C0336a(this.f9300r, this.f9301s, this.f9302t, this.f9303u, this.f9304v, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((C0336a) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f9299q;
                    if (i10 == 0) {
                        r.b(obj);
                        InterfaceC0880f interfaceC0880fQ = this.f9300r.q();
                        C0337a c0337a = new C0337a(this.f9301s, this.f9302t, this.f9303u, this.f9304v);
                        this.f9299q = 1;
                        if (interfaceC0880fQ.a(c0337a, this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj);
                    }
                    return A.f21846a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0335a(p013b2.c cVar, LinearLayout linearLayout, InterfaceC1163x interfaceC1163x, boolean z9, p219v8.l lVar, p129m8.e eVar) {
                super(2, eVar);
                this.f9294s = cVar;
                this.f9295t = linearLayout;
                this.f9296u = interfaceC1163x;
                this.f9297v = z9;
                this.f9298w = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                C0335a c0335a = new C0335a(this.f9294s, this.f9295t, this.f9296u, this.f9297v, this.f9298w, eVar);
                c0335a.f9293r = obj;
                return c0335a;
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((C0335a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f9292q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                AbstractC0816i.d((L) this.f9293r, null, null, new C0336a(this.f9294s, this.f9295t, this.f9296u, this.f9297v, this.f9298w, null), 3, null);
                return A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC1163x interfaceC1163x, p013b2.c cVar, LinearLayout linearLayout, boolean z9, p219v8.l lVar, p129m8.e eVar) {
            super(2, eVar);
            this.f9287r = interfaceC1163x;
            this.f9288s = cVar;
            this.f9289t = linearLayout;
            this.f9290u = z9;
            this.f9291v = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return new a(this.f9287r, this.f9288s, this.f9289t, this.f9290u, this.f9291v, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f9286q;
            if (i10 == 0) {
                r.b(obj);
                InterfaceC1163x interfaceC1163x = this.f9287r;
                AbstractC1157q.b bVar = AbstractC1157q.b.STARTED;
                C0335a c0335a = new C0335a(this.f9288s, this.f9289t, interfaceC1163x, this.f9290u, this.f9291v, null);
                this.f9286q = 1;
                if (N.b(interfaceC1163x, bVar, c0335a, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return A.f21846a;
        }
    }

    static final class b extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f9309q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ InterfaceC1163x f9310r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ B3.a f9311s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ImageView f9312t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ View f9313u;

        static final class a extends l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f9314q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private /* synthetic */ Object f9315r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ B3.a f9316s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ ImageView f9317t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ View f9318u;

            /* JADX INFO: renamed from: Y1.h$b$a$a, reason: collision with other inner class name */
            static final class C0338a extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f9319q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ B3.a f9320r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ ImageView f9321s;

                /* JADX INFO: renamed from: Y1.h$b$a$a$a, reason: collision with other inner class name */
                static final class C0339a implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ ImageView f9322q;

                    C0339a(ImageView imageView) {
                        this.f9322q = imageView;
                    }

                    public final Object a(boolean z9, p129m8.e eVar) {
                        this.f9322q.setVisibility(z9 ? 0 : 8);
                        return A.f21846a;
                    }

                    @Override // I8.InterfaceC0881g
                    public /* bridge */ /* synthetic */ Object b(Object obj, p129m8.e eVar) {
                        return a(((Boolean) obj).booleanValue(), eVar);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0338a(B3.a aVar, ImageView imageView, p129m8.e eVar) {
                    super(2, eVar);
                    this.f9320r = aVar;
                    this.f9321s = imageView;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new C0338a(this.f9320r, this.f9321s, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((C0338a) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f9319q;
                    if (i10 == 0) {
                        r.b(obj);
                        O oG = this.f9320r.g();
                        C0339a c0339a = new C0339a(this.f9321s);
                        this.f9319q = 1;
                        if (oG.a(c0339a, this) == objE) {
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

            /* JADX INFO: renamed from: Y1.h$b$a$b, reason: collision with other inner class name */
            static final class C0340b extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f9323q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ B3.a f9324r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ View f9325s;

                /* JADX INFO: renamed from: Y1.h$b$a$b$a, reason: collision with other inner class name */
                static final class C0341a implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ View f9326q;

                    C0341a(View view) {
                        this.f9326q = view;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void e(p219v8.a aVar, View view) {
                        aVar.invoke();
                    }

                    @Override // I8.InterfaceC0881g
                    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                    public final Object b(final p219v8.a aVar, p129m8.e eVar) {
                        this.f9326q.setOnClickListener(aVar != null ? new View.OnClickListener() { // from class: Y1.i
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                h.b.a.C0340b.C0341a.e(aVar, view);
                            }
                        } : null);
                        return A.f21846a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0340b(B3.a aVar, View view, p129m8.e eVar) {
                    super(2, eVar);
                    this.f9324r = aVar;
                    this.f9325s = view;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new C0340b(this.f9324r, this.f9325s, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((C0340b) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f9323q;
                    if (i10 == 0) {
                        r.b(obj);
                        InterfaceC0880f interfaceC0880fB = this.f9324r.b();
                        C0341a c0341a = new C0341a(this.f9325s);
                        this.f9323q = 1;
                        if (interfaceC0880fB.a(c0341a, this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj);
                    }
                    return A.f21846a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(B3.a aVar, ImageView imageView, View view, p129m8.e eVar) {
                super(2, eVar);
                this.f9316s = aVar;
                this.f9317t = imageView;
                this.f9318u = view;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                a aVar = new a(this.f9316s, this.f9317t, this.f9318u, eVar);
                aVar.f9315r = obj;
                return aVar;
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f9314q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                L l9 = (L) this.f9315r;
                AbstractC0816i.d(l9, null, null, new C0338a(this.f9316s, this.f9317t, null), 3, null);
                AbstractC0816i.d(l9, null, null, new C0340b(this.f9316s, this.f9318u, null), 3, null);
                return A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC1163x interfaceC1163x, B3.a aVar, ImageView imageView, View view, p129m8.e eVar) {
            super(2, eVar);
            this.f9310r = interfaceC1163x;
            this.f9311s = aVar;
            this.f9312t = imageView;
            this.f9313u = view;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return new b(this.f9310r, this.f9311s, this.f9312t, this.f9313u, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((b) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f9309q;
            if (i10 == 0) {
                r.b(obj);
                InterfaceC1163x interfaceC1163x = this.f9310r;
                AbstractC1157q.b bVar = AbstractC1157q.b.STARTED;
                a aVar = new a(this.f9311s, this.f9312t, this.f9313u, null);
                this.f9309q = 1;
                if (N.b(interfaceC1163x, bVar, aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return A.f21846a;
        }
    }

    private h() {
    }

    public static final void c(View view, p013b2.c viewModel, InterfaceC1163x lifecycleOwner, final p219v8.l navigationOnClick, boolean z9) {
        n.h(view, "view");
        n.h(viewModel, "viewModel");
        n.h(lifecycleOwner, "lifecycleOwner");
        n.h(navigationOnClick, "navigationOnClick");
        View viewRequireViewById = view.requireViewById(R.id.color_section_option_container);
        n.g(viewRequireViewById, "requireViewById(...)");
        LinearLayout linearLayout = (LinearLayout) viewRequireViewById;
        View viewRequireViewById2 = view.requireViewById(R.id.more_colors);
        n.g(viewRequireViewById2, "requireViewById(...)");
        if (z9) {
            viewRequireViewById2.setVisibility(0);
            viewRequireViewById2.setOnClickListener(new View.OnClickListener() { // from class: Y1.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    h.d(navigationOnClick, view2);
                }
            });
        } else {
            viewRequireViewById2.setVisibility(8);
        }
        AbstractC0816i.d(AbstractC1164y.a(lifecycleOwner), null, null, new a(lifecycleOwner, viewModel, linearLayout, z9, navigationOnClick, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(p219v8.l lVar, View view) {
        lVar.f(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(p219v8.l lVar, View view) {
        lVar.f(view);
    }

    public final void e(List options, LinearLayout view, InterfaceC1163x interfaceC1163x, boolean z9, final p219v8.l overflowOnClick) {
        n.h(options, "options");
        n.h(view, "view");
        InterfaceC1163x lifecycleOwner = interfaceC1163x;
        n.h(lifecycleOwner, "lifecycleOwner");
        n.h(overflowOnClick, "overflowOnClick");
        view.removeAllViews();
        int iMin = z9 ? Math.min(((int) view.getWeightSum()) - 1, options.size()) : Math.min((int) view.getWeightSum(), options.size());
        if (iMin < 0) {
            iMin = 0;
        }
        for (B3.a aVar : options.subList(0, iMin)) {
            boolean z10 = (view.getResources().getConfiguration().uiMode & 48) == 32;
            View viewInflate = LayoutInflater.from(view.getContext()).inflate(R.layout.color_option_no_background, (ViewGroup) view, false);
            if (((p013b2.a) aVar.d()) != null) {
                Y1.a aVar2 = Y1.a.f9231a;
                View viewRequireViewById = viewInflate.requireViewById(R.id.option_tile);
                n.g(viewRequireViewById, "requireViewById(...)");
                aVar2.a((ColorOptionIconView) viewRequireViewById, (p013b2.a) aVar.d(), z10);
                p134n3.a aVar3 = p134n3.a.f23259a;
                View viewRequireViewById2 = viewInflate.requireViewById(R.id.option_tile);
                n.g(viewRequireViewById2, "requireViewById(...)");
                aVar3.a(viewRequireViewById2, aVar.e());
            }
            View viewRequireViewById3 = viewInflate.requireViewById(R.id.option_selected);
            n.g(viewRequireViewById3, "requireViewById(...)");
            AbstractC0816i.d(AbstractC1164y.a(lifecycleOwner), null, null, new b(lifecycleOwner, aVar, (ImageView) viewRequireViewById3, viewInflate, null), 3, null);
            view.addView(viewInflate);
            lifecycleOwner = interfaceC1163x;
        }
        if (z9) {
            View viewInflate2 = LayoutInflater.from(view.getContext()).inflate(R.layout.color_option_overflow_no_background, (ViewGroup) view, false);
            viewInflate2.setOnClickListener(new View.OnClickListener() { // from class: Y1.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    h.f(overflowOnClick, view2);
                }
            });
            view.addView(viewInflate2);
        }
    }
}
