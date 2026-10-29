package T3;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class k implements B.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B f7661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final M3.m f7662b;

    private k(B b10, M3.m mVar) {
        this.f7661a = b10;
        this.f7662b = mVar;
    }

    public static B.b a(B b10, M3.m mVar) {
        return new k(b10, mVar);
    }

    @Override // T3.B.b
    public Object apply(Object obj) {
        return B.B0(this.f7661a, this.f7662b, (SQLiteDatabase) obj);
    }
}
