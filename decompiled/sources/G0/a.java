package G0;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.K;
import androidx.core.view.L;
import java.util.Iterator;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f1933a = c.f1937b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f1934b = c.f1936a;

    public static final void a(View view) {
        n.h(view, "<this>");
        Iterator it = L.a(view).iterator();
        while (it.hasNext()) {
            c((View) it.next()).a();
        }
    }

    public static final void b(ViewGroup viewGroup) {
        n.h(viewGroup, "<this>");
        Iterator it = K.b(viewGroup).iterator();
        while (it.hasNext()) {
            c((View) it.next()).a();
        }
    }

    private static final b c(View view) {
        int i10 = f1933a;
        b bVar = (b) view.getTag(i10);
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        view.setTag(i10, bVar2);
        return bVar2;
    }

    public static final void d(View view, boolean z9) {
        n.h(view, "<this>");
        view.setTag(f1934b, Boolean.valueOf(z9));
    }
}
