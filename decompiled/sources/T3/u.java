package T3;

import android.database.Cursor;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class u implements B.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final u f7674a = new u();

    private u() {
    }

    public static B.b a() {
        return f7674a;
    }

    @Override // T3.B.b
    public Object apply(Object obj) {
        return Boolean.valueOf(((Cursor) obj).moveToNext());
    }
}
