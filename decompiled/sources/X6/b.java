package X6;

import android.os.Parcel;
import android.os.Parcelable;
import com.nothing.wallpaper.picker.creative.model.PromptCategory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b implements Parcelable {

    public static final class a extends b {
        public static final Parcelable.Creator<a> CREATOR = new C0321a();

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final Exception f8986q;

        /* JADX INFO: renamed from: X6.b$a$a, reason: collision with other inner class name */
        public static final class C0321a implements Parcelable.Creator {
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
            this.f8986q = e10;
        }

        public final Exception a() {
            return this.f8986q;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && n.d(this.f8986q, ((a) obj).f8986q);
        }

        public int hashCode() {
            return this.f8986q.hashCode();
        }

        public String toString() {
            return "Fail(e=" + this.f8986q + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i10) {
            n.h(dest, "dest");
            dest.writeSerializable(this.f8986q);
        }
    }

    /* JADX INFO: renamed from: X6.b$b, reason: collision with other inner class name */
    public static final class C0322b extends b {
        public static final Parcelable.Creator<C0322b> CREATOR = new a();

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final List f8987q;

        /* JADX INFO: renamed from: X6.b$b$a */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0322b createFromParcel(Parcel parcel) {
                n.h(parcel, "parcel");
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(PromptCategory.CREATOR.createFromParcel(parcel));
                }
                return new C0322b(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C0322b[] newArray(int i10) {
                return new C0322b[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0322b(List promptCategoryList) {
            super(null);
            n.h(promptCategoryList, "promptCategoryList");
            this.f8987q = promptCategoryList;
        }

        public final List a() {
            return this.f8987q;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0322b) && n.d(this.f8987q, ((C0322b) obj).f8987q);
        }

        public int hashCode() {
            return this.f8987q.hashCode();
        }

        public String toString() {
            return "Success(promptCategoryList=" + this.f8987q + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i10) {
            n.h(dest, "dest");
            List list = this.f8987q;
            dest.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((PromptCategory) it.next()).writeToParcel(dest, i10);
            }
        }
    }

    public /* synthetic */ b(AbstractC1457h abstractC1457h) {
        this();
    }

    private b() {
    }
}
