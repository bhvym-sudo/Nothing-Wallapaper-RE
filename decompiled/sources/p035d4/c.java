package p035d4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static int a(Parcel parcel) {
        return q(parcel, 20293);
    }

    public static void b(Parcel parcel, int i10) {
        r(parcel, i10);
    }

    public static void c(Parcel parcel, int i10, boolean z9) {
        s(parcel, i10, 4);
        parcel.writeInt(z9 ? 1 : 0);
    }

    public static void d(Parcel parcel, int i10, Bundle bundle, boolean z9) {
        if (bundle == null) {
            if (z9) {
                s(parcel, i10, 0);
            }
        } else {
            int iQ = q(parcel, i10);
            parcel.writeBundle(bundle);
            r(parcel, iQ);
        }
    }

    public static void e(Parcel parcel, int i10, float[] fArr, boolean z9) {
        if (fArr == null) {
            if (z9) {
                s(parcel, i10, 0);
            }
        } else {
            int iQ = q(parcel, i10);
            parcel.writeFloatArray(fArr);
            r(parcel, iQ);
        }
    }

    public static void f(Parcel parcel, int i10, List list, boolean z9) {
        if (list == null) {
            if (z9) {
                s(parcel, i10, 0);
                return;
            }
            return;
        }
        int iQ = q(parcel, i10);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeFloat(((Float) list.get(i11)).floatValue());
        }
        r(parcel, iQ);
    }

    public static void g(Parcel parcel, int i10, IBinder iBinder, boolean z9) {
        if (iBinder == null) {
            if (z9) {
                s(parcel, i10, 0);
            }
        } else {
            int iQ = q(parcel, i10);
            parcel.writeStrongBinder(iBinder);
            r(parcel, iQ);
        }
    }

    public static void h(Parcel parcel, int i10, int i11) {
        s(parcel, i10, 4);
        parcel.writeInt(i11);
    }

    public static void i(Parcel parcel, int i10, int[] iArr, boolean z9) {
        if (iArr == null) {
            if (z9) {
                s(parcel, i10, 0);
            }
        } else {
            int iQ = q(parcel, i10);
            parcel.writeIntArray(iArr);
            r(parcel, iQ);
        }
    }

    public static void j(Parcel parcel, int i10, long j9) {
        s(parcel, i10, 8);
        parcel.writeLong(j9);
    }

    public static void k(Parcel parcel, int i10, Long l9, boolean z9) {
        if (l9 != null) {
            s(parcel, i10, 8);
            parcel.writeLong(l9.longValue());
        } else if (z9) {
            s(parcel, i10, 0);
        }
    }

    public static void l(Parcel parcel, int i10, Parcelable parcelable, int i11, boolean z9) {
        if (parcelable == null) {
            if (z9) {
                s(parcel, i10, 0);
            }
        } else {
            int iQ = q(parcel, i10);
            parcelable.writeToParcel(parcel, i11);
            r(parcel, iQ);
        }
    }

    public static void m(Parcel parcel, int i10, String str, boolean z9) {
        if (str == null) {
            if (z9) {
                s(parcel, i10, 0);
            }
        } else {
            int iQ = q(parcel, i10);
            parcel.writeString(str);
            r(parcel, iQ);
        }
    }

    public static void n(Parcel parcel, int i10, List list, boolean z9) {
        if (list == null) {
            if (z9) {
                s(parcel, i10, 0);
            }
        } else {
            int iQ = q(parcel, i10);
            parcel.writeStringList(list);
            r(parcel, iQ);
        }
    }

    public static void o(Parcel parcel, int i10, Parcelable[] parcelableArr, int i11, boolean z9) {
        if (parcelableArr == null) {
            if (z9) {
                s(parcel, i10, 0);
                return;
            }
            return;
        }
        int iQ = q(parcel, i10);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                t(parcel, parcelable, i11);
            }
        }
        r(parcel, iQ);
    }

    public static void p(Parcel parcel, int i10, List list, boolean z9) {
        if (list == null) {
            if (z9) {
                s(parcel, i10, 0);
                return;
            }
            return;
        }
        int iQ = q(parcel, i10);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            Parcelable parcelable = (Parcelable) list.get(i11);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                t(parcel, parcelable, 0);
            }
        }
        r(parcel, iQ);
    }

    private static int q(Parcel parcel, int i10) {
        parcel.writeInt(i10 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void r(Parcel parcel, int i10) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i10 - 4);
        parcel.writeInt(iDataPosition - i10);
        parcel.setDataPosition(iDataPosition);
    }

    private static void s(Parcel parcel, int i10, int i11) {
        parcel.writeInt(i10 | (i11 << 16));
    }

    private static void t(Parcel parcel, Parcelable parcelable, int i10) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i10);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }
}
