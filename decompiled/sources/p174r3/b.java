package p174r3;

import F8.AbstractC0816i;
import F8.C0826n;
import F8.InterfaceC0822l;
import F8.L;
import H8.t;
import I8.AbstractC0882h;
import I8.InterfaceC0880f;
import android.app.WallpaperColors;
import android.app.WallpaperManager;
import android.content.ContentValues;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.util.List;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p064g3.x;
import p074h3.InterfaceC1363c;
import p079h8.A;
import p079h8.m;
import p079h8.o;
import p079h8.r;
import p089i8.AbstractC1444s;
import p219v8.p;

/* JADX INFO: loaded from: classes.dex */
public final class b implements p174r3.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f25765d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Uri f25766e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Uri f25767f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Uri f25768g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Uri f25769h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f25770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1363c f25771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WallpaperManager f25772c;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: r3.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C0660b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25773a;

        static {
            int[] iArr = new int[p204u3.a.values().length];
            try {
                iArr[p204u3.a.BOTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p204u3.a.HOME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p204u3.a.LOCK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f25773a = iArr;
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f25774q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f25775r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f25776s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f25778u;

        c(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25776s = obj;
            this.f25778u |= Integer.MIN_VALUE;
            return b.this.k(null, this);
        }
    }

    static final class d implements InterfaceC1363c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC0822l f25779a;

        d(InterfaceC0822l interfaceC0822l) {
            this.f25779a = interfaceC0822l;
        }

        @Override // p074h3.InterfaceC1363c.a
        public final void a(x xVar, x xVar2, int i10) {
            this.f25779a.k(new o(xVar, xVar2), null);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f25780q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f25781r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f25782s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f25784u;

        e(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25782s = obj;
            this.f25784u |= Integer.MIN_VALUE;
            return b.this.d(null, this);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f25785q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f25787s;

        f(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25785q = obj;
            this.f25787s |= Integer.MIN_VALUE;
            return b.this.m(null, 0, this);
        }
    }

    static final class g extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f25788q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f25789r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f25790s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f25792u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ p204u3.a f25793v;

        public static final class a extends ContentObserver {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ t f25794a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f25795b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f25796c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ p204u3.a f25797d;

            /* JADX INFO: renamed from: r3.b$g$a$a, reason: collision with other inner class name */
            static final class C0661a extends l implements p {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f25798q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                final /* synthetic */ int f25799r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                final /* synthetic */ t f25800s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ b f25801t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                final /* synthetic */ p204u3.a f25802u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0661a(int i10, t tVar, b bVar, p204u3.a aVar, p129m8.e eVar) {
                    super(2, eVar);
                    this.f25799r = i10;
                    this.f25800s = tVar;
                    this.f25801t = bVar;
                    this.f25802u = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final p129m8.e create(Object obj, p129m8.e eVar) {
                    return new C0661a(this.f25799r, this.f25800s, this.f25801t, this.f25802u, eVar);
                }

                @Override // p219v8.p
                public final Object invoke(L l9, p129m8.e eVar) {
                    return ((C0661a) create(l9, eVar)).invokeSuspend(A.f21846a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = p139n8.b.e();
                    int i10 = this.f25798q;
                    if (i10 == 0) {
                        r.b(obj);
                        t tVar = this.f25800s;
                        b bVar = this.f25801t;
                        p204u3.a aVar = this.f25802u;
                        int i11 = this.f25799r;
                        this.f25798q = 1;
                        if (g.x(tVar, bVar, aVar, i11, this) == objE) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(t tVar, int i10, b bVar, p204u3.a aVar) {
                super(null);
                this.f25794a = tVar;
                this.f25795b = i10;
                this.f25796c = bVar;
                this.f25797d = aVar;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z9) {
                t tVar = this.f25794a;
                AbstractC0816i.d(tVar, null, null, new C0661a(this.f25795b, tVar, this.f25796c, this.f25797d, null), 3, null);
            }
        }

        /* JADX INFO: renamed from: r3.b$g$b, reason: collision with other inner class name */
        static final class C0662b extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            Object f25803q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f25804r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f25805s;

            C0662b(p129m8.e eVar) {
                super(eVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f25804r = obj;
                this.f25805s |= Integer.MIN_VALUE;
                return g.x(null, null, null, 0, this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i10, p204u3.a aVar, p129m8.e eVar) {
            super(2, eVar);
            this.f25792u = i10;
            this.f25793v = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final A w(a aVar, b bVar) {
            if (aVar != null) {
                bVar.f25770a.getContentResolver().unregisterContentObserver(aVar);
            }
            return A.f21846a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
        
            if (r5.n(r9, r0) == r1) goto L21;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final java.lang.Object x(H8.t r5, p174r3.b r6, p204u3.a r7, int r8, p129m8.e r9) throws java.io.IOException {
            /*
                boolean r0 = r9 instanceof r3.b.g.C0662b
                if (r0 == 0) goto L13
                r0 = r9
                r3.b$g$b r0 = (r3.b.g.C0662b) r0
                int r1 = r0.f25805s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f25805s = r1
                goto L18
            L13:
                r3.b$g$b r0 = new r3.b$g$b
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f25804r
                java.lang.Object r1 = p139n8.b.e()
                int r2 = r0.f25805s
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3c
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                p079h8.r.b(r9)
                goto L56
            L2c:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L34:
                java.lang.Object r5 = r0.f25803q
                H8.t r5 = (H8.t) r5
                p079h8.r.b(r9)
                goto L4a
            L3c:
                p079h8.r.b(r9)
                r0.f25803q = r5
                r0.f25805s = r4
                java.lang.Object r9 = p174r3.b.i(r6, r7, r8, r0)
                if (r9 != r1) goto L4a
                goto L55
            L4a:
                r6 = 0
                r0.f25803q = r6
                r0.f25805s = r3
                java.lang.Object r5 = r5.n(r9, r0)
                if (r5 != r1) goto L56
            L55:
                return r1
            L56:
                h8.A r5 = p079h8.A.f21846a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: r3.b.g.x(H8.t, r3.b, u3.a, int, m8.e):java.lang.Object");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            g gVar = b.this.new g(this.f25792u, this.f25793v, eVar);
            gVar.f25790s = obj;
            return gVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
        
            if (H8.r.a(r3, r5, r8) == r0) goto L25;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = p139n8.b.e()
                int r1 = r8.f25789r
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L28
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                p079h8.r.b(r9)
                goto L8f
            L14:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L1c:
                java.lang.Object r1 = r8.f25788q
                r3.b$g$a r1 = (r3.b.g.a) r1
                java.lang.Object r3 = r8.f25790s
                H8.t r3 = (H8.t) r3
                p079h8.r.b(r9)
                goto L7b
            L28:
                p079h8.r.b(r9)
                java.lang.Object r9 = r8.f25790s
                H8.t r9 = (H8.t) r9
                android.os.Looper r1 = android.os.Looper.myLooper()
                android.os.Looper r5 = android.os.Looper.getMainLooper()
                boolean r1 = kotlin.jvm.internal.n.d(r1, r5)
                if (r1 != 0) goto L92
                r3.b r1 = p174r3.b.this
                boolean r1 = r1.c()
                if (r1 == 0) goto L51
                r3.b$g$a r1 = new r3.b$g$a
                int r5 = r8.f25792u
                r3.b r6 = p174r3.b.this
                u3.a r7 = r8.f25793v
                r1.<init>(r9, r5, r6, r7)
                goto L52
            L51:
                r1 = r4
            L52:
                if (r1 == 0) goto L66
                r3.b r5 = p174r3.b.this
                android.content.Context r5 = p174r3.b.e(r5)
                android.content.ContentResolver r5 = r5.getContentResolver()
                android.net.Uri r6 = p174r3.b.h()
                r5.registerContentObserver(r6, r3, r1)
                goto L67
            L66:
                r1 = r4
            L67:
                r3.b r5 = p174r3.b.this
                u3.a r6 = r8.f25793v
                int r7 = r8.f25792u
                r8.f25790s = r9
                r8.f25788q = r1
                r8.f25789r = r3
                java.lang.Object r3 = x(r9, r5, r6, r7, r8)
                if (r3 != r0) goto L7a
                goto L8e
            L7a:
                r3 = r9
            L7b:
                r3.b r9 = p174r3.b.this
                r3.c r5 = new r3.c
                r5.<init>()
                r8.f25790s = r4
                r8.f25788q = r4
                r8.f25789r = r2
                java.lang.Object r8 = H8.r.a(r3, r5, r8)
                if (r8 != r0) goto L8f
            L8e:
                return r0
            L8f:
                h8.A r8 = p079h8.A.f21846a
                return r8
            L92:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "Do not call method recentWallpapers() on main thread"
                r8.<init>(r9)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: r3.b.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p219v8.p
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public final Object invoke(t tVar, p129m8.e eVar) {
            return ((g) create(tVar, eVar)).invokeSuspend(A.f21846a);
        }
    }

    static {
        Uri uriBuild = new Uri.Builder().scheme("content").authority("com.google.android.apps.wallpaper.recents").build();
        f25766e = uriBuild;
        f25767f = uriBuild.buildUpon().appendPath("set_recent_wallpaper").build();
        f25768g = uriBuild.buildUpon().appendPath("list_recent").build();
        f25769h = uriBuild.buildUpon().appendPath("thumb").build();
    }

    public b(Context context, InterfaceC1363c infoFactory, WallpaperManager wallpaperManager) {
        n.h(context, "context");
        n.h(infoFactory, "infoFactory");
        n.h(wallpaperManager, "wallpaperManager");
        this.f25770a = context;
        this.f25771b = infoFactory;
        this.f25772c = wallpaperManager;
    }

    private final String j(p204u3.a aVar) {
        int i10 = C0660b.f25773a[aVar.ordinal()];
        if (i10 == 1) {
            return "all_screens";
        }
        if (i10 == 2) {
            return "home_screen";
        }
        if (i10 == 3) {
            return "lock_screen";
        }
        throw new m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(p204u3.a aVar, p129m8.e eVar) {
        c cVar;
        x xVar;
        Color primaryColor;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i10 = cVar.f25778u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f25778u = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objL = cVar.f25776s;
        Object objE = p139n8.b.e();
        int i11 = cVar.f25778u;
        if (i11 == 0) {
            r.b(objL);
            cVar.f25774q = this;
            cVar.f25775r = aVar;
            cVar.f25778u = 1;
            objL = l(cVar);
            if (objL == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (p204u3.a) cVar.f25775r;
            this = (b) cVar.f25774q;
            r.b(objL);
        }
        o oVar = (o) objL;
        if (aVar != p204u3.a.LOCK || (xVar = (x) oVar.d()) == null) {
            xVar = (x) oVar.c();
        }
        WallpaperColors wallpaperColors = this.f25772c.getWallpaperColors(this.n(aVar));
        String strR = xVar.r();
        n.g(strR, "getWallpaperId(...)");
        return new p204u3.b(strR, (wallpaperColors == null || (primaryColor = wallpaperColors.getPrimaryColor()) == null) ? 0 : primaryColor.toArgb(), 0L, 4, null);
    }

    private final Object l(p129m8.e eVar) {
        C0826n c0826n = new C0826n(p139n8.b.c(eVar), 1);
        c0826n.G();
        this.f25771b.a(this.f25770a, false, new d(c0826n));
        Object objA = c0826n.A();
        if (objA == p139n8.b.e()) {
            h.c(eVar);
        }
        return objA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(p204u3.a aVar, int i10, p129m8.e eVar) throws IOException {
        f fVar;
        if (eVar instanceof f) {
            fVar = (f) eVar;
            int i11 = fVar.f25787s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.f25787s = i11 - Integer.MIN_VALUE;
            } else {
                fVar = new f(eVar);
            }
        } else {
            fVar = new f(eVar);
        }
        Object objK = fVar.f25785q;
        Object objE = p139n8.b.e();
        int i12 = fVar.f25787s;
        if (i12 == 0) {
            r.b(objK);
            if (c()) {
                Cursor cursorQuery = this.f25770a.getContentResolver().query(f25768g.buildUpon().appendPath(j(aVar)).build(), new String[]{"id", "placeholder_color", "last_updated"}, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.getCount() != 0) {
                            List listC = AbstractC1444s.c();
                            int columnIndex = cursorQuery.getColumnIndex("id");
                            int columnIndex2 = cursorQuery.getColumnIndex("placeholder_color");
                            int columnIndex3 = cursorQuery.getColumnIndex("last_updated");
                            while (cursorQuery.moveToNext() && listC.size() < i10) {
                                String string = cursorQuery.getString(columnIndex);
                                int i13 = cursorQuery.getInt(columnIndex2);
                                long j9 = cursorQuery.getLong(columnIndex3);
                                n.e(string);
                                listC.add(new p204u3.b(string, i13, j9));
                            }
                            List listA = AbstractC1444s.a(listC);
                            p189s8.b.a(cursorQuery, null);
                            return listA;
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            p189s8.b.a(cursorQuery, th);
                            throw th2;
                        }
                    }
                }
                List listL = AbstractC1444s.l();
                p189s8.b.a(cursorQuery, null);
                return listL;
            }
            fVar.f25787s = 1;
            objK = k(aVar, fVar);
            if (objK == objE) {
                return objE;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(objK);
        }
        return AbstractC1444s.e(objK);
    }

    private final int n(p204u3.a aVar) {
        int i10 = C0660b.f25773a[aVar.ordinal()];
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        throw new m();
    }

    @Override // p174r3.a
    public Object a(p204u3.a aVar, String str, p219v8.a aVar2, p129m8.e eVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", str);
        contentValues.put("screen", j(aVar));
        if (this.f25770a.getContentResolver().update(f25767f, contentValues, null) == 0) {
            Log.e("WallpaperClientImpl", "Error setting wallpaper: " + str);
        }
        aVar2.invoke();
        return A.f21846a;
    }

    @Override // p174r3.a
    public InterfaceC0880f b(p204u3.a destination, int i10) {
        n.h(destination, "destination");
        return AbstractC0882h.e(new g(i10, destination, null));
    }

    @Override // p174r3.a
    public boolean c() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // p174r3.a
    public Object d(String str, p129m8.e eVar) {
        e eVar2;
        x xVar;
        com.android.wallpaper.asset.a aVarO;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i10 = eVar2.f25784u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar2.f25784u = i10 - Integer.MIN_VALUE;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objL = eVar2.f25782s;
        Object objE = p139n8.b.e();
        int i11 = eVar2.f25784u;
        if (i11 == 0) {
            r.b(objL);
            if (c()) {
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpenFile = this.f25770a.getContentResolver().openFile(f25769h.buildUpon().appendPath(str).build(), "r", null);
                    try {
                        if (parcelFileDescriptorOpenFile != null) {
                            Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(parcelFileDescriptorOpenFile.getFileDescriptor());
                            p189s8.b.a(parcelFileDescriptorOpenFile, null);
                            return bitmapDecodeFileDescriptor;
                        }
                        Log.e("WallpaperClientImpl", "Error getting wallpaper preview: " + str);
                        p189s8.b.a(parcelFileDescriptorOpenFile, null);
                        return null;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            p189s8.b.a(parcelFileDescriptorOpenFile, th);
                            throw th2;
                        }
                    }
                } catch (IOException e10) {
                    Log.e("WallpaperClientImpl", "Error getting wallpaper preview: " + str, e10);
                }
            } else {
                eVar2.f25780q = this;
                eVar2.f25781r = str;
                eVar2.f25784u = 1;
                objL = l(eVar2);
                if (objL == objE) {
                    return objE;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) eVar2.f25781r;
            this = (b) eVar2.f25780q;
            r.b(objL);
        }
        o oVar = (o) objL;
        if (n.d(((x) oVar.c()).r(), str)) {
            xVar = (x) oVar.c();
        } else {
            x xVar2 = (x) oVar.d();
            xVar = n.d(xVar2 != null ? xVar2.r() : null, str) ? (x) oVar.d() : null;
        }
        if (xVar == null || (aVarO = xVar.o(this.f25770a)) == null) {
            return null;
        }
        return aVarO.k(this.f25770a);
    }
}
