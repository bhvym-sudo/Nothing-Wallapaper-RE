package D6;

import F8.AbstractC0816i;
import F8.C0803b0;
import F8.L;
import F8.M;
import F8.T0;
import I8.AbstractC0882h;
import I8.E;
import I8.G;
import I8.InterfaceC0880f;
import I8.z;
import android.app.WallpaperColors;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import com.nothing.wallpaper.effects.data.model.ViewScope;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p064g3.x;
import p079h8.A;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements D6.e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private Bitmap f968A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private Bitmap f969B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private k f970C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private D6.h f971D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private float f972E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final z f973F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final z f974G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final InterfaceC0880f f975H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final z f976I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final E f977J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final z f978K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final InterfaceC0880f f979L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final z f980M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final InterfaceC0880f f981N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final z f982O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final InterfaceC0880f f983P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private int f984Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private boolean f985R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private volatile ViewScope f986S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private volatile boolean f987T;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Context f988q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final x f989r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f990s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f991t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f992u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final p167q6.b f993v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final L f994w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private p f995x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private D6.h f996y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Point f997z;

    static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f998q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f999r;

        a(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            a aVar = b.this.new a(eVar);
            aVar.f999r = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p pVar;
            Object next;
            p139n8.b.e();
            if (this.f998q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p079h8.r.b(obj);
            D6.h.c cVar = (D6.h.c) this.f999r;
            Iterator it = ((Iterable) cVar.b()).iterator();
            do {
                pVar = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((C6.b) next).c() != C6.a.Setter);
            C6.b bVar = (C6.b) next;
            if (bVar != null) {
                b bVar2 = b.this;
                C6.i iVarA = bVar.a();
                p217v6.a aVar = p217v6.a.f28529m;
                Bitmap bitmapA = G6.f.a(iVarA, aVar);
                boolean zD = kotlin.jvm.internal.n.d(bitmapA, bVar.a().b());
                try {
                    p pVar2 = bVar2.f995x;
                    if (pVar2 == null) {
                        kotlin.jvm.internal.n.r("colorCalculator");
                    } else {
                        pVar = pVar2;
                    }
                    ViewScope viewScope = (ViewScope) cVar.a();
                    WallpaperColors wallpaperColorsF = pVar.f(bitmapA, new D6.a.b(viewScope.getScale(), viewScope.getCenter()));
                    if (!zD) {
                        aVar.m(bitmapA);
                    }
                    if (wallpaperColorsF != null) {
                        return wallpaperColorsF;
                    }
                } catch (Throwable th) {
                    if (!zD) {
                        p217v6.a.f28529m.m(bitmapA);
                    }
                    throw th;
                }
            }
            b.this.f993v.e("should calculator colors but didn't find CropType.Setter, return EMPTY_COLORS.");
            return G6.h.a();
        }

        @Override // p219v8.p
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object invoke(D6.h.c cVar, p129m8.e eVar) {
            return ((a) create(cVar, eVar)).invokeSuspend(A.f21846a);
        }
    }

    /* JADX INFO: renamed from: D6.b$b, reason: collision with other inner class name */
    static final class C0037b extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        long f1001q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f1002r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f1003s;

        C0037b(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            C0037b c0037b = b.this.new C0037b(eVar);
            c0037b.f1003s = obj;
            return c0037b;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ViewScope viewScope;
            long j9;
            Object objE = p139n8.b.e();
            int i10 = this.f1002r;
            ArrayList arrayList = null;
            if (i10 == 0) {
                p079h8.r.b(obj);
                ViewScope viewScope2 = (ViewScope) this.f1003s;
                long jCurrentTimeMillis = System.currentTimeMillis();
                b.this.f993v.a("start crop bitmaps for " + viewScope2 + ".");
                List listP = AbstractC1444s.p(C6.a.Setter);
                if (b.this.b0()) {
                    listP.add(C6.a.Blur);
                }
                if (b.this.q0() && b.this.f969B != null) {
                    listP.add(C6.a.Depth);
                }
                k kVar = b.this.f970C;
                if (kVar == null) {
                    kotlin.jvm.internal.n.r("bitmapCropper");
                    kVar = null;
                }
                this.f1003s = viewScope2;
                this.f1001q = jCurrentTimeMillis;
                this.f1002r = 1;
                Object objF = kVar.f(viewScope2, listP, this);
                if (objF == objE) {
                    return objE;
                }
                viewScope = viewScope2;
                obj = objF;
                j9 = jCurrentTimeMillis;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j9 = this.f1001q;
                viewScope = (ViewScope) this.f1003s;
                p079h8.r.b(obj);
            }
            List list = (List) obj;
            p167q6.b bVar = b.this.f993v;
            if (list != null) {
                List list2 = list;
                arrayList = new ArrayList(AbstractC1444s.u(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C6.b) it.next()).c());
                }
            }
            bVar.a("end crop bitmaps for " + viewScope + ", types " + arrayList + ", time consume " + (System.currentTimeMillis() - j9) + "ms.");
            return obj;
        }

        @Override // p219v8.p
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ViewScope viewScope, p129m8.e eVar) {
            return ((C0037b) create(viewScope, eVar)).invokeSuspend(A.f21846a);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f1005q;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f1007q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f1008r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ b f1009s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, p129m8.e eVar) {
                super(2, eVar);
                this.f1009s = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                a aVar = new a(this.f1009s, eVar);
                aVar.f1008r = obj;
                return aVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0070, code lost:
            
                if (r6.b(r3, r5) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = p139n8.b.e()
                    int r1 = r5.f1007q
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L22
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    p079h8.r.b(r6)
                    goto L73
                L12:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L1a:
                    java.lang.Object r1 = r5.f1008r
                    D6.h$c r1 = (D6.h.c) r1
                    p079h8.r.b(r6)
                    goto L4e
                L22:
                    p079h8.r.b(r6)
                    java.lang.Object r6 = r5.f1008r
                    r1 = r6
                    D6.h$c r1 = (D6.h.c) r1
                    D6.b r6 = r5.f1009s
                    java.lang.Object r4 = r1.b()
                    android.app.WallpaperColors r4 = (android.app.WallpaperColors) r4
                    int r4 = G6.h.b(r4)
                    D6.b.U(r6, r4)
                    D6.b r6 = r5.f1009s
                    I8.z r6 = D6.b.B(r6)
                    java.lang.Object r4 = r1.b()
                    r5.f1008r = r1
                    r5.f1007q = r3
                    java.lang.Object r6 = r6.b(r4, r5)
                    if (r6 != r0) goto L4e
                    goto L72
                L4e:
                    D6.b r6 = r5.f1009s
                    I8.z r6 = D6.b.K(r6)
                    h8.o r3 = new h8.o
                    java.lang.Object r4 = r1.a()
                    D6.h$c r4 = (D6.h.c) r4
                    java.lang.Object r4 = r4.a()
                    java.lang.Object r1 = r1.b()
                    r3.<init>(r4, r1)
                    r1 = 0
                    r5.f1008r = r1
                    r5.f1007q = r2
                    java.lang.Object r5 = r6.b(r3, r5)
                    if (r5 != r0) goto L73
                L72:
                    return r0
                L73:
                    h8.A r5 = p079h8.A.f21846a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: D6.b.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // p219v8.p
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public final Object invoke(D6.h.c cVar, p129m8.e eVar) {
                return ((a) create(cVar, eVar)).invokeSuspend(A.f21846a);
            }
        }

        c(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return b.this.new c(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((c) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f1005q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                D6.h hVar = b.this.f996y;
                if (hVar == null) {
                    kotlin.jvm.internal.n.r("colorStream");
                    hVar = null;
                }
                z zVarG = hVar.g();
                a aVar = new a(b.this, null);
                this.f1005q = 1;
                if (AbstractC0882h.i(zVarG, aVar, this) == objE) {
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

    static final class d extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f1010q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ WallpaperColors f1012s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(WallpaperColors wallpaperColors, p129m8.e eVar) {
            super(2, eVar);
            this.f1012s = wallpaperColors;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return b.this.new d(this.f1012s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((d) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
        
            if (r5.b(r6, r9) == r0) goto L24;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = p139n8.b.e()
                int r1 = r9.f1010q
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                p079h8.r.b(r10)
                goto L77
            L12:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L1a:
                p079h8.r.b(r10)
                goto L32
            L1e:
                p079h8.r.b(r10)
                D6.b r10 = D6.b.this
                I8.z r10 = D6.b.B(r10)
                android.app.WallpaperColors r1 = r9.f1012s
                r9.f1010q = r3
                java.lang.Object r10 = r10.b(r1, r9)
                if (r10 != r0) goto L32
                goto L76
            L32:
                D6.b r10 = D6.b.this
                D6.p r10 = D6.b.f(r10)
                r1 = 0
                if (r10 != 0) goto L41
                java.lang.String r10 = "colorCalculator"
                kotlin.jvm.internal.n.r(r10)
                r10 = r1
            L41:
                D6.a$b r10 = r10.k()
                if (r10 == 0) goto L77
                D6.b r3 = D6.b.this
                android.app.WallpaperColors r4 = r9.f1012s
                I8.z r5 = D6.b.K(r3)
                h8.o r6 = new h8.o
                com.nothing.wallpaper.effects.data.model.ViewScope r7 = new com.nothing.wallpaper.effects.data.model.ViewScope
                float r8 = r10.b()
                android.graphics.PointF r10 = r10.a()
                android.graphics.Point r3 = D6.b.z(r3)
                if (r3 != 0) goto L67
                java.lang.String r3 = "viewSize"
                kotlin.jvm.internal.n.r(r3)
                goto L68
            L67:
                r1 = r3
            L68:
                r7.<init>(r8, r10, r1)
                r6.<init>(r7, r4)
                r9.f1010q = r2
                java.lang.Object r9 = r5.b(r6, r9)
                if (r9 != r0) goto L77
            L76:
                return r0
            L77:
                h8.A r9 = p079h8.A.f21846a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: D6.b.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f1013q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f1014r;

        static final class a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f1016q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f1017r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ L f1018s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ b f1019t;

            /* JADX INFO: renamed from: D6.b$e$a$a, reason: collision with other inner class name */
            static final class C0038a extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f1020q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ b f1021r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ D6.h.c f1022s;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0038a(b bVar, D6.h.c cVar, p129m8.e eVar) {
                    super(2, eVar);
                    this.f1021r = bVar;
                    this.f1022s = cVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new C0038a(this.f1021r, this.f1022s, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((C0038a) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f1020q;
                    if (i10 == 0) {
                        p079h8.r.b(obj);
                        this.f1021r.f993v.a("emit color event for " + this.f1022s.a() + ".");
                        D6.h hVar = this.f1021r.f996y;
                        if (hVar == null) {
                            kotlin.jvm.internal.n.r("colorStream");
                            hVar = null;
                        }
                        D6.h.c cVar = new D6.h.c(this.f1022s.a(), this.f1022s.b());
                        this.f1020q = 1;
                        if (hVar.e(cVar, this) == objE) {
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
            a(L l9, b bVar, p129m8.e eVar) {
                super(2, eVar);
                this.f1018s = l9;
                this.f1019t = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final p129m8.e create(Object obj, p129m8.e eVar) {
                a aVar = new a(this.f1018s, this.f1019t, eVar);
                aVar.f1017r = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = p139n8.b.e();
                int i10 = this.f1016q;
                if (i10 == 0) {
                    p079h8.r.b(obj);
                    D6.h.c cVar = (D6.h.c) this.f1017r;
                    if (cVar.b() != null) {
                        AbstractC0816i.d(this.f1018s, null, null, new C0038a(this.f1019t, cVar, null), 3, null);
                        z zVar = this.f1019t.f980M;
                        Object objB = cVar.b();
                        this.f1016q = 1;
                        if (zVar.b(objB, this) == objE) {
                            return objE;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p079h8.r.b(obj);
                }
                return A.f21846a;
            }

            @Override // p219v8.p
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public final Object invoke(D6.h.c cVar, p129m8.e eVar) {
                return ((a) create(cVar, eVar)).invokeSuspend(A.f21846a);
            }
        }

        e(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            e eVar2 = b.this.new e(eVar);
            eVar2.f1014r = obj;
            return eVar2;
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((e) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f1013q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                L l9 = (L) this.f1014r;
                D6.h hVar = b.this.f971D;
                if (hVar == null) {
                    kotlin.jvm.internal.n.r("bitmapStream");
                    hVar = null;
                }
                z zVarG = hVar.g();
                a aVar = new a(l9, b.this, null);
                this.f1013q = 1;
                if (AbstractC0882h.i(zVarG, aVar, this) == objE) {
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
        int f1023q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ ViewScope f1025s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(ViewScope viewScope, p129m8.e eVar) {
            super(2, eVar);
            this.f1025s = viewScope;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return b.this.new f(this.f1025s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((f) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
        
            if (r5.e(r1, r4) == r0) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = p139n8.b.e()
                int r1 = r4.f1023q
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                p079h8.r.b(r5)
                goto L66
            L12:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L1a:
                p079h8.r.b(r5)
                goto L4d
            L1e:
                p079h8.r.b(r5)
                D6.b r5 = D6.b.this
                I8.z r5 = D6.b.G(r5)
                r5.g()
                D6.b r5 = D6.b.this
                I8.z r5 = D6.b.K(r5)
                r5.g()
                D6.b r5 = D6.b.this
                I8.z r5 = D6.b.B(r5)
                r5.g()
                D6.b r5 = D6.b.this
                I8.z r5 = r5.J0()
                com.nothing.wallpaper.effects.data.model.ViewScope r1 = r4.f1025s
                r4.f1023q = r3
                java.lang.Object r5 = r5.b(r1, r4)
                if (r5 != r0) goto L4d
                goto L65
            L4d:
                D6.b r5 = D6.b.this
                D6.h r5 = D6.b.b(r5)
                if (r5 != 0) goto L5b
                java.lang.String r5 = "bitmapStream"
                kotlin.jvm.internal.n.r(r5)
                r5 = 0
            L5b:
                com.nothing.wallpaper.effects.data.model.ViewScope r1 = r4.f1025s
                r4.f1023q = r2
                java.lang.Object r4 = r5.e(r1, r4)
                if (r4 != r0) goto L66
            L65:
                return r0
            L66:
                h8.A r4 = p079h8.A.f21846a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: D6.b.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f1026q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Bitmap f1028s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Bitmap bitmap, p129m8.e eVar) {
            super(2, eVar);
            this.f1028s = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return b.this.new g(this.f1028s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((g) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f1026q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                z zVar = b.this.f976I;
                Bitmap bitmap = this.f1028s;
                this.f1026q = 1;
                if (zVar.b(bitmap, this) == objE) {
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

    static final class h extends kotlin.coroutines.jvm.internal.l implements p219v8.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f1029q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Bitmap f1031s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Bitmap bitmap, p129m8.e eVar) {
            super(2, eVar);
            this.f1031s = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return b.this.new h(this.f1031s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((h) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f1029q;
            if (i10 == 0) {
                p079h8.r.b(obj);
                z zVar = b.this.f974G;
                Bitmap bitmap = this.f1031s;
                this.f1029q = 1;
                if (zVar.b(bitmap, this) == objE) {
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

    public b(Context appContext, x wallpaper, boolean z9, boolean z10, boolean z11) {
        kotlin.jvm.internal.n.h(appContext, "appContext");
        kotlin.jvm.internal.n.h(wallpaper, "wallpaper");
        this.f988q = appContext;
        this.f989r = wallpaper;
        this.f990s = z9;
        this.f991t = z10;
        this.f992u = z11;
        this.f993v = new p167q6.b(this);
        this.f994w = M.a(T0.b(null, 1, null).z(C0803b0.b()));
        this.f972E = 1.0f;
        this.f973F = G.b(0, 0, null, 6, null);
        z zVarB = G.b(1, 0, null, 6, null);
        this.f974G = zVarB;
        this.f975H = zVarB;
        z zVarB2 = G.b(1, 0, null, 6, null);
        this.f976I = zVarB2;
        this.f977J = AbstractC0882h.a(zVarB2);
        z zVarB3 = G.b(1, 0, null, 6, null);
        this.f978K = zVarB3;
        this.f979L = zVarB3;
        z zVarB4 = G.b(1, 0, null, 6, null);
        this.f980M = zVarB4;
        this.f981N = zVarB4;
        z zVarB5 = G.b(1, 0, null, 6, null);
        this.f982O = zVarB5;
        this.f983P = zVarB5;
    }

    private final void A0() {
        Bitmap bitmap;
        Point point;
        if (this.f985R || this.f968A == null || this.f997z == null) {
            return;
        }
        Context context = this.f988q;
        x xVar = this.f989r;
        C6.g gVarK = xVar.k();
        Point point2 = this.f997z;
        if (point2 == null) {
            kotlin.jvm.internal.n.r("viewSize");
            point2 = null;
        }
        ViewScope viewScopeI = G6.c.i(gVarK, point2);
        this.f995x = new p(context, xVar, viewScopeI != null ? new D6.a.b(viewScopeI.getScale(), viewScopeI.getCenter()) : null);
        this.f996y = new D6.h(this.f994w, 0L, new a(null));
        Bitmap bitmap2 = this.f968A;
        if (bitmap2 == null) {
            kotlin.jvm.internal.n.r("raw");
            bitmap = null;
        } else {
            bitmap = bitmap2;
        }
        Context context2 = this.f988q;
        Point point3 = this.f997z;
        if (point3 == null) {
            kotlin.jvm.internal.n.r("viewSize");
            point = null;
        } else {
            point = point3;
        }
        this.f970C = new k(bitmap, context2, point, this.f972E, this.f989r, this.f992u);
        this.f971D = new D6.h(this.f994w, 0L, new C0037b(null));
        AbstractC0816i.d(this.f994w, null, null, new c(null), 3, null);
        p pVar = this.f995x;
        if (pVar == null) {
            kotlin.jvm.internal.n.r("colorCalculator");
            pVar = null;
        }
        WallpaperColors wallpaperColorsJ = pVar.j();
        if (wallpaperColorsJ != null) {
            AbstractC0816i.d(this.f994w, null, null, new d(wallpaperColorsJ, null), 3, null);
        }
        AbstractC0816i.d(this.f994w, null, null, new e(null), 3, null);
        this.f985R = true;
        ViewScope viewScope = this.f986S;
        if (viewScope != null) {
            y0(viewScope);
            this.f986S = null;
        }
    }

    private final void Y() {
        k kVar;
        if (this.f969B == null || (kVar = this.f970C) == null) {
            return;
        }
        k kVar2 = null;
        if (kVar == null) {
            kotlin.jvm.internal.n.r("bitmapCropper");
            kVar = null;
        }
        if (kVar.k() == null) {
            k kVar3 = this.f970C;
            if (kVar3 == null) {
                kotlin.jvm.internal.n.r("bitmapCropper");
            } else {
                kVar2 = kVar3;
            }
            Bitmap bitmap = this.f969B;
            kotlin.jvm.internal.n.e(bitmap);
            kVar2.n(bitmap);
        }
    }

    public final void B0(boolean z9) {
        ViewScope viewScope;
        boolean z10 = this.f987T;
        this.f987T = z9;
        this.f993v.a("setSuspendCropUpdates old:" + z10 + " new:" + z9);
        if (!z10 || z9 || (viewScope = this.f986S) == null) {
            return;
        }
        this.f986S = null;
        y0(viewScope);
    }

    @Override // D6.e
    public InterfaceC0880f F0() {
        return this.f975H;
    }

    @Override // D6.e
    public InterfaceC0880f H0() {
        return this.f979L;
    }

    @Override // D6.e
    public void N0(Bitmap bitmap) {
        kotlin.jvm.internal.n.h(bitmap, "bitmap");
        this.f968A = bitmap;
        AbstractC0816i.d(this.f994w, null, null, new h(bitmap, null), 3, null);
        A0();
        Y();
    }

    @Override // D6.f
    public InterfaceC0880f S() {
        return this.f983P;
    }

    public final boolean b0() {
        return this.f990s;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        p pVar = null;
        M.d(this.f994w, null, 1, null);
        if (this.f985R) {
            p pVar2 = this.f995x;
            if (pVar2 == null) {
                kotlin.jvm.internal.n.r("colorCalculator");
            } else {
                pVar = pVar2;
            }
            pVar.g();
        }
    }

    @Override // D6.e
    public void m(Point size, float f10) {
        kotlin.jvm.internal.n.h(size, "size");
        this.f997z = size;
        this.f972E = f10;
        A0();
        Y();
    }

    @Override // D6.e
    public void o(Bitmap bitmap) {
        kotlin.jvm.internal.n.h(bitmap, "bitmap");
        this.f969B = bitmap;
        AbstractC0816i.d(this.f994w, null, null, new g(bitmap, null), 3, null);
        Y();
    }

    public final boolean q0() {
        return this.f991t;
    }

    @Override // D6.e
    public InterfaceC0880f t() {
        return this.f981N;
    }

    @Override // D6.e
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public z J0() {
        return this.f973F;
    }

    @Override // D6.f
    public int v0() {
        return this.f984Q;
    }

    @Override // D6.e
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public E M() {
        return this.f977J;
    }

    @Override // D6.e
    public void y0(ViewScope viewScope) {
        kotlin.jvm.internal.n.h(viewScope, "viewScope");
        if (!this.f985R) {
            this.f986S = viewScope;
            return;
        }
        if (!this.f987T) {
            AbstractC0816i.d(this.f994w, null, null, new f(viewScope, null), 3, null);
            return;
        }
        this.f986S = viewScope;
        this.f993v.a("onScopeChanged ignored while suspendCropUpdates=true, pending:" + viewScope);
    }
}
