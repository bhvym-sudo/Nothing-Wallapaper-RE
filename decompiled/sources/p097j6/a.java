package p097j6;

import B8.h;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import androidx.constraintlayout.core.widgets.Optimizer;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC1457h;
import kotlin.jvm.internal.n;
import p079h8.o;
import p079h8.u;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f22298a = new a();

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f22306a;

        public b(List pixels) {
            n.h(pixels, "pixels");
            this.f22306a = pixels;
        }

        public final List a() {
            return this.f22306a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && n.d(this.f22306a, ((b) obj).f22306a);
        }

        public int hashCode() {
            return this.f22306a.hashCode();
        }

        public String toString() {
            return "Component(pixels=" + this.f22306a + ")";
        }
    }

    private a() {
    }

    private final Bitmap a(Bitmap bitmap, Bitmap bitmap2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i10 = width * height;
        int[] iArr = new int[i10];
        int[] iArr2 = new int[i10];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        bitmap2.getPixels(iArr2, 0, width, 0, 0, width, height);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        n.g(bitmapCreateBitmap, "createBitmap(...)");
        int[] iArr3 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            iArr3[i11] = Color.argb(Color.red(iArr2[i11]), Color.red(i12), Color.green(i12), Color.blue(i12));
        }
        bitmapCreateBitmap.setPixels(iArr3, 0, width, 0, 0, width, height);
        bitmap2.recycle();
        return bitmapCreateBitmap;
    }

    private final Bitmap b(Context context, Bitmap bitmap, float f10) {
        float fL = h.l(f10, 0.1f, 25.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        n.g(bitmapCreateBitmap, "createBitmap(...)");
        RenderScript renderScriptCreate = null;
        try {
            renderScriptCreate = RenderScript.create(context);
            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap);
            Allocation allocationCreateTyped = Allocation.createTyped(renderScriptCreate, allocationCreateFromBitmap.getType());
            ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            scriptIntrinsicBlurCreate.setRadius(fL);
            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
            allocationCreateTyped.copyTo(bitmapCreateBitmap);
            return bitmapCreateBitmap;
        } catch (Exception e10) {
            com.nothing.wallpaper.common.log.c.g("BitmapEdgeRefineUtil", "blurAlphaChannel error: " + e10.getMessage(), e10);
            return bitmap;
        } finally {
            if (renderScriptCreate != null) {
                renderScriptCreate.destroy();
            }
        }
    }

    private final int[] c(int[] iArr, int i10, int i11) {
        int i12 = i10 * i11;
        int[] iArr2 = new int[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            iArr2[i13] = Integer.MAX_VALUE;
        }
        for (int i14 = 0; i14 < i11; i14++) {
            int i15 = 0;
            while (i15 < i10) {
                int i16 = (i14 * i10) + i15;
                if (Color.alpha(iArr[i16]) > 0) {
                    if (i15 == 0 || i15 == i10 - 1 || i14 == 0 || i14 == i11 - 1 || Color.alpha(iArr[i16 - 1]) == 0 || Color.alpha(iArr[i16 + 1]) == 0 || Color.alpha(iArr[i16 - i10]) == 0 || Color.alpha(iArr[i16 + i10]) == 0) {
                        iArr2[i16] = 0;
                    } else {
                        int iMin = i15 > 0 ? Math.min(SubsamplingScaleImageView.TILE_SIZE_AUTO, iArr2[i16 - 1] + 1) : Integer.MAX_VALUE;
                        if (i14 > 0) {
                            iMin = Math.min(iMin, iArr2[i16 - i10] + 1);
                        }
                        if (i15 > 0 && i14 > 0) {
                            iMin = Math.min(iMin, iArr2[(i16 - i10) - 1] + 1);
                        }
                        if (i15 < i10 - 1 && i14 > 0) {
                            iMin = Math.min(iMin, iArr2[(i16 - i10) + 1] + 1);
                        }
                        if (iMin < Integer.MAX_VALUE) {
                            iArr2[i16] = iMin;
                        }
                    }
                }
                i15++;
            }
        }
        int i17 = i11 - 1;
        for (int i18 = i17; -1 < i18; i18--) {
            int i19 = i10 - 1;
            for (int i20 = i19; -1 < i20; i20--) {
                int i21 = (i18 * i10) + i20;
                int iMin2 = iArr2[i21];
                if (iMin2 < Integer.MAX_VALUE) {
                    if (i20 < i19) {
                        iMin2 = Math.min(iMin2, iArr2[i21 + 1] + 1);
                    }
                    if (i18 < i17) {
                        iMin2 = Math.min(iMin2, iArr2[i21 + i10] + 1);
                    }
                    if (i20 < i19 && i18 < i17) {
                        iMin2 = Math.min(iMin2, iArr2[i21 + i10 + 1] + 1);
                    }
                    if (i20 > 0 && i18 < i17) {
                        iMin2 = Math.min(iMin2, iArr2[(i21 + i10) - 1] + 1);
                    }
                    iArr2[i21] = iMin2;
                }
            }
        }
        for (int i22 = 0; i22 < i12; i22++) {
            if (iArr2[i22] == Integer.MAX_VALUE) {
                iArr2[i22] = -1;
            }
        }
        return iArr2;
    }

    /* JADX WARN: Code duplicated, block: B:80:0x0136  */
    private final Bitmap d(Bitmap bitmap, Bitmap bitmap2, FloatBuffer floatBuffer, c cVar) {
        int[] iArr;
        boolean[] zArr;
        a aVar;
        int i10;
        boolean[] zArrO;
        int i11;
        int[] iArrG;
        int[] iArr2;
        Bitmap bitmap3;
        int i12;
        int i13;
        boolean[] zArr2;
        boolean z9;
        int i14;
        int i15;
        boolean z10;
        int width = bitmap2.getWidth();
        int height = bitmap2.getHeight();
        int i16 = width * height;
        int[] iArr3 = new int[i16];
        bitmap2.getPixels(iArr3, 0, width, 0, 0, width, height);
        if (bitmap == null || bitmap.isRecycled() || bitmap.getWidth() != width || bitmap.getHeight() != height) {
            iArr = null;
        } else {
            int[] iArr4 = new int[i16];
            bitmap.getPixels(iArr4, 0, width, 0, 0, width, height);
            iArr = iArr4;
        }
        int i17 = 0;
        int iM = h.m(cVar.a(), 0, 254);
        boolean z11 = true;
        int iM2 = h.m(cVar.g() % 2 == 0 ? cVar.g() + 1 : cVar.g(), 3, 9) / 2;
        int iM3 = h.m(cVar.d(), 0, 6);
        int iM4 = h.m(cVar.f(), 1, 3);
        boolean zL = cVar.l();
        int iM5 = h.m(cVar.q(), 1, 8);
        boolean[] zArr3 = new boolean[i16];
        for (int i18 = 0; i18 < i16; i18++) {
            zArr3[i18] = (iArr3[i18] >>> 24) > iM;
        }
        boolean[] zArrE = new boolean[i16];
        int i19 = 0;
        while (i19 < height) {
            int i20 = i19 * width;
            int i21 = i17;
            while (i17 < width) {
                int i22 = i20 + i17;
                if (zArr3[i22]) {
                    if (i17 <= 0 || zArr3[i22 - 1]) {
                        z10 = z11;
                        if ((i17 >= width - 1 || zArr3[i22 + 1]) && ((i19 <= 0 || zArr3[i22 - width]) && (i19 >= height - 1 || zArr3[i22 + width]))) {
                        }
                    } else {
                        z10 = z11;
                    }
                    zArrE[i22] = z10;
                } else {
                    z10 = z11;
                }
                i17++;
                z11 = z10;
            }
            i19++;
            i17 = i21;
        }
        boolean z12 = z11;
        int i23 = i17;
        if (iM3 > 0) {
            zArrE = e(zArrE, width, height, iM3);
        }
        boolean[] zArr4 = zArrE;
        int i24 = i23;
        while (true) {
            zArr = zArr3;
            if (i24 >= iM4) {
                break;
            }
            zArr3 = (boolean[]) zArr.clone();
            int i25 = i23;
            while (i25 < height) {
                int i26 = i25 * width;
                int i27 = i23;
                while (i27 < width) {
                    int i28 = i26 + i27;
                    if (zArr4[i28]) {
                        int i29 = -iM2;
                        zArr2 = zArr;
                        if (i29 <= iM2) {
                            int i30 = i23;
                            int i31 = i30;
                            int i32 = i29;
                            while (true) {
                                int i33 = i25 + i32;
                                if (i33 >= 0 && i33 < height) {
                                    int i34 = i33 * width;
                                    if (i29 <= iM2) {
                                        while (true) {
                                            int i35 = i27 + i29;
                                            if (i35 >= 0 && i35 < width) {
                                                i31++;
                                                if (zArr2[i34 + i35]) {
                                                    i30++;
                                                }
                                            }
                                            if (i29 == iM2) {
                                                break;
                                            }
                                            i29++;
                                        }
                                    }
                                }
                                if (i32 == iM2) {
                                    break;
                                }
                                i32++;
                                i29 = i29;
                            }
                            i15 = i30;
                            i14 = i31;
                        } else {
                            i14 = i23;
                            i15 = i14;
                        }
                        int iR = cVar.r();
                        z9 = z12 ? 1 : 0;
                        zArr3[i28] = i15 >= h.m(iR, z9 ? 1 : 0, i14) ? z9 ? 1 : 0 : i23;
                    } else {
                        zArr2 = zArr;
                        z9 = z12 ? 1 : 0;
                    }
                    i27++;
                    z12 = z9;
                    iM2 = iM2;
                    iArr = iArr;
                    zArr = zArr2;
                }
                Object[] objArr = z12 ? 1 : 0;
                i25++;
                iM2 = iM2;
            }
            Object[] objArr2 = z12 ? 1 : 0;
            i24++;
            iM2 = iM2;
        }
        int[] iArr5 = iArr;
        if (!cVar.h() || iArr5 == null) {
            aVar = this;
            i10 = iM5;
            zArrO = zArr;
            i11 = 2;
        } else {
            i11 = 2;
            i10 = iM5;
            aVar = this;
            zArrO = aVar.o(iArr5, floatBuffer, zArr, width, height, iM, cVar.b(), cVar.o(), cVar.p(), cVar.c(), cVar.s(), cVar.n());
        }
        if (zL) {
            height = height;
            iArrG = aVar.g(zArrO, width, height);
        } else {
            height = height;
            iArrG = null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        n.g(bitmapCreateBitmap, "createBitmap(...)");
        int[] iArr6 = (int[]) iArr3.clone();
        int i36 = i23;
        while (i36 < height) {
            int i37 = i36 * width;
            int i38 = i23;
            while (i38 < width) {
                int i39 = i37 + i38;
                if (zArrO[i39]) {
                    if (zArr4[i39]) {
                        int i40 = i23;
                        int i41 = i40;
                        int i42 = -1;
                        while (i42 < i11) {
                            int i43 = i36 + i42;
                            if (i43 >= 0 && i43 < height) {
                                int i44 = i43 * width;
                                for (int i45 = -1; i45 < 2; i45++) {
                                    int i46 = i38 + i45;
                                    if (i46 >= 0 && i46 < width) {
                                        int i47 = i46 + i44;
                                        if (zArrO[i47]) {
                                            i41 += iArr3[i47] >>> 24;
                                            i40++;
                                        }
                                    }
                                }
                            }
                            i42++;
                            iArrG = iArrG;
                            bitmapCreateBitmap = bitmapCreateBitmap;
                            i11 = 2;
                        }
                        iArr2 = iArrG;
                        bitmap3 = bitmapCreateBitmap;
                        if (i40 > 0) {
                            int iM6 = 255;
                            int iM7 = h.m(i41 / i40, i23, 255);
                            if (zL) {
                                n.e(iArr2);
                                int i48 = iArr2[i39];
                                i12 = i10;
                                if (i48 < 0 || i48 > i12) {
                                    i13 = 0;
                                } else {
                                    i13 = 0;
                                    iM6 = h.m(((i48 + 1) * 255) / (i12 + 1), 0, 255);
                                }
                                iM7 = Math.min(Math.min(iM7, iM6), iArr3[i39] >>> 24);
                            } else {
                                i12 = i10;
                                i13 = 0;
                            }
                            iArr6[i39] = (iArr3[i39] & 16777215) | (iM7 << 24);
                        }
                        i38++;
                        iArrG = iArr2;
                        bitmapCreateBitmap = bitmap3;
                        i10 = i12;
                        i23 = i13;
                        i11 = 2;
                    }
                    i13 = i23;
                    i12 = i10;
                    i38++;
                    iArrG = iArr2;
                    bitmapCreateBitmap = bitmap3;
                    i10 = i12;
                    i23 = i13;
                    i11 = 2;
                } else {
                    iArr6[i39] = i23;
                }
                iArr2 = iArrG;
                bitmap3 = bitmapCreateBitmap;
                i13 = i23;
                i12 = i10;
                i38++;
                iArrG = iArr2;
                bitmapCreateBitmap = bitmap3;
                i10 = i12;
                i23 = i13;
                i11 = 2;
            }
            i36++;
            i11 = 2;
        }
        Bitmap bitmap4 = bitmapCreateBitmap;
        bitmap4.setPixels(iArr6, 0, width, 0, 0, width, height);
        return bitmap4;
    }

    private final boolean[] e(boolean[] zArr, int i10, int i11, int i12) {
        int i13;
        boolean[] zArr2 = (boolean[]) zArr.clone();
        int iM = h.m(i12, 1, 6);
        for (int i14 = 0; i14 < i11; i14++) {
            int i15 = i14 * i10;
            for (int i16 = 0; i16 < i10; i16++) {
                if (zArr[i15 + i16] && (i13 = -iM) <= iM) {
                    int i17 = i13;
                    while (true) {
                        int i18 = i14 + i17;
                        if (i18 >= 0 && i18 < i11) {
                            int i19 = i18 * i10;
                            if (i13 <= iM) {
                                int i20 = i13;
                                while (true) {
                                    int i21 = i16 + i20;
                                    if (i21 >= 0 && i21 < i10) {
                                        zArr2[i21 + i19] = true;
                                    }
                                    if (i20 == iM) {
                                        break;
                                    }
                                    i20++;
                                }
                            }
                        }
                        if (i17 != iM) {
                            i17++;
                        }
                    }
                }
            }
        }
        return zArr2;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a1  */
    private final Bitmap f(Bitmap bitmap, int i10) {
        int[] iArr;
        int i11;
        int i12;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i13 = width * height;
        int[] iArr2 = new int[i13];
        int i14 = 0;
        bitmap.getPixels(iArr2, 0, width, 0, 0, width, height);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        n.g(bitmapCreateBitmap, "createBitmap(...)");
        Bitmap bitmap2 = bitmapCreateBitmap;
        int[] iArr3 = new int[i13];
        for (int i15 = 0; i15 < i13; i15++) {
            iArr3[i15] = 0;
        }
        int i16 = 0;
        while (i16 < height) {
            int i17 = i14;
            while (i17 < width) {
                int i18 = (i16 * width) + i17;
                if (Color.alpha(iArr2[i18]) <= 0 || (i12 = -i10) > i10) {
                    iArr = iArr3;
                    iArr2 = iArr2;
                    bitmap2 = bitmap2;
                    i11 = i14;
                    i16 = i16;
                } else {
                    int i19 = i12;
                    while (true) {
                        if (i12 <= i10) {
                            int i20 = i12;
                            while (true) {
                                int i21 = i17 + i20;
                                int i22 = i16 + i19;
                                if (i21 < 0 || i21 >= width || i22 < 0 || i22 >= height) {
                                    iArr = iArr3;
                                    i11 = i14;
                                } else {
                                    int i23 = (i22 * width) + i21;
                                    if (Color.alpha(iArr3[i23]) == 0) {
                                        float fSqrt = (float) Math.sqrt((i20 * i20) + (i19 * i19));
                                        float f10 = i10;
                                        float f11 = fSqrt <= f10 ? 1.0f - ((fSqrt / f10) * 0.3f) : 0.0f;
                                        int i24 = iArr2[i18];
                                        iArr = iArr3;
                                        i11 = 0;
                                        iArr[i23] = Color.argb(h.m((int) (Color.alpha(i24) * f11), 0, 255), Color.red(i24), Color.green(i24), Color.blue(i24));
                                    } else {
                                        iArr = iArr3;
                                        i11 = i14;
                                    }
                                }
                                if (i20 == i10) {
                                    break;
                                }
                                i20++;
                                iArr3 = iArr;
                                i14 = i11;
                                i16 = i16;
                                iArr2 = iArr2;
                                bitmap2 = bitmap2;
                            }
                        } else {
                            iArr = iArr3;
                            iArr2 = iArr2;
                            bitmap2 = bitmap2;
                            i11 = i14;
                            i16 = i16;
                        }
                        if (i19 != i10) {
                            i19++;
                            iArr3 = iArr;
                            i14 = i11;
                            i16 = i16;
                            iArr2 = iArr2;
                            bitmap2 = bitmap2;
                        }
                    }
                }
                i17++;
                iArr3 = iArr;
                i14 = i11;
                i16 = i16;
                iArr2 = iArr2;
                bitmap2 = bitmap2;
            }
            i16++;
            bitmap2 = bitmap2;
        }
        Bitmap bitmap3 = bitmap2;
        bitmap3.setPixels(iArr3, 0, width, 0, 0, width, height);
        return bitmap3;
    }

    private final int[] g(boolean[] zArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20 = i10 * i11;
        int[] iArr = new int[i20];
        for (int i21 = 0; i21 < i20; i21++) {
            iArr[i21] = Integer.MAX_VALUE;
        }
        for (int i22 = 0; i22 < i11; i22++) {
            int i23 = i22 * i10;
            for (int i24 = 0; i24 < i10; i24++) {
                int i25 = i23 + i24;
                if (!zArr[i25]) {
                    iArr[i25] = -1;
                } else if (i24 == 0 || i24 == i10 - 1 || i22 == 0 || i22 == i11 - 1 || !zArr[i25 - 1] || !zArr[i25 + 1] || !zArr[i25 - i10] || !zArr[i25 + i10]) {
                    iArr[i25] = 0;
                }
            }
        }
        for (int i26 = 0; i26 < i11; i26++) {
            int i27 = i26 * i10;
            for (int i28 = 0; i28 < i10; i28++) {
                int i29 = i27 + i28;
                int iMin = iArr[i29];
                if (iMin >= 0 && iMin != 0) {
                    if (i28 > 0 && (i19 = iArr[i29 - 1]) >= 0) {
                        iMin = Math.min(iMin, i19 + 1);
                    }
                    if (i26 > 0 && (i18 = iArr[i29 - i10]) >= 0) {
                        iMin = Math.min(iMin, i18 + 1);
                    }
                    if (i28 > 0 && i26 > 0 && (i17 = iArr[(i29 - i10) - 1]) >= 0) {
                        iMin = Math.min(iMin, i17 + 1);
                    }
                    if (i28 < i10 - 1 && i26 > 0 && (i16 = iArr[(i29 - i10) + 1]) >= 0) {
                        iMin = Math.min(iMin, i16 + 1);
                    }
                    iArr[i29] = iMin;
                }
            }
        }
        int i30 = i11 - 1;
        for (int i31 = i30; -1 < i31; i31--) {
            int i32 = i31 * i10;
            int i33 = i10 - 1;
            for (int i34 = i33; -1 < i34; i34--) {
                int i35 = i32 + i34;
                int iMin2 = iArr[i35];
                if (iMin2 >= 0 && iMin2 != 0) {
                    if (i34 < i33 && (i15 = iArr[i35 + 1]) >= 0) {
                        iMin2 = Math.min(iMin2, i15 + 1);
                    }
                    if (i31 < i30 && (i14 = iArr[i35 + i10]) >= 0) {
                        iMin2 = Math.min(iMin2, i14 + 1);
                    }
                    if (i34 < i33 && i31 < i30 && (i13 = iArr[i35 + i10 + 1]) >= 0) {
                        iMin2 = Math.min(iMin2, i13 + 1);
                    }
                    if (i34 > 0 && i31 < i30 && (i12 = iArr[(i35 + i10) - 1]) >= 0) {
                        iMin2 = Math.min(iMin2, i12 + 1);
                    }
                    iArr[i35] = iMin2;
                }
            }
        }
        for (int i36 = 0; i36 < i20; i36++) {
            if (iArr[i36] == Integer.MAX_VALUE) {
                iArr[i36] = 0;
            }
        }
        return iArr;
    }

    private static final Bitmap h(Context context, Bitmap bitmap, int i10) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i11 = width * height;
        int[] iArr = new int[i11];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int[] iArrC = f22298a.c(iArr, width, height);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        n.g(bitmapCreateBitmap, "createBitmap(...)");
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < height; i12++) {
            for (int i13 = 0; i13 < width; i13++) {
                int i14 = (i12 * width) + i13;
                int i15 = iArrC[i14];
                if (i15 < 0) {
                    iArr2[i14] = 0;
                } else if (i15 <= i10) {
                    int i16 = iArr[i14];
                    iArr2[i14] = Color.argb(h.m((int) (Color.alpha(i16) * (i15 / i10)), 0, 255), Color.red(i16), Color.green(i16), Color.blue(i16));
                } else {
                    iArr2[i14] = iArr[i14];
                }
            }
        }
        bitmapCreateBitmap.setPixels(iArr2, 0, width, 0, 0, width, height);
        a aVar = f22298a;
        return aVar.a(bitmapCreateBitmap, aVar.b(context, aVar.j(bitmapCreateBitmap), i10 * 0.5f));
    }

    private final Bitmap i(Bitmap bitmap, int i10) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i11 = width * height;
        int[] iArr = new int[i11];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        n.g(bitmapCreateBitmap, "createBitmap(...)");
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < height; i12++) {
            for (int i13 = 0; i13 < width; i13++) {
                int i14 = (i12 * width) + i13;
                if (Color.alpha(iArr[i14]) == 0) {
                    iArr2[i14] = 0;
                } else {
                    int i15 = -i10;
                    boolean z9 = false;
                    if (i15 <= i10) {
                        int i16 = i15;
                        while (true) {
                            if (i15 <= i10) {
                                int i17 = i15;
                                while (true) {
                                    int i18 = i13 + i17;
                                    int i19 = i12 + i16;
                                    if (i18 < 0 || i18 >= width || i19 < 0 || i19 >= height || Color.alpha(iArr[(i19 * width) + i18]) == 0) {
                                        z9 = true;
                                        break;
                                    }
                                    if (i17 == i10) {
                                        break;
                                    }
                                    i17++;
                                }
                            }
                            if (z9 || i16 == i10) {
                                break;
                            }
                            i16++;
                        }
                    }
                    if (z9) {
                        iArr2[i14] = 0;
                    } else {
                        iArr2[i14] = iArr[i14];
                    }
                }
            }
        }
        bitmapCreateBitmap.setPixels(iArr2, 0, width, 0, 0, width, height);
        return bitmapCreateBitmap;
    }

    private final Bitmap j(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i10 = width * height;
        int[] iArr = new int[i10];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        n.g(bitmapCreateBitmap, "createBitmap(...)");
        int[] iArr2 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int iAlpha = Color.alpha(iArr[i11]);
            iArr2[i11] = Color.argb(iAlpha, iAlpha, iAlpha, iAlpha);
        }
        bitmapCreateBitmap.setPixels(iArr2, 0, width, 0, 0, width, height);
        return bitmapCreateBitmap;
    }

    private final b k(int[] iArr, boolean[] zArr, int i10, int i11, int i12, int i13) {
        b bVar = new b(new ArrayList());
        ArrayList arrayList = new ArrayList();
        arrayList.add(new o(Integer.valueOf(i10), Integer.valueOf(i11)));
        while (!arrayList.isEmpty()) {
            o oVar = (o) arrayList.remove(arrayList.size() - 1);
            int iIntValue = ((Number) oVar.a()).intValue();
            int iIntValue2 = ((Number) oVar.b()).intValue();
            int i14 = (iIntValue2 * i12) + iIntValue;
            if (iIntValue >= 0 && iIntValue < i12 && iIntValue2 >= 0 && iIntValue2 < i13 && !zArr[i14] && Color.alpha(iArr[i14]) != 0) {
                zArr[i14] = true;
                bVar.a().add(Integer.valueOf(i14));
                for (int i15 = -1; i15 < 2; i15++) {
                    for (int i16 = -1; i16 < 2; i16++) {
                        if (i16 != 0 || i15 != 0) {
                            int i17 = iIntValue + i16;
                            int i18 = iIntValue2 + i15;
                            if (i17 >= 0 && i17 < i12 && i18 >= 0 && i18 < i13) {
                                int i19 = (i18 * i12) + i17;
                                if (!zArr[i19] && Color.alpha(iArr[i19]) > 0) {
                                    arrayList.add(new o(Integer.valueOf(i17), Integer.valueOf(i18)));
                                }
                            }
                        }
                    }
                }
            }
        }
        return bVar;
    }

    private static final Bitmap l(Bitmap bitmap, int i10) {
        if (i10 % 2 == 0) {
            i10++;
        }
        int i11 = i10 / 2;
        a aVar = f22298a;
        return aVar.i(aVar.f(aVar.f(aVar.i(bitmap, i11), i11), i11), i11);
    }

    private final float m(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        float f10 = i10 - i13;
        float f11 = i11 - i14;
        float f12 = i12 - i15;
        return ((f10 * f10) / (i16 * 2.0f)) + ((f11 * f11) / i17) + ((f12 * f12) / i18);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00db  */
    public static final Bitmap n(Context context, Bitmap bitmap, Bitmap extractedBitmap, FloatBuffer floatBuffer, c config) {
        Bitmap bitmapL;
        n.h(context, "context");
        n.h(extractedBitmap, "extractedBitmap");
        n.h(config, "config");
        if (extractedBitmap.isRecycled()) {
            com.nothing.wallpaper.common.log.c.f("BitmapEdgeRefineUtil", "refineExtractedImage, bitmap is recycled!");
            return extractedBitmap;
        }
        Bitmap bitmapCopy = extractedBitmap.copy(Bitmap.Config.ARGB_8888, false);
        try {
            if (config.j()) {
                a aVar = f22298a;
                n.e(bitmapCopy);
                bitmapL = aVar.d(bitmap, bitmapCopy, floatBuffer, config);
                try {
                    if (!n.d(bitmapCopy, extractedBitmap) && !n.d(bitmapCopy, bitmapL)) {
                        bitmapCopy.recycle();
                    }
                    bitmapCopy = bitmapL;
                } catch (Exception e10) {
                    e = e10;
                    bitmapCopy = bitmapL;
                    com.nothing.wallpaper.common.log.c.g("BitmapEdgeRefineUtil", "refineExtractedImage error: " + e.getMessage(), e);
                    if (!n.d(bitmapCopy, extractedBitmap)) {
                        bitmapCopy.recycle();
                    }
                    return extractedBitmap;
                }
            }
            if (config.i()) {
                n.e(bitmapCopy);
                Bitmap bitmapQ = q(bitmapCopy, config.t());
                if (!n.d(bitmapCopy, extractedBitmap) && !n.d(bitmapCopy, bitmapQ)) {
                    bitmapCopy.recycle();
                }
                bitmapCopy = bitmapQ;
            }
            if (config.m()) {
                n.e(bitmapCopy);
                bitmapL = l(bitmapCopy, config.u());
                if (!n.d(bitmapCopy, extractedBitmap) && !n.d(bitmapCopy, bitmapL)) {
                    bitmapCopy.recycle();
                }
                bitmapCopy = bitmapL;
            }
            if (config.k()) {
                n.e(bitmapCopy);
                Bitmap bitmapH = h(context, bitmapCopy, config.e());
                try {
                    if (!n.d(bitmapCopy, extractedBitmap) && !n.d(bitmapCopy, bitmapH)) {
                        bitmapCopy.recycle();
                    }
                    bitmapCopy = bitmapH;
                } catch (Exception e11) {
                    bitmapCopy = bitmapH;
                    e = e11;
                    com.nothing.wallpaper.common.log.c.g("BitmapEdgeRefineUtil", "refineExtractedImage error: " + e.getMessage(), e);
                    if (!n.d(bitmapCopy, extractedBitmap)) {
                        bitmapCopy.recycle();
                    }
                    return extractedBitmap;
                }
            }
            com.nothing.wallpaper.common.log.c.d("BitmapEdgeRefineUtil", "图片优化完成");
            n.e(bitmapCopy);
            return bitmapCopy;
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0237  */
    private final boolean[] o(int[] iArr, FloatBuffer floatBuffer, boolean[] zArr, int i10, int i11, int i12, int i13, int i14, int i15, float f10, int i16, float f11) {
        int i17;
        float f12;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        a aVar = this;
        int i31 = i10 * i11;
        int iM = h.m(i15, 1, h.m(Math.min(i10, i11) / 2, 1, Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING));
        int iM2 = h.m(i13, 1, 30);
        int iM3 = h.m(i14, 1, 30);
        int[] iArrG = aVar.g(zArr, i10, i11);
        boolean[] zArrE = aVar.e(zArr, i10, i11, iM2);
        C0556a c0556a = new C0556a(0, 0L, 0L, 0L, 0L, 0L, 0L, 127, null);
        C0556a c0556a2 = new C0556a(0, 0L, 0L, 0L, 0L, 0L, 0L, 127, null);
        int i32 = 0;
        int i33 = 0;
        for (int i34 = 0; i34 < i31; i34++) {
            if (i32 < i16 && zArrE[i34] && !zArr[i34]) {
                u uVarR = aVar.r(iArr[i34]);
                c0556a.a(((Number) uVarR.a()).intValue(), ((Number) uVarR.b()).intValue(), ((Number) uVarR.c()).intValue());
                i32++;
            }
            if (i33 < i16 && zArr[i34] && (i30 = iArrG[i34]) >= 0 && i30 <= iM3) {
                u uVarR2 = aVar.r(iArr[i34]);
                c0556a2.a(((Number) uVarR2.a()).intValue(), ((Number) uVarR2.b()).intValue(), ((Number) uVarR2.c()).intValue());
                i33++;
            }
            if (i32 >= i16 && i33 >= i16) {
                break;
            }
        }
        if (c0556a.b() < 200 || c0556a2.b() < 200) {
            return zArr;
        }
        int iG = (int) (c0556a.g() / ((long) c0556a.b()));
        int iC = (int) (c0556a.c() / ((long) c0556a.b()));
        int iE = (int) (c0556a.e() / ((long) c0556a.b()));
        int iG2 = (int) (c0556a2.g() / ((long) c0556a2.b()));
        int iC2 = (int) (c0556a2.c() / ((long) c0556a2.b()));
        int iE2 = (int) (c0556a2.e() / ((long) c0556a2.b()));
        int iP = p(c0556a.g(), c0556a.h(), c0556a.b());
        int i35 = iG;
        int i36 = iC;
        int iP2 = p(c0556a.c(), c0556a.d(), c0556a.b());
        int iP3 = p(c0556a.e(), c0556a.f(), c0556a.b());
        int iP4 = p(c0556a2.g(), c0556a2.h(), c0556a2.b());
        int iP5 = p(c0556a2.c(), c0556a2.d(), c0556a2.b());
        int iP6 = p(c0556a2.e(), c0556a2.f(), c0556a2.b());
        boolean[] zArr2 = (boolean[]) zArr.clone();
        float f13 = 1.0f;
        float fL = h.l(f10, 0.0f, 1.0f);
        int i37 = 0;
        while (i37 < i31) {
            Float fValueOf = Float.valueOf(floatBuffer != null ? floatBuffer.get() : -1.0f);
            if (!zArr[i37] || (i29 = iArrG[i37]) < 0 || i29 > iM) {
                i17 = i37;
                f12 = f13;
                i18 = iG2;
                i19 = iP6;
                i20 = iC2;
                i21 = iE;
                i22 = iP;
                i23 = iP4;
                i24 = iE2;
                i25 = iP2;
                i26 = i35;
                i27 = iP5;
                i28 = iP3;
            } else {
                int i38 = iArr[i37];
                if ((i38 >>> 24) > i12) {
                    u uVarR3 = aVar.r(i38);
                    int iIntValue = ((Number) uVarR3.a()).intValue();
                    int iIntValue2 = ((Number) uVarR3.b()).intValue();
                    int iIntValue3 = ((Number) uVarR3.c()).intValue();
                    f12 = f13;
                    i17 = i37;
                    int i39 = i35;
                    int i40 = i36;
                    int i41 = iP2;
                    int i42 = iE2;
                    int i43 = iC2;
                    int i44 = iG2;
                    int i45 = iP3;
                    float fM = aVar.m(iIntValue, iIntValue2, iIntValue3, i39, i40, iE, iP, i41, i45);
                    int i46 = iP4;
                    i26 = i39;
                    i18 = i44;
                    i22 = iP;
                    i23 = i46;
                    i36 = i40;
                    i20 = i43;
                    i25 = i41;
                    i27 = iP5;
                    i28 = i45;
                    i19 = iP6;
                    i21 = iE;
                    i24 = i42;
                    if (fM * (fL + f12) < aVar.m(iIntValue, iIntValue2, iIntValue3, i18, i20, i24, i23, i27, i19) && fValueOf.floatValue() < f11) {
                        zArr2[i17] = false;
                    }
                } else {
                    i17 = i37;
                    f12 = f13;
                    i18 = iG2;
                    i19 = iP6;
                    i20 = iC2;
                    i21 = iE;
                    i22 = iP;
                    i23 = iP4;
                    i24 = iE2;
                    i25 = iP2;
                    i26 = i35;
                    i27 = iP5;
                    i28 = iP3;
                }
            }
            i37 = i17 + 1;
            aVar = this;
            iP2 = i25;
            iP3 = i28;
            f13 = f12;
            iE2 = i24;
            iP5 = i27;
            i35 = i26;
            iE = i21;
            iP4 = i23;
            iP6 = i19;
            iP = i22;
            iG2 = i18;
            iC2 = i20;
        }
        return zArr2;
    }

    private static final int p(long j9, long j10, int i10) {
        double d10 = i10;
        double d11 = j9 / d10;
        return (int) h.d((j10 / d10) - (d11 * d11), 16.0d);
    }

    private static final Bitmap q(Bitmap bitmap, float f10) {
        Object obj;
        int i10;
        int i11;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i12 = width * height;
        int i13 = (int) (i12 * f10);
        int[] iArr = new int[i12];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        boolean[] zArr = new boolean[i12];
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < height; i14++) {
            int i15 = width;
            int i16 = 0;
            while (i16 < i15) {
                int i17 = (i14 * i15) + i16;
                if (zArr[i17] || Color.alpha(iArr[i17]) <= 0) {
                    int i18 = i15;
                    i10 = i16;
                    i11 = i18;
                } else {
                    int i19 = height;
                    b bVarK = f22298a.k(iArr, zArr, i16, i14, i15, i19);
                    int i20 = i15;
                    i10 = i16;
                    i11 = i20;
                    height = i19;
                    if (bVarK.a().size() >= i13) {
                        arrayList.add(bVarK);
                    }
                }
                int i21 = i10 + 1;
                i15 = i11;
                i16 = i21;
            }
            width = i15;
        }
        if (arrayList.isEmpty()) {
            com.nothing.wallpaper.common.log.c.o("BitmapEdgeRefineUtil", "未找到任何连通域");
            return bitmap;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int size = ((b) next).a().size();
                do {
                    Object next2 = it.next();
                    int size2 = ((b) next2).a().size();
                    if (size < size2) {
                        next = next2;
                        size = size2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        b bVar = (b) obj;
        if (bVar == null) {
            return bitmap;
        }
        com.nothing.wallpaper.common.log.c.d("BitmapEdgeRefineUtil", "找到 " + arrayList.size() + " 个连通域，最大连通域面积: " + bVar.a().size());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        n.g(bitmapCreateBitmap, "createBitmap(...)");
        int[] iArr2 = new int[i12];
        for (int i22 = 0; i22 < i12; i22++) {
            iArr2[i22] = 0;
        }
        Iterator it2 = bVar.a().iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            iArr2[iIntValue] = iArr[iIntValue];
        }
        bitmapCreateBitmap.setPixels(iArr2, 0, width, 0, 0, width, height);
        return bitmapCreateBitmap;
    }

    private final u r(int i10) {
        float f10 = (i10 >> 16) & 255;
        float f11 = (i10 >> 8) & 255;
        float f12 = i10 & 255;
        return new u(Integer.valueOf(h.m((int) ((0.299f * f10) + (0.587f * f11) + (0.114f * f12)), 0, 255)), Integer.valueOf(h.m((int) ((((-0.169f) * f10) - (0.331f * f11)) + (f12 * 0.5f) + 128.0f), 0, 255)), Integer.valueOf(h.m((int) ((((f10 * 0.5f) - (f11 * 0.419f)) - (f12 * 0.081f)) + 128.0f), 0, 255)));
    }

    /* JADX INFO: renamed from: j6.a$a, reason: collision with other inner class name */
    private static final class C0556a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f22299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f22300b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f22301c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f22302d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f22303e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f22304f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f22305g;

        public C0556a(int i10, long j9, long j10, long j11, long j12, long j13, long j14) {
            this.f22299a = i10;
            this.f22300b = j9;
            this.f22301c = j10;
            this.f22302d = j11;
            this.f22303e = j12;
            this.f22304f = j13;
            this.f22305g = j14;
        }

        public final void a(int i10, int i11, int i12) {
            this.f22299a++;
            long j9 = i10;
            this.f22300b += j9;
            long j10 = i11;
            this.f22301c += j10;
            long j11 = i12;
            this.f22302d += j11;
            this.f22303e += j9 * j9;
            this.f22304f += j10 * j10;
            this.f22305g += j11 * j11;
        }

        public final int b() {
            return this.f22299a;
        }

        public final long c() {
            return this.f22301c;
        }

        public final long d() {
            return this.f22304f;
        }

        public final long e() {
            return this.f22302d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0556a)) {
                return false;
            }
            C0556a c0556a = (C0556a) obj;
            return this.f22299a == c0556a.f22299a && this.f22300b == c0556a.f22300b && this.f22301c == c0556a.f22301c && this.f22302d == c0556a.f22302d && this.f22303e == c0556a.f22303e && this.f22304f == c0556a.f22304f && this.f22305g == c0556a.f22305g;
        }

        public final long f() {
            return this.f22305g;
        }

        public final long g() {
            return this.f22300b;
        }

        public final long h() {
            return this.f22303e;
        }

        public int hashCode() {
            return (((((((((((Integer.hashCode(this.f22299a) * 31) + Long.hashCode(this.f22300b)) * 31) + Long.hashCode(this.f22301c)) * 31) + Long.hashCode(this.f22302d)) * 31) + Long.hashCode(this.f22303e)) * 31) + Long.hashCode(this.f22304f)) * 31) + Long.hashCode(this.f22305g);
        }

        public String toString() {
            return "ColorStats(count=" + this.f22299a + ", sumY=" + this.f22300b + ", sumU=" + this.f22301c + ", sumV=" + this.f22302d + ", sumYY=" + this.f22303e + ", sumUU=" + this.f22304f + ", sumVV=" + this.f22305g + ")";
        }

        public /* synthetic */ C0556a(int i10, long j9, long j10, long j11, long j12, long j13, long j14, int i11, AbstractC1457h abstractC1457h) {
            this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? 0L : j9, (i11 & 4) != 0 ? 0L : j10, (i11 & 8) != 0 ? 0L : j11, (i11 & 16) != 0 ? 0L : j12, (i11 & 32) != 0 ? 0L : j13, (i11 & 64) != 0 ? 0L : j14);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f22307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f22308b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f22309c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f22310d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f22311e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f22312f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f22313g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f22314h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f22315i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int f22316j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f22317k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f22318l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final float f22319m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final float f22320n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final int f22321o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final int f22322p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final int f22323q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final float f22324r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final boolean f22325s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final boolean f22326t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final boolean f22327u;

        public c(boolean z9, int i10, int i11, int i12, int i13, int i14, boolean z10, int i15, boolean z11, int i16, int i17, int i18, float f10, float f11, int i19, int i20, int i21, float f12, boolean z12, boolean z13, boolean z14) {
            this.f22307a = z9;
            this.f22308b = i10;
            this.f22309c = i11;
            this.f22310d = i12;
            this.f22311e = i13;
            this.f22312f = i14;
            this.f22313g = z10;
            this.f22314h = i15;
            this.f22315i = z11;
            this.f22316j = i16;
            this.f22317k = i17;
            this.f22318l = i18;
            this.f22319m = f10;
            this.f22320n = f11;
            this.f22321o = i19;
            this.f22322p = i20;
            this.f22323q = i21;
            this.f22324r = f12;
            this.f22325s = z12;
            this.f22326t = z13;
            this.f22327u = z14;
        }

        public final int a() {
            return this.f22308b;
        }

        public final int b() {
            return this.f22316j;
        }

        public final float c() {
            return this.f22319m;
        }

        public final int d() {
            return this.f22309c;
        }

        public final int e() {
            return this.f22323q;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f22307a == cVar.f22307a && this.f22308b == cVar.f22308b && this.f22309c == cVar.f22309c && this.f22310d == cVar.f22310d && this.f22311e == cVar.f22311e && this.f22312f == cVar.f22312f && this.f22313g == cVar.f22313g && this.f22314h == cVar.f22314h && this.f22315i == cVar.f22315i && this.f22316j == cVar.f22316j && this.f22317k == cVar.f22317k && this.f22318l == cVar.f22318l && Float.compare(this.f22319m, cVar.f22319m) == 0 && Float.compare(this.f22320n, cVar.f22320n) == 0 && this.f22321o == cVar.f22321o && this.f22322p == cVar.f22322p && this.f22323q == cVar.f22323q && Float.compare(this.f22324r, cVar.f22324r) == 0 && this.f22325s == cVar.f22325s && this.f22326t == cVar.f22326t && this.f22327u == cVar.f22327u;
        }

        public final int f() {
            return this.f22312f;
        }

        public final int g() {
            return this.f22310d;
        }

        public final boolean h() {
            return this.f22315i;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((((((((((((Boolean.hashCode(this.f22307a) * 31) + Integer.hashCode(this.f22308b)) * 31) + Integer.hashCode(this.f22309c)) * 31) + Integer.hashCode(this.f22310d)) * 31) + Integer.hashCode(this.f22311e)) * 31) + Integer.hashCode(this.f22312f)) * 31) + Boolean.hashCode(this.f22313g)) * 31) + Integer.hashCode(this.f22314h)) * 31) + Boolean.hashCode(this.f22315i)) * 31) + Integer.hashCode(this.f22316j)) * 31) + Integer.hashCode(this.f22317k)) * 31) + Integer.hashCode(this.f22318l)) * 31) + Float.hashCode(this.f22319m)) * 31) + Float.hashCode(this.f22320n)) * 31) + Integer.hashCode(this.f22321o)) * 31) + Integer.hashCode(this.f22322p)) * 31) + Integer.hashCode(this.f22323q)) * 31) + Float.hashCode(this.f22324r)) * 31) + Boolean.hashCode(this.f22325s)) * 31) + Boolean.hashCode(this.f22326t)) * 31) + Boolean.hashCode(this.f22327u);
        }

        public final boolean i() {
            return this.f22327u;
        }

        public final boolean j() {
            return this.f22307a;
        }

        public final boolean k() {
            return this.f22326t;
        }

        public final boolean l() {
            return this.f22313g;
        }

        public final boolean m() {
            return this.f22325s;
        }

        public final float n() {
            return this.f22320n;
        }

        public final int o() {
            return this.f22317k;
        }

        public final int p() {
            return this.f22318l;
        }

        public final int q() {
            return this.f22314h;
        }

        public final int r() {
            return this.f22311e;
        }

        public final int s() {
            return this.f22321o;
        }

        public final float t() {
            return this.f22324r;
        }

        public String toString() {
            return "RefineConfig(enableEdgeDenoiseOnly=" + this.f22307a + ", alphaThreshold=" + this.f22308b + ", edgeBandRadius=" + this.f22309c + ", edgeKernelSize=" + this.f22310d + ", majorityThreshold=" + this.f22311e + ", edgeIterations=" + this.f22312f + ", enableLinearAlphaTransition=" + this.f22313g + ", linearAlphaWidth=" + this.f22314h + ", enableBackgroundLeakRemoval=" + this.f22315i + ", bgSampleRadius=" + this.f22316j + ", fgSampleWidth=" + this.f22317k + ", leakCheckDistance=" + this.f22318l + ", bgVsFgMargin=" + this.f22319m + ", fgMaxConfidence=" + this.f22320n + ", maxSamples=" + this.f22321o + ", morphologyKernelSize=" + this.f22322p + ", edgeFeatherRadius=" + this.f22323q + ", minComponentAreaRatio=" + this.f22324r + ", enableMorphologySmooth=" + this.f22325s + ", enableEdgeFeather=" + this.f22326t + ", enableComponentCleanup=" + this.f22327u + ")";
        }

        public final int u() {
            return this.f22322p;
        }

        public /* synthetic */ c(boolean z9, int i10, int i11, int i12, int i13, int i14, boolean z10, int i15, boolean z11, int i16, int i17, int i18, float f10, float f11, int i19, int i20, int i21, float f12, boolean z12, boolean z13, boolean z14, int i22, AbstractC1457h abstractC1457h) {
            this((i22 & 1) != 0 ? true : z9, (i22 & 2) != 0 ? 8 : i10, (i22 & 4) != 0 ? 1 : i11, (i22 & 8) != 0 ? 3 : i12, (i22 & 16) != 0 ? 5 : i13, (i22 & 32) != 0 ? 1 : i14, (i22 & 64) != 0 ? true : z10, (i22 & Optimizer.OPTIMIZATION_GRAPH_WRAP) != 0 ? 3 : i15, (i22 & 256) == 0 ? z11 : true, (i22 & Optimizer.OPTIMIZATION_DEPENDENCY_ORDERING) != 0 ? 6 : i16, (i22 & Optimizer.OPTIMIZATION_GROUPING) != 0 ? 4 : i17, (i22 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? 10 : i18, (i22 & 4096) != 0 ? 0.15f : f10, (i22 & 8192) != 0 ? 1.0f : f11, (i22 & 16384) != 0 ? 20000 : i19, (i22 & 32768) != 0 ? 5 : i20, (i22 & ArrayPool.STANDARD_BUFFER_SIZE_BYTES) != 0 ? 3 : i21, (i22 & 131072) != 0 ? 0.01f : f12, (i22 & 262144) != 0 ? false : z12, (i22 & 524288) != 0 ? false : z13, (i22 & 1048576) != 0 ? false : z14);
        }
    }
}
