package p207u6;

import android.database.Cursor;
import com.nothing.wallpaper.db.CreativeWallpaper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p062g1.h;
import p062g1.i;
import p062g1.q;
import p062g1.t;
import p062g1.w;
import p142o1.k;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements p207u6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f27996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f27997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h f27998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w f27999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final w f28000e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w f28001f;

    class a extends i {
        a(b bVar, q qVar) {
            super(qVar);
        }

        @Override // p062g1.w
        protected String e() {
            return "INSERT OR ABORT INTO `wallpaper_studio_history` (`imageId`,`imageUrl`,`filePath`,`subjectEn`,`subjectLoc`,`styleEn`,`styleLoc`,`createTime`) VALUES (?,?,?,?,?,?,?,?)";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p062g1.i
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void i(k kVar, CreativeWallpaper creativeWallpaper) {
            kVar.P(1, creativeWallpaper.getImageId());
            if (creativeWallpaper.getImageUrl() == null) {
                kVar.x0(2);
            } else {
                kVar.r(2, creativeWallpaper.getImageUrl());
            }
            if (creativeWallpaper.getFilePath() == null) {
                kVar.x0(3);
            } else {
                kVar.r(3, creativeWallpaper.getFilePath());
            }
            if (creativeWallpaper.getSubjectEn() == null) {
                kVar.x0(4);
            } else {
                kVar.r(4, creativeWallpaper.getSubjectEn());
            }
            if (creativeWallpaper.getSubjectLoc() == null) {
                kVar.x0(5);
            } else {
                kVar.r(5, creativeWallpaper.getSubjectLoc());
            }
            if (creativeWallpaper.getStyleEn() == null) {
                kVar.x0(6);
            } else {
                kVar.r(6, creativeWallpaper.getStyleEn());
            }
            if (creativeWallpaper.getStyleLoc() == null) {
                kVar.x0(7);
            } else {
                kVar.r(7, creativeWallpaper.getStyleLoc());
            }
            kVar.P(8, creativeWallpaper.getCreateTime());
        }
    }

    /* JADX INFO: renamed from: u6.b$b, reason: collision with other inner class name */
    class C0687b extends h {
        C0687b(b bVar, q qVar) {
            super(qVar);
        }

        @Override // p062g1.w
        protected String e() {
            return "DELETE FROM `wallpaper_studio_history` WHERE `imageId` = ?";
        }
    }

    class c extends w {
        c(b bVar, q qVar) {
            super(qVar);
        }

        @Override // p062g1.w
        public String e() {
            return "DELETE FROM wallpaper_studio_history WHERE createTime IN (SELECT createTime FROM wallpaper_studio_history ORDER BY createTime DESC LIMIT ?,100)";
        }
    }

    class d extends w {
        d(b bVar, q qVar) {
            super(qVar);
        }

        @Override // p062g1.w
        public String e() {
            return "DELETE FROM wallpaper_studio_history WHERE filePath=?";
        }
    }

    class e extends w {
        e(b bVar, q qVar) {
            super(qVar);
        }

        @Override // p062g1.w
        public String e() {
            return "UPDATE wallpaper_studio_history SET filePath=? WHERE imageId=?";
        }
    }

    public b(q qVar) {
        this.f27996a = qVar;
        this.f27997b = new a(this, qVar);
        this.f27998c = new C0687b(this, qVar);
        this.f27999d = new c(this, qVar);
        this.f28000e = new d(this, qVar);
        this.f28001f = new e(this, qVar);
    }

    public static List g() {
        return Collections.EMPTY_LIST;
    }

    @Override // p207u6.a
    public void a(int i10) {
        this.f27996a.d();
        k kVarB = this.f27999d.b();
        kVarB.P(1, i10);
        try {
            this.f27996a.e();
            try {
                kVarB.v();
                this.f27996a.z();
                this.f27996a.i();
                this.f27999d.h(kVarB);
            } catch (Throwable th) {
                this.f27996a.i();
                throw th;
            }
        } catch (Throwable th2) {
            this.f27999d.h(kVarB);
            throw th2;
        }
    }

    @Override // p207u6.a
    public void b(CreativeWallpaper creativeWallpaper) {
        this.f27996a.d();
        this.f27996a.e();
        try {
            this.f27997b.j(creativeWallpaper);
            this.f27996a.z();
        } finally {
            this.f27996a.i();
        }
    }

    @Override // p207u6.a
    public int c(long j9, String str) {
        this.f27996a.d();
        k kVarB = this.f28001f.b();
        if (str == null) {
            kVarB.x0(1);
        } else {
            kVarB.r(1, str);
        }
        kVarB.P(2, j9);
        try {
            this.f27996a.e();
            try {
                int iV = kVarB.v();
                this.f27996a.z();
                this.f27996a.i();
                this.f28001f.h(kVarB);
                return iV;
            } catch (Throwable th) {
                this.f27996a.i();
                throw th;
            }
        } catch (Throwable th2) {
            this.f28001f.h(kVarB);
            throw th2;
        }
    }

    @Override // p207u6.a
    public List d(int i10) {
        t tVarF = t.f("SELECT * FROM wallpaper_studio_history WHERE filePath IS NOT NULL AND filePath!='' ORDER BY createTime DESC LIMIT ?", 1);
        tVarF.P(1, i10);
        this.f27996a.d();
        Cursor cursorB = p072h1.b.b(this.f27996a, tVarF, false, null);
        try {
            int iD = p072h1.a.d(cursorB, "imageId");
            int iD2 = p072h1.a.d(cursorB, "imageUrl");
            int iD3 = p072h1.a.d(cursorB, "filePath");
            int iD4 = p072h1.a.d(cursorB, "subjectEn");
            int iD5 = p072h1.a.d(cursorB, "subjectLoc");
            int iD6 = p072h1.a.d(cursorB, "styleEn");
            int iD7 = p072h1.a.d(cursorB, "styleLoc");
            int iD8 = p072h1.a.d(cursorB, "createTime");
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(new CreativeWallpaper(cursorB.getLong(iD), cursorB.isNull(iD2) ? null : cursorB.getString(iD2), cursorB.isNull(iD3) ? null : cursorB.getString(iD3), cursorB.isNull(iD4) ? null : cursorB.getString(iD4), cursorB.isNull(iD5) ? null : cursorB.getString(iD5), cursorB.isNull(iD6) ? null : cursorB.getString(iD6), cursorB.isNull(iD7) ? null : cursorB.getString(iD7), cursorB.getLong(iD8)));
            }
            return arrayList;
        } finally {
            cursorB.close();
            tVarF.u();
        }
    }

    @Override // p207u6.a
    public CreativeWallpaper e(long j9) {
        t tVarF = t.f("SELECT * FROM wallpaper_studio_history WHERE imageId=?", 1);
        tVarF.P(1, j9);
        this.f27996a.d();
        CreativeWallpaper creativeWallpaper = null;
        Cursor cursorB = p072h1.b.b(this.f27996a, tVarF, false, null);
        try {
            int iD = p072h1.a.d(cursorB, "imageId");
            int iD2 = p072h1.a.d(cursorB, "imageUrl");
            int iD3 = p072h1.a.d(cursorB, "filePath");
            int iD4 = p072h1.a.d(cursorB, "subjectEn");
            int iD5 = p072h1.a.d(cursorB, "subjectLoc");
            int iD6 = p072h1.a.d(cursorB, "styleEn");
            int iD7 = p072h1.a.d(cursorB, "styleLoc");
            int iD8 = p072h1.a.d(cursorB, "createTime");
            if (cursorB.moveToFirst()) {
                creativeWallpaper = new CreativeWallpaper(cursorB.getLong(iD), cursorB.isNull(iD2) ? null : cursorB.getString(iD2), cursorB.isNull(iD3) ? null : cursorB.getString(iD3), cursorB.isNull(iD4) ? null : cursorB.getString(iD4), cursorB.isNull(iD5) ? null : cursorB.getString(iD5), cursorB.isNull(iD6) ? null : cursorB.getString(iD6), cursorB.isNull(iD7) ? null : cursorB.getString(iD7), cursorB.getLong(iD8));
            }
            return creativeWallpaper;
        } finally {
            cursorB.close();
            tVarF.u();
        }
    }

    @Override // p207u6.a
    public CreativeWallpaper f(String str) {
        t tVarF = t.f("SELECT * FROM wallpaper_studio_history WHERE imageUrl=?", 1);
        if (str == null) {
            tVarF.x0(1);
        } else {
            tVarF.r(1, str);
        }
        this.f27996a.d();
        CreativeWallpaper creativeWallpaper = null;
        Cursor cursorB = p072h1.b.b(this.f27996a, tVarF, false, null);
        try {
            int iD = p072h1.a.d(cursorB, "imageId");
            int iD2 = p072h1.a.d(cursorB, "imageUrl");
            int iD3 = p072h1.a.d(cursorB, "filePath");
            int iD4 = p072h1.a.d(cursorB, "subjectEn");
            int iD5 = p072h1.a.d(cursorB, "subjectLoc");
            int iD6 = p072h1.a.d(cursorB, "styleEn");
            int iD7 = p072h1.a.d(cursorB, "styleLoc");
            int iD8 = p072h1.a.d(cursorB, "createTime");
            if (cursorB.moveToFirst()) {
                creativeWallpaper = new CreativeWallpaper(cursorB.getLong(iD), cursorB.isNull(iD2) ? null : cursorB.getString(iD2), cursorB.isNull(iD3) ? null : cursorB.getString(iD3), cursorB.isNull(iD4) ? null : cursorB.getString(iD4), cursorB.isNull(iD5) ? null : cursorB.getString(iD5), cursorB.isNull(iD6) ? null : cursorB.getString(iD6), cursorB.isNull(iD7) ? null : cursorB.getString(iD7), cursorB.getLong(iD8));
            }
            return creativeWallpaper;
        } finally {
            cursorB.close();
            tVarF.u();
        }
    }

    @Override // p207u6.a
    public int getCount() {
        t tVarF = t.f("SELECT COUNT(*) FROM wallpaper_studio_history", 0);
        this.f27996a.d();
        Cursor cursorB = p072h1.b.b(this.f27996a, tVarF, false, null);
        try {
            return cursorB.moveToFirst() ? cursorB.getInt(0) : 0;
        } finally {
            cursorB.close();
            tVarF.u();
        }
    }
}
