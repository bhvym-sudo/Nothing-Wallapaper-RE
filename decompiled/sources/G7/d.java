package G7;

import F8.AbstractC0816i;
import F8.InterfaceC0846x0;
import F8.L;
import I8.AbstractC0882h;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import I8.O;
import androidx.lifecycle.AbstractC1157q;
import androidx.lifecycle.AbstractC1164y;
import androidx.lifecycle.InterfaceC1160u;
import androidx.lifecycle.InterfaceC1163x;
import androidx.lifecycle.N;
import com.nothing.wallpaper.picker.lockscreen.ui.view.E;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC1450a;
import p079h8.A;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f1982a = new d();

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1983a;

        static {
            int[] iArr = new int[AbstractC1157q.a.values().length];
            try {
                iArr[AbstractC1157q.a.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC1157q.a.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC1157q.a.ON_DESTROY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f1983a = iArr;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f1984q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ InterfaceC1163x f1985r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f1986s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ E f1987t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ J7.i f1988u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ S1.a f1989v;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f1990q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private /* synthetic */ Object f1991r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ boolean f1992s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ E f1993t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            final /* synthetic */ J7.i f1994u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ S1.a f1995v;

            /* JADX INFO: renamed from: G7.d$b$a$a, reason: collision with other inner class name */
            static final class C0075a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f1996q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ J7.i f1997r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ S1.a f1998s;

                /* JADX INFO: renamed from: G7.d$b$a$a$a, reason: collision with other inner class name */
                static final class C0076a implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ S1.a f1999q;

                    C0076a(S1.a aVar) {
                        this.f1999q = aVar;
                    }

                    @Override // I8.InterfaceC0881g
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object b(List list, p129m8.e eVar) {
                        S1.a aVar = this.f1999q;
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            aVar.g(((T1.a) it.next()).a());
                        }
                        return A.f21846a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0075a(J7.i iVar, S1.a aVar, p129m8.e eVar) {
                    super(2, eVar);
                    this.f1997r = iVar;
                    this.f1998s = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new C0075a(this.f1997r, this.f1998s, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((C0075a) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f1996q;
                    if (i10 == 0) {
                        p079h8.r.b(obj);
                        O oE = this.f1997r.E();
                        C0076a c0076a = new C0076a(this.f1998s);
                        this.f1996q = 1;
                        if (oE.a(c0076a, this) == objE) {
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

            /* JADX INFO: renamed from: G7.d$b$a$b, reason: collision with other inner class name */
            static final class C0077b extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f2000q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ J7.i f2001r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ E f2002s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ S1.a f2003t;

                /* JADX INFO: renamed from: G7.d$b$a$b$a, reason: collision with other inner class name */
                /* synthetic */ class C0078a extends AbstractC1450a implements p219v8.q {

                    /* JADX INFO: renamed from: x, reason: collision with root package name */
                    public static final C0078a f2004x = new C0078a();

                    C0078a() {
                        super(3, p079h8.o.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
                    }

                    public final Object a(List list, int i10, p129m8.e eVar) {
                        return C0077b.u(list, i10, eVar);
                    }

                    @Override // p219v8.q
                    public /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3) {
                        return a((List) obj, ((Number) obj2).intValue(), (p129m8.e) obj3);
                    }
                }

                /* JADX INFO: renamed from: G7.d$b$a$b$b, reason: collision with other inner class name */
                static final class C0079b implements InterfaceC0881g {

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    final /* synthetic */ E f2005q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    final /* synthetic */ S1.a f2006r;

                    C0079b(E e10, S1.a aVar) {
                        this.f2005q = e10;
                        this.f2006r = aVar;
                    }

                    @Override // I8.InterfaceC0881g
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Object b(p079h8.o oVar, p129m8.e eVar) {
                        this.f2005q.g((List) oVar.a(), ((Number) oVar.b()).intValue(), this.f2006r);
                        return A.f21846a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0077b(J7.i iVar, E e10, S1.a aVar, p129m8.e eVar) {
                    super(2, eVar);
                    this.f2001r = iVar;
                    this.f2002s = e10;
                    this.f2003t = aVar;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final /* synthetic */ Object u(List list, int i10, p129m8.e eVar) {
                    return new p079h8.o(list, kotlin.coroutines.jvm.internal.b.c(i10));
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new C0077b(this.f2001r, this.f2002s, this.f2003t, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((C0077b) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f2000q;
                    if (i10 == 0) {
                        p079h8.r.b(obj);
                        InterfaceC0880f interfaceC0880fL = AbstractC0882h.l(this.f2001r.E(), this.f2001r.X(), C0078a.f2004x);
                        C0079b c0079b = new C0079b(this.f2002s, this.f2003t);
                        this.f2000q = 1;
                        if (interfaceC0880fL.a(c0079b, this) == objE) {
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
            a(boolean z9, E e10, J7.i iVar, S1.a aVar, p129m8.e eVar) {
                super(2, eVar);
                this.f1992s = z9;
                this.f1993t = e10;
                this.f1994u = iVar;
                this.f1995v = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                a aVar = new a(this.f1992s, this.f1993t, this.f1994u, this.f1995v, eVar);
                aVar.f1991r = obj;
                return aVar;
            }

            @Override // p219v8.p
            public final Object invoke(L l9, p129m8.e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f1990q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p079h8.r.b(obj);
                L l9 = (L) this.f1991r;
                AbstractC0816i.d(l9, null, null, new C0075a(this.f1994u, this.f1995v, null), 3, null);
                if (this.f1992s) {
                    d.f1982a.k(l9, this.f1993t, this.f1994u, this.f1995v);
                } else {
                    AbstractC0816i.d(l9, null, null, new C0077b(this.f1994u, this.f1993t, this.f1995v, null), 3, null);
                }
                return A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC1163x interfaceC1163x, boolean z9, E e10, J7.i iVar, S1.a aVar, p129m8.e eVar) {
            super(2, eVar);
            this.f1985r = interfaceC1163x;
            this.f1986s = z9;
            this.f1987t = e10;
            this.f1988u = iVar;
            this.f1989v = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return new b(this.f1985r, this.f1986s, this.f1987t, this.f1988u, this.f1989v, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((b) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f1984q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                InterfaceC1163x interfaceC1163x = this.f1985r;
                AbstractC1157q.b bVar = AbstractC1157q.b.STARTED;
                a aVar = new a(this.f1986s, this.f1987t, this.f1988u, this.f1989v, null);
                this.f1984q = 1;
                if (N.b(interfaceC1163x, bVar, aVar, this) == objE) {
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

    static final class c extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f2007q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ J7.i f2008r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ E f2009s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ S1.a f2010t;

        /* synthetic */ class a extends AbstractC1450a implements p219v8.q {

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public static final a f2011x = new a();

            a() {
                super(3, p079h8.o.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
            }

            public final Object a(List list, int i10, p129m8.e eVar) {
                return c.u(list, i10, eVar);
            }

            @Override // p219v8.q
            public /* bridge */ /* synthetic */ Object e(Object obj, Object obj2, Object obj3) {
                return a((List) obj, ((Number) obj2).intValue(), (p129m8.e) obj3);
            }
        }

        static final class b implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ J7.i f2012q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ E f2013r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ S1.a f2014s;

            static final class a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                Object f2015q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                Object f2016r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                Object f2017s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                /* synthetic */ Object f2018t;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                int f2020v;

                a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f2018t = obj;
                    this.f2020v |= Integer.MIN_VALUE;
                    return b.this.b(null, this);
                }
            }

            b(J7.i iVar, E e10, S1.a aVar) {
                this.f2012q = iVar;
                this.f2013r = e10;
                this.f2014s = aVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object b(p079h8.o oVar, p129m8.e eVar) {
                a aVar;
                b bVar;
                O1.b bVar2;
                String str;
                N1.a aVar2;
                String str2;
                if (eVar instanceof a) {
                    aVar = (a) eVar;
                    int i10 = aVar.f2020v;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        aVar.f2020v = i10 - Integer.MIN_VALUE;
                    } else {
                        aVar = new a(eVar);
                    }
                } else {
                    aVar = new a(eVar);
                }
                Object obj = aVar.f2018t;
                Object objE = p139n8.b.e();
                int i11 = aVar.f2020v;
                if (i11 != 0) {
                    if (i11 == 1) {
                        String str3 = (String) aVar.f2016r;
                        b bVar3 = (b) aVar.f2015q;
                        p079h8.r.b(obj);
                        str = str3;
                        bVar = bVar3;
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        N1.a aVar3 = (N1.a) aVar.f2017s;
                        String str4 = (String) aVar.f2016r;
                        b bVar4 = (b) aVar.f2015q;
                        p079h8.r.b(obj);
                        aVar2 = aVar3;
                        bVar = bVar4;
                        str2 = str4;
                    }
                    bVar2 = new O1.b(str2, aVar2, null, null, null, null, (A7.a) obj, null, 188, null);
                    d dVar = d.f1982a;
                    E e10 = bVar.f2013r;
                    J7.i iVar = bVar.f2012q;
                    dVar.h(e10, iVar, bVar.f2014s, iVar.p0(), bVar2);
                    return A.f21846a;
                }
                p079h8.r.b(obj);
                T1.a aVar4 = (T1.a) ((List) oVar.a()).get(((Number) oVar.b()).intValue());
                com.nothing.wallpaper.common.log.c.k("ClockHostViewBinder", "onClock Changed: " + aVar4);
                O1.b bVar5 = (O1.b) A7.e.f313a.a().get(aVar4.a());
                if (bVar5 == null) {
                    String strA = aVar4.a();
                    InterfaceC0880f interfaceC0880fV = this.f2012q.V();
                    aVar.f2015q = this;
                    aVar.f2016r = strA;
                    aVar.f2020v = 1;
                    Object objX = AbstractC0882h.x(interfaceC0880fV, aVar);
                    if (objX != objE) {
                        str = strA;
                        obj = objX;
                        bVar = this;
                    }
                    return objE;
                }
                bVar = this;
                bVar2 = bVar5;
                d dVar2 = d.f1982a;
                E e11 = bVar.f2013r;
                J7.i iVar2 = bVar.f2012q;
                dVar2.h(e11, iVar2, bVar.f2014s, iVar2.p0(), bVar2);
                return A.f21846a;
                N1.a aVar5 = (N1.a) obj;
                InterfaceC0880f interfaceC0880fT = bVar.f2012q.T();
                aVar.f2015q = bVar;
                aVar.f2016r = str;
                aVar.f2017s = aVar5;
                aVar.f2020v = 2;
                Object objX2 = AbstractC0882h.x(interfaceC0880fT, aVar);
                if (objX2 != objE) {
                    aVar2 = aVar5;
                    obj = objX2;
                    str2 = str;
                    bVar2 = new O1.b(str2, aVar2, null, null, null, null, (A7.a) obj, null, 188, null);
                    d dVar3 = d.f1982a;
                    E e12 = bVar.f2013r;
                    J7.i iVar3 = bVar.f2012q;
                    dVar3.h(e12, iVar3, bVar.f2014s, iVar3.p0(), bVar2);
                    return A.f21846a;
                }
                return objE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(J7.i iVar, E e10, S1.a aVar, p129m8.e eVar) {
            super(2, eVar);
            this.f2008r = iVar;
            this.f2009s = e10;
            this.f2010t = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object u(List list, int i10, p129m8.e eVar) {
            return new p079h8.o(list, kotlin.coroutines.jvm.internal.b.c(i10));
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return new c(this.f2008r, this.f2009s, this.f2010t, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((c) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f2007q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                InterfaceC0880f interfaceC0880fL = AbstractC0882h.l(this.f2008r.E(), this.f2008r.X(), a.f2011x);
                b bVar = new b(this.f2008r, this.f2009s, this.f2010t);
                this.f2007q = 1;
                if (interfaceC0880fL.a(bVar, this) == objE) {
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

    /* JADX INFO: renamed from: G7.d$d, reason: collision with other inner class name */
    static final class C0080d extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f2021q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ J7.i f2022r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ E f2023s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ S1.a f2024t;

        /* JADX INFO: renamed from: G7.d$d$a */
        static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ E f2025q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ J7.i f2026r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ S1.a f2027s;

            a(E e10, J7.i iVar, S1.a aVar) {
                this.f2025q = e10;
                this.f2026r = iVar;
                this.f2027s = aVar;
            }

            @Override // I8.InterfaceC0881g
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object b(p079h8.o oVar, p129m8.e eVar) {
                N1.a aVar = (N1.a) oVar.a();
                A7.a aVar2 = (A7.a) oVar.b();
                d dVar = d.f1982a;
                E e10 = this.f2025q;
                J7.i iVar = this.f2026r;
                dVar.h(e10, iVar, this.f2027s, false, new O1.b((String) iVar.c0().getValue(), aVar, null, null, null, null, aVar2, null, 188, null));
                return A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0080d(J7.i iVar, E e10, S1.a aVar, p129m8.e eVar) {
            super(2, eVar);
            this.f2022r = iVar;
            this.f2023s = e10;
            this.f2024t = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return new C0080d(this.f2022r, this.f2023s, this.f2024t, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((C0080d) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f2021q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                I8.E eK = this.f2022r.K();
                a aVar = new a(this.f2023s, this.f2022r, this.f2024t);
                this.f2021q = 1;
                if (eK.a(aVar, this) == objE) {
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

    static final class e extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f2028q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ J7.i f2029r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ E f2030s;

        static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ J7.i f2031q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ E f2032r;

            /* JADX INFO: renamed from: G7.d$e$a$a, reason: collision with other inner class name */
            static final class C0081a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                Object f2033q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                Object f2034r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                /* synthetic */ Object f2035s;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                int f2037u;

                C0081a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f2035s = obj;
                    this.f2037u |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            a(J7.i iVar, E e10) {
                this.f2031q = iVar;
                this.f2032r = e10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final A i(J7.i iVar, N1.a aVar, O1.b it) {
                kotlin.jvm.internal.n.h(it, "it");
                iVar.s0(aVar, A7.f.SIZE);
                return A.f21846a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final A j(J7.i iVar) {
                iVar.v0();
                return A.f21846a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final A k(J7.i iVar) {
                iVar.u0(A7.f.SIZE);
                return A.f21846a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object b(N1.a aVar, p129m8.e eVar) {
                C0081a c0081a;
                if (eVar instanceof C0081a) {
                    c0081a = (C0081a) eVar;
                    int i10 = c0081a.f2037u;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0081a.f2037u = i10 - Integer.MIN_VALUE;
                    } else {
                        c0081a = new C0081a(eVar);
                    }
                } else {
                    c0081a = new C0081a(eVar);
                }
                Object objX = c0081a.f2035s;
                Object objE = p139n8.b.e();
                int i11 = c0081a.f2037u;
                if (i11 == 0) {
                    p079h8.r.b(objX);
                    if (this.f2031q.p0()) {
                        return A.f21846a;
                    }
                    InterfaceC0880f interfaceC0880fT = this.f2031q.T();
                    c0081a.f2033q = this;
                    c0081a.f2034r = aVar;
                    c0081a.f2037u = 1;
                    objX = AbstractC0882h.x(interfaceC0880fT, c0081a);
                    if (objX == objE) {
                        return objE;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (N1.a) c0081a.f2034r;
                    this = (a) c0081a.f2033q;
                    p079h8.r.b(objX);
                }
                final N1.a aVar2 = aVar;
                E e10 = this.f2032r;
                final J7.i iVar = this.f2031q;
                p219v8.l lVar = new p219v8.l() { // from class: G7.e
                    @Override // p219v8.l
                    public final Object f(Object obj) {
                        return d.e.a.i(iVar, aVar2, (O1.b) obj);
                    }
                };
                final J7.i iVar2 = this.f2031q;
                p219v8.a aVar3 = new p219v8.a() { // from class: G7.f
                    @Override // p219v8.a
                    public final Object invoke() {
                        return d.e.a.j(iVar2);
                    }
                };
                final J7.i iVar3 = this.f2031q;
                e10.i(aVar2, (A7.a) objX, lVar, aVar3, new p219v8.a() { // from class: G7.g
                    @Override // p219v8.a
                    public final Object invoke() {
                        return d.e.a.k(iVar3);
                    }
                });
                return A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(J7.i iVar, E e10, p129m8.e eVar) {
            super(2, eVar);
            this.f2029r = iVar;
            this.f2030s = e10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return new e(this.f2029r, this.f2030s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((e) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f2028q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                InterfaceC0880f interfaceC0880fV = this.f2029r.V();
                a aVar = new a(this.f2029r, this.f2030s);
                this.f2028q = 1;
                if (interfaceC0880fV.a(aVar, this) == objE) {
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

    static final class f extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f2038q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ J7.i f2039r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ E f2040s;

        static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ J7.i f2041q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ E f2042r;

            /* JADX INFO: renamed from: G7.d$f$a$a, reason: collision with other inner class name */
            static final class C0082a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                Object f2043q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                Object f2044r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                /* synthetic */ Object f2045s;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                int f2047u;

                C0082a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f2045s = obj;
                    this.f2047u |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            a(J7.i iVar, E e10) {
                this.f2041q = iVar;
                this.f2042r = e10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final A f(J7.i iVar, O1.b it) {
                kotlin.jvm.internal.n.h(it, "it");
                iVar.v0();
                return A.f21846a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final A i(J7.i iVar) {
                iVar.u0(A7.f.ALIGN);
                return A.f21846a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Object b(A7.a aVar, p129m8.e eVar) {
                C0082a c0082a;
                if (eVar instanceof C0082a) {
                    c0082a = (C0082a) eVar;
                    int i10 = c0082a.f2047u;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0082a.f2047u = i10 - Integer.MIN_VALUE;
                    } else {
                        c0082a = new C0082a(eVar);
                    }
                } else {
                    c0082a = new C0082a(eVar);
                }
                Object objX = c0082a.f2045s;
                Object objE = p139n8.b.e();
                int i11 = c0082a.f2047u;
                if (i11 == 0) {
                    p079h8.r.b(objX);
                    if (this.f2041q.p0()) {
                        return A.f21846a;
                    }
                    InterfaceC0880f interfaceC0880fV = this.f2041q.V();
                    c0082a.f2043q = this;
                    c0082a.f2044r = aVar;
                    c0082a.f2047u = 1;
                    objX = AbstractC0882h.x(interfaceC0880fV, c0082a);
                    if (objX == objE) {
                        return objE;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (A7.a) c0082a.f2044r;
                    this = (a) c0082a.f2043q;
                    p079h8.r.b(objX);
                }
                E e10 = this.f2042r;
                final J7.i iVar = this.f2041q;
                p219v8.l lVar = new p219v8.l() { // from class: G7.h
                    @Override // p219v8.l
                    public final Object f(Object obj) {
                        return d.f.a.f(iVar, (O1.b) obj);
                    }
                };
                final J7.i iVar2 = this.f2041q;
                e10.e(aVar, (N1.a) objX, lVar, new p219v8.a() { // from class: G7.i
                    @Override // p219v8.a
                    public final Object invoke() {
                        return d.f.a.i(iVar2);
                    }
                });
                return A.f21846a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(J7.i iVar, E e10, p129m8.e eVar) {
            super(2, eVar);
            this.f2039r = iVar;
            this.f2040s = e10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return new f(this.f2039r, this.f2040s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((f) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f2038q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                InterfaceC0880f interfaceC0880fT = this.f2039r.T();
                a aVar = new a(this.f2039r, this.f2040s);
                this.f2038q = 1;
                if (interfaceC0880fT.a(aVar, this) == objE) {
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

    private d() {
    }

    public static final void f(E hostView, J7.i lockViewModel, final S1.a clockViewFactory, InterfaceC1163x lifecycleOwner) {
        kotlin.jvm.internal.n.h(hostView, "hostView");
        kotlin.jvm.internal.n.h(lockViewModel, "lockViewModel");
        kotlin.jvm.internal.n.h(clockViewFactory, "clockViewFactory");
        kotlin.jvm.internal.n.h(lifecycleOwner, "lifecycleOwner");
        clockViewFactory.c();
        AbstractC0816i.d(AbstractC1164y.a(lifecycleOwner), null, null, new b(lifecycleOwner, p087i6.e.j(), hostView, lockViewModel, clockViewFactory, null), 3, null);
        lifecycleOwner.getLifecycle().a(new InterfaceC1160u() { // from class: G7.a
            @Override // androidx.lifecycle.InterfaceC1160u
            public final void onStateChanged(InterfaceC1163x interfaceC1163x, AbstractC1157q.a aVar) {
                d.g(clockViewFactory, interfaceC1163x, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(S1.a aVar, InterfaceC1163x source, AbstractC1157q.a event) {
        kotlin.jvm.internal.n.h(source, "source");
        kotlin.jvm.internal.n.h(event, "event");
        int i10 = a.f1983a[event.ordinal()];
        if (i10 == 1) {
            aVar.e(source);
        } else if (i10 == 2) {
            aVar.i(source);
        } else {
            if (i10 != 3) {
                return;
            }
            aVar.onDestroy();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(E e10, final J7.i iVar, S1.a aVar, final boolean z9, O1.b bVar) {
        e10.a(z9, bVar, aVar, new p219v8.l() { // from class: G7.b
            @Override // p219v8.l
            public final Object f(Object obj) {
                return d.i(z9, iVar, (O1.b) obj);
            }
        }, new p219v8.a() { // from class: G7.c
            @Override // p219v8.a
            public final Object invoke() {
                return d.j(z9, iVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A i(boolean z9, J7.i iVar, O1.b it) {
        kotlin.jvm.internal.n.h(it, "it");
        if (z9) {
            iVar.v0();
        }
        N1.a aVarF = it.f();
        kotlin.jvm.internal.n.e(aVarF);
        iVar.s0(aVarF, A7.f.SWITCH);
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A j(boolean z9, J7.i iVar) {
        if (z9) {
            iVar.u0(A7.f.SWITCH);
        }
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC0846x0 k(L l9, E e10, J7.i iVar, S1.a aVar) {
        AbstractC0816i.d(l9, null, null, new c(iVar, e10, aVar, null), 3, null);
        AbstractC0816i.d(l9, null, null, new C0080d(iVar, e10, aVar, null), 3, null);
        AbstractC0816i.d(l9, null, null, new e(iVar, e10, null), 3, null);
        return AbstractC0816i.d(l9, null, null, new f(iVar, e10, null), 3, null);
    }
}
