package com.nothing.cardwidget.mediaplayer.utils;

import E8.i;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ImageDecoder;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.n;
import p129m8.e;

/* JADX INFO: loaded from: classes2.dex */
public final class BitmapUtil {
    public static final BitmapUtil INSTANCE = new BitmapUtil();
    private static final String TAG = "BitmapUtil";
    private static final int WIDGET_APP_ICON_WIDTH = 73;

    /* JADX INFO: renamed from: com.nothing.cardwidget.mediaplayer.utils.BitmapUtil$getAvailableBitmap$1, reason: invalid class name */
    @f(c = "com.nothing.cardwidget.mediaplayer.utils.BitmapUtil", f = "BitmapUtil.kt", l = {86}, m = "getAvailableBitmap")
    static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BitmapUtil.this.getAvailableBitmap(null, null, this);
        }
    }

    private BitmapUtil() {
    }

    public static /* synthetic */ Bitmap drawableToBitmap$default(BitmapUtil bitmapUtil, Drawable drawable, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 73;
        }
        if ((i12 & 4) != 0) {
            i11 = 73;
        }
        return bitmapUtil.drawableToBitmap(drawable, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object loadBitmapFromUri(Context context, Uri uri, e<? super Bitmap> eVar) {
        if (uri.getScheme() == null) {
            return null;
        }
        if (!i.C(uri.getScheme(), "content", false, 2, null) && !i.C(uri.getScheme(), "android.resource", false, 2, null) && !i.C(uri.getScheme(), "file", false, 2, null)) {
            return null;
        }
        ImageDecoder.Source sourceCreateSource = ImageDecoder.createSource(context.getContentResolver(), uri);
        n.g(sourceCreateSource, "createSource(...)");
        try {
            return ImageDecoder.decodeBitmap(sourceCreateSource, new ImageDecoder.OnHeaderDecodedListener() { // from class: com.nothing.cardwidget.mediaplayer.utils.a
                @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                    BitmapUtil.loadBitmapFromUri$lambda$0(imageDecoder, imageInfo, source);
                }
            });
        } catch (IOException e10) {
            Log.w(TAG, "Unable to load bitmap, error: " + e10.getMessage());
            return null;
        } catch (RuntimeException e11) {
            Log.w(TAG, "Unable to load bitmap, error: " + e11.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadBitmapFromUri$lambda$0(ImageDecoder decoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        n.h(decoder, "decoder");
        n.h(imageInfo, "<unused var>");
        n.h(source, "<unused var>");
        decoder.setAllocator(1);
    }

    public final Bitmap colorizeBitmap(Bitmap bitmap, int i10) {
        n.h(bitmap, "bitmap");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        n.g(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return bitmapCreateBitmap;
    }

    public final Bitmap drawableToBitmap(Drawable drawable, int i10, int i11) {
        Bitmap bitmap;
        Bitmap bitmap2;
        n.h(drawable, "drawable");
        boolean z9 = drawable instanceof BitmapDrawable;
        BitmapDrawable bitmapDrawable = z9 ? (BitmapDrawable) drawable : null;
        int intrinsicWidth = (bitmapDrawable == null || (bitmap2 = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicWidth() : bitmap2.getWidth();
        BitmapDrawable bitmapDrawable2 = z9 ? (BitmapDrawable) drawable : null;
        int intrinsicHeight = (bitmapDrawable2 == null || (bitmap = bitmapDrawable2.getBitmap()) == null) ? drawable.getIntrinsicHeight() : bitmap.getHeight();
        if (intrinsicWidth > 0 && intrinsicHeight > 0) {
            float f10 = intrinsicWidth;
            float f11 = intrinsicHeight;
            float fMin = Math.min(i11 / f11, i10 / f10);
            int i12 = (int) (f10 * fMin);
            int i13 = (int) (f11 * fMin);
            if (i12 > 0 && i13 > 0) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i12, i13, drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
                n.g(bitmapCreateBitmap, "createBitmap(...)");
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                Rect bounds = drawable.getBounds();
                n.g(bounds, "getBounds(...)");
                drawable.setBounds(0, 0, i12, i13);
                drawable.draw(canvas);
                drawable.setBounds(bounds);
                return bitmapCreateBitmap;
            }
            Log.w(TAG, "Attempted to resize " + drawable.getClass().getSimpleName() + " from " + intrinsicWidth + " x " + intrinsicHeight + " to invalid " + i12 + " x " + i13 + ".");
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    /* JADX WARN: Code duplicated, block: B:21:0x0074 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x005d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:? A[LOOP:0: B:15:0x004b->B:30:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0072 -> B:22:0x0075). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object getAvailableBitmap(android.content.Context r6, java.util.List<java.lang.String> r7, p129m8.e<? super android.graphics.Bitmap> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.nothing.cardwidget.mediaplayer.utils.BitmapUtil.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            com.nothing.cardwidget.mediaplayer.utils.BitmapUtil$getAvailableBitmap$1 r0 = (com.nothing.cardwidget.mediaplayer.utils.BitmapUtil.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nothing.cardwidget.mediaplayer.utils.BitmapUtil$getAvailableBitmap$1 r0 = new com.nothing.cardwidget.mediaplayer.utils.BitmapUtil$getAvailableBitmap$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = p139n8.b.e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r5 = r0.L$2
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r0.L$1
            android.content.Context r6 = (android.content.Context) r6
            java.lang.Object r7 = r0.L$0
            com.nothing.cardwidget.mediaplayer.utils.BitmapUtil r7 = (com.nothing.cardwidget.mediaplayer.utils.BitmapUtil) r7
            p079h8.r.b(r8)
            r4 = r7
            r7 = r6
            r6 = r4
            goto L75
        L38:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L40:
            p079h8.r.b(r8)
            java.util.Iterator r7 = r7.iterator()
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L4b:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L7a
            java.lang.Object r8 = r5.next()
            java.lang.String r8 = (java.lang.String) r8
            boolean r2 = android.text.TextUtils.isEmpty(r8)
            if (r2 != 0) goto L4b
            android.net.Uri r8 = android.net.Uri.parse(r8)
            java.lang.String r2 = "parse(...)"
            kotlin.jvm.internal.n.g(r8, r2)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.L$2 = r5
            r0.label = r3
            java.lang.Object r8 = r6.loadBitmapFromUri(r7, r8, r0)
            if (r8 != r1) goto L75
            return r1
        L75:
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            if (r8 == 0) goto L4b
            return r8
        L7a:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nothing.cardwidget.mediaplayer.utils.BitmapUtil.getAvailableBitmap(android.content.Context, java.util.List, m8.e):java.lang.Object");
    }
}
