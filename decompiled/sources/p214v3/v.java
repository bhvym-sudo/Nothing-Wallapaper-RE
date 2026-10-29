package p214v3;

import B8.h;
import F8.AbstractC0816i;
import F8.L;
import I8.InterfaceC0881g;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.AbstractC1164y;
import androidx.lifecycle.InterfaceC1163x;
import androidx.lifecycle.N;
import com.nothing.wallpaper.R;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.o;
import p079h8.r;
import p129m8.e;
import p219v8.p;
import p234x3.g;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f28462a = new v();

    public static final class a implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1163x f28463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f28464b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f28465c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f28466d;

        public a(InterfaceC1163x interfaceC1163x, ViewGroup viewGroup, g gVar, boolean z9) {
            this.f28463a = interfaceC1163x;
            this.f28464b = viewGroup;
            this.f28465c = gVar;
            this.f28466d = z9;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            view.removeOnLayoutChangeListener(this);
            AbstractC0816i.d(AbstractC1164y.a(this.f28463a), null, null, new b(this.f28463a, this.f28464b, this.f28465c, this.f28466d, null), 3, null);
        }
    }

    static final class b extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f28467q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ InterfaceC1163x f28468r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ ViewGroup f28469s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ g f28470t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ boolean f28471u;

        static final class a extends l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f28472q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private /* synthetic */ Object f28473r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ ViewGroup f28474s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ g f28475t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ InterfaceC1163x f28476u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ boolean f28477v;

            /* JADX INFO: renamed from: v3.v$b$a$a, reason: collision with other inner class name */
            static final class C0717a extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f28478q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ ViewGroup f28479r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ g f28480s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ InterfaceC1163x f28481t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                final /* synthetic */ boolean f28482u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0717a(ViewGroup viewGroup, g gVar, InterfaceC1163x interfaceC1163x, boolean z9, e eVar) {
                    super(2, eVar);
                    this.f28479r = viewGroup;
                    this.f28480s = gVar;
                    this.f28481t = interfaceC1163x;
                    this.f28482u = z9;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final e create(Object obj, e eVar) {
                    return new C0717a(this.f28479r, this.f28480s, this.f28481t, this.f28482u, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, e eVar) {
                    return ((C0717a) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f28478q;
                    if (i10 == 0) {
                        r.b(obj);
                        v vVar = v.f28462a;
                        ViewGroup viewGroup = this.f28479r;
                        g gVar = this.f28480s;
                        InterfaceC1163x interfaceC1163x = this.f28481t;
                        boolean z9 = this.f28482u;
                        this.f28478q = 1;
                        if (vVar.g(viewGroup, gVar, interfaceC1163x, z9, this) == objE) {
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
            a(ViewGroup viewGroup, g gVar, InterfaceC1163x interfaceC1163x, boolean z9, e eVar) {
                super(2, eVar);
                this.f28474s = viewGroup;
                this.f28475t = gVar;
                this.f28476u = interfaceC1163x;
                this.f28477v = z9;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final e create(Object obj, e eVar) {
                a aVar = new a(this.f28474s, this.f28475t, this.f28476u, this.f28477v, eVar);
                aVar.f28473r = obj;
                return aVar;
            }

            @Override // p219v8.p
            public final Object invoke(L l9, e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f28472q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                AbstractC0816i.d((L) this.f28473r, null, null, new C0717a(this.f28474s, this.f28475t, this.f28476u, this.f28477v, null), 3, null);
                return A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC1163x interfaceC1163x, ViewGroup viewGroup, g gVar, boolean z9, e eVar) {
            super(2, eVar);
            this.f28468r = interfaceC1163x;
            this.f28469s = viewGroup;
            this.f28470t = gVar;
            this.f28471u = z9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new b(this.f28468r, this.f28469s, this.f28470t, this.f28471u, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, e eVar) {
            return ((b) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f28467q;
            if (i10 == 0) {
                r.b(obj);
                InterfaceC1163x interfaceC1163x = this.f28468r;
                AbstractC1157q.b bVar = AbstractC1157q.b.STARTED;
                a aVar = new a(this.f28469s, this.f28470t, interfaceC1163x, this.f28471u, null);
                this.f28467q = 1;
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

    static final class c implements InterfaceC0881g {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ ViewGroup f28483q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ InterfaceC1163x f28484r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f28485s;

        c(ViewGroup viewGroup, InterfaceC1163x interfaceC1163x, boolean z9) {
            this.f28483q = viewGroup;
            this.f28484r = interfaceC1163x;
            this.f28485s = z9;
        }

        @Override // I8.InterfaceC0881g
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object b(List list, e eVar) {
            this.f28483q.removeAllViews();
            o oVarH = v.f28462a.h(this.f28483q, list.size());
            int iIntValue = ((Number) oVarH.a()).intValue();
            int iIntValue2 = ((Number) oVarH.b()).intValue();
            ViewGroup viewGroup = this.f28483q;
            InterfaceC1163x interfaceC1163x = this.f28484r;
            boolean z9 = this.f28485s;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                p234x3.e eVar2 = (p234x3.e) it.next();
                View viewI = v.f28462a.i(viewGroup);
                viewGroup.addView(viewI);
                t.f28407a.h(viewI, eVar2, interfaceC1163x, iIntValue2, iIntValue, z9);
            }
            return A.f21846a;
        }
    }

    private v() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(p219v8.a aVar, View view) {
        aVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g(ViewGroup viewGroup, g gVar, InterfaceC1163x interfaceC1163x, boolean z9, e eVar) {
        Object objA = gVar.i().a(new c(viewGroup, interfaceC1163x, z9), eVar);
        return objA == p139n8.b.e() ? objA : A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o h(View view, int i10) {
        int height = (view.getHeight() - view.getPaddingTop()) - view.getPaddingBottom();
        int i11 = i10 - 1;
        return new o(Integer.valueOf(height), Integer.valueOf(i11 != 0 ? h.i(((((view.getWidth() - view.getPaddingStart()) - view.getPaddingEnd()) - height) - (j(view, R.dimen.spacing_8dp) * i11)) / i11, j(view, R.dimen.wallpaper_quick_switch_max_option_width)) : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View i(ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wallpaper_quick_switch_option, viewGroup, false);
        n.g(viewInflate, "inflate(...)");
        return viewInflate;
    }

    private final int j(View view, int i10) {
        return view.getContext().getResources().getDimensionPixelSize(i10);
    }

    public final void e(View view, g viewModel, InterfaceC1163x lifecycleOwner, boolean z9, final p219v8.a onNavigateToFullWallpaperSelector) {
        n.h(view, "view");
        n.h(viewModel, "viewModel");
        n.h(lifecycleOwner, "lifecycleOwner");
        n.h(onNavigateToFullWallpaperSelector, "onNavigateToFullWallpaperSelector");
        View viewRequireViewById = view.requireViewById(R.id.more_wallpapers);
        n.g(viewRequireViewById, "requireViewById(...)");
        TextView textView = (TextView) viewRequireViewById;
        textView.setOnClickListener(new View.OnClickListener() { // from class: v3.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                v.f(onNavigateToFullWallpaperSelector, view2);
            }
        });
        p154p3.a.f23694a.a(textView, viewModel.g());
        View viewRequireViewById2 = view.requireViewById(R.id.options);
        n.g(viewRequireViewById2, "requireViewById(...)");
        ViewGroup viewGroup = (ViewGroup) viewRequireViewById2;
        if (!viewModel.h()) {
            viewGroup.setVisibility(8);
            return;
        }
        viewGroup.setVisibility(0);
        if (!viewGroup.isLaidOut() || viewGroup.isLayoutRequested()) {
            viewGroup.addOnLayoutChangeListener(new a(lifecycleOwner, viewGroup, viewModel, z9));
        } else {
            AbstractC0816i.d(AbstractC1164y.a(lifecycleOwner), null, null, new b(lifecycleOwner, viewGroup, viewModel, z9, null), 3, null);
        }
    }
}
