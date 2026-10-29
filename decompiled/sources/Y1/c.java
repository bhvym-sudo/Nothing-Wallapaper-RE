package Y1;

import F8.AbstractC0816i;
import F8.L;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.AbstractC1164y;
import androidx.lifecycle.InterfaceC1163x;
import androidx.lifecycle.N;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.customization.picker.color.ui.view.ColorOptionIconView;
import com.nothing.wallpaper.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.r;
import p089i8.AbstractC1444s;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f9233a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f9234b = "layout_manager_state";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Parcelable f9235c;

    public interface a {
        void a(Bundle bundle);

        void b(Bundle bundle);
    }

    static final class b extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f9236q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ InterfaceC1163x f9237r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ View f9238s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ p013b2.c f9239t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ p254z3.a f9240u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ RecyclerView f9241v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ X1.b f9242w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ TextView f9243x;

        static final class a extends l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f9244q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private /* synthetic */ Object f9245r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ View f9246s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ p013b2.c f9247t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ p254z3.a f9248u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ RecyclerView f9249v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            final /* synthetic */ InterfaceC1163x f9250w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            final /* synthetic */ X1.b f9251x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            final /* synthetic */ TextView f9252y;

            /* JADX INFO: renamed from: Y1.c$b$a$a, reason: collision with other inner class name */
            static final class C0327a extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f9253q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ p013b2.c f9254r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ X1.b f9255s;

                /* JADX INFO: renamed from: Y1.c$b$a$a$a, reason: collision with other inner class name */
                static final class C0328a implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ X1.b f9256q;

                    C0328a(X1.b bVar) {
                        this.f9256q = bVar;
                    }

                    @Override // I8.InterfaceC0881g
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object b(Collection collection, p129m8.e eVar) {
                        this.f9256q.h(AbstractC1444s.r0(collection));
                        return A.f21846a;
                    }
                }

                /* JADX INFO: renamed from: Y1.c$b$a$a$b, reason: collision with other inner class name */
                public static final class C0329b implements InterfaceC0880f {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ InterfaceC0880f f9257q;

                    /* JADX INFO: renamed from: Y1.c$b$a$a$b$a, reason: collision with other inner class name */
                    public static final class C0330a implements InterfaceC0881g {

                        /* JADX INFO: renamed from: q, reason: collision with root package name */
                        final /* synthetic */ InterfaceC0881g f9258q;

                        /* JADX INFO: renamed from: Y1.c$b$a$a$b$a$a, reason: collision with other inner class name */
                        public static final class C0331a extends kotlin.coroutines.jvm.internal.d {

                            /* JADX INFO: renamed from: q, reason: collision with root package name */
                            /* synthetic */ Object f9259q;

                            /* JADX INFO: renamed from: r, reason: collision with root package name */
                            int f9260r;

                            public C0331a(p129m8.e eVar) {
                                super(eVar);
                            }

                            @Override // kotlin.coroutines.jvm.internal.a
                            public final Object invokeSuspend(Object obj) {
                                this.f9259q = obj;
                                this.f9260r |= Integer.MIN_VALUE;
                                return C0330a.this.b(null, this);
                            }
                        }

                        public C0330a(InterfaceC0881g interfaceC0881g) {
                            this.f9258q = interfaceC0881g;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // I8.InterfaceC0881g
                        public final Object b(Object obj, p129m8.e eVar) {
                            C0331a c0331a;
                            if (eVar instanceof C0331a) {
                                c0331a = (C0331a) eVar;
                                int i10 = c0331a.f9260r;
                                if ((i10 & Integer.MIN_VALUE) != 0) {
                                    c0331a.f9260r = i10 - Integer.MIN_VALUE;
                                } else {
                                    c0331a = new C0331a(eVar);
                                }
                            } else {
                                c0331a = new C0331a(eVar);
                            }
                            Object obj2 = c0331a.f9259q;
                            Object objE = p139n8.b.e();
                            int i11 = c0331a.f9260r;
                            if (i11 == 0) {
                                r.b(obj2);
                                InterfaceC0881g interfaceC0881g = this.f9258q;
                                Collection collectionValues = ((Map) obj).values();
                                c0331a.f9260r = 1;
                                if (interfaceC0881g.b(collectionValues, c0331a) == objE) {
                                    return objE;
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                r.b(obj2);
                            }
                            return A.f21846a;
                        }
                    }

                    public C0329b(InterfaceC0880f interfaceC0880f) {
                        this.f9257q = interfaceC0880f;
                    }

                    @Override // I8.InterfaceC0880f
                    public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
                        Object objA = this.f9257q.a(new C0330a(interfaceC0881g), eVar);
                        return objA == p139n8.b.e() ? objA : A.f21846a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0327a(p013b2.c cVar, X1.b bVar, p129m8.e eVar) {
                    super(2, eVar);
                    this.f9254r = cVar;
                    this.f9255s = bVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new C0327a(this.f9254r, this.f9255s, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((C0327a) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f9253q;
                    if (i10 == 0) {
                        r.b(obj);
                        C0329b c0329b = new C0329b(this.f9254r.s());
                        C0328a c0328a = new C0328a(this.f9255s);
                        this.f9253q = 1;
                        if (c0329b.a(c0328a, this) == objE) {
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

            /* JADX INFO: renamed from: Y1.c$b$a$b, reason: collision with other inner class name */
            static final class C0332b extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f9262q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ p013b2.c f9263r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ TextView f9264s;

                /* JADX INFO: renamed from: Y1.c$b$a$b$a, reason: collision with other inner class name */
                static final class C0333a implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ TextView f9265q;

                    C0333a(TextView textView) {
                        this.f9265q = textView;
                    }

                    @Override // I8.InterfaceC0881g
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object b(String str, p129m8.e eVar) {
                        this.f9265q.setText(str);
                        return A.f21846a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0332b(p013b2.c cVar, TextView textView, p129m8.e eVar) {
                    super(2, eVar);
                    this.f9263r = cVar;
                    this.f9264s = textView;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new C0332b(this.f9263r, this.f9264s, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((C0332b) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f9262q;
                    if (i10 == 0) {
                        r.b(obj);
                        InterfaceC0880f interfaceC0880fR = this.f9263r.r();
                        C0333a c0333a = new C0333a(this.f9264s);
                        this.f9262q = 1;
                        if (interfaceC0880fR.a(c0333a, this) == objE) {
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
            a(View view, p013b2.c cVar, p254z3.a aVar, RecyclerView recyclerView, InterfaceC1163x interfaceC1163x, X1.b bVar, TextView textView, p129m8.e eVar) {
                super(2, eVar);
                this.f9246s = view;
                this.f9247t = cVar;
                this.f9248u = aVar;
                this.f9249v = recyclerView;
                this.f9250w = interfaceC1163x;
                this.f9251x = bVar;
                this.f9252y = textView;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                a aVar = new a(this.f9246s, this.f9247t, this.f9248u, this.f9249v, this.f9250w, this.f9251x, this.f9252y, eVar);
                aVar.f9245r = obj;
                return aVar;
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f9244q;
                if (i10 == 0) {
                    r.b(obj);
                    L l9 = (L) this.f9245r;
                    AbstractC0816i.d(l9, null, null, new C0327a(this.f9247t, this.f9251x, null), 3, null);
                    AbstractC0816i.d(l9, null, null, new C0332b(this.f9247t, this.f9252y, null), 3, null);
                    c cVar = c.f9233a;
                    View view = this.f9246s;
                    p013b2.c cVar2 = this.f9247t;
                    p254z3.a aVar = this.f9248u;
                    RecyclerView recyclerView = this.f9249v;
                    InterfaceC1163x interfaceC1163x = this.f9250w;
                    this.f9244q = 1;
                    if (cVar.h(l9, view, cVar2, aVar, recyclerView, interfaceC1163x, this) == objE) {
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
        b(InterfaceC1163x interfaceC1163x, View view, p013b2.c cVar, p254z3.a aVar, RecyclerView recyclerView, X1.b bVar, TextView textView, p129m8.e eVar) {
            super(2, eVar);
            this.f9237r = interfaceC1163x;
            this.f9238s = view;
            this.f9239t = cVar;
            this.f9240u = aVar;
            this.f9241v = recyclerView;
            this.f9242w = bVar;
            this.f9243x = textView;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return new b(this.f9237r, this.f9238s, this.f9239t, this.f9240u, this.f9241v, this.f9242w, this.f9243x, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((b) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f9236q;
            if (i10 == 0) {
                r.b(obj);
                InterfaceC1163x interfaceC1163x = this.f9237r;
                AbstractC1157q.b bVar = AbstractC1157q.b.STARTED;
                a aVar = new a(this.f9238s, this.f9239t, this.f9240u, this.f9241v, interfaceC1163x, this.f9242w, this.f9243x, null);
                this.f9236q = 1;
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

    /* JADX INFO: renamed from: Y1.c$c, reason: collision with other inner class name */
    public static final class C0334c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView f9266a;

        C0334c(RecyclerView recyclerView) {
            this.f9266a = recyclerView;
        }

        @Override // Y1.c.a
        public void a(Bundle savedState) {
            n.h(savedState, "savedState");
            c.f9235c = savedState.getParcelable(c.f9234b);
        }

        @Override // Y1.c.a
        public void b(Bundle savedState) {
            n.h(savedState, "savedState");
            String str = c.f9234b;
            Parcelable parcelableOnSaveInstanceState = c.f9235c;
            if (parcelableOnSaveInstanceState == null) {
                RecyclerView.LayoutManager layoutManager = this.f9266a.getLayoutManager();
                parcelableOnSaveInstanceState = layoutManager != null ? layoutManager.onSaveInstanceState() : null;
            }
            savedState.putParcelable(str, parcelableOnSaveInstanceState);
        }
    }

    static final class d extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f9267q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p013b2.c f9268r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ p254z3.a f9269s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ RecyclerView f9270t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ View f9271u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ InterfaceC1163x f9272v;

        static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ p254z3.a f9273q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ RecyclerView f9274r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ p013b2.c f9275s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ View f9276t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ InterfaceC1163x f9277u;

            a(p254z3.a aVar, RecyclerView recyclerView, p013b2.c cVar, View view, InterfaceC1163x interfaceC1163x) {
                this.f9273q = aVar;
                this.f9274r = recyclerView;
                this.f9275s = cVar;
                this.f9276t = view;
                this.f9277u = interfaceC1163x;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void f(InterfaceC1163x interfaceC1163x, RecyclerView recyclerView) {
                if (interfaceC1163x.getLifecycle().b().e(AbstractC1157q.b.RESUMED)) {
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    n.f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                    ((LinearLayoutManager) layoutManager).onRestoreInstanceState(c.f9235c);
                    c.f9235c = null;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void i(InterfaceC1163x interfaceC1163x, RecyclerView recyclerView, C c10) {
                if (interfaceC1163x.getLifecycle().b() == AbstractC1157q.b.RESUMED) {
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    n.f(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                    ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(c10.f22777q, 0);
                }
            }

            @Override // I8.InterfaceC0881g
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Object b(List list, p129m8.e eVar) {
                this.f9273q.h(list);
                if (c.f9235c != null) {
                    final RecyclerView recyclerView = this.f9274r;
                    final InterfaceC1163x interfaceC1163x = this.f9277u;
                    recyclerView.post(new Runnable() { // from class: Y1.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            c.d.a.f(interfaceC1163x, recyclerView);
                        }
                    });
                } else {
                    final C c10 = new C();
                    Iterator it = list.iterator();
                    int i10 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i10 = -1;
                            break;
                        }
                        if (((Boolean) ((B3.a) it.next()).g().getValue()).booleanValue()) {
                            break;
                        }
                        i10++;
                    }
                    c10.f22777q = i10;
                    if (i10 < 0) {
                        i10 = 0;
                    }
                    c10.f22777q = i10;
                    if (this.f9275s.u()) {
                        c10.f22777q = 0;
                    }
                    if (this.f9274r.getLayoutManager() == null) {
                        this.f9274r.setLayoutManager(new LinearLayoutManager(this.f9276t.getContext(), 0, false));
                    }
                    final RecyclerView recyclerView2 = this.f9274r;
                    final InterfaceC1163x interfaceC1163x2 = this.f9277u;
                    recyclerView2.post(new Runnable() { // from class: Y1.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            c.d.a.i(interfaceC1163x2, recyclerView2, c10);
                        }
                    });
                }
                return A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(p013b2.c cVar, p254z3.a aVar, RecyclerView recyclerView, View view, InterfaceC1163x interfaceC1163x, p129m8.e eVar) {
            super(2, eVar);
            this.f9268r = cVar;
            this.f9269s = aVar;
            this.f9270t = recyclerView;
            this.f9271u = view;
            this.f9272v = interfaceC1163x;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return new d(this.f9268r, this.f9269s, this.f9270t, this.f9271u, this.f9272v, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((d) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f9267q;
            if (i10 == 0) {
                r.b(obj);
                InterfaceC0880f interfaceC0880fP = this.f9268r.p();
                a aVar = new a(this.f9269s, this.f9270t, this.f9268r, this.f9271u, this.f9272v);
                this.f9267q = 1;
                if (interfaceC0880fP.a(aVar, this) == objE) {
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

    private c() {
    }

    public static final a e(final View view, p013b2.c viewModel, InterfaceC1163x lifecycleOwner) {
        n.h(view, "view");
        n.h(viewModel, "viewModel");
        n.h(lifecycleOwner, "lifecycleOwner");
        View viewRequireViewById = view.requireViewById(R.id.color_type_tabs);
        n.g(viewRequireViewById, "requireViewById(...)");
        RecyclerView recyclerView = (RecyclerView) viewRequireViewById;
        View viewRequireViewById2 = view.requireViewById(R.id.color_type_tab_subhead);
        n.g(viewRequireViewById2, "requireViewById(...)");
        TextView textView = (TextView) viewRequireViewById2;
        View viewRequireViewById3 = view.requireViewById(R.id.color_options);
        n.g(viewRequireViewById3, "requireViewById(...)");
        RecyclerView recyclerView2 = (RecyclerView) viewRequireViewById3;
        X1.b bVar = new X1.b();
        recyclerView.setAdapter(bVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
        recyclerView.addItemDecoration(new p023c2.a(12));
        p254z3.a aVar = new p254z3.a(R.layout.color_option, lifecycleOwner, null, null, new p() { // from class: Y1.b
            @Override // p219v8.p
            public final Object invoke(Object obj, Object obj2) {
                return c.f(view, (View) obj, (p013b2.a) obj2);
            }
        }, 12, null);
        recyclerView2.setAdapter(aVar);
        recyclerView2.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
        recyclerView2.addItemDecoration(new p023c2.a(8));
        AbstractC0816i.d(AbstractC1164y.a(lifecycleOwner), null, null, new b(lifecycleOwner, view, viewModel, aVar, recyclerView2, bVar, textView, null), 3, null);
        return f9233a.g(recyclerView2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A f(View view, View foregroundView, p013b2.a colorIcon) {
        n.h(foregroundView, "foregroundView");
        n.h(colorIcon, "colorIcon");
        ColorOptionIconView colorOptionIconView = foregroundView instanceof ColorOptionIconView ? (ColorOptionIconView) foregroundView : null;
        boolean z9 = (view.getResources().getConfiguration().uiMode & 48) == 32;
        if (colorOptionIconView != null) {
            Y1.a.f9231a.a(colorOptionIconView, colorIcon, z9);
        }
        return A.f21846a;
    }

    public final a g(RecyclerView colorOptionContainerView) {
        n.h(colorOptionContainerView, "colorOptionContainerView");
        return new C0334c(colorOptionContainerView);
    }

    public final Object h(L l9, View view, p013b2.c cVar, p254z3.a aVar, RecyclerView recyclerView, InterfaceC1163x interfaceC1163x, p129m8.e eVar) {
        AbstractC0816i.d(l9, null, null, new d(cVar, aVar, recyclerView, view, interfaceC1163x, null), 3, null);
        return A.f21846a;
    }
}
