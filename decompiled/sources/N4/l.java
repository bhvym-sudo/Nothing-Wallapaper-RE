package N4;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final d f5292m = new j(0.5f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    e f5293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    e f5294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    e f5295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    e f5296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    d f5297e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    d f5298f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    d f5299g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    d f5300h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    g f5301i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    g f5302j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    g f5303k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    g f5304l;

    public interface c {
        d a(d dVar);
    }

    public static b a() {
        return new b();
    }

    public static b b(Context context, int i10, int i11) {
        return c(context, i10, i11, 0);
    }

    private static b c(Context context, int i10, int i11, int i12) {
        return d(context, i10, i11, new N4.a(i12));
    }

    private static b d(Context context, int i10, int i11, d dVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
        if (i11 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i11);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(p225w4.k.f29387v5);
        try {
            int i12 = typedArrayObtainStyledAttributes.getInt(p225w4.k.f29397w5, 0);
            int i13 = typedArrayObtainStyledAttributes.getInt(p225w4.k.f29427z5, i12);
            int i14 = typedArrayObtainStyledAttributes.getInt(p225w4.k.f28935A5, i12);
            int i15 = typedArrayObtainStyledAttributes.getInt(p225w4.k.f29417y5, i12);
            int i16 = typedArrayObtainStyledAttributes.getInt(p225w4.k.f29407x5, i12);
            d dVarM = m(typedArrayObtainStyledAttributes, p225w4.k.f28945B5, dVar);
            d dVarM2 = m(typedArrayObtainStyledAttributes, p225w4.k.f28975E5, dVarM);
            d dVarM3 = m(typedArrayObtainStyledAttributes, p225w4.k.f28985F5, dVarM);
            d dVarM4 = m(typedArrayObtainStyledAttributes, p225w4.k.f28965D5, dVarM);
            return new b().y(i13, dVarM2).C(i14, dVarM3).u(i15, dVarM4).q(i16, m(typedArrayObtainStyledAttributes, p225w4.k.f28955C5, dVarM));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static b e(Context context, AttributeSet attributeSet, int i10, int i11) {
        return f(context, attributeSet, i10, i11, 0);
    }

    public static b f(Context context, AttributeSet attributeSet, int i10, int i11, int i12) {
        return g(context, attributeSet, i10, i11, new N4.a(i12));
    }

    public static b g(Context context, AttributeSet attributeSet, int i10, int i11, d dVar) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p225w4.k.f29426z4, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(p225w4.k.f28934A4, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(p225w4.k.f28944B4, 0);
        typedArrayObtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, dVar);
    }

    private static d m(TypedArray typedArray, int i10, d dVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i10);
        if (typedValuePeekValue != null) {
            int i11 = typedValuePeekValue.type;
            if (i11 == 5) {
                return new N4.a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i11 == 6) {
                return new j(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return dVar;
    }

    public g h() {
        return this.f5303k;
    }

    public e i() {
        return this.f5296d;
    }

    public d j() {
        return this.f5300h;
    }

    public e k() {
        return this.f5295c;
    }

    public d l() {
        return this.f5299g;
    }

    public g n() {
        return this.f5304l;
    }

    public g o() {
        return this.f5302j;
    }

    public g p() {
        return this.f5301i;
    }

    public e q() {
        return this.f5293a;
    }

    public d r() {
        return this.f5297e;
    }

    public e s() {
        return this.f5294b;
    }

    public d t() {
        return this.f5298f;
    }

    public boolean u(RectF rectF) {
        boolean z9 = this.f5304l.getClass().equals(g.class) && this.f5302j.getClass().equals(g.class) && this.f5301i.getClass().equals(g.class) && this.f5303k.getClass().equals(g.class);
        float fA = this.f5297e.a(rectF);
        return z9 && ((this.f5298f.a(rectF) > fA ? 1 : (this.f5298f.a(rectF) == fA ? 0 : -1)) == 0 && (this.f5300h.a(rectF) > fA ? 1 : (this.f5300h.a(rectF) == fA ? 0 : -1)) == 0 && (this.f5299g.a(rectF) > fA ? 1 : (this.f5299g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.f5294b instanceof k) && (this.f5293a instanceof k) && (this.f5295c instanceof k) && (this.f5296d instanceof k));
    }

    public b v() {
        return new b(this);
    }

    public l w(float f10) {
        return v().o(f10).m();
    }

    public l x(d dVar) {
        return v().p(dVar).m();
    }

    public l y(c cVar) {
        return v().B(cVar.a(r())).F(cVar.a(t())).t(cVar.a(j())).x(cVar.a(l())).m();
    }

    private l(b bVar) {
        this.f5293a = bVar.f5305a;
        this.f5294b = bVar.f5306b;
        this.f5295c = bVar.f5307c;
        this.f5296d = bVar.f5308d;
        this.f5297e = bVar.f5309e;
        this.f5298f = bVar.f5310f;
        this.f5299g = bVar.f5311g;
        this.f5300h = bVar.f5312h;
        this.f5301i = bVar.f5313i;
        this.f5302j = bVar.f5314j;
        this.f5303k = bVar.f5315k;
        this.f5304l = bVar.f5316l;
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private e f5305a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private e f5306b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private e f5307c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private e f5308d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private d f5309e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private d f5310f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private d f5311g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private d f5312h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private g f5313i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private g f5314j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private g f5315k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private g f5316l;

        public b() {
            this.f5305a = i.b();
            this.f5306b = i.b();
            this.f5307c = i.b();
            this.f5308d = i.b();
            this.f5309e = new N4.a(0.0f);
            this.f5310f = new N4.a(0.0f);
            this.f5311g = new N4.a(0.0f);
            this.f5312h = new N4.a(0.0f);
            this.f5313i = i.c();
            this.f5314j = i.c();
            this.f5315k = i.c();
            this.f5316l = i.c();
        }

        private static float n(e eVar) {
            if (eVar instanceof k) {
                return ((k) eVar).f5291a;
            }
            if (eVar instanceof f) {
                return ((f) eVar).f5239a;
            }
            return -1.0f;
        }

        public b A(float f10) {
            this.f5309e = new N4.a(f10);
            return this;
        }

        public b B(d dVar) {
            this.f5309e = dVar;
            return this;
        }

        public b C(int i10, d dVar) {
            return D(i.a(i10)).F(dVar);
        }

        public b D(e eVar) {
            this.f5306b = eVar;
            float fN = n(eVar);
            if (fN != -1.0f) {
                E(fN);
            }
            return this;
        }

        public b E(float f10) {
            this.f5310f = new N4.a(f10);
            return this;
        }

        public b F(d dVar) {
            this.f5310f = dVar;
            return this;
        }

        public l m() {
            return new l(this);
        }

        public b o(float f10) {
            return A(f10).E(f10).w(f10).s(f10);
        }

        public b p(d dVar) {
            return B(dVar).F(dVar).x(dVar).t(dVar);
        }

        public b q(int i10, d dVar) {
            return r(i.a(i10)).t(dVar);
        }

        public b r(e eVar) {
            this.f5308d = eVar;
            float fN = n(eVar);
            if (fN != -1.0f) {
                s(fN);
            }
            return this;
        }

        public b s(float f10) {
            this.f5312h = new N4.a(f10);
            return this;
        }

        public b t(d dVar) {
            this.f5312h = dVar;
            return this;
        }

        public b u(int i10, d dVar) {
            return v(i.a(i10)).x(dVar);
        }

        public b v(e eVar) {
            this.f5307c = eVar;
            float fN = n(eVar);
            if (fN != -1.0f) {
                w(fN);
            }
            return this;
        }

        public b w(float f10) {
            this.f5311g = new N4.a(f10);
            return this;
        }

        public b x(d dVar) {
            this.f5311g = dVar;
            return this;
        }

        public b y(int i10, d dVar) {
            return z(i.a(i10)).B(dVar);
        }

        public b z(e eVar) {
            this.f5305a = eVar;
            float fN = n(eVar);
            if (fN != -1.0f) {
                A(fN);
            }
            return this;
        }

        public b(l lVar) {
            this.f5305a = i.b();
            this.f5306b = i.b();
            this.f5307c = i.b();
            this.f5308d = i.b();
            this.f5309e = new N4.a(0.0f);
            this.f5310f = new N4.a(0.0f);
            this.f5311g = new N4.a(0.0f);
            this.f5312h = new N4.a(0.0f);
            this.f5313i = i.c();
            this.f5314j = i.c();
            this.f5315k = i.c();
            this.f5316l = i.c();
            this.f5305a = lVar.f5293a;
            this.f5306b = lVar.f5294b;
            this.f5307c = lVar.f5295c;
            this.f5308d = lVar.f5296d;
            this.f5309e = lVar.f5297e;
            this.f5310f = lVar.f5298f;
            this.f5311g = lVar.f5299g;
            this.f5312h = lVar.f5300h;
            this.f5313i = lVar.f5301i;
            this.f5314j = lVar.f5302j;
            this.f5315k = lVar.f5303k;
            this.f5316l = lVar.f5304l;
        }
    }

    public l() {
        this.f5293a = i.b();
        this.f5294b = i.b();
        this.f5295c = i.b();
        this.f5296d = i.b();
        this.f5297e = new N4.a(0.0f);
        this.f5298f = new N4.a(0.0f);
        this.f5299g = new N4.a(0.0f);
        this.f5300h = new N4.a(0.0f);
        this.f5301i = i.c();
        this.f5302j = i.c();
        this.f5303k = i.c();
        this.f5304l = i.c();
    }
}
