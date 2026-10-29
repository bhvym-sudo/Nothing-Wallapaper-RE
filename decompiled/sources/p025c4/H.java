package p025c4;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import p035d4.a;
import p035d4.c;

/* JADX INFO: loaded from: classes.dex */
public final class H extends a {
    public static final Parcelable.Creator<H> CREATOR = new I();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final int f15061q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Account f15062r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f15063s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final GoogleSignInAccount f15064t;

    H(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f15061q = i10;
        this.f15062r = account;
        this.f15063s = i11;
        this.f15064t = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.h(parcel, 1, this.f15061q);
        c.l(parcel, 2, this.f15062r, i10, false);
        c.h(parcel, 3, this.f15063s);
        c.l(parcel, 4, this.f15064t, i10, false);
        c.b(parcel, iA);
    }

    public H(Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i10, googleSignInAccount);
    }
}
