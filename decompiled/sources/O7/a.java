package O7;

import I8.O;
import J6.i;
import android.app.Application;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.AbstractC1142b;
import androidx.lifecycle.Q;
import com.nothing.cardwidget.pedometer.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p064g3.x;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends AbstractC1142b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0195a f5923f = new C0195a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Application f5924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Q f5925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final O f5926e;

    /* JADX INFO: renamed from: O7.a$a, reason: collision with other inner class name */
    public static final class C0195a {
        public /* synthetic */ C0195a(AbstractC1457h abstractC1457h) {
            this();
        }

        private C0195a() {
        }
    }

    public static abstract class b implements Parcelable {

        /* JADX INFO: renamed from: O7.a$b$a, reason: collision with other inner class name */
        public static final class C0196a extends b {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public static final C0196a f5927q = new C0196a();
            public static final Parcelable.Creator<C0196a> CREATOR = new C0197a();

            /* JADX INFO: renamed from: O7.a$b$a$a, reason: collision with other inner class name */
            public static final class C0197a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C0196a createFromParcel(Parcel parcel) {
                    n.h(parcel, "parcel");
                    parcel.readInt();
                    return C0196a.f5927q;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final C0196a[] newArray(int i10) {
                    return new C0196a[i10];
                }
            }

            private C0196a() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i10) {
                n.h(dest, "dest");
                dest.writeInt(1);
            }
        }

        /* JADX INFO: renamed from: O7.a$b$b, reason: collision with other inner class name */
        public static final class C0198b extends b {
            public static final Parcelable.Creator<C0198b> CREATOR = new C0199a();

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            private final String f5928q;

            /* JADX INFO: renamed from: O7.a$b$b$a, reason: collision with other inner class name */
            public static final class C0199a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C0198b createFromParcel(Parcel parcel) {
                    n.h(parcel, "parcel");
                    return new C0198b(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final C0198b[] newArray(int i10) {
                    return new C0198b[i10];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0198b(String collectionId) {
                super(null);
                n.h(collectionId, "collectionId");
                this.f5928q = collectionId;
            }

            public final String a() {
                return this.f5928q;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0198b) && n.d(this.f5928q, ((C0198b) obj).f5928q);
            }

            public int hashCode() {
                return this.f5928q.hashCode();
            }

            public String toString() {
                return "IndividualPage(collectionId=" + this.f5928q + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i10) {
                n.h(dest, "dest");
                dest.writeString(this.f5928q);
            }
        }

        public /* synthetic */ b(AbstractC1457h abstractC1457h) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Application context, Q savedStateHandle) {
        super(context);
        n.h(context, "context");
        n.h(savedStateHandle, "savedStateHandle");
        this.f5924c = context;
        this.f5925d = savedStateHandle;
        this.f5926e = savedStateHandle.e(Constants.KEY_PAGE_STATE, b.C0196a.f5927q);
    }

    public final void f() {
        this.f5925d.i(Constants.KEY_PAGE_STATE, b.C0196a.f5927q);
    }

    public final O g() {
        return this.f5926e;
    }

    public final List h() {
        return (List) this.f5925d.d("key_selected_wallpapers");
    }

    public final boolean i() {
        return this.f5926e.getValue() instanceof b.C0198b;
    }

    public final void j(List list) {
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            this.f5925d.i("key_selected_wallpapers", null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            x xVar = (x) obj;
            if ((xVar instanceof i) && ((i) xVar).z()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((x) it.next()).r());
        }
        this.f5925d.i("key_selected_wallpapers", arrayList2);
    }

    public final void k(String categoryCollectionId) {
        n.h(categoryCollectionId, "categoryCollectionId");
        this.f5925d.i(Constants.KEY_PAGE_STATE, new b.C0198b(categoryCollectionId));
    }
}
