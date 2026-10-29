package J6;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.nothing.wallpaper.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p064g3.x;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends x {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final int f3548A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final int f3549B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f3550C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private List f3551D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private String f3552E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private p077h6.c f3553F;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final String f3554w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final String f3555x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final int f3556y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final int f3557z;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final a f3547G = new a(null);
    public static final Parcelable.Creator<c> CREATOR = new b();

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final c a(Context context) {
            n.h(context, "context");
            return new c("bauhaus_color_wallpaper", "color_category", R.color.bauhaus_wallpaper_color, H6.a.b(context) ? R.string.nt_special_edition_dark : R.string.nt_special_edition_light, 0, 0, 0, 112, null);
        }

        public final c b(String categoryId, AttributeSet attrs) {
            n.h(categoryId, "categoryId");
            n.h(attrs, "attrs");
            String attributeValue = attrs.getAttributeValue(null, "id");
            if (attributeValue == null || attributeValue.length() == 0 || categoryId.length() == 0) {
                return null;
            }
            return new c(attributeValue, categoryId, attrs.getAttributeResourceValue(null, TypedValues.Custom.S_COLOR, 0), attrs.getAttributeResourceValue(null, "title", 0), attrs.getAttributeResourceValue(null, "subtitle1", 0), attrs.getAttributeResourceValue(null, "subtitle2", 0), attrs.getAttributeResourceValue(null, "actionUrl", 0));
        }

        private a() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c createFromParcel(Parcel parcel) {
            n.h(parcel, "parcel");
            return new c(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c[] newArray(int i10) {
            return new c[i10];
        }
    }

    public /* synthetic */ c(String str, String str2, int i10, int i11, int i12, int i13, int i14, int i15, AbstractC1457h abstractC1457h) {
        this(str, str2, i10, i11, (i15 & 16) != 0 ? 0 : i12, (i15 & 32) != 0 ? 0 : i13, (i15 & 64) != 0 ? 0 : i14);
    }

    private final Resources y(Context context) {
        Resources resources = context.getResources();
        n.g(resources, "getResources(...)");
        return resources;
    }

    @Override // p064g3.x
    public String c(Context context) {
        n.h(context, "context");
        if (this.f3550C == 0) {
            return null;
        }
        String str = this.f3552E;
        if (str != null) {
            return str;
        }
        String string = y(context).getString(this.f3550C);
        this.f3552E = string;
        n.g(string, "also(...)");
        return string;
    }

    @Override // p064g3.x
    public com.android.wallpaper.asset.a d(Context context) {
        n.h(context, "context");
        p077h6.c cVar = this.f3553F;
        if (cVar != null) {
            return cVar;
        }
        p077h6.c cVar2 = new p077h6.c(y(context), this.f3556y, this.f3554w);
        this.f3553F = cVar2;
        return cVar2;
    }

    @Override // p064g3.x
    public List e(Context context) {
        n.h(context, "context");
        List arrayList = this.f3551D;
        if (arrayList == null) {
            arrayList = new ArrayList();
            Resources resourcesY = y(context);
            int i10 = this.f3557z;
            if (i10 != 0) {
                String string = resourcesY.getString(i10);
                n.g(string, "getString(...)");
                arrayList.add(string);
            }
            int i11 = this.f3548A;
            if (i11 != 0) {
                String string2 = resourcesY.getString(i11);
                n.g(string2, "getString(...)");
                arrayList.add(string2);
            }
            int i12 = this.f3549B;
            if (i12 != 0) {
                String string3 = resourcesY.getString(i12);
                n.g(string3, "getString(...)");
                arrayList.add(string3);
            }
            this.f3551D = arrayList;
        }
        return arrayList;
    }

    @Override // p064g3.x
    public String g(Context context) {
        return this.f3555x;
    }

    @Override // p064g3.x
    public com.android.wallpaper.asset.a o(Context context) {
        n.h(context, "context");
        return d(context);
    }

    @Override // p064g3.x
    public String r() {
        return this.f3554w;
    }

    @Override // p064g3.x, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        n.h(dest, "dest");
        dest.writeString(this.f3554w);
        dest.writeString(this.f3555x);
        dest.writeInt(this.f3556y);
        dest.writeInt(this.f3557z);
        dest.writeInt(this.f3548A);
        dest.writeInt(this.f3549B);
        dest.writeInt(this.f3550C);
    }

    @Override // p064g3.x
    public void x(Activity activity, p064g3.j jVar, int i10, boolean z9) {
        if (activity != null) {
            activity.startActivityForResult(jVar != null ? jVar.b(activity, this, z9) : null, i10);
        }
    }

    public c(String wallpaperId, String collectionId, int i10, int i11, int i12, int i13, int i14) {
        n.h(wallpaperId, "wallpaperId");
        n.h(collectionId, "collectionId");
        this.f3554w = wallpaperId;
        this.f3555x = collectionId;
        this.f3556y = i10;
        this.f3557z = i11;
        this.f3548A = i12;
        this.f3549B = i13;
        this.f3550C = i14;
        this.f21239t = false;
    }
}
