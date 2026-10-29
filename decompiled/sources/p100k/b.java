package p100k;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.collection.P;

/* JADX INFO: loaded from: classes.dex */
abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f22604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private P f22605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private P f22606c;

    b(Context context) {
        this.f22604a = context;
    }

    final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof p211v0.b)) {
            return menuItem;
        }
        p211v0.b bVar = (p211v0.b) menuItem;
        if (this.f22605b == null) {
            this.f22605b = new P();
        }
        MenuItem menuItem2 = (MenuItem) this.f22605b.get(bVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        c cVar = new c(this.f22604a, bVar);
        this.f22605b.put(bVar, cVar);
        return cVar;
    }

    final SubMenu d(SubMenu subMenu) {
        return subMenu;
    }

    final void e() {
        P p9 = this.f22605b;
        if (p9 != null) {
            p9.clear();
        }
        P p10 = this.f22606c;
        if (p10 != null) {
            p10.clear();
        }
    }

    final void f(int i10) {
        if (this.f22605b == null) {
            return;
        }
        int i11 = 0;
        while (i11 < this.f22605b.size()) {
            if (((p211v0.b) this.f22605b.keyAt(i11)).getGroupId() == i10) {
                this.f22605b.removeAt(i11);
                i11--;
            }
            i11++;
        }
    }

    final void g(int i10) {
        if (this.f22605b == null) {
            return;
        }
        for (int i11 = 0; i11 < this.f22605b.size(); i11++) {
            if (((p211v0.b) this.f22605b.keyAt(i11)).getItemId() == i10) {
                this.f22605b.removeAt(i11);
                return;
            }
        }
    }
}
