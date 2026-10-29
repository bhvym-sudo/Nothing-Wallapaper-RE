package G7;

import F8.AbstractC0816i;
import F8.L;
import I8.AbstractC0882h;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import I8.O;
import android.view.View;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.picker.lockscreen.ui.view.ClockSnapshotListView;
import java.util.ArrayList;
import java.util.List;
import p079h8.A;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f2073a = new n();

    public static final class a implements View.OnClickListener {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ J7.i f2074q;

        a(J7.i iVar) {
            this.f2074q = iVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v9) {
            kotlin.jvm.internal.n.h(v9, "v");
            if (this.f2074q.n0()) {
                return;
            }
            Object tag = v9.getTag();
            T1.a aVar = tag instanceof T1.a ? (T1.a) tag : null;
            if (aVar == null) {
                return;
            }
            this.f2074q.W0(aVar.a());
            if (A7.d.f308a.h(aVar.a())) {
                this.f2074q.t0();
            }
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f2075q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f2076r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ J7.i f2077s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ClockSnapshotListView f2078t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ S1.a f2079u;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f2080q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ J7.i f2081r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ ClockSnapshotListView f2082s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ S1.a f2083t;

            /* JADX INFO: renamed from: G7.n$b$a$a, reason: collision with other inner class name */
            static final class C0084a implements InterfaceC0881g {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                final /* synthetic */ J7.i f2084q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ ClockSnapshotListView f2085r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ S1.a f2086s;

                /* JADX INFO: renamed from: G7.n$b$a$a$a, reason: collision with other inner class name */
                static final class C0085a extends kotlin.coroutines.jvm.internal.d {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    Object f2087q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    Object f2088r;

                    /* JADX INFO: renamed from: s, reason: collision with root package name */
                    /* synthetic */ Object f2089s;

                    /* JADX INFO: renamed from: u, reason: collision with root package name */
                    int f2091u;

                    C0085a(p129m8.e eVar) {
                        super(eVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.f2089s = obj;
                        this.f2091u |= Integer.MIN_VALUE;
                        return C0084a.this.b(null, this);
                    }
                }

                C0084a(J7.i iVar, ClockSnapshotListView clockSnapshotListView, S1.a aVar) {
                    this.f2084q = iVar;
                    this.f2085r = clockSnapshotListView;
                    this.f2086s = aVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // I8.InterfaceC0881g
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object b(List list, p129m8.e eVar) {
                    C0085a c0085a;
                    if (eVar instanceof C0085a) {
                        c0085a = (C0085a) eVar;
                        int i10 = c0085a.f2091u;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            c0085a.f2091u = i10 - Integer.MIN_VALUE;
                        } else {
                            c0085a = new C0085a(eVar);
                        }
                    } else {
                        c0085a = new C0085a(eVar);
                    }
                    Object objX = c0085a.f2089s;
                    Object objE = p139n8.b.e();
                    int i11 = c0085a.f2091u;
                    if (i11 == 0) {
                        p079h8.r.b(objX);
                        InterfaceC0880f interfaceC0880fU = this.f2084q.U();
                        c0085a.f2087q = this;
                        c0085a.f2088r = list;
                        c0085a.f2091u = 1;
                        objX = AbstractC0882h.x(interfaceC0880fU, c0085a);
                        if (objX == objE) {
                            return objE;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        list = (List) c0085a.f2088r;
                        this = (C0084a) c0085a.f2087q;
                        p079h8.r.b(objX);
                    }
                    String str = (String) objX;
                    List list2 = list;
                    ClockSnapshotListView clockSnapshotListView = this.f2085r;
                    ArrayList arrayList = new ArrayList(AbstractC1444s.u(list2, 10));
                    int i12 = 0;
                    for (Object obj : list2) {
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            AbstractC1444s.t();
                        }
                        T1.a aVar = (T1.a) obj;
                        arrayList.add(new T1.a(aVar.a(), kotlin.jvm.internal.n.d(aVar.a(), str), clockSnapshotListView.getResources().getString(R.string.nt_clock_face_style) + i13));
                        i12 = i13;
                    }
                    this.f2085r.i(arrayList, this.f2086s);
                    return A.f21846a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(J7.i iVar, ClockSnapshotListView clockSnapshotListView, S1.a aVar, p129m8.e eVar) {
                super(2, eVar);
                this.f2081r = iVar;
                this.f2082s = clockSnapshotListView;
                this.f2083t = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new a(this.f2081r, this.f2082s, this.f2083t, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f2080q;
                if (i10 == 0) {
                    p079h8.r.b(obj);
                    O oE = this.f2081r.E();
                    C0084a c0084a = new C0084a(this.f2081r, this.f2082s, this.f2083t);
                    this.f2080q = 1;
                    if (oE.a(c0084a, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p079h8.r.b(obj);
                }
                throw new p079h8.f();
            }
        }

        /* JADX INFO: renamed from: G7.n$b$b, reason: collision with other inner class name */
        static final class C0086b extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f2092q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ J7.i f2093r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ ClockSnapshotListView f2094s;

            /* JADX INFO: renamed from: G7.n$b$b$a */
            static final class a implements InterfaceC0881g {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                final /* synthetic */ ClockSnapshotListView f2095q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ J7.i f2096r;

                a(ClockSnapshotListView clockSnapshotListView, J7.i iVar) {
                    this.f2095q = clockSnapshotListView;
                    this.f2096r = iVar;
                }

                public final Object a(int i10, p129m8.e eVar) {
                    this.f2095q.l(i10, this.f2096r.p0());
                    return A.f21846a;
                }

                @Override // I8.InterfaceC0881g
                public /* bridge */ /* synthetic */ Object b(Object obj, p129m8.e eVar) {
                    return a(((Number) obj).intValue(), eVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0086b(J7.i iVar, ClockSnapshotListView clockSnapshotListView, p129m8.e eVar) {
                super(2, eVar);
                this.f2093r = iVar;
                this.f2094s = clockSnapshotListView;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                return new C0086b(this.f2093r, this.f2094s, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((C0086b) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f2092q;
                if (i10 == 0) {
                    p079h8.r.b(obj);
                    InterfaceC0880f interfaceC0880fX = this.f2093r.X();
                    a aVar = new a(this.f2094s, this.f2093r);
                    this.f2092q = 1;
                    if (interfaceC0880fX.a(aVar, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p079h8.r.b(obj);
                }
                return A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(J7.i iVar, ClockSnapshotListView clockSnapshotListView, S1.a aVar, p129m8.e eVar) {
            super(2, eVar);
            this.f2077s = iVar;
            this.f2078t = clockSnapshotListView;
            this.f2079u = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            b bVar = new b(this.f2077s, this.f2078t, this.f2079u, eVar);
            bVar.f2076r = obj;
            return bVar;
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((b) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f2075q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            L l9 = (L) this.f2076r;
            AbstractC0816i.d(l9, null, null, new a(this.f2077s, this.f2078t, this.f2079u, null), 3, null);
            AbstractC0816i.d(l9, null, null, new C0086b(this.f2077s, this.f2078t, null), 3, null);
            return A.f21846a;
        }
    }

    private n() {
    }

    public static final void a(ClockSnapshotListView listView, J7.i viewModel, S1.a clockViewFactory, L coroutineScope) {
        kotlin.jvm.internal.n.h(listView, "listView");
        kotlin.jvm.internal.n.h(viewModel, "viewModel");
        kotlin.jvm.internal.n.h(clockViewFactory, "clockViewFactory");
        kotlin.jvm.internal.n.h(coroutineScope, "coroutineScope");
        listView.setOnClockItemClickListener(new a(viewModel));
        AbstractC0816i.d(coroutineScope, null, null, new b(viewModel, listView, clockViewFactory, null), 3, null);
    }
}
