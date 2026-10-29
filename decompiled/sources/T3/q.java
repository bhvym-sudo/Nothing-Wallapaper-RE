package T3;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class q implements B.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SQLiteDatabase f7670a;

    private q(SQLiteDatabase sQLiteDatabase) {
        this.f7670a = sQLiteDatabase;
    }

    public static B.d b(SQLiteDatabase sQLiteDatabase) {
        return new q(sQLiteDatabase);
    }

    @Override // T3.B.d
    public Object a() {
        return B.Q(this.f7670a);
    }
}
