package Z5;

import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import p017b6.b;
import p017b6.g;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ArrayList f9482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ArrayList f9483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ArrayList f9484c;

    static {
        Locale locale = Locale.ENGLISH;
        String language = locale.getLanguage();
        Locale locale2 = Locale.FRANCE;
        String language2 = locale2.getLanguage();
        Locale locale3 = Locale.GERMAN;
        String language3 = locale3.getLanguage();
        Locale locale4 = Locale.ITALIAN;
        f9482a = new ArrayList(Arrays.asList(language, language2, language3, locale4.getLanguage(), "af", "da", "es", "et", "fi", "tl", "nb", "sv", "nl", "ru", "uk", "bg", "sr", "be", "mk", "pt"));
        f9483b = new ArrayList(Arrays.asList(locale.getLanguage(), locale2.getLanguage(), locale3.getLanguage(), locale4.getLanguage(), "af", "da", "es", "et", "fi", "tl", "nb", "sv", "nl", "ru", "uk", "bg", "sr", "be", "mk", "pt"));
        f9484c = new ArrayList(Arrays.asList("zh", "ja", "ko", "ru"));
    }

    public static boolean a(String str) {
        try {
            Method methodA = g.a(b.a("com.nothing.utils.Utils"), "isSupportNdot", String.class);
            if (methodA != null) {
                return ((Boolean) g.b(methodA, null, str)).booleanValue();
            }
        } catch (Exception e10) {
            Log.e("NothingUtils", e10.getMessage());
        }
        return f9482a.contains(new Locale(str).getLanguage());
    }
}
