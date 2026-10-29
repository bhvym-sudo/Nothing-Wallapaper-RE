package p022c1;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.util.Log;
import android.util.SparseBooleanArray;
import androidx.collection.C1021a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final c f15013f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f15014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f15015b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SparseBooleanArray f15017d = new SparseBooleanArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f15016c = new C1021a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e f15018e = a();

    static class a implements c {
        a() {
        }

        private boolean b(float[] fArr) {
            return fArr[2] <= 0.05f;
        }

        private boolean c(float[] fArr) {
            float f10 = fArr[0];
            return f10 >= 10.0f && f10 <= 37.0f && fArr[1] <= 0.82f;
        }

        private boolean d(float[] fArr) {
            return fArr[2] >= 0.95f;
        }

        @Override // c1.b.c
        public boolean a(int i10, float[] fArr) {
            return (d(fArr) || b(fArr) || c(fArr)) ? false : true;
        }
    }

    /* JADX INFO: renamed from: c1.b$b, reason: collision with other inner class name */
    public static final class C0433b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f15019a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Bitmap f15020b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f15021c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f15022d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f15023e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f15024f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final List f15025g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Rect f15026h;

        /* JADX INFO: renamed from: c1.b$b$a */
        class a extends AsyncTask {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f15027a;

            a(d dVar) {
                this.f15027a = dVar;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b doInBackground(Bitmap... bitmapArr) {
                try {
                    return C0433b.this.d();
                } catch (Exception e10) {
                    Log.e("Palette", "Exception thrown during async generate", e10);
                    return null;
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(b bVar) {
                this.f15027a.a(bVar);
            }
        }

        public C0433b(Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.f15021c = arrayList;
            this.f15022d = 16;
            this.f15023e = 12544;
            this.f15024f = -1;
            ArrayList arrayList2 = new ArrayList();
            this.f15025g = arrayList2;
            if (bitmap == null || bitmap.isRecycled()) {
                throw new IllegalArgumentException("Bitmap is not valid");
            }
            arrayList2.add(b.f15013f);
            this.f15020b = bitmap;
            this.f15019a = null;
            arrayList.add(p022c1.c.f15038e);
            arrayList.add(p022c1.c.f15039f);
            arrayList.add(p022c1.c.f15040g);
            arrayList.add(p022c1.c.f15041h);
            arrayList.add(p022c1.c.f15042i);
            arrayList.add(p022c1.c.f15043j);
        }

        private int[] e(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[width * height];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            Rect rect = this.f15026h;
            if (rect == null) {
                return iArr;
            }
            int iWidth = rect.width();
            int iHeight = this.f15026h.height();
            int[] iArr2 = new int[iWidth * iHeight];
            for (int i10 = 0; i10 < iHeight; i10++) {
                Rect rect2 = this.f15026h;
                System.arraycopy(iArr, ((rect2.top + i10) * width) + rect2.left, iArr2, i10 * iWidth, iWidth);
            }
            return iArr2;
        }

        private Bitmap g(Bitmap bitmap) {
            int iMax;
            int i10;
            double dSqrt = -1.0d;
            if (this.f15023e > 0) {
                int width = bitmap.getWidth() * bitmap.getHeight();
                int i11 = this.f15023e;
                if (width > i11) {
                    dSqrt = Math.sqrt(((double) i11) / ((double) width));
                }
            } else if (this.f15024f > 0 && (iMax = Math.max(bitmap.getWidth(), bitmap.getHeight())) > (i10 = this.f15024f)) {
                dSqrt = ((double) i10) / ((double) iMax);
            }
            return dSqrt <= 0.0d ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dSqrt), (int) Math.ceil(((double) bitmap.getHeight()) * dSqrt), false);
        }

        public C0433b a() {
            this.f15025g.clear();
            return this;
        }

        public C0433b b() {
            List list = this.f15021c;
            if (list != null) {
                list.clear();
            }
            return this;
        }

        public AsyncTask c(d dVar) {
            if (dVar != null) {
                return new a(dVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f15020b);
            }
            throw new IllegalArgumentException("listener can not be null");
        }

        public b d() {
            List listD;
            c[] cVarArr;
            Bitmap bitmap = this.f15020b;
            if (bitmap != null) {
                Bitmap bitmapG = g(bitmap);
                Rect rect = this.f15026h;
                if (bitmapG != this.f15020b && rect != null) {
                    double width = ((double) bitmapG.getWidth()) / ((double) this.f15020b.getWidth());
                    rect.left = (int) Math.floor(((double) rect.left) * width);
                    rect.top = (int) Math.floor(((double) rect.top) * width);
                    rect.right = Math.min((int) Math.ceil(((double) rect.right) * width), bitmapG.getWidth());
                    rect.bottom = Math.min((int) Math.ceil(((double) rect.bottom) * width), bitmapG.getHeight());
                }
                int[] iArrE = e(bitmapG);
                int i10 = this.f15022d;
                if (this.f15025g.isEmpty()) {
                    cVarArr = null;
                } else {
                    List list = this.f15025g;
                    cVarArr = (c[]) list.toArray(new c[list.size()]);
                }
                p022c1.a aVar = new p022c1.a(iArrE, i10, cVarArr);
                if (bitmapG != this.f15020b) {
                    bitmapG.recycle();
                }
                listD = aVar.d();
            } else {
                listD = this.f15019a;
                if (listD == null) {
                    throw new AssertionError();
                }
            }
            b bVar = new b(listD, this.f15021c);
            bVar.c();
            return bVar;
        }

        public C0433b f(int i10) {
            this.f15022d = i10;
            return this;
        }

        public C0433b h(int i10, int i11, int i12, int i13) {
            if (this.f15020b != null) {
                if (this.f15026h == null) {
                    this.f15026h = new Rect();
                }
                this.f15026h.set(0, 0, this.f15020b.getWidth(), this.f15020b.getHeight());
                if (!this.f15026h.intersect(i10, i11, i12, i13)) {
                    throw new IllegalArgumentException("The given region must intersect with the Bitmap's dimensions.");
                }
            }
            return this;
        }
    }

    public interface c {
        boolean a(int i10, float[] fArr);
    }

    public interface d {
        void a(b bVar);
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f15029a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f15030b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f15031c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f15032d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f15033e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f15034f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f15035g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f15036h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private float[] f15037i;

        public e(int i10, int i11) {
            this.f15029a = Color.red(i10);
            this.f15030b = Color.green(i10);
            this.f15031c = Color.blue(i10);
            this.f15032d = i10;
            this.f15033e = i11;
        }

        private void a() {
            if (this.f15034f) {
                return;
            }
            int iL = p191t0.a.l(-1, this.f15032d, 4.5f);
            int iL2 = p191t0.a.l(-1, this.f15032d, 3.0f);
            if (iL != -1 && iL2 != -1) {
                this.f15036h = p191t0.a.x(-1, iL);
                this.f15035g = p191t0.a.x(-1, iL2);
                this.f15034f = true;
                return;
            }
            int iL3 = p191t0.a.l(-16777216, this.f15032d, 4.5f);
            int iL4 = p191t0.a.l(-16777216, this.f15032d, 3.0f);
            if (iL3 == -1 || iL4 == -1) {
                this.f15036h = iL != -1 ? p191t0.a.x(-1, iL) : p191t0.a.x(-16777216, iL3);
                this.f15035g = iL2 != -1 ? p191t0.a.x(-1, iL2) : p191t0.a.x(-16777216, iL4);
                this.f15034f = true;
            } else {
                this.f15036h = p191t0.a.x(-16777216, iL3);
                this.f15035g = p191t0.a.x(-16777216, iL4);
                this.f15034f = true;
            }
        }

        public int b() {
            a();
            return this.f15036h;
        }

        public float[] c() {
            if (this.f15037i == null) {
                this.f15037i = new float[3];
            }
            p191t0.a.d(this.f15029a, this.f15030b, this.f15031c, this.f15037i);
            return this.f15037i;
        }

        public int d() {
            return this.f15033e;
        }

        public int e() {
            return this.f15032d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (this.f15033e == eVar.f15033e && this.f15032d == eVar.f15032d) {
                    return true;
                }
            }
            return false;
        }

        public int f() {
            a();
            return this.f15035g;
        }

        public int hashCode() {
            return (this.f15032d * 31) + this.f15033e;
        }

        public String toString() {
            return e.class.getSimpleName() + " [RGB: #" + Integer.toHexString(e()) + "] [HSL: " + Arrays.toString(c()) + "] [Population: " + this.f15033e + "] [Title Text: #" + Integer.toHexString(f()) + "] [Body Text: #" + Integer.toHexString(b()) + ']';
        }
    }

    b(List list, List list2) {
        this.f15014a = list;
        this.f15015b = list2;
    }

    private e a() {
        int size = this.f15014a.size();
        int iD = Integer.MIN_VALUE;
        e eVar = null;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar2 = (e) this.f15014a.get(i10);
            if (eVar2.d() > iD) {
                iD = eVar2.d();
                eVar = eVar2;
            }
        }
        return eVar;
    }

    public static C0433b b(Bitmap bitmap) {
        return new C0433b(bitmap);
    }

    private float d(e eVar, p022c1.c cVar) {
        float[] fArrC = eVar.c();
        e eVar2 = this.f15018e;
        return (cVar.g() > 0.0f ? cVar.g() * (1.0f - Math.abs(fArrC[1] - cVar.i())) : 0.0f) + (cVar.a() > 0.0f ? cVar.a() * (1.0f - Math.abs(fArrC[2] - cVar.h())) : 0.0f) + (cVar.f() > 0.0f ? cVar.f() * (eVar.d() / (eVar2 != null ? eVar2.d() : 1)) : 0.0f);
    }

    private e e(p022c1.c cVar) {
        e eVarI = i(cVar);
        if (eVarI != null && cVar.j()) {
            this.f15017d.append(eVarI.e(), true);
        }
        return eVarI;
    }

    private e i(p022c1.c cVar) {
        int size = this.f15014a.size();
        float f10 = 0.0f;
        e eVar = null;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar2 = (e) this.f15014a.get(i10);
            if (m(eVar2, cVar)) {
                float fD = d(eVar2, cVar);
                if (eVar == null || fD > f10) {
                    eVar = eVar2;
                    f10 = fD;
                }
            }
        }
        return eVar;
    }

    private boolean m(e eVar, p022c1.c cVar) {
        float[] fArrC = eVar.c();
        return fArrC[1] >= cVar.e() && fArrC[1] <= cVar.c() && fArrC[2] >= cVar.d() && fArrC[2] <= cVar.b() && !this.f15017d.get(eVar.e());
    }

    void c() {
        int size = this.f15015b.size();
        for (int i10 = 0; i10 < size; i10++) {
            p022c1.c cVar = (p022c1.c) this.f15015b.get(i10);
            cVar.k();
            this.f15016c.put(cVar, e(cVar));
        }
        this.f15017d.clear();
    }

    public e f() {
        return j(p022c1.c.f15043j);
    }

    public e g() {
        return this.f15018e;
    }

    public e h() {
        return j(p022c1.c.f15041h);
    }

    public e j(p022c1.c cVar) {
        return (e) this.f15016c.get(cVar);
    }

    public List k() {
        return Collections.unmodifiableList(this.f15014a);
    }

    public e l() {
        return j(p022c1.c.f15039f);
    }
}
