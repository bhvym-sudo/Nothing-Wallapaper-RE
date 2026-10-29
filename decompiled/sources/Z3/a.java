package Z3;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import p025c4.AbstractC1201o;

/* JADX INFO: loaded from: classes.dex */
public final class a extends p035d4.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final int f9442q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f9443r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final PendingIntent f9444s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f9445t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final a f9441u = new a(0);
    public static final Parcelable.Creator<a> CREATOR = new l();

    a(int i10, int i11, PendingIntent pendingIntent, String str) {
        this.f9442q = i10;
        this.f9443r = i11;
        this.f9444s = pendingIntent;
        this.f9445t = str;
    }

    static String f(int i10) {
        if (i10 == 99) {
            return "UNFINISHED";
        }
        if (i10 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i10) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i10) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i10 + ")";
                }
        }
    }

    public int a() {
        return this.f9443r;
    }

    public String b() {
        return this.f9445t;
    }

    public PendingIntent c() {
        return this.f9444s;
    }

    public boolean d() {
        return (this.f9443r == 0 || this.f9444s == null) ? false : true;
    }

    public boolean e() {
        return this.f9443r == 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f9443r == aVar.f9443r && AbstractC1201o.a(this.f9444s, aVar.f9444s) && AbstractC1201o.a(this.f9445t, aVar.f9445t);
    }

    public int hashCode() {
        return AbstractC1201o.b(Integer.valueOf(this.f9443r), this.f9444s, this.f9445t);
    }

    public String toString() {
        AbstractC1201o.a aVarC = AbstractC1201o.c(this);
        aVarC.a("statusCode", f(this.f9443r));
        aVarC.a("resolution", this.f9444s);
        aVarC.a("message", this.f9445t);
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = p035d4.c.a(parcel);
        p035d4.c.h(parcel, 1, this.f9442q);
        p035d4.c.h(parcel, 2, a());
        p035d4.c.l(parcel, 3, c(), i10, false);
        p035d4.c.m(parcel, 4, b(), false);
        p035d4.c.b(parcel, iA);
    }

    public a(int i10) {
        this(i10, null, null);
    }

    public a(int i10, PendingIntent pendingIntent) {
        this(i10, pendingIntent, null);
    }

    public a(int i10, PendingIntent pendingIntent, String str) {
        this(1, i10, pendingIntent, str);
    }
}
