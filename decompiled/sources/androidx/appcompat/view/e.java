package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class e extends b implements androidx.appcompat.view.menu.e.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Context f10307s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ActionBarContextView f10308t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private b.a f10309u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private WeakReference f10310v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f10311w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f10312x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private androidx.appcompat.view.menu.e f10313y;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z9) {
        this.f10307s = context;
        this.f10308t = actionBarContextView;
        this.f10309u = aVar;
        androidx.appcompat.view.menu.e eVarT = new androidx.appcompat.view.menu.e(actionBarContextView.getContext()).T(1);
        this.f10313y = eVarT;
        eVarT.S(this);
        this.f10312x = z9;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        return this.f10309u.d(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        k();
        this.f10308t.l();
    }

    @Override // androidx.appcompat.view.b
    public void c() {
        if (this.f10311w) {
            return;
        }
        this.f10311w = true;
        this.f10309u.a(this);
    }

    @Override // androidx.appcompat.view.b
    public View d() {
        WeakReference weakReference = this.f10310v;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.b
    public Menu e() {
        return this.f10313y;
    }

    @Override // androidx.appcompat.view.b
    public MenuInflater f() {
        return new g(this.f10308t.getContext());
    }

    @Override // androidx.appcompat.view.b
    public CharSequence g() {
        return this.f10308t.getSubtitle();
    }

    @Override // androidx.appcompat.view.b
    public CharSequence i() {
        return this.f10308t.getTitle();
    }

    @Override // androidx.appcompat.view.b
    public void k() {
        this.f10309u.c(this, this.f10313y);
    }

    @Override // androidx.appcompat.view.b
    public boolean l() {
        return this.f10308t.j();
    }

    @Override // androidx.appcompat.view.b
    public void m(View view) {
        this.f10308t.setCustomView(view);
        this.f10310v = view != null ? new WeakReference(view) : null;
    }

    @Override // androidx.appcompat.view.b
    public void n(int i10) {
        o(this.f10307s.getString(i10));
    }

    @Override // androidx.appcompat.view.b
    public void o(CharSequence charSequence) {
        this.f10308t.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public void q(int i10) {
        r(this.f10307s.getString(i10));
    }

    @Override // androidx.appcompat.view.b
    public void r(CharSequence charSequence) {
        this.f10308t.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public void s(boolean z9) {
        super.s(z9);
        this.f10308t.setTitleOptional(z9);
    }
}
