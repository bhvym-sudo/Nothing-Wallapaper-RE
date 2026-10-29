package F5;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface q extends IInterface {

    public static abstract class a extends Binder implements q {

        /* JADX INFO: renamed from: F5.q$a$a, reason: collision with other inner class name */
        private static class C0068a implements q {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            private IBinder f1707q;

            C0068a(IBinder iBinder) {
                this.f1707q = iBinder;
            }

            @Override // F5.q
            public void C(int i10) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.nothing.cardservice.ICardWidgetService");
                    parcelObtain.writeInt(i10);
                    this.f1707q.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // F5.q
            public List E(String str, int i10) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.nothing.cardservice.ICardWidgetService");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    this.f1707q.transact(17, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(m.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // F5.q
            public Uri F(String str, String str2, String str3) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.nothing.cardservice.ICardWidgetService");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    this.f1707q.transact(27, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Uri) b.d(parcelObtain2, Uri.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // F5.q
            public m G(int i10) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.nothing.cardservice.ICardWidgetService");
                    parcelObtain.writeInt(i10);
                    this.f1707q.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (m) b.d(parcelObtain2, m.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // F5.q
            public boolean J(String str, int i10, p pVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.nothing.cardservice.ICardWidgetService");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeStrongInterface(pVar);
                    this.f1707q.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // F5.q
            public List K(int i10, String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.nothing.cardservice.ICardWidgetService");
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeString(str);
                    this.f1707q.transact(18, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(o.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // F5.q
            public boolean M(int i10, m mVar, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.nothing.cardservice.ICardWidgetService");
                    parcelObtain.writeInt(i10);
                    b.f(parcelObtain, mVar, 0);
                    b.f(parcelObtain, bundle, 0);
                    this.f1707q.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // F5.q
            public List S(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.nothing.cardservice.ICardWidgetService");
                    parcelObtain.writeString(str);
                    this.f1707q.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(m.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // F5.q
            public void U(List list) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.nothing.cardservice.ICardWidgetService");
                    b.e(parcelObtain, list, 0);
                    this.f1707q.transact(23, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // F5.q
            public o V(int i10) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.nothing.cardservice.ICardWidgetService");
                    parcelObtain.writeInt(i10);
                    this.f1707q.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (o) b.d(parcelObtain2, o.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // F5.q
            public void W(int i10, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.nothing.cardservice.ICardWidgetService");
                    parcelObtain.writeInt(i10);
                    b.f(parcelObtain, bundle, 0);
                    this.f1707q.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f1707q;
            }

            @Override // F5.q
            public Uri i(String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.nothing.cardservice.ICardWidgetService");
                    parcelObtain.writeString(str);
                    this.f1707q.transact(30, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Uri) b.d(parcelObtain2, Uri.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // F5.q
            public Bundle l(int i10) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.nothing.cardservice.ICardWidgetService");
                    parcelObtain.writeInt(i10);
                    this.f1707q.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) b.d(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // F5.q
            public boolean n(String str, int i10, p pVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.nothing.cardservice.ICardWidgetService");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeStrongInterface(pVar);
                    this.f1707q.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // F5.q
            public void u(int i10) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.nothing.cardservice.ICardWidgetService");
                    parcelObtain.writeInt(i10);
                    this.f1707q.transact(32, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // F5.q
            public int w(String str, int i10) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.nothing.cardservice.ICardWidgetService");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i10);
                    this.f1707q.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static q a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.nothing.cardservice.ICardWidgetService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof q)) ? new C0068a(iBinder) : (q) iInterfaceQueryLocalInterface;
        }
    }

    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static Object d(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void e(Parcel parcel, List list, int i10) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                f(parcel, (Parcelable) list.get(i11), i10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void f(Parcel parcel, Parcelable parcelable, int i10) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i10);
            }
        }
    }

    void C(int i10);

    List E(String str, int i10);

    Uri F(String str, String str2, String str3);

    m G(int i10);

    boolean J(String str, int i10, p pVar);

    List K(int i10, String str);

    boolean M(int i10, m mVar, Bundle bundle);

    List S(String str);

    void U(List list);

    o V(int i10);

    void W(int i10, Bundle bundle);

    Uri i(String str);

    Bundle l(int i10);

    boolean n(String str, int i10, p pVar);

    void u(int i10);

    int w(String str, int i10);
}
