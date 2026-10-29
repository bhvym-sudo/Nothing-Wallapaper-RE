package p074h3;

import C6.g;
import G6.e;
import J6.a;
import android.app.WallpaperInfo;
import java.util.List;
import p064g3.k;
import p064g3.x;

/* JADX INFO: renamed from: h3.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1378s implements K {
    @Override // p074h3.K
    public x a(WallpaperInfo wallpaperInfo) {
        return new k(wallpaperInfo);
    }

    @Override // p074h3.K
    public x b(WallpaperInfo wallpaperInfo, List list, String str, String str2, String str3, g gVar, x.a aVar) {
        return e.h(wallpaperInfo) ? new a(wallpaperInfo, list, str, str2, str3, gVar, aVar) : a(wallpaperInfo);
    }
}
