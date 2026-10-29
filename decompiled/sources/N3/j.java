package N3;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class j implements O3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p069g8.a f5225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p069g8.a f5226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p069g8.a f5227c;

    public j(p069g8.a aVar, p069g8.a aVar2, p069g8.a aVar3) {
        this.f5225a = aVar;
        this.f5226b = aVar2;
        this.f5227c = aVar3;
    }

    public static j a(p069g8.a aVar, p069g8.a aVar2, p069g8.a aVar3) {
        return new j(aVar, aVar2, aVar3);
    }

    public static i c(Context context, V3.a aVar, V3.a aVar2) {
        return new i(context, aVar, aVar2);
    }

    @Override // p069g8.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c((Context) this.f5225a.get(), (V3.a) this.f5226b.get(), (V3.a) this.f5227c.get());
    }
}
