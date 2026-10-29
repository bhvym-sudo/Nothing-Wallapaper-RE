package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* JADX INFO: renamed from: androidx.transition.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1167b extends m {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final String[] f14074h0 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final Property f14075i0 = new a(PointF.class, "topLeft");

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final Property f14076j0 = new C0416b(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final Property f14077k0 = new c(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final Property f14078l0 = new d(PointF.class, "topLeft");

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final Property f14079m0 = new e(PointF.class, "position");

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final C1174i f14080n0 = new C1174i();

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private boolean f14081g0 = false;

    /* JADX INFO: renamed from: androidx.transition.b$a */
    class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(i iVar, PointF pointF) {
            iVar.c(pointF);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$b, reason: collision with other inner class name */
    class C0416b extends Property {
        C0416b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(i iVar, PointF pointF) {
            iVar.a(pointF);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$c */
    class c extends Property {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            E.d(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$d */
    class d extends Property {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            E.d(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$e */
    class e extends Property {
        e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int iRound = Math.round(pointF.x);
            int iRound2 = Math.round(pointF.y);
            E.d(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$f */
    class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f14082a;
        private final i mViewBounds;

        f(i iVar) {
            this.f14082a = iVar;
            this.mViewBounds = iVar;
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$g */
    private static class g extends AnimatorListenerAdapter implements m.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f14084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Rect f14085b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f14086c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Rect f14087d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f14088e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f14089f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f14090g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f14091h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f14092i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int f14093j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f14094k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f14095l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final int f14096m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f14097n;

        g(View view, Rect rect, boolean z9, Rect rect2, boolean z10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f14084a = view;
            this.f14085b = rect;
            this.f14086c = z9;
            this.f14087d = rect2;
            this.f14088e = z10;
            this.f14089f = i10;
            this.f14090g = i11;
            this.f14091h = i12;
            this.f14092i = i13;
            this.f14093j = i14;
            this.f14094k = i15;
            this.f14095l = i16;
            this.f14096m = i17;
        }

        @Override // androidx.transition.m.h
        public void a(m mVar) {
        }

        @Override // androidx.transition.m.h
        public void c(m mVar) {
            this.f14084a.setTag(AbstractC1173h.f14129b, this.f14084a.getClipBounds());
            this.f14084a.setClipBounds(this.f14088e ? null : this.f14087d);
        }

        @Override // androidx.transition.m.h
        public void f(m mVar) {
        }

        @Override // androidx.transition.m.h
        public void i(m mVar) {
            this.f14097n = true;
        }

        @Override // androidx.transition.m.h
        public void k(m mVar) {
            View view = this.f14084a;
            int i10 = AbstractC1173h.f14129b;
            Rect rect = (Rect) view.getTag(i10);
            this.f14084a.setTag(i10, null);
            this.f14084a.setClipBounds(rect);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            onAnimationStart(animator, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z9) {
            if (this.f14097n) {
                return;
            }
            Rect rect = null;
            if (z9) {
                if (!this.f14086c) {
                    rect = this.f14085b;
                }
            } else if (!this.f14088e) {
                rect = this.f14087d;
            }
            this.f14084a.setClipBounds(rect);
            if (z9) {
                E.d(this.f14084a, this.f14089f, this.f14090g, this.f14091h, this.f14092i);
            } else {
                E.d(this.f14084a, this.f14093j, this.f14094k, this.f14095l, this.f14096m);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z9) {
            int iMax = Math.max(this.f14091h - this.f14089f, this.f14095l - this.f14093j);
            int iMax2 = Math.max(this.f14092i - this.f14090g, this.f14096m - this.f14094k);
            int i10 = z9 ? this.f14093j : this.f14089f;
            int i11 = z9 ? this.f14094k : this.f14090g;
            E.d(this.f14084a, i10, i11, iMax + i10, iMax2 + i11);
            this.f14084a.setClipBounds(z9 ? this.f14087d : this.f14085b);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$h */
    private static class h extends t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f14098a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ViewGroup f14099b;

        h(ViewGroup viewGroup) {
            this.f14099b = viewGroup;
        }

        @Override // androidx.transition.t, androidx.transition.m.h
        public void c(m mVar) {
            D.a(this.f14099b, false);
        }

        @Override // androidx.transition.t, androidx.transition.m.h
        public void f(m mVar) {
            if (!this.f14098a) {
                D.a(this.f14099b, false);
            }
            mVar.h0(this);
        }

        @Override // androidx.transition.t, androidx.transition.m.h
        public void i(m mVar) {
            D.a(this.f14099b, false);
            this.f14098a = true;
        }

        @Override // androidx.transition.t, androidx.transition.m.h
        public void k(m mVar) {
            D.a(this.f14099b, true);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.b$i */
    private static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f14100a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f14101b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f14102c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f14103d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final View f14104e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f14105f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f14106g;

        i(View view) {
            this.f14104e = view;
        }

        private void b() {
            E.d(this.f14104e, this.f14100a, this.f14101b, this.f14102c, this.f14103d);
            this.f14105f = 0;
            this.f14106g = 0;
        }

        void a(PointF pointF) {
            this.f14102c = Math.round(pointF.x);
            this.f14103d = Math.round(pointF.y);
            int i10 = this.f14106g + 1;
            this.f14106g = i10;
            if (this.f14105f == i10) {
                b();
            }
        }

        void c(PointF pointF) {
            this.f14100a = Math.round(pointF.x);
            this.f14101b = Math.round(pointF.y);
            int i10 = this.f14105f + 1;
            this.f14105f = i10;
            if (i10 == this.f14106g) {
                b();
            }
        }
    }

    private void v0(z zVar) {
        View view = zVar.f14231b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        zVar.f14230a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        zVar.f14230a.put("android:changeBounds:parent", zVar.f14231b.getParent());
        if (this.f14081g0) {
            zVar.f14230a.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    @Override // androidx.transition.m
    public String[] Q() {
        return f14074h0;
    }

    @Override // androidx.transition.m
    public boolean T() {
        return true;
    }

    @Override // androidx.transition.m
    public void m(z zVar) {
        v0(zVar);
    }

    @Override // androidx.transition.m
    public void p(z zVar) {
        Rect rect;
        v0(zVar);
        if (!this.f14081g0 || (rect = (Rect) zVar.f14231b.getTag(AbstractC1173h.f14129b)) == null) {
            return;
        }
        zVar.f14230a.put("android:changeBounds:clip", rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.transition.m
    public Animator t(ViewGroup viewGroup, z zVar, z zVar2) {
        int i10;
        ObjectAnimator objectAnimatorA;
        int i11;
        Rect rect;
        Animator animator;
        Animator animatorC;
        if (zVar == null || zVar2 == null) {
            return null;
        }
        Map map = zVar.f14230a;
        Map map2 = zVar2.f14230a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = zVar2.f14231b;
        Rect rect2 = (Rect) zVar.f14230a.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) zVar2.f14230a.get("android:changeBounds:bounds");
        int i12 = rect2.left;
        int i13 = rect3.left;
        int i14 = rect2.top;
        int i15 = rect3.top;
        int i16 = rect2.right;
        int i17 = rect3.right;
        int i18 = rect2.bottom;
        int i19 = rect3.bottom;
        int i20 = i16 - i12;
        int i21 = i18 - i14;
        int i22 = i17 - i13;
        int i23 = i19 - i15;
        Rect rect4 = (Rect) zVar.f14230a.get("android:changeBounds:clip");
        Rect rect5 = (Rect) zVar2.f14230a.get("android:changeBounds:clip");
        if ((i20 == 0 || i21 == 0) && (i22 == 0 || i23 == 0)) {
            i10 = 0;
        } else {
            i10 = (i12 == i13 && i14 == i15) ? 0 : 1;
            if (i16 != i17 || i18 != i19) {
                i10++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i10++;
        }
        int i24 = i10;
        if (i24 <= 0) {
            return null;
        }
        if (this.f14081g0) {
            E.d(view, i12, i14, Math.max(i20, i22) + i12, i14 + Math.max(i21, i23));
            if (i12 == i13 && i14 == i15) {
                objectAnimatorA = null;
            } else {
                objectAnimatorA = AbstractC1171f.a(view, f14079m0, G().a(i12, i14, i13, i15));
            }
            boolean z9 = rect4 == null;
            if (z9) {
                i11 = 0;
                rect = new Rect(0, 0, i20, i21);
            } else {
                i11 = 0;
                rect = rect4;
            }
            int i25 = rect5 == null ? 1 : i11;
            Rect rect6 = i25 != 0 ? new Rect(i11, i11, i22, i23) : rect5;
            if (rect.equals(rect6)) {
                animator = null;
            } else {
                view.setClipBounds(rect);
                Animator animatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", f14080n0, rect, rect6);
                g gVar = new g(view, rect, z9, rect6, i25, i12, i14, i16, i18, i13, i15, i17, i19);
                animatorOfObject.addListener(gVar);
                e(gVar);
                animator = animatorOfObject;
            }
            animatorC = y.c(objectAnimatorA, animator);
        } else {
            E.d(view, i12, i14, i16, i18);
            if (i24 == 2) {
                if (i20 == i22 && i21 == i23) {
                    animatorC = AbstractC1171f.a(view, f14079m0, G().a(i12, i14, i13, i15));
                } else {
                    i iVar = new i(view);
                    ObjectAnimator objectAnimatorA2 = AbstractC1171f.a(iVar, f14075i0, G().a(i12, i14, i13, i15));
                    ObjectAnimator objectAnimatorA3 = AbstractC1171f.a(iVar, f14076j0, G().a(i16, i18, i17, i19));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(objectAnimatorA2, objectAnimatorA3);
                    animatorSet.addListener(new f(iVar));
                    animatorC = animatorSet;
                }
            } else if (i12 == i13 && i14 == i15) {
                animatorC = AbstractC1171f.a(view, f14077k0, G().a(i16, i18, i17, i19));
            } else {
                animatorC = AbstractC1171f.a(view, f14078l0, G().a(i12, i14, i13, i15));
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            D.a(viewGroup4, true);
            I().e(new h(viewGroup4));
        }
        return animatorC;
    }
}
