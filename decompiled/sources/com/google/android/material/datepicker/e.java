package com.google.android.material.datepicker;

import android.content.Context;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
abstract class e {
    static String a(Context context, long j9, boolean z9, boolean z10, boolean z11) {
        String strD = d(j9);
        if (z9) {
            strD = String.format(context.getString(p225w4.i.f28899v), strD);
        }
        if (z10) {
            return String.format(context.getString(p225w4.i.f28898u), strD);
        }
        return z11 ? String.format(context.getString(p225w4.i.f28895r), strD) : strD;
    }

    static String b(long j9) {
        return c(j9, Locale.getDefault());
    }

    static String c(long j9, Locale locale) {
        return t.d(locale).format(new Date(j9));
    }

    static String d(long j9) {
        return i(j9) ? b(j9) : g(j9);
    }

    static String e(Context context, int i10) {
        return t.g().get(1) == i10 ? String.format(context.getString(p225w4.i.f28896s), Integer.valueOf(i10)) : String.format(context.getString(p225w4.i.f28897t), Integer.valueOf(i10));
    }

    static String f(long j9) {
        return t.k(Locale.getDefault()).format(new Date(j9));
    }

    static String g(long j9) {
        return h(j9, Locale.getDefault());
    }

    static String h(long j9, Locale locale) {
        return t.l(locale).format(new Date(j9));
    }

    private static boolean i(long j9) {
        Calendar calendarG = t.g();
        Calendar calendarI = t.i();
        calendarI.setTimeInMillis(j9);
        return calendarG.get(1) == calendarI.get(1);
    }
}
