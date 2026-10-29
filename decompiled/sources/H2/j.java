package H2;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.text.Layout;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.F;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f2368f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f2369g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f2370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f2371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private o f2372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p219v8.a f2373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final f f2374e;

    public static final class a {
        public /* synthetic */ a(AbstractC1457h abstractC1457h) {
            this();
        }

        private a() {
        }
    }

    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f2375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f2376b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f2377c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f2378d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f2379e;

        public /* synthetic */ b(AbstractC1457h abstractC1457h) {
            this();
        }

        public final int a() {
            return this.f2379e;
        }

        public abstract int b();

        public final int c() {
            return this.f2377c;
        }

        public final float d() {
            return this.f2378d;
        }

        public final float e() {
            return this.f2375a;
        }

        public final float f() {
            return this.f2376b;
        }

        public final void g(int i10) {
            this.f2379e = i10;
        }

        public final void h(int i10) {
            this.f2377c = i10;
        }

        public final void i(float f10) {
            this.f2378d = f10;
        }

        public final void j(float f10) {
            this.f2375a = f10;
        }

        public final void k(float f10) {
            this.f2376b = f10;
        }

        private b() {
        }
    }

    static {
        String strB = F.b(j.class).b();
        kotlin.jvm.internal.n.e(strB);
        f2369g = strB;
    }

    public j(Layout layout, r typefaceCache, k kVar) {
        kotlin.jvm.internal.n.h(layout, "layout");
        kotlin.jvm.internal.n.h(typefaceCache, "typefaceCache");
        this.f2370a = typefaceCache;
        this.f2371b = kVar;
        this.f2372c = new o(layout, typefaceCache, kVar);
        this.f2373d = new p219v8.a() { // from class: H2.i
            @Override // p219v8.a
            public final Object invoke() {
                return j.b();
            }
        };
        this.f2374e = new f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ValueAnimator b() {
        return ValueAnimator.ofFloat(1.0f);
    }

    public static /* synthetic */ void e(j jVar, Layout layout, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = -1.0f;
        }
        jVar.d(layout, f10);
    }

    public final void c(Canvas c10) {
        kotlin.jvm.internal.n.h(c10, "c");
        this.f2372c.d(c10);
    }

    public final void d(Layout layout, float f10) {
        kotlin.jvm.internal.n.h(layout, "layout");
        this.f2372c.n(layout);
        if (f10 >= 0.0f) {
            this.f2372c.h().setTextSize(f10);
            this.f2372c.f().setTextSize(f10);
            this.f2372c.m();
            this.f2372c.l();
        }
    }
}
