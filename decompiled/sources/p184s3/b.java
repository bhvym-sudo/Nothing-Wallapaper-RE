package p184s3;

import F8.AbstractC0812g;
import F8.I;
import F8.L;
import I8.A;
import I8.AbstractC0882h;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import I8.K;
import I8.O;
import I8.Q;
import android.graphics.Bitmap;
import android.util.LruCache;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p074h3.W;
import p079h8.h;
import p079h8.i;
import p079h8.r;
import p089i8.AbstractC1444s;
import p089i8.N;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f27690j = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L f27691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p174r3.a f27692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final W f27693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final I f27694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f27695e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final LruCache f27696f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final h f27697g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final A f27698h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final O f27699i;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: s3.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C0667b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27700a;

        static {
            int[] iArr = new int[p204u3.a.values().length];
            try {
                iArr[p204u3.a.HOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p204u3.a.LOCK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f27700a = iArr;
        }
    }

    static final class c extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f27701q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ String f27703s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f27704t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, String str2, p129m8.e eVar) {
            super(2, eVar);
            this.f27703s = str;
            this.f27704t = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return b.this.new c(this.f27703s, this.f27704t, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((c) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f27701q;
            if (i10 == 0) {
                r.b(obj);
                p174r3.a aVar = b.this.f27692b;
                String str = this.f27703s;
                this.f27701q = 1;
                obj = aVar.d(str, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null) {
                b.this.f27696f.put(this.f27704t, bitmap);
            }
            return bitmap;
        }
    }

    public static final class d implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f27705q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ b f27706r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ p204u3.a f27707s;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f27708q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ b f27709r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ p204u3.a f27710s;

            /* JADX INFO: renamed from: s3.b$d$a$a, reason: collision with other inner class name */
            public static final class C0668a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f27711q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f27712r;

                public C0668a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f27711q = obj;
                    this.f27712r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g, b bVar, p204u3.a aVar) {
                this.f27708q = interfaceC0881g;
                this.f27709r = bVar;
                this.f27710s = aVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0668a c0668a;
                if (eVar instanceof C0668a) {
                    c0668a = (C0668a) eVar;
                    int i10 = c0668a.f27712r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0668a.f27712r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0668a = new C0668a(eVar);
                    }
                } else {
                    c0668a = new C0668a(eVar);
                }
                Object obj2 = c0668a.f27711q;
                Object objE = p139n8.b.e();
                int i11 = c0668a.f27712r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f27708q;
                    String strG = this.f27709r.g(this.f27710s, (List) obj);
                    c0668a.f27712r = 1;
                    if (interfaceC0881g.b(strG, c0668a) == objE) {
                        return objE;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj2);
                }
                return p079h8.A.f21846a;
            }
        }

        public d(InterfaceC0880f interfaceC0880f, b bVar, p204u3.a aVar) {
            this.f27705q = interfaceC0880f;
            this.f27706r = bVar;
            this.f27707s = aVar;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f27705q.a(new a(interfaceC0881g, this.f27706r, this.f27707s), eVar);
            return objA == p139n8.b.e() ? objA : p079h8.A.f21846a;
        }
    }

    static final class e extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f27714q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ p204u3.a f27716s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f27717t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(p204u3.a aVar, String str, p129m8.e eVar) {
            super(2, eVar);
            this.f27716s = aVar;
            this.f27717t = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p079h8.A u(b bVar, p204u3.a aVar) {
            A a10 = bVar.f27698h;
            Map mapR = N.r((Map) bVar.f27698h.getValue());
            mapR.put(aVar, null);
            a10.setValue(mapR);
            return p079h8.A.f21846a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return b.this.new e(this.f27716s, this.f27717t, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((e) create(l9, eVar)).invokeSuspend(p079h8.A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f27714q;
            if (i10 == 0) {
                r.b(obj);
                p174r3.a aVar = b.this.f27692b;
                final p204u3.a aVar2 = this.f27716s;
                String str = this.f27717t;
                final b bVar = b.this;
                p219v8.a aVar3 = new p219v8.a() { // from class: s3.c
                    @Override // p219v8.a
                    public final Object invoke() {
                        return b.e.u(bVar, aVar2);
                    }
                };
                this.f27714q = 1;
                if (aVar.a(aVar2, str, aVar3, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return p079h8.A.f21846a;
        }
    }

    public b(L scope, p174r3.a client, W wallpaperPreferences, I backgroundDispatcher) {
        n.h(scope, "scope");
        n.h(client, "client");
        n.h(wallpaperPreferences, "wallpaperPreferences");
        n.h(backgroundDispatcher, "backgroundDispatcher");
        this.f27691a = scope;
        this.f27692b = client;
        this.f27693c = wallpaperPreferences;
        this.f27694d = backgroundDispatcher;
        this.f27695e = 5;
        this.f27696f = new LruCache(5);
        this.f27697g = i.b(new p219v8.a() { // from class: s3.a
            @Override // p219v8.a
            public final Object invoke() {
                return Boolean.valueOf(b.f(this.f27689q));
            }
        });
        A a10 = Q.a(N.g());
        this.f27698h = a10;
        this.f27699i = AbstractC0882h.b(a10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(b bVar) {
        return bVar.f27692b.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String g(p204u3.a aVar, List list) {
        String strD0;
        p204u3.b bVar;
        int i10 = C0667b.f27700a[aVar.ordinal()];
        if (i10 == 1) {
            strD0 = this.f27693c.d0();
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("Unsupported destination");
            }
            strD0 = this.f27693c.c();
        }
        if (strD0 != null) {
            return strD0;
        }
        String strC = (list == null || (bVar = (p204u3.b) AbstractC1444s.U(list)) == null) ? null : bVar.c();
        return strC == null ? "default_missing_key" : strC;
    }

    public final boolean h() {
        return ((Boolean) this.f27697g.getValue()).booleanValue();
    }

    public final int i() {
        return this.f27695e;
    }

    public final O j() {
        return this.f27699i;
    }

    public final Object k(String str, long j9, p129m8.e eVar) {
        String str2 = str + "-" + j9;
        Bitmap bitmap = (Bitmap) this.f27696f.get(str2);
        return bitmap == null ? AbstractC0812g.g(this.f27694d, new c(str, str2, null), eVar) : bitmap;
    }

    public final InterfaceC0880f l(p204u3.a destination, int i10) {
        n.h(destination, "destination");
        return AbstractC0882h.D(this.f27692b.b(destination, i10), this.f27694d);
    }

    public final O m(p204u3.a destination) {
        n.h(destination, "destination");
        return AbstractC0882h.K(AbstractC0882h.D(new d(this.f27692b.b(destination, 1), this, destination), this.f27694d), this.f27691a, K.a.b(K.f3174a, 0L, 0L, 3, null), g(destination, null));
    }

    public final Object n(p204u3.a aVar, String str, p129m8.e eVar) {
        A a10 = this.f27698h;
        Map mapR = N.r((Map) a10.getValue());
        mapR.put(aVar, str);
        a10.setValue(mapR);
        Object objG = AbstractC0812g.g(this.f27694d, new e(aVar, str, null), eVar);
        return objG == p139n8.b.e() ? objG : p079h8.A.f21846a;
    }
}
