package p081i0;

import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.List;
import kotlin.jvm.internal.n;
import p031d0.k;
import p031d0.p;
import p031d0.q;
import p051f0.g;
import p051f0.m;
import p051f0.o;
import p091j0.b;
import p091j0.c;
import p101k0.h;
import p111l0.d;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    private static final void a(SpannableString spannableString, k kVar, int i10, int i11, d dVar, g.a aVar) {
        b.b(spannableString, kVar.g(), i10, i11);
        b.c(spannableString, kVar.j(), dVar, i10, i11);
        if (kVar.m() == null) {
            kVar.k();
        } else {
            o oVarM = kVar.m();
            if (oVarM == null) {
                oVarM = o.f20762r.a();
            }
            kVar.k();
            spannableString.setSpan(new StyleSpan(p051f0.d.c(oVarM, m.f20748a.b())), i10, i11, 33);
        }
        kVar.h();
        if (kVar.q() != null) {
            h hVarQ = kVar.q();
            h.a aVar2 = h.f22657b;
            if (hVarQ.c(aVar2.b())) {
                spannableString.setSpan(new UnderlineSpan(), i10, i11, 33);
            }
            if (kVar.q().c(aVar2.a())) {
                spannableString.setSpan(new StrikethroughSpan(), i10, i11, 33);
            }
        }
        if (kVar.r() != null) {
            spannableString.setSpan(new ScaleXSpan(kVar.r().a()), i10, i11, 33);
        }
        b.d(spannableString, kVar.o(), i10, i11);
        b.a(spannableString, kVar.d(), i10, i11);
    }

    public static final SpannableString b(p031d0.a aVar, d dVar, g.a aVar2, g gVar) {
        SpannableString spannableString = new SpannableString(aVar.h());
        List listG = aVar.g();
        if (listG != null) {
            int size = listG.size();
            for (int i10 = 0; i10 < size; i10++) {
                d0.a.b bVar = (d0.a.b) listG.get(i10);
                a(spannableString, k.b((k) bVar.a(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65503, null), bVar.b(), bVar.c(), dVar, aVar2);
            }
        }
        List listI = aVar.i(0, aVar.length());
        int size2 = listI.size();
        for (int i11 = 0; i11 < size2; i11++) {
            d0.a.b bVar2 = (d0.a.b) listI.get(i11);
            spannableString.setSpan(c.a((p) bVar2.a()), bVar2.b(), bVar2.c(), 33);
        }
        List listJ = aVar.j(0, aVar.length());
        int size3 = listJ.size();
        for (int i12 = 0; i12 < size3; i12++) {
            d0.a.b bVar3 = (d0.a.b) listJ.get(i12);
            spannableString.setSpan(gVar.c((q) bVar3.a()), bVar3.b(), bVar3.c(), 33);
        }
        List listD = aVar.d(0, aVar.length());
        int size4 = listD.size();
        for (int i13 = 0; i13 < size4; i13++) {
            d0.a.b bVar4 = (d0.a.b) listD.get(i13);
            if (bVar4.f() != bVar4.d()) {
                p031d0.d dVar2 = (p031d0.d) bVar4.e();
                if (dVar2 instanceof d0.d.b) {
                    dVar2.a();
                    spannableString.setSpan(gVar.b(c(bVar4)), bVar4.f(), bVar4.d(), 33);
                } else {
                    spannableString.setSpan(gVar.a(bVar4), bVar4.f(), bVar4.d(), 33);
                }
            }
        }
        return spannableString;
    }

    private static final d0.a.b c(d0.a.b bVar) {
        Object objE = bVar.e();
        n.f(objE, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
        return new d0.a.b((d0.d.b) objE, bVar.f(), bVar.d());
    }
}
