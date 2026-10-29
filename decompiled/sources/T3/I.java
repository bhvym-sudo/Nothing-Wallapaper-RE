package T3;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class I implements O3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p069g8.a f7639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p069g8.a f7640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p069g8.a f7641c;

    public I(p069g8.a aVar, p069g8.a aVar2, p069g8.a aVar3) {
        this.f7639a = aVar;
        this.f7640b = aVar2;
        this.f7641c = aVar3;
    }

    public static I a(p069g8.a aVar, p069g8.a aVar2, p069g8.a aVar3) {
        return new I(aVar, aVar2, aVar3);
    }

    public static H c(Context context, String str, int i10) {
        return new H(context, str, i10);
    }

    @Override // p069g8.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public H get() {
        return c((Context) this.f7639a.get(), (String) this.f7640b.get(), ((Integer) this.f7641c.get()).intValue());
    }
}
