package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.a;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f12164a = aVar.s(iconCompat.f12164a, 1);
        iconCompat.f12166c = aVar.m(iconCompat.f12166c, 2);
        iconCompat.f12167d = aVar.w(iconCompat.f12167d, 3);
        iconCompat.f12168e = aVar.s(iconCompat.f12168e, 4);
        iconCompat.f12169f = aVar.s(iconCompat.f12169f, 5);
        iconCompat.f12170g = (ColorStateList) aVar.w(iconCompat.f12170g, 6);
        iconCompat.f12172i = aVar.z(iconCompat.f12172i, 7);
        iconCompat.f12173j = aVar.z(iconCompat.f12173j, 8);
        iconCompat.o();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.E(true, true);
        iconCompat.p(aVar.g());
        int i10 = iconCompat.f12164a;
        if (-1 != i10) {
            aVar.O(i10, 1);
        }
        byte[] bArr = iconCompat.f12166c;
        if (bArr != null) {
            aVar.K(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f12167d;
        if (parcelable != null) {
            aVar.S(parcelable, 3);
        }
        int i11 = iconCompat.f12168e;
        if (i11 != 0) {
            aVar.O(i11, 4);
        }
        int i12 = iconCompat.f12169f;
        if (i12 != 0) {
            aVar.O(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f12170g;
        if (colorStateList != null) {
            aVar.S(colorStateList, 6);
        }
        String str = iconCompat.f12172i;
        if (str != null) {
            aVar.V(str, 7);
        }
        String str2 = iconCompat.f12173j;
        if (str2 != null) {
            aVar.V(str2, 8);
        }
    }
}
