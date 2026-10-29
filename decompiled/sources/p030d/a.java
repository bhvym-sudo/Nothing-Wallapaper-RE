package p030d;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f19267q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Intent f19268r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f19266s = new b(null);
    public static final Parcelable.Creator<a> CREATOR = new C0516a();

    /* JADX INFO: renamed from: d.a$a, reason: collision with other inner class name */
    public static final class C0516a implements Parcelable.Creator {
        C0516a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            n.h(parcel, "parcel");
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public static final class b {
        public /* synthetic */ b(AbstractC1457h abstractC1457h) {
            this();
        }

        public final String a(int i10) {
            if (i10 != -1) {
                return i10 != 0 ? String.valueOf(i10) : "RESULT_CANCELED";
            }
            return "RESULT_OK";
        }

        private b() {
        }
    }

    public a(int i10, Intent intent) {
        this.f19267q = i10;
        this.f19268r = intent;
    }

    public final Intent a() {
        return this.f19268r;
    }

    public final int b() {
        return this.f19267q;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + f19266s.a(this.f19267q) + ", data=" + this.f19268r + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        n.h(dest, "dest");
        dest.writeInt(this.f19267q);
        dest.writeInt(this.f19268r == null ? 0 : 1);
        Intent intent = this.f19268r;
        if (intent != null) {
            intent.writeToParcel(dest, i10);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
        n.h(parcel, "parcel");
    }
}
