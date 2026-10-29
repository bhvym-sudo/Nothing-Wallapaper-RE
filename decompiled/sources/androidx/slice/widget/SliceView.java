package androidx.slice.widget;

import android.app.PendingIntent;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.lifecycle.I;
import androidx.slice.Slice;
import androidx.slice.SliceItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class SliceView extends ViewGroup implements I, View.OnClickListener {

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final Comparator f13853T = new c();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f13854A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f13855B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f13856C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private boolean f13857D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f13858E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f13859F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f13860G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f13861H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private j f13862I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f13863J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f13864K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private View.OnClickListener f13865L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f13866M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f13867N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    boolean f13868O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    boolean f13869P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    int[] f13870Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    Runnable f13871R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    Runnable f13872S;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    androidx.slice.widget.d f13873q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    SliceChildView f13874r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    View.OnLongClickListener f13875s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    Handler f13876t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f13877u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Slice f13878v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private h f13879w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private List f13880x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private ActionRow f13881y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private p092j1.a f13882z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View.OnLongClickListener onLongClickListener;
            SliceView sliceView = SliceView.this;
            if (!sliceView.f13868O || (onLongClickListener = sliceView.f13875s) == null) {
                return;
            }
            sliceView.f13869P = true;
            onLongClickListener.onLongClick(sliceView);
            SliceView.this.performHapticFeedback(0);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SliceView.this.h()) {
                SliceView.this.f13874r.setShowLastUpdated(true);
                SliceView sliceView = SliceView.this;
                sliceView.f13874r.setSliceContent(sliceView.f13873q);
            }
            SliceView.this.f13876t.postDelayed(this, 60000L);
        }
    }

    static class c implements Comparator {
        c() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(p112l1.d dVar, p112l1.d dVar2) {
            int iA = dVar.a();
            int iA2 = dVar2.a();
            if (iA < 0 && iA2 < 0) {
                return 0;
            }
            if (iA < 0) {
                return 1;
            }
            if (iA2 < 0) {
                return -1;
            }
            if (iA2 < iA) {
                return 1;
            }
            return iA2 > iA ? -1 : 0;
        }
    }

    public interface d {
    }

    public SliceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p122m1.a.f23099b);
    }

    private void a() {
        this.f13874r.setSliceActionListener(null);
        SliceChildView sliceChildView = this.f13874r;
        if (sliceChildView instanceof LargeTemplateView) {
            ((LargeTemplateView) sliceChildView).setScrollable(this.f13855B);
        }
        this.f13874r.setStyle(this.f13862I);
        this.f13874r.setTint(getTintColor());
        androidx.slice.widget.d dVar = this.f13873q;
        if (dVar == null || dVar.h() == null) {
            this.f13874r.setLayoutDirection(2);
        } else {
            this.f13874r.setLayoutDirection(this.f13873q.h().g());
        }
    }

    private ViewGroup.LayoutParams c(View view) {
        if (!(view instanceof ShortcutView)) {
            return new ViewGroup.LayoutParams(-1, -1);
        }
        int i10 = this.f13858E;
        return new ViewGroup.LayoutParams(i10, i10);
    }

    private int d(int i10) {
        int i11;
        androidx.slice.widget.d dVar = this.f13873q;
        if (dVar == null || !dVar.s()) {
            return 0;
        }
        int mode = getMode();
        if (mode == 3) {
            return this.f13858E;
        }
        if (i10 <= 0 || i10 > (i11 = this.f13859F)) {
            this.f13873q.v(0);
            this.f13874r.setMaxSmallHeight(0);
        } else {
            this.f13873q.v(i11);
            this.f13874r.setMaxSmallHeight(this.f13859F);
            i10 = i11;
        }
        return mode == 2 ? this.f13873q.g(i10, this.f13855B) : this.f13873q.p();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    private boolean e(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f13876t.removeCallbacks(this.f13871R);
            this.f13866M = (int) motionEvent.getRawX();
            this.f13867N = (int) motionEvent.getRawY();
            this.f13868O = true;
            this.f13869P = false;
            this.f13876t.postDelayed(this.f13871R, ViewConfiguration.getLongPressTimeout());
        } else if (actionMasked == 1) {
            this.f13868O = false;
            this.f13869P = false;
            this.f13876t.removeCallbacks(this.f13871R);
        } else if (actionMasked == 2) {
            int rawX = ((int) motionEvent.getRawX()) - this.f13866M;
            int rawY = ((int) motionEvent.getRawY()) - this.f13867N;
            if ((rawX * rawX) + (rawY * rawY) > this.f13864K) {
                this.f13868O = false;
                this.f13876t.removeCallbacks(this.f13871R);
            }
        } else if (actionMasked == 3) {
            this.f13868O = false;
            this.f13869P = false;
            this.f13876t.removeCallbacks(this.f13871R);
        }
        return this.f13869P;
    }

    private void f(Context context, AttributeSet attributeSet, int i10, int i11) {
        j jVar = new j(context, attributeSet, i10, i11);
        this.f13862I = jVar;
        this.f13863J = jVar.i();
        this.f13858E = getContext().getResources().getDimensionPixelSize(p122m1.b.f23118s);
        this.f13859F = getContext().getResources().getDimensionPixelSize(p122m1.b.f23114o);
        this.f13860G = getResources().getDimensionPixelSize(p122m1.b.f23112m);
        this.f13861H = getResources().getDimensionPixelSize(p122m1.b.f23100a);
        LargeTemplateView largeTemplateView = new LargeTemplateView(getContext());
        this.f13874r = largeTemplateView;
        largeTemplateView.setMode(getMode());
        SliceChildView sliceChildView = this.f13874r;
        addView(sliceChildView, c(sliceChildView));
        a();
        ActionRow actionRow = new ActionRow(getContext(), true);
        this.f13881y = actionRow;
        actionRow.setBackground(new ColorDrawable(-1118482));
        ActionRow actionRow2 = this.f13881y;
        addView(actionRow2, c(actionRow2));
        p();
        int scaledTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f13864K = scaledTouchSlop * scaledTouchSlop;
        this.f13876t = new Handler();
        this.f13874r.b(getPaddingStart(), getPaddingTop(), getPaddingEnd(), getPaddingBottom());
        setClipToPadding(false);
        super.setOnClickListener(this);
    }

    private void g(Slice slice) {
        if (slice == null || slice.f() == null) {
            k(false);
            this.f13879w = null;
            return;
        }
        Slice slice2 = this.f13878v;
        if (slice2 == null || !slice2.f().equals(slice.f())) {
            k(false);
            this.f13879w = h.a(getContext(), slice.f());
        }
    }

    private long getTimeToExpiry() {
        p092j1.a aVar = this.f13882z;
        if (aVar == null) {
            return 0L;
        }
        long jB = aVar.b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jB == 0 || jB == -1 || jCurrentTimeMillis > jB) {
            return 0L;
        }
        return jB - jCurrentTimeMillis;
    }

    private int getTintColor() {
        int i10 = this.f13863J;
        if (i10 != -1) {
            return i10;
        }
        SliceItem sliceItemO = p112l1.f.o(this.f13878v, "int", TypedValues.Custom.S_COLOR);
        return sliceItemO != null ? sliceItemO.g() : k.d(getContext());
    }

    private boolean i() {
        p092j1.a aVar = this.f13882z;
        return aVar == null || aVar.b() == -1;
    }

    private void k(boolean z9) {
        h hVar = this.f13879w;
        if (hVar != null) {
            if (z9 && !this.f13857D) {
                hVar.c();
                this.f13857D = true;
            }
            if (z9 || !this.f13857D) {
                return;
            }
            this.f13879w.b();
            this.f13857D = false;
        }
    }

    public static String l(int i10) {
        if (i10 == 1) {
            return "MODE SMALL";
        }
        if (i10 == 2) {
            return "MODE LARGE";
        }
        if (i10 == 3) {
            return "MODE SHORTCUT";
        }
        return "unknown mode: " + i10;
    }

    private void n(boolean z9) {
        if (!this.f13856C || i()) {
            return;
        }
        if (z9) {
            this.f13876t.postDelayed(this.f13872S, h() ? 60000L : 60000 + getTimeToExpiry());
        } else {
            this.f13876t.removeCallbacks(this.f13872S);
        }
    }

    private void p() {
        if (this.f13880x == null) {
            this.f13881y.setVisibility(8);
            this.f13874r.setSliceActions(null);
            return;
        }
        ArrayList arrayList = new ArrayList(this.f13880x);
        Collections.sort(arrayList, f13853T);
        if (!this.f13854A || this.f13877u == 3 || this.f13880x.size() < 2) {
            this.f13874r.setSliceActions(arrayList);
            this.f13881y.setVisibility(8);
        } else {
            this.f13881y.g(arrayList, getTintColor());
            this.f13881y.setVisibility(0);
            this.f13874r.setSliceActions(null);
        }
    }

    private void q() {
        int mode = getMode();
        SliceChildView sliceChildView = this.f13874r;
        boolean z9 = sliceChildView instanceof ShortcutView;
        Set<SliceItem> loadingActions = sliceChildView.getLoadingActions();
        boolean z10 = true;
        if (mode == 3 && !z9) {
            removeView(this.f13874r);
            ShortcutView shortcutView = new ShortcutView(getContext());
            this.f13874r = shortcutView;
            addView(shortcutView, c(shortcutView));
        } else if (mode == 3 || !z9) {
            z10 = false;
        } else {
            removeView(this.f13874r);
            LargeTemplateView largeTemplateView = new LargeTemplateView(getContext());
            this.f13874r = largeTemplateView;
            addView(largeTemplateView, c(largeTemplateView));
        }
        this.f13874r.setMode(mode);
        if (z10) {
            this.f13874r.b(getPaddingStart(), getPaddingTop(), getPaddingEnd(), getPaddingBottom());
            a();
            androidx.slice.widget.d dVar = this.f13873q;
            if (dVar != null && dVar.s()) {
                this.f13874r.setSliceContent(this.f13873q);
            }
            this.f13874r.setLoadingActions(loadingActions);
        }
        p();
    }

    public int getMode() {
        return this.f13877u;
    }

    public Slice getSlice() {
        return this.f13878v;
    }

    public List<p112l1.d> getSliceActions() {
        List list = this.f13880x;
        if (list == null || !list.isEmpty()) {
            return this.f13880x;
        }
        return null;
    }

    boolean h() {
        p092j1.a aVar = this.f13882z;
        if (aVar == null) {
            return false;
        }
        long jB = aVar.b();
        return (jB == 0 || jB == -1 || System.currentTimeMillis() <= jB) ? false : true;
    }

    public boolean j() {
        if (this.f13865L != null) {
            return true;
        }
        androidx.slice.widget.d dVar = this.f13873q;
        return (dVar == null || dVar.j() == null) ? false : true;
    }

    @Override // androidx.lifecycle.I
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void b(Slice slice) {
        setSlice(slice);
    }

    public void o(int i10, boolean z9) {
        if (z9) {
            Log.e("SliceView", "Animation not supported yet");
        }
        if (this.f13877u == i10) {
            return;
        }
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            Log.w("SliceView", "Unknown mode: " + i10 + " please use one of MODE_SHORTCUT, MODE_SMALL, MODE_LARGE");
            i10 = 2;
        }
        this.f13877u = i10;
        q();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            k(true);
            n(true);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        androidx.slice.widget.d dVar = this.f13873q;
        if (dVar == null || dVar.j() == null) {
            View.OnClickListener onClickListener = this.f13865L;
            if (onClickListener != null) {
                onClickListener.onClick(this);
                return;
            }
            return;
        }
        try {
            p112l1.e eVar = new p112l1.e(this.f13873q.j());
            if (eVar.d().b(getContext(), null)) {
                this.f13874r.setActionLoading(eVar.f());
            }
        } catch (PendingIntent.CanceledException e10) {
            Log.e("SliceView", "PendingIntent for slice cannot be sent", e10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k(false);
        n(false);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f13875s != null ? e(motionEvent) : super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        SliceChildView sliceChildView = this.f13874r;
        sliceChildView.layout(0, 0, sliceChildView.getMeasuredWidth() + getPaddingRight() + getPaddingLeft(), sliceChildView.getMeasuredHeight());
        if (this.f13881y.getVisibility() != 8) {
            this.f13881y.layout(0, sliceChildView.getMeasuredHeight(), this.f13881y.getMeasuredWidth(), sliceChildView.getMeasuredHeight() + this.f13881y.getMeasuredHeight());
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        if (3 == this.f13877u) {
            size2 = this.f13858E;
            size = getPaddingLeft() + size2 + getPaddingRight();
        }
        int i12 = this.f13881y.getVisibility() != 8 ? this.f13861H : 0;
        int size3 = View.MeasureSpec.getSize(i11);
        int mode = View.MeasureSpec.getMode(i11);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int iD = d(((layoutParams == null || layoutParams.height != -2) && mode != 0) ? size3 : -1);
        int paddingTop = (size3 - getPaddingTop()) - getPaddingBottom();
        if (size3 >= iD + i12 || mode == 0) {
            if (mode == 1073741824) {
                iD = Math.min(iD, paddingTop);
            }
        } else if (getMode() != 2 || size3 < this.f13860G + i12) {
            if (getMode() == 3) {
                iD = this.f13858E;
            } else if (paddingTop > this.f13859F) {
                iD = paddingTop;
            }
        }
        int paddingTop2 = getPaddingTop() + iD + getPaddingBottom();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size2 + getPaddingLeft() + getPaddingRight(), BasicMeasure.EXACTLY);
        measureChild(this.f13874r, iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(paddingTop2, BasicMeasure.EXACTLY));
        measureChild(this.f13881y, iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(getPaddingTop() + i12 + getPaddingBottom(), BasicMeasure.EXACTLY));
        setMeasuredDimension(size, iD + i12 + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f13875s != null ? e(motionEvent) : super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (isAttachedToWindow()) {
            k(i10 == 0);
            n(i10 == 0);
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        k(i10 == 0);
        n(i10 == 0);
    }

    public void setAccentColor(int i10) {
        this.f13863J = i10;
        this.f13862I.o(i10);
        this.f13874r.setTint(getTintColor());
    }

    public void setClickInfo(int[] iArr) {
        this.f13870Q = iArr;
    }

    public void setMode(int i10) {
        o(i10, false);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f13865L = onClickListener;
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        super.setOnLongClickListener(onLongClickListener);
        this.f13875s = onLongClickListener;
    }

    public void setOnSliceActionListener(d dVar) {
        this.f13874r.setSliceActionListener(null);
    }

    public void setScrollable(boolean z9) {
        if (z9 != this.f13855B) {
            this.f13855B = z9;
            SliceChildView sliceChildView = this.f13874r;
            if (sliceChildView instanceof LargeTemplateView) {
                ((LargeTemplateView) sliceChildView).setScrollable(z9);
            }
        }
    }

    public void setShowActionRow(boolean z9) {
        this.f13854A = z9;
        p();
    }

    public void setSlice(Slice slice) {
        g(slice);
        if (slice == null || this.f13878v == null || !slice.f().equals(this.f13878v.f())) {
            this.f13874r.a();
        } else {
            p092j1.a aVarA = p092j1.a.a(getContext(), this.f13878v);
            p092j1.a aVarA2 = p092j1.a.a(getContext(), slice);
            if (aVarA.d() == 2 && aVarA2.d() == 0) {
                return;
            }
        }
        this.f13878v = slice;
        androidx.slice.widget.d dVar = new androidx.slice.widget.d(getContext(), this.f13878v, this.f13862I);
        this.f13873q = dVar;
        if (!dVar.s()) {
            this.f13880x = null;
            this.f13874r.a();
            p();
            return;
        }
        this.f13874r.setLoadingActions(null);
        p092j1.a aVarA3 = p092j1.a.a(getContext(), this.f13878v);
        this.f13882z = aVarA3;
        this.f13880x = aVarA3.e();
        this.f13874r.setLastUpdated(this.f13882z.c());
        this.f13874r.setShowLastUpdated(this.f13856C && h());
        this.f13874r.setAllowTwoLines(this.f13882z.g());
        this.f13874r.setTint(getTintColor());
        if (this.f13873q.h() != null) {
            this.f13874r.setLayoutDirection(this.f13873q.h().g());
        } else {
            this.f13874r.setLayoutDirection(2);
        }
        this.f13874r.setSliceContent(this.f13873q);
        p();
        k(true);
        n(true);
    }

    public void setSliceActions(List<p112l1.d> list) {
        p092j1.a aVar;
        if (this.f13878v == null || (aVar = this.f13882z) == null) {
            throw new IllegalStateException("Trying to set actions on a view without a slice");
        }
        List listE = aVar.e();
        if (listE != null && list != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                if (!listE.contains(list.get(i10))) {
                    throw new IllegalArgumentException("Trying to set an action that isn't available: " + list.get(i10));
                }
            }
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        this.f13880x = list;
        p();
    }

    public void setTint(int i10) {
        setAccentColor(i10);
    }

    public SliceView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f13877u = 2;
        this.f13854A = false;
        this.f13855B = true;
        this.f13856C = true;
        this.f13857D = false;
        this.f13863J = -1;
        this.f13871R = new a();
        this.f13872S = new b();
        f(context, attributeSet, i10, p122m1.g.f23145a);
    }
}
