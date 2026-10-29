package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class K extends m {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final String[] f14054h0 = {"android:visibility:visibility", "android:visibility:parent"};

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private int f14055g0 = 3;

    private static class a extends AnimatorListenerAdapter implements m.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f14056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f14057b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ViewGroup f14058c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f14059d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f14060e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f14061f = false;

        a(View view, int i10, boolean z9) {
            this.f14056a = view;
            this.f14057b = i10;
            this.f14058c = (ViewGroup) view.getParent();
            this.f14059d = z9;
            d(true);
        }

        private void b() {
            if (!this.f14061f) {
                E.f(this.f14056a, this.f14057b);
                ViewGroup viewGroup = this.f14058c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            d(false);
        }

        private void d(boolean z9) {
            ViewGroup viewGroup;
            if (!this.f14059d || this.f14060e == z9 || (viewGroup = this.f14058c) == null) {
                return;
            }
            this.f14060e = z9;
            D.a(viewGroup, z9);
        }

        @Override // androidx.transition.m.h
        public void a(m mVar) {
        }

        @Override // androidx.transition.m.h
        public void c(m mVar) {
            d(false);
            if (this.f14061f) {
                return;
            }
            E.f(this.f14056a, this.f14057b);
        }

        @Override // androidx.transition.m.h
        public void f(m mVar) {
            mVar.h0(this);
        }

        @Override // androidx.transition.m.h
        public void i(m mVar) {
        }

        @Override // androidx.transition.m.h
        public void k(m mVar) {
            d(true);
            if (this.f14061f) {
                return;
            }
            E.f(this.f14056a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f14061f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z9) {
            if (z9) {
                return;
            }
            b();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z9) {
            if (z9) {
                E.f(this.f14056a, 0);
                ViewGroup viewGroup = this.f14058c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }
    }

    private class b extends AnimatorListenerAdapter implements m.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ViewGroup f14062a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f14063b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final View f14064c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f14065d = true;

        b(ViewGroup viewGroup, View view, View view2) {
            this.f14062a = viewGroup;
            this.f14063b = view;
            this.f14064c = view2;
        }

        private void b() {
            this.f14064c.setTag(AbstractC1173h.f14128a, null);
            this.f14062a.getOverlay().remove(this.f14063b);
            this.f14065d = false;
        }

        @Override // androidx.transition.m.h
        public void a(m mVar) {
        }

        @Override // androidx.transition.m.h
        public void c(m mVar) {
        }

        @Override // androidx.transition.m.h
        public void f(m mVar) {
            mVar.h0(this);
        }

        @Override // androidx.transition.m.h
        public void i(m mVar) {
            if (this.f14065d) {
                b();
            }
        }

        @Override // androidx.transition.m.h
        public void k(m mVar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f14062a.getOverlay().remove(this.f14063b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f14063b.getParent() == null) {
                this.f14062a.getOverlay().add(this.f14063b);
            } else {
                K.this.cancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z9) {
            if (z9) {
                this.f14064c.setTag(AbstractC1173h.f14128a, this.f14063b);
                this.f14062a.getOverlay().add(this.f14063b);
                this.f14065d = true;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z9) {
            if (z9) {
                return;
            }
            b();
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f14067a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f14068b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f14069c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f14070d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        ViewGroup f14071e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        ViewGroup f14072f;

        c() {
        }
    }

    private void v0(z zVar) {
        zVar.f14230a.put("android:visibility:visibility", Integer.valueOf(zVar.f14231b.getVisibility()));
        zVar.f14230a.put("android:visibility:parent", zVar.f14231b.getParent());
        int[] iArr = new int[2];
        zVar.f14231b.getLocationOnScreen(iArr);
        zVar.f14230a.put("android:visibility:screenLocation", iArr);
    }

    private c w0(z zVar, z zVar2) {
        c cVar = new c();
        cVar.f14067a = false;
        cVar.f14068b = false;
        if (zVar == null || !zVar.f14230a.containsKey("android:visibility:visibility")) {
            cVar.f14069c = -1;
            cVar.f14071e = null;
        } else {
            cVar.f14069c = ((Integer) zVar.f14230a.get("android:visibility:visibility")).intValue();
            cVar.f14071e = (ViewGroup) zVar.f14230a.get("android:visibility:parent");
        }
        if (zVar2 == null || !zVar2.f14230a.containsKey("android:visibility:visibility")) {
            cVar.f14070d = -1;
            cVar.f14072f = null;
        } else {
            cVar.f14070d = ((Integer) zVar2.f14230a.get("android:visibility:visibility")).intValue();
            cVar.f14072f = (ViewGroup) zVar2.f14230a.get("android:visibility:parent");
        }
        if (zVar != null && zVar2 != null) {
            int i10 = cVar.f14069c;
            int i11 = cVar.f14070d;
            if (i10 != i11 || cVar.f14071e != cVar.f14072f) {
                if (i10 != i11) {
                    if (i10 == 0) {
                        cVar.f14068b = false;
                        cVar.f14067a = true;
                        return cVar;
                    }
                    if (i11 == 0) {
                        cVar.f14068b = true;
                        cVar.f14067a = true;
                        return cVar;
                    }
                } else {
                    if (cVar.f14072f == null) {
                        cVar.f14068b = false;
                        cVar.f14067a = true;
                        return cVar;
                    }
                    if (cVar.f14071e == null) {
                        cVar.f14068b = true;
                        cVar.f14067a = true;
                        return cVar;
                    }
                }
            }
        } else {
            if (zVar == null && cVar.f14070d == 0) {
                cVar.f14068b = true;
                cVar.f14067a = true;
                return cVar;
            }
            if (zVar2 == null && cVar.f14069c == 0) {
                cVar.f14068b = false;
                cVar.f14067a = true;
            }
        }
        return cVar;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0036  */
    public Animator A0(ViewGroup viewGroup, z zVar, int i10, z zVar2, int i11) {
        View view;
        boolean z9;
        View view2;
        boolean z10;
        if ((this.f14055g0 & 2) != 2 || zVar == null) {
            return null;
        }
        View view3 = zVar.f14231b;
        View viewA = zVar2 != null ? zVar2.f14231b : null;
        int i12 = AbstractC1173h.f14128a;
        View view4 = (View) view3.getTag(i12);
        if (view4 != null) {
            view2 = null;
            z10 = true;
        } else {
            if (viewA == null || viewA.getParent() == null) {
                if (viewA != null) {
                    view = null;
                    z9 = false;
                } else {
                    viewA = null;
                    view = null;
                    z9 = true;
                }
            } else if (i11 == 4 || view3 == viewA) {
                view = viewA;
                z9 = false;
                viewA = null;
            } else {
                viewA = null;
                view = null;
                z9 = true;
            }
            if (z9) {
                if (view3.getParent() != null) {
                    if (view3.getParent() instanceof View) {
                        View view5 = (View) view3.getParent();
                        if (w0(R(view5, true), E(view5, true)).f14067a) {
                            int id = view5.getId();
                            if (view5.getParent() != null || id == -1 || viewGroup.findViewById(id) == null || !this.f14162M) {
                            }
                        } else {
                            viewA = y.a(viewGroup, view3, view5);
                        }
                    }
                    View view6 = view;
                    view4 = viewA;
                    view2 = view6;
                    z10 = false;
                }
                view2 = view;
                z10 = false;
                view4 = view3;
            } else {
                View view7 = view;
                view4 = viewA;
                view2 = view7;
                z10 = false;
            }
        }
        if (view4 == null) {
            if (view2 == null) {
                return null;
            }
            int visibility = view2.getVisibility();
            E.f(view2, 0);
            Animator animatorZ0 = z0(viewGroup, view2, zVar, zVar2);
            if (animatorZ0 == null) {
                E.f(view2, visibility);
                return animatorZ0;
            }
            a aVar = new a(view2, i11, true);
            animatorZ0.addListener(aVar);
            I().e(aVar);
            return animatorZ0;
        }
        if (!z10) {
            int[] iArr = (int[]) zVar.f14230a.get("android:visibility:screenLocation");
            int i13 = iArr[0];
            int i14 = iArr[1];
            int[] iArr2 = new int[2];
            viewGroup.getLocationOnScreen(iArr2);
            view4.offsetLeftAndRight((i13 - iArr2[0]) - view4.getLeft());
            view4.offsetTopAndBottom((i14 - iArr2[1]) - view4.getTop());
            viewGroup.getOverlay().add(view4);
        }
        Animator animatorZ1 = z0(viewGroup, view4, zVar, zVar2);
        if (!z10) {
            if (animatorZ1 == null) {
                viewGroup.getOverlay().remove(view4);
                return animatorZ1;
            }
            view3.setTag(i12, view4);
            b bVar = new b(viewGroup, view4, view3);
            animatorZ1.addListener(bVar);
            animatorZ1.addPauseListener(bVar);
            I().e(bVar);
        }
        return animatorZ1;
    }

    public void B0(int i10) {
        if ((i10 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f14055g0 = i10;
    }

    @Override // androidx.transition.m
    public String[] Q() {
        return f14054h0;
    }

    @Override // androidx.transition.m
    public boolean U(z zVar, z zVar2) {
        if (zVar == null && zVar2 == null) {
            return false;
        }
        if (zVar != null && zVar2 != null && zVar2.f14230a.containsKey("android:visibility:visibility") != zVar.f14230a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c cVarW0 = w0(zVar, zVar2);
        return cVarW0.f14067a && (cVarW0.f14069c == 0 || cVarW0.f14070d == 0);
    }

    @Override // androidx.transition.m
    public void m(z zVar) {
        v0(zVar);
    }

    @Override // androidx.transition.m
    public void p(z zVar) {
        v0(zVar);
    }

    @Override // androidx.transition.m
    public Animator t(ViewGroup viewGroup, z zVar, z zVar2) {
        c cVarW0 = w0(zVar, zVar2);
        if (!cVarW0.f14067a) {
            return null;
        }
        if (cVarW0.f14071e == null && cVarW0.f14072f == null) {
            return null;
        }
        return cVarW0.f14068b ? y0(viewGroup, zVar, cVarW0.f14069c, zVar2, cVarW0.f14070d) : A0(viewGroup, zVar, cVarW0.f14069c, zVar2, cVarW0.f14070d);
    }

    public abstract Animator x0(ViewGroup viewGroup, View view, z zVar, z zVar2);

    public Animator y0(ViewGroup viewGroup, z zVar, int i10, z zVar2, int i11) {
        if ((this.f14055g0 & 1) != 1 || zVar2 == null) {
            return null;
        }
        if (zVar == null) {
            View view = (View) zVar2.f14231b.getParent();
            if (w0(E(view, false), R(view, false)).f14067a) {
                return null;
            }
        }
        return x0(viewGroup, zVar2.f14231b, zVar, zVar2);
    }

    public abstract Animator z0(ViewGroup viewGroup, View view, z zVar, z zVar2);
}
