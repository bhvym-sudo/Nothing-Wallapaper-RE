package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.AbstractC1070b;
import androidx.core.view.I;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class e implements p211v0.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final int[] f10467A = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f10468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources f10469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f10470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f10471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f10472e;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f10480m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    CharSequence f10481n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Drawable f10482o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    View f10483p;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private g f10491x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f10493z;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f10479l = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f10484q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f10485r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f10486s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f10487t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f10488u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ArrayList f10489v = new ArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private CopyOnWriteArrayList f10490w = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f10492y = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList f10473f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList f10474g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f10475h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList f10476i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ArrayList f10477j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f10478k = true;

    public interface a {
        boolean a(e eVar, MenuItem menuItem);

        void b(e eVar);
    }

    public interface b {
        boolean a(g gVar);
    }

    public e(Context context) {
        this.f10468a = context;
        this.f10469b = context.getResources();
        c0(true);
    }

    private static int B(int i10) {
        int i11 = ((-65536) & i10) >> 16;
        if (i11 >= 0) {
            int[] iArr = f10467A;
            if (i11 < iArr.length) {
                return (i10 & 65535) | (iArr[i11] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void O(int i10, boolean z9) {
        if (i10 < 0 || i10 >= this.f10473f.size()) {
            return;
        }
        this.f10473f.remove(i10);
        if (z9) {
            L(true);
        }
    }

    private void X(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        Resources resourcesC = C();
        if (view != null) {
            this.f10483p = view;
            this.f10481n = null;
            this.f10482o = null;
        } else {
            if (i10 > 0) {
                this.f10481n = resourcesC.getText(i10);
            } else if (charSequence != null) {
                this.f10481n = charSequence;
            }
            if (i11 > 0) {
                this.f10482o = p171r0.a.d(u(), i11);
            } else if (drawable != null) {
                this.f10482o = drawable;
            }
            this.f10483p = null;
        }
        L(false);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    private void c0(boolean z9) {
        boolean z10;
        if (z9) {
            z10 = this.f10469b.getConfiguration().keyboard != 1 && I.e(ViewConfiguration.get(this.f10468a), this.f10468a);
        }
        this.f10471d = z10;
    }

    private g g(int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        return new g(this, i10, i11, i12, i13, charSequence, i14);
    }

    private void i(boolean z9) {
        if (this.f10490w.isEmpty()) {
            return;
        }
        e0();
        for (WeakReference weakReference : this.f10490w) {
            j jVar = (j) weakReference.get();
            if (jVar == null) {
                this.f10490w.remove(weakReference);
            } else {
                jVar.d(z9);
            }
        }
        d0();
    }

    private boolean j(m mVar, j jVar) {
        if (this.f10490w.isEmpty()) {
            return false;
        }
        boolean zK = jVar != null ? jVar.k(mVar) : false;
        for (WeakReference weakReference : this.f10490w) {
            j jVar2 = (j) weakReference.get();
            if (jVar2 == null) {
                this.f10490w.remove(weakReference);
            } else if (!zK) {
                zK = jVar2.k(mVar);
            }
        }
        return zK;
    }

    private static int n(ArrayList arrayList, int i10) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((g) arrayList.get(size)).f() <= i10) {
                return size + 1;
            }
        }
        return 0;
    }

    boolean A() {
        return this.f10487t;
    }

    Resources C() {
        return this.f10469b;
    }

    public e D() {
        return this;
    }

    public ArrayList E() {
        if (!this.f10475h) {
            return this.f10474g;
        }
        this.f10474g.clear();
        int size = this.f10473f.size();
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = (g) this.f10473f.get(i10);
            if (gVar.isVisible()) {
                this.f10474g.add(gVar);
            }
        }
        this.f10475h = false;
        this.f10478k = true;
        return this.f10474g;
    }

    public boolean F() {
        return !this.f10484q;
    }

    public boolean G() {
        return this.f10492y;
    }

    boolean H() {
        return this.f10470c;
    }

    public boolean I() {
        return this.f10471d;
    }

    void J(g gVar) {
        this.f10478k = true;
        L(true);
    }

    void K(g gVar) {
        this.f10475h = true;
        L(true);
    }

    public void L(boolean z9) {
        if (this.f10484q) {
            this.f10485r = true;
            if (z9) {
                this.f10486s = true;
                return;
            }
            return;
        }
        if (z9) {
            this.f10475h = true;
            this.f10478k = true;
        }
        i(z9);
    }

    public boolean M(MenuItem menuItem, int i10) {
        return N(menuItem, null, i10);
    }

    public boolean N(MenuItem menuItem, j jVar, int i10) {
        g gVar = (g) menuItem;
        if (gVar == null || !gVar.isEnabled()) {
            return false;
        }
        boolean zK = gVar.k();
        AbstractC1070b abstractC1070bB = gVar.b();
        boolean z9 = abstractC1070bB != null && abstractC1070bB.a();
        if (gVar.j()) {
            boolean zExpandActionView = gVar.expandActionView() | zK;
            if (zExpandActionView) {
                e(true);
            }
            return zExpandActionView;
        }
        if (!gVar.hasSubMenu() && !z9) {
            if ((i10 & 1) == 0) {
                e(true);
            }
            return zK;
        }
        if ((i10 & 4) == 0) {
            e(false);
        }
        if (!gVar.hasSubMenu()) {
            gVar.w(new m(u(), this, gVar));
        }
        m mVar = (m) gVar.getSubMenu();
        if (z9) {
            abstractC1070bB.e(mVar);
        }
        boolean zJ = j(mVar, jVar) | zK;
        if (!zJ) {
            e(true);
        }
        return zJ;
    }

    public void P(j jVar) {
        for (WeakReference weakReference : this.f10490w) {
            j jVar2 = (j) weakReference.get();
            if (jVar2 == null || jVar2 == jVar) {
                this.f10490w.remove(weakReference);
            }
        }
    }

    public void Q(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(t());
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).Q(bundle);
            }
        }
        int i11 = bundle.getInt("android:menu:expandedactionview");
        if (i11 <= 0 || (menuItemFindItem = findItem(i11)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public void R(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).R(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(t(), sparseArray);
        }
    }

    public void S(a aVar) {
        this.f10472e = aVar;
    }

    public e T(int i10) {
        this.f10479l = i10;
        return this;
    }

    void U(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f10473f.size();
        e0();
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = (g) this.f10473f.get(i10);
            if (gVar.getGroupId() == groupId && gVar.m() && gVar.isCheckable()) {
                gVar.r(gVar == menuItem);
            }
        }
        d0();
    }

    protected e V(int i10) {
        X(0, null, i10, null, null);
        return this;
    }

    protected e W(Drawable drawable) {
        X(0, null, 0, drawable, null);
        return this;
    }

    protected e Y(int i10) {
        X(i10, null, 0, null, null);
        return this;
    }

    protected e Z(CharSequence charSequence) {
        X(0, charSequence, 0, null, null);
        return this;
    }

    protected MenuItem a(int i10, int i11, int i12, CharSequence charSequence) {
        int iB = B(i12);
        g gVarG = g(i10, i11, i12, iB, charSequence, this.f10479l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f10480m;
        if (contextMenuInfo != null) {
            gVarG.u(contextMenuInfo);
        }
        ArrayList arrayList = this.f10473f;
        arrayList.add(n(arrayList, iB), gVarG);
        L(true);
        return gVarG;
    }

    protected e a0(View view) {
        X(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f10468a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i10, i11, i12, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(j jVar) {
        c(jVar, this.f10468a);
    }

    public void b0(boolean z9) {
        this.f10493z = z9;
    }

    public void c(j jVar, Context context) {
        this.f10490w.add(new WeakReference(jVar));
        jVar.i(context, this);
        this.f10478k = true;
    }

    @Override // android.view.Menu
    public void clear() {
        g gVar = this.f10491x;
        if (gVar != null) {
            f(gVar);
        }
        this.f10473f.clear();
        L(true);
    }

    public void clearHeader() {
        this.f10482o = null;
        this.f10481n = null;
        this.f10483p = null;
        L(false);
    }

    @Override // android.view.Menu
    public void close() {
        e(true);
    }

    public void d() {
        a aVar = this.f10472e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public void d0() {
        this.f10484q = false;
        if (this.f10485r) {
            this.f10485r = false;
            L(this.f10486s);
        }
    }

    public final void e(boolean z9) {
        if (this.f10488u) {
            return;
        }
        this.f10488u = true;
        for (WeakReference weakReference : this.f10490w) {
            j jVar = (j) weakReference.get();
            if (jVar == null) {
                this.f10490w.remove(weakReference);
            } else {
                jVar.c(this, z9);
            }
        }
        this.f10488u = false;
    }

    public void e0() {
        if (this.f10484q) {
            return;
        }
        this.f10484q = true;
        this.f10485r = false;
        this.f10486s = false;
    }

    public boolean f(g gVar) {
        boolean zF = false;
        if (!this.f10490w.isEmpty() && this.f10491x == gVar) {
            e0();
            for (WeakReference weakReference : this.f10490w) {
                j jVar = (j) weakReference.get();
                if (jVar != null) {
                    zF = jVar.f(this, gVar);
                    if (zF) {
                        break;
                    }
                } else {
                    this.f10490w.remove(weakReference);
                }
            }
            d0();
            if (zF) {
                this.f10491x = null;
            }
        }
        return zF;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i10) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = (g) this.f10473f.get(i11);
            if (gVar.getItemId() == i10) {
                return gVar;
            }
            if (gVar.hasSubMenu() && (menuItemFindItem = gVar.getSubMenu().findItem(i10)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i10) {
        return (MenuItem) this.f10473f.get(i10);
    }

    boolean h(e eVar, MenuItem menuItem) {
        a aVar = this.f10472e;
        return aVar != null && aVar.a(eVar, menuItem);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f10493z) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((g) this.f10473f.get(i10)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return p(i10, keyEvent) != null;
    }

    public boolean k(g gVar) {
        boolean zG = false;
        if (this.f10490w.isEmpty()) {
            return false;
        }
        e0();
        for (WeakReference weakReference : this.f10490w) {
            j jVar = (j) weakReference.get();
            if (jVar != null) {
                zG = jVar.g(this, gVar);
                if (zG) {
                    break;
                }
            } else {
                this.f10490w.remove(weakReference);
            }
        }
        d0();
        if (zG) {
            this.f10491x = gVar;
        }
        return zG;
    }

    public int l(int i10) {
        return m(i10, 0);
    }

    public int m(int i10, int i11) {
        int size = size();
        if (i11 < 0) {
            i11 = 0;
        }
        while (i11 < size) {
            if (((g) this.f10473f.get(i11)).getGroupId() == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public int o(int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((g) this.f10473f.get(i11)).getItemId() == i10) {
                return i11;
            }
        }
        return -1;
    }

    g p(int i10, KeyEvent keyEvent) {
        ArrayList arrayList = this.f10489v;
        arrayList.clear();
        q(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (g) arrayList.get(0);
        }
        boolean zH = H();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = (g) arrayList.get(i11);
            char alphabeticShortcut = zH ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (zH && alphabeticShortcut == '\b' && i10 == 67))) {
                return gVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i10, int i11) {
        return M(findItem(i10), i11);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        g gVarP = p(i10, keyEvent);
        boolean zM = gVarP != null ? M(gVarP, i11) : false;
        if ((i11 & 2) != 0) {
            e(true);
        }
        return zM;
    }

    void q(List list, int i10, KeyEvent keyEvent) {
        boolean zH = H();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            int size = this.f10473f.size();
            for (int i11 = 0; i11 < size; i11++) {
                g gVar = (g) this.f10473f.get(i11);
                if (gVar.hasSubMenu()) {
                    ((e) gVar.getSubMenu()).q(list, i10, keyEvent);
                }
                char alphabeticShortcut = zH ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
                if ((modifiers & 69647) == ((zH ? gVar.getAlphabeticModifiers() : gVar.getNumericModifiers()) & 69647) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (zH && alphabeticShortcut == '\b' && i10 == 67)) && gVar.isEnabled()) {
                        list.add(gVar);
                    }
                }
            }
        }
    }

    public void r() {
        ArrayList arrayListE = E();
        if (this.f10478k) {
            boolean zE = false;
            for (WeakReference weakReference : this.f10490w) {
                j jVar = (j) weakReference.get();
                if (jVar == null) {
                    this.f10490w.remove(weakReference);
                } else {
                    zE |= jVar.e();
                }
            }
            if (zE) {
                this.f10476i.clear();
                this.f10477j.clear();
                int size = arrayListE.size();
                for (int i10 = 0; i10 < size; i10++) {
                    g gVar = (g) arrayListE.get(i10);
                    if (gVar.l()) {
                        this.f10476i.add(gVar);
                    } else {
                        this.f10477j.add(gVar);
                    }
                }
            } else {
                this.f10476i.clear();
                this.f10477j.clear();
                this.f10477j.addAll(E());
            }
            this.f10478k = false;
        }
    }

    @Override // android.view.Menu
    public void removeGroup(int i10) {
        int iL = l(i10);
        if (iL >= 0) {
            int size = this.f10473f.size() - iL;
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (i11 >= size || ((g) this.f10473f.get(iL)).getGroupId() != i10) {
                    break;
                }
                O(iL, false);
                i11 = i12;
            }
            L(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i10) {
        O(o(i10), true);
    }

    public ArrayList s() {
        r();
        return this.f10476i;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i10, boolean z9, boolean z10) {
        int size = this.f10473f.size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = (g) this.f10473f.get(i11);
            if (gVar.getGroupId() == i10) {
                gVar.s(z10);
                gVar.setCheckable(z9);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z9) {
        this.f10492y = z9;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i10, boolean z9) {
        int size = this.f10473f.size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = (g) this.f10473f.get(i11);
            if (gVar.getGroupId() == i10) {
                gVar.setEnabled(z9);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i10, boolean z9) {
        int size = this.f10473f.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = (g) this.f10473f.get(i11);
            if (gVar.getGroupId() == i10 && gVar.x(z9)) {
                z10 = true;
            }
        }
        if (z10) {
            L(true);
        }
    }

    public void setOptionalIconsVisible(boolean z9) {
        this.f10487t = z9;
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z9) {
        this.f10470c = z9;
        L(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f10473f.size();
    }

    protected String t() {
        return "android:menu:actionviewstates";
    }

    public Context u() {
        return this.f10468a;
    }

    public g v() {
        return this.f10491x;
    }

    public Drawable w() {
        return this.f10482o;
    }

    public CharSequence x() {
        return this.f10481n;
    }

    public View y() {
        return this.f10483p;
    }

    public ArrayList z() {
        r();
        return this.f10477j;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10) {
        return a(0, 0, 0, this.f10469b.getString(i10));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f10469b.getString(i10));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        g gVar = (g) a(i10, i11, i12, charSequence);
        m mVar = new m(this.f10468a, this, gVar);
        gVar.w(mVar);
        return mVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f10469b.getString(i13));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f10469b.getString(i13));
    }
}
