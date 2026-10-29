package p047e6;

import android.graphics.Typeface;
import com.nothing.utils.Utils;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    public static Typeface a() {
        return Typeface.create("NDot55", 0);
    }

    public static Typeface b() {
        return Typeface.create("NDot57", 0);
    }

    public static Typeface c() {
        return Typeface.create("NDot77JPExtended", 0);
    }

    public static Typeface d() {
        if (e()) {
            return (e() && "ja".equals(Locale.getDefault().getLanguage())) ? c() : a();
        }
        return Typeface.DEFAULT;
    }

    public static boolean e() {
        return Utils.isSupportNdot(Locale.getDefault().getLanguage());
    }
}
