package p064g3;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import com.android.wallpaper.asset.m;
import java.util.ArrayList;
import java.util.List;
import p167q6.c;

/* JADX INFO: loaded from: classes.dex */
public class p extends x {
    public static final Parcelable.Creator<p> CREATOR = new a();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final int f21195A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final int f21196B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f21197C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final int f21198D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final int f21199E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final int f21200F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private m f21201G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private Resources f21202H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final String f21203I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private List f21204J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private String f21205K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final String f21206L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private boolean f21207M;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f21208w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final String f21209x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final String f21210y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final int f21211z;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p createFromParcel(Parcel parcel) {
            return new p(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public p[] newArray(int i10) {
            return new p[i10];
        }
    }

    private Resources B(Context context) {
        Resources resources = this.f21202H;
        if (resources != null) {
            return resources;
        }
        try {
            this.f21202H = context.getPackageManager().getResourcesForApplication(this.f21203I);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("PartnerStaticWPInfo", "Could not get app resources");
        }
        return this.f21202H;
    }

    public static p y(String str, String str2, AttributeSet attributeSet) {
        String attributeValue = attributeSet.getAttributeValue(null, "id");
        if (TextUtils.isEmpty(attributeValue)) {
            return null;
        }
        return new p(str, attributeValue, str2, attributeSet.getAttributeResourceValue(null, "src", 0), attributeSet.getAttributeResourceValue(null, "title", 0), attributeSet.getAttributeResourceValue(null, "subtitle1", 0), attributeSet.getAttributeResourceValue(null, "subtitle2", 0), 0, attributeSet.getAttributeResourceValue(null, "actionUrl", 0), c.a(attributeSet.getAttributeValue(null, "coverPriority"), 0), c.a(attributeSet.getAttributeValue(null, "gridPriority"), 0), attributeSet.getAttributeValue(null, "targetColor"), attributeSet.getAttributeBooleanValue(null, "supportDepth", false));
    }

    public int A() {
        return this.f21200F;
    }

    public String C() {
        return this.f21206L;
    }

    public void D(boolean z9) {
        this.f21207M = z9;
    }

    @Override // p064g3.x
    public String c(Context context) {
        if (this.f21205K == null && this.f21198D != 0) {
            this.f21205K = B(context).getString(this.f21198D);
        }
        return this.f21205K;
    }

    @Override // p064g3.x
    public com.android.wallpaper.asset.a d(Context context) {
        if (this.f21201G == null) {
            com.android.wallpaper.asset.p pVar = new com.android.wallpaper.asset.p(B(context), this.f21208w, this.f21209x);
            this.f21201G = pVar;
            pVar.Q(this.f21207M);
        }
        return this.f21201G;
    }

    @Override // p064g3.x
    public List e(Context context) {
        if (this.f21204J == null) {
            Resources resourcesB = B(context);
            ArrayList arrayList = new ArrayList();
            this.f21204J = arrayList;
            int i10 = this.f21211z;
            if (i10 != 0) {
                arrayList.add(resourcesB.getString(i10));
            }
            int i11 = this.f21195A;
            if (i11 != 0) {
                this.f21204J.add(resourcesB.getString(i11));
            }
            int i12 = this.f21196B;
            if (i12 != 0) {
                this.f21204J.add(resourcesB.getString(i12));
            }
        }
        return this.f21204J;
    }

    @Override // p064g3.x
    public String g(Context context) {
        return this.f21210y;
    }

    @Override // p064g3.x
    public com.android.wallpaper.asset.a o(Context context) {
        return d(context);
    }

    @Override // p064g3.x
    public String r() {
        return this.f21209x;
    }

    @Override // p064g3.x, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.f21203I);
        parcel.writeString(this.f21209x);
        parcel.writeString(this.f21210y);
        parcel.writeInt(this.f21208w);
        parcel.writeInt(this.f21211z);
        parcel.writeInt(this.f21195A);
        parcel.writeInt(this.f21196B);
        parcel.writeInt(this.f21197C);
        parcel.writeInt(this.f21198D);
        parcel.writeInt(this.f21199E);
        parcel.writeInt(this.f21200F);
        parcel.writeString(this.f21206L);
        parcel.writeBoolean(this.f21239t);
        parcel.writeBoolean(this.f21207M);
    }

    @Override // p064g3.x
    public void x(Activity activity, j jVar, int i10, boolean z9) {
        activity.startActivityForResult(jVar.b(activity, this, z9), i10);
    }

    public int z() {
        return this.f21199E;
    }

    public p(String str, String str2, String str3, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, String str4, boolean z9) {
        this.f21207M = false;
        this.f21203I = str;
        this.f21209x = str2;
        this.f21210y = str3;
        this.f21208w = i10;
        this.f21211z = i11;
        this.f21195A = i12;
        this.f21196B = i13;
        this.f21197C = i14;
        this.f21198D = i15;
        this.f21199E = i16;
        this.f21200F = i17;
        this.f21206L = str4;
        this.f21239t = z9;
    }

    private p(Parcel parcel) {
        super(parcel);
        this.f21207M = false;
        this.f21203I = parcel.readString();
        this.f21209x = parcel.readString();
        this.f21210y = parcel.readString();
        this.f21208w = parcel.readInt();
        this.f21211z = parcel.readInt();
        this.f21195A = parcel.readInt();
        this.f21196B = parcel.readInt();
        this.f21197C = parcel.readInt();
        this.f21198D = parcel.readInt();
        this.f21199E = parcel.readInt();
        this.f21200F = parcel.readInt();
        this.f21206L = parcel.readString();
        this.f21239t = parcel.readBoolean();
        this.f21207M = parcel.readBoolean();
    }
}
