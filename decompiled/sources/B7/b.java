package B7;

import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.r;
import p089i8.AbstractC1444s;
import p129m8.e;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements B7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final R2.a f391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0880f f392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC0880f f393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC0880f f394e;

    public static final class a implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f395q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ b f396r;

        /* JADX INFO: renamed from: B7.b$a$a, reason: collision with other inner class name */
        public static final class C0017a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f397q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ b f398r;

            /* JADX INFO: renamed from: B7.b$a$a$a, reason: collision with other inner class name */
            public static final class C0018a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f399q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f400r;

                public C0018a(e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f399q = obj;
                    this.f400r |= Integer.MIN_VALUE;
                    return C0017a.this.b(null, this);
                }
            }

            public C0017a(InterfaceC0881g interfaceC0881g, b bVar) {
                this.f397q = interfaceC0881g;
                this.f398r = bVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, e eVar) {
                C0018a c0018a;
                if (eVar instanceof C0018a) {
                    c0018a = (C0018a) eVar;
                    int i10 = c0018a.f400r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0018a.f400r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0018a = new C0018a(eVar);
                    }
                } else {
                    c0018a = new C0018a(eVar);
                }
                Object obj2 = c0018a.f399q;
                Object objE = p139n8.b.e();
                int i11 = c0018a.f400r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f397q;
                    List list = (List) obj;
                    ArrayList arrayList = new ArrayList(AbstractC1444s.u(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(this.f398r.j((R2.a.d) it.next()));
                    }
                    c0018a.f400r = 1;
                    if (interfaceC0881g.b(arrayList, c0018a) == objE) {
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

        public a(InterfaceC0880f interfaceC0880f, b bVar) {
            this.f395q = interfaceC0880f;
            this.f396r = bVar;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, e eVar) {
            Object objA = this.f395q.a(new C0017a(interfaceC0881g, this.f396r), eVar);
            return objA == p139n8.b.e() ? objA : A.f21846a;
        }
    }

    /* JADX INFO: renamed from: B7.b$b, reason: collision with other inner class name */
    public static final class C0019b implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f402q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ b f403r;

        /* JADX INFO: renamed from: B7.b$b$a */
        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f404q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ b f405r;

            /* JADX INFO: renamed from: B7.b$b$a$a, reason: collision with other inner class name */
            public static final class C0020a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f406q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f407r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                Object f408s;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                Object f410u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                Object f411v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                Object f412w;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                Object f413x;

                public C0020a(e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f406q = obj;
                    this.f407r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g, b bVar) {
                this.f404q = interfaceC0881g;
                this.f405r = bVar;
            }

            /* JADX WARN: Code duplicated, block: B:19:0x0074  */
            /* JADX WARN: Code duplicated, block: B:22:0x0093  */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0093 -> B:23:0x0098). Please report as a decompilation issue!!! */
            /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
                java.lang.StackOverflowError
                	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
                	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
                */
            @Override // I8.InterfaceC0881g
            public final java.lang.Object b(java.lang.Object r10, p129m8.e r11) {
                /*
                    r9 = this;
                    boolean r0 = r11 instanceof B7.b.C0019b.a.C0020a
                    if (r0 == 0) goto L13
                    r0 = r11
                    B7.b$b$a$a r0 = (B7.b.C0019b.a.C0020a) r0
                    int r1 = r0.f407r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f407r = r1
                    goto L18
                L13:
                    B7.b$b$a$a r0 = new B7.b$b$a$a
                    r0.<init>(r11)
                L18:
                    java.lang.Object r11 = r0.f406q
                    java.lang.Object r1 = p139n8.b.e()
                    int r2 = r0.f407r
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L52
                    if (r2 == r4) goto L35
                    if (r2 != r3) goto L2d
                    p079h8.r.b(r11)
                    goto Lb7
                L2d:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r10)
                    throw r9
                L35:
                    java.lang.Object r9 = r0.f413x
                    java.util.Collection r9 = (java.util.Collection) r9
                    java.lang.Object r10 = r0.f412w
                    java.util.Iterator r10 = (java.util.Iterator) r10
                    java.lang.Object r2 = r0.f411v
                    java.util.Collection r2 = (java.util.Collection) r2
                    java.lang.Object r5 = r0.f410u
                    I8.g r5 = (I8.InterfaceC0881g) r5
                    java.lang.Object r6 = r0.f408s
                    B7.b$b$a r6 = (B7.b.C0019b.a) r6
                    p079h8.r.b(r11)
                    r8 = r0
                    r0 = r10
                    r10 = r6
                    r6 = r5
                    r5 = r8
                    goto L98
                L52:
                    p079h8.r.b(r11)
                    I8.g r11 = r9.f404q
                    java.util.List r10 = (java.util.List) r10
                    java.lang.Iterable r10 = (java.lang.Iterable) r10
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r5 = 10
                    int r5 = p089i8.AbstractC1444s.u(r10, r5)
                    r2.<init>(r5)
                    java.util.Iterator r10 = r10.iterator()
                    r5 = r11
                    r11 = r10
                    r10 = r9
                L6d:
                    r9 = r2
                    boolean r2 = r11.hasNext()
                    if (r2 == 0) goto La1
                    java.lang.Object r2 = r11.next()
                    R2.a$a r2 = (R2.a.C0252a) r2
                    B7.b r6 = r10.f405r
                    R2.a r7 = B7.b.e(r6)
                    r0.f408s = r10
                    r0.f410u = r5
                    r0.f411v = r9
                    r0.f412w = r11
                    r0.f413x = r9
                    r0.f407r = r4
                    java.lang.Object r2 = B7.b.h(r6, r2, r7, r0)
                    if (r2 != r1) goto L93
                    goto Lb6
                L93:
                    r6 = r5
                    r5 = r0
                    r0 = r11
                    r11 = r2
                    r2 = r9
                L98:
                    C7.a r11 = (C7.a) r11
                    r9.add(r11)
                    r11 = r0
                    r0 = r5
                    r5 = r6
                    goto L6d
                La1:
                    java.util.List r9 = (java.util.List) r9
                    r10 = 0
                    r0.f408s = r10
                    r0.f410u = r10
                    r0.f411v = r10
                    r0.f412w = r10
                    r0.f413x = r10
                    r0.f407r = r3
                    java.lang.Object r9 = r5.b(r9, r0)
                    if (r9 != r1) goto Lb7
                Lb6:
                    return r1
                Lb7:
                    h8.A r9 = p079h8.A.f21846a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: B7.b.C0019b.a.b(java.lang.Object, m8.e):java.lang.Object");
            }
        }

        public C0019b(InterfaceC0880f interfaceC0880f, b bVar) {
            this.f402q = interfaceC0880f;
            this.f403r = bVar;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, e eVar) {
            Object objA = this.f402q.a(new a(interfaceC0881g, this.f403r), eVar);
            return objA == p139n8.b.e() ? objA : A.f21846a;
        }
    }

    public static final class c implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f414q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ b f415r;

        public static final class a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f416q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ b f417r;

            /* JADX INFO: renamed from: B7.b$c$a$a, reason: collision with other inner class name */
            public static final class C0021a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f418q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f419r;

                public C0021a(e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f418q = obj;
                    this.f419r |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(InterfaceC0881g interfaceC0881g, b bVar) {
                this.f416q = interfaceC0881g;
                this.f417r = bVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, e eVar) {
                C0021a c0021a;
                if (eVar instanceof C0021a) {
                    c0021a = (C0021a) eVar;
                    int i10 = c0021a.f419r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0021a.f419r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0021a = new C0021a(eVar);
                    }
                } else {
                    c0021a = new C0021a(eVar);
                }
                Object obj2 = c0021a.f418q;
                Object objE = p139n8.b.e();
                int i11 = c0021a.f419r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f416q;
                    List list = (List) obj;
                    ArrayList arrayList = new ArrayList(AbstractC1444s.u(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(this.f417r.i((R2.a.c) it.next()));
                    }
                    c0021a.f419r = 1;
                    if (interfaceC0881g.b(arrayList, c0021a) == objE) {
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

        public c(InterfaceC0880f interfaceC0880f, b bVar) {
            this.f414q = interfaceC0880f;
            this.f415r = bVar;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, e eVar) {
            Object objA = this.f414q.a(new a(interfaceC0881g, this.f415r), eVar);
            return objA == p139n8.b.e() ? objA : A.f21846a;
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f421q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f422r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f423s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f424t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f425u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f427w;

        d(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f425u = obj;
            this.f427w |= Integer.MIN_VALUE;
            return b.this.k(null, null, this);
        }
    }

    public b(Context context, R2.a client) {
        n.h(context, "context");
        n.h(client, "client");
        this.f390a = context;
        this.f391b = client;
        this.f392c = new a(client.d(), this);
        this.f393d = new C0019b(client.b(), this);
        this.f394e = new c(client.h(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C7.b i(R2.a.c cVar) {
        return new C7.b(cVar.b(), cVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C7.c j(R2.a.d dVar) {
        return new C7.c(dVar.b(), dVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object k(R2.a.C0252a c0252a, R2.a aVar, e eVar) {
        d dVar;
        String str;
        String str2;
        R2.a.C0252a c0252a2;
        String str3;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i10 = dVar.f427w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f427w = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        d dVar2 = dVar;
        Object obj = dVar2.f425u;
        Object objE = p139n8.b.e();
        int i11 = dVar2.f427w;
        if (i11 == 0) {
            r.b(obj);
            String strF = c0252a.f();
            String strG = c0252a.g();
            int iE = c0252a.e();
            dVar2.f421q = c0252a;
            dVar2.f422r = strF;
            dVar2.f423s = strG;
            dVar2.f424t = "";
            dVar2.f427w = 1;
            Object objG = R2.a.g(aVar, iE, 0, dVar2, 2, null);
            if (objG == objE) {
                return objE;
            }
            str = "";
            str2 = strG;
            c0252a2 = c0252a;
            str3 = strF;
            obj = objG;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str4 = (String) dVar2.f424t;
            String str5 = (String) dVar2.f423s;
            String str6 = (String) dVar2.f422r;
            c0252a2 = (R2.a.C0252a) dVar2.f421q;
            r.b(obj);
            str = str4;
            str2 = str5;
            str3 = str6;
        }
        Drawable drawable = (Drawable) obj;
        boolean zH = c0252a2.h();
        String strD = c0252a2.d();
        return new C7.a(str3, str2, str, drawable, false, zH, strD == null ? "" : strD, c0252a2.c(), c0252a2.b(), c0252a2.a());
    }

    @Override // B7.a
    public InterfaceC0880f a() {
        return this.f392c;
    }

    @Override // B7.a
    public InterfaceC0880f b() {
        return this.f393d;
    }

    @Override // B7.a
    public Object c(String str, String str2, e eVar) {
        Object objE = this.f391b.e(str, str2, eVar);
        return objE == p139n8.b.e() ? objE : A.f21846a;
    }

    @Override // B7.a
    public InterfaceC0880f d() {
        return this.f394e;
    }
}
