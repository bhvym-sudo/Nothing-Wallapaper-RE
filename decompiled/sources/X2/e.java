package X2;

import F8.I;
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
public final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ContentResolver f8956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final I f8957b;

    public static final class a implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f8958q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ e f8959r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ String f8960s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f8961t;

        /* JADX INFO: renamed from: X2.e$a$a, reason: collision with other inner class name */
        public static final class C0319a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f8962q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ e f8963r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ String f8964s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ int f8965t;

            /* JADX INFO: renamed from: X2.e$a$a$a, reason: collision with other inner class name */
            public static final class C0320a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f8966q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f8967r;

                public C0320a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f8966q = obj;
                    this.f8967r |= Integer.MIN_VALUE;
                    return C0319a.this.b(null, this);
                }
            }

            public C0319a(InterfaceC0881g interfaceC0881g, e eVar, String str, int i10) {
                this.f8962q = interfaceC0881g;
                this.f8963r = eVar;
                this.f8964s = str;
                this.f8965t = i10;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // I8.InterfaceC0881g
            public final Object b(Object obj, p129m8.e eVar) {
                C0320a c0320a;
                if (eVar instanceof C0320a) {
                    c0320a = (C0320a) eVar;
                    int i10 = c0320a.f8967r;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0320a.f8967r = i10 - Integer.MIN_VALUE;
                    } else {
                        c0320a = new C0320a(eVar);
                    }
                } else {
                    c0320a = new C0320a(eVar);
                }
                Object obj2 = c0320a.f8966q;
                Object objE = p139n8.b.e();
                int i11 = c0320a.f8967r;
                if (i11 == 0) {
                    r.b(obj2);
                    InterfaceC0881g interfaceC0881g = this.f8962q;
                    Integer numC = kotlin.coroutines.jvm.internal.b.c(Settings.System.getInt(this.f8963r.f8956a, this.f8964s, this.f8965t));
                    c0320a.f8967r = 1;
                    if (interfaceC0881g.b(numC, c0320a) == objE) {
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

        public a(InterfaceC0880f interfaceC0880f, e eVar, String str, int i10) {
            this.f8958q = interfaceC0880f;
            this.f8959r = eVar;
            this.f8960s = str;
            this.f8961t = i10;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f8958q.a(new C0319a(interfaceC0881g, this.f8959r, this.f8960s, this.f8961t), eVar);
            return objA == p139n8.b.e() ? objA : A.f21846a;
        }
    }

    static final class b extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f8969q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f8970r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f8971s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ String f8973u;

        public static final class a extends ContentObserver {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ t f8974a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(t tVar) {
                super(null);
                this.f8974a = tVar;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z9) {
                this.f8974a.p(A.f21846a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, p129m8.e eVar) {
            super(2, eVar);
            this.f8973u = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final A v(e eVar, a aVar) {
            eVar.f8956a.unregisterContentObserver(aVar);
            return A.f21846a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            b bVar = e.this.new b(this.f8973u, eVar);
            bVar.f8971s = obj;
            return bVar;
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
                int r1 = r7.f8970r
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
                java.lang.Object r1 = r7.f8969q
                X2.e$b$a r1 = (X2.e.b.a) r1
                java.lang.Object r3 = r7.f8971s
                H8.t r3 = (H8.t) r3
                p079h8.r.b(r8)
                goto L52
            L26:
                p079h8.r.b(r8)
                java.lang.Object r8 = r7.f8971s
                H8.t r8 = (H8.t) r8
                X2.e$b$a r1 = new X2.e$b$a
                r1.<init>(r8)
                X2.e r4 = X2.e.this
                android.content.ContentResolver r4 = X2.e.c(r4)
                java.lang.String r5 = r7.f8973u
                android.net.Uri r5 = android.provider.Settings.System.getUriFor(r5)
                r6 = 0
                r4.registerContentObserver(r5, r6, r1)
                h8.A r4 = p079h8.A.f21846a
                r7.f8971s = r8
                r7.f8969q = r1
                r7.f8970r = r3
                java.lang.Object r3 = r8.n(r4, r7)
                if (r3 != r0) goto L51
                goto L66
            L51:
                r3 = r8
            L52:
                X2.e r8 = X2.e.this
                X2.f r4 = new X2.f
                r4.<init>()
                r8 = 0
                r7.f8971s = r8
                r7.f8969q = r8
                r7.f8970r = r2
                java.lang.Object r7 = H8.r.a(r3, r4, r7)
                if (r7 != r0) goto L67
            L66:
                return r0
            L67:
                h8.A r7 = p079h8.A.f21846a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: X2.e.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p219v8.p
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object invoke(t tVar, p129m8.e eVar) {
            return ((b) create(tVar, eVar)).invokeSuspend(A.f21846a);
        }
    }

    public e(ContentResolver contentResolver, I backgroundDispatcher) {
        n.h(contentResolver, "contentResolver");
        n.h(backgroundDispatcher, "backgroundDispatcher");
        this.f8956a = contentResolver;
        this.f8957b = backgroundDispatcher;
    }

    @Override // X2.d
    public InterfaceC0880f a(String name, int i10) {
        n.h(name, "name");
        return AbstractC0882h.D(new a(AbstractC0882h.e(new b(name, null)), this, name, i10), this.f8957b);
    }
}
