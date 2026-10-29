package p166q5;

import E8.i;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Point;
import android.os.SystemProperties;
import androidx.collection.t;
import com.nothing.blurwallpaper.VertexInfo;
import com.nothing.wallpaper.common.log.c;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import p022c1.b;
import p079h8.A;
import p079h8.w;
import p089i8.AbstractC1444s;
import p097j6.e;
import p097j6.g;
import p219v8.p;
import p219v8.q;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f25056a = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f25057b = new LinkedHashMap();

    private static final class a extends t {
        public a() {
            super(2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.collection.t
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void b(boolean z9, String key, Bitmap oldValue, Bitmap bitmap) {
            kotlin.jvm.internal.n.h(key, "key");
            kotlin.jvm.internal.n.h(oldValue, "oldValue");
            super.b(z9, key, oldValue, bitmap);
            if (z9) {
                oldValue.recycle();
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f25058a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f25059b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f25060c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private c1.b.e f25061d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private double f25062e;

        public b(int i10, int i11, int i12, c1.b.e swatch, double d10) {
            kotlin.jvm.internal.n.h(swatch, "swatch");
            this.f25058a = i10;
            this.f25059b = i11;
            this.f25060c = i12;
            this.f25061d = swatch;
            this.f25062e = d10;
        }

        public final int a() {
            return this.f25060c;
        }

        public final double b() {
            return this.f25062e;
        }

        public final c1.b.e c() {
            return this.f25061d;
        }

        public final int d() {
            return this.f25058a;
        }

        public final int e() {
            return this.f25059b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f25058a == bVar.f25058a && this.f25059b == bVar.f25059b && this.f25060c == bVar.f25060c && kotlin.jvm.internal.n.d(this.f25061d, bVar.f25061d) && Double.compare(this.f25062e, bVar.f25062e) == 0;
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.f25058a) * 31) + Integer.hashCode(this.f25059b)) * 31) + Integer.hashCode(this.f25060c)) * 31) + this.f25061d.hashCode()) * 31) + Double.hashCode(this.f25062e);
        }

        public String toString() {
            return "Position(x=" + this.f25058a + ", y=" + this.f25059b + ", pixelColor=" + this.f25060c + ", swatch=" + this.f25061d + ", radian=" + this.f25062e + ")";
        }
    }

    private n() {
    }

    private final void e(List list, List list2, int i10, int i11, int i12) {
        int i13 = i11;
        int i14 = i12;
        if (list.isEmpty() || list.size() >= i10) {
            return;
        }
        int size = i10 - list.size();
        int i15 = size / 2;
        float f10 = 0.6f;
        float f11 = 0.1f;
        int i16 = -1;
        int i17 = 1;
        if (i15 >= 1) {
            int i18 = i15;
            while (i18 > 0) {
                float[] fArrC = ((c1.b.e) list.get(0)).c();
                kotlin.jvm.internal.n.g(fArrC, "getHsl(...)");
                float f12 = fArrC[i17] - (i18 * f11);
                fArrC[i17] = f12;
                if (f12 < 0.0f) {
                    fArrC[i17] = f12 + f10;
                }
                int iA = p191t0.a.a(fArrC);
                list.add(new c1.b.e(iA, i16));
                list2.add(new VertexInfo((int) (Math.random() * ((double) i13)), (int) (Math.random() * ((double) i14)), i13, i14, iA, iA, -1));
                i18--;
                i17 = 1;
                i16 = -1;
                f10 = f10;
                f11 = f11;
            }
        }
        float f13 = f10;
        float f14 = f11;
        int i19 = i16;
        int i20 = i17;
        int i21 = size - i15;
        if (i21 < i20 || i20 > i21) {
            return;
        }
        int i22 = i20;
        while (true) {
            float[] fArrC2 = ((c1.b.e) list.get(0)).c();
            kotlin.jvm.internal.n.g(fArrC2, "getHsl(...)");
            float f15 = fArrC2[i20] + (i22 * f14);
            fArrC2[i20] = f15;
            if (f15 > 1.0f) {
                fArrC2[i20] = f15 - f13;
            }
            int iA2 = p191t0.a.a(fArrC2);
            list.add(new c1.b.e(iA2, i19));
            list2.add(new VertexInfo((int) (Math.random() * ((double) i13)), (int) (Math.random() * ((double) i14)), i13, i14, iA2, iA2, -1));
            if (i22 == i21) {
                return;
            }
            i22++;
            i13 = i11;
            i14 = i12;
            i20 = 1;
            i19 = -1;
        }
    }

    private final double g(int i10, int i11) {
        double[] dArr = new double[3];
        p191t0.a.n(i10, dArr);
        double[] dArr2 = new double[3];
        p191t0.a.n(i11, dArr2);
        return p191t0.a.u(dArr, dArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(Bitmap bitmap, int i10, int i11, boolean z9, p pVar, p022c1.b bVar) {
        List listK;
        List listU0;
        if (bVar == null || (listK = bVar.k()) == null || (listU0 = AbstractC1444s.u0(listK)) == null) {
            c.f("BLUR-ImageLoader", "Generate the Palette error");
            return;
        }
        c.d("BLUR-ImageLoader", "swatchList: " + listU0.size());
        Stream stream = listU0.stream();
        final p pVar2 = new p() { // from class: q5.l
            @Override // p219v8.p
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(n.k((b.e) obj, (b.e) obj2));
            }
        };
        List<c1.b.e> list = (List) stream.sorted(new Comparator() { // from class: q5.m
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.j(pVar2, obj, obj2);
            }
        }).collect(Collectors.toList());
        long jCurrentTimeMillis = System.currentTimeMillis();
        HashMap map = new HashMap();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bitmap.getWidth() * bitmap.getHeight() * 4);
        byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        bitmap.copyPixelsToBuffer(byteBufferAllocateDirect);
        byteBufferAllocateDirect.rewind();
        while (byteBufferAllocateDirect.hasRemaining()) {
            byte b10 = byteBufferAllocateDirect.get();
            byte b11 = byteBufferAllocateDirect.get();
            byte b12 = byteBufferAllocateDirect.get();
            byteBufferAllocateDirect.get();
            int iRgb = Color.rgb(w.d(b10) & 255, w.d(b11) & 255, w.d(b12) & 255);
            int iPosition = (byteBufferAllocateDirect.position() / 4) % bitmap.getWidth();
            int iPosition2 = (byteBufferAllocateDirect.position() / 4) / bitmap.getWidth();
            for (c1.b.e eVar : list) {
                double dG = f25056a.g(eVar.e(), iRgb);
                kotlin.jvm.internal.n.e(eVar);
                b bVar2 = new b(iPosition, iPosition2, iRgb, eVar, dG);
                if (map.containsKey(Integer.valueOf(eVar.e()))) {
                    Object obj = map.get(Integer.valueOf(eVar.e()));
                    kotlin.jvm.internal.n.e(obj);
                    if (dG < ((b) obj).b()) {
                        map.put(Integer.valueOf(eVar.e()), bVar2);
                    }
                } else {
                    map.put(Integer.valueOf(eVar.e()), bVar2);
                }
            }
        }
        c.d("BLUR-ImageLoader", "getColor: costTime=" + (System.currentTimeMillis() - jCurrentTimeMillis));
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            b bVar3 = (b) map.get(Integer.valueOf(((c1.b.e) list.get(i12)).e()));
            if (bVar3 != null) {
                arrayList.add(new VertexInfo(bVar3.d(), bVar3.e(), i10, i11, bVar3.a(), bVar3.c().e(), bVar3.c().d()));
            }
        }
        f25056a.e(list, arrayList, 6, i10, i11);
        if (z9) {
            bitmap.recycle();
        }
        pVar.invoke(list, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int j(p pVar, Object obj, Object obj2) {
        return ((Number) pVar.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int k(c1.b.e eVar, c1.b.e eVar2) {
        return Integer.compare(eVar2.d(), eVar.d());
    }

    private final Bitmap n(String str) {
        a aVar = (a) f25057b.get(p117l6.a.f22963e.b(str).c());
        if (aVar == null) {
            return null;
        }
        return (Bitmap) aVar.d(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A p(String str, Point point, q qVar, int i10, int i11, byte[] bitmapArray) {
        kotlin.jvm.internal.n.h(bitmapArray, "bitmapArray");
        c.d("BLUR-ImageLoader", "loadFinalImage: filePath=" + str + ", reqSize=" + point + ", loadFromDisk.");
        qVar.e(Integer.valueOf(i10), Integer.valueOf(i11), bitmapArray);
        return A.f21846a;
    }

    public final void f(String group) {
        kotlin.jvm.internal.n.h(group, "group");
        a aVar = (a) f25057b.remove(group);
        if (aVar != null) {
            aVar.c();
        }
        c.d("BLUR-ImageLoader", "clearCache for " + group + " result " + (aVar != null) + ".");
    }

    public final void h(final Bitmap bitmap, final boolean z9, final p callback) {
        kotlin.jvm.internal.n.h(bitmap, "bitmap");
        kotlin.jvm.internal.n.h(callback, "callback");
        p022c1.b.C0433b c0433b = new p022c1.b.C0433b(bitmap);
        final int width = bitmap.getWidth();
        final int height = bitmap.getHeight();
        c.d("BLUR-ImageLoader", "getColor bitmap size=(" + bitmap.getWidth() + "x" + bitmap.getHeight() + ")");
        c0433b.f(6);
        c0433b.a();
        c0433b.b();
        c0433b.c(new c1.b.d() { // from class: q5.k
            @Override // c1.b.d
            public final void a(b bVar) {
                n.i(bitmap, width, height, z9, callback, bVar);
            }
        });
    }

    public final int l() {
        String str = SystemProperties.get("ro.phone.shell.color", "");
        kotlin.jvm.internal.n.g(str, "get(...)");
        c.d("BLUR-ImageLoader", "colorType=" + str);
        return i.B(str, "black", true) ? w.f25081a : w.f25082b;
    }

    public final Bitmap m(Context context) {
        kotlin.jvm.internal.n.h(context, "context");
        String str = SystemProperties.get("ro.phone.shell.color", "");
        kotlin.jvm.internal.n.g(str, "get(...)");
        c.d("BLUR-ImageLoader", "colorType=" + str);
        if (i.B(str, "black", true)) {
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), w.f25081a);
            kotlin.jvm.internal.n.e(bitmapDecodeResource);
            return bitmapDecodeResource;
        }
        Bitmap bitmapDecodeResource2 = BitmapFactory.decodeResource(context.getResources(), w.f25082b);
        kotlin.jvm.internal.n.e(bitmapDecodeResource2);
        return bitmapDecodeResource2;
    }

    public final synchronized void o(Context context, final String imageFilePath, final Point reqSize, final q callback) {
        kotlin.jvm.internal.n.h(context, "context");
        kotlin.jvm.internal.n.h(imageFilePath, "imageFilePath");
        kotlin.jvm.internal.n.h(reqSize, "reqSize");
        kotlin.jvm.internal.n.h(callback, "callback");
        r(context, imageFilePath, reqSize, new q() { // from class: q5.j
            @Override // p219v8.q
            public final Object e(Object obj, Object obj2, Object obj3) {
                return n.p(imageFilePath, reqSize, callback, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), (byte[]) obj3);
            }
        });
    }

    public final void q(Context context, int i10, Point reqSize, q callback) {
        kotlin.jvm.internal.n.h(context, "context");
        kotlin.jvm.internal.n.h(reqSize, "reqSize");
        kotlin.jvm.internal.n.h(callback, "callback");
        BitmapFactory.Options options = new BitmapFactory.Options();
        Point point = new Point();
        int i11 = 0;
        if (reqSize.x > 0 && reqSize.y > 0) {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeResource(context.getResources(), i10, options);
            int iA = e.a(options.outWidth, options.outHeight, reqSize.x, reqSize.y);
            options.inSampleSize = iA;
            point.set(options.outWidth, options.outHeight);
            options.inJustDecodeBounds = false;
            i11 = iA;
        }
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), i10, options);
        if (point.x == 0) {
            point.set(bitmapDecodeResource.getWidth(), bitmapDecodeResource.getHeight());
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bitmapDecodeResource.getByteCount());
        bitmapDecodeResource.copyPixelsToBuffer(byteBufferAllocate);
        c.d("BLUR-ImageLoader", "loadImage: resId=" + i10 + ", reqSize=" + reqSize + ", originSize=" + point + ", inSampleSize=" + i11 + ", currentMemorySize=" + g.a(bitmapDecodeResource.getAllocationByteCount()));
        Integer numValueOf = Integer.valueOf(bitmapDecodeResource.getWidth());
        Integer numValueOf2 = Integer.valueOf(bitmapDecodeResource.getHeight());
        byte[] bArrArray = byteBufferAllocate.array();
        kotlin.jvm.internal.n.g(bArrArray, "array(...)");
        callback.e(numValueOf, numValueOf2, bArrArray);
        bitmapDecodeResource.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r(Context context, String filePath, Point reqSize, q callback) throws IOException {
        int i10;
        kotlin.jvm.internal.n.h(context, "context");
        kotlin.jvm.internal.n.h(filePath, "filePath");
        kotlin.jvm.internal.n.h(reqSize, "reqSize");
        kotlin.jvm.internal.n.h(callback, "callback");
        c.d("BLUR-ImageLoader", "loadImage: filePath=" + filePath);
        Point point = new Point();
        Bitmap bitmapN = n(filePath);
        int i11 = 0;
        if (bitmapN == null) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(filePath));
            try {
                if (reqSize.x > 0 && reqSize.y > 0) {
                    bufferedInputStream.mark(Math.min(1000, bufferedInputStream.available()));
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeStream(bufferedInputStream, null, options);
                    point.set(options.outWidth, options.outHeight);
                    int iA = e.a(options.outWidth, options.outHeight, reqSize.x, reqSize.y);
                    options.inSampleSize = iA;
                    options.inJustDecodeBounds = false;
                    bufferedInputStream.reset();
                    i11 = iA;
                }
                bitmapN = BitmapFactory.decodeStream(bufferedInputStream, null, options);
                if (bitmapN == null) {
                    throw new IllegalStateException("image=" + filePath + " not exist!");
                }
                p189s8.b.a(bufferedInputStream, null);
                i10 = i11;
                i11 = 1;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    p189s8.b.a(bufferedInputStream, th);
                    throw th2;
                }
            }
        } else {
            i10 = 0;
        }
        if (point.x == 0) {
            point.set(bitmapN.getWidth(), bitmapN.getHeight());
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bitmapN.getByteCount());
        bitmapN.copyPixelsToBuffer(byteBufferAllocate);
        c.d("BLUR-ImageLoader", "loadImage: filePath=" + filePath + ", fromCache=" + (i11 ^ 1) + ", reqSize=" + reqSize + ", originSize=" + point + ", inSampleSize=" + i10 + ", currentMemorySize=" + g.a(bitmapN.getAllocationByteCount()));
        Integer numValueOf = Integer.valueOf(bitmapN.getWidth());
        Integer numValueOf2 = Integer.valueOf(bitmapN.getHeight());
        byte[] bArrArray = byteBufferAllocate.array();
        kotlin.jvm.internal.n.g(bArrArray, "array(...)");
        callback.e(numValueOf, numValueOf2, bArrArray);
        if (i11 != 0) {
            bitmapN.recycle();
        }
    }

    public final void s(Context context, Bitmap bitmap, p callback) {
        kotlin.jvm.internal.n.h(context, "context");
        kotlin.jvm.internal.n.h(bitmap, "bitmap");
        kotlin.jvm.internal.n.h(callback, "callback");
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.max(1, bitmap.getWidth() / 16), Math.max(1, bitmap.getHeight() / 16), true);
        kotlin.jvm.internal.n.g(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
        h(bitmapCreateScaledBitmap, !kotlin.jvm.internal.n.d(bitmapCreateScaledBitmap, bitmap), callback);
    }

    public final void t(Context context, String imageFilePath, p callback) throws IOException {
        kotlin.jvm.internal.n.h(context, "context");
        kotlin.jvm.internal.n.h(imageFilePath, "imageFilePath");
        kotlin.jvm.internal.n.h(callback, "callback");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = false;
        options.inSampleSize = 16;
        options.outConfig = Bitmap.Config.ARGB_8888;
        FileInputStream fileInputStream = new FileInputStream(imageFilePath);
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStream, null, options);
            p189s8.b.a(fileInputStream, null);
            if (bitmapDecodeStream != null) {
                f25056a.h(bitmapDecodeStream, true, callback);
                return;
            }
            c.o("BLUR-ImageLoader", "prepareGetColorFromPath: decodeStream error, imageFilePath=" + imageFilePath);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                p189s8.b.a(fileInputStream, th);
                throw th2;
            }
        }
    }

    public final void u(Context context, int i10, p callback) {
        kotlin.jvm.internal.n.h(context, "context");
        kotlin.jvm.internal.n.h(callback, "callback");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = false;
        options.inSampleSize = 16;
        options.outConfig = Bitmap.Config.ARGB_8888;
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), i10, options);
        if (bitmapDecodeResource != null) {
            f25056a.h(bitmapDecodeResource, true, callback);
        }
    }

    public final void v(String filePath, Bitmap bitmap) {
        kotlin.jvm.internal.n.h(filePath, "filePath");
        kotlin.jvm.internal.n.h(bitmap, "bitmap");
        String strC = p117l6.a.f22963e.b(filePath).c();
        Map map = f25057b;
        Object aVar = map.get(strC);
        if (aVar == null) {
            aVar = new a();
            map.put(strC, aVar);
        }
        ((a) aVar).e(filePath, bitmap);
    }
}
