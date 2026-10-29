package p091j0;

import I.t;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import p071h0.e;
import p111l0.d;
import p111l0.u;
import p111l0.w;
import p239x8.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final void a(Spannable spannable, long j9, int i10, int i11) {
        if (j9 != 16) {
            e(spannable, new BackgroundColorSpan(t.d(j9)), i10, i11);
        }
    }

    public static final void b(Spannable spannable, long j9, int i10, int i11) {
        if (j9 != 16) {
            e(spannable, new ForegroundColorSpan(t.d(j9)), i10, i11);
        }
    }

    public static final void c(Spannable spannable, long j9, d dVar, int i10, int i11) {
        long jG = u.g(j9);
        w.a aVar = w.f22847b;
        if (w.g(jG, aVar.b())) {
            e(spannable, new AbsoluteSizeSpan(a.b(dVar.L(j9)), false), i10, i11);
        } else if (w.g(jG, aVar.a())) {
            e(spannable, new RelativeSizeSpan(u.h(j9)), i10, i11);
        }
    }

    public static final void d(Spannable spannable, e eVar, int i10, int i11) {
        if (eVar != null) {
            e(spannable, a.f22278a.a(eVar), i10, i11);
        }
    }

    public static final void e(Spannable spannable, Object obj, int i10, int i11) {
        spannable.setSpan(obj, i10, i11, 33);
    }
}
