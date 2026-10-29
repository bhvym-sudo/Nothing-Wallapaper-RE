package Q6;

import F8.AbstractC0816i;
import F8.L;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.AbstractC1164y;
import androidx.lifecycle.InterfaceC1163x;
import androidx.lifecycle.N;
import com.android.customization.picker.color.ui.view.ColorOptionIconView;
import com.nothing.wallpaper.R;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.r;
import p089i8.AbstractC1444s;
import p219v8.p;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f6870a = new e();

    static final class a extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f6871q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ InterfaceC1163x f6872r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ p013b2.c f6873s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ LinearLayout f6874t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ p219v8.l f6875u;

        /* JADX INFO: renamed from: Q6.e$a$a, reason: collision with other inner class name */
        static final class C0247a extends l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f6876q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private /* synthetic */ Object f6877r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ p013b2.c f6878s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ LinearLayout f6879t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ p219v8.l f6880u;

            /* JADX INFO: renamed from: Q6.e$a$a$a, reason: collision with other inner class name */
            static final class C0248a extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f6881q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ p013b2.c f6882r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ LinearLayout f6883s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ p219v8.l f6884t;

                /* JADX INFO: renamed from: Q6.e$a$a$a$a, reason: collision with other inner class name */
                static final class C0249a implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ LinearLayout f6885q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    final /* synthetic */ p219v8.l f6886r;

                    C0249a(LinearLayout linearLayout, p219v8.l lVar) {
                        this.f6885q = linearLayout;
                        this.f6886r = lVar;
                    }

                    @Override // I8.InterfaceC0881g
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object b(List list, p129m8.e eVar) {
                        e.f6870a.d(list, this.f6885q, this.f6886r);
                        return A.f21846a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0248a(p013b2.c cVar, LinearLayout linearLayout, p219v8.l lVar, p129m8.e eVar) {
                    super(2, eVar);
                    this.f6882r = cVar;
                    this.f6883s = linearLayout;
                    this.f6884t = lVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new C0248a(this.f6882r, this.f6883s, this.f6884t, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((C0248a) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f6881q;
                    if (i10 == 0) {
                        r.b(obj);
                        InterfaceC0880f interfaceC0880fN = this.f6882r.n();
                        C0249a c0249a = new C0249a(this.f6883s, this.f6884t);
                        this.f6881q = 1;
                        if (interfaceC0880fN.a(c0249a, this) == objE) {
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
            C0247a(p013b2.c cVar, LinearLayout linearLayout, p219v8.l lVar, p129m8.e eVar) {
                super(2, eVar);
                this.f6878s = cVar;
                this.f6879t = linearLayout;
                this.f6880u = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                C0247a c0247a = new C0247a(this.f6878s, this.f6879t, this.f6880u, eVar);
                c0247a.f6877r = obj;
                return c0247a;
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((C0247a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f6876q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                AbstractC0816i.d((L) this.f6877r, null, null, new C0248a(this.f6878s, this.f6879t, this.f6880u, null), 3, null);
                return A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC1163x interfaceC1163x, p013b2.c cVar, LinearLayout linearLayout, p219v8.l lVar, p129m8.e eVar) {
            super(2, eVar);
            this.f6872r = interfaceC1163x;
            this.f6873s = cVar;
            this.f6874t = linearLayout;
            this.f6875u = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return new a(this.f6872r, this.f6873s, this.f6874t, this.f6875u, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f6871q;
            if (i10 == 0) {
                r.b(obj);
                InterfaceC1163x interfaceC1163x = this.f6872r;
                AbstractC1157q.b bVar = AbstractC1157q.b.STARTED;
                C0247a c0247a = new C0247a(this.f6873s, this.f6874t, this.f6875u, null);
                this.f6871q = 1;
                if (N.b(interfaceC1163x, bVar, c0247a, this) == objE) {
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

    private e() {
    }

    public static final LinearLayout c(Context context, ViewGroup parent, p013b2.c viewModel, InterfaceC1163x lifecycleOwner, p219v8.l navigationOnClick) {
        n.h(context, "context");
        n.h(parent, "parent");
        n.h(viewModel, "viewModel");
        n.h(lifecycleOwner, "lifecycleOwner");
        n.h(navigationOnClick, "navigationOnClick");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.color_linked_option, parent, false);
        n.f(viewInflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        ((TextView) linearLayout.requireViewById(R.id.option_description)).setText(R.string.nt_color_section_title);
        linearLayout.setContentDescription(context.getResources().getString(R.string.nt_color_section_title));
        f6870a.f(context, linearLayout);
        AbstractC0816i.d(AbstractC1164y.a(lifecycleOwner), null, null, new a(lifecycleOwner, viewModel, linearLayout, navigationOnClick, null), 3, null);
        return linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(List list, ViewGroup viewGroup, final p219v8.l lVar) {
        Object next;
        p013b2.a aVar;
        boolean z9 = (viewGroup.getResources().getConfiguration().uiMode & 48) == 32;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((Boolean) ((B3.a) next).g().getValue()).booleanValue());
        B3.a aVar2 = (B3.a) next;
        if (aVar2 == null) {
            aVar2 = (B3.a) AbstractC1444s.V(list, 0);
        }
        if (aVar2 != null && (aVar = (p013b2.a) aVar2.d()) != null) {
            View viewRequireViewById = viewGroup.requireViewById(R.id.option_icon_bauhaus);
            n.g(viewRequireViewById, "requireViewById(...)");
            View viewRequireViewById2 = viewGroup.requireViewById(R.id.option_icon);
            n.g(viewRequireViewById2, "requireViewById(...)");
            p164q3.a aVarE = aVar2.e();
            Context context = viewGroup.getContext();
            n.g(context, "getContext(...)");
            if (n.d("Bauhaus", aVarE.a(context))) {
                viewRequireViewById.setVisibility(0);
                viewRequireViewById2.setVisibility(8);
            } else {
                viewRequireViewById.setVisibility(8);
                viewRequireViewById2.setVisibility(0);
                Y1.a aVar3 = Y1.a.f9231a;
                View viewRequireViewById3 = viewGroup.requireViewById(R.id.option_icon);
                n.g(viewRequireViewById3, "requireViewById(...)");
                aVar3.a((ColorOptionIconView) viewRequireViewById3, aVar, z9);
            }
        }
        viewGroup.setOnClickListener(new View.OnClickListener() { // from class: Q6.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e.e(lVar, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(p219v8.l lVar, View view) {
        lVar.f(view);
    }

    private final void f(Context context, View view) {
        int color = context.getResources().getColor(R.color.nt_option_icon_container_bg_color, null);
        p013b2.a aVar = new p013b2.a(color, color, color, color, color, color, color, color);
        boolean z9 = (view.getResources().getConfiguration().uiMode & 48) == 32;
        Y1.a aVar2 = Y1.a.f9231a;
        View viewRequireViewById = view.requireViewById(R.id.option_icon);
        n.g(viewRequireViewById, "requireViewById(...)");
        aVar2.a((ColorOptionIconView) viewRequireViewById, aVar, z9);
    }
}
