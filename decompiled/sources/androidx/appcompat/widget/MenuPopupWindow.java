package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.transition.Transition;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: loaded from: classes.dex */
public class MenuPopupWindow extends z implements A {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private A f10822W;

    public static class MenuDropDownListView extends w {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final int f10823D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final int f10824E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private A f10825F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private MenuItem f10826G;

        public MenuDropDownListView(Context context, boolean z9) {
            super(context, z9);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f10823D = 21;
                this.f10824E = 22;
            } else {
                this.f10823D = 22;
                this.f10824E = 21;
            }
        }

        @Override // androidx.appcompat.widget.w
        public /* bridge */ /* synthetic */ int d(int i10, int i11, int i12, int i13, int i14) {
            return super.d(i10, i11, i12, i13, i14);
        }

        @Override // androidx.appcompat.widget.w
        public /* bridge */ /* synthetic */ boolean e(MotionEvent motionEvent, int i10) {
            return super.e(motionEvent, i10);
        }

        @Override // androidx.appcompat.widget.w, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // androidx.appcompat.widget.w, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // androidx.appcompat.widget.w, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // androidx.appcompat.widget.w, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // androidx.appcompat.widget.w, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            androidx.appcompat.view.menu.d dVar;
            int headersCount;
            int iPointToPosition;
            int i10;
            if (this.f10825F != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    dVar = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
                } else {
                    dVar = (androidx.appcompat.view.menu.d) adapter;
                    headersCount = 0;
                }
                androidx.appcompat.view.menu.g item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i10 = iPointToPosition - headersCount) < 0 || i10 >= dVar.getCount()) ? null : dVar.getItem(i10);
                MenuItem menuItem = this.f10826G;
                if (menuItem != item) {
                    androidx.appcompat.view.menu.e eVarB = dVar.b();
                    if (menuItem != null) {
                        this.f10825F.g(eVarB, menuItem);
                    }
                    this.f10826G = item;
                    if (item != null) {
                        this.f10825F.d(eVarB, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i10, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i10 == this.f10823D) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i10 != this.f10824E) {
                return super.onKeyDown(i10, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (androidx.appcompat.view.menu.d) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (androidx.appcompat.view.menu.d) adapter).b().e(false);
            return true;
        }

        @Override // androidx.appcompat.widget.w, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(A a10) {
            this.f10825F = a10;
        }

        @Override // androidx.appcompat.widget.w, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static class a {
        static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    static class b {
        static void a(PopupWindow popupWindow, boolean z9) {
            popupWindow.setTouchModal(z9);
        }
    }

    public MenuPopupWindow(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    public void S(Object obj) {
        a.a(this.f11203V, (Transition) obj);
    }

    public void T(Object obj) {
        a.b(this.f11203V, (Transition) obj);
    }

    public void U(A a10) {
        this.f10822W = a10;
    }

    public void V(boolean z9) {
        b.a(this.f11203V, z9);
    }

    @Override // androidx.appcompat.widget.A
    public void d(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        A a10 = this.f10822W;
        if (a10 != null) {
            a10.d(eVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.A
    public void g(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        A a10 = this.f10822W;
        if (a10 != null) {
            a10.g(eVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.z
    w s(Context context, boolean z9) {
        MenuDropDownListView menuDropDownListView = new MenuDropDownListView(context, z9);
        menuDropDownListView.setHoverListener(this);
        return menuDropDownListView;
    }
}
