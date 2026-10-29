package J6;

import android.app.Activity;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p064g3.x;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends x {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f3609w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int f3610x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final int f3611y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final a f3608z = new a(null);
    public static final Parcelable.Creator<m> CREATOR = new b();

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final m createFromParcel(Parcel parcel) {
            n.h(parcel, "parcel");
            return new m(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m[] newArray(int i10) {
            return new m[i10];
        }
    }

    public /* synthetic */ m(int i10, int i11, int i12, int i13, AbstractC1457h abstractC1457h) {
        this(i10, i11, (i13 & 4) != 0 ? 1 : i12);
    }

    public final int A() {
        return this.f3610x;
    }

    public Void B(Context context) {
        return null;
    }

    public final int C() {
        return this.f3609w;
    }

    @Override // p064g3.x
    public /* bridge */ /* synthetic */ com.android.wallpaper.asset.a d(Context context) {
        return (com.android.wallpaper.asset.a) y(context);
    }

    @Override // p064g3.x
    public List e(Context context) {
        return new ArrayList();
    }

    @Override // p064g3.x
    public String g(Context context) {
        return String.valueOf(this.f3611y);
    }

    @Override // p064g3.x
    public /* bridge */ /* synthetic */ com.android.wallpaper.asset.a o(Context context) {
        return (com.android.wallpaper.asset.a) B(context);
    }

    @Override // p064g3.x
    public String r() {
        return String.valueOf(this.f3611y);
    }

    @Override // p064g3.x, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        n.h(dest, "dest");
        dest.writeInt(this.f3609w);
        dest.writeInt(this.f3610x);
        dest.writeInt(this.f3611y);
    }

    @Override // p064g3.x
    public void x(Activity activity, p064g3.j jVar, int i10, boolean z9) {
    }

    public Void y(Context context) {
        return null;
    }

    public final int z() {
        return this.f3611y;
    }

    public m(int i10, int i11, int i12) {
        this.f3609w = i10;
        this.f3610x = i11;
        this.f3611y = i12;
    }
}
