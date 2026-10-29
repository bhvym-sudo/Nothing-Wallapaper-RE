package T2;

import F8.AbstractC0812g;
import F8.I;
import F8.L;
import I8.AbstractC0882h;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import I8.K;
import I8.O;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.r;
import p129m8.e;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L f7590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final I f7591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final X2.a f7592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC0880f f7593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final O f7594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final O f7595f;

    /* JADX INFO: renamed from: T2.a$a, reason: collision with other inner class name */
    public static final class C0275a implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f7596q;

        /* JADX INFO: renamed from: T2.a$a$a, reason: collision with other inner class name */
        public static final class C0276a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f7597q;

            /* JADX INFO: renamed from: T2.a$a$a$a, reason: collision with other inner class name */
            public static final class C0277a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f7598q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f7599r;

                public C0277a(e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f7598q = obj;
                    this.f7599r |= Integer.MIN_VALUE;
                    return C0276a.this.b(null, this);
                }
            }

            public C0276a(InterfaceC0881g interfaceC0881g) {
                this.f7597q = interfaceC0881g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, e eVar) {
                C0277a c0277a;
                if (eVar instanceof C0277a) {
                    c0277a = (C0277a) eVar;
                    int i10 = c0277a.f7599r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0277a.f7599r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0277a = new C0277a(eVar);
                    }
                } else {
                    c0277a = new C0277a(eVar);
                }
                Object obj2 = c0277a.f7598q;
                Object objE = p139n8.b.e();
                int i11 = c0277a.f7599r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f7597q;
                    Boolean boolA = kotlin.coroutines.jvm.internal.b.a(((Number) obj).intValue() == 1);
                    c0277a.f7599r = 1;
                    if (interfaceC0881g.b(boolA, c0277a) == objE) {
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

        public C0275a(InterfaceC0880f interfaceC0880f) {
            this.f7596q = interfaceC0880f;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, e eVar) {
            Object objA = this.f7596q.a(new C0276a(interfaceC0881g), eVar);
            return objA == p139n8.b.e() ? objA : A.f21846a;
        }
    }

    static final class b extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f7601q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f7603s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z9, e eVar) {
            super(2, eVar);
            this.f7603s = z9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return a.this.new b(this.f7603s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, e eVar) {
            return ((b) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f7601q;
            if (i10 == 0) {
                r.b(obj);
                X2.a aVar = a.this.f7592c;
                boolean z9 = this.f7603s;
                this.f7601q = 1;
                if (aVar.c("lock_screen_show_notifications", z9 ? 1 : 0, this) == objE) {
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

    public static final class c implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f7604q;

        /* JADX INFO: renamed from: T2.a$c$a, reason: collision with other inner class name */
        public static final class C0278a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f7605q;

            /* JADX INFO: renamed from: T2.a$c$a$a, reason: collision with other inner class name */
            public static final class C0279a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f7606q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f7607r;

                public C0279a(e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f7606q = obj;
                    this.f7607r |= Integer.MIN_VALUE;
                    return C0278a.this.b(null, this);
                }
            }

            public C0278a(InterfaceC0881g interfaceC0881g) {
                this.f7605q = interfaceC0881g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, e eVar) {
                C0279a c0279a;
                if (eVar instanceof C0279a) {
                    c0279a = (C0279a) eVar;
                    int i10 = c0279a.f7607r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0279a.f7607r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0279a = new C0279a(eVar);
                    }
                } else {
                    c0279a = new C0279a(eVar);
                }
                Object obj2 = c0279a.f7606q;
                Object objE = p139n8.b.e();
                int i11 = c0279a.f7607r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f7605q;
                    Boolean boolA = kotlin.coroutines.jvm.internal.b.a(((Number) obj).intValue() == 1);
                    c0279a.f7607r = 1;
                    if (interfaceC0881g.b(boolA, c0279a) == objE) {
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

        public c(InterfaceC0880f interfaceC0880f) {
            this.f7604q = interfaceC0880f;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, e eVar) {
            Object objA = this.f7604q.a(new C0278a(interfaceC0881g), eVar);
            return objA == p139n8.b.e() ? objA : A.f21846a;
        }
    }

    public static final class d implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f7609q;

        /* JADX INFO: renamed from: T2.a$d$a, reason: collision with other inner class name */
        public static final class C0280a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f7610q;

            /* JADX INFO: renamed from: T2.a$d$a$a, reason: collision with other inner class name */
            public static final class C0281a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f7611q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f7612r;

                public C0281a(e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f7611q = obj;
                    this.f7612r |= Integer.MIN_VALUE;
                    return C0280a.this.b(null, this);
                }
            }

            public C0280a(InterfaceC0881g interfaceC0881g) {
                this.f7610q = interfaceC0881g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, e eVar) {
                C0281a c0281a;
                if (eVar instanceof C0281a) {
                    c0281a = (C0281a) eVar;
                    int i10 = c0281a.f7612r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0281a.f7612r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0281a = new C0281a(eVar);
                    }
                } else {
                    c0281a = new C0281a(eVar);
                }
                Object obj2 = c0281a.f7611q;
                Object objE = p139n8.b.e();
                int i11 = c0281a.f7612r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f7610q;
                    Boolean boolA = kotlin.coroutines.jvm.internal.b.a(((Number) obj).intValue() == 1);
                    c0281a.f7612r = 1;
                    if (interfaceC0881g.b(boolA, c0281a) == objE) {
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
            this.f7609q = interfaceC0880f;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, e eVar) {
            Object objA = this.f7609q.a(new C0280a(interfaceC0881g), eVar);
            return objA == p139n8.b.e() ? objA : A.f21846a;
        }
    }

    public a(L backgroundScope, I backgroundDispatcher, X2.a secureSettingsRepository, X2.d systemSettingsRepository) {
        n.h(backgroundScope, "backgroundScope");
        n.h(backgroundDispatcher, "backgroundDispatcher");
        n.h(secureSettingsRepository, "secureSettingsRepository");
        n.h(systemSettingsRepository, "systemSettingsRepository");
        this.f7590a = backgroundScope;
        this.f7591b = backgroundDispatcher;
        this.f7592c = secureSettingsRepository;
        this.f7593d = AbstractC0882h.o(new c(X2.a.b(secureSettingsRepository, "notification_history_enabled", 0, 2, null)));
        InterfaceC0880f interfaceC0880fD = AbstractC0882h.D(new d(X2.d.b(systemSettingsRepository, "notification_cooldown_enabled", 0, 2, null)), backgroundDispatcher);
        K.a aVar = K.f3174a;
        this.f7594e = AbstractC0882h.K(interfaceC0880fD, backgroundScope, aVar.c(), Boolean.TRUE);
        this.f7595f = AbstractC0882h.K(AbstractC0882h.D(AbstractC0882h.o(X2.a.b(secureSettingsRepository, "zen_duration", 0, 2, null)), backgroundDispatcher), backgroundScope, aVar.c(), -1);
    }

    public final O b() {
        return this.f7594e;
    }

    public final InterfaceC0880f c() {
        return this.f7593d;
    }

    public final Object d(e eVar) {
        return AbstractC0882h.L(AbstractC0882h.D(new C0275a(X2.a.b(this.f7592c, "lock_screen_show_notifications", 0, 2, null)), this.f7591b), this.f7590a, eVar);
    }

    public final Object e(boolean z9, e eVar) {
        Object objG = AbstractC0812g.g(this.f7591b, new b(z9, null), eVar);
        return objG == p139n8.b.e() ? objG : A.f21846a;
    }
}
