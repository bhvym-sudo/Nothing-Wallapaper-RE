package N3;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class l implements O3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p069g8.a f5233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p069g8.a f5234b;

    public l(p069g8.a aVar, p069g8.a aVar2) {
        this.f5233a = aVar;
        this.f5234b = aVar2;
    }

    public static l a(p069g8.a aVar, p069g8.a aVar2) {
        return new l(aVar, aVar2);
    }

    public static k c(Context context, Object obj) {
        return new k(context, (i) obj);
    }

    @Override // p069g8.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k get() {
        return c((Context) this.f5233a.get(), this.f5234b.get());
    }
}
