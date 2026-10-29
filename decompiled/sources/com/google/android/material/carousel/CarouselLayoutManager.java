package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p225w4.k;

/* JADX INFO: loaded from: classes.dex */
public class CarouselLayoutManager extends RecyclerView.LayoutManager implements com.google.android.material.carousel.b, RecyclerView.SmoothScroller.ScrollVectorProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f16679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f16680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f16681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f16682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f16683e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.google.android.material.carousel.d f16684f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private g f16685g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private f f16686h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f16687i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map f16688j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.google.android.material.carousel.c f16689k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final View.OnLayoutChangeListener f16690l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f16691m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f16692n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f16693o;

    class a extends LinearSmoothScroller {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int calculateDxToMakeVisible(View view, int i10) {
            if (CarouselLayoutManager.this.f16685g == null || !CarouselLayoutManager.this.d()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.u(carouselLayoutManager.getPosition(view));
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int calculateDyToMakeVisible(View view, int i10) {
            if (CarouselLayoutManager.this.f16685g == null || CarouselLayoutManager.this.d()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.u(carouselLayoutManager.getPosition(view));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
        public PointF computeScrollVectorForPosition(int i10) {
            return CarouselLayoutManager.this.computeScrollVectorForPosition(i10);
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final View f16695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float f16696b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final float f16697c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final d f16698d;

        b(View view, float f10, float f11, d dVar) {
            this.f16695a = view;
            this.f16696b = f10;
            this.f16697c = f11;
            this.f16698d = dVar;
        }
    }

    private static class c extends RecyclerView.ItemDecoration {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Paint f16699a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f16700b;

        c() {
            Paint paint = new Paint();
            this.f16699a = paint;
            this.f16700b = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        void a(List list) {
            this.f16700b = Collections.unmodifiableList(list);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            super.onDrawOver(canvas, recyclerView, state);
            this.f16699a.setStrokeWidth(recyclerView.getResources().getDimension(p225w4.c.f28781q));
            for (f.c cVar : this.f16700b) {
                this.f16699a.setColor(p191t0.a.i(-65281, -16776961, cVar.f16731c));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).d()) {
                    canvas.drawLine(cVar.f16730b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).K(), cVar.f16730b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).F(), this.f16699a);
                } else {
                    canvas.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).H(), cVar.f16730b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).I(), cVar.f16730b, this.f16699a);
                }
            }
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final f.c f16701a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final f.c f16702b;

        d(f.c cVar, f.c cVar2) {
            B0.i.a(cVar.f16729a <= cVar2.f16729a);
            this.f16701a = cVar;
            this.f16702b = cVar2;
        }
    }

    public CarouselLayoutManager() {
        this(new j());
    }

    private int A() {
        int i10;
        int i11;
        if (getChildCount() <= 0) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) getChildAt(0).getLayoutParams();
        if (this.f16689k.f16711a == 0) {
            i10 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            i11 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        } else {
            i10 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            i11 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        return i10 + i11;
    }

    private f B(int i10) {
        f fVar;
        Map map = this.f16688j;
        return (map == null || (fVar = (f) map.get(Integer.valueOf(p221w0.a.b(i10, 0, Math.max(0, getItemCount() + (-1)))))) == null) ? this.f16685g.g() : fVar;
    }

    private int C() {
        if (getClipToPadding() || !this.f16684f.f()) {
            return 0;
        }
        return getOrientation() == 1 ? getPaddingTop() : getPaddingLeft();
    }

    private float D(float f10, d dVar) {
        f.c cVar = dVar.f16701a;
        float f11 = cVar.f16732d;
        f.c cVar2 = dVar.f16702b;
        return p235x4.a.b(f11, cVar2.f16732d, cVar.f16730b, cVar2.f16730b, f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int F() {
        return this.f16689k.g();
    }

    private int G() {
        return this.f16689k.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int H() {
        return this.f16689k.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int I() {
        return this.f16689k.j();
    }

    private int J() {
        return this.f16689k.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int K() {
        return this.f16689k.l();
    }

    private int L() {
        if (getClipToPadding() || !this.f16684f.f()) {
            return 0;
        }
        return getOrientation() == 1 ? getPaddingBottom() : getPaddingRight();
    }

    private int M(int i10, f fVar) {
        return (int) (P() ? ((y() - fVar.h().f16729a) - (i10 * fVar.f())) - (fVar.f() / 2.0f) : ((i10 * fVar.f()) - fVar.a().f16729a) + (fVar.f() / 2.0f));
    }

    private int N(int i10, f fVar) {
        int i11 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
        for (f.c cVar : fVar.e()) {
            float f10 = (i10 * fVar.f()) + (fVar.f() / 2.0f);
            int iY = (P() ? (int) ((y() - cVar.f16729a) - f10) : (int) (f10 - cVar.f16729a)) - this.f16679a;
            if (Math.abs(i11) > Math.abs(iY)) {
                i11 = iY;
            }
        }
        return i11;
    }

    private static d O(List list, float f10, boolean z9) {
        float f11 = Float.MAX_VALUE;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        float f12 = -3.4028235E38f;
        float f13 = Float.MAX_VALUE;
        float f14 = Float.MAX_VALUE;
        for (int i14 = 0; i14 < list.size(); i14++) {
            f.c cVar = (f.c) list.get(i14);
            float f15 = z9 ? cVar.f16730b : cVar.f16729a;
            float fAbs = Math.abs(f15 - f10);
            if (f15 <= f10 && fAbs <= f11) {
                i10 = i14;
                f11 = fAbs;
            }
            if (f15 > f10 && fAbs <= f13) {
                i12 = i14;
                f13 = fAbs;
            }
            if (f15 <= f14) {
                i11 = i14;
                f14 = f15;
            }
            if (f15 > f12) {
                i13 = i14;
                f12 = f15;
            }
        }
        if (i10 == -1) {
            i10 = i11;
        }
        if (i12 == -1) {
            i12 = i13;
        }
        return new d((f.c) list.get(i10), (f.c) list.get(i12));
    }

    private boolean Q(float f10, d dVar) {
        float fN = n(f10, D(f10, dVar) / 2.0f);
        if (P()) {
            return fN < 0.0f;
        }
        return fN > ((float) y());
    }

    private boolean R(float f10, d dVar) {
        float fM = m(f10, D(f10, dVar) / 2.0f);
        if (P()) {
            return fM > ((float) y());
        }
        return fM < 0.0f;
    }

    private void S() {
        if (this.f16682d && Log.isLoggable("CarouselLayoutManager", 3)) {
            Log.d("CarouselLayoutManager", "internal representation of views on the screen");
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                Log.d("CarouselLayoutManager", "item position " + getPosition(childAt) + ", center:" + z(childAt) + ", child index:" + i10);
            }
            Log.d("CarouselLayoutManager", "==============");
        }
    }

    private b T(RecyclerView.Recycler recycler, float f10, int i10) {
        View viewForPosition = recycler.getViewForPosition(i10);
        measureChildWithMargins(viewForPosition, 0, 0);
        float fM = m(f10, this.f16686h.f() / 2.0f);
        d dVarO = O(this.f16686h.g(), fM, false);
        return new b(viewForPosition, fM, r(viewForPosition, fM, dVarO), dVarO);
    }

    private float U(View view, float f10, float f11, Rect rect) {
        float fM = m(f10, f11);
        d dVarO = O(this.f16686h.g(), fM, false);
        float fR = r(view, fM, dVarO);
        super.getDecoratedBoundsWithMargins(view, rect);
        c0(view, fM, dVarO);
        this.f16689k.o(view, rect, f11, fR);
        return fR;
    }

    private void V(RecyclerView.Recycler recycler) {
        View viewForPosition = recycler.getViewForPosition(0);
        measureChildWithMargins(viewForPosition, 0, 0);
        f fVarG = this.f16684f.g(this, viewForPosition);
        if (P()) {
            fVarG = f.n(fVarG, y());
        }
        this.f16685g = g.f(this, fVarG, A(), C(), L());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W() {
        this.f16685g = null;
        requestLayout();
    }

    private void X(RecyclerView.Recycler recycler) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            float fZ = z(childAt);
            if (!R(fZ, O(this.f16686h.g(), fZ, true))) {
                break;
            } else {
                removeAndRecycleView(childAt, recycler);
            }
        }
        while (getChildCount() - 1 >= 0) {
            View childAt2 = getChildAt(getChildCount() - 1);
            float fZ2 = z(childAt2);
            if (!Q(fZ2, O(this.f16686h.g(), fZ2, true))) {
                return;
            } else {
                removeAndRecycleView(childAt2, recycler);
            }
        }
    }

    private void Y(RecyclerView recyclerView, int i10) {
        if (d()) {
            recyclerView.scrollBy(i10, 0);
        } else {
            recyclerView.scrollBy(0, i10);
        }
    }

    private void a0(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f29037L0);
            Z(typedArrayObtainStyledAttributes.getInt(k.f29046M0, 0));
            setOrientation(typedArrayObtainStyledAttributes.getInt(k.f29327p5, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void c0(View view, float f10, d dVar) {
        if (view instanceof h) {
            f.c cVar = dVar.f16701a;
            float f11 = cVar.f16731c;
            f.c cVar2 = dVar.f16702b;
            float fB = p235x4.a.b(f11, cVar2.f16731c, cVar.f16729a, cVar2.f16729a, f10);
            float height = view.getHeight();
            float width = view.getWidth();
            RectF rectFF = this.f16689k.f(height, width, p235x4.a.b(0.0f, height / 2.0f, 0.0f, 1.0f, fB), p235x4.a.b(0.0f, width / 2.0f, 0.0f, 1.0f, fB));
            float fR = r(view, f10, dVar);
            RectF rectF = new RectF(fR - (rectFF.width() / 2.0f), fR - (rectFF.height() / 2.0f), fR + (rectFF.width() / 2.0f), (rectFF.height() / 2.0f) + fR);
            RectF rectF2 = new RectF(H(), K(), I(), F());
            if (this.f16684f.f()) {
                this.f16689k.a(rectFF, rectF, rectF2);
            }
            this.f16689k.n(rectFF, rectF, rectF2);
            ((h) view).setMaskRectF(rectFF);
        }
    }

    private int convertFocusDirectionToLayoutDirection(int i10) {
        int orientation = getOrientation();
        if (i10 == 1) {
            return -1;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 17) {
            if (orientation == 0) {
                return P() ? 1 : -1;
            }
            return Integer.MIN_VALUE;
        }
        if (i10 == 33) {
            return orientation == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 == 66) {
            if (orientation == 0) {
                return P() ? -1 : 1;
            }
            return Integer.MIN_VALUE;
        }
        if (i10 == 130) {
            return orientation == 1 ? 1 : Integer.MIN_VALUE;
        }
        Log.d("CarouselLayoutManager", "Unknown focus request:" + i10);
        return Integer.MIN_VALUE;
    }

    private void d0(g gVar) {
        int i10 = this.f16681c;
        int i11 = this.f16680b;
        if (i10 <= i11) {
            this.f16686h = P() ? gVar.h() : gVar.l();
        } else {
            this.f16686h = gVar.j(this.f16679a, i11, i10);
        }
        this.f16683e.a(this.f16686h.g());
    }

    private void e0() {
        int itemCount = getItemCount();
        int i10 = this.f16691m;
        if (itemCount == i10 || this.f16685g == null) {
            return;
        }
        if (this.f16684f.h(this, i10)) {
            W();
        }
        this.f16691m = itemCount;
    }

    public static /* synthetic */ void f(final CarouselLayoutManager carouselLayoutManager, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        carouselLayoutManager.getClass();
        if (i10 == i14 && i11 == i15 && i12 == i16 && i13 == i17) {
            return;
        }
        view.post(new Runnable() { // from class: A4.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f223q.W();
            }
        });
    }

    private void f0() {
        if (!this.f16682d || getChildCount() < 1) {
            return;
        }
        int i10 = 0;
        while (i10 < getChildCount() - 1) {
            int position = getPosition(getChildAt(i10));
            int i11 = i10 + 1;
            int position2 = getPosition(getChildAt(i11));
            if (position > position2) {
                S();
                throw new IllegalStateException("Detected invalid child order. Child at index [" + i10 + "] had adapter position [" + position + "] and child at index [" + i11 + "] had adapter position [" + position2 + "].");
            }
            i10 = i11;
        }
    }

    private View getChildClosestToEnd() {
        return getChildAt(P() ? 0 : getChildCount() - 1);
    }

    private View getChildClosestToStart() {
        return getChildAt(P() ? getChildCount() - 1 : 0);
    }

    private void l(View view, int i10, b bVar) {
        float f10 = this.f16686h.f() / 2.0f;
        addView(view, i10);
        float f11 = bVar.f16697c;
        this.f16689k.m(view, (int) (f11 - f10), (int) (f11 + f10));
        c0(view, bVar.f16696b, bVar.f16698d);
    }

    private float m(float f10, float f11) {
        return P() ? f10 - f11 : f10 + f11;
    }

    private float n(float f10, float f11) {
        return P() ? f10 + f11 : f10 - f11;
    }

    private void o(RecyclerView.Recycler recycler, int i10, int i11) {
        if (i10 < 0 || i10 >= getItemCount()) {
            return;
        }
        b bVarT = T(recycler, s(i10), i10);
        l(bVarT.f16695a, i11, bVarT);
    }

    private void p(RecyclerView.Recycler recycler, RecyclerView.State state, int i10) {
        float fS = s(i10);
        while (i10 < state.getItemCount()) {
            b bVarT = T(recycler, fS, i10);
            if (Q(bVarT.f16697c, bVarT.f16698d)) {
                return;
            }
            fS = m(fS, this.f16686h.f());
            if (!R(bVarT.f16697c, bVarT.f16698d)) {
                l(bVarT.f16695a, -1, bVarT);
            }
            i10++;
        }
    }

    private void q(RecyclerView.Recycler recycler, int i10) {
        float fS = s(i10);
        while (i10 >= 0) {
            b bVarT = T(recycler, fS, i10);
            if (R(bVarT.f16697c, bVarT.f16698d)) {
                return;
            }
            fS = n(fS, this.f16686h.f());
            if (!Q(bVarT.f16697c, bVarT.f16698d)) {
                l(bVarT.f16695a, 0, bVarT);
            }
            i10--;
        }
    }

    private float r(View view, float f10, d dVar) {
        f.c cVar = dVar.f16701a;
        float f11 = cVar.f16730b;
        f.c cVar2 = dVar.f16702b;
        float fB = p235x4.a.b(f11, cVar2.f16730b, cVar.f16729a, cVar2.f16729a, f10);
        if (dVar.f16702b != this.f16686h.c() && dVar.f16701a != this.f16686h.j()) {
            return fB;
        }
        float fE = this.f16689k.e((RecyclerView.LayoutParams) view.getLayoutParams()) / this.f16686h.f();
        f.c cVar3 = dVar.f16702b;
        return fB + ((f10 - cVar3.f16729a) * ((1.0f - cVar3.f16731c) + fE));
    }

    private float s(int i10) {
        return m(J() - this.f16679a, this.f16686h.f() * i10);
    }

    private int scrollBy(int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getChildCount() == 0 || i10 == 0) {
            return 0;
        }
        if (this.f16685g == null) {
            V(recycler);
        }
        int iV = v(i10, this.f16679a, this.f16680b, this.f16681c);
        this.f16679a += iV;
        d0(this.f16685g);
        float f10 = this.f16686h.f() / 2.0f;
        float fS = s(getPosition(getChildAt(0)));
        Rect rect = new Rect();
        float f11 = P() ? this.f16686h.h().f16730b : this.f16686h.a().f16730b;
        float f12 = Float.MAX_VALUE;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            float fAbs = Math.abs(f11 - U(childAt, fS, f10, rect));
            if (childAt != null && fAbs < f12) {
                this.f16692n = getPosition(childAt);
                f12 = fAbs;
            }
            fS = m(fS, this.f16686h.f());
        }
        x(recycler, state);
        return iV;
    }

    private int t(RecyclerView.State state, g gVar) {
        boolean zP = P();
        f fVarL = zP ? gVar.l() : gVar.h();
        f.c cVarA = zP ? fVarL.a() : fVarL.h();
        int itemCount = (int) (((((state.getItemCount() - 1) * fVarL.f()) * (zP ? -1.0f : 1.0f)) - (cVarA.f16729a - J())) + (G() - cVarA.f16729a) + (zP ? -cVarA.f16735g : cVarA.f16736h));
        return zP ? Math.min(0, itemCount) : Math.max(0, itemCount);
    }

    private static int v(int i10, int i11, int i12, int i13) {
        int i14 = i11 + i10;
        if (i14 < i12) {
            return i12 - i11;
        }
        return i14 > i13 ? i13 - i11 : i10;
    }

    private int w(g gVar) {
        boolean zP = P();
        f fVarH = zP ? gVar.h() : gVar.l();
        return (int) (J() - n((zP ? fVarH.h() : fVarH.a()).f16729a, fVarH.f() / 2.0f));
    }

    private void x(RecyclerView.Recycler recycler, RecyclerView.State state) {
        X(recycler);
        if (getChildCount() == 0) {
            q(recycler, this.f16687i - 1);
            p(recycler, state, this.f16687i);
        } else {
            int position = getPosition(getChildAt(0));
            int position2 = getPosition(getChildAt(getChildCount() - 1));
            q(recycler, position - 1);
            p(recycler, state, position2 + 1);
        }
        f0();
    }

    private int y() {
        return d() ? a() : b();
    }

    private float z(View view) {
        Rect rect = new Rect();
        super.getDecoratedBoundsWithMargins(view, rect);
        return d() ? rect.centerX() : rect.centerY();
    }

    int E(int i10, f fVar) {
        return M(i10, fVar) - this.f16679a;
    }

    boolean P() {
        return d() && getLayoutDirection() == 1;
    }

    public void Z(int i10) {
        this.f16693o = i10;
        W();
    }

    @Override // com.google.android.material.carousel.b
    public int a() {
        return getWidth();
    }

    @Override // com.google.android.material.carousel.b
    public int b() {
        return getHeight();
    }

    public void b0(com.google.android.material.carousel.d dVar) {
        this.f16684f = dVar;
        W();
    }

    @Override // com.google.android.material.carousel.b
    public int c() {
        return this.f16693o;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return !d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(RecyclerView.State state) {
        if (getChildCount() == 0 || this.f16685g == null || getItemCount() <= 1) {
            return 0;
        }
        return (int) (getWidth() * (this.f16685g.g().f() / computeHorizontalScrollRange(state)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return this.f16679a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return this.f16681c - this.f16680b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public PointF computeScrollVectorForPosition(int i10) {
        if (this.f16685g == null) {
            return null;
        }
        int iE = E(i10, B(i10));
        return d() ? new PointF(iE, 0.0f) : new PointF(0.0f, iE);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(RecyclerView.State state) {
        if (getChildCount() == 0 || this.f16685g == null || getItemCount() <= 1) {
            return 0;
        }
        return (int) (getHeight() * (this.f16685g.g().f() / computeVerticalScrollRange(state)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return this.f16679a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        return this.f16681c - this.f16680b;
    }

    @Override // com.google.android.material.carousel.b
    public boolean d() {
        return this.f16689k.f16711a == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        super.getDecoratedBoundsWithMargins(view, rect);
        float fCenterY = rect.centerY();
        if (d()) {
            fCenterY = rect.centerX();
        }
        float fD = D(fCenterY, O(this.f16686h.g(), fCenterY, true));
        float fWidth = d() ? (rect.width() - fD) / 2.0f : 0.0f;
        float fHeight = d() ? 0.0f : (rect.height() - fD) / 2.0f;
        rect.set((int) (rect.left + fWidth), (int) (rect.top + fHeight), (int) (rect.right - fWidth), (int) (rect.bottom - fHeight));
    }

    public int getOrientation() {
        return this.f16689k.f16711a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void measureChildWithMargins(View view, int i10, int i11) {
        if (!(view instanceof h)) {
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        Rect rect = new Rect();
        calculateItemDecorationsForChild(view, rect);
        int i12 = i10 + rect.left + rect.right;
        int i13 = i11 + rect.top + rect.bottom;
        g gVar = this.f16685g;
        float f10 = (gVar == null || this.f16689k.f16711a != 0) ? ((ViewGroup.MarginLayoutParams) layoutParams).width : gVar.g().f();
        g gVar2 = this.f16685g;
        view.measure(RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + i12, (int) f10, canScrollHorizontally()), RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + i13, (int) ((gVar2 == null || this.f16689k.f16711a != 1) ? ((ViewGroup.MarginLayoutParams) layoutParams).height : gVar2.g().f()), canScrollVertically()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.f16684f.e(recyclerView.getContext());
        W();
        recyclerView.addOnLayoutChangeListener(this.f16690l);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        recyclerView.removeOnLayoutChangeListener(this.f16690l);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View onFocusSearchFailed(View view, int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int iConvertFocusDirectionToLayoutDirection;
        if (getChildCount() == 0 || (iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        if (iConvertFocusDirectionToLayoutDirection == -1) {
            if (getPosition(view) == 0) {
                return null;
            }
            o(recycler, getPosition(getChildAt(0)) - 1, 0);
            return getChildClosestToStart();
        }
        if (getPosition(view) == getItemCount() - 1) {
            return null;
        }
        o(recycler, getPosition(getChildAt(getChildCount() - 1)) + 1, -1);
        return getChildClosestToEnd();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(getPosition(getChildAt(0)));
            accessibilityEvent.setToIndex(getPosition(getChildAt(getChildCount() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(RecyclerView recyclerView, int i10, int i11) {
        super.onItemsAdded(recyclerView, i10, i11);
        e0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(RecyclerView recyclerView, int i10, int i11) {
        super.onItemsRemoved(recyclerView, i10, i11);
        e0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (state.getItemCount() <= 0 || y() <= 0.0f) {
            removeAndRecycleAllViews(recycler);
            this.f16687i = 0;
            return;
        }
        boolean zP = P();
        boolean z9 = this.f16685g == null;
        if (z9) {
            V(recycler);
        }
        int iW = w(this.f16685g);
        int iT = t(state, this.f16685g);
        this.f16680b = zP ? iT : iW;
        if (zP) {
            iT = iW;
        }
        this.f16681c = iT;
        if (z9) {
            this.f16679a = iW;
            this.f16688j = this.f16685g.i(getItemCount(), this.f16680b, this.f16681c, P());
            int i10 = this.f16692n;
            if (i10 != -1) {
                this.f16679a = M(i10, B(i10));
            }
        }
        int i11 = this.f16679a;
        this.f16679a = i11 + v(0, i11, this.f16680b, this.f16681c);
        this.f16687i = p221w0.a.b(this.f16687i, 0, state.getItemCount());
        d0(this.f16685g);
        detachAndScrapAttachedViews(recycler);
        x(recycler, state);
        this.f16691m = getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        if (getChildCount() == 0) {
            this.f16687i = 0;
        } else {
            this.f16687i = getPosition(getChildAt(0));
        }
        f0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z9, boolean z10) {
        int iN;
        if (this.f16685g == null || (iN = N(getPosition(view), B(getPosition(view)))) == 0) {
            return false;
        }
        Y(recyclerView, N(getPosition(view), this.f16685g.j(this.f16679a + v(iN, this.f16679a, this.f16680b, this.f16681c), this.f16680b, this.f16681c)));
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (canScrollHorizontally()) {
            return scrollBy(i10, recycler, state);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i10) {
        this.f16692n = i10;
        if (this.f16685g == null) {
            return;
        }
        this.f16679a = M(i10, B(i10));
        this.f16687i = p221w0.a.b(i10, 0, Math.max(0, getItemCount() - 1));
        d0(this.f16685g);
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i10, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (canScrollVertically()) {
            return scrollBy(i10, recycler, state);
        }
        return 0;
    }

    public void setOrientation(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i10);
        }
        assertNotInLayoutOrScroll(null);
        com.google.android.material.carousel.c cVar = this.f16689k;
        if (cVar == null || i10 != cVar.f16711a) {
            this.f16689k = com.google.android.material.carousel.c.c(this, i10);
            W();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i10) {
        a aVar = new a(recyclerView.getContext());
        aVar.setTargetPosition(i10);
        startSmoothScroll(aVar);
    }

    int u(int i10) {
        return (int) (this.f16679a - M(i10, B(i10)));
    }

    public CarouselLayoutManager(com.google.android.material.carousel.d dVar) {
        this(dVar, 0);
    }

    public CarouselLayoutManager(com.google.android.material.carousel.d dVar, int i10) {
        this.f16682d = false;
        this.f16683e = new c();
        this.f16687i = 0;
        this.f16690l = new View.OnLayoutChangeListener() { // from class: A4.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                CarouselLayoutManager.f(this.f222a, view, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        };
        this.f16692n = -1;
        this.f16693o = 0;
        b0(dVar);
        setOrientation(i10);
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f16682d = false;
        this.f16683e = new c();
        this.f16687i = 0;
        this.f16690l = new View.OnLayoutChangeListener() { // from class: A4.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                CarouselLayoutManager.f(this.f222a, view, i12, i13, i14, i15, i16, i17, i18, i19);
            }
        };
        this.f16692n = -1;
        this.f16693o = 0;
        b0(new j());
        a0(context, attributeSet);
    }
}
