package p170r;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC1457h;

/* JADX INFO: renamed from: r.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1691l0 extends P0 implements Parcelable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f25471s = new b(null);
    public static final Parcelable.Creator<C1691l0> CREATOR = new a();

    /* JADX INFO: renamed from: r.l0$a */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1691l0 createFromParcel(Parcel parcel) {
            return new C1691l0(parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1691l0[] newArray(int i10) {
            return new C1691l0[i10];
        }
    }

    /* JADX INFO: renamed from: r.l0$b */
    public static final class b {
        public /* synthetic */ b(AbstractC1457h abstractC1457h) {
            this();
        }

        private b() {
        }
    }

    public C1691l0(float f10) {
        super(f10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(e());
    }
}
