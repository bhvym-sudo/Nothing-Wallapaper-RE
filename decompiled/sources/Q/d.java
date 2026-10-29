package Q;

import androidx.collection.D;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final U.i f6500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f6501b = new i();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.collection.z f6502c = new androidx.collection.z(10);

    public d(U.i iVar) {
        this.f6500a = iVar;
    }

    private final void f(long j9, D d10) {
        this.f6501b.i(j9, d10);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0080  */
    /* JADX WARN: Code duplicated, block: B:25:0x008a  */
    public final void a(long j9, List list, boolean z9) {
        androidx.collection.z zVar;
        Object objB;
        Object obj;
        i iVar = this.f6501b;
        this.f6502c.g();
        int size = list.size();
        boolean z10 = true;
        for (int i10 = 0; i10 < size; i10++) {
            C.c.AbstractC0022c abstractC0022c = (C.c.AbstractC0022c) list.get(i10);
            if (z10) {
                p190t.b bVarG = iVar.g();
                int iP = bVarG.p();
                if (iP <= 0) {
                    obj = null;
                    break;
                }
                Object[] objArrO = bVarG.o();
                int i11 = 0;
                while (true) {
                    obj = objArrO[i11];
                    if (kotlin.jvm.internal.n.d(((h) obj).k(), abstractC0022c)) {
                        break;
                    }
                    i11++;
                    if (i11 >= iP) {
                        obj = null;
                        break;
                    }
                }
                h hVar = (h) obj;
                if (hVar != null) {
                    hVar.n();
                    hVar.l().b(j9);
                    androidx.collection.z zVar2 = this.f6502c;
                    Object objB2 = zVar2.b(j9);
                    if (objB2 == null) {
                        objB2 = new D(0, 1, null);
                        zVar2.o(j9, objB2);
                    }
                    ((D) objB2).e(hVar);
                    iVar = hVar;
                } else {
                    z10 = false;
                    h hVar2 = new h(abstractC0022c);
                    hVar2.l().b(j9);
                    zVar = this.f6502c;
                    objB = zVar.b(j9);
                    if (objB == null) {
                        objB = new D(0, 1, null);
                        zVar.o(j9, objB);
                    }
                    ((D) objB).e(hVar2);
                    iVar.g().b(hVar2);
                    iVar = hVar2;
                }
            } else {
                h hVar3 = new h(abstractC0022c);
                hVar3.l().b(j9);
                zVar = this.f6502c;
                objB = zVar.b(j9);
                if (objB == null) {
                    objB = new D(0, 1, null);
                    zVar.o(j9, objB);
                }
                ((D) objB).e(hVar3);
                iVar.g().b(hVar3);
                iVar = hVar3;
            }
        }
        if (!z9) {
            return;
        }
        androidx.collection.z zVar3 = this.f6502c;
        long[] jArr = zVar3.f11343b;
        Object[] objArr = zVar3.f11344c;
        long[] jArr2 = zVar3.f11342a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            long j10 = jArr2[i12];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8 - ((~(i12 - length)) >>> 31);
                for (int i14 = 0; i14 < i13; i14++) {
                    if ((255 & j10) < 128) {
                        int i15 = (i12 << 3) + i14;
                        f(jArr[i15], (D) objArr[i15]);
                    }
                    j10 >>= 8;
                }
                if (i13 != 8) {
                    return;
                }
            }
            if (i12 == length) {
                return;
            } else {
                i12++;
            }
        }
    }

    public final void b() {
        this.f6501b.c();
    }

    public final boolean c(e eVar, boolean z9) {
        if (this.f6501b.a(eVar.b(), this.f6500a, eVar, z9)) {
            return this.f6501b.e(eVar) || this.f6501b.f(eVar.b(), this.f6500a, eVar, z9);
        }
        return false;
    }

    public final void d() {
        this.f6501b.d();
        b();
    }

    public final void e() {
        this.f6501b.h();
    }
}
