package p093j2;

import H3.q;
import I8.InterfaceC0880f;
import kotlin.jvm.internal.n;
import p074h3.InterfaceC1364d;
import p219v8.l;
import p219v8.p;
import p228w7.b;
import p234x3.d;

/* JADX INFO: loaded from: classes.dex */
public final class a extends d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final J1.a f22292h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private b f22293i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(q previewUtils, p219v8.a initialExtrasProvider, p wallpaperInfoProvider, l onWallpaperColorChanged, p194t3.a wallpaperInteractor, J1.a aVar, InterfaceC1364d.a screen) {
        super(previewUtils, initialExtrasProvider, wallpaperInfoProvider, onWallpaperColorChanged, wallpaperInteractor, screen);
        n.h(previewUtils, "previewUtils");
        n.h(initialExtrasProvider, "initialExtrasProvider");
        n.h(wallpaperInfoProvider, "wallpaperInfoProvider");
        n.h(onWallpaperColorChanged, "onWallpaperColorChanged");
        n.h(wallpaperInteractor, "wallpaperInteractor");
        n.h(screen, "screen");
        this.f22292h = aVar;
    }

    @Override // p234x3.d
    public InterfaceC0880f k() {
        b bVar = this.f22293i;
        if (bVar != null) {
            return bVar.a();
        }
        return null;
    }

    @Override // p234x3.d
    public InterfaceC0880f q() {
        J1.a aVar = this.f22292h;
        if (aVar != null) {
            return aVar.a();
        }
        return null;
    }

    public void r() {
        b bVar = this.f22293i;
        if (bVar != null) {
            bVar.b(false);
        }
    }

    public final void s(b interactor) {
        n.h(interactor, "interactor");
        this.f22293i = interactor;
    }
}
