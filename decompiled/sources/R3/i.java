package R3;

import S3.p;
import T3.InterfaceC0949c;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class i implements O3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p069g8.a f7092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p069g8.a f7093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p069g8.a f7094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p069g8.a f7095d;

    public i(p069g8.a aVar, p069g8.a aVar2, p069g8.a aVar3, p069g8.a aVar4) {
        this.f7092a = aVar;
        this.f7093b = aVar2;
        this.f7094c = aVar3;
        this.f7095d = aVar4;
    }

    public static i a(p069g8.a aVar, p069g8.a aVar2, p069g8.a aVar3, p069g8.a aVar4) {
        return new i(aVar, aVar2, aVar3, aVar4);
    }

    public static p c(Context context, InterfaceC0949c interfaceC0949c, S3.d dVar, V3.a aVar) {
        return (p) O3.d.c(h.a(context, interfaceC0949c, dVar, aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // p069g8.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p get() {
        return c((Context) this.f7092a.get(), (InterfaceC0949c) this.f7093b.get(), (S3.d) this.f7094c.get(), (V3.a) this.f7095d.get());
    }
}
