package p056f5;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import p025c4.AbstractC1202p;
import p036d5.InterfaceC1309h;
import p165q4.G5;
import p165q4.I5;

/* JADX INFO: loaded from: classes.dex */
public class a implements InterfaceC1309h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Bitmap f20844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile ByteBuffer f20845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f20846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f20847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f20848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f20849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Matrix f20850g;

    private a(Bitmap bitmap, int i10) {
        this.f20844a = (Bitmap) AbstractC1202p.i(bitmap);
        this.f20846c = bitmap.getWidth();
        this.f20847d = bitmap.getHeight();
        j(i10);
        this.f20848e = i10;
        this.f20849f = -1;
        this.f20850g = null;
    }

    public static a a(Bitmap bitmap, int i10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        a aVar = new a(bitmap, i10);
        k(-1, 1, jElapsedRealtime, bitmap.getHeight(), bitmap.getWidth(), bitmap.getAllocationByteCount(), i10);
        return aVar;
    }

    private static int j(int i10) {
        boolean z9 = true;
        if (i10 != 0 && i10 != 90 && i10 != 180) {
            if (i10 == 270) {
                i10 = 270;
            } else {
                z9 = false;
            }
        }
        AbstractC1202p.b(z9, "Invalid rotation. Only 0, 90, 180, 270 are supported currently.");
        return i10;
    }

    private static void k(int i10, int i11, long j9, int i12, int i13, int i14, int i15) {
        I5.a(G5.b("vision-common"), i10, i11, j9, i12, i13, i14, i15);
    }

    public Bitmap b() {
        return this.f20844a;
    }

    public ByteBuffer c() {
        return this.f20845b;
    }

    public int d() {
        return this.f20849f;
    }

    public int e() {
        return this.f20847d;
    }

    public Image f() {
        return null;
    }

    public Image.Plane[] g() {
        return null;
    }

    public int h() {
        return this.f20848e;
    }

    public int i() {
        return this.f20846c;
    }
}
