package K4;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static Typeface a(Context context, Typeface typeface) {
        return b(context.getResources().getConfiguration(), typeface);
    }

    public static Typeface b(Configuration configuration, Typeface typeface) {
        int i10 = configuration.fontWeightAdjustment;
        if (i10 == Integer.MAX_VALUE || i10 == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, p221w0.a.b(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }
}
