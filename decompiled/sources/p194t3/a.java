package p194t3;

import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import I8.O;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.n;
import p074h3.InterfaceC1364d;
import p079h8.A;
import p079h8.m;
import p079h8.r;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p184s3.b f27876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p219v8.a f27877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f27878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f27879d;

    /* JADX INFO: renamed from: t3.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0675a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27880a;

        static {
            int[] iArr = new int[InterfaceC1364d.a.values().length];
            try {
                iArr[InterfaceC1364d.a.LOCK_SCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InterfaceC1364d.a.HOME_SCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f27880a = iArr;
        }
    }

    public static final class b implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f27881q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f27882r;

        /* JADX INFO: renamed from: t3.a$b$a, reason: collision with other inner class name */
        public static final class C0676a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f27883q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ int f27884r;

            /* JADX INFO: renamed from: t3.a$b$a$a, reason: collision with other inner class name */
            public static final class C0677a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f27885q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f27886r;

                public C0677a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f27885q = obj;
                    this.f27886r |= Integer.MIN_VALUE;
                    return C0676a.this.b(null, this);
                }
            }

            public C0676a(InterfaceC0881g interfaceC0881g, int i10) {
                this.f27883q = interfaceC0881g;
                this.f27884r = i10;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0677a c0677a;
                if (eVar instanceof C0677a) {
                    c0677a = (C0677a) eVar;
                    int i10 = c0677a.f27886r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0677a.f27886r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0677a = new C0677a(eVar);
                    }
                } else {
                    c0677a = new C0677a(eVar);
                }
                Object obj2 = c0677a.f27885q;
                Object objE = p139n8.b.e();
                int i11 = c0677a.f27886r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f27883q;
                    List listSubList = (List) obj;
                    int size = listSubList.size();
                    int i12 = this.f27884r;
                    if (size > i12) {
                        listSubList = listSubList.subList(0, i12);
                    }
                    c0677a.f27886r = 1;
                    if (interfaceC0881g.b(listSubList, c0677a) == objE) {
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

        public b(InterfaceC0880f interfaceC0880f, int i10) {
            this.f27881q = interfaceC0880f;
            this.f27882r = i10;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f27881q.a(new C0676a(interfaceC0881g, this.f27882r), eVar);
            return objA == p139n8.b.e() ? objA : A.f21846a;
        }
    }

    public static final class c implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f27888q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p204u3.a f27889r;

        /* JADX INFO: renamed from: t3.a$c$a, reason: collision with other inner class name */
        public static final class C0678a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f27890q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ p204u3.a f27891r;

            /* JADX INFO: renamed from: t3.a$c$a$a, reason: collision with other inner class name */
            public static final class C0679a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f27892q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f27893r;

                public C0679a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f27892q = obj;
                    this.f27893r |= Integer.MIN_VALUE;
                    return C0678a.this.b(null, this);
                }
            }

            public C0678a(InterfaceC0881g interfaceC0881g, p204u3.a aVar) {
                this.f27890q = interfaceC0881g;
                this.f27891r = aVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0679a c0679a;
                if (eVar instanceof C0679a) {
                    c0679a = (C0679a) eVar;
                    int i10 = c0679a.f27893r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0679a.f27893r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0679a = new C0679a(eVar);
                    }
                } else {
                    c0679a = new C0679a(eVar);
                }
                Object obj2 = c0679a.f27892q;
                Object objE = p139n8.b.e();
                int i11 = c0679a.f27893r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f27890q;
                    Object obj3 = ((Map) obj).get(this.f27891r);
                    c0679a.f27893r = 1;
                    if (interfaceC0881g.b(obj3, c0679a) == objE) {
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

        public c(InterfaceC0880f interfaceC0880f, p204u3.a aVar) {
            this.f27888q = interfaceC0880f;
            this.f27889r = aVar;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f27888q.a(new C0678a(interfaceC0881g, this.f27889r), eVar);
            return objA == p139n8.b.e() ? objA : A.f21846a;
        }
    }

    public static final class d implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f27895q;

        /* JADX INFO: renamed from: t3.a$d$a, reason: collision with other inner class name */
        public static final class C0680a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f27896q;

            /* JADX INFO: renamed from: t3.a$d$a$a, reason: collision with other inner class name */
            public static final class C0681a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f27897q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f27898r;

                public C0681a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f27897q = obj;
                    this.f27898r |= Integer.MIN_VALUE;
                    return C0680a.this.b(null, this);
                }
            }

            public C0680a(InterfaceC0881g interfaceC0881g) {
                this.f27896q = interfaceC0881g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0681a c0681a;
                if (eVar instanceof C0681a) {
                    c0681a = (C0681a) eVar;
                    int i10 = c0681a.f27898r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0681a.f27898r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0681a = new C0681a(eVar);
                    }
                } else {
                    c0681a = new C0681a(eVar);
                }
                Object obj2 = c0681a.f27897q;
                Object objE = p139n8.b.e();
                int i11 = c0681a.f27898r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f27896q;
                    List list = (List) obj;
                    p204u3.b bVar = list.isEmpty() ? null : (p204u3.b) list.get(0);
                    c0681a.f27898r = 1;
                    if (interfaceC0881g.b(bVar, c0681a) == objE) {
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

        public d(InterfaceC0880f interfaceC0880f) {
            this.f27895q = interfaceC0880f;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f27895q.a(new C0680a(interfaceC0881g), eVar);
            return objA == p139n8.b.e() ? objA : A.f21846a;
        }
    }

    public static final class e implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f27900q;

        /* JADX INFO: renamed from: t3.a$e$a, reason: collision with other inner class name */
        public static final class C0682a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f27901q;

            /* JADX INFO: renamed from: t3.a$e$a$a, reason: collision with other inner class name */
            public static final class C0683a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f27902q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f27903r;

                public C0683a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f27902q = obj;
                    this.f27903r |= Integer.MIN_VALUE;
                    return C0682a.this.b(null, this);
                }
            }

            public C0682a(InterfaceC0881g interfaceC0881g) {
                this.f27901q = interfaceC0881g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0683a c0683a;
                if (eVar instanceof C0683a) {
                    c0683a = (C0683a) eVar;
                    int i10 = c0683a.f27903r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0683a.f27903r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0683a = new C0683a(eVar);
                    }
                } else {
                    c0683a = new C0683a(eVar);
                }
                Object obj2 = c0683a.f27902q;
                Object objE = p139n8.b.e();
                int i11 = c0683a.f27903r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f27901q;
                    List list = (List) obj;
                    p204u3.b bVar = list.isEmpty() ? null : (p204u3.b) list.get(0);
                    c0683a.f27903r = 1;
                    if (interfaceC0881g.b(bVar, c0683a) == objE) {
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

        public e(InterfaceC0880f interfaceC0880f) {
            this.f27900q = interfaceC0880f;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f27900q.a(new C0682a(interfaceC0881g), eVar);
            return objA == p139n8.b.e() ? objA : A.f21846a;
        }
    }

    public a(p184s3.b repository, p219v8.a shouldHandleReload) {
        n.h(repository, "repository");
        n.h(shouldHandleReload, "shouldHandleReload");
        this.f27876a = repository;
        this.f27877b = shouldHandleReload;
        this.f27878c = repository.h();
        this.f27879d = repository.i();
    }

    public final boolean a() {
        return this.f27878c;
    }

    public final int b() {
        return this.f27879d;
    }

    public final p219v8.a c() {
        return this.f27877b;
    }

    public final Object d(String str, long j9, p129m8.e eVar) {
        return this.f27876a.k(str, j9, eVar);
    }

    public final InterfaceC0880f e(p204u3.a destination, int i10) {
        n.h(destination, "destination");
        return new b(this.f27876a.l(destination, i10), i10);
    }

    public final O f(p204u3.a destination) {
        n.h(destination, "destination");
        return this.f27876a.m(destination);
    }

    public final InterfaceC0880f g(p204u3.a destination) {
        n.h(destination, "destination");
        return new c(this.f27876a.j(), destination);
    }

    public final Object h(p204u3.a aVar, String str, p129m8.e eVar) {
        Object objN = this.f27876a.n(aVar, str, eVar);
        return objN == p139n8.b.e() ? objN : A.f21846a;
    }

    public final InterfaceC0880f i(InterfaceC1364d.a screen) {
        n.h(screen, "screen");
        int i10 = C0675a.f27880a[screen.ordinal()];
        if (i10 == 1) {
            return new d(e(p204u3.a.LOCK, 1));
        }
        if (i10 == 2) {
            return new e(e(p204u3.a.HOME, 1));
        }
        throw new m();
    }
}
