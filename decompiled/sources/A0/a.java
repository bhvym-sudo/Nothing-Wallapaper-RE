package A0;

import android.icu.number.NumberFormatter;
import android.icu.number.UnlocalizedNumberFormatter;
import android.icu.util.MeasureUnit;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f116a = {"BS", "BZ", "KY", "PR", "PW", "US"};

    /* JADX INFO: renamed from: A0.a$a, reason: collision with other inner class name */
    private static class C0002a {
        static Locale a() {
            return Locale.getDefault(Locale.Category.FORMAT);
        }
    }

    private static class b {
        static String a(Locale locale) {
            String identifier = ((UnlocalizedNumberFormatter) ((UnlocalizedNumberFormatter) NumberFormatter.with().usage("weather")).unit(MeasureUnit.CELSIUS)).locale(locale).format(1L).getOutputUnit().getIdentifier();
            return identifier.startsWith("fahrenhe") ? "fahrenhe" : identifier;
        }
    }

    public static String a() {
        return c(true);
    }

    public static String b(Locale locale, boolean z9) {
        String strD = d("mu", "", locale, z9);
        return strD != null ? strD : b.a(locale);
    }

    public static String c(boolean z9) {
        return b(C0002a.a(), z9);
    }

    private static String d(String str, String str2, Locale locale, boolean z9) {
        String unicodeLocaleType = locale.getUnicodeLocaleType(str);
        if (unicodeLocaleType != null) {
            return unicodeLocaleType;
        }
        if (z9) {
            return null;
        }
        return str2;
    }
}
