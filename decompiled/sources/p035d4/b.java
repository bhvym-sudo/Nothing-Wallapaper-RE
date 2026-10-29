package p035d4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    public static class a extends RuntimeException {
        public a(String str, Parcel parcel) {
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
        }
    }

    public static Bundle a(Parcel parcel, int i10) {
        int iR = r(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iR == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iR);
        return bundle;
    }

    public static float[] b(Parcel parcel, int i10) {
        int iR = r(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iR == 0) {
            return null;
        }
        float[] fArrCreateFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(iDataPosition + iR);
        return fArrCreateFloatArray;
    }

    public static ArrayList c(Parcel parcel, int i10) {
        int iR = r(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iR == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i11 = parcel.readInt();
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(Float.valueOf(parcel.readFloat()));
        }
        parcel.setDataPosition(iDataPosition + iR);
        return arrayList;
    }

    public static int[] d(Parcel parcel, int i10) {
        int iR = r(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iR == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iR);
        return iArrCreateIntArray;
    }

    public static Parcelable e(Parcel parcel, int i10, Parcelable.Creator creator) {
        int iR = r(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iR == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iR);
        return parcelable;
    }

    public static String f(Parcel parcel, int i10) {
        int iR = r(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iR == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iR);
        return string;
    }

    public static ArrayList g(Parcel parcel, int i10) {
        int iR = r(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iR == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iR);
        return arrayListCreateStringArrayList;
    }

    public static Object[] h(Parcel parcel, int i10, Parcelable.Creator creator) {
        int iR = r(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iR == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iR);
        return objArrCreateTypedArray;
    }

    public static ArrayList i(Parcel parcel, int i10, Parcelable.Creator creator) {
        int iR = r(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iR == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iR);
        return arrayListCreateTypedArrayList;
    }

    public static void j(Parcel parcel, int i10) {
        if (parcel.dataPosition() == i10) {
            return;
        }
        throw new a("Overread allowed size end=" + i10, parcel);
    }

    public static int k(int i10) {
        return (char) i10;
    }

    public static boolean l(Parcel parcel, int i10) {
        v(parcel, i10, 4);
        return parcel.readInt() != 0;
    }

    public static int m(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder n(Parcel parcel, int i10) {
        int iR = r(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iR == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iR);
        return strongBinder;
    }

    public static int o(Parcel parcel, int i10) {
        v(parcel, i10, 4);
        return parcel.readInt();
    }

    public static long p(Parcel parcel, int i10) {
        v(parcel, i10, 8);
        return parcel.readLong();
    }

    public static Long q(Parcel parcel, int i10) {
        int iR = r(parcel, i10);
        if (iR == 0) {
            return null;
        }
        u(parcel, i10, iR, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int r(Parcel parcel, int i10) {
        return (i10 & (-65536)) != -65536 ? (char) (i10 >> 16) : parcel.readInt();
    }

    public static void s(Parcel parcel, int i10) {
        parcel.setDataPosition(parcel.dataPosition() + r(parcel, i10));
    }

    public static int t(Parcel parcel) {
        int iM = m(parcel);
        int iR = r(parcel, iM);
        int iDataPosition = parcel.dataPosition();
        if (k(iM) != 20293) {
            throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(iM))), parcel);
        }
        int i10 = iR + iDataPosition;
        if (i10 >= iDataPosition && i10 <= parcel.dataSize()) {
            return i10;
        }
        throw new a("Size read is invalid start=" + iDataPosition + " end=" + i10, parcel);
    }

    private static void u(Parcel parcel, int i10, int i11, int i12) {
        if (i11 == i12) {
            return;
        }
        throw new a("Expected size " + i12 + " got " + i11 + " (0x" + Integer.toHexString(i11) + ")", parcel);
    }

    private static void v(Parcel parcel, int i10, int i11) {
        int iR = r(parcel, i10);
        if (iR == i11) {
            return;
        }
        throw new a("Expected size " + i11 + " got " + iR + " (0x" + Integer.toHexString(iR) + ")", parcel);
    }
}
