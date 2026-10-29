package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
abstract class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final F f14051a = new J();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Property f14052b = new a(Float.class, "translationAlpha");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Property f14053c = new b(Rect.class, "clipBounds");

    class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(E.b(view));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f10) {
            E.e(view, f10.floatValue());
        }
    }

    class b extends Property {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return view.getClipBounds();
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    static void a(View view) {
        f14051a.a(view);
    }

    static float b(View view) {
        return f14051a.b(view);
    }

    static void c(View view) {
        f14051a.c(view);
    }

    static void d(View view, int i10, int i11, int i12, int i13) {
        f14051a.d(view, i10, i11, i12, i13);
    }

    static void e(View view, float f10) {
        f14051a.e(view, f10);
    }

    static void f(View view, int i10) {
        f14051a.f(view, i10);
    }

    static void g(View view, Matrix matrix) {
        f14051a.g(view, matrix);
    }

    static void h(View view, Matrix matrix) {
        f14051a.h(view, matrix);
    }
}
