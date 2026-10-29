package androidx.core.view;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: loaded from: classes.dex */
public final class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f12240a;

    private static class b extends a {
        b(Window window, W w9, B b10) {
            super(window, w9, b10);
        }

        @Override // androidx.core.view.W.d
        void e(int i10) {
            this.f12242b.setSystemBarsBehavior(i10);
        }

        b(WindowInsetsController windowInsetsController, W w9, B b10) {
            super(windowInsetsController, w9, b10);
        }
    }

    private static class c extends b {
        c(Window window, W w9, B b10) {
            super(window, w9, b10);
        }

        @Override // androidx.core.view.W.d
        public boolean b() {
            return (this.f12242b.getSystemBarsAppearance() & 8) != 0;
        }

        c(WindowInsetsController windowInsetsController, W w9, B b10) {
            super(windowInsetsController, w9, b10);
        }
    }

    private static class d {
        d() {
        }

        abstract void a(int i10);

        public abstract boolean b();

        public abstract void c(boolean z9);

        public abstract void d(boolean z9);

        abstract void e(int i10);

        abstract void f(int i10);
    }

    private W(WindowInsetsController windowInsetsController) {
        this.f12240a = new c(windowInsetsController, this, new B(windowInsetsController));
    }

    public static W g(WindowInsetsController windowInsetsController) {
        return new W(windowInsetsController);
    }

    public void a(int i10) {
        this.f12240a.a(i10);
    }

    public boolean b() {
        return this.f12240a.b();
    }

    public void c(boolean z9) {
        this.f12240a.c(z9);
    }

    public void d(boolean z9) {
        this.f12240a.d(z9);
    }

    public void e(int i10) {
        this.f12240a.e(i10);
    }

    public void f(int i10) {
        this.f12240a.f(i10);
    }

    private static class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final W f12241a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final WindowInsetsController f12242b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final B f12243c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final androidx.collection.P f12244d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected Window f12245e;

        a(Window window, W w9, B b10) {
            this(window.getInsetsController(), w9, b10);
            this.f12245e = window;
        }

        @Override // androidx.core.view.W.d
        void a(int i10) {
            if ((i10 & 8) != 0) {
                this.f12243c.a();
            }
            this.f12242b.hide(i10 & (-9));
        }

        @Override // androidx.core.view.W.d
        public void c(boolean z9) {
            if (z9) {
                if (this.f12245e != null) {
                    g(16);
                }
                this.f12242b.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f12245e != null) {
                    h(16);
                }
                this.f12242b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // androidx.core.view.W.d
        public void d(boolean z9) {
            if (z9) {
                if (this.f12245e != null) {
                    g(8192);
                }
                this.f12242b.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f12245e != null) {
                    h(8192);
                }
                this.f12242b.setSystemBarsAppearance(0, 8);
            }
        }

        @Override // androidx.core.view.W.d
        void f(int i10) {
            if ((i10 & 8) != 0) {
                this.f12243c.b();
            }
            this.f12242b.show(i10 & (-9));
        }

        protected void g(int i10) {
            View decorView = this.f12245e.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        protected void h(int i10) {
            View decorView = this.f12245e.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        a(WindowInsetsController windowInsetsController, W w9, B b10) {
            this.f12244d = new androidx.collection.P();
            this.f12242b = windowInsetsController;
            this.f12241a = w9;
            this.f12243c = b10;
        }
    }

    public W(Window window, View view) {
        this.f12240a = new c(window, this, new B(view));
    }
}
