package X;

import C0.d;
import H.g;
import H.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import p011b0.j;
import p011b0.m;
import p089i8.AbstractC1444s;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: X.a$a, reason: collision with other inner class name */
    static final class C0314a extends o implements p219v8.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final C0314a f8925r = new C0314a();

        C0314a() {
            super(0);
        }

        @Override // p219v8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    private static final boolean a(List list) {
        List listL;
        long jS;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() == 0 || list.size() == 1) {
            listL = AbstractC1444s.l();
        } else {
            listL = new ArrayList();
            Object obj = list.get(0);
            int iM = AbstractC1444s.m(list);
            int i10 = 0;
            while (i10 < iM) {
                i10++;
                Object obj2 = list.get(i10);
                j jVar = (j) obj2;
                j jVar2 = (j) obj;
                listL.add(g.d(h.a(Math.abs(g.k(jVar2.i().d()) - g.k(jVar.i().d())), Math.abs(g.l(jVar2.i().d()) - g.l(jVar.i().d())))));
                obj = obj2;
            }
        }
        if (listL.size() == 1) {
            jS = ((g) AbstractC1444s.S(listL)).s();
        } else {
            if (listL.isEmpty()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object objS = AbstractC1444s.S(listL);
            int iM2 = AbstractC1444s.m(listL);
            if (1 <= iM2) {
                int i11 = 1;
                while (true) {
                    objS = g.d(g.p(((g) objS).s(), ((g) listL.get(i11)).s()));
                    if (i11 == iM2) {
                        break;
                    }
                    i11++;
                }
            }
            jS = ((g) objS).s();
        }
        return g.l(jS) < g.k(jS);
    }

    public static final void b(j jVar, d dVar) {
        p011b0.g gVarN = jVar.n();
        m mVar = m.f14629a;
        androidx.appcompat.app.o.a(p011b0.h.a(gVarN, mVar.a()));
        ArrayList arrayList = new ArrayList();
        if (p011b0.h.a(jVar.n(), mVar.w()) != null) {
            List listT = jVar.t();
            int size = listT.size();
            for (int i10 = 0; i10 < size; i10++) {
                j jVar2 = (j) listT.get(i10);
                if (jVar2.n().b(m.f14629a.x())) {
                    arrayList.add(jVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean zA = a(arrayList);
        dVar.i0(d.e.a(zA ? 1 : arrayList.size(), zA ? arrayList.size() : 1, false, 0));
    }

    public static final void c(j jVar, d dVar) {
        p011b0.g gVarN = jVar.n();
        m mVar = m.f14629a;
        androidx.appcompat.app.o.a(p011b0.h.a(gVarN, mVar.b()));
        j jVarR = jVar.r();
        if (jVarR == null || p011b0.h.a(jVarR.n(), mVar.w()) == null) {
            return;
        }
        androidx.appcompat.app.o.a(p011b0.h.a(jVarR.n(), mVar.a()));
        if (jVar.n().b(mVar.x())) {
            ArrayList arrayList = new ArrayList();
            List listT = jVarR.t();
            int size = listT.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                j jVar2 = (j) listT.get(i11);
                if (jVar2.n().b(m.f14629a.x())) {
                    arrayList.add(jVar2);
                    if (jVar2.q().Z() < jVar.q().Z()) {
                        i10++;
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            boolean zA = a(arrayList);
            d.f fVarA = d.f.a(zA ? 0 : i10, 1, zA ? i10 : 0, 1, false, ((Boolean) jVar.n().n(m.f14629a.x(), C0314a.f8925r)).booleanValue());
            if (fVarA != null) {
                dVar.j0(fVarA);
            }
        }
    }
}
