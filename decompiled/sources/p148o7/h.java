package p148o7;

import D6.f;
import I8.InterfaceC0880f;
import android.app.WallpaperInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.io.IOException;
import kotlin.jvm.internal.n;
import p064g3.x;
import p158p7.a;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final a f23538j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final f f23539k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final InterfaceC0880f f23540l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context appContext, a editFrom, x wallpaper, f wallpaperDataSource) {
        super(appContext, wallpaper);
        n.h(appContext, "appContext");
        n.h(editFrom, "editFrom");
        n.h(wallpaper, "wallpaper");
        n.h(wallpaperDataSource, "wallpaperDataSource");
        this.f23538j = editFrom;
        this.f23539k = wallpaperDataSource;
        this.f23540l = wallpaperDataSource.S();
        i().n(m7.a.c.f23244a);
    }

    @Override // androidx.lifecycle.a0
    protected void d() throws IOException {
        super.d();
        this.f23539k.close();
    }

    @Override // p148o7.b
    public InterfaceC0880f k() {
        return this.f23540l;
    }

    public final void w() throws IOException {
        d();
    }

    public final ComponentName x() {
        ComponentName component = j().q().getComponent();
        n.g(component, "getComponent(...)");
        return component;
    }

    public final Intent y() {
        WallpaperInfo wallpaperInfoQ = j().q();
        if (wallpaperInfoQ != null) {
            return new Intent("android.service.wallpaper.WallpaperService").setClassName(wallpaperInfoQ.getPackageName(), wallpaperInfoQ.getServiceName());
        }
        return null;
    }

    public final boolean z() {
        return n.d(this.f23538j, a.c.f23771b.a());
    }
}
