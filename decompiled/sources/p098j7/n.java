package p098j7;

import D6.e;
import D6.f;
import android.app.Application;
import androidx.lifecycle.Q;
import androidx.lifecycle.U;
import androidx.lifecycle.a0;
import androidx.lifecycle.d0;
import p064g3.x;
import p148o7.g;
import p148o7.h;
import p237x6.k;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n {

    public static final class a implements d0.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p158p7.a f22533b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ x f22534c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f f22535d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ k f22536e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f22537f;

        a(p158p7.a aVar, x xVar, f fVar, k kVar, boolean z9) {
            this.f22533b = aVar;
            this.f22534c = xVar;
            this.f22535d = fVar;
            this.f22536e = kVar;
            this.f22537f = z9;
        }

        @Override // androidx.lifecycle.d0.c
        public a0 c(Class modelClass, Z0.a extras) {
            kotlin.jvm.internal.n.h(modelClass, "modelClass");
            kotlin.jvm.internal.n.h(extras, "extras");
            p158p7.a aVar = this.f22533b;
            x xVar = this.f22534c;
            f fVar = this.f22535d;
            k kVar = this.f22536e;
            boolean z9 = this.f22537f;
            Object objA = extras.a(d0.a.f13396h);
            if (objA == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Application application = (Application) objA;
            if (modelClass.isAssignableFrom(j.class)) {
                return new j(application, aVar, xVar, fVar, kVar);
            }
            if (modelClass.isAssignableFrom(g.class) && z9) {
                Q qA = U.a(extras);
                if (kVar == null) {
                    throw new IllegalArgumentException("AssetManager is null when create ImageCropWallpaperViewModel.");
                }
                kotlin.jvm.internal.n.f(fVar, "null cannot be cast to non-null type com.nothing.wallpaper.effects.data.source.IWallpaperBitmapDataSource");
                return new g(application, xVar, aVar, kVar, (e) fVar, qA);
            }
            if (modelClass.isAssignableFrom(h.class) && !z9) {
                return new h(application, aVar, xVar, fVar);
            }
            throw new IllegalArgumentException("Unknown ViewModel class: " + modelClass.getName());
        }
    }

    public static final d0.c a(p158p7.a editFrom, x wallpaper, k kVar, f wallpaperDataSource) {
        kotlin.jvm.internal.n.h(editFrom, "editFrom");
        kotlin.jvm.internal.n.h(wallpaper, "wallpaper");
        kotlin.jvm.internal.n.h(wallpaperDataSource, "wallpaperDataSource");
        return new a(editFrom, wallpaper, wallpaperDataSource, kVar, G6.e.s(wallpaper));
    }
}
