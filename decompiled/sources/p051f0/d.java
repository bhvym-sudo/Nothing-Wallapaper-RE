package p051f0;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final o a(o.a aVar) {
        return aVar.b();
    }

    public static final int b(boolean z9, boolean z10) {
        if (z10 && z9) {
            return 3;
        }
        if (z9) {
            return 1;
        }
        return z10 ? 2 : 0;
    }

    public static final int c(o oVar, int i10) {
        return b(oVar.compareTo(a(o.f20762r)) >= 0, m.d(i10, m.f20748a.a()));
    }
}
