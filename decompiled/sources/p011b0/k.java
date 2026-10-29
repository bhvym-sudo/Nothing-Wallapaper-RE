package p011b0;

import C.c;
import W.AbstractC0967i;
import W.B;
import W.S;
import W.W;
import W.m0;
import com.airbnb.lottie.utils.Utils;
import kotlin.jvm.internal.n;
import p219v8.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    /* JADX WARN: Code duplicated, block: B:16:0x0037 A[LOOP:0: B:5:0x0016->B:16:0x0037, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[EDGE_INSN: B:21:0x003c->B:17:0x003c BREAK  A[LOOP:0: B:5:0x0016->B:16:0x0037], SYNTHETIC] */
    public static final j a(B b10, boolean z9) {
        S sV = b10.V();
        int iA = W.a(8);
        Object obj = null;
        if ((sV.i() & iA) != 0) {
            loop0: for (c.AbstractC0022c abstractC0022cK = sV.k(); abstractC0022cK != null; abstractC0022cK = abstractC0022cK.I()) {
                if ((abstractC0022cK.L() & iA) == 0) {
                    if ((abstractC0022cK.H() & iA) != 0) {
                        break;
                        break;
                    }
                } else {
                    for (c.AbstractC0022c abstractC0022cF = abstractC0022cK; abstractC0022cF != null; abstractC0022cF = AbstractC0967i.f(null)) {
                        if (abstractC0022cF instanceof m0) {
                            obj = abstractC0022cF;
                            break loop0;
                        }
                        abstractC0022cF.L();
                    }
                    if ((abstractC0022cK.H() & iA) != 0) {
                        break;
                    }
                }
            }
        }
        n.e(obj);
        c.AbstractC0022c abstractC0022cZ = ((m0) obj).z();
        g gVarY = b10.y();
        n.e(gVarY);
        return new j(abstractC0022cZ, z9, b10, gVarY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(j jVar) {
        return jVar.o() + 2000000000;
    }

    public static final B f(B b10, l lVar) {
        for (B bY = b10.Y(); bY != null; bY = bY.Y()) {
            if (((Boolean) lVar.f(bY)).booleanValue()) {
                return bY;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0040 A[LOOP:0: B:5:0x0016->B:19:0x0040, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0045 A[EDGE_INSN: B:24:0x0045->B:20:0x0045 BREAK  A[LOOP:0: B:5:0x0016->B:19:0x0040], SYNTHETIC] */
    public static final m0 g(B b10) {
        S sV = b10.V();
        int iA = W.a(8);
        Object obj = null;
        if ((sV.i() & iA) != 0) {
            loop0: for (c.AbstractC0022c abstractC0022cK = sV.k(); abstractC0022cK != null; abstractC0022cK = abstractC0022cK.I()) {
                if ((abstractC0022cK.L() & iA) == 0) {
                    if ((abstractC0022cK.H() & iA) != 0) {
                        break;
                        break;
                    }
                } else {
                    for (c.AbstractC0022c abstractC0022cF = abstractC0022cK; abstractC0022cF != null; abstractC0022cF = AbstractC0967i.f(null)) {
                        if (abstractC0022cF instanceof m0) {
                            if (((m0) abstractC0022cF).E()) {
                                obj = abstractC0022cF;
                                break loop0;
                            }
                        } else {
                            abstractC0022cF.L();
                        }
                    }
                    if ((abstractC0022cK.H() & iA) != 0) {
                        break;
                    }
                }
            }
        }
        return (m0) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d h(j jVar) {
        return (d) h.a(jVar.w(), m.f14629a.v());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(j jVar) {
        return jVar.o() + Utils.SECOND_IN_NANOS;
    }
}
