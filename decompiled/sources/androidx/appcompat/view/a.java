package androidx.appcompat.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import p050f.j;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f10298a;

    private a(Context context) {
        this.f10298a = context;
    }

    public static a b(Context context) {
        return new a(context);
    }

    public boolean a() {
        return this.f10298a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.f10298a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.f10298a.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i10 > 600) {
            return 5;
        }
        if (i10 > 960 && i11 > 720) {
            return 5;
        }
        if (i10 > 720 && i11 > 960) {
            return 5;
        }
        if (i10 >= 500) {
            return 4;
        }
        if (i10 > 640 && i11 > 480) {
            return 4;
        }
        if (i10 <= 480 || i11 <= 640) {
            return i10 >= 360 ? 3 : 2;
        }
        return 4;
    }

    public int e() {
        return this.f10298a.getResources().getDimensionPixelSize(p050f.d.f20371b);
    }

    public int f() {
        TypedArray typedArrayObtainStyledAttributes = this.f10298a.obtainStyledAttributes(null, j.f20595a, p050f.a.f20337c, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(j.f20640j, 0);
        Resources resources = this.f10298a.getResources();
        if (!g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(p050f.d.f20370a));
        }
        typedArrayObtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean g() {
        return this.f10298a.getResources().getBoolean(p050f.b.f20361a);
    }

    public boolean h() {
        return true;
    }
}
