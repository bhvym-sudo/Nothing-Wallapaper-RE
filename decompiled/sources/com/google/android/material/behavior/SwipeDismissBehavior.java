package com.google.android.material.behavior;

import C0.g;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.H;

/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    I0.c f16488q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    c f16489r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f16490s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f16491t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f16493v;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f16492u = 0.0f;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    int f16494w = 2;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    float f16495x = 0.5f;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    float f16496y = 0.0f;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    float f16497z = 0.5f;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final I0.c.AbstractC0101c f16487A = new a();

    class a extends I0.c.AbstractC0101c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f16498a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f16499b = -1;

        a() {
        }

        private boolean n(View view, float f10) {
            if (f10 == 0.0f) {
                return Math.abs(view.getLeft() - this.f16498a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f16495x);
            }
            boolean z9 = H.v(view) == 1;
            int i10 = SwipeDismissBehavior.this.f16494w;
            if (i10 == 2) {
                return true;
            }
            if (i10 == 0) {
                if (z9) {
                    return f10 < 0.0f;
                }
                return f10 > 0.0f;
            }
            if (i10 == 1) {
                if (z9) {
                    return f10 > 0.0f;
                }
                if (f10 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        @Override // I0.c.AbstractC0101c
        public int a(View view, int i10, int i11) {
            int width;
            int width2;
            int width3;
            boolean z9 = H.v(view) == 1;
            int i12 = SwipeDismissBehavior.this.f16494w;
            if (i12 == 0) {
                if (z9) {
                    width = this.f16498a - view.getWidth();
                    width2 = this.f16498a;
                } else {
                    width = this.f16498a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i12 != 1) {
                width = this.f16498a - view.getWidth();
                width2 = this.f16498a + view.getWidth();
            } else if (z9) {
                width = this.f16498a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f16498a - view.getWidth();
                width2 = this.f16498a;
            }
            return SwipeDismissBehavior.L(width, i10, width2);
        }

        @Override // I0.c.AbstractC0101c
        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // I0.c.AbstractC0101c
        public int d(View view) {
            return view.getWidth();
        }

        @Override // I0.c.AbstractC0101c
        public void i(View view, int i10) {
            this.f16499b = i10;
            this.f16498a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior.this.f16491t = true;
                parent.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.this.f16491t = false;
            }
        }

        @Override // I0.c.AbstractC0101c
        public void j(int i10) {
            c cVar = SwipeDismissBehavior.this.f16489r;
            if (cVar != null) {
                cVar.b(i10);
            }
        }

        @Override // I0.c.AbstractC0101c
        public void k(View view, int i10, int i11, int i12, int i13) {
            float width = view.getWidth() * SwipeDismissBehavior.this.f16496y;
            float width2 = view.getWidth() * SwipeDismissBehavior.this.f16497z;
            float fAbs = Math.abs(i10 - this.f16498a);
            if (fAbs <= width) {
                view.setAlpha(1.0f);
            } else if (fAbs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.K(0.0f, 1.0f - SwipeDismissBehavior.N(width, width2, fAbs), 1.0f));
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001d  */
        @Override // I0.c.AbstractC0101c
        public void l(View view, float f10, float f11) {
            int i10;
            boolean z9;
            c cVar;
            this.f16499b = -1;
            int width = view.getWidth();
            if (n(view, f10)) {
                if (f10 >= 0.0f) {
                    int left = view.getLeft();
                    int i11 = this.f16498a;
                    if (left < i11) {
                        i10 = this.f16498a - width;
                    } else {
                        i10 = i11 + width;
                    }
                } else {
                    i10 = this.f16498a - width;
                }
                z9 = true;
            } else {
                i10 = this.f16498a;
                z9 = false;
            }
            if (SwipeDismissBehavior.this.f16488q.N(i10, view.getTop())) {
                H.Y(view, new d(view, z9));
            } else {
                if (!z9 || (cVar = SwipeDismissBehavior.this.f16489r) == null) {
                    return;
                }
                cVar.a(view);
            }
        }

        @Override // I0.c.AbstractC0101c
        public boolean m(View view, int i10) {
            int i11 = this.f16499b;
            return (i11 == -1 || i11 == i10) && SwipeDismissBehavior.this.J(view);
        }
    }

    class b implements g {
        b() {
        }

        @Override // C0.g
        public boolean perform(View view, g.a aVar) {
            if (!SwipeDismissBehavior.this.J(view)) {
                return false;
            }
            boolean z9 = H.v(view) == 1;
            int i10 = SwipeDismissBehavior.this.f16494w;
            H.R(view, (!(i10 == 0 && z9) && (i10 != 1 || z9)) ? view.getWidth() : -view.getWidth());
            view.setAlpha(0.0f);
            c cVar = SwipeDismissBehavior.this.f16489r;
            if (cVar != null) {
                cVar.a(view);
            }
            return true;
        }
    }

    public interface c {
        void a(View view);

        void b(int i10);
    }

    private class d implements Runnable {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final View f16502q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final boolean f16503r;

        d(View view, boolean z9) {
            this.f16502q = view;
            this.f16503r = z9;
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar;
            I0.c cVar2 = SwipeDismissBehavior.this.f16488q;
            if (cVar2 != null && cVar2.n(true)) {
                H.Y(this.f16502q, this);
            } else {
                if (!this.f16503r || (cVar = SwipeDismissBehavior.this.f16489r) == null) {
                    return;
                }
                cVar.a(this.f16502q);
            }
        }
    }

    static float K(float f10, float f11, float f12) {
        return Math.min(Math.max(f10, f11), f12);
    }

    static int L(int i10, int i11, int i12) {
        return Math.min(Math.max(i10, i11), i12);
    }

    private void M(ViewGroup viewGroup) {
        if (this.f16488q == null) {
            this.f16488q = this.f16493v ? I0.c.o(viewGroup, this.f16492u, this.f16487A) : I0.c.p(viewGroup, this.f16487A);
        }
    }

    static float N(float f10, float f11, float f12) {
        return (f12 - f10) / (f11 - f10);
    }

    private void S(View view) {
        H.a0(view, 1048576);
        if (J(view)) {
            H.c0(view, C0.d.a.f559y, null, new b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f16488q == null) {
            return false;
        }
        if (this.f16491t && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f16488q.F(motionEvent);
        return true;
    }

    public boolean J(View view) {
        return true;
    }

    public void O(float f10) {
        this.f16497z = K(0.0f, f10, 1.0f);
    }

    public void P(c cVar) {
        this.f16489r = cVar;
    }

    public void Q(float f10) {
        this.f16496y = K(0.0f, f10, 1.0f);
    }

    public void R(int i10) {
        this.f16494w = i10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zV = this.f16490s;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zV = coordinatorLayout.v(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f16490s = zV;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f16490s = false;
        }
        if (zV) {
            M(coordinatorLayout);
            if (!this.f16491t && this.f16488q.O(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, View view, int i10) {
        boolean zP = super.p(coordinatorLayout, view, i10);
        if (H.t(view) == 0) {
            H.q0(view, 1);
            S(view);
        }
        return zP;
    }
}
