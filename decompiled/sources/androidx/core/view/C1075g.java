package androidx.core.view;

import android.view.DisplayCutout;

/* JADX INFO: renamed from: androidx.core.view.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1075g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DisplayCutout f12260a;

    /* JADX INFO: renamed from: androidx.core.view.g$a */
    static class a {
        static int a(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        static int b(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        static int c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        static int d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    private C1075g(DisplayCutout displayCutout) {
        this.f12260a = displayCutout;
    }

    static C1075g e(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new C1075g(displayCutout);
    }

    public int a() {
        return a.a(this.f12260a);
    }

    public int b() {
        return a.b(this.f12260a);
    }

    public int c() {
        return a.c(this.f12260a);
    }

    public int d() {
        return a.d(this.f12260a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1075g.class != obj.getClass()) {
            return false;
        }
        return B0.d.a(this.f12260a, ((C1075g) obj).f12260a);
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f12260a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f12260a + "}";
    }
}
