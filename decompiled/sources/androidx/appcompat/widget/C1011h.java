package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* JADX INFO: renamed from: androidx.appcompat.widget.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1011h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final PorterDuff.Mode f11085b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static C1011h f11086c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private B f11087a;

    /* JADX INFO: renamed from: androidx.appcompat.widget.h$a */
    class a implements B.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int[] f11088a = {p050f.e.f20396R, p050f.e.f20394P, p050f.e.f20398a};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f11089b = {p050f.e.f20412o, p050f.e.f20380B, p050f.e.f20417t, p050f.e.f20413p, p050f.e.f20414q, p050f.e.f20416s, p050f.e.f20415r};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f11090c = {p050f.e.f20393O, p050f.e.f20395Q, p050f.e.f20408k, p050f.e.f20389K, p050f.e.f20390L, p050f.e.f20391M, p050f.e.f20392N};

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int[] f11091d = {p050f.e.f20420w, p050f.e.f20406i, p050f.e.f20419v};

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f11092e = {p050f.e.f20388J, p050f.e.f20397S};

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int[] f11093f = {p050f.e.f20400c, p050f.e.f20404g, p050f.e.f20401d, p050f.e.f20405h};

        a() {
        }

        private boolean f(int[] iArr, int i10) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(Context context) {
            return h(context, 0);
        }

        private ColorStateList h(Context context, int i10) {
            int iC = F.c(context, p050f.a.f20356v);
            return new ColorStateList(new int[][]{F.f10781b, F.f10784e, F.f10782c, F.f10788i}, new int[]{F.b(context, p050f.a.f20354t), p191t0.a.q(iC, i10), p191t0.a.q(iC, i10), i10});
        }

        private ColorStateList i(Context context) {
            return h(context, F.c(context, p050f.a.f20353s));
        }

        private ColorStateList j(Context context) {
            return h(context, F.c(context, p050f.a.f20354t));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i10 = p050f.a.f20359y;
            ColorStateList colorStateListE = F.e(context, i10);
            if (colorStateListE == null || !colorStateListE.isStateful()) {
                iArr[0] = F.f10781b;
                iArr2[0] = F.b(context, i10);
                iArr[1] = F.f10785f;
                iArr2[1] = F.c(context, p050f.a.f20355u);
                iArr[2] = F.f10788i;
                iArr2[2] = F.c(context, i10);
            } else {
                int[] iArr3 = F.f10781b;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListE.getColorForState(iArr3, 0);
                iArr[1] = F.f10785f;
                iArr2[1] = F.c(context, p050f.a.f20355u);
                iArr[2] = F.f10788i;
                iArr2[2] = colorStateListE.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private LayerDrawable l(B b10, Context context, int i10) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
            Drawable drawableI = b10.i(context, p050f.e.f20384F);
            Drawable drawableI2 = b10.i(context, p050f.e.f20385G);
            if ((drawableI instanceof BitmapDrawable) && drawableI.getIntrinsicWidth() == dimensionPixelSize && drawableI.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableI;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableI.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableI.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableI2 instanceof BitmapDrawable) && drawableI2.getIntrinsicWidth() == dimensionPixelSize && drawableI2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableI2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableI2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableI2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        private void m(Drawable drawable, int i10, PorterDuff.Mode mode) {
            Drawable drawableMutate = drawable.mutate();
            if (mode == null) {
                mode = C1011h.f11085b;
            }
            drawableMutate.setColorFilter(C1011h.e(i10, mode));
        }

        /* JADX WARN: Code duplicated, block: B:22:0x004b  */
        /* JADX WARN: Code duplicated, block: B:24:0x005c  */
        /* JADX WARN: Code duplicated, block: B:26:0x0060 A[RETURN] */
        @Override // androidx.appcompat.widget.B.c
        public boolean a(Context context, int i10, Drawable drawable) {
            int i11;
            boolean z9;
            int iRound;
            Drawable drawableMutate;
            PorterDuff.Mode mode = C1011h.f11085b;
            if (f(this.f11088a, i10)) {
                i11 = p050f.a.f20357w;
            } else if (f(this.f11090c, i10)) {
                i11 = p050f.a.f20355u;
            } else {
                if (!f(this.f11091d, i10)) {
                    if (i10 == p050f.e.f20418u) {
                        iRound = Math.round(40.8f);
                        i11 = 16842800;
                        z9 = true;
                    } else {
                        if (i10 != p050f.e.f20409l) {
                            i11 = 0;
                            z9 = false;
                        }
                        iRound = -1;
                    }
                    if (z9) {
                        return false;
                    }
                    drawableMutate = drawable.mutate();
                    drawableMutate.setColorFilter(C1011h.e(F.c(context, i11), mode));
                    if (iRound != -1) {
                        drawableMutate.setAlpha(iRound);
                    }
                    return true;
                }
                mode = PorterDuff.Mode.MULTIPLY;
                i11 = 16842801;
            }
            z9 = true;
            iRound = -1;
            if (z9) {
                return false;
            }
            drawableMutate = drawable.mutate();
            drawableMutate.setColorFilter(C1011h.e(F.c(context, i11), mode));
            if (iRound != -1) {
                drawableMutate.setAlpha(iRound);
            }
            return true;
        }

        @Override // androidx.appcompat.widget.B.c
        public PorterDuff.Mode b(int i10) {
            if (i10 == p050f.e.f20386H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.B.c
        public Drawable c(B b10, Context context, int i10) {
            if (i10 == p050f.e.f20407j) {
                return new LayerDrawable(new Drawable[]{b10.i(context, p050f.e.f20406i), b10.i(context, p050f.e.f20408k)});
            }
            if (i10 == p050f.e.f20422y) {
                return l(b10, context, p050f.d.f20376g);
            }
            if (i10 == p050f.e.f20421x) {
                return l(b10, context, p050f.d.f20377h);
            }
            if (i10 == p050f.e.f20423z) {
                return l(b10, context, p050f.d.f20378i);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.B.c
        public ColorStateList d(Context context, int i10) {
            if (i10 == p050f.e.f20410m) {
                return p060g.a.a(context, p050f.c.f20366e);
            }
            if (i10 == p050f.e.f20387I) {
                return p060g.a.a(context, p050f.c.f20369h);
            }
            if (i10 == p050f.e.f20386H) {
                return k(context);
            }
            if (i10 == p050f.e.f20403f) {
                return j(context);
            }
            if (i10 == p050f.e.f20399b) {
                return g(context);
            }
            if (i10 == p050f.e.f20402e) {
                return i(context);
            }
            if (i10 == p050f.e.f20382D || i10 == p050f.e.f20383E) {
                return p060g.a.a(context, p050f.c.f20368g);
            }
            if (f(this.f11089b, i10)) {
                return F.e(context, p050f.a.f20357w);
            }
            if (f(this.f11092e, i10)) {
                return p060g.a.a(context, p050f.c.f20365d);
            }
            if (f(this.f11093f, i10)) {
                return p060g.a.a(context, p050f.c.f20364c);
            }
            if (i10 == p050f.e.f20379A) {
                return p060g.a.a(context, p050f.c.f20367f);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.B.c
        public boolean e(Context context, int i10, Drawable drawable) {
            if (i10 == p050f.e.f20381C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
                int i11 = p050f.a.f20357w;
                m(drawableFindDrawableByLayerId, F.c(context, i11), C1011h.f11085b);
                m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), F.c(context, i11), C1011h.f11085b);
                m(layerDrawable.findDrawableByLayerId(R.id.progress), F.c(context, p050f.a.f20355u), C1011h.f11085b);
                return true;
            }
            if (i10 != p050f.e.f20422y && i10 != p050f.e.f20421x && i10 != p050f.e.f20423z) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m(layerDrawable2.findDrawableByLayerId(R.id.background), F.b(context, p050f.a.f20357w), C1011h.f11085b);
            Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress);
            int i12 = p050f.a.f20355u;
            m(drawableFindDrawableByLayerId2, F.c(context, i12), C1011h.f11085b);
            m(layerDrawable2.findDrawableByLayerId(R.id.progress), F.c(context, i12), C1011h.f11085b);
            return true;
        }
    }

    public static synchronized C1011h b() {
        try {
            if (f11086c == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f11086c;
    }

    public static synchronized PorterDuffColorFilter e(int i10, PorterDuff.Mode mode) {
        return B.k(i10, mode);
    }

    public static synchronized void h() {
        if (f11086c == null) {
            C1011h c1011h = new C1011h();
            f11086c = c1011h;
            c1011h.f11087a = B.g();
            f11086c.f11087a.t(new a());
        }
    }

    static void i(Drawable drawable, H h10, int[] iArr) {
        B.v(drawable, h10, iArr);
    }

    public synchronized Drawable c(Context context, int i10) {
        return this.f11087a.i(context, i10);
    }

    synchronized Drawable d(Context context, int i10, boolean z9) {
        return this.f11087a.j(context, i10, z9);
    }

    synchronized ColorStateList f(Context context, int i10) {
        return this.f11087a.l(context, i10);
    }

    public synchronized void g(Context context) {
        this.f11087a.r(context);
    }
}
