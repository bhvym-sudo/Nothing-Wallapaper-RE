package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.AbstractC1070b;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;

/* JADX INFO: loaded from: classes.dex */
public final class g implements p211v0.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private View f10498A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private AbstractC1070b f10499B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private MenuItem.OnActionExpandListener f10500C;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f10502E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f10503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f10504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f10505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f10506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f10507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CharSequence f10508f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Intent f10509g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private char f10510h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private char f10512j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Drawable f10514l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    e f10516n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private m f10517o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Runnable f10518p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f10519q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private CharSequence f10520r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private CharSequence f10521s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f10528z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f10511i = 4096;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f10513k = 4096;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f10515m = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ColorStateList f10522t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private PorterDuff.Mode f10523u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f10524v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f10525w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f10526x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f10527y = 16;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f10501D = false;

    class a implements AbstractC1070b.InterfaceC0381b {
        a() {
        }

        @Override // androidx.core.view.AbstractC1070b.InterfaceC0381b
        public void onActionProviderVisibilityChanged(boolean z9) {
            g gVar = g.this;
            gVar.f10516n.K(gVar);
        }
    }

    g(e eVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f10516n = eVar;
        this.f10503a = i11;
        this.f10504b = i10;
        this.f10505c = i12;
        this.f10506d = i13;
        this.f10507e = charSequence;
        this.f10528z = i14;
    }

    private static void d(StringBuilder sb, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb.append(str);
        }
    }

    private Drawable e(Drawable drawable) {
        if (drawable != null && this.f10526x && (this.f10524v || this.f10525w)) {
            drawable = p201u0.a.r(drawable).mutate();
            if (this.f10524v) {
                p201u0.a.o(drawable, this.f10522t);
            }
            if (this.f10525w) {
                p201u0.a.p(drawable, this.f10523u);
            }
            this.f10526x = false;
        }
        return drawable;
    }

    public boolean A() {
        return (this.f10528z & 4) == 4;
    }

    @Override // p211v0.b
    public p211v0.b a(AbstractC1070b abstractC1070b) {
        AbstractC1070b abstractC1070b2 = this.f10499B;
        if (abstractC1070b2 != null) {
            abstractC1070b2.g();
        }
        this.f10498A = null;
        this.f10499B = abstractC1070b;
        this.f10516n.L(true);
        AbstractC1070b abstractC1070b3 = this.f10499B;
        if (abstractC1070b3 != null) {
            abstractC1070b3.i(new a());
        }
        return this;
    }

    @Override // p211v0.b
    public AbstractC1070b b() {
        return this.f10499B;
    }

    public void c() {
        this.f10516n.J(this);
    }

    @Override // p211v0.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f10528z & 8) == 0) {
            return false;
        }
        if (this.f10498A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f10500C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f10516n.f(this);
        }
        return false;
    }

    @Override // p211v0.b, android.view.MenuItem
    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f10500C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f10516n.k(this);
        }
        return false;
    }

    public int f() {
        return this.f10506d;
    }

    char g() {
        return this.f10516n.H() ? this.f10512j : this.f10510h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // p211v0.b, android.view.MenuItem
    public View getActionView() {
        View view = this.f10498A;
        if (view != null) {
            return view;
        }
        AbstractC1070b abstractC1070b = this.f10499B;
        if (abstractC1070b == null) {
            return null;
        }
        View viewC = abstractC1070b.c(this);
        this.f10498A = viewC;
        return viewC;
    }

    @Override // p211v0.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f10513k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f10512j;
    }

    @Override // p211v0.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f10520r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f10504b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f10514l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f10515m == 0) {
            return null;
        }
        Drawable drawableB = p060g.a.b(this.f10516n.u(), this.f10515m);
        this.f10515m = 0;
        this.f10514l = drawableB;
        return e(drawableB);
    }

    @Override // p211v0.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f10522t;
    }

    @Override // p211v0.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f10523u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f10509g;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f10503a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f10502E;
    }

    @Override // p211v0.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f10511i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f10510h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f10505c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f10517o;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f10507e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f10508f;
        return charSequence != null ? charSequence : this.f10507e;
    }

    @Override // p211v0.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f10521s;
    }

    String h() {
        char cG = g();
        if (cG == 0) {
            return "";
        }
        Resources resources = this.f10516n.u().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f10516n.u()).hasPermanentMenuKey()) {
            sb.append(resources.getString(p050f.h.f20485m));
        }
        int i10 = this.f10516n.H() ? this.f10513k : this.f10511i;
        d(sb, i10, ArrayPool.STANDARD_BUFFER_SIZE_BYTES, resources.getString(p050f.h.f20481i));
        d(sb, i10, 4096, resources.getString(p050f.h.f20477e));
        d(sb, i10, 2, resources.getString(p050f.h.f20476d));
        d(sb, i10, 1, resources.getString(p050f.h.f20482j));
        d(sb, i10, 4, resources.getString(p050f.h.f20484l));
        d(sb, i10, 8, resources.getString(p050f.h.f20480h));
        if (cG == '\b') {
            sb.append(resources.getString(p050f.h.f20478f));
        } else if (cG == '\n') {
            sb.append(resources.getString(p050f.h.f20479g));
        } else if (cG != ' ') {
            sb.append(cG);
        } else {
            sb.append(resources.getString(p050f.h.f20483k));
        }
        return sb.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f10517o != null;
    }

    CharSequence i(k.a aVar) {
        return (aVar == null || !aVar.d()) ? getTitle() : getTitleCondensed();
    }

    @Override // p211v0.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f10501D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f10527y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f10527y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f10527y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        AbstractC1070b abstractC1070b = this.f10499B;
        if (abstractC1070b == null || !abstractC1070b.f()) {
            return (this.f10527y & 8) == 0;
        }
        return (this.f10527y & 8) == 0 && this.f10499B.b();
    }

    public boolean j() {
        AbstractC1070b abstractC1070b;
        if ((this.f10528z & 8) != 0) {
            if (this.f10498A == null && (abstractC1070b = this.f10499B) != null) {
                this.f10498A = abstractC1070b.c(this);
            }
            if (this.f10498A != null) {
                return true;
            }
        }
        return false;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f10519q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        e eVar = this.f10516n;
        if (eVar.h(eVar, this)) {
            return true;
        }
        Runnable runnable = this.f10518p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f10509g != null) {
            try {
                this.f10516n.u().startActivity(this.f10509g);
                return true;
            } catch (ActivityNotFoundException e10) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
            }
        }
        AbstractC1070b abstractC1070b = this.f10499B;
        return abstractC1070b != null && abstractC1070b.d();
    }

    public boolean l() {
        return (this.f10527y & 32) == 32;
    }

    public boolean m() {
        return (this.f10527y & 4) != 0;
    }

    public boolean n() {
        return (this.f10528z & 1) == 1;
    }

    @Override // p211v0.b, android.view.MenuItem
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public p211v0.b setActionView(int i10) {
        Context contextU = this.f10516n.u();
        setActionView(LayoutInflater.from(contextU).inflate(i10, (ViewGroup) new LinearLayout(contextU), false));
        return this;
    }

    @Override // p211v0.b, android.view.MenuItem
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public p211v0.b setActionView(View view) {
        int i10;
        this.f10498A = view;
        this.f10499B = null;
        if (view != null && view.getId() == -1 && (i10 = this.f10503a) > 0) {
            view.setId(i10);
        }
        this.f10516n.J(this);
        return this;
    }

    public void q(boolean z9) {
        this.f10501D = z9;
        this.f10516n.L(false);
    }

    void r(boolean z9) {
        int i10 = this.f10527y;
        int i11 = (z9 ? 2 : 0) | (i10 & (-3));
        this.f10527y = i11;
        if (i10 != i11) {
            this.f10516n.L(false);
        }
    }

    public boolean requiresActionButton() {
        return (this.f10528z & 2) == 2;
    }

    public boolean requiresOverflow() {
        return (requiresActionButton() || n()) ? false : true;
    }

    public void s(boolean z9) {
        this.f10527y = (z9 ? 4 : 0) | (this.f10527y & (-5));
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        if (this.f10512j == c10) {
            return this;
        }
        this.f10512j = Character.toLowerCase(c10);
        this.f10516n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z9) {
        int i10 = this.f10527y;
        int i11 = (z9 ? 1 : 0) | (i10 & (-2));
        this.f10527y = i11;
        if (i10 != i11) {
            this.f10516n.L(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z9) {
        if ((this.f10527y & 4) != 0) {
            this.f10516n.U(this);
            return this;
        }
        r(z9);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z9) {
        if (z9) {
            this.f10527y |= 16;
        } else {
            this.f10527y &= -17;
        }
        this.f10516n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f10515m = 0;
        this.f10514l = drawable;
        this.f10526x = true;
        this.f10516n.L(false);
        return this;
    }

    @Override // p211v0.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f10522t = colorStateList;
        this.f10524v = true;
        this.f10526x = true;
        this.f10516n.L(false);
        return this;
    }

    @Override // p211v0.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f10523u = mode;
        this.f10525w = true;
        this.f10526x = true;
        this.f10516n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f10509g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        if (this.f10510h == c10) {
            return this;
        }
        this.f10510h = c10;
        this.f10516n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f10500C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f10519q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f10510h = c10;
        this.f10512j = Character.toLowerCase(c11);
        this.f10516n.L(false);
        return this;
    }

    @Override // p211v0.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f10528z = i10;
        this.f10516n.J(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f10507e = charSequence;
        this.f10516n.L(false);
        m mVar = this.f10517o;
        if (mVar != null) {
            mVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f10508f = charSequence;
        this.f10516n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z9) {
        if (x(z9)) {
            this.f10516n.K(this);
        }
        return this;
    }

    public void t(boolean z9) {
        if (z9) {
            this.f10527y |= 32;
        } else {
            this.f10527y &= -33;
        }
    }

    public String toString() {
        CharSequence charSequence = this.f10507e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    void u(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f10502E = contextMenuInfo;
    }

    @Override // p211v0.b, android.view.MenuItem
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public p211v0.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    public void w(m mVar) {
        this.f10517o = mVar;
        mVar.setHeaderTitle(getTitle());
    }

    boolean x(boolean z9) {
        int i10 = this.f10527y;
        int i11 = (z9 ? 0 : 8) | (i10 & (-9));
        this.f10527y = i11;
        return i10 != i11;
    }

    public boolean y() {
        return this.f10516n.A();
    }

    boolean z() {
        return this.f10516n.I() && g() != 0;
    }

    @Override // android.view.MenuItem
    public p211v0.b setContentDescription(CharSequence charSequence) {
        this.f10520r = charSequence;
        this.f10516n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public p211v0.b setTooltipText(CharSequence charSequence) {
        this.f10521s = charSequence;
        this.f10516n.L(false);
        return this;
    }

    @Override // p211v0.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f10512j == c10 && this.f10513k == i10) {
            return this;
        }
        this.f10512j = Character.toLowerCase(c10);
        this.f10513k = KeyEvent.normalizeMetaState(i10);
        this.f10516n.L(false);
        return this;
    }

    @Override // p211v0.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f10510h == c10 && this.f10511i == i10) {
            return this;
        }
        this.f10510h = c10;
        this.f10511i = KeyEvent.normalizeMetaState(i10);
        this.f10516n.L(false);
        return this;
    }

    @Override // p211v0.b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f10510h = c10;
        this.f10511i = KeyEvent.normalizeMetaState(i10);
        this.f10512j = Character.toLowerCase(c11);
        this.f10513k = KeyEvent.normalizeMetaState(i11);
        this.f10516n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f10514l = null;
        this.f10515m = i10;
        this.f10526x = true;
        this.f10516n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        return setTitle(this.f10516n.u().getString(i10));
    }
}
