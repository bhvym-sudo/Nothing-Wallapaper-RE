package com.nothing.wallpaper.db;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p062g1.f;
import p062g1.q;
import p062g1.s;
import p072h1.b;
import p072h1.d;
import p142o1.g;
import p142o1.h;
import p207u6.c;

/* JADX INFO: loaded from: classes2.dex */
public final class WallpaperDatabase_Impl extends WallpaperDatabase {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private volatile p207u6.a f18443r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private volatile c f18444s;

    class a extends s.b {
        a(int i10) {
            super(i10);
        }

        @Override // g1.s.b
        public void a(g gVar) {
            gVar.q("CREATE TABLE IF NOT EXISTS `wallpaper_studio_history` (`imageId` INTEGER NOT NULL, `imageUrl` TEXT NOT NULL, `filePath` TEXT NOT NULL, `subjectEn` TEXT NOT NULL, `subjectLoc` TEXT, `styleEn` TEXT NOT NULL, `styleLoc` TEXT, `createTime` INTEGER NOT NULL, PRIMARY KEY(`imageId`))");
            gVar.q("CREATE TABLE IF NOT EXISTS `wallpaper_request_index` (`_Id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `subjectPromptId` INTEGER NOT NULL, `stylePromptId` INTEGER NOT NULL, `indexArray` TEXT NOT NULL, `totalCount` INTEGER NOT NULL, `requestIndex` INTEGER NOT NULL, `version` INTEGER NOT NULL)");
            gVar.q("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            gVar.q("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'b3d321ba58c586feff189d308a1141be')");
        }

        @Override // g1.s.b
        public void b(g gVar) {
            gVar.q("DROP TABLE IF EXISTS `wallpaper_studio_history`");
            gVar.q("DROP TABLE IF EXISTS `wallpaper_request_index`");
            List list = ((q) WallpaperDatabase_Impl.this).f21073h;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((q.b) it.next()).b(gVar);
                }
            }
        }

        @Override // g1.s.b
        public void c(g gVar) {
            List list = ((q) WallpaperDatabase_Impl.this).f21073h;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((q.b) it.next()).a(gVar);
                }
            }
        }

        @Override // g1.s.b
        public void d(g gVar) {
            ((q) WallpaperDatabase_Impl.this).f21066a = gVar;
            WallpaperDatabase_Impl.this.u(gVar);
            List list = ((q) WallpaperDatabase_Impl.this).f21073h;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((q.b) it.next()).c(gVar);
                }
            }
        }

        @Override // g1.s.b
        public void e(g gVar) {
        }

        @Override // g1.s.b
        public void f(g gVar) throws IOException {
            b.a(gVar);
        }

        @Override // g1.s.b
        public s.c g(g gVar) {
            HashMap map = new HashMap(8);
            map.put("imageId", new d.a("imageId", "INTEGER", true, 1, null, 1));
            map.put("imageUrl", new d.a("imageUrl", "TEXT", true, 0, null, 1));
            map.put("filePath", new d.a("filePath", "TEXT", true, 0, null, 1));
            map.put("subjectEn", new d.a("subjectEn", "TEXT", true, 0, null, 1));
            map.put("subjectLoc", new d.a("subjectLoc", "TEXT", false, 0, null, 1));
            map.put("styleEn", new d.a("styleEn", "TEXT", true, 0, null, 1));
            map.put("styleLoc", new d.a("styleLoc", "TEXT", false, 0, null, 1));
            map.put("createTime", new d.a("createTime", "INTEGER", true, 0, null, 1));
            d dVar = new d("wallpaper_studio_history", map, new HashSet(0), new HashSet(0));
            d dVarA = d.a(gVar, "wallpaper_studio_history");
            if (!dVar.equals(dVarA)) {
                return new s.c(false, "wallpaper_studio_history(com.nothing.wallpaper.db.CreativeWallpaper).\n Expected:\n" + dVar + "\n Found:\n" + dVarA);
            }
            HashMap map2 = new HashMap(7);
            map2.put("_Id", new d.a("_Id", "INTEGER", true, 1, null, 1));
            map2.put("subjectPromptId", new d.a("subjectPromptId", "INTEGER", true, 0, null, 1));
            map2.put("stylePromptId", new d.a("stylePromptId", "INTEGER", true, 0, null, 1));
            map2.put("indexArray", new d.a("indexArray", "TEXT", true, 0, null, 1));
            map2.put("totalCount", new d.a("totalCount", "INTEGER", true, 0, null, 1));
            map2.put("requestIndex", new d.a("requestIndex", "INTEGER", true, 0, null, 1));
            map2.put("version", new d.a("version", "INTEGER", true, 0, null, 1));
            d dVar2 = new d("wallpaper_request_index", map2, new HashSet(0), new HashSet(0));
            d dVarA2 = d.a(gVar, "wallpaper_request_index");
            if (dVar2.equals(dVarA2)) {
                return new s.c(true, null);
            }
            return new s.c(false, "wallpaper_request_index(com.nothing.wallpaper.db.WallpaperRequestIndex).\n Expected:\n" + dVar2 + "\n Found:\n" + dVarA2);
        }
    }

    @Override // com.nothing.wallpaper.db.WallpaperDatabase
    public p207u6.a D() {
        p207u6.a aVar;
        if (this.f18443r != null) {
            return this.f18443r;
        }
        synchronized (this) {
            try {
                if (this.f18443r == null) {
                    this.f18443r = new p207u6.b(this);
                }
                aVar = this.f18443r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    @Override // com.nothing.wallpaper.db.WallpaperDatabase
    public c E() {
        c cVar;
        if (this.f18444s != null) {
            return this.f18444s;
        }
        synchronized (this) {
            try {
                if (this.f18444s == null) {
                    this.f18444s = new p207u6.d(this);
                }
                cVar = this.f18444s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    @Override // p062g1.q
    protected androidx.room.c g() {
        return new androidx.room.c(this, new HashMap(0), new HashMap(0), "wallpaper_studio_history", "wallpaper_request_index");
    }

    @Override // p062g1.q
    protected h h(f fVar) {
        return fVar.f21037c.a(h.b.a(fVar.f21035a).c(fVar.f21036b).b(new s(fVar, new a(1), "b3d321ba58c586feff189d308a1141be", "586317cffd96661a62859088aa6e276c")).a());
    }

    @Override // p062g1.q
    public List j(Map map) {
        return new ArrayList();
    }

    @Override // p062g1.q
    public Set o() {
        return new HashSet();
    }

    @Override // p062g1.q
    protected Map p() {
        HashMap map = new HashMap();
        map.put(p207u6.a.class, p207u6.b.g());
        map.put(c.class, p207u6.d.e());
        return map;
    }
}
