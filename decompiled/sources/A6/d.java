package A6;

import android.app.Activity;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p064g3.j;
import p064g3.x;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends x {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final b f298A = new b(null);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final Parcelable.Creator f299B = new a();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final List f300w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final String f301x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final String f302y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final String f303z;

    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel in) {
            n.h(in, "in");
            return new d(null, null, null, null, 15, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int i10) {
            return new d[i10];
        }
    }

    public static final class b {
        public /* synthetic */ b(AbstractC1457h abstractC1457h) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ d(List list, String str, String str2, String str3, int i10, AbstractC1457h abstractC1457h) {
        this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3);
    }

    @Override // p064g3.x
    public String c(Context context) {
        return this.f301x;
    }

    @Override // p064g3.x
    public com.android.wallpaper.asset.a d(Context context) {
        return null;
    }

    @Override // p064g3.x
    public List e(Context context) {
        List list = this.f300w;
        if (list != null) {
            return AbstractC1444s.u0(list);
        }
        return null;
    }

    @Override // p064g3.x
    public String g(Context context) {
        return this.f302y;
    }

    @Override // p064g3.x
    public com.android.wallpaper.asset.a o(Context context) {
        return null;
    }

    @Override // p064g3.x
    public String r() {
        return this.f303z;
    }

    @Override // p064g3.x
    public void x(Activity srcActivity, j factory, int i10, boolean z9) {
        n.h(srcActivity, "srcActivity");
        n.h(factory, "factory");
    }

    public d(List list, String str, String str2, String str3) {
        super(Parcel.obtain());
        this.f300w = list;
        this.f301x = str;
        this.f302y = str2;
        this.f303z = str3;
    }
}
