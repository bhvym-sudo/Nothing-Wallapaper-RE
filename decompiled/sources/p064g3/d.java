package p064g3;

import android.app.Activity;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.wallpaper.asset.e;
import com.android.wallpaper.asset.h;
import java.util.ArrayList;
import java.util.List;
import p074h3.I;

/* JADX INFO: loaded from: classes.dex */
public class d extends x {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private String f21155A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final String f21156B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f21157C;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private List f21158w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private com.android.wallpaper.asset.a f21159x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f21160y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f21161z;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int i10) {
            return new d[i10];
        }
    }

    private com.android.wallpaper.asset.a y(Context context) {
        return (this.f21157C != 1 || I.a().l(context).a()) ? new h(context, this.f21157C) : new e(context);
    }

    @Override // p064g3.x
    public String c(Context context) {
        return this.f21160y;
    }

    @Override // p064g3.x
    public com.android.wallpaper.asset.a d(Context context) {
        if (this.f21159x == null) {
            this.f21159x = y(context.getApplicationContext());
        }
        return this.f21159x;
    }

    @Override // p064g3.x
    public List e(Context context) {
        return this.f21158w;
    }

    @Override // p064g3.x
    public String g(Context context) {
        return this.f21155A;
    }

    @Override // p064g3.x
    public String n(Context context) {
        return null;
    }

    @Override // p064g3.x
    public com.android.wallpaper.asset.a o(Context context) {
        return d(context);
    }

    @Override // p064g3.x
    public String r() {
        String str = this.f21156B;
        return str == null ? "unknown_current_wallpaper_id" : str;
    }

    @Override // p064g3.x, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeStringList(this.f21158w);
        parcel.writeInt(this.f21157C);
        parcel.writeString(this.f21160y);
        parcel.writeString(this.f21155A);
        parcel.writeInt(this.f21161z);
        parcel.writeString(this.f21156B);
    }

    @Override // p064g3.x
    public void x(Activity activity, j jVar, int i10, boolean z9) {
        activity.startActivityForResult(jVar.b(activity, this, z9), i10);
    }

    public d(List list, String str, String str2, int i10, String str3, x.a aVar) {
        this.f21158w = list;
        this.f21157C = i10;
        this.f21160y = str;
        this.f21155A = str2;
        this.f21236q = aVar;
        this.f21156B = str3;
    }

    private d(Parcel parcel) {
        super(parcel);
        ArrayList arrayList = new ArrayList();
        this.f21158w = arrayList;
        parcel.readStringList(arrayList);
        this.f21157C = parcel.readInt();
        this.f21160y = parcel.readString();
        this.f21155A = parcel.readString();
        this.f21161z = parcel.readInt();
        this.f21156B = parcel.readString();
    }
}
