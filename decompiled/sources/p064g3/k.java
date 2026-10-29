package p064g3;

import H3.AbstractC0851a;
import android.app.Activity;
import android.app.WallpaperInfo;
import android.app.wallpaper.WallpaperDescription;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.constraintlayout.core.widgets.Optimizer;
import com.android.launcher3.w;
import com.nothing.wallpaper.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class k extends x {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    protected WallpaperDescription f21171A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected WallpaperInfo f21172w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected com.android.wallpaper.asset.k f21173x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected boolean f21174y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final String f21175z;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public k[] newArray(int i10) {
            return new k[i10];
        }
    }

    public k(WallpaperInfo wallpaperInfo) {
        this.f21172w = wallpaperInfo;
        this.f21174y = true;
        this.f21175z = null;
    }

    public static k y(Context context, String str, AttributeSet attributeSet) {
        String attributeValue = attributeSet.getAttributeValue(null, "id");
        if (!TextUtils.isEmpty(attributeValue)) {
            return z(context, str, attributeValue, attributeSet.getAttributeValue(null, "package"), attributeSet.getAttributeValue(null, "service"));
        }
        Log.w("LiveWallpaperInfo", "Live wallpaper declaration without id in category " + str);
        return null;
    }

    public static k z(Context context, String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str4)) {
            Log.w("LiveWallpaperInfo", "Live wallpaper declaration without service: " + str2);
            return null;
        }
        Intent intent = new Intent("android.service.wallpaper.WallpaperService");
        if (TextUtils.isEmpty(str3)) {
            String[] strArrSplit = str4.split("/");
            if (strArrSplit == null || strArrSplit.length != 2) {
                Log.w("LiveWallpaperInfo", "Live wallpaper declaration with invalid service: " + str2);
                return null;
            }
            String str5 = strArrSplit[0];
            str4 = strArrSplit[1];
            str3 = str5;
        }
        intent.setClassName(str3, str4);
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, Optimizer.OPTIMIZATION_GRAPH_WRAP);
        if (listQueryIntentServices.isEmpty()) {
            Log.w("LiveWallpaperInfo", "Couldn't find live wallpaper for " + str4);
            return null;
        }
        try {
            return new k(new WallpaperInfo(context, listQueryIntentServices.get(0)), false, str);
        } catch (IOException | XmlPullParserException e10) {
            Log.w("LiveWallpaperInfo", "Skipping wallpaper " + listQueryIntentServices.get(0).serviceInfo, e10);
            return null;
        }
    }

    public WallpaperDescription A() {
        return this.f21171A;
    }

    public k B(Context context, int i10) {
        return this;
    }

    public void C(WallpaperDescription wallpaperDescription) {
        this.f21171A = wallpaperDescription;
    }

    @Override // p064g3.x
    public String c(Context context) {
        try {
            Uri uriLoadContextUri = this.f21172w.loadContextUri(context.getPackageManager());
            if (uriLoadContextUri != null) {
                return uriLoadContextUri.toString();
            }
        } catch (Resources.NotFoundException unused) {
        }
        return null;
    }

    @Override // p064g3.x
    public com.android.wallpaper.asset.a d(Context context) {
        return null;
    }

    @Override // p064g3.x
    public List e(Context context) {
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = context.getPackageManager();
        CharSequence charSequenceLoadLabel = this.f21172w.loadLabel(packageManager);
        arrayList.add(charSequenceLoadLabel == null ? null : charSequenceLoadLabel.toString());
        try {
            CharSequence charSequenceLoadAuthor = this.f21172w.loadAuthor(packageManager);
            if (charSequenceLoadAuthor != null) {
                arrayList.add(charSequenceLoadAuthor.toString());
            }
        } catch (Resources.NotFoundException unused) {
        }
        try {
            CharSequence charSequenceLoadDescription = this.f21172w.loadDescription(packageManager);
            if (charSequenceLoadDescription != null) {
                arrayList.add(charSequenceLoadDescription.toString());
            }
        } catch (Resources.NotFoundException unused2) {
        }
        return arrayList;
    }

    @Override // p064g3.x
    public String g(Context context) {
        return TextUtils.isEmpty(this.f21175z) ? context.getString(R.string.live_wallpaper_collection_id) : this.f21175z;
    }

    @Override // p064g3.x
    public com.android.wallpaper.asset.a o(Context context) {
        if (this.f21173x == null) {
            this.f21173x = new com.android.wallpaper.asset.k(context, this.f21172w);
        }
        return this.f21173x;
    }

    @Override // p064g3.x
    public String p(Context context) {
        CharSequence charSequenceLoadLabel;
        if (!this.f21174y || (charSequenceLoadLabel = this.f21172w.loadLabel(context.getPackageManager())) == null) {
            return null;
        }
        return charSequenceLoadLabel.toString();
    }

    @Override // p064g3.x
    public WallpaperInfo q() {
        return this.f21172w;
    }

    @Override // p064g3.x
    public String r() {
        return this.f21172w.getServiceName();
    }

    @Override // p064g3.x, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeParcelable(this.f21172w, 0);
        parcel.writeInt(this.f21174y ? 1 : 0);
        parcel.writeString(this.f21175z);
        parcel.writeParcelable(this.f21171A, 0);
    }

    @Override // p064g3.x
    public void x(Activity activity, j jVar, int i10, boolean z9) {
        if (jVar.a(activity)) {
            activity.startActivityForResult(jVar.b(activity, this, z9), i10);
            return;
        }
        Intent intent = new Intent("android.service.wallpaper.CHANGE_LIVE_WALLPAPER");
        intent.putExtra("android.service.wallpaper.extra.LIVE_WALLPAPER_COMPONENT", this.f21172w.getComponent());
        AbstractC0851a.m(activity, intent, i10);
    }

    public k(WallpaperInfo wallpaperInfo, boolean z9, String str) {
        this(wallpaperInfo, z9, str, new WallpaperDescription.Builder().setComponent(wallpaperInfo != null ? wallpaperInfo.getComponent() : null).build());
    }

    public k(WallpaperInfo wallpaperInfo, boolean z9, String str, WallpaperDescription wallpaperDescription) {
        this.f21172w = wallpaperInfo;
        this.f21174y = z9;
        this.f21175z = str;
        this.f21171A = wallpaperDescription;
    }

    protected k(Parcel parcel) {
        super(parcel);
        this.f21172w = (WallpaperInfo) parcel.readParcelable(WallpaperInfo.class.getClassLoader());
        this.f21174y = parcel.readInt() == 1;
        this.f21175z = parcel.readString();
        if (w.f15765i) {
            this.f21171A = (WallpaperDescription) parcel.readParcelable(WallpaperDescription.class.getClassLoader(), WallpaperDescription.class);
        }
    }
}
