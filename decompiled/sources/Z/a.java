package Z;

import androidx.appcompat.app.o;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f9381a = new HashMap();

    public final void a() {
        this.f9381a.clear();
    }

    public final void b(int i10) {
        Iterator it = this.f9381a.entrySet().iterator();
        while (it.hasNext()) {
            o.a(((WeakReference) ((Map.Entry) it.next()).getValue()).get());
            it.remove();
        }
    }
}
