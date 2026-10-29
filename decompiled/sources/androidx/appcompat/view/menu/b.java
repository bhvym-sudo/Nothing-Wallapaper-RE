package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.A;
import androidx.appcompat.widget.MenuPopupWindow;
import androidx.core.view.AbstractC1077i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class b extends h implements j, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private static final int f10413R = p050f.g.f20460e;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private View f10418E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    View f10419F;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f10421H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f10422I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f10423J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f10424K;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private boolean f10426M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private j.a f10427N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    ViewTreeObserver f10428O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private PopupWindow.OnDismissListener f10429P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    boolean f10430Q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Context f10431r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f10432s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f10433t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int f10434u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final boolean f10435v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final Handler f10436w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final List f10437x = new ArrayList();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    final List f10438y = new ArrayList();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f10439z = new a();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f10414A = new ViewOnAttachStateChangeListenerC0362b();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final A f10415B = new c();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f10416C = 0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f10417D = 0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f10425L = false;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f10420G = D();

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!b.this.a() || b.this.f10438y.size() <= 0 || ((d) b.this.f10438y.get(0)).f10447a.B()) {
                return;
            }
            View view = b.this.f10419F;
            if (view == null || !view.isShown()) {
                b.this.dismiss();
                return;
            }
            Iterator it = b.this.f10438y.iterator();
            while (it.hasNext()) {
                ((d) it.next()).f10447a.b();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$b, reason: collision with other inner class name */
    class ViewOnAttachStateChangeListenerC0362b implements View.OnAttachStateChangeListener {
        ViewOnAttachStateChangeListenerC0362b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.f10428O;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.f10428O = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.f10428O.removeGlobalOnLayoutListener(bVar.f10439z);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    class c implements A {

        class a implements Runnable {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ d f10443q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ MenuItem f10444r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ e f10445s;

            a(d dVar, MenuItem menuItem, e eVar) {
                this.f10443q = dVar;
                this.f10444r = menuItem;
                this.f10445s = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f10443q;
                if (dVar != null) {
                    b.this.f10430Q = true;
                    dVar.f10448b.e(false);
                    b.this.f10430Q = false;
                }
                if (this.f10444r.isEnabled() && this.f10444r.hasSubMenu()) {
                    this.f10445s.M(this.f10444r, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.A
        public void d(e eVar, MenuItem menuItem) {
            b.this.f10436w.removeCallbacksAndMessages(null);
            int size = b.this.f10438y.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (eVar == ((d) b.this.f10438y.get(i10)).f10448b) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 == -1) {
                return;
            }
            int i11 = i10 + 1;
            b.this.f10436w.postAtTime(new a(i11 < b.this.f10438y.size() ? (d) b.this.f10438y.get(i11) : null, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.A
        public void g(e eVar, MenuItem menuItem) {
            b.this.f10436w.removeCallbacksAndMessages(eVar);
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MenuPopupWindow f10447a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f10448b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f10449c;

        public d(MenuPopupWindow menuPopupWindow, e eVar, int i10) {
            this.f10447a = menuPopupWindow;
            this.f10448b = eVar;
            this.f10449c = i10;
        }

        public ListView a() {
            return this.f10447a.j();
        }
    }

    public b(Context context, View view, int i10, int i11, boolean z9) {
        this.f10431r = context;
        this.f10418E = view;
        this.f10433t = i10;
        this.f10434u = i11;
        this.f10435v = z9;
        Resources resources = context.getResources();
        this.f10432s = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(p050f.d.f20373d));
        this.f10436w = new Handler();
    }

    private int A(e eVar) {
        int size = this.f10438y.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (eVar == ((d) this.f10438y.get(i10)).f10448b) {
                return i10;
            }
        }
        return -1;
    }

    private MenuItem B(e eVar, e eVar2) {
        int size = eVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = eVar.getItem(i10);
            if (item.hasSubMenu() && eVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View C(d dVar, e eVar) {
        androidx.appcompat.view.menu.d dVar2;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemB = B(dVar.f10448b, eVar);
        if (menuItemB == null) {
            return null;
        }
        ListView listViewA = dVar.a();
        ListAdapter adapter = listViewA.getAdapter();
        int i10 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            dVar2 = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
        } else {
            dVar2 = (androidx.appcompat.view.menu.d) adapter;
            headersCount = 0;
        }
        int count = dVar2.getCount();
        while (true) {
            if (i10 >= count) {
                i10 = -1;
                break;
            }
            if (menuItemB == dVar2.getItem(i10)) {
                break;
            }
            i10++;
        }
        if (i10 != -1 && (firstVisiblePosition = (i10 + headersCount) - listViewA.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewA.getChildCount()) {
            return listViewA.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int D() {
        return this.f10418E.getLayoutDirection() == 1 ? 0 : 1;
    }

    private int E(int i10) {
        List list = this.f10438y;
        ListView listViewA = ((d) list.get(list.size() - 1)).a();
        int[] iArr = new int[2];
        listViewA.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f10419F.getWindowVisibleDisplayFrame(rect);
        if (this.f10420G == 1) {
            return (iArr[0] + listViewA.getWidth()) + i10 > rect.right ? 0 : 1;
        }
        return iArr[0] - i10 < 0 ? 1 : 0;
    }

    private void F(e eVar) {
        d dVar;
        View viewC;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f10431r);
        androidx.appcompat.view.menu.d dVar2 = new androidx.appcompat.view.menu.d(eVar, layoutInflaterFrom, this.f10435v, f10413R);
        if (!a() && this.f10425L) {
            dVar2.d(true);
        } else if (a()) {
            dVar2.d(h.x(eVar));
        }
        int iO = h.o(dVar2, null, this.f10431r, this.f10432s);
        MenuPopupWindow menuPopupWindowZ = z();
        menuPopupWindowZ.p(dVar2);
        menuPopupWindowZ.F(iO);
        menuPopupWindowZ.G(this.f10417D);
        if (this.f10438y.size() > 0) {
            List list = this.f10438y;
            dVar = (d) list.get(list.size() - 1);
            viewC = C(dVar, eVar);
        } else {
            dVar = null;
            viewC = null;
        }
        if (viewC != null) {
            menuPopupWindowZ.V(false);
            menuPopupWindowZ.S(null);
            int iE = E(iO);
            boolean z9 = iE == 1;
            this.f10420G = iE;
            menuPopupWindowZ.D(viewC);
            if ((this.f10417D & 5) != 5) {
                iO = z9 ? viewC.getWidth() : 0 - iO;
            } else if (!z9) {
                iO = 0 - viewC.getWidth();
            }
            menuPopupWindowZ.e(iO);
            menuPopupWindowZ.N(true);
            menuPopupWindowZ.l(0);
        } else {
            if (this.f10421H) {
                menuPopupWindowZ.e(this.f10423J);
            }
            if (this.f10422I) {
                menuPopupWindowZ.l(this.f10424K);
            }
            menuPopupWindowZ.H(n());
        }
        this.f10438y.add(new d(menuPopupWindowZ, eVar, this.f10420G));
        menuPopupWindowZ.b();
        ListView listViewJ = menuPopupWindowZ.j();
        listViewJ.setOnKeyListener(this);
        if (dVar == null && this.f10426M && eVar.x() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(p050f.g.f20467l, (ViewGroup) listViewJ, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(eVar.x());
            listViewJ.addHeaderView(frameLayout, null, false);
            menuPopupWindowZ.b();
        }
    }

    private MenuPopupWindow z() {
        MenuPopupWindow menuPopupWindow = new MenuPopupWindow(this.f10431r, null, this.f10433t, this.f10434u);
        menuPopupWindow.U(this.f10415B);
        menuPopupWindow.L(this);
        menuPopupWindow.K(this);
        menuPopupWindow.D(this.f10418E);
        menuPopupWindow.G(this.f10417D);
        menuPopupWindow.J(true);
        menuPopupWindow.I(2);
        return menuPopupWindow;
    }

    @Override // p100k.e
    public boolean a() {
        return this.f10438y.size() > 0 && ((d) this.f10438y.get(0)).f10447a.a();
    }

    @Override // p100k.e
    public void b() {
        if (a()) {
            return;
        }
        Iterator it = this.f10437x.iterator();
        while (it.hasNext()) {
            F((e) it.next());
        }
        this.f10437x.clear();
        View view = this.f10418E;
        this.f10419F = view;
        if (view != null) {
            boolean z9 = this.f10428O == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f10428O = viewTreeObserver;
            if (z9) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f10439z);
            }
            this.f10419F.addOnAttachStateChangeListener(this.f10414A);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void c(e eVar, boolean z9) {
        int iA = A(eVar);
        if (iA < 0) {
            return;
        }
        int i10 = iA + 1;
        if (i10 < this.f10438y.size()) {
            ((d) this.f10438y.get(i10)).f10448b.e(false);
        }
        d dVar = (d) this.f10438y.remove(iA);
        dVar.f10448b.P(this);
        if (this.f10430Q) {
            dVar.f10447a.T(null);
            dVar.f10447a.E(0);
        }
        dVar.f10447a.dismiss();
        int size = this.f10438y.size();
        if (size > 0) {
            this.f10420G = ((d) this.f10438y.get(size - 1)).f10449c;
        } else {
            this.f10420G = D();
        }
        if (size != 0) {
            if (z9) {
                ((d) this.f10438y.get(0)).f10448b.e(false);
                return;
            }
            return;
        }
        dismiss();
        j.a aVar = this.f10427N;
        if (aVar != null) {
            aVar.c(eVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f10428O;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f10428O.removeGlobalOnLayoutListener(this.f10439z);
            }
            this.f10428O = null;
        }
        this.f10419F.removeOnAttachStateChangeListener(this.f10414A);
        this.f10429P.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(boolean z9) {
        Iterator it = this.f10438y.iterator();
        while (it.hasNext()) {
            h.y(((d) it.next()).a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // p100k.e
    public void dismiss() {
        int size = this.f10438y.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f10438y.toArray(new d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = dVarArr[i10];
                if (dVar.f10447a.a()) {
                    dVar.f10447a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void h(j.a aVar) {
        this.f10427N = aVar;
    }

    @Override // p100k.e
    public ListView j() {
        if (this.f10438y.isEmpty()) {
            return null;
        }
        List list = this.f10438y;
        return ((d) list.get(list.size() - 1)).a();
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean k(m mVar) {
        for (d dVar : this.f10438y) {
            if (mVar == dVar.f10448b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        l(mVar);
        j.a aVar = this.f10427N;
        if (aVar != null) {
            aVar.d(mVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.h
    public void l(e eVar) {
        eVar.c(this, this.f10431r);
        if (a()) {
            F(eVar);
        } else {
            this.f10437x.add(eVar);
        }
    }

    @Override // androidx.appcompat.view.menu.h
    protected boolean m() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f10438y.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = (d) this.f10438y.get(i10);
            if (!dVar.f10447a.a()) {
                break;
            } else {
                i10++;
            }
        }
        if (dVar != null) {
            dVar.f10448b.e(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.h
    public void p(View view) {
        if (this.f10418E != view) {
            this.f10418E = view;
            this.f10417D = AbstractC1077i.b(this.f10416C, view.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void r(boolean z9) {
        this.f10425L = z9;
    }

    @Override // androidx.appcompat.view.menu.h
    public void s(int i10) {
        if (this.f10416C != i10) {
            this.f10416C = i10;
            this.f10417D = AbstractC1077i.b(i10, this.f10418E.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(int i10) {
        this.f10421H = true;
        this.f10423J = i10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f10429P = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(boolean z9) {
        this.f10426M = z9;
    }

    @Override // androidx.appcompat.view.menu.h
    public void w(int i10) {
        this.f10422I = true;
        this.f10424K = i10;
    }
}
