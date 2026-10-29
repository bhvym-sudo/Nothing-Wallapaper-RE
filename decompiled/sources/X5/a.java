package X5;

import android.database.Cursor;
import android.text.TextUtils;
import android.util.Log;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f8981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f8983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f8984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f8985e;

    public a() {
        this.f8981a = 0L;
        this.f8982b = null;
        this.f8983c = 0L;
        this.f8984d = 0L;
        this.f8985e = null;
    }

    public static a a(Cursor cursor) {
        Log.d("CalendarSimpleData", "cursor " + cursor);
        if (cursor == null || cursor.getCount() <= 0) {
            return null;
        }
        Log.d("CalendarSimpleData", "getCount " + cursor.getCount());
        long j9 = cursor.getLong(cursor.getColumnIndex("event_id"));
        String string = cursor.getString(cursor.getColumnIndex("title"));
        String string2 = cursor.getString(cursor.getColumnIndex("eventLocation"));
        long j10 = cursor.getLong(cursor.getColumnIndex("begin"));
        long j11 = cursor.getLong(cursor.getColumnIndex("end"));
        Log.d("CalendarSimpleData", "Next calendar event is loaded. id = " + j9 + ", title = " + string + ", location = " + string2 + ", dtStart = " + j10 + ", dtEnd = " + j11);
        return new a(j9, string, j10, j11, string2);
    }

    public long b() {
        return this.f8984d;
    }

    public int c() {
        long jG = g();
        if (jG > 20) {
            return 0;
        }
        if (jG > 0) {
            return 1;
        }
        return jG > -10 ? 2 : 3;
    }

    public String d() {
        return this.f8985e;
    }

    public long e() {
        return this.f8983c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f8981a == aVar.f8981a && TextUtils.equals(this.f8982b, aVar.f8982b) && this.f8983c == aVar.f8983c && this.f8984d == aVar.f8984d && TextUtils.equals(this.f8985e, aVar.f8985e)) {
                return true;
            }
        }
        return false;
    }

    public String f() {
        return this.f8982b;
    }

    public long g() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return timeUnit.toMinutes(this.f8983c) - timeUnit.toMinutes(System.currentTimeMillis());
    }

    public boolean h() {
        int iC = c();
        return 1 == iC || 2 == iC;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.f8981a), this.f8982b, Long.valueOf(this.f8983c), Long.valueOf(this.f8984d), this.f8985e);
    }

    public a(long j9, String str, long j10, long j11, String str2) {
        this.f8981a = j9;
        this.f8982b = str;
        this.f8983c = j10;
        this.f8984d = j11;
        this.f8985e = str2;
    }
}
