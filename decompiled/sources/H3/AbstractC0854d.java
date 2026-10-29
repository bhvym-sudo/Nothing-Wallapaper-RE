package H3;

import android.content.Intent;
import android.net.Uri;

/* JADX INFO: renamed from: H3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0854d {
    public static String a(Intent intent) {
        if (b(intent)) {
            return intent.getData().getQueryParameter("collection_id");
        }
        return null;
    }

    public static boolean b(Intent intent) {
        Uri data = intent.getData();
        return data != null && "https".equals(data.getScheme()) && data.getSchemeSpecificPart().startsWith("//g.co/wallpaper");
    }
}
