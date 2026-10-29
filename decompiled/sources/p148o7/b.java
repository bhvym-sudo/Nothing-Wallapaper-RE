package p148o7;

import F8.AbstractC0812g;
import F8.AbstractC0816i;
import F8.C0803b0;
import F8.H0;
import F8.InterfaceC0846x0;
import F8.L;
import I8.G;
import I8.InterfaceC0880f;
import I8.z;
import J6.i;
import android.app.WallpaperInfo;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.Toast;
import androidx.lifecycle.C;
import androidx.lifecycle.H;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import com.bumptech.glide.Glide;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.db.CreativeWallpaper;
import com.nothing.wallpaper.db.WallpaperDatabase;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p064g3.x;
import p074h3.I;
import p074h3.S;
import p079h8.A;
import p079h8.r;
import p084i3.D0;
import p129m8.e;
import p219v8.p;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b extends a0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f23448i = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f23449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x f23450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final z f23451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final z f23452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final H f23453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C f23454g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InterfaceC0846x0 f23455h;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: o7.b$b, reason: collision with other inner class name */
    static final class C0619b extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f23456q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f23457r;

        C0619b(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return b.this.new C0619b(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, e eVar) {
            return ((C0619b) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
        
            if (r10.b(r1, r9) == r0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00a8, code lost:
        
            if (r1.b(r10, r9) == r0) goto L27;
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
                int r1 = r9.f23457r
                r2 = 0
                r3 = 3
                r4 = 2
                java.lang.String r5 = "BaseCropWallpaperViewModel"
                r6 = 1
                r7 = 0
                if (r1 == 0) goto L2e
                if (r1 == r6) goto L2a
                if (r1 == r4) goto L22
                if (r1 != r3) goto L1a
                p079h8.r.b(r10)
                goto Lab
            L1a:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L22:
                java.lang.Object r1 = r9.f23456q
                android.os.Bundle r1 = (android.os.Bundle) r1
                p079h8.r.b(r10)
                goto L7c
            L2a:
                p079h8.r.b(r10)
                goto L61
            L2e:
                p079h8.r.b(r10)
                o7.b r10 = p148o7.b.this     // Catch: java.lang.IllegalArgumentException -> L45
                android.content.Context r10 = r10.f()     // Catch: java.lang.IllegalArgumentException -> L45
                android.content.ContentResolver r10 = r10.getContentResolver()     // Catch: java.lang.IllegalArgumentException -> L45
                java.lang.String r1 = "com.nothing.launcher.share"
                java.lang.String r8 = "get_wallpaper_scrollable"
                android.os.Bundle r10 = r10.call(r1, r8, r7, r7)     // Catch: java.lang.IllegalArgumentException -> L45
                r1 = r10
                goto L4c
            L45:
                r10 = move-exception
                java.lang.String r1 = "call exception:"
                com.nothing.wallpaper.common.log.c.g(r5, r1, r10)
                r1 = r7
            L4c:
                if (r1 != 0) goto L67
                o7.b r10 = p148o7.b.this
                I8.z r10 = r10.n()
                java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.b.a(r2)
                r9.f23457r = r6
                java.lang.Object r9 = r10.b(r1, r9)
                if (r9 != r0) goto L61
                goto Laa
            L61:
                java.lang.String r9 = "initScrollableState not support wallpaper scrolling"
                com.nothing.wallpaper.common.log.c.o(r5, r9)
                goto Lab
            L67:
                o7.b r10 = p148o7.b.this
                I8.z r10 = r10.n()
                java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r6)
                r9.f23456q = r1
                r9.f23457r = r4
                java.lang.Object r10 = r10.b(r6, r9)
                if (r10 != r0) goto L7c
                goto Laa
            L7c:
                java.lang.String r10 = "state"
                boolean r10 = r1.getBoolean(r10, r2)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "initScrollableState support scrolling, state="
                r1.append(r2)
                r1.append(r10)
                java.lang.String r1 = r1.toString()
                com.nothing.wallpaper.common.log.c.d(r5, r1)
                o7.b r1 = p148o7.b.this
                I8.z r1 = r1.l()
                java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.b.a(r10)
                r9.f23456q = r7
                r9.f23457r = r3
                java.lang.Object r9 = r1.b(r10, r9)
                if (r9 != r0) goto Lab
            Laa:
                return r0
            Lab:
                h8.A r9 = p079h8.A.f21846a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p148o7.b.C0619b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class c extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f23459q;

        static final class a extends l implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f23461q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ boolean f23462r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ b f23463s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(boolean z9, b bVar, e eVar) {
                super(2, eVar);
                this.f23462r = z9;
                this.f23463s = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final e create(Object obj, e eVar) {
                return new a(this.f23462r, this.f23463s, eVar);
            }

            @Override // p219v8.p
            public final Object invoke(L l9, e eVar) {
                return ((a) create(l9, eVar)).invokeSuspend(A.f21846a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                p139n8.b.e();
                if (this.f23461q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                CharSequence text = this.f23462r ? this.f23463s.f().getText(R.string.nt_already_saved) : this.f23463s.f().getString(R.string.nt_saved_to, "Pictures/Wallpaper Studio");
                n.e(text);
                Toast.makeText(this.f23463s.f(), text, 0).show();
                return A.f21846a;
            }
        }

        c(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return b.this.new c(eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, e eVar) {
            return ((c) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objE = p139n8.b.e();
            int i10 = this.f23459q;
            if (i10 == 0) {
                r.b(obj);
                String strC = b.this.j().c(b.this.f());
                if (strC == null) {
                    strC = "";
                }
                WallpaperDatabase.a aVar = WallpaperDatabase.f18441p;
                Context applicationContext = b.this.f().getApplicationContext();
                n.g(applicationContext, "getApplicationContext(...)");
                CreativeWallpaper creativeWallpaperF = aVar.b(applicationContext).D().f(strC);
                String strD = i.f3591F.d(creativeWallpaperF != null ? creativeWallpaperF.getSubjectEn() : null, creativeWallpaperF != null ? creativeWallpaperF.getStyleEn() : null, creativeWallpaperF != null ? kotlin.coroutines.jvm.internal.b.d(creativeWallpaperF.getImageId()) : null);
                String str = U6.b.f7980a.b().get(strC);
                Bitmap bitmapDecodeFile = str != null ? BitmapFactory.decodeFile(str) : null;
                if (bitmapDecodeFile == null) {
                    try {
                        bitmapDecodeFile = Glide.with(b.this.f()).asBitmap().load(strC).submit(Integer.MIN_VALUE, Integer.MIN_VALUE).get();
                    } catch (Exception e10) {
                        com.nothing.wallpaper.common.log.c.f("BaseCropWallpaperViewModel", "saveImageToGallery exception:" + e10.getMessage());
                        bitmapDecodeFile = null;
                    }
                }
                if (bitmapDecodeFile == null) {
                    com.nothing.wallpaper.common.log.c.f("BaseCropWallpaperViewModel", "saveImageToGallery failed, bitmap is null");
                } else {
                    Context contextF = b.this.f();
                    i.a aVar2 = i.f3591F;
                    boolean z9 = p087i6.i.a(contextF, aVar2.e(), strD) != null;
                    if (!z9 && creativeWallpaperF != null) {
                        R7.d.f7114r.d(creativeWallpaperF.getImageId());
                    }
                    p087i6.i.b(b.this.f(), aVar2.e(), bitmapDecodeFile, strD);
                    H0 h0C = C0803b0.c();
                    a aVar3 = new a(z9, b.this, null);
                    this.f23459q = 1;
                    if (AbstractC0812g.g(h0C, aVar3, this) == objE) {
                        return objE;
                    }
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

    static final class d extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f23464q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f23466s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z9, e eVar) {
            super(2, eVar);
            this.f23466s = z9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return b.this.new d(this.f23466s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, e eVar) {
            return ((d) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Bundle bundleCall;
            Object objE = p139n8.b.e();
            int i10 = this.f23464q;
            if (i10 == 0) {
                r.b(obj);
                z zVarL = b.this.l();
                Boolean boolA = kotlin.coroutines.jvm.internal.b.a(this.f23466s);
                this.f23464q = 1;
                if (zVarL.b(boolA, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            try {
                bundleCall = b.this.f().getContentResolver().call("com.nothing.launcher.share", "set_wallpaper_scrollable", String.valueOf(this.f23466s), (Bundle) null);
            } catch (IllegalArgumentException e10) {
                com.nothing.wallpaper.common.log.c.g("BaseCropWallpaperViewModel", "call exception:", e10);
                bundleCall = null;
            }
            com.nothing.wallpaper.common.log.c.d("BaseCropWallpaperViewModel", "setWallpaperScrollable state=" + this.f23466s + " result=" + (bundleCall != null ? kotlin.coroutines.jvm.internal.b.a(bundleCall.getBoolean("result")) : null));
            return A.f21846a;
        }
    }

    public b(Context appContext, x wallpaper) {
        n.h(appContext, "appContext");
        n.h(wallpaper, "wallpaper");
        this.f23449b = appContext;
        this.f23450c = wallpaper;
        this.f23451d = G.b(1, 0, null, 6, null);
        this.f23452e = G.b(1, 0, null, 6, null);
        H h10 = new H(m7.a.b.f23243a);
        this.f23453f = h10;
        this.f23454g = h10;
        m();
    }

    private final void m() {
        AbstractC0816i.d(b0.a(this), C0803b0.b(), null, new C0619b(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(D0.a aVar, CharSequence charSequence, Intent intent) {
        aVar.a(charSequence, intent);
    }

    private final void r() {
        InterfaceC0846x0 interfaceC0846x0 = this.f23455h;
        if (interfaceC0846x0 == null || interfaceC0846x0.O0()) {
            this.f23455h = AbstractC0816i.d(b0.a(this), C0803b0.b(), null, new c(null), 2, null);
        } else {
            com.nothing.wallpaper.common.log.c.o("BaseCropWallpaperViewModel", "onExploreClicked already downloading!");
        }
    }

    public final Context f() {
        return this.f23449b;
    }

    public final List g(Context context) {
        n.h(context, "context");
        List listE = this.f23450c.e(context);
        n.g(listE, "getAttributions(...)");
        return listE;
    }

    public final C h() {
        return this.f23454g;
    }

    protected final H i() {
        return this.f23453f;
    }

    public final x j() {
        return this.f23450c;
    }

    public abstract InterfaceC0880f k();

    public final z l() {
        return this.f23452e;
    }

    public final z n() {
        return this.f23451d;
    }

    public final void o(Context context, final D0.a callback) {
        n.h(context, "context");
        n.h(callback, "callback");
        D0.b(context, this.f23450c, new D0.a() { // from class: o7.a
            @Override // i3.D0.a
            public final void a(CharSequence charSequence, Intent intent) {
                b.p(callback, charSequence, intent);
            }
        });
    }

    public final void q(Intent intent, CharSequence charSequence) {
        S sQ;
        if (G6.e.o(this.f23450c, this.f23449b) && charSequence != null && charSequence.length() != 0) {
            r();
            return;
        }
        p074h3.H hA = I.a();
        if (hA != null && (sQ = hA.q(this.f23449b)) != null) {
            sQ.b();
        }
        if (intent != null) {
            intent.addFlags(268435456);
            p087i6.a.b(p087i6.a.f22186a, this.f23449b, intent, null, -1, 4, null);
        }
    }

    public final void s(boolean z9) {
        AbstractC0816i.d(b0.a(this), C0803b0.b(), null, new d(z9, null), 2, null);
    }

    public final boolean t(Intent intent, CharSequence charSequence) {
        if (!G6.e.o(this.f23450c, this.f23449b) || charSequence == null || charSequence.length() == 0) {
            return D0.c(this.f23449b, intent);
        }
        return true;
    }

    public final boolean u() {
        WallpaperInfo wallpaperInfoQ = this.f23450c.q();
        return wallpaperInfoQ == null || wallpaperInfoQ.getShowMetadataInPreview() || G6.e.o(this.f23450c, this.f23449b);
    }

    public void v() {
    }
}
