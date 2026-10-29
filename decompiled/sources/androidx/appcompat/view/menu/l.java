package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.MenuPopupWindow;

/* JADX INFO: loaded from: classes.dex */
final class l extends h implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, j, View.OnKeyListener {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static final int f10544L = p050f.g.f20468m;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private PopupWindow.OnDismissListener f10546B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private View f10547C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    View f10548D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private j.a f10549E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    ViewTreeObserver f10550F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private boolean f10551G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f10552H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f10553I;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f10555K;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Context f10556r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final e f10557s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final d f10558t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f10559u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int f10560v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f10561w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int f10562x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    final MenuPopupWindow f10563y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f10564z = new a();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final View.OnAttachStateChangeListener f10545A = new b();

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f10554J = 0;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!l.this.a() || l.this.f10563y.B()) {
                return;
            }
            View view = l.this.f10548D;
            if (view == null || !view.isShown()) {
                l.this.dismiss();
            } else {
                l.this.f10563y.b();
            }
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = l.this.f10550F;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    l.this.f10550F = view.getViewTreeObserver();
                }
                l lVar = l.this;
                lVar.f10550F.removeGlobalOnLayoutListener(lVar.f10564z);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public l(Context context, e eVar, View view, int i10, int i11, boolean z9) {
        this.f10556r = context;
        this.f10557s = eVar;
        this.f10559u = z9;
        this.f10558t = new d(eVar, LayoutInflater.from(context), z9, f10544L);
        this.f10561w = i10;
        this.f10562x = i11;
        Resources resources = context.getResources();
        this.f10560v = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(p050f.d.f20373d));
        this.f10547C = view;
        this.f10563y = new MenuPopupWindow(context, null, i10, i11);
        eVar.c(this, context);
    }

    private boolean z() {
        View view;
        if (a()) {
            return true;
        }
        if (this.f10551G || (view = this.f10547C) == null) {
            return false;
        }
        this.f10548D = view;
        this.f10563y.K(this);
        this.f10563y.L(this);
        this.f10563y.J(true);
        View view2 = this.f10548D;
        boolean z9 = this.f10550F == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f10550F = viewTreeObserver;
        if (z9) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f10564z);
        }
        view2.addOnAttachStateChangeListener(this.f10545A);
        this.f10563y.D(view2);
        this.f10563y.G(this.f10554J);
        if (!this.f10552H) {
            this.f10553I = h.o(this.f10558t, null, this.f10556r, this.f10560v);
            this.f10552H = true;
        }
        this.f10563y.F(this.f10553I);
        this.f10563y.I(2);
        this.f10563y.H(n());
        this.f10563y.b();
        ListView listViewJ = this.f10563y.j();
        listViewJ.setOnKeyListener(this);
        if (this.f10555K && this.f10557s.x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f10556r).inflate(p050f.g.f20467l, (ViewGroup) listViewJ, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f10557s.x());
            }
            frameLayout.setEnabled(false);
            listViewJ.addHeaderView(frameLayout, null, false);
        }
        this.f10563y.p(this.f10558t);
        this.f10563y.b();
        return true;
    }

    @Override // p100k.e
    public boolean a() {
        return !this.f10551G && this.f10563y.a();
    }

    @Override // p100k.e
    public void b() {
        if (!z()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void c(e eVar, boolean z9) {
        if (eVar != this.f10557s) {
            return;
        }
        dismiss();
        j.a aVar = this.f10549E;
        if (aVar != null) {
            aVar.c(eVar, z9);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(boolean z9) {
        this.f10552H = false;
        d dVar = this.f10558t;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    @Override // p100k.e
    public void dismiss() {
        if (a()) {
            this.f10563y.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void h(j.a aVar) {
        this.f10549E = aVar;
    }

    @Override // p100k.e
    public ListView j() {
        return this.f10563y.j();
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean k(m mVar) {
        if (mVar.hasVisibleItems()) {
            i iVar = new i(this.f10556r, mVar, this.f10548D, this.f10559u, this.f10561w, this.f10562x);
            iVar.j(this.f10549E);
            iVar.g(h.x(mVar));
            iVar.i(this.f10546B);
            this.f10546B = null;
            this.f10557s.e(false);
            int iC = this.f10563y.c();
            int iO = this.f10563y.o();
            if ((Gravity.getAbsoluteGravity(this.f10554J, this.f10547C.getLayoutDirection()) & 7) == 5) {
                iC += this.f10547C.getWidth();
            }
            if (iVar.n(iC, iO)) {
                j.a aVar = this.f10549E;
                if (aVar == null) {
                    return true;
                }
                aVar.d(mVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.h
    public void l(e eVar) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f10551G = true;
        this.f10557s.close();
        ViewTreeObserver viewTreeObserver = this.f10550F;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f10550F = this.f10548D.getViewTreeObserver();
            }
            this.f10550F.removeGlobalOnLayoutListener(this.f10564z);
            this.f10550F = null;
        }
        this.f10548D.removeOnAttachStateChangeListener(this.f10545A);
        PopupWindow.OnDismissListener onDismissListener = this.f10546B;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.f10547C = view;
    }

    @Override // androidx.appcompat.view.menu.h
    public void r(boolean z9) {
        this.f10558t.d(z9);
    }

    @Override // androidx.appcompat.view.menu.h
    public void s(int i10) {
        this.f10554J = i10;
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(int i10) {
        this.f10563y.e(i10);
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f10546B = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(boolean z9) {
        this.f10555K = z9;
    }

    @Override // androidx.appcompat.view.menu.h
    public void w(int i10) {
        this.f10563y.l(i10);
    }
}
