package H3;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import com.nothing.wallpaper.R;

/* JADX INFO: renamed from: H3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0851a {
    public static Activity a(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    public static boolean b(Intent intent) {
        return "app_launched_keyguard".equals(intent.getStringExtra("com.android.wallpaper.LAUNCH_SOURCE"));
    }

    public static boolean c(Intent intent) {
        return "app_launched_launcher".equals(intent.getStringExtra("com.android.wallpaper.LAUNCH_SOURCE"));
    }

    private static boolean d(Intent intent) {
        return intent != null && TextUtils.equals("app_launched_settings", intent.getStringExtra("com.android.wallpaper.LAUNCH_SOURCE"));
    }

    private static boolean e(Intent intent) {
        return intent != null && intent.getBooleanExtra("is_from_settings_homepage", false);
    }

    public static boolean f(Intent intent) {
        return d(intent) || g(intent);
    }

    public static boolean g(Intent intent) {
        return intent != null && intent.hasExtra(":settings:fragment_args_key");
    }

    public static boolean h(Intent intent) {
        return e(intent);
    }

    public static boolean i(Intent intent) {
        return (intent == null || TextUtils.isEmpty(intent.getStringExtra("com.nothing.userguide.extra.KEY_FROM_TIPS"))) ? false : true;
    }

    public static boolean j(Context context) {
        return Settings.Secure.getInt(context.getContentResolver(), "user_setup_complete", 1) == 0;
    }

    public static boolean k(Intent intent) {
        if (intent != null) {
            return (c(intent) || f(intent)) ? false : true;
        }
        return true;
    }

    public static boolean l(Intent intent) {
        return "wallpaper_only".equals(intent.getStringExtra("com.android.launcher3.WALLPAPER_FLAVOR"));
    }

    public static void m(Activity activity, Intent intent, int i10) {
        try {
            activity.startActivityForResult(intent, i10);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(activity, R.string.app_not_found, 0).show();
        } catch (SecurityException e10) {
            Toast.makeText(activity, R.string.app_not_found, 0).show();
            Log.e("Wallpaper", "Wallpaper does not have the permission to launch " + intent + ". Make sure to create a MAIN intent-filter for the corresponding activity or use the exported attribute for this activity.", e10);
        }
    }
}
