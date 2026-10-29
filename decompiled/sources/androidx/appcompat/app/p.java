package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.N;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.u;
import androidx.core.view.H;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class p extends androidx.appcompat.app.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final u f10233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Window.Callback f10234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final h.f f10235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f10236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f10237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f10238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList f10239g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Runnable f10240h = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Toolbar.h f10241i;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.y();
        }
    }

    class b implements Toolbar.h {
        b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.h
        public boolean onMenuItemClick(MenuItem menuItem) {
            return p.this.f10234b.onMenuItemSelected(0, menuItem);
        }
    }

    private final class c implements androidx.appcompat.view.menu.j.a {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private boolean f10244q;

        c() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void c(androidx.appcompat.view.menu.e eVar, boolean z9) {
            if (this.f10244q) {
                return;
            }
            this.f10244q = true;
            p.this.f10233a.h();
            p.this.f10234b.onPanelClosed(108, eVar);
            this.f10244q = false;
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean d(androidx.appcompat.view.menu.e eVar) {
            p.this.f10234b.onMenuOpened(108, eVar);
            return true;
        }
    }

    private final class d implements androidx.appcompat.view.menu.e.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (p.this.f10233a.b()) {
                p.this.f10234b.onPanelClosed(108, eVar);
            } else if (p.this.f10234b.onPreparePanel(0, null, eVar)) {
                p.this.f10234b.onMenuOpened(108, eVar);
            }
        }
    }

    private class e implements h.f {
        e() {
        }

        @Override // androidx.appcompat.app.h.f
        public boolean a(int i10) {
            if (i10 != 0) {
                return false;
            }
            p pVar = p.this;
            if (pVar.f10236d) {
                return false;
            }
            pVar.f10233a.c();
            p.this.f10236d = true;
            return false;
        }

        @Override // androidx.appcompat.app.h.f
        public View onCreatePanelView(int i10) {
            if (i10 == 0) {
                return new View(p.this.f10233a.getContext());
            }
            return null;
        }
    }

    p(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.f10241i = bVar;
        B0.i.e(toolbar);
        N n9 = new N(toolbar, false);
        this.f10233a = n9;
        this.f10234b = (Window.Callback) B0.i.e(callback);
        n9.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        n9.setWindowTitle(charSequence);
        this.f10235c = new e();
    }

    private Menu x() {
        if (!this.f10237e) {
            this.f10233a.p(new c(), new d());
            this.f10237e = true;
        }
        return this.f10233a.l();
    }

    @Override // androidx.appcompat.app.a
    public boolean g() {
        return this.f10233a.f();
    }

    @Override // androidx.appcompat.app.a
    public boolean h() {
        if (!this.f10233a.j()) {
            return false;
        }
        this.f10233a.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void i(boolean z9) {
        if (z9 == this.f10238f) {
            return;
        }
        this.f10238f = z9;
        if (this.f10239g.size() <= 0) {
            return;
        }
        o.a(this.f10239g.get(0));
        throw null;
    }

    @Override // androidx.appcompat.app.a
    public int j() {
        return this.f10233a.t();
    }

    @Override // androidx.appcompat.app.a
    public Context k() {
        return this.f10233a.getContext();
    }

    @Override // androidx.appcompat.app.a
    public boolean l() {
        this.f10233a.r().removeCallbacks(this.f10240h);
        H.Y(this.f10233a.r(), this.f10240h);
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void m(Configuration configuration) {
        super.m(configuration);
    }

    @Override // androidx.appcompat.app.a
    void n() {
        this.f10233a.r().removeCallbacks(this.f10240h);
    }

    @Override // androidx.appcompat.app.a
    public boolean o(int i10, KeyEvent keyEvent) {
        Menu menuX = x();
        if (menuX == null) {
            return false;
        }
        menuX.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuX.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.a
    public boolean p(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            q();
        }
        return true;
    }

    @Override // androidx.appcompat.app.a
    public boolean q() {
        return this.f10233a.g();
    }

    @Override // androidx.appcompat.app.a
    public void r(boolean z9) {
    }

    @Override // androidx.appcompat.app.a
    public void s(boolean z9) {
        z(z9 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.a
    public void t(boolean z9) {
    }

    @Override // androidx.appcompat.app.a
    public void u(CharSequence charSequence) {
        this.f10233a.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void v(CharSequence charSequence) {
        this.f10233a.setWindowTitle(charSequence);
    }

    void y() {
        Menu menuX = x();
        androidx.appcompat.view.menu.e eVar = menuX instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menuX : null;
        if (eVar != null) {
            eVar.e0();
        }
        try {
            menuX.clear();
            if (!this.f10234b.onCreatePanelMenu(0, menuX) || !this.f10234b.onPreparePanel(0, null, menuX)) {
                menuX.clear();
            }
        } finally {
            if (eVar != null) {
                eVar.d0();
            }
        }
    }

    public void z(int i10, int i11) {
        this.f10233a.k((i10 & i11) | ((~i11) & this.f10233a.t()));
    }
}
