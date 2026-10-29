package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: androidx.core.view.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1082n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f12262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f12263b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f12264c = new HashMap();

    public C1082n(Runnable runnable) {
        this.f12262a = runnable;
    }

    public void a(InterfaceC1084p interfaceC1084p) {
        this.f12263b.add(interfaceC1084p);
        this.f12262a.run();
    }

    public void b(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.f12263b.iterator();
        while (it.hasNext()) {
            ((InterfaceC1084p) it.next()).c(menu, menuInflater);
        }
    }

    public void c(Menu menu) {
        Iterator it = this.f12263b.iterator();
        while (it.hasNext()) {
            ((InterfaceC1084p) it.next()).b(menu);
        }
    }

    public boolean d(MenuItem menuItem) {
        Iterator it = this.f12263b.iterator();
        while (it.hasNext()) {
            if (((InterfaceC1084p) it.next()).a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void e(Menu menu) {
        Iterator it = this.f12263b.iterator();
        while (it.hasNext()) {
            ((InterfaceC1084p) it.next()).d(menu);
        }
    }

    public void f(InterfaceC1084p interfaceC1084p) {
        this.f12263b.remove(interfaceC1084p);
        androidx.appcompat.app.o.a(this.f12264c.remove(interfaceC1084p));
        this.f12262a.run();
    }
}
