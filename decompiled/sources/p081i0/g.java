package p081i0;

import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import java.util.WeakHashMap;
import p031d0.a;
import p031d0.d;
import p031d0.q;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakHashMap f21888a = new WeakHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakHashMap f21889b = new WeakHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakHashMap f21890c = new WeakHashMap();

    public final ClickableSpan a(a.b bVar) {
        WeakHashMap weakHashMap = this.f21890c;
        Object cVar = weakHashMap.get(bVar);
        if (cVar == null) {
            cVar = new c((d) bVar.e());
            weakHashMap.put(bVar, cVar);
        }
        return (ClickableSpan) cVar;
    }

    public final URLSpan b(a.b bVar) {
        WeakHashMap weakHashMap = this.f21889b;
        Object uRLSpan = weakHashMap.get(bVar);
        if (uRLSpan == null) {
            uRLSpan = new URLSpan(((d.b) bVar.e()).c());
            weakHashMap.put(bVar, uRLSpan);
        }
        return (URLSpan) uRLSpan;
    }

    public final URLSpan c(q qVar) {
        WeakHashMap weakHashMap = this.f21888a;
        Object uRLSpan = weakHashMap.get(qVar);
        if (uRLSpan == null) {
            uRLSpan = new URLSpan(qVar.a());
            weakHashMap.put(qVar, uRLSpan);
        }
        return (URLSpan) uRLSpan;
    }
}
