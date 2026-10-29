package F6;

import C6.e;
import E8.i;
import G6.c;
import android.graphics.Bitmap;
import com.nothing.effect.sdk.GlassParam;
import com.nothing.effect.sdk.NTEffectFilter;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p074h3.I;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements E6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0069a f1731a = new C0069a(null);

    /* JADX INFO: renamed from: F6.a$a, reason: collision with other inner class name */
    public static final class C0069a {
        public /* synthetic */ C0069a(AbstractC1457h abstractC1457h) {
            this();
        }

        public final boolean a() {
            return I.a().C().r();
        }

        private C0069a() {
        }
    }

    public static final class b extends E6.a.C0050a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C0070a f1732d = new C0070a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f1733c;

        /* JADX INFO: renamed from: F6.a$b$a, reason: collision with other inner class name */
        public static final class C0070a {
            public /* synthetic */ C0070a(AbstractC1457h abstractC1457h) {
                this();
            }

            public final b a(float f10) {
                return new b(f10, e.b.f642c, null);
            }

            public final b b(String str) {
                n.h(str, "str");
                Float fO = i.o(str);
                return a(fO != null ? fO.floatValue() : 1.0f);
            }

            private C0070a() {
            }
        }

        public /* synthetic */ b(float f10, e eVar, AbstractC1457h abstractC1457h) {
            this(f10, eVar);
        }

        public final float d() {
            return this.f1733c;
        }

        private b(float f10, e eVar) {
            super(eVar);
            this.f1733c = f10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0033  */
    @Override // E6.a
    public Bitmap a(Bitmap source, Bitmap bitmap, E6.a.C0050a params) {
        Bitmap bitmapCreateBitmap;
        n.h(source, "source");
        n.h(params, "params");
        if (!n.d(params.b(), e.b.f642c)) {
            throw new IllegalArgumentException("effect must be Glass.");
        }
        if (!(params instanceof b)) {
            throw new IllegalArgumentException("params must be GlassEffecter.Params.");
        }
        Bitmap bitmapD = c.d(source);
        if (bitmap == null) {
            bitmapCreateBitmap = Bitmap.createBitmap(source.getWidth(), source.getHeight(), Bitmap.Config.ARGB_8888);
            n.g(bitmapCreateBitmap, "createBitmap(...)");
        } else {
            bitmapCreateBitmap = n.d(p097j6.b.a(bitmap), p097j6.b.a(source)) ? bitmap : null;
            if (bitmapCreateBitmap == null) {
                bitmapCreateBitmap = Bitmap.createBitmap(source.getWidth(), source.getHeight(), Bitmap.Config.ARGB_8888);
                n.g(bitmapCreateBitmap, "createBitmap(...)");
            }
        }
        com.nothing.wallpaper.common.log.c.d("GlassEffecter", "apply for " + params + ", reuse " + n.d(bitmapCreateBitmap, bitmap));
        new NTEffectFilter().b(bitmapD, bitmapCreateBitmap, new GlassParam(p239x8.a.b(((float) 32) * ((b) params).d()), 0.0f, 0.0f, 0.0f, 14, null));
        if (!n.d(bitmapD, source)) {
            bitmapD.recycle();
        }
        return bitmapCreateBitmap;
    }
}
