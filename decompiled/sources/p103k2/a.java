package p103k2;

import F8.L;
import I8.AbstractC0882h;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import I8.K;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.r;
import p089i8.AbstractC1444s;
import p129m8.e;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final R2.a f22682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L f22683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0880f f22684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC0880f f22685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC0880f f22686e;

    /* JADX INFO: renamed from: k2.a$a, reason: collision with other inner class name */
    public static final class C0570a implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f22687q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ a f22688r;

        /* JADX INFO: renamed from: k2.a$a$a, reason: collision with other inner class name */
        public static final class C0571a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f22689q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ a f22690r;

            /* JADX INFO: renamed from: k2.a$a$a$a, reason: collision with other inner class name */
            public static final class C0572a extends d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f22691q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f22692r;

                public C0572a(e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f22691q = obj;
                    this.f22692r |= Integer.MIN_VALUE;
                    return C0571a.this.b(null, this);
                }
            }

            public C0571a(InterfaceC0881g interfaceC0881g, a aVar) {
                this.f22689q = interfaceC0881g;
                this.f22690r = aVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, e eVar) {
                C0572a c0572a;
                if (eVar instanceof C0572a) {
                    c0572a = (C0572a) eVar;
                    int i10 = c0572a.f22692r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0572a.f22692r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0572a = new C0572a(eVar);
                    }
                } else {
                    c0572a = new C0572a(eVar);
                }
                Object obj2 = c0572a.f22691q;
                Object objE = p139n8.b.e();
                int i11 = c0572a.f22692r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f22689q;
                    List list = (List) obj;
                    ArrayList arrayList = new ArrayList(AbstractC1444s.u(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(this.f22690r.i((R2.a.d) it.next()));
                    }
                    c0572a.f22692r = 1;
                    if (interfaceC0881g.b(arrayList, c0572a) == objE) {
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

        public C0570a(InterfaceC0880f interfaceC0880f, a aVar) {
            this.f22687q = interfaceC0880f;
            this.f22688r = aVar;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, e eVar) {
            Object objA = this.f22687q.a(new C0571a(interfaceC0881g, this.f22688r), eVar);
            return objA == p139n8.b.e() ? objA : A.f21846a;
        }
    }

    public static final class b implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f22694q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ a f22695r;

        /* JADX INFO: renamed from: k2.a$b$a, reason: collision with other inner class name */
        public static final class C0573a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f22696q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ a f22697r;

            /* JADX INFO: renamed from: k2.a$b$a$a, reason: collision with other inner class name */
            public static final class C0574a extends d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f22698q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f22699r;

                public C0574a(e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f22698q = obj;
                    this.f22699r |= Integer.MIN_VALUE;
                    return C0573a.this.b(null, this);
                }
            }

            public C0573a(InterfaceC0881g interfaceC0881g, a aVar) {
                this.f22696q = interfaceC0881g;
                this.f22697r = aVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, e eVar) {
                C0574a c0574a;
                if (eVar instanceof C0574a) {
                    c0574a = (C0574a) eVar;
                    int i10 = c0574a.f22699r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0574a.f22699r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0574a = new C0574a(eVar);
                    }
                } else {
                    c0574a = new C0574a(eVar);
                }
                Object obj2 = c0574a.f22698q;
                Object objE = p139n8.b.e();
                int i11 = c0574a.f22699r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f22696q;
                    List list = (List) obj;
                    ArrayList arrayList = new ArrayList(AbstractC1444s.u(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(this.f22697r.g((R2.a.C0252a) it.next()));
                    }
                    c0574a.f22699r = 1;
                    if (interfaceC0881g.b(arrayList, c0574a) == objE) {
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

        public b(InterfaceC0880f interfaceC0880f, a aVar) {
            this.f22694q = interfaceC0880f;
            this.f22695r = aVar;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, e eVar) {
            Object objA = this.f22694q.a(new C0573a(interfaceC0881g, this.f22695r), eVar);
            return objA == p139n8.b.e() ? objA : A.f21846a;
        }
    }

    public static final class c implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f22701q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ a f22702r;

        /* JADX INFO: renamed from: k2.a$c$a, reason: collision with other inner class name */
        public static final class C0575a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f22703q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ a f22704r;

            /* JADX INFO: renamed from: k2.a$c$a$a, reason: collision with other inner class name */
            public static final class C0576a extends d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f22705q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f22706r;

                public C0576a(e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f22705q = obj;
                    this.f22706r |= Integer.MIN_VALUE;
                    return C0575a.this.b(null, this);
                }
            }

            public C0575a(InterfaceC0881g interfaceC0881g, a aVar) {
                this.f22703q = interfaceC0881g;
                this.f22704r = aVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, e eVar) {
                C0576a c0576a;
                if (eVar instanceof C0576a) {
                    c0576a = (C0576a) eVar;
                    int i10 = c0576a.f22706r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0576a.f22706r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0576a = new C0576a(eVar);
                    }
                } else {
                    c0576a = new C0576a(eVar);
                }
                Object obj2 = c0576a.f22705q;
                Object objE = p139n8.b.e();
                int i11 = c0576a.f22706r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f22703q;
                    List list = (List) obj;
                    ArrayList arrayList = new ArrayList(AbstractC1444s.u(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(this.f22704r.h((R2.a.c) it.next()));
                    }
                    c0576a.f22706r = 1;
                    if (interfaceC0881g.b(arrayList, c0576a) == objE) {
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

        public c(InterfaceC0880f interfaceC0880f, a aVar) {
            this.f22701q = interfaceC0880f;
            this.f22702r = aVar;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, e eVar) {
            Object objA = this.f22701q.a(new C0575a(interfaceC0881g, this.f22702r), eVar);
            return objA == p139n8.b.e() ? objA : A.f21846a;
        }
    }

    public a(R2.a client, L scope) {
        n.h(client, "client");
        n.h(scope, "scope");
        this.f22682a = client;
        this.f22683b = scope;
        this.f22684c = new C0570a(client.d(), this);
        b bVar = new b(client.b(), this);
        K.a aVar = K.f3174a;
        this.f22685d = AbstractC0882h.J(bVar, scope, aVar.d(), 1);
        this.f22686e = AbstractC0882h.J(new c(client.h(), this), scope, aVar.d(), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p123m2.a g(R2.a.C0252a c0252a) {
        String strF = c0252a.f();
        String strG = c0252a.g();
        int iE = c0252a.e();
        boolean zH = c0252a.h();
        String strD = c0252a.d();
        if (strD == null) {
            strD = "";
        }
        return new p123m2.a(strF, strG, iE, zH, strD, c0252a.c(), c0252a.b(), c0252a.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p123m2.b h(R2.a.c cVar) {
        return new p123m2.b(cVar.b(), cVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p123m2.c i(R2.a.d dVar) {
        return new p123m2.c(dVar.b(), dVar.a());
    }

    public final InterfaceC0880f d() {
        return this.f22685d;
    }

    public final InterfaceC0880f e() {
        return this.f22686e;
    }

    public final InterfaceC0880f f() {
        return this.f22684c;
    }
}
