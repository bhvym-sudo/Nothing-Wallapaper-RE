package X5;

import android.content.Context;
import android.icu.text.SimpleDateFormat;
import android.text.format.DateFormat;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {
    public static String a(long j9, String str) {
        return new SimpleDateFormat(DateFormat.getBestDateTimePattern(Locale.getDefault(), str), Locale.getDefault()).format(Long.valueOf(j9));
    }

    private static String b(Context context, long j9, long j10) {
        boolean zG = g(j10, j9);
        String str = DateFormat.is24HourFormat(context) ? "HH:mm" : "hh:mm";
        if (zG) {
            return a(j9, str);
        }
        if (e(j10, j9)) {
            return String.format("%s %s", context.getString(W5.b.f8692c), a(j9, str));
        }
        if (f(j10, j9)) {
            return String.format("%s %s", context.getString(W5.b.f8693d), a(j9, str));
        }
        if (h(j9, j10)) {
            return a(j9, "d/MMM " + str);
        }
        return a(j9, "d/MMM/yyyy " + str);
    }

    public static String c(Context context, a aVar) {
        int iC = aVar.c();
        if (iC == 1) {
            return context.getResources().getString(W5.b.f8690a, Long.valueOf(aVar.g()));
        }
        return iC == 2 ? context.getResources().getString(W5.b.f8691b) : "";
    }

    public static String d(Context context, a aVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strB = b(context, aVar.e(), jCurrentTimeMillis);
        String strB2 = b(context, aVar.b(), jCurrentTimeMillis);
        if (e(jCurrentTimeMillis, aVar.e()) && e(jCurrentTimeMillis, aVar.b())) {
            String str = String.format("%s ", context.getString(W5.b.f8692c));
            if (strB2.startsWith(str)) {
                strB2 = strB2.replaceFirst(str, "");
            }
        }
        return strB + " - " + strB2;
    }

    public static boolean e(long j9, long j10) {
        return g(j9 + 86400000, j10);
    }

    public static boolean f(long j9, long j10) {
        return g(j10 + 86400000, j9);
    }

    public static boolean g(long j9, long j10) {
        if (h(j9, j10)) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j9);
            int i10 = calendar.get(6);
            calendar.setTimeInMillis(j10);
            if (i10 == calendar.get(6)) {
                return true;
            }
        }
        return false;
    }

    public static boolean h(long j9, long j10) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j9);
        int i10 = calendar.get(1);
        calendar.setTimeInMillis(j10);
        return i10 == calendar.get(1);
    }
}
