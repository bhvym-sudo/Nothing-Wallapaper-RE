package T3;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class y implements B.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7680a;

    private y(String str) {
        this.f7680a = str;
    }

    public static B.b a(String str) {
        return new y(str);
    }

    @Override // T3.B.b
    public Object apply(Object obj) {
        return B.U0(this.f7680a, (SQLiteDatabase) obj);
    }
}
