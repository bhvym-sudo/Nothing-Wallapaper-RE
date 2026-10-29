package T3;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class j implements B.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f7659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final M3.m f7660b;

    private j(long j9, M3.m mVar) {
        this.f7659a = j9;
        this.f7660b = mVar;
    }

    public static B.b a(long j9, M3.m mVar) {
        return new j(j9, mVar);
    }

    @Override // T3.B.b
    public Object apply(Object obj) {
        return B.W0(this.f7659a, this.f7660b, (SQLiteDatabase) obj);
    }
}
