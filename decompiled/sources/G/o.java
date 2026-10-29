package G;

import androidx.collection.E;
import androidx.collection.M;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E f1930a = M.d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p190t.b f1931b = new p190t.b(new p219v8.a[16], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f1932c;

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        this.f1932c = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        this.f1930a.h();
        int i10 = 0;
        this.f1932c = false;
        p190t.b bVar = this.f1931b;
        int iP = bVar.p();
        if (iP > 0) {
            Object[] objArrO = bVar.o();
            do {
                ((p219v8.a) objArrO[i10]).invoke();
                i10++;
            } while (i10 < iP);
        }
        this.f1931b.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:14:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0044 A[LOOP:0: B:5:0x000d->B:15:0x0044, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0047 A[EDGE_INSN: B:19:0x0047->B:16:0x0047 BREAK  A[LOOP:0: B:5:0x000d->B:15:0x0044], SYNTHETIC] */
    public final void h() {
        E e10 = this.f1930a;
        Object[] objArr = e10.f11282b;
        long[] jArr = e10.f11281a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j9 = jArr[i10];
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j9) < 128) {
                            ((androidx.compose.ui.focus.k) objArr[(i10 << 3) + i12]).l0();
                        }
                        j9 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    } else if (i10 != length) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        }
        this.f1930a.h();
        this.f1932c = false;
        this.f1931b.j();
    }

    public final m i(androidx.compose.ui.focus.k kVar) {
        return (m) this.f1930a.b(kVar);
    }

    public final void j(androidx.compose.ui.focus.k kVar, m mVar) {
        E e10 = this.f1930a;
        if (mVar != null) {
            e10.r(kVar, mVar);
        } else {
            T.a.c("requires a non-null focus state");
            throw new p079h8.f();
        }
    }
}
