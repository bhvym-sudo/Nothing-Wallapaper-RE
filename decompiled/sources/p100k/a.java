package p100k;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.view.AbstractC1070b;
import p211v0.b;

/* JADX INFO: loaded from: classes.dex */
public class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f22584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f22585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f22586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CharSequence f22587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f22588e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Intent f22589f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private char f22590g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private char f22592i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Drawable f22594k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Context f22595l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f22596m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private CharSequence f22597n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private CharSequence f22598o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f22591h = 4096;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f22593j = 4096;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ColorStateList f22599p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private PorterDuff.Mode f22600q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f22601r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f22602s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f22603t = 16;

    public a(Context context, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f22595l = context;
        this.f22584a = i11;
        this.f22585b = i10;
        this.f22586c = i13;
        this.f22587d = charSequence;
    }

    private void c() {
        Drawable drawable = this.f22594k;
        if (drawable != null) {
            if (this.f22601r || this.f22602s) {
                Drawable drawableR = p201u0.a.r(drawable);
                this.f22594k = drawableR;
                Drawable drawableMutate = drawableR.mutate();
                this.f22594k = drawableMutate;
                if (this.f22601r) {
                    p201u0.a.o(drawableMutate, this.f22599p);
                }
                if (this.f22602s) {
                    p201u0.a.p(this.f22594k, this.f22600q);
                }
            }
        }
    }

    @Override // p211v0.b
    public b a(AbstractC1070b abstractC1070b) {
        throw new UnsupportedOperationException();
    }

    @Override // p211v0.b
    public AbstractC1070b b() {
        return null;
    }

    @Override // p211v0.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // p211v0.b, android.view.MenuItem
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public b setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // p211v0.b, android.view.MenuItem
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // p211v0.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // p211v0.b, android.view.MenuItem
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // p211v0.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // p211v0.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f22593j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f22592i;
    }

    @Override // p211v0.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f22597n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f22585b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f22594k;
    }

    @Override // p211v0.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f22599p;
    }

    @Override // p211v0.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f22600q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f22589f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f22584a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p211v0.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f22591h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f22590g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f22586c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f22587d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f22588e;
        return charSequence != null ? charSequence : this.f22587d;
    }

    @Override // p211v0.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f22598o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // p211v0.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f22603t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f22603t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f22603t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f22603t & 8) == 0;
    }

    public boolean requiresActionButton() {
        return true;
    }

    public boolean requiresOverflow() {
        return false;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f22592i = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z9) {
        this.f22603t = (z9 ? 1 : 0) | (this.f22603t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z9) {
        this.f22603t = (z9 ? 2 : 0) | (this.f22603t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z9) {
        this.f22603t = (z9 ? 16 : 0) | (this.f22603t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f22594k = drawable;
        c();
        return this;
    }

    @Override // p211v0.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f22599p = colorStateList;
        this.f22601r = true;
        c();
        return this;
    }

    @Override // p211v0.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f22600q = mode;
        this.f22602s = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f22589f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f22590g = c10;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f22596m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f22590g = c10;
        this.f22592i = Character.toLowerCase(c11);
        return this;
    }

    @Override // p211v0.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f22587d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f22588e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z9) {
        this.f22603t = (this.f22603t & 8) | (z9 ? 0 : 8);
        return this;
    }

    @Override // p211v0.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f22592i = Character.toLowerCase(c10);
        this.f22593j = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public b setContentDescription(CharSequence charSequence) {
        this.f22597n = charSequence;
        return this;
    }

    @Override // p211v0.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f22590g = c10;
        this.f22591h = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f22587d = this.f22595l.getResources().getString(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public b setTooltipText(CharSequence charSequence) {
        this.f22598o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f22594k = p171r0.a.d(this.f22595l, i10);
        c();
        return this;
    }

    @Override // p211v0.b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f22590g = c10;
        this.f22591h = KeyEvent.normalizeMetaState(i10);
        this.f22592i = Character.toLowerCase(c11);
        this.f22593j = KeyEvent.normalizeMetaState(i11);
        return this;
    }
}
