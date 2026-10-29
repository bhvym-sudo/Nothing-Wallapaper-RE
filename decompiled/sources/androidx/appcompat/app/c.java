package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.P;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.AbstractActivityC1136v;
import androidx.lifecycle.g0;
import androidx.lifecycle.h0;
import p010b.z;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends AbstractActivityC1136v implements d, q0.r.a {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private f f10097R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private Resources f10098S;

    class a implements i1.d.c {
        a() {
        }

        @Override // i1.d.c
        public Bundle saveState() {
            Bundle bundle = new Bundle();
            c.this.u0().z(bundle);
            return bundle;
        }
    }

    class b implements p020c.b {
        b() {
        }

        @Override // p020c.b
        public void a(Context context) {
            f fVarU0 = c.this.u0();
            fVarU0.r();
            fVarU0.v(c.this.getSavedStateRegistry().b("androidx:appcompat"));
        }
    }

    public c() {
        w0();
    }

    private boolean E0(KeyEvent keyEvent) {
        return false;
    }

    private void w0() {
        getSavedStateRegistry().h("androidx:appcompat", new a());
        a0(new b());
    }

    private void x0() {
        g0.b(getWindow().getDecorView(), this);
        h0.a(getWindow().getDecorView(), this);
        p082i1.g.b(getWindow().getDecorView(), this);
        z.a(getWindow().getDecorView(), this);
    }

    protected void A0(int i10) {
    }

    public void B0(p161q0.r rVar) {
    }

    public void C0() {
    }

    public boolean D0() {
        Intent intentP = p();
        if (intentP == null) {
            return false;
        }
        if (!H0(intentP)) {
            G0(intentP);
            return true;
        }
        p161q0.r rVarF = p161q0.r.f(this);
        y0(rVarF);
        B0(rVarF);
        rVarF.g();
        try {
            p161q0.a.h(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    public void F0(Toolbar toolbar) {
        u0().J(toolbar);
    }

    public void G0(Intent intent) {
        p161q0.h.e(this, intent);
    }

    public boolean H0(Intent intent) {
        return p161q0.h.f(this, intent);
    }

    @Override // p010b.j, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        x0();
        u0().e(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(u0().g(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        androidx.appcompat.app.a aVarV0 = v0();
        if (getWindow().hasFeature(0)) {
            if (aVarV0 == null || !aVarV0.g()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // p161q0.f, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        androidx.appcompat.app.a aVarV0 = v0();
        if (keyCode == 82 && aVarV0 != null && aVarV0.p(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public View findViewById(int i10) {
        return u0().j(i10);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return u0().p();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f10098S == null && P.c()) {
            this.f10098S = new P(this, super.getResources());
        }
        Resources resources = this.f10098S;
        return resources == null ? super.getResources() : resources;
    }

    @Override // androidx.appcompat.app.d
    public void h(androidx.appcompat.view.b bVar) {
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        u0().s();
    }

    @Override // androidx.appcompat.app.d
    public void j(androidx.appcompat.view.b bVar) {
    }

    @Override // p010b.j, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        u0().u(configuration);
        if (this.f10098S != null) {
            this.f10098S.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        C0();
    }

    @Override // androidx.fragment.app.AbstractActivityC1136v, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        u0().w();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (E0(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // androidx.fragment.app.AbstractActivityC1136v, p010b.j, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        androidx.appcompat.app.a aVarV0 = v0();
        if (menuItem.getItemId() != 16908332 || aVarV0 == null || (aVarV0.j() & 4) == 0) {
            return false;
        }
        return D0();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    @Override // p010b.j, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        u0().x(bundle);
    }

    @Override // androidx.fragment.app.AbstractActivityC1136v, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        u0().y();
    }

    @Override // androidx.fragment.app.AbstractActivityC1136v, android.app.Activity
    protected void onStart() {
        super.onStart();
        u0().A();
    }

    @Override // androidx.fragment.app.AbstractActivityC1136v, android.app.Activity
    protected void onStop() {
        super.onStop();
        u0().B();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        u0().L(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        androidx.appcompat.app.a aVarV0 = v0();
        if (getWindow().hasFeature(0)) {
            if (aVarV0 == null || !aVarV0.q()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // q0.r.a
    public Intent p() {
        return p161q0.h.a(this);
    }

    @Override // p010b.j, android.app.Activity
    public void setContentView(int i10) {
        x0();
        u0().F(i10);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        super.setTheme(i10);
        u0().K(i10);
    }

    @Override // androidx.appcompat.app.d
    public androidx.appcompat.view.b t(androidx.appcompat.view.b.a aVar) {
        return null;
    }

    public f u0() {
        if (this.f10097R == null) {
            this.f10097R = f.h(this, this);
        }
        return this.f10097R;
    }

    public androidx.appcompat.app.a v0() {
        return u0().q();
    }

    public void y0(p161q0.r rVar) {
        rVar.b(this);
    }

    protected void z0(p231x0.h hVar) {
    }

    @Override // p010b.j, android.app.Activity
    public void setContentView(View view) {
        x0();
        u0().G(view);
    }

    @Override // p010b.j, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        x0();
        u0().H(view, layoutParams);
    }
}
