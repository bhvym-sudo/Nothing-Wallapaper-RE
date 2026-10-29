package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p005a4.c;
import p025c4.AbstractC1201o;

/* JADX INFO: loaded from: classes.dex */
public final class Status extends p035d4.a implements ReflectedParcelable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final int f16202q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f16203r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final String f16204s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final PendingIntent f16205t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Z3.a f16206u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Status f16197v = new Status(-1);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Status f16198w = new Status(0);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Status f16199x = new Status(14);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Status f16200y = new Status(8);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Status f16201z = new Status(15);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final Status f16194A = new Status(16);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final Status f16196C = new Status(17);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final Status f16195B = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new b();

    Status(int i10, int i11, String str, PendingIntent pendingIntent, Z3.a aVar) {
        this.f16202q = i10;
        this.f16203r = i11;
        this.f16204s = str;
        this.f16205t = pendingIntent;
        this.f16206u = aVar;
    }

    public Z3.a a() {
        return this.f16206u;
    }

    public int b() {
        return this.f16203r;
    }

    public String c() {
        return this.f16204s;
    }

    public boolean d() {
        return this.f16205t != null;
    }

    public boolean e() {
        return this.f16203r <= 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f16202q == status.f16202q && this.f16203r == status.f16203r && AbstractC1201o.a(this.f16204s, status.f16204s) && AbstractC1201o.a(this.f16205t, status.f16205t) && AbstractC1201o.a(this.f16206u, status.f16206u);
    }

    public final String f() {
        String str = this.f16204s;
        return str != null ? str : c.a(this.f16203r);
    }

    public int hashCode() {
        return AbstractC1201o.b(Integer.valueOf(this.f16202q), Integer.valueOf(this.f16203r), this.f16204s, this.f16205t, this.f16206u);
    }

    public String toString() {
        AbstractC1201o.a aVarC = AbstractC1201o.c(this);
        aVarC.a("statusCode", f());
        aVarC.a("resolution", this.f16205t);
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = p035d4.c.a(parcel);
        p035d4.c.h(parcel, 1, b());
        p035d4.c.m(parcel, 2, c(), false);
        p035d4.c.l(parcel, 3, this.f16205t, i10, false);
        p035d4.c.l(parcel, 4, a(), i10, false);
        p035d4.c.h(parcel, 1000, this.f16202q);
        p035d4.c.b(parcel, iA);
    }

    public Status(int i10) {
        this(i10, (String) null);
    }

    public Status(int i10, String str) {
        this(1, i10, str, null, null);
    }

    public Status(Z3.a aVar, String str) {
        this(aVar, str, 17);
    }

    public Status(Z3.a aVar, String str, int i10) {
        this(1, i10, str, aVar.c(), aVar);
    }
}
