package p242y1;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0743a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f30152q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f30153r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final String f30154s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final p203u2.a f30155t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f30156u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f30157v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f30158w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Uri f30159x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f30160y;

    /* JADX INFO: renamed from: y1.a$a, reason: collision with other inner class name */
    class C0743a implements Parcelable.Creator {
        C0743a() {
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

    public a(String str, String str2, boolean z9, int i10, int i11, Uri uri, int i12, String str3) {
        this.f30152q = str;
        this.f30153r = z9;
        this.f30154s = str3;
        this.f30155t = new p203u2.a(i10, i11, str3);
        this.f30156u = str2;
        this.f30157v = i10;
        this.f30158w = i11;
        this.f30159x = uri;
        this.f30160y = i12;
    }

    public String a() {
        return this.f30152q;
    }

    public boolean b(p222w1.a aVar) {
        return this.f30153r;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (TextUtils.equals(this.f30156u, aVar.f30156u) && this.f30158w == aVar.f30158w && this.f30157v == aVar.f30157v) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return String.format("GridOption{mTitle='%s', mIsCurrent=%s, mTileDrawable=%s, name='%s', rows=%d, cols=%d, previewImageUri=%s, previewPagesCount=%d}\n", this.f30152q, Boolean.valueOf(this.f30153r), this.f30155t, this.f30156u, Integer.valueOf(this.f30157v), Integer.valueOf(this.f30158w), this.f30159x, Integer.valueOf(this.f30160y));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f30152q);
        parcel.writeByte(this.f30153r ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f30154s);
        parcel.writeString(this.f30156u);
        parcel.writeInt(this.f30157v);
        parcel.writeInt(this.f30158w);
        parcel.writeParcelable(this.f30159x, i10);
        parcel.writeInt(this.f30160y);
    }

    protected a(Parcel parcel) {
        this.f30152q = parcel.readString();
        this.f30153r = parcel.readByte() != 0;
        String string = parcel.readString();
        this.f30154s = string;
        this.f30156u = parcel.readString();
        int i10 = parcel.readInt();
        this.f30157v = i10;
        int i11 = parcel.readInt();
        this.f30158w = i11;
        this.f30159x = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f30160y = parcel.readInt();
        this.f30155t = new p203u2.a(i10, i11, string);
    }
}
