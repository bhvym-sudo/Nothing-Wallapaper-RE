package Q;

import androidx.collection.D;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f6521b = p190t.b.f27838t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p190t.b f6522a = new p190t.b(new h[16], 0);

    public boolean a(androidx.collection.r rVar, U.i iVar, e eVar, boolean z9) {
        p190t.b bVar = this.f6522a;
        int iP = bVar.p();
        if (iP <= 0) {
            return false;
        }
        Object[] objArrO = bVar.o();
        int i10 = 0;
        boolean z10 = false;
        do {
            z10 = ((h) objArrO[i10]).a(rVar, iVar, eVar, z9) || z10;
            i10++;
        } while (i10 < iP);
        return z10;
    }

    public void b(e eVar) {
        int iP = this.f6522a.p();
        while (true) {
            iP--;
            if (-1 >= iP) {
                return;
            }
            if (((h) this.f6522a.o()[iP]).l().g()) {
                this.f6522a.w(iP);
            }
        }
    }

    public final void c() {
        this.f6522a.j();
    }

    public void d() {
        p190t.b bVar = this.f6522a;
        int iP = bVar.p();
        if (iP > 0) {
            Object[] objArrO = bVar.o();
            int i10 = 0;
            do {
                ((h) objArrO[i10]).d();
                i10++;
            } while (i10 < iP);
        }
    }

    public boolean e(e eVar) {
        p190t.b bVar = this.f6522a;
        int iP = bVar.p();
        boolean z9 = false;
        if (iP > 0) {
            Object[] objArrO = bVar.o();
            int i10 = 0;
            boolean z10 = false;
            do {
                z10 = ((h) objArrO[i10]).e(eVar) || z10;
                i10++;
            } while (i10 < iP);
            z9 = z10;
        }
        b(eVar);
        return z9;
    }

    public boolean f(androidx.collection.r rVar, U.i iVar, e eVar, boolean z9) {
        p190t.b bVar = this.f6522a;
        int iP = bVar.p();
        if (iP <= 0) {
            return false;
        }
        Object[] objArrO = bVar.o();
        int i10 = 0;
        boolean z10 = false;
        do {
            z10 = ((h) objArrO[i10]).f(rVar, iVar, eVar, z9) || z10;
            i10++;
        } while (i10 < iP);
        return z10;
    }

    public final p190t.b g() {
        return this.f6522a;
    }

    public final void h() {
        int i10 = 0;
        while (i10 < this.f6522a.p()) {
            h hVar = (h) this.f6522a.o()[i10];
            if (hVar.k().Q()) {
                i10++;
                hVar.h();
            } else {
                hVar.d();
                this.f6522a.w(i10);
            }
        }
    }

    public void i(long j9, D d10) {
        p190t.b bVar = this.f6522a;
        int iP = bVar.p();
        if (iP > 0) {
            Object[] objArrO = bVar.o();
            int i10 = 0;
            do {
                ((h) objArrO[i10]).i(j9, d10);
                i10++;
            } while (i10 < iP);
        }
    }
}
