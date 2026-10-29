package p025c4;

import Y3.b;
import Z3.i;
import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.P;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Locale;
import p085i4.e;
import p105k4.c;
import p231x0.f;

/* JADX INFO: renamed from: c4.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1211z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final P f15226a = new P();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Locale f15227b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return c.a(context).b(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context) {
        return context.getResources().getString(b.f9340g);
    }

    public static String c(Context context, int i10) {
        Resources resources = context.getResources();
        if (i10 == 1) {
            return resources.getString(b.f9337d);
        }
        if (i10 != 2) {
            return i10 != 3 ? resources.getString(R.string.ok) : resources.getString(b.f9334a);
        }
        return resources.getString(b.f9343j);
    }

    public static String d(Context context, int i10) {
        Resources resources = context.getResources();
        String strA = a(context);
        if (i10 == 1) {
            return resources.getString(b.f9338e, strA);
        }
        if (i10 == 2) {
            return e.c(context) ? resources.getString(b.f9347n) : resources.getString(b.f9344k, strA);
        }
        if (i10 == 3) {
            return resources.getString(b.f9335b, strA);
        }
        if (i10 == 5) {
            return h(context, "common_google_play_services_invalid_account_text", strA);
        }
        if (i10 == 7) {
            return h(context, "common_google_play_services_network_error_text", strA);
        }
        if (i10 == 9) {
            return resources.getString(b.f9342i, strA);
        }
        if (i10 == 20) {
            return h(context, "common_google_play_services_restricted_profile_text", strA);
        }
        switch (i10) {
            case 16:
                return h(context, "common_google_play_services_api_unavailable_text", strA);
            case 17:
                return h(context, "common_google_play_services_sign_in_failed_text", strA);
            case 18:
                return resources.getString(b.f9346m, strA);
            default:
                return resources.getString(i.f9464a, strA);
        }
    }

    public static String e(Context context, int i10) {
        return (i10 == 6 || i10 == 19) ? h(context, "common_google_play_services_resolution_required_text", a(context)) : d(context, i10);
    }

    public static String f(Context context, int i10) {
        String strI = i10 == 6 ? i(context, "common_google_play_services_resolution_required_title") : g(context, i10);
        return strI == null ? context.getResources().getString(b.f9341h) : strI;
    }

    public static String g(Context context, int i10) {
        Resources resources = context.getResources();
        switch (i10) {
            case 1:
                return resources.getString(b.f9339f);
            case 2:
                return resources.getString(b.f9345l);
            case 3:
                return resources.getString(b.f9336c);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return i(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return i(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i10);
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return i(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return i(context, "common_google_play_services_restricted_profile_title");
        }
    }

    private static String h(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strI = i(context, str);
        if (strI == null) {
            strI = resources.getString(i.f9464a);
        }
        return String.format(resources.getConfiguration().locale, strI, str2);
    }

    private static String i(Context context, String str) {
        P p9 = f15226a;
        synchronized (p9) {
            try {
                Locale localeC = f.a(context.getResources().getConfiguration()).c(0);
                if (!localeC.equals(f15227b)) {
                    p9.clear();
                    f15227b = localeC;
                }
                String str2 = (String) p9.get(str);
                if (str2 != null) {
                    return str2;
                }
                Resources resourcesB = Z3.f.b(context);
                if (resourcesB == null) {
                    return null;
                }
                int identifier = resourcesB.getIdentifier(str, TypedValues.Custom.S_STRING, "com.google.android.gms");
                if (identifier == 0) {
                    Log.w("GoogleApiAvailability", "Missing resource: " + str);
                    return null;
                }
                String string = resourcesB.getString(identifier);
                if (!TextUtils.isEmpty(string)) {
                    p9.put(str, string);
                    return string;
                }
                Log.w("GoogleApiAvailability", "Got empty resource: " + str);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
