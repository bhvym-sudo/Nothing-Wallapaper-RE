package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
class r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static r f10252d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f10253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LocationManager f10254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f10255c = new a();

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f10256a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f10257b;

        a() {
        }
    }

    r(Context context, LocationManager locationManager) {
        this.f10253a = context;
        this.f10254b = locationManager;
    }

    static r a(Context context) {
        if (f10252d == null) {
            Context applicationContext = context.getApplicationContext();
            f10252d = new r(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f10252d;
    }

    private Location b() {
        Location locationC = p171r0.d.b(this.f10253a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location locationC2 = p171r0.d.b(this.f10253a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        if (locationC2 == null || locationC == null) {
            return locationC2 != null ? locationC2 : locationC;
        }
        return locationC2.getTime() > locationC.getTime() ? locationC2 : locationC;
    }

    private Location c(String str) {
        try {
            if (this.f10254b.isProviderEnabled(str)) {
                return this.f10254b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e10) {
            Log.d("TwilightManager", "Failed to get last known location", e10);
            return null;
        }
    }

    private boolean e() {
        return this.f10255c.f10257b > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j9;
        a aVar = this.f10255c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        q qVarB = q.b();
        qVarB.a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        qVarB.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z9 = qVarB.f10251c == 1;
        long j10 = qVarB.f10250b;
        long j11 = qVarB.f10249a;
        qVarB.a(jCurrentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j12 = qVarB.f10250b;
        if (j10 == -1 || j11 == -1) {
            j9 = jCurrentTimeMillis + 43200000;
        } else {
            if (jCurrentTimeMillis > j11) {
                j10 = j12;
            } else if (jCurrentTimeMillis > j10) {
                j10 = j11;
            }
            j9 = j10 + 60000;
        }
        aVar.f10256a = z9;
        aVar.f10257b = j9;
    }

    boolean d() {
        a aVar = this.f10255c;
        if (e()) {
            return aVar.f10256a;
        }
        Location locationB = b();
        if (locationB != null) {
            f(locationB);
            return aVar.f10256a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i10 = Calendar.getInstance().get(11);
        return i10 < 6 || i10 >= 22;
    }
}
