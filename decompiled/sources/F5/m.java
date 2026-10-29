package F5;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Size;
import com.google.gson.Gson;
import com.nothing.cardservice.bean.AiWidgetMetaInfo;
import com.nothing.cardservice.bean.CardMetaInfoExt3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import p079h8.A;
import p079h8.u;

/* JADX INFO: loaded from: classes.dex */
public class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f1672A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f1673B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f1674C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f1675D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f1676E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f1677F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f1678G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f1679H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private String f1680I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f1681J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f1682K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private ComponentName f1683L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private String f1684M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private String f1685N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private String f1686O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private HashMap f1687P;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f1688q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f1689r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f1690s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f1691t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f1692u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f1693v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f1694w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f1695x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f1696y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f1697z;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final m createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.n.h(parcel, "parcel");
            return new m(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), (ComponentName) parcel.readParcelable(m.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m[] newArray(int i10) {
            return new m[i10];
        }
    }

    public m(int i10, String pkgName, int i11, int i12, int i13, int i14, String authority, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, String str, int i26, int i27, ComponentName componentName, String str2, String str3, String str4) {
        kotlin.jvm.internal.n.h(pkgName, "pkgName");
        kotlin.jvm.internal.n.h(authority, "authority");
        this.f1688q = i10;
        this.f1689r = pkgName;
        this.f1690s = i11;
        this.f1691t = i12;
        this.f1692u = i13;
        this.f1693v = i14;
        this.f1694w = authority;
        this.f1695x = i15;
        this.f1696y = i16;
        this.f1697z = i17;
        this.f1672A = i18;
        this.f1673B = i19;
        this.f1674C = i20;
        this.f1675D = i21;
        this.f1676E = i22;
        this.f1677F = i23;
        this.f1678G = i24;
        this.f1679H = i25;
        this.f1680I = str;
        this.f1681J = i26;
        this.f1682K = i27;
        this.f1683L = componentName;
        this.f1684M = str2;
        this.f1685N = str3;
        this.f1686O = str4;
        this.f1687P = new HashMap();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0036  */
    private final String F(Context context) {
        Object objB;
        String string;
        try {
            h8.q.a aVar = p079h8.q.f21862r;
            String str = this.f1686O;
            if (str == null) {
                string = "";
            } else {
                CardMetaInfoExt3 cardMetaInfoExt3V = v(str);
                if (cardMetaInfoExt3V == null) {
                    string = null;
                } else if (cardMetaInfoExt3V.getPreviewDesc() == 0) {
                    string = "";
                } else {
                    Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(this.f1689r);
                    kotlin.jvm.internal.n.g(resourcesForApplication, "getResourcesForApplication(...)");
                    string = resourcesForApplication.getString(cardMetaInfoExt3V.getPreviewDesc());
                    kotlin.jvm.internal.n.e(string);
                }
                if (string == null) {
                    string = "";
                }
            }
            objB = p079h8.q.b(string);
        } catch (Throwable th) {
            h8.q.a aVar2 = p079h8.q.f21862r;
            objB = p079h8.q.b(p079h8.r.a(th));
        }
        Throwable thD = p079h8.q.d(objB);
        if (thD != null) {
            G5.c.f1948a.c("CardWidgetMetaInfo getPreviewImageDesc error: " + thD);
        }
        return (String) (p079h8.q.f(objB) ? "" : objB);
    }

    private final String a() {
        CardMetaInfoExt3 cardMetaInfoExt3V;
        AiWidgetMetaInfo aiWidgetMetaInfo;
        String widgetDescription;
        String str = this.f1686O;
        return (str == null || (cardMetaInfoExt3V = v(str)) == null || (aiWidgetMetaInfo = cardMetaInfoExt3V.getAiWidgetMetaInfo()) == null || (widgetDescription = aiWidgetMetaInfo.getWidgetDescription()) == null) ? "" : widgetDescription;
    }

    private final CardMetaInfoExt3 v(String str) {
        Object objB;
        CardMetaInfoExt3 cardMetaInfoExt3 = (CardMetaInfoExt3) this.f1687P.get(str);
        if (cardMetaInfoExt3 != null) {
            return cardMetaInfoExt3;
        }
        try {
            h8.q.a aVar = p079h8.q.f21862r;
            Object objFromJson = new Gson().fromJson(str, (Class<Object>) CardMetaInfoExt3.class);
            this.f1687P.put(str, (CardMetaInfoExt3) objFromJson);
            objB = p079h8.q.b((CardMetaInfoExt3) objFromJson);
        } catch (Throwable th) {
            h8.q.a aVar2 = p079h8.q.f21862r;
            objB = p079h8.q.b(p079h8.r.a(th));
        }
        if (p079h8.q.f(objB)) {
            objB = null;
        }
        return (CardMetaInfoExt3) objB;
    }

    public final int A() {
        return this.f1693v;
    }

    public final List B(Context context) throws PackageManager.NameNotFoundException {
        Object objB;
        kotlin.jvm.internal.n.h(context, "context");
        if (this.f1693v == 0) {
            return null;
        }
        Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(this.f1689r);
        kotlin.jvm.internal.n.g(resourcesForApplication, "getResourcesForApplication(...)");
        try {
            h8.q.a aVar = p079h8.q.f21862r;
            G5.c cVar = G5.c.f1948a;
            cVar.a("CardWidgetMetaInfo multiPreviewRes = " + this.f1693v);
            ArrayList arrayList = new ArrayList();
            TypedArray typedArrayObtainTypedArray = resourcesForApplication.obtainTypedArray(this.f1693v);
            kotlin.jvm.internal.n.g(typedArrayObtainTypedArray, "obtainTypedArray(...)");
            int length = typedArrayObtainTypedArray.length();
            cVar.a("getMultiPreviewRes TypedArray length = " + typedArrayObtainTypedArray.length());
            for (int i10 = 0; i10 < length; i10++) {
                Drawable drawableE = p181s0.h.e(resourcesForApplication, typedArrayObtainTypedArray.getResourceId(i10, 0), context.getTheme());
                if (drawableE != null) {
                    arrayList.add(drawableE);
                } else {
                    arrayList.add(new ColorDrawable(0));
                }
            }
            typedArrayObtainTypedArray.recycle();
            objB = p079h8.q.b(arrayList);
        } catch (Throwable th) {
            h8.q.a aVar2 = p079h8.q.f21862r;
            objB = p079h8.q.b(p079h8.r.a(th));
        }
        Throwable thD = p079h8.q.d(objB);
        if (thD != null) {
            G5.c.f1948a.c("CardWidgetMetaInfo getMultiPreviewRes error: " + thD);
        }
        return (List) (p079h8.q.f(objB) ? null : objB);
    }

    public final int C() {
        return this.f1692u;
    }

    public final String[] D(Context context) throws PackageManager.NameNotFoundException {
        Object objB;
        kotlin.jvm.internal.n.h(context, "context");
        if (this.f1692u == 0) {
            return null;
        }
        Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(this.f1689r);
        kotlin.jvm.internal.n.g(resourcesForApplication, "getResourcesForApplication(...)");
        try {
            h8.q.a aVar = p079h8.q.f21862r;
            objB = p079h8.q.b(resourcesForApplication.getStringArray(this.f1692u));
        } catch (Throwable th) {
            h8.q.a aVar2 = p079h8.q.f21862r;
            objB = p079h8.q.b(p079h8.r.a(th));
        }
        return (String[]) (p079h8.q.f(objB) ? null : objB);
    }

    public final List E(Context context) throws PackageManager.NameNotFoundException {
        Object objB;
        String str;
        kotlin.jvm.internal.n.h(context, "context");
        String[] strArrD = D(context);
        List listB = B(context);
        String[] strArrZ = z(context);
        ArrayList arrayList = null;
        if (strArrD != null && listB != null && strArrD.length == listB.size()) {
            ArrayList arrayList2 = new ArrayList();
            if (!(strArrD.length == 0)) {
                try {
                    h8.q.a aVar = p079h8.q.f21862r;
                    for (String str2 : strArrD) {
                        List listD0 = E8.i.D0(new E8.g("\\s+").b(str2, ""), new String[]{"x"}, false, 0, 6, null);
                        if (listD0.size() <= 1) {
                            listD0 = null;
                        }
                        if (listD0 != null) {
                            arrayList2.add(new Size(Integer.parseInt((String) listD0.get(0)), Integer.parseInt((String) listD0.get(1))));
                        }
                    }
                    objB = p079h8.q.b(A.f21846a);
                } catch (Throwable th) {
                    h8.q.a aVar2 = p079h8.q.f21862r;
                    objB = p079h8.q.b(p079h8.r.a(th));
                }
                Throwable thD = p079h8.q.d(objB);
                if (thD != null) {
                    G5.c.f1948a.c("getMultiPreviewTriples parseInt error: " + thD);
                }
            }
            if (arrayList2.size() == listB.size()) {
                arrayList = new ArrayList();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj = arrayList2.get(i10);
                    Object obj2 = listB.get(i10);
                    if (strArrZ == null || (str = strArrZ[i10]) == null) {
                        str = "";
                    }
                    arrayList.add(new u(obj, obj2, str));
                }
            }
        }
        return arrayList;
    }

    public final Integer G() {
        CardMetaInfoExt3 cardMetaInfoExt3V;
        Integer order;
        String str = this.f1686O;
        if (str == null || (cardMetaInfoExt3V = v(str)) == null || (order = cardMetaInfoExt3V.getOrder()) == null || order.intValue() < 0) {
            return null;
        }
        return order;
    }

    public final String H() {
        return this.f1689r;
    }

    public final String I(Context context) {
        kotlin.jvm.internal.n.h(context, "context");
        return M() ? a() : F(context);
    }

    public final int J() {
        return this.f1691t;
    }

    public final ComponentName K() {
        return this.f1683L;
    }

    public final int L() {
        return this.f1681J;
    }

    public final boolean M() {
        String strC = c();
        return strC != null && strC.length() > 0;
    }

    public final boolean N() {
        String str = this.f1686O;
        if (str == null) {
            return false;
        }
        CardMetaInfoExt3 cardMetaInfoExt3V = v(str);
        Integer numValueOf = cardMetaInfoExt3V != null ? Integer.valueOf(cardMetaInfoExt3V.getSharable()) : null;
        CardMetaInfoExt3 cardMetaInfoExt3V2 = v(str);
        return (numValueOf != null && numValueOf.intValue() == 1) || (numValueOf != null && numValueOf.intValue() == 2 && (cardMetaInfoExt3V2 != null ? cardMetaInfoExt3V2.getShareApiLevel() : 0) > 0);
    }

    public final void O(String str) {
        kotlin.jvm.internal.n.h(str, "<set-?>");
        this.f1694w = str;
    }

    public final void P(int i10) {
        this.f1679H = i10;
    }

    public final void Q(int i10) {
        this.f1688q = i10;
    }

    public final void R(int i10) {
        this.f1690s = i10;
    }

    public final void S(int i10) {
        this.f1678G = i10;
    }

    public final void T(int i10) {
        this.f1673B = i10;
    }

    public final void U(int i10) {
        this.f1672A = i10;
    }

    public final void V(String str) {
        this.f1680I = str;
    }

    public final void W(String str) {
        this.f1684M = str;
    }

    public final void X(String str) {
        this.f1685N = str;
    }

    public final void Y(String str) {
        this.f1686O = str;
    }

    public final void Z(int i10) {
        this.f1696y = i10;
    }

    public final void a0(int i10) {
        this.f1697z = i10;
    }

    public final String b() {
        return this.f1694w;
    }

    public final void b0(int i10) {
        this.f1695x = i10;
    }

    public final String c() {
        CardMetaInfoExt3 cardMetaInfoExt3V;
        AiWidgetMetaInfo aiWidgetMetaInfo;
        String str = this.f1686O;
        if (str == null || (cardMetaInfoExt3V = v(str)) == null || (aiWidgetMetaInfo = cardMetaInfoExt3V.getAiWidgetMetaInfo()) == null) {
            return null;
        }
        return aiWidgetMetaInfo.getBundleId();
    }

    public final void c0(int i10) {
        this.f1677F = i10;
    }

    public final int d() {
        return this.f1679H;
    }

    public final void d0(int i10) {
        this.f1676E = i10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int e() {
        return this.f1688q;
    }

    public final void e0(int i10) {
        this.f1675D = i10;
    }

    public boolean equals(Object obj) {
        if (obj instanceof m) {
            return kotlin.jvm.internal.n.d(this.f1694w, ((m) obj).f1694w);
        }
        return false;
    }

    public final int f() {
        return this.f1690s;
    }

    public final void f0(int i10) {
        this.f1682K = i10;
    }

    public final String g(Context context) {
        Object objB;
        kotlin.jvm.internal.n.h(context, "context");
        try {
            h8.q.a aVar = p079h8.q.f21862r;
            Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(this.f1689r);
            kotlin.jvm.internal.n.g(resourcesForApplication, "getResourcesForApplication(...)");
            objB = p079h8.q.b(resourcesForApplication.getString(this.f1690s));
        } catch (Throwable th) {
            h8.q.a aVar2 = p079h8.q.f21862r;
            objB = p079h8.q.b(p079h8.r.a(th));
        }
        Throwable thD = p079h8.q.d(objB);
        if (thD != null) {
            G5.c.f1948a.c("CardWidgetMetaInfo getCardName error: " + thD);
        }
        if (p079h8.q.f(objB)) {
            objB = "";
        }
        return (String) objB;
    }

    public final void g0(int i10) {
        this.f1674C = i10;
    }

    public final void h0(int i10) {
        this.f1693v = i10;
    }

    public int hashCode() {
        return Objects.hashCode(this.f1694w);
    }

    public final void i0(int i10) {
        this.f1692u = i10;
    }

    public final int j() {
        return this.f1678G;
    }

    public final void j0(String str) {
        kotlin.jvm.internal.n.h(str, "<set-?>");
        this.f1689r = str;
    }

    public final int k() {
        return this.f1673B;
    }

    public final void k0(int i10) {
        this.f1691t = i10;
    }

    public final int l() {
        return this.f1672A;
    }

    public final void l0(ComponentName componentName) {
        this.f1683L = componentName;
    }

    public final String m() {
        return this.f1680I;
    }

    public final void m0(int i10) {
        this.f1681J = i10;
    }

    public final String n() {
        return this.f1684M;
    }

    public final String o() {
        return this.f1685N;
    }

    public final String p() {
        return this.f1686O;
    }

    public final int q() {
        return this.f1696y;
    }

    public final int r() {
        return this.f1697z;
    }

    public final int s() {
        return this.f1695x;
    }

    public final int t() {
        return this.f1677F;
    }

    public final int u() {
        return this.f1676E;
    }

    public final int w() {
        return this.f1675D;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.n.h(dest, "dest");
        dest.writeInt(this.f1688q);
        dest.writeString(this.f1689r);
        dest.writeInt(this.f1690s);
        dest.writeInt(this.f1691t);
        dest.writeInt(this.f1692u);
        dest.writeInt(this.f1693v);
        dest.writeString(this.f1694w);
        dest.writeInt(this.f1695x);
        dest.writeInt(this.f1696y);
        dest.writeInt(this.f1697z);
        dest.writeInt(this.f1672A);
        dest.writeInt(this.f1673B);
        dest.writeInt(this.f1674C);
        dest.writeInt(this.f1675D);
        dest.writeInt(this.f1676E);
        dest.writeInt(this.f1677F);
        dest.writeInt(this.f1678G);
        dest.writeInt(this.f1679H);
        dest.writeString(this.f1680I);
        dest.writeInt(this.f1681J);
        dest.writeInt(this.f1682K);
        dest.writeParcelable(this.f1683L, i10);
        dest.writeString(this.f1684M);
        dest.writeString(this.f1685N);
        dest.writeString(this.f1686O);
    }

    public final int x() {
        return this.f1682K;
    }

    public final int y() {
        return this.f1674C;
    }

    public final String[] z(Context context) {
        Object objB;
        CardMetaInfoExt3 cardMetaInfoExt3V;
        kotlin.jvm.internal.n.h(context, "context");
        try {
            h8.q.a aVar = p079h8.q.f21862r;
            String str = this.f1686O;
            objB = p079h8.q.b((str == null || (cardMetaInfoExt3V = v(str)) == null || cardMetaInfoExt3V.getMultiPreviewDesc() == 0) ? null : context.getPackageManager().getResourcesForApplication(this.f1689r).getStringArray(cardMetaInfoExt3V.getMultiPreviewDesc()));
        } catch (Throwable th) {
            h8.q.a aVar2 = p079h8.q.f21862r;
            objB = p079h8.q.b(p079h8.r.a(th));
        }
        Throwable thD = p079h8.q.d(objB);
        if (thD != null) {
            G5.c.d("Host", "getMultiPreviewDesc error: " + thD);
        }
        return (String[]) (p079h8.q.f(objB) ? null : objB);
    }

    public m() {
        this(0, "", 0, 0, 0, 0, "", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, null, null, null, null);
    }
}
