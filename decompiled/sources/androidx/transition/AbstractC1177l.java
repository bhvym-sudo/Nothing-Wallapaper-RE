package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: renamed from: androidx.transition.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1177l extends K {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final TimeInterpolator f14136k0 = new DecelerateInterpolator();

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final TimeInterpolator f14137l0 = new AccelerateInterpolator();

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final g f14138m0 = new a();

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final g f14139n0 = new b();

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static final g f14140o0 = new c();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final g f14141p0 = new d();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final g f14142q0 = new e();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final g f14143r0 = new f();

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private g f14144i0 = f14143r0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private int f14145j0 = 80;

    /* JADX INFO: renamed from: androidx.transition.l$a */
    class a extends h {
        a() {
            super(null);
        }

        @Override // androidx.transition.AbstractC1177l.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* JADX INFO: renamed from: androidx.transition.l$b */
    class b extends h {
        b() {
            super(null);
        }

        @Override // androidx.transition.AbstractC1177l.g
        public float b(ViewGroup viewGroup, View view) {
            return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() + viewGroup.getWidth() : view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* JADX INFO: renamed from: androidx.transition.l$c */
    class c extends i {
        c() {
            super(null);
        }

        @Override // androidx.transition.AbstractC1177l.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - viewGroup.getHeight();
        }
    }

    /* JADX INFO: renamed from: androidx.transition.l$d */
    class d extends h {
        d() {
            super(null);
        }

        @Override // androidx.transition.AbstractC1177l.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* JADX INFO: renamed from: androidx.transition.l$e */
    class e extends h {
        e() {
            super(null);
        }

        @Override // androidx.transition.AbstractC1177l.g
        public float b(ViewGroup viewGroup, View view) {
            return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() - viewGroup.getWidth() : view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* JADX INFO: renamed from: androidx.transition.l$f */
    class f extends i {
        f() {
            super(null);
        }

        @Override // androidx.transition.AbstractC1177l.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + viewGroup.getHeight();
        }
    }

    /* JADX INFO: renamed from: androidx.transition.l$g */
    private interface g {
        float a(ViewGroup viewGroup, View view);

        float b(ViewGroup viewGroup, View view);
    }

    /* JADX INFO: renamed from: androidx.transition.l$h */
    private static abstract class h implements g {
        private h() {
        }

        @Override // androidx.transition.AbstractC1177l.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }

        /* synthetic */ h(a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: androidx.transition.l$i */
    private static abstract class i implements g {
        private i() {
        }

        @Override // androidx.transition.AbstractC1177l.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }

        /* synthetic */ i(a aVar) {
            this();
        }
    }

    public AbstractC1177l(int i10) {
        C0(i10);
    }

    private void v0(z zVar) {
        int[] iArr = new int[2];
        zVar.f14231b.getLocationOnScreen(iArr);
        zVar.f14230a.put("android:slide:screenPosition", iArr);
    }

    public void C0(int i10) {
        if (i10 == 3) {
            this.f14144i0 = f14138m0;
        } else if (i10 == 5) {
            this.f14144i0 = f14141p0;
        } else if (i10 == 48) {
            this.f14144i0 = f14140o0;
        } else if (i10 == 80) {
            this.f14144i0 = f14143r0;
        } else if (i10 == 8388611) {
            this.f14144i0 = f14139n0;
        } else {
            if (i10 != 8388613) {
                throw new IllegalArgumentException("Invalid slide direction");
            }
            this.f14144i0 = f14142q0;
        }
        this.f14145j0 = i10;
        C1176k c1176k = new C1176k();
        c1176k.j(i10);
        r0(c1176k);
    }

    @Override // androidx.transition.m
    public boolean T() {
        return true;
    }

    @Override // androidx.transition.K, androidx.transition.m
    public void m(z zVar) {
        super.m(zVar);
        v0(zVar);
    }

    @Override // androidx.transition.K, androidx.transition.m
    public void p(z zVar) {
        super.p(zVar);
        v0(zVar);
    }

    @Override // androidx.transition.K
    public Animator x0(ViewGroup viewGroup, View view, z zVar, z zVar2) {
        if (zVar2 == null) {
            return null;
        }
        int[] iArr = (int[]) zVar2.f14230a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return B.a(view, zVar2, iArr[0], iArr[1], this.f14144i0.b(viewGroup, view), this.f14144i0.a(viewGroup, view), translationX, translationY, f14136k0, this);
    }

    @Override // androidx.transition.K
    public Animator z0(ViewGroup viewGroup, View view, z zVar, z zVar2) {
        if (zVar == null) {
            return null;
        }
        int[] iArr = (int[]) zVar.f14230a.get("android:slide:screenPosition");
        return B.a(view, zVar, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f14144i0.b(viewGroup, view), this.f14144i0.a(viewGroup, view), f14137l0, this);
    }
}
