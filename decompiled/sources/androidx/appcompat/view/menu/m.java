package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class m extends e implements SubMenu {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private e f10567B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private g f10568C;

    public m(Context context, e eVar, g gVar) {
        super(context);
        this.f10567B = eVar;
        this.f10568C = gVar;
    }

    @Override // androidx.appcompat.view.menu.e
    public e D() {
        return this.f10567B.D();
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean G() {
        return this.f10567B.G();
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean H() {
        return this.f10567B.H();
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean I() {
        return this.f10567B.I();
    }

    @Override // androidx.appcompat.view.menu.e
    public void S(e.a aVar) {
        this.f10567B.S(aVar);
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean f(g gVar) {
        return this.f10567B.f(gVar);
    }

    public Menu f0() {
        return this.f10567B;
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f10568C;
    }

    @Override // androidx.appcompat.view.menu.e
    boolean h(e eVar, MenuItem menuItem) {
        return super.h(eVar, menuItem) || this.f10567B.h(eVar, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean k(g gVar) {
        return this.f10567B.k(gVar);
    }

    @Override // androidx.appcompat.view.menu.e, android.view.Menu
    public void setGroupDividerEnabled(boolean z9) {
        this.f10567B.setGroupDividerEnabled(z9);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.W(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.Z(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.a0(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f10568C.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.e, android.view.Menu
    public void setQwertyMode(boolean z9) {
        this.f10567B.setQwertyMode(z9);
    }

    @Override // androidx.appcompat.view.menu.e
    public String t() {
        g gVar = this.f10568C;
        int itemId = gVar != null ? gVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.t() + ":" + itemId;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i10) {
        return (SubMenu) super.V(i10);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i10) {
        return (SubMenu) super.Y(i10);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i10) {
        this.f10568C.setIcon(i10);
        return this;
    }
}
