package com.nothing.cardwidget.pedometer;

import android.content.Context;
import android.icu.util.Calendar;
import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
public final class UtilsKt {
    public static final long getPastDayTimeMillis(int i10) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(6, calendar.get(6) - i10);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static final String[] getShortWeekdays() {
        Locale locale = Locale.getDefault();
        DayOfWeek[] dayOfWeekArrValues = DayOfWeek.values();
        ArrayList arrayList = new ArrayList(dayOfWeekArrValues.length);
        for (DayOfWeek dayOfWeek : dayOfWeekArrValues) {
            arrayList.add(dayOfWeek.getDisplayName(TextStyle.NARROW, locale));
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final long getTodayTimeMillis() {
        return getPastDayTimeMillis(0);
    }

    public static final boolean hasPhysicalPermission(Context context) {
        n.h(context, "context");
        return p171r0.a.a(context, "android.permission.ACTIVITY_RECOGNITION") == 0;
    }

    public static final boolean isRtl(Context context) {
        n.h(context, "context");
        return context.getResources().getConfiguration().getLayoutDirection() == 1;
    }
}
