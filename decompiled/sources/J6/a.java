package J6;

import android.app.WallpaperInfo;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p064g3.x;

/* JADX INFO: loaded from: classes2.dex */
public class a extends p064g3.k {
    public static final Parcelable.Creator<a> CREATOR = new C0121a();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private List f3536B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private String f3537C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private String f3538D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private String f3539E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private x f3540F;

    /* JADX INFO: renamed from: J6.a$a, reason: collision with other inner class name */
    class C0121a implements Parcelable.Creator {
        C0121a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(WallpaperInfo wallpaperInfo, List list, String str, String str2, String str3, C6.g gVar, x.a aVar) {
        super(wallpaperInfo);
        new ArrayList();
        this.f3536B = list;
        this.f3537C = str;
        this.f3538D = str2;
        this.f3539E = str3;
        v(gVar);
        if (aVar != null) {
            this.f21236q = aVar;
        }
    }

    @Override // p064g3.k, p064g3.x
    public String c(Context context) {
        x xVar = this.f3540F;
        return xVar != null ? xVar.c(context) : this.f3537C;
    }

    @Override // p064g3.k, p064g3.x
    public List e(Context context) {
        x xVar = this.f3540F;
        return xVar != null ? xVar.e(context) : this.f3536B;
    }

    @Override // p064g3.x
    public int f() {
        x xVar = this.f3540F;
        return xVar != null ? xVar.f() : super.f();
    }

    @Override // p064g3.k, p064g3.x
    public String g(Context context) {
        x xVar = this.f3540F;
        return xVar != null ? xVar.g(context) : this.f3538D;
    }

    @Override // p064g3.k, p064g3.x
    public String r() {
        x xVar = this.f3540F;
        String strR = xVar != null ? xVar.r() : this.f3539E;
        return strR == null ? super.r() : strR;
    }

    @Override // p064g3.k, p064g3.x, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeStringList(this.f3536B);
        parcel.writeString(this.f3537C);
        parcel.writeString(this.f3538D);
        parcel.writeString(this.f3539E);
    }

    public a(x xVar, WallpaperInfo wallpaperInfo, C6.g gVar, x.a aVar) {
        super(wallpaperInfo);
        this.f3536B = new ArrayList();
        this.f3540F = xVar;
        v(gVar);
        if (aVar != null) {
            this.f21236q = aVar;
        }
    }

    public a(Parcel parcel) {
        super(parcel);
        ArrayList arrayList = new ArrayList();
        this.f3536B = arrayList;
        parcel.readStringList(arrayList);
        this.f3537C = parcel.readString();
        this.f3538D = parcel.readString();
        this.f3539E = parcel.readString();
    }
}
