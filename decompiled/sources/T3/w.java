package T3;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class w implements B.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B f7676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final M3.m f7677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final M3.h f7678c;

    private w(B b10, M3.m mVar, M3.h hVar) {
        this.f7676a = b10;
        this.f7677b = mVar;
        this.f7678c = hVar;
    }

    public static B.b a(B b10, M3.m mVar, M3.h hVar) {
        return new w(b10, mVar, hVar);
    }

    @Override // T3.B.b
    public Object apply(Object obj) {
        return B.P0(this.f7676a, this.f7677b, this.f7678c, (SQLiteDatabase) obj);
    }
}
