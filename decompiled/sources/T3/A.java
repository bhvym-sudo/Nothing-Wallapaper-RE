package T3;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class A implements B.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B f7614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final M3.m f7615b;

    private A(B b10, M3.m mVar) {
        this.f7614a = b10;
        this.f7615b = mVar;
    }

    public static B.b a(B b10, M3.m mVar) {
        return new A(b10, mVar);
    }

    @Override // T3.B.b
    public Object apply(Object obj) {
        return B.t0(this.f7614a, this.f7615b, (SQLiteDatabase) obj);
    }
}
