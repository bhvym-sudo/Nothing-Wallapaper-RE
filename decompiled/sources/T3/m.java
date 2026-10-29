package T3;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class m implements B.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f7664a;

    private m(long j9) {
        this.f7664a = j9;
    }

    public static B.b a(long j9) {
        return new m(j9);
    }

    @Override // T3.B.b
    public Object apply(Object obj) {
        return Integer.valueOf(((SQLiteDatabase) obj).delete("events", "timestamp_ms < ?", new String[]{String.valueOf(this.f7664a)}));
    }
}
