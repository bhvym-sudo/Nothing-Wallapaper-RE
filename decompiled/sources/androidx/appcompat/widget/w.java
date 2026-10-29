package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
class w extends ListView {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private androidx.core.view.O f11152A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private androidx.core.widget.j f11153B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    e f11154C;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Rect f11155q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f11156r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f11157s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f11158t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f11159u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f11160v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private d f11161w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f11162x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f11163y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f11164z;

    static class a {
        static void a(View view, float f10, float f11) {
            view.drawableHotspotChanged(f10, f11);
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static Method f11165a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static Method f11166b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static Method f11167c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static boolean f11168d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Boolean.TYPE;
                Class cls3 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
                f11165a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f11166b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f11167c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f11168d = true;
            } catch (NoSuchMethodException e10) {
                e10.printStackTrace();
            }
        }

        static boolean a() {
            return f11168d;
        }

        static void b(w wVar, int i10, View view) {
            try {
                f11165a.invoke(wVar, Integer.valueOf(i10), view, Boolean.FALSE, -1, -1);
                f11166b.invoke(wVar, Integer.valueOf(i10));
                f11167c.invoke(wVar, Integer.valueOf(i10));
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
            } catch (InvocationTargetException e11) {
                e11.printStackTrace();
            }
        }
    }

    static class c {
        static boolean a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        static void b(AbsListView absListView, boolean z9) {
            absListView.setSelectedChildViewEnabled(z9);
        }
    }

    private static class d extends p070h.a {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private boolean f11169r;

        d(Drawable drawable) {
            super(drawable);
            this.f11169r = true;
        }

        void b(boolean z9) {
            this.f11169r = z9;
        }

        @Override // p070h.a, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f11169r) {
                super.draw(canvas);
            }
        }

        @Override // p070h.a, android.graphics.drawable.Drawable
        public void setHotspot(float f10, float f11) {
            if (this.f11169r) {
                super.setHotspot(f10, f11);
            }
        }

        @Override // p070h.a, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i10, int i11, int i12, int i13) {
            if (this.f11169r) {
                super.setHotspotBounds(i10, i11, i12, i13);
            }
        }

        @Override // p070h.a, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f11169r) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // p070h.a, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z9, boolean z10) {
            if (this.f11169r) {
                return super.setVisible(z9, z10);
            }
            return false;
        }
    }

    private class e implements Runnable {
        e() {
        }

        public void a() {
            w wVar = w.this;
            wVar.f11154C = null;
            wVar.removeCallbacks(this);
        }

        public void b() {
            w.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            w wVar = w.this;
            wVar.f11154C = null;
            wVar.drawableStateChanged();
        }
    }

    w(Context context, boolean z9) {
        super(context, null, p050f.a.f20321A);
        this.f11155q = new Rect();
        this.f11156r = 0;
        this.f11157s = 0;
        this.f11158t = 0;
        this.f11159u = 0;
        this.f11163y = z9;
        setCacheColorHint(0);
    }

    private void a() {
        this.f11164z = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f11160v - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        androidx.core.view.O o9 = this.f11152A;
        if (o9 != null) {
            o9.c();
            this.f11152A = null;
        }
    }

    private void b(View view, int i10) {
        performItemClick(view, i10, getItemIdAtPosition(i10));
    }

    private void c(Canvas canvas) {
        Drawable selector;
        if (this.f11155q.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f11155q);
        selector.draw(canvas);
    }

    private void f(int i10, View view) {
        Rect rect = this.f11155q;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f11156r;
        rect.top -= this.f11157s;
        rect.right += this.f11158t;
        rect.bottom += this.f11159u;
        boolean zK = k();
        if (view.isEnabled() != zK) {
            l(!zK);
            if (i10 != -1) {
                refreshDrawableState();
            }
        }
    }

    private void g(int i10, View view) {
        Drawable selector = getSelector();
        boolean z9 = (selector == null || i10 == -1) ? false : true;
        if (z9) {
            selector.setVisible(false, false);
        }
        f(i10, view);
        if (z9) {
            Rect rect = this.f11155q;
            float fExactCenterX = rect.exactCenterX();
            float fExactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            p201u0.a.k(selector, fExactCenterX, fExactCenterY);
        }
    }

    private void h(int i10, View view, float f10, float f11) {
        g(i10, view);
        Drawable selector = getSelector();
        if (selector == null || i10 == -1) {
            return;
        }
        p201u0.a.k(selector, f10, f11);
    }

    private void i(View view, int i10, float f10, float f11) {
        View childAt;
        this.f11164z = true;
        a.a(this, f10, f11);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i11 = this.f11160v;
        if (i11 != -1 && (childAt = getChildAt(i11 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f11160v = i10;
        a.a(view, f10 - view.getLeft(), f11 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        h(i10, view, f10, f11);
        j(false);
        refreshDrawableState();
    }

    private void j(boolean z9) {
        d dVar = this.f11161w;
        if (dVar != null) {
            dVar.b(z9);
        }
    }

    private boolean k() {
        return c.a(this);
    }

    private void l(boolean z9) {
        c.b(this, z9);
    }

    private boolean m() {
        return this.f11164z;
    }

    private void n() {
        Drawable selector = getSelector();
        if (selector != null && m() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    public int d(int i10, int i11, int i12, int i13, int i14) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        View view = null;
        while (i15 < count) {
            int itemViewType = adapter.getItemViewType(i15);
            if (itemViewType != i16) {
                view = null;
                i16 = itemViewType;
            }
            view = adapter.getView(i15, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i18 = layoutParams.height;
            view.measure(i10, i18 > 0 ? View.MeasureSpec.makeMeasureSpec(i18, BasicMeasure.EXACTLY) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i15 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i13) {
                return (i14 < 0 || i15 <= i14 || i17 <= 0 || measuredHeight == i13) ? i13 : i17;
            }
            if (i14 >= 0 && i15 >= i14) {
                i17 = measuredHeight;
            }
            i15++;
        }
        return measuredHeight;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f11154C != null) {
            return;
        }
        super.drawableStateChanged();
        j(true);
        n();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0065  */
    /* JADX WARN: Code duplicated, block: B:32:0x0069  */
    /* JADX WARN: Code duplicated, block: B:9:0x0011  */
    public boolean e(MotionEvent motionEvent, int i10) {
        boolean z9;
        boolean z10;
        androidx.core.widget.j jVar;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            z9 = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z9 = true;
                    z10 = false;
                } else {
                    z10 = false;
                    z9 = false;
                }
                if (z9 || z10) {
                    a();
                }
                if (z9) {
                    jVar = this.f11153B;
                    if (jVar != null) {
                        jVar.m(false);
                    }
                    return z9;
                }
                if (this.f11153B == null) {
                    this.f11153B = new androidx.core.widget.j(this);
                }
                this.f11153B.m(true);
                this.f11153B.onTouch(this, motionEvent);
                return z9;
            }
            z9 = true;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i10);
        if (iFindPointerIndex < 0) {
            z10 = false;
            z9 = false;
        } else {
            int x9 = (int) motionEvent.getX(iFindPointerIndex);
            int y9 = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x9, y9);
            if (iPointToPosition == -1) {
                z10 = true;
            } else {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                i(childAt, iPointToPosition, x9, y9);
                if (actionMasked == 1) {
                    b(childAt, iPointToPosition);
                }
                z9 = true;
                z10 = false;
            }
        }
        if (z9) {
            a();
        } else {
            a();
        }
        if (z9) {
            jVar = this.f11153B;
            if (jVar != null) {
                jVar.m(false);
            }
            return z9;
        }
        if (this.f11153B == null) {
            this.f11153B = new androidx.core.widget.j(this);
        }
        this.f11153B.m(true);
        this.f11153B.onTouch(this, motionEvent);
        return z9;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f11163y || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f11163y || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f11163y || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f11163y && this.f11162x) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f11154C = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f11154C == null) {
            e eVar = new e();
            this.f11154C = eVar;
            eVar.b();
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (b.a()) {
                    b.b(this, iPointToPosition, childAt);
                } else {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                }
            }
            n();
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f11160v = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        e eVar = this.f11154C;
        if (eVar != null) {
            eVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    void setListSelectionHidden(boolean z9) {
        this.f11162x = z9;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        d dVar = drawable != null ? new d(drawable) : null;
        this.f11161w = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f11156r = rect.left;
        this.f11157s = rect.top;
        this.f11158t = rect.right;
        this.f11159u = rect.bottom;
    }
}
