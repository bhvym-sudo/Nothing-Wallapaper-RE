package p158p7;

import G6.e;
import android.app.WallpaperInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.nothing.wallpaper.picker.edit.preview.widget.EffectButtonGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p064g3.x;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Parcelable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final List f23775q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Intent f23776r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f23774s = new a(null);
    public static final Parcelable.Creator<b> CREATOR = new C0630b();

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private final Intent b(WallpaperInfo wallpaperInfo, Context context) {
            String settingsActivity = wallpaperInfo.getSettingsActivity();
            if (settingsActivity == null) {
                return null;
            }
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(wallpaperInfo.getPackageName(), settingsActivity));
            intent.putExtra("android.service.wallpaper.PREVIEW_MODE", true);
            if (intent.resolveActivityInfo(context.getPackageManager(), 0) != null) {
                return intent;
            }
            return null;
        }

        public final b a(x wallpaper, Context context) {
            Intent intentB;
            n.h(wallpaper, "wallpaper");
            n.h(context, "context");
            ArrayList arrayList = new ArrayList();
            if (!e.s(wallpaper)) {
                WallpaperInfo wallpaperInfoQ = wallpaper.q();
                n.g(wallpaperInfoQ, "getWallpaperComponent(...)");
                intentB = b(wallpaperInfoQ, context);
                if (intentB != null) {
                    arrayList.add(EffectButtonGroup.a.CUSTOMIZE);
                }
                return new b(arrayList, intentB);
            }
            if (e.g(wallpaper, context)) {
                arrayList.add(EffectButtonGroup.a.BLUR);
            }
            if (F6.a.f1731a.a()) {
                arrayList.add(EffectButtonGroup.a.GLASS);
            }
            intentB = null;
            return new b(arrayList, intentB);
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: p7.b$b, reason: collision with other inner class name */
    public static final class C0630b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b createFromParcel(Parcel parcel) {
            n.h(parcel, "parcel");
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList.add(EffectButtonGroup.a.valueOf(parcel.readString()));
            }
            return new b(arrayList, (Intent) parcel.readParcelable(b.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(List actions, Intent intent) {
        n.h(actions, "actions");
        this.f23775q = actions;
        this.f23776r = intent;
    }

    public final List a() {
        return this.f23775q;
    }

    public final Intent b() {
        return this.f23776r;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return n.d(this.f23775q, bVar.f23775q) && n.d(this.f23776r, bVar.f23776r);
    }

    public int hashCode() {
        int iHashCode = this.f23775q.hashCode() * 31;
        Intent intent = this.f23776r;
        return iHashCode + (intent == null ? 0 : intent.hashCode());
    }

    public String toString() {
        return "EffectActionState(actions=" + this.f23775q + ", settingsIntent=" + this.f23776r + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        n.h(dest, "dest");
        List list = this.f23775q;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dest.writeString(((EffectButtonGroup.a) it.next()).name());
        }
        dest.writeParcelable(this.f23776r, i10);
    }
}
