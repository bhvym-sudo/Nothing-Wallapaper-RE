package p207u6;

import android.database.Cursor;
import com.nothing.wallpaper.db.WallpaperRequestIndex;
import java.util.Collections;
import java.util.List;
import p062g1.h;
import p062g1.i;
import p062g1.q;
import p062g1.t;
import p062g1.w;
import p142o1.k;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements p207u6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f28002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f28003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f28004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w f28005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w f28006e;

    class a extends i {
        a(d dVar, q qVar) {
            super(qVar);
        }

        @Override // p062g1.w
        protected String e() {
            return "INSERT OR ABORT INTO `wallpaper_request_index` (`_Id`,`subjectPromptId`,`stylePromptId`,`indexArray`,`totalCount`,`requestIndex`,`version`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p062g1.i
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(k kVar, WallpaperRequestIndex wallpaperRequestIndex) {
            kVar.P(1, wallpaperRequestIndex.get_Id());
            kVar.P(2, wallpaperRequestIndex.getSubjectPromptId());
            kVar.P(3, wallpaperRequestIndex.getStylePromptId());
            if (wallpaperRequestIndex.getIndexArray() == null) {
                kVar.x0(4);
            } else {
                kVar.r(4, wallpaperRequestIndex.getIndexArray());
            }
            kVar.P(5, wallpaperRequestIndex.getTotalCount());
            kVar.P(6, wallpaperRequestIndex.getRequestIndex());
            kVar.P(7, wallpaperRequestIndex.getVersion());
        }
    }

    class b extends h {
        b(d dVar, q qVar) {
            super(qVar);
        }

        @Override // p062g1.w
        protected String e() {
            return "DELETE FROM `wallpaper_request_index` WHERE `_Id` = ?";
        }
    }

    class c extends w {
        c(d dVar, q qVar) {
            super(qVar);
        }

        @Override // p062g1.w
        public String e() {
            return "UPDATE wallpaper_request_index SET requestIndex=? WHERE subjectPromptId=? and stylePromptId=?";
        }
    }

    /* JADX INFO: renamed from: u6.d$d, reason: collision with other inner class name */
    class C0688d extends w {
        C0688d(d dVar, q qVar) {
            super(qVar);
        }

        @Override // p062g1.w
        public String e() {
            return "UPDATE wallpaper_request_index SET indexArray=?, totalCount=?, version=? WHERE subjectPromptId=? and stylePromptId=?";
        }
    }

    public d(q qVar) {
        this.f28002a = qVar;
        this.f28003b = new a(this, qVar);
        this.f28004c = new b(this, qVar);
        this.f28005d = new c(this, qVar);
        this.f28006e = new C0688d(this, qVar);
    }

    public static List e() {
        return Collections.EMPTY_LIST;
    }

    @Override // p207u6.c
    public WallpaperRequestIndex a(long j9, long j10) {
        t tVarF = t.f("SELECT * FROM wallpaper_request_index WHERE subjectPromptId=? and stylePromptId=?", 2);
        tVarF.P(1, j9);
        tVarF.P(2, j10);
        this.f28002a.d();
        WallpaperRequestIndex wallpaperRequestIndex = null;
        Cursor cursorB = p072h1.b.b(this.f28002a, tVarF, false, null);
        try {
            int iD = p072h1.a.d(cursorB, "_Id");
            int iD2 = p072h1.a.d(cursorB, "subjectPromptId");
            int iD3 = p072h1.a.d(cursorB, "stylePromptId");
            int iD4 = p072h1.a.d(cursorB, "indexArray");
            int iD5 = p072h1.a.d(cursorB, "totalCount");
            int iD6 = p072h1.a.d(cursorB, "requestIndex");
            int iD7 = p072h1.a.d(cursorB, "version");
            if (cursorB.moveToFirst()) {
                wallpaperRequestIndex = new WallpaperRequestIndex(cursorB.getInt(iD), cursorB.getLong(iD2), cursorB.getLong(iD3), cursorB.isNull(iD4) ? null : cursorB.getString(iD4), cursorB.getInt(iD5), cursorB.getInt(iD6), cursorB.getInt(iD7));
            }
            return wallpaperRequestIndex;
        } finally {
            cursorB.close();
            tVarF.u();
        }
    }

    @Override // p207u6.c
    public int b(long j9, long j10, String str, int i10, int i11) {
        this.f28002a.d();
        k kVarB = this.f28006e.b();
        if (str == null) {
            kVarB.x0(1);
        } else {
            kVarB.r(1, str);
        }
        kVarB.P(2, i10);
        kVarB.P(3, i11);
        kVarB.P(4, j9);
        kVarB.P(5, j10);
        try {
            this.f28002a.e();
            try {
                int iV = kVarB.v();
                this.f28002a.z();
                this.f28002a.i();
                this.f28006e.h(kVarB);
                return iV;
            } catch (Throwable th) {
                this.f28002a.i();
                throw th;
            }
        } catch (Throwable th2) {
            this.f28006e.h(kVarB);
            throw th2;
        }
    }

    @Override // p207u6.c
    public int c(long j9, long j10, int i10) {
        this.f28002a.d();
        k kVarB = this.f28005d.b();
        kVarB.P(1, i10);
        kVarB.P(2, j9);
        kVarB.P(3, j10);
        try {
            this.f28002a.e();
            try {
                int iV = kVarB.v();
                this.f28002a.z();
                this.f28002a.i();
                this.f28005d.h(kVarB);
                return iV;
            } catch (Throwable th) {
                this.f28002a.i();
                throw th;
            }
        } catch (Throwable th2) {
            this.f28005d.h(kVarB);
            throw th2;
        }
    }

    @Override // p207u6.c
    public void d(WallpaperRequestIndex wallpaperRequestIndex) {
        this.f28002a.d();
        this.f28002a.e();
        try {
            this.f28003b.j(wallpaperRequestIndex);
            this.f28002a.z();
        } finally {
            this.f28002a.i();
        }
    }
}
