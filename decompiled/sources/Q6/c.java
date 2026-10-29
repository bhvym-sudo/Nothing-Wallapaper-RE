package Q6;

import F8.AbstractC0816i;
import F8.L;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import android.view.View;
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
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.r;
import p089i8.AbstractC1444s;
import p219v8.p;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f6836a = new c();

    static final class a extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f6837q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ InterfaceC1163x f6838r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ View f6839s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ p013b2.c f6840t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ K7.b f6841u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ RecyclerView f6842v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ RecyclerView f6843w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ P6.e f6844x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        final /* synthetic */ p157p6.a f6845y;

        /* JADX INFO: renamed from: Q6.c$a$a, reason: collision with other inner class name */
        static final class C0242a extends l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f6846q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private /* synthetic */ Object f6847r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ View f6848s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ p013b2.c f6849t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ K7.b f6850u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ RecyclerView f6851v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            final /* synthetic */ InterfaceC1163x f6852w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            final /* synthetic */ RecyclerView f6853x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            final /* synthetic */ P6.e f6854y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            final /* synthetic */ p157p6.a f6855z;

            /* JADX INFO: renamed from: Q6.c$a$a$a, reason: collision with other inner class name */
            static final class C0243a extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f6856q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ p013b2.c f6857r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ RecyclerView f6858s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ P6.e f6859t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                final /* synthetic */ p157p6.a f6860u;

                /* JADX INFO: renamed from: Q6.c$a$a$a$a, reason: collision with other inner class name */
                static final class C0244a implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ RecyclerView f6861q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    final /* synthetic */ P6.e f6862r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    final /* synthetic */ p157p6.a f6863s;

                    C0244a(RecyclerView recyclerView, P6.e eVar, p157p6.a aVar) {
                        this.f6861q = recyclerView;
                        this.f6862r = eVar;
                        this.f6863s = aVar;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void e(P6.e eVar, RecyclerView recyclerView, p157p6.a aVar, Collection collection) {
                        eVar.j(recyclerView, aVar.c(collection.size()), AbstractC1444s.r0(collection));
                    }

                    @Override // I8.InterfaceC0881g
                    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                    public final Object b(final Collection collection, p129m8.e eVar) {
                        int i10;
                        Collection<p013b2.e> collection2 = collection;
                        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
                            i10 = 0;
                        } else {
                            Iterator it = collection2.iterator();
                            i10 = 0;
                            while (it.hasNext()) {
                                if (((p013b2.e) it.next()).c() > 0 && (i10 = i10 + 1) < 0) {
                                    AbstractC1444s.s();
                                }
                            }
                        }
                        if (i10 == 1) {
                            for (p013b2.e eVar2 : collection2) {
                                if (eVar2.c() > 0) {
                                    p219v8.a aVarB = eVar2.b();
                                    if (aVarB != null) {
                                        aVarB.invoke();
                                    }
                                    this.f6861q.setVisibility(8);
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        this.f6861q.setVisibility(0);
                        final RecyclerView recyclerView = this.f6861q;
                        final P6.e eVar3 = this.f6862r;
                        final p157p6.a aVar = this.f6863s;
                        recyclerView.post(new Runnable() { // from class: Q6.b
                            @Override // java.lang.Runnable
                            public final void run() {
                                c.a.C0242a.C0243a.C0244a.e(eVar3, recyclerView, aVar, collection);
                            }
                        });
                        return A.f21846a;
                    }
                }

                /* JADX INFO: renamed from: Q6.c$a$a$a$b */
                public static final class b implements InterfaceC0880f {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ InterfaceC0880f f6864q;

                    /* JADX INFO: renamed from: Q6.c$a$a$a$b$a, reason: collision with other inner class name */
                    public static final class C0245a implements InterfaceC0881g {

                        /* JADX INFO: renamed from: q, reason: collision with root package name */
                        final /* synthetic */ InterfaceC0881g f6865q;

                        /* JADX INFO: renamed from: Q6.c$a$a$a$b$a$a, reason: collision with other inner class name */
                        public static final class C0246a extends kotlin.coroutines.jvm.internal.d {

                            /* JADX INFO: renamed from: q, reason: collision with root package name */
                            /* synthetic */ Object f6866q;

                            /* JADX INFO: renamed from: r, reason: collision with root package name */
                            int f6867r;

                            public C0246a(p129m8.e eVar) {
                                super(eVar);
                            }

                            @Override // kotlin.coroutines.jvm.internal.a
                            public final Object invokeSuspend(Object obj) {
                                this.f6866q = obj;
                                this.f6867r |= Integer.MIN_VALUE;
                                return C0245a.this.b(null, this);
                            }
                        }

                        public C0245a(InterfaceC0881g interfaceC0881g) {
                            this.f6865q = interfaceC0881g;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // I8.InterfaceC0881g
                        public final Object b(Object obj, p129m8.e eVar) {
                            C0246a c0246a;
                            if (eVar instanceof C0246a) {
                                c0246a = (C0246a) eVar;
                                int i10 = c0246a.f6867r;
                                if ((i10 & Integer.MIN_VALUE) != 0) {
                                    c0246a.f6867r = i10 - Integer.MIN_VALUE;
                                } else {
                                    c0246a = new C0246a(eVar);
                                }
                            } else {
                                c0246a = new C0246a(eVar);
                            }
                            Object obj2 = c0246a.f6866q;
                            Object objE = p139n8.b.e();
                            int i11 = c0246a.f6867r;
                            if (i11 == 0) {
                                r.b(obj2);
                                InterfaceC0881g interfaceC0881g = this.f6865q;
                                Collection collectionValues = ((Map) obj).values();
                                c0246a.f6867r = 1;
                                if (interfaceC0881g.b(collectionValues, c0246a) == objE) {
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

                    public b(InterfaceC0880f interfaceC0880f) {
                        this.f6864q = interfaceC0880f;
                    }

                    @Override // I8.InterfaceC0880f
                    public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
                        Object objA = this.f6864q.a(new C0245a(interfaceC0881g), eVar);
                        return objA == p139n8.b.e() ? objA : A.f21846a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0243a(p013b2.c cVar, RecyclerView recyclerView, P6.e eVar, p157p6.a aVar, p129m8.e eVar2) {
                    super(2, eVar2);
                    this.f6857r = cVar;
                    this.f6858s = recyclerView;
                    this.f6859t = eVar;
                    this.f6860u = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new C0243a(this.f6857r, this.f6858s, this.f6859t, this.f6860u, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((C0243a) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f6856q;
                    if (i10 == 0) {
                        r.b(obj);
                        b bVar = new b(this.f6857r.s());
                        C0244a c0244a = new C0244a(this.f6858s, this.f6859t, this.f6860u);
                        this.f6856q = 1;
                        if (bVar.a(c0244a, this) == objE) {
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
            C0242a(View view, p013b2.c cVar, K7.b bVar, RecyclerView recyclerView, InterfaceC1163x interfaceC1163x, RecyclerView recyclerView2, P6.e eVar, p157p6.a aVar, p129m8.e eVar2) {
                super(2, eVar2);
                this.f6848s = view;
                this.f6849t = cVar;
                this.f6850u = bVar;
                this.f6851v = recyclerView;
                this.f6852w = interfaceC1163x;
                this.f6853x = recyclerView2;
                this.f6854y = eVar;
                this.f6855z = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                C0242a c0242a = new C0242a(this.f6848s, this.f6849t, this.f6850u, this.f6851v, this.f6852w, this.f6853x, this.f6854y, this.f6855z, eVar);
                c0242a.f6847r = obj;
                return c0242a;
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((C0242a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f6846q;
                if (i10 == 0) {
                    r.b(obj);
                    L l9 = (L) this.f6847r;
                    AbstractC0816i.d(l9, null, null, new C0243a(this.f6849t, this.f6853x, this.f6854y, this.f6855z, null), 3, null);
                    Y1.c cVar = Y1.c.f9233a;
                    View view = this.f6848s;
                    p013b2.c cVar2 = this.f6849t;
                    K7.b bVar = this.f6850u;
                    RecyclerView recyclerView = this.f6851v;
                    InterfaceC1163x interfaceC1163x = this.f6852w;
                    this.f6846q = 1;
                    if (cVar.h(l9, view, cVar2, bVar, recyclerView, interfaceC1163x, this) == objE) {
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
        a(InterfaceC1163x interfaceC1163x, View view, p013b2.c cVar, K7.b bVar, RecyclerView recyclerView, RecyclerView recyclerView2, P6.e eVar, p157p6.a aVar, p129m8.e eVar2) {
            super(2, eVar2);
            this.f6838r = interfaceC1163x;
            this.f6839s = view;
            this.f6840t = cVar;
            this.f6841u = bVar;
            this.f6842v = recyclerView;
            this.f6843w = recyclerView2;
            this.f6844x = eVar;
            this.f6845y = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return new a(this.f6838r, this.f6839s, this.f6840t, this.f6841u, this.f6842v, this.f6843w, this.f6844x, this.f6845y, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f6837q;
            if (i10 == 0) {
                r.b(obj);
                InterfaceC1163x interfaceC1163x = this.f6838r;
                AbstractC1157q.b bVar = AbstractC1157q.b.STARTED;
                C0242a c0242a = new C0242a(this.f6839s, this.f6840t, this.f6841u, this.f6842v, interfaceC1163x, this.f6843w, this.f6844x, this.f6845y, null);
                this.f6837q = 1;
                if (N.b(interfaceC1163x, bVar, c0242a, this) == objE) {
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

    public static final Y1.c.a b(final View view, p013b2.c viewModel, InterfaceC1163x lifecycleOwner) {
        n.h(view, "view");
        n.h(viewModel, "viewModel");
        n.h(lifecycleOwner, "lifecycleOwner");
        View viewRequireViewById = view.requireViewById(R.id.color_type_tabs);
        n.g(viewRequireViewById, "requireViewById(...)");
        RecyclerView recyclerView = (RecyclerView) viewRequireViewById;
        View viewRequireViewById2 = view.requireViewById(R.id.color_options);
        n.g(viewRequireViewById2, "requireViewById(...)");
        RecyclerView recyclerView2 = (RecyclerView) viewRequireViewById2;
        P6.e eVar = new P6.e();
        recyclerView.setAdapter(eVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
        p157p6.a aVar = new p157p6.a(26);
        recyclerView.addItemDecoration(aVar);
        K7.b bVar = new K7.b(R.layout.nt_color_option_2, lifecycleOwner, new p() { // from class: Q6.a
            @Override // p219v8.p
            public final Object invoke(Object obj, Object obj2) {
                return c.c(view, (View) obj, (p013b2.a) obj2);
            }
        });
        recyclerView2.setAdapter(bVar);
        recyclerView2.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
        recyclerView2.addItemDecoration(new p157p6.a(42));
        AbstractC0816i.d(AbstractC1164y.a(lifecycleOwner), null, null, new a(lifecycleOwner, view, viewModel, bVar, recyclerView2, recyclerView, eVar, aVar, null), 3, null);
        return Y1.c.f9233a.g(recyclerView2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A c(View view, View foregroundView, p013b2.a colorIcon) {
        n.h(foregroundView, "foregroundView");
        n.h(colorIcon, "colorIcon");
        ColorOptionIconView colorOptionIconView = foregroundView instanceof ColorOptionIconView ? (ColorOptionIconView) foregroundView : null;
        boolean z9 = (view.getResources().getConfiguration().uiMode & 48) == 32;
        if (colorOptionIconView != null) {
            Y1.a.f9231a.a(colorOptionIconView, colorIcon, z9);
        }
        return A.f21846a;
    }
}
