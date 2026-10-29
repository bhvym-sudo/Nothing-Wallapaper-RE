package p191t0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.collection.t;
import java.util.List;
import p181s0.h;
import p241y0.g;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g f27871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final t f27872b;

    public static class a extends g.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private h.e f27873a;

        public a(h.e eVar) {
            this.f27873a = eVar;
        }

        @Override // y0.g.c
        public void a(int i10) {
            h.e eVar = this.f27873a;
            if (eVar != null) {
                eVar.f(i10);
            }
        }

        @Override // y0.g.c
        public void b(Typeface typeface) {
            h.e eVar = this.f27873a;
            if (eVar != null) {
                eVar.g(typeface);
            }
        }
    }

    static {
        p182s1.a.a("TypefaceCompat static init");
        f27871a = new f();
        f27872b = new t(16);
        p182s1.a.b();
    }

    public static Typeface a(Context context, Typeface typeface, int i10) {
        if (context != null) {
            return Typeface.create(typeface, i10);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i10) {
        p182s1.a.a("TypefaceCompat.createFromFontInfo");
        try {
            return f27871a.b(context, cancellationSignal, bVarArr, i10);
        } finally {
            p182s1.a.b();
        }
    }

    public static Typeface c(Context context, CancellationSignal cancellationSignal, List list, int i10) {
        p182s1.a.a("TypefaceCompat.createFromFontInfoWithFallback");
        try {
            return f27871a.c(context, cancellationSignal, list, i10);
        } finally {
            p182s1.a.b();
        }
    }

    public static Typeface d(Context context, s0.e.b bVar, Resources resources, int i10, String str, int i11, int i12, h.e eVar, Handler handler, boolean z9) {
        Typeface typefaceA;
        if (bVar instanceof p181s0.e.C0666e) {
            p181s0.e.C0666e c0666e = (p181s0.e.C0666e) bVar;
            Typeface typefaceH = h(c0666e.d());
            if (typefaceH != null) {
                if (eVar != null) {
                    eVar.d(typefaceH, handler);
                }
                return typefaceH;
            }
            typefaceA = g.c(context, c0666e.a() != null ? List.of(c0666e.c(), c0666e.a()) : List.of(c0666e.c()), i12, !z9 ? eVar != null : c0666e.b() != 0, z9 ? c0666e.e() : -1, h.e.e(handler), new a(eVar));
        } else {
            typefaceA = f27871a.a(context, (s0.e.c) bVar, resources, i12);
            if (eVar != null) {
                if (typefaceA != null) {
                    eVar.d(typefaceA, handler);
                } else {
                    eVar.c(-3, handler);
                }
            }
        }
        if (typefaceA != null) {
            f27872b.e(f(resources, i10, str, i11, i12), typefaceA);
        }
        return typefaceA;
    }

    public static Typeface e(Context context, Resources resources, int i10, String str, int i11, int i12) {
        Typeface typefaceD = f27871a.d(context, resources, i10, str, i12);
        if (typefaceD != null) {
            f27872b.e(f(resources, i10, str, i11, i12), typefaceD);
        }
        return typefaceD;
    }

    private static String f(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }

    public static Typeface g(Resources resources, int i10, String str, int i11, int i12) {
        return (Typeface) f27872b.d(f(resources, i10, str, i11, i12));
    }

    private static Typeface h(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }
}
