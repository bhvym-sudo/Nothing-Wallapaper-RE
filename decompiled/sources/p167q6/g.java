package p167q6;

import android.os.Bundle;
import android.os.RemoteCallback;
import android.os.RemoteException;
import android.service.wallpaper.IWallpaperEngine;
import android.util.Log;
import kotlin.jvm.internal.n;
import p079h8.A;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g {
    public static final void a(IWallpaperEngine iWallpaperEngine, int i10, boolean z9, boolean z10, RemoteCallback remoteCallback) {
        if (iWallpaperEngine != null) {
            try {
                Bundle bundle = new Bundle();
                bundle.putInt("preview_action", 0);
                bundle.putInt("preview_page", i10);
                bundle.putBoolean("preview_play_animation", z9);
                bundle.putBoolean("preview_same_as_home", z10);
                if (remoteCallback != null) {
                    bundle.putParcelable("preview_frame_callback", remoteCallback);
                }
                A a10 = A.f21846a;
                iWallpaperEngine.dispatchWallpaperCommand("android.wallpaper.tap", 0, 0, 0, bundle);
            } catch (RemoteException unused) {
                Log.e("WallpaperCommandUtils", "Error dispatching wallpaper command for sendAtmospherePreview.");
            }
        }
    }

    public static final void b(p177r6.g gVar, String str, int i10) {
        n.h(gVar, "<this>");
        Bundle bundle = new Bundle();
        bundle.putInt("preview_action", 1);
        bundle.putString("preview_uri", str);
        bundle.putInt("preview_page", i10);
        A a10 = A.f21846a;
        gVar.f0("android.wallpaper.tap", bundle);
    }

    public static final void c(p177r6.g gVar, int i10, boolean z9, boolean z10, RemoteCallback remoteCallback) {
        n.h(gVar, "<this>");
        Bundle bundle = new Bundle();
        bundle.putInt("preview_action", 0);
        bundle.putInt("preview_page", i10);
        bundle.putBoolean("preview_play_animation", z9);
        bundle.putBoolean("preview_same_as_home", z10);
        if (remoteCallback != null) {
            bundle.putParcelable("preview_frame_callback", remoteCallback);
        }
        A a10 = A.f21846a;
        gVar.f0("android.wallpaper.tap", bundle);
    }
}
