package F2;

import android.app.WallpaperColors;
import android.app.WallpaperInfo;
import android.app.WallpaperManager;
import android.content.ComponentName;
import android.content.Context;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: loaded from: classes.dex */
public final class F implements v {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f1542t = new a(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final l f1543u = new l(new l.a() { // from class: F2.z
        @Override // F2.l.a
        public final Object a(Context context) {
            return F.z(context);
        }
    });

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Context f1544q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f1545r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final v f1546s;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final F a(Context context) {
            kotlin.jvm.internal.n.h(context, "context");
            Object objE = F.f1543u.e(context);
            kotlin.jvm.internal.n.g(objE, "get(...)");
            return (F) objE;
        }

        private a() {
        }
    }

    public F(Context context) {
        kotlin.jvm.internal.n.h(context, "context");
        this.f1544q = context;
        if (!com.android.launcher3.w.f15762f) {
            this.f1546s = new v() { // from class: F2.D
                @Override // F2.v, java.lang.AutoCloseable
                public final void close() {
                    F.K();
                }
            };
            return;
        }
        WallpaperColors wallpaperColors = U().getWallpaperColors(2);
        this.f1545r = wallpaperColors != null ? wallpaperColors.getColorHints() : 0;
        final WallpaperManager.OnColorsChangedListener onColorsChangedListener = new WallpaperManager.OnColorsChangedListener() { // from class: F2.A
            @Override // android.app.WallpaperManager.OnColorsChangedListener
            public final void onColorsChanged(WallpaperColors wallpaperColors2, int i10) {
                F.B(this.f1535a, wallpaperColors2, i10);
            }
        };
        AbstractC0797d.f1558f.execute(new Runnable() { // from class: F2.B
            @Override // java.lang.Runnable
            public final void run() {
                F.G(this.f1536q, onColorsChangedListener);
            }
        });
        this.f1546s = new v() { // from class: F2.C
            @Override // F2.v, java.lang.AutoCloseable
            public final void close() {
                F.I(this.f1538q, onColorsChangedListener);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(F f10, WallpaperColors wallpaperColors, int i10) {
        f10.b0(wallpaperColors, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(F f10, WallpaperManager.OnColorsChangedListener onColorsChangedListener) {
        f10.U().addOnColorsChangedListener(onColorsChangedListener, AbstractC0797d.f1558f.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(final F f10, final WallpaperManager.OnColorsChangedListener onColorsChangedListener) {
        AbstractC0797d.f1558f.execute(new Runnable() { // from class: F2.E
            @Override // java.lang.Runnable
            public final void run() {
                F.b(this.f1540q, onColorsChangedListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K() {
    }

    private final WallpaperManager U() {
        Object systemService = this.f1544q.getSystemService((Class<Object>) WallpaperManager.class);
        kotlin.jvm.internal.n.e(systemService);
        return (WallpaperManager) systemService;
    }

    public static void b(F f10, WallpaperManager.OnColorsChangedListener onColorsChangedListener) {
        f10.U().removeOnColorsChangedListener(onColorsChangedListener);
    }

    private final void b0(WallpaperColors wallpaperColors, int i10) {
        ComponentName component;
        WallpaperInfo wallpaperInfo = U().getWallpaperInfo();
        if (kotlin.jvm.internal.n.d((wallpaperInfo == null || (component = wallpaperInfo.getComponent()) == null) ? null : component.flattenToString(), "com.nothing.wallpaper/com.nothing.blurwallpaper.AtmosphereWallpaperService") || (i10 & 2) == 0 || !com.android.launcher3.w.f15762f) {
            return;
        }
        int colorHints = wallpaperColors != null ? wallpaperColors.getColorHints() : 0;
        if (colorHints != this.f1545r) {
            this.f1545r = colorHints;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final F z(Context context) {
        kotlin.jvm.internal.n.e(context);
        return new F(context);
    }

    public final int Q() {
        return this.f1545r;
    }

    public final boolean Y() {
        return (this.f1545r & 1) == 0;
    }

    @Override // F2.v, java.lang.AutoCloseable
    public void close() {
        this.f1546s.close();
    }

    public final void q0(int i10) {
        this.f1545r = i10;
    }
}
