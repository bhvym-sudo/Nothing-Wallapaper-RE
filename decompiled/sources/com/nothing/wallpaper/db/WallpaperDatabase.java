package com.nothing.wallpaper.db;

import android.content.Context;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p062g1.p;
import p062g1.q;
import p142o1.g;
import p207u6.c;

/* JADX INFO: loaded from: classes2.dex */
public abstract class WallpaperDatabase extends q {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f18441p = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static volatile WallpaperDatabase f18442q;

    public static final class a {

        /* JADX INFO: renamed from: com.nothing.wallpaper.db.WallpaperDatabase$a$a, reason: collision with other inner class name */
        public static final class C0480a extends q.b {
            C0480a() {
            }

            @Override // g1.q.b
            public void a(g db) {
                n.h(db, "db");
            }
        }

        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private final WallpaperDatabase a(Context context) {
            return (WallpaperDatabase) p.a(context, WallpaperDatabase.class, "NTWallpaper.db").a(new C0480a()).c().b();
        }

        public final WallpaperDatabase b(Context context) {
            WallpaperDatabase wallpaperDatabaseA;
            n.h(context, "context");
            WallpaperDatabase wallpaperDatabase = WallpaperDatabase.f18442q;
            if (wallpaperDatabase != null) {
                return wallpaperDatabase;
            }
            synchronized (this) {
                wallpaperDatabaseA = WallpaperDatabase.f18442q;
                if (wallpaperDatabaseA == null) {
                    wallpaperDatabaseA = WallpaperDatabase.f18441p.a(context);
                    WallpaperDatabase.f18442q = wallpaperDatabaseA;
                }
            }
            return wallpaperDatabaseA;
        }

        private a() {
        }
    }

    public abstract p207u6.a D();

    public abstract c E();
}
