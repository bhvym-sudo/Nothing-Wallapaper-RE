package T3;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class F implements H.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final F f7629a = new F();

    private F() {
    }

    public static H.a b() {
        return f7629a;
    }

    @Override // T3.H.a
    public void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
