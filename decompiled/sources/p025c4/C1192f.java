package p025c4;

import Z3.c;
import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import p035d4.a;

/* JADX INFO: renamed from: c4.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1192f extends a {
    public static final Parcelable.Creator<C1192f> CREATOR = new b0();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    static final Scope[] f15159E = new Scope[0];

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    static final c[] f15160F = new c[0];

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    boolean f15161A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    int f15162B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    boolean f15163C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private String f15164D;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final int f15165q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final int f15166r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f15167s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    String f15168t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    IBinder f15169u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    Scope[] f15170v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    Bundle f15171w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    Account f15172x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    c[] f15173y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    c[] f15174z;

    C1192f(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, c[] cVarArr, c[] cVarArr2, boolean z9, int i13, boolean z10, String str2) {
        scopeArr = scopeArr == null ? f15159E : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        cVarArr = cVarArr == null ? f15160F : cVarArr;
        cVarArr2 = cVarArr2 == null ? f15160F : cVarArr2;
        this.f15165q = i10;
        this.f15166r = i11;
        this.f15167s = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f15168t = "com.google.android.gms";
        } else {
            this.f15168t = str;
        }
        if (i10 < 2) {
            this.f15172x = iBinder != null ? AbstractBinderC1187a.e(InterfaceC1196j.a.c(iBinder)) : null;
        } else {
            this.f15169u = iBinder;
            this.f15172x = account;
        }
        this.f15170v = scopeArr;
        this.f15171w = bundle;
        this.f15173y = cVarArr;
        this.f15174z = cVarArr2;
        this.f15161A = z9;
        this.f15162B = i13;
        this.f15163C = z10;
        this.f15164D = str2;
    }

    public final String a() {
        return this.f15164D;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        b0.a(this, parcel, i10);
    }
}
