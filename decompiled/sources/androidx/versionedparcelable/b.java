package androidx.versionedparcelable;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.collection.C1021a;

/* JADX INFO: loaded from: classes.dex */
class b extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SparseIntArray f14337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Parcel f14338e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f14339f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f14340g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f14341h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f14342i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f14343j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f14344k;

    b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C1021a(), new C1021a(), new C1021a());
    }

    @Override // androidx.versionedparcelable.a
    public IBinder A() {
        return this.f14338e.readStrongBinder();
    }

    @Override // androidx.versionedparcelable.a
    public void D(int i10) {
        a();
        this.f14342i = i10;
        this.f14337d.put(i10, this.f14338e.dataPosition());
        N(0);
        N(i10);
    }

    @Override // androidx.versionedparcelable.a
    public void H(boolean z9) {
        this.f14338e.writeInt(z9 ? 1 : 0);
    }

    @Override // androidx.versionedparcelable.a
    public void J(byte[] bArr) {
        if (bArr == null) {
            this.f14338e.writeInt(-1);
        } else {
            this.f14338e.writeInt(bArr.length);
            this.f14338e.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected void L(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f14338e, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void N(int i10) {
        this.f14338e.writeInt(i10);
    }

    @Override // androidx.versionedparcelable.a
    public void P(long j9) {
        this.f14338e.writeLong(j9);
    }

    @Override // androidx.versionedparcelable.a
    public void R(Parcelable parcelable) {
        this.f14338e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void U(String str) {
        this.f14338e.writeString(str);
    }

    @Override // androidx.versionedparcelable.a
    public void W(IBinder iBinder) {
        this.f14338e.writeStrongBinder(iBinder);
    }

    @Override // androidx.versionedparcelable.a
    public void a() {
        int i10 = this.f14342i;
        if (i10 >= 0) {
            int i11 = this.f14337d.get(i10);
            int iDataPosition = this.f14338e.dataPosition();
            this.f14338e.setDataPosition(i11);
            this.f14338e.writeInt(iDataPosition - i11);
            this.f14338e.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected a b() {
        Parcel parcel = this.f14338e;
        int iDataPosition = parcel.dataPosition();
        int i10 = this.f14343j;
        if (i10 == this.f14339f) {
            i10 = this.f14340g;
        }
        return new b(parcel, iDataPosition, i10, this.f14341h + "  ", this.f14333a, this.f14334b, this.f14335c);
    }

    @Override // androidx.versionedparcelable.a
    public boolean j() {
        return this.f14338e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.a
    public byte[] l() {
        int i10 = this.f14338e.readInt();
        if (i10 < 0) {
            return null;
        }
        byte[] bArr = new byte[i10];
        this.f14338e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.a
    protected CharSequence n() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f14338e);
    }

    @Override // androidx.versionedparcelable.a
    public boolean p(int i10) {
        while (this.f14343j < this.f14340g) {
            int i11 = this.f14344k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f14338e.setDataPosition(this.f14343j);
            int i12 = this.f14338e.readInt();
            this.f14344k = this.f14338e.readInt();
            this.f14343j += i12;
        }
        return this.f14344k == i10;
    }

    @Override // androidx.versionedparcelable.a
    public int r() {
        return this.f14338e.readInt();
    }

    @Override // androidx.versionedparcelable.a
    public long t() {
        return this.f14338e.readLong();
    }

    @Override // androidx.versionedparcelable.a
    public Parcelable v() {
        return this.f14338e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.a
    public String y() {
        return this.f14338e.readString();
    }

    private b(Parcel parcel, int i10, int i11, String str, C1021a c1021a, C1021a c1021a2, C1021a c1021a3) {
        super(c1021a, c1021a2, c1021a3);
        this.f14337d = new SparseIntArray();
        this.f14342i = -1;
        this.f14344k = -1;
        this.f14338e = parcel;
        this.f14339f = i10;
        this.f14340g = i11;
        this.f14343j = i10;
        this.f14341h = str;
    }
}
