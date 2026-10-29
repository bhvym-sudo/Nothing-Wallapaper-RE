package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
class s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final s f16976c = new s(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Long f16977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TimeZone f16978b;

    private s(Long l9, TimeZone timeZone) {
        this.f16977a = l9;
        this.f16978b = timeZone;
    }

    static s c() {
        return f16976c;
    }

    Calendar a() {
        return b(this.f16978b);
    }

    Calendar b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l9 = this.f16977a;
        if (l9 != null) {
            calendar.setTimeInMillis(l9.longValue());
        }
        return calendar;
    }
}
