package androidx.compose.ui.platform;

import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import androidx.collection.AbstractC1031k;
import androidx.collection.AbstractC1032l;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final H.i f11915a = new H.i(0.0f, 0.0f, 10.0f, 10.0f);

    public static final g0 a(List list, int i10) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((g0) list.get(i11)).d() == i10) {
                return (g0) list.get(i11);
            }
        }
        return null;
    }

    public static final AbstractC1031k b(p011b0.l lVar) {
        p011b0.j jVarA = lVar.a();
        androidx.collection.x xVarB = AbstractC1032l.b();
        if (jVarA.q().c() && jVarA.q().t0()) {
            H.i iVarI = jVarA.i();
            c(new Region(Math.round(iVarI.f()), Math.round(iVarI.i()), Math.round(iVarI.g()), Math.round(iVarI.c())), jVarA, xVarB, jVarA, new Region());
        }
        return xVarB;
    }

    private static final void c(Region region, p011b0.j jVar, androidx.collection.x xVar, p011b0.j jVar2, Region region2) {
        U.k kVarP;
        boolean z9 = (jVar2.q().c() && jVar2.q().t0()) ? false : true;
        if (!region.isEmpty() || jVar2.o() == jVar.o()) {
            if (!z9 || jVar2.x()) {
                H.i iVarV = jVar2.v();
                int iRound = Math.round(iVarV.f());
                int iRound2 = Math.round(iVarV.i());
                int iRound3 = Math.round(iVarV.g());
                int iRound4 = Math.round(iVarV.c());
                region2.set(iRound, iRound2, iRound3, iRound4);
                int iO = jVar2.o() == jVar.o() ? -1 : jVar2.o();
                if (!region2.op(region, Region.Op.INTERSECT)) {
                    if (jVar2.x()) {
                        p011b0.j jVarR = jVar2.r();
                        H.i iVarI = (jVarR == null || (kVarP = jVarR.p()) == null || !kVarP.c()) ? f11915a : jVarR.i();
                        xVar.s(iO, new i0(jVar2, new Rect(Math.round(iVarI.f()), Math.round(iVarI.i()), Math.round(iVarI.g()), Math.round(iVarI.c()))));
                        return;
                    } else {
                        if (iO == -1) {
                            xVar.s(iO, new i0(jVar2, region2.getBounds()));
                            return;
                        }
                        return;
                    }
                }
                xVar.s(iO, new i0(jVar2, region2.getBounds()));
                List listT = jVar2.t();
                for (int size = listT.size() - 1; -1 < size; size--) {
                    c(region, jVar, xVar, (p011b0.j) listT.get(size), region2);
                }
                if (f(jVar2)) {
                    region.op(iRound, iRound2, iRound3, iRound4, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static final Float d(p011b0.g gVar) {
        p219v8.l lVar;
        ArrayList arrayList = new ArrayList();
        p011b0.a aVar = (p011b0.a) p011b0.h.a(gVar, p011b0.f.f14572a.h());
        if (aVar == null || (lVar = (p219v8.l) aVar.a()) == null || !((Boolean) lVar.f(arrayList)).booleanValue()) {
            return null;
        }
        return (Float) arrayList.get(0);
    }

    public static final p031d0.l e(p011b0.g gVar) {
        p219v8.l lVar;
        ArrayList arrayList = new ArrayList();
        p011b0.a aVar = (p011b0.a) p011b0.h.a(gVar, p011b0.f.f14572a.i());
        if (aVar != null && (lVar = (p219v8.l) aVar.a()) != null && ((Boolean) lVar.f(arrayList)).booleanValue()) {
            androidx.appcompat.app.o.a(arrayList.get(0));
        }
        return null;
    }

    public static final boolean f(p011b0.j jVar) {
        if (g(jVar)) {
            return jVar.w().q() || jVar.w().f();
        }
        return false;
    }

    public static final boolean g(p011b0.j jVar) {
        return (jVar.z() || jVar.w().b(p011b0.m.f14629a.m())) ? false : true;
    }

    public static final View h(AndroidViewsHandler androidViewsHandler, int i10) {
        Object next;
        Iterator<T> it = androidViewsHandler.getLayoutNodeToHolder().entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((W.B) ((Map.Entry) next).getKey()).a0() != i10);
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (AndroidViewHolder) entry.getValue();
        }
        return null;
    }

    public static final String i(int i10) {
        b0.d.a aVar = p011b0.d.f14558b;
        if (p011b0.d.k(i10, aVar.a())) {
            return "android.widget.Button";
        }
        if (p011b0.d.k(i10, aVar.b())) {
            return "android.widget.CheckBox";
        }
        if (p011b0.d.k(i10, aVar.e())) {
            return "android.widget.RadioButton";
        }
        if (p011b0.d.k(i10, aVar.d())) {
            return "android.widget.ImageView";
        }
        if (p011b0.d.k(i10, aVar.c())) {
            return "android.widget.Spinner";
        }
        return null;
    }
}
