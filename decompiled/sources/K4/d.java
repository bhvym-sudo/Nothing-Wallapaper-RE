package K4;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import p181s0.h;
import p225w4.k;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f4093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ColorStateList f4094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ColorStateList f4095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4097e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4098f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f4099g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f4100h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f4101i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f4102j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f4103k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f4104l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ColorStateList f4105m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f4106n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f4107o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f4108p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Typeface f4109q;

    class a extends h.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f4110a;

        a(f fVar) {
            this.f4110a = fVar;
        }

        @Override // s0.h.e
        public void f(int i10) {
            d.this.f4108p = true;
            this.f4110a.a(i10);
        }

        @Override // s0.h.e
        public void g(Typeface typeface) {
            d dVar = d.this;
            dVar.f4109q = Typeface.create(typeface, dVar.f4097e);
            d.this.f4108p = true;
            this.f4110a.b(d.this.f4109q, false);
        }
    }

    class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f4112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextPaint f4113b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f4114c;

        b(Context context, TextPaint textPaint, f fVar) {
            this.f4112a = context;
            this.f4113b = textPaint;
            this.f4114c = fVar;
        }

        @Override // K4.f
        public void a(int i10) {
            this.f4114c.a(i10);
        }

        @Override // K4.f
        public void b(Typeface typeface, boolean z9) {
            d.this.p(this.f4112a, this.f4113b, typeface);
            this.f4114c.b(typeface, z9);
        }
    }

    public d(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, k.f29034K6);
        l(typedArrayObtainStyledAttributes.getDimension(k.f29043L6, 0.0f));
        k(c.a(context, typedArrayObtainStyledAttributes, k.f29070O6));
        this.f4093a = c.a(context, typedArrayObtainStyledAttributes, k.f29079P6);
        this.f4094b = c.a(context, typedArrayObtainStyledAttributes, k.f29088Q6);
        this.f4097e = typedArrayObtainStyledAttributes.getInt(k.f29061N6, 0);
        this.f4098f = typedArrayObtainStyledAttributes.getInt(k.f29052M6, 1);
        int iF = c.f(typedArrayObtainStyledAttributes, k.f29142W6, k.f29133V6);
        this.f4107o = typedArrayObtainStyledAttributes.getResourceId(iF, 0);
        this.f4096d = typedArrayObtainStyledAttributes.getString(iF);
        this.f4099g = typedArrayObtainStyledAttributes.getBoolean(k.f29151X6, false);
        this.f4095c = c.a(context, typedArrayObtainStyledAttributes, k.f29097R6);
        this.f4100h = typedArrayObtainStyledAttributes.getFloat(k.f29106S6, 0.0f);
        this.f4101i = typedArrayObtainStyledAttributes.getFloat(k.f29115T6, 0.0f);
        this.f4102j = typedArrayObtainStyledAttributes.getFloat(k.f29124U6, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i10, k.f28964D4);
        int i11 = k.f28974E4;
        this.f4103k = typedArrayObtainStyledAttributes2.hasValue(i11);
        this.f4104l = typedArrayObtainStyledAttributes2.getFloat(i11, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    private void d() {
        String str;
        if (this.f4109q == null && (str = this.f4096d) != null) {
            this.f4109q = Typeface.create(str, this.f4097e);
        }
        if (this.f4109q == null) {
            int i10 = this.f4098f;
            if (i10 == 1) {
                this.f4109q = Typeface.SANS_SERIF;
            } else if (i10 == 2) {
                this.f4109q = Typeface.SERIF;
            } else if (i10 != 3) {
                this.f4109q = Typeface.DEFAULT;
            } else {
                this.f4109q = Typeface.MONOSPACE;
            }
            this.f4109q = Typeface.create(this.f4109q, this.f4097e);
        }
    }

    private boolean m(Context context) {
        if (e.a()) {
            return true;
        }
        int i10 = this.f4107o;
        return (i10 != 0 ? h.c(context, i10) : null) != null;
    }

    public Typeface e() {
        d();
        return this.f4109q;
    }

    public Typeface f(Context context) {
        if (this.f4108p) {
            return this.f4109q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceG = h.g(context, this.f4107o);
                this.f4109q = typefaceG;
                if (typefaceG != null) {
                    this.f4109q = Typeface.create(typefaceG, this.f4097e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e10) {
                Log.d("TextAppearance", "Error loading font " + this.f4096d, e10);
            }
        }
        d();
        this.f4108p = true;
        return this.f4109q;
    }

    public void g(Context context, f fVar) {
        if (m(context)) {
            f(context);
        } else {
            d();
        }
        int i10 = this.f4107o;
        if (i10 == 0) {
            this.f4108p = true;
        }
        if (this.f4108p) {
            fVar.b(this.f4109q, true);
            return;
        }
        try {
            h.i(context, i10, new a(fVar), null);
        } catch (Resources.NotFoundException unused) {
            this.f4108p = true;
            fVar.a(1);
        } catch (Exception e10) {
            Log.d("TextAppearance", "Error loading font " + this.f4096d, e10);
            this.f4108p = true;
            fVar.a(-3);
        }
    }

    public void h(Context context, TextPaint textPaint, f fVar) {
        p(context, textPaint, e());
        g(context, new b(context, textPaint, fVar));
    }

    public ColorStateList i() {
        return this.f4105m;
    }

    public float j() {
        return this.f4106n;
    }

    public void k(ColorStateList colorStateList) {
        this.f4105m = colorStateList;
    }

    public void l(float f10) {
        this.f4106n = f10;
    }

    public void n(Context context, TextPaint textPaint, f fVar) {
        o(context, textPaint, fVar);
        ColorStateList colorStateList = this.f4105m;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f10 = this.f4102j;
        float f11 = this.f4100h;
        float f12 = this.f4101i;
        ColorStateList colorStateList2 = this.f4095c;
        textPaint.setShadowLayer(f10, f11, f12, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void o(Context context, TextPaint textPaint, f fVar) {
        if (m(context)) {
            p(context, textPaint, f(context));
        } else {
            h(context, textPaint, fVar);
        }
    }

    public void p(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceA = g.a(context, typeface);
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        textPaint.setTypeface(typeface);
        int i10 = this.f4097e & (~typeface.getStyle());
        textPaint.setFakeBoldText((i10 & 1) != 0);
        textPaint.setTextSkewX((i10 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f4106n);
        if (this.f4103k) {
            textPaint.setLetterSpacing(this.f4104l);
        }
    }
}
