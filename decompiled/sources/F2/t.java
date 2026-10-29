package F2;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.UserHandle;

/* JADX INFO: loaded from: classes.dex */
public class t extends C2.b implements Parcelable {
    public static final Parcelable.Creator<t> CREATOR = new a();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final int f1596F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final int f1597G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final int f1598H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final Parcelable f1599I;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public t createFromParcel(Parcel parcel) {
            return new t(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public t[] newArray(int i10) {
            return new t[i10];
        }
    }

    private t(int i10, int i11, Parcelable parcelable) {
        this(i10, 0, i11, parcelable);
    }

    public static t k(int i10, com.nothing.launcher.card.a aVar, C2.b bVar) {
        t tVar = new t(i10, 1, aVar);
        tVar.a(bVar);
        return tVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public com.nothing.launcher.card.a l() {
        if (this.f1598H == 1) {
            return (com.nothing.launcher.card.a) this.f1599I;
        }
        return null;
    }

    public int m() {
        if (this.f1598H == 1) {
            return this.f1596F;
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        ContentValues contentValues = new ContentValues();
        j(contentValues);
        contentValues.writeToParcel(parcel, i10);
        parcel.writeParcelable(this.f591C, i10);
        parcel.writeInt(this.f1596F);
        parcel.writeInt(this.f1597G);
        parcel.writeInt(this.f1598H);
        parcel.writeParcelable(this.f1599I, i10);
    }

    private t(int i10, int i11, int i12, Parcelable parcelable) {
        this.f1596F = i10;
        this.f1597G = i11;
        this.f1598H = i12;
        this.f1599I = parcelable;
    }

    public t(Parcel parcel) {
        g((ContentValues) ContentValues.CREATOR.createFromParcel(parcel));
        this.f591C = (UserHandle) parcel.readParcelable(getClass().getClassLoader(), UserHandle.class);
        this.f1596F = parcel.readInt();
        this.f1597G = parcel.readInt();
        this.f1598H = parcel.readInt();
        this.f1599I = (Parcelable) parcel.readParcelable(getClass().getClassLoader(), Parcelable.class);
    }
}
