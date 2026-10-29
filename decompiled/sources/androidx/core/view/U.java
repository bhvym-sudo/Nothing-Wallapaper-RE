package androidx.core.view;

import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f12210a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p191t0.b f12211a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p191t0.b f12212b;

        private a(WindowInsetsAnimation.Bounds bounds) {
            this.f12211a = c.f(bounds);
            this.f12212b = c.e(bounds);
        }

        public static a d(WindowInsetsAnimation.Bounds bounds) {
            return new a(bounds);
        }

        public p191t0.b a() {
            return this.f12211a;
        }

        public p191t0.b b() {
            return this.f12212b;
        }

        public WindowInsetsAnimation.Bounds c() {
            return c.d(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.f12211a + " upper=" + this.f12212b + "}";
        }
    }

    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f12213a;

        public b(int i10) {
            this.f12213a = i10;
        }

        public final int a() {
            return this.f12213a;
        }

        public abstract void b(U u9);

        public abstract void c(U u9);

        public abstract V d(V v9, List list);

        public abstract a e(U u9, a aVar);
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f12219a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Interpolator f12220b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f12221c;

        d(int i10, Interpolator interpolator, long j9) {
            this.f12219a = i10;
            this.f12220b = interpolator;
            this.f12221c = j9;
        }

        public abstract float a();

        public abstract int b();

        public abstract void c(float f10);
    }

    public U(int i10, Interpolator interpolator, long j9) {
        this.f12210a = new c(i10, interpolator, j9);
    }

    static void c(View view, b bVar) {
        c.g(view, bVar);
    }

    static U e(WindowInsetsAnimation windowInsetsAnimation) {
        return new U(windowInsetsAnimation);
    }

    public float a() {
        return this.f12210a.a();
    }

    public int b() {
        return this.f12210a.b();
    }

    public void d(float f10) {
        this.f12210a.c(f10);
    }

    private static class c extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final WindowInsetsAnimation f12214d;

        private static class a extends WindowInsetsAnimation.Callback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final b f12215a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private List f12216b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private ArrayList f12217c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final HashMap f12218d;

            a(b bVar) {
                super(bVar.a());
                this.f12218d = new HashMap();
                this.f12215a = bVar;
            }

            private U a(WindowInsetsAnimation windowInsetsAnimation) {
                U u9 = (U) this.f12218d.get(windowInsetsAnimation);
                if (u9 != null) {
                    return u9;
                }
                U uE = U.e(windowInsetsAnimation);
                this.f12218d.put(windowInsetsAnimation, uE);
                return uE;
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.f12215a.b(a(windowInsetsAnimation));
                this.f12218d.remove(windowInsetsAnimation);
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.f12215a.c(a(windowInsetsAnimation));
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public WindowInsets onProgress(WindowInsets windowInsets, List list) {
                ArrayList arrayList = this.f12217c;
                if (arrayList == null) {
                    ArrayList arrayList2 = new ArrayList(list.size());
                    this.f12217c = arrayList2;
                    this.f12216b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
                    U uA = a(windowInsetsAnimation);
                    uA.d(windowInsetsAnimation.getFraction());
                    this.f12217c.add(uA);
                }
                return this.f12215a.d(V.u(windowInsets), this.f12216b).t();
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.f12215a.e(a(windowInsetsAnimation), a.d(bounds)).c();
            }
        }

        c(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f12214d = windowInsetsAnimation;
        }

        public static WindowInsetsAnimation.Bounds d(a aVar) {
            return new WindowInsetsAnimation.Bounds(aVar.a().d(), aVar.b().d());
        }

        public static p191t0.b e(WindowInsetsAnimation.Bounds bounds) {
            return p191t0.b.c(bounds.getUpperBound());
        }

        public static p191t0.b f(WindowInsetsAnimation.Bounds bounds) {
            return p191t0.b.c(bounds.getLowerBound());
        }

        public static void g(View view, b bVar) {
            view.setWindowInsetsAnimationCallback(bVar != null ? new a(bVar) : null);
        }

        @Override // androidx.core.view.U.d
        public float a() {
            return this.f12214d.getInterpolatedFraction();
        }

        @Override // androidx.core.view.U.d
        public int b() {
            return this.f12214d.getTypeMask();
        }

        @Override // androidx.core.view.U.d
        public void c(float f10) {
            this.f12214d.setFraction(f10);
        }

        c(int i10, Interpolator interpolator, long j9) {
            this(new WindowInsetsAnimation(i10, interpolator, j9));
        }
    }

    private U(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        this.f12210a = new c(windowInsetsAnimation);
    }
}
