package com.nothing.wallpaper.common.bitmap;

import E8.i;
import F8.AbstractC0812g;
import F8.C0803b0;
import F8.H0;
import F8.L;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.Keep;
import com.nothing.wallpaper.common.log.FileLog;
import com.nothing.wallpaper.common.log.c;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.n;
import p079h8.A;
import p079h8.r;
import p129m8.e;
import p219v8.p;

/* JADX INFO: loaded from: classes2.dex */
public final class BitmapOpaqueUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BitmapOpaqueUtil f18426a = new BitmapOpaqueUtil();

    @Keep
    public enum OpaquePercentage {
        NO_OPAQUE,
        SATISFIED,
        EXCEEDED;

        private static final /* synthetic */ p149o8.a $ENTRIES = p149o8.b.a(values());

        public static p149o8.a getEntries() {
            return $ENTRIES;
        }
    }

    static final class a extends d {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f18427q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f18428r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f18429s;

        a(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f18428r = obj;
            this.f18429s |= Integer.MIN_VALUE;
            return BitmapOpaqueUtil.d(null, this);
        }
    }

    static final class b extends l implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f18430q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Bitmap f18431r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ View f18432s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Bitmap bitmap, View view, e eVar) {
            super(2, eVar);
            this.f18431r = bitmap;
            this.f18432s = view;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new b(this.f18431r, this.f18432s, eVar);
        }

        @Override // p219v8.p
        public final Object invoke(L l9, e eVar) {
            return ((b) create(l9, eVar)).invokeSuspend(A.f21846a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            p139n8.b.e();
            if (this.f18430q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            this.f18432s.draw(new Canvas(this.f18431r));
            return A.f21846a;
        }
    }

    private BitmapOpaqueUtil() {
    }

    public static final int a(Bitmap bitmap, int i10) {
        n.h(bitmap, "bitmap");
        int width = bitmap.getWidth();
        int[] iArr = new int[width];
        int height = bitmap.getHeight() - 1;
        while (-1 < height) {
            Bitmap bitmap2 = bitmap;
            bitmap2.getPixels(iArr, 0, width, 0, height, width, 1);
            for (int i11 = 0; i11 < width; i11++) {
                if (Color.alpha(iArr[i11]) > i10) {
                    return height;
                }
            }
            height--;
            bitmap = bitmap2;
        }
        return -1;
    }

    public static final int b(Bitmap bitmap, int i10) {
        n.h(bitmap, "bitmap");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[height];
        int i11 = 0;
        while (i11 < width) {
            Bitmap bitmap2 = bitmap;
            bitmap2.getPixels(iArr, 0, 1, i11, 0, 1, height);
            for (int i12 = 0; i12 < height; i12++) {
                if (Color.alpha(iArr[i12]) > i10) {
                    return i11;
                }
            }
            i11++;
            bitmap = bitmap2;
        }
        return -1;
    }

    public static /* synthetic */ int c(Bitmap bitmap, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 100;
        }
        return b(bitmap, i10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object d(View view, e eVar) {
        a aVar;
        Bitmap bitmap;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i10 = aVar.f18429s;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f18429s = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f18428r;
        Object objE = p139n8.b.e();
        int i11 = aVar.f18429s;
        if (i11 == 0) {
            r.b(obj);
            if (view.getWidth() <= 0 || view.getHeight() <= 0) {
                return new Rect(-1, -1, -1, -1);
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            n.g(bitmapCreateBitmap, "createBitmap(...)");
            H0 h0C = C0803b0.c();
            b bVar = new b(bitmapCreateBitmap, view, null);
            aVar.f18427q = bitmapCreateBitmap;
            aVar.f18429s = 1;
            if (AbstractC0812g.g(h0C, bVar, aVar) == objE) {
                return objE;
            }
            bitmap = bitmapCreateBitmap;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bitmap = (Bitmap) aVar.f18427q;
            r.b(obj);
        }
        int iB = b(bitmap, 0);
        int iH = h(bitmap, 0);
        int iG = g(bitmap, 0);
        int iA = a(bitmap, 0);
        bitmap.recycle();
        return new Rect(iB, iH, iG, iA);
    }

    public static final OpaquePercentage e(Bitmap bitmap, Rect area, float f10, int i10) {
        int i11;
        n.h(bitmap, "bitmap");
        n.h(area, "area");
        int width = bitmap.getWidth();
        int i12 = area.left;
        if (i12 >= 0 && i12 < width) {
            int width2 = bitmap.getWidth();
            int i13 = area.right;
            if (i13 >= 0 && i13 < width2) {
                int height = bitmap.getHeight();
                int i14 = area.top;
                if (i14 >= 0 && i14 < height) {
                    int height2 = bitmap.getHeight();
                    int i15 = area.bottom;
                    if (i15 >= 0 && i15 < height2 && area.left < area.right && area.top < i15) {
                        int iWidth = area.width() * area.height();
                        float f11 = iWidth;
                        int i16 = (int) (f11 * f10);
                        int iWidth2 = area.width();
                        int iHeight = area.height();
                        if (iWidth > 10000) {
                            int[] iArr = new int[Math.min(i10, iHeight) * iWidth2];
                            int i17 = area.top;
                            int i18 = 0;
                            while (true) {
                                int i19 = area.bottom;
                                if (i17 >= i19) {
                                    i11 = i18;
                                    break;
                                }
                                int iMin = Math.min(i10, i19 - i17);
                                int i20 = iWidth2 * iMin;
                                bitmap.getPixels(iArr, 0, iWidth2, area.left, i17, iWidth2, iMin);
                                for (int i21 = 0; i21 < i20; i21++) {
                                    if (((iArr[i21] >> 24) & 255) > 0 && (i18 = i18 + 1) >= i16) {
                                        return OpaquePercentage.EXCEEDED;
                                    }
                                }
                                i17 += iMin;
                            }
                        } else {
                            int[] iArr2 = new int[iWidth];
                            bitmap.getPixels(iArr2, 0, iWidth2, area.left, area.top, iWidth2, iHeight);
                            i11 = 0;
                            for (int i22 = 0; i22 < iWidth; i22++) {
                                if (((iArr2[i22] >> 24) & 255) > 0 && (i11 = i11 + 1) >= i16) {
                                    return OpaquePercentage.EXCEEDED;
                                }
                            }
                        }
                        if (c.f18435a.m() && f11 != 0.0f) {
                            c.d("BitmapOpaqueUtil", "getOpaqueAreaPercentage count:" + i11 + " per:" + i11 + "/" + iWidth + "=" + (i11 / f11));
                        }
                        if (i11 == 0) {
                            return OpaquePercentage.NO_OPAQUE;
                        }
                        return i11 < i16 ? OpaquePercentage.SATISFIED : OpaquePercentage.EXCEEDED;
                    }
                }
            }
        }
        c.f("BitmapOpaqueUtil", "getOpaqueAreaPercentage: area is invalid");
        return OpaquePercentage.NO_OPAQUE;
    }

    public static /* synthetic */ OpaquePercentage f(Bitmap bitmap, Rect rect, float f10, int i10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            i10 = 50;
        }
        return e(bitmap, rect, f10, i10);
    }

    public static final int g(Bitmap bitmap, int i10) {
        n.h(bitmap, "bitmap");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[height];
        int i11 = width - 1;
        while (-1 < i11) {
            Bitmap bitmap2 = bitmap;
            bitmap2.getPixels(iArr, 0, 1, i11, 0, 1, height);
            for (int i12 = 0; i12 < height; i12++) {
                if (Color.alpha(iArr[i12]) > i10) {
                    return i11;
                }
            }
            i11--;
            bitmap = bitmap2;
        }
        return -1;
    }

    public static final int h(Bitmap bitmap, int i10) {
        n.h(bitmap, "bitmap");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width];
        int i11 = 0;
        while (i11 < height) {
            Bitmap bitmap2 = bitmap;
            bitmap2.getPixels(iArr, 0, width, 0, i11, width, 1);
            for (int i12 = 0; i12 < width; i12++) {
                if (Color.alpha(iArr[i12]) > i10) {
                    return i11;
                }
            }
            i11++;
            bitmap = bitmap2;
        }
        return -1;
    }

    private static final boolean i(byte[] bArr, int i10, int i11, int i12, int i13) {
        if (i10 != 0 && i10 != i12 - 1 && i11 != 0 && i11 != i13 - 1) {
            int i14 = (i11 * i12) + i10;
            if (bArr[i14 - 1] != 0 && bArr[i14 + 1] != 0) {
                int i15 = i14 - i12;
                if (bArr[i15] != 0) {
                    int i16 = i14 + i12;
                    if (bArr[i16] != 0 && bArr[i15 - 1] != 0 && bArr[i15 + 1] != 0 && bArr[i16 - 1] != 0 && bArr[i16 + 1] != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static final void k(Bitmap bitmap) {
        n.h(bitmap, "bitmap");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        FileLog.print("edge:", "depth edge start");
        FileLog.print("edge:", width + "," + height);
        int i10 = width * height;
        int[] iArr = new int[i10];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (true) {
            byte b10 = 1;
            if (i11 >= i10) {
                break;
            }
            if (Color.alpha(iArr[i11]) <= 0) {
                b10 = 0;
            }
            bArr[i11] = b10;
            i11++;
        }
        StringBuilder sb = new StringBuilder();
        int i12 = 0;
        for (int i13 = 0; i13 < height; i13++) {
            for (int i14 = 0; i14 < width; i14++) {
                if (bArr[(i13 * width) + i14] == 1 && i(bArr, i14, i13, width, height)) {
                    sb.append(i14);
                    sb.append(",");
                    sb.append(i13);
                    sb.append(",");
                    i12++;
                    if (i12 >= 200) {
                        FileLog.print("edge:", sb.toString());
                        i.m(sb);
                        i12 = 0;
                    }
                }
            }
        }
        FileLog.print("edge:", "depth edge end");
    }

    public final boolean j(Bitmap bitmap, int i10) {
        n.h(bitmap, "bitmap");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i11 = width * height;
        if (i11 <= 10000) {
            int[] iArr = new int[i11];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            for (int i12 = 0; i12 < i11; i12++) {
                if (((iArr[i12] >> 24) & 255) > i10) {
                    return false;
                }
            }
            return true;
        }
        int[] iArr2 = new int[width * 100];
        int i13 = 0;
        while (i13 < height) {
            int iMin = Math.min(100, height - i13);
            int i14 = width * iMin;
            bitmap.getPixels(iArr2, 0, width, 0, i13, width, iMin);
            for (int i15 = 0; i15 < i14; i15++) {
                if (((iArr2[i15] >> 24) & 255) > i10) {
                    return false;
                }
            }
            i13 += iMin;
        }
        return true;
    }
}
