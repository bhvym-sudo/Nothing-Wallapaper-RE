package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

/* JADX INFO: loaded from: classes.dex */
public class z implements p100k.e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f11182A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f11183B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f11184C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f11185D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    int f11186E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private View f11187F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f11188G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private DataSetObserver f11189H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private View f11190I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private Drawable f11191J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private AdapterView.OnItemClickListener f11192K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private AdapterView.OnItemSelectedListener f11193L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    final i f11194M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final h f11195N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final g f11196O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private final e f11197P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private Runnable f11198Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    final Handler f11199R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final Rect f11200S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private Rect f11201T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private boolean f11202U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    PopupWindow f11203V;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Context f11204q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ListAdapter f11205r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    w f11206s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f11207t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f11208u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f11209v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f11210w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f11211x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f11212y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f11213z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewT = z.this.t();
            if (viewT == null || viewT.getWindowToken() == null) {
                return;
            }
            z.this.b();
        }
    }

    class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i10, long j9) {
            w wVar;
            if (i10 == -1 || (wVar = z.this.f11206s) == null) {
                return;
            }
            wVar.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static class c {
        static int a(PopupWindow popupWindow, View view, int i10, boolean z9) {
            return popupWindow.getMaxAvailableHeight(view, i10, z9);
        }
    }

    static class d {
        static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        static void b(PopupWindow popupWindow, boolean z9) {
            popupWindow.setIsClippedToScreen(z9);
        }
    }

    private class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            z.this.r();
        }
    }

    private class f extends DataSetObserver {
        f() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (z.this.a()) {
                z.this.b();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            z.this.dismiss();
        }
    }

    private class g implements AbsListView.OnScrollListener {
        g() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
            if (i10 != 1 || z.this.A() || z.this.f11203V.getContentView() == null) {
                return;
            }
            z zVar = z.this;
            zVar.f11199R.removeCallbacks(zVar.f11194M);
            z.this.f11194M.run();
        }
    }

    private class h implements View.OnTouchListener {
        h() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x9 = (int) motionEvent.getX();
            int y9 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = z.this.f11203V) != null && popupWindow.isShowing() && x9 >= 0 && x9 < z.this.f11203V.getWidth() && y9 >= 0 && y9 < z.this.f11203V.getHeight()) {
                z zVar = z.this;
                zVar.f11199R.postDelayed(zVar.f11194M, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            z zVar2 = z.this;
            zVar2.f11199R.removeCallbacks(zVar2.f11194M);
            return false;
        }
    }

    private class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w wVar = z.this.f11206s;
            if (wVar == null || !wVar.isAttachedToWindow() || z.this.f11206s.getCount() <= z.this.f11206s.getChildCount()) {
                return;
            }
            int childCount = z.this.f11206s.getChildCount();
            z zVar = z.this;
            if (childCount <= zVar.f11186E) {
                zVar.f11203V.setInputMethodMode(2);
                z.this.b();
            }
        }
    }

    public z(Context context) {
        this(context, null, p050f.a.f20325E);
    }

    private void C() {
        View view = this.f11187F;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f11187F);
            }
        }
    }

    private void O(boolean z9) {
        d.b(this.f11203V, z9);
    }

    private int q() {
        int measuredHeight;
        int i10;
        int iMakeMeasureSpec;
        View view;
        int i11;
        if (this.f11206s == null) {
            Context context = this.f11204q;
            this.f11198Q = new a();
            w wVarS = s(context, !this.f11202U);
            this.f11206s = wVarS;
            Drawable drawable = this.f11191J;
            if (drawable != null) {
                wVarS.setSelector(drawable);
            }
            this.f11206s.setAdapter(this.f11205r);
            this.f11206s.setOnItemClickListener(this.f11192K);
            this.f11206s.setFocusable(true);
            this.f11206s.setFocusableInTouchMode(true);
            this.f11206s.setOnItemSelectedListener(new b());
            this.f11206s.setOnScrollListener(this.f11196O);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f11193L;
            if (onItemSelectedListener != null) {
                this.f11206s.setOnItemSelectedListener(onItemSelectedListener);
            }
            w wVar = this.f11206s;
            View view2 = this.f11187F;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i12 = this.f11188G;
                if (i12 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(wVar, layoutParams);
                } else if (i12 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.f11188G);
                } else {
                    linearLayout.addView(wVar, layoutParams);
                    linearLayout.addView(view2);
                }
                int i13 = this.f11208u;
                if (i13 >= 0) {
                    i11 = Integer.MIN_VALUE;
                } else {
                    i13 = 0;
                    i11 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i13, i11), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                measuredHeight = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                measuredHeight = 0;
                view = wVar;
            }
            this.f11203V.setContentView(view);
        } else {
            View view3 = this.f11187F;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                measuredHeight = 0;
            }
        }
        Drawable background = this.f11203V.getBackground();
        if (background != null) {
            background.getPadding(this.f11200S);
            Rect rect = this.f11200S;
            int i14 = rect.top;
            i10 = rect.bottom + i14;
            if (!this.f11212y) {
                this.f11210w = -i14;
            }
        } else {
            this.f11200S.setEmpty();
            i10 = 0;
        }
        int iU = u(t(), this.f11210w, this.f11203V.getInputMethodMode() == 2);
        if (this.f11184C || this.f11207t == -1) {
            return iU + i10;
        }
        int i15 = this.f11208u;
        if (i15 == -2) {
            int i16 = this.f11204q.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.f11200S;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i15 != -1) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, BasicMeasure.EXACTLY);
        } else {
            int i17 = this.f11204q.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.f11200S;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17 - (rect3.left + rect3.right), BasicMeasure.EXACTLY);
        }
        int iD = this.f11206s.d(iMakeMeasureSpec, 0, -1, iU - measuredHeight, -1);
        if (iD > 0) {
            measuredHeight += i10 + this.f11206s.getPaddingTop() + this.f11206s.getPaddingBottom();
        }
        return iD + measuredHeight;
    }

    private int u(View view, int i10, boolean z9) {
        return c.a(this.f11203V, view, i10, z9);
    }

    public boolean A() {
        return this.f11203V.getInputMethodMode() == 2;
    }

    public boolean B() {
        return this.f11202U;
    }

    public void D(View view) {
        this.f11190I = view;
    }

    public void E(int i10) {
        this.f11203V.setAnimationStyle(i10);
    }

    public void F(int i10) {
        Drawable background = this.f11203V.getBackground();
        if (background == null) {
            R(i10);
            return;
        }
        background.getPadding(this.f11200S);
        Rect rect = this.f11200S;
        this.f11208u = rect.left + rect.right + i10;
    }

    public void G(int i10) {
        this.f11183B = i10;
    }

    public void H(Rect rect) {
        this.f11201T = rect != null ? new Rect(rect) : null;
    }

    public void I(int i10) {
        this.f11203V.setInputMethodMode(i10);
    }

    public void J(boolean z9) {
        this.f11202U = z9;
        this.f11203V.setFocusable(z9);
    }

    public void K(PopupWindow.OnDismissListener onDismissListener) {
        this.f11203V.setOnDismissListener(onDismissListener);
    }

    public void L(AdapterView.OnItemClickListener onItemClickListener) {
        this.f11192K = onItemClickListener;
    }

    public void M(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f11193L = onItemSelectedListener;
    }

    public void N(boolean z9) {
        this.f11182A = true;
        this.f11213z = z9;
    }

    public void P(int i10) {
        this.f11188G = i10;
    }

    public void Q(int i10) {
        w wVar = this.f11206s;
        if (!a() || wVar == null) {
            return;
        }
        wVar.setListSelectionHidden(false);
        wVar.setSelection(i10);
        if (wVar.getChoiceMode() != 0) {
            wVar.setItemChecked(i10, true);
        }
    }

    public void R(int i10) {
        this.f11208u = i10;
    }

    @Override // p100k.e
    public boolean a() {
        return this.f11203V.isShowing();
    }

    @Override // p100k.e
    public void b() {
        int iQ = q();
        boolean zA = A();
        androidx.core.widget.k.b(this.f11203V, this.f11211x);
        if (this.f11203V.isShowing()) {
            if (t().isAttachedToWindow()) {
                int width = this.f11208u;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = t().getWidth();
                }
                int i10 = this.f11207t;
                if (i10 == -1) {
                    if (!zA) {
                        iQ = -1;
                    }
                    if (zA) {
                        this.f11203V.setWidth(this.f11208u == -1 ? -1 : 0);
                        this.f11203V.setHeight(0);
                    } else {
                        this.f11203V.setWidth(this.f11208u == -1 ? -1 : 0);
                        this.f11203V.setHeight(-1);
                    }
                } else if (i10 != -2) {
                    iQ = i10;
                }
                this.f11203V.setOutsideTouchable((this.f11185D || this.f11184C) ? false : true);
                this.f11203V.update(t(), this.f11209v, this.f11210w, width < 0 ? -1 : width, iQ < 0 ? -1 : iQ);
                return;
            }
            return;
        }
        int width2 = this.f11208u;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = t().getWidth();
        }
        int i11 = this.f11207t;
        if (i11 == -1) {
            iQ = -1;
        } else if (i11 != -2) {
            iQ = i11;
        }
        this.f11203V.setWidth(width2);
        this.f11203V.setHeight(iQ);
        O(true);
        this.f11203V.setOutsideTouchable((this.f11185D || this.f11184C) ? false : true);
        this.f11203V.setTouchInterceptor(this.f11195N);
        if (this.f11182A) {
            androidx.core.widget.k.a(this.f11203V, this.f11213z);
        }
        d.a(this.f11203V, this.f11201T);
        androidx.core.widget.k.c(this.f11203V, t(), this.f11209v, this.f11210w, this.f11183B);
        this.f11206s.setSelection(-1);
        if (!this.f11202U || this.f11206s.isInTouchMode()) {
            r();
        }
        if (this.f11202U) {
            return;
        }
        this.f11199R.post(this.f11197P);
    }

    public int c() {
        return this.f11209v;
    }

    @Override // p100k.e
    public void dismiss() {
        this.f11203V.dismiss();
        C();
        this.f11203V.setContentView(null);
        this.f11206s = null;
        this.f11199R.removeCallbacks(this.f11194M);
    }

    public void e(int i10) {
        this.f11209v = i10;
    }

    public Drawable h() {
        return this.f11203V.getBackground();
    }

    @Override // p100k.e
    public ListView j() {
        return this.f11206s;
    }

    public void k(Drawable drawable) {
        this.f11203V.setBackgroundDrawable(drawable);
    }

    public void l(int i10) {
        this.f11210w = i10;
        this.f11212y = true;
    }

    public int o() {
        if (this.f11212y) {
            return this.f11210w;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f11189H;
        if (dataSetObserver == null) {
            this.f11189H = new f();
        } else {
            ListAdapter listAdapter2 = this.f11205r;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f11205r = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f11189H);
        }
        w wVar = this.f11206s;
        if (wVar != null) {
            wVar.setAdapter(this.f11205r);
        }
    }

    public void r() {
        w wVar = this.f11206s;
        if (wVar != null) {
            wVar.setListSelectionHidden(true);
            wVar.requestLayout();
        }
    }

    w s(Context context, boolean z9) {
        return new w(context, z9);
    }

    public View t() {
        return this.f11190I;
    }

    public Object v() {
        if (a()) {
            return this.f11206s.getSelectedItem();
        }
        return null;
    }

    public long w() {
        if (a()) {
            return this.f11206s.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public int x() {
        if (a()) {
            return this.f11206s.getSelectedItemPosition();
        }
        return -1;
    }

    public View y() {
        if (a()) {
            return this.f11206s.getSelectedView();
        }
        return null;
    }

    public int z() {
        return this.f11208u;
    }

    public z(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public z(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f11207t = -2;
        this.f11208u = -2;
        this.f11211x = 1002;
        this.f11183B = 0;
        this.f11184C = false;
        this.f11185D = false;
        this.f11186E = SubsamplingScaleImageView.TILE_SIZE_AUTO;
        this.f11188G = 0;
        this.f11194M = new i();
        this.f11195N = new h();
        this.f11196O = new g();
        this.f11197P = new e();
        this.f11200S = new Rect();
        this.f11204q = context;
        this.f11199R = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p050f.j.f20652l1, i10, i11);
        this.f11209v = typedArrayObtainStyledAttributes.getDimensionPixelOffset(p050f.j.f20657m1, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(p050f.j.f20662n1, 0);
        this.f11210w = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f11212y = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C1016m c1016m = new C1016m(context, attributeSet, i10, i11);
        this.f11203V = c1016m;
        c1016m.setInputMethodMode(1);
    }
}
