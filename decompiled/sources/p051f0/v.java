package p051f0;

import android.graphics.Typeface;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
final class v implements u {
    private final Typeface b(String str, o oVar, int i10) {
        m.a aVar = m.f20748a;
        if (m.d(i10, aVar.b()) && n.d(oVar, o.f20762r.a()) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), oVar.g(), m.d(i10, aVar.a()));
    }

    @Override // p051f0.u
    public Typeface a(o oVar, int i10) {
        return b(null, oVar, i10);
    }
}
