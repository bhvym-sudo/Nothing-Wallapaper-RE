package p074h3;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: h3.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1366f {
    private static PendingIntent a(Context context) {
        return PendingIntent.getBroadcast(context, 0, new Intent(context, (Class<?>) AbstractC1365e.class), 67108864);
    }

    public static void b(Context context) {
        long timeInMillis;
        H hA = I.a();
        InterfaceC1361a interfaceC1361aC = hA.c(context);
        long jG0 = hA.f(context).g0();
        Calendar calendar = Calendar.getInstance();
        long jCurrentTimeMillis = System.currentTimeMillis();
        calendar.setTimeInMillis(jCurrentTimeMillis);
        calendar.add(6, -1);
        if (jG0 == -1 || jG0 < calendar.getTimeInMillis()) {
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(jCurrentTimeMillis);
            calendar2.add(12, 1);
            timeInMillis = calendar2.getTimeInMillis();
        } else {
            Calendar calendar3 = Calendar.getInstance();
            calendar3.setTimeInMillis(jG0);
            calendar3.add(6, 1);
            timeInMillis = calendar3.getTimeInMillis();
        }
        long j9 = timeInMillis;
        interfaceC1361aC.b(a(context));
        interfaceC1361aC.a(1, j9, TimeUnit.MILLISECONDS.convert(24L, TimeUnit.HOURS), a(context));
    }
}
