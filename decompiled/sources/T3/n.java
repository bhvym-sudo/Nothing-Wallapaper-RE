package T3;

import android.database.Cursor;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class n implements B.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final B f7665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f7666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final M3.m f7667c;

    private n(B b10, List list, M3.m mVar) {
        this.f7665a = b10;
        this.f7666b = list;
        this.f7667c = mVar;
    }

    public static B.b a(B b10, List list, M3.m mVar) {
        return new n(b10, list, mVar);
    }

    @Override // T3.B.b
    public Object apply(Object obj) {
        return B.I0(this.f7665a, this.f7666b, this.f7667c, (Cursor) obj);
    }
}
