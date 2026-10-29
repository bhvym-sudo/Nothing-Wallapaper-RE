package p064g3;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.android.wallpaper.asset.g;
import com.nothing.wallpaper.R;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class i extends x {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Uri f21167w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private g f21168x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f21169y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f21170z;
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final String[] f21166A = {"ImageDescription", "Artist", "DateTimeOriginal", "Model"};

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public i createFromParcel(Parcel parcel) {
            return new i(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i[] newArray(int i10) {
            return new i[i10];
        }
    }

    public i(Uri uri) {
        this.f21167w = uri;
    }

    private static String y(String str) {
        try {
            return DateFormat.getDateInstance().format(new SimpleDateFormat("yyyy:MM:dd HH:mm:ss").parse(str));
        } catch (ParseException e10) {
            Log.w("ImageWallpaperInfo", "Unable to parse image datetime", e10);
            return str;
        }
    }

    private static List z(Context context) {
        return Arrays.asList(context.getResources().getString(R.string.my_photos_generic_wallpaper_title));
    }

    @Override // p064g3.x
    public com.android.wallpaper.asset.a d(Context context) {
        if (this.f21169y) {
            this.f21168x = new g(context, this.f21167w, true);
        } else if (this.f21168x == null) {
            this.f21168x = new g(context, this.f21167w);
        }
        return this.f21168x;
    }

    @Override // p064g3.x
    public List e(Context context) {
        g gVar = (g) d(context);
        if (!gVar.V()) {
            return z(context);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : f21166A) {
            String strY = gVar.Y(str);
            if (strY != null) {
                if (str == "DateTimeOriginal") {
                    strY = y(strY);
                }
                arrayList.add(strY);
            }
        }
        return !arrayList.isEmpty() ? arrayList : z(context);
    }

    @Override // p064g3.x
    public String g(Context context) {
        return this.f21170z == 1 ? context.getString(R.string.image_wallpaper_collection_id) : context.getString(R.string.image_wallpaper_not_photo_collection_id);
    }

    @Override // p064g3.x
    public com.android.wallpaper.asset.a o(Context context) {
        return d(context);
    }

    @Override // p064g3.x
    public String p(Context context) {
        return null;
    }

    @Override // p064g3.x, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.f21167w.toString());
        parcel.writeInt(this.f21170z);
    }

    @Override // p064g3.x
    public void x(Activity activity, j jVar, int i10, boolean z9) {
        activity.startActivityForResult(jVar.b(activity, this, z9), i10);
    }

    public i(Uri uri, int i10) {
        this.f21167w = uri;
        this.f21170z = i10;
    }

    protected i(Parcel parcel) {
        super(parcel);
        this.f21167w = Uri.parse(parcel.readString());
        this.f21170z = parcel.readInt();
    }
}
