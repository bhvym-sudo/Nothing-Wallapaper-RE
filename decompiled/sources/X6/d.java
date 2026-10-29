package X6;

import android.os.Parcel;
import android.os.Parcelable;
import com.nothing.wallpaper.picker.creative.model.Wallpaper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d implements Parcelable {

    public static final class a extends d {
        public static final Parcelable.Creator<a> CREATOR = new C0323a();

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final Exception f8988q;

        /* JADX INFO: renamed from: X6.d$a$a, reason: collision with other inner class name */
        public static final class C0323a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                n.h(parcel, "parcel");
                return new a((Exception) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i10) {
                return new a[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception e10) {
            super(null);
            n.h(e10, "e");
            this.f8988q = e10;
        }

        public final Exception a() {
            return this.f8988q;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && n.d(this.f8988q, ((a) obj).f8988q);
        }

        public int hashCode() {
            return this.f8988q.hashCode();
        }

        public String toString() {
            return "Fail(e=" + this.f8988q + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i10) {
            n.h(dest, "dest");
            dest.writeSerializable(this.f8988q);
        }
    }

    public static final class b extends d {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final List f8989q;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                n.h(parcel, "parcel");
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(Wallpaper.CREATOR.createFromParcel(parcel));
                }
                return new b(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i10) {
                return new b[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List wallpaperList) {
            super(null);
            n.h(wallpaperList, "wallpaperList");
            this.f8989q = wallpaperList;
        }

        public final List a() {
            return this.f8989q;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && n.d(this.f8989q, ((b) obj).f8989q);
        }

        public int hashCode() {
            return this.f8989q.hashCode();
        }

        public String toString() {
            return "Success(wallpaperList=" + this.f8989q + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i10) {
            n.h(dest, "dest");
            List list = this.f8989q;
            dest.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Wallpaper) it.next()).writeToParcel(dest, i10);
            }
        }
    }

    public /* synthetic */ d(AbstractC1457h abstractC1457h) {
        this();
    }

    private d() {
    }
}
