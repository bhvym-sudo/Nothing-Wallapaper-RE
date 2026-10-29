package X2;

import F8.AbstractC0812g;
import F8.I;
import F8.L;
import H8.t;
import I8.AbstractC0882h;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.provider.Settings;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.r;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
public final class b implements X2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ContentResolver f8931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final I f8932b;

    public static final class a implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f8933q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ b f8934r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ String f8935s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f8936t;

        /* JADX INFO: renamed from: X2.b$a$a, reason: collision with other inner class name */
        public static final class C0316a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f8937q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ b f8938r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ String f8939s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ int f8940t;

            /* JADX INFO: renamed from: X2.b$a$a$a, reason: collision with other inner class name */
            public static final class C0317a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f8941q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f8942r;

                public C0317a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f8941q = obj;
                    this.f8942r |= Integer.MIN_VALUE;
                    return C0316a.this.b(null, this);
                }
            }

            public C0316a(InterfaceC0881g interfaceC0881g, b bVar, String str, int i10) {
                this.f8937q = interfaceC0881g;
                this.f8938r = bVar;
                this.f8939s = str;
                this.f8940t = i10;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0317a c0317a;
                if (eVar instanceof C0317a) {
                    c0317a = (C0317a) eVar;
                    int i10 = c0317a.f8942r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0317a.f8942r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0317a = new C0317a(eVar);
                    }
                } else {
                    c0317a = new C0317a(eVar);
                }
                Object obj2 = c0317a.f8941q;
                Object objE = p139n8.b.e();
                int i11 = c0317a.f8942r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f8937q;
                    Integer numC = kotlin.coroutines.jvm.internal.b.c(Settings.Secure.getInt(this.f8938r.f8931a, this.f8939s, this.f8940t));
                    c0317a.f8942r = 1;
                    if (interfaceC0881g.b(numC, c0317a) == objE) {
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

        public a(InterfaceC0880f interfaceC0880f, b bVar, String str, int i10) {
            this.f8933q = interfaceC0880f;
            this.f8934r = bVar;
            this.f8935s = str;
            this.f8936t = i10;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f8933q.a(new C0316a(interfaceC0881g, this.f8934r, this.f8935s, this.f8936t), eVar);
            return objA == p139n8.b.e() ? objA : A.f21846a;
        }
    }

    /* JADX INFO: renamed from: X2.b$b, reason: collision with other inner class name */
    static final class C0318b extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f8944q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f8945r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f8946s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ String f8948u;

        /* JADX INFO: renamed from: X2.b$b$a */
        public static final class a extends ContentObserver {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ t f8949a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(t tVar) {
                super(null);
                this.f8949a = tVar;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z9) {
                this.f8949a.p(A.f21846a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0318b(String str, p129m8.e eVar) {
            super(2, eVar);
            this.f8948u = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final A v(b bVar, a aVar) {
            bVar.f8931a.unregisterContentObserver(aVar);
            return A.f21846a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            C0318b c0318b = b.this.new C0318b(this.f8948u, eVar);
            c0318b.f8946s = obj;
            return c0318b;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0064, code lost:
        
            if (H8.r.a(r3, r4, r7) == r0) goto L16;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = p139n8.b.e()
                int r1 = r7.f8945r
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                p079h8.r.b(r8)
                goto L67
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L1a:
                java.lang.Object r1 = r7.f8944q
                X2.b$b$a r1 = (X2.b.C0318b.a) r1
                java.lang.Object r3 = r7.f8946s
                H8.t r3 = (H8.t) r3
                p079h8.r.b(r8)
                goto L52
            L26:
                p079h8.r.b(r8)
                java.lang.Object r8 = r7.f8946s
                H8.t r8 = (H8.t) r8
                X2.b$b$a r1 = new X2.b$b$a
                r1.<init>(r8)
                X2.b r4 = X2.b.this
                android.content.ContentResolver r4 = X2.b.d(r4)
                java.lang.String r5 = r7.f8948u
                android.net.Uri r5 = android.provider.Settings.Secure.getUriFor(r5)
                r6 = 0
                r4.registerContentObserver(r5, r6, r1)
                h8.A r4 = p079h8.A.f21846a
                r7.f8946s = r8
                r7.f8944q = r1
                r7.f8945r = r3
                java.lang.Object r3 = r8.n(r4, r7)
                if (r3 != r0) goto L51
                goto L66
            L51:
                r3 = r8
            L52:
                X2.b r8 = X2.b.this
                X2.c r4 = new X2.c
                r4.<init>()
                r8 = 0
                r7.f8946s = r8
                r7.f8944q = r8
                r7.f8945r = r2
                java.lang.Object r7 = H8.r.a(r3, r4, r7)
                if (r7 != r0) goto L67
            L66:
                return r0
            L67:
                h8.A r7 = p079h8.A.f21846a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: X2.b.C0318b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p219v8.p
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object invoke(t tVar, p129m8.e eVar) {
            return ((C0318b) create(tVar, eVar)).invokeSuspend(A.f21846a);
        }
    }

    static final class c extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f8950q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ String f8952s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f8953t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, int i10, p129m8.e eVar) {
            super(2, eVar);
            this.f8952s = str;
            this.f8953t = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return b.this.new c(this.f8952s, this.f8953t, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((c) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f8950q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            return kotlin.coroutines.jvm.internal.b.a(Settings.Secure.putInt(b.this.f8931a, this.f8952s, this.f8953t));
        }
    }

    public b(ContentResolver contentResolver, I backgroundDispatcher) {
        n.h(contentResolver, "contentResolver");
        n.h(backgroundDispatcher, "backgroundDispatcher");
        this.f8931a = contentResolver;
        this.f8932b = backgroundDispatcher;
    }

    @Override // X2.a
    public InterfaceC0880f a(String name, int i10) {
        n.h(name, "name");
        return AbstractC0882h.D(new a(AbstractC0882h.e(new C0318b(name, null)), this, name, i10), this.f8932b);
    }

    @Override // X2.a
    public Object c(String str, int i10, p129m8.e eVar) {
        Object objG = AbstractC0812g.g(this.f8932b, new c(str, i10, null), eVar);
        return objG == p139n8.b.e() ? objG : A.f21846a;
    }
}
