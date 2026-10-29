package J6;

import android.app.Activity;
import android.content.Context;
import android.os.Environment;
import android.os.Parcel;
import android.os.Parcelable;
import com.nothing.wallpaper.R;
import com.nothing.wallpaper.db.CreativeWallpaper;
import com.nothing.wallpaper.db.WallpaperDatabase;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p014b3.o;
import p064g3.x;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends x {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final String f3592A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final String f3593B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private List f3594C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private o f3595D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f3596E;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final String f3597w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final String f3598x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final String f3599y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final String f3600z;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final a f3591F = new a(null);
    public static final Parcelable.Creator<i> CREATOR = new b();

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final String a(Context context) {
            String string;
            return (context == null || (string = context.getString(R.string.nt_creative_wallpaper_collection_id)) == null) ? "" : string;
        }

        public final List b(Context context, String collectionId) {
            n.h(context, "context");
            n.h(collectionId, "collectionId");
            return c(context, collectionId, 99);
        }

        public final List c(Context context, String collectionId, int i10) {
            n.h(context, "context");
            n.h(collectionId, "collectionId");
            U6.e.f7982c.b().e();
            ArrayList arrayList = new ArrayList();
            WallpaperDatabase.a aVar = WallpaperDatabase.f18441p;
            Context applicationContext = context.getApplicationContext();
            n.g(applicationContext, "getApplicationContext(...)");
            for (CreativeWallpaper creativeWallpaper : aVar.b(applicationContext).D().d(i10)) {
                if (creativeWallpaper.getFilePath().length() > 0 && new File(creativeWallpaper.getFilePath()).exists()) {
                    String string = context.getResources().getString(R.string.nt_ai_wallpaper_title);
                    n.g(string, "getString(...)");
                    arrayList.add(new i(String.valueOf(creativeWallpaper.getImageId()), collectionId, creativeWallpaper.getFilePath(), string, f(creativeWallpaper), creativeWallpaper.getImageUrl()));
                }
            }
            return arrayList;
        }

        public final String d(String str, String str2, Long l9) {
            return str + "+" + str2 + l9;
        }

        public final String e() {
            return Environment.DIRECTORY_PICTURES + File.separator + "Wallpaper Studio";
        }

        public final String f(CreativeWallpaper wallpaperInfo) {
            n.h(wallpaperInfo, "wallpaperInfo");
            String subjectLoc = wallpaperInfo.getSubjectLoc();
            String subjectEn = (subjectLoc == null || subjectLoc.length() == 0) ? wallpaperInfo.getSubjectEn() : wallpaperInfo.getSubjectLoc();
            String styleLoc = wallpaperInfo.getStyleLoc();
            return subjectEn + " + " + ((styleLoc == null || styleLoc.length() == 0) ? wallpaperInfo.getStyleEn() : wallpaperInfo.getStyleLoc());
        }

        private a() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i createFromParcel(Parcel parcel) {
            n.h(parcel, "parcel");
            return new i(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i[] newArray(int i10) {
            return new i[i10];
        }
    }

    public i(String wallpaperId, String collectionId, String filePath, String title, String subtitle, String str) {
        n.h(wallpaperId, "wallpaperId");
        n.h(collectionId, "collectionId");
        n.h(filePath, "filePath");
        n.h(title, "title");
        n.h(subtitle, "subtitle");
        this.f3597w = wallpaperId;
        this.f3598x = collectionId;
        this.f3599y = filePath;
        this.f3600z = title;
        this.f3592A = subtitle;
        this.f3593B = str;
    }

    public static final String y(Context context) {
        return f3591F.a(context);
    }

    public final void A(boolean z9) {
        this.f3596E = z9;
    }

    @Override // p064g3.x
    public String c(Context context) {
        return this.f3593B;
    }

    @Override // p064g3.x
    public com.android.wallpaper.asset.a d(Context context) {
        n.h(context, "context");
        o oVar = this.f3595D;
        if (oVar != null) {
            return oVar;
        }
        o oVar2 = new o(new File(this.f3599y));
        this.f3595D = oVar2;
        return oVar2;
    }

    @Override // p064g3.x
    public List e(Context context) {
        n.h(context, "context");
        List arrayList = this.f3594C;
        if (arrayList == null) {
            arrayList = new ArrayList();
            String str = this.f3600z;
            if (str != null && str.length() != 0) {
                arrayList.add(this.f3600z);
            }
            String str2 = this.f3592A;
            if (str2 != null && str2.length() != 0) {
                arrayList.add(this.f3592A);
            }
            this.f3594C = arrayList;
        }
        return arrayList;
    }

    @Override // p064g3.x
    public String g(Context context) {
        return this.f3598x;
    }

    @Override // p064g3.x
    public com.android.wallpaper.asset.a o(Context context) {
        n.h(context, "context");
        return d(context);
    }

    @Override // p064g3.x
    public String r() {
        return this.f3597w;
    }

    @Override // p064g3.x, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        n.h(dest, "dest");
        dest.writeString(this.f3597w);
        dest.writeString(this.f3598x);
        dest.writeString(this.f3599y);
        dest.writeString(this.f3600z);
        dest.writeString(this.f3592A);
        dest.writeString(this.f3593B);
    }

    @Override // p064g3.x
    public void x(Activity activity, p064g3.j jVar, int i10, boolean z9) {
        if (activity != null) {
            activity.startActivityForResult(jVar != null ? jVar.b(activity, this, z9) : null, i10);
        }
    }

    public final boolean z() {
        return this.f3596E;
    }
}
