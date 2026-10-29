package D6;

import android.app.WallpaperColors;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p064g3.x;
import p074h3.I;
import p074h3.W;
import p079h8.A;

/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f1113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x f1114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a.b f1115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p167q6.b f1116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p079h8.h f1117e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p079h8.h f1118f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f1119g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p079h8.h f1120h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final LruCache f1121i;

    public p(Context appContext, x wallpaperInfo, a.b bVar) {
        kotlin.jvm.internal.n.h(appContext, "appContext");
        kotlin.jvm.internal.n.h(wallpaperInfo, "wallpaperInfo");
        this.f1113a = appContext;
        this.f1114b = wallpaperInfo;
        this.f1115c = bVar;
        p167q6.b bVar2 = new p167q6.b(this);
        this.f1116d = bVar2;
        this.f1117e = p079h8.i.b(new p219v8.a() { // from class: D6.l
            @Override // p219v8.a
            public final Object invoke() {
                return p.h(this.f1108q);
            }
        });
        this.f1118f = p079h8.i.b(new p219v8.a() { // from class: D6.m
            @Override // p219v8.a
            public final Object invoke() {
                return p.n(this.f1109q);
            }
        });
        this.f1119g = true;
        this.f1120h = p079h8.i.b(new p219v8.a() { // from class: D6.n
            @Override // p219v8.a
            public final Object invoke() {
                return p.o(this.f1110q);
            }
        });
        LruCache lruCache = new LruCache(10);
        this.f1121i = lruCache;
        StringBuilder sb = new StringBuilder("Quick get init color, ");
        if (bVar != null) {
            Future futureI = i();
            kotlin.jvm.internal.n.g(futureI, "<get-colorFuture>(...)");
            WallpaperColors wallpaperColorsC = G6.h.c(futureI);
            if (wallpaperColorsC != null) {
                lruCache.put(bVar, wallpaperColorsC);
                sb.append("from last cached to Manager.");
            }
        } else {
            String strN = wallpaperInfo.n(appContext);
            if (strN == null || l().Y(strN) == null) {
                final long j9 = 3000;
                p119l8.a.b(false, false, null, null, 0, new p219v8.a() { // from class: D6.o
                    @Override // p219v8.a
                    public final Object invoke() {
                        return p.e(this.f1111q, j9);
                    }
                }, 31, null);
                sb.append("from future in a background thread.");
            } else {
                lruCache.put(a.C0036a.f965a, l().Y(strN));
                sb.append("from last cached to SP.");
            }
        }
        String string = sb.toString();
        kotlin.jvm.internal.n.g(string, "toString(...)");
        bVar2.a(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A e(p pVar, long j9) {
        try {
            WallpaperColors wallpaperColorsB = ((x.a) pVar.i().get(j9, TimeUnit.MILLISECONDS)).b();
            kotlin.jvm.internal.n.e(wallpaperColorsB);
            if (G6.h.d(wallpaperColorsB)) {
                wallpaperColorsB = null;
            }
            if (wallpaperColorsB != null) {
                pVar.f1121i.put(a.C0036a.f965a, wallpaperColorsB);
                pVar.f1116d.a("Get init colors after future done.");
            }
        } catch (InterruptedException unused) {
            pVar.f1116d.e("Get init colors failure cause future was interrupted.");
        } catch (CancellationException unused2) {
            pVar.f1116d.e("Get init colors failure cause future was cancellation.");
        } catch (TimeoutException unused3) {
            pVar.f1116d.e("Get init colors failure cause timeout after " + j9 + " ms.");
        }
        return A.f21846a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Future h(p pVar) {
        return pVar.f1114b.b(pVar.f1113a);
    }

    private final Future i() {
        return (Future) this.f1117e.getValue();
    }

    private final W l() {
        return (W) this.f1118f.getValue();
    }

    private final String m() {
        return (String) this.f1120h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final W n(p pVar) {
        return I.a().f(pVar.f1113a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String o(p pVar) {
        return pVar.f1114b.n(pVar.f1113a);
    }

    public final WallpaperColors f(Bitmap bitmap, a id) {
        kotlin.jvm.internal.n.h(bitmap, "bitmap");
        kotlin.jvm.internal.n.h(id, "id");
        WallpaperColors wallpaperColors = (WallpaperColors) this.f1121i.get(id);
        if (wallpaperColors != null) {
            this.f1116d.a("calculateColors for " + id + " from cache. colors=" + wallpaperColors);
            return wallpaperColors;
        }
        boolean z9 = false;
        if (bitmap.getConfig() == Bitmap.Config.HARDWARE) {
            bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, false);
            z9 = true;
        }
        WallpaperColors wallpaperColorsFromBitmap = WallpaperColors.fromBitmap(bitmap);
        if (z9) {
            bitmap.recycle();
        }
        this.f1121i.put(id, wallpaperColorsFromBitmap);
        if (this.f1119g && m() != null) {
            l().j0(m(), wallpaperColorsFromBitmap);
        }
        kotlin.jvm.internal.n.e(wallpaperColorsFromBitmap);
        return wallpaperColorsFromBitmap;
    }

    public final void g() {
        i().cancel(true);
    }

    public final WallpaperColors j() {
        WallpaperColors wallpaperColors;
        a.b bVar = this.f1115c;
        if (bVar != null && (wallpaperColors = (WallpaperColors) this.f1121i.get(bVar)) != null) {
            return wallpaperColors;
        }
        WallpaperColors wallpaperColors2 = (WallpaperColors) this.f1121i.get(a.C0036a.f965a);
        if (wallpaperColors2 != null) {
            return wallpaperColors2;
        }
        return null;
    }

    public final a.b k() {
        return this.f1115c;
    }
}
