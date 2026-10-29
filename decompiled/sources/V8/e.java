package V8;

import P8.D;
import P8.m;
import P8.u;
import P8.v;
import e9.C1350e;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.n;
import p089i8.N;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final e9.h f8235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e9.h f8236b;

    static {
        e9.h.a aVar = e9.h.f20267t;
        f8235a = aVar.c("\"\\");
        f8236b = aVar.c("\t ,=");
    }

    public static final List a(u uVar, String headerName) {
        n.h(uVar, "<this>");
        n.h(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = uVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (E8.i.B(headerName, uVar.b(i10), true)) {
                try {
                    c(new C1350e().d0(uVar.m(i10)), arrayList);
                } catch (EOFException e10) {
                    Z8.h.f9546a.g().j("Unable to parse challenge", 5, e10);
                }
            }
        }
        return arrayList;
    }

    public static final boolean b(D d10) {
        n.h(d10, "<this>");
        if (n.d(d10.t0().g(), "HEAD")) {
            return false;
        }
        int iJ = d10.j();
        return (((iJ >= 100 && iJ < 200) || iJ == 204 || iJ == 304) && Q8.d.v(d10) == -1 && !E8.i.B("chunked", D.G(d10, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0085  */
    /* JADX WARN: Code duplicated, block: B:35:0x0098  */
    /* JADX WARN: Code duplicated, block: B:36:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bc A[EDGE_INSN: B:59:0x00bc->B:48:0x00bc BREAK  A[LOOP:2: B:22:0x0073->B:47:0x00ba], SYNTHETIC] */
    private static final void c(C1350e c1350e, List list) throws EOFException {
        String strE;
        while (true) {
            String strE2 = null;
            while (true) {
                if (strE2 == null) {
                    g(c1350e);
                    strE2 = e(c1350e);
                    if (strE2 == null) {
                        return;
                    }
                }
                boolean zG = g(c1350e);
                String strE3 = e(c1350e);
                if (strE3 == null) {
                    if (c1350e.D()) {
                        list.add(new P8.h(strE2, N.g()));
                        return;
                    }
                    return;
                }
                int iK = Q8.d.K(c1350e, (byte) 61);
                boolean zG2 = g(c1350e);
                if (zG || !(zG2 || c1350e.D())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int iK2 = iK + Q8.d.K(c1350e, (byte) 61);
                    while (true) {
                        if (strE3 != null) {
                            if (iK2 != 0) {
                                break;
                                break;
                            }
                            if (iK2 <= 1) {
                                return;
                            }
                            if (h(c1350e, (byte) 34)) {
                                strE = d(c1350e);
                            } else {
                                strE = e(c1350e);
                            }
                            if (strE != null) {
                                return;
                            }
                            if (g(c1350e)) {
                            }
                            strE3 = null;
                        } else {
                            strE3 = e(c1350e);
                            if (!g(c1350e)) {
                                iK2 = Q8.d.K(c1350e, (byte) 61);
                                if (iK2 != 0) {
                                    break;
                                }
                                if (iK2 <= 1 || g(c1350e)) {
                                    return;
                                }
                                if (h(c1350e, (byte) 34)) {
                                    strE = d(c1350e);
                                } else {
                                    strE = e(c1350e);
                                }
                                if (strE != null || ((String) linkedHashMap.put(strE3, strE)) != null) {
                                    return;
                                }
                                if (g(c1350e) && !c1350e.D()) {
                                    return;
                                } else {
                                    strE3 = null;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    list.add(new P8.h(strE2, linkedHashMap));
                    strE2 = strE3;
                } else {
                    Map mapSingletonMap = Collections.singletonMap(null, strE3 + E8.i.E("=", iK));
                    n.g(mapSingletonMap, "singletonMap<String, Str…ek + \"=\".repeat(eqCount))");
                    list.add(new P8.h(strE2, mapSingletonMap));
                }
            }
        }
    }

    private static final String d(C1350e c1350e) throws EOFException {
        if (c1350e.readByte() != 34) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        C1350e c1350e2 = new C1350e();
        while (true) {
            long jM0 = c1350e.m0(f8235a);
            if (jM0 == -1) {
                return null;
            }
            if (c1350e.U(jM0) == 34) {
                c1350e2.Z(c1350e, jM0);
                c1350e.readByte();
                return c1350e2.P0();
            }
            if (c1350e.X0() == jM0 + 1) {
                return null;
            }
            c1350e2.Z(c1350e, jM0);
            c1350e.readByte();
            c1350e2.Z(c1350e, 1L);
        }
    }

    private static final String e(C1350e c1350e) {
        long jM0 = c1350e.m0(f8236b);
        if (jM0 == -1) {
            jM0 = c1350e.X0();
        }
        if (jM0 != 0) {
            return c1350e.T0(jM0);
        }
        return null;
    }

    public static final void f(P8.n nVar, v url, u headers) {
        n.h(nVar, "<this>");
        n.h(url, "url");
        n.h(headers, "headers");
        if (nVar == P8.n.f6347b) {
            return;
        }
        List listE = m.f6332j.e(url, headers);
        if (listE.isEmpty()) {
            return;
        }
        nVar.a(url, listE);
    }

    private static final boolean g(C1350e c1350e) throws EOFException {
        boolean z9 = false;
        while (!c1350e.D()) {
            byte bU = c1350e.U(0L);
            if (bU == 44) {
                c1350e.readByte();
                z9 = true;
            } else {
                if (bU != 32 && bU != 9) {
                    break;
                }
                c1350e.readByte();
            }
        }
        return z9;
    }

    private static final boolean h(C1350e c1350e, byte b10) {
        return !c1350e.D() && c1350e.U(0L) == b10;
    }
}
