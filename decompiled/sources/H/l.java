package H;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static final k a(float f10, float f11, float f12, float f13, float f14, float f15) {
        long jA = b.a(f14, f15);
        return new k(f10, f11, f12, f13, jA, jA, jA, jA, null);
    }

    public static final k b(float f10, float f11, float f12, float f13, long j9) {
        return a(f10, f11, f12, f13, a.d(j9), a.e(j9));
    }

    public static final i c(k kVar) {
        return new i(kVar.e(), kVar.g(), kVar.f(), kVar.a());
    }

    public static final boolean d(k kVar) {
        return a.d(kVar.h()) == a.e(kVar.h()) && a.d(kVar.h()) == a.d(kVar.i()) && a.d(kVar.h()) == a.e(kVar.i()) && a.d(kVar.h()) == a.d(kVar.c()) && a.d(kVar.h()) == a.e(kVar.c()) && a.d(kVar.h()) == a.d(kVar.b()) && a.d(kVar.h()) == a.e(kVar.b());
    }
}
