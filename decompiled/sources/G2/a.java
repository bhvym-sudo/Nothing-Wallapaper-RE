package G2;

import android.app.Activity;
import androidx.window.embedding.ActivityEmbeddingController;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static boolean a(Activity activity) {
        return ActivityEmbeddingController.getInstance(activity).isActivityEmbedded(activity);
    }

    public static boolean b(Activity activity, boolean z9) {
        if (p231x0.a.a() && z9) {
            return a(activity);
        }
        return false;
    }
}
