package p100k;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC1070b;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class c extends p100k.b implements MenuItem {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p211v0.b f22607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Method f22608e;

    private class a extends AbstractC1070b implements ActionProvider.VisibilityListener {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private AbstractC1070b.InterfaceC0381b f22609d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final ActionProvider f22610e;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f22610e = actionProvider;
        }

        @Override // androidx.core.view.AbstractC1070b
        public boolean a() {
            return this.f22610e.hasSubMenu();
        }

        @Override // androidx.core.view.AbstractC1070b
        public boolean b() {
            return this.f22610e.isVisible();
        }

        @Override // androidx.core.view.AbstractC1070b
        public View c(MenuItem menuItem) {
            return this.f22610e.onCreateActionView(menuItem);
        }

        @Override // androidx.core.view.AbstractC1070b
        public boolean d() {
            return this.f22610e.onPerformDefaultAction();
        }

        @Override // androidx.core.view.AbstractC1070b
        public void e(SubMenu subMenu) {
            this.f22610e.onPrepareSubMenu(c.this.d(subMenu));
        }

        @Override // androidx.core.view.AbstractC1070b
        public boolean f() {
            return this.f22610e.overridesItemVisibility();
        }

        @Override // androidx.core.view.AbstractC1070b
        public void i(AbstractC1070b.InterfaceC0381b interfaceC0381b) {
            this.f22609d = interfaceC0381b;
            ActionProvider actionProvider = this.f22610e;
            if (interfaceC0381b == null) {
                this = null;
            }
            actionProvider.setVisibilityListener(this);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z9) {
            AbstractC1070b.InterfaceC0381b interfaceC0381b = this.f22609d;
            if (interfaceC0381b != null) {
                interfaceC0381b.onActionProviderVisibilityChanged(z9);
            }
        }
    }

    static class b extends FrameLayout implements androidx.appcompat.view.c {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final CollapsibleActionView f22612q;

        /* JADX WARN: Multi-variable type inference failed */
        b(View view) {
            super(view.getContext());
            this.f22612q = (CollapsibleActionView) view;
            addView(view);
        }

        View a() {
            return (View) this.f22612q;
        }

        @Override // androidx.appcompat.view.c
        public void c() {
            this.f22612q.onActionViewExpanded();
        }

        @Override // androidx.appcompat.view.c
        public void f() {
            this.f22612q.onActionViewCollapsed();
        }
    }

    /* JADX INFO: renamed from: k.c$c, reason: collision with other inner class name */
    private class MenuItemOnActionExpandListenerC0566c implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MenuItem.OnActionExpandListener f22613a;

        MenuItemOnActionExpandListenerC0566c(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f22613a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f22613a.onMenuItemActionCollapse(c.this.c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f22613a.onMenuItemActionExpand(c.this.c(menuItem));
        }
    }

    private class d implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MenuItem.OnMenuItemClickListener f22615a;

        d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f22615a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f22615a.onMenuItemClick(c.this.c(menuItem));
        }
    }

    public c(Context context, p211v0.b bVar) {
        super(context);
        if (bVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f22607d = bVar;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f22607d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f22607d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        AbstractC1070b abstractC1070bB = this.f22607d.b();
        if (abstractC1070bB instanceof a) {
            return ((a) abstractC1070bB).f22610e;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f22607d.getActionView();
        return actionView instanceof b ? ((b) actionView).a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f22607d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f22607d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f22607d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f22607d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f22607d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f22607d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f22607d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f22607d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f22607d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f22607d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f22607d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f22607d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f22607d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return d(this.f22607d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f22607d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f22607d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f22607d.getTooltipText();
    }

    public void h(boolean z9) {
        try {
            if (this.f22608e == null) {
                this.f22608e = this.f22607d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f22608e.invoke(this.f22607d, Boolean.valueOf(z9));
        } catch (Exception e10) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f22607d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f22607d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f22607d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f22607d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f22607d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f22607d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        a aVar = new a(this.f22604a, actionProvider);
        p211v0.b bVar = this.f22607d;
        if (actionProvider == null) {
            aVar = null;
        }
        bVar.a(aVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new b(view);
        }
        this.f22607d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f22607d.setAlphabeticShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z9) {
        this.f22607d.setCheckable(z9);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z9) {
        this.f22607d.setChecked(z9);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f22607d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z9) {
        this.f22607d.setEnabled(z9);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f22607d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f22607d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f22607d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f22607d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f22607d.setNumericShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f22607d.setOnActionExpandListener(onActionExpandListener != null ? new MenuItemOnActionExpandListenerC0566c(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f22607d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new d(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f22607d.setShortcut(c10, c11);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i10) {
        this.f22607d.setShowAsAction(i10);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i10) {
        this.f22607d.setShowAsActionFlags(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f22607d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f22607d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f22607d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z9) {
        return this.f22607d.setVisible(z9);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f22607d.setAlphabeticShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f22607d.setIcon(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f22607d.setNumericShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f22607d.setShortcut(c10, c11, i10, i11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f22607d.setTitle(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i10) {
        this.f22607d.setActionView(i10);
        View actionView = this.f22607d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f22607d.setActionView(new b(actionView));
        }
        return this;
    }
}
