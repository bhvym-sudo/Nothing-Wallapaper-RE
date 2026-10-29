package p064g3;

import android.app.Activity;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.wallpaper.asset.e;
import com.nothing.wallpaper.R;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class g extends x {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private com.android.wallpaper.asset.a f21164w;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g createFromParcel(Parcel parcel) {
            return new g(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g[] newArray(int i10) {
            return new g[i10];
        }
    }

    public g() {
    }

    @Override // p064g3.x
    public com.android.wallpaper.asset.a d(Context context) {
        if (this.f21164w == null) {
            this.f21164w = new e(context);
        }
        return this.f21164w;
    }

    @Override // p064g3.x
    public List e(Context context) {
        return Arrays.asList(context.getResources().getString(R.string.fallback_wallpaper_title));
    }

    @Override // p064g3.x
    public int f() {
        return 0;
    }

    @Override // p064g3.x
    public String g(Context context) {
        return context.getString(R.string.on_device_wallpaper_collection_id);
    }

    @Override // p064g3.x
    public com.android.wallpaper.asset.a o(Context context) {
        return d(context);
    }

    @Override // p064g3.x
    public String r() {
        return "built-in-wallpaper";
    }

    @Override // p064g3.x, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
    }

    @Override // p064g3.x
    public void x(Activity activity, j jVar, int i10, boolean z9) {
        activity.startActivityForResult(jVar.b(activity, this, z9), i10);
    }

    protected g(Parcel parcel) {
        super(parcel);
    }
}
