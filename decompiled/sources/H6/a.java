package H6;

import android.content.Context;
import java.util.Locale;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    public static final Locale a(Context context) {
        n.h(context, "<this>");
        Locale locale = context.getResources().getConfiguration().getLocales().get(0);
        if (locale != null) {
            return locale;
        }
        Locale locale2 = Locale.getDefault();
        n.g(locale2, "getDefault(...)");
        return locale2;
    }

    public static final boolean b(Context context) {
        n.h(context, "<this>");
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static final boolean c(Context context) {
        n.h(context, "<this>");
        return context.getPackageManager().checkPermission("android.permission.READ_MEDIA_IMAGES", context.getPackageName()) == 0;
    }

    public static final boolean d(Context context) {
        n.h(context, "<this>");
        return context.getResources().getConfiguration().getLayoutDirection() == 1;
    }
}
