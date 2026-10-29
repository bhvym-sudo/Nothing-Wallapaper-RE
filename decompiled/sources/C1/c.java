package C1;

import A3.f;
import F8.AbstractC0816i;
import F8.I;
import F8.L;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.AbstractC1164y;
import androidx.lifecycle.InterfaceC1163x;
import androidx.lifecycle.N;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.nothing.wallpaper.R;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.r;
import p129m8.e;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f571a = new c();

    static final class a extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f572q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ InterfaceC1163x f573r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ E1.b f574s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ p254z3.a f575t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ p219v8.a f576u;

        /* JADX INFO: renamed from: C1.c$a$a, reason: collision with other inner class name */
        static final class C0025a extends l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f577q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private /* synthetic */ Object f578r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ E1.b f579s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ p254z3.a f580t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ p219v8.a f581u;

            /* JADX INFO: renamed from: C1.c$a$a$a, reason: collision with other inner class name */
            static final class C0026a extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f582q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ E1.b f583r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ p254z3.a f584s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ p219v8.a f585t;

                /* JADX INFO: renamed from: C1.c$a$a$a$a, reason: collision with other inner class name */
                static final class C0027a implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ p254z3.a f586q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    final /* synthetic */ p219v8.a f587r;

                    C0027a(p254z3.a aVar, p219v8.a aVar2) {
                        this.f586q = aVar;
                        this.f587r = aVar2;
                    }

                    @Override // I8.InterfaceC0881g
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object b(List list, e eVar) {
                        this.f586q.h(list);
                        this.f587r.invoke();
                        return A.f21846a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0026a(E1.b bVar, p254z3.a aVar, p219v8.a aVar2, e eVar) {
                    super(2, eVar);
                    this.f583r = bVar;
                    this.f584s = aVar;
                    this.f585t = aVar2;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final e create(Object obj, e eVar) {
                    return new C0026a(this.f583r, this.f584s, this.f585t, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, e eVar) {
                    return ((C0026a) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f582q;
                    if (i10 == 0) {
                        r.b(obj);
                        InterfaceC0880f interfaceC0880fF = this.f583r.f();
                        C0027a c0027a = new C0027a(this.f584s, this.f585t);
                        this.f582q = 1;
                        if (interfaceC0880fF.a(c0027a, this) == objE) {
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
            C0025a(E1.b bVar, p254z3.a aVar, p219v8.a aVar2, e eVar) {
                super(2, eVar);
                this.f579s = bVar;
                this.f580t = aVar;
                this.f581u = aVar2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final e create(Object obj, e eVar) {
                C0025a c0025a = new C0025a(this.f579s, this.f580t, this.f581u, eVar);
                c0025a.f578r = obj;
                return c0025a;
            }

            @Override // p219v8.p
            public final Object invoke(L l9, e eVar) {
                return ((C0025a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f577q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                AbstractC0816i.d((L) this.f578r, null, null, new C0026a(this.f579s, this.f580t, this.f581u, null), 3, null);
                return A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC1163x interfaceC1163x, E1.b bVar, p254z3.a aVar, p219v8.a aVar2, e eVar) {
            super(2, eVar);
            this.f573r = interfaceC1163x;
            this.f574s = bVar;
            this.f575t = aVar;
            this.f576u = aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new a(this.f573r, this.f574s, this.f575t, this.f576u, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, e eVar) {
            return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f572q;
            if (i10 == 0) {
                r.b(obj);
                InterfaceC1163x interfaceC1163x = this.f573r;
                AbstractC1157q.b bVar = AbstractC1157q.b.STARTED;
                C0025a c0025a = new C0025a(this.f574s, this.f575t, this.f576u, null);
                this.f572q = 1;
                if (N.b(interfaceC1163x, bVar, c0025a, this) == objE) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final A c(View foregroundView, E1.a gridIcon) {
        n.h(foregroundView, "foregroundView");
        n.h(gridIcon, "gridIcon");
        ImageView imageView = foregroundView instanceof ImageView ? (ImageView) foregroundView : null;
        if (imageView != null) {
            C1.a.f570a.a(imageView, gridIcon);
        }
        return A.f21846a;
    }

    public final void b(View view, E1.b viewModel, InterfaceC1163x lifecycleOwner, I backgroundDispatcher, p219v8.a onOptionsChanged) {
        n.h(view, "view");
        n.h(viewModel, "viewModel");
        n.h(lifecycleOwner, "lifecycleOwner");
        n.h(backgroundDispatcher, "backgroundDispatcher");
        n.h(onOptionsChanged, "onOptionsChanged");
        View viewRequireViewById = view.requireViewById(R.id.options);
        n.g(viewRequireViewById, "requireViewById(...)");
        RecyclerView recyclerView = (RecyclerView) viewRequireViewById;
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
        recyclerView.addItemDecoration(new p023c2.a(8));
        p254z3.a aVar = new p254z3.a(R.layout.grid_option_2, lifecycleOwner, backgroundDispatcher, new f.b(view.getContext().getColor(R.color.text_color_primary), view.getContext().getColor(R.color.text_color_secondary)), new p() { // from class: C1.b
            @Override // p219v8.p
            public final Object invoke(Object obj, Object obj2) {
                return c.c((View) obj, (E1.a) obj2);
            }
        });
        recyclerView.setAdapter(aVar);
        AbstractC0816i.d(AbstractC1164y.a(lifecycleOwner), null, null, new a(lifecycleOwner, viewModel, aVar, onOptionsChanged, null), 3, null);
    }
}
