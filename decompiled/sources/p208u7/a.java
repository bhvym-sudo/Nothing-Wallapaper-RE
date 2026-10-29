package p208u7;

import F8.AbstractC0812g;
import F8.I;
import F8.L;
import H3.q;
import H8.t;
import I8.AbstractC0882h;
import I8.InterfaceC0880f;
import I8.InterfaceC0881g;
import android.content.Context;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.nothing.wallpaper.R;
import java.io.IOException;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.r;
import p219v8.p;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f28007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final I f28008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q f28009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f28010d;

    /* JADX INFO: renamed from: u7.a$a, reason: collision with other inner class name */
    static final class C0689a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f28011q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f28012r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f28014t;

        C0689a(p129m8.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f28012r = obj;
            this.f28014t |= Integer.MIN_VALUE;
            return a.this.e(null, this);
        }
    }

    static final class b extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f28015q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p208u7.c f28016r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ a f28017s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(p208u7.c cVar, a aVar, p129m8.e eVar) {
            super(2, eVar);
            this.f28016r = cVar;
            this.f28017s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return new b(this.f28016r, this.f28017s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((b) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f28015q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            if (!this.f28016r.c()) {
                if (this.f28016r.b() > 0) {
                    return this.f28017s.f28007a.getDrawable(this.f28016r.b());
                }
                return null;
            }
            if (this.f28016r.b() > 0) {
                return this.f28017s.f28007a.getPackageManager().getResourcesForApplication("com.nothing.launcher").getDrawable(this.f28016r.b(), this.f28017s.f28007a.getTheme());
            }
            if (this.f28016r.a() == null) {
                return null;
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(this.f28016r.a(), 0, this.f28016r.a().length, options);
            n.g(bitmapDecodeByteArray, "decodeByteArray(...)");
            Resources resources = this.f28017s.f28007a.getResources();
            n.g(resources, "getResources(...)");
            return new BitmapDrawable(resources, bitmapDecodeByteArray);
        }
    }

    static final class c extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f28018q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f28019r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Uri f28021t;

        /* JADX INFO: renamed from: u7.a$c$a, reason: collision with other inner class name */
        public static final class C0690a extends ContentObserver {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ t f28022a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0690a(t tVar) {
                super(null);
                this.f28022a = tVar;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z9) {
                this.f28022a.p(A.f21846a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Uri uri, p129m8.e eVar) {
            super(2, eVar);
            this.f28021t = uri;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final A v(a aVar, C0690a c0690a) {
            aVar.f28007a.getContentResolver().unregisterContentObserver(c0690a);
            return A.f21846a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            c cVar = a.this.new c(this.f28021t, eVar);
            cVar.f28019r = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f28018q;
            if (i10 == 0) {
                r.b(obj);
                t tVar = (t) this.f28019r;
                final C0690a c0690a = new C0690a(tVar);
                try {
                    a.this.f28007a.getContentResolver().registerContentObserver(this.f28021t, true, c0690a);
                } catch (Exception e10) {
                    com.nothing.wallpaper.common.log.c.f(a.this.f28010d, "observeUri register failed, msg:" + e10.getMessage());
                }
                final a aVar = a.this;
                p219v8.a aVar2 = new p219v8.a() { // from class: u7.b
                    @Override // p219v8.a
                    public final Object invoke() {
                        return a.c.v(aVar, c0690a);
                    }
                };
                this.f28018q = 1;
                if (H8.r.a(tVar, aVar2, this) == objE) {
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

        @Override // p219v8.p
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object invoke(t tVar, p129m8.e eVar) {
            return ((c) create(tVar, eVar)).invokeSuspend(A.f21846a);
        }
    }

    static final class d extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f28023q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f28024r;

        d(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            d dVar = new d(eVar);
            dVar.f28024r = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = p139n8.b.e();
            int i10 = this.f28023q;
            if (i10 == 0) {
                r.b(obj);
                InterfaceC0881g interfaceC0881g = (InterfaceC0881g) this.f28024r;
                A a10 = A.f21846a;
                this.f28023q = 1;
                if (interfaceC0881g.b(a10, this) == objE) {
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

        @Override // p219v8.p
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            return ((d) create(interfaceC0881g, eVar)).invokeSuspend(A.f21846a);
        }
    }

    public static final class e implements InterfaceC0880f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ InterfaceC0880f f28025q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ a f28026r;

        /* JADX INFO: renamed from: u7.a$e$a, reason: collision with other inner class name */
        public static final class C0691a implements InterfaceC0881g {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ InterfaceC0881g f28027q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ a f28028r;

            /* JADX INFO: renamed from: u7.a$e$a$a, reason: collision with other inner class name */
            public static final class C0692a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                /* synthetic */ Object f28029q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f28030r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                Object f28031s;

                public C0692a(p129m8.e eVar) {
                    super(eVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f28029q = obj;
                    this.f28030r |= Integer.MIN_VALUE;
                    return C0691a.this.b(null, this);
                }
            }

            public C0691a(InterfaceC0881g interfaceC0881g, a aVar) {
                this.f28027q = interfaceC0881g;
                this.f28028r = aVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
            
                if (r6.b(r8, r0) == r1) goto L22;
             */
            @Override // I8.InterfaceC0881g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object b(java.lang.Object r7, p129m8.e r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof u7.a.e.C0691a.C0692a
                    if (r0 == 0) goto L13
                    r0 = r8
                    u7.a$e$a$a r0 = (u7.a.e.C0691a.C0692a) r0
                    int r1 = r0.f28030r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f28030r = r1
                    goto L18
                L13:
                    u7.a$e$a$a r0 = new u7.a$e$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f28029q
                    java.lang.Object r1 = p139n8.b.e()
                    int r2 = r0.f28030r
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    p079h8.r.b(r8)
                    goto L5f
                L2c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L34:
                    java.lang.Object r6 = r0.f28031s
                    I8.g r6 = (I8.InterfaceC0881g) r6
                    p079h8.r.b(r8)
                    goto L53
                L3c:
                    p079h8.r.b(r8)
                    I8.g r8 = r6.f28027q
                    h8.A r7 = (p079h8.A) r7
                    u7.a r6 = r6.f28028r
                    r0.f28031s = r8
                    r0.f28030r = r4
                    java.lang.Object r6 = p208u7.a.d(r6, r0)
                    if (r6 != r1) goto L50
                    goto L5e
                L50:
                    r5 = r8
                    r8 = r6
                    r6 = r5
                L53:
                    r7 = 0
                    r0.f28031s = r7
                    r0.f28030r = r3
                    java.lang.Object r6 = r6.b(r8, r0)
                    if (r6 != r1) goto L5f
                L5e:
                    return r1
                L5f:
                    h8.A r6 = p079h8.A.f21846a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: u7.a.e.C0691a.b(java.lang.Object, m8.e):java.lang.Object");
            }
        }

        public e(InterfaceC0880f interfaceC0880f, a aVar) {
            this.f28025q = interfaceC0880f;
            this.f28026r = aVar;
        }

        @Override // I8.InterfaceC0880f
        public Object a(InterfaceC0881g interfaceC0881g, p129m8.e eVar) {
            Object objA = this.f28025q.a(new C0691a(interfaceC0881g, this.f28026r), eVar);
            return objA == p139n8.b.e() ? objA : A.f21846a;
        }
    }

    static final class f extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f28033q;

        f(p129m8.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final p129m8.e create(Object obj, p129m8.e eVar) {
            return a.this.new f(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, p129m8.e eVar) {
            return ((f) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws IOException {
            Cursor cursorQuery;
            p139n8.b.e();
            if (this.f28033q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            p208u7.c cVar = new p208u7.c("Unknown", R.drawable.icon_pack_default_icon, -1, null);
            try {
                Uri uriE = a.this.f28009c.e("default_icon_pack");
                cursorQuery = uriE != null ? a.this.f28007a.getContentResolver().query(uriE, null, null, null, null) : null;
            } catch (Exception e10) {
                com.nothing.wallpaper.common.log.c.f(a.this.f28010d, "querySelectedIconPack query failed, msg:" + e10.getMessage());
                cursorQuery = null;
            }
            if (cursorQuery != null) {
                a aVar = a.this;
                try {
                    int columnIndex = cursorQuery.getColumnIndex("icon_pack_name");
                    int columnIndex2 = cursorQuery.getColumnIndex("icon_pack_icon_res");
                    int columnIndex3 = cursorQuery.getColumnIndex("icon_pack_tint_color");
                    int columnIndex4 = cursorQuery.getColumnIndex("icon_pack_icon_blob");
                    if (columnIndex == -1 || columnIndex2 == -1 || columnIndex3 == -1 || columnIndex4 == -1) {
                        com.nothing.wallpaper.common.log.c.o(aVar.f28010d, "nameColumnIndex = " + columnIndex + ", iconResIdIndex = " + columnIndex2 + ", tintColorResIdIndex = " + columnIndex3 + ", iconBlobIndex = " + columnIndex4);
                    } else if (cursorQuery.moveToNext()) {
                        String string = cursorQuery.getString(columnIndex);
                        n.g(string, "getString(...)");
                        cVar = new p208u7.c(string, cursorQuery.getInt(columnIndex2), cursorQuery.getInt(columnIndex3), cursorQuery.getBlob(columnIndex4));
                        com.nothing.wallpaper.common.log.c.k(aVar.f28010d, "queried " + cVar);
                    }
                    p189s8.b.a(cursorQuery, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        p189s8.b.a(cursorQuery, th);
                        throw th2;
                    }
                }
            }
            return cVar;
        }
    }

    public a(Context context, I backgroundDispatcher, q previewUtils) {
        n.h(context, "context");
        n.h(backgroundDispatcher, "backgroundDispatcher");
        n.h(previewUtils, "previewUtils");
        this.f28007a = context;
        this.f28008b = backgroundDispatcher;
        this.f28009c = previewUtils;
        this.f28010d = "IconPackProviderClient";
    }

    private final InterfaceC0880f g(Uri uri) {
        return AbstractC0882h.I(AbstractC0882h.e(new c(uri, null)), new d(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object i(p129m8.e eVar) {
        return AbstractC0812g.g(this.f28008b, new f(null), eVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(p208u7.c cVar, p129m8.e eVar) {
        C0689a c0689a;
        if (eVar instanceof C0689a) {
            c0689a = (C0689a) eVar;
            int i10 = c0689a.f28014t;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0689a.f28014t = i10 - Integer.MIN_VALUE;
            } else {
                c0689a = new C0689a(eVar);
            }
        } else {
            c0689a = new C0689a(eVar);
        }
        Object objG = c0689a.f28012r;
        Object objE = p139n8.b.e();
        int i11 = c0689a.f28014t;
        if (i11 == 0) {
            r.b(objG);
            I i12 = this.f28008b;
            b bVar = new b(cVar, this, null);
            c0689a.f28011q = this;
            c0689a.f28014t = 1;
            objG = AbstractC0812g.g(i12, bVar, c0689a);
            if (objG == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = (a) c0689a.f28011q;
            r.b(objG);
        }
        Drawable drawable = (Drawable) objG;
        if (drawable != null) {
            return drawable;
        }
        Drawable drawable2 = this.f28007a.getResources().getDrawable(R.drawable.icon_pack_default_icon, this.f28007a.getTheme());
        n.g(drawable2, "getDrawable(...)");
        return drawable2;
    }

    public final boolean f() {
        Object objB;
        try {
            h8.q.a aVar = p079h8.q.f21862r;
            objB = p079h8.q.b(this.f28009c.e("default_icon_pack"));
        } catch (Throwable th) {
            h8.q.a aVar2 = p079h8.q.f21862r;
            objB = p079h8.q.b(r.a(th));
        }
        if (p079h8.q.f(objB)) {
            objB = null;
        }
        return objB != null;
    }

    public final InterfaceC0880f h() {
        Uri uriE = this.f28009c.e("default_icon_pack");
        if (uriE == null) {
            return null;
        }
        return AbstractC0882h.o(new e(g(uriE), this));
    }
}
