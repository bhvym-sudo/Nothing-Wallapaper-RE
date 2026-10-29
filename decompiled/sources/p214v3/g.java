package p214v3;

import F8.AbstractC0816i;
import F8.L;
import I8.AbstractC0882h;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import android.view.View;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.AbstractC1164y;
import androidx.lifecycle.InterfaceC1163x;
import androidx.lifecycle.N;
import com.android.wallpaper.widget.DuoTabs;
import com.nothing.wallpaper.R;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.o;
import p079h8.r;
import p079h8.v;
import p129m8.e;
import p219v8.p;
import p219v8.q;
import p234x3.b;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f28166a = new g();

    static final class a extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f28167q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ InterfaceC1163x f28168r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ b f28169s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ DuoTabs f28170t;

        /* JADX INFO: renamed from: v3.g$a$a, reason: collision with other inner class name */
        static final class C0697a extends l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f28171q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private /* synthetic */ Object f28172r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ b f28173s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ DuoTabs f28174t;

            /* JADX INFO: renamed from: v3.g$a$a$a, reason: collision with other inner class name */
            static final class C0698a extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f28175q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ p234x3.b f28176r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ DuoTabs f28177s;

                /* JADX INFO: renamed from: v3.g$a$a$a$a, reason: collision with other inner class name */
                static final class C0699a extends l implements q {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    int f28178q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    /* synthetic */ Object f28179r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    /* synthetic */ Object f28180s;

                    C0699a(e eVar) {
                        super(3, eVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        p139n8.b.e();
                        if (this.f28178q != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj);
                        return v.a((p234x3.a) this.f28179r, (p234x3.a) this.f28180s);
                    }

                    @Override // p219v8.q
                    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
                    public final Object e(p234x3.a aVar, p234x3.a aVar2, e eVar) {
                        C0699a c0699a = new C0699a(eVar);
                        c0699a.f28179r = aVar;
                        c0699a.f28180s = aVar2;
                        return c0699a.invokeSuspend(A.f21846a);
                    }
                }

                /* JADX INFO: renamed from: v3.g$a$a$a$b */
                static final class b implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ DuoTabs f28181q;

                    b(DuoTabs duoTabs) {
                        this.f28181q = duoTabs;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void e(p234x3.a aVar, p234x3.a aVar2, int i10) {
                        p219v8.a aVarA;
                        if (i10 != 0) {
                            if (i10 == 1 && (aVarA = aVar2.a()) != null) {
                                aVarA.invoke();
                                return;
                            }
                            return;
                        }
                        p219v8.a aVarA2 = aVar.a();
                        if (aVarA2 != null) {
                            aVarA2.invoke();
                        }
                    }

                    @Override // I8.InterfaceC0881g
                    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                    public final Object b(o oVar, e eVar) {
                        final p234x3.a aVar = (p234x3.a) oVar.a();
                        final p234x3.a aVar2 = (p234x3.a) oVar.b();
                        this.f28181q.setOnTabSelectedListener(null);
                        this.f28181q.i(!aVar.b() ? 1 : 0);
                        this.f28181q.setOnTabSelectedListener(new DuoTabs.a() { // from class: v3.h
                            @Override // com.android.wallpaper.widget.DuoTabs.a
                            public final void a(int i10) {
                                g.a.C0697a.C0698a.b.e(aVar, aVar2, i10);
                            }
                        });
                        return A.f21846a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0698a(p234x3.b bVar, DuoTabs duoTabs, e eVar) {
                    super(2, eVar);
                    this.f28176r = bVar;
                    this.f28177s = duoTabs;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final e create(Object obj, e eVar) {
                    return new C0698a(this.f28176r, this.f28177s, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, e eVar) {
                    return ((C0698a) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f28175q;
                    if (i10 == 0) {
                        r.b(obj);
                        InterfaceC0880f interfaceC0880fL = AbstractC0882h.l(this.f28176r.f(), this.f28176r.e(), new C0699a(null));
                        b bVar = new b(this.f28177s);
                        this.f28175q = 1;
                        if (interfaceC0880fL.a(bVar, this) == objE) {
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
            C0697a(b bVar, DuoTabs duoTabs, e eVar) {
                super(2, eVar);
                this.f28173s = bVar;
                this.f28174t = duoTabs;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final e create(Object obj, e eVar) {
                C0697a c0697a = new C0697a(this.f28173s, this.f28174t, eVar);
                c0697a.f28172r = obj;
                return c0697a;
            }

            @Override // p219v8.p
            public final Object invoke(L l9, e eVar) {
                return ((C0697a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f28171q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                AbstractC0816i.d((L) this.f28172r, null, null, new C0698a(this.f28173s, this.f28174t, null), 3, null);
                return A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC1163x interfaceC1163x, b bVar, DuoTabs duoTabs, e eVar) {
            super(2, eVar);
            this.f28168r = interfaceC1163x;
            this.f28169s = bVar;
            this.f28170t = duoTabs;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new a(this.f28168r, this.f28169s, this.f28170t, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, e eVar) {
            return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f28167q;
            if (i10 == 0) {
                r.b(obj);
                InterfaceC1163x interfaceC1163x = this.f28168r;
                AbstractC1157q.b bVar = AbstractC1157q.b.STARTED;
                C0697a c0697a = new C0697a(this.f28169s, this.f28170t, null);
                this.f28167q = 1;
                if (N.b(interfaceC1163x, bVar, c0697a, this) == objE) {
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

    private g() {
    }

    public static final void a(View view, b viewModel, InterfaceC1163x lifecycleOwner) {
        n.h(view, "view");
        n.h(viewModel, "viewModel");
        n.h(lifecycleOwner, "lifecycleOwner");
        View viewRequireViewById = view.requireViewById(R.id.duo_tabs);
        n.g(viewRequireViewById, "requireViewById(...)");
        DuoTabs duoTabs = (DuoTabs) viewRequireViewById;
        duoTabs.j(view.getContext().getString(R.string.lock_screen_tab), view.getContext().getString(R.string.home_screen_tab));
        AbstractC0816i.d(AbstractC1164y.a(lifecycleOwner), null, null, new a(lifecycleOwner, viewModel, duoTabs, null), 3, null);
    }
}
