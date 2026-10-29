package I6;

import J6.e;
import android.graphics.Bitmap;
import java.io.ByteArrayInputStream;
import kotlin.jvm.internal.n;
import p074h3.C1383x;
import p167q6.b;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f3124a = new b("WallpaperQuickSet");

    public static final boolean a(int i10) {
        return i10 != -1;
    }

    public static final int b(e eVar, C1383x persister, Bitmap bitmap, boolean z9, int i10) {
        int iO;
        n.h(persister, "persister");
        n.h(bitmap, "bitmap");
        if (eVar == null || !eVar.g()) {
            iO = -1;
        } else {
            b bVar = f3124a;
            bVar.a("setWallpaperWithCache: try get result from cache");
            e.a aVarF = eVar.f();
            if (aVarF instanceof e.a.d) {
                bVar.a("setWallpaperWithCache: got reusable cache");
                iO = persister.t(new ByteArrayInputStream(((e.a.d) aVarF).a().toByteArray()), z9, i10);
            } else if (aVarF instanceof e.a.C0123a) {
                bVar.a("setWallpaperWithCache: compression is done but no output");
                iO = persister.o(bitmap, z9, i10);
            } else {
                bVar.a("setWallpaperWithCache: compression was interrupted");
                iO = -1;
            }
        }
        f3124a.f("setWallpaperWithCache: settled wallpaper id is " + iO);
        return iO;
    }
}
